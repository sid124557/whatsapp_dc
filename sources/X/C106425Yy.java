package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import java.util.List;

/* renamed from: X.5Yy  reason: invalid class name and case insensitive filesystem */
public final class C106425Yy {
    public final C64393Dh A00;
    public final C60152y5 A01;

    public static final C95984vH A00(View view, C53042mS r12, boolean z) {
        View view2;
        C95984vH r5 = new C95984vH(r12.A02, r12.A01.getRawString(), r12.A03, r12.A00, z);
        Rect A0N = AnonymousClass001.A0N();
        view.getHitRect(A0N);
        A0N.offset(-A0N.left, -A0N.top);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        Rect A0N2 = AnonymousClass001.A0N();
        while (true) {
            View view3 = view;
            view = view2;
            if (view2 == null) {
                break;
            }
            view3.getHitRect(A0N2);
            A0N.offset(A0N2.left, A0N2.top);
            ViewParent parent2 = view2.getParent();
            if (!(parent2 instanceof View)) {
                break;
            }
            view2 = (View) parent2;
        }
        RectF rectF = new RectF(A0N);
        r5.A0M(AnonymousClass002.A07(), rectF.left, rectF.top, rectF.right, rectF.bottom);
        return r5;
    }

    public C106425Yy(C64393Dh r1, C60152y5 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final void A01(View view, AnonymousClass5YF r6, List list) {
        float A002 = AnonymousClass4L0.A00(view);
        float A02 = C86664Kz.A02(view);
        r6.A0H(new C106985aV(new RectF(0.0f, 0.0f, A002, A02), new RectF(0.0f, 0.0f, A002, A02), list, 0).A04());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A02(android.content.Context r16, android.view.View r17) {
        /*
            r15 = this;
            android.content.res.Resources r2 = r16.getResources()
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            float r1 = r0.density
            r0 = 2131167631(0x7f07098f, float:1.7949541E38)
            float r0 = r2.getDimension(r0)
            float r0 = r0 / r1
            int r0 = (int) r0
            int r6 = r0 * 3
            r0 = 2131167627(0x7f07098b, float:1.7949533E38)
            float r0 = r2.getDimension(r0)
            float r0 = r0 / r1
            int r0 = (int) r0
            int r5 = r0 * 3
            r4 = 1
            r8 = 0
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ RuntimeException -> 0x008d }
            r7 = r17
            boolean r0 = X.C06360Xi.A05(r7)     // Catch:{ RuntimeException -> 0x008d }
            if (r0 == 0) goto L_0x0082
            int r1 = r7.getWidth()     // Catch:{ RuntimeException -> 0x008d }
            int r0 = r7.getHeight()     // Catch:{ RuntimeException -> 0x008d }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r0, r2)     // Catch:{ RuntimeException -> 0x008d }
            X.C162457s7.A0D(r3)     // Catch:{ RuntimeException -> 0x008d }
            android.graphics.Canvas r2 = X.AnonymousClass4L0.A06(r3)     // Catch:{ RuntimeException -> 0x008d }
            int r0 = r7.getScrollX()     // Catch:{ RuntimeException -> 0x008d }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x008d }
            float r1 = -r0
            int r0 = r7.getScrollY()     // Catch:{ RuntimeException -> 0x008d }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x008d }
            float r0 = -r0
            r2.translate(r1, r0)     // Catch:{ RuntimeException -> 0x008d }
            r7.draw(r2)     // Catch:{ RuntimeException -> 0x008d }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r3, r6, r5, r4)     // Catch:{ RuntimeException -> 0x008d }
            X.C162457s7.A0D(r4)     // Catch:{ RuntimeException -> 0x008d }
            X.3Dh r9 = r15.A00     // Catch:{ RuntimeException -> 0x008d }
            X.2y5 r10 = r15.A01     // Catch:{ RuntimeException -> 0x008d }
            java.lang.String r12 = ".png"
            X.38t r11 = X.C633138t.A0C     // Catch:{ RuntimeException -> 0x008d }
            r13 = 0
            r14 = 2
            java.io.File r3 = X.C107655bf.A0Q(r9, r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x008d }
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ RuntimeException -> 0x008d }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x007e }
            r0 = 100
            boolean r0 = r4.compress(r1, r0, r2)     // Catch:{ all -> 0x007e }
            r2.close()     // Catch:{ RuntimeException -> 0x008d }
            if (r0 == 0) goto L_0x0078
            return r3
        L_0x0078:
            java.lang.String r0 = "Error generating media"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x008d }
            return r8
        L_0x007e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            goto L_0x0089
        L_0x0082:
            java.lang.String r0 = "View needs to be laid out before calling drawToBitmap()"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ RuntimeException -> 0x008d }
            goto L_0x008c
        L_0x0089:
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ RuntimeException -> 0x008d }
        L_0x008c:
            throw r0     // Catch:{ RuntimeException -> 0x008d }
        L_0x008d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106425Yy.A02(android.content.Context, android.view.View):java.io.File");
    }
}
