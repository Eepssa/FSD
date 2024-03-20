// function addGn<T>(a:T,b:T):[T,T]{
//     return [a,b];
// }

// let r=addGn<string>("abc","sad");
// console.log(r);

function addGn<T,U>(a:T,b:U):[T,U]{
    return [a,b];
}

let r=addGn<string,number>("abc",8);
console.log(r);

class Gen<T,U>{
    ob1:T|undefined;
    obj2:U|undefined;
}

let g:Gen<string,number>=new Gen<string,number>();
g.ob1="er";
g.obj2=3;
console.log(g);