DROP TABLE IF EXISTS item CASCADE ;

CREATE TABLE IF NOT EXISTS item (
  id VARCHAR(255) NOT NULL,
  title VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);
