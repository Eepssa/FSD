import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  
  jwtHelper:JwtHelperService= new JwtHelperService();
  constructor() { }

  isAuthenticated():any
  {
     let token:any= localStorage.getItem("token");    
     
     return !this.jwtHelper.isTokenExpired(token);
  }
}
