package com.example.studentattendensapp

object DataManager {
  val students = mutableListOf<Student>()

  init {
     createMockData()
  }

  fun createMockData() {
    students.add(Student("David", "AU22", true))
    students.add(Student("Lois", "AU22"))
    students.add(Student("Laura", "AU22"))
    students.add(Student("Susan", "AU22"))
    students.add(Student("Jacob", "AU22"))
    students.add(Student("Per", "AU22"))
  }
}