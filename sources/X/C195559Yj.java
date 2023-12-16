package X;

import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.util.List;

/* renamed from: X.9Yj  reason: invalid class name and case insensitive filesystem */
public class C195559Yj implements StorageCallback {
    public final /* synthetic */ AnonymousClass9W5 A00;
    public final /* synthetic */ C195349Xk A01;
    public final /* synthetic */ List A02;

    public void onDecryptionFinish(boolean z, String str) {
        AnonymousClass9KQ r3;
        boolean z2 = z;
        if (!z) {
            C194579Tm r1 = new C194579Tm();
            r1.A00 = AnonymousClass9K2.ASSET_DECRYPTION_FAILURE;
            if (str == null) {
                str = "missing failure reason";
            }
            r1.A01 = str;
            r3 = r1.A00();
        } else {
            r3 = null;
        }
        AnonymousClass9W5 r0 = this.A00;
        List list = this.A02;
        r0.A09(AnonymousClass9JK.DECRYPT_END, this.A01, r3, list, -1, z2);
    }

    public void onEncodingFinish(boolean z, String str) {
        AnonymousClass9KQ r3;
        boolean z2 = z;
        if (!z) {
            C194579Tm r1 = new C194579Tm();
            r1.A00 = AnonymousClass9K2.ASSET_ENCODING_FAILURE;
            if (str == null) {
                str = "missing failure reason";
            }
            r1.A01 = str;
            r3 = r1.A00();
        } else {
            r3 = null;
        }
        AnonymousClass9W5 r0 = this.A00;
        List list = this.A02;
        r0.A09(AnonymousClass9JK.ENCODE_END, this.A01, r3, list, -1, z2);
    }

    public void onExtractionFinish(boolean z, String str) {
        AnonymousClass9KQ r3;
        boolean z2 = z;
        if (!z) {
            C194579Tm r1 = new C194579Tm();
            r1.A00 = AnonymousClass9K2.EXTRACTION_FAILED;
            if (str == null) {
                str = "missing failure reason";
            }
            r1.A01 = str;
            r3 = r1.A00();
        } else {
            r3 = null;
        }
        AnonymousClass9W5 r0 = this.A00;
        List list = this.A02;
        r0.A09(AnonymousClass9JK.EXTRACT_END, this.A01, r3, list, -1, z2);
    }

    public C195559Yj(AnonymousClass9W5 r1, C195349Xk r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public void onCachePutFinish(boolean z) {
        AnonymousClass9W5 r3 = this.A00;
        List list = this.A02;
        r3.A09(AnonymousClass9JK.CACHE_PUT_END, this.A01, (AnonymousClass9KQ) null, list, -1, z);
    }

    public void onCachePutStart() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.CACHE_PUT_START, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }

    public void onDecryptionOperationFinish() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.DECRYPT_OPERATION_FINISH, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }

    public void onDecryptionOperationStart() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.DECRYPT_OPERATION_START, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }

    public void onDecryptionStart() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.DECRYPT_START, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }

    public void onEncodingOperationFinish() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.ENCODE_OPERATION_END, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }

    public void onEncodingOperationStart() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.ENCODE_OPERATION_START, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }

    public void onEncodingStart() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.ENCODE_START, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }

    public void onExtractionStart() {
        AnonymousClass9W5 r4 = this.A00;
        List list = this.A02;
        r4.A09(AnonymousClass9JK.EXTRACT_START, this.A01, (AnonymousClass9KQ) null, list, -1, true);
    }
}
