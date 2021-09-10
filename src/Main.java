import java.util.*;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("Student list (order by name)");
		Student s1 = new Student(100,"Park",21);
        list.add(s1);
        Student s2 = new Student(101,"Kim",20);
        list.add(s2);
        list.add(new Student(102,"Choi",23));
        Student f3=new Student(103,"Lee",22);
    	list.add(f3);
    	Student f4=new Student(104,"Jung",22);
    	list.add(f4);
    	Student f5=new Student(105,"Kang",22);
    	list.add(f5);
    	Student f6=new Student(106,"Hwang",22);
    	list.add(f6);
    	Student f7=new Student(107,"Kim",22);
    	list.add(f7);
    	Student f8=new Student(108,"Choi",20);
    	list.add(f8);
    	Student f9=new Student(109,"Go",21);
    	list.add(f9);
    	Student f10=new Student(110,"Kim",22);
        Collections.sort(list);
        for(Student s : list) {
        	System.out.println(s.toString());
        }
        System.out.println("Student list (reverse order by name)");
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i = 0; i<list.size(); i++) {
        	System.out.println(list.get(i).toString());
        	
        }
	}

}

