/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Kelly
 * Created: 16 may. 2024
 */

create database BibliotecaMusical;
use BibliotecaMusical;

CREATE TABLE Biblioteca (
    idBiblioteca INT PRIMARY KEY
);

CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY IDENTITY,
    nombre VARCHAR(30) NOT NULL,
    fechaNacimiento DATE
);

CREATE TABLE Cancion (
    idCancion INT PRIMARY KEY IDENTITY,
    tituloCancion VARCHAR(30) NOT NULL,
    duracionCancion INT NOT NULL
);

CREATE TABLE  Artista (
    idArtista INT PRIMARY KEY IDENTITY,
    nombreArtista VARCHAR(30) NOT NULL,
    nacionalidadArtista NVARCHAR(MAX)
);

CREATE TABLE Album (
    idAlbum INT PRIMARY KEY IDENTITY,
    nombreAlbum VARCHAR(30) NOT NULL,
    anioLanzamientoAlbum INT NOT NULL,
    disqueraAlbum VARCHAR(30) NOT NULL
);


-- Insertar datos de prueba para la tabla Biblioteca
INSERT INTO Biblioteca (idBiblioteca) VALUES (1);

-- Insertar datos de prueba para la tabla Usuario
INSERT INTO Usuario (nombre, fechaNacimiento) VALUES ('Juan Pérez', '1990-05-20');

-- Insertar datos de prueba para la tabla Cancion
INSERT INTO Cancion (tituloCancion, duracionCancion) VALUES ('Canción de prueba 1', 240);
INSERT INTO Cancion (tituloCancion, duracionCancion) VALUES ('Canción de prueba 2', 180);
INSERT INTO Cancion (tituloCancion, duracionCancion) VALUES ('Canción de prueba 3', 200);

-- Insertar datos de prueba para la tabla Artista
INSERT INTO Artista (nombreArtista, nacionalidadArtista) VALUES ('Artista de prueba 1', 'Nacionalidad 1');
INSERT INTO Artista (nombreArtista, nacionalidadArtista) VALUES ('Artista de prueba 2', 'Nacionalidad 2');
INSERT INTO Artista (nombreArtista, nacionalidadArtista) VALUES ('Artista de prueba 3', 'Nacionalidad 3');

select * from album ;
select * from Biblioteca;
select * from Artista;
select * from Cancion;