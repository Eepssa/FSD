const fs = require('fs');

function formatTime(hours, minutes, seconds) {
  return `${hours.toString().padStart(2, '0')}:${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;
}

function stopwatch() {
  let hours = 0;
  let minutes = 0;
  let seconds = 0;

  const interval = setInterval(() => {
    seconds++;
    if (seconds === 60) {
      seconds = 0;
      minutes++;
      if (minutes === 60) {
        minutes = 0;
        hours++;
      }
    }

    const currentTime = formatTime(hours, minutes, seconds);
    console.log(currentTime);

    fs.appendFileSync('stopwatch.txt', `${currentTime}\n`);

    if (hours === 0 && minutes === 2 && seconds === 0) {
      clearInterval(interval);
      console.log('Stopwatch finished. Results saved in stopwatch.txt');
    }
  }, 1000);
}

stopwatch();




