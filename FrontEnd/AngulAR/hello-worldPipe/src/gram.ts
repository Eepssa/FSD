import { PipeTransform ,Pipe} from "@angular/core";


@Pipe({
    standalone: true,
    name: 'gram'
  })
export class Gram implements PipeTransform{
    transform(gram:number):string {
       return gram/1000+" kg";
    }


    
}