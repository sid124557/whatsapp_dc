package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3Ss  reason: invalid class name and case insensitive filesystem */
public class C68323Ss implements AnonymousClass4EZ {
    public boolean A00;
    public final C95814uZ A01;
    public final AnonymousClass31C A02;
    public final AnonymousClass331 A03;

    public void BQs(String str) {
    }

    public void BSN(AnonymousClass36K r6, String str) {
        C69263Wi r2;
        int i;
        AnonymousClass331 r4 = this.A03;
        int A012 = C57492tj.A01(r6);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("profilephotohandler/request failed : ");
        A0o.append(A012);
        A0o.append(" | ");
        C95814uZ r22 = r4.A0G;
        C18260x0.A0o(r22, A0o);
        r4.A01(3);
        r4.A00 = true;
        r4.A0H.cancel();
        AnonymousClass331.A0M.remove(r4.A0K.toString());
        if (!r4.A01) {
            AnonymousClass3ZH A0A = r4.A07.A0A(r22);
            if (A012 != 401 || !A0A.A0U() || r4.A0D.A0C((GroupJid) A0A.A0I(GroupJid.class))) {
                r2 = r4.A05;
                i = 3;
            } else {
                r2 = r4.A05;
                i = 2;
            }
            r2.A0S(new C71563cJ(r4, A012, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        if (r7 != false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x004d
            X.36K r1 = X.AnonymousClass36K.A0D(r12)
            java.lang.String r0 = "picture"
            X.AnonymousClass36K.A0N(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r1, r0)
        L_0x0014:
            X.331 r3 = r11.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "profilephotohandler/request success : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.4uZ r8 = r3.A0G
            X.C18260x0.A0o(r8, r1)
            r7 = 1
            r3.A00 = r7
            X.3fV r0 = r3.A0H
            r0.cancel()
            java.util.HashMap r1 = X.AnonymousClass331.A0M
            java.lang.Long r0 = r3.A0K
            java.lang.String r0 = r0.toString()
            r1.remove(r0)
            r3.A01(r7)
            X.3Ex r0 = r3.A07
            X.3ZH r4 = r0.A0A(r8)
            r10 = -1
            if (r2 == 0) goto L_0x0053
            goto L_0x004f
        L_0x004d:
            r2 = 0
            goto L_0x0014
        L_0x004f:
            int r10 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0058 }
        L_0x0053:
            X.2pi r0 = r3.A0A     // Catch:{ NumberFormatException -> 0x0058 }
            r0.A00(r4, r10, r10)     // Catch:{ NumberFormatException -> 0x0058 }
        L_0x0058:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0101
            boolean r0 = r4.A0U()
            if (r0 == 0) goto L_0x00e1
            X.2ro r0 = r3.A09
            java.io.File r1 = r0.A01(r4)
            if (r1 == 0) goto L_0x008a
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x008a
            com.whatsapp.data.ProfilePhotoChange r9 = new com.whatsapp.data.ProfilePhotoChange
            r9.<init>()
            byte[] r0 = X.C382926u.A00(r1)     // Catch:{ IOException -> 0x007c }
            r9.oldPhoto = r0     // Catch:{ IOException -> 0x007c }
            goto L_0x0083
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "profilephotohandler/"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0083:
            byte[] r0 = r3.A03
            r9.newPhoto = r0
            r9.newPhotoId = r10
            goto L_0x008b
        L_0x008a:
            r9 = 0
        L_0x008b:
            X.2sd r6 = r3.A0J
            X.2sH r0 = r3.A0B
            long r0 = r0.A0H()
            X.2sr r2 = r3.A06
            com.whatsapp.jid.PhoneUserJid r5 = X.C56972sr.A05(r2)
            X.2z0 r2 = X.C56832sd.A01(r8, r6, r7)
            X.1o7 r6 = new X.1o7
            r6.<init>(r2, r0)
            r0 = -1
            if (r10 != r0) goto L_0x010c
            r0 = 0
        L_0x00a6:
            r6.A1Z(r0)
            r6.A1J(r5)
            r6.A00 = r9
            X.2rV r0 = r3.A0E
            X.34x r5 = r0.A00(r8)
            boolean r0 = r5 instanceof X.C30341mI
            if (r0 == 0) goto L_0x00dc
            X.1mI r5 = (X.C30341mI) r5
            int r1 = r5.A00
            r0 = 11
            boolean r2 = X.AnonymousClass000.A1U(r1, r0)
            X.4uZ r1 = r6.A0n()
            if (r1 == 0) goto L_0x010a
            boolean r0 = r5.A1v()
            if (r0 == 0) goto L_0x010a
            X.4uZ r0 = r5.A0n()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x010a
        L_0x00d8:
            if (r2 == 0) goto L_0x00dc
            if (r7 != 0) goto L_0x00e1
        L_0x00dc:
            X.3Lv r0 = r3.A0C
            r0.A0V(r6)
        L_0x00e1:
            byte[] r2 = r3.A02
            if (r2 != 0) goto L_0x0102
            byte[] r0 = r3.A03
            if (r0 != 0) goto L_0x0102
            X.2pi r1 = r3.A0A
            X.2ro r0 = r1.A06
            r0.A03(r4)
        L_0x00f0:
            X.2ro r0 = r1.A06
            r0.A04(r4)
            X.3Wi r2 = r3.A05
            r1 = 10
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0S(r0)
        L_0x0101:
            return
        L_0x0102:
            X.2pi r1 = r3.A0A
            byte[] r0 = r3.A03
            r1.A01(r4, r2, r0)
            goto L_0x00f0
        L_0x010a:
            r7 = 0
            goto L_0x00d8
        L_0x010c:
            java.lang.String r0 = java.lang.Integer.toString(r10)
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68323Ss.BdM(X.36K, java.lang.String):void");
    }

    public C68323Ss(C95814uZ r1, AnonymousClass31C r2, AnonymousClass331 r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }
}
