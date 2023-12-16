package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.6Nd  reason: invalid class name and case insensitive filesystem */
public class C126256Nd extends C126266Ne {
    public final AnonymousClass5HA A00;
    public final AnonymousClass7Lt A01;
    public final C180598lK A02;

    public /* synthetic */ C126256Nd(C180598lK r5) {
        AnonymousClass5HA r1;
        C180568lH r3 = (C180568lH) r5;
        AnonymousClass7Lt r0 = new AnonymousClass7Lt(r3);
        this.A02 = r5;
        this.A01 = r0;
        synchronized (AnonymousClass5HA.class) {
            r1 = AnonymousClass5HA.A01;
            if (r1 == null) {
                r1 = new AnonymousClass5HA();
                AnonymousClass5HA.A01 = r1;
            }
        }
        this.A00 = r1;
        A02(r3.B4Z());
        C100915Ct r32 = new C100915Ct(this);
        HashMap hashMap = r1.A00;
        List list = (List) hashMap.get(0);
        list = list == null ? AnonymousClass001.A0s() : list;
        list.add(r32);
        hashMap.put(0, list);
    }
}
