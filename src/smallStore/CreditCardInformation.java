package smallStore;

import java.time.YearMonth;


public class CreditCardInformation {

    private String creditCardNumber;
    private String nameOnCard;
    private byte cardCvv;
    private YearMonth expirationYearMonth;
    private CardType cardType;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public byte getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(byte cardCvv) {
        this.cardCvv = cardCvv;
    }

    public YearMonth getExpirationYearMonth() {
        return expirationYearMonth;
    }

    public void setExpirationYearMonth(YearMonth expirationYearMonth) {
        this.expirationYearMonth = expirationYearMonth;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CreditCardInformation{");
        sb.append("creditCardNumber='").append(creditCardNumber).append('\'');
        sb.append(", nameOnCard='").append(nameOnCard).append('\'');
        sb.append(", cardCvv=").append(cardCvv);
        sb.append(", expirationYearMonth=").append(expirationYearMonth);
        sb.append(", cardType=").append(cardType);
        sb.append('}');
        return sb.toString();
    }
}
