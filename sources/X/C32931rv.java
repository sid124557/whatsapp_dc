package X;

/* renamed from: X.1rv  reason: invalid class name and case insensitive filesystem */
public class C32931rv extends C67063Nv {
    public final C59122wO A00;

    public void AyD(C55032pg r12, C624134x r13) {
        C130786cX r0;
        C47142cm r02;
        C624134x.A0W(r13, "FMessageTemplateLocationProtobuf: message type is not supported ", AnonymousClass001.A0o(), r13 instanceof C30981nY);
        C30981nY r8 = (C30981nY) r13;
        AnonymousClass1A4 r4 = r12.A00;
        C208619p A03 = AnonymousClass1A4.A03(r4);
        AnonymousClass1EI r03 = ((AnonymousClass1EU) r4.A00).templateMessage_;
        if (r03 == null) {
            r03 = AnonymousClass1EI.DEFAULT_INSTANCE;
        }
        AnonymousClass1EK A0V = AnonymousClass0x9.A0V(r03);
        if (A0V.titleCase_ == 5) {
            r0 = (C130786cX) A0V.title_;
        } else {
            r0 = C21991Dy.DEFAULT_INSTANCE;
        }
        AnonymousClass173 r6 = (AnonymousClass173) r0.A0H();
        this.A00.A01(r6, r12.A01, r8, r12.A09, r12.A03);
        if (r6 == null || (r02 = r8.A00) == null) {
            C624134x.A0U(r8, "FMessageTemplateLocation/buildE2eMessage/Error: cannot send encrypted template location message, ", AnonymousClass001.A0o());
            return;
        }
        C208719q A002 = AnonymousClass28V.A00(r4, r02);
        C67063Nv.A01(r4, A03, A002, C67063Nv.A00(A002, r6), 5);
    }

    public C32931rv(C59122wO r1, C625235k r2) {
        super(r2);
        this.A00 = r1;
    }
}
