package X;

import java.lang.ref.WeakReference;

/* renamed from: X.04l  reason: invalid class name and case insensitive filesystem */
public final class C004404l extends C04540Or {
    public final WeakReference A00;

    public void A00() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null && ((AnonymousClass08S) weakReference.get()).A0I) {
            AnonymousClass08S r2 = (AnonymousClass08S) weakReference.get();
            AnonymousClass08M r1 = r2.A0D;
            if (r1 == null) {
                r1 = AnonymousClass08M.A01();
                r2.A0D = r1;
            }
            AnonymousClass08S.A00(r1, true);
        }
    }

    public void A01(int i, CharSequence charSequence) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null && !((AnonymousClass08S) weakReference.get()).A0J && ((AnonymousClass08S) weakReference.get()).A0I) {
            AnonymousClass08S r2 = (AnonymousClass08S) weakReference.get();
            AnonymousClass0OF r1 = new AnonymousClass0OF(i, charSequence);
            AnonymousClass08M r0 = r2.A08;
            if (r0 == null) {
                r0 = AnonymousClass08M.A01();
                r2.A08 = r0;
            }
            AnonymousClass08S.A00(r0, r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if ((r1 & 32768) != 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass0L0 r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r3 = r4.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r3.get()
            X.08S r0 = (X.AnonymousClass08S) r0
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0047
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0034
            X.0Wp r2 = r5.A01
            java.lang.Object r0 = r3.get()
            X.08S r0 = (X.AnonymousClass08S) r0
            int r1 = r0.A0D()
            r0 = r1 & 32767(0x7fff, float:4.5916E-41)
            if (r0 == 0) goto L_0x002e
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r0 = 2
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = -1
        L_0x002f:
            X.0L0 r5 = new X.0L0
            r5.<init>(r2, r0)
        L_0x0034:
            java.lang.Object r1 = r3.get()
            X.08S r1 = (X.AnonymousClass08S) r1
            X.08M r0 = r1.A0A
            if (r0 != 0) goto L_0x0044
            X.08M r0 = X.AnonymousClass08M.A01()
            r1.A0A = r0
        L_0x0044:
            X.AnonymousClass08S.A00(r0, r5)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004404l.A02(X.0L0):void");
    }

    public C004404l(AnonymousClass08S r2) {
        this.A00 = new WeakReference(r2);
    }
}
