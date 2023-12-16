package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9XE  reason: invalid class name */
public class AnonymousClass9XE implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public int A02;
    public Camera A03;
    public final Handler A04 = new Handler(Looper.getMainLooper(), new C204529pV(this, 0));
    public final AnonymousClass9T8 A05;
    public final C194439Sw A06 = new C194439Sw();
    public final C194959Vh A07;
    public final Callable A08 = new C204469pP((Object) this, 4);
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void A00(int r6) {
        /*
            r5 = this;
            r4 = r5
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x007c
            int r0 = r5.A09
            if (r6 == r0) goto L_0x007c
            int r0 = r5.A01
            if (r6 > r0) goto L_0x007c
            if (r6 < 0) goto L_0x007c
            boolean r0 = X.AnonymousClass9WU.A02()
            if (r0 != 0) goto L_0x0075
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x003b
            monitor-enter(r4)
            r5.A02 = r6     // Catch:{ all -> 0x0072 }
            boolean r0 = r5.A0C     // Catch:{ all -> 0x0072 }
            r1 = 1
            if (r0 == 0) goto L_0x0030
            boolean r0 = r5.A0D     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0070
            r5.A0D = r1     // Catch:{ all -> 0x0072 }
            android.hardware.Camera r0 = r5.A03     // Catch:{ all -> 0x0072 }
            r0.getClass()     // Catch:{ all -> 0x0072 }
            r0.stopSmoothZoom()     // Catch:{ all -> 0x0072 }
            goto L_0x0070
        L_0x0030:
            r5.A0C = r1     // Catch:{ all -> 0x0072 }
            android.hardware.Camera r0 = r5.A03     // Catch:{ all -> 0x0072 }
            r0.getClass()     // Catch:{ all -> 0x0072 }
            r0.startSmoothZoom(r6)     // Catch:{ all -> 0x0072 }
            goto L_0x0070
        L_0x003b:
            X.9T8 r1 = r5.A05     // Catch:{ Exception -> 0x0059 }
            int r0 = r5.A00     // Catch:{ Exception -> 0x0059 }
            X.96v r2 = r1.A00(r0)     // Catch:{ Exception -> 0x0059 }
            X.9Mx r1 = X.C195049Vr.A0x     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0059 }
            X.AnonymousClass9My.A02(r1, r2, r0)     // Catch:{ Exception -> 0x0059 }
            r2.A02()     // Catch:{ Exception -> 0x0059 }
            android.hardware.Camera r1 = r5.A03     // Catch:{ Exception -> 0x0059 }
            r1.getClass()     // Catch:{ Exception -> 0x0059 }
            r0 = 1
            r5.onZoomChange(r6, r0, r1)     // Catch:{ Exception -> 0x0059 }
            return
        L_0x0059:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to set zoom level to: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r6)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r3)
            monitor-enter(r4)
            android.os.Handler r1 = r5.A04     // Catch:{ all -> 0x0072 }
            r0 = 2
            X.AnonymousClass6C7.A10(r1, r2, r0)     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r4)
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0075:
            java.lang.String r0 = "Attempting to zoom on the UI thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XE.A00(int):void");
    }

    public synchronized void onZoomChange(int i, boolean z, Camera camera) {
        this.A09 = i;
        int i2 = 0;
        if (this.A0E) {
            this.A0C = AnonymousClass000.A1T(z ? 1 : 0);
            if (z) {
                this.A0D = false;
                if (this.A0B && this.A02 != i) {
                    this.A07.A07("update_zoom_level", this.A08);
                }
            }
        }
        Handler handler = this.A04;
        if (z) {
            i2 = 1;
        }
        handler.sendMessage(handler.obtainMessage(1, i, i2));
    }

    public AnonymousClass9XE(AnonymousClass9T8 r4, C194959Vh r5) {
        this.A05 = r4;
        this.A07 = r5;
    }
}
