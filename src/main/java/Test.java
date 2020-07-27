import java.math.BigDecimal;
import java.util.*;


public class Test {


    public static void main(String[] a) {


//        String str1="01｜02｜03｜04";
//        String str2="05";
//
//
//        System.out.println(str1.contains(str2));
//        System.out.println(str1.contentEquals(str2));






//        List<String> arr=new ArrayList<String>();
//
//        arr.add("1");
//        arr.add("2");
//        arr.add("3");
//        arr.add("4");
//        arr.add("5");
//        arr.add("6");
//        arr.add("7");
//        arr.add("8");
//
//
//        List<String> arr1=new ArrayList<String>();
//
//        arr1.addAll(arr);
//
//
//        for (int i=0;i<arr.size();i++){
//            String s = arr.get(i);
//            if ("2".equals(s)){
//                arr1.remove(i);
//            }
//        }
//
//
//        System.out.println("arr:");
//        for (String s:arr){
//            System.out.println(s);
//        }
//
//
//        System.out.println("arr1:");
//        for (String s:arr1){
//            System.out.println(s);
//        }

//        List<String> list=new ArrayList<String>();
//        list.add("01");
//        list.add("03");
////        list.add(1,"02");
//
//
//        for (String s:list){
//            System.out.println(s+" ");
//        }




//        String content = "abc";
//        System.out.println(content.substring(0,content.length()-1));

//        System.out.println(new BigDecimal("2").divide(new BigDecimal("100")).toString());

//        Calendar calendar=Calendar.getInstance();
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        calendar.compareTo()

//        List<SelectedInfoModel> selectedInfoModels = getList();
//
//        System.out.println("排序前" + selectedInfoModels);
//
//        Collections.sort(selectedInfoModels, new Comparator<SelectedInfoModel>() {
//            public int compare(SelectedInfoModel o1, SelectedInfoModel o2) {
//                int sub_reduce_amount = o1.getSUB_REDUCE_AMOUNT();
//                int sub_reduce_amount1 = o2.getSUB_REDUCE_AMOUNT();
//                if (sub_reduce_amount - sub_reduce_amount1 == 0) {
//                    String power_user_id = o1.getPOWER_USER_ID();
//                    String power_user_id1 = o2.getPOWER_USER_ID();
//                    if (power_user_id.compareTo(power_user_id1) == 0) {
//                        return 0;
//                    } else if (power_user_id.compareTo(power_user_id1) < 0) {
//                        return -1;
//                    } else {
//                        return 1;
//                    }
//
//                } else if (sub_reduce_amount - sub_reduce_amount1 > 0) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        });
//        System.out.println("排序后" + selectedInfoModels);

//        String ed="0";
//        String new_ed=ed.replace("0","");
//        String new2_ed=new_ed.replace(".","");
//        System.out.println(new2_ed.length());


    }




    public int lengthOfLongestSubstring(String str){
        char[] chars=str.toCharArray();



        return 0;
    }
















    public static List<SelectedInfoModel> getList() {
        List<SelectedInfoModel> selectedInfoModels = new ArrayList<SelectedInfoModel>();

        for (int i = 0; i < 3; i++) {
            SelectedInfoModel selectedInfoModel = new SelectedInfoModel();
            if (i == 0) {
                selectedInfoModel.setPOWER_USER_ID("11234");
                selectedInfoModel.setSUB_REDUCE_AMOUNT(21);
            } else if (i == 1) {
                selectedInfoModel.setPOWER_USER_ID("11244");
                selectedInfoModel.setSUB_REDUCE_AMOUNT(9);
            } else {
                selectedInfoModel.setPOWER_USER_ID("10234");
                selectedInfoModel.setSUB_REDUCE_AMOUNT(16);
            }

            selectedInfoModels.add(selectedInfoModel);
        }

        return selectedInfoModels;
    }
}
