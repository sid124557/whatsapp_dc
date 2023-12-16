package X;

import java.util.List;

/* renamed from: X.3AI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AI implements C15630rg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C623734t A01;
    public final /* synthetic */ AnonymousClass227 A02;
    public final /* synthetic */ C25931bJ A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r8.A04(r1, r14) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r15 == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r5 != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r26) {
        /*
            r25 = this;
            r20 = r26
            r2 = r25
            X.34t r8 = r2.A01
            X.227 r0 = r2.A02
            r24 = r0
            boolean r13 = r2.A07
            boolean r12 = r2.A08
            boolean r11 = r2.A09
            boolean r10 = r2.A0A
            boolean r9 = r2.A0B
            boolean r7 = r2.A0C
            boolean r6 = r2.A0D
            boolean r0 = r2.A0E
            r23 = r0
            boolean r0 = r2.A05
            r22 = r0
            boolean r5 = r2.A06
            int r0 = r2.A00
            r21 = r0
            java.util.List r1 = r2.A04
            X.1bJ r4 = r2.A03
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            long r18 = android.os.SystemClock.elapsedRealtime()
            if (r13 == 0) goto L_0x0046
            if (r12 != 0) goto L_0x0046
            if (r11 != 0) goto L_0x0046
            if (r10 != 0) goto L_0x0046
            if (r9 != 0) goto L_0x0046
            if (r7 != 0) goto L_0x0046
            if (r6 != 0) goto L_0x0046
            r17 = 1
            if (r5 == 0) goto L_0x0048
        L_0x0046:
            r17 = 0
        L_0x0048:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.314 r0 = r8.A0E
            java.util.Set r14 = r0.A0B()
            java.util.Iterator r16 = r1.iterator()
        L_0x0056:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00d4
            X.3ZH r1 = X.C18310x6.A0R(r16)
            X.4uZ r2 = r1.A0H
            boolean r0 = X.C621733w.A02(r2)
            if (r0 != 0) goto L_0x0056
            boolean r0 = r2 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0073
            boolean r0 = r14.contains(r2)
            if (r0 != 0) goto L_0x0073
            goto L_0x0056
        L_0x0073:
            X.2k5 r0 = r1.A0F
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0083
        L_0x007f:
            r15 = 0
            if (r17 == 0) goto L_0x008b
            goto L_0x0056
        L_0x0083:
            boolean r0 = r8.A04(r1, r14)
            r15 = 1
            if (r0 != 0) goto L_0x008b
            goto L_0x007f
        L_0x008b:
            X.32q r2 = new X.32q
            r2.<init>((X.AnonymousClass3ZH) r1)
            r2.A0L = r12
            r2.A0J = r11
            r2.A0B = r10
            r2.A0G = r15
            if (r13 == 0) goto L_0x009d
            r0 = 1
            if (r15 != 0) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            r2.A0K = r0
            r2.A0E = r9
            r0 = r24
            int r0 = X.AnonymousClass227.A00(r1, r0)
            r2.A01 = r0
            r2.A0I = r7
            r2.A0F = r6
            r0 = r23
            r2.A0H = r0
            r0 = r22
            r2.A0N = r0
            r2.A0M = r5
            if (r10 == 0) goto L_0x00c1
            java.util.Map r1 = r8.A0Q
            com.whatsapp.jid.UserJid r0 = r2.A0P
            X.C618832q.A01(r8, r2, r0, r1)
        L_0x00c1:
            if (r9 == 0) goto L_0x00cd
            X.318 r1 = r8.A0I
            com.whatsapp.jid.UserJid r0 = r2.A0P
            long r0 = X.AnonymousClass318.A00(r2, r1, r0)
            r2.A02 = r0
        L_0x00cd:
            X.AnonymousClass0x2.A13(r8, r2, r7)
            X.C618832q.A02(r2, r3)
            goto L_0x0056
        L_0x00d4:
            boolean r0 = X.C25931bJ.A00(r4, r3)
            if (r0 == 0) goto L_0x00dd
            X.304 r0 = X.AnonymousClass304.A08
            return r0
        L_0x00dd:
            X.3Ta r5 = r8.A02()
            java.lang.String r2 = "sync_sid_full"
            r1 = r24
            r0 = r21
            java.util.concurrent.Future r1 = X.C59512x2.A01(r1, r5, r2, r3, r0)
            r0 = r20
            boolean r0 = r8.A05(r4, r0, r1)
            if (r0 != 0) goto L_0x00f7
            X.304 r0 = X.AnonymousClass304.A03
            return r0
        L_0x00f7:
            r0 = r18
            X.C41402Kc.A00(r8, r4, r3, r0)
            X.304 r0 = X.AnonymousClass304.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AI.apply(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ AnonymousClass3AI(C623734t r1, AnonymousClass227 r2, C25931bJ r3, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A01 = r1;
        this.A02 = r2;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A0B = z5;
        this.A0C = z6;
        this.A0D = z7;
        this.A0E = z8;
        this.A05 = z9;
        this.A06 = z10;
        this.A00 = i;
        this.A04 = list;
        this.A03 = r3;
    }
}
