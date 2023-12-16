package X;

/* renamed from: X.1pS  reason: invalid class name and case insensitive filesystem */
public class C32031pS extends C68573Tr {
    public void AyC(C55032pg r9, C31901p2 r10) {
        C130786cX r0;
        super.AyC(r9, r10);
        AnonymousClass39N r2 = r10.A00;
        if (r2 != null && r2.A01 != null && r2.A05 == 2) {
            AnonymousClass1A4 r6 = r9.A00;
            C21521Cd r02 = ((AnonymousClass1EU) r6.A00).interactiveResponseMessage_;
            if (r02 == null) {
                r02 = C21521Cd.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            C21521Cd r1 = (C21521Cd) A0H.A00;
            if (r1.interactiveResponseMessageCase_ == 2) {
                r0 = (C130786cX) r1.interactiveResponseMessage_;
            } else {
                r0 = AnonymousClass1C9.DEFAULT_INSTANCE;
            }
            C130546c9 A0H2 = r0.A0H();
            AnonymousClass397 r3 = r2.A01;
            String str = r3.A00;
            if (str != null) {
                AnonymousClass1C9 r12 = (AnonymousClass1C9) C18320x8.A0C(A0H2);
                r12.bitField0_ |= 1;
                r12.name_ = str;
            }
            String str2 = r3.A01;
            if (str2 != null) {
                AnonymousClass1C9 r13 = (AnonymousClass1C9) C18320x8.A0C(A0H2);
                r13.bitField0_ |= 2;
                r13.paramsJson_ = str2;
            }
            C21521Cd r14 = (C21521Cd) C18320x8.A0C(A0H);
            C130786cX A06 = A0H2.A06();
            A06.getClass();
            r14.interactiveResponseMessage_ = A06;
            r14.interactiveResponseMessageCase_ = 2;
            C21521Cd r03 = (C21521Cd) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r6, r03);
            A0L.interactiveResponseMessage_ = r03;
            A0L.bitField1_ |= 32;
        }
    }

    public C32031pS(C59542x5 r1, AnonymousClass39N r2) {
        super(r1, r2);
    }
}
