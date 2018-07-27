package dao;
import java.util.Map;

import student.student;
public interface daoInterface {
void addStudent(student s);
void deleteStudent(int rno);
Map<Integer,student> getAllStudent();
student getStudentByRno(int rno);

}
