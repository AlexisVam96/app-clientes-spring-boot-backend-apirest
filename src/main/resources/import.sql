insert into regiones (nombre) values('Sudamérica');
insert into regiones (nombre) values('Norteamérica');
insert into regiones (nombre) values('África');
insert into regiones (nombre) values('Asia');
insert into regiones (nombre) values('Europa');
insert into regiones (nombre) values('Oceanía');
insert into regiones (nombre) values('Antártida');

insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Maria','Ore', 'maria@gmail.com', '2020-08-12', null, 1);
insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Juan','Roldan', 'juan@gmail.com', '2020-08-12', null, 2);
insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Lucas','Modirck', 'lucas@gmail.com', '2020-08-13', null, 3);
insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Maniel','Rodiel', 'manuel@gmail.com', '2020-08-14', null, 5);
insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Federic','Orderick', 'federico@gmail.com', '2020-08-15', null, 5);
insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Renzo','Menso', 'renzo@gmail.com', '2020-08-16', null, 5);
insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Anabel','Diaz', 'anabel@gmail.com', '2020-08-17', null, 3);
insert into clientes (nombre, apellido, email, create_at, foto, region_id) values('Rodrigo','Gonzales', 'rodri@gmail.com', '2020-08-18', null, 4);

insert into usuarios (username, password, enabled, nombre, apellido, email) values('andres', '$2a$10$EqG7KQIzApYV1jaEh6Iadu7.8sdNWvGpgw4Pr0s/vFHt9/euCNqom', 1, 'Andres', 'Guzman', 'andres@gmail.com');
insert into usuarios (username, password, enabled, nombre, apellido, email) values('admin', '$2a$10$UUDgG7YXJVgetmFtRNAM7uhGR7ea3XUGTBauDQnVkpDHam0D0CaCW', 1, 'Maria', 'Ore', 'maria@gmail.com');

insert into roles (nombre) values('ROLE_USER');
insert into roles (nombre) values('ROLE_ADMIN');

insert into usuario_roles (usuario_id, role_id) values(1,1);
insert into usuario_roles (usuario_id, role_id) values(2,2);
insert into usuario_roles (usuario_id, role_id) values(2,1);

insert into productos (nombre, precio, create_at) values('Panasonic Pantalla LCD', 999, now());
insert into productos (nombre, precio, create_at) values('Sony Camara digital DSW-1545', 449, now());
insert into productos (nombre, precio, create_at) values('Apple iPod shurffle', 199, now());
insert into productos (nombre, precio, create_at) values('Sony Notebook Z154', 239, now());
insert into productos (nombre, precio, create_at) values('Hewlet Packard Multifuncional F22012', 145, now());
insert into productos (nombre, precio, create_at) values('Blanchi Bicicleta Aro 26', 599, now());
insert into productos (nombre, precio, create_at) values('Mica Comoda 5 cajones', 699, now());

insert into facturas (descripcion, observacion, cliente_id, create_at) values('Factura de equipos de oficina', null, 1 , now());

insert into facturas_items (cantidad, factura_id, producto_id) values(1, 1, 1);
insert into facturas_items (cantidad, factura_id, producto_id) values(2, 1, 4);
insert into facturas_items (cantidad, factura_id, producto_id) values(1, 1, 5);
insert into facturas_items (cantidad, factura_id, producto_id) values(1, 1, 7);

insert into facturas (descripcion, observacion, cliente_id, create_at) values('Factura de Bicicleta', 'Alguna nota importante!',1 , now());

insert into facturas_items (cantidad, factura_id, producto_id) values(3, 2, 6);
