package s106_Generics.S106_N2exercise2;

public class Person_UnderfinedVar {
    private String firstName;
    private String lastName;
    private int age;

    public Person_UnderfinedVar(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Person_UnderfinedVar" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ".";
    }
}
