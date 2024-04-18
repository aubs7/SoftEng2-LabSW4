public class Telco implements TelcoSubscription{

    private String telcoName;
    private double promoPrice;
    private integer dataAllowance;
    private boolean unliCallText;

    public Telco(dataAllowance, promoPrice, telcoName, unliCallText){
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public double accept(UsagePromo usagePromo, double price){

    }

    @Override
    public double accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallsText){

    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }

    public void se

}