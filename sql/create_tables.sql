CREATE TABLE users (
	id int(10) unsigned NOT NULL AUTO_INCREMENT,
	email varchar(255) COLLATE utf8_unicode_ci NOT NULL,
	password varchar(255) COLLATE utf8_unicode_ci NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE data_master (
	master_id int(10) unsigned NOT NULL AUTO_INCREMENT,
	id int(10) unsigned NOT NULL,
	time_entered DATETIME,
	time DATETIME,
	datatype int(2) NOT NULL,
	PRIMARY KEY(master_id)
	FOREIGN KEY(id) REFERENCES users(id)
);

CREATE TABLE BG (
	data_id int(10) unsigned NOT NULL,
	time_entered DATETIME NOT NULL,
	value float(8,2) NOT NULL,
	note varchar(255) COLLATE utf8_unicode_ci,
	PRIMARY KEY(data_id),
	FOREIGN KEY(data_id) REFERENCES data_master(master_id)
);

CREATE TABLE insulin (
	data_id int(10) unsigned NOT NULL,
	time_entered DATETIME NOT NULL,
	carbDose float(8,2),
	correctionDose float(8,2),
	hourlyBasalDose float(8,2),
	type varchar(255) NOT NULL,
	note varchar(255),
	PRIMARY KEY(data_id)
	FOREIGN KEY(data_id) REFERENCES data_master(master_id)
);
