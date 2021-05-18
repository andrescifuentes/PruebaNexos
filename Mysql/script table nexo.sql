
create database db_nexos;
use db_nexos;
select*from producto;
insert into producto (id,cantidad,fch_ingreso,nombre_producto,usuario)value (1,4,"2020/01/31","martillo","gustavo");
insert into cargo (id,nombre_cargo)value (1,"Asesor de ventas");
insert into usuario (id,nombre,edad,cargo,fch_ingreso_compania)value(1,"gustavo",27,"Asesor de ventas","2020/01/31");
