import { Component} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NextComponentComponent } from './next-component/next-component.component';
import { SeccomponentComponent } from './seccomponent/seccomponent.component';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Gram } from '../gram';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,NextComponentComponent,SeccomponentComponent,CommonModule,FormsModule,Gram],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent  {
  title = 'hello-world';

  name="Eepssa Rout"
  dt=Date.now();
  pi=3.1478935;
  percent=10;
  cur=12.45;

  curr:any=new Date();
  timeLeft: number=0;
  interval: any;


  startTimer() {
    if(this.timeLeft>0){
       this.interval= setInterval(() => {
          this.timeLeft--;
          if(this.timeLeft>0)
            this.curr=new Date();
          else{
            clearInterval(this.interval);  
          }
          },1000)
      }
  
  }

}