package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3NZ  reason: invalid class name */
public final class AnonymousClass3NZ implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r4, C624134x r5) {
        C18260x0.A0O(r5, r4);
        if (r5 instanceof C30241m8) {
            AnonymousClass1A4 r2 = r4.A00;
            C209419x A02 = AnonymousClass1A4.A02(r2);
            A02.A09(AnonymousClass23O.REQUEST_WELCOME_MESSAGE);
            r2.A0D(A02);
            return;
        }
        throw AnonymousClass001.A0c("FMessageRequestWelcomeProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r5) {
        AnonymousClass1EU A01 = C55962rC.A01(r5);
        if (!AnonymousClass000.A1S(A01.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return null;
        }
        AnonymousClass1EM r1 = A01.protocolMessage_;
        if (r1 == null) {
            r1 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        if ((r1.bitField0_ & 2) == 0) {
            return null;
        }
        AnonymousClass23O A00 = AnonymousClass23O.A00(r1.type_);
        if (A00 == null) {
            A00 = AnonymousClass23O.REVOKE;
        }
        if (A00 == AnonymousClass23O.REQUEST_WELCOME_MESSAGE) {
            return new C30241m8(r5.A0D, r5.A05);
        }
        return null;
    }
}
