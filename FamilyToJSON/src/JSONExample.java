

import java.io.*;
import org.json.simple.*;

public class JSONExample {
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        
        JSONObject familyMember1 = new JSONObject();
        familyMember1.put("firstName", "Marshall");
        familyMember1.put("lastName", "Evans");
        familyMember1.put("title", "Father");
         
        JSONObject F1 = new JSONObject();
        F1.put("FamilyMember", familyMember1);
         
        
        JSONObject familyMember2 = new JSONObject();
        familyMember2.put("firstName", "Raena");
        familyMember2.put("lastName", "Evans");
        familyMember2.put("title","Mother");
         
        JSONObject F2 = new JSONObject();
        F2.put("FamilyMember", familyMember2);
        
        JSONObject familyMember3 = new JSONObject();
        familyMember3.put("firstName", "Tyler");
        familyMember3.put("lastName", "Evans");
        familyMember3.put("title", "First Child");
         
        JSONObject F3 = new JSONObject();
        F3.put("FamilyMember", familyMember3);
        
        JSONObject familyMember4 = new JSONObject();
        familyMember4.put("firstName", "Tanner");
        familyMember4.put("lastName", "Evans");
        familyMember4.put("title", "Second Child");
         
        JSONObject F4 = new JSONObject();
        F4.put("FamilyMember", familyMember4);
         
         
         
        
        JSONArray familyList = new JSONArray();
        familyList.add(F1);
        familyList.add(F2);
        familyList.add(F3);
        familyList.add(F4);
        
        
        try (FileWriter file = new FileWriter("familymembers.json")) {
 
            file.write(familyList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(familyList);
    }
}