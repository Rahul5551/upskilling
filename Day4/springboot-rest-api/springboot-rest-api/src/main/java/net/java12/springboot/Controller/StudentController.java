package net.java12.springboot.Controller;

import net.java12.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
  @GetMapping("student")
  public Student getStudent(){
    Student student = new Student( 1,"Rahul", "Nukatoti");
    return  student;
  }
  @GetMapping ("students")
  public List<Student> getStudents(){
    List<Student> students = new ArrayList<>();
    students.add(new Student(1,"Rahul","Nukatoti"));
    students.add(new Student(2,"Nani","Navi"));
    students.add(new Student(3,"Sampath","sam"));
    students.add(new Student(4,"Ram","Yawar"));
    return students;

  }
  @GetMapping("student/{id}")
public Student studentPathVariable(@PathVariable("id")int studentId){
    return new Student(studentId,"Rahul","Nukatoti");

}
// Spring boot REST API that handles HTTP POST Request - creating new resource
// @PostMapping and @RequestBody
  @PostMapping("create")
  //@ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<Student> createStudent(@RequestBody Student student){
    System.out.println(student.getId());
    System.out.println(student.getFirstName());
    System.out.println(student.getLastName());
    return new ResponseEntity<>(student, HttpStatus.CREATED);
  }
  // Spring boot REST API that handles HTTP PUT Request - updating existing resource
  @PutMapping("{id}/update")
  public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId){
    System.out.println(student.getFirstName());
    System.out.println(student.getLastName());
    return ResponseEntity.ok(student);
  }
  // Spring boot REST API that handles HTTP DELETE Request - deleting the existing resource
  @DeleteMapping("{id}/delete")
  public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
    System.out.println(studentId);
    return ResponseEntity.ok("Student deleted successfully!");
  }




}
