package X;

import com.facebook.cameracore.ardelivery.compression.tarbrotli.TarBrotliDecompressor;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.9M5  reason: invalid class name */
public class AnonymousClass9M5 {
    public static C202239lb A00;
    public static C202239lb A01;

    public static void A00() {
        if (A00 == null) {
            A00 = new TarBrotliDecompressor();
        }
        if (A01 == null) {
            A01 = new ZipDecompressor();
        }
    }
}
