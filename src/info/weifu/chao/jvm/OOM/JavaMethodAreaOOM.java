package info.weifu.chao.jvm.OOM;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
/**
 * VM Args: -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m限制方法区大小
 */
public class JavaMethodAreaOOM {

    static class OOMClass{}

    public static void main(String[] args) {
        int i = 0;
        while (true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMClass.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o,args);
                }
            });
            System.out.println(i++);
            enhancer.create();
        }
    }

}
