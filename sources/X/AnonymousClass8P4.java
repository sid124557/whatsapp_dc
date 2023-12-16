package X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: X.8P4  reason: invalid class name */
public class AnonymousClass8P4 implements SSLSessionContext {
    public C152887aK A00;
    public final Map A01;
    public volatile int A02;
    public volatile long A03;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized javax.net.ssl.SSLSession getSession(byte[] r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            X.7WP r7 = new X.7WP     // Catch:{ all -> 0x00e5 }
            r7.<init>(r14, r15)     // Catch:{ all -> 0x00e5 }
            java.util.Map r3 = r14.A01     // Catch:{ 6zV -> 0x00d8 }
            monitor-enter(r3)     // Catch:{ 6zV -> 0x00d8 }
            java.lang.Object r6 = r3.get(r7)     // Catch:{ all -> 0x00d5 }
            X.8P3 r6 = (X.AnonymousClass8P3) r6     // Catch:{ all -> 0x00d5 }
            if (r6 != 0) goto L_0x0059
            X.7aK r2 = r14.A00     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00d3
            monitor-enter(r2)     // Catch:{ all -> 0x00d5 }
            java.io.File r0 = r2.A01()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001f
            monitor-exit(r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d3
        L_0x001f:
            java.io.File r1 = r2.A01()     // Catch:{ all -> 0x0035 }
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r15, r0)     // Catch:{ all -> 0x0035 }
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0035 }
            com.whatsapp.watls13.WtPersistentSession r4 = r2.A00(r0)     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x00d3
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x0038:
            java.lang.String r2 = r4.A02     // Catch:{ all -> 0x00d5 }
            int r1 = r4.A00     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x00d5 }
            X.8P3 r6 = new X.8P3     // Catch:{ all -> 0x00d5 }
            r6.<init>(r14, r2, r0, r1)     // Catch:{ all -> 0x00d5 }
            java.util.Map r0 = r4.A04     // Catch:{ all -> 0x00d5 }
            r6.A08 = r0     // Catch:{ all -> 0x00d5 }
            java.util.LinkedHashSet r0 = r4.A03     // Catch:{ all -> 0x00d5 }
            r6.A07 = r0     // Catch:{ all -> 0x00d5 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d5 }
            r6.A02 = r0     // Catch:{ all -> 0x00d5 }
            X.7WP r0 = new X.7WP     // Catch:{ all -> 0x00d5 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x00d5 }
            r3.put(r0, r6)     // Catch:{ all -> 0x00d5 }
        L_0x0059:
            boolean r0 = r6.isValid()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r9 = r6.getPeerHost()     // Catch:{ all -> 0x00d5 }
            int r13 = r6.getPeerPort()     // Catch:{ all -> 0x00d5 }
            java.lang.String r10 = r6.getCipherSuite()     // Catch:{ all -> 0x00d5 }
            X.8P3 r5 = new X.8P3     // Catch:{ all -> 0x00d5 }
            r5.<init>(r14, r9, r10, r13)     // Catch:{ all -> 0x00d5 }
            java.util.LinkedHashSet r0 = r6.A07     // Catch:{ all -> 0x00d5 }
            r8 = 0
            if (r0 == 0) goto L_0x009d
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x009d
            java.util.Random r2 = new java.util.Random     // Catch:{ all -> 0x00d5 }
            r2.<init>()     // Catch:{ all -> 0x00d5 }
            java.util.LinkedHashSet r1 = r6.A07     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x009d
            r0 = 0
            com.whatsapp.net.tls13.WtCachedPsk[] r0 = new com.whatsapp.net.tls13.WtCachedPsk[r0]     // Catch:{ all -> 0x00d5 }
            java.lang.Object[] r4 = r1.toArray(r0)     // Catch:{ all -> 0x00d5 }
            com.whatsapp.net.tls13.WtCachedPsk[] r4 = (com.whatsapp.net.tls13.WtCachedPsk[]) r4     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x009d
            int r0 = r4.length     // Catch:{ all -> 0x00d5 }
            int r2 = r2.nextInt(r0)     // Catch:{ all -> 0x00d5 }
            java.util.LinkedHashSet r1 = r6.A07     // Catch:{ all -> 0x00d5 }
            r0 = r4[r2]     // Catch:{ all -> 0x00d5 }
            r1.remove(r0)     // Catch:{ all -> 0x00d5 }
            r8 = r4[r2]     // Catch:{ all -> 0x00d5 }
        L_0x009d:
            java.util.Map r1 = r6.A08     // Catch:{ all -> 0x00d5 }
            byte r0 = r8.certsID     // Catch:{ all -> 0x00d5 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00d5 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00d5 }
            java.security.cert.Certificate[] r0 = (java.security.cert.Certificate[]) r0     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00b2
            r5.A03 = r8     // Catch:{ all -> 0x00d5 }
            r5.A01(r0)     // Catch:{ all -> 0x00d5 }
        L_0x00b2:
            X.7aK r1 = r14.A00     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00c4
            byte[] r0 = r7.A01     // Catch:{ all -> 0x00d5 }
            java.util.LinkedHashSet r11 = r6.A07     // Catch:{ all -> 0x00d5 }
            java.util.Map r12 = r6.A08     // Catch:{ all -> 0x00d5 }
            com.whatsapp.watls13.WtPersistentSession r8 = new com.whatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x00d5 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d5 }
            r1.A02(r8, r0)     // Catch:{ all -> 0x00d5 }
        L_0x00c4:
            monitor-exit(r3)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r14)
            return r5
        L_0x00c7:
            r3.remove(r7)     // Catch:{ all -> 0x00d5 }
            X.7aK r1 = r14.A00     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d3
            byte[] r0 = r7.A01     // Catch:{ all -> 0x00d5 }
            r1.A03(r0)     // Catch:{ all -> 0x00d5 }
        L_0x00d3:
            monitor-exit(r3)     // Catch:{ all -> 0x00d5 }
            goto L_0x00e2
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ 6zV -> 0x00d8 }
        L_0x00d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "Encountered Exception "
            X.C18260x0.A1O(r1, r0, r2)     // Catch:{ all -> 0x00e5 }
        L_0x00e2:
            monitor-exit(r14)
            r5 = 0
            return r5
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8P4.getSession(byte[]):javax.net.ssl.SSLSession");
    }

    public Enumeration getIds() {
        SSLSession[] sSLSessionArr;
        Map map = this.A01;
        synchronized (map) {
            sSLSessionArr = (SSLSession[]) map.values().toArray(new SSLSession[0]);
        }
        return new C172848Nb(this, Arrays.asList(sSLSessionArr).iterator());
    }

    public int getSessionCacheSize() {
        return this.A02;
    }

    public int getSessionTimeout() {
        return (int) this.A03;
    }

    public void setSessionCacheSize(int i) {
        if (i >= 0) {
            this.A02 = i;
            return;
        }
        throw AnonymousClass001.A0c("Cache size < 0");
    }

    public void setSessionTimeout(int i) {
        if (i >= 0) {
            this.A03 = (long) i;
            Map map = this.A01;
            synchronized (map) {
                Iterator A0v = AnonymousClass001.A0v(map);
                while (A0v.hasNext()) {
                    SSLSession sSLSession = (SSLSession) A0v.next();
                    if (!sSLSession.isValid()) {
                        A0v.remove();
                        C152887aK r1 = this.A00;
                        if (r1 != null) {
                            r1.A03(sSLSession.getId());
                        }
                    }
                }
            }
            return;
        }
        throw AnonymousClass001.A0c("Timeout < 0");
    }

    public AnonymousClass8P4(C152887aK r3) {
        this.A02 = 64;
        this.A01 = new C174228Tl(this);
        this.A03 = 172800;
        this.A00 = r3;
    }

    public AnonymousClass8P4() {
    }
}
