package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.28c  reason: invalid class name and case insensitive filesystem */
public final class C385428c {
    public static final AnonymousClass23O A00(C55962rC r2) {
        AnonymousClass1EU A01 = C55962rC.A01(r2);
        if (!AnonymousClass000.A1S(A01.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return null;
        }
        AnonymousClass1EM r0 = A01.protocolMessage_;
        AnonymousClass1EM r1 = r0;
        if ((r0 == null && (r0 = AnonymousClass1EM.DEFAULT_INSTANCE) == null) || (r0.bitField0_ & 2) == 0) {
            return null;
        }
        if (r1 == null && (r1 = AnonymousClass1EM.DEFAULT_INSTANCE) == null) {
            return null;
        }
        AnonymousClass23O A00 = AnonymousClass23O.A00(r1.type_);
        if (A00 == null) {
            return AnonymousClass23O.REVOKE;
        }
        return A00;
    }
}
