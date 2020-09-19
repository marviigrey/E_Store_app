package smallStore;

public abstract class User {
    private String phone;
    private Address homeAddress;
    private String emailAddress;
    private String name;
    private String password;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("phone='").append(phone).append('\'');
        sb.append(", homeAddress='").append(homeAddress).append('\'');
        sb.append("emailAddress='").append(emailAddress).append('\'');
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void jump();
}
