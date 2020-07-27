package generic.genericclassboundedtype;

/**
 * 限定类型参数的泛型方法
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
    }
}
