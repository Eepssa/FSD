import { Injectable, OnInit } from '@angular/core';
import { User } from './user';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService implements OnInit {

  constructor(private http:HttpClient) { }
  
  ngOnInit(): void {
    //localStorage.clear();
     
  }

  login(user:User):any
  {
    
3
4
5
 
  const headers:HttpHeaders= new HttpHeaders()
  .set('content-type', 'application/json')
  .set('Access-Control-Allow-Origin', '*');

     let url:string="http://localhost:8111/auth/v1/login";
     return this.http.post(url,user,{'headers':headers});

  }

 

}
