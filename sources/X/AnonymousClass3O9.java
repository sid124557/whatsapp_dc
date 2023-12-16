package X;

/* renamed from: X.3O9  reason: invalid class name */
public class AnonymousClass3O9 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass3NX A00;
    public final C59542x5 A01;
    public final C54472om A02;

    public void AyD(C55032pg r5, C624134x r6) {
        C18260x0.A0l(r6, "FMessageVideoProtobuf: message type is not supported ", AnonymousClass001.A0o(), r6 instanceof C31971pB);
        AnonymousClass1nB r62 = (AnonymousClass1nB) r6;
        if (C624134x.A0d(r62)) {
            AnonymousClass3NX.A00(new C85674He(this, 3), r5, r62);
            return;
        }
        AnonymousClass1A4 r3 = r5.A00;
        C209519y r1 = (C209519y) AnonymousClass0x7.A0X(r3).A0H();
        this.A02.A02(r5, r1, r62);
        if (!C624134x.A0c(r62) || C40802Hu.A01(r62) == null) {
            r3.A0I(r1);
            return;
        }
        C21801Df r0 = ((AnonymousClass1EU) r3.A00).buttonsMessage_;
        if (r0 == null) {
            r0 = C21801Df.DEFAULT_INSTANCE;
        }
        C208319m r2 = (C208319m) r0.A0H();
        C40802Hu.A00(r1, r2, r62).headerCase_ = 4;
        r2.A09(AnonymousClass23H.VIDEO);
        r3.A09((C21801Df) r2.A06());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r4.viewOnce_ == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgW(X.C55962rC r7) {
        /*
            r6 = this;
            X.1EU r1 = r7.A0B
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0039
            X.1ED r4 = r1.videoMessage_
            r3 = r4
            if (r4 != 0) goto L_0x0014
            X.1ED r4 = X.AnonymousClass1ED.DEFAULT_INSTANCE
        L_0x0014:
            boolean r2 = r4.gifPlayback_
            int r1 = r4.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0022
            boolean r1 = r4.viewOnce_
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r2 != 0) goto L_0x0039
            if (r0 != 0) goto L_0x0039
            if (r3 != 0) goto L_0x002b
            X.1ED r3 = X.AnonymousClass1ED.DEFAULT_INSTANCE
        L_0x002b:
            X.2z0 r2 = r7.A0D
            long r0 = r7.A05
            X.1pB r5 = new X.1pB
            r5.<init>(r2, r0)
            X.2om r0 = r6.A02
            X.C54472om.A00(r7, r3, r5, r0)
        L_0x0039:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3O9.BgW(X.2rC):X.34x");
    }

    public AnonymousClass3O9(AnonymousClass3NX r1, C59542x5 r2, C54472om r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
