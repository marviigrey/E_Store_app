package smallStore;

public class BillingInformation {

    private Address deliveryAddress;
    private CreditCardInformation creditCardInformation;
    private String receiverName;
    private String receiverPhoneNumber;

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BillingInformation{");
        sb.append("deliveryAddress=").append(deliveryAddress);
        sb.append(", creditCardInformation=").append(creditCardInformation);
        sb.append(", receiverName='").append(receiverName).append('\'');
        sb.append(", receiverPhoneNumber='").append(receiverPhoneNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
