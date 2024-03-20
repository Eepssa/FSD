// let func=(name:string)=>{//console.log(name);
// return name;}
// console.log(func("eepssa"));
//Fat Arrow
let add=(n1:number,n2:number):number=>n1+n2;
console.log(add(2,4));

class Me{
    func=()=>"hello";
}

let m:Me= new Me();
console.log(m.func());

//Optional and OR Operator 

class Opt{
     show(a:number=5,b?:boolean) {
        console.log(a);
        console.log(b);
        
    }
    sh(a:number|string|boolean){
    return a;}
}

let o:Opt=new Opt();
o.show(2,false);
o.show(4);
o.show();
console.log(o.sh("eepssa"));
console.log(o.sh(6));
console.log(o.sh(true));

