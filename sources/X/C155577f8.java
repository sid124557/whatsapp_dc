package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7f8  reason: invalid class name and case insensitive filesystem */
public class C155577f8 {
    public static C162627sU A00;
    public static final Object A01 = AnonymousClass002.A0D();
    public static final ThreadLocal A02 = new ThreadLocal();
    public static final Map A03 = new HashMap(4);
    public static final WeakHashMap A04 = new WeakHashMap();

    public static AnonymousClass7JF A00(Context context, C184838sd r7) {
        AnonymousClass7JF r1 = null;
        synchronized (A01) {
            Map map = A03;
            Map map2 = (Map) map.get(context);
            if (map2 == null) {
                Context context2 = context;
                while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (!A04.containsKey(context2)) {
                    if (A00 == null) {
                        A00 = new C162627sU();
                        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(A00);
                    }
                    map2 = AnonymousClass001.A0t();
                    map.put(context, map2);
                }
            }
            Class BBU = r7.BBU();
            r1 = (AnonymousClass7JF) map2.get(BBU);
            if (r1 == null) {
                r1 = new AnonymousClass7JF(r7.getClass());
                map2.put(BBU, r1);
            }
        }
        return r1;
    }
}
