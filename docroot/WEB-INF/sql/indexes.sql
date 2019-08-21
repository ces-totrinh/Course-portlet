create index IX_55FE28E6 on course_tbl (course_status);

create index IX_FD11B7F1 on registration_tbl (course_id);
create index IX_F1C81F17 on registration_tbl (course_id, registration_status);
create index IX_5948F2B on registration_tbl (course_id, userId);
create index IX_AE367CAE on registration_tbl (course_id, user_id);
create index IX_FD99082A on registration_tbl (registration_status);
create index IX_E13F6338 on registration_tbl (userId);
create index IX_47E62A41 on registration_tbl (user_id);
create index IX_FC6B1ECE on registration_tbl (user_id, course_id);
create index IX_A593EC7 on registration_tbl (user_id, registration_status);