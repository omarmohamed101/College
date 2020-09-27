package college;

/**
 *
 * @author omarm
 */
public class Student {
    private String firstName;
    private String lastName;
    private String telephone;
    private String address;
    private int age;
    private Department dep;
    private Course [] courses;
    private int currentCourses;
    
    
    public Student (String firstName, String lastName, String telephone, String address, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setTelephone(telephone);
        setAddress(address);
        setAge(age);
        courses = new Course[6];
        currentCourses = 0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        if (150 > age && age > 0 )
            this.age = age;
    }
    
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Course[] getCourses() {
        return courses;
    }
    
    public void addCourse(Course c) {
        courses[currentCourses++] = c;
    }
    
    
    public String fullName() {
        return getFirstName() + " " + getLastName();
    }
    
}
