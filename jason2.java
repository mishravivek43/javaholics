package newhello;


import org.json.simple.JSONObject;
import java.io.*;

class json2 {

   public static void main(String[] args) throws IOException{
	
      JSONObject pulse1 = new JSONObject();

      pulse1.put("name","Rice");
      pulse1.put("weight",new Integer(100));
      pulse1.put("price per kg",new Double(42.0));

      JSONObject pulse2 = new JSONObject();

      pulse2.put("name","Wheat");
      pulse2.put("weight",new Integer(150));
      pulse2.put("price per kg",new Double(31.0));
      
      JSONObject pulse3 = new JSONObject();

      pulse3.put("name","Pulses");
      pulse3.put("weight",new Integer(90));
      pulse3.put("price per kg",new Double(107.0));
      
//      StringWriter out = new StringWriter(); 
//      StringWriter out2 = new StringWriter(); 
//      StringWriter out3 = new StringWriter(); 
//      
//    	  
//    	  pulse1.writeJSONString(out);
//    	  System.out.println(out);
//    	  pulse2.writeJSONString(out2);
//    	  System.out.println(out2);
//   	      pulse3.writeJSONString(out3);
//   	   System.out.println(out3);
	
	        jsonprint(pulse1);
	        jsonprint(pulse2);
	        jsonprint(pulse3);
      
      
      
   }
   public static void jsonprint(JSONObject pulse) throws IOException{
	   StringWriter out = new StringWriter();
	   pulse.writeJSONString(out);
	   System.out.println(out);
	     
   }
}



