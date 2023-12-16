package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3Nj  reason: invalid class name and case insensitive filesystem */
public class C66943Nj implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r4, C624134x r5) {
        if (r5 instanceof C30261mA) {
            AnonymousClass1A4 r2 = r4.A00;
            C209419x A02 = AnonymousClass1A4.A02(r2);
            A02.A09(AnonymousClass23O.SHARE_PHONE_NUMBER);
            r2.A0E((AnonymousClass1EM) A02.A06());
            return;
        }
        throw AnonymousClass001.A0c("FMessageSharePhoneNumberProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r5) {
        AnonymousClass1EU r1 = r5.A0B;
        if (!AnonymousClass000.A1S(r1.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return null;
        }
        AnonymousClass1EM r12 = r1.protocolMessage_;
        if (r12 == null) {
            r12 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 2) == 0) {
            return null;
        }
        AnonymousClass23O A00 = AnonymousClass23O.A00(r12.type_);
        if (A00 == null) {
            A00 = AnonymousClass23O.REVOKE;
        }
        if (A00 == AnonymousClass23O.SHARE_PHONE_NUMBER) {
            return new C30261mA(r5.A0D, r5.A05);
        }
        return null;
    }
}
