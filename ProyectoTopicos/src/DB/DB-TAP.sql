CREATE DATABASE TAP;
CREATE TABLE Ejercicio;
CREATE TABLE Desarrollador;

-- Tabla de Parciales
CREATE TABLE Parciales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

-- Tabla de Ejercicios
CREATE TABLE Ejercicios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    enunciado TEXT,
    logica_ejecucion TEXT,
    id_parcial INT,
    FOREIGN KEY (id_parcial) REFERENCES Parciales(id)
);

-- Tabla de Desarrolladores
CREATE TABLE Desarrolladores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255),
    empresa VARCHAR(255)
);

-- Tabla de Relación entre Usuarios y Ejercicios
CREATE TABLE Usuarios_Ejercicios (
    id_usuario INT,
    id_ejercicio INT,
    PRIMARY KEY (id_usuario, id_ejercicio),
    FOREIGN KEY (id_usuario) REFERENCES Desarrolladores(id),
    FOREIGN KEY (id_ejercicio) REFERENCES Ejercicios(id)
);

