import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DogService } from './dog.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,HttpClientModule],
  providers:[DogService],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'Dog';
    data:any;
    constructor(private dogService:DogService){}ngOnInit(): void {
      this.dogService.getDog().subscribe((result: any)=>{
        console.log(result);
        this.data=result;
      })
    };

    refresh(){
      window.location.reload();
    }
}
