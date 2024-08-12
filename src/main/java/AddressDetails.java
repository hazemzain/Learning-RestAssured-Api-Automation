public class AddressDetails {
    private String street;
    private String city;
    private String zipcode;
    public AddressDetails() {

    }
    public AddressDetails(String Street,String City,String Zipcode)
    {
        setStreet(Street);
        setCity(City);
        setZipcode(Zipcode);
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
