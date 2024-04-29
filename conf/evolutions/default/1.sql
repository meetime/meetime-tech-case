# --- !Ups

CREATE TABLE users (
    id bigserial not null,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    constraint users_pk primary key (id),
    constraint users_uq_email unique (email)
);

CREATE TABLE companies (
    id bigserial not null,
    name VARCHAR(100) NOT NULL,
    cnpj VARCHAR(10) NOT NULL,
    address VARCHAR(100) NOT NULL,
    phone VARCHAR(6) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    constraint companies_pk primary key (id)
);

# --- !Downs

DROP TABLE users;
DROP TABLE companies;
