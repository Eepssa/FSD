import { useState } from "react";

 const cars:string[]=["BMW","AUDI","MERCEDES"]
const ListGroup = () => {
  const [seletedIndex,setSeletedIndex]=useState(-1);
  const carList=cars.map((car,index)=> <li key={car} className={seletedIndex===index?"list-group-item active":"list-group-item"} onClick={()=>setSeletedIndex(index)}>{car}</li>)

    return(

    <ul className="list-group">
      {carList}
    </ul> 
    )    
 
};

export default ListGroup;