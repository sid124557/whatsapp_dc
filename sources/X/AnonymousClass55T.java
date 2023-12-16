package X;

import android.view.View;
import com.whatsapp.mediacomposer.VideoTimelineView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.55T  reason: invalid class name */
public class AnonymousClass55T extends AnonymousClass5ZM {
    public long A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final File A04;
    public final WeakReference A05;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[SYNTHETIC, Splitter:B:27:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            X.6DM r12 = new X.6DM
            r12.<init>()
            r13 = r18
            java.io.File r0 = r13.A04     // Catch:{ Exception -> 0x00aa }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x00aa }
            r12.setDataSource(r0)     // Catch:{ Exception -> 0x00aa }
            r0 = 9
            java.lang.String r0 = r12.extractMetadata(r0)     // Catch:{ Exception -> 0x00aa }
            long r16 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00aa }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a0 }
            r13.A00 = r0     // Catch:{ all -> 0x00a0 }
            float r11 = r13.A02     // Catch:{ all -> 0x00a0 }
            float r10 = r13.A01     // Catch:{ all -> 0x00a0 }
            android.graphics.RectF r9 = X.C86664Kz.A0b(r11, r10)     // Catch:{ all -> 0x00a0 }
            android.graphics.Rect r8 = X.AnonymousClass001.A0N()     // Catch:{ all -> 0x00a0 }
            r7 = 1
            android.graphics.Paint r6 = X.C86664Kz.A0a(r7)     // Catch:{ all -> 0x00a0 }
            r5 = 0
            r4 = 0
        L_0x0033:
            int r14 = r13.A03     // Catch:{ all -> 0x00a0 }
            if (r4 >= r14) goto L_0x009b
            boolean r0 = X.C18320x8.A1T(r13)     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x009b
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r16
            long r0 = (long) r4     // Catch:{ all -> 0x00a0 }
            long r2 = r2 * r0
            long r0 = (long) r14     // Catch:{ all -> 0x00a0 }
            long r2 = r2 / r0
            android.graphics.Bitmap r2 = r12.getFrameAtTime(r2)     // Catch:{ Exception | NoSuchMethodError -> 0x008a }
            if (r2 == 0) goto L_0x008b
            int r14 = r2.getWidth()     // Catch:{ all -> 0x00a0 }
            int r3 = r2.getHeight()     // Catch:{ all -> 0x00a0 }
            float r0 = (float) r14     // Catch:{ all -> 0x00a0 }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
            float r0 = (float) r3     // Catch:{ all -> 0x00a0 }
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
            int r15 = (int) r11     // Catch:{ all -> 0x00a0 }
            int r1 = (int) r10     // Catch:{ all -> 0x00a0 }
            android.graphics.Bitmap$Config r0 = r2.getConfig()     // Catch:{ all -> 0x00a0 }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r15, r1, r0)     // Catch:{ all -> 0x00a0 }
            if (r14 <= r3) goto L_0x007d
            r8.top = r5     // Catch:{ all -> 0x00a0 }
            r8.bottom = r3     // Catch:{ all -> 0x00a0 }
            int r14 = r14 - r3
            int r0 = r14 / 2
            r8.left = r0     // Catch:{ all -> 0x00a0 }
            int r0 = r0 + r3
            r8.right = r0     // Catch:{ all -> 0x00a0 }
        L_0x0075:
            android.graphics.Canvas r0 = X.AnonymousClass4L0.A06(r1)     // Catch:{ all -> 0x00a0 }
            r0.drawBitmap(r2, r8, r9, r6)     // Catch:{ all -> 0x00a0 }
            goto L_0x008c
        L_0x007d:
            r8.left = r5     // Catch:{ all -> 0x00a0 }
            r8.right = r14     // Catch:{ all -> 0x00a0 }
            int r3 = r3 - r14
            int r0 = r3 / 2
            r8.top = r0     // Catch:{ all -> 0x00a0 }
            int r0 = r0 + r14
            r8.bottom = r0     // Catch:{ all -> 0x00a0 }
            goto L_0x0075
        L_0x008a:
            r2 = 0
        L_0x008b:
            r1 = r2
        L_0x008c:
            if (r1 == r2) goto L_0x0091
            r2.recycle()     // Catch:{ all -> 0x00a0 }
        L_0x0091:
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r7]     // Catch:{ all -> 0x00a0 }
            r0[r5] = r1     // Catch:{ all -> 0x00a0 }
            r13.A0F(r0)     // Catch:{ all -> 0x00a0 }
            int r4 = r4 + 1
            goto L_0x0033
        L_0x009b:
            r12.close()
            r0 = 0
            return r0
        L_0x00a0:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00a5 }
            throw r1
        L_0x00a5:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00aa:
            r12.close()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55T.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        View A0j = C86664Kz.A0j(this.A05);
        if (A0j != null) {
            A0j.invalidate();
        }
    }

    public AnonymousClass55T(VideoTimelineView videoTimelineView, File file, float f, float f2, int i) {
        this.A05 = AnonymousClass0x9.A14(videoTimelineView);
        this.A04 = file;
        this.A03 = i;
        this.A02 = f;
        this.A01 = f2;
    }
}
