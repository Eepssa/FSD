import { useState } from "react"
interface Button{
    prop:number;
}
const CountBtn=({prop}:Button)=>{
    const [counter,setCounter]=useState(prop);
    return(
        <>
        <div className="Count" style={{border:"2px solid black"}}>
            <span>{counter}</span>
            <button id="btn" name="btn" onClick={()=>setCounter(counter+1)}>Click</button>
        </div>
        </>
    );
}

export default CountBtn;