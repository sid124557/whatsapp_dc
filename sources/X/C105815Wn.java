package X;

import android.content.Context;

/* renamed from: X.5Wn  reason: invalid class name and case insensitive filesystem */
public final class C105815Wn {
    public AnonymousClass55Q A00;
    public final C69263Wi A01;
    public final C85244Fm A02;
    public final C29441ip A03;
    public final C66413Li A04;
    public final C44852Xs A05;
    public final AnonymousClass5G6 A06;
    public final C620633i A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass31C A09;
    public final AnonymousClass4FS A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r0.A04 != 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A00(android.content.Context r10, android.util.Pair r11, X.C105815Wn r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r5 = r13
            r1 = 1
            if (r11 == 0) goto L_0x0059
            java.lang.Object r0 = r11.first
            X.304 r0 = (X.AnonymousClass304) r0
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.A00()
            r7 = r0 ^ 1
        L_0x0010:
            r3 = 3
            if (r11 == 0) goto L_0x001e
            java.lang.Object r0 = r11.second
            X.2UJ r0 = (X.AnonymousClass2UJ) r0
            if (r0 == 0) goto L_0x001e
            int r0 = r0.A04
            r8 = 1
            if (r0 == r1) goto L_0x001f
        L_0x001e:
            r8 = 0
        L_0x001f:
            X.2Xs r2 = r12.A05
            r9 = r15
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2.A00(r1, r0, r3)
            r3 = 0
            if (r11 == 0) goto L_0x0057
            java.lang.Object r0 = r11.second
            X.2UJ r0 = (X.AnonymousClass2UJ) r0
            if (r0 == 0) goto L_0x0057
            com.whatsapp.jid.UserJid r4 = r0.A0D
        L_0x0038:
            java.lang.String r0 = X.AnonymousClass36P.A06(r4)
            if (r0 == 0) goto L_0x003f
            r5 = r0
        L_0x003f:
            X.C162457s7.A0H(r5)
            r6 = r14
            com.whatsapp.PhoneHyperLinkDialogFragment r2 = com.whatsapp.PhoneHyperLinkDialogFragment.A00(r4, r5, r6, r7, r8, r9)
            android.app.Activity r1 = X.C111095hX.A01(r10)
            X.4ea r1 = (X.C89654ea) r1
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0056
            r1.Bon(r2, r3)
        L_0x0056:
            return
        L_0x0057:
            r4 = r3
            goto L_0x0038
        L_0x0059:
            r7 = 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105815Wn.A00(android.content.Context, android.util.Pair, X.5Wn, java.lang.String, java.lang.String, boolean):void");
    }

    public final C88944b3 A01(Context context, C624134x r12, String str) {
        C624134x r8 = r12;
        C162457s7.A0J(r12, 2);
        Context context2 = context;
        if (context == null) {
            return null;
        }
        if (!this.A08.A0X(1215)) {
            return null;
        }
        C162457s7.A0J("tel", 1);
        String str2 = str;
        if (!str.startsWith("tel")) {
            return null;
        }
        return new C89274cC(context2, this.A01, this.A02, this, this.A07, r8, str2);
    }

    public C105815Wn(C69263Wi r1, C85244Fm r2, C29441ip r3, C66413Li r4, C44852Xs r5, AnonymousClass5G6 r6, C620633i r7, AnonymousClass1VX r8, AnonymousClass31C r9, AnonymousClass4FS r10) {
        C18260x0.A0f(r8, r1, r7, r2, r10);
        C18260x0.A0g(r3, r9, r4, r6, r5);
        this.A08 = r8;
        this.A01 = r1;
        this.A07 = r7;
        this.A02 = r2;
        this.A0A = r10;
        this.A03 = r3;
        this.A09 = r9;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
    }
}
