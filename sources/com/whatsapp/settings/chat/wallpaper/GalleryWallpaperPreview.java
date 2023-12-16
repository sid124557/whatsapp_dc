package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.C107695bk;
import X.C32511r1;
import X.C623834u;
import X.C64333Db;
import X.C989053r;
import android.net.Uri;
import android.view.MenuItem;
import com.whatsapp.mediaview.PhotoView;

public class GalleryWallpaperPreview extends C32511r1 {
    public int A00;
    public Uri A01;
    public PhotoView A02;
    public C623834u A03;
    public C989053r A04;
    public boolean A05;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = C64333Db.A26(A002);
            this.A02 = C64333Db.A28(A002);
            this.A04 = (C989053r) A002.AJl.get();
            this.A03 = (C623834u) r1.AC9.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035 A[Catch:{ FileNotFoundException -> 0x00b3, all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b A[Catch:{ FileNotFoundException -> 0x00b3, all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[Catch:{ FileNotFoundException -> 0x00b3, all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0043 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A77(X.C95814uZ r13) {
        /*
            r12 = this;
            java.lang.String r6 = "io-error"
            android.net.Uri r0 = r12.A01
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/no uri found to save to. generating our own"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.34u r0 = r12.A03
            android.net.Uri r0 = r0.A05()
            r12.A01 = r0
        L_0x0013:
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x00da
            android.net.Uri r0 = r12.A01
            java.io.File r11 = X.C18310x6.A0a(r0)
            com.whatsapp.mediaview.PhotoView r0 = r12.A02
            android.graphics.Bitmap r10 = r0.getFullViewCroppedBitmap()
            X.C626936e.A06(r10)
            r4 = 0
            r9 = 90
        L_0x002b:
            r5 = 1
            r3 = 0
            X.33i r0 = r12.A08     // Catch:{ FileNotFoundException -> 0x00b3 }
            X.5UR r1 = r0.A0R()     // Catch:{ FileNotFoundException -> 0x00b3 }
            if (r1 != 0) goto L_0x003b
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/save cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x00b3 }
            goto L_0x0041
        L_0x003b:
            android.net.Uri r0 = r12.A01     // Catch:{ FileNotFoundException -> 0x00b3 }
            java.io.OutputStream r4 = r1.A07(r0)     // Catch:{ FileNotFoundException -> 0x00b3 }
        L_0x0041:
            if (r4 != 0) goto L_0x0044
            goto L_0x008d
        L_0x0044:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x00b3 }
            r10.compress(r0, r9, r4)     // Catch:{ FileNotFoundException -> 0x00b3 }
            int r9 = r9 + -10
            X.C624535b.A03(r4)
            int r0 = r12.A00
            if (r0 <= 0) goto L_0x0065
            if (r9 <= 0) goto L_0x0065
            boolean r0 = r11.exists()
            if (r0 == 0) goto L_0x0065
            long r7 = r11.length()
            int r0 = r12.A00
            long r0 = (long) r0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x002b
        L_0x0065:
            long r1 = r11.length()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00ab
            X.2zf r0 = r12.A07
            long r1 = r0.A02()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/no space to save compressed image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "no-space"
            android.content.Intent r0 = r1.putExtra(r0, r5)
            r12.setResult(r3, r0)
            return
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ FileNotFoundException -> 0x00b3 }
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/failed to open output stream for "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x00b3 }
            android.net.Uri r0 = r12.A01     // Catch:{ FileNotFoundException -> 0x00b3 }
            java.lang.String r0 = r0.getPath()     // Catch:{ FileNotFoundException -> 0x00b3 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b3 }
            android.content.Intent r0 = X.C18320x8.A07()     // Catch:{ FileNotFoundException -> 0x00b3 }
            android.content.Intent r0 = r0.putExtra(r6, r5)     // Catch:{ FileNotFoundException -> 0x00b3 }
            r12.setResult(r3, r0)     // Catch:{ FileNotFoundException -> 0x00b3 }
            goto L_0x00d1
        L_0x00ab:
            X.3Wi r1 = r12.A05
            r0 = 42
            X.C69263Wi.A05(r1, r12, r13, r0)
            return
        L_0x00b3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/file not found at "
            r1.append(r0)     // Catch:{ all -> 0x00d5 }
            android.net.Uri r0 = r12.A01     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x00d5 }
            X.C18260x0.A15(r0, r1, r2)     // Catch:{ all -> 0x00d5 }
            android.content.Intent r0 = X.C18320x8.A07()     // Catch:{ all -> 0x00d5 }
            android.content.Intent r0 = r0.putExtra(r6, r5)     // Catch:{ all -> 0x00d5 }
            r12.setResult(r3, r0)     // Catch:{ all -> 0x00d5 }
        L_0x00d1:
            X.C624535b.A03(r4)
            return
        L_0x00d5:
            r0 = move-exception
            X.C624535b.A03(r4)
            throw r0
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview.A77(X.4uZ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01a0, code lost:
        if (r5 != null) goto L_0x01a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r2 = r22
            r0 = r23
            super.onCreate(r0)
            r0 = 2131434840(0x7f0b1d58, float:1.8491505E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r2.A02 = r0
            r0 = 2131428510(0x7f0b049e, float:1.8478667E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 35
            X.C634139d.A00(r1, r2, r0)
            r0 = 2131432603(0x7f0b149b, float:1.8486968E38)
            android.view.View r8 = r2.findViewById(r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r0 = -1
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r0, r0)
            X.2sH r3 = r2.A06
            X.2sr r0 = r2.A01
            r1 = 0
            r5 = 0
            java.lang.String r0 = X.AnonymousClass35J.A02(r0, r3)
            X.2z0 r3 = X.AnonymousClass2z0.A05(r1, r0, r5)
            X.2sH r0 = r2.A06
            long r0 = r0.A0H()
            X.1mW r7 = new X.1mW
            r7.<init>(r3, r0)
            r0 = 2131895477(0x7f1224b5, float:1.9425788E38)
            java.lang.String r0 = r2.getString(r0)
            r7.A1Z(r0)
            X.2sH r3 = r2.A06
            X.2sr r0 = r2.A01
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)
            r4 = 1
            r15 = 1
            java.lang.String r0 = X.AnonymousClass35J.A02(r0, r3)
            X.2z0 r3 = X.AnonymousClass2z0.A05(r1, r0, r4)
            X.2sH r0 = r2.A06
            long r0 = r0.A0H()
            X.1mW r6 = new X.1mW
            r6.<init>(r3, r0)
            java.lang.String r0 = r2.A75()
            r6.A1Z(r0)
            r0 = 5
            r6.A1G(r0)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r2)
            r3.setBackgroundResource(r5)
            r3.setLayoutParams(r9)
            r3.setOrientation(r4)
            X.4nc r1 = new X.4nc
            r1.<init>(r2, r7)
            r1.A1s(r4)
            r1.setEnabled(r5)
            r1.setClickable(r5)
            X.4nc r0 = new X.4nc
            r0.<init>(r2, r6)
            r0.A1s(r5)
            r0.setEnabled(r5)
            r0.setClickable(r5)
            r3.addView(r1)
            r3.addView(r0)
            r3.setClickable(r5)
            r8.addView(r3)
            android.content.Intent r0 = r2.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = "output"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r2.A01 = r0
            java.lang.String r0 = "maxFileSize"
            int r0 = r1.getInt(r0, r5)
            r2.A00 = r0
        L_0x00cb:
            android.content.Intent r0 = r2.getIntent()
            android.net.Uri r5 = r0.getData()
            java.lang.String r3 = "io-error"
            r10 = 0
            if (r5 != 0) goto L_0x00ec
            java.lang.String r0 = "gallerywallpaperpreview/no uri found in intent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r0 = X.C18320x8.A07()
        L_0x00e1:
            android.content.Intent r0 = r0.putExtra(r3, r15)
        L_0x00e5:
            r2.setResult(r10, r0)
            r2.finish()
            return
        L_0x00ec:
            android.graphics.Point r1 = X.AnonymousClass1Ha.A1j(r2)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            X.53r r0 = r2.A04     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            java.io.InputStream r8 = r0.A0G(r5, r4)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01fe }
            r7.<init>()     // Catch:{ all -> 0x01fe }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x01fe }
            r7.inPreferredConfig = r0     // Catch:{ all -> 0x01fe }
            r7.inDither = r4     // Catch:{ all -> 0x01fe }
            int r6 = r1.x     // Catch:{ all -> 0x01fe }
            int r4 = r1.y     // Catch:{ all -> 0x01fe }
            r1 = 0
            X.5WB r0 = new X.5WB     // Catch:{ all -> 0x01fe }
            r16 = r0
            r17 = r7
            r18 = r1
            r19 = r6
            r20 = r4
            r21 = r10
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01fe }
            X.7KE r0 = X.C107245ax.A04(r1, r0, r8, r10)     // Catch:{ all -> 0x01fe }
            android.graphics.Bitmap r9 = r0.A02     // Catch:{ all -> 0x01fe }
            r8.close()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            java.lang.String r4 = "not-a-image"
            java.lang.String r8 = "gallerywallpaperpreview/failed to load bitmap"
            if (r9 == 0) goto L_0x01e7
            int r0 = r9.getWidth()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            if (r0 == 0) goto L_0x01e7
            int r0 = r9.getHeight()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            if (r0 == 0) goto L_0x01e7
            X.33i r0 = r2.A08     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            X.5UR r0 = r0.A0R()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            android.graphics.Matrix r14 = X.C107655bf.A0K(r5, r0)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            if (r14 != 0) goto L_0x0144
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            r14.<init>()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
        L_0x0144:
            int r12 = r9.getWidth()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            int r13 = r9.getHeight()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            r11 = r10
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            if (r9 == r6) goto L_0x0156
            r9.recycle()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
        L_0x0156:
            r5 = r6
            android.graphics.Point r1 = X.AnonymousClass1Ha.A1j(r2)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            int r0 = r1.x     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r7 = (float) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r7 = r7 / r0
            int r0 = r1.y     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r1 = (float) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r1 = r1 / r0
            float r7 = java.lang.Math.max(r7, r1)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x019b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            java.lang.String r0 = "gallerywallpaperpreview/scaling image by "
            r1.append(r0)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            r1.append(r7)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            java.lang.String r0 = "x to fit screen"
            X.C18260x0.A1L(r1, r0)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r0 = r0 * r7
            int r1 = (int) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            float r0 = r0 * r7
            int r0 = (int) r0     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r6, r1, r0, r15)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
        L_0x019b:
            if (r5 == r6) goto L_0x01a2
            r6.recycle()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            if (r5 == 0) goto L_0x01da
        L_0x01a2:
            int r0 = r5.getWidth()
            if (r0 == 0) goto L_0x01da
            int r0 = r5.getHeight()
            if (r0 == 0) goto L_0x01da
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gallerywallpaperpreview/wallpaper loaded/w="
            r1.append(r0)
            int r0 = r5.getWidth()
            r1.append(r0)
            java.lang.String r0 = "; h="
            r1.append(r0)
            int r0 = r5.getHeight()
            X.C18260x0.A1G(r1, r0)
            com.whatsapp.mediaview.PhotoView r1 = r2.A02
            r1.A0Y = r15
            r0 = 3
            r1.A09 = r0
            r1.setAllowFullViewCrop(r15)
            com.whatsapp.mediaview.PhotoView r0 = r2.A02
            r0.A06(r5)
            return
        L_0x01da:
            com.whatsapp.util.Log.e((java.lang.String) r8)
            android.content.Intent r0 = X.C18320x8.A07()
            android.content.Intent r0 = r0.putExtra(r4, r15)
            goto L_0x00e5
        L_0x01e7:
            com.whatsapp.util.Log.e((java.lang.String) r8)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            if (r9 == 0) goto L_0x01ef
            r9.recycle()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
        L_0x01ef:
            android.content.Intent r0 = X.C18320x8.A07()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            android.content.Intent r0 = r0.putExtra(r4, r15)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            r2.setResult(r10, r0)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            r2.finish()     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
            goto L_0x0222
        L_0x01fe:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0203 }
            goto L_0x0207
        L_0x0203:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
        L_0x0207:
            throw r1     // Catch:{ IOException -> 0x0216, OutOfMemoryError -> 0x0208 }
        L_0x0208:
            r1 = move-exception
            java.lang.String r0 = "gallerywallpaperpreview/out of memory trying to load wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C18320x8.A07()
            java.lang.String r3 = "error-oom"
            goto L_0x00e1
        L_0x0216:
            r1 = move-exception
            java.lang.String r0 = "gallerywallpaperpreview/io error loading wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C18320x8.A07()
            goto L_0x00e1
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview.onCreate(android.os.Bundle):void");
    }

    public GalleryWallpaperPreview(int i) {
        this.A05 = false;
        AnonymousClass1Hf.A2D(this, 102);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }

    public GalleryWallpaperPreview() {
        this(0);
    }
}
