package X;

/* renamed from: X.1SC  reason: invalid class name */
public final class AnonymousClass1SC extends AnonymousClass33W {
    public final C56972sr A00;
    public final C52392lP A01;
    public final AnonymousClass3ZF A02;

    public AnonymousClass1SC(C56972sr r10, C52392lP r11, C60642yt r12, AnonymousClass33J r13, AnonymousClass3ZF r14, String str, long j) {
        super(r12, r13, str, "regular", 7, j, false);
        this.A01 = r11;
        this.A02 = r14;
        this.A00 = r10;
    }

    public AnonymousClass18L A06() {
        AnonymousClass3ZF r1 = this.A02;
        if (r1 == null) {
            return super.A06();
        }
        AnonymousClass1E6 A022 = AnonymousClass35H.A02(this.A00, r1);
        AnonymousClass18L A06 = super.A06();
        if (A06 == null) {
            return null;
        }
        C130546c9 A0K = C18300x5.A0K(C21011Ae.DEFAULT_INSTANCE);
        C21011Ae r12 = (C21011Ae) A0K.A00;
        A022.getClass();
        r12.callLogRecord_ = A022;
        r12.bitField0_ |= 1;
        C21011Ae r0 = (C21011Ae) A0K.A06();
        AnonymousClass1EO A0W = C18290x4.A0W(A06, r0);
        A0W.callLogAction_ = r0;
        A0W.bitField1_ |= 8;
        return A06;
    }
}
