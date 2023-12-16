package X;

import java.util.Map;

/* renamed from: X.2ev  reason: invalid class name and case insensitive filesystem */
public class C48452ev {
    public final C183538qC A00;
    public final Map A01 = AnonymousClass0x7.A0y();

    public static void A00(C64773Ex r0, Object obj) {
        r0.A04.A01.remove(obj);
    }

    public AnonymousClass3ZH A01(C95814uZ r2) {
        Object obj;
        if (r2 instanceof C135216kJ) {
            obj = this.A00.get();
        } else {
            obj = this.A01.get(r2);
        }
        return (AnonymousClass3ZH) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass3ZH r4) {
        /*
            r3 = this;
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            com.whatsapp.jid.Jid r2 = r4.A0I(r0)
            if (r2 == 0) goto L_0x0015
            java.util.Map r1 = r3.A01
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x0015
            if (r0 == r4) goto L_0x0015
            r1.remove(r2)
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48452ev.A02(X.3ZH):void");
    }

    public C48452ev(C183538qC r2) {
        this.A00 = r2;
    }
}
