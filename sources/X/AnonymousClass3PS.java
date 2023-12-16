package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.3PS  reason: invalid class name */
public final class AnonymousClass3PS implements AnonymousClass4D2 {
    public static final void A00(AnonymousClass1ES r1, C624134x r2) {
        if ((r1.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 && r1.multicast_) {
            r2.A1B(64);
        }
        if ((r1.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0 && r1.urlNumber_) {
            r2.A1B(4);
        }
        if ((r1.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && r1.urlText_) {
            r2.A1B(2);
        }
    }

    public void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
        C18260x0.A0O(r2, r3);
        A00(r2, r3);
    }

    public /* synthetic */ void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
    }
}
