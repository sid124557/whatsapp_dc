package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2sW  reason: invalid class name and case insensitive filesystem */
public class C56762sW {
    public C48512f1 A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C42682Pc A03;
    public final C47852dw A04;
    public final C56612sH A05;
    public final C61072zf A06;
    public final C52852m9 A07;
    public final C56122rS A08;
    public final C56922sm A09;
    public final C56982ss A0A;
    public final C66543Lv A0B;
    public final C50012hU A0C;
    public final C54762pF A0D;
    public final C29431io A0E;
    public final C28761hj A0F;
    public final C72303dV A0G;
    public final C56082rO A0H;
    public final C59412ws A0I;
    public final AnonymousClass1VX A0J;
    public final AnonymousClass4FV A0K;
    public final C55832qz A0L;
    public final C187958y5 A0M;
    public final C29111iI A0N;
    public final Map A0O = AnonymousClass001.A0t();
    public final ReentrantReadWriteLock A0P;

    public C56762sW(C55682qk r3, C56972sr r4, C42682Pc r5, C47852dw r6, C56612sH r7, C61072zf r8, C52852m9 r9, C56122rS r10, C56922sm r11, C56982ss r12, C66543Lv r13, C50012hU r14, C54762pF r15, C29431io r16, C28761hj r17, C72303dV r18, C56082rO r19, C59412ws r20, AnonymousClass1VX r21, AnonymousClass4FV r22, C55832qz r23, C187958y5 r24, C29111iI r25) {
        C48512f1 r1 = new C48512f1();
        this.A05 = r7;
        this.A00 = r1;
        this.A0J = r21;
        this.A02 = r4;
        this.A09 = r11;
        this.A01 = r3;
        this.A0A = r12;
        this.A0K = r22;
        this.A08 = r10;
        this.A06 = r8;
        this.A0C = r14;
        this.A0N = r25;
        this.A0B = r13;
        this.A0L = r23;
        this.A0E = r16;
        this.A0H = r19;
        this.A07 = r9;
        this.A0F = r17;
        this.A0D = r15;
        this.A0G = r18;
        this.A0I = r20;
        this.A04 = r6;
        this.A03 = r5;
        this.A0M = r24;
        this.A0P = new ReentrantReadWriteLock();
    }

    public AnonymousClass3ZF A00(long j) {
        AnonymousClass3ZF r0;
        C04840Qw r1 = this.A00.A01;
        synchronized (r1) {
            r0 = (AnonymousClass3ZF) r1.A04(Long.valueOf(j));
        }
        return r0;
    }

    public AnonymousClass3ZF A01(long j) {
        AnonymousClass3ZF r0;
        C48512f1 r2 = this.A00;
        C04840Qw r1 = r2.A01;
        synchronized (r1) {
            r0 = (AnonymousClass3ZF) r1.A04(Long.valueOf(j));
        }
        if (r0 == null && (r0 = this.A08.A01(j)) != null) {
            r2.A00(r0);
        }
        return r0;
    }

