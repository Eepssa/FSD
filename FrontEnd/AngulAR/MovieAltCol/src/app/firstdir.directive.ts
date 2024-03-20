import { Directive ,HostListener,ElementRef, Input} from '@angular/core';


@Directive({
  selector: '[appFirstdir]',
  standalone: true
})
export class FirstdirDirective {
//   @Input() appFirstd = '';
//   constructor(private ref:ElementRef) { }

//   @HostListener ('mouseover') onMouseOver()
//   {
//     console.log(this.appFirstd);
//    // this.ref.nativeElement.style.color="red";
//    this.highlight("red","40px");

   
// }

//   @HostListener ('mouseleave') onMouseLeave()
//   {

//     //this.ref.nativeElement.style.color="black";
//     this.highlight("","");
//   }

//   private highlight(color: string, size:string) {
//     this.ref.nativeElement.style.backgroundColor = color;   //color=color
//     this.ref.nativeElement.style.fontSize = size;
//   }

  @Input() appFirstdir = '';
  constructor(private ref:ElementRef) { }

  @HostListener('mouseenter') onMouseEnter() {
    this.highlight(this.appFirstdir || 'red');
  }
  @HostListener('mouseleave') onMouseLeave() {
    this.highlight("");
  }

  private highlight(color: string) {
      this.ref.nativeElement.style.backgroundColor = color;
}}