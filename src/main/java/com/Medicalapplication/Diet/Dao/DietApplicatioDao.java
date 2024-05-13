package com.Medicalapplication.Diet.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Medicalapplication.Diet.Entity.DietRecipeEntity;

@Repository
public interface DietApplicatioDao extends JpaRepository<DietRecipeEntity, Long> {

}
