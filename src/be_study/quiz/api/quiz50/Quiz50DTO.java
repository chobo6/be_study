package be_study.quiz.api.quiz50;

import java.util.List;

public class Quiz50DTO {
	long id;
	String name;
	List<ContactDTO> contacts;
	AddressDTO address;
	List<OrderDTO> orders;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ContactDTO> getContacts() {
		return contacts;
	}
	public void setContacts(List<ContactDTO> contacts) {
		this.contacts = contacts;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public List<OrderDTO> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}
	
	@Override
	public String toString() {
		return "Quiz50DTO [id=" + id + ", name=" + name + ", contacts=" + contacts + ", address=" + address
				+ ", orders=" + orders + "]";
	}
	
	
}

class ContactDTO {
	String type;
	String value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ContactDTO [type=" + type + ", value=" + value + "]";
	}
}

class AddressDTO {
	String street;
	String city;
	String zipcode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
}

class OrderDTO {
	String orderId;
	String date;
	List<ItemDTO> items;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", date=" + date + ", items=" + items + "]";
	}
}

class ItemDTO {
	long id;
	String name;
	long quantity;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
}