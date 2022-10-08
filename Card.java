//if the user wrote "card", the string card is returned which prints a message
public class Card implements Payment{
    @Override
    public String paymentMethod (String card, String cash){
        return card;
    }
}