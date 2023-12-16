package com.facebook.cameracore.mediapipeline.engine;

import X.C162457s7;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

public final class EngineImageUtil {
    public static final EngineImageUtil INSTANCE = new EngineImageUtil();

    public static final boolean getBytesFromByteArray(byte[] bArr, int i, ByteBuffer byteBuffer) {
        C162457s7.A0J(byteBuffer, 2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
            if (decodeByteArray != null) {
                decodeByteArray.copyPixelsToBuffer(byteBuffer);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final int[] getDimensionFromByteArray(byte[] bArr, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, i, options);
        return new int[]{options.outWidth, options.outHeight};
    }
}
