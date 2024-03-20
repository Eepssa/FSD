const ListName =()=>{

    const items:string[]=['Jayanta','Amit','Sumit']
    const liItem=items.map((item)=> <li>{item}</li>)
    return (
     <>
        <ul>{liItem}</ul>
         
      </>
    )
 
 }
 
 export default ListName