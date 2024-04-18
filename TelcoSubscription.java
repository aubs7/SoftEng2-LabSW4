public interface TelcoSubscription {

    public String accept(UsagePromo usagePromo, double price);
    public String accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallsText);
    public String getTelcoName();
    public double getPromoPrice();
    public boolean getUnliCallText();

}