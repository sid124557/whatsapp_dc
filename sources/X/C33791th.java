package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.1th  reason: invalid class name and case insensitive filesystem */
public class C33791th extends AnonymousClass5ZM {
    public final Context A00;
    public final Uri A01;
    public final C58802vq A02;
    public final C103455Na A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.C18270x1.A1H(r1, "DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from ", r5);
        X.C18260x0.A1O(r1, " to ", r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x016b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r8 = r19
            android.net.Uri r0 = r8.A01
            java.lang.String r0 = r0.getPath()
            X.C626936e.A06(r0)
            java.io.File r6 = X.AnonymousClass002.A0B(r0)
            X.2vq r5 = r8.A02
            android.content.Context r7 = r8.A00
            android.graphics.Bitmap r4 = X.C58802vq.A00(r7, r6)
            r3 = 0
            if (r4 == 0) goto L_0x0027
            r2 = 1
            X.7II[] r1 = new X.AnonymousClass7II[r2]
            X.7II r0 = new X.7II
            r0.<init>(r2, r4)
            r1[r3] = r0
            r8.A0F(r1)
        L_0x0027:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r1.split(r0)
            r8 = r0[r3]
            X.2qA r6 = r5.A02
            java.io.File r0 = r6.A01(r8)
            if (r0 == 0) goto L_0x0049
            android.graphics.Bitmap r1 = X.C58802vq.A00(r7, r0)
            X.C626936e.A06(r1)
            r0 = 2
            X.7II r3 = new X.7II
            r3.<init>(r0, r1)
            return r3
        L_0x0049:
            X.1ip r0 = r5.A01
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x005d
            r1 = 3
            r0 = 1
            X.C626936e.A0B(r0)
            r0 = 0
            X.7II r3 = new X.7II
            r3.<init>(r1, r0)
            return r3
        L_0x005d:
            X.2bp r3 = r5.A03     // Catch:{ IOException -> 0x01af }
            X.2oU r0 = r3.A00     // Catch:{ IOException -> 0x01af }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x01af }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)     // Catch:{ IOException -> 0x01af }
            float r1 = r0.density     // Catch:{ IOException -> 0x01af }
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ac
            java.lang.String r2 = "xxhdpi"
        L_0x0072:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x01af }
            java.lang.String r1 = "category"
            java.lang.String r0 = "wallpaper"
            r4.put(r1, r0)     // Catch:{ IOException -> 0x01af }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r8)     // Catch:{ IOException -> 0x01af }
            java.lang.String r0 = "_"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ IOException -> 0x01af }
            java.lang.String r0 = "id"
            r4.put(r0, r1)     // Catch:{ IOException -> 0x01af }
            X.1VX r2 = r3.A01     // Catch:{ IOException -> 0x01af }
            X.2hI r1 = r3.A03     // Catch:{ IOException -> 0x01af }
            java.lang.String r0 = "wa/static/downloadable"
            android.net.Uri$Builder r0 = X.AnonymousClass351.A00(r2, r1, r0)     // Catch:{ IOException -> 0x01af }
            java.lang.String r2 = X.AnonymousClass351.A01(r0, r4)     // Catch:{ IOException -> 0x01af }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01af }
            java.lang.String r0 = "WallpaperDownloader/downloadFullResolutionWallpaper/Creating connection to download data. Endpoint = "
            X.C18260x0.A0q(r0, r2, r1)     // Catch:{ IOException -> 0x01af }
            X.33K r0 = r3.A02     // Catch:{ IOException -> 0x01af }
            X.4GL r2 = r3.A00(r0, r2)     // Catch:{ IOException -> 0x01af }
            goto L_0x00af
        L_0x00ac:
            java.lang.String r2 = "hdpi"
            goto L_0x0072
        L_0x00af:
            if (r2 != 0) goto L_0x00be
            r1 = 4
            r0 = 1
            X.C626936e.A0B(r0)     // Catch:{ all -> 0x01a3 }
            r0 = 0
            X.7II r3 = new X.7II     // Catch:{ all -> 0x01a3 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x01a3 }
            goto L_0x01ba
        L_0x00be:
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/Storing files..."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01a3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r8)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = ".jpg"
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x01a3 }
            r13 = 0
            X.2s4 r3 = r6.A00     // Catch:{ IOException -> 0x018e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x018e }
            r0 = 17
            java.io.InputStream r0 = X.C18310x6.A0b(r3, r2, r1, r0)     // Catch:{ IOException -> 0x018e }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x018e }
            r4.<init>(r0)     // Catch:{ IOException -> 0x018e }
            X.2oU r12 = r6.A01     // Catch:{ all -> 0x0184 }
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x0184 }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "downloadable/wallpaper_tmp"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0184 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0184 }
            if (r0 != 0) goto L_0x0100
            boolean r0 = X.C627536m.A0Q(r1)     // Catch:{ all -> 0x0184 }
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0184 }
            goto L_0x0180
        L_0x0100:
            java.io.File r5 = X.AnonymousClass002.A0A(r1, r9)     // Catch:{ all -> 0x0184 }
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r11]     // Catch:{ all -> 0x0184 }
            java.io.FileOutputStream r3 = X.AnonymousClass0x9.A0h(r5)     // Catch:{ FileNotFoundException -> 0x017a }
            r17 = 0
        L_0x010e:
            long r0 = (long) r11     // Catch:{ FileNotFoundException -> 0x017a }
            long r0 = r0 + r17
            r15 = 2097152(0x200000, double:1.0361308E-317)
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 > 0) goto L_0x0130
            int r1 = r4.read(r10)     // Catch:{ all -> 0x0126 }
            r0 = -1
            if (r1 == r0) goto L_0x0130
            r3.write(r10, r13, r1)     // Catch:{ all -> 0x0126 }
            long r0 = (long) r1     // Catch:{ all -> 0x0126 }
            long r17 = r17 + r0
            goto L_0x010e
        L_0x0126:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x012b }
            goto L_0x012f
        L_0x012b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x017a }
        L_0x012f:
            throw r1     // Catch:{ FileNotFoundException -> 0x017a }
        L_0x0130:
            r3.close()     // Catch:{ FileNotFoundException -> 0x017a }
            if (r14 <= 0) goto L_0x013b
            java.lang.String r0 = "DownloadableWallpaperStorage: File being saved is too large."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0184 }
            goto L_0x0180
        L_0x013b:
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x0184 }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "downloadable/wallpaper"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0184 }
            java.io.File r3 = X.AnonymousClass002.A0A(r0, r9)     // Catch:{ all -> 0x0184 }
            X.C18270x1.A0x(r3)     // Catch:{ all -> 0x0184 }
            X.306 r0 = r6.A02     // Catch:{ IOException -> 0x016b }
            X.C627536m.A0D(r0, r5, r3)     // Catch:{ IOException -> 0x016b }
            r4.close()     // Catch:{ IOException -> 0x018e }
            java.io.File r0 = r6.A01(r8)     // Catch:{ all -> 0x01a3 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x01a3 }
            android.graphics.Bitmap r1 = X.C58802vq.A00(r7, r0)     // Catch:{ all -> 0x01a3 }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x01a3 }
            r0 = 2
            X.7II r3 = new X.7II     // Catch:{ all -> 0x01a3 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x01a3 }
            goto L_0x019f
        L_0x016b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from "
            X.C18270x1.A1H(r1, r0, r5)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = " to "
            X.C18260x0.A1O(r1, r0, r3)     // Catch:{ all -> 0x0184 }
            goto L_0x0180
        L_0x017a:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0184 }
        L_0x0180:
            r4.close()     // Catch:{ IOException -> 0x018e }
            goto L_0x0194
        L_0x0184:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x018e }
        L_0x018d:
            throw r1     // Catch:{ IOException -> 0x018e }
        L_0x018e:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01a3 }
        L_0x0194:
            r1 = 5
            r0 = 1
            X.C626936e.A0B(r0)     // Catch:{ all -> 0x01a3 }
            r0 = 0
            X.7II r3 = new X.7II     // Catch:{ all -> 0x01a3 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x01a3 }
        L_0x019f:
            r2.close()     // Catch:{ IOException -> 0x01af }
            goto L_0x01ba
        L_0x01a3:
            r1 = move-exception
            if (r2 == 0) goto L_0x01ae
            r2.close()     // Catch:{ all -> 0x01aa }
            goto L_0x01ae
        L_0x01aa:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01af }
        L_0x01ae:
            throw r1     // Catch:{ IOException -> 0x01af }
        L_0x01af:
            r1 = 4
            r0 = 1
            X.C626936e.A0B(r0)     // Catch:{ all -> 0x01be }
            r0 = 0
            X.7II r3 = new X.7II     // Catch:{ all -> 0x01be }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x01be }
        L_0x01ba:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L_0x01be:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33791th.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass7II r2 = (AnonymousClass7II) obj;
        if (!C18320x8.A1T(this)) {
            this.A03.A00(r2);
            return;
        }
        Bitmap bitmap = r2.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        this.A03.A00(((AnonymousClass7II[]) objArr)[0]);
    }

    public C33791th(Context context, Uri uri, C58802vq r3, C103455Na r4) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = uri;
        this.A03 = r4;
    }
}
