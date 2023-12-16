package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.7sq  reason: invalid class name and case insensitive filesystem */
public class C162837sq implements SensorEventListener {
    public final AnonymousClass7TA A00;
    public final /* synthetic */ C111115hZ A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C162837sq(C111115hZ r1) {
        this();
        this.A01 = r1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onSensorChanged(android.hardware.SensorEvent r13) {
        /*
            r12 = this;
            X.7TA r5 = r12.A00
            X.7Te r6 = r5.A02
            monitor-enter(r6)
            int r7 = r6.A01     // Catch:{ all -> 0x00fc }
            monitor-exit(r6)
            long r2 = r13.timestamp
            if (r7 != 0) goto L_0x0019
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r2 = r2 + r0
            r5.A00 = r2
        L_0x0012:
            X.7ER r2 = new X.7ER
            r2.<init>(r13)
        L_0x0017:
            monitor-enter(r6)
            goto L_0x0036
        L_0x0019:
            long r0 = r5.A00
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            r0 = 32
            if (r7 < r0) goto L_0x0012
        L_0x0023:
            java.lang.Object r2 = r6.A00()
            X.7ER r2 = (X.AnonymousClass7ER) r2
            float[] r1 = r13.values
            r0 = 0
            r0 = r1[r0]
            r2.A00 = r0
            goto L_0x0017
        L_0x0031:
            r0 = 10
            if (r7 >= r0) goto L_0x0023
            goto L_0x0012
        L_0x0036:
            int r0 = r6.A01     // Catch:{ all -> 0x00f4 }
            java.lang.Object[] r9 = r6.A03     // Catch:{ all -> 0x00f4 }
            int r8 = r9.length     // Catch:{ all -> 0x00f4 }
            if (r0 != r8) goto L_0x0042
            if (r0 == 0) goto L_0x0042
            r6.A00()     // Catch:{ all -> 0x00fc }
        L_0x0042:
            int r1 = r6.A01     // Catch:{ all -> 0x00fc }
            boolean r0 = X.AnonymousClass001.A1Y(r1, r8)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x00fc }
            int r0 = r6.A00     // Catch:{ all -> 0x00fc }
            r9[r0] = r2     // Catch:{ all -> 0x00fc }
            int r0 = r0 + 1
            int r0 = r0 % r8
            r6.A00 = r0     // Catch:{ all -> 0x00fc }
            int r0 = r1 + 1
            r6.A01 = r0     // Catch:{ all -> 0x00fc }
            monitor-exit(r6)
            r7 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x005d:
            monitor-enter(r6)
            int r1 = r6.A01     // Catch:{ all -> 0x00fc }
            monitor-exit(r6)
            r0 = 2
            r11 = 1
            if (r4 >= r1) goto L_0x00b3
            monitor-enter(r6)
            int r0 = r6.A01     // Catch:{ all -> 0x00fc }
            if (r0 <= r4) goto L_0x00f6
            int r0 = r6.A02     // Catch:{ all -> 0x00fc }
            int r0 = r0 + r4
            int r0 = r0 % r8
            r0 = r9[r0]     // Catch:{ all -> 0x00fc }
            monitor-exit(r6)
            X.7ER r0 = (X.AnonymousClass7ER) r0
            float r1 = r0.A00
            r0 = 1095806846(0x4150af7e, float:13.042845)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r10 = X.AnonymousClass001.A1W(r0)
            r0 = -1051676802(0xffffffffc150af7e, float:-13.042845)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1V(r0)
            X.6vp r0 = r5.A01
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x00a1
            if (r0 == r11) goto L_0x009c
            if (r10 != 0) goto L_0x00ac
            if (r1 != 0) goto L_0x0099
        L_0x0095:
            X.6vp r0 = X.C141596vp.Insignificant
            r5.A01 = r0
        L_0x0099:
            int r4 = r4 + 1
            goto L_0x005d
        L_0x009c:
            if (r1 != 0) goto L_0x00a5
            if (r10 != 0) goto L_0x0099
            goto L_0x0095
        L_0x00a1:
            if (r10 != 0) goto L_0x00ac
            if (r1 == 0) goto L_0x0099
        L_0x00a5:
            X.6vp r0 = X.C141596vp.BelowThreshold
            r5.A01 = r0
            int r2 = r2 + 1
            goto L_0x0099
        L_0x00ac:
            X.6vp r0 = X.C141596vp.AboveThreshold
            r5.A01 = r0
            int r3 = r3 + 1
            goto L_0x0099
        L_0x00b3:
            if (r3 < r0) goto L_0x00d7
            if (r2 < r0) goto L_0x00d7
            r5.A00()
            X.5hZ r0 = r12.A01
            java.lang.ref.WeakReference r0 = r0.A02
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r4 = r0.get()
            android.app.Activity r4 = (android.app.Activity) r4
        L_0x00c6:
            boolean r0 = r4 instanceof X.C89654ea
            if (r0 == 0) goto L_0x00d7
            X.4ea r4 = (X.C89654ea) r4
            boolean r0 = r4.isFinishing()
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "Activity is finished. Can't show feedback collector."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00d7:
            return
        L_0x00d8:
            r4 = 0
            goto L_0x00c6
        L_0x00da:
            android.net.Uri r3 = r4.A6D()
            r2 = 0
            java.lang.String r1 = X.AnonymousClass000.A0O(r4)
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            boolean r0 = r1.equals(r0)
            android.content.Intent r0 = X.C627736r.A0I(r4, r3, r2, r0)
            r4.startActivity(r0)
            r5.A00()
            return
        L_0x00f4:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f6:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x00fc }
            r0.<init>()     // Catch:{ all -> 0x00fc }
        L_0x00fb:
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162837sq.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C162837sq() {
        this.A00 = new AnonymousClass7TA();
    }
}
