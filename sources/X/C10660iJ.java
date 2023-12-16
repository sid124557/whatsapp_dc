package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.0iJ  reason: invalid class name and case insensitive filesystem */
public class C10660iJ implements Runnable {
    public final /* synthetic */ AnonymousClass040 A00;

    public C10660iJ(AnonymousClass040 r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass040 r2 = this.A00;
        if ((r2.A00 & 1) != 0) {
            r2.A0R(0);
        }
        if ((r2.A00 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            r2.A0R(C627136h.A03);
        }
        r2.A0Y = false;
        r2.A00 = 0;
    }
}
