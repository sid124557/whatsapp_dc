package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Pair;
import java.lang.ref.WeakReference;

/* renamed from: X.1tU  reason: invalid class name and case insensitive filesystem */
public class C33661tU extends AnonymousClass5ZM {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bitmap.CompressFormat A03;
    public final Bitmap A04;
    public final Rect A05;
    public final Uri A06;
    public final C620633i A07;
    public final C61072zf A08;
    public final WeakReference A09;
    public final boolean A0A;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        this.A04.recycle();
        Activity activity = (Activity) this.A09.get();
        if (activity != null) {
            if (pair != null) {
                activity.setResult(C18280x3.A03(pair), (Intent) pair.second);
            }
            activity.finish();
        }
    }

    public C33661tU(Activity activity, Bitmap.CompressFormat compressFormat, Bitmap bitmap, Rect rect, Uri uri, C620633i r7, C61072zf r8, int i, int i2, int i3, boolean z) {
        this.A08 = r8;
        this.A07 = r7;
        this.A09 = AnonymousClass0x9.A14(activity);
        this.A06 = uri;
        this.A03 = compressFormat;
        this.A01 = i;
        this.A04 = bitmap;
        this.A05 = rect;
        this.A0A = z;
        this.A00 = i2;
        this.A02 = i3;
    }

    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.util.Pair] */
    /* JADX WARNING: type inference failed for: r0v25, types: [android.util.Pair] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A[Catch:{ IOException -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c A[Catch:{ IOException -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024 A[SYNTHETIC, Splitter:B:9:0x0024] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            java.lang.String r3 = "no-space"
            android.net.Uri r4 = r12.A06
            java.io.File r11 = X.C18310x6.A0a(r4)
            r8 = 75
        L_0x000b:
            r7 = 1
            r10 = 0
            r9 = 0
            X.33i r0 = r12.A07     // Catch:{ IOException -> 0x002f }
            X.5UR r0 = r0.A0R()     // Catch:{ IOException -> 0x002f }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "cropimage/save-output cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x002f }
            goto L_0x0021
        L_0x001c:
            java.io.OutputStream r5 = r0.A07(r4)     // Catch:{ IOException -> 0x002f }
            goto L_0x0022
        L_0x0021:
            r5 = r9
        L_0x0022:
            if (r5 == 0) goto L_0x0074
            android.graphics.Bitmap r1 = r12.A04     // Catch:{ IOException -> 0x002c, all -> 0x0107 }
            android.graphics.Bitmap$CompressFormat r0 = r12.A03     // Catch:{ IOException -> 0x002c, all -> 0x0107 }
            r1.compress(r0, r8, r5)     // Catch:{ IOException -> 0x002c, all -> 0x0107 }
            goto L_0x0074
        L_0x002c:
            r2 = move-exception
            r9 = r5
            goto L_0x0030
        L_0x002f:
            r2 = move-exception
        L_0x0030:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "cropimage/cannot save: "
            X.C18260x0.A0k(r4, r0, r1, r2)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x005c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0105 }
            android.content.Intent r0 = X.C18320x8.A07()     // Catch:{ all -> 0x0105 }
            android.content.Intent r0 = r0.putExtra(r3, r7)     // Catch:{ all -> 0x0105 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)     // Catch:{ all -> 0x0105 }
            goto L_0x006e
        L_0x005c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0105 }
            android.content.Intent r1 = X.C18320x8.A07()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "io-error"
            android.content.Intent r0 = r1.putExtra(r0, r7)     // Catch:{ all -> 0x0105 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r0)     // Catch:{ all -> 0x0105 }
        L_0x006e:
            X.C624535b.A03(r9)
            r9 = r0
            r8 = 1
            goto L_0x008f
        L_0x0074:
            int r8 = r8 + -10
            X.C624535b.A03(r5)
            int r1 = r12.A01
            if (r1 == 0) goto L_0x008e
            if (r8 <= 0) goto L_0x008e
            boolean r0 = r11.exists()
            if (r0 == 0) goto L_0x008e
            long r5 = r11.length()
            long r1 = (long) r1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x000b
        L_0x008e:
            r8 = 0
        L_0x008f:
            long r1 = r11.length()
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            X.2zf r0 = r12.A08
            long r1 = r0.A02()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "cropimage/nospace"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            android.content.Intent r0 = X.C18320x8.A07()
            android.content.Intent r0 = r0.putExtra(r3, r7)
            android.util.Pair r9 = X.AnonymousClass0x9.A0C(r1, r0)
            r8 = 1
        L_0x00b9:
            if (r8 != 0) goto L_0x0104
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x00e5
            int r3 = r12.A00
            if (r3 == r7) goto L_0x00e5
            if (r3 == 0) goto L_0x00e5
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ IOException -> 0x00db }
            X.0YU r2 = new X.0YU     // Catch:{ IOException -> 0x00db }
            r2.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x00db }
            java.lang.String r1 = "Orientation"
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch:{ IOException -> 0x00db }
            r2.A0Z(r1, r0)     // Catch:{ IOException -> 0x00db }
            r2.A0I()     // Catch:{ IOException -> 0x00db }
            goto L_0x00e5
        L_0x00db:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cropimage/exif/cannot save: "
            X.C18260x0.A0k(r4, r0, r1, r2)
        L_0x00e5:
            android.content.Intent r2 = X.C18320x8.A07()
            r2.setData(r4)
            java.lang.String r1 = "rect"
            android.graphics.Rect r0 = r12.A05
            r2.putExtra(r1, r0)
            java.lang.String r1 = "rotate"
            int r0 = r12.A02
            r2.putExtra(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass0x7.A0f()
            android.util.Pair r9 = X.AnonymousClass0x9.A0C(r0, r2)
        L_0x0104:
            return r9
        L_0x0105:
            r0 = move-exception
            goto L_0x0109
        L_0x0107:
            r0 = move-exception
            r9 = r5
        L_0x0109:
            X.C624535b.A03(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33661tU.A08(java.lang.Object[]):java.lang.Object");
    }
}
