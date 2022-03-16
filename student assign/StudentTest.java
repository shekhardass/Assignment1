package com.te.assignmnents.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.te.collections.common.CompareByAddress;
import com.te.collections.common.CompareById;
import com.te.collections.common.CompareByName;
import com.te.collections.common.Employee;

public class StudentTest {

	public static void main(String[] args) {
		char temp='s';
		
		System.out.println("press 1 to sort the students by their name");
		System.out.println("press 2 to sort the students by their id");
		System.out.println("press 3 to sort the students by their city");
		System.out.println("press 4 to sort the students by their markes");
		
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("shekhar",01,"kolkata",780));
		arrayList.add(new Student("pritam",02,"pune",786));
		arrayList.add(new Student("bhaskar",06,"ballygunge",880));
		arrayList.add(new Student("gorav",05,"delhi",542));
		arrayList.add(new Student("kajal",04,"punjab",680));
		
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.println("enter the choice  :");
		    int choice=scanner.nextInt();
		    
		    switch(choice) {
		    case 3:
		    
    
		System.out.println("====By city=====");
		Collections.sort(arrayList, new StudentCity());
		for (Student student : arrayList) {
			System.out.println(student);
		}
		break;
		
	  case 1:
		System.out.println("====By Name=====");
		Collections.sort(arrayList, StudentByName());
		for (Student Student : arrayList) {
			System.out.println(Student);
		}
		break;
	  case 2:
		
		System.out.println("====By ID=====");
		Collections.sort(arrayList, new StudentIdmatch());
		for (Student Student : arrayList) {
			System.out.println(Student);
		}
		break;
	  case 4:
	  System.out.println("====By marks=====");
		Collections.sort(arrayList, new  StudentMarks());
		for (Student Student : arrayList) {
			System.out.println(Student);
		}
		break;
		    default :
		    System.out.println("please enter vaild number");
		    }
	System.out.println("do you want to continue");
	char str=scanner.next().charAt(0);
	temp=str;
		}
		while(temp=='y');
	}

	private static Comparator StudentByName() {
		// TODO Auto-generated method stub
		return null;
	}

} 
