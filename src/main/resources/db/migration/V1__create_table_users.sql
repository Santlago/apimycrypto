create table if not exists tb_mycrypto_users (
    id bigint not null auto_increment,
    email varchar(255),
    password varchar(255),
    created_at datetime,
    updated_at datetime,
    primary key (id)
);

create table if not exists tb_mycrypto_scripts (
    id bigint not null auto_increment,
    clicks int,
    screen_time int
);