package com.rest.learning.restLearning.mainProject.repository;

import com.rest.learning.restLearning.mainProject.entity.Patient;
import com.rest.learning.restLearning.mainProject.entity.type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
//    Patient findByName(String name);
//    List<Patient> findByBirthDateAndEmail(LocalDate birthDate, String email); //custom method creation by proper naming convention and jpa handles query
//
//    List<Patient> findByBirthDateBetween(LocalDate startDate, LocalDate endDate);
//
//    List<Patient> findByNameContainingOrderByIdDesc(String query);
//
//    @Query("SELECT p from Patient p where p.bloodGroup = ?1") //custom query jpql, we don't use exact table name and column name, we use the entity or table which created in class
//    List<Patient> findByBloodGroup(@Param("bloodGroup") String bloodGroup);
//
//    //another way
////    @Query("SELECT p from Patient p where p.bloodGroup = :bloodGroup") //custom query jpql, we don't use exact table name and column name, we use the entity or table which created in class
////    List<Patient> findByBloodGroup(@Param("bloodGroup") String bloodGroup);
//
//    @Query("select p.bloodGroup, count(P) from Patient p group by p.bloodGroup")
//    List<Object[]> countEachBloodGroupType();
//
//    //native query
//    @Query(value = "Select * from patient", nativeQuery = true)
//    Page<Patient> findAllPatients(Pageable pageable);
//
//
//    //update query
//    @Transactional
//    @Modifying //to tell jpa that this query will update in database
//    @Query("UPDATE Patient p SET p.name = :name where id = :id")
//    int updateNameWithId(@Param("name") String name, @Param("id") Long id);

}
