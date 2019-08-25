-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Aug 23, 2019 at 05:28 PM
-- Server version: 5.7.27-0ubuntu0.18.04.1
-- PHP Version: 7.2.19-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `l3guidina`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `idadmin` varchar(100) NOT NULL,
  `secode` varchar(20) NOT NULL DEFAULT 'Karbon'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`idadmin`, `secode`) VALUES
('UAd-1', '6nizwU'),
('UAd-3', 'jJ7fCd');

-- --------------------------------------------------------

--
-- Table structure for table `agents`
--

CREATE TABLE `agents` (
  `idagent` varchar(100) NOT NULL,
  `ville` varchar(20) DEFAULT 'Alger',
  `secode` varchar(20) NOT NULL DEFAULT 'Oxygen'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agents`
--

INSERT INTO `agents` (`idagent`, `ville`, `secode`) VALUES
('UAg-11', 'Louisiana', 'GPGolNd7'),
('UAg-13', 'California', 'wR0uSb'),
('UAg-28', 'New York', 'CxLvkXj');

-- --------------------------------------------------------

--
-- Table structure for table `campingsites`
--

CREATE TABLE `campingsites` (
  `idcamping` varchar(100) NOT NULL,
  `nbrplaces` int(11) DEFAULT NULL,
  `area` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `campingsites`
--

INSERT INTO `campingsites` (`idcamping`, `nbrplaces`, `area`) VALUES
('SCa-002', 926, 5232),
('SCa-066', 916, 5640),
('SCa-105', 2, 6754),
('SCa-107', 739, 784),
('SCa-219', 298, 4565);

-- --------------------------------------------------------

--
-- Table structure for table `circuits`
--

CREATE TABLE `circuits` (
  `idcircuit` int(11) NOT NULL,
  `nomcircuit` varchar(100) DEFAULT NULL,
  `pointdep` varchar(100) DEFAULT NULL,
  `pointarv` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `circuits`
--

INSERT INTO `circuits` (`idcircuit`, `nomcircuit`, `pointdep`, `pointarv`) VALUES
(1, 'Echo Lima Juliett', 'Kentucky', 'California'),
(2, 'Mike Juliett', 'Connecticut', 'Alabama'),
(3, 'Foxtrot Golf Romeo', 'Nevada', 'North Carolina'),
(4, 'Tango Echo', 'District of Columbia', 'Florida'),
(5, 'Quebec Lima Uniform', 'Indiana', 'Minnesota'),
(6, 'Bravo Alfa Delta', 'Alabama', 'Indiana'),
(7, 'Victor Papa Romeo', 'Texas', 'Texas'),
(8, 'India Bravo', 'New York', 'Tennessee'),
(9, 'Romeo Whiskey Juliett', 'Arkansas', 'Washington'),
(10, 'Echo Juliett', 'Florida', 'Oregon');

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `idclient` varchar(100) NOT NULL,
  `points` int(11) DEFAULT '0',
  `credit` double DEFAULT '100000'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`idclient`, `points`, `credit`) VALUES
('UCli-001', 1, 21036.67),
('UCli-002', 2, 18980.7),
('UCli-190', 10, 22339.74),
('UCli-428', 3, 13360.33),
('UCli-798', 4, 15240.76);

-- --------------------------------------------------------

--
-- Table structure for table `guidestouristique`
--

CREATE TABLE `guidestouristique` (
  `idguide` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `resume` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guidestouristique`
--

INSERT INTO `guidestouristique` (`idguide`, `email`, `phone`, `resume`) VALUES
('SGTo-076', 'cpettko0@unc.edu', '717-797-1730', 'https://storify.com'),
('SGTo-168', 'jcaple1@nih.gov', '517-104-4697', 'https://bloglines.com'),
('SGTo-215', 'pweldrick2@photobucket.com', '540-952-9649', 'http://wikipedia.org'),
('SGTo-250', 'djagels3@illinois.edu', '438-106-8130', 'https://shutterfly.com'),
('SGTo-281', 'bblackburne4@epa.gov', '925-107-2631', 'https://yahoo.co.jp'),
('SGTo-296', 'sgennrich5@t-online.de', '379-136-9102', 'https://nymag.com');

-- --------------------------------------------------------

--
-- Table structure for table `hotels`
--

CREATE TABLE `hotels` (
  `idhotel` varchar(100) NOT NULL,
  `stars` int(11) DEFAULT NULL,
  `nbrchambre` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotels`
--

INSERT INTO `hotels` (`idhotel`, `stars`, `nbrchambre`) VALUES
('SHo-034', 6, 439),
('SHo-057', 9, 934),
('SHo-062', 3, 982),
('SHo-075', 7, 331),
('SHo-089', 4, 852),
('SHo-090', 7, 844),
('SHo-153', 2, 180);

-- --------------------------------------------------------

--
-- Table structure for table `manifestations`
--

CREATE TABLE `manifestations` (
  `idmnifest` varchar(100) NOT NULL,
  `nommanifest` varchar(100) DEFAULT NULL,
  `adr` varchar(200) DEFAULT NULL,
  `idville` int(11) NOT NULL,
  `imgmanifest` varchar(100) DEFAULT NULL,
  `heure` varchar(50) DEFAULT NULL,
  `heurefin` varchar(50) DEFAULT NULL,
  `datefin` varchar(50) DEFAULT NULL,
  `nbrjour` int(11) DEFAULT NULL,
  `fees` double DEFAULT NULL,
  `idvoy` varchar(100) NOT NULL,
  `idservic` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `manifestations`
--

INSERT INTO `manifestations` (`idmnifest`, `nommanifest`, `adr`, `idville`, `imgmanifest`, `heure`, `heurefin`, `datefin`, `nbrjour`, `fees`, `idvoy`, `idservic`) VALUES
('man-025', 'Liatris pauciflora Pursh', '53186 Forster Alley', 3, 'http://dummyimage.com/100x100.png/ff4444/ffffff', '14:25', '15:23', '2019-02-13', 57, 3983.38, 'voy-214', 'S-399'),
('man-143', 'Dudleya blochmaniae (Eastw.) Moran ssp. blochmaniae', '54 Pearson Alley', 1, 'http://dummyimage.com/100x100.png/dddddd/000000', '13:10', '22:08', '2019-02-23', 54, 679.19, 'voy-214', 'S-281'),
('man-344', 'Philodendron hederaceum (Jacq.) Schott var. oxycardium (Schott) Croat', '357 Buena Vista Avenue', 4, 'http://dummyimage.com/100x100.png/5fa2dd/ffffff', '21:35', '1:11', '2019-04-10', 43, 4731.84, 'voy-725', 'S-639'),
('man-371', 'Astragalus caricinus (M.E. Jones) Barneby', '961 Becker Way', 2, 'http://dummyimage.com/100x100.png/ff4444/ffffff', '9:16', '6:12', '2019-01-15', 85, 1772.24, 'voy-214', 'S-015'),
('man-431', 'Carya illinoinensis (Wangenh.) K. Koch', '42874 Gulseth Circle', 6, 'http://dummyimage.com/100x100.png/dddddd/000000', '8:14', '15:29', '2019-04-26', 92, 4973.99, 'voy-031', 'S-919'),
('man-893', 'Sorghum propinquum (Kunth) Hitchc.', '61602 Monica Avenue', 5, 'http://dummyimage.com/100x100.png/cc0000/ffffff', '17:27', '11:29', '2019-07-16', 41, 1627.25, 'voy-725', 'S-577');

-- --------------------------------------------------------

--
-- Table structure for table `notifictions`
--

CREATE TABLE `notifictions` (
  `idnoti` int(11) NOT NULL,
  `mess` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `type` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `idcli` varchar(100) NOT NULL,
  `vue` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `offres`
--

CREATE TABLE `offres` (
  `idoffre` varchar(100) NOT NULL,
  `datedep` date DEFAULT NULL,
  `datefin` date DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `reduction` double DEFAULT NULL,
  `idcircuit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `idres` int(11) NOT NULL,
  `prixpay` double DEFAULT NULL,
  `jourdep` date DEFAULT NULL,
  `heuredep` varchar(100) DEFAULT NULL,
  `idvoy` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `idsitetour` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `idmanifest` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `idoffre` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `idcli` varchar(100) DEFAULT NULL,
  `resnom` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`idres`, `prixpay`, `jourdep`, `heuredep`, `idvoy`, `idsitetour`, `idmanifest`, `idoffre`, `idcli`, `resnom`) VALUES
(2, 1400, '1970-01-01', '01:00:00', 'voy-214', NULL, NULL, NULL, 'UCli-428', NULL),
(5, 1400, '1970-01-01', '01:00:00', 'voy-214', NULL, NULL, NULL, 'UCli-428', NULL),
(10, 5000, '2019-10-16', '05:15:20', 'voy-229', NULL, NULL, NULL, 'UCli-190', NULL),
(666, 10000, '2020-02-14', '18:30:00', 'voy-031', NULL, NULL, NULL, 'UCli-190', NULL),
(671, 6874.3, '2019-02-04', '12:41:49', 'voy-031', NULL, NULL, NULL, 'UCli-428', NULL),
(672, 13293.47, '2018-12-26', '06:13:31', 'voy-513', NULL, NULL, NULL, 'UCli-428', NULL),
(677, 679.19, '2019-02-23', '13:10', 'voy-214', NULL, 'man-143', NULL, 'UCli-428', NULL),
(678, 679.19, '2019-02-23', '13:10', 'voy-214', NULL, 'man-143', NULL, 'UCli-428', NULL),
(680, 606.47, NULL, '10:20', 'voy-214', 'sit-681', NULL, NULL, 'UCli-428', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `restaurants`
--

CREATE TABLE `restaurants` (
  `idrestau` varchar(100) NOT NULL,
  `stars` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurants`
--

INSERT INTO `restaurants` (`idrestau`, `stars`) VALUES
('SRe-091', 2),
('SRe-103', 4),
('SRe-142', 6),
('SRe-205', 1),
('SRe-345', 9);

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE `services` (
  `idservice` varchar(100) NOT NULL,
  `nomservice` varchar(100) DEFAULT NULL,
  `address` varchar(250) DEFAULT NULL,
  `ville` int(11) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `prix` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`idservice`, `nomservice`, `address`, `ville`, `image`, `prix`) VALUES
('SCa-002', 'Bamity', '68 Anzinger Place', 3, 'http://dummyimage.com/194x109.png/5fa2dd/ffffff', 5069.84),
('SCa-066', 'Pannier', '373 Rutledge Lane', 5, 'http://dummyimage.com/247x160.png/5fa2dd/ffffff', 3678.44),
('SCa-105', 'Regrant', '4 Coleman Point', 4, 'http://dummyimage.com/237x144.jpg/cc0000/ffffff', 5892.62),
('SCa-107', 'Flowdesk', '09602 Schiller Crossing', 17, 'http://dummyimage.com/180x226.bmp/dddddd/000000', 2117.35),
('SCa-219', 'Fix San', '9832 Mallory Circle', 18, 'http://dummyimage.com/227x241.jpg/ff4444/ffffff', 9725.07),
('SGTo-076', 'Span', '137 John Wall Park', 10, 'http://dummyimage.com/200x128.png/cc0000/ffffff', 4904.6),
('SGTo-168', 'Subin', '8 Tomscot Road', 5, 'http://dummyimage.com/217x157.jpg/ff4444/ffffff', 7562.85),
('SGTo-215', 'Regrant', '4789 Crowley Point', 11, 'http://dummyimage.com/240x220.png/5fa2dd/ffffff', 2943.11),
('SGTo-250', 'Bytecard', '71742 David Alley', 4, 'http://dummyimage.com/106x110.jpg/cc0000/ffffff', 4345.19),
('SGTo-281', 'Ventosanzap', '5860 Clove Alley', 18, 'http://dummyimage.com/105x240.bmp/ff4444/ffffff', 8022.88),
('SGTo-296', 'Alpha', '4909 Doe Crossing Drive', 16, 'http://dummyimage.com/123x113.jpg/ff4444/ffffff', 8903.6),
('SHo-034', 'Y-Solowarm', '73 Everett Drive', 13, 'http://dummyimage.com/136x139.jpg/cc0000/ffffff', 1789.09),
('SHo-057', 'Otcom', '4716 Bluejay Pass', 17, 'http://dummyimage.com/113x146.png/ff4444/ffffff', 3054.36),
('SHo-062', 'Duobam', '816 Myrtle Park', 2, 'http://dummyimage.com/241x238.bmp/5fa2dd/ffffff', 8655.38),
('SHo-075', 'Zaam-Dox', '8 Bultman Circle', 12, 'http://dummyimage.com/243x230.png/5fa2dd/ffffff', 7085.02),
('SHo-089', 'Cardify', '522 Aberg Park', 3, 'http://dummyimage.com/210x155.jpg/ff4444/ffffff', 3713.29),
('SHo-090', 'Hatity', '3946 Southridge Road', 18, 'http://dummyimage.com/125x216.png/5fa2dd/ffffff', 9563.1),
('SHo-153', 'Biodex', '1 Mockingbird Street', 6, 'http://dummyimage.com/128x171.jpg/ff4444/ffffff', 5285.76),
('SRe-091', 'Y-Solowarm', '9491 Meadow Valley Pass', 8, 'http://dummyimage.com/169x205.png/ff4444/ffffff', 6351.52),
('SRe-103', 'Namfix', '5837 Scoville Terrace', 7, 'http://dummyimage.com/199x176.png/cc0000/ffffff', 7937.56),
('SRe-142', 'Bamity', '58 Dwight Avenue', 6, 'http://dummyimage.com/211x247.bmp/cc0000/ffffff', 2063.41),
('SRe-205', 'Zoolab', '0 Grasskamp Hill', 17, 'http://dummyimage.com/232x144.bmp/cc0000/ffffff', 7573.5),
('SRe-345', 'It', '495 Holmberg Road', 13, 'http://dummyimage.com/164x155.jpg/dddddd/000000', 3760.59),
('SRe-357', 'Bitwolf', '58 David Trail', 1, 'http://dummyimage.com/186x249.jpg/5fa2dd/ffffff', 3272.14),
('STr-089', 'Lotstring', '49 Golf View Alley', 13, 'http://dummyimage.com/167x115.jpg/cc0000/ffffff', 1054.21),
('STr-148', 'Tresom', '5 Sutteridge Parkway', 5, 'http://dummyimage.com/104x134.bmp/dddddd/000000', 1022.49),
('STr-196', 'Sonsing', '58370 Lukken Court', 4, 'http://dummyimage.com/229x221.bmp/5fa2dd/ffffff', 4978.63),
('STr-207', 'Keylex', '86090 Hintze Road', 10, 'http://dummyimage.com/123x238.jpg/dddddd/000000', 4152.2),
('STr-282', 'Stronghold', '8 Oakridge Drive', 11, 'http://dummyimage.com/237x153.png/dddddd/000000', 7777.56),
('STr-309', 'Fintone', '03542 Commercial Court', 1, 'http://dummyimage.com/181x247.bmp/ff4444/ffffff', 6805.13);

-- --------------------------------------------------------

--
-- Table structure for table `sitetouristiques`
--

CREATE TABLE `sitetouristiques` (
  `idsitetour` varchar(100) NOT NULL,
  `nomsitetour` varchar(100) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `heuredep` varchar(50) DEFAULT NULL,
  `heurefin` varchar(50) DEFAULT NULL,
  `prix` double DEFAULT NULL,
  `idville` int(11) DEFAULT NULL,
  `idvoy` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sitetouristiques`
--

INSERT INTO `sitetouristiques` (`idsitetour`, `nomsitetour`, `address`, `heuredep`, `heurefin`, `prix`, `idville`, `idvoy`) VALUES
('sit-333', 'Buffalo', '8 Amoth Park', '10:20', '23:06', 204.65, 2, 'voy-214'),
('sit-681', 'Boa', '8 Waywood Lane', '10:20', '20:30', 606.47, 1, 'voy-214');

-- --------------------------------------------------------

--
-- Table structure for table `transport`
--

CREATE TABLE `transport` (
  `idtransport` varchar(100) NOT NULL,
  `nbrplaces` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transport`
--

INSERT INTO `transport` (`idtransport`, `nbrplaces`) VALUES
('STr-089', 34),
('STr-148', 67),
('STr-196', 51),
('STr-207', 1),
('STr-282', 18);

-- --------------------------------------------------------

--
-- Table structure for table `utilisateurs`
--

CREATE TABLE `utilisateurs` (
  `iduser` varchar(100) NOT NULL,
  `nom` varchar(50) DEFAULT 'Mr Orange',
  `prenom` varchar(50) DEFAULT 'Juice',
  `birthdate` varchar(25) DEFAULT '1997-06-19',
  `sexe` varchar(20) DEFAULT 'no homo',
  `address` varchar(100) DEFAULT 'Stop Stalking Creep',
  `image` varchar(100) DEFAULT 'Say Cheese',
  `motpass` varchar(100) DEFAULT 'password',
  `email` varchar(100) DEFAULT 'mrorangejuice@fruits.com',
  `phone` varchar(50) DEFAULT 'Call 911',
  `idville` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `utilisateurs`
--

INSERT INTO `utilisateurs` (`iduser`, `nom`, `prenom`, `birthdate`, `sexe`, `address`, `image`, `motpass`, `email`, `phone`, `idville`) VALUES
('UAd-1', 'Aí', 'Kollach', '2018-12-19', 'Female', '470 Surrey Road', 'https://robohash.org/undeetassumenda.png?size=50x50&set=set1', 'vOqbcWSQUc', 'bkollach9@chronoengine.com', '897-803-1875', 10),
('UAd-3', 'Frédérique', 'Spradbrow', '2018-08-16', 'Female', '34 Walton Place', 'https://robohash.org/cumqueistenecessitatibus.png?size=50x50&set=set1', 'uqwJe0iN', 'cspradbrow1@ask.com', '320-450-3948', 2),
('UAg-11', 'Cécile', 'Lobley', '2019-01-14', 'Male', '7007 Granby Place', 'https://robohash.org/ipsaesseoptio.png?size=50x50&set=set1', 'XKuyaQCV6B7I', 'rlobley8@cloudflare.com', '618-907-8566', 9),
('UAg-13', 'Naëlle', 'McAllaster', '2018-09-05', 'Male', '74 Badeau Road', 'https://robohash.org/enimoptiotempora.png?size=50x50&set=set1', 'CAEUAB', 'cmcallaster6@java.com', '837-997-4310', 7),
('UAg-28', 'Danièle', 'Comberbach', '2019-04-19', 'Male', '96 Monica Terrace', 'https://robohash.org/quasinonsint.png?size=50x50&set=set1', '6OLLTRU', 'rcomberbach4@goo.ne.jp', '866-351-5840', 5),
('UCli-001', '\'Louai\'', '\'Chouchan\'', '\'1997-06-19\'', '\'Male\'', '\'Mila\'', 'Say Cheese', '\'123123\'', '\'louai@gmail.com\'', '\'0657697916\'', 43),
('UCli-002', '\'Adolf\'', '\'Hitler\'', '\'1889-04-20\'', '\'Male\'', '\'Austria\'', 'Sieg Heil', '\'123123\'', '\'hitler@gmail.com\'', '\'0657697916\'', 43),
('UCli-062', 'Magdalène', 'Coleson', '2018-09-10', 'Male', '56 Mendota Point', 'https://robohash.org/erroreteligendi.png?size=50x50&set=set1', 'r4THsS', 'kcolesoni@earthlink.net', '835-716-5997', 19),
('UCli-1892', 'Boukri', 'Ichrak', '1887-08-08', '0', 'Batna', 'Hehe Nice try', 'Haha', 'ichrak@sheeps.com', 'bananaPhone', 19),
('UCli-190', 'Agnès', 'Beagan', '2019-06-14', 'Male', '09477 John Wall Drive', 'https://robohash.org/arerumquas.png', 'G8YCmSPzg2Im', 'abeaganj@google.ca', '316-962-3634', 20),
('UCli-419', 'Maëly', 'Uvedale', '2018-09-20', 'Female', '50 Rieder Lane', 'https://robohash.org/inciduntquisarchitecto.png', 'Xs6VHf', 'duvedalec@dailymail.co.uk', '111-807-9537', 13),
('UCli-428', 'Régine', 'Handke', '2018-09-24', 'Male', '98 Sheridan Place', 'https://robohash.org/reiciendisquaset.png', 'xV9op1NLf2oD', 'dhandkea@shareasale.com', '564-266-7111', 11),
('UCli-478', 'Cunégonde', 'Rizzolo', '2019-03-11', 'Male', '47 Erie Crossing', 'https://robohash.org/eaquedeseruntdolorem.png?size=50x50&set=set1', '1viODG4tM8', 'arizzoloh@washington.edu', '115-565-2257', 18),
('UCli-561', 'Mélina', 'Mariyushkin', '2018-12-28', 'Female', '0 Harbort Point', 'https://robohash.org/nihilquodolorem.png?size=50x50&set=set1', 'zw2i9iAbW', 'zmariyushkin3@pen.io', '691-474-2083', 4),
('UCli-5913', 'Louai', 'Chouchane', '1997-02-19', 'Male', 'Fuck off, okay ?', 'Hehe Nice try', 'password', 'vide', '0799959010', 13),
('UCli-693', 'Magdalène', 'Lemme', '2019-04-14', 'Male', '896 Delaware Avenue', 'https://robohash.org/doloruminaccusamus.png?size=50x50&set=set1', 'pN5ILbWkPj', 'klemmef@goodreads.com', '916-884-1564', 16),
('UCli-782', 'Garçon', 'De La Salle', '2019-02-23', 'Female', '3 Del Mar Lane', 'https://robohash.org/voluptatibusplaceatamet.png?size=50x50&set=set1', '6zI3I7bb', 'mdelasalle7@nhs.uk', '524-923-4978', 8),
('UCli-794', 'Måns', 'Artindale', '2019-06-02', 'Female', '99634 Westport Lane', 'https://robohash.org/debitisculpanatus.png?size=50x50&set=set1', 'KCm9bk', 'aartindale2@netvibes.com', '951-307-5470', 3),
('UCli-798', 'Léone', 'Stoodley', '2019-06-04', 'Male', '43817 Fremont Lane', 'https://robohash.org/aliquamporroipsa.png?size=50x50&set=set1', 'HNsYf8mRsk', 'kstoodley5@slideshare.net', '495-492-7677', 6),
('UCli-866', 'Gaëlle', 'Maiden', '2018-08-10', 'Male', '1787 Muir Junction', 'https://robohash.org/eautlaboriosam.png?size=50x50&set=set1', '283DnI', 'dmaidenb@yelp.com', '203-562-9042', 12),
('UCli-907', 'Hélèna', 'Bachnic', '2018-10-24', 'Female', '4 Lien Circle', 'https://robohash.org/estexconsequuntur.png?size=50x50&set=set1', 'xvuururSR', 'hbachnic0@blogspot.com', '134-898-4325', 1),
('UCli-991', 'Inès', 'Abrehart', '2018-10-12', 'Female', '998 Rusk Drive', 'https://robohash.org/officiacumqui.png?size=50x50&set=set1', '2IUxP5yRC', 'sabrehartg@yahoo.com', '798-264-8279', 17);

-- --------------------------------------------------------

--
-- Table structure for table `villes`
--

CREATE TABLE `villes` (
  `idville` int(11) NOT NULL,
  `nomville` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `villes`
--

INSERT INTO `villes` (`idville`, `nomville`) VALUES
(1, 'Quxi'),
(2, 'Lenningen'),
(3, 'Meixi'),
(4, 'Caspisapa'),
(5, 'Sanhe'),
(6, 'Akriní'),
(7, 'Kolambugan'),
(8, 'Zhaowu'),
(9, 'Gora'),
(10, 'Mufulira'),
(11, 'Prudentópolis'),
(12, 'Hebei'),
(13, 'Gusong'),
(16, 'Xiaoxiang'),
(17, 'Manhumirim'),
(18, 'Tortosendo'),
(19, 'Argostólion'),
(20, 'Wawa'),
(43, 'Mila');

-- --------------------------------------------------------

--
-- Table structure for table `voyages`
--

CREATE TABLE `voyages` (
  `idvoyage` varchar(100) NOT NULL,
  `nomvoyage` varchar(100) DEFAULT NULL,
  `nbrplaces` int(11) DEFAULT NULL,
  `prix` double DEFAULT NULL,
  `heuredep` time DEFAULT NULL,
  `datedep` date DEFAULT NULL,
  `nbrjours` int(11) DEFAULT NULL,
  `idcircuit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `voyages`
--

INSERT INTO `voyages` (`idvoyage`, `nomvoyage`, `nbrplaces`, `prix`, `heuredep`, `datedep`, `nbrjours`, `idcircuit`) VALUES
('voy-031', 'Canis aureus', 51, 6874.3, '12:41:49', '2019-02-04', 71, 7),
('voy-074', 'Castor canadensis', 68, 13857.05, '17:21:09', '2019-07-06', 19, 3),
('voy-144', 'Cercatetus concinnus', 56, 19140.72, '19:45:04', '2019-05-30', 88, 1),
('voy-214', 'Perameles nasuta', 51, 2860.09, '15:20:48', '2019-06-01', 27, 4),
('voy-229', 'Bettongia penicillata', 66, 12017.88, '16:17:19', '2018-12-18', 76, 2),
('voy-373', 'Tachybaptus ruficollis', 57, 8260.23, '13:43:38', '2019-04-06', 94, 8),
('voy-476', 'Tragelaphus strepsiceros', 27, 19068.1, '07:55:34', '2019-06-04', 73, 6),
('voy-513', 'Plegadis falcinellus', 93, 13293.47, '06:13:31', '2018-12-26', 45, 5),
('voy-725', 'Aonyx capensis', 56, 12613.07, '20:48:14', '2019-03-06', 1, 10),
('voy-978', 'Suricata suricatta', 65, 5632.17, '18:00:06', '2019-08-01', 44, 9);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`idadmin`);

--
-- Indexes for table `agents`
--
ALTER TABLE `agents`
  ADD PRIMARY KEY (`idagent`);

--
-- Indexes for table `campingsites`
--
ALTER TABLE `campingsites`
  ADD PRIMARY KEY (`idcamping`);

--
-- Indexes for table `circuits`
--
ALTER TABLE `circuits`
  ADD PRIMARY KEY (`idcircuit`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`idclient`);

--
-- Indexes for table `guidestouristique`
--
ALTER TABLE `guidestouristique`
  ADD PRIMARY KEY (`idguide`);

--
-- Indexes for table `hotels`
--
ALTER TABLE `hotels`
  ADD PRIMARY KEY (`idhotel`);

--
-- Indexes for table `manifestations`
--
ALTER TABLE `manifestations`
  ADD PRIMARY KEY (`idmnifest`),
  ADD KEY `manifestations_FK` (`idville`),
  ADD KEY `manifestations_FK_1` (`idvoy`);

--
-- Indexes for table `notifictions`
--
ALTER TABLE `notifictions`
  ADD PRIMARY KEY (`idnoti`),
  ADD KEY `notifictions_FK` (`idcli`);

--
-- Indexes for table `offres`
--
ALTER TABLE `offres`
  ADD PRIMARY KEY (`idoffre`),
  ADD KEY `offres_FK` (`idcircuit`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`idres`),
  ADD KEY `reservation_FK_1` (`idoffre`),
  ADD KEY `reservation_FK_2` (`idmanifest`),
  ADD KEY `reservation_FK_3` (`idsitetour`),
  ADD KEY `reservation_FK_4` (`idvoy`),
  ADD KEY `reservation_FK` (`idcli`);

--
-- Indexes for table `restaurants`
--
ALTER TABLE `restaurants`
  ADD PRIMARY KEY (`idrestau`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`idservice`),
  ADD KEY `services_FK` (`ville`);

--
-- Indexes for table `sitetouristiques`
--
ALTER TABLE `sitetouristiques`
  ADD PRIMARY KEY (`idsitetour`),
  ADD KEY `sitetouristiques_FK` (`idville`),
  ADD KEY `sitetouristiques_FK_1` (`idvoy`);

--
-- Indexes for table `transport`
--
ALTER TABLE `transport`
  ADD PRIMARY KEY (`idtransport`);

--
-- Indexes for table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  ADD PRIMARY KEY (`iduser`),
  ADD KEY `utilisateurs_FK` (`idville`);

--
-- Indexes for table `villes`
--
ALTER TABLE `villes`
  ADD PRIMARY KEY (`idville`);

--
-- Indexes for table `voyages`
--
ALTER TABLE `voyages`
  ADD PRIMARY KEY (`idvoyage`),
  ADD KEY `voyages_FK` (`idcircuit`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `notifictions`
--
ALTER TABLE `notifictions`
  MODIFY `idnoti` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `idres` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=681;
--
-- AUTO_INCREMENT for table `villes`
--
ALTER TABLE `villes`
  MODIFY `idville` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `admins`
--
ALTER TABLE `admins`
  ADD CONSTRAINT `admins_FK` FOREIGN KEY (`idadmin`) REFERENCES `utilisateurs` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `agents`
--
ALTER TABLE `agents`
  ADD CONSTRAINT `agents_FK` FOREIGN KEY (`idagent`) REFERENCES `utilisateurs` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `campingsites`
--
ALTER TABLE `campingsites`
  ADD CONSTRAINT `campingsites_FK` FOREIGN KEY (`idcamping`) REFERENCES `services` (`idservice`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `clients`
--
ALTER TABLE `clients`
  ADD CONSTRAINT `clients_FK` FOREIGN KEY (`idclient`) REFERENCES `utilisateurs` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `guidestouristique`
--
ALTER TABLE `guidestouristique`
  ADD CONSTRAINT `guidestouristique_FK` FOREIGN KEY (`idguide`) REFERENCES `services` (`idservice`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hotels`
--
ALTER TABLE `hotels`
  ADD CONSTRAINT `hotels_FK` FOREIGN KEY (`idhotel`) REFERENCES `services` (`idservice`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `manifestations`
--
ALTER TABLE `manifestations`
  ADD CONSTRAINT `manifestations_FK` FOREIGN KEY (`idville`) REFERENCES `villes` (`idville`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `manifestations_FK_1` FOREIGN KEY (`idvoy`) REFERENCES `voyages` (`idvoyage`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `offres`
--
ALTER TABLE `offres`
  ADD CONSTRAINT `offres_FK` FOREIGN KEY (`idcircuit`) REFERENCES `circuits` (`idcircuit`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_FK` FOREIGN KEY (`idcli`) REFERENCES `clients` (`idclient`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `reservation_FK_2` FOREIGN KEY (`idmanifest`) REFERENCES `manifestations` (`idmnifest`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservation_FK_3` FOREIGN KEY (`idsitetour`) REFERENCES `sitetouristiques` (`idsitetour`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservation_FK_4` FOREIGN KEY (`idvoy`) REFERENCES `voyages` (`idvoyage`);

--
-- Constraints for table `restaurants`
--
ALTER TABLE `restaurants`
  ADD CONSTRAINT `restaurants_FK` FOREIGN KEY (`idrestau`) REFERENCES `services` (`idservice`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `services`
--
ALTER TABLE `services`
  ADD CONSTRAINT `services_FK` FOREIGN KEY (`ville`) REFERENCES `villes` (`idville`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sitetouristiques`
--
ALTER TABLE `sitetouristiques`
  ADD CONSTRAINT `sitetouristiques_FK` FOREIGN KEY (`idville`) REFERENCES `villes` (`idville`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sitetouristiques_FK_1` FOREIGN KEY (`idvoy`) REFERENCES `voyages` (`idvoyage`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transport`
--
ALTER TABLE `transport`
  ADD CONSTRAINT `transport_FK` FOREIGN KEY (`idtransport`) REFERENCES `services` (`idservice`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  ADD CONSTRAINT `utilisateurs_FK` FOREIGN KEY (`idville`) REFERENCES `villes` (`idville`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `voyages`
--
ALTER TABLE `voyages`
  ADD CONSTRAINT `voyages_FK` FOREIGN KEY (`idcircuit`) REFERENCES `circuits` (`idcircuit`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
