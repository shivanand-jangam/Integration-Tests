package Pojos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExamplePojo {

	public static class StudentDetails implements Serializable {
		// {
		// "name":"Akshay",
		// "rollnumber":1,
		// "id":"ABCD1234"
		// }

		private static final long serialVersionUID = 1L;

		@JsonProperty("name")
		public String name;

		@JsonProperty("rollnumber")
		public int rnumber;

		@JsonProperty("id")
		public String myId;

	}

	public static void main(String[] args) {

		StudentDetails details = new StudentDetails();
		details.name = "Shivasdvsvsdvsdfv";
		details.rnumber = 162562165;
		details.myId = "abcd1235151151";


        // Serialize the object to a JSON string
        String jsonString = serializeToJsonString(details);

        // Print the serialized JSON string
        System.out.println("Serialized JSON String: " + jsonString);
        
        
        String mysJsonString = "{\"name\":\"Shivadeserialize\",\"rollnumber\":328981,\"id\":\"369\"}";
        
        // Deserialize the JSON string to a Person object
        StudentDetails myStudent = deserializeJsonString(mysJsonString);

        // Print the deserialized Person object
        System.out.println("Deserialized myStudent Name: " + myStudent.name);
        System.out.println("Deserialized myStudent myId: " + myStudent.myId);
        System.out.println("Deserialized myStudent rnumber: " + myStudent.rnumber);
        
	}

    // Serialize an object to a JSON string
    private static String serializeToJsonString(Object obj) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
    // Deserialize a JSON string to a Java object
    private static StudentDetails deserializeJsonString(String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonString, StudentDetails.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
