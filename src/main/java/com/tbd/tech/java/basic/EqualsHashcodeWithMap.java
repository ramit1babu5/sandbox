package com.tbd.tech.java.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Quest: How many objects will be added if the element is returning same hash code?
 * Ans: 3
 * Quest: How many objects will be added if equals method always returns true and hashcode is different?
 * Ans: 3
 * Quest: How many objects will be added if equals method always returns true and hashcode is same?
 * Ans: 1
 * 
 * Explanation: If the map is having element 1 already. To insert 2nd element 
 * either hashcode should have different value from first element hashcode or equals should be false. 
 * 
 * @author ramac_2gifyzh
 *
 */
public class EqualsHashcodeWithMap {
	
	int id;
	
	String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EqualsHashcodeWithMap(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		
		if(null == obj || !(obj instanceof EqualsHashcodeWithMap)) {
			return isEqual;
		}
		
		EqualsHashcodeWithMap inputObj = (EqualsHashcodeWithMap) obj;
		if(id == inputObj.id) {
			isEqual = true;
		}
		
		return isEqual;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	public static void main(String[] args) {
		EqualsHashcodeWithMap element1 = new EqualsHashcodeWithMap(10, "name1");
		EqualsHashcodeWithMap element2 = new EqualsHashcodeWithMap(11, "name2");
		EqualsHashcodeWithMap element3 = new EqualsHashcodeWithMap(12, "name3");
		
		Map<EqualsHashcodeWithMap, String> map = new HashMap<>();
		map.put(element1, "value1");
		map.put(element2, "value2");
		map.put(element3, "value3");
		
		System.out.println("Size: " + map.size());
	}
}
