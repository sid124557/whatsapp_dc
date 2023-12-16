package androidx.lifecycle;

import X.AnonymousClass0GH;
import X.AnonymousClass0T1;
import X.C05960Vq;
import X.C15910sA;
import X.C17280vG;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Deprecated
public class ReflectiveGenericLifecycleObserver implements C17280vG {
    public final AnonymousClass0T1 A00;
    public final Object A01;

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        AnonymousClass0T1 r0 = this.A00;
        Object obj = this.A01;
        Map map = r0.A00;
        AnonymousClass0T1.A00(r4, r5, obj, (List) map.get(r4));
        AnonymousClass0T1.A00(r4, r5, obj, (List) map.get(AnonymousClass0GH.ON_ANY));
    }

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.A01 = obj;
        C05960Vq r2 = C05960Vq.A02;
        Class<?> cls = obj.getClass();
        AnonymousClass0T1 r0 = (AnonymousClass0T1) r2.A00.get(cls);
        this.A00 = r0 == null ? r2.A01(cls, (Method[]) null) : r0;
    }
}
