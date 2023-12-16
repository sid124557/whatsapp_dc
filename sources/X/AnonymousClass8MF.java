package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.8MF  reason: invalid class name */
public class AnonymousClass8MF implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass8MF(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new AnonymousClass8MF(obj, i, obj2));
    }

    public static void A01(Object obj, Object obj2, Executor executor, int i) {
        executor.execute(new AnonymousClass8MF(obj, i, obj2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.8BK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.8BJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: X.8BK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: X.8BK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.util.HashMap} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        /*
            r33 = this;
            r3 = r33
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x02c6;
                case 1: goto L_0x0007;
                case 2: goto L_0x0007;
                case 3: goto L_0x02dc;
                case 4: goto L_0x0008;
                case 5: goto L_0x02e1;
                case 6: goto L_0x02f1;
                case 7: goto L_0x0301;
                case 8: goto L_0x0007;
                case 9: goto L_0x0311;
                case 10: goto L_0x02dc;
                case 11: goto L_0x0320;
                case 12: goto L_0x033b;
                case 13: goto L_0x00b9;
                case 14: goto L_0x0348;
                case 15: goto L_0x0353;
                case 16: goto L_0x04c4;
                case 17: goto L_0x02bd;
                case 18: goto L_0x00d9;
                case 19: goto L_0x00f5;
                case 20: goto L_0x010d;
                case 21: goto L_0x0125;
                case 22: goto L_0x04d5;
                case 23: goto L_0x0503;
                case 24: goto L_0x013d;
                case 25: goto L_0x05d5;
                case 26: goto L_0x05eb;
                case 27: goto L_0x05fb;
                case 28: goto L_0x0609;
                case 29: goto L_0x01bf;
                case 30: goto L_0x0a30;
                case 31: goto L_0x0617;
                case 32: goto L_0x061f;
                case 33: goto L_0x062f;
                case 34: goto L_0x063d;
                case 35: goto L_0x0205;
                case 36: goto L_0x023d;
                case 37: goto L_0x064b;
                case 38: goto L_0x024b;
                case 39: goto L_0x06b5;
                case 40: goto L_0x06ca;
                case 41: goto L_0x0986;
                case 42: goto L_0x0707;
                case 43: goto L_0x071e;
                case 44: goto L_0x073c;
                case 45: goto L_0x09c4;
                case 46: goto L_0x0a0a;
                case 47: goto L_0x0757;
                case 48: goto L_0x075f;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r4 = r3.A00
            X.7W4 r4 = (X.AnonymousClass7W4) r4
            java.util.concurrent.ConcurrentLinkedQueue r7 = r4.A01
            java.util.Iterator r10 = r7.iterator()
        L_0x0012:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r8 = r10.next()
            X.7Os r8 = (X.C149997Os) r8
            r5 = 0
            r6 = 1
            boolean r0 = r8.A05     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x006d
            X.7kY r3 = r4.A02     // Catch:{ IllegalStateException -> 0x0032 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0032 }
            r3.A02 = r0     // Catch:{ IllegalStateException -> 0x0032 }
            X.8vT r9 = r8.A00     // Catch:{ IllegalStateException -> 0x0032 }
            r9.reset()     // Catch:{ IllegalStateException -> 0x0032 }
            goto L_0x003b
        L_0x0032:
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0065 }
            X.8vT r9 = r8.A00     // Catch:{ all -> 0x0065 }
            r4.A01(r9, r0)     // Catch:{ all -> 0x0065 }
            X.7kY r3 = r4.A02     // Catch:{ Exception -> 0x0091 }
        L_0x003b:
            r0 = -1
            r3.A02 = r0     // Catch:{ Exception -> 0x0091 }
            boolean r0 = r8.A03     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x0083
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x0091 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0091 }
            java.util.Map r1 = r3.A03     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0062 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x0062 }
            monitor-exit(r2)     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0083
            monitor-enter(r1)     // Catch:{ Exception -> 0x0091 }
            r1.add(r9)     // Catch:{ all -> 0x005f }
            int r0 = r3.A00     // Catch:{ all -> 0x005f }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x005f }
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0083
        L_0x005f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0090
        L_0x0062:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x0090
        L_0x0065:
            r3 = move-exception
            X.7kY r2 = r4.A02     // Catch:{ Exception -> 0x0091 }
            r0 = -1
            r2.A02 = r0     // Catch:{ Exception -> 0x0091 }
            throw r3     // Catch:{ Exception -> 0x0091 }
        L_0x006d:
            X.7QT r3 = r8.A01     // Catch:{ Exception -> 0x0091 }
            boolean r2 = r8.A04     // Catch:{ Exception -> 0x0091 }
            X.8vT r1 = r8.A00     // Catch:{ Exception -> 0x0091 }
            boolean r0 = r3.A0P     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x007d
            if (r2 != 0) goto L_0x0080
            boolean r0 = r3.A0O     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0080
        L_0x007d:
            r1.stop()     // Catch:{ all -> 0x008c }
        L_0x0080:
            r1.release()     // Catch:{ Exception -> 0x0091 }
        L_0x0083:
            monitor-enter(r7)     // Catch:{ Exception -> 0x00aa }
            r7.remove(r8)     // Catch:{ all -> 0x0089 }
            monitor-exit(r7)     // Catch:{ all -> 0x0089 }
            goto L_0x0012
        L_0x0089:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0089 }
            goto L_0x00a9
        L_0x008c:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x0091 }
        L_0x0090:
            throw r0     // Catch:{ Exception -> 0x0091 }
        L_0x0091:
            r3 = move-exception
            java.lang.String r2 = "MediaCodecPoolOptimized"
            java.lang.String r1 = "error-while-release-codec-from-set: %s"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0a37 }
            X.AnonymousClass6C9.A1C(r3, r0, r5)     // Catch:{ all -> 0x0a37 }
            X.AnonymousClass6C8.A1B(r1, r2, r0)     // Catch:{ all -> 0x0a37 }
            if (r8 == 0) goto L_0x0012
            monitor-enter(r7)     // Catch:{ Exception -> 0x00aa }
            r7.remove(r8)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r7)     // Catch:{ all -> 0x00a7 }
            goto L_0x0012
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a7 }
        L_0x00a9:
            throw r0     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r3 = move-exception
            java.lang.String r2 = "MediaCodecPoolOptimized"
            java.lang.String r1 = "error-while-release-codec-from-set-finally: %s"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.AnonymousClass6C9.A1C(r3, r0, r5)
            X.AnonymousClass6C8.A1B(r1, r2, r0)
            goto L_0x0012
        L_0x00b9:
            java.lang.Object r2 = r3.A01
            X.7ku r2 = (X.C158987ku) r2
            java.lang.Object r0 = r3.A00
            X.3Yy r0 = (X.C69903Yy) r0
            java.lang.Object r1 = r0.element
            X.6NI r1 = (X.AnonymousClass6NI) r1
            java.lang.Object r0 = r1.A00()
            X.C162457s7.A0D(r0)
            X.7jL r0 = (X.C158047jL) r0
            boolean r0 = r2.A05(r1, r0)
            if (r0 == 0) goto L_0x0007
            r0 = 0
            r2.A03(r0)
            return
        L_0x00d9:
            java.lang.Object r0 = r3.A00
            X.85C r0 = (X.AnonymousClass85C) r0
            java.lang.Object r2 = r3.A01
            X.7Fh r2 = (X.C147697Fh) r2
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x00e7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0007
            X.8vW r0 = X.AnonymousClass6CA.A0K(r1)
            r0.Bct(r2)
            goto L_0x00e7
        L_0x00f5:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r2 = X.AnonymousClass85C.A00(r0)
        L_0x00fb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.8vW r1 = X.AnonymousClass6CA.A0K(r2)
            java.lang.Object r0 = r3.A01
            X.7n4 r0 = (X.C160117n4) r0
            r1.Bfg(r0)
            goto L_0x00fb
        L_0x010d:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r2 = X.AnonymousClass85C.A00(r0)
        L_0x0113:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.8vW r1 = X.AnonymousClass6CA.A0K(r2)
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            r1.BeA(r0)
            goto L_0x0113
        L_0x0125:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r2 = X.AnonymousClass85C.A00(r0)
        L_0x012b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.8vW r1 = X.AnonymousClass6CA.A0K(r2)
            java.lang.Object r0 = r3.A01
            byte[] r0 = (byte[]) r0
            r1.BWz(r0)
            goto L_0x012b
        L_0x013d:
            java.lang.Object r6 = r3.A00
            X.6OC r6 = (X.AnonymousClass6OC) r6
            java.lang.Object r5 = r3.A01
            X.7X4 r5 = (X.AnonymousClass7X4) r5
            int r1 = r6.A02
            int r0 = r5.A01
            int r1 = r1 - r0
            r6.A02 = r1
            boolean r0 = r5.A06
            r2 = 1
            if (r0 == 0) goto L_0x0157
            r6.A08 = r2
            int r0 = r5.A00
            r6.A01 = r0
        L_0x0157:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x015f
            int r0 = r5.A02
            r6.A03 = r0
        L_0x015f:
            if (r1 != 0) goto L_0x0007
            X.7oF r0 = r5.A03
            com.google.android.exoplayer2.Timeline r3 = r0.A05
            X.7oF r0 = r6.A05
            com.google.android.exoplayer2.Timeline r0 = r0.A05
            int r0 = r0.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r12 = 0
            if (r0 != 0) goto L_0x0185
            int r0 = r3.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x0185
            r0 = -1
            r6.A00 = r0
            r0 = 0
            r6.A04 = r0
        L_0x0185:
            int r0 = r3.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x0a51
            X.6OB r3 = (X.AnonymousClass6OB) r3
            com.google.android.exoplayer2.Timeline[] r0 = r3.A05
            java.util.List r4 = java.util.Arrays.asList(r0)
            int r1 = r4.size()
            java.util.List r3 = r6.A0L
            int r0 = r3.size()
            if (r1 == r0) goto L_0x01a4
            r2 = 0
        L_0x01a4:
            X.C161487pm.A04(r2)
            r2 = 0
        L_0x01a8:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0a51
            java.lang.Object r1 = r3.get(r2)
            X.85t r1 = (X.C1685285t) r1
            java.lang.Object r0 = r4.get(r2)
            com.google.android.exoplayer2.Timeline r0 = (com.google.android.exoplayer2.Timeline) r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x01a8
        L_0x01bf:
            java.lang.Object r9 = r3.A00
            X.87m r9 = (X.C1689787m) r9
            java.lang.Object r12 = r3.A01
            X.8sg r12 = (X.C184868sg) r12
            X.87e r0 = r9.A08
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x0200
            r0 = r12
        L_0x01d1:
            r9.A07 = r0
            long r3 = r12.B7B()
            r9.A03 = r3
            long r7 = r9.A05
            r5 = -1
            r1 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01e7
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x01e8
        L_0x01e7:
            r2 = 0
        L_0x01e8:
            r9.A0C = r2
            if (r2 == 0) goto L_0x01ed
            r1 = 7
        L_0x01ed:
            r9.A00 = r1
            X.8lX r1 = r9.A0T
            boolean r0 = r12.BIq()
            r1.Bbo(r3, r0, r2)
            boolean r0 = r9.A0G
            if (r0 != 0) goto L_0x0007
            r9.A04()
            return
        L_0x0200:
            X.86k r0 = X.C1686986k.A00(r10)
            goto L_0x01d1
        L_0x0205:
            java.lang.Object r2 = r3.A01
            X.89m r2 = (X.C1694889m) r2
            X.7t7 r0 = r2.A05
            java.util.Map r1 = r0.A09
            X.7Wb r0 = r2.A04
            java.lang.Object r5 = r1.get(r0)
            X.89A r5 = (X.AnonymousClass89A) r5
            if (r5 == 0) goto L_0x0007
            java.lang.Object r1 = r3.A00
            X.6Tp r1 = (X.C127866Tp) r1
            int r0 = r1.A01
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0a8d
            r0 = 1
            r2.A02 = r0
            X.8xe r3 = r2.A03
            boolean r0 = r3.Bjs()
            if (r0 == 0) goto L_0x0a60
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0007
            com.google.android.gms.common.internal.IAccountAccessor r1 = r2.A00
            if (r1 == 0) goto L_0x0007
            java.util.Set r0 = r2.A01
            r3.BC3(r1, r0)
            return
        L_0x023d:
            java.lang.Object r0 = r3.A00
            X.7Jn r0 = (X.C148737Jn) r0
            java.lang.Object r1 = r3.A01
            X.8lk r1 = (X.C180858lk) r1
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x0007
            goto L_0x0a91
        L_0x024b:
            java.lang.Object r6 = r3.A00
            X.6R3 r6 = (X.AnonymousClass6R3) r6
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0007
            java.lang.Object r2 = r3.A01
            X.7GK r2 = (X.AnonymousClass7GK) r2
            X.6Tp r7 = r2.A01
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x028b
            X.8tX r6 = r6.A00
            android.app.Activity r5 = r6.B96()
            X.C162177rO.A02(r5)
            android.app.PendingIntent r4 = r7.A02
            X.C162177rO.A02(r4)
            int r3 = r2.A00
            r2 = 0
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r0 = com.google.android.gms.common.api.GoogleApiActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            java.lang.String r0 = "pending_intent"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "failing_client_id"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "notify_manager"
            r1.putExtra(r0, r2)
            r0 = 1
            r6.startActivityForResult(r1, r0)
            return
        L_0x028b:
            X.6Q8 r5 = r6.A02
            X.8tX r8 = r6.A00
            android.app.Activity r1 = r8.B96()
            X.C162177rO.A02(r1)
            int r4 = r7.A01
            r0 = 0
            android.content.Intent r0 = r5.A05(r1, r0, r4)
            if (r0 == 0) goto L_0x0a98
            android.app.Activity r2 = r8.B96()
            X.C162177rO.A02(r2)
            java.lang.String r0 = "d"
            android.content.Intent r1 = r5.A05(r2, r0, r4)
            X.6UE r0 = new X.6UE
            r0.<init>(r1, r8)
            android.app.Dialog r1 = X.AnonymousClass6Q8.A00(r2, r6, r0, r4)
            if (r1 == 0) goto L_0x0007
            java.lang.String r0 = "GooglePlayServicesErrorDialog"
            X.AnonymousClass6Q8.A02(r2, r1, r6, r0)
            return
        L_0x02bd:
            java.lang.Object r0 = r3.A01     // Catch:{ Exception -> 0x0007 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x0007 }
            r0.delete()     // Catch:{ Exception -> 0x0007 }
            goto L_0x0af5
        L_0x02c6:
            java.lang.Object r0 = r3.A01
            X.7af r0 = (X.C153097af) r0
            X.AnonymousClass81Q.A00(r0)     // Catch:{ 6JW -> 0x02ce }
            goto L_0x02db
        L_0x02ce:
            r2 = move-exception
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Unexpected error delivering message on external thread."
            android.util.Log.e(r1, r0, r2)
            java.lang.RuntimeException r0 = X.C18330xA.A09(r2)
            throw r0
        L_0x02db:
            return
        L_0x02dc:
            java.lang.Object r0 = r3.A01
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x02e1:
            java.lang.Object r2 = r3.A01
            X.4FL r2 = (X.AnonymousClass4FL) r2
            java.lang.Object r0 = r3.A00
            X.7oH r0 = (X.C160767oH) r0
            int r1 = r0.A00
            X.7Z2 r0 = r0.A01
            r2.BW8(r0, r1)
            return
        L_0x02f1:
            java.lang.Object r2 = r3.A01
            X.4FL r2 = (X.AnonymousClass4FL) r2
            java.lang.Object r0 = r3.A00
            X.7oH r0 = (X.C160767oH) r0
            int r1 = r0.A00
            X.7Z2 r0 = r0.A01
            r2.BW9(r0, r1)
            return
        L_0x0301:
            java.lang.Object r2 = r3.A01
            X.4FL r2 = (X.AnonymousClass4FL) r2
            java.lang.Object r0 = r3.A00
            X.7oH r0 = (X.C160767oH) r0
            int r1 = r0.A00
            X.7Z2 r0 = r0.A01
            r2.BZR(r0, r1)
            return
        L_0x0311:
            java.lang.Object r0 = r3.A00
            X.7FE r0 = (X.AnonymousClass7FE) r0
            java.lang.Object r1 = r3.A01
            X.7Pv r1 = (X.C150237Pv) r1
            X.81X r0 = r0.A01
            X.7t5 r0 = r0.A01
            r0.A0K = r1
            return
        L_0x0320:
            java.lang.Object r0 = r3.A00
            X.7FE r0 = (X.AnonymousClass7FE) r0
            java.lang.Object r2 = r3.A01
            android.view.Surface r2 = (android.view.Surface) r2
            X.81X r0 = r0.A01
            X.7t5 r1 = r0.A01
            r1.A0I = r2
            boolean r0 = r2.isValid()
            r1.A0M(r0)
            X.85L r0 = r1.A0o
            r0.BRg()
            return
        L_0x033b:
            java.lang.Object r1 = r3.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 10
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x0344 }
        L_0x0344:
            r1.run()
            return
        L_0x0348:
            java.lang.Object r0 = r3.A01
            X.84x r0 = (X.C1683084x) r0
            r0.B4Q()
            r0.BD6()
            return
        L_0x0353:
            java.lang.Object r0 = r3.A01
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getValue()
            X.6Nl r8 = (X.C126336Nl) r8
            monitor-enter(r8)
            java.lang.Object r6 = r3.A00     // Catch:{ all -> 0x04c1 }
            X.851 r6 = (X.AnonymousClass851) r6     // Catch:{ all -> 0x04c1 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x04c1 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x04c1 }
            java.lang.String r1 = r8.A03     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "stash"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x03af
            boolean r0 = r8 instanceof X.C126326Nk     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x03ad
            r0 = r8
            X.6Nk r0 = (X.C126326Nk) r0     // Catch:{ all -> 0x04c1 }
            java.lang.ref.WeakReference r0 = r0.A00     // Catch:{ all -> 0x04c1 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x04c1 }
            X.8uk r1 = (X.C186098uk) r1     // Catch:{ all -> 0x04c1 }
        L_0x0381:
            boolean r0 = r1 instanceof com.facebook.stash.core.FileStash     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x03a5
            com.facebook.stash.core.FileStash r1 = (com.facebook.stash.core.FileStash) r1     // Catch:{ all -> 0x04c1 }
        L_0x0387:
            X.855 r9 = new X.855     // Catch:{ all -> 0x04c1 }
            r9.<init>(r1)     // Catch:{ all -> 0x04c1 }
        L_0x038c:
            X.6Nj r5 = r8.A01     // Catch:{ all -> 0x04c1 }
            r1 = 0
            if (r5 == 0) goto L_0x03ba
            java.lang.Boolean r3 = r6.A01     // Catch:{ all -> 0x04c1 }
            if (r3 != 0) goto L_0x03c0
            X.8lK r0 = r6.A03     // Catch:{ all -> 0x04c1 }
            X.8qg r0 = (X.C183808qg) r0     // Catch:{ all -> 0x04c1 }
            boolean r0 = r0.BJL()     // Catch:{ all -> 0x04c1 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04c1 }
            r6.A01 = r3     // Catch:{ all -> 0x04c1 }
            goto L_0x03b7
        L_0x03a5:
            X.8lK r0 = r6.A03     // Catch:{ all -> 0x04c1 }
            X.84y r1 = new X.84y     // Catch:{ all -> 0x04c1 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x04c1 }
            goto L_0x0387
        L_0x03ad:
            r1 = 0
            goto L_0x0381
        L_0x03af:
            X.8lK r0 = r6.A03     // Catch:{ all -> 0x04c1 }
            X.856 r9 = new X.856     // Catch:{ all -> 0x04c1 }
            r9.<init>(r0, r2)     // Catch:{ all -> 0x04c1 }
            goto L_0x038c
        L_0x03b7:
            if (r0 == 0) goto L_0x03c0
            goto L_0x03bc
        L_0x03ba:
            r3 = r1
            goto L_0x03cc
        L_0x03bc:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04c1 }
            r6.A00 = r0     // Catch:{ all -> 0x04c1 }
        L_0x03c0:
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x03d3
            long r3 = r5.A02     // Catch:{ all -> 0x04c1 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03d3
        L_0x03cc:
            X.6Nh r0 = r8.A02     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x03f5
            long r5 = r0.A00     // Catch:{ all -> 0x04c1 }
            goto L_0x03f7
        L_0x03d3:
            java.lang.Boolean r0 = r6.A00     // Catch:{ all -> 0x04c1 }
            if (r0 != 0) goto L_0x03e5
            X.8lK r0 = r6.A03     // Catch:{ all -> 0x04c1 }
            X.8qg r0 = (X.C183808qg) r0     // Catch:{ all -> 0x04c1 }
            boolean r0 = r0.BI1()     // Catch:{ all -> 0x04c1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04c1 }
            r6.A00 = r0     // Catch:{ all -> 0x04c1 }
        L_0x03e5:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x03f2
            long r3 = r5.A01     // Catch:{ all -> 0x04c1 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f2
            goto L_0x03cc
        L_0x03f2:
            long r1 = r5.A00     // Catch:{ all -> 0x04c1 }
            goto L_0x03ba
        L_0x03f5:
            r5 = 0
        L_0x03f7:
            r14 = 0
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0403
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0403
            goto L_0x0491
        L_0x0403:
            java.util.Collection r2 = r9.B4P()     // Catch:{ all -> 0x04c1 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x04c1 }
            if (r0 != 0) goto L_0x0491
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0414
            r12 = -1
            goto L_0x041c
        L_0x0414:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04c1 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            long r12 = r12 - r5
        L_0x041c:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x04c1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x04c1 }
        L_0x0424:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x0437
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ all -> 0x04c1 }
            X.7JJ r0 = new X.7JJ     // Catch:{ all -> 0x04c1 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x04c1 }
            r10.add(r0)     // Catch:{ all -> 0x04c1 }
            goto L_0x0424
        L_0x0437:
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x04c1 }
            r6 = 3
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x046a
            r0 = 4
            X.C86614Ku.A1U(r10, r0)     // Catch:{ all -> 0x04c1 }
            java.util.ListIterator r11 = r10.listIterator()     // Catch:{ all -> 0x04c1 }
        L_0x0448:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x046a
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x04c1 }
            X.7JJ r5 = (X.AnonymousClass7JJ) r5     // Catch:{ all -> 0x04c1 }
            if (r5 == 0) goto L_0x046a
            java.lang.Long r0 = r5.A00     // Catch:{ all -> 0x04c1 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x04c1 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x046a
            r11.remove()     // Catch:{ all -> 0x04c1 }
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x04c1 }
            r0 = 2
            X.AnonymousClass0x2.A1I(r1, r7, r0)     // Catch:{ all -> 0x04c1 }
            goto L_0x0448
        L_0x046a:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0495
            r0 = 5
            X.C86614Ku.A1U(r10, r0)     // Catch:{ all -> 0x04c1 }
            java.util.Iterator r5 = r10.iterator()     // Catch:{ all -> 0x04c1 }
        L_0x0476:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x0495
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x04c1 }
            X.7JJ r0 = (X.AnonymousClass7JJ) r0     // Catch:{ all -> 0x04c1 }
            java.lang.String r2 = r0.A02     // Catch:{ all -> 0x04c1 }
            long r0 = r9.BJO(r2)     // Catch:{ all -> 0x04c1 }
            long r14 = r14 + r0
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0476
            X.AnonymousClass0x2.A1I(r2, r7, r6)     // Catch:{ all -> 0x04c1 }
            goto L_0x0476
        L_0x0491:
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x04c1 }
        L_0x0495:
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r7)     // Catch:{ all -> 0x04c1 }
        L_0x0499:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x04bf
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r3)     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = X.C18310x6.A0q(r2)     // Catch:{ all -> 0x04c1 }
            r9.BJF(r0)     // Catch:{ all -> 0x04c1 }
            boolean r0 = r9.Bj4(r0)     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x0499
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x04c1 }
            int r1 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x04c1 }
            r0 = 3
            if (r1 == r0) goto L_0x0499
            r2.getValue()     // Catch:{ all -> 0x04c1 }
            goto L_0x0499
        L_0x04bf:
            monitor-exit(r8)     // Catch:{ all -> 0x04c1 }
            return
        L_0x04c1:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x04c1 }
            throw r0
        L_0x04c4:
            java.lang.Object r0 = r3.A00
            X.8Ov r0 = (X.C173238Ov) r0
            int r0 = r0.A00
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r3.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x04d5:
            java.lang.Object r0 = r3.A00
            X.7l9 r0 = (X.C159117l9) r0
            X.8LG r1 = r0.A0B
            boolean r0 = r1.enableWarmCodec
            if (r0 == 0) goto L_0x04fb
            boolean r2 = r1.warmupVp9Codec
            boolean r1 = r1.warmupAv1Codec
            java.lang.String r0 = "video/avc"
            X.C162317rh.A05(r0)
            java.lang.String r0 = "audio/mp4a-latm"
            X.C162317rh.A05(r0)
            if (r2 == 0) goto L_0x04f4
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            X.C162317rh.A05(r0)
        L_0x04f4:
            if (r1 == 0) goto L_0x04fb
            java.lang.String r0 = "video/av01"
            X.C162317rh.A05(r0)
        L_0x04fb:
            java.lang.Object r0 = r3.A01
            android.os.Looper r0 = (android.os.Looper) r0
            r0.quit()
            return
        L_0x0503:
            java.lang.Object r9 = r3.A00
            X.7t5 r9 = (X.C162987t5) r9
            java.lang.Object r12 = r3.A01
            X.7a6 r12 = (X.C152777a6) r12
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0U()
            java.lang.String r0 = "Create new ExoPlayer"
            r9.A0K(r0, r1)
            X.8LG r2 = r9.A0p
            X.8L8 r0 = r2.unstallBufferSetting
            r16 = r0
            X.7As r0 = new X.7As
            r0.<init>()
            X.7OP r13 = new X.7OP
            r13.<init>(r0)
            X.71m r0 = new X.71m
            r0.<init>()
            r9.A0O = r0
            X.7yv r0 = r12.A0F
            java.lang.String r4 = r0.A0H
            java.util.concurrent.atomic.AtomicReference r11 = r9.A0W
            X.7Pl r10 = r9.A0m
            X.71E r0 = r10.A03
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r8 = new com.facebook.video.heroplayer.service.ServiceEventCallbackImpl
            r8.<init>(r0, r4, r11)
            X.85O r0 = new X.85O
            r0.<init>()
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.lang.String r1 = r12.A08
            if (r1 == 0) goto L_0x0567
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0567
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "_"
            r5.append(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r5)
            java.lang.String r0 = "session_id"
            r3.put(r0, r1)
        L_0x0567:
            if (r4 == 0) goto L_0x056e
            java.lang.String r0 = "asset_id"
            r3.put(r0, r4)
        L_0x056e:
            X.85E r7 = new X.85E
            r7.<init>()
            r9.A0N = r7
            X.8gg r6 = r9.A0R
            if (r6 != 0) goto L_0x0586
            X.8Ks r0 = r2.tslogSettings
            boolean r0 = r0.enableTslog
            if (r0 == 0) goto L_0x0586
            X.85M r6 = new X.85M
            r6.<init>()
            r9.A0R = r6
        L_0x0586:
            android.content.Context r0 = r9.A0D
            r32 = r0
            android.os.Handler r0 = r9.A0E
            r31 = r0
            X.0Xd r15 = r9.A0L
            java.util.Map r14 = r9.A0V
            java.util.concurrent.atomic.AtomicBoolean r5 = r9.A0u
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.A0r
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.A0s
            X.7Aw r2 = r9.A0n
            X.71m r1 = r9.A0O
            X.7qS r0 = new X.7qS
            r28 = r4
            r29 = r3
            r30 = r11
            r25 = r6
            r26 = r14
            r27 = r5
            r22 = r9
            r23 = r8
            r24 = r16
            r19 = r12
            r20 = r10
            r21 = r2
            r16 = r7
            r17 = r1
            r18 = r13
            r13 = r32
            r14 = r31
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r9.A12 = r0
            X.85F r0 = new X.85F
            r0.<init>(r9)
            r9.A0P = r0
            X.7qS r1 = r9.A12
            X.85F r0 = r9.A0P
            r1.A08(r0)
            return
        L_0x05d5:
            java.lang.Object r0 = r3.A01
            X.7XC r0 = (X.AnonymousClass7XC) r0
            X.C1689687l.A02(r0)     // Catch:{ 6zd -> 0x05dd }
            goto L_0x05ea
        L_0x05dd:
            r2 = move-exception
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Unexpected error delivering message on external thread."
            X.C159307lc.A02(r1, r0, r2)
            java.lang.RuntimeException r0 = X.C18330xA.A09(r2)
            throw r0
        L_0x05ea:
            return
        L_0x05eb:
            java.lang.Object r0 = r3.A00
            X.7VZ r0 = (X.AnonymousClass7VZ) r0
            java.lang.Object r1 = r3.A01
            X.7Pz r1 = (X.C150277Pz) r1
            monitor-enter(r1)
            monitor-exit(r1)
            X.8uy r0 = r0.A01
            r0.BMo(r1)
            return
        L_0x05fb:
            java.lang.Object r0 = r3.A00
            X.7VZ r0 = (X.AnonymousClass7VZ) r0
            java.lang.Object r1 = r3.A01
            X.7Pz r1 = (X.C150277Pz) r1
            X.8uy r0 = r0.A01
            r0.BMp(r1)
            return
        L_0x0609:
            java.lang.Object r0 = r3.A00
            X.7VZ r0 = (X.AnonymousClass7VZ) r0
            java.lang.Object r1 = r3.A01
            java.lang.Exception r1 = (java.lang.Exception) r1
            X.8uy r0 = r0.A01
            r0.BMt(r1)
            return
        L_0x0617:
            java.lang.Object r0 = r3.A01
            X.88U r0 = (X.AnonymousClass88U) r0
            X.AnonymousClass88U.A01(r0)
            return
        L_0x061f:
            java.lang.Object r0 = r3.A00
            X.7GH r0 = (X.AnonymousClass7GH) r0
            java.lang.Object r1 = r3.A01
            X.7Pz r1 = (X.C150277Pz) r1
            monitor-enter(r1)
            monitor-exit(r1)
            X.8uz r0 = r0.A01
            r0.BfJ(r1)
            return
        L_0x062f:
            java.lang.Object r0 = r3.A00
            X.7GH r0 = (X.AnonymousClass7GH) r0
            java.lang.Object r1 = r3.A01
            X.7Pz r1 = (X.C150277Pz) r1
            X.8uz r0 = r0.A01
            r0.BfK(r1)
            return
        L_0x063d:
            java.lang.Object r0 = r3.A00
            X.7GH r0 = (X.AnonymousClass7GH) r0
            java.lang.Object r1 = r3.A01
            android.view.Surface r1 = (android.view.Surface) r1
            X.8uz r0 = r0.A01
            r0.BZt(r1)
            return
        L_0x064b:
            java.lang.Object r4 = r3.A01
            X.6YT r4 = (X.AnonymousClass6YT) r4
            java.lang.Object r1 = r3.A00
            X.6SF r1 = (X.AnonymousClass6SF) r1
            X.6Tp r3 = r1.A01
            int r0 = r3.A01
            if (r0 != 0) goto L_0x06af
            X.6T1 r1 = r1.A02
            X.C162177rO.A02(r1)
            X.6Tp r3 = r1.A02
            int r0 = r3.A01
            if (r0 != 0) goto L_0x069b
            X.8ln r3 = r4.A00
            com.google.android.gms.common.internal.IAccountAccessor r2 = r1.A00()
            java.util.Set r1 = r4.A06
            X.89m r3 = (X.C1694889m) r3
            if (r2 == 0) goto L_0x0685
            if (r1 == 0) goto L_0x0685
            r3.A00 = r2
            r3.A01 = r1
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x067f
            X.8xe r0 = r3.A03
            r0.BC3(r2, r1)
        L_0x067f:
            X.8xd r0 = r4.A01
            r0.B1l()
            return
        L_0x0685:
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = "GoogleApiManager"
            java.lang.String r0 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r1, r0, r2)
            r1 = 4
            X.6Tp r0 = new X.6Tp
            r0.<init>(r1)
            r3.Bt1(r0)
            goto L_0x067f
        L_0x069b:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r0 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r0 = "SignInCoordinator"
            android.util.Log.wtf(r0, r1, r2)
        L_0x06af:
            X.8ln r0 = r4.A00
            r0.Bt1(r3)
            goto L_0x067f
        L_0x06b5:
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r3.A01
            X.7Xf r1 = (X.C152017Xf) r1
            X.C161637q9.A01(r0)     // Catch:{ Exception -> 0x06c5 }
            r0 = 0
            r1.A00(r0)     // Catch:{ Exception -> 0x06c5 }
            return
        L_0x06c5:
            r2 = move-exception
            X.6YV r0 = r1.A00
            goto L_0x0a2c
        L_0x06ca:
            java.lang.Object r1 = r3.A00
            com.google.android.gms.tasks.Task r1 = (com.google.android.gms.tasks.Task) r1
            r0 = r1
            X.6YV r0 = (X.AnonymousClass6YV) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x06df
            java.lang.Object r0 = r3.A01
            X.8BX r0 = (X.AnonymousClass8BX) r0
            X.6YV r0 = r0.A01
            r0.A00()
            return
        L_0x06df:
            java.lang.Object r2 = r3.A01     // Catch:{ RuntimeExecutionException -> 0x06f8, Exception -> 0x06ef }
            X.8BX r2 = (X.AnonymousClass8BX) r2     // Catch:{ RuntimeExecutionException -> 0x06f8, Exception -> 0x06ef }
            X.8mD r0 = r2.A00     // Catch:{ RuntimeExecutionException -> 0x06f8, Exception -> 0x06ef }
            java.lang.Object r1 = r0.Bqf(r1)     // Catch:{ RuntimeExecutionException -> 0x06f8, Exception -> 0x06ef }
            X.6YV r0 = r2.A01
            r0.A04(r1)
            return
        L_0x06ef:
            r2 = move-exception
            java.lang.Object r0 = r3.A01
            X.8BX r0 = (X.AnonymousClass8BX) r0
            X.6YV r0 = r0.A01
            goto L_0x0a2c
        L_0x06f8:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.Exception
            java.lang.Object r1 = r3.A01
            X.8BX r1 = (X.AnonymousClass8BX) r1
            X.6YV r1 = r1.A01
            goto L_0x09b8
        L_0x0707:
            java.lang.Object r0 = r3.A01
            X.8BZ r0 = (X.AnonymousClass8BZ) r0
            java.lang.Object r2 = r0.A01
            monitor-enter(r2)
            com.google.android.gms.tasks.OnCompleteListener r1 = r0.A00     // Catch:{ all -> 0x071b }
            if (r1 == 0) goto L_0x0719
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x071b }
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch:{ all -> 0x071b }
            r1.onComplete(r0)     // Catch:{ all -> 0x071b }
        L_0x0719:
            monitor-exit(r2)     // Catch:{ all -> 0x071b }
            return
        L_0x071b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x071b }
            throw r0
        L_0x071e:
            java.lang.Object r0 = r3.A01
            X.8Ba r0 = (X.C169888Ba) r0
            java.lang.Object r2 = r0.A01
            monitor-enter(r2)
            com.google.android.gms.tasks.OnFailureListener r1 = r0.A00     // Catch:{ all -> 0x0739 }
            if (r1 == 0) goto L_0x0737
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x0739 }
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch:{ all -> 0x0739 }
            java.lang.Exception r0 = r0.getException()     // Catch:{ all -> 0x0739 }
            X.C162177rO.A02(r0)     // Catch:{ all -> 0x0739 }
            r1.onFailure(r0)     // Catch:{ all -> 0x0739 }
        L_0x0737:
            monitor-exit(r2)     // Catch:{ all -> 0x0739 }
            return
        L_0x0739:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0739 }
            throw r0
        L_0x073c:
            java.lang.Object r0 = r3.A01
            X.8Bb r0 = (X.C169898Bb) r0
            java.lang.Object r2 = r0.A01
            monitor-enter(r2)
            com.google.android.gms.tasks.OnSuccessListener r1 = r0.A00     // Catch:{ all -> 0x0754 }
            if (r1 == 0) goto L_0x0752
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x0754 }
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch:{ all -> 0x0754 }
            java.lang.Object r0 = r0.getResult()     // Catch:{ all -> 0x0754 }
            r1.onSuccess(r0)     // Catch:{ all -> 0x0754 }
        L_0x0752:
            monitor-exit(r2)     // Catch:{ all -> 0x0754 }
            return
        L_0x0754:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0754 }
            throw r0
        L_0x0757:
            java.lang.Object r0 = r3.A00
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0
            r0.close()
            return
        L_0x075f:
            java.lang.Object r0 = r3.A01
            X.6YZ r0 = (X.AnonymousClass6YZ) r0
            X.6CW r5 = r0.A01
            java.lang.Object r1 = r3.A00
            X.6SZ r1 = (X.AnonymousClass6SZ) r1
            com.whatsapp.wearos.WearOsListenerService r5 = (com.whatsapp.wearos.WearOsListenerService) r5
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.lang.String r6 = r1.A02
            X.C162457s7.A0D(r6)
            java.lang.String r4 = r1.A01
            X.C162457s7.A0D(r4)
            byte[] r2 = r1.A03
            X.C162457s7.A0D(r2)
            X.5H4 r3 = r5.A01
            if (r3 == 0) goto L_0x097f
            java.lang.String r0 = "/altLinkingPrefillRequest"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0975
            java.nio.charset.Charset r4 = X.AnonymousClass79X.A05     // Catch:{ IOException -> 0x096a }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x096a }
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x096a }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x096a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x096a }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x096a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x096a }
            r2.beginObject()     // Catch:{ IllegalStateException -> 0x0963 }
            java.lang.String r1 = r2.nextName()     // Catch:{ IllegalStateException -> 0x0963 }
            java.lang.String r0 = "wearOsAppVersion"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ IllegalStateException -> 0x0963 }
            if (r0 == 0) goto L_0x095c
            java.lang.String r0 = r2.nextString()     // Catch:{ IllegalStateException -> 0x0963 }
            r2.endObject()     // Catch:{ IllegalStateException -> 0x0963 }
            X.C162457s7.A0H(r0)     // Catch:{ IOException -> 0x096a }
            X.7Xp r2 = new X.7Xp     // Catch:{ IOException -> 0x096a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x096a }
            X.5K2 r3 = r3.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest request: "
            X.C18260x0.A1P(r1, r0, r2)
            X.2sr r0 = r3.A00
            r0.A0P()
            com.whatsapp.jid.PhoneUserJid r1 = r0.A05
            r7 = 0
            if (r1 != 0) goto L_0x0945
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/registeredPhoneNumber no me contact available"
        L_0x07d0:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x07d3:
            X.5H5 r0 = r3.A04
            X.1VX r1 = r0.A00
            r0 = 3698(0xe72, float:5.182E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x088a
            java.lang.String r0 = "WearOsConfig/isAltLinkingEnabled alt linking for Wear OS killswitch is enabled"
        L_0x07e1:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest feature disabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x07e9:
            X.6tF r8 = X.C140156tF.A00
        L_0x07eb:
            java.io.StringWriter r7 = new java.io.StringWriter
            r7.<init>()
            android.util.JsonWriter r3 = new android.util.JsonWriter
            r3.<init>(r7)
            r3.beginObject()
            boolean r0 = r8 instanceof X.C140146tE
            java.lang.String r9 = "success"
            if (r0 == 0) goto L_0x0863
            android.util.JsonWriter r1 = r3.name(r9)
            r0 = 1
            r1.value(r0)
            java.lang.String r0 = "phoneNumber"
            android.util.JsonWriter r1 = r3.name(r0)
            X.6tE r8 = (X.C140146tE) r8
            java.lang.String r0 = r8.A01
            r1.value(r0)
            java.lang.String r0 = "openOnPhoneNonce"
            android.util.JsonWriter r1 = r3.name(r0)
            java.lang.String r0 = r8.A00
        L_0x081b:
            r1.value(r0)
        L_0x081e:
            r3.endObject()
            r3.close()
            java.lang.String r0 = X.C18290x4.A0o(r7)
            byte[] r0 = r0.getBytes(r4)
            X.C162457s7.A0D(r0)
            X.2ks r1 = new X.2ks
            r1.<init>(r6, r0)
            X.6Qb r0 = r5.A00
            if (r0 == 0) goto L_0x0955
            java.lang.String r3 = r1.A00
            byte[] r2 = r1.A01
            X.7l6 r0 = r0.A05
            X.6Yf r1 = new X.6Yf
            r1.<init>(r0, r3, r2)
            r0.A03(r1)
            X.8lp r0 = X.C1695289q.A00
            com.google.android.gms.tasks.Task r3 = X.C154837dp.A00(r1, r0)
            X.63h r2 = X.C1221563h.A00
            r1 = 5
            X.93X r0 = new X.93X
            r0.<init>(r2, r1)
            r3.addOnSuccessListener(r0)
            X.8BT r0 = new X.8BT
            r0.<init>()
            r3.addOnFailureListener(r0)
            com.google.android.gms.tasks.Tasks.await(r3)
            return
        L_0x0863:
            boolean r0 = r8 instanceof X.C140166tG
            java.lang.String r2 = "error"
            r1 = 0
            if (r0 == 0) goto L_0x0878
            android.util.JsonWriter r0 = r3.name(r9)
            r0.value(r1)
            android.util.JsonWriter r1 = r3.name(r2)
            java.lang.String r0 = "WearOsAppVersionTooOld"
            goto L_0x081b
        L_0x0878:
            boolean r0 = r8 instanceof X.C140156tF
            if (r0 == 0) goto L_0x081e
            android.util.JsonWriter r0 = r3.name(r9)
            r0.value(r1)
            android.util.JsonWriter r1 = r3.name(r2)
            java.lang.String r0 = "Disabled"
            goto L_0x081b
        L_0x088a:
            r0 = 3548(0xddc, float:4.972E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0896
            java.lang.String r0 = "WearOsConfig/isAltLinkingEnabled alt linking prefill is disabled"
            goto L_0x07e1
        L_0x0896:
            java.lang.String r2 = r2.A00
            X.2y6 r11 = X.C60162y6.A00(r2)
            r0 = 3549(0xddd, float:4.973E-42)
            java.lang.String r10 = r1.A0Q(r0)
            X.C162457s7.A0D(r10)
            X.2y6 r9 = X.C60162y6.A00(r10)
            r8 = 0
            if (r11 != 0) goto L_0x08d4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WearOsConfig/isAltLinkingAppVersionAllowed failed to parse Wear OS app version: "
            r1.append(r0)
            r1.append(r2)
        L_0x08b8:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x08bf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest version "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is too old"
            X.C18260x0.A1M(r1, r0)
            X.6tG r8 = X.C140166tG.A00
            goto L_0x07eb
        L_0x08d4:
            if (r9 != 0) goto L_0x08e3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WearOsConfig/isAltLinkingAppVersionAllowed failed to parse alt linking min version: "
            r1.append(r0)
            r1.append(r10)
            goto L_0x08b8
        L_0x08e3:
            int r0 = r11.A01(r9)
            if (r0 < 0) goto L_0x08ea
            r8 = 1
        L_0x08ea:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WearOsConfig/isAltLinkingAppVersionAllowed version check: ("
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " >= "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ") == "
            X.C18260x0.A1D(r0, r1, r8)
            if (r8 == 0) goto L_0x08bf
            if (r7 == 0) goto L_0x07e9
            X.33p r8 = r3.A01
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r8)
            java.lang.String r0 = "companion_reg_with_link_code_enabled_for_wearos"
            X.C18270x1.A0l(r1, r0, r2)
            X.1VX r1 = r3.A02
            r0 = 4560(0x11d0, float:6.39E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0943
            java.lang.String r3 = X.C86604Kt.A0k()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r8)
            java.lang.String r0 = "adl_deep_link_nonce"
            X.C18270x1.A0j(r1, r0, r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "adl_deep_link_nonce_gen_timestamp"
            r8.A1f(r0, r1)
        L_0x0933:
            X.6tE r8 = new X.6tE
            r8.<init>(r7, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest success="
            X.C18260x0.A1P(r1, r0, r8)
            goto L_0x07eb
        L_0x0943:
            r3 = 0
            goto L_0x0933
        L_0x0945:
            X.2jE r0 = r3.A03
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0951
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/registeredPhoneNumber registration not verified"
            goto L_0x07d0
        L_0x0951:
            java.lang.String r7 = r1.user
            goto L_0x07d3
        L_0x0955:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x095c:
            java.lang.String r0 = "wearOsAppVersion key not present"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IllegalStateException -> 0x0963 }
            throw r0     // Catch:{ IllegalStateException -> 0x0963 }
        L_0x0963:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x096a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x096a }
            throw r0     // Catch:{ IOException -> 0x096a }
        L_0x096a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RequestDispatcher/onRequest failed to parse AltLinkingPrefillRequest: "
            X.C18260x0.A1Q(r1, r0, r2)
            return
        L_0x0975:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RequestDispatcher/onRequest ignoring unrecognised request path: "
            X.C18260x0.A0t(r0, r4, r1)
            return
        L_0x097f:
            java.lang.String r0 = "requestDispatcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0986:
            java.lang.Object r2 = r3.A01     // Catch:{ RuntimeExecutionException -> 0x09ab, Exception -> 0x09a2 }
            X.8BJ r2 = (X.AnonymousClass8BJ) r2     // Catch:{ RuntimeExecutionException -> 0x09ab, Exception -> 0x09a2 }
            X.8mD r1 = r2.A00     // Catch:{ RuntimeExecutionException -> 0x09ab, Exception -> 0x09a2 }
            java.lang.Object r0 = r3.A00     // Catch:{ RuntimeExecutionException -> 0x09ab, Exception -> 0x09a2 }
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch:{ RuntimeExecutionException -> 0x09ab, Exception -> 0x09a2 }
            java.lang.Object r1 = r1.Bqf(r0)     // Catch:{ RuntimeExecutionException -> 0x09ab, Exception -> 0x09a2 }
            com.google.android.gms.tasks.Task r1 = (com.google.android.gms.tasks.Task) r1     // Catch:{ RuntimeExecutionException -> 0x09ab, Exception -> 0x09a2 }
            if (r1 != 0) goto L_0x09d6
            java.lang.String r0 = "Continuation returned null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            r2.onFailure(r0)
            return
        L_0x09a2:
            r2 = move-exception
            java.lang.Object r0 = r3.A01
            X.8BJ r0 = (X.AnonymousClass8BJ) r0
            X.6YV r0 = r0.A01
            goto L_0x0a2c
        L_0x09ab:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.Exception
            java.lang.Object r1 = r3.A01
            X.8BJ r1 = (X.AnonymousClass8BJ) r1
            X.6YV r1 = r1.A01
        L_0x09b8:
            if (r2 == 0) goto L_0x09c0
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
        L_0x09c0:
            r1.A03(r0)
            return
        L_0x09c4:
            java.lang.Object r2 = r3.A01     // Catch:{ RuntimeExecutionException -> 0x09f3, CancellationException -> 0x09eb, Exception -> 0x09e2 }
            X.8BK r2 = (X.AnonymousClass8BK) r2     // Catch:{ RuntimeExecutionException -> 0x09f3, CancellationException -> 0x09eb, Exception -> 0x09e2 }
            X.8mI r1 = r2.A00     // Catch:{ RuntimeExecutionException -> 0x09f3, CancellationException -> 0x09eb, Exception -> 0x09e2 }
            java.lang.Object r0 = r3.A00     // Catch:{ RuntimeExecutionException -> 0x09f3, CancellationException -> 0x09eb, Exception -> 0x09e2 }
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch:{ RuntimeExecutionException -> 0x09f3, CancellationException -> 0x09eb, Exception -> 0x09e2 }
            java.lang.Object r0 = r0.getResult()     // Catch:{ RuntimeExecutionException -> 0x09f3, CancellationException -> 0x09eb, Exception -> 0x09e2 }
            com.google.android.gms.tasks.Task r1 = r1.Bqe(r0)     // Catch:{ RuntimeExecutionException -> 0x09f3, CancellationException -> 0x09eb, Exception -> 0x09e2 }
        L_0x09d6:
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.A00
            r1.addOnSuccessListener(r0, r2)
            r1.addOnFailureListener(r0, r2)
            r1.addOnCanceledListener(r0, r2)
            return
        L_0x09e2:
            r1 = move-exception
            java.lang.Object r0 = r3.A01
            X.8BK r0 = (X.AnonymousClass8BK) r0
            r0.onFailure(r1)
            return
        L_0x09eb:
            java.lang.Object r0 = r3.A01
            X.8BK r0 = (X.AnonymousClass8BK) r0
            r0.BOR()
            return
        L_0x09f3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.Exception
            java.lang.Object r1 = r3.A01
            X.8BK r1 = (X.AnonymousClass8BK) r1
            if (r2 == 0) goto L_0x0a06
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
        L_0x0a06:
            r1.onFailure(r0)
            return
        L_0x0a0a:
            java.lang.Object r1 = r3.A00     // Catch:{ Exception -> 0x0a27, all -> 0x0a1a }
            X.6YV r1 = (X.AnonymousClass6YV) r1     // Catch:{ Exception -> 0x0a27, all -> 0x0a1a }
            java.lang.Object r0 = r3.A01     // Catch:{ Exception -> 0x0a27, all -> 0x0a1a }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x0a27, all -> 0x0a1a }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0a27, all -> 0x0a1a }
            r1.A04(r0)     // Catch:{ Exception -> 0x0a27, all -> 0x0a1a }
            return
        L_0x0a1a:
            r0 = move-exception
            java.lang.Object r1 = r3.A00
            X.6YV r1 = (X.AnonymousClass6YV) r1
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            r1.A03(r0)
            return
        L_0x0a27:
            r2 = move-exception
            java.lang.Object r0 = r3.A00
            X.6YV r0 = (X.AnonymousClass6YV) r0
        L_0x0a2c:
            r0.A03(r2)
            return
        L_0x0a30:
            java.lang.String r0 = "playlistParserFactory"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0a37:
            r4 = move-exception
            if (r8 == 0) goto L_0x0a50
            monitor-enter(r7)     // Catch:{ Exception -> 0x0a43 }
            r7.remove(r8)     // Catch:{ all -> 0x0a40 }
            monitor-exit(r7)     // Catch:{ all -> 0x0a40 }
            throw r4
        L_0x0a40:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0a40 }
            throw r0     // Catch:{ Exception -> 0x0a43 }
        L_0x0a43:
            r3 = move-exception
            java.lang.String r2 = "MediaCodecPoolOptimized"
            java.lang.String r1 = "error-while-release-codec-from-set-finally: %s"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.AnonymousClass6C9.A1C(r3, r0, r5)
            X.AnonymousClass6C8.A1B(r1, r2, r0)
        L_0x0a50:
            throw r4
        L_0x0a51:
            boolean r11 = r6.A08
            r6.A08 = r12
            X.7oF r7 = r5.A03
            int r8 = r6.A01
            r9 = 1
            int r10 = r6.A03
            r6.A05(r7, r8, r9, r10, r11, r12)
            return
        L_0x0a60:
            r1 = r3
            X.6Ra r1 = (X.C127196Ra) r1     // Catch:{ SecurityException -> 0x0a75 }
            boolean r0 = r1.Bjs()     // Catch:{ SecurityException -> 0x0a75 }
            if (r0 == 0) goto L_0x0a6f
            java.util.Set r0 = r1.A01     // Catch:{ SecurityException -> 0x0a75 }
        L_0x0a6b:
            r3.BC3(r4, r0)     // Catch:{ SecurityException -> 0x0a75 }
            goto L_0x0a74
        L_0x0a6f:
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ SecurityException -> 0x0a75 }
            goto L_0x0a6b
        L_0x0a74:
            return
        L_0x0a75:
            r2 = move-exception
            java.lang.String r1 = "GoogleApiManager"
            java.lang.String r0 = "Failed to get service from broker. "
            android.util.Log.e(r1, r0, r2)
            java.lang.String r0 = "Failed to get service from broker."
            r3.B1m(r0)
            r1 = 10
            X.6Tp r0 = new X.6Tp
            r0.<init>(r1)
            r5.A07(r0, r4)
            return
        L_0x0a8d:
            r5.A07(r1, r4)
            return
        L_0x0a91:
            r1.BLk(r0)     // Catch:{ RuntimeException -> 0x0a95 }
            goto L_0x0a97
        L_0x0a95:
            r0 = move-exception
            throw r0
        L_0x0a97:
            return
        L_0x0a98:
            r0 = 18
            if (r4 != r0) goto L_0x0ae7
            android.app.Activity r7 = r8.B96()
            X.C162177rO.A02(r7)
            r0 = 16842874(0x101007a, float:2.36939E-38)
            r4 = 0
            android.widget.ProgressBar r2 = new android.widget.ProgressBar
            r2.<init>(r7, r4, r0)
            r0 = 1
            r2.setIndeterminate(r0)
            r0 = 0
            r2.setVisibility(r0)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            r1.setView(r2)
            r0 = 18
            java.lang.String r0 = X.C161967qu.A01(r7, r0)
            r1.setMessage(r0)
            java.lang.String r0 = ""
            r1.setPositiveButton(r0, r4)
            android.app.AlertDialog r2 = r1.create()
            java.lang.String r0 = "GooglePlayServicesUpdatingDialog"
            X.AnonymousClass6Q8.A02(r7, r2, r6, r0)
            android.app.Activity r0 = r8.B96()
            X.C162177rO.A02(r0)
            android.content.Context r1 = r0.getApplicationContext()
            X.6RC r0 = new X.6RC
            r0.<init>(r2, r3)
            r5.A06(r1, r0)
            return
        L_0x0ae7:
            int r2 = r2.A00
            java.util.concurrent.atomic.AtomicReference r1 = r6.A04
            r0 = 0
            r1.set(r0)
            X.7t7 r0 = r6.A03
            r0.A05(r7, r2)
            return
        L_0x0af5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8MF.run():void");
    }
}
