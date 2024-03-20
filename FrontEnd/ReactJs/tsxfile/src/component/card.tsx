interface listData
 {
    images:string;
    titles:string;
    buttons:string;
 }


const card = ({images,titles,buttons}:listData) => {
  return(
      <>
      
    <div className="card">
  <img src= {images} style={{height:"250px" ,width:"300px"}} 
    className="card-img-top"
    alt="Fissure in Sandstone"
  />
  <div className="card-body">
    <h5 className="card-title">{titles||"No title given"}</h5>
    <p className="card-text">
      Check this out
    </p>
    <a href="#!" className={buttons} data-mdb-ripple-init="">
      Button
    </a>
  
  </div>
</div>

    </>
    )    
 
};


export default card;