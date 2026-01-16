package be_study.quiz.api.quiz50;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonString = """
				{
				"id": 1,
				"name": "John Doe",
				"contacts": [
				{
				"type": "email",
				"value": "john.doe@example.com"
				},
				{
				"type": "phone",
				"value": "01023456789"
				}
				],
				"address": {
				"street": "123 Main Street",
				"city": "Seoul",
				"zipcode": "12345"
				},
				"orders": [
				{
				"orderId": "ORD-001",
				"date": "2024-07-09",
				"items": [
				{
				"id": 1,
				"name": "Smartphone",
				"quantity": 2
				},
				{
				"id": 2,
				"name": "Laptop",
				"quantity": 1
				}
				]
				},
				{
				"orderId": "ORD-002",
				"date": "2024-07-10",
				"items": [
				{
				"id": 3,
				"name": "Headphones",
				"quantity": 1
				}
				]
				}
				]
				}
				""";

		try {
			JSONParser jsonParse = new JSONParser();
			JSONObject obj = (JSONObject) jsonParse.parse(jsonString);

			
			Quiz50DTO quiz50DTO = new Quiz50DTO();
			
			quiz50DTO.setId((long) obj.get("id"));
			quiz50DTO.setName((String) obj.get("name"));
			
			JSONArray contactsArray = (JSONArray)obj.get("contacts");
			List<ContactDTO> contacts = new ArrayList<ContactDTO>();
			
			for(int i=0; i<contactsArray.size(); i++) {
				JSONObject contactObject = (JSONObject)contactsArray.get(i);
				
				ContactDTO contact = new ContactDTO();
				contact.setType( (String)(contactObject.get("type") ));
				contact.setValue( (String)(contactObject.get("value") ));
				contacts.add(contact);
			}
			quiz50DTO.setContacts(contacts);
			
			JSONObject addressObject = (JSONObject)obj.get("address");
			AddressDTO address = new AddressDTO();
			
			address.setStreet( (String)(addressObject.get("street")) );
			address.setCity( (String)(addressObject.get("city")) );
			address.setZipcode( (String)(addressObject.get("zipcode")) );
			quiz50DTO.setAddress(address);
			
			JSONArray ordersArray = (JSONArray)obj.get("orders");
			List<OrderDTO> orders = new ArrayList<OrderDTO>();
			
			for(int i=0; i<ordersArray.size(); i++) {
				JSONObject orderObject = (JSONObject)ordersArray.get(i);
				
				OrderDTO order = new OrderDTO();
				order.setOrderId( (String)(orderObject.get("orderId")) );
				order.setDate( (String)(orderObject.get("date")) );
				
				JSONArray itemsArray = (JSONArray)orderObject.get("items");
				List<ItemDTO> items = new ArrayList<ItemDTO>();
				for(int j=0; j<itemsArray.size(); j++) {
					JSONObject itemObject = (JSONObject)itemsArray.get(j);
					ItemDTO item = new ItemDTO();
					
					item.setId( (long)(itemObject.get("id")));
					item.setName( (String)(itemObject.get("name")));
					item.setQuantity( (long)(itemObject.get("quantity")));
					
					items.add(item);
				}
				
				order.setItems(items);
				
				orders.add(order);
			}
			quiz50DTO.setOrders(orders);
			
			System.out.println(quiz50DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
