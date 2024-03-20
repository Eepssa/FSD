import {  useState } from "react";

function StopWatch() {
    const [timeElapsed, setTimeElapsed] = useState(0);
    const [isRunning, setIsRunning] = useState(false);
    const [intervalId, setIntervalId] = useState<number | null>(null);
  
    const start = () => {
      if (!isRunning) {
        setIsRunning(true);
        const id = window.setInterval(() => {
          setTimeElapsed(prevTime => prevTime + 10);
        }, 10);
        setIntervalId(id);
      }
    };
  
    const stop = () => {
      if (intervalId !== null) {
        clearInterval(intervalId);
        setIsRunning(false);
      }
    };
  
    const clear = () => {
      if (intervalId !== null) {
        clearInterval(intervalId);
      }
      setTimeElapsed(0);
      setIsRunning(false);
    };
  
    const formatTime = (time: number): string => {
      const minutes = Math.floor(time / 60000);
      const seconds = Math.floor((time % 60000) / 1000);
      const milliseconds = Math.floor((time % 1000) / 10);
      return (
        String(minutes).padStart(2, '0') +
        ':' +
        String(seconds).padStart(2, '0') +
        ':' +
        String(milliseconds).padStart(2, '0')
      );
    };
  
    return (
      <>
        <h1>Stopwatch</h1>
        <p id="time">{formatTime(timeElapsed)}</p>
        <button onClick={start} disabled={isRunning} className="start">
          Start
        </button>
        <button onClick={stop} disabled={!isRunning} className="stop">
          Stop
        </button>
        <button onClick={clear} className="clear">Clear</button>
      </>
    );
  }
  
export default StopWatch;