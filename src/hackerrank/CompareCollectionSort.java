package hackerrank;

import java.util.*;

/*
 * Output Format
 * After rearranging the students according to the above rules, print the first name of each student on a separate line.

 * Sample Input
5
33 Rumpa 3,68
85 Ashis 3,85
56 Samiha 3,75
19 Samara 3,75
22 Fahim 3,76
 *
 * Sample Output
 * Ashis
 * Fahim
 * Samara
 * Samiha
 * Rumpa
 *
 */

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

/*class LexicographicComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.getFname().compareToIgnoreCase(s2.getFname());
    }
}

class CgpaComparator implements Comparator<Student>{
    @Override
    public int compare (Student s1, Student s2){
        return s1.getCgpa() < s2.getCgpa()? 1 : s1.getCgpa()==s2.getCgpa()? 0 : -1;
    }
}
class IdComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getFname().equals(s2.getFname())){
            return s1.getId() < s2.getId()? -1 : 1;
        } else{return 0;}
    }
}*/
class CgpaComparator implements Comparator<Student> {
    double number = 0.001;

    @Override
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > number) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
        } else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return s1.getId() < s2.getId() ? -1 : 1;
        }

    }
}

public class CompareCollectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();


            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        /*Collections.sort(studentList, new LexicographicComparator());
        Collections.sort(studentList, new CgpaComparator());
        Collections.sort(studentList, new IdComparator());*/

        Collections.sort(studentList, new CgpaComparator());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
