package com.facebook.cameracore.ardelivery.compression.tarbrotli;

import X.AnonymousClass001;
import X.C194739Uh;
import X.C202239lb;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class TarBrotliDecompressor implements C202239lb {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native int unarchiveFile(String str, String str2);

    static {
        SoLoader.A06("tar-brotli-archive-native");
    }

    public C194739Uh decompress(String str, String str2) {
        StringBuilder sb;
        try {
            int unarchiveFile = unarchiveFile(str, str2);
            if (unarchiveFile == 0) {
                return new C194739Uh(new File(str2));
            }
            sb = AnonymousClass001.A0o();
            sb.append("Failed to decompress tar brotli, result code=");
            sb.append(unarchiveFile);
            return new C194739Uh(sb.toString());
        } catch (EffectsFrameworkException | RuntimeException e) {
            sb = AnonymousClass001.A0o();
            sb.append("Failed to decompress tar brotli: ");
            sb.append(e.getMessage());
        }
    }
}
