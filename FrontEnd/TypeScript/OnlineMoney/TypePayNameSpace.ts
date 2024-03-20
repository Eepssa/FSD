import { IUPI } from "./UPI";
import { UPIA } from "./AUPI";

export namespace Paying{
    export class Gpay extends UPIA implements IUPI {

        public constructor(upiId: number, providerName: string, private cashBack:number)
        {super(upiId,providerName);}
    
        addMoney(amt: number): void {
            //throw new Error("Method not implemented.");
            console.log("Amt added "+amt);
        }
    
        withdrawMoney(amt: number): void {
           //throw new Error("Method not implemented.");
           console.log("Amt withdrawn "+amt);
        }
         
        public getCashBack():number{
            return this.cashBack;
        }
        public setCashBack(cashBack:number):void{
            this.cashBack=cashBack;
        }
    
    }

    export class Phonepay extends UPIA implements IUPI{
        public constructor(upiId: number, providerName: string, private coupon:number)
        {super(upiId,providerName);}
    
        addMoney(amt: number): void {
            //throw new Error("Method not implemented.");
            console.log("Amt added "+amt);
        }
        withdrawMoney(amt: number): void {
           //throw new Error("Method not implemented.");
           console.log("Amt withdrawn "+amt);
        }
         
        public getCoupon():number{
            return this.coupon;
        }
        public setcoupon(coupon:number):void{
            this.coupon=coupon;
        }
    
    }
}