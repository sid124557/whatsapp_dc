package X;

/* renamed from: X.1rt  reason: invalid class name and case insensitive filesystem */
public class C32911rt extends C67063Nv {
    public final C54472om A00;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (X.AnonymousClass2z0.A0C(r15) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyD(X.C55032pg r14, X.C624134x r15) {
        /*
            r13 = this;
            boolean r2 = r15 instanceof X.C30751mx
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageTemplateGifSerializer: message type is not supported "
            X.C624134x.A0W(r15, r0, r1, r2)
            r8 = r15
            X.1mx r8 = (X.C30751mx) r8
            X.1A4 r4 = r14.A00
            X.19p r3 = X.AnonymousClass1A4.A03(r4)
            X.2om r5 = r13.A00
            X.6cX r0 = r4.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1EI r0 = r0.templateMessage_
            if (r0 != 0) goto L_0x0020
            X.1EI r0 = X.AnonymousClass1EI.DEFAULT_INSTANCE
        L_0x0020:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r0)
            int r1 = r2.titleCase_
            r0 = 4
            if (r1 != r0) goto L_0x0097
            java.lang.Object r0 = r2.title_
            X.6cX r0 = (X.C130786cX) r0
        L_0x002d:
            X.6c9 r6 = r0.A0H()
            X.19y r6 = (X.C209519y) r6
            boolean r10 = r14.A02()
            boolean r11 = r14.A03
            X.3Z2 r7 = r14.A01
            byte[] r9 = r14.A09
            boolean r12 = r14.A02
            X.19y r5 = r5.A01(r6, r7, r8, r9, r10, r11, r12)
            X.33C r6 = r8.A01
            if (r10 != 0) goto L_0x004e
            boolean r1 = X.AnonymousClass2z0.A0C(r15)
            r0 = 0
            if (r1 == 0) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            if (r6 == 0) goto L_0x00a4
            if (r0 != 0) goto L_0x0057
            byte[] r0 = r6.A0W
            if (r0 == 0) goto L_0x00a4
        L_0x0057:
            if (r5 == 0) goto L_0x00a4
            X.1ED r1 = X.C18290x4.A0S(r5)
            r2 = 1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.gifPlayback_ = r2
            int r1 = r6.A05
            if (r1 == r2) goto L_0x0094
            r0 = 2
            if (r1 == r0) goto L_0x0091
            X.22n r0 = X.C374122n.NONE
        L_0x006f:
            X.6cX r2 = X.C18320x8.A0C(r5)
            X.1ED r2 = (X.AnonymousClass1ED) r2
            int r0 = r0.value
            r2.gifAttribution_ = r0
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            X.2cm r0 = r8.A00
            if (r0 == 0) goto L_0x009a
            X.19q r2 = X.AnonymousClass28V.A00(r4, r0)
            X.1EK r1 = X.C67063Nv.A00(r2, r5)
            r0 = 4
            X.C67063Nv.A01(r4, r3, r2, r1, r0)
            return
        L_0x0091:
            X.22n r0 = X.C374122n.TENOR
            goto L_0x006f
        L_0x0094:
            X.22n r0 = X.C374122n.GIPHY
            goto L_0x006f
        L_0x0097:
            X.1ED r0 = X.AnonymousClass1ED.DEFAULT_INSTANCE
            goto L_0x002d
        L_0x009a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageTemplateGif: cannot send encrypted media message, "
            X.C624134x.A0U(r8, r0, r1)
            return
        L_0x00a4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type="
            X.C624134x.A0U(r8, r0, r1)
            r0 = 16
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32911rt.AyD(X.2pg, X.34x):void");
    }

    public C32911rt(C54472om r1, C625235k r2) {
        super(r2);
        this.A00 = r1;
    }
}
