package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.3PH  reason: invalid class name */
public final class AnonymousClass3PH implements AnonymousClass4D2 {
    public final void A00(AnonymousClass1A3 r5, C624134x r6) {
        AnonymousClass3ZC r0;
        AnonymousClass231 r02;
        if (AnonymousClass000.A1U(r6.A0A & ZipDecompressor.UNZIP_BUFFER_SIZE, ZipDecompressor.UNZIP_BUFFER_SIZE) && (r0 = r6.A0n) != null) {
            int A00 = AnonymousClass28B.A00(r0.hostStorage, r0.actualActors);
            if (A00 == 1) {
                r02 = AnonymousClass231.E2EE;
            } else if (A00 != 2) {
                r02 = AnonymousClass231.FB;
            } else {
                r02 = AnonymousClass231.BSP;
            }
            AnonymousClass1ES A0O = C18280x3.A0O(r5);
            A0O.bizPrivacyStatus_ = r02.value;
            A0O.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            String str = r6.A10;
            if (str != null) {
                AnonymousClass1ES A0X = C18310x6.A0X(r5);
                A0X.bitField0_ |= 33554432;
                A0X.verifiedBizName_ = str;
            }
        }
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public /* synthetic */ void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
    }
}
