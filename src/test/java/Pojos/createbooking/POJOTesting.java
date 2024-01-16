package Pojos.createBooking;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJOTesting {
	
	
	static String responseJson="{\"bookingid\":1251,\"booking\":{\"firstname\":\"Shiv\",\"lastname\":\"aa\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-15\",\"checkout\":\"2019-01-15\"},\"additionalneeds\":\"Breakfast\"}}";

	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper= new ObjectMapper();
		
		BookingDetails myData=	mapper.readValue(responseJson, BookingDetails.class);
		
		System.out.println(myData.bookingid);
		System.out.println(myData.booking.depositpaid);
		System.out.println(myData.booking.bookingdates.checkin);
		
		
	}
}
