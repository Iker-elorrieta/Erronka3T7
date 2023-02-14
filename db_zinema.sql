-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-02-2023 a las 09:50:27
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
-- Estructura de tabla para la tabla `cine`
--

CREATE TABLE `cine` (
  `CodCine` int(11) NOT NULL,
  `nombcine` varchar(50) NOT NULL,
  `loccine` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cine`
--

INSERT INTO `cine` (`CodCine`, `nombcine`, `loccine`) VALUES
(1, 'Elorrieta-errekamari', 'bolueta'),
(2, 'Zubiarte', 'indautxu'),
(3, 'Getxo zinema', 'barakaldo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `DNI` char(9) NOT NULL,
  `contraseña` varchar(50) DEFAULT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `apellido1` varchar(20) DEFAULT NULL,
  `apellido2` varchar(20) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`DNI`, `contraseña`, `nombre`, `apellido1`, `apellido2`, `sexo`) VALUES
('12345678L', '123macarron', 'Juan', 'mezcorta', 'zurrutia', 'Masculino'),
('56734519X', '3456pepe', 'Emilio', 'fernandez', 'perez', 'Masculino'),
('87654321Y', 'foliodoblado', 'Maria', 'gonzalez', 'delrio', 'Femenino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--

CREATE TABLE `entrada` (
  `CodEntrada` int(11) NOT NULL,
  `CodSesion` int(11) DEFAULT NULL,
  `CodPed` int(11) DEFAULT NULL,
  `precio` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `entrada`
--

INSERT INTO `entrada` (`CodEntrada`, `CodSesion`, `CodPed`, `precio`) VALUES
(1, 1, 1, 8),
(2, 2, 1, 8),
(3, 3, 2, 8),
(4, 1, 3, 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `CodPed` int(11) NOT NULL,
  `DNI` char(9) DEFAULT NULL,
  `fecha_compra` timestamp NOT NULL DEFAULT current_timestamp(),
  `importe` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`CodPed`, `DNI`, `fecha_compra`, `importe`) VALUES
(1, '12345678L', '2023-05-15 22:00:00', 16),
(2, '56734519X', '2023-02-06 23:00:00', 8),
(3, '87654321Y', '2023-05-15 22:00:00', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `CodPeli` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `duracion` int(10) UNSIGNED NOT NULL,
  `genero` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`CodPeli`, `titulo`, `duracion`, `genero`) VALUES
(1, 'Handia', 112, 'drama'),
(2, 'La lista de schindler', 190, 'drama'),
(3, 'Cadena pepetua', 144, 'drama'),
(4, 'Millon dolar baby', 133, 'drama'),
(5, 'Scary movie', 90, 'komedia'),
(6, 'El gran lobowsky', 119, 'komedia'),
(7, 'La vide de brian', 94, 'komedia'),
(8, 'Aterriza como puedas', 88, 'komedia'),
(9, '2001: odisea en el espacio', 142, 'zientzia fikzioa'),
(10, 'La novia de frankestein', 75, 'zientzia fikzioa'),
(11, 'El planeta de los simios', 115, 'zientzia fikzioa'),
(12, 'Alien, el octavo pasajero', 117, 'zientzia fikzioa'),
(13, 'Psicosis', 109, 'terrorea'),
(14, 'El resplandor', 146, 'terrorea'),
(15, 'Dracula', 155, 'terrorea'),
(16, 'Cisne negro', 110, 'terrorea');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salas`
--

CREATE TABLE `salas` (
  `CodSala` int(11) NOT NULL,
  `CodCine` int(11) NOT NULL,
  `nomsala` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `salas`
--

INSERT INTO `salas` (`CodSala`, `CodCine`, `nomsala`) VALUES
(1, 1, 'areto nagusia'),
(1, 2, 'areto nagusia'),
(1, 3, 'areto nagusia'),
(2, 1, 'areto ertaina'),
(2, 2, 'areto ertaina'),
(2, 3, 'areto ertaina'),
(3, 1, 'areto txikia'),
(3, 2, 'areto txikia'),
(3, 3, 'areto txikia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesiones`
--

CREATE TABLE `sesiones` (
  `CodSesion` int(11) NOT NULL,
  `CodSala` int(11) DEFAULT NULL,
  `CodCine` int(11) DEFAULT NULL,
  `CodPeli` int(11) DEFAULT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sesiones`
--

INSERT INTO `sesiones` (`CodSesion`, `CodSala`, `CodCine`, `CodPeli`, `fecha`, `hora`) VALUES
(1, 1, 1, 1, '2023-01-05', '09:00:00'),
(2, 1, 1, 2, '2023-01-20', '11:30:00'),
(3, 2, 1, 3, '2023-02-03', '10:00:00'),
(4, 2, 1, 4, '2023-02-10', '12:00:00'),
(5, 3, 1, 5, '2023-02-22', '08:00:00'),
(6, 3, 1, 6, '2023-02-23', '10:30:00'),
(7, 1, 2, 7, '2023-02-26', '11:30:00'),
(8, 1, 2, 8, '2023-03-01', '08:00:00'),
(9, 2, 2, 9, '2023-04-02', '12:30:00'),
(10, 2, 2, 10, '2023-04-08', '13:45:00'),
(11, 3, 2, 11, '2023-04-10', '09:00:00'),
(12, 3, 2, 12, '2023-04-13', '11:30:00'),
(13, 1, 3, 13, '2023-04-20', '17:20:00'),
(14, 1, 3, 14, '2023-05-03', '14:30:00'),
(15, 2, 3, 15, '2023-05-15', '14:00:00'),
(16, 2, 3, 16, '2023-05-20', '11:00:00'),
(17, 3, 3, 1, '2023-06-05', '10:15:00'),
(18, 3, 3, 2, '2023-06-16', '16:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cine`
--
ALTER TABLE `cine`
  ADD PRIMARY KEY (`CodCine`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`CodEntrada`),
  ADD KEY `fk_CodSesion` (`CodSesion`),
  ADD KEY `fk_CodPed` (`CodPed`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`CodPed`),
  ADD KEY `fk_DNI` (`DNI`);

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`CodPeli`);

--
-- Indices de la tabla `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`CodSala`,`CodCine`),
  ADD KEY `fk_CodCine` (`CodCine`);

--
-- Indices de la tabla `sesiones`
--
ALTER TABLE `sesiones`
  ADD PRIMARY KEY (`CodSesion`),
  ADD KEY `fk_CodSala` (`CodSala`),
  ADD KEY `fk_CodCineS` (`CodCine`),
  ADD KEY `fk_CodPeli` (`CodPeli`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cine`
--
ALTER TABLE `cine`
  MODIFY `CodCine` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `entrada`
--
ALTER TABLE `entrada`
  MODIFY `CodEntrada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `CodPed` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `CodPeli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `sesiones`
--
ALTER TABLE `sesiones`
  MODIFY `CodSesion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `fk_CodPed` FOREIGN KEY (`CodPed`) REFERENCES `pedido` (`CodPed`),
  ADD CONSTRAINT `fk_CodSesion` FOREIGN KEY (`CodSesion`) REFERENCES `sesiones` (`CodSesion`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `fk_DNI` FOREIGN KEY (`DNI`) REFERENCES `clientes` (`DNI`);

--
-- Filtros para la tabla `salas`
--
ALTER TABLE `salas`
  ADD CONSTRAINT `fk_CodCine` FOREIGN KEY (`CodCine`) REFERENCES `cine` (`CodCine`);

--
-- Filtros para la tabla `sesiones`
--
ALTER TABLE `sesiones`
  ADD CONSTRAINT `fk_CodCineS` FOREIGN KEY (`CodCine`) REFERENCES `salas` (`CodCine`),
  ADD CONSTRAINT `fk_CodPeli` FOREIGN KEY (`CodPeli`) REFERENCES `peliculas` (`CodPeli`),
  ADD CONSTRAINT `fk_CodSala` FOREIGN KEY (`CodSala`) REFERENCES `salas` (`CodSala`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
