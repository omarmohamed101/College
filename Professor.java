package college;

/**
 *
 * @author omarm
 */
public class Professor {
    private String firstName;
    private String lastName;
    private String telephone;
    private String address;
    private double salary;
    private Course [] courses;
    public int coursesNumber;
    
    
    public Professor(String firstName, String lastName, String telephone, String address, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.address = address;
        this.salary = salary;
        courses = new Course[50];
        coursesNumber = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public Course[] getCourses() {
        return courses;
    }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String fullName() {
        return getFirstName() + " " + getLastName();
    }
    
    public double getraise(double raise) {
        double temp = getSalary() + getSalary() * raise;
        setSalary(temp);
        return temp;
    }
    
    public void addCourse(Course c) {
        courses[coursesNumber++] = c;
    }
    
    
    public void removeCourse(String name) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getName().equals(name)) {
                courses[i] = null;
                break;
            }
        }
    }
}
