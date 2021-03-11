package lessons.lesson16_Polymorphism;

public class Card {
    private String cardName;
    private int value;

    public Card(String cardName, int value) {
        this.cardName = cardName;
        this.value = value;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return cardName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getValue() != card.getValue()) return false;
        return getCardName() != null ? getCardName().equals(card.getCardName()) : card.getCardName() == null;
    }

    @Override
    public int hashCode() {
        int result = getCardName() != null ? getCardName().hashCode() : 0;
        result = 31 * result + getValue();
        return result;
    }
}
