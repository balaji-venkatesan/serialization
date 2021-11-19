package com.balajiv.serialization.util;

import java.util.List;
import java.util.Random;

import com.balajiv.serialization.dto.Administrator;
import com.balajiv.serialization.dto.College;
import com.balajiv.serialization.dto.Department;
import com.balajiv.serialization.dto.Gender;
import com.balajiv.serialization.dto.Student;
import com.balajiv.serialization.dto.Subject;
import com.balajiv.serialization.dto.Teacher;

import org.apache.commons.lang3.RandomStringUtils;

public class CollegeHelper {

        public static College create() {
                College college = new College();
                college.setAddress(null);
                college.setId(new Random().nextLong());
                college.setMobile(new Random().nextLong());
                college.setName(RandomStringUtils.randomAscii(32));
                college.setStudents(createStudents());
                college.setTeachers(createTeachers());
                college.setAdministrators(createAdministrators());

                return college;
        }

        private static List<Administrator> createAdministrators() {
                Administrator administrator1 = new Administrator();
                administrator1.setId(new Random().nextLong());
                administrator1.setGender(Gender.MALE);
                administrator1.setName(RandomStringUtils.randomAscii(32));
                administrator1.setRoleDescription(RandomStringUtils.randomAscii(32));

                Administrator administrator2 = new Administrator();
                administrator2.setId(new Random().nextLong());
                administrator2.setGender(Gender.MALE);
                administrator2.setName(RandomStringUtils.randomAscii(32));
                administrator2.setRoleDescription(RandomStringUtils.randomAscii(32));

                return List.of(administrator1, administrator2);
        }

        private static List<Student> createStudents() {
                Student student1 = new Student();
                student1.setGender(Gender.MALE);
                student1.setId(new Random().nextLong());
                student1.setName(RandomStringUtils.randomAscii(32));
                student1.setDepartment(new Department(new Random().nextLong(), RandomStringUtils.randomAscii(32),
                                RandomStringUtils.randomAscii(32)));

                Student student2 = new Student();
                student2.setGender(Gender.FEMALE);
                student2.setId(new Random().nextLong());
                student2.setName(RandomStringUtils.randomAscii(32));
                student2.setDepartment(new Department(new Random().nextLong(), RandomStringUtils.randomAscii(32),
                                RandomStringUtils.randomAscii(32)));

                return List.of(student1, student2);
        }

        private static List<Teacher> createTeachers() {
                Teacher teacher1 = new Teacher();
                teacher1.setDepartments(List.of(new Department(new Random().nextLong(),
                                RandomStringUtils.randomAscii(32), RandomStringUtils.randomAscii(32))));
                teacher1.setGender(Gender.MALE);
                teacher1.setId(new Random().nextLong());
                teacher1.setName(RandomStringUtils.randomAscii(32));
                teacher1.setRating(4);
                teacher1.setSubjects(List.of(new Subject(new Random().nextLong(), RandomStringUtils.randomAscii(32),
                                RandomStringUtils.randomAscii(32))));

                Teacher teacher2 = new Teacher();
                teacher2.setDepartments(List.of(new Department(new Random().nextLong(),
                                RandomStringUtils.randomAscii(32), RandomStringUtils.randomAscii(32))));
                teacher2.setGender(Gender.MALE);
                teacher2.setId(new Random().nextLong());
                teacher2.setName(RandomStringUtils.randomAscii(32));
                teacher2.setRating(4);
                teacher2.setSubjects(List.of(new Subject(new Random().nextLong(), RandomStringUtils.randomAscii(32),
                                RandomStringUtils.randomAscii(32))));

                return List.of(teacher1, teacher2);
        }

}
