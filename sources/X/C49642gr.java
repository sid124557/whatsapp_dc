package X;

import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.2gr  reason: invalid class name and case insensitive filesystem */
public final class C49642gr {
    public C172228Ke A00;
    public final C54292oU A01;
    public final C60152y5 A02;
    public final Set A03 = AnonymousClass002.A0K();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A01(java.lang.String r4, byte[] r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.C18260x0.A0O(r4, r5)     // Catch:{ all -> 0x0032 }
            X.8Ke r0 = r3.A00     // Catch:{ IOException -> 0x0026 }
            if (r0 == 0) goto L_0x0030
            X.7WJ r1 = r0.A08(r4)     // Catch:{ IOException -> 0x0026 }
            if (r1 == 0) goto L_0x0030
            java.io.OutputStream r0 = r1.A00()     // Catch:{ IOException -> 0x0026 }
            r0.write(r5)     // Catch:{ IOException -> 0x0026 }
            r1.A01()     // Catch:{ IOException -> 0x0026 }
            java.util.Set r1 = r3.A03     // Catch:{ IOException -> 0x0026 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0026 }
            r1.add(r4)     // Catch:{ all -> 0x0023 }
            r3.A00()     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0026 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0026 }
            throw r0     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "FcsConfigDiskCache/writeToDisk: "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49642gr.A01(java.lang.String, byte[]):void");
    }

    public final void A00() {
        C18270x1.A0j(C60152y5.A00(this.A02, "phoenix"), "fcs_config_cache_key_set", new JSONArray(this.A03).toString());
    }

    public C49642gr(C54292oU r2, C60152y5 r3) {
        C18260x0.A0Q(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }
}
