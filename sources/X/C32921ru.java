package X;

/* renamed from: X.1ru  reason: invalid class name and case insensitive filesystem */
public class C32921ru extends C67063Nv {
    public final C51992ki A00;

    public void AyD(C55032pg r7, C624134x r8) {
        C130786cX r0;
        C47142cm r02;
        C624134x.A0W(r8, "FMessageTemplateImageProtobuf: message type is not supported ", AnonymousClass001.A0o(), r8 instanceof AnonymousClass1n0);
        AnonymousClass1n0 r82 = (AnonymousClass1n0) r8;
        AnonymousClass1A4 r4 = r7.A00;
        C208619p A03 = AnonymousClass1A4.A03(r4);
        C51992ki r5 = this.A00;
        AnonymousClass1EI r03 = ((AnonymousClass1EU) r4.A00).templateMessage_;
        if (r03 == null) {
            r03 = AnonymousClass1EI.DEFAULT_INSTANCE;
        }
        AnonymousClass1EK A0V = AnonymousClass0x9.A0V(r03);
        if (A0V.titleCase_ == 3) {
            r0 = (C130786cX) A0V.title_;
        } else {
            r0 = AnonymousClass1EE.DEFAULT_INSTANCE;
        }
        C207219b A01 = r5.A01(r7, (C207219b) r0.A0H(), r82);
        if (A01 == null || (r02 = r82.A00) == null) {
            C624134x.A0U(r82, "MessageTemplateImage/buildE2eMessage: cannot send encrypted media message, ", AnonymousClass001.A0o());
            return;
        }
        C208719q A002 = AnonymousClass28V.A00(r4, r02);
        C67063Nv.A01(r4, A03, A002, C67063Nv.A00(A002, A01), 3);
    }

    public C32921ru(C51992ki r1, C625235k r2) {
        super(r2);
        this.A00 = r1;
    }
}
