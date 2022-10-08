//if the user wrote "cash", the string cash is returned which prints a message
public class Cash implements Payment{
    @Override
    public String paymentMethod (String card, String cash){
        return cash;
    }
}