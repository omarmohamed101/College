package college;
import java.util.Scanner;
/**
 *
 * @author omar mohamed
 */
public class CollegeSystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // initially with 50 dep, 50 pro, 50 course, 50 student
        College myCollege = new College(50, 50, 50, 50);
        
        
        
        System.out.println("Welcome to our university!\n"
                + "Operations:\n"
                + "1-college\n"
                + "a) Number of Departments\n"
                + "b) Number of Courses\n"
                + "c) Number of Professors\n"
                + "d) Number of Students\n"
                + "e) Report\n"
                + "2- Department\n"
                + "a) New\n" 
                + "b) Number of Courses\n"
                + "c) Number of Students\n"
                + "d) Is Full\n"
                + "e) Enroll\n"
                + "f) Report\n"
                + "3- Course\n"
                + "a) New\n"
                + "b) Number of Students\n"
                + "c) Assign\n"
                + "d) Is assigned\n"
                + "e) Professor Name\n"
                + "f) Is Full\n"
                + "g) Enroll\n"
                + "h) Report\n"
                + "4- Professor\n"
                + "a) New\n"
                + "b) Display Salary\n"
                + "c) Get Raise\n"
                + "d) Report\n"
                + "5- Student\n"
                + "a) New\n"
                + "b) Report\n"
                + "6- Quit\n");
        
                while (true) {
                    System.out.println("============\n"
                            + "Enter Operation\n"
                            + "============\n");
                    
                    String operation = input.next();
                    if (operation.equals("6")) {
                        System.out.println("Bye");
                        break;
                    }else if (operation.equals("1a")) {
                        // TODO
                        // just return the number of Departments
                        System.out.println(myCollege.numberOfDepartments());
                        
                        
                    }else if (operation.equals("1b")) {
                        // TODO
                        // just return the number of Courses
                        System.out.println(myCollege.numberOfCourses());
                        
                    }else if (operation.equals("1c")) {
                        // TODO
                        // just return the number of Professors
                        System.out.println(myCollege.numberOfProfessors());
                        
                    }else if (operation.equals("1d")) {
                        // TODO
                        // just return the number of Students
                        System.out.println(myCollege.numberOfStudents());
                        
                    }else if (operation.equals("1e")) {
                        // TODO
                        //print a report
                        // X professors
                        // X students
                        // X Departments
                        // X cocurses
                        System.out.println(Integer.toString(myCollege.numberOfProfessors()) + " Professors\n"
                                + Integer.toString(myCollege.numberOfStudents()) + " Students\n"
                                + Integer.toString(myCollege.numberOfDepartments()) + " Departments\n"
                                + Integer.toString(myCollege.numberOfCourses()) + " Courses\n");
                        
                    } else if (operation.equals("2a")) {
                        // New Department
                        
                        System.out.println("Department");
                        String name = input.next();
                        
                        input.nextLine();
                        
                        System.out.println("Department description");
                        String description = input.nextLine();

                        
                        System.out.println("Department Max Students");
                        int maxStudents = input.nextInt();
                        
                        Department dep = new Department(name, description, maxStudents);
                        if (!myCollege.addDepartment(dep))
                            System.out.println("No enought space");
                        
                    }else if (operation.equals("2b")) {
                        // retutrn the number of courses
                        try {
                            System.out.println("Departmnet:");
                            String department = input.next();

                            System.out.println(myCollege.findDepartment(department).numberOfCourses());
                        }catch (Exception e) {System.out.println("Department Not Found!");}
                        
                        
                    }else if (operation.equals("2c")) {
                        // return the number of students
                        try {
                            System.out.println("Departmnet:");
                            String department = input.next();

                            System.out.println(myCollege.findDepartment(department).numberOfStudents());
                        }catch (Exception e) {System.out.println("Department Not Found!");}
                        
                        
                    }else if (operation.equals("2d")) {
                        // return whether if the department is full or not
                        try {
                            System.out.println("Departmnet:");
                            String department = input.next();

                            System.out.println(myCollege.findDepartment(department).isFull());
                        }catch (Exception e) {System.out.println("Department Not Found!");}
                        
                        
                    }else if (operation.equals("2e")) {
                        // Enroll a new student 
                        System.out.println("Department");
                        String department = input.next();
                        
                        try {
                            myCollege.findDepartment(department);
                            input.nextLine();
                        
                            System.out.println("Student");
                            String name = input.nextLine();

                            Student s = myCollege.findStudent(name);

                            if (s == null)
                                System.out.println("NOT an assigned student");
                            else {
                                if (!myCollege.findDepartment(department).enroll(s))
                                    System.out.println("No space!");
                            }
                            
                        }catch (Exception e) {System.out.println("Department Not Found!");}
                        
                        
                           
                    }else if (operation.equals("2f")) {
                        // print a report
                        // Description: bla bla bla
                        // Max Students: X
                        // Students: X
                        // Status: Full/NOT FULL 
                        // Courses: X
                        
                        
                        System.out.println("Department");
                        String department = input.next();
                        
                        try {
                            myCollege.findDepartment(department);
                            System.out.println("Description: " + myCollege.findDepartment(department).getDescription()
                                + "\nMax Students: " + myCollege.findDepartment(department).getMaxNumberOfStudents()
                                + "\nStudents: " + myCollege.findDepartment(department).numberOfStudents()
                                + "\nStatus: " + ( (myCollege.findDepartment(department).isFull()) ? "Full" : "NOT FULL" )
                                + "\nCourses: " + myCollege.findDepartment(department).numberOfCourses());
                        }catch (Exception e) {System.out.println("Department Not Found!");}
                        
                        
                        
                    }else if (operation.equals("3a")) {
                        // New course
                        
                        input.nextLine();
                            
                        System.out.println("Course Name:");
                        String courseName = input.nextLine();
                        
                        System.out.println("Course Description:");
                        String courseDescription = input.nextLine();
                        
                        System.out.println("Course Max Students:");
                        int maxStudents = input.nextInt();
                        
                        System.out.println("Course Lectures:");
                        int courseLectures = input.nextInt();
                        
                        Course newCourse = new Course(courseName, courseDescription, maxStudents, courseLectures);
                        
                        System.out.println("Department:");
                        String department = input.next();
                        
                        myCollege.addCourse(newCourse);
                        myCollege.findDepartment(department).addCourse(newCourse);

                    }else if (operation.equals("3b")) {
                        // return the number of students
                        System.out.println("Course:");
                        String course = input.next();
                        
                        try { System.out.println(myCollege.findCourse(course).numberOfStudents()); }
                        catch (Exception e){System.out.println("Course Not found!");}
                        
                    }else if (operation.equals("3c")) {
                        // Assign professor to a course
                        System.out.println("Course:");
                        String course = input.next();
                        
                        try { myCollege.findCourse(course); }
                        catch (Exception e){System.out.println("Course Not found!");}
                        
                        input.nextLine();
                        
                        System.out.println("Professor:");
                        String professor = input.nextLine();
                        
                        
                        try { 
                            Professor p = myCollege.findProfessor(professor);
                            myCollege.findCourse(course).assignProfessor(p);
                            myCollege.findProfessor(professor).addCourse(myCollege.findCourse(course));
                        }
                        catch (Exception e) { System.out.println("Professor Not Found!"); }
                        
                        
                        
                    }else if (operation.equals("3d")) {
                        // return whether if course assigned to a professor or not
                        System.out.println("Course:");
                        String course = input.next();
                        
                        try { System.out.println(myCollege.findCourse(course).isAssigned()); }
                        catch (Exception e){System.out.println("Course Not found!");}
                        
                        
                    }else if (operation.equals("3e")) {
                        // return professor name
                        System.out.println("Course:");
                        String course = input.next();
                        
                        try { System.out.println(myCollege.findCourse(course).professorName()); }
                        catch (Exception e){System.out.println("Course Not found!");}
                        
                        
                        
                    }else if (operation.equals("3f")) {
                        // is full
                        System.out.println("Course:");
                        String course = input.next();
                        
                        try { System.out.println(myCollege.findCourse(course).isFull()); }
                        catch (Exception e){System.out.println("Course Not found!");}
                        
                    }else if (operation.equals("3g")) {
                        // Enroll
                        input.nextLine();
                        System.out.println("Course:");
                        String course = input.nextLine();
                        
                        System.out.println("Student:");
                        String name = input.nextLine();
                        try { 
                            Course c = myCollege.findCourse(course);
                            try {
                                Student s = myCollege.findStudent(name);
                                s.addCourse(c);
                                c.enroll(s);
                            }
                            catch (Exception e){System.out.println("student Not found!");}
                            
                        }
                        catch (Exception e){System.out.println("Course Not found!");}
                        
                       
                    }else if (operation.equals("3h")) {
                        // print coutse report
                        // Description: Object oriented concepts
                        // Department: Computer
                        // Lectures: 10
                        // Max Students: 1
                        // Students: 1
                        // Status: Full
                        // Professor: Mohamed Amr
                        System.out.println("Department: ");
                        String department = input.next();
                        System.out.println("Course:");
                        String course = input.next();
                        //try {
                            System.out.println("Description: " + myCollege.findCourse(course).getDescription()
                                //+ "Department:" + myCollege.findCourse(course).getDepartment().getName()
                                + "\nLectures:" + myCollege.findCourse(course).getNumberOfLectures()
                                + "\nMax Students:" + myCollege.findCourse(course).getMaxNumberOfStudents()
                                + "\nStudents:" + myCollege.findCourse(course).getStudents().length
                                + "\nStatus: " + ( (myCollege.findCourse(course).getMaxNumberOfStudents() == myCollege.findCourse(course).getStudents().length) ? "Full" : "Not Full" ));
                                try {
                                    System.out.println("\nProfessor: " + myCollege.findCourse(course).getProfessor().fullName());
                                }catch (Exception e) { System.out.println("Not Assigned to professor yet");}
                                
                       /* } catch (Exception e) {
                            System.out.println("Course Not Found");
                        }*/   
                    }else if (operation.equals("4a")) {
                        // New professor
                        
                        System.out.println("professor FirstName:");
                        String firstName = input.next();
                        
                        System.out.println("professor LastName:");
                        String lastName = input.next();
                        
                        System.out.println("professor Telephone:");
                        String telephone = input.next();
                        
                        System.out.println("professor Address:");
                        String address = input.next();
                        
                        System.out.println("professor Salary:");
                        int salary = input.nextInt();
                        
                        Professor professor = new Professor(firstName, lastName, telephone, address, salary);
                        
                        myCollege.addProfessor(professor);
                        
                    }else if (operation.equals("4b")) {
                        // Desplay salary
                        input.nextLine();
                        try {
                            System.out.print("professor: ");
                            String name = input.nextLine();

                            System.out.println(myCollege.findProfessor(name).getSalary());
                        }catch (NullPointerException e) {
                            System.out.println("Professor Not found");
                        }
                        
                        
                    }else if (operation.equals("4c")) {
                        // get raise -> print Salary:xxxx after this raise
                        
                        input.nextLine();
                        
                        System.out.println("professor:");
                        String name = input.nextLine();
                        try {
                            myCollege.findProfessor(name);
                            
                            System.out.println("Raise:");
                            float raise = input.nextFloat();

                            double r = myCollege.findProfessor(name).getraise(raise);

                            System.out.printf("Salary: %f after this raise", r);
                            System.out.println("");
                            
                        }catch (Exception e) {
                            System.out.println("Professor Not Found!");
                        }
                        
                        
                        
                    }else if (operation.equals("4d")) {
                        // Report
                        // Salary: 3300
                        // Courses: OOP
                        // Telephone: 0123456789
                        // Address: Egypt Alexandria
                        input.nextLine();
                        System.out.println("professor:");
                        String name = input.nextLine();
                        
                        try {
                            myCollege.findProfessor(name);
                            String coursesNames = "";
                            Course [] s = myCollege.findProfessor(name).getCourses();
                            if (s != null)
                                for (int i = 0; i < myCollege.findProfessor(name).coursesNumber; i++)
                                    coursesNames += s[i].getName() + " ";

                            System.out.println("Salary: " + myCollege.findProfessor(name).getSalary()
                                    + "\nCourses: " + coursesNames
                                    + "\nTelephone: " + myCollege.findProfessor(name).getTelephone()
                                    + "\nAddress: " + myCollege.findProfessor(name).getAddress());
                        }catch (Exception e) {
                            System.out.println("Professor Not Found!");
                        }
                        
                        
                        
                    }else if (operation.equals("5a")) {
                        // New student
                        
                        System.out.println("Student FirstName:");
                        String firstName = input.next();
                        
                        System.out.println("Student LastName:");
                        String lastName = input.next();
                        
                        System.out.println("Student Telephone:");
                        String telephone = input.next();
                        
                        System.out.println("Student Address:");
                        String address = input.next();
                        
                        System.out.println("age:");
                        int age = input.nextInt();
                        
                        Student newCommer = new Student(firstName, lastName, telephone, address, age);
                        
                        myCollege.addStudent(newCommer);
                        
                    }else if (operation.equals("5b")) {
                        // Repoort
                        // Courses: OOP
                        // Telephone: 0123456789
                        // Address: Egypt Alexandria
                        // Age: 20
                        input.nextLine();
                        
                        String name = "";
                        System.out.print("Student: ");
                        name = input.nextLine();
                        
                        String coursesNames = "";
                        try {
                            Course [] s = myCollege.findStudent(name).getCourses();
                            for (Course c: s)
                                coursesNames += c.getName() + " ";
                        }catch (NullPointerException e){}
                        
                        try {
                        System.out.println("Courses: " + coursesNames
                                + "\nTelephone: " +  myCollege.findStudent(name).getTelephone()
                                + "\nAddress:" +  myCollege.findStudent(name).getAddress() 
                                + "\nAge: " +  myCollege.findStudent(name).getAge());
                        } catch (Exception e) {
                            System.out.println("Student not Found!");
                        }
                        
                    }
                        
                     
                }
                
        
    }
    
}
