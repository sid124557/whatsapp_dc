package com.whatsapp.filter;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass351;
import X.C106315Ym;
import X.C133846i2;
import X.C18260x0;
import X.C184318rb;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FilterUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r7 >= X.C106315Ym.A00.size()) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(android.graphics.Bitmap r5, X.C133846i2 r6, int r7, boolean r8) {
        /*
            r4 = 0
            if (r5 != 0) goto L_0x0009
            java.lang.String r0 = "FilterUtils/applyFilter/source is null"
        L_0x0005:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x0009:
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r3) goto L_0x0014
            java.lang.String r0 = "Invalid bitmap config."
            goto L_0x0005
        L_0x0014:
            if (r7 < 0) goto L_0x001f
            java.util.List r0 = X.C106315Ym.A00
            int r1 = r0.size()
            r0 = 1
            if (r7 < r1) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "FilterUtils/applyFilter/filterId is invalid"
            goto L_0x0005
        L_0x0025:
            android.graphics.Bitmap r2 = A01(r6, r7)     // Catch:{ OutOfMemoryError -> 0x0031 }
            if (r8 == 0) goto L_0x003b
            r0 = 1
            android.graphics.Bitmap r5 = r5.copy(r3, r0)     // Catch:{ OutOfMemoryError -> 0x0034 }
            goto L_0x003b
        L_0x0031:
            r1 = move-exception
            r2 = r4
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            java.lang.String r0 = "FilterUtils/applyFilter/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)
            r5 = r4
        L_0x003b:
            if (r5 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x004b
            boolean r0 = applyFilter(r2, r5)
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.recycle()
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            return r5
        L_0x004b:
            r0 = 0
            goto L_0x0043
        L_0x004d:
            if (r8 == 0) goto L_0x0054
            if (r5 == 0) goto L_0x0054
            r5.recycle()
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A00(android.graphics.Bitmap, X.6i2, int, boolean):android.graphics.Bitmap");
    }

    public static boolean A02(Bitmap bitmap, Bitmap bitmap2, C133846i2 r5, int i) {
        String str;
        if (bitmap == null) {
            str = "FilterUtils/applyFilterIntoBuffer/sourceImage is null";
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            str = "Invalid sourceImage config.";
        } else if (i < 0 || i >= C106315Ym.A00.size()) {
            str = "FilterUtils/applyFilterIntoBuffer/filterId is invalid";
        } else {
            Log.a(bitmap2.isMutable());
            try {
                Bitmap A01 = A01(r5, i);
                if (A01 != null) {
                    boolean applyFilterIntoBuffer = applyFilterIntoBuffer(A01, bitmap, bitmap2);
                    A01.recycle();
                    return applyFilterIntoBuffer;
                }
                return false;
            } catch (OutOfMemoryError e) {
                Log.e("FilterUtils/applyFilterIntoBuffer/OutOfMemoryError", e);
                return false;
            }
        }
        Log.e(str);
        return false;
    }

    public static native boolean applyFilter(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean applyFilterIntoBuffer(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    public static native boolean blurNative(Bitmap bitmap, int i, int i2);

    public static Bitmap A01(C133846i2 r5, int i) {
        FileInputStream fileInputStream;
        String str = C106315Ym.A00(i).A02;
        synchronized (r5) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            if (!r5.A0H()) {
                AnonymousClass351.A03(r5.A04, "FilterManager/Downloadable files are not ready and createLut is called, ui should have prevented calling this");
                r5.A0G((C184318rb) null, 0);
                return null;
            }
            Log.d("FilterManager/createLut/files are downloaded");
            File file = (File) r5.A0F().get(str);
            if (file == null || !file.exists()) {
                r5.A05();
                r5.A09(0, -1);
                C18260x0.A0r("FilterManager/createLut/Error getting downloaded file to compute bitmap for filterFileName=", str, AnonymousClass001.A0o());
                return null;
            }
            Log.d("FilterManager/createLut/Computing bitmap from downloaded file.");
            try {
                fileInputStream = new FileInputStream(file);
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
                fileInputStream.close();
                return decodeStream;
            } catch (IOException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A15(AnonymousClass0x7.A0p(file, "FilterManager/createLut/Could not get bitmap from downloaded file for ", A0o), A0o, e);
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }
}
