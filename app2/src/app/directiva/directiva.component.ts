import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directiva',
  templateUrl: './directiva.component.html',

})
export class DirectivaComponent  {

listaCurso:String[]= ['typescript','java', 'c#, javascript','php'];
habilitar :boolean = true;


  constructor() { }

  setHabilitar():void{
   
   this.habilitar = (this.habilitar == true)? false:true;

  }



}
