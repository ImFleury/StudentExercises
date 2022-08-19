CREATE TABLE members (
	member_number serial,
	first_name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	email varchar(100) NOT NULL,
	phone_number varchar(15),
	dob date NOT NULL,
	accepting_emails varchar(1) NOT NULL,
	CONSTRAINT pk_members_member_number PRIMARY KEY (member_number),
	CONSTRAINT chk_phone CHECK (phone_number like '%[^0-9]%')
);

CREATE TABLE interest_group (
	group_number serial,
	group_name varchar(100) NOT NULL UNIQUE,
	CONSTRAINT pk_interest_group_group_number PRIMARY KEY (group_number)

);

CREATE TABLE events (
	event_id serial,
	event_name varchar(100) NOT NULL,
	event_description varchar(500) NOT NULL,
	start_date_and_time timestamp NOT NULL,
	duration integer NOT NULL, -- in minutes --
	group_number integer NOT NULL,
	CONSTRAINT pk_event_event_id PRIMARY KEY (event_id),
	CONSTRAINT fk_group_group_number FOREIGN KEY (group_number) REFERENCES interest_group(group_number),
	CONSTRAINT chk_duration CHECK (duration >= 30)
);

CREATE TABLE event_member (
	event_id integer NOT NULL,
	member_number integer NOT NULL,
	CONSTRAINT pk_event_member_event_id_member_number PRIMARY KEY (event_id, member_number),
	CONSTRAINT fk_event_member_event_id FOREIGN KEY (event_id) REFERENCES events(event_id),
	CONSTRAINT fk_event_member_member_number FOREIGN KEY (member_number) REFERENCES members(member_number)
);
	

CREATE TABLE group_member (
	member_number integer NOT NULL,
	group_number integer NOT NULL,
	CONSTRAINT pk_group_member_event_id_member_number PRIMARY KEY (member_number, group_number),
	CONSTRAINT fk_group_member_event_id FOREIGN KEY (group_number) REFERENCES interest_group(group_number),
	CONSTRAINT fk_group_member_member_number FOREIGN KEY (member_number) REFERENCES members(member_number)
);

