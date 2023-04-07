package org.example.lec3;

public class CollectionDemo {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("john");
//        list.add(1);
//
//        for (String obj:list
//             ) {
//            String str =  obj;
//        }

        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("huhuhhoio");
        bin.setWetTrash(156641616);

        System.out.println("dry ="+ bin.getDryTrash()+"wet ="+bin.getWetTrash());
    }
}
