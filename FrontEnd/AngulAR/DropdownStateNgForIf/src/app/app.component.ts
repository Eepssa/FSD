import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule,FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'DropdownState';
  state=["Odisha","Bhiar","Chattisgarh"];
  flag:boolean=true;
  onClick(){
    this.flag=!this.flag;
  }
 
  editText:string="Eepssa";
  count=0;
  fn(){
  this.count=this.editText.length;
  }
    

}
