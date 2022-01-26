package com.example.dependancy.injection;



public class Student {

	  	int id;
		String studentName;

		public Student(int id,String studentName){
			this.id=id;
			this.studentName=studentName;

		}

//		public void setId(int id){
//			this.id =id;
//		}
//		public void setStudentName(String sn){
//			this.studentName = sn;
//		}

		public void displayStudentInfo(){
			System.out.println("Student name is : "+ studentName+
					" and ID is : "+ id);
		}


}
