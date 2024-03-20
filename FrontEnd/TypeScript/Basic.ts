console.log("Hello how r u?");
let x="hi";
x="bbye";
console.log(x);
let k:number=10; //block type 
console.log(x);
//Object
 const person:{fname:string,lname:string}={
 fname:"Eepssa",
 lname:"Rout"
 }
 person.fname="Amit";
 console.log(person.fname);

 //Unknown, any
let t:unknown="Jay";
console.log(t); 

//array
let ar:number[]=[];
ar.push(1);
ar.push(2);
ar.push(3);
console.log(ar);
ar.pop();
console.log(ar);
ar[0]=3;
console.log(ar);

let r=[1,2,3];
console.log(r);
for(let i of r)
console.log(i);
for(let i=0;i<r.length;i++)
console.log(r[i]);

//Function
function sayHello(name:string):number{
    return name.length;}
console.log(sayHello("Eepssa"));

function isPallindrome(name:string):boolean{
    let i=0, j=name.length-1;
    let p=true;
    while(i<j){
        if(name.charAt(i)!=name.charAt(j))
        {p=false;
            break;}
           p=true;
        i++;
        j--;
    }
    return p;
}

console.log(isPallindrome("madam"));
console.log(isPallindrome("eepssa"));


//tuple
let tup:readonly[number,string];
tup=[1,"2"];
//tup.push(3); error due to readonly update will work
console.log(tup);

// enum



