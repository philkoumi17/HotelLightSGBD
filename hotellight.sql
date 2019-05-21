-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u2
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Sam 11 Mai 2019 à 01:14
-- Version du serveur :  5.5.54-0+deb8u1
-- Version de PHP :  5.6.30-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `hotellight`
--
CREATE DATABASE IF NOT EXISTS `hotellight` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `hotellight`;

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

CREATE TABLE IF NOT EXISTS `chambre` (
  `Ch_Num` int(7) NOT NULL,
  `Ch_Bain` tinyint(1) NOT NULL,
  `Ch_Douche` tinyint(1) NOT NULL,
  `Ch_WC` tinyint(1) NOT NULL,
  `Ch_Couchage` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `chambre`
--

INSERT INTO `chambre` (`Ch_Num`, `Ch_Bain`, `Ch_Douche`, `Ch_WC`, `Ch_Couchage`) VALUES
(1, 1, 1, 1, 3),
(2, 1, 0, 1, 2),
(3, 1, 1, 1, 2),
(4, 1, 1, 1, 0),
(5, 1, 0, 0, 3),
(106, 1, 1, 0, 2),
(160, 1, 1, 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
`Cl_Id` int(7) NOT NULL,
  `Cl_Nom` varchar(50) NOT NULL,
  `Cl_Prénom` varchar(50) NOT NULL,
  `Cl_Adresse` varchar(100) NOT NULL,
  `Cl_CP` int(4) NOT NULL,
  `Cl_Ville` varchar(50) NOT NULL,
  `Cl_Pays` int(7) NOT NULL,
  `Cl_Naiss` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`Cl_Id`, `Cl_Nom`, `Cl_Prénom`, `Cl_Adresse`, `Cl_CP`, `Cl_Ville`, `Cl_Pays`, `Cl_Naiss`) VALUES
(1, 'REDLER', 'Harry', 'Avenue Poudlard 185', 8006, 'Londres', 31, '1989-08-12'),
(2, 'BANKS', 'Carlton', 'Princeton Road 12', 1375, 'San Diego', 27, '1971-09-12'),
(3, 'THORNE', 'Jacob', 'Refax Street 148', 6397, 'Johannesburg', 1, '1968-06-12'),
(4, 'CALLEN', 'Samantha', 'Byron street 48B', 7586, 'Byron', 27, '1969-05-15'),
(8, 'FULTON', 'Tex', 'Schaarbeeklei 14', 1800, 'Bruxelles', 10, '1970-06-04'),
(9, 'COCHRAN', 'Richie', 'Victoria Street 45B', 8045, 'Chicago', 27, '1968-11-19'),
(10, 'PECK', 'Mattie', 'Al wazayra road 52', 4325, 'Alexandrie', 25, '1969-12-10'),
(12, 'TRAORÉ', 'Andre', 'Rue des Frères 52', 8569, 'Abidjan', 22, '1963-12-26');

-- --------------------------------------------------------

--
-- Structure de la table `pays`
--

CREATE TABLE IF NOT EXISTS `pays` (
`P_Id` int(7) NOT NULL,
  `P_Nom` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `pays`
--

INSERT INTO `pays` (`P_Id`, `P_Nom`) VALUES
(1, 'Afrique du Sud'),
(2, 'Algérie'),
(3, 'Allemagne'),
(4, 'Angola'),
(5, 'Argentine'),
(6, 'Arménie'),
(7, 'Australie'),
(8, 'Autriche'),
(9, 'Bahamas'),
(10, 'Belgique'),
(11, 'Brésil'),
(12, 'Bulgarie'),
(13, 'Burundi'),
(14, 'Cameroun'),
(15, 'Canada'),
(16, 'Chili'),
(17, 'Chine'),
(18, 'Chypre'),
(19, 'Colombie'),
(20, 'Répubilque démocratique du Congo'),
(21, 'Costa Rica'),
(22, 'Côte d''Ivoire'),
(23, 'Cuba'),
(24, 'Djibouti'),
(25, 'Egypte'),
(26, 'Espagne'),
(27, 'Etats-Unis'),
(28, 'Finlande'),
(29, 'France'),
(30, 'Ghana'),
(31, 'Grande-Bretagne'),
(32, 'Grèce'),
(33, 'Guinée'),
(34, 'Hongrie'),
(35, 'Inde'),
(36, 'Irlande'),
(37, 'Italie'),
(38, 'Japon'),
(39, 'Liban'),
(40, 'Luxembourg'),
(41, 'Maroc'),
(42, 'Mexique'),
(43, 'Monaco'),
(44, 'Nouvelle-Zélande'),
(45, 'Pays-Bas'),
(46, 'Pologne'),
(47, 'Portugal'),
(48, 'Roumanie'),
(49, 'Russie'),
(50, 'Sénégal'),
(51, 'Somalie'),
(52, 'Suède'),
(53, 'Suisse'),
(54, 'Syrie'),
(55, 'Thaïlande'),
(56, 'Tunisie'),
(57, 'Turquie'),
(58, 'Ukraine'),
(59, 'Venezuela');

-- --------------------------------------------------------

--
-- Structure de la table `planning`
--

CREATE TABLE IF NOT EXISTS `planning` (
`Pl_Id` int(7) NOT NULL,
  `Pl_Date` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `planning`
--

INSERT INTO `planning` (`Pl_Id`, `Pl_Date`) VALUES
(1, '2018-08-15'),
(2, '2018-08-22'),
(3, '2018-07-26'),
(4, '2018-09-01'),
(5, '2018-06-04'),
(6, '2018-07-13');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
`Res_Id` int(7) NOT NULL,
  `Cl_Id` int(7) NOT NULL,
  `Ch_Num` int(7) NOT NULL,
  `Pl_Id` int(7) NOT NULL,
  `NbPers` int(5) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `reservation`
--

INSERT INTO `reservation` (`Res_Id`, `Cl_Id`, `Ch_Num`, `Pl_Id`, `NbPers`) VALUES
(1, 1, 2, 1, 3),
(5, 3, 1, 2, 2),
(6, 2, 1, 2, 1),
(8, 4, 3, 3, 2),
(10, 9, 2, 3, 1),
(11, 10, 106, 4, 2),
(15, 2, 160, 4, 2),
(17, 12, 4, 4, 2);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `chambre`
--
ALTER TABLE `chambre`
 ADD PRIMARY KEY (`Ch_Num`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
 ADD PRIMARY KEY (`Cl_Id`), ADD KEY `Cl_Pays` (`Cl_Pays`);

--
-- Index pour la table `pays`
--
ALTER TABLE `pays`
 ADD PRIMARY KEY (`P_Id`);

--
-- Index pour la table `planning`
--
ALTER TABLE `planning`
 ADD PRIMARY KEY (`Pl_Id`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
 ADD PRIMARY KEY (`Res_Id`), ADD KEY `fk_reservation_chambre` (`Ch_Num`), ADD KEY `fk_reservation_planning` (`Pl_Id`), ADD KEY `fk_reservation_client` (`Cl_Id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
MODIFY `Cl_Id` int(7) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT pour la table `pays`
--
ALTER TABLE `pays`
MODIFY `P_Id` int(7) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=60;
--
-- AUTO_INCREMENT pour la table `planning`
--
ALTER TABLE `planning`
MODIFY `Pl_Id` int(7) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
MODIFY `Res_Id` int(7) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=18;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
ADD CONSTRAINT `client_ibfk_1` FOREIGN KEY (`Cl_Pays`) REFERENCES `pays` (`P_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
ADD CONSTRAINT `fk_reservation_planning` FOREIGN KEY (`Pl_Id`) REFERENCES `planning` (`Pl_Id`),
ADD CONSTRAINT `fk_reservation_chambre` FOREIGN KEY (`Ch_Num`) REFERENCES `chambre` (`Ch_Num`),
ADD CONSTRAINT `fk_reservation_client` FOREIGN KEY (`Cl_Id`) REFERENCES `client` (`Cl_Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
