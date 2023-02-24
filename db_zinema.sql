-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-02-2023 a las 10:33:09
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_zinema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aretoa`
--

CREATE TABLE `aretoa` (
  `CodAretoa` int(11) NOT NULL,
  `AretoIzena` varchar(30) NOT NULL,
  `Codzinema` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `aretoa`
--

INSERT INTO `aretoa` (`CodAretoa`, `AretoIzena`, `Codzinema`) VALUES
(1, 'areto nagusia', 1),
(2, 'areto ertaina', 1),
(3, 'areto txikia', 1),
(4, 'areto nagusia', 2),
(5, 'areto ertaina', 2),
(6, 'areto nagusia', 3),
(7, 'areto ertaina', 3),
(8, 'areto txikia', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bezeroa`
--

CREATE TABLE `bezeroa` (
  `DNI` varchar(10) NOT NULL,
  `Izena` varchar(30) NOT NULL,
  `Abizena1` varchar(30) NOT NULL,
  `Abizena2` varchar(30) NOT NULL,
  `sexua` varchar(20) NOT NULL,
  `pasahitza` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bezeroa`
--

INSERT INTO `bezeroa` (`DNI`, `Izena`, `Abizena1`, `Abizena2`, `sexua`, `pasahitza`) VALUES
('01293587X', 'Marcelino', 'perez', 'aguire', 'Masculino', 'ratonvolador4000'),
('09246789S', 'Rasca', 'enlaespalda', 'enelbrazo', 'Masculino', 'me_pica'),
('09765467Ñ', 'Markel', 'minduzia', 'errero', 'Masculino', 'vivaelveti'),
('09765467R', 'Andoni', 'miguel', 'perrero', 'Masculino', 'miperroesfeo'),
('12345678L', 'Juan', 'mezcorta', 'zurrutia', 'Masculino', '123macarron'),
('34256789P', 'Elisa', 'ferreiro', 'delmar', 'Femenino', '209345'),
('56734519X', 'Emilio', 'fernandez', 'perez', 'Masculino', '3456pepe'),
('56783456Q', 'Jose', 'galdoz', 'perroalto', 'Masculino', 'españitamirey'),
('72938471M', 'Elsa', 'pato', 'desgastado', 'Femenino', 'frozen3'),
('87654321Y', 'Maria', 'gonzalez', 'delrio', 'Femenino', 'foliodoblado'),
('98764390S', 'Pica', 'dondesea', 'cuandosea', 'Masculino', 'me_rasca');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eskaera`
--

CREATE TABLE `eskaera` (
  `CodEskaera` int(11) NOT NULL,
  `DNI` varchar(10) NOT NULL,
  `preziototala` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `eskaera`
--

INSERT INTO `eskaera` (`CodEskaera`, `DNI`, `preziototala`) VALUES
(1, '12345678L', 16),
(2, '56734519X', 8),
(3, '87654321Y', 8),
(4, '72938471M', 8),
(5, '56783456Q', 8),
(6, '09246789S', 8),
(7, '09765467Ñ', 8),
(8, '34256789P', 8),
(9, '98764390S', 8),
(10, '56734519X', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `filma`
--

CREATE TABLE `filma` (
  `CodFilma` int(11) NOT NULL,
  `NomFilma` varchar(100) NOT NULL,
  `prezioa` float NOT NULL,
  `iraupena` int(11) NOT NULL,
  `generoa` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `filma`
--

INSERT INTO `filma` (`CodFilma`, `NomFilma`, `prezioa`, `iraupena`, `generoa`) VALUES
(1, 'Handia', 8, 112, 'drama'),
(2, 'La lista de schindler', 8, 190, 'drama'),
(3, 'Cadena pepetua', 8, 144, 'drama'),
(4, 'Millon dolar baby', 8, 133, 'drama'),
(5, 'Scary movie', 8, 90, 'komedia'),
(6, 'El gran lebowsky', 8, 119, 'komedia'),
(7, 'La vide de brian', 8, 94, 'komedia'),
(8, 'Aterriza como puedas', 8, 88, 'komedia'),
(9, '2001: odisea en el espacio', 8, 142, 'zientzia fikzioa'),
(10, 'La novia de frankenstein', 8, 75, 'zientzia fikzioa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordutegia`
--

CREATE TABLE `ordutegia` (
  `CodOrdutegia` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `CodFilma` int(11) NOT NULL,
  `CodAretoa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ordutegia`
--

INSERT INTO `ordutegia` (`CodOrdutegia`, `fecha`, `hora`, `CodFilma`, `CodAretoa`) VALUES
(1, '2023-02-07', '16:00:00', 1, 1),
(2, '2023-02-17', '18:00:00', 5, 2),
(3, '2023-02-09', '12:30:00', 1, 3),
(4, '2023-02-08', '16:00:00', 2, 4),
(5, '2023-02-08', '18:00:00', 3, 5),
(6, '2023-02-07', '12:30:00', 2, 6),
(7, '2023-02-17', '12:30:00', 4, 7),
(8, '2023-02-08', '12:30:00', 3, 8),
(9, '2023-02-17', '12:30:00', 2, 1),
(10, '2023-02-07', '16:30:00', 1, 1),
(11, '2023-02-10', '16:30:00', 5, 5),
(12, '2023-02-10', '16:30:00', 5, 2),
(13, '2023-02-10', '16:30:00', 5, 8),
(14, '2023-02-10', '16:30:00', 5, 1),
(15, '2023-03-01', '16:00:00', 6, 8),
(16, '2023-03-01', '16:00:00', 6, 7),
(17, '2023-03-01', '15:30:00', 6, 1),
(18, '2023-03-01', '16:00:00', 6, 4),
(19, '2023-03-10', '17:30:00', 7, 1),
(20, '2023-03-10', '17:00:00', 7, 3),
(21, '2023-03-10', '17:30:00', 7, 8),
(22, '2023-03-10', '17:00:00', 7, 5),
(23, '2023-03-01', '16:00:00', 8, 3),
(24, '2023-03-01', '16:30:00', 8, 5),
(25, '2023-03-01', '16:00:00', 8, 8),
(26, '2023-03-01', '16:30:00', 8, 2),
(27, '2023-03-02', '17:00:00', 9, 6),
(28, '2023-03-02', '17:00:00', 9, 3),
(29, '2023-03-02', '17:45:00', 9, 4),
(30, '2023-03-02', '17:00:00', 9, 7),
(31, '2023-03-04', '18:45:00', 10, 5),
(32, '2023-03-04', '18:00:00', 10, 8),
(33, '2023-03-04', '18:30:00', 10, 1),
(34, '2023-03-04', '18:00:00', 10, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sarrera`
--

CREATE TABLE `sarrera` (
  `CodSarrera` int(11) NOT NULL,
  `CodOrdutegia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sarrera`
--

INSERT INTO `sarrera` (`CodSarrera`, `CodOrdutegia`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zinema`
--

CREATE TABLE `zinema` (
  `Codzinema` int(11) NOT NULL,
  `IzZinema` varchar(30) NOT NULL,
  `ZbkAretoak` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `zinema`
--

INSERT INTO `zinema` (`Codzinema`, `IzZinema`, `ZbkAretoak`) VALUES
(1, 'Elorrieta-Errekamari', 3),
(2, 'Zubiarte', 2),
(3, 'Getxo zinema', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aretoa`
--
ALTER TABLE `aretoa`
  ADD PRIMARY KEY (`CodAretoa`),
  ADD KEY `FK_zinema_aretoa` (`Codzinema`);

--
-- Indices de la tabla `bezeroa`
--
ALTER TABLE `bezeroa`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `eskaera`
--
ALTER TABLE `eskaera`
  ADD PRIMARY KEY (`CodEskaera`),
  ADD KEY `FK_bezeroa_eskaera` (`DNI`);

--
-- Indices de la tabla `filma`
--
ALTER TABLE `filma`
  ADD PRIMARY KEY (`CodFilma`);

--
-- Indices de la tabla `ordutegia`
--
ALTER TABLE `ordutegia`
  ADD PRIMARY KEY (`CodOrdutegia`),
  ADD KEY `FK_filma_ordutegia` (`CodFilma`),
  ADD KEY `FK_aretoa_ordutegia` (`CodAretoa`);

--
-- Indices de la tabla `sarrera`
--
ALTER TABLE `sarrera`
  ADD PRIMARY KEY (`CodSarrera`),
  ADD KEY `FK_ordutegiasarrera` (`CodOrdutegia`);

--
-- Indices de la tabla `zinema`
--
ALTER TABLE `zinema`
  ADD PRIMARY KEY (`Codzinema`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `eskaera`
--
ALTER TABLE `eskaera`
  MODIFY `CodEskaera` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `sarrera`
--
ALTER TABLE `sarrera`
  MODIFY `CodSarrera` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aretoa`
--
ALTER TABLE `aretoa`
  ADD CONSTRAINT `FK_zinema_aretoa` FOREIGN KEY (`Codzinema`) REFERENCES `zinema` (`Codzinema`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `eskaera`
--
ALTER TABLE `eskaera`
  ADD CONSTRAINT `FK_bezeroa_eskaera` FOREIGN KEY (`DNI`) REFERENCES `bezeroa` (`DNI`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `ordutegia`
--
ALTER TABLE `ordutegia`
  ADD CONSTRAINT `FK_aretoa_ordutegia` FOREIGN KEY (`CodAretoa`) REFERENCES `aretoa` (`CodAretoa`) ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_filma_ordutegia` FOREIGN KEY (`CodFilma`) REFERENCES `filma` (`CodFilma`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `sarrera`
--
ALTER TABLE `sarrera`
  ADD CONSTRAINT `FK_ordutegiasarrera` FOREIGN KEY (`CodOrdutegia`) REFERENCES `ordutegia` (`CodOrdutegia`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
