import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LocalService {

  constructor() { }

  storeData(key:string,value:string)
  {

    localStorage.setItem(key,value);
  }

  getData(key:string):any{

    return localStorage.getItem(key)?.toString();
  }
}
