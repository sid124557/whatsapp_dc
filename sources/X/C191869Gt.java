package X;

import com.whatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.9Gt  reason: invalid class name and case insensitive filesystem */
public class C191869Gt extends AnonymousClass5ZM {
    public final int A00;
    public final int A01;
    public final C15810ry A02;
    public final C44232Ve A03;
    public final File A04;
    public final String A05;
    public final WeakReference A06;
    public final boolean A07;
    public final byte[] A08;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0160, code lost:
        if (r3 == null) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012a A[SYNTHETIC, Splitter:B:42:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014d A[SYNTHETIC, Splitter:B:53:0x014d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x011b=Splitter:B:39:0x011b, B:50:0x013e=Splitter:B:50:0x013e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r23) {
        /*
            r22 = this;
            java.lang.String r2 = "BloksStorePictureTask/ Error closing file: "
            java.lang.String r0 = "BloksStorePictureTask/doInBackground start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r22
            X.0ry r1 = r0.A02
            java.lang.Object r1 = r1.get()
            r12 = 0
            if (r1 == 0) goto L_0x0181
            java.io.File r4 = r0.A04     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0119, all -> 0x0173 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0119, all -> 0x0173 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0119, all -> 0x0173 }
            byte[] r1 = r0.A08     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r3.write(r1)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            java.lang.String r6 = r4.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            X.0YU r5 = new X.0YU     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r5.<init>((java.lang.String) r6)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r14 = 0
            int r6 = r5.A0G(r14)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r5 = 3
            if (r6 == r5) goto L_0x0040
            r5 = 6
            if (r6 == r5) goto L_0x003d
            r5 = 8
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 == r5) goto L_0x0042
            r7 = 0
            goto L_0x0042
        L_0x003d:
            r7 = 90
            goto L_0x0042
        L_0x0040:
            r7 = 180(0xb4, float:2.52E-43)
        L_0x0042:
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r5)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            android.graphics.Matrix r6 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            float r5 = (float) r7     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r6.postRotate(r5)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r16 = r13.getWidth()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r17 = r13.getHeight()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r19 = 1
            r15 = r14
            r18 = r6
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            boolean r5 = r0.A07     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            if (r5 == 0) goto L_0x00d3
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r15.getWidth()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r5 / 2
            float r9 = (float) r5     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r15.getHeight()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r5 / 2
            float r7 = (float) r5     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.postScale(r6, r5, r9, r7)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r18 = r15.getWidth()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r19 = r15.getHeight()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r21 = 1
            r17 = r14
            r16 = r14
            r20 = r8
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
        L_0x0096:
            int r6 = r0.A01     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r0.A00     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r9, r6, r5, r14)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            java.lang.ref.WeakReference r5 = r0.A06     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            java.lang.Object r11 = r5.get()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            com.whatsapp.bloks.BloksCameraOverlay r11 = (com.whatsapp.bloks.BloksCameraOverlay) r11     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r8 = r11.A05     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r11.A04     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r8 = r8 - r5
            int r7 = r11.A02     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r11.A06     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r7 = r7 - r5
            r10.getWidth()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r10.getHeight()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r6 = r11.A04     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            int r5 = r11.A06     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r10, r6, r5, r8, r7)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r10.recycle()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r15.recycle()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r9.recycle()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r10.recycle()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r13.recycle()     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0117, IOException -> 0x0115 }
            goto L_0x00d5
        L_0x00d3:
            r9 = r15
            goto L_0x0096
        L_0x00d5:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            java.lang.String r0 = r0.A05     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            java.lang.String r3 = X.AnonymousClass0x9.A0z(r0)     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            java.lang.String r0 = ".jpg"
            boolean r0 = r3.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = ".jpeg"
            boolean r0 = r3.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            if (r0 == 0) goto L_0x00f4
        L_0x00f2:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
        L_0x00f4:
            r0 = 75
            r6.compress(r4, r0, r7)     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            byte[] r0 = r7.toByteArray()     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            r5.write(r0)     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            r5.write(r1)     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            java.lang.String r0 = "BloksStorePictureTask/doInBackground end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0112, IOException -> 0x010f, all -> 0x010c }
            r5.close()     // Catch:{ IOException -> 0x0175 }
            return r12
        L_0x010c:
            r4 = move-exception
            r3 = r5
            goto L_0x0162
        L_0x010f:
            r4 = move-exception
            r3 = r5
            goto L_0x011b
        L_0x0112:
            r4 = move-exception
            r3 = r5
            goto L_0x013e
        L_0x0115:
            r4 = move-exception
            goto L_0x011b
        L_0x0117:
            r4 = move-exception
            goto L_0x013e
        L_0x0119:
            r4 = move-exception
            r3 = r12
        L_0x011b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "BloksStorePictureTask/ Error accessing file: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r4)     // Catch:{ all -> 0x015f }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x015f }
            if (r3 == 0) goto L_0x0181
            r3.close()     // Catch:{ IOException -> 0x012e }
            goto L_0x013b
        L_0x012e:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        L_0x013b:
            return r12
        L_0x013c:
            r4 = move-exception
            r3 = r12
        L_0x013e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "BloksStorePictureTask/ File not found: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r4)     // Catch:{ all -> 0x015f }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x015f }
            if (r3 == 0) goto L_0x0181
            r3.close()     // Catch:{ IOException -> 0x0151 }
            goto L_0x015e
        L_0x0151:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        L_0x015e:
            return r12
        L_0x015f:
            r4 = move-exception
            if (r3 == 0) goto L_0x0174
        L_0x0162:
            r3.close()     // Catch:{ IOException -> 0x0166 }
            throw r4
        L_0x0166:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            throw r4
        L_0x0173:
            r4 = move-exception
        L_0x0174:
            throw r4
        L_0x0175:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0181:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191869Gt.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Log.i("BloksStorePictureTask/onPostExecute start");
        AnonymousClass7H5 r2 = (AnonymousClass7H5) this.A02.get();
        if (r2 != null) {
            Object A052 = C162377rs.A05(r2.A00, r2.A01);
            A052.getClass();
            C179088ia r1 = (C179088ia) A052;
            C626936e.A06(r1);
            C196179aQ r12 = (C196179aQ) r1;
            r12.A0A = true;
            C196189aR.A01(r2, r12, this.A03);
        }
        Log.i("BloksStorePictureTask/onPostExecute end");
    }

    public C191869Gt(C15810ry r2, BloksCameraOverlay bloksCameraOverlay, C44232Ve r4, File file, String str, byte[] bArr, int i, int i2, boolean z) {
        this.A02 = r2;
        this.A08 = bArr;
        this.A07 = z;
        this.A04 = file;
        this.A05 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = AnonymousClass0x9.A14(bloksCameraOverlay);
        this.A03 = r4;
    }
}
