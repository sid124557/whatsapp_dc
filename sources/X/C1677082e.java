package X;

import android.os.SystemClock;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.82e  reason: invalid class name and case insensitive filesystem */
public class C1677082e implements C187458xF {
    public int A00 = 0;
    public int A01;
    public int A02;
    public long A03 = 0;
    public long A04;
    public long A05 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = 0;
    public long A09;
    public long A0A;
    public String A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C177658gE A0H;
    public final C186588vc A0I;
    public final /* synthetic */ C1674981h A0J;

    public void BeW() {
        A00(true);
    }

    public C1677082e(C177658gE r3, C186588vc r4, C1674981h r5, boolean z) {
        this.A0J = r5;
        this.A0I = r4;
        this.A0H = r3;
        this.A0D = z;
    }

    public void BO0(C161387pX r7, Object obj, int i, boolean z) {
        int i2;
        int i3 = this.A02 + i;
        this.A02 = i3;
        if (this.A08 <= 0 && this.A0F && (i2 = this.A00) > 0 && i3 >= i2) {
            this.A08 = SystemClock.elapsedRealtime();
            this.A0C = true;
        }
    }

    public void BUa(C142646xX r1) {
    }

    public void BUb() {
    }

    public void BeX(C161387pX r6, Object obj, boolean z) {
        if (this.A09 != 0) {
            A00(false);
        }
    }

    public void BeY(IOException iOException) {
        if (this.A09 != 0) {
            A00(true);
        }
    }

