package X;

/* renamed from: X.07g  reason: invalid class name and case insensitive filesystem */
public class C009307g extends AnonymousClass0OK {
    public final Object A00;
    public final Object A01;

    public final AnonymousClass0WL A02(Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass0WL r1 = AnonymousClass0VT.A00;
        if (r1.A0H(obj) || ((r1 = AnonymousClass0VT.A01) != null && r1.A0H(obj))) {
            return r1;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Transition ");
        A0o.append(obj);
        A0o.append(" for fragment ");
        A0o.append(this.A01.A04);
        throw AnonymousClass000.A0F(" is not a valid framework Transition or AndroidX Transition", A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 != X.C08310eF.A0p) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C009307g(X.AnonymousClass0QU r5, X.AnonymousClass0QW r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            X.0GJ r1 = r6.A01
            X.0GJ r0 = X.AnonymousClass0GJ.VISIBLE
            X.0eF r3 = r6.A04
            if (r1 != r0) goto L_0x003b
            X.0Mp r0 = r3.A0D
            if (r7 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A08
            java.lang.Object r0 = X.C08310eF.A0p
            if (r2 != r0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r4.A01 = r2
            if (r8 == 0) goto L_0x0034
            if (r7 == 0) goto L_0x002d
            X.0Mp r2 = r3.A0D
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r2.A0B
            java.lang.Object r0 = X.C08310eF.A0p
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A0A
        L_0x002a:
            r4.A00 = r1
            return
        L_0x002d:
            X.0Mp r0 = r3.A0D
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r0.A0A
            goto L_0x002a
        L_0x0034:
            r1 = 0
            goto L_0x002a
        L_0x0036:
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A07
            goto L_0x0018
        L_0x003b:
            if (r7 == 0) goto L_0x0017
            X.0Mp r1 = r3.A0D
            if (r1 == 0) goto L_0x0017
            java.lang.Object r2 = r1.A09
            java.lang.Object r0 = X.C08310eF.A0p
            if (r2 != r0) goto L_0x0018
            java.lang.Object r2 = r1.A07
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009307g.<init>(X.0QU, X.0QW, boolean, boolean):void");
    }
}
