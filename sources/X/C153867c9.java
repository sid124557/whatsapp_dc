package X;

import android.content.Context;

/* renamed from: X.7c9  reason: invalid class name and case insensitive filesystem */
public class C153867c9 {
    public static boolean A01(Context context, C153427bI r2) {
        if (r2 != null) {
            return r2.A05;
        }
        C162457s7.A0J(context, 0);
        return AnonymousClass000.A1U(AnonymousClass001.A0M(context).uiMode & 48, 32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r5, X.C142696xc r6, X.C153427bI r7) {
        /*
            r6.getClass()
            boolean r1 = A01(r5, r7)
            r0 = 2132083042(0x7f150162, float:1.9806215E38)
            if (r1 == 0) goto L_0x000f
            r0 = 2132083041(0x7f150161, float:1.9806213E38)
        L_0x000f:
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper
            r4.<init>(r5, r0)
            r0 = 1
            r3 = 0
            int[] r2 = new int[r0]     // Catch:{ NotFoundException -> 0x0028 }
            int r0 = r6.attr     // Catch:{ NotFoundException -> 0x0028 }
            r1 = 0
            r2[r1] = r0     // Catch:{ NotFoundException -> 0x0028 }
            android.content.res.TypedArray r3 = r4.obtainStyledAttributes(r2)     // Catch:{ NotFoundException -> 0x0028 }
            int r0 = r6.lightModeFallBackColorInt     // Catch:{ NotFoundException -> 0x0028 }
            int r0 = r3.getColor(r1, r0)     // Catch:{ NotFoundException -> 0x0028 }
            goto L_0x0033
        L_0x0028:
            r1 = move-exception
            boolean r0 = X.AnonymousClass702.isDebugBuild()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0037
            int r0 = r6.lightModeFallBackColorInt     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0036
        L_0x0033:
            r3.recycle()
        L_0x0036:
            return r0
        L_0x0037:
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            if (r3 == 0) goto L_0x003e
            r3.recycle()
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153867c9.A00(android.content.Context, X.6xc, X.7bI):int");
    }
}
