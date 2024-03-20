import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-food',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './food.component.html',
  styleUrl: './food.component.css'
})
export class FoodComponent  implements OnInit{
  listFood:any[]=[];
  constructor(private empService:FoodService){};

  ngOnInit(): void {
    this.listFood=this.empService.getAllFood();
  }
}
