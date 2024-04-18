import java.util.*;

public class TelcoAllowance implements UsagePromo{

    private static Map<String, Double> allowanceMap = new HashMap<String, Double>();
    
    static{
        allowanceMap.put("Smart", (double) 500);
        allowanceMap.put("Globe", (double) 450);
        allowanceMap.put("Ditto", (double) 400);
    }

    @Override
    public String showAllowance(String telcoName, double money){
        return allowanceMap.get(telcoName) + Double.toString(allowanceMap.get(telcoName));
    }
    
}