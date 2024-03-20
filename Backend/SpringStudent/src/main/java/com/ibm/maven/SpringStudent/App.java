package com.ibm.maven.SpringStudent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.maven.SpringStudent.CarService.CarService;
import com.ibm.maven.SpringStudent.CarTypes.Car;
import com.ibm.maven.SpringStudent.CarTypes.Ola;
import com.ibm.maven.SpringStudent.CarTypes.Uber;
import com.ibm.maven.SpringStudent.Medical.Department;
import com.ibm.maven.SpringStudent.Medical.Doctor;
import com.ibm.maven.SpringStudent.Medical.Hospital;
import com.ibm.maven.SpringStudent.Medical.HospitalList;
import com.ibm.maven.SpringStudent.Medical.Nurse;
import com.ibm.maven.SpringStudent.Medical.Patient;
import com.ibm.maven.SpringStudent.v0.Employee;
import com.ibm.maven.SpringStudent.v0.Student;
/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
	static CarService crsr;
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//    	ctx.scan("com.ibm.maven.SpringStudent.*");
//    	ctx.refresh();
//    	Student student=ctx.getBean(Student.class);
//    	student.setName("Eepssa");
//    	System.out.println(student.getName());
//    	
//   	AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();
//    	ctx1.scan("com.ibm.maven.SpringStudent.*");
//    	ctx1.refresh();
//    	Student student1=ctx.getBean(Student.class);
//    	student1.setRoll(10);
//    	System.out.println(student1.getRoll());
//    	System.out.println(student);
//    	System.out.println(student1);
//    	Employee e=ctx1.getBean(Employee.class);
//    	e.seteName("Eepssa");
//    	System.out.println(e);
//    	Employee e2=ctx1.getBean(Employee.class);
//    	System.out.println(e2);
    	
    	AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
    	ctx2.scan("com.ibm.maven.SpringStudent.*");
    	ctx2.refresh();
//    	
//    	Hospital hs=ctx2.getBean(Hospital.class);
//    	hs.getDoc().setDocName("Raj");
//    	System.out.println(hs.getDoc().getDocName());
    	
//    	HospitalList hs2=ctx2.getBean(HospitalList.class);
//    	hs2.addDoc(new Doctor("adsad"));
//    	hs2.addDoc(new Doctor("add"));
//    	hs2.addNur(new Nurse("wuer"));
//    	hs2.addNur(new Nurse("wuerwe"));
//    	hs2.addDept(new Department("yuww"));
//    	hs2.addDept(new Department("yuwwer"));
//    	hs2.addPat(new Patient("dfgfh"));
//    	hs2.addPat(new Patient("dfgfhre"));
//    	System.out.print(hs2.getDoc());
    	
    	crsr=ctx2.getBean(Ola.class);
    	Car cr=ctx2.getBean(Car.class);
    	cr.setCarName("Sedan");
    	cr.setCarNo(101);
    	crsr.getCar(cr);
    	
    	crsr=ctx2.getBean(Uber.class);
    	Car cr2=ctx2.getBean(Car.class);
    	cr.setCarName("Sedan");
    	cr.setCarNo(101);
    	crsr.getCar(cr);
    	

    }
}
