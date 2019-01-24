CREATE USER sflower WITH CREATEDB REPLICATION PASSWORD '123456';
CREATE DATABASE "SmartFlower"  WITH OWNER = sflower  ENCODING = 'UTF8' TABLESPACE = pg_default CONNECTION LIMIT = -1;

create schema SmartFlower;
set search_path to SmartFlower;

CREATE TABLE Users(
  UserID BIGSERIAL NOT NULL PRIMARY KEY,
  Username VARCHAR(255) NOT NULL,
  Password VARCHAR(255) NOT NULL,
  Email VARCHAR(255) NOT NULL,
  FirstName VARCHAR(255) NOT NULL,
  LastName VARCHAR(255) NOT NULL,
  FullName VARCHAR(255),
  Status INTEGER NOT NULL,
  CreatedDate TIMESTAMP NOT NULL,
  ModifiedDate TIMESTAMP,
  UNIQUE(Username),
  UNIQUE(Email)
);