package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.6pz  reason: invalid class name and case insensitive filesystem */
public class C138236pz extends AnonymousClass5ZM {
    public String A00;
    public final Uri A01;
    public final C989053r A02;
    public final WeakReference A03;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C151757We A00(android.graphics.Bitmap r10, X.C157227hx r11) {
        /*
            r3 = r10
            int r1 = r10.getWidth()
            int r0 = r10.getHeight()
            int r1 = r1 * r0
            int[] r4 = new int[r1]
            r5 = 0
            int r6 = r10.getWidth()
            int r9 = r10.getWidth()
            int r10 = r10.getHeight()
            r8 = r5
            r7 = r5
            r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r3.getWidth()
            int r0 = r3.getHeight()
            X.6ci r1 = new X.6ci
            r1.<init>(r2, r4, r0)
            r0 = 0
            X.7We r0 = X.AnonymousClass75M.A00(r1, r11, r0)     // Catch:{ 6zZ -> 0x0033, all -> 0x0031 }
            return r0
        L_0x0031:
            r0 = move-exception
            throw r0
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138236pz.A00(android.graphics.Bitmap, X.7hx):X.7We");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        com.whatsapp.util.Log.e("CheckImageForQrCodeAsyncTask/OOM ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        com.whatsapp.util.Log.e("contactQrActivity/checkImageForQrCode/ioexception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: 59c | IOException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            r11 = 0
            X.53r r6 = r12.A02     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            android.net.Uri r7 = r12.A01     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            r8 = 2000(0x7d0, float:2.803E-42)
            r10 = 1
            r9 = r8
            android.graphics.Bitmap r4 = r6.A0C(r7, r8, r9, r10, r11)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            X.7hx r5 = new X.7hx     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            r5.<init>()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            X.7We r3 = A00(r4, r5)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
        L_0x0016:
            r6 = 1
            if (r3 != 0) goto L_0x007a
            int r0 = r4.getWidth()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            double r0 = (double) r0     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            r9 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r0 = r0 / r9
            r7 = 4644337115725824000(0x4074000000000000, double:320.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x007a
            int r0 = r4.getHeight()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            double r0 = (double) r0     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            double r0 = r0 / r9
            r7 = 4647151865492930560(0x407e000000000000, double:480.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x007a
            int r0 = r4.getWidth()     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            double r0 = r0 / r9
            double r0 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            int r3 = (int) r0     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            int r0 = r4.getHeight()     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            double r0 = r0 / r9
            double r1 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            int r0 = (int) r1     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r4, r3, r0, r6)     // Catch:{ IllegalArgumentException -> 0x0059, 59c | IOException -> 0x0094 }
            r4.recycle()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            X.7We r3 = A00(r0, r5)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            r4 = r0
            goto L_0x0016
        L_0x0059:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            java.lang.String r0 = "checkimageforqrcode/"
            r1.append(r0)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            android.graphics.Bitmap$Config r0 = r4.getConfig()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            r1.append(r0)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            boolean r0 = r4.isRecycled()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            X.C18260x0.A1U(r1, r0)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            return r0
        L_0x007a:
            r4.recycle()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            if (r3 != 0) goto L_0x0084
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            return r0
        L_0x0084:
            java.lang.String r0 = r3.A02     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            r12.A00 = r0     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ 59c | IOException -> 0x0094, OutOfMemoryError -> 0x008d }
            return r0
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "CheckImageForQrCodeAsyncTask/OOM "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0099
        L_0x0094:
            java.lang.String r0 = "contactQrActivity/checkImageForQrCode/ioexception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0099:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138236pz.A08(java.lang.Object[]):java.lang.Object");
    }

    public C138236pz(Uri uri, C182958pG r3, C989053r r4) {
        this.A02 = r4;
        this.A03 = AnonymousClass0x9.A14(r3);
        this.A01 = uri;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        C182958pG r1 = (C182958pG) this.A03.get();
        if (r1 != null) {
            r1.BaP(this.A00, A0K);
        }
    }
}
