package com.test.bookticket.app.client;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.bookticket.app.entity.Ticket;

public class BookTicketClient {
	public static void main(String[] args) throws JsonProcessingException {
		createTic();
		getAllTick();
		
	}
	
	private static void getAllTick() {
		RestTemplate template=new RestTemplate();
		String result=template.getForObject("http://localhost:9090/api/tickets/ticket/allticket", String.class);
		
	System.out.println(result);
	}
	
	private static void createTic() throws JsonProcessingException {
		RestTemplate template=new RestTemplate();
		Ticket t=new Ticket();
		t.setBookingDate("2019-00-01");
		t.setDestStation("BLO");
		t.setEmail("pp@gmail.com");
		t.setPassangerName("Sandhya");
		t.setSourceStation("IXR");
		ObjectMapper mp=new ObjectMapper();
		String str=mp.writeValueAsString(t);
		System.out.println(str);
		String plainClientCredentials="myusername:mypassword";
    	String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));

    	HttpHeaders headers = getHeaders();
    	headers.add("Authorization", "Basic " + base64ClientCredentials);
		template.postForObject("http://localhost:9090/api/tickets/create",t,Ticket.class);
		
	}
	

}
