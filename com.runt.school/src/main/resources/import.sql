insert into school (school_name) values ('El Colegio del Olimpo');
insert into course(id_school, degree, classroom) values (1,10,'A');
insert into course(id_school, degree, classroom) values (1,10,'B');
insert into course(id_school, degree, classroom) values (1,11,'A');
insert into course(id_school, degree, classroom) values (1,11,'B');
insert into professor(professor_name) values ('Némesis');
insert into professor(professor_name) values ('Príapo');
insert into professor(professor_name) values ('Iris');
insert into student (student_name) values ('Afrodita');
insert into student (student_name) values ('Apolo');
insert into student (student_name) values ('Ares');
insert into student (student_name) values ('Artemisa');
insert into student (student_name) values ('Atenea');
insert into student (student_name) values ('Dionisio');
insert into student (student_name) values ('Hefesto');
insert into student (student_name) values ('Hera');
insert into student (student_name) values ('Hermes');
insert into student (student_name) values ('Hades');
insert into student (student_name) values ('Poseidon');
insert into student (student_name) values ('Zeus');
insert into subject (name_subject, id_course, id_professor) values ('Matemáticas',1,1);
insert into subject (name_subject, id_course, id_professor) values ('Matemáticas',2,1);
insert into subject (name_subject, id_course, id_professor) values ('Matemáticas',3,1);
insert into subject (name_subject, id_course, id_professor) values ('Matemáticas',4,1);
insert into subject (name_subject, id_course, id_professor) values ('Pre Icfes',3,1);
insert into subject (name_subject, id_course, id_professor) values ('Pre Icfes',4,1);
insert into subject (name_subject, id_course, id_professor) values ('Español',1,2);
insert into subject (name_subject, id_course, id_professor) values ('Español',2,2);
insert into subject (name_subject, id_course, id_professor) values ('Ingles Básico',1,3);
insert into subject (name_subject, id_course, id_professor) values ('Ingles Avanzado',2,3);
insert into subject_student (id_student, id_subject) values (1,7);
insert into subject_student (id_student, id_subject) values (2,7);
insert into subject_student (id_student, id_subject) values (3,7);
insert into subject_student (id_student, id_subject) values (1,1);
insert into subject_student (id_student, id_subject) values (2,1);
insert into subject_student (id_student, id_subject) values (3,1);
insert into subject_student (id_student, id_subject) values (1,9);
insert into subject_student (id_student, id_subject) values (2,9);
insert into subject_student (id_student, id_subject) values (3,9);
insert into subject_student (id_student, id_subject) values (4,2);
insert into subject_student (id_student, id_subject) values (4,8);
insert into subject_student (id_student, id_subject) values (4,10);
insert into subject_student (id_student, id_subject) values (5,2);
insert into subject_student (id_student, id_subject) values (5,8);
insert into subject_student (id_student, id_subject) values (5,10);
insert into subject_student (id_student, id_subject) values (6,2);
insert into subject_student (id_student, id_subject) values (6,8);
insert into subject_student (id_student, id_subject) values (6,10);
insert into subject_student (id_student, id_subject) values (7,3);
insert into subject_student (id_student, id_subject) values (7,5);
insert into subject_student (id_student, id_subject) values (8,3);
insert into subject_student (id_student, id_subject) values (8,5);
insert into subject_student (id_student, id_subject) values (9,4);
insert into subject_student (id_student, id_subject) values (9,6);
insert into subject_student (id_student, id_subject) values (10,4);
insert into subject_student (id_student, id_subject) values (10,6);
insert into subject_student (id_student, id_subject) values (11,4);
insert into subject_student (id_student, id_subject) values (11,6);
insert into subject_student (id_student, id_subject) values (12,4);
insert into subject_student (id_student, id_subject) values (12,6);