public class Telco implements TelcoSubscription{

    private String telcoName;
    private double promoPrice;
    private Integer dataAllowance;
    private boolean unliCallText;

    public Telco(Integer dataAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usagePromo, double price){
        return usagePromo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallsText){
        return unliCallsTextOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }

    public void setPromoPrice (Double promoPrice){
        this.promoPrice = promoPrice;
    }

    public String getTelcoName(){
        return telcoName;
    }

    public Double getPromoPrice(){
        return promoPrice;
    }

}