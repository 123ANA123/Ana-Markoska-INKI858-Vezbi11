package Zadaca3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		XmlCreator xml = new XmlCreator();
		List<Student> s = new ArrayList<Student>();
		s.add(new Student("Ana", "Markoska", 858));
		s.add(new Student("Kristina", "Kris", 9999));
		xml.createXMLFile("xml.xml", s);
	}

}
