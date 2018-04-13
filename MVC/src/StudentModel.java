public class StudentModel {
    private String name, lastname, email, dob;

    public int saveInfo(String name, String lastname, String email, String dob) {
        this.name = name;
        this.email = email;
        this.lastname = lastname;
        this.dob = dob;
        return 1;
    }

}
