CREATE TABLE Note (
    id SERIAL PRIMARY_KEY,
    title VARCHAR(100),
    content VARCHAR(200),
    createdAt DATETIME,
    author INT,
    status VARCHAR(45)
)

CREATE TABLE Users (
    id SERIAL PRIMARY_KEY,
    name VARCHAR(45),
    email VARCHAR(45),
    password VARCHAR(100),
    createdAt DATETIME,
    birthDay DATE
)



