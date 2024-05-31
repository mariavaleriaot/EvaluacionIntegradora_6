CREATE DATABASE alkeW06;

USE alkeW06;

CREATE TABLE Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(50) NOT NULL,
    contrasena VARCHAR(100) NOT NULL,
    correo_electronico VARCHAR(100) NOT NULL,
    rol VARCHAR(20) NOT NULL
);

CREATE TABLE Cuenta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_cuenta VARCHAR(20) NOT NULL,
    saldo DECIMAL(19, 2) NOT NULL,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

CREATE TABLE Transaccion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    monto DECIMAL(19, 2) NOT NULL,
    fecha DATETIME NOT NULL,
    tipo VARCHAR(10) NOT NULL,
    cuenta_id INT,
    FOREIGN KEY (cuenta_id) REFERENCES Cuenta(id)
);

SELECT * FROM Transaccion;
SELECT * FROM Usuario;
SELECT * FROM Cuenta;