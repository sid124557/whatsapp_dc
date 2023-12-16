package X;

import java.util.Map;

/* renamed from: X.92d  reason: invalid class name and case insensitive filesystem */
public class C1896592d implements C834048g, AnonymousClass4GQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1896592d(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object invoke(Object obj) {
        if (2 - this.A02 != 0) {
            Map map = (Map) obj;
            map.put("rootHostHashCode", Integer.valueOf(((C159167lF) this.A00).A06.hashCode()));
            map.put("numMountableOutputs", Integer.valueOf(((C151847Wn) this.A01).A04.length));
        } else {
            ((AnonymousClass5YE) this.A01).A03();
            ((C114825nf) this.A00).BbR((C105425Uw) obj);
        }
        return C59022wD.A00;
    }
}
