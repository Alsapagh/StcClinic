package com.stc.clinic.repositories;

import com.stc.clinic.entities.AppointmentEntity;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/

@Repository
public interface AppointmentRepo extends JpaRepository<AppointmentEntity, Long> {
    @Query("select e from AppointmentEntity e where e.date = sysdate ")
    Page<AppointmentEntity> findbyTodayAppointment(Pageable page);
}