    public final AnonymousClass3ZF A02(AnonymousClass39J r4) {
        AnonymousClass3ZF r0;
        C48512f1 r2 = this.A00;
        C04840Qw r1 = r2.A00;
        synchronized (r1) {
            r0 = (AnonymousClass3ZF) r1.A04(r4);
        }
        if (r0 == null && (r0 = this.A08.A03(r4)) != null) {
            r2.A00(r0);
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r7.A0F != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3ZF A03(X.AnonymousClass39J r19, X.AnonymousClass3ZF r20) {
        /*
            r18 = this;
            r4 = r18
            r6 = r19
            X.3ZF r0 = r4.A02(r6)
            if (r0 != 0) goto L_0x013f
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread updating call log with new key"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r4.A0P
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()
            r0.lock()
            X.2rS r3 = r4.A08     // Catch:{ all -> 0x013a }
            monitor-enter(r3)     // Catch:{ all -> 0x013a }
            r7 = r20
            boolean r0 = r7.A0G     // Catch:{ all -> 0x0134 }
            r1 = 1
            r8 = 0
            if (r0 != 0) goto L_0x0028
            boolean r0 = r7.A0F     // Catch:{ all -> 0x0134 }
            r5 = 1
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C626936e.A0E(r5, r0)     // Catch:{ all -> 0x0134 }
            long r11 = r7.A05()     // Catch:{ all -> 0x0134 }
            r9 = -1
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1S(r0)
            java.lang.String r0 = "CallLog row_id is not set"
            X.C626936e.A0E(r5, r0)     // Catch:{ all -> 0x0134 }
            X.3dV r0 = r3.A05     // Catch:{ all -> 0x0134 }
            X.4Fq r11 = r0.A04()     // Catch:{ all -> 0x0134 }
            X.3Yo r10 = r11.Axl()     // Catch:{ all -> 0x012a }
            android.content.ContentValues r13 = r3.A00(r6, r7)     // Catch:{ all -> 0x0120 }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0120 }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x0120 }
            java.lang.String r14 = "call_log"
            java.lang.String r15 = "_id = ?"
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x0120 }
            long r0 = r7.A05()     // Catch:{ all -> 0x0120 }
            X.C18280x3.A1R(r5, r8, r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r16 = "updateCallLog/UPDATE_CALL_LOG"
            r17 = r5
            r12.A05(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0120 }
            r10.A00()     // Catch:{ all -> 0x0120 }
            X.39J r8 = r7.A0E     // Catch:{ all -> 0x0120 }
            java.lang.String r9 = "; new key="
            r10.close()     // Catch:{ all -> 0x012a }
            r11.close()     // Catch:{ all -> 0x0134 }
            X.3ZF r5 = r3.A03(r6)     // Catch:{ all -> 0x0134 }
            monitor-exit(r3)     // Catch:{ all -> 0x013a }
            if (r5 == 0) goto L_0x0115
            X.2f1 r0 = r4.A00     // Catch:{ all -> 0x013a }
            r0.A01(r7)     // Catch:{ all -> 0x013a }
            r0.A00(r5)     // Catch:{ all -> 0x013a }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013a }
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread; callLog.key="
            r3.append(r0)     // Catch:{ all -> 0x013a }
            r3.append(r8)     // Catch:{ all -> 0x013a }
            java.lang.String r0 = "; callLog.row_id="
            r3.append(r0)     // Catch:{ all -> 0x013a }
            long r0 = r7.A05()     // Catch:{ all -> 0x013a }
            r3.append(r0)     // Catch:{ all -> 0x013a }
            X.C18260x0.A1R(r3, r9, r6)     // Catch:{ all -> 0x013a }
            boolean r0 = r7.A0L()     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0104
            X.1VX r0 = r4.A0J     // Catch:{ all -> 0x013a }
            boolean r0 = X.C627436k.A0G(r0)     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0104
            X.2pF r7 = r4.A0D     // Catch:{ all -> 0x013a }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x013a }
            java.lang.String r11 = X.C627436k.A07(r0)     // Catch:{ all -> 0x013a }
            X.2lK r10 = r7.A01     // Catch:{ all -> 0x013a }
            monitor-enter(r10)     // Catch:{ all -> 0x013a }
            X.0Qw r9 = r10.A01     // Catch:{ all -> 0x0137 }
            java.util.Map r0 = r9.A06()     // Catch:{ all -> 0x0137 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0137 }
            java.util.HashSet r0 = X.AnonymousClass0x9.A15(r0)     // Catch:{ all -> 0x0137 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0137 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0137 }
        L_0x00cd:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x00e8
            X.34x r3 = X.C18300x5.A0T(r6)     // Catch:{ all -> 0x0137 }
            X.2z0 r1 = r3.A1J     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0137 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x00cd
            r8.add(r3)     // Catch:{ all -> 0x0137 }
            r9.A05(r1)     // Catch:{ all -> 0x0137 }
            goto L_0x00cd
        L_0x00e8:
            monitor-exit(r10)     // Catch:{ all -> 0x013a }
            java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x013a }
        L_0x00ed:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0104
            X.34x r1 = X.C18300x5.A0T(r3)     // Catch:{ all -> 0x013a }
            java.util.Map r0 = r7.A02     // Catch:{ all -> 0x013a }
            X.2z0 r1 = r1.A1J     // Catch:{ all -> 0x013a }
            r0.remove(r1)     // Catch:{ all -> 0x013a }
            X.2ss r0 = r7.A00     // Catch:{ all -> 0x013a }
            r0.A0K(r1)     // Catch:{ all -> 0x013a }
            goto L_0x00ed
        L_0x0104:
            X.2m9 r3 = r4.A07     // Catch:{ all -> 0x013a }
            r0 = 4
            X.3Zw r1 = new X.3Zw     // Catch:{ all -> 0x013a }
            r1.<init>(r4, r0, r5)     // Catch:{ all -> 0x013a }
            r0 = 16
            r3.A01(r1, r0)     // Catch:{ all -> 0x013a }
            X.AnonymousClass0x7.A1M(r2)
            return r5
        L_0x0115:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013a }
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread error on creating new call log for this key="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r6, r0, r1)     // Catch:{ all -> 0x013a }
            goto L_0x0139
        L_0x0120:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0125 }
            goto L_0x0129
        L_0x0125:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x012a }
        L_0x0129:
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x012f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0134 }
        L_0x0133:
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x013a }
            goto L_0x0139
        L_0x0137:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x013a }
        L_0x0139:
            throw r0     // Catch:{ all -> 0x013a }
        L_0x013a:
            r0 = move-exception
            X.AnonymousClass0x7.A1M(r2)
            throw r0
        L_0x013f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread already exists for this key="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r6, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56762sW.A03(X.39J, X.3ZF):X.3ZF");
    }

    public final void A08(AnonymousClass3ZF r9) {
        boolean z;
        C69833Yo Axl;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0P;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C56122rS r5 = this.A08;
            synchronized (r5) {
                if (r9.A0G || r9.A0F || !r9.A0R()) {
                    Log.w("CallLogStore/insertCallLog - only regular call log is stored here");
                    z = false;
                } else {
                    C85284Fq A042 = r5.A05.A04();
                    try {
                        Axl = A042.Axl();
                        r9.A0F(((AnonymousClass3H0) A042).A03.A09("call_log", "insertCallLog/INSERT_CALL_LOG", r5.A00(r9.A0E, r9)));
                        r9.A0B();
                        r5.A05(r9);
                        Axl.A00();
                        Axl.close();
                        A042.close();
                        z = true;
                    } catch (Throwable th) {
                        try {
                            A042.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CallsMessageStore/insertCallLog; callLog.key=");
            A0o.append(r9.A0E);
            A0o.append("; callLog.getRowId()=");
            C18260x0.A1I(A0o, r9.A05());
            if (z) {
                this.A00.A00(r9);
            }
            return;
            throw th;
        } finally {
            AnonymousClass0x7.A1M(reentrantReadWriteLock);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r4 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass3ZF r8) {
        /*
            r7 = this;
            com.whatsapp.jid.GroupJid r3 = r8.A05
            if (r3 != 0) goto L_0x000a
            X.39J r0 = r8.A0E
            com.whatsapp.jid.UserJid r3 = r0.A01
            if (r3 == 0) goto L_0x0052
        L_0x000a:
            X.39J r0 = r8.A0E
            boolean r1 = r0.A03
            java.lang.String r5 = r0.A02
            java.lang.String r0 = X.C627436k.A07(r5)
            X.2z0 r6 = X.AnonymousClass2z0.A05(r3, r0, r1)
            X.2pF r4 = r7.A0D
            X.2lK r0 = r4.A01
            X.34x r2 = r0.A00(r6)
            X.1mO r2 = (X.C30401mO) r2
            if (r2 != 0) goto L_0x0053
            X.2dw r1 = r7.A04
            X.1mO r2 = new X.1mO
            r2.<init>((X.C47852dw) r1, (X.AnonymousClass2z0) r6, (X.AnonymousClass3ZF) r8)
        L_0x002b:
            r4.A02(r2)
            boolean r0 = r8.A0L()
            if (r0 == 0) goto L_0x0060
            X.2mt r0 = r8.A07
            if (r0 == 0) goto L_0x005a
            com.whatsapp.jid.GroupJid r0 = r8.A05
            if (r0 != 0) goto L_0x004d
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r3)
            if (r0 == 0) goto L_0x005a
            int r1 = r8.A04(r0)
            r0 = 5
            if (r1 != r0) goto L_0x005a
            int r0 = r8.A00
            if (r0 != 0) goto L_0x005a
        L_0x004d:
            java.util.Map r0 = r7.A0O
            r0.put(r3, r2)
        L_0x0052:
            return
        L_0x0053:
            r2.A01 = r8
            X.2dw r1 = r7.A04
            r2.A00 = r1
            goto L_0x002b
        L_0x005a:
            java.util.Map r0 = r7.A0O
            r0.remove(r3)
            return
        L_0x0060:
            int r0 = r8.A00
            if (r0 != 0) goto L_0x009d
            if (r5 == 0) goto L_0x009d
            java.util.HashMap r4 = r1.A00
            java.lang.String r0 = X.C627436k.A07(r5)
            java.lang.Object r1 = r4.get(r0)
            if (r1 == 0) goto L_0x0084
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0084
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0084
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x0084
        L_0x007e:
            java.util.Map r0 = r7.A0O
            r0.put(r3, r2)
            return
        L_0x0084:
            java.lang.String r0 = X.C627436k.A07(r5)
            java.lang.Object r0 = r4.get(r0)
            com.whatsapp.voipcalling.CallState r0 = (com.whatsapp.voipcalling.CallState) r0
            if (r0 == 0) goto L_0x009d
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x007e
            r0 = 2
            if (r1 == r0) goto L_0x007e
            r0 = 3
            if (r1 == r0) goto L_0x007e
        L_0x009d:
            java.util.Map r0 = r7.A0O
            r0.remove(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56762sW.A09(X.3ZF):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:103:0x0170=Splitter:B:103:0x0170, B:60:0x011b=Splitter:B:60:0x011b} */
    public final void A0A(X.AnonymousClass3ZF r22) {
        /*
            r21 = this;
            r5 = r22
            long r1 = r5.A05()
            r9 = -1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallsMessageStore/updateCallLogInternal; callLog.key="
            r1.append(r0)
            X.39J r0 = r5.A0E
            r1.append(r0)
            java.lang.String r0 = " pending insert"
            X.C18260x0.A1J(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "CallsMessageStore/updateCallLogInternal updating call log"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r4 = r21
            X.2rS r3 = r4.A08
            monitor-enter(r3)
            boolean r0 = r5.A0G     // Catch:{ all -> 0x018f }
            r6 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0035
            boolean r0 = r5.A0F     // Catch:{ all -> 0x018f }
            r1 = 1
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C626936e.A0E(r1, r0)     // Catch:{ all -> 0x018f }
            long r7 = r5.A05()     // Catch:{ all -> 0x018f }
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r0)
            java.lang.String r0 = "CallLog row_id is not set"
            X.C626936e.A0E(r1, r0)     // Catch:{ all -> 0x018f }
            boolean r0 = r5.A0R()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x013a
            X.3dV r0 = r3.A05     // Catch:{ all -> 0x018f }
            X.4Fq r14 = r0.A04()     // Catch:{ all -> 0x018f }
            X.3Yo r13 = r14.Axl()     // Catch:{ all -> 0x0185 }
            X.39J r8 = r5.A0E     // Catch:{ all -> 0x017b }
            android.content.ContentValues r16 = r3.A00(r8, r5)     // Catch:{ all -> 0x017b }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x017b }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x017b }
            java.lang.String r17 = "call_log"
            java.lang.String r18 = "_id = ?"
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x017b }
            long r0 = r5.A05()     // Catch:{ all -> 0x017b }
            X.C18280x3.A1R(r7, r2, r0)     // Catch:{ all -> 0x017b }
            java.lang.String r19 = "updateCallLog/UPDATE_CALL_LOG"
            r20 = r7
            r15.A05(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x017b }
            r5.A0B()     // Catch:{ all -> 0x017b }
            r3.A05(r5)     // Catch:{ all -> 0x017b }
            X.2mt r7 = r5.A07     // Catch:{ all -> 0x017b }
            if (r7 == 0) goto L_0x00d7
            boolean r0 = r5.A0A     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0131
            long r0 = r5.A05()     // Catch:{ all -> 0x017b }
            r7.A00 = r0     // Catch:{ all -> 0x017b }
            X.2mt r7 = r5.A07     // Catch:{ all -> 0x017b }
            boolean r0 = r7.A02     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0128
            X.2rn r8 = r3.A04     // Catch:{ all -> 0x017b }
            X.3dV r0 = r8.A02     // Catch:{ all -> 0x017b }
            X.4Fq r12 = r0.A04()     // Catch:{ all -> 0x017b }
            X.3Yo r9 = r12.Axl()     // Catch:{ all -> 0x0171 }
            android.content.ContentValues r16 = r8.A00(r7)     // Catch:{ all -> 0x015a }
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x015a }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x015a }
            java.lang.String r17 = "joinable_call_log"
            java.lang.String r18 = "call_log_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x015a }
            long r0 = r7.A00     // Catch:{ all -> 0x015a }
            X.C18280x3.A1R(r6, r2, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r19 = "joinable_call_log_store/update"
            r20 = r6
            r15.A05(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x015a }
            X.2Y5 r0 = r8.A00     // Catch:{ all -> 0x015a }
            r0.A00(r7)     // Catch:{ all -> 0x015a }
            r7.A02 = r2     // Catch:{ all -> 0x015a }
            r9.A00()     // Catch:{ all -> 0x015a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "JoinableCallLogStore/updateCallLogInternal/updaetd; joinableCallLog.callId="
            r1.append(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x015a }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x015a }
            r9.close()     // Catch:{ all -> 0x0171 }
            goto L_0x0124
        L_0x00d7:
            boolean r0 = r5.A0A     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0131
            X.2rn r11 = r3.A04     // Catch:{ all -> 0x017b }
            java.lang.String r9 = r8.A02     // Catch:{ all -> 0x017b }
            X.3dV r0 = r11.A02     // Catch:{ all -> 0x017b }
            X.4Fq r12 = r0.A04()     // Catch:{ all -> 0x017b }
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0171 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x0171 }
            java.lang.String r8 = "joinable_call_log"
            java.lang.String r7 = "call_id = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0171 }
            r1[r2] = r9     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = "joinable_call_log_store/DELETE_CALL_LOG"
            r10.A07(r8, r7, r0, r1)     // Catch:{ all -> 0x0171 }
            X.2Y5 r8 = r11.A00     // Catch:{ all -> 0x0171 }
            java.util.HashMap r1 = r8.A00     // Catch:{ all -> 0x0171 }
            monitor-enter(r1)     // Catch:{ all -> 0x0171 }
            java.lang.Object r7 = r1.remove(r9)     // Catch:{ all -> 0x016e }
            X.2mt r7 = (X.C53312mt) r7     // Catch:{ all -> 0x016e }
            r6 = 0
            r1.put(r9, r6)     // Catch:{ all -> 0x016c }
            monitor-exit(r1)     // Catch:{ all -> 0x016e }
            if (r7 == 0) goto L_0x011b
            com.whatsapp.jid.GroupJid r0 = r7.A01     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x011b
            java.util.HashMap r1 = r8.A01     // Catch:{ all -> 0x0171 }
            monitor-enter(r1)     // Catch:{ all -> 0x0171 }
            com.whatsapp.jid.GroupJid r0 = r7.A01     // Catch:{ all -> 0x0166 }
            r1.remove(r0)     // Catch:{ all -> 0x0166 }
            com.whatsapp.jid.GroupJid r0 = r7.A01     // Catch:{ all -> 0x0166 }
            r1.put(r0, r6)     // Catch:{ all -> 0x0164 }
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
        L_0x011b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = "JoinableCallLogStore/deleteCallLog/callId="
            X.C18260x0.A0s(r0, r9, r1)     // Catch:{ all -> 0x0171 }
        L_0x0124:
            r12.close()     // Catch:{ all -> 0x017b }
            goto L_0x012d
        L_0x0128:
            X.2rn r0 = r3.A04     // Catch:{ all -> 0x017b }
            r0.A06(r7)     // Catch:{ all -> 0x017b }
        L_0x012d:
            monitor-enter(r5)     // Catch:{ all -> 0x017b }
            r5.A0A = r2     // Catch:{ all -> 0x0169 }
            monitor-exit(r5)     // Catch:{ all -> 0x017b }
        L_0x0131:
            r13.A00()     // Catch:{ all -> 0x017b }
            r13.close()     // Catch:{ all -> 0x0185 }
            r14.close()     // Catch:{ all -> 0x018f }
        L_0x013a:
            monitor-exit(r3)
            X.2f1 r0 = r4.A00
            r0.A00(r5)
            X.2hU r0 = r4.A0C
            android.os.Handler r1 = r0.A02
            r0 = 9
            X.C70093Zw.A00(r1, r4, r5, r0)
            X.1VX r2 = r4.A0J
            r1 = 6120(0x17e8, float:8.576E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r2.A0O(r0, r1)
            r0 = 1
            if (r1 < r0) goto L_0x001f
            r4.A09(r5)
            return
        L_0x015a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x015f }
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0171 }
        L_0x0163:
            throw r1     // Catch:{ all -> 0x0171 }
        L_0x0164:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x0170
        L_0x0169:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x016c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016e }
        L_0x0170:
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0176:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x017b }
        L_0x017a:
            throw r1     // Catch:{ all -> 0x017b }
        L_0x017b:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0180 }
            goto L_0x0184
        L_0x0180:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0185 }
        L_0x0184:
            throw r1     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x018a }
            goto L_0x018e
        L_0x018a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x018f }
        L_0x018e:
            throw r1     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56762sW.A0A(X.3ZF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r0 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A04(X.C837249n r18, int r19, int r20) {
        /*
            r17 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r1 = r17
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r1.A0P
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.readLock()
            r0.lock()
            X.2rS r12 = r1.A08     // Catch:{ SQLiteException -> 0x00e4 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Z()     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.String r0 = java.lang.Integer.toString(r19)     // Catch:{ SQLiteException -> 0x00e4 }
            r11 = 0
            r3[r11] = r0     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.String r0 = java.lang.Integer.toString(r20)     // Catch:{ SQLiteException -> 0x00e4 }
            r10 = 1
            r3[r10] = r0     // Catch:{ SQLiteException -> 0x00e4 }
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ SQLiteException -> 0x00e4 }
            X.3dV r0 = r12.A05     // Catch:{ SQLiteException -> 0x00e4 }
            X.4GK r14 = r0.get()     // Catch:{ SQLiteException -> 0x00e4 }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00da }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x00da }
            X.1VX r2 = r12.A07     // Catch:{ all -> 0x00da }
            r0 = 6103(0x17d7, float:8.552E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ all -> 0x00da }
            boolean r0 = r2.A0Y(r1, r0)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x004b
            r0 = 6136(0x17f8, float:8.598E-42)
            boolean r0 = r2.A0Y(r1, r0)     // Catch:{ all -> 0x00da }
            r2 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id"
            r1.append(r0)     // Catch:{ all -> 0x00da }
            if (r2 == 0) goto L_0x005a
            java.lang.String r0 = " ORDER BY timestamp DESC LIMIT ?,?"
            goto L_0x005c
        L_0x005a:
            java.lang.String r0 = " ORDER BY call_log._id DESC LIMIT ?,?"
        L_0x005c:
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "GET_CALL_LOG_SQL"
            android.database.Cursor r8 = r9.A0E(r1, r0, r3)     // Catch:{ all -> 0x00da }
            int r7 = X.AnonymousClass0x7.A02(r8)     // Catch:{ all -> 0x00ce }
        L_0x006a:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00a4
            if (r18 == 0) goto L_0x0078
            boolean r0 = r18.Boa()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x00a4
        L_0x0078:
            long r2 = r8.getLong(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r13 = "SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id"
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x00ce }
            X.C18280x3.A1R(r1, r11, r2)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALLS"
            android.database.Cursor r2 = r9.A0E(r13, r0, r1)     // Catch:{ all -> 0x00ce }
            X.3ZF r0 = r12.A02(r8, r2)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0092
            r6.add(r0)     // Catch:{ all -> 0x0098 }
        L_0x0092:
            if (r2 == 0) goto L_0x006a
            r2.close()     // Catch:{ all -> 0x00ce }
            goto L_0x006a
        L_0x0098:
            r1 = move-exception
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ce }
        L_0x00a3:
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00a4:
            r8.close()     // Catch:{ all -> 0x00da }
            r14.close()     // Catch:{ SQLiteException -> 0x00e4 }
            X.2ga r3 = r12.A02     // Catch:{ SQLiteException -> 0x00e4 }
            long r1 = X.C18310x6.A0A(r15)     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.String r0 = "CallLogStore/getCalls"
            r3.A02(r0, r1)     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.String r0 = "CallLogStore/getCalls/size="
            X.C18260x0.A1B(r0, r1, r6)     // Catch:{ SQLiteException -> 0x00e4 }
            r4.addAll(r6)     // Catch:{ SQLiteException -> 0x00e4 }
            X.C18310x6.A1S(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallsMessageStore/calls/size:"
            X.C18260x0.A1B(r0, r1, r4)
            return r4
        L_0x00ce:
            r1 = move-exception
            if (r8 == 0) goto L_0x00d9
            r8.close()     // Catch:{ all -> 0x00d5 }
            goto L_0x00d9
        L_0x00d5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00da }
        L_0x00d9:
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00df }
            goto L_0x00e3
        L_0x00df:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x00e4 }
        L_0x00e3:
            throw r1     // Catch:{ SQLiteException -> 0x00e4 }
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = "CallsMessageStore/getCalls/db/unavailable"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ee }
            X.C18310x6.A1S(r5)
            return r4
        L_0x00ee:
            r0 = move-exception
            X.C18310x6.A1S(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56762sW.A04(X.49n, int, int):java.util.ArrayList");
    }

    public final void A05(AnonymousClass39J r3) {
        C18260x0.A1R(AnonymousClass001.A0o(), "CallsMessageStore/checkIfCallLogAlreadyExists; callLog.key=", r3);
        if (A02(r3) != null) {
            throw AnonymousClass000.A0E(r3, "CallsMessageStore/checkIfCallLogAlreadyExists call log already exists for this key=", AnonymousClass001.A0o());
        }
    }

    public void A06(AnonymousClass3ZF r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallsMessageStore/updateCallLog; callLog.key=");
        A0o.append(r4.A0E);
        A0o.append("; callLog.row_id=");
        C18260x0.A1I(A0o, r4.A05());
        this.A07.A01(new C70093Zw(this, 3, r4), 16);
    }

    public void A07(AnonymousClass3ZF r4) {
        C626936e.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallsMessageStore/updateCallLogOnCurrentThread; callLog.key=");
        A0o.append(r4.A0E);
        A0o.append("; callLog.row_id=");
        C18260x0.A1I(A0o, r4.A05());
        A0A(r4);
    }

    public void A0B(Collection collection) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallsMessageStore/deleteCallLogs ");
        C18260x0.A1G(A0o, collection.size());
        this.A07.A01(new C70093Zw(this, 1, collection), 17);
    }
}
