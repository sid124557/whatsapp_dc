package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.35w  reason: invalid class name and case insensitive filesystem */
public class C626335w implements AnonymousClass4C5 {
    public Object A00;
    public final int A01;

    public C626335w(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Iterator iterator() {
        switch (this.A01) {
            case 0:
                return new C71973cy((Object[]) this.A00);
            case 1:
                return ((Iterable) this.A00).iterator();
            case 2:
                C71943cv r0 = new C71943cv();
                r0.A03 = C57702u4.A00(r0, r0, (AnonymousClass4GR) this.A00);
                return r0;
            case 3:
                return (Iterator) this.A00;
            default:
                List A02 = C829345m.A02((AnonymousClass4C5) this.A00);
                C162457s7.A0J(A02, 0);
                if (A02.size() > 1) {
                    Collections.sort(A02);
                }
                return A02.iterator();
        }
    }
}
