/**
 * 
 */
package com.example.demo.students;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Utilisateur
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
