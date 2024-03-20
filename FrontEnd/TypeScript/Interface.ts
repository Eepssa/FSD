import bank from './Bank';

interface BankOp extends bank{
    saving(amt:Number):void;
}

class NewBank implements bank{
    deoposit(amt: number): void {
        //throw new Error('Method not implemented.');
        console.log("Amount deposited "+amt);
    }
    withdraw(amt: number): void {
        //throw new Error('Method not implemented.');
        console.log("Amount withdrawn "+amt);
    }

}

class NewBanks implements BankOp{
    saving(amt: Number): void {
        //throw new Error('Method not implemented.');
        console.log("Amount saving "+amt);
    }
    deoposit(amt: number): void {
        //throw new Error('Method not implemented.');
        console.log("Amount deposited "+amt);
    }
    withdraw(amt: number): void {
        //throw new Error('Method not implemented.');
        console.log("Amount withdrawn "+amt);
    }
    
}
let b:bank=new NewBank();
b.deoposit(1000);
b.withdraw(500);

let k:BankOp=new NewBanks();
k.deoposit(10);
k.saving(10);
