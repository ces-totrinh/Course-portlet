create table course_tbl (
	course_id LONG not null primary key,
	course_name VARCHAR(75) null,
	course_description VARCHAR(2000) null,
	course_lecturer VARCHAR(75) null,
	course_duration INTEGER,
	course_status BOOLEAN
);