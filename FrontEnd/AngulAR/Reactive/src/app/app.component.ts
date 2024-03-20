import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,ReactiveFormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'Reactive';
  

   
    formGrp= new FormGroup(
      {
            name:new FormControl("Jayanta"),
            email:new FormControl("")
  
      }
  
    );
    ngOnInit(): void {
      
       
      
    }

  
    onSubmit(frmGrp:FormGroup)
    {
      console.log(frmGrp.value['name']); 
      console.log(frmGrp.value['email']);  
  
    }
  }
  