package O;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final /* synthetic */ class O {
    public static final ConcurrentMap instances = new ConcurrentHashMap();

    public static Object init(Class cls) {
        Object obj = instances.get(cls);
        if (obj != null) {
            return obj;
        }
        try {
            Object cast = cls.cast(cls.getDeclaredConstructors()[0].newInstance(new Object[0]));
            instances.put(cls, cast);
            return cast;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new RuntimeException(th.getMessage(), th.getCause());
        }
    }
}
