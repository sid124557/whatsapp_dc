package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.9V0  reason: invalid class name */
public class AnonymousClass9V0 {
    public static final Map A01 = new WeakHashMap();
    public final AnonymousClass4C1 A00;

    public synchronized C194709Ue A00(Context context) {
        C194709Ue r0;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A01;
        r0 = (C194709Ue) map.get(context);
        if (r0 == null) {
            r0 = (C194709Ue) this.A00.get();
            map.put(context, r0);
        }
        return r0;
    }

    public AnonymousClass9V0(AnonymousClass4C1 r1) {
        this.A00 = r1;
    }
}
