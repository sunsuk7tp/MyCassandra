DROP TABLE user_table;
CREATE TABLE user_table (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	age INTEGER,
	livein INTEGER,
	gender INTEGER,
	logo INTEGER NOT NULL,
	agent TEXT,
	addr TEXT,
	device INTEGER NOT NULL,
	mobileid TEXT,
	timestamp INTEGER NOT NULL
);

CREATE TABLE device (
	id INTEGER PRIMARY KEY,
	name TEXT NOT NULL
);
INSERT INTO device (id,name) VALUES (0,'PC');
INSERT INTO device (id,name) VALUES (1,'mobile');

DROP TABLE logo;
CREATE TABLE logo (
	id INTEGER PRIMARY KEY,
	name TEXT NOT NULL
);
INSERT INTO logo (id,name) VALUES (1,'typeA');
INSERT INTO logo (id,name) VALUES (2,'typeB');
INSERT INTO logo (id,name) VALUES (3,'typeC');

DROP TABLE gender;
CREATE TABLE gender (
	id INTEGER PRIMARY KEY,
	name TEXT NOT NULL
);
INSERT INTO gender (id,name) VALUES (1,'male');
INSERT INTO gender (id,name) VALUES (2,'female');

DROP TABLE livein;
CREATE TABLE livein (
	id INTEGER PRIMARY KEY,
	name TEXT NOT NULL
);
INSERT INTO livein (id,name) VALUES (1,'yokohama');
INSERT INTO livein (id,name) VALUES (2,'others');