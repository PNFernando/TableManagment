package chatty.myself.res_waiterv001.model;

/**
 * Created by Pramoda Fernando on 4/19/2015.
 */
public class User {
    private long userId;
    private String name;
    private String email;
    private String password;
    private String propicurl;
    private String coverpicurl;
    private String gender;
    private String dob;
    private int age;
    private String astro;
    private String introduction;
    private String maritalstatus;
    private String height;
    private String weight;
    private String bodyshape;
    private String bloodtype;
    private String nationality;
    private String religion;
    private String status;


    public User() {
    }

    public User(long userId, String name, String email, String password, String propicurl, String coverpicurl, String gender, String dob, int age, String astro, String introduction, String maritalstatus, String height, String weight, String bodyshape, String bloodtype, String nationality, String religion, String status) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.propicurl = propicurl;
        this.coverpicurl = coverpicurl;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
        this.astro = astro;
        this.introduction = introduction;
        this.maritalstatus = maritalstatus;
        this.height = height;
        this.weight = weight;
        this.bodyshape = bodyshape;
        this.bloodtype = bloodtype;
        this.nationality = nationality;
        this.religion = religion;
        this.status = status;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPropicurl() {
        return propicurl;
    }

    public void setPropicurl(String propicurl) {
        this.propicurl = propicurl;
    }

    public String getCoverpicurl() {
        return coverpicurl;
    }

    public void setCoverpicurl(String coverpicurl) {
        this.coverpicurl = coverpicurl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAstro() {
        return astro;
    }

    public void setAstro(String astro) {
        this.astro = astro;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBodyshape() {
        return bodyshape;
    }

    public void setBodyshape(String bodyshape) {
        this.bodyshape = bodyshape;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", propicurl='" + propicurl + '\'' +
                ", coverpicurl='" + coverpicurl + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", astro='" + astro + '\'' +
                ", introduction='" + introduction + '\'' +
                ", maritalstatus='" + maritalstatus + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", bodyshape='" + bodyshape + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
