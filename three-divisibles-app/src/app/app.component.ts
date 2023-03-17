import { HttpErrorResponse } from '@angular/common/http';
import { Component} from '@angular/core';
import {FormControl, FormGroup, NgForm } from '@angular/forms';
import { ThreeDivisiblesService } from './three-divisibles.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'three-divisibles-app';
  result!: number;

 constructor(private threeDivisiblesService:ThreeDivisiblesService){}

  form = new FormGroup({
    givenNumber: new FormControl(),

  });
  public findNumberProperty():void{
    const num = this.form.controls['givenNumber'].value;
    console.log(num);
    this.threeDivisiblesService.getResult(num).subscribe({
      next: (result: number) =>{
        this.result = result;
      },
      error: (error: HttpErrorResponse)=>{
        alert(error.message);
      }
      
    });
  }
}
