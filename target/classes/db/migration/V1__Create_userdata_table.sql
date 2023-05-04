CREATE TABLE userdata (
    email VARCHAR(255) PRIMARY KEY UNIQUE,
    nickname VARCHAR(25) UNIQUE,
    password VARCHAR(25),
    balance INT
);