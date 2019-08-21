create table course_tbl (
	course_id LONG not null primary key,
	groupId LONG,
	course_name VARCHAR(75) null,
	course_description VARCHAR(2000) null,
	course_lecturer VARCHAR(75) null,
	course_duration INTEGER,
	course_status BOOLEAN
);

create table registration_tbl (
	registration_id LONG not null primary key,
	groupId LONG,
	user_id LONG,
	course_id LONG,
	registration_status INTEGER
);