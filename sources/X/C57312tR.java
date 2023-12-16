package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.2tR  reason: invalid class name and case insensitive filesystem */
public class C57312tR {
    public static AnonymousClass1EU A00(AnonymousClass1VX r3, AnonymousClass1EU r4) {
        AnonymousClass1AL r0;
        if ((r4.bitField1_ & 16384) == 0 || !r3.A0Y(C58422vE.A02, 2802)) {
            int i = r4.bitField1_;
            if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                r0 = r4.viewOnceMessageV2_;
            } else {
                int i2 = r4.bitField0_;
                if ((268435456 & i2) != 0) {
                    r0 = r4.viewOnceMessage_;
                } else if (AnonymousClass000.A1S(i2 & Integer.MIN_VALUE)) {
                    r0 = r4.ephemeralMessage_;
                } else if ((i & 512) != 0) {
                    r0 = r4.documentWithCaptionMessage_;
                } else if ((i & DefaultCrypto.BUFFER_SIZE) != 0 && r3.A0Y(C58422vE.A02, 2189)) {
                    r0 = r4.editedMessage_;
                } else if (!AnonymousClass000.A1S(r4.bitField1_ & 4194304) || !r3.A0Y(C58422vE.A02, 4165)) {
                    return null;
                } else {
                    r0 = r4.botInvokeMessage_;
                }
            }
        } else {
            r0 = r4.viewOnceMessageV2Extension_;
        }
        if (r0 == null) {
            r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
        }
        AnonymousClass1EU r02 = r0.message_;
        if (r02 == null) {
            return AnonymousClass1EU.DEFAULT_INSTANCE;
        }
        return r02;
    }

    public static AnonymousClass1EU A01(AnonymousClass1VX r2, AnonymousClass1EU r3) {
        if (r2.A0Y(C58422vE.A02, 3334) && (r3.bitField1_ & AnonymousClass35S.A0F) != 0) {
            AnonymousClass1AL r0 = r3.groupMentionedMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            r3 = r0.message_;
            if (r3 == null) {
                r3 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
        }
        if (AnonymousClass000.A1S(r3.bitField0_ & Integer.MIN_VALUE)) {
            AnonymousClass1AL r02 = r3.ephemeralMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            r3 = r02.message_;
            if (r3 == null) {
                r3 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
        }
        if ((r3.bitField1_ & 1073741824) != 0) {
            AnonymousClass1BD r03 = r3.commentMessage_;
            if (r03 == null) {
                r03 = AnonymousClass1BD.DEFAULT_INSTANCE;
            }
            r3 = r03.message_;
            if (r3 == null) {
                r3 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
        }
        AnonymousClass1EU A00 = A00(r2, r3);
        if (A00 != null) {
            return A00;
        }
        return r3;
    }
}
