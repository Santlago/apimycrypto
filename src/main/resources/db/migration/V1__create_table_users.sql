create table if not exists tb_mycrypto_users (
    id bigint not null auto_increment,
    email varchar(255),
    password varchar(255),
    created_at datetime,
    updated_at datetime,
    primary key (id)
);

INSERT INTO tb_mycrypto_users (email, password, created_at, updated_at)
VALUES ('alice@example.com', 'hashed_password_1', NOW(), NOW());

INSERT INTO tb_mycrypto_users (email, password, created_at, updated_at)
VALUES ('bob@example.com', 'hashed_password_2', NOW(), NOW());

INSERT INTO tb_mycrypto_users (email, password, created_at, updated_at)
VALUES ('carol@example.com', 'hashed_password_3', NOW(), NOW());

INSERT INTO tb_mycrypto_users (email, password, created_at, updated_at)
VALUES ('dave@example.com', 'hashed_password_4', NOW(), NOW());

INSERT INTO tb_mycrypto_users (email, password, created_at, updated_at)
VALUES ('eve@example.com', 'hashed_password_5', NOW(), NOW());