package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.2yd  reason: invalid class name and case insensitive filesystem */
public class C60482yd {
    public static final Map A01 = new WeakHashMap();
    public static final Map A02 = AnonymousClass001.A0t();
    public static final Map A03 = new WeakHashMap();
    public C54522or A00;

    public synchronized C54522or A00() {
        C54522or r0;
        r0 = this.A00;
        if (r0 == null) {
            r0 = new C54522or();
            this.A00 = r0;
        }
        return r0;
    }

    public synchronized C54522or A01(Context context) {
        C54522or r0;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A01;
        r0 = (C54522or) map.get(context);
        if (r0 == null) {
            r0 = new C54522or();
            map.put(context, r0);
        }
        return r0;
    }

    public synchronized C54522or A02(String str) {
        C54522or r0;
        Map map = A03;
        r0 = (C54522or) map.get(str);
        if (r0 == null) {
            r0 = new C54522or();
            map.put(str, r0);
        }
        return r0;
    }
}
