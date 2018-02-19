package fluper.com.customlistradiobuton;

/**
 * Created by fluper-pc on 19/2/18.
 */

class OffersModel {

    private String Offer;
    private int Savings;


    public OffersModel(String offer, int savings) {
        Offer = offer;
        Savings = savings;
    }

    public String getOffer() {
        return Offer;
    }

    public int getSavings() {
        return Savings;
    }
}
