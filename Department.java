package college;

/**
 *
 * @author omarm
 */
public class Department {
    private String name;
    private String description;
    private int maxNumberOfStudents;
    private Student [] students;
    private Course [] courses;
    
    public Department(String name, String description, int maxNumberOfStudents) {
        this.name = name;
        this.description = description;
        this.maxNumberOfStudents = maxNumberOfStudents;
        students = new Student[50];
        courses = new Course[50];
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }
    
    
    
    public int numberOfCourses() {
        int counter = 0;
        for (Course c: courses) 
            if (c != null)
                counter++;
            
        return counter;
    }
    
    public int numberOfStudents() {
        int counter = 0;
        for (Student c: students) 
            if (c != null)
                counter++;
            
        return counter;
    }
    
    public Course findCourse(String name) {
        for (Course c: courses)
            if (c.getName().equals(name))
                return c;
            
        return null;
    }
    
    public boolean isFull() {
        int counter = 0;
        
        for (Student s: students)
            if (s != null)
                counter++;
        
        return counter == maxNumberOfStudents;
    }
    
    public boolean enroll (Student s) {
        if (isFull())
            return false;
        else {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = s;
                    break;
                }
            }
            return true;
        }
    }
    
    public boolean addCourse(Course c) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = c;
                return true;
            }
        }
        return false;
    }
    
    
}
