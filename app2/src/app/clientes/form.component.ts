import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  public productoCliente = {
    id : 1,
    nombre_producto:'',
    cantidad: 0,
    fch_ingreso: '',
    usuario: ''
  };
  
  public cliente : Cliente = new Cliente();
  public titulo :String = "Crear Producto";

  constructor(private guardarProducto : ClienteService, private router : Router   ) { }

  ngOnInit(): void {
  }

  public crear() {
    

    this.guardarProducto.postClientes(this.productoCliente).subscribe(data => {

      console.log(data);
      this.router.navigate(['clientes']); 

    } )
    

  }

}
