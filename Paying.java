//paying class utilizes the strategy design pattern and indicates which class is being used according to the user's input
//either card or cash
public class Paying {
    private Payment payment;

    public Paying (Payment payment){
        this.payment = payment;
    }

    public String executePayment(String card, String cash){
        return payment.paymentMethod(card, cash);
    }

}