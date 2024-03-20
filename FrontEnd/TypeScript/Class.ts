type type=string;

enum COLOR{
    BLACK=5,
    RED,
    PINK=10
}

// let col:COLOR=COLOR.PINK;
// console.log(col);

class Vehicle{
    col:COLOR;
    fuelType:type;
    
    public constructor(col:COLOR,fuelType:type){
        this.col=col;
        this.fuelType=fuelType;
    }

    public getColor():number{
        return this.col;
    }
 
    public getFuty():string{
        return this.fuelType;
    }
    // public toString():String{
    //     return this.col+" "+this.fuelType;
    // }
}

let veh:Vehicle=new Vehicle(COLOR.BLACK,"Eelectric");
console.log(veh.getColor());
console.log(veh.getFuty());
console.log(veh);