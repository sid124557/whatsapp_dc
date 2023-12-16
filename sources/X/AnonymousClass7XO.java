package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.facebook.animated.webp.WebPImage;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.7XO  reason: invalid class name */
public class AnonymousClass7XO {
    public int A00;
    public int A01;
    public long A02;
    public Bitmap A03;
    public Bitmap A04;
    public Canvas A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final Bitmap A09;
    public final C69263Wi A0A;
    public final AnonymousClass7XJ A0B;
    public final AnonymousClass7O6 A0C;
    public final AnonymousClass7IP A0D;
    public final Runnable A0E = new C117635sF(this);
    public final Set A0F = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = r15.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r15 = this;
            r11 = r15
            boolean r0 = r15.A0G
            if (r0 == 0) goto L_0x013d
            X.7IP r6 = r15.A0D
            int r5 = r6.A00
            r4 = 1
            if (r5 <= r4) goto L_0x013d
            java.util.Set r7 = r15.A0F
            int r0 = r7.size()
            if (r0 == 0) goto L_0x013d
            long r13 = android.os.SystemClock.uptimeMillis()
            long r2 = r15.A02
            int r0 = r15.A01
            long r0 = (long) r0
            long r2 = r2 + r0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0134
            android.graphics.Bitmap r3 = r15.A03
            if (r3 == 0) goto L_0x003c
            android.graphics.Bitmap r1 = r15.A04
            if (r1 == 0) goto L_0x002e
            r0 = 0
            r1.eraseColor(r0)
        L_0x002e:
            boolean r0 = r3.isRecycled()
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "AnimatedSticker/StickerAnimationController/updateFrame/was trying to use a recycled bitmap"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0039:
            r0 = 0
            r15.A03 = r0
        L_0x003c:
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r7)
            java.util.Iterator r1 = r2.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.next()
            X.8jZ r0 = (X.C179698jZ) r0
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            goto L_0x0044
        L_0x0056:
            android.graphics.Bitmap r0 = r15.A04
            if (r0 != 0) goto L_0x006b
            int r1 = r15.A08
            int r0 = r15.A07
            android.graphics.Bitmap r1 = X.C86664Kz.A0Y(r1, r0)
            r15.A04 = r1
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r15.A05 = r0
        L_0x006b:
            android.graphics.Canvas r2 = r15.A05
            if (r2 != 0) goto L_0x0078
            android.graphics.Bitmap r0 = r15.A04
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r15.A05 = r2
        L_0x0078:
            r1 = 0
            r0 = 0
            r2.drawBitmap(r3, r0, r0, r1)
            goto L_0x0039
        L_0x007e:
            boolean r0 = r15.A06
            if (r0 == 0) goto L_0x00bd
            java.util.Iterator r9 = r2.iterator()
        L_0x0086:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r3 = r9.next()
            X.8jZ r3 = (X.C179698jZ) r3
            X.6D5 r3 = (X.AnonymousClass6D5) r3
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0086
            int r0 = r3.A00
            int r2 = r0 + 1
            r3.A00 = r2
            boolean r1 = r3.A05
            int r0 = r3.A01
            if (r1 == 0) goto L_0x00a6
            int r0 = r0 + 1
        L_0x00a6:
            if (r2 >= r0) goto L_0x00b6
            long r7 = android.os.SystemClock.uptimeMillis()
            long r0 = r3.A02
            long r7 = r7 - r0
            int r0 = X.AnonymousClass6D5.A09
            long r1 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
        L_0x00b6:
            r3.stop()
            goto L_0x0086
        L_0x00ba:
            r0 = 0
            r15.A06 = r0
        L_0x00bd:
            int r0 = r15.A00
            int r12 = r0 + 1
            int r12 = r12 % r5
            r15.A00 = r12
            if (r12 != 0) goto L_0x00c8
            r15.A06 = r4
        L_0x00c8:
            r15.A02 = r13
            int[] r0 = r6.A01
            r0 = r0[r12]
            r15.A01 = r0
            long r0 = (long) r0
            long r13 = r13 + r0
            X.7O6 r1 = r15.A0C
            X.7XJ r10 = r15.A0B
            X.8LW r9 = new X.8LW
            r9.<init>(r10, r11, r12, r13)
            X.7IO r8 = r1.A04
            monitor-enter(r8)
            java.util.PriorityQueue r7 = r8.A01     // Catch:{ all -> 0x012f }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x012f }
        L_0x00e4:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0108
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x012f }
            X.8LW r3 = (X.AnonymousClass8LW) r3     // Catch:{ all -> 0x012f }
            int r2 = r3.A00     // Catch:{ all -> 0x012f }
            int r0 = r9.A00     // Catch:{ all -> 0x012f }
            if (r2 < r0) goto L_0x00e4
            X.7XJ r2 = r3.A02     // Catch:{ all -> 0x012f }
            X.7XJ r0 = r9.A02     // Catch:{ all -> 0x012f }
            if (r2 != r0) goto L_0x00e4
            long r4 = r9.A01     // Catch:{ all -> 0x012f }
            long r2 = r3.A01     // Catch:{ all -> 0x012f }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            r6.remove()     // Catch:{ all -> 0x012f }
            goto L_0x00e4
        L_0x0108:
            r7.add(r9)     // Catch:{ all -> 0x0131 }
            r8.notifyAll()     // Catch:{ all -> 0x0131 }
            monitor-exit(r8)
            X.6q4 r0 = r1.A00
            if (r0 != 0) goto L_0x014c
            X.1VX r5 = r1.A02
            X.3Wi r4 = r1.A01
            X.2IA r6 = r1.A03
            X.7Eb r7 = new X.7Eb
            r7.<init>(r1)
            X.6q4 r3 = new X.6q4
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A00 = r3
            monitor-enter(r8)
            r8.A00 = r3     // Catch:{ all -> 0x0131 }
            monitor-exit(r8)
            X.6q4 r0 = r1.A00
            r0.start()
            return
        L_0x012f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0131 }
        L_0x0131:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0134:
            X.3Wi r1 = r15.A0A
            java.lang.Runnable r0 = r15.A0E
            long r2 = r2 - r13
            r1.A0T(r0, r2)
            return
        L_0x013d:
            r0 = 0
            r15.A0G = r0
            android.graphics.Bitmap r1 = r15.A04
            r0 = 0
            if (r1 == 0) goto L_0x014a
            r1.recycle()
            r15.A04 = r0
        L_0x014a:
            r15.A03 = r0
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7XO.A00():void");
    }

    public void finalize() {
        this.A0B.finalize();
        Bitmap bitmap = this.A04;
        if (bitmap != null) {
            bitmap.recycle();
            this.A04 = null;
        }
        super.finalize();
    }

    public AnonymousClass7XO(Bitmap bitmap, WebPImage webPImage, C69263Wi r11, AnonymousClass7O6 r12, String str, int i, int i2) {
        this.A0A = r11;
        this.A0C = r12;
        this.A09 = bitmap;
        this.A0D = new AnonymousClass7IP(webPImage.getFrameDurations(), webPImage.getFrameCount());
        this.A08 = i;
        this.A07 = i2;
        this.A0B = new AnonymousClass7XJ(bitmap, webPImage, str, i, i2);
    }
}
