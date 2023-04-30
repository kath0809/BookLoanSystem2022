/* Brukes for at sensor skal kunne legge til databasen */

create schema bookDB;


create table audioBook
(
    Id           int auto_increment,
    author       varchar(200) not null,
    language     varchar(200) not null,
    trialPeriode int          null,
    constraint audioBook_pk
        primary key (Id)
);

create table loanRecord
(
    id       int auto_increment,
    user     varchar(200) not null,
    bookType varchar(200) not null,
    bookId   int          not null,
    constraint loanRecord_pk
        primary key (id)
);

alter table loanRecord
    add constraint loanRecord_loanRecord__fk
        foreign key (bookId) references normalBook (`id`);

alter table loanRecord
    add constraint loanRecord_audioBook__fk
        foreign key (bookId) references audioBook (Id);

alter table loanRecord
    add startLoan date not null;

alter table loanRecord
    add endLoan date not null;

alter table loanRecord
    add userid int not null;

alter table loanRecord
    add constraint loanRecord___fk
        foreign key (userid) references user (`id`);