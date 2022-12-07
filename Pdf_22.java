package pdfsorulari;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pdf_22 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list);
        ListIterator<Integer> it = list.listIterator();
        int idx = 0;
        while(it.hasNext()) {
            Integer el = it.next();
            if(idx>2) {
                break;
            }
            it.set(el = el*2);
            System.out.print(el + " ");
            idx++;
        }

//        List<String>list=new ArrayList<>();
//        list.add("AB");
//        list.add("CD");
//        list.add("EF");
//        ListIterator<String>it=list.listIterator();
//        if (it.nextIndex()!=-1){
//            while (it.hasNext()){
//                System.out.print(it.next()+" ");
//                it.add("ad");
//            }
//        } else System.out.println("Good Morning!");
//        System.out.println(list);

        //5
//        List<Integer>list=new ArrayList<>();
//        list.add(2);
//        list.add(13);
//        list.add(56);
//        list.add(23);
//        list.add(45);
//        list.add(14);
//        list.add(40);
//        ListIterator<Integer> listIterator=list.listIterator();
//        while (listIterator.hasNext()){
//            int sayi=listIterator.next();
//            if (listIterator.nextIndex()<8){
//                listIterator.set(sayi+5);
//            }
//        }
//        System.out.println(list);

        //4
//        List<Integer>list=new ArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(7);
//        list.add(11);
//        list.add(13);
//        list.add(35);
//        ListIterator listIterator=list.listIterator(list.size());
//        while (listIterator.hasPrevious()){
//            int sayi= (int) listIterator.previous();
//            System.out.print(sayi+" ");
//        }
//        System.out.println();

        //3
//        List<Integer>list=new ArrayList<>();
//        list.add(2);
//        list.add(13);
//        list.add(56);
//        list.add(23);
//        list.add(45);
//        list.add(14);
//        list.add(40);
//        ListIterator<Integer>iterator=list.listIterator();
//        while (iterator.hasNext()){
//            int sayi=iterator.next();
//            if (sayi<20 || sayi>40){
//                iterator.remove();
//            }
//        }
//        System.out.println(list);

        //2
//        List<String>list=new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        System.out.println(list);
//        ListIterator<String>iterator=list.listIterator();
//        while (iterator.hasNext()){
//            String str=iterator.next();
//            iterator.set(str+"X");
//        }
//        System.out.println(list);

        //1
//        List<String> list=new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        System.out.println(list);
//        Iterator<String>iterator=list.iterator();
//        while (iterator.hasNext())  {
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(list);



    }



}
