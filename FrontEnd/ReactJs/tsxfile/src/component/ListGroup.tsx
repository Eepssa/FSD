

import { useState } from "react";

interface listData
 {
    items:string[];
    heading:string;
 }
 


const ListGroup = ({items,heading}:listData) => {
  const [seletedIndex,setSeletedIndex]=useState(-1);
  const carList=items.map((car,index)=> <li key={car} className={seletedIndex===index?"list-group-item active":"list-group-item"} onClick={()=>setSeletedIndex(index)}>{car}</li>)

    return(
      <>
    <h1>{heading} </h1>
    <ul className="list-group">
      {carList}
    </ul>
    </>
    )    
 
};
export default ListGroup;