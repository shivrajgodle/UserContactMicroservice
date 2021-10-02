package com.contact.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;


@Service
public class ContactServiceImpl implements ContactService {
	
	//fake list of contacts
	
	List<Contact> list = List.of(
			
			new Contact(1L,"shivraj@gmail.com","SHIVRAJ",1322L),
			new Contact(2L,"ganesh@gmail.com","GANESH",1322L),
			new Contact(3L,"MANISHA@gmail.com","MANISHA",1324L)
			
			);

	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		
		return list.stream().filter(contact -> contact.getUserid().equals(userId)).collect(Collectors.toList());
	}

}
