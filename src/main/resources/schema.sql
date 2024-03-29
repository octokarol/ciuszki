create table item_manufacturer
(
    id     integer auto_increment primary key,
    name   varchar(30),
    origin varchar(30)
);

create table sizing_type
(
    id      integer auto_increment primary key,
    size    varchar(30)
);

create table sizing_type_shoe
(
    id      integer auto_increment primary key,
    size_us float,
    size_uk float,
    size_eu float,
    size_cm float,
    size_br float,
    size_jp float
);

create table item_model
(
    id              integer auto_increment primary key,
    name            varchar(30),
    is_shoe         bit
);


create table user
(
    id       integer auto_increment primary key,
    username varchar(30)  not null,
    email    varchar(30)  not null,
    password varchar(255) not null
);

create table offer
(
    id            integer auto_increment primary key,
    title         varchar(255),
    date          date,
    year          integer,
    condition     varchar(30),
    description   text,
    price         integer,
    retail_price    integer,
    colour          varchar(30),
    cut             varchar(30),
    gender          varchar(30),
    manufacturer_id integer,
    sizing_id       integer,
    shoe_sizing_id  integer,
    item_model_id integer,
    user_id       integer,

    foreign key (item_model_id) references item_model (id),
    foreign key (manufacturer_id) references item_manufacturer (id),
    foreign key (shoe_sizing_id) references sizing_type_shoe (id),
    foreign key (sizing_id) references sizing_type (id)

);
