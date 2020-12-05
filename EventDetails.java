package com.hcl.t26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventDetails {
	public static boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException
	{
		for(EventType events:typeList) 
if(typeId==events.getId()) 
	 return true;
		throw new EventTypeDoesNotExistsException();		
}
	public static void main(String[] args) throws IOException{
		int no;
		Long typeId,value;
		String name,detail,ownerName;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Events :");
		no = s.nextInt();
		s.nextLine();
		String[] details=new String[no];
		List<EventType> typelist=new ArrayList<>();
		List<Event> eventlist = new ArrayList<>();
		Event event=new Event();
		EventType type1=new EventType("Exhibition",(long) 1);
		EventType type2=new EventType("Book Fair",(long)2);
		EventType type3=new EventType("Marathon",(long)3);
		typelist.add(type1);
		typelist.add(type2);
		typelist.add(type3);
		for (int i = 0; i < no; i++) {
			System.out.println("Enter the details of Event" + (i + 1));
			details[i] = s.nextLine();
		}
		for (int i = 0; i < details.length; i++) {
			String[] split = details[i].split(",");
			name=split[0];
			detail=split[1];
		ownerName=split[2];
		typeId=Long.parseLong(split[3]);
				do {
					
				try {
					if(isValid(typeId,typelist)) {
					event.setName(name);
					event.setDetail(detail);
				    event.setOwnerName(ownerName);
					event.setTypeId(typeId);
				     eventlist.add(event);
				break;
				} 
				}
				catch (EventTypeDoesNotExistsException e) {
					System.out.println(e.getMessage());
					System.out.println("Enter the correct event type id :");
					typeId=s.nextLong();
					s.nextLine();
				}
			}
			while(true);
		}
		
		System.out.println("The events entered are :"+"\n"+"Name"+" Details" +" Owner name"+" Eventtypeidevent");
		for(Event e:eventlist)
			System.out.println(e);
		s.close();
		}
	}