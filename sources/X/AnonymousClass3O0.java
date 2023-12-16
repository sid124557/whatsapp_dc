package X;

/* renamed from: X.3O0  reason: invalid class name */
public class AnonymousClass3O0 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;
    public final C54472om A01;

    public void AyD(C55032pg r4, C624134x r5) {
        C18260x0.A0l(r5, "FMessagePushToVideoProtobuf: message type is not supported ", AnonymousClass001.A0o(), r5 instanceof C31951p9);
        AnonymousClass1A4 r2 = r4.A00;
        C209519y r1 = (C209519y) AnonymousClass0x7.A0X(r2).A0H();
        this.A01.A02(r4, r1, (AnonymousClass1nB) r5);
        AnonymousClass1EU A0T = C18290x4.A0T(r2);
        AnonymousClass1ED r0 = (AnonymousClass1ED) r1.A06();
        r0.getClass();
        A0T.ptvMessage_ = r0;
        A0T.bitField1_ |= 2097152;
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r3 = r6.A0B;
        if ((r3.bitField1_ & 2097152) == 0) {
            return null;
        }
        if (!this.A00.A0Y(C58422vE.A02, 3355)) {
            return r6.A03(0);
        }
        AnonymousClass1ED r4 = r3.ptvMessage_;
        if (r4 == null) {
            r4 = AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        C31951p9 r1 = new C31951p9(r6.A0D, r6.A05);
        C54472om.A00(r6, r4, r1, this.A01);
        return r1;
    }

    public AnonymousClass3O0(AnonymousClass1VX r1, C54472om r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
