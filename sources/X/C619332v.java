package X;

import java.util.regex.Pattern;

/* renamed from: X.32v  reason: invalid class name and case insensitive filesystem */
public class C619332v {
    public static final C183538qC A03 = new C72333dY((Object) null, new AnonymousClass4KI(3));
    public static final C183538qC A04 = new C72333dY((Object) null, new AnonymousClass4KI(4));
    public final AnonymousClass36P A00;
    public final C56892sj A01;
    public final AnonymousClass2OK A02;

    public boolean A00(AnonymousClass3ZH r3) {
        if (this.A02.A00.A03(C66663Mh.A1u) == 20) {
            return true;
        }
        String A042 = AnonymousClass36P.A04(AnonymousClass3ZH.A01(r3));
        if (A042 == null) {
            return false;
        }
        return C18280x3.A1X(A042, (Pattern) A03.get());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.C95814uZ r5) {
        /*
            r4 = this;
            X.2OK r0 = r4.A02
            X.3Mh r1 = r0.A00
            X.1Ek r0 = X.C66663Mh.A1u
            int r1 = r1.A03(r0)
            r0 = 20
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            r3 = 1
            if (r0 == 0) goto L_0x0064
            boolean r0 = X.C627336j.A0K(r5)
            if (r0 == 0) goto L_0x0051
            X.1fJ r1 = X.AnonymousClass34R.A02(r5)
            X.2sj r0 = r4.A01
            X.33k r0 = X.C56892sj.A01(r0, r1)
            java.util.Map r0 = r0.A09
            java.util.Set r0 = r0.keySet()
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)
            X.8Nf r2 = r0.iterator()
        L_0x0031:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0064
            X.4uZ r0 = X.C18300x5.A0P(r2)
            java.lang.String r1 = X.AnonymousClass36P.A04(r0)
            if (r1 == 0) goto L_0x004f
            X.8qC r0 = A03
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C18280x3.A1X(r1, r0)
            if (r0 != 0) goto L_0x0031
        L_0x004f:
            r0 = 0
            return r0
        L_0x0051:
            java.lang.String r1 = X.AnonymousClass36P.A04(r5)
            if (r1 == 0) goto L_0x004f
            X.8qC r0 = A03
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C18280x3.A1X(r1, r0)
            return r0
        L_0x0064:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619332v.A01(X.4uZ):boolean");
    }

    public C619332v(AnonymousClass36P r1, C56892sj r2, AnonymousClass2OK r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
