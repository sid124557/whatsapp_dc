package X;

import android.os.ConditionVariable;
import android.os.Handler;

/* renamed from: X.9XP  reason: invalid class name */
public class AnonymousClass9XP implements Handler.Callback {
    public final ConditionVariable A00 = new ConditionVariable();
    public final Handler A01;
    public final C185298tP A02;
    public final AnonymousClass9XQ A03;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186 A[Catch:{ all -> 0x02df, all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a5 A[Catch:{ all -> 0x02df, all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d5 A[Catch:{ all -> 0x02df, all -> 0x02f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = r0.what
            r8 = 1
            r2 = r22
            if (r1 == r8) goto L_0x001d
            r0 = 2
            if (r1 != r0) goto L_0x0366
            java.lang.String r0 = "MediaGraphRendererSession.warmUp"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x0013 }
            goto L_0x035e
        L_0x0013:
            r1 = move-exception
            android.os.ConditionVariable r0 = r2.A00
            r0.open()
            android.os.Trace.endSection()
            throw r1
        L_0x001d:
            java.lang.String r0 = "MediaGraphRendererSession.render"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x037a }
            X.9XQ r9 = r2.A03     // Catch:{ all -> 0x037a }
            android.os.Handler r0 = r9.A01     // Catch:{ all -> 0x037a }
            android.os.Looper r1 = r0.getLooper()     // Catch:{ all -> 0x037a }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x037a }
            if (r1 != r0) goto L_0x0367
            X.9ZJ r0 = r9.A05     // Catch:{ all -> 0x037a }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x037a }
            if (r0 != 0) goto L_0x004b
            X.7hv r1 = r9.A04     // Catch:{ all -> 0x037a }
            X.6wp r0 = X.C142216wp.A0V     // Catch:{ all -> 0x037a }
            r1.A00(r0)     // Catch:{ all -> 0x037a }
            X.9T0 r0 = r9.A03     // Catch:{ all -> 0x037a }
            X.95p r1 = r0.A01     // Catch:{ all -> 0x037a }
            int r0 = r1.A00     // Catch:{ all -> 0x037a }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x037a }
            goto L_0x0363
        L_0x004b:
            X.9T0 r0 = r9.A03     // Catch:{ all -> 0x037a }
            r21 = r0
            X.95p r7 = r0.A01     // Catch:{ all -> 0x037a }
            X.9o9 r6 = r7.A06     // Catch:{ all -> 0x037a }
            if (r6 == 0) goto L_0x005c
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x037a }
            r6.BiU(r0)     // Catch:{ all -> 0x037a }
        L_0x005c:
            java.lang.String r0 = "MediaGraphHost.mMediaGraph.render()"
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x0319 }
            X.9ZG r5 = r9.A00     // Catch:{ Exception -> 0x0319 }
            r5.getClass()     // Catch:{ Exception -> 0x0319 }
            X.8tP r10 = r2.A02     // Catch:{ Exception -> 0x0319 }
            X.9ZO r10 = (X.AnonymousClass9ZO) r10     // Catch:{ Exception -> 0x0319 }
            X.9Qc r1 = r10.A04     // Catch:{ Exception -> 0x0319 }
            r0 = 0
            android.util.SparseArray r1 = r1.A00     // Catch:{ Exception -> 0x0319 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x0319 }
            if (r0 == 0) goto L_0x0308
            java.lang.String r0 = "GlProcessorGraph.render"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x02f2 }
            r2 = 0
            java.lang.Object r11 = r1.get(r2)     // Catch:{ all -> 0x02f2 }
            X.83t r11 = (X.C1680083t) r11     // Catch:{ all -> 0x02f2 }
            if (r11 == 0) goto L_0x02e4
            java.lang.String r0 = "getInputData"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x02df }
            X.8l6 r0 = r11.A04     // Catch:{ all -> 0x02df }
            X.7Ow r4 = r0.B7r()     // Catch:{ all -> 0x02df }
            X.8tt r0 = r11.A01     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x009b
            X.7hv r1 = r11.A03     // Catch:{ all -> 0x02df }
            X.6wp r0 = X.C142216wp.A05     // Catch:{ all -> 0x02df }
        L_0x0096:
            r1.A00(r0)     // Catch:{ all -> 0x02df }
            goto L_0x017f
        L_0x009b:
            X.8ts r0 = r11.A00     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x00a4
            X.7hv r1 = r11.A03     // Catch:{ all -> 0x02df }
            X.6wp r0 = X.C142216wp.A08     // Catch:{ all -> 0x02df }
            goto L_0x0096
        L_0x00a4:
            X.9ZC r0 = (X.AnonymousClass9ZC) r0     // Catch:{ all -> 0x02df }
            X.9ZL r0 = r0.A07     // Catch:{ all -> 0x02df }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x017f
            X.8tt r3 = r11.A01     // Catch:{ all -> 0x02df }
            r3.getClass()     // Catch:{ all -> 0x02df }
            X.8ts r2 = r11.A00     // Catch:{ all -> 0x02df }
            r2.getClass()     // Catch:{ all -> 0x02df }
            X.83v r0 = r11.A02     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x00cf
            X.7AW r0 = r11.A05     // Catch:{ all -> 0x02df }
            X.7hv r1 = r0.A00     // Catch:{ all -> 0x02df }
            X.83v r0 = new X.83v     // Catch:{ all -> 0x02df }
            r0.<init>(r1)     // Catch:{ all -> 0x02df }
            r11.A02 = r0     // Catch:{ all -> 0x02df }
            r0.BFr(r3)     // Catch:{ all -> 0x02df }
            X.83v r0 = r11.A02     // Catch:{ all -> 0x02df }
            r0.AxN(r2)     // Catch:{ all -> 0x02df }
        L_0x00cf:
            X.83v r3 = r11.A02     // Catch:{ all -> 0x02df }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x00ee
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x02df }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x02df }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x02df }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x02df }
            if (r1 != r0) goto L_0x00ee
            X.7hv r1 = r3.A04     // Catch:{ all -> 0x02df }
            X.6wp r0 = X.C142216wp.A01     // Catch:{ all -> 0x02df }
            goto L_0x0096
        L_0x00ee:
            X.8tt r0 = r3.A01     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x00f7
            X.7hv r1 = r3.A04     // Catch:{ all -> 0x02df }
            X.6wp r0 = X.C142216wp.A05     // Catch:{ all -> 0x02df }
            goto L_0x0096
        L_0x00f7:
            X.8ts r0 = r3.A00     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0100
            X.7hv r1 = r3.A04     // Catch:{ all -> 0x02df }
            X.6wp r0 = X.C142216wp.A08     // Catch:{ all -> 0x02df }
            goto L_0x0096
        L_0x0100:
            X.9ZC r0 = (X.AnonymousClass9ZC) r0     // Catch:{ all -> 0x02df }
            X.9ZL r0 = r0.A07     // Catch:{ all -> 0x02df }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x017f
            int r1 = r4.A00     // Catch:{ all -> 0x02df }
            if (r1 == 0) goto L_0x017f
            r0 = 3
            if (r1 == r0) goto L_0x017f
            X.8tt r0 = r3.A01     // Catch:{ all -> 0x02df }
            r16 = r0
            r16.getClass()     // Catch:{ all -> 0x02df }
            X.8ts r13 = r3.A00     // Catch:{ all -> 0x02df }
            r13.getClass()     // Catch:{ all -> 0x02df }
            X.7TK r0 = r4.A05     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0127
            X.7hv r1 = r3.A05     // Catch:{ all -> 0x02df }
            X.6wp r0 = X.C142216wp.A0X     // Catch:{ all -> 0x02df }
            goto L_0x0096
        L_0x0127:
            int r12 = r0.A01     // Catch:{ all -> 0x02df }
            int r11 = r0.A00     // Catch:{ all -> 0x02df }
            X.83y r1 = r3.A02     // Catch:{ all -> 0x02df }
            if (r1 != 0) goto L_0x0179
            X.7hv r15 = r3.A05     // Catch:{ all -> 0x02df }
            X.6Mv r14 = new X.6Mv     // Catch:{ all -> 0x02df }
            r14.<init>()     // Catch:{ all -> 0x02df }
            X.6Mt r2 = new X.6Mt     // Catch:{ all -> 0x02df }
            r2.<init>()     // Catch:{ all -> 0x02df }
            r0 = 0
            X.83y r1 = new X.83y     // Catch:{ all -> 0x02df }
            r1.<init>(r15, r14, r2, r0)     // Catch:{ all -> 0x02df }
            r3.A02 = r1     // Catch:{ all -> 0x02df }
            int r0 = r4.A01     // Catch:{ all -> 0x02df }
            r1.A02(r12, r11, r0)     // Catch:{ all -> 0x02df }
            X.83y r0 = r3.A02     // Catch:{ all -> 0x02df }
            r0.AxN(r13)     // Catch:{ all -> 0x02df }
        L_0x014d:
            X.83u r0 = r3.A03     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0169
            X.7hv r1 = r3.A04     // Catch:{ all -> 0x02df }
            X.83u r0 = new X.83u     // Catch:{ all -> 0x02df }
            r0.<init>(r1)     // Catch:{ all -> 0x02df }
            r3.A03 = r0     // Catch:{ all -> 0x02df }
            X.8tt r0 = r3.A01     // Catch:{ all -> 0x02df }
            r0.getClass()     // Catch:{ all -> 0x02df }
            X.83u r1 = r3.A03     // Catch:{ all -> 0x02df }
            X.8ts r0 = r3.A00     // Catch:{ all -> 0x02df }
            r0.getClass()     // Catch:{ all -> 0x02df }
            r1.AxN(r0)     // Catch:{ all -> 0x02df }
        L_0x0169:
            X.83u r2 = r3.A03     // Catch:{ all -> 0x02df }
            X.8ts r1 = r16.B6O()     // Catch:{ all -> 0x02df }
            X.83y r0 = r3.A02     // Catch:{ all -> 0x02df }
            r2.A00(r1, r4, r0)     // Catch:{ all -> 0x02df }
            X.83y r0 = r3.A02     // Catch:{ all -> 0x02df }
            X.7Ow r4 = r0.A07     // Catch:{ all -> 0x02df }
            goto L_0x017f
        L_0x0179:
            int r0 = r4.A01     // Catch:{ all -> 0x02df }
            r1.A02(r12, r11, r0)     // Catch:{ all -> 0x02df }
            goto L_0x014d
        L_0x017f:
            android.os.Trace.endSection()     // Catch:{ all -> 0x02f2 }
            boolean r0 = r5.A0O     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x019f
            X.9RD r0 = r10.A05     // Catch:{ all -> 0x02f2 }
            r1 = 0
            android.util.SparseArray r0 = r0.A00     // Catch:{ all -> 0x02f2 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x02f2 }
            X.9ZF r0 = (X.AnonymousClass9ZF) r0     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02ff
            X.9Sw r0 = r0.A03     // Catch:{ all -> 0x02f2 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x02f2 }
            int r0 = r0.size()     // Catch:{ all -> 0x02f2 }
            if (r0 != 0) goto L_0x019f
            goto L_0x02ff
        L_0x019f:
            r20 = r4
            X.9ZE r2 = r5.A0G     // Catch:{ all -> 0x02f2 }
            if (r2 == 0) goto L_0x01d1
            java.lang.String r0 = "PreProcessCpuFrames"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x02f2 }
            boolean r0 = r2.A03     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x01ce
            X.9XL r1 = r2.A05     // Catch:{ all -> 0x02f2 }
            int r0 = r4.A01     // Catch:{ all -> 0x02f2 }
            r1.A00 = r0     // Catch:{ all -> 0x02f2 }
            X.9ZF r0 = r2.A02     // Catch:{ all -> 0x02f2 }
            r0.A01(r4)     // Catch:{ all -> 0x02f2 }
            boolean r0 = r2.A04     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x01ce
            X.83y r0 = r2.A00     // Catch:{ all -> 0x02f2 }
            r0.getClass()     // Catch:{ all -> 0x02f2 }
            X.7Ow r12 = r0.A07     // Catch:{ all -> 0x02f2 }
            long r2 = r12.A03     // Catch:{ all -> 0x02f2 }
            long r0 = r4.A03     // Catch:{ all -> 0x02f2 }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x01ce
            r20 = r12
        L_0x01ce:
            android.os.Trace.endSection()     // Catch:{ all -> 0x02f2 }
        L_0x01d1:
            boolean r0 = r5.A0N     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02c7
            X.9ZH r0 = r5.A0J     // Catch:{ all -> 0x02f2 }
            r17 = r0
            monitor-enter(r17)     // Catch:{ all -> 0x02f2 }
            X.9Sw r11 = r0.A06     // Catch:{ all -> 0x02ef }
            java.util.List r12 = r11.A00     // Catch:{ all -> 0x02ef }
            int r3 = r12.size()     // Catch:{ all -> 0x02ef }
            r2 = 0
        L_0x01e3:
            if (r2 >= r3) goto L_0x02c6
            java.lang.Object r1 = r12.get(r2)     // Catch:{ all -> 0x02ef }
            X.9ZI r1 = (X.AnonymousClass9ZI) r1     // Catch:{ all -> 0x02ef }
            boolean r0 = r1 instanceof X.C202019lF     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x020c
            X.8uH r1 = r1.A03     // Catch:{ all -> 0x02ef }
            boolean r0 = r1 instanceof X.C195759Zk     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x020c
            X.9Zk r1 = (X.C195759Zk) r1     // Catch:{ all -> 0x02ef }
            boolean r0 = r1.A0E     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x020c
            X.9Tc r1 = r1.A0Q     // Catch:{ all -> 0x02ef }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r1.A0B     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x020c
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r1.A00()     // Catch:{ all -> 0x02ef }
            boolean r0 = r0.isMultipleOutputsSupported()     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x020c
            goto L_0x020f
        L_0x020c:
            int r2 = r2 + 1
            goto L_0x01e3
        L_0x020f:
            monitor-exit(r17)     // Catch:{ all -> 0x02f2 }
            X.9RD r10 = r10.A05     // Catch:{ all -> 0x02f2 }
            r2 = 0
            android.util.SparseArray r0 = r10.A00     // Catch:{ all -> 0x02f2 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x02f2 }
            X.9ZF r0 = (X.AnonymousClass9ZF) r0     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02bb
            X.9Sw r0 = r0.A03     // Catch:{ all -> 0x02f2 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x02f2 }
            r19 = r0
            int r16 = r19.size()     // Catch:{ all -> 0x02f2 }
            r3 = 0
        L_0x0228:
            int[] r0 = X.AnonymousClass9ZG.A0Q     // Catch:{ all -> 0x02f2 }
            r2 = r0[r3]     // Catch:{ all -> 0x02f2 }
            r13 = 0
            r1 = 0
        L_0x022e:
            r0 = r16
            if (r1 >= r0) goto L_0x02b2
            r0 = r19
            java.lang.Object r12 = r0.get(r1)     // Catch:{ all -> 0x02f2 }
            X.8uu r12 = (X.C186198uu) r12     // Catch:{ all -> 0x02f2 }
            int r14 = r12.BAK()     // Catch:{ all -> 0x02f2 }
            r0 = r20
            boolean r0 = r12.BHV(r0)     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x024d
            if (r2 == r14) goto L_0x0254
            r0 = 5
            if (r2 != 0) goto L_0x0250
            if (r14 == r0) goto L_0x0254
        L_0x024d:
            int r1 = r1 + 1
            goto L_0x022e
        L_0x0250:
            if (r2 != r0) goto L_0x024d
            if (r14 != 0) goto L_0x024d
        L_0x0254:
            if (r13 != 0) goto L_0x02ae
            monitor-enter(r17)     // Catch:{ all -> 0x02f2 }
            java.util.List r0 = r11.A00     // Catch:{ all -> 0x02ef }
            r18 = r0
            int r14 = r18.size()     // Catch:{ all -> 0x02ef }
            r13 = 0
        L_0x0260:
            if (r13 >= r14) goto L_0x02a7
            r0 = r18
            java.lang.Object r15 = r0.get(r13)     // Catch:{ all -> 0x02ef }
            X.9ZI r15 = (X.AnonymousClass9ZI) r15     // Catch:{ all -> 0x02ef }
            boolean r0 = r15 instanceof X.C202019lF     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x02a4
            X.9O2 r15 = r15.A06     // Catch:{ all -> 0x02ef }
            if (r2 == r8) goto L_0x0285
            r0 = 2
            if (r2 == r0) goto L_0x0282
            r0 = 3
            if (r2 == r0) goto L_0x027f
            r0 = 4
            if (r2 == r0) goto L_0x027c
            goto L_0x0288
        L_0x027c:
            X.9Jz r0 = X.C192499Jz.PEER     // Catch:{ all -> 0x02ef }
            goto L_0x028a
        L_0x027f:
            X.9Jz r0 = X.C192499Jz.OVERLAY     // Catch:{ all -> 0x02ef }
            goto L_0x028a
        L_0x0282:
            X.9Jz r0 = X.C192499Jz.CAPTURE_IMAGE     // Catch:{ all -> 0x02ef }
            goto L_0x028a
        L_0x0285:
            X.9Jz r0 = X.C192499Jz.CAPTURE     // Catch:{ all -> 0x02ef }
            goto L_0x028a
        L_0x0288:
            X.9Jz r0 = X.C192499Jz.PREVIEW     // Catch:{ all -> 0x02ef }
        L_0x028a:
            r15.A01 = r0     // Catch:{ all -> 0x02ef }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x02ef }
            switch(r0) {
                case 1: goto L_0x0298;
                case 2: goto L_0x029b;
                case 3: goto L_0x029e;
                case 4: goto L_0x02a1;
                default: goto L_0x0293;
            }     // Catch:{ all -> 0x02ef }
        L_0x0293:
            X.9Jy r0 = X.C192489Jy.PEER     // Catch:{ all -> 0x02ef }
        L_0x0295:
            r15.A00 = r0     // Catch:{ all -> 0x02ef }
            goto L_0x02a4
        L_0x0298:
            X.9Jy r0 = X.C192489Jy.PREVIEW     // Catch:{ all -> 0x02ef }
            goto L_0x0295
        L_0x029b:
            X.9Jy r0 = X.C192489Jy.CAPTURE     // Catch:{ all -> 0x02ef }
            goto L_0x0295
        L_0x029e:
            X.9Jy r0 = X.C192489Jy.CAPTURE_IMAGE     // Catch:{ all -> 0x02ef }
            goto L_0x0295
        L_0x02a1:
            X.9Jy r0 = X.C192489Jy.OVERLAY     // Catch:{ all -> 0x02ef }
            goto L_0x0295
        L_0x02a4:
            int r13 = r13 + 1
            goto L_0x0260
        L_0x02a7:
            monitor-exit(r17)     // Catch:{ all -> 0x02f2 }
            r0 = r20
            X.7Ow r13 = r5.A00(r0)     // Catch:{ all -> 0x02f2 }
        L_0x02ae:
            r10.A00(r13, r12)     // Catch:{ all -> 0x02f2 }
            goto L_0x024d
        L_0x02b2:
            int r3 = r3 + 1
            r0 = 5
            if (r3 < r0) goto L_0x0228
            r5.A02(r4)     // Catch:{ all -> 0x02f2 }
            goto L_0x02d6
        L_0x02bb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "GlOutput not set "
            java.lang.RuntimeException r0 = X.C1899593h.A0Y(r0, r1, r2)     // Catch:{ all -> 0x02f2 }
            goto L_0x02f1
        L_0x02c6:
            monitor-exit(r17)     // Catch:{ all -> 0x02f2 }
        L_0x02c7:
            r0 = r20
            X.7Ow r2 = r5.A00(r0)     // Catch:{ all -> 0x02f2 }
            r5.A02(r4)     // Catch:{ all -> 0x02f2 }
            X.9RD r1 = r10.A05     // Catch:{ all -> 0x02f2 }
            r0 = 0
            r1.A00(r2, r0)     // Catch:{ all -> 0x02f2 }
        L_0x02d6:
            X.9TS r2 = r5.A0F     // Catch:{ all -> 0x02f2 }
            X.9Zu r1 = X.C195859Zu.A00     // Catch:{ all -> 0x02f2 }
            r0 = 0
            r2.A01(r1, r0)     // Catch:{ all -> 0x02f2 }
            goto L_0x02ff
        L_0x02df:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x02f2 }
            goto L_0x02f1
        L_0x02e4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "input not set "
            java.lang.RuntimeException r0 = X.C1899593h.A0Y(r0, r1, r2)     // Catch:{ all -> 0x02f2 }
            goto L_0x02f1
        L_0x02ef:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x02f2 }
        L_0x02f1:
            throw r0     // Catch:{ all -> 0x02f2 }
        L_0x02f2:
            r3 = move-exception
            X.8tt r2 = r5.A0B     // Catch:{ all -> 0x0303 }
            java.lang.String r1 = "MediaPipeline.onFrameAvailable() failed."
            X.9kV r0 = new X.9kV     // Catch:{ all -> 0x0303 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0303 }
            r2.BLj(r0)     // Catch:{ all -> 0x0303 }
        L_0x02ff:
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0319 }
            goto L_0x0308
        L_0x0303:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0319 }
            throw r0     // Catch:{ Exception -> 0x0319 }
        L_0x0308:
            android.os.Trace.endSection()     // Catch:{ all -> 0x037a }
            java.lang.String r0 = "MediaGraphHost.mMediaGraph.render().listeners()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x037a }
            int r0 = r7.A01     // Catch:{ all -> 0x037a }
            int r0 = r0 + 1
            r7.A01 = r0     // Catch:{ all -> 0x037a }
            if (r6 == 0) goto L_0x0351
            goto L_0x0320
        L_0x0319:
            r1 = move-exception
            r0 = r21
            r0.A00(r1)     // Catch:{ all -> 0x0375 }
            goto L_0x035a
        L_0x0320:
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x037a }
            r6.BiT(r0, r8)     // Catch:{ all -> 0x037a }
            X.9LE r1 = X.C203579ny.A07     // Catch:{ all -> 0x037a }
            X.9ni r0 = r7.A00     // Catch:{ all -> 0x037a }
            java.lang.Object r1 = r0.B5l(r1)     // Catch:{ all -> 0x037a }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x037a }
            if (r1 == 0) goto L_0x0351
            int r0 = r7.A01     // Catch:{ all -> 0x037a }
            boolean r0 = X.AnonymousClass0x7.A1U(r1, r0)     // Catch:{ all -> 0x037a }
            if (r0 == 0) goto L_0x0351
            java.util.HashMap r2 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x037a }
            int r0 = r7.A01     // Catch:{ all -> 0x037a }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x037a }
            java.lang.String r0 = "important_frame_index"
            r2.put(r0, r1)     // Catch:{ all -> 0x037a }
            java.lang.String r1 = "media_pipeline_important_frame_rendered"
            java.lang.String r0 = "MediaGraphControllerImpl"
            X.C1899693i.A0m(r6, r9, r1, r0, r2)     // Catch:{ all -> 0x037a }
        L_0x0351:
            X.9XQ r0 = r7.A08     // Catch:{ all -> 0x037a }
            X.9ZJ r0 = r0.A05     // Catch:{ all -> 0x037a }
            X.8qc r0 = r0.A07     // Catch:{ all -> 0x037a }
            r0.BlX(r7)     // Catch:{ all -> 0x037a }
        L_0x035a:
            android.os.Trace.endSection()     // Catch:{ all -> 0x037a }
            goto L_0x0363
        L_0x035e:
            android.os.ConditionVariable r0 = r2.A00
            r0.open()
        L_0x0363:
            android.os.Trace.endSection()
        L_0x0366:
            return r8
        L_0x0367:
            X.7hv r1 = r9.A04     // Catch:{ all -> 0x037a }
            X.6wp r0 = X.C142216wp.A0W     // Catch:{ all -> 0x037a }
            r1.A00(r0)     // Catch:{ all -> 0x037a }
            java.lang.String r0 = "render() can be only called if you already are in the render thread"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x0375:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x037a }
        L_0x0379:
            throw r0     // Catch:{ all -> 0x037a }
        L_0x037a:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XP.handleMessage(android.os.Message):boolean");
    }

    public AnonymousClass9XP(C185298tP r3, AnonymousClass9XQ r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = new Handler(((AnonymousClass9ZJ) ((AnonymousClass9ZO) r3).A03).A00.getLooper(), this);
    }
}
