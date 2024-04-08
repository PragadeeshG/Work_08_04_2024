create table if not exists categories(
injection_code integer not null,
broken_authentication varchar(255) null,
sensitive_data_exposure varchar(255) null,
xml_external_entities varchar(255) null,
broken_access_control varchar(255) null,
security_misconfiguration integer null,
cross_site_scripting varchar(255) null,
insecure_code varchar(255) null,
deserialization varchar(255) null,
component_count integer null,
known_vulnerabilities varchar(255) null,
findbugs_count varchar(255) null,
summary varchar(255) null,
constraint categories_pk primary key(injection_code));