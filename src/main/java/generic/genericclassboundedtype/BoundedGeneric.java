package generic.genericclassboundedtype;

/**
 * 限定类型参数的泛型方法
 *
 * 就是在普通类的范型方法基础上进行了拓展，范型方法上范型类型进行上限的限定，使用关键字extends
 */
public class BoundedGeneric {

    public static <T extends Comparable> T min(T a, T b) {
        if (a.compareTo(b) > 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args){
        System.out.println(BoundedGeneric.min(12,22));
        System.out.println(BoundedGeneric.min("android","ios"));
    }
}
