import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import {Cliente} from './cliente';
import {ClienteService} from './cliente.service';


@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'

})
export class ClientesComponent implements OnInit {
  
  clientes:any = []; 

 //traemos la inteccion del servido al constructor ng 
  constructor(private clienteService : ClienteService ) { }

  ngOnInit(){
    
    this.getProducto();
  }

  getProducto(){
    this.clienteService.getClientes().subscribe(res => { 

      console.log(res);
      this.clientes = res;

    } )
  }

  editarProducto(){
  }
  
  select(event){
   console.log(event);
  }



}
