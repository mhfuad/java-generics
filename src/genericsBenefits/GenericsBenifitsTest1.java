package genericsBenefits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class GenericsBenifitsTest1 {
    public static void main(String[] args) {

//        List list = new ArrayList();
//        list.add("X");
//        list.add("Y");
//        list.add(100);
//
//        Iterator<String> itr = list.iterator();
        //problem
//        while (itr.hasNext()){
//            String data = itr.next();
//            System.out.println(data);
//        }
        //solution
//        while (itr.hasNext()){
//            Object s = itr.next();
//            if (s instanceof String){
//                String data = (String)s;
//                System.out.println(data);
//            }else if(s instanceof Integer){
//                Integer data = (Integer)s;
//                System.out.println(data);
//            }else {
//                System.out.println(s);
//            }
//        }


        List<String> list = new ArrayList<String>();
        list.add("X");
        list.add("Y");
        //list.add(new Integer(100));

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String data = itr.next();
            System.out.println(data);
        }


    }
}
