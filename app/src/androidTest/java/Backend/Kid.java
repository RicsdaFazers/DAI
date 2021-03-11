package Backend;

public class Kid extends User {
    private int id_kid;
    private String name_kid;
    private String address;
    private String name_parent1;
    private String name_parent2;
    private int age;
    private String future_profession;

    public Kid() {}

    public Kid(int id_kid, String username, String password, String e_mail) {
        super(username, password, e_mail);
        this.id_kid = id_kid;
        this.name_kid = null;
        this.address = null;
        this.name_parent1 = null;
        this.name_parent2 = null;
        this.age = 0;
        this.future_profession = null;
    }

    public int getId_kid() {
        return id_kid;
    }

    public void setId_kid(int id_kid) {
        this.id_kid = id_kid;
    }

    public String getName_kid() {
        return name_kid;
    }

    public void setName_kid(String name_kid) {
        this.name_kid = name_kid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName_parent1() {
        return name_parent1;
    }

    public void setName_parent1(String name_parent1) {
        this.name_parent1 = name_parent1;
    }

    public String getName_parent2() {
        return name_parent2;
    }

    public void setName_parent2(String name_parent2) {
        this.name_parent2 = name_parent2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFuture_profession() {
        return future_profession;
    }

    public void setFuture_profession(String future_profession) {
        this.future_profession = future_profession;
    }

    @Override
    public String toString() {
        return "- User -" +
                "\n" + super.toString() +
                "\n" + "Kid: " +
                "id =" + id_kid +
                ", name = " + name_kid +
                ", address = " + address +
                ", name of parents = " + name_parent1 + name_parent2 +
                ", age = " + age +
                ", future profession = " + future_profession;
    }
}
