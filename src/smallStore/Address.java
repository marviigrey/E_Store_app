package smallStore;

public class Address {

    private String houseNumber;
    private String cityName;
    private String stateName;
    private String countryName;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("houseNumber='").append(houseNumber).append('\'');
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append(", stateName='").append(stateName).append('\'');
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
