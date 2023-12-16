package X;

/* renamed from: X.1gN  reason: invalid class name */
public class AnonymousClass1gN extends C67743Qm {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C64773Ex A02;
    public final C56332ro A03;
    public final C64223Cq A04;
    public final C66543Lv A05;
    public final C56152rV A06;
    public final C54932pW A07;
    public final C66503Lr A08;
    public final C53022mQ A09;
    public final C30191m3 A0A;
    public final C56832sd A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018e, code lost:
        if (r2 == 148) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d0, code lost:
        r0 = r14.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r15, int r16) {
        /*
            r14 = this;
            r0 = 189(0xbd, float:2.65E-43)
            r1 = r16
            if (r1 != r0) goto L_0x0044
            java.lang.String r0 = "addressing_mode"
            r6 = 0
            java.lang.String r0 = r15.A0r(r0, r6)
            java.lang.String r5 = X.C381125t.A00(r0)
            X.36K r3 = X.AnonymousClass36K.A0D(r15)
            if (r3 == 0) goto L_0x0044
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r2 = r3.A0g(r0, r4)
            X.4uZ r2 = (X.C95814uZ) r2
            if (r2 == 0) goto L_0x01e4
            boolean r0 = X.C627336j.A0K(r2)
            if (r0 == 0) goto L_0x0045
            X.2pW r4 = r14.A07
            r1 = r2
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r4.A01(r1, r5)
            if (r0 == 0) goto L_0x0045
            X.3Lr r3 = r14.A08
            X.1fJ r2 = (X.C27991fJ) r2
            X.21x r0 = X.C373521x.LID_MIGRATION
            java.lang.String r1 = r0.contextString
            r0 = 5
            r3.A0E(r2, r1, r0)
        L_0x0044:
            return
        L_0x0045:
            java.lang.String r0 = "t"
            java.lang.String r4 = r15.A0r(r0, r6)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = X.C615531h.A04(r4, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "author"
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass36K.A0A(r3, r5, r4)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r7 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r4 = "author_phone_number"
            com.whatsapp.jid.Jid r8 = r3.A0g(r7, r4)
            com.whatsapp.jid.PhoneUserJid r8 = (com.whatsapp.jid.PhoneUserJid) r8
            boolean r4 = X.C627336j.A0L(r5)
            if (r4 == 0) goto L_0x0076
            if (r8 == 0) goto L_0x0076
            X.2mQ r7 = r14.A09
            r4 = r5
            X.1fH r4 = (X.C27981fH) r4
            r7.A00(r4, r8)
        L_0x0076:
            java.lang.String r7 = "id"
            java.lang.String r10 = r15.A0q(r7)
            java.lang.String r4 = "set"
            boolean r4 = X.AnonymousClass36K.A0W(r3, r4)
            if (r4 == 0) goto L_0x011f
            java.lang.String r4 = r3.A0r(r7, r6)
            r3 = -1
            int r9 = X.C615531h.A01(r4, r3)
        L_0x008e:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "ProfilePictureNotificationHandler/onProfilePhotoChange "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = " author:"
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = " photoId:"
            X.C18260x0.A0y(r3, r4, r9)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            boolean r3 = X.C627336j.A0L(r2)
            r8 = 0
            X.3Ex r11 = r14.A02
            if (r3 == 0) goto L_0x0117
            X.3ZH r3 = r11.A07(r2)
            if (r3 == 0) goto L_0x00bd
            r7.add(r3)
        L_0x00bd:
            r4 = r2
            X.1fH r4 = (X.C27981fH) r4
            X.2sM r3 = r11.A0G
            com.whatsapp.jid.PhoneUserJid r3 = r3.A02(r4)
            if (r3 == 0) goto L_0x00d1
            X.3ZH r3 = r11.A07(r3)
            if (r3 == 0) goto L_0x00d1
            r7.add(r3)
        L_0x00d1:
            X.2sr r3 = r14.A01
            com.whatsapp.jid.PhoneUserJid r3 = X.C56972sr.A04(r3)
            if (r3 == 0) goto L_0x0221
            java.util.Iterator r13 = r7.iterator()
        L_0x00dd:
            boolean r3 = r13.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x012a
            X.3ZH r4 = X.C18310x6.A0R(r13)
            int r3 = r4.A05
            if (r3 != r9) goto L_0x00f1
            int r3 = r4.A06
            if (r3 != r9) goto L_0x00f1
            goto L_0x00dd
        L_0x00f1:
            X.1m3 r12 = r14.A0A
            X.4uZ r11 = r4.A0H
            X.3Ex r3 = r12.A03
            X.3ZH r7 = r3.A0A(r11)
            int r3 = r7.A05
            if (r3 != r9) goto L_0x0103
            int r3 = r7.A06
            if (r3 == r9) goto L_0x00dd
        L_0x0103:
            r3 = -1
            if (r9 != r3) goto L_0x010c
            X.2pi r3 = r12.A06
            r3.A02(r11)
            goto L_0x00dd
        L_0x010c:
            X.2el r4 = r12.A00
            X.3cU r3 = new X.3cU
            r3.<init>(r7, r11, r12, r9)
            r4.A01(r3)
            goto L_0x00dd
        L_0x0117:
            X.3ZH r6 = r11.A0A(r2)
            r7.add(r6)
            goto L_0x00d1
        L_0x011f:
            java.lang.String r4 = "delete"
            boolean r4 = X.AnonymousClass36K.A0W(r3, r4)
            if (r4 == 0) goto L_0x01b8
            r9 = -1
            goto L_0x008e
        L_0x012a:
            if (r6 == 0) goto L_0x0044
            boolean r3 = r6.A0U()
            if (r3 == 0) goto L_0x0044
            int r3 = r6.A05
            if (r3 != r9) goto L_0x013b
            int r3 = r6.A06
            if (r3 != r9) goto L_0x013b
            return
        L_0x013b:
            X.2ro r3 = r14.A03
            java.io.File r6 = r3.A01(r6)
            if (r6 == 0) goto L_0x015d
            boolean r3 = r6.exists()
            if (r3 == 0) goto L_0x015d
            com.whatsapp.data.ProfilePhotoChange r8 = new com.whatsapp.data.ProfilePhotoChange
            r8.<init>()
            r8.newPhotoId = r9
            byte[] r3 = X.C382926u.A00(r6)     // Catch:{ IOException -> 0x0157 }
            r8.oldPhoto = r3     // Catch:{ IOException -> 0x0157 }
            goto L_0x015d
        L_0x0157:
            r6 = move-exception
            java.lang.String r3 = "app/xmpp/recv/handle_profile_photo_changed/"
            com.whatsapp.util.Log.w(r3, r6)
        L_0x015d:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            X.2z0 r6 = X.AnonymousClass2z0.A05(r2, r10, r4)
            X.1o7 r3 = new X.1o7
            r3.<init>(r6, r0)
            r0 = -1
            if (r9 != r0) goto L_0x01b3
            r0 = 0
        L_0x016d:
            r3.A1Z(r0)
            r3.A1J(r5)
            r3.A00 = r8
            X.2rV r0 = r14.A06
            X.34x r6 = r0.A00(r2)
            boolean r0 = r6 instanceof X.C30341mI
            if (r0 == 0) goto L_0x01ab
            X.1mI r6 = (X.C30341mI) r6
            int r2 = r6.A00
            r0 = 11
            if (r2 == r0) goto L_0x0190
            r0 = 143(0x8f, float:2.0E-43)
            if (r2 == r0) goto L_0x0190
            r0 = 148(0x94, float:2.07E-43)
            r1 = 0
            if (r2 != r0) goto L_0x0191
        L_0x0190:
            r1 = 1
        L_0x0191:
            X.4uZ r0 = r3.A0n()
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r6.A1v()
            if (r0 == 0) goto L_0x01b1
            X.4uZ r0 = r6.A0n()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01b1
        L_0x01a7:
            if (r1 == 0) goto L_0x01ab
            if (r4 != 0) goto L_0x0044
        L_0x01ab:
            X.3Lv r0 = r14.A05
            r0.A0V(r3)
            return
        L_0x01b1:
            r4 = 0
            goto L_0x01a7
        L_0x01b3:
            java.lang.String r0 = java.lang.Integer.toString(r9)
            goto L_0x016d
        L_0x01b8:
            java.lang.String r0 = "request"
            boolean r0 = X.AnonymousClass36K.A0W(r3, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfilePictureNotificationHandler/onProfilePhotoLost "
            X.C18260x0.A1R(r1, r0, r2)
            boolean r0 = X.AnonymousClass331.A00(r2)
            if (r0 != 0) goto L_0x0044
            X.2sr r0 = r14.A01
            X.1RR r1 = X.C56972sr.A01(r0)
            if (r1 == 0) goto L_0x0044
            boolean r0 = r0.A0a(r2)
            if (r0 == 0) goto L_0x0044
            X.1m3 r0 = r14.A0A
            r0.A0F(r1)
            return
        L_0x01e4:
            java.lang.String r0 = "hash"
            java.lang.String r1 = r3.A0r(r0, r6)
            if (r1 == 0) goto L_0x0228
            X.2xW r4 = X.C59812xW.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0044
            byte[] r1 = r1.getBytes()
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfilePictureNotificationHandler/handleSidelistNotification"
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r3)
            X.C18260x0.A1J(r1, r0)
            X.227 r1 = X.AnonymousClass227.A0J
            X.2zU r0 = new X.2zU
            r0.<init>(r1)
            r2 = 1
            r0.A02 = r2
            X.2zz r1 = X.C60982zU.A00(r0, r4, r3)
            X.3Cq r0 = r14.A04
            r0.A03(r1, r2)
            return
        L_0x0221:
            java.lang.String r0 = "local JID unknown"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0228:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfilePictureNotificationHandler/handleNotification/ignoring notification for invalid jid: "
            r1.append(r0)
            java.lang.String r0 = r3.A0r(r4, r6)
            X.C18260x0.A1M(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gN.A05(X.36K, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1gN(X.C55682qk r9, X.C56972sr r10, X.C64773Ex r11, X.C56332ro r12, X.C64223Cq r13, X.C66543Lv r14, X.C56152rV r15, X.C54932pW r16, X.C66503Lr r17, X.AnonymousClass31C r18, X.C55892r5 r19, X.C53022mQ r20, X.C30191m3 r21, X.C56832sd r22, X.AnonymousClass4FS r23) {
        /*
            r8 = this;
            int[] r6 = X.C18330xA.A0E()
            r1 = 0
            r0 = 189(0xbd, float:2.65E-43)
            r6[r1] = r0
            r7 = 1
            r1 = r8
            r2 = r9
            r3 = r18
            r4 = r19
            r5 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A00 = r9
            r8.A01 = r10
            r0 = r16
            r8.A07 = r0
            r8.A02 = r11
            r0 = r17
            r8.A08 = r0
            r8.A05 = r14
            r8.A06 = r15
            r8.A03 = r12
            r8.A04 = r13
            r0 = r21
            r8.A0A = r0
            r0 = r22
            r8.A0B = r0
            r0 = r20
            r8.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gN.<init>(X.2qk, X.2sr, X.3Ex, X.2ro, X.3Cq, X.3Lv, X.2rV, X.2pW, X.3Lr, X.31C, X.2r5, X.2mQ, X.1m3, X.2sd, X.4FS):void");
    }
}
