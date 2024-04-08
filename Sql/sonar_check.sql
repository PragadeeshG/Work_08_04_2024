create table if not exists sonar_check(
sonar_qube varchar(255) not null,
code_quality varchar(255) null,
languages varchar(255) null,
platforms varchar(255) null,
dev_ops_integration varchar(255) null,
quality_gate varchar(255) null,
high_operabliity varchar(255) null,
fast_analysis Integer null,
rules varchar(255) null,
ide_integration varchar(255) null,
shared_config varchar(255) null,
constraint sonar_check_pk primary key(sonar_qube));