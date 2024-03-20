// import { Gpay } from "./OnlineMoney/GPay";
// import { Phonepay } from "./OnlineMoney/PhonePay";

import { Paying } from "./OnlineMoney/TypePayNameSpace";

// let t:Gpay=new Gpay(1,"Eepssa",10);
// console.log(t);

// let k:Phonepay=new Phonepay(1,"Eepssa",100);
// console.log(k);
// k.withdrawMoney(200);
// console.log("Coupon "+k.getCoupon());
// k.setcoupon(170);
// console.log(k);

let t:Paying.Gpay=new Paying.Gpay(2,"Eepssa",10);
console.log(t);

let k:Paying.Phonepay=new Paying.Phonepay(3,"Eepssa",100);
console.log(k);
k.withdrawMoney(200);
console.log("Coupon "+k.getCoupon());
k.setcoupon(170);
console.log(k);