create table cliente (
                         id INTEGER,
                         nombre VARCHAR(50),
                         apellido VARCHAR(50),
                         run VARCHAR(50),
                         direccion VARCHAR(50),
                         fecha_nacimiento DATE,
                         estado BOOLEAN
);

insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Hamlen', 'Landeaux', '483-11-0636', 'Apt 1454', '2024-08-28', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Barbie', 'Searle', '891-24-0334', 'Suite 20', '2024-09-02', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Onofredo', 'Gertray', '252-79-4434', '20th Floor', '2024-06-19', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Benedicto', 'Curless', '252-39-9382', 'Suite 83', '2024-12-03', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Averell', 'Jobke', '473-47-1238', 'PO Box 44677', '2024-06-26', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Grete', 'Regitz', '321-53-1757', 'Suite 5', '2023-12-30', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Beatrisa', 'Charter', '419-79-7417', '14th Floor', '2024-07-02', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Illa', 'Stanley', '185-55-4864', 'PO Box 73141', '2024-06-23',true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Verla', 'Rudeforth', '456-87-5765', '16th Floor', '2024-11-01', true);
insert into cliente (nombre, apellido, run, direccion, fecha_nacimiento, estado) values ('Clair', 'Devericks', '797-52-3963', 'Apt 615', '2024-06-23', true);



create table plan (
                      id INTEGER,
                      nombre VARCHAR(100),
                      precio INTEGER,
                      servicio VARCHAR(100),
                      estado BOOLEAN
);
insert into plan (nombre, precio, servicio, estado) values ('Plan Basic', '12990', '300 Minutos', true);
insert into plan (nombre, precio, servicio, estado) values ('Plan Basic + plus', '14990', '300 minutos + Social ilimitado', true);
insert into plan (nombre, precio, servicio, estado) values ('Plan Medio', '25990', '300 minutos + 500 mbps Fibra', true);
insert into plan (nombre, precio, servicio, estado) values ('Plan Medio + plus', '27990', '300 minutos + 500 mbps Fibra + Social ilimitado', true);
insert into plan (nombre, precio, servicio, estado) values ('Plan Full', '38990', '300 minutos + 500 mbps Fibra + 50 Canales', true);
insert into plan (nombre, precio, servicio, estado) values ('Plan Full + plus', '40990', '300 minutos + 500 mbps Fibra + 50 Canales + Social ilimitado', true);
