public class UsersData {
    private String name;
    private String email;
    private AddressDetails Address;
    public UsersData()
    {

    }
    public UsersData(String name,String email,AddressDetails Address)
    {
        setName(name);
        setEmail(email);
        setAddress(Address);
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

    public AddressDetails getAddress() {
        return Address;
    }

    public void setAddress(AddressDetails address) {
        Address = address;
    }
}
