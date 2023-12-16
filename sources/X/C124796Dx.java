package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.profilo.logger.BufferLogger;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.6Dx  reason: invalid class name and case insensitive filesystem */
public class C124796Dx extends Handler {
    public final C146427Af A00 = new C146427Af();
    public final AnonymousClass843 A01;
    public final C185308tQ A02;
    public final HashSet A03 = AnonymousClass002.A0K();
    public final Random A04 = new Random();

    public synchronized void A01(C166567yu r4) {
        HashSet hashSet = this.A03;
        Long valueOf = Long.valueOf(r4.A06);
        if (hashSet.contains(valueOf)) {
            AnonymousClass6C7.A10(this, r4, 3);
            hashSet.remove(valueOf);
        }
    }

    public synchronized void A02(C166567yu r4) {
        HashSet hashSet = this.A03;
        Long valueOf = Long.valueOf(r4.A06);
        if (hashSet.contains(valueOf)) {
            AnonymousClass6C7.A10(this, r4, 2);
            hashSet.remove(valueOf);
        }
    }

    public static final void A00(C166567yu r9) {
        BufferLogger.writeStandardEntry(r9.A09, 6, 98, 0, 0, r9.A08.A00("trace_config.logger_priority", 5), 0, r9.A06);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void handleMessage(android.os.Message r20) {
        /*
            r19 = this;
            r1 = r19
            r3 = r20
            int r2 = r3.what
            r0 = 7
            if (r2 == r0) goto L_0x024b
            java.lang.Object r0 = r3.obj
            X.7yu r0 = (X.C166567yu) r0
            switch(r2) {
                case 0: goto L_0x0011;
                case 1: goto L_0x006b;
                case 2: goto L_0x01cd;
                case 3: goto L_0x002f;
                case 4: goto L_0x013e;
                case 5: goto L_0x0080;
                case 6: goto L_0x00a3;
                case 7: goto L_0x024b;
                default: goto L_0x0010;
            }
        L_0x0010:
            return
        L_0x0011:
            long r0 = r0.A06
            X.7kr r3 = X.C158957kr.A0A
            X.7yu r2 = r3.A01(r0)
            if (r2 == 0) goto L_0x0010
            com.facebook.profilo.mmapbuf.core.Buffer r4 = r2.A09
            r5 = 6
            r6 = 41
            r7 = 0
            r9 = 0
            long r12 = r2.A06
            r11 = r9
            r10 = r9
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r4, r5, r6, r7, r9, r10, r11, r12)
            r2 = 4
            r3.A04(r0, r2)
            return
        L_0x002f:
            monitor-enter(r1)
            r8 = 0
            r1.removeMessages(r8, r0)     // Catch:{ all -> 0x0215 }
            monitor-exit(r1)     // Catch:{ all -> 0x0215 }
            X.843 r7 = r1.A01
            if (r7 == 0) goto L_0x0010
            monitor-enter(r7)
            X.7lB[] r6 = r7.A03     // Catch:{ all -> 0x0212 }
            X.7lB[] r5 = r7.A04     // Catch:{ all -> 0x0212 }
            monitor-exit(r7)     // Catch:{ all -> 0x0212 }
            X.842 r1 = r7.A05
            r1.BeI(r0)
            int r2 = r0.A02
            java.lang.Class<com.facebook.profilo.core.TraceEvents> r1 = com.facebook.profilo.core.TraceEvents.class
            monitor-enter(r1)
            int r2 = com.facebook.profilo.core.TraceEvents.nativeDisableProviders(r2)     // Catch:{ all -> 0x020f }
            com.facebook.profilo.core.TraceEvents.sProviders = r2     // Catch:{ all -> 0x020f }
            monitor-exit(r1)
            java.lang.Object r4 = r7.A06
            monitor-enter(r4)
            int r2 = r5.length     // Catch:{ all -> 0x020c }
            r3 = 0
        L_0x0055:
            if (r8 >= r2) goto L_0x005f
            r1 = r5[r8]     // Catch:{ all -> 0x020c }
            r1.A03(r0, r7)     // Catch:{ all -> 0x020c }
            int r8 = r8 + 1
            goto L_0x0055
        L_0x005f:
            monitor-exit(r4)     // Catch:{ all -> 0x020c }
            int r2 = r6.length
        L_0x0061:
            if (r3 >= r2) goto L_0x0010
            r1 = r6[r3]
            r1.A03(r0, r7)
            int r3 = r3 + 1
            goto L_0x0061
        L_0x006b:
            int r2 = r0.A03
            r2 = r2 & 2
            if (r2 != 0) goto L_0x0079
            X.8Rp r2 = r0.A0G
            r2.start()
            A00(r0)
        L_0x0079:
            X.843 r7 = r1.A01
            if (r7 == 0) goto L_0x0010
            monitor-enter(r7)
            goto L_0x0218
        L_0x0080:
            int r2 = r3.arg1
            long r4 = (long) r2
            X.7Af r6 = r1.A00
            long r1 = r0.A06
            monitor-enter(r6)
            android.util.LongSparseArray r0 = r6.A00     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00a0 }
            X.7Lr r0 = (X.C149267Lr) r0     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x009e
            X.7JC r3 = r0.A01     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x009e
            long r1 = r3.A00     // Catch:{ all -> 0x00a0 }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009e
            r3.A00 = r4     // Catch:{ all -> 0x00a0 }
        L_0x009e:
            monitor-exit(r6)
            return
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00a3:
            X.7Af r2 = r1.A00
            long r4 = r0.A06
            monitor-enter(r2)
            android.util.LongSparseArray r3 = r2.A00     // Catch:{ all -> 0x013b }
            java.lang.Object r9 = r3.get(r4)     // Catch:{ all -> 0x013b }
            X.7Lr r9 = (X.C149267Lr) r9     // Catch:{ all -> 0x013b }
            if (r9 != 0) goto L_0x00b5
            monitor-exit(r2)
            r8 = 1
            goto L_0x00f5
        L_0x00b5:
            X.7Lq r8 = r9.A00     // Catch:{ all -> 0x013b }
            r7 = 1
            if (r8 == 0) goto L_0x00d2
            java.util.HashSet r6 = r8.A02     // Catch:{ all -> 0x013b }
            monitor-enter(r6)     // Catch:{ all -> 0x013b }
            X.8l7 r5 = r8.A01     // Catch:{ all -> 0x00cf }
            java.lang.String[] r4 = r8.A03     // Catch:{ all -> 0x00cf }
            boolean r4 = r5.B2k(r6, r4)     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x00c9
            monitor-exit(r6)     // Catch:{ all -> 0x00cf }
            goto L_0x00d2
        L_0x00c9:
            monitor-exit(r6)     // Catch:{ all -> 0x00cf }
            int r8 = r8.A00     // Catch:{ all -> 0x013b }
            if (r8 == r7) goto L_0x00d2
            goto L_0x00f2
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x00d2:
            X.7JC r12 = r9.A01     // Catch:{ all -> 0x013b }
            r8 = 1
            if (r12 == 0) goto L_0x00f2
            r13 = -1
            r11 = 0
            r8 = 0
        L_0x00da:
            int[] r5 = r12.A01     // Catch:{ all -> 0x013b }
            int r4 = r5.length     // Catch:{ all -> 0x013b }
            if (r11 >= r4) goto L_0x00f2
            long r6 = r12.A00     // Catch:{ all -> 0x013b }
            r10 = r5[r11]     // Catch:{ all -> 0x013b }
            long r4 = (long) r10     // Catch:{ all -> 0x013b }
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ef
            if (r10 <= r13) goto L_0x00ef
            int[] r4 = r12.A02     // Catch:{ all -> 0x013b }
            r8 = r4[r11]     // Catch:{ all -> 0x013b }
            r13 = r10
        L_0x00ef:
            int r11 = r11 + 1
            goto L_0x00da
        L_0x00f2:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x011c
        L_0x00f5:
            java.util.Random r4 = r1.A04
            int r4 = r4.nextInt(r8)
            if (r4 != 0) goto L_0x011c
            com.facebook.profilo.mmapbuf.core.Buffer r9 = r0.A09
            r10 = 6
            r11 = 99
            r12 = 0
            r14 = 0
            long r4 = (long) r8
            r16 = r14
            r15 = r14
            r17 = r4
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r9, r10, r11, r12, r14, r15, r16, r17)
            r11 = 61
            long r4 = r0.A06
            r17 = r4
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r9, r10, r11, r12, r14, r15, r16, r17)
            r1.A02(r0)
        L_0x011a:
            monitor-enter(r2)
            goto L_0x0134
        L_0x011c:
            com.facebook.profilo.mmapbuf.core.Buffer r4 = r0.A09
            r5 = 6
            r6 = 37
            r7 = 0
            r9 = 0
            long r12 = r0.A06
            r11 = r9
            r10 = r9
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r4, r5, r6, r7, r9, r10, r11, r12)
            X.7yu r4 = new X.7yu
            r4.<init>(r0, r5)
            r1.A01(r4)
            goto L_0x011a
        L_0x0134:
            long r0 = r0.A06     // Catch:{ all -> 0x013b }
            r3.delete(r0)     // Catch:{ all -> 0x013b }
            monitor-exit(r2)
            return
        L_0x013b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x013e:
            X.843 r4 = r1.A01
            if (r4 == 0) goto L_0x01bd
            monitor-enter(r4)
            X.7lB[] r5 = r4.A03     // Catch:{ all -> 0x01b2 }
            X.7lB[] r6 = r4.A04     // Catch:{ all -> 0x01b2 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b2 }
            com.facebook.profilo.mmapbuf.core.Buffer r7 = r0.A09
            r8 = 6
            r9 = 52
            r10 = 0
            r12 = 0
            r13 = 8126470(0x7c0006, float:1.138761E-38)
            r14 = r12
            r15 = r10
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r7, r8, r9, r10, r12, r13, r14, r15)
            int r9 = r5.length
            r8 = 0
            r3 = 0
            r7 = 0
        L_0x015c:
            if (r3 >= r9) goto L_0x0172
            r2 = r5[r3]
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x016d
            boolean r1 = r2.A04
            if (r1 != 0) goto L_0x016d
            r1 = 0
        L_0x0169:
            r7 = r7 | r1
            int r3 = r3 + 1
            goto L_0x015c
        L_0x016d:
            int r1 = r2.getTracingProviders()
            goto L_0x0169
        L_0x0172:
            int r10 = r6.length
            r3 = 0
        L_0x0174:
            if (r3 >= r10) goto L_0x018a
            r2 = r6[r3]
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0185
            boolean r1 = r2.A04
            if (r1 != 0) goto L_0x0185
            r1 = 0
        L_0x0181:
            r7 = r7 | r1
            int r3 = r3 + 1
            goto L_0x0174
        L_0x0185:
            int r1 = r2.getTracingProviders()
            goto L_0x0181
        L_0x018a:
            int r2 = r0.A02
            java.lang.Class<com.facebook.profilo.core.TraceEvents> r1 = com.facebook.profilo.core.TraceEvents.class
            monitor-enter(r1)
            int r2 = com.facebook.profilo.core.TraceEvents.nativeDisableProviders(r2)     // Catch:{ all -> 0x020f }
            com.facebook.profilo.core.TraceEvents.sProviders = r2     // Catch:{ all -> 0x020f }
            monitor-exit(r1)
            java.lang.Object r3 = r4.A06
            monitor-enter(r3)
            r2 = 0
        L_0x019a:
            if (r2 >= r10) goto L_0x01a4
            r1 = r6[r2]     // Catch:{ all -> 0x01af }
            r1.A03(r0, r4)     // Catch:{ all -> 0x01af }
            int r2 = r2 + 1
            goto L_0x019a
        L_0x01a4:
            monitor-exit(r3)     // Catch:{ all -> 0x01af }
        L_0x01a5:
            if (r8 >= r9) goto L_0x01b5
            r1 = r5[r8]
            r1.A03(r0, r4)
            int r8 = r8 + 1
            goto L_0x01a5
        L_0x01af:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01af }
            throw r0
        L_0x01b2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b2 }
            throw r0
        L_0x01b5:
            X.842 r1 = r4.A05
            r1.BZ6(r0, r7)
            r1.BeM(r0)
        L_0x01bd:
            com.facebook.profilo.mmapbuf.core.Buffer r1 = r0.A09
            r2 = 6
            r3 = 38
            r4 = 0
            r6 = 0
            long r9 = r0.A06
            r8 = r6
            r7 = r6
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r1, r2, r3, r4, r6, r7, r8, r9)
            return
        L_0x01cd:
            monitor-enter(r1)
            r7 = 0
            r1.removeMessages(r7, r0)     // Catch:{ all -> 0x020f }
            int r8 = r0.A03     // Catch:{ all -> 0x020f }
            r2 = r8 & 2
            if (r2 == 0) goto L_0x01f2
            X.8Rp r2 = r0.A0G     // Catch:{ all -> 0x020f }
            if (r2 == 0) goto L_0x0205
            X.8Rp r2 = r0.A0G     // Catch:{ all -> 0x020f }
            r2.start()     // Catch:{ all -> 0x020f }
            A00(r0)     // Catch:{ all -> 0x020f }
            X.8Rp r2 = r0.A0G     // Catch:{ all -> 0x020f }
            com.facebook.profilo.writer.NativeTraceWriter r2 = r2.A02     // Catch:{ all -> 0x020f }
            com.facebook.profilo.mmapbuf.core.Buffer r3 = r0.A09     // Catch:{ all -> 0x020f }
            long r4 = r0.A06     // Catch:{ all -> 0x020f }
            r6 = 40
            r9 = r4
            com.facebook.profilo.logger.BufferLogger.writeAndWakeupTraceWriter(r2, r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x020f }
        L_0x01f2:
            r2 = 4
            android.os.Message r4 = r1.obtainMessage(r2, r0)     // Catch:{ all -> 0x020f }
            X.7yn r2 = r0.A08     // Catch:{ all -> 0x020f }
            java.lang.String r0 = "trace_config.post_trace_extension_ms"
            int r0 = r2.A00(r0, r7)     // Catch:{ all -> 0x020f }
            long r2 = (long) r0     // Catch:{ all -> 0x020f }
            r1.sendMessageDelayed(r4, r2)     // Catch:{ all -> 0x020f }
            monitor-exit(r1)
            return
        L_0x0205:
            java.lang.String r0 = "Trace stopped but never started"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x020f }
            throw r0     // Catch:{ all -> 0x020f }
        L_0x020c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x020c }
            throw r0
        L_0x020f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0212:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0212 }
            throw r0
        L_0x0215:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0215 }
            throw r0
        L_0x0218:
            X.7lB[] r6 = r7.A03     // Catch:{ all -> 0x0248 }
            monitor-exit(r7)     // Catch:{ all -> 0x0248 }
            int r5 = r6.length
            r4 = 0
        L_0x021d:
            if (r4 >= r5) goto L_0x023f
            r3 = r6[r4]
            int r2 = r0.A02
            int r1 = r3.getSupportedProviders()
            r2 = r2 & r1
            if (r2 == 0) goto L_0x023c
            com.facebook.profilo.logger.MultiBufferLogger r2 = r3.A00()
            com.facebook.profilo.mmapbuf.core.Buffer r1 = r0.A09
            r2.addBuffer(r1)
            r3.A01()
            r3.A02(r0)
            r3.onTraceStarted(r0, r7)
        L_0x023c:
            int r4 = r4 + 1
            goto L_0x021d
        L_0x023f:
            X.842 r1 = r7.A05
            r1.BZ5(r0)
            r1.BeL(r0)
            return
        L_0x0248:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0248 }
            throw r0
        L_0x024b:
            java.lang.String r0 = "mTraceContext"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124796Dx.handleMessage(android.os.Message):void");
    }

    public C124796Dx(Looper looper, AnonymousClass843 r3, C185308tQ r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
    }
}
