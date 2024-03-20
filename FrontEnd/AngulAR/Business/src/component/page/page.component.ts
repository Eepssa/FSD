import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-page',
  standalone: true,
  imports: [],
  templateUrl: './page.component.html',
  styleUrl: './page.component.css'
})
export class PageComponent implements OnInit {
  fName="";
  ngOnInit(): void {
    //throw new Error('Method not implemented.');
    this.fName="Eepssa Rout";
  }
  //fname="Eepssa";
}
