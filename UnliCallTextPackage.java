import java.util.*;
public class UnliCallTextPackage implements UnliCallsTextOffer{

    private static Map<String, Boolean> packageMap = new HashMap<String, Boolean>();
    
    static{
        packageMap.put("Smart", false);
        packageMap.put("Globe", true);
        packageMap.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        boolean unliCallsTextOffer = packageMap.get(telcoName);

        if (unliCallsTextOffer == false) {
            return "This plan does not offer any free calls or texts, and you will be charged per use.";
        } else if (unliCallsTextOffer == true) {
            if (telcoName == "Globe"){
                return "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
            } else if (telcoName == "Ditto"){
                return "This plan includes unlimited calls and texts to all networks within the country.";
            }
        }
        return "";
    }

}