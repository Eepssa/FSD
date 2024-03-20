import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor() { }
  public getAllFood():any{

    let foodList:any [] = [
     {
       "id":1,
       "name":"Chips",
       "price":"10"
     },
     {
      "id":2,
      "name":"Biscuit",
      "price":"20"
     },
     {
      "id":3,
      "name":"Coke",
      "price":"25"
     }

    ];
    return foodList;
   }
   

}
