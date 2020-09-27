package college;

/**
 *
 * @author omarm
 */
public class Course {
    private String name;
    private String description;
    private int maxNumberOfStudents;
    private int numberOfLectures;
    private Student [] students;
    private Professor professor;
    private Department department;
    private static int numOfEnrolledStudents;
    
    public Course(String name, String description, int maxNumberOfStudents, int numberOfLectures) {
        this.name = name;
        this.description = description;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.numberOfLectures = numberOfLectures;
        students = new Student[50];
        numOfEnrolledStudents = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Department getDepartment() {
        return department;
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public Student[] getStudents() {
        return students;
    }

    public Professor getProfessor() {
        return professor;
    }

    
    
    
    public int numberOfStudents() {
        int counter = 0;
        for (Student s: students)
            if (s != null)
                counter++;
        return counter;
    }
    
    public boolean assignProfessor(Professor p) {
        if (professor != null)
            return false;
        else {
            professor = p;
            return true;
        }  
    }
    
    public void unAssignProfessor(Professor p) {
        professor = null;
        p.removeCourse(getName());
    }
    
    public boolean isAssigned() {
        return professor != null;
    }
    
    public String professorName() {
        return professor.fullName();
    }
    
    public boolean isFull() {
        return (numOfEnrolledStudents <= maxNumberOfStudents ? false : true); 
        /*
        int counter = 0;
        for (Student s: students)
            if (s != null)
                counter++;
        
        if (counter == maxNumberOfStudents)
            return true;
        else
            return false;*/
    }
    
    public boolean enroll(Student s) {
        numOfEnrolledStudents++;
        if (isFull()) {
            return false;
        }else {
            for (int i = 0; i < students.length; i++)
                if (students[i] == null) {
                    students[i] = s;
                    break;
                }
            return true;
        }      
    }
    
}
