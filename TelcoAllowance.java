import java.util.*;

public class TelcoAllowance implements UsagePromo{

    private static Map<String, Double> allowanceMap = new HashMap<>();
    
    static{
        allowanceMap.put("Smart", 500);
        allowanceMap.put("Globe", 450);
        allowanceMap.put("Ditto", 400);
    }

    @Override
    public String showAllowance(String telcoName, double money){
        return allowanceMap.get(telcoName) * money;
    }
    
}