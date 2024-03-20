import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { FirstdirDirective } from './firstdir.directive';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule,FormsModule,FirstdirDirective],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MovieAltCol';
  movies:any[]=[{
    "name":"RRR",
    "rating":3.4,
    "language":"HINDI"
 },
 {
  "name":"12th Fail",
  "rating":9,
  "language":"HINDI"
 }
 ,
 {
  "name":"Fighter",
  "rating":7,
  "language":"HINDI"
 }
 ,
 {
  "name":"Casino Royale",
  "rating":9,
  "language":"ENGLISH"
 }

]

isTy="normal"
ist = "normal"
getType(ty:string){

  if(ty=="italic")
    this.isTy="italic";
  if(ty=="bold")
    this.ist="bold";
}

getbold(){
  if(this.ist=="bold")
   {return "bold";}
  return "normal";
}
  
getitalic(){
  if(this.isTy=="italic")
   {return "italic";}
  return "normal";
}
 
color = 'red';
}