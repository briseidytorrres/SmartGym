-- MySQL Script generated by MySQL Workbench
-- Sat May  4 22:32:48 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Gym
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Gym
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Gym` DEFAULT CHARACTER SET utf8 ;
USE `Gym` ;

-- -----------------------------------------------------
-- Table `Gym`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`users` (
  `id` INT NOT NULL,
  `User_Id` INT NULL,
  `Gym_Id` INT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Genero` VARCHAR(45) NULL,
  `Fecha_Ingreso` DATE NULL,
  `Fecha_Modificacion` DATE NULL,
  `Estatus` INT NULL,
  `Ultima_Visita` DATE NULL,
  `Turno_de_Frecuencia` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Empleados_Gym_Master`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Empleados_Gym_Master` (
  `id` INT NOT NULL,
  `Activo` INT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Genero` VARCHAR(45) NULL,
  `Fecha_Ingreso` DATE NULL,
  `Id_Empleado` INT NULL,
  `Id_Gym` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Empleados_Gym_Detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Empleados_Gym_Detail` (
  `Id` INT NOT NULL,
  `Id_Empleado` INT NULL,
  `Id_Area` INT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Turnos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Turnos` (
  `id` INT NOT NULL,
  `Nombre_Turno` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Areas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Areas` (
  `id` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Horario` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Gym_Detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Gym_Detail` (
  `id` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Direccion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`users_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`users_detail` (
  `id` INT NOT NULL,
  `User_Id` INT NULL,
  `Turno_usado` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;