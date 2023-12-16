package X;

/* renamed from: X.1sM  reason: invalid class name and case insensitive filesystem */
public final class C33051sM extends C626635z {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r7 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C52042kn A00(X.C56972sr r6, X.C95814uZ r7, X.AnonymousClass1ET r8, X.AnonymousClass2z0 r9, boolean r10) {
        /*
            java.lang.String r0 = r8.participant_
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A08(r0)
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0036
            X.4uZ r4 = r9.A00
            boolean r3 = X.C627336j.A0K(r4)
            boolean r0 = r8.fromMe_
            r2 = 0
            r1 = 0
            if (r0 == 0) goto L_0x0027
            if (r3 == 0) goto L_0x0032
            if (r7 == 0) goto L_0x0032
        L_0x001a:
            r5 = r7
        L_0x001b:
            java.lang.String r0 = r8.id_
            X.2z0 r1 = X.AnonymousClass2z0.A05(r4, r0, r2)
            X.2kn r0 = new X.2kn
            r0.<init>(r5, r1)
            return r0
        L_0x0027:
            boolean r0 = r6.A0a(r5)
            if (r0 != 0) goto L_0x0031
            if (r3 != 0) goto L_0x0034
            if (r10 != 0) goto L_0x0034
        L_0x0031:
            r2 = 1
        L_0x0032:
            r7 = r1
            goto L_0x001a
        L_0x0034:
            r7 = r5
            goto L_0x001a
        L_0x0036:
            boolean r2 = r8.fromMe_
            X.4uZ r4 = r9.A00
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33051sM.A00(X.2sr, X.4uZ, X.1ET, X.2z0, boolean):X.2kn");
    }

    public static C52042kn A01(C624134x r4) {
        if (!r4.A1B) {
            return null;
        }
        AnonymousClass2z0 r3 = r4.A1J;
        return new C52042kn(r3.A00, AnonymousClass2z0.A05(r4.A0n(), r3.A01, r3.A02));
    }

    public static void A02(C95814uZ r2, AnonymousClass1A1 r3, AnonymousClass2z0 r4, boolean z) {
        C95814uZ r1 = r4.A00;
        r3.A0C(C18300x5.A0i(r1));
        r3.A0A(r4.A01);
        boolean z2 = r4.A02;
        r3.A0D(z2);
        if (r2 == null) {
            return;
        }
        if ((!z2 && C627336j.A0K(r1)) || (r1 instanceof AnonymousClass1fS) || z) {
            r3.A0B(r2.getRawString());
        }
    }
}
