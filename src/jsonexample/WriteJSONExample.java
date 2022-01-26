package jsonexample;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstName", "akshay");
		employeeDetails.put("lastName", "balsaraf");
		employeeDetails.put("address", "kk");
		
		JSONObject employeeObject = new JSONObject();
		employeeObject.put("employee", employeeDetails);
		
		JSONObject employeeDetails2 = new JSONObject();
		employeeDetails2.put("firstName", "ak");
		employeeDetails2.put("lastName", "ak");
		employeeDetails2.put("address", "kk");
		
		JSONObject employeeObject2 = new JSONObject();
		employeeObject2.put("employee", employeeDetails2);
		
		JSONArray employeeList = new JSONArray();
		employeeList.add(employeeObject);
		employeeList.add(employeeObject2);
		
		try(FileWriter file = new FileWriter("employee.json")) {
			
			file.write(employeeList.toJSONString());
			file.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
