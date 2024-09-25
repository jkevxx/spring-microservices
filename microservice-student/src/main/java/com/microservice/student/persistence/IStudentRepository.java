package com.microservice.student.persistence;

import com.microservice.student.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {

//    @Query("SELECT * FROM Student s WHERE s.courseId = :idCourse")
//    List<Student> findAllByCourseId(Long idCourse);

    List<Student> findAllByCourseId(Long idCourse);
}
