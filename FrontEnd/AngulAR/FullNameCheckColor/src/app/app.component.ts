import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'FullName';
  fname:string=""
  lname:string=""
  full:string="";
 show(){
  this.full=this.fname+this.lname
 }

 isColor:boolean=false
 color(c:string){
  if(c=='red'){
      this.isColor=true
  }
 }
 
}