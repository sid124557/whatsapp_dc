package X;

import com.whatsapp.push.RegistrationIntentService;
import java.util.Set;

/* renamed from: X.2iC  reason: invalid class name and case insensitive filesystem */
public final class C50452iC {
    public final C153167am A00;
    public final C46342bT A01;
    public final C65203Gp A02;
    public final C64773Ex A03;
    public final C56612sH A04;
    public final C54292oU A05;
    public final C56892sj A06;
    public final AnonymousClass3LP A07;
    public final AnonymousClass4FV A08;
    public final C45312Zn A09;
    public final AnonymousClass1R1 A0A;

    public final void A00(C95814uZ r5, AnonymousClass21R r6) {
        C18270x1.A14(r5, r6);
        A01(r5, r6, 0);
        C65203Gp r2 = this.A02;
        Set A042 = r2.A04(r5, 0, false);
        C162457s7.A0D(A042);
        if (this.A0A.A0g(r5)) {
            r2.A0O(A042);
        } else {
            r2.A0N(A042);
        }
        if (C627336j.A0K(r5)) {
            RegistrationIntentService.A02(this.A05.A00);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.1X3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.1W4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.1X3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.1X3} */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0154, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C95814uZ r28, X.AnonymousClass21R r29, long r30) {
        /*
            r27 = this;
            r9 = 0
            r8 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r17 = 0
            int r11 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            r16 = 0
            r25 = 3
            if (r11 == 0) goto L_0x0014
            r16 = 1
            r25 = 2
        L_0x0014:
            r6 = r27
            X.7am r1 = r6.A00
            int r5 = r29.ordinal()
            r24 = 0
            if (r5 == r9) goto L_0x002e
            r24 = 2
            if (r5 == r8) goto L_0x002e
            r0 = 3
            if (r5 == r0) goto L_0x002e
            r24 = 4
            r0 = 2
            if (r5 == r0) goto L_0x002e
            r24 = 3
        L_0x002e:
            r21 = 0
            r4 = 0
            r23 = r21
            r10 = r28
            r20 = r10
            r22 = r21
            r26 = r9
            r19 = r1
            r19.A02(r20, r21, r22, r23, r24, r25, r26)
            if (r11 == 0) goto L_0x017a
            r11 = -1
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x015a
            r2 = -1
        L_0x004a:
            X.2bT r1 = r6.A01
            r1.A03 = r2
            X.1a5 r12 = new X.1a5
            r12.<init>()
            X.3LP r0 = r6.A07
            boolean r0 = X.C57362tW.A00(r0, r10)
            if (r0 == 0) goto L_0x0063
            r0 = 0
            switch(r5) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0153;
                case 2: goto L_0x014f;
                default: goto L_0x005f;
            }
        L_0x005f:
            r12.A03 = r0
            r12.A04 = r7
        L_0x0063:
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            r12.A05 = r11
            r15 = 2
            if (r16 == 0) goto L_0x0149
            r0 = r7
        L_0x006d:
            r12.A00 = r0
            if (r16 == 0) goto L_0x0073
            r12.A01 = r7
        L_0x0073:
            r12.A02 = r7
            boolean r14 = X.C627336j.A0K(r10)
            if (r14 == 0) goto L_0x0146
            X.2sj r13 = r6.A06
            r5 = r10
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            boolean r0 = r13.A0C(r5)
            if (r0 == 0) goto L_0x0146
            r7 = 1
            int r0 = X.C56892sj.A00(r13, r5)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r12.A06 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r12.A02 = r0
        L_0x0097:
            boolean r0 = r10 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00a1
            java.lang.Integer r0 = X.C18290x4.A0a()
            r12.A02 = r0
        L_0x00a1:
            X.4FV r5 = r6.A08
            r5.BhA(r12)
            if (r7 == 0) goto L_0x0144
            X.2sj r12 = r6.A06
            X.1fJ r0 = X.AnonymousClass34R.A02(r10)
            X.33k r0 = X.C56892sj.A01(r12, r0)
            java.util.ArrayList r0 = r0.A0D()
            java.util.Iterator r13 = r0.iterator()
        L_0x00ba:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0144
            X.2zG r0 = X.C18320x8.A0G(r13)
            X.3Ex r7 = r12.A03
            com.whatsapp.jid.UserJid r0 = r0.A03
            X.3ZH r0 = r7.A07(r0)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x00ba
            r7 = 1
        L_0x00d5:
            if (r14 != 0) goto L_0x00e6
            X.3Ex r0 = r6.A03
            X.3ZH r0 = r0.A07(r10)
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x00e6
            r9 = 1
        L_0x00e6:
            if (r7 != 0) goto L_0x00ea
            if (r9 == 0) goto L_0x00fc
        L_0x00ea:
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            X.1W4 r2 = new X.1W4
            r2.<init>()
            java.lang.String r0 = r10.getRawString()
            r2.A00 = r0
        L_0x00f9:
            r5.BhB(r2)
        L_0x00fc:
            if (r16 == 0) goto L_0x0134
            if (r14 == 0) goto L_0x0130
            X.2Zn r6 = r6.A09
            r5 = r10
            X.1fJ r5 = (X.C27991fJ) r5
            X.C162457s7.A0J(r5, r4)
            X.1VX r3 = r6.A01
            r2 = 5245(0x147d, float:7.35E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r2)
            if (r0 == 0) goto L_0x0130
            X.1XV r2 = new X.1XV
            r2.<init>()
            java.lang.String r0 = r5.getRawString()
            r2.A01 = r0
            X.2qJ r0 = r6.A00
            com.whatsapp.jid.UserJid r0 = r0.A00(r5)
            java.lang.String r0 = X.C18290x4.A0n(r0)
            r2.A00 = r0
            X.4FV r0 = r6.A02
            r0.BhD(r2)
        L_0x0130:
            r1.A00(r10, r8)
            return
        L_0x0134:
            r8 = 2
            goto L_0x0130
        L_0x0136:
            X.1X3 r2 = new X.1X3
            r2.<init>()
            r2.A00 = r11
            java.lang.String r0 = r10.getRawString()
            r2.A01 = r0
            goto L_0x00f9
        L_0x0144:
            r7 = 0
            goto L_0x00d5
        L_0x0146:
            r7 = 0
            goto L_0x0097
        L_0x0149:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            goto L_0x006d
        L_0x014f:
            r0 = 3
            goto L_0x0154
        L_0x0151:
            r0 = 1
            goto L_0x0154
        L_0x0153:
            r0 = 2
        L_0x0154:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x005f
        L_0x015a:
            long r0 = java.lang.System.currentTimeMillis()
            long r14 = r30 - r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r30 - r0
            int[] r13 = X.AnonymousClass2BL.A00
            int r12 = r13.length
            r11 = 0
        L_0x016a:
            if (r11 >= r12) goto L_0x004a
            r0 = r13[r11]
            long r2 = (long) r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r0
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x004a
            int r11 = r11 + 1
            goto L_0x016a
        L_0x017a:
            r2 = 0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50452iC.A01(X.4uZ, X.21R, long):void");
    }

    public C50452iC(C153167am r2, C46342bT r3, C65203Gp r4, C64773Ex r5, C56612sH r6, C54292oU r7, C56892sj r8, AnonymousClass3LP r9, AnonymousClass4FV r10, C45312Zn r11, AnonymousClass1R1 r12) {
        C18260x0.A0f(r4, r7, r6, r12, r3);
        C162457s7.A0J(r11, 7);
        C18260x0.A0X(r8, r5, r10);
        C162457s7.A0J(r9, 11);
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A0A = r12;
        this.A01 = r3;
        this.A00 = r2;
        this.A09 = r11;
        this.A06 = r8;
        this.A03 = r5;
        this.A08 = r10;
        this.A07 = r9;
    }
}
