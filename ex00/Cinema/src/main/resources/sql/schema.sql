CREATE TABLE IF NOT EXISTS films(
    id IDENTITY NOT NULL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    release_date VARCHAR(255) NOT NULL,
    age_restrictions VARCHAR(255) NOT NULL,
    description CLOB NOT NULL
);