    public void BeZ(String str, Object obj) {
        if (this.A0G && "x-fb-response-time-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A03 = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        if ("x-bwe-mean".equalsIgnoreCase(str) && obj != null) {
            try {
                String[] split = ((String) obj).split(";");
                this.A06 = 0;
                this.A07 = 0;
                this.A05 = 0;
                for (String split2 : split) {
                    String[] split3 = split2.split(":");
                    if (split3.length != 2) {
                        break;
                    }
                    if (split3[0].equalsIgnoreCase("aggressive")) {
                        this.A06 = Long.parseLong(split3[1]);
                    }
                    if (split3[0].equalsIgnoreCase("mean")) {
                        this.A07 = Long.parseLong(split3[1]);
                    }
                    if (split3[0].equalsIgnoreCase("conservative")) {
                        this.A05 = Long.parseLong(split3[1]);
                    }
                }
            } catch (NumberFormatException unused2) {
            }
        }
        if ("x-bwe-std-dev".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused3) {
            }
        }
        if ("x-mrtt-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused4) {
            }
        }
        if ("x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A00 = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused5) {
            }
        }
    }

    public void Bea(C161387pX r5, C142646xX r6) {
        String obj = r5.A04.toString();
        C160487ni r0 = r5.A05;
        int i = r0.A06;
        boolean z = r0.A0Q;
        try {
            this.A0B = new URL(obj).getHost();
        } catch (MalformedURLException unused) {
            this.A0B = null;
        }
        this.A0E = C18300x5.A1W(r6, C142646xX.A03);
        this.A09 = SystemClock.elapsedRealtime();
        this.A01 = i;
        this.A03 = 0;
        this.A0G = z;
    }

    public void Beb(C161387pX r3, Object obj, boolean z, boolean z2) {
        this.A0F = z2;
        this.A0A = SystemClock.elapsedRealtime();
    }

    public void Bm1(long j) {
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x023a A[Catch:{ all -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x025b A[Catch:{ all -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0278 A[Catch:{ all -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0295 A[Catch:{ all -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x029a A[Catch:{ all -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02ac A[Catch:{ all -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02cc A[Catch:{ all -> 0x02f9 }] */
    public final void A00(boolean r35) {
        /*
            r34 = this;
            long r7 = android.os.SystemClock.elapsedRealtime()
            r2 = r34
            long r0 = r2.A04
            r10 = 0
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0010
            long r0 = r2.A09
        L_0x0010:
            long r5 = r2.A0A
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x007a
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x007a
            boolean r3 = r2.A0D
            if (r3 == 0) goto L_0x002d
            boolean r3 = r2.A0C
            if (r3 == 0) goto L_0x002d
            int r3 = r2.A00
            if (r3 == 0) goto L_0x002d
            long r3 = r2.A08
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r12 = 1
            if (r9 != 0) goto L_0x002e
        L_0x002d:
            r12 = 0
        L_0x002e:
            long r3 = r2.A09
            long r0 = r0 - r3
            int r9 = (int) r0
            long r0 = r5 - r3
            int r10 = (int) r0
            if (r12 == 0) goto L_0x0039
            long r7 = r2.A08
        L_0x0039:
            long r7 = r7 - r5
            int r11 = (int) r7
            if (r12 == 0) goto L_0x02ee
            int r8 = r2.A00
        L_0x003f:
            r16 = 0
            boolean r7 = r2.A0E
            if (r35 != 0) goto L_0x004b
            int r0 = r2.A02
            r28 = 0
            if (r0 > 0) goto L_0x004d
        L_0x004b:
            r28 = 1
        L_0x004d:
            boolean r0 = r2.A0F
            long r5 = r2.A03
            X.7Pb r1 = new X.7Pb
            r18 = r1
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r8
            r23 = r3
            r25 = r5
            r27 = r7
            r29 = r0
            r18.<init>(r19, r20, r21, r22, r23, r25, r27, r28, r29)
            X.81h r5 = r2.A0J
            boolean r4 = r1.A08
            if (r4 == 0) goto L_0x0092
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = r5.A03
            X.8L1 r3 = r0.abrSetting
            boolean r0 = r3.enableBwOnlyEstimationForLongPoll
            if (r0 != 0) goto L_0x0092
            boolean r0 = r3.removeCDNResponseTimeForLongPoll
            if (r0 != 0) goto L_0x0092
        L_0x007a:
            r4 = 0
            r2.A09 = r4
            r2.A0A = r4
            r3 = 0
            r2.A02 = r3
            r2.A0E = r3
            r2.A01 = r3
            r0 = -1
            r2.A04 = r0
            r2.A00 = r3
            r2.A0C = r3
            r2.A08 = r4
            return
        L_0x0092:
            r20 = r4 ^ 1
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = r5.A03
            r33 = r0
            X.8L1 r4 = r0.abrSetting
            int r0 = r4.maxNumberSmallBwSamplesIgnored
            r3 = 0
            if (r0 <= 0) goto L_0x00bc
            monitor-enter(r5)
            int r12 = r1.A02     // Catch:{ all -> 0x02fe }
            r0 = r33
            X.8L1 r4 = r0.abrSetting     // Catch:{ all -> 0x02fe }
            int r0 = r4.initSegmentBandwidthExclusionLimitBytes     // Catch:{ all -> 0x02fe }
            if (r12 < r0) goto L_0x00b1
            int r0 = r5.A00     // Catch:{ all -> 0x02fe }
            if (r0 <= 0) goto L_0x00f6
            r5.A00 = r3     // Catch:{ all -> 0x02fe }
            goto L_0x00f6
        L_0x00b1:
            int r3 = r5.A00     // Catch:{ all -> 0x02fe }
            int r0 = r4.maxNumberSmallBwSamplesIgnored     // Catch:{ all -> 0x02fe }
            if (r3 >= r0) goto L_0x00c3
            int r3 = r3 + 1
            r5.A00 = r3     // Catch:{ all -> 0x02fe }
            goto L_0x00c3
        L_0x00bc:
            int r12 = r1.A02
            int r0 = r4.initSegmentBandwidthExclusionLimitBytes
            if (r12 < r0) goto L_0x00c6
            goto L_0x00f7
        L_0x00c3:
            if (r3 >= r0) goto L_0x00f6
            monitor-exit(r5)
        L_0x00c6:
            r19 = 0
            r0 = r33
            X.8L1 r0 = r0.abrSetting
            boolean r0 = r0.enableTtfbOnlyEstimation
            if (r0 != 0) goto L_0x00d2
            r20 = 0
        L_0x00d2:
            r0 = r33
            X.8L1 r0 = r0.abrSetting
            boolean r0 = r0.removeCDNResponseTimeForLongPoll
            if (r0 == 0) goto L_0x00f1
            long r6 = r1.A03
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            int r0 = r1.A00
            long r3 = (long) r0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f1
            long r3 = r3 - r6
            int r0 = (int) r3
            r1.A00 = r0
            r20 = 1
        L_0x00ed:
            X.7nP r5 = r5.A02
            monitor-enter(r5)
            goto L_0x00fa
        L_0x00f1:
            if (r20 != 0) goto L_0x00ed
            if (r19 == 0) goto L_0x007a
            goto L_0x00ed
        L_0x00f6:
            monitor-exit(r5)
        L_0x00f7:
            r19 = 1
            goto L_0x00d2
        L_0x00fa:
            java.lang.String r0 = "onTransferFinished"
            X.C153827c5.A01(r0)     // Catch:{ all -> 0x02f9 }
            int r0 = r5.A01     // Catch:{ all -> 0x02f7 }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x02f7 }
            long r8 = r1.A05     // Catch:{ all -> 0x02f7 }
            r6 = 0
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d8
            boolean r0 = r1.A06     // Catch:{ all -> 0x02f7 }
            if (r0 != 0) goto L_0x01d8
            boolean r0 = r1.A07     // Catch:{ all -> 0x02f7 }
            if (r0 != 0) goto L_0x01d8
            int r0 = r1.A00     // Catch:{ all -> 0x02f7 }
            long r3 = (long) r0     // Catch:{ all -> 0x02f7 }
            long r10 = r1.A04     // Catch:{ all -> 0x02f7 }
            long r3 = r3 - r10
            int r0 = r1.A01     // Catch:{ all -> 0x02f7 }
            long r0 = (long) r0     // Catch:{ all -> 0x02f7 }
            long r0 = r0 + r3
            long r8 = r8 + r0
            long r10 = r10 + r8
            r13 = 8000(0x1f40, double:3.9525E-320)
            int r8 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x012a
            long r6 = (long) r12     // Catch:{ all -> 0x02f7 }
            long r6 = r6 * r13
            long r6 = r6 / r0
        L_0x012a:
            if (r12 <= 0) goto L_0x012d
            goto L_0x0130
        L_0x012d:
            r18 = 0
            goto L_0x0138
        L_0x0130:
            double r8 = (double) r12     // Catch:{ all -> 0x02f7 }
            double r8 = java.lang.Math.sqrt(r8)     // Catch:{ all -> 0x02f7 }
            int r13 = (int) r8     // Catch:{ all -> 0x02f7 }
            r18 = r13
        L_0x0138:
            long r12 = (long) r12     // Catch:{ all -> 0x02f7 }
            X.7Th r8 = r5.A05     // Catch:{ all -> 0x02f7 }
            r30 = 0
            monitor-enter(r8)     // Catch:{ all -> 0x02f7 }
            int r9 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x01a9
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x01a9
            int r9 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x01a9
            if (r20 == 0) goto L_0x0178
            java.util.Deque r9 = r8.A02     // Catch:{ all -> 0x02f4 }
            r32 = r9
            boolean r9 = r32.isEmpty()     // Catch:{ all -> 0x02f4 }
            if (r9 != 0) goto L_0x0175
            java.lang.Object r9 = r32.getLast()     // Catch:{ all -> 0x02f4 }
            X.6L3 r9 = (X.AnonymousClass6L3) r9     // Catch:{ all -> 0x02f4 }
            long r14 = r9.A01     // Catch:{ all -> 0x02f4 }
            long r28 = r3 - r14
        L_0x0160:
            long r26 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02f4 }
            X.6L3 r14 = new X.6L3     // Catch:{ all -> 0x02f4 }
            r21 = r14
            r22 = r3
            r24 = r12
            r21.<init>(r22, r24, r26, r28)     // Catch:{ all -> 0x02f4 }
            r9 = r32
            r9.add(r14)     // Catch:{ all -> 0x02f4 }
            goto L_0x0178
        L_0x0175:
            r28 = 0
            goto L_0x0160
        L_0x0178:
            if (r19 == 0) goto L_0x01a3
            r24 = 8000(0x1f40, double:3.9525E-320)
            long r24 = r24 * r12
            long r0 = r0 - r3
            long r24 = r24 / r0
            java.util.Deque r3 = r8.A01     // Catch:{ all -> 0x02f4 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x02f4 }
            if (r0 != 0) goto L_0x0193
            java.lang.Object r0 = r3.getLast()     // Catch:{ all -> 0x02f4 }
            X.6L2 r0 = (X.AnonymousClass6L2) r0     // Catch:{ all -> 0x02f4 }
            long r0 = r0.A00     // Catch:{ all -> 0x02f4 }
            long r30 = r24 - r0
        L_0x0193:
            long r28 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02f4 }
            X.6L2 r0 = new X.6L2     // Catch:{ all -> 0x02f4 }
            r23 = r0
            r26 = r12
            r23.<init>(r24, r26, r28, r30)     // Catch:{ all -> 0x02f4 }
            r3.add(r0)     // Catch:{ all -> 0x02f4 }
        L_0x01a3:
            r8.A00()     // Catch:{ all -> 0x02f4 }
            r0 = 1
            r8.A03 = r0     // Catch:{ all -> 0x02f4 }
        L_0x01a9:
            monitor-exit(r8)     // Catch:{ all -> 0x02f7 }
            if (r20 == 0) goto L_0x01d8
            if (r19 == 0) goto L_0x01d8
            long r0 = r5.A03     // Catch:{ all -> 0x02f2 }
            long r0 = java.lang.Math.max(r0, r10)     // Catch:{ all -> 0x02f2 }
            r5.A03 = r0     // Catch:{ all -> 0x02f2 }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d8
            X.7ja r3 = r5.A04     // Catch:{ all -> 0x02f2 }
            float r1 = (float) r6     // Catch:{ all -> 0x02f2 }
            r0 = r18
            r3.A01(r0, r1)     // Catch:{ all -> 0x02f2 }
            float r1 = r3.A00()     // Catch:{ all -> 0x02f2 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x01cf
            r0 = -1
            goto L_0x01d0
        L_0x01cf:
            long r0 = (long) r1     // Catch:{ all -> 0x02f2 }
        L_0x01d0:
            r5.A02 = r0     // Catch:{ all -> 0x02f2 }
            int r0 = r5.A00     // Catch:{ all -> 0x02f2 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x02f2 }
        L_0x01d8:
            com.facebook.http.historical.NetworkInfoMap r19 = com.facebook.http.historical.NetworkInfoMap.A01     // Catch:{ all -> 0x02f9 }
            monitor-enter(r19)     // Catch:{ all -> 0x02f9 }
            monitor-exit(r19)     // Catch:{ all -> 0x02f9 }
            r0 = r33
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r10 = r5.A00(r0)     // Catch:{ all -> 0x02f9 }
            long r6 = r10.A05     // Catch:{ all -> 0x02f9 }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x02e8
            long r3 = r10.A00     // Catch:{ all -> 0x02f9 }
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e8
            r0 = r33
            X.8L1 r0 = r0.abrSetting     // Catch:{ all -> 0x02f9 }
            boolean r0 = r0.enableConfRiskBwCache     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x02de
            X.6wK r18 = X.C141906wK.UNDEFINED     // Catch:{ all -> 0x02f9 }
            r1 = r33
            r0 = r18
            int r1 = r1.getHighBwRiskConfPct(r0)     // Catch:{ all -> 0x02f9 }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r8 = r10.A01     // Catch:{ all -> 0x02f9 }
            r13 = 0
            if (r8 == 0) goto L_0x021e
            float r12 = r8.getMinBandwidthMultiplier()     // Catch:{ all -> 0x02f9 }
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x021e
        L_0x020d:
            float r11 = r8.getMaxBandwidthMultiplier()     // Catch:{ all -> 0x02f9 }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0224
        L_0x0215:
            X.8L1 r0 = r8.abrSetting     // Catch:{ all -> 0x02f9 }
            float r9 = r0.bwWeightLimitForBWEDampening     // Catch:{ all -> 0x02f9 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0229
            goto L_0x022b
        L_0x021e:
            r12 = 1050253722(0x3e99999a, float:0.3)
            if (r8 == 0) goto L_0x0224
            goto L_0x020d
        L_0x0224:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x0229
            goto L_0x0215
        L_0x0229:
            r9 = 1145569280(0x44480000, float:800.0)
        L_0x022b:
            if (r1 <= 0) goto L_0x026d
            r0 = 100
            if (r1 >= r0) goto L_0x026d
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x026d
            r14 = 50
            r0 = 1
            if (r1 >= r14) goto L_0x023d
            int r1 = 100 - r1
            r0 = -1
        L_0x023d:
            float r15 = (float) r0     // Catch:{ all -> 0x02f9 }
            java.util.Map r0 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A08     // Catch:{ all -> 0x02f9 }
            java.lang.Object r0 = X.AnonymousClass001.A0i(r0, r1)     // Catch:{ all -> 0x02f9 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x02f9 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x02f9 }
            float r15 = r15 * r0
            long r0 = r10.A03     // Catch:{ all -> 0x02f9 }
            float r14 = (float) r0     // Catch:{ all -> 0x02f9 }
            float r15 = r15 * r14
            float r14 = (float) r3     // Catch:{ all -> 0x02f9 }
            float r15 = r15 / r14
            r4 = 1065353216(0x3f800000, float:1.0)
            float r15 = r4 - r15
            long r0 = r10.A04     // Catch:{ all -> 0x02f9 }
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0262
            float r3 = (float) r0     // Catch:{ all -> 0x02f9 }
            float r3 = r3 / r9
            float r4 = r4 - r3
            float r13 = java.lang.Math.max(r4, r13)     // Catch:{ all -> 0x02f9 }
        L_0x0262:
            float r15 = r15 - r13
            float r0 = java.lang.Math.max(r15, r12)     // Catch:{ all -> 0x02f9 }
            float r0 = java.lang.Math.min(r0, r11)     // Catch:{ all -> 0x02f9 }
            float r14 = r14 * r0
            long r3 = (long) r14     // Catch:{ all -> 0x02f9 }
        L_0x026d:
            r1 = r33
            r0 = r18
            int r0 = r1.getHighBwRiskConfPct(r0)     // Catch:{ all -> 0x02f9 }
            r13 = 0
            if (r8 == 0) goto L_0x0291
            float r12 = r8.getMaxTTFBMultiplier()     // Catch:{ all -> 0x02f9 }
            int r1 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0291
        L_0x0280:
            float r11 = r8.getMinTTFBMultiplier()     // Catch:{ all -> 0x02f9 }
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0296
        L_0x0288:
            X.8L1 r1 = r8.abrSetting     // Catch:{ all -> 0x02f9 }
            float r9 = r1.ttfbWeightLimitForBWEDampening     // Catch:{ all -> 0x02f9 }
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x029b
            goto L_0x029d
        L_0x0291:
            r12 = 1077936128(0x40400000, float:3.0)
            if (r8 == 0) goto L_0x0296
            goto L_0x0280
        L_0x0296:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 == 0) goto L_0x029b
            goto L_0x0288
        L_0x029b:
            r9 = 1133903872(0x43960000, float:300.0)
        L_0x029d:
            if (r0 <= 0) goto L_0x02de
            r1 = 100
            if (r0 >= r1) goto L_0x02de
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x02de
            r8 = 50
            r1 = 1
            if (r0 >= r8) goto L_0x02af
            int r0 = 100 - r0
            r1 = -1
        L_0x02af:
            float r8 = (float) r1     // Catch:{ all -> 0x02f9 }
            java.util.Map r1 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A08     // Catch:{ all -> 0x02f9 }
            java.lang.Object r0 = X.AnonymousClass001.A0i(r1, r0)     // Catch:{ all -> 0x02f9 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x02f9 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x02f9 }
            float r8 = r8 * r0
            long r0 = r10.A06     // Catch:{ all -> 0x02f9 }
            float r14 = (float) r0     // Catch:{ all -> 0x02f9 }
            float r8 = r8 * r14
            float r14 = (float) r6     // Catch:{ all -> 0x02f9 }
            float r8 = r8 / r14
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r7
            long r0 = r10.A07     // Catch:{ all -> 0x02f9 }
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x02d3
            float r6 = (float) r0     // Catch:{ all -> 0x02f9 }
            float r6 = r6 / r9
            float r7 = r7 - r6
            float r13 = java.lang.Math.max(r7, r13)     // Catch:{ all -> 0x02f9 }
        L_0x02d3:
            float r8 = r8 + r13
            float r0 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x02f9 }
            float r0 = java.lang.Math.max(r0, r11)     // Catch:{ all -> 0x02f9 }
            float r14 = r14 * r0
            long r6 = (long) r14     // Catch:{ all -> 0x02f9 }
        L_0x02de:
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x02e8
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e8
            monitor-enter(r19)     // Catch:{ all -> 0x02f9 }
            monitor-exit(r19)     // Catch:{ all -> 0x02f9 }
        L_0x02e8:
            X.C153827c5.A00()     // Catch:{ all -> 0x02fe }
            monitor-exit(r5)
            goto L_0x007a
        L_0x02ee:
            int r8 = r2.A02
            goto L_0x003f
        L_0x02f2:
            r0 = move-exception
            goto L_0x02f6
        L_0x02f4:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02f7 }
        L_0x02f6:
            throw r0     // Catch:{ all -> 0x02f7 }
        L_0x02f7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02f9 }
        L_0x02f9:
            r0 = move-exception
            X.C153827c5.A00()     // Catch:{ all -> 0x02fe }
            throw r0     // Catch:{ all -> 0x02fe }
        L_0x02fe:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677082e.A00(boolean):void");
    }

    public void BTa(long j, long j2) {
    }

    public void BTZ(C142646xX r1, long j, long j2, long j3) {
    }
}
