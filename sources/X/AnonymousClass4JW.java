package X;

/* renamed from: X.4JW  reason: invalid class name */
public class AnonymousClass4JW implements C202659mN {
    public Object A00;
    public final int A01;

    public AnonymousClass4JW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass1A4 B0Q(C55032pg r7, C624134x r8) {
        if (this.A01 != 0) {
            C624134x.A0W(r8, "FMessageStickerProtobuf/getPaymentNoteMessageBuilder wrong message passed: ", AnonymousClass001.A0o(), r8 instanceof AnonymousClass1nE);
            AnonymousClass1A4 A0R = C18300x5.A0R();
            C208519o A002 = ((AnonymousClass3OF) this.A00).A00(r7, (AnonymousClass1nE) r8);
            if (A002 != null) {
                A0R.A0G(A002);
            }
            return A0R;
        }
        AnonymousClass3OJ r4 = (AnonymousClass3OJ) this.A00;
        if (r8 instanceof C30481mW) {
            AnonymousClass1A4 A0R2 = C18300x5.A0R();
            AnonymousClass1EC r0 = ((AnonymousClass1EU) A0R2.A00).extendedTextMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1EC.DEFAULT_INSTANCE;
            }
            C207119a r3 = (C207119a) r0.A0H();
            if (r8.A13() != null) {
                String A13 = r8.A13();
                AnonymousClass1EC A0U = AnonymousClass0x7.A0U(r3);
                A13.getClass();
                A0U.bitField0_ |= 1;
                A0U.text_ = A13;
            }
            C55032pg.A01(r7, r4, r3, r8);
            A0R2.A0B(r3);
            return A0R2;
        }
        throw AnonymousClass001.A0c("FMessageTextSerializer/getPaymentNoteMessageBuilder wrong message passed");
    }
}
