package com.whatsapp.media.transcode;

import android.graphics.Bitmap;
import java.io.IOException;

public class Mozjpeg {
    private native boolean compressToFile(Bitmap bitmap, String str, int i, boolean z, boolean z2, boolean z3);

    public void A00(Bitmap bitmap, String str, int i, boolean z, boolean z2, boolean z3) {
        try {
            compressToFile(bitmap, str, i, z, z2, z3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
