import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LocalService } from './local.service';
import { JWT_OPTIONS, JwtHelperService, JwtModule } from '@auth0/angular-jwt';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  providers:[LocalService],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'localstorage';

  constructor(private localService:LocalService){}
  
  ngOnInit(): void {
    this.localService.storeData("token","eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJzdWIiOiJhZG1pbiIsImlhdCI6MTcwNzg4NzQ2MSwiZXhwIjoxNzA3ODg3NDYxfQ.4HUwarRdEiCYdsNtJGOBuc-BbDTpBI6_XYXLru9V6Ak");

    let data= this.localService.getData("token");
    console.log(data);
  }
;


}
