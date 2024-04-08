create table if not exists integration_to_deployment(
pipeline_id integer not null,
build_template varchar(255) null,
sonar_steps_added char null,
coverage_measure integer null,
nexus_build varchar(255) null,
was_scan varchar(255) null,
nexus_issues integer null,
sonar_issues integer null,
security_summary varchar(255) null,
findbugs_issues integer null,
gitleaks_report varchar(255) null,
remarks varchar(255) null,
constraint integration_to_deployment_pk primary key(pipeline_id));