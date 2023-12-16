package X;

import android.os.Handler;
import android.util.Pair;
import java.util.UUID;

/* renamed from: X.9TX  reason: invalid class name */
public class AnonymousClass9TX {
    public AnonymousClass9ML A00;
    public String A01 = "";
    public final C194959Vh A02;
    public volatile UUID A03;
    public volatile boolean A04;
    public volatile boolean A05;

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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean A03() {
        /*
            r7 = this;
            r6 = 0
            java.util.UUID r0 = r7.A03
            if (r0 == 0) goto L_0x0042
            X.9Vh r5 = r7.A02
            java.util.UUID r4 = r7.A03
            monitor-enter(r5)
            java.util.UUID r0 = r5.A01     // Catch:{ all -> 0x003e }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0013
            goto L_0x0041
        L_0x0013:
            android.os.Handler r0 = r5.A03     // Catch:{ all -> 0x003e }
            boolean r3 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            goto L_0x0039
        L_0x002b:
            java.lang.Class<X.9WU> r2 = X.AnonymousClass9WU.class
            monitor-enter(r2)     // Catch:{ all -> 0x003e }
            android.os.Handler r1 = X.AnonymousClass9WU.A00     // Catch:{ all -> 0x003b }
            boolean r0 = r1.hasMessages(r6, r4)     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
        L_0x0039:
            monitor-exit(r5)
            goto L_0x0043
        L_0x003b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0041:
            monitor-exit(r5)
        L_0x0042:
            r3 = 0
        L_0x0043:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r7.A03 = r0
            X.9Vh r1 = r7.A02
            java.util.UUID r0 = r7.A03
            monitor-enter(r1)
            r1.A01 = r0     // Catch:{ all -> 0x0052 }
            monitor-exit(r1)
            return r3
        L_0x0052:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TX.A03():boolean");
    }

    public UUID A00(Handler handler, String str) {
        UUID uuid;
        C194959Vh r1 = this.A02;
        synchronized (r1) {
            if (this.A04) {
                A01(this.A01, str);
            }
            if (A03()) {
                A01(this.A01, str);
            }
            r1.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public final void A01(String str, String str2) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(" has been evicted. ");
        A0l.append(str2);
        AnonymousClass000.A1D(" now owns the camera device", "SessionManager", A0l);
        new Pair(str, str2);
        AnonymousClass9WT.A00();
        AnonymousClass9ML r0 = this.A00;
        if (r0 != null) {
            C194959Vh r2 = this.A02;
            AnonymousClass9j4 r1 = new AnonymousClass9j4(r0, str, str2);
            synchronized (r2) {
                Handler handler = r2.A00;
                if (handler != null) {
                    handler.post(r1);
                } else {
                    AnonymousClass9WU.A00(r1);
                }
            }
            this.A00 = null;
        }
    }

    public void A02(UUID uuid) {
        C194959Vh r2 = this.A02;
        synchronized (r2) {
            if (uuid != null) {
                if (this.A03 != null && uuid.equals(this.A03)) {
                    A03();
                    r2.A00 = null;
                    this.A00 = null;
                    this.A04 = false;
                }
            }
        }
    }

    public AnonymousClass9TX(C194959Vh r2) {
        this.A02 = r2;
    }
}
