package generic.genericmethods;


/**
 * 普通类里定义泛型方法
 */
public class MethodGeneric {
    public <T> T genericMethod(T... t) {
        return t[t.length / 2];
    }
}
