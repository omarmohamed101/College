package college;

/**
 *
 * @author omarm
 */
public class College {
    private Course [] courses;
    private Professor [] professors;
    private Student [] students;
    private Department [] departments;
    
    public College(int department, int professor, int student, int course) {
        departments = new Department[department];
        professors = new Professor[professor];
        students = new Student[student];
        courses = new Course[course];
    }

    public int numberOfCourses() {
        int counter = 0;
        for (Course s: courses)
            if (s != null)
                counter++;
        return counter;
    }
    
    public int numberOfProfessors() {
        int counter = 0;
        for (Professor s: professors)
            if (s != null)
                counter++;
        return counter;
    }
    
    public int numberOfStudents() {
        int counter = 0;
        for (Student s: students)
            if (s != null)
                counter++;
        return counter;
    }
    
    public int numberOfDepartments() {
        int counter = 0;
        for (Department s: departments)
            if (s != null)
                counter++;
        return counter;
    }
    
    public Course findCourse(String name) {
        if (courses[0] == null)
            return null;
        for (Course x : courses) {
            if (x.getName().equals(name))
                return x;
        }
        return null;
    }
    
    public Professor findProfessor(String name) {
        if (professors[0] == null)
            return null;
        for (Professor x : professors) {
            if (x.fullName().equals(name))
                return x;
        }
        return null;
    }
    
    public Student findStudent(String name) {
        if (students[0] == null)
            return null;
        for (Student x : students) {
            if (x.fullName().equals(name))
                return x;
        }
        return null;
    }
    
    public Department findDepartment(String name) {
        if (departments[0] == null)
            return null;
        for (Department x : departments) {
            if (x.getName().equals(name))
                return x;
        }
        return null;
    }
    
    public boolean addDepartment(Department d) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = d;
                return true;
            }
        }
        return false;
    }
    
    public boolean addStudent(Student d) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = d;
                return true;
            }
        }
        return false;
    }
    
        public boolean addProfessor(Professor p) {
        for (int i = 0; i < professors.length; i++) {
            if (professors[i] == null) {
                professors[i] = p;
                return true;
            }
        }
        return false;
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
