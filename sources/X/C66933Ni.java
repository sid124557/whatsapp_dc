package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3Ni  reason: invalid class name and case insensitive filesystem */
public class C66933Ni implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r4, C624134x r5) {
        C18270x1.A16(r5, "Unexpected message type ", AnonymousClass001.A0o(), r5 instanceof C30371mL);
        AnonymousClass1A4 r1 = r4.A00;
        AnonymousClass1AV r0 = ((AnonymousClass1EU) r1.A00).requestPhoneNumberMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1AV.DEFAULT_INSTANCE;
        }
        AnonymousClass1AV r02 = (AnonymousClass1AV) r0.A0H().A06();
        AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r1, r02);
        A0L.requestPhoneNumberMessage_ = r02;
        A0L.bitField1_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public C624134x BgW(C55962rC r5) {
        if ((r5.A0B.bitField1_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            return new C30371mL(r5.A0D, r5.A05);
        }
        return null;
    }
}
