const time=function t(op){
    return new Promise((resolved,rejected)=>{
        
        if(op){
            // resolved(op);
            resolved("Promise kept")
        }

        else{
            // rejected(op);
            rejected("Promise Broken")
        }
    });
}

const prm=time(false).then(d=>console.log(d)).catch(e=>console.log(e));