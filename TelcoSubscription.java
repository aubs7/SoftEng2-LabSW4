public interface TelcoSubscription {

    public double accept(UsagePromo usagePromo, double price);
    public double accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallsText);

}