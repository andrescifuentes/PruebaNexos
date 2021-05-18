import { Injectable } from '@angular/core';
import { CLIENTES} from './clientes.json';
import {Cliente} from './cliente';
import {observable} from 'rxjs';
import {of,Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { Respuesta } from '../interface/interfaceRespuesta';


@Injectable()
export class ClienteService {

  private urlEndPonit:string = 'http://localhost:8080/api/listar';

  private urlEndPonitPost : string = 'http://localhost:8080/api/guardar';

  private urlEndPonitPuth : string = 'http://localhost:8080/api/actualizar';

  private urlEndPonitDelete : string = 'http://localhost:8080/api/eliminar';


  constructor(private http : HttpClient ) { }

 getClientes(): Observable<Respuesta>{

   const header = {};

  //return of (CLIENTES);
  return this.http.get<Respuesta>(this.urlEndPonit,header);
}


 postClientes(cliente:Respuesta): Observable<Respuesta>{

  return this.http.post<Respuesta>(this.urlEndPonitPost , cliente)

 }
 

}
