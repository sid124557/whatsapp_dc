package X;

/* renamed from: X.1rr  reason: invalid class name and case insensitive filesystem */
public class C32891rr extends C67063Nv {
    public void AyD(C55032pg r7, C624134x r8) {
        C624134x.A0W(r8, "FMessageTemplateHsmProtobuf: message type is not supported ", AnonymousClass001.A0o(), r8 instanceof AnonymousClass1p5);
        AnonymousClass1p5 r82 = (AnonymousClass1p5) r8;
        AnonymousClass1A4 r5 = r7.A00;
        C208619p A03 = AnonymousClass1A4.A03(r5);
        C47142cm r0 = r82.A00;
        if (r0 != null) {
            C208719q A00 = AnonymousClass28V.A00(r5, r0);
            if (!C624134x.A0a(r82)) {
                String A13 = r82.A13();
                AnonymousClass1EK r1 = (AnonymousClass1EK) C18320x8.A0C(A00);
                A13.getClass();
                r1.titleCase_ = 2;
                r1.title_ = A13;
            }
            A03.A0A(A00);
            A03.A09(A00);
            r5.A0H(A03);
            return;
        }
        C624134x.A0U(r82, "MessageTemplateHsm: cannot send encrypted hsm title message, ", AnonymousClass001.A0o());
    }

    public C32891rr(C625235k r1) {
        super(r1);
    }
}
