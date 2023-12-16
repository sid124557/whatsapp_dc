package X;

import android.content.Context;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9ZG  reason: invalid class name */
public class AnonymousClass9ZG implements C185288tO, Handler.Callback {
    public static final int[] A0Q = {0, 1, 2, 3, 4};
    public float A00;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public AnonymousClass9MI A09;
    public AnonymousClass9MJ A0A;
    public C185568tt A0B;
    public Long A0C;
    public List A0D;
    public final Context A0E;
    public final AnonymousClass9TS A0F = new AnonymousClass9TS();
    public final AnonymousClass9ZE A0G;
    public final AnonymousClass9MR A0H;
    public final C192619Kw A0I;
    public final AnonymousClass9ZH A0J;
    public final C203689o9 A0K;
    public final C195789Zn A0L = new C195789Zn();
    public final List A0M = AnonymousClass001.A0s();
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final void A03(C183818qi r3) {
        if (r3.B1Q()) {
            this.A08.getClass();
            AnonymousClass6C7.A10(this.A08, r3, 1);
            return;
        }
        A04(r3, (C202919mp) null);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final X.AnonymousClass7Ow A00(X.AnonymousClass7Ow r21) {
        /*
            r20 = this;
            r5 = r21
            r4 = r20
            X.9ZH r8 = r4.A0J
            X.9Sw r3 = r8.A06
            java.util.List r6 = r3.A00
            int r2 = r6.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r2) goto L_0x020b
            java.lang.Object r0 = r6.get(r1)
            X.9ZI r0 = (X.AnonymousClass9ZI) r0
            X.8uH r0 = r0.A03
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "ProcessGlRenderer"
            android.os.Trace.beginSection(r0)
            int r2 = r5.A01
            int r0 = r4.A02
            r7 = 1
            r6 = 0
            if (r2 != r0) goto L_0x0034
            int r1 = r5.A02
            int r0 = r4.A06
            if (r1 == r0) goto L_0x0071
        L_0x0034:
            r4.A02 = r2
            int r0 = r5.A02
            r4.A06 = r0
            int r2 = r2 + r0
            int r0 = r2 % 180
            if (r0 == 0) goto L_0x0080
            int r9 = r4.A05
            int r2 = r4.A07
        L_0x0043:
            X.9TS r10 = r4.A0F
            float r1 = r4.A00
            X.9Zs r0 = new X.9Zs
            r0.<init>(r9, r2, r1)
            r9 = 0
            r10.A01(r0, r9)
            int r0 = r4.A06
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x007b
            int r2 = r4.A03
            int r1 = r4.A04
        L_0x005a:
            X.9Zq r0 = new X.9Zq
            r0.<init>(r2, r1)
            r10.A01(r0, r9)
            int r0 = r4.A06
            int r2 = r0 / 90
            int r0 = r4.A02
            int r1 = -r0
            X.9Zr r0 = new X.9Zr
            r0.<init>(r2, r1)
            r10.A01(r0, r9)
        L_0x0071:
            X.9TS r2 = r4.A0F
            X.9Zt r1 = X.C195849Zt.A00
            r0 = 0
            r2.A01(r1, r0)
            monitor-enter(r8)
            goto L_0x0088
        L_0x007b:
            int r2 = r4.A04
            int r1 = r4.A03
            goto L_0x005a
        L_0x0080:
            int r9 = r4.A07
            int r2 = r4.A05
            goto L_0x0043
        L_0x0085:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0088:
            r8.A04 = r7     // Catch:{ all -> 0x01c3 }
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x01c3 }
            r19 = r0
            int r10 = r19.size()     // Catch:{ all -> 0x01c3 }
            r9 = 0
        L_0x0093:
            if (r9 >= r10) goto L_0x01c6
            r0 = r19
            java.lang.Object r2 = r0.get(r9)     // Catch:{ all -> 0x01c3 }
            X.9ZI r2 = (X.AnonymousClass9ZI) r2     // Catch:{ all -> 0x01c3 }
            r17 = 1000(0x3e8, double:4.94E-321)
            X.8uH r0 = r2.A03     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x01bf
            X.7TK r12 = r5.A05     // Catch:{ all -> 0x01c3 }
            if (r12 == 0) goto L_0x00ce
            boolean r0 = r12.A00()     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x00ce
            X.83y r11 = r8.A00()     // Catch:{ all -> 0x01c3 }
            int r0 = r12.A01     // Catch:{ all -> 0x01c3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01c3 }
            float r1 = r8.A00     // Catch:{ all -> 0x01c3 }
            float r0 = r0 * r1
            int r3 = java.lang.Math.round(r0)     // Catch:{ all -> 0x01c3 }
            int r0 = r12.A00     // Catch:{ all -> 0x01c3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01c3 }
            float r0 = r0 * r1
            int r1 = java.lang.Math.round(r0)     // Catch:{ all -> 0x01c3 }
            int r0 = r5.A01     // Catch:{ all -> 0x01c3 }
            r11.A02(r3, r1, r0)     // Catch:{ all -> 0x01c3 }
        L_0x00ce:
            X.8tt r0 = r8.A01     // Catch:{ all -> 0x01b2 }
            X.8ts r16 = r0.B6O()     // Catch:{ all -> 0x01b2 }
            r8.A00()     // Catch:{ all -> 0x01b2 }
            X.83y r3 = r8.A00()     // Catch:{ all -> 0x01b2 }
            monitor-enter(r3)     // Catch:{ all -> 0x01b2 }
            X.7Wm r15 = r5.A04     // Catch:{ all -> 0x01af }
            if (r15 == 0) goto L_0x019e
            java.lang.Exception r0 = r3.BKR()     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x019b
            X.7TK r13 = r3.Brr(r5)     // Catch:{ all -> 0x0196 }
            X.7TK r1 = r5.A05     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x019b
            if (r13 == 0) goto L_0x019b
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            boolean r0 = r13.A00()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            X.7ia r12 = r2.A05     // Catch:{ all -> 0x0196 }
            float[] r14 = r1.A03     // Catch:{ all -> 0x0196 }
            float[] r11 = r13.A03     // Catch:{ all -> 0x0196 }
            long r0 = r5.A03     // Catch:{ all -> 0x0196 }
            r12.A01 = r15     // Catch:{ all -> 0x0196 }
            r12.A04 = r14     // Catch:{ all -> 0x0196 }
            r12.A05 = r11     // Catch:{ all -> 0x0196 }
            float[] r11 = X.C157607ia.A06     // Catch:{ all -> 0x0196 }
            r12.A03 = r11     // Catch:{ all -> 0x0196 }
            r12.A02 = r11     // Catch:{ all -> 0x0196 }
            r12.A00 = r0     // Catch:{ all -> 0x0196 }
            int r1 = r13.A01     // Catch:{ all -> 0x0196 }
            int r0 = r13.A00     // Catch:{ all -> 0x0196 }
            android.opengl.GLES20.glViewport(r6, r6, r1, r0)     // Catch:{ all -> 0x0196 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ all -> 0x0196 }
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x0196 }
            X.8uH r14 = r2.A03     // Catch:{ all -> 0x0196 }
            if (r14 == 0) goto L_0x013d
            int r0 = r2.A01     // Catch:{ all -> 0x0196 }
            int r11 = r13.A01     // Catch:{ all -> 0x0196 }
            if (r0 != r11) goto L_0x0134
            int r1 = r2.A00     // Catch:{ all -> 0x0196 }
            int r0 = r13.A00     // Catch:{ all -> 0x0196 }
            if (r1 == r0) goto L_0x013d
        L_0x0134:
            r2.A01 = r11     // Catch:{ all -> 0x0196 }
            int r0 = r13.A00     // Catch:{ all -> 0x0196 }
            r2.A00 = r0     // Catch:{ all -> 0x0196 }
            r14.Bdj(r11, r0)     // Catch:{ all -> 0x0196 }
        L_0x013d:
            X.8ts r0 = r2.A02     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            X.8uH r0 = r2.A03     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            long r0 = r12.A00     // Catch:{ all -> 0x0196 }
            long r0 = r0 / r17
            boolean r11 = r2.A04     // Catch:{ all -> 0x0196 }
            if (r11 != 0) goto L_0x0158
            X.96x r11 = r2.A07     // Catch:{ all -> 0x0196 }
            r11.BRf(r12, r0)     // Catch:{ all -> 0x0196 }
        L_0x0158:
            X.8uH r14 = r2.A03     // Catch:{ all -> 0x0196 }
            boolean r11 = r14 instanceof X.C195759Zk     // Catch:{ all -> 0x0196 }
            if (r11 == 0) goto L_0x016d
            r11 = r14
            X.9Zk r11 = (X.C195759Zk) r11     // Catch:{ all -> 0x0196 }
            X.9O2 r15 = r2.A06     // Catch:{ all -> 0x0196 }
            X.9O2 r13 = r11.A0U     // Catch:{ all -> 0x0196 }
            X.9Jz r11 = r15.A01     // Catch:{ all -> 0x0196 }
            r13.A01 = r11     // Catch:{ all -> 0x0196 }
            X.9Jy r11 = r15.A00     // Catch:{ all -> 0x0196 }
            r13.A00 = r11     // Catch:{ all -> 0x0196 }
        L_0x016d:
            boolean r0 = r14.BRf(r12, r0)     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x019b
            r3.BqU()     // Catch:{ all -> 0x0196 }
            r16.BKS()     // Catch:{ all -> 0x01af }
            monitor-exit(r3)     // Catch:{ all -> 0x01af }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01b2 }
            java.lang.String r0 = "GL Error after renderFrame(): "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x01b2 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b2 }
            X.C159217lP.A02(r1, r0)     // Catch:{ all -> 0x01b2 }
            X.83y r0 = r8.A00()     // Catch:{ all -> 0x01b2 }
            X.7Ow r5 = r0.A07     // Catch:{ all -> 0x01b2 }
            boolean r0 = r8.A04     // Catch:{ all -> 0x01b2 }
            r0 = r0 ^ 1
            r8.A04 = r0     // Catch:{ all -> 0x01b2 }
            goto L_0x01bf
        L_0x0196:
            r0 = move-exception
            r16.BKS()     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01af }
        L_0x019b:
            r16.BKS()     // Catch:{ all -> 0x01af }
        L_0x019e:
            monitor-exit(r3)     // Catch:{ all -> 0x01af }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01b2 }
            java.lang.String r0 = "GL Error after skip renderFrame(): "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x01b2 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b2 }
            X.C159217lP.A02(r1, r0)     // Catch:{ all -> 0x01b2 }
            goto L_0x01bf
        L_0x01af:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            r3 = move-exception
            X.8tt r2 = r8.A01     // Catch:{ all -> 0x01c3 }
            java.lang.String r1 = "GlRenderChain.doFrame() error!"
            X.9kV r0 = new X.9kV     // Catch:{ all -> 0x01c3 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x01c3 }
            r2.BLj(r0)     // Catch:{ all -> 0x01c3 }
        L_0x01bf:
            int r9 = r9 + 1
            goto L_0x0093
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01c6:
            monitor-exit(r8)
            android.os.Trace.endSection()
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x020b
            X.8tt r0 = r4.A0B
            X.9ZJ r0 = (X.AnonymousClass9ZJ) r0
            X.7l3 r0 = r0.A04
            int r1 = r0.A01
            r0 = 3
            if (r1 < r0) goto L_0x020b
            java.lang.String r0 = "WaitForGpuCompletion"
            android.os.Trace.beginSection(r0)
            java.lang.Long r0 = r4.A0C
            if (r0 == 0) goto L_0x01f8
            long r2 = r0.longValue()
            r0 = 500000000(0x1dcd6500, double:2.47032823E-315)
            android.opengl.GLES30.glClientWaitSync(r2, r7, r0)
            java.lang.Long r0 = r4.A0C
            long r0 = r0.longValue()
            android.opengl.GLES30.glDeleteSync(r0)
            r0 = 0
            r4.A0C = r0
        L_0x01f8:
            r0 = 37143(0x9117, float:5.2048E-41)
            long r0 = android.opengl.GLES30.glFenceSync(r0, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0C = r0
            android.opengl.GLES20.glFlush()
            android.os.Trace.endSection()
        L_0x020b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZG.A00(X.7Ow):X.7Ow");
    }

    public void A01(int i, int i2, int i3, int i4, int i5, boolean z) {
        AnonymousClass20J r1;
        if (i == 0) {
            float f = this.A01;
            this.A04 = Math.round(((float) i2) * f);
            this.A03 = Math.round(((float) i3) * f);
            this.A07 = i4;
            this.A05 = i5;
            this.A00 = AnonymousClass000.A0B(this.A0E).density;
            this.A02 = 0;
            this.A06 = 0;
            AnonymousClass9ZE r0 = this.A0G;
            if (r0 != null) {
                int i6 = this.A04;
                int i7 = this.A03;
                AnonymousClass9XL r3 = r0.A05;
                if (i6 > 0 && i7 > 0) {
                    int max = Math.max(i6, i7);
                    int i8 = (i6 * 600) / max;
                    r3.A02 = i8;
                    int i9 = (i7 * 600) / max;
                    r3.A01 = i9;
                    r3.A02 = i8 - (i8 % 2);
                    r3.A01 = i9 - (i9 % 2);
                }
                if (r3.A0D) {
                    r3.A05.post(r3.A0B);
                }
            }
            AnonymousClass9TS r5 = this.A0F;
            r5.A01(new C195799Zo(), (C202919mp) null);
            r5.A01(new C195819Zq(this.A04, this.A03), (C202919mp) null);
            if (z) {
                r1 = AnonymousClass20J.FRONT;
            } else {
                r1 = AnonymousClass20J.BACK;
            }
            r5.A01(new C195809Zp(r1), (C202919mp) null);
            r5.A01(new C195829Zr(this.A06 / 90, this.A02), (C202919mp) null);
            r5.A01(new C195839Zs(this.A07, this.A05, this.A00), (C202919mp) null);
        }
    }

    public final void A02(AnonymousClass7Ow r6) {
        AnonymousClass7TK r1;
        AnonymousClass9ZE r4 = this.A0G;
        if (r4 != null) {
            Trace.beginSection("PostProcessCpuFrames");
            if (r4.A03 && (r1 = r6.A05) != null && r1.A00()) {
                C1680583y r3 = r4.A00;
                if (r3 != null) {
                    r3.A02(r1.A01, r1.A00, r6.A01);
                }
                r4.A01.A01(r6);
                r4.A04 = true;
            }
            Trace.endSection();
        }
    }

    public final void A05(List list) {
        Object obj;
        C185558ts r0;
        if (this.A0B == null) {
            this.A0D = list;
            return;
        }
        List list2 = this.A0M;
        ArrayList A0J2 = AnonymousClass002.A0J(list2);
        ArrayList A0s = AnonymousClass001.A0s();
        list2.clear();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (int i = 0; i < list.size(); i++) {
            C185808uH r2 = (C185808uH) list.get(i);
            list2.add(r2);
            if (!A0J2.remove(r2)) {
                A0s.add(r2);
            }
            AnonymousClass9ZI r1 = new AnonymousClass9ZI();
            C185808uH r02 = r1.A03;
            if (r02 != r2) {
                if (r02 != null) {
                    r02.Bdl();
                }
                r1.A03 = r2;
                r1.A04 = r2 instanceof C203709oB;
                if (!(r2 == null || (r0 = r1.A02) == null)) {
                    r2.Bdk(((AnonymousClass9ZC) r0).A04);
                }
            }
            A0s2.add(r1);
        }
        int size = A0J2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C185808uH r7 = (C185808uH) A0J2.get(i2);
            if (r7 instanceof C202919mp) {
                ((C202919mp) r7).BnA((AnonymousClass9TS) null);
            }
            if (r7 instanceof C195759Zk) {
                C195759Zk r72 = (C195759Zk) r7;
                C162477s9.A03(Integer.valueOf(r72.hashCode()), "null", "FbMsqrdRenderer", "FbMsqrdRenderer %s - setLogger %s");
                r72.A0a = null;
            }
        }
        AnonymousClass9TS r73 = this.A0F;
        C203689o9 r5 = this.A0K;
        int size2 = A0s.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C185808uH r10 = (C185808uH) A0s.get(i3);
            if (r10 instanceof C202919mp) {
                ((C202919mp) r10).BnA(r73);
            }
            if (r10 instanceof C195759Zk) {
                C195759Zk r102 = (C195759Zk) r10;
                Integer valueOf = Integer.valueOf(r102.hashCode());
                if (r5 != null) {
                    obj = Integer.valueOf(r5.hashCode());
                } else {
                    obj = "null";
                }
                C162477s9.A03(valueOf, obj, "FbMsqrdRenderer", "FbMsqrdRenderer %s - setLogger %s");
                r102.A0a = r5;
                if (r5 != null) {
                    boolean z = r5 instanceof C1904296e;
                    if (z) {
                        C162477s9.A08("FbMsqrdRenderer", "Dummy Logger used !!!");
                    }
                    QuickPerformanceLogger A002 = C1454776a.A00();
                    if (A002 != null) {
                        short s = 2;
                        if (z) {
                            s = 3;
                        }
                        A002.markerGenerate(11282540, s, 1, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        AnonymousClass9ZH r74 = this.A0J;
        synchronized (r74) {
            ArrayList A0s3 = AnonymousClass001.A0s();
            ArrayList A0J3 = AnonymousClass002.A0J(A0s2);
            C194439Sw r8 = r74.A06;
            List list3 = r8.A00;
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AnonymousClass9ZI r12 = (AnonymousClass9ZI) list3.get(i4);
                if (A0J3.remove(r12)) {
                    A0s2.set(A0s2.indexOf(r12), r12);
                } else {
                    A0s3.add(r12);
                }
            }
            int size4 = A0s3.size();
            for (int i5 = 0; i5 < size4; i5++) {
                AnonymousClass9ZI r13 = (AnonymousClass9ZI) A0s3.get(i5);
                if (r13 instanceof C185288tO) {
                    r74.A01.B1d(r13);
                }
            }
            int size5 = A0J3.size();
            for (int i6 = 0; i6 < size5; i6++) {
                AnonymousClass9ZI r14 = (AnonymousClass9ZI) A0J3.get(i6);
                if (r14 instanceof C185288tO) {
                    r74.A01.AxO(r14);
                }
            }
            r8.A00();
            synchronized (r8) {
                if (!A0s2.isEmpty()) {
                    int size6 = A0s2.size();
                    ArrayList A0I2 = AnonymousClass002.A0I(r8.A00.size() + size6);
                    A0I2.addAll(r8.A00);
                    boolean z2 = false;
                    for (int i7 = 0; i7 < size6; i7++) {
                        Object obj2 = A0s2.get(i7);
                        if (!r8.A00.contains(obj2)) {
                            A0I2.add(obj2);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        r8.A00 = Collections.unmodifiableList(A0I2);
                    }
                }
            }
        }
    }

    public void AxN(C185558ts r6) {
        AnonymousClass9TS r4 = this.A0F;
        AnonymousClass9RC r3 = r4.A01;
        if (r3.A00.compareAndSet(false, true)) {
            r3.A00();
        }
        r4.A00.A01.set(true);
    }

    public void B1c() {
        Long l = this.A0C;
        if (l != null) {
            GLES30.glDeleteSync(l.longValue());
            this.A0C = null;
        }
        AnonymousClass9TS r2 = this.A0F;
        r2.A01.A00.set(false);
        r2.A00.A01.set(false);
    }

    public void BFr(C185568tt r4) {
        this.A0B = r4;
        r4.AxO(this.A0J);
        AnonymousClass9ZE r1 = this.A0G;
        if (r1 != null) {
            this.A0B.AxO(r1);
        }
        Handler handler = this.A08;
        if (handler == null || handler.getLooper() != ((AnonymousClass9ZJ) this.A0B).A00.getLooper()) {
            this.A08 = new Handler(((AnonymousClass9ZJ) this.A0B).A00.getLooper(), this);
        }
        this.A0F.A02(new C195869Zv(this), AnonymousClass22N.A06);
        List list = this.A0D;
        if (list != null) {
            A03(new C195769Zl(list));
            this.A0D = null;
        }
    }

    public boolean handleMessage(Message message) {
        C183818qi r1;
        C202919mp r0;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                Object obj = message.obj;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                r1 = (C183818qi) objArr[0];
                r0 = (C202919mp) objArr[1];
            }
            return true;
        }
        Object obj2 = message.obj;
        obj2.getClass();
        r1 = (C183818qi) obj2;
        r0 = null;
        A04(r1, r0);
        return true;
    }

    public void release() {
        List list = this.A0M;
        if (list.size() > 0) {
            this.A0D = AnonymousClass002.A0J(list);
            A05(Collections.emptyList());
        }
        AnonymousClass9TS r2 = this.A0F;
        Arrays.fill(r2.A01.A02, false);
        r2.A00.A00.A00();
        r2.A02.clear();
        if (this.A0A != null) {
            XplatSparsLogger.flushAndDestroyConsistencyHelper();
        }
    }

    public final void A04(C183818qi r12, C202919mp r13) {
        AnonymousClass9MI r4;
        AnonymousClass22N BDx = r12.BDx();
        int ordinal = BDx.ordinal();
        if (ordinal == 33) {
            A05(((C195769Zl) r12).A00);
        } else if (ordinal == 39) {
            throw AnonymousClass001.A0g("mIsSingleFrameSource");
        } else if (ordinal != 38) {
            this.A0F.A01(r12, r13);
        }
        if (BDx == AnonymousClass22N.A0V && (r4 = this.A09) != null) {
            List<C185808uH> list = this.A0M;
            C1903695n r8 = r4.A00;
            C203689o9 r3 = r8.A05;
            if (r3 != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (C185808uH r7 : list) {
                    if ((r7 instanceof C195759Zk) && !(r7 instanceof C1904796x) && r7.isEnabled()) {
                        AnonymousClass9MW r6 = new AnonymousClass9MW();
                        C195759Zk r9 = (C195759Zk) r7;
                        HashMap A0t = AnonymousClass001.A0t();
                        A0t.put("filter_type", "msqrd");
                        String str = r9.A0B;
                        if (str != null) {
                            A0t.put("effect_id", str);
                        }
                        String str2 = r9.A0C;
                        if (str2 != null) {
                            A0t.put("effect_instance_id", str2);
                        }
                        AnonymousClass7XK r0 = r9.A0Z;
                        if (r0 != null) {
                            A0t.put("effect_session_id", r0.A06);
                        }
                        r6.A00 = A0t;
                        r7.isEnabled();
                        A0s.add(r6);
                    }
                }
                r8.A06.B82("Lite-Controller-Thread").post(new C201439k8(r4, r3, A0s));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9ZG(android.content.Context r6, android.os.Handler r7, android.os.Handler r8, X.C192619Kw r9, X.C157207hv r10, X.C203689o9 r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            X.9TS r0 = new X.9TS
            r0.<init>()
            r5.A0F = r0
            X.9Zn r0 = new X.9Zn
            r0.<init>()
            r5.A0L = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r5.A0M = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A01 = r0
            X.9MR r4 = new X.9MR
            r4.<init>(r5)
            r5.A0H = r4
            r5.A0K = r11
            X.9ZH r0 = new X.9ZH
            r0.<init>(r10)
            r5.A0J = r0
            r3 = 0
            r5.A0N = r14
            if (r15 == 0) goto L_0x0037
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 >= r1) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r5.A0P = r0
            if (r12 == 0) goto L_0x0041
            X.9ZE r3 = new X.9ZE
            r3.<init>(r8, r4, r10)
        L_0x0041:
            r5.A0G = r3
            r5.A0E = r6
            r5.A0O = r13
            X.9TS r2 = r5.A0F
            r1 = 0
            X.9Wx r0 = new X.9Wx
            r0.<init>(r5, r1)
            r2.A00(r0)
            r1 = 1
            X.9Wx r0 = new X.9Wx
            r0.<init>(r5, r1)
            r2.A00(r0)
            r1 = 2
            X.9Wx r0 = new X.9Wx
            r0.<init>(r5, r1)
            r2.A00(r0)
            if (r7 == 0) goto L_0x0071
            android.os.Looper r1 = r7.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r5)
            r5.A08 = r0
        L_0x0071:
            r5.A0I = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZG.<init>(android.content.Context, android.os.Handler, android.os.Handler, X.9Kw, X.7hv, X.9o9, boolean, boolean, boolean, boolean):void");
    }
}
