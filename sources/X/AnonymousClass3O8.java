package X;

/* renamed from: X.3O8  reason: invalid class name */
public class AnonymousClass3O8 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass3NX A00;
    public final C59542x5 A01;
    public final C51992ki A02;

    public void AyD(C55032pg r5, C624134x r6) {
        C624134x.A0W(r6, "FMessageImageProtobuf: message type is not supported ", AnonymousClass001.A0o(), r6 instanceof AnonymousClass1n2);
        AnonymousClass1nA r62 = (AnonymousClass1nA) r6;
        if (C624134x.A0d(r62)) {
            AnonymousClass3NX.A00(new C85674He(this, 2), r5, r62);
            return;
        }
        C51992ki r1 = this.A02;
        AnonymousClass1A4 r3 = r5.A00;
        AnonymousClass1EE r0 = ((AnonymousClass1EU) r3.A00).imageMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1EE.DEFAULT_INSTANCE;
        }
        C207219b A022 = r1.A02(r5, (C207219b) r0.A0H(), r62);
        if (A022 == null) {
            return;
        }
        if (!C624134x.A0c(r62) || C40802Hu.A01(r62) == null) {
            AnonymousClass1EE r02 = (AnonymousClass1EE) A022.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r3, r02);
            A0L.imageMessage_ = r02;
            A0L.bitField0_ |= 4;
            return;
        }
        C21801Df r03 = ((AnonymousClass1EU) r3.A00).buttonsMessage_;
        if (r03 == null) {
            r03 = C21801Df.DEFAULT_INSTANCE;
        }
        C208319m r2 = (C208319m) r03.A0H();
        C130786cX A06 = A022.A06();
        C21801Df A0T = AnonymousClass0x7.A0T(r2);
        A06.getClass();
        A0T.header_ = A06;
        A0T.headerCase_ = 3;
        r2.A09(AnonymousClass23H.IMAGE);
        AnonymousClass353.A03(r2, C40802Hu.A01(r62));
        r3.A09((C21801Df) r2.A06());
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r1 = r6.A0B;
        if ((r1.bitField0_ & 4) == 0) {
            return null;
        }
        AnonymousClass1EE r2 = r1.imageMessage_;
        AnonymousClass1EE r4 = r2;
        if (r2 == null) {
            r2 = AnonymousClass1EE.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 524288) != 0 && r2.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass1EE.DEFAULT_INSTANCE;
        }
        AnonymousClass1n2 r3 = new AnonymousClass1n2(r6.A0D, r6.A05);
        C51992ki.A00(r6, r4, r3, this.A02);
        return r3;
    }

    public AnonymousClass3O8(AnonymousClass3NX r1, C59542x5 r2, C51992ki r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
