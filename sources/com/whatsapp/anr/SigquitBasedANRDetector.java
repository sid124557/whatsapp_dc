package com.whatsapp.anr;

import X.AnonymousClass329;
import X.C45772aY;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.regex.Pattern;

public class SigquitBasedANRDetector {
    public HandlerThread A00;
    public String A01;
    public Pattern A02;
    public Pattern A03;
    public final AnonymousClass329 A04;
    public final C45772aY A05;
    public final Object A06;
    public final Object A07;
    public volatile Handler A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z, int i);

    public static native boolean startDetector();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SigquitBasedANRDetector(X.AnonymousClass329 r5, X.C620633i r6) {
        /*
            r4 = this;
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "0."
            boolean r0 = r1.startsWith(r0)
            r3 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r2 = android.os.Build.VERSION.SDK_INT
            X.2aY r1 = new X.2aY
            r1.<init>(r6)
            r4.<init>()
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r4.A07 = r0
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r4.A06 = r0
            r4.A04 = r5
            r4.A05 = r1
            init(r4, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anr.SigquitBasedANRDetector.<init>(X.329, X.33i):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void anrDetected(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L_0x0092
            java.lang.String r4 = "SigquitBasedANRDetector"
            java.lang.String r0 = "On anrDetected call"
            android.util.Log.i(r4, r0)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0092
            java.util.regex.Pattern r0 = r5.A02
            if (r0 != 0) goto L_0x001f
            java.lang.String r1 = "^$^\\s*(\"main\".*?$\\s*\\|\\s+group=\"main\"(?s).*?$^\\s*$)"
            r0 = 8
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            r5.A02 = r0
        L_0x001f:
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x005d
            r0 = 1
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L_0x005d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ANR detected. Main thread: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            android.util.Log.w(r4, r0)
            java.util.regex.Pattern r0 = r5.A03
            if (r0 != 0) goto L_0x004b
            java.lang.String r1 = "^\\s*[ank#](?s).*"
            r0 = 8
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            r5.A03 = r0
        L_0x004b:
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x005d
            java.lang.String r3 = r1.group()
        L_0x0059:
            java.lang.Object r2 = r5.A06
            monitor-enter(r2)
            goto L_0x005f
        L_0x005d:
            r3 = 0
            goto L_0x0059
        L_0x005f:
            boolean r0 = r5.A09     // Catch:{ all -> 0x008f }
            r1 = 1
            if (r0 == 0) goto L_0x0067
            if (r3 == 0) goto L_0x007b
            goto L_0x006a
        L_0x0067:
            r5.A09 = r1     // Catch:{ all -> 0x008f }
            goto L_0x0077
        L_0x006a:
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x008f }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "Detected a new ANR before the end of the previous one"
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x008f }
        L_0x0077:
            r5.A01 = r3     // Catch:{ all -> 0x008f }
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            goto L_0x007d
        L_0x007b:
            r1 = 0
            goto L_0x0077
        L_0x007d:
            if (r1 == 0) goto L_0x0092
            android.os.Handler r0 = r5.A08
            if (r0 == 0) goto L_0x0092
            android.os.Handler r2 = r5.A08
            r1 = 2
            X.3aI r0 = new X.3aI
            r0.<init>(r5, r3, r6, r1)
            r2.post(r0)
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            throw r0
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anr.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }
}
