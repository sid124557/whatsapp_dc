package X;

/* renamed from: X.9qE  reason: invalid class name and case insensitive filesystem */
public class C204979qE implements C84134Bd {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C204979qE(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        if (r0.getStickerIfSelected() == null) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r33) {
        /*
            r32 = this;
            r4 = r33
            r2 = r32
            int r0 = r2.A02
            if (r0 == 0) goto L_0x0024
            java.lang.Object r3 = r2.A00
            X.9DA r3 = (X.AnonymousClass9DA) r3
            boolean r2 = r2.A01
            X.7yw r4 = (X.C166587yw) r4
            r3.A0B = r4
            X.6hm r4 = (X.C133686hm) r4
            java.lang.String r0 = r3.A0a
            android.content.Intent r1 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0C(r3, r4, r0, r2)
            r0 = 1016(0x3f8, float:1.424E-42)
            if (r2 == 0) goto L_0x0020
            r0 = 1017(0x3f9, float:1.425E-42)
        L_0x0020:
            r3.startActivityForResult(r1, r0)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r1 = r2.A00
            X.9Bs r1 = (X.AnonymousClass9Bs) r1
            boolean r6 = r2.A01
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            X.99L r0 = r1.A0O
            r0.A0I = r4
            boolean r0 = r1.A7T()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r1.A0X
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            X.7yw r0 = r1.A0B
            X.6hx r3 = r0.A08
            X.C626936e.A06(r3)
            X.99H r3 = (X.AnonymousClass99H) r3
            if (r2 != 0) goto L_0x010c
            X.9AN r4 = r1.A0D
            java.lang.String r10 = r1.A0o
            X.39Q r5 = r1.A09
            X.99L r0 = r1.A0O
            java.lang.String r11 = r0.A0Q
            java.lang.String r12 = r0.A0R
            java.lang.String r13 = r0.A0O
            java.lang.String r14 = r0.A0P
            X.7yt r6 = r3.A06
            X.7yw r0 = r1.A0B
            java.lang.String r15 = r0.A0A
            X.9U1 r0 = r1.A0L
            java.util.HashMap r0 = r0.A08
            r16 = 0
            X.9AG r8 = r1.A08
            X.9ca r9 = r1.A0S
            X.9c0 r7 = new X.9c0
            r7.<init>(r1)
            r17 = r0
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0072:
            X.9B3 r3 = r1.A0V
            java.lang.String r2 = "send_p2p"
            int r0 = r1.A00
            r3.BKh(r2, r0)
            X.9B3 r4 = r1.A0V
            com.whatsapp.payments.ui.widget.PaymentView r0 = r1.A74()
            if (r0 == 0) goto L_0x008a
            X.39M r0 = r0.getStickerIfSelected()
            r3 = 1
            if (r0 != 0) goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            int r2 = r1.A00
            java.lang.String r0 = "is_sticker"
            r4.A08(r0, r3, r2)
            X.9U1 r0 = r1.A0L
            java.util.HashMap r7 = r0.A08
            X.7oG r3 = r1.A0f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "send button clicked and got method: "
            r2.append(r0)
            X.7yw r0 = r1.A0B
            r2.append(r0)
            java.lang.String r0 = " cred: "
            r2.append(r0)
            if (r7 == 0) goto L_0x010a
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00b5:
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r2)
            r3.A04(r0)
            X.7yw r0 = r1.A0B
            if (r0 == 0) goto L_0x0023
            if (r7 == 0) goto L_0x0023
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sending payment to: "
            r2.append(r0)
            X.4uZ r0 = r1.A0E
            X.C1899593h.A1I(r3, r0, r2)
            X.99L r5 = r1.A0O
            X.3QD r4 = X.AnonymousClass3QD.A00()
            X.9U1 r3 = r1.A0L
            java.lang.String r2 = "MPIN"
            r0 = 6
            java.lang.String r2 = r3.A06(r2, r7, r0)
            java.lang.String r0 = "pin"
            X.7yt r0 = X.C1899693i.A0G(r4, r2, r0)
            r5.A0D = r0
            X.99L r2 = r1.A0O
            java.lang.String r0 = r1.A0W
            r2.A0U = r0
            java.lang.String r0 = r1.A0Z
            r2.A0M = r0
            X.7yt r0 = r1.A0I
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r2.A0O = r0
            if (r6 == 0) goto L_0x00fe
            r1.A7A(r2)
        L_0x00fe:
            X.4FS r3 = r1.A04
            r2 = 2
            X.9od r0 = new X.9od
            r0.<init>(r1, r2)
            X.C18270x1.A0w(r0, r3)
            return
        L_0x010a:
            r0 = 0
            goto L_0x00b5
        L_0x010c:
            X.99L r2 = r1.A0O
            java.lang.String r0 = X.C1899693i.A0b(r1)
            r2.A0K = r0
            X.99L r14 = r1.A0O
            java.lang.String r0 = r1.A0W
            r14.A0U = r0
            X.7yJ r0 = r1.A0U
            if (r0 == 0) goto L_0x017e
            java.lang.String r13 = r0.A00
        L_0x0120:
            X.9AI r0 = r1.A0E
            r31 = r0
            X.7yt r0 = r3.A06
            r30 = r0
            X.7yw r0 = r1.A0B
            java.lang.String r0 = r0.A0A
            r17 = r0
            X.39Q r0 = r1.A09
            r29 = r0
            X.4Fi r0 = r1.A05
            X.3H6 r0 = (X.AnonymousClass3H6) r0
            java.lang.String r0 = r0.A04
            r16 = r0
            X.9U1 r0 = r1.A0L
            java.util.HashMap r15 = r0.A08
            X.7yt r12 = r1.A0G
            java.lang.String r11 = r1.A0g
            java.lang.String r10 = r1.A0Z
            java.lang.String r9 = r1.A0d
            java.lang.String r8 = r1.A0c
            java.lang.String r7 = r1.A0Y
            X.9AG r6 = r1.A08
            boolean r28 = X.AnonymousClass9DC.A17(r1)
            java.lang.String r5 = r1.A0o
            java.lang.String r4 = r1.A0S
            X.7yt r3 = r1.A0H
            r2 = 0
            X.9Kr r0 = new X.9Kr
            r0.<init>(r1, r2)
            r23 = r7
            r24 = r5
            r25 = r4
            r26 = r13
            r27 = r15
            r18 = r16
            r19 = r11
            r20 = r10
            r21 = r9
            r22 = r8
            r13 = r3
            r15 = r6
            r16 = r0
            r9 = r31
            r10 = r29
            r11 = r30
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x017e:
            r13 = 0
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204979qE.AwB(java.lang.Object):void");
    }
}
