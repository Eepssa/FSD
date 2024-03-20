export abstract class UPIA{
    public constructor(private upiId:number, private providerName:string){ };

    public getUpiId():number{
        return this.upiId;
    }

    public getProviderName():string{
        return this.providerName;
    }
}