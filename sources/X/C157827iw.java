package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.7iw  reason: invalid class name and case insensitive filesystem */
public abstract class C157827iw {
    public static void A00(int i, int i2) {
        boolean z = true;
        if (AnonymousClass001.A1W(i)) {
            if (i2 <= 0) {
                z = false;
            }
            if (!z) {
                throw AnonymousClass6C7.A0U("height must be > 0");
            }
            return;
        }
        throw AnonymousClass6C7.A0U("width must be > 0");
    }

    public C172258Kh A02(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        A00(width, height);
        boolean z = true;
        if (AnonymousClass6C8.A1P(width, bitmap.getWidth())) {
            if (height > bitmap.getHeight()) {
                z = false;
            }
            if (z) {
                Rect rect = new Rect(0, 0, width, height);
                RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 != null) {
                    int A04 = AnonymousClass6CA.A04(config2, AnonymousClass76O.A00);
                    if (A04 == 1) {
                        config = Bitmap.Config.RGB_565;
                    } else if (A04 == 2) {
                        config = Bitmap.Config.ALPHA_8;
                    }
                }
                boolean hasAlpha = bitmap.hasAlpha();
                A00(width, height);
                C172258Kh A01 = A01(config, width, height);
                Bitmap A00 = C172258Kh.A00(A01);
                A00.setHasAlpha(hasAlpha);
                if (config == Bitmap.Config.ARGB_8888 && !hasAlpha) {
                    A00.eraseColor(-16777216);
                }
                Bitmap A002 = C172258Kh.A00(A01);
                A002.setDensity(bitmap.getDensity());
                A002.setHasAlpha(bitmap.hasAlpha());
                A002.setPremultiplied(bitmap.isPremultiplied());
                Canvas canvas = new Canvas(C172258Kh.A00(A01));
                canvas.drawBitmap(bitmap, rect, rectF, (Paint) null);
                canvas.setBitmap((Bitmap) null);
                return A01;
            }
            throw AnonymousClass6C7.A0U("y + height must be <= bitmap.height()");
        }
        throw AnonymousClass6C7.A0U("x + width must be <= bitmap.width()");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C172258Kh A01(android.graphics.Bitmap.Config r17, int r18, int r19) {
        /*
            r16 = this;
            r12 = r16
            X.6MX r12 = (X.AnonymousClass6MX) r12
            r11 = 2
            r15 = r17
            X.C162457s7.A0J(r15, r11)
            r14 = r18
            if (r18 <= 0) goto L_0x018c
            r13 = r19
            if (r19 <= 0) goto L_0x0181
            int r2 = X.C154697db.A00(r15)
            int r10 = r18 * r19
            int r9 = r10 * r2
            if (r9 <= 0) goto L_0x015e
            X.6Mb r8 = r12.A01
            monitor-enter(r8)
            boolean r0 = r8.A05()     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x002c
            X.7Rz r0 = r8.A02     // Catch:{ all -> 0x015b }
            int r1 = r0.A01     // Catch:{ all -> 0x015b }
            r0 = 0
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            X.C153877cA.A01(r0)     // Catch:{ all -> 0x015b }
            monitor-exit(r8)
            monitor-enter(r8)
            monitor-enter(r8)     // Catch:{ all -> 0x0158 }
            android.util.SparseArray r7 = r8.A00     // Catch:{ all -> 0x0148 }
            java.lang.Object r6 = r7.get(r9)     // Catch:{ all -> 0x0148 }
            X.7Lp r6 = (X.C149247Lp) r6     // Catch:{ all -> 0x0148 }
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            if (r6 == 0) goto L_0x007e
            java.lang.Object r3 = r8.A01(r6)     // Catch:{ all -> 0x0158 }
            if (r3 == 0) goto L_0x007e
            java.util.Set r0 = r8.A07     // Catch:{ all -> 0x0158 }
            boolean r0 = r0.add(r3)     // Catch:{ all -> 0x0158 }
            X.C153877cA.A01(r0)     // Catch:{ all -> 0x0158 }
            r0 = r3
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0158 }
            r0.getClass()     // Catch:{ all -> 0x0158 }
            int r2 = r0.getAllocationByteCount()     // Catch:{ all -> 0x0158 }
            X.7Rz r1 = r8.A03     // Catch:{ all -> 0x0158 }
            int r0 = r1.A00     // Catch:{ all -> 0x0158 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0158 }
            int r0 = r1.A01     // Catch:{ all -> 0x0158 }
            int r0 = r0 + r2
            r1.A01 = r0     // Catch:{ all -> 0x0158 }
            X.7Rz r0 = r8.A02     // Catch:{ all -> 0x0158 }
            r0.A00(r2)     // Catch:{ all -> 0x0158 }
            r8.A02()     // Catch:{ all -> 0x0158 }
            X.8vJ r0 = X.C161577py.A00     // Catch:{ all -> 0x0158 }
            boolean r0 = r0.BI0(r11)     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x007b
            java.lang.Class r1 = r8.A06     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "get (reuse) (object, size) = (%x, %s)"
            X.C161577py.A03(r1, r3, r0, r2)     // Catch:{ all -> 0x0158 }
        L_0x007b:
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            goto L_0x0114
        L_0x007e:
            monitor-enter(r8)     // Catch:{ all -> 0x0158 }
            X.7gp r1 = r8.A04     // Catch:{ all -> 0x0148 }
            int r5 = r1.A01     // Catch:{ all -> 0x0148 }
            X.7Rz r4 = r8.A03     // Catch:{ all -> 0x0148 }
            int r3 = r4.A01     // Catch:{ all -> 0x0148 }
            int r0 = r5 - r3
            if (r9 > r0) goto L_0x014b
            int r2 = r1.A02     // Catch:{ all -> 0x0148 }
            X.7Rz r1 = r8.A02     // Catch:{ all -> 0x0148 }
            int r0 = r1.A01     // Catch:{ all -> 0x0148 }
            int r3 = r3 + r0
            int r0 = r2 - r3
            if (r9 <= r0) goto L_0x009b
            int r0 = r2 - r9
            r8.A03(r0)     // Catch:{ all -> 0x0148 }
        L_0x009b:
            int r0 = r4.A01     // Catch:{ all -> 0x0148 }
            int r1 = r1.A01     // Catch:{ all -> 0x0148 }
            int r0 = r0 + r1
            int r0 = r5 - r0
            if (r9 > r0) goto L_0x014b
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            int r0 = r4.A00     // Catch:{ all -> 0x0158 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0158 }
            int r0 = r4.A01     // Catch:{ all -> 0x0158 }
            int r0 = r0 + r9
            r4.A01 = r0     // Catch:{ all -> 0x0158 }
            if (r6 == 0) goto L_0x00b8
            int r0 = r6.A00     // Catch:{ all -> 0x0158 }
            int r0 = r0 + 1
            r6.A00 = r0     // Catch:{ all -> 0x0158 }
        L_0x00b8:
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            java.lang.Object r3 = r8.A00(r9)     // Catch:{ all -> 0x00be }
            goto L_0x00ec
        L_0x00be:
            r3 = move-exception
            monitor-enter(r8)
            r4.A00(r9)     // Catch:{ all -> 0x0145 }
            monitor-enter(r8)     // Catch:{ all -> 0x0145 }
            java.lang.Object r5 = r7.get(r9)     // Catch:{ all -> 0x0142 }
            X.7Lp r5 = (X.C149247Lp) r5     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)     // Catch:{ all -> 0x0145 }
            if (r5 == 0) goto L_0x00da
            int r4 = r5.A00     // Catch:{ all -> 0x0145 }
            r1 = 1
            boolean r0 = X.AnonymousClass001.A1W(r4)
            X.C153877cA.A01(r0)     // Catch:{ all -> 0x0145 }
            int r4 = r4 - r1
            r5.A00 = r4     // Catch:{ all -> 0x0145 }
        L_0x00da:
            monitor-exit(r8)     // Catch:{ all -> 0x0145 }
            java.lang.Class<java.lang.Error> r1 = java.lang.Error.class
            boolean r0 = r1.isInstance(r3)
            if (r0 != 0) goto L_0x013b
            java.lang.Class<java.lang.RuntimeException> r1 = java.lang.RuntimeException.class
            boolean r0 = r1.isInstance(r3)
            if (r0 != 0) goto L_0x013b
            r3 = 0
        L_0x00ec:
            monitor-enter(r8)
            java.util.Set r0 = r8.A07     // Catch:{ all -> 0x0138 }
            boolean r0 = r0.add(r3)     // Catch:{ all -> 0x0138 }
            X.C153877cA.A01(r0)     // Catch:{ all -> 0x0138 }
            monitor-enter(r8)     // Catch:{ all -> 0x0138 }
            boolean r0 = r8.A05()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0100
            r8.A03(r2)     // Catch:{ all -> 0x0135 }
        L_0x0100:
            monitor-exit(r8)     // Catch:{ all -> 0x0138 }
            r8.A02()     // Catch:{ all -> 0x0138 }
            X.8vJ r0 = X.C161577py.A00     // Catch:{ all -> 0x0138 }
            boolean r0 = r0.BI0(r11)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0113
            java.lang.Class r1 = r8.A06     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "get (alloc) (object, size) = (%x, %s)"
            X.C161577py.A03(r1, r3, r0, r9)     // Catch:{ all -> 0x0138 }
        L_0x0113:
            monitor-exit(r8)     // Catch:{ all -> 0x0138 }
        L_0x0114:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            int r1 = r3.getAllocationByteCount()
            int r0 = X.C154697db.A00(r15)
            int r10 = r10 * r0
            if (r1 < r10) goto L_0x012e
            r3.reconfigure(r14, r13, r15)
            X.7AS r0 = r12.A00
            X.8ku r1 = r0.A00
            X.8Kh r0 = new X.8Kh
            r0.<init>((X.C180358ku) r1, (X.C180368kv) r8, (java.lang.Object) r3)
            return r0
        L_0x012e:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0135:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0138 }
            throw r0
        L_0x013b:
            java.lang.Object r0 = r1.cast(r3)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0142:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0145 }
            throw r0
        L_0x0148:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            goto L_0x0157
        L_0x014b:
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            int r2 = r4.A01     // Catch:{ all -> 0x0158 }
            X.7Rz r0 = r8.A02     // Catch:{ all -> 0x0158 }
            int r1 = r0.A01     // Catch:{ all -> 0x0158 }
            X.8RE r0 = new X.8RE     // Catch:{ all -> 0x0158 }
            r0.<init>(r5, r2, r1, r9)     // Catch:{ all -> 0x0158 }
        L_0x0157:
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            throw r0
        L_0x015b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x015e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "size must be > 0: size: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", width: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ", height: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", pixelSize: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r2)
            throw r0
        L_0x0181:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "height must be > 0, height is: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r13)
            throw r0
        L_0x018c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "width must be > 0, width is: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157827iw.A01(android.graphics.Bitmap$Config, int, int):X.8Kh");
    }
}
