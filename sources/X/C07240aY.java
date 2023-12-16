package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: X.0aY  reason: invalid class name and case insensitive filesystem */
public class C07240aY implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap A00 = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r3.getWindowVisibility() != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x0041
            java.util.WeakHashMap r5 = r6.A00
            java.util.Iterator r4 = X.AnonymousClass001.A0u(r5)
        L_0x000c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0041
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r4)
            java.lang.Object r3 = r0.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r0.getValue()
            boolean r2 = X.AnonymousClass001.A1Z(r0)
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x0031
            int r0 = r3.getWindowVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r2 == r1) goto L_0x000c
            r0 = 32
            if (r1 == 0) goto L_0x003a
            r0 = 16
        L_0x003a:
            X.C06560Yg.A0H(r3, r0)
            X.AnonymousClass000.A1C(r3, r5, r1)
            goto L_0x000c
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07240aY.onGlobalLayout():void");
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
