import { Component } from '@angular/core';
import { LoginService } from '../login.service';
import { HttpClientModule } from '@angular/common/http';
import { User } from '../user';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [HttpClientModule,CommonModule,FormsModule],
  providers:[LoginService,Router],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  constructor(private loginService:LoginService,private route:Router){};

  user:User={userName:"",password:""};

  login()
  {

    console.log("--login--");

    this.loginService.login(this.user).subscribe((data:any)=>{
    localStorage.setItem("token",data.token);
  
      console.log(localStorage.getItem("token"));
      this.route.navigateByUrl("dashboard");
    })
    
  }
}
