package com.Medicalapplication.Diet.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dietplanner")
public class DietRecipeEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   @Column(name = "breakfast")
   private String breakfast;
   @Column(name = "snacks_fn")
   private String snacksFn;
   @Column(name = "lunch")
   private String lunch;
   @Column(name = "snacks_af")
   private String snacksAf;
   @Column(name = "night")
   private String dinner;
   
   public DietRecipeEntity() {
	   
   }
public DietRecipeEntity(String breakfast, String snacksFn, String lunch, String snacksAf, String dinner) {
	super();
	this.breakfast = breakfast;
	this.snacksFn = snacksFn;
	this.lunch = lunch;
	this.snacksAf = snacksAf;
	this.dinner = dinner;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getBreakfast() {
	return breakfast;
}
public void setBreakfast(String breakfast) {
	this.breakfast = breakfast;
}
public String getSnacksFn() {
	return snacksFn;
}
public void setSnacksFn(String snacksFn) {
	this.snacksFn = snacksFn;
}
public String getLunch() {
	return lunch;
}
public void setLunch(String lunch) {
	this.lunch = lunch;
}
public String getSnacksAf() {
	return snacksAf;
}
public void setSnacksAf(String snacksAf) {
	this.snacksAf = snacksAf;
}
public String getDinner() {
	return dinner;
}
public void setDinner(String dinner) {
	this.dinner = dinner;
}
   
   
   
   
}
