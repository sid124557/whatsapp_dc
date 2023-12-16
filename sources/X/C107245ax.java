package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.5ax  reason: invalid class name and case insensitive filesystem */
public class C107245ax {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 == 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(android.graphics.Bitmap.Config r2, int r3, int r4) {
        /*
            int r3 = r3 * r4
            int[] r1 = X.AnonymousClass77U.A00
            int r0 = r2.ordinal()
            r2 = r1[r0]
            r0 = 1
            r1 = 4
            if (r2 == r0) goto L_0x0015
            r0 = 2
            if (r2 == r0) goto L_0x0014
            r0 = 3
            r1 = 1
            if (r2 != r0) goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            int r3 = r3 * r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107245ax.A01(android.graphics.Bitmap$Config, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (r13 < 0) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.AnonymousClass5WB r11, int r12, int r13) {
        /*
            r3 = 1
            if (r12 < 0) goto L_0x0006
            r2 = 1
            if (r13 >= 0) goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bitmaputils/wrong raw image/"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r13)
            X.C626936e.A0D(r2, r0)
            if (r2 != 0) goto L_0x001f
            return r3
        L_0x001f:
            android.graphics.BitmapFactory$Options r0 = r11.A02
            int r8 = r0.inSampleSize
            java.lang.Long r7 = r11.A03
            r6 = r12
            r5 = r13
            r4 = 1
            if (r7 != 0) goto L_0x0040
        L_0x002a:
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0033
            int r12 = java.lang.Math.max(r12, r13)
            r13 = r12
        L_0x0033:
            int r2 = java.lang.Math.max(r8, r4)
            int r1 = r11.A01
            int r0 = r11.A00
            int r0 = A00(r12, r13, r1, r0, r2)
            return r0
        L_0x0040:
            long r2 = (long) r6
            long r0 = (long) r5
            long r2 = r2 * r0
            long r9 = r7.longValue()
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            r1 = 2
            int r0 = r6 + -1
            int r0 = r0 / r1
            int r6 = r0 + 1
            int r0 = r5 + -1
            int r0 = r0 / r1
            int r5 = r0 + 1
            int r4 = r4 * 2
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107245ax.A02(X.5WB, int, int):int");
    }

    public static int A00(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i - 1) / i5) + 1;
        int i7 = ((i2 - 1) / i5) + 1;
        while (((i6 - 1) / 2) + 1 >= i3 && ((i7 - 1) / 2) + 1 >= i4) {
            i6 = ((i6 - 1) / 2) + 1;
            i7 = ((i7 - 1) / 2) + 1;
            i5 *= 2;
        }
        return i5;
    }

    public static Path A03(RectF rectF) {
        RectF rectF2 = new RectF(rectF);
        float min = Math.min(rectF2.width(), rectF2.height());
        rectF2.right = rectF2.left + min;
        rectF2.bottom = rectF2.top + min;
        Path A06 = AnonymousClass002.A06();
        A06.moveTo(rectF2.centerX(), rectF2.top);
        float f = rectF2.left;
        float f2 = rectF2.top;
        float f3 = f;
        float f4 = f2;
        A06.cubicTo(f, f2, f3, f4, f, rectF2.centerY());
        float f5 = rectF2.left;
        float f6 = rectF2.bottom;
        A06.cubicTo(f5, f6, f5, f6, rectF2.centerX(), rectF2.bottom);
        float f7 = rectF2.right;
        float f8 = rectF2.bottom;
        float f9 = f7;
        float f10 = f8;
        A06.cubicTo(f7, f8, f9, f10, f7, rectF2.centerY());
        float f11 = rectF2.right;
        float f12 = rectF2.top;
        A06.cubicTo(f11, f12, f11, f12, rectF2.centerX(), rectF2.top);
        A06.close();
        return A06;
    }

    public static AnonymousClass7KE A04(AnonymousClass5QA r1, AnonymousClass5WB r2, InputStream inputStream, boolean z) {
        try {
            return A05(r1, r2, C624535b.A05(new C146917Cc(inputStream).A00), z);
        } catch (IOException e) {
            Log.e("bitmaputils/decoder failed", e);
            return new AnonymousClass7KE(0, 0, (Bitmap) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7KE A05(X.AnonymousClass5QA r12, X.AnonymousClass5WB r13, byte[] r14, boolean r15) {
        /*
            android.graphics.BitmapFactory$Options r9 = r13.A02
            boolean r0 = r9.inJustDecodeBounds
            r8 = 0
            r1 = 1
            if (r0 != 0) goto L_0x000e
            r9.inJustDecodeBounds = r1
            int r0 = r14.length
            android.graphics.BitmapFactory.decodeByteArray(r14, r8, r0, r9)
        L_0x000e:
            int r6 = r9.outWidth
            int r5 = r9.outHeight
            r2 = 0
            if (r6 <= 0) goto L_0x00bf
            if (r5 <= 0) goto L_0x00bf
            int r0 = A02(r13, r6, r5)
            r9.inSampleSize = r0
            r9.inJustDecodeBounds = r8
            r9.inPurgeable = r1
            r9.inInputShareable = r1
            if (r15 != 0) goto L_0x0030
            int r0 = r14.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r14, r8, r0, r9)
        L_0x002a:
            X.7KE r0 = new X.7KE
            r0.<init>(r6, r5, r2)
            return r0
        L_0x0030:
            X.C626936e.A06(r12)
            r9.inMutable = r1
            int r3 = r9.outWidth
            int r1 = r9.outHeight
            X.0Qw r7 = r12.A00
            monitor-enter(r7)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00c6 }
            int r0 = A01(r0, r3, r1)     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c6 }
            java.util.TreeSet r11 = r12.A02     // Catch:{ all -> 0x00c6 }
            boolean r1 = X.C73723fy.A0U(r11, r0)     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x0054
            java.lang.Object r0 = r11.ceiling(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00c6 }
        L_0x0054:
            r10 = 0
            if (r0 == 0) goto L_0x008b
            int r1 = r0.intValue()     // Catch:{ all -> 0x00c6 }
            java.util.HashMap r0 = r12.A01     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x00c6 }
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x008b
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x008b
            java.lang.Object r1 = X.C73723fy.A01(r3)     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x008b
            r3.remove(r1)     // Catch:{ all -> 0x00c6 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0081
            r11.remove(r4)     // Catch:{ all -> 0x00c6 }
        L_0x0081:
            java.lang.Object r0 = r7.A05(r1)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x008b
            X.3Z6 r10 = X.AnonymousClass3Z6.A02(r0, r1)     // Catch:{ all -> 0x00c6 }
        L_0x008b:
            monitor-exit(r7)
            r4 = 0
            if (r10 == 0) goto L_0x009c
            java.lang.Object r3 = r10.first
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r2 = r10.second
            java.lang.String r2 = (java.lang.String) r2
            if (r3 == 0) goto L_0x009d
            r9.inBitmap = r3
            goto L_0x009d
        L_0x009c:
            r3 = r2
        L_0x009d:
            int r0 = r14.length     // Catch:{ IllegalArgumentException -> 0x00a3 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r14, r8, r0, r9)     // Catch:{ IllegalArgumentException -> 0x00a3 }
            goto L_0x00bc
        L_0x00a3:
            java.lang.String r0 = "bitmaputils/decode failed with bitmap pool"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r3 == 0) goto L_0x00bc
            if (r2 == 0) goto L_0x00bc
            monitor-enter(r7)
            r7.A08(r2, r3)     // Catch:{ all -> 0x00c6 }
            int r1 = r3.getWidth()     // Catch:{ all -> 0x00c6 }
            int r0 = r3.getHeight()     // Catch:{ all -> 0x00c6 }
            r12.A00(r1, r0, r2)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r7)
        L_0x00bc:
            r2 = r4
            goto L_0x002a
        L_0x00bf:
            java.lang.String r0 = "bitmaputils/decode bad image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x002a
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107245ax.A05(X.5QA, X.5WB, byte[], boolean):X.7KE");
    }

    public static AnonymousClass7KE A06(AnonymousClass5WB r5, File file) {
        BitmapFactory.Options options = r5.A02;
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap bitmap = null;
        if (i <= 0 || i2 <= 0) {
            Log.e("bitmapcache/decode bad image");
        } else {
            options.inSampleSize = A02(r5, i, i2);
            options.inJustDecodeBounds = false;
            try {
                bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            } catch (Throwable th) {
                Log.w("bitmaputils/error-on-decode-api21+", th);
            }
        }
        return new AnonymousClass7KE(i, i2, bitmap);
    }

    public static String A07(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        C624535b.A03(byteArrayOutputStream);
        return encodeToString;
    }
}
