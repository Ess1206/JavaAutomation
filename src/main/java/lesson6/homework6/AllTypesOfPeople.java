package lesson6.homework6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.xpath.SourceTree;

import javax.sound.midi.Soundbank;

/**
 * Created by Yevhen on 26.04.2017.
 */
public class AllTypesOfPeople {

    public static void main(String[] args) {

        Pupil pup = new Pupil("1","2","3","4","5","6","7");
        FootballPlayer foo = new FootballPlayer("f1", "f2", "f3", "f4", "f5", "f6");
        Employee emp = new Employee("e1","e2","e3","e4","e5","e6","e7");
        Student stu = new Student("s1","s2","s3","s4","s5","s6","s7");
        Teacher teach = new Teacher("t1", "t2", "t3", "t4", "t5");

        System.out.println(pup.getInfoPupil());
        System.out.println(foo.getInfoFootballPlayer());
        System.out.println(emp.getInfoEmployee());
        System.out.println(stu.getInfoStudent());
        System.out.println(teach.getInfoTeacher());

        System.out.println(pup.toString());

        System.out.println(emp.toString());




    }


}
