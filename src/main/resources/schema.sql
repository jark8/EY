CREATE TABLE USUARIO (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250),
  last_name VARCHAR(250) ,
  email VARCHAR(250),
  created Date,
  modified Date,
  last_login Date,
  token VARCHAR(4000),
  active VARCHAR(250),
  password VARCHAR(250)
);
