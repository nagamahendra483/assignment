DROP TABLE IF EXISTS survey_details;
create table survey_details(
    id int auto_increment primary key,
    user_name varchar(100) not null,
    email varchar(100) not null,
    telephone_number varchar(10) not null,
    street varchar(100),
    city varchar(100),
    state varchar(100),
    zip varchar(10),
    url varchar(100),
    date_of_survey timestamp,
    campus_options varchar(100),
    interested_in_university varchar(20),
    high_school_grad_month varchar(100),
    high_school_grad_year varchar(100),
    comments varchar(500),
    recommending_option varchar(15)
);