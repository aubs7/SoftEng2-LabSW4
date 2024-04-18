import java.util.*;
public class TelcoAllowance implements UsagePromo{

    private static Map<String, Double> priceMap = new HashMap<String, Double>();
    
    static{
        priceMap.put("Smart", (double) 500);
        priceMap.put("Globe", (double) 450);
        priceMap.put("Ditto", (double) 400);
    }

    private static Map<String, Integer> dataMap = new HashMap<String, Integer>();
    
    static{
        dataMap.put("Smart", 15);
        dataMap.put("Globe", 10);
        dataMap.put("Ditto", 8);
    }

    

    @Override
    public String showAllowance(String telcoName, double money){

            return Integer.toString(dataMap.get(telcoName)) + "GB & " + Double.toString(priceMap.get(telcoName));
    }
    
}