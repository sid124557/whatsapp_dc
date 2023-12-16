package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass843;
import X.C152167Xu;
import X.C159137lB;
import X.C166567yu;
import X.C18330xA;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class StackFrameThread extends C159137lB {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public C166567yu mSavedTraceContext;
    public int mSystemClockTimeIntervalMs = -1;

    public static native int nativeCpuClockResolutionMicros();

    static {
        C152167Xu r1 = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = r1.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = r1.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = r1.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.mContext = applicationContext;
        } else {
            this.mContext = context;
        }
    }

    public void disable() {
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            return;
        }
        this.mSavedTraceContext = null;
        this.mEnabled = false;
        synchronized (CPUProfiler.class) {
            if (CPUProfiler.sInitialized) {
                CPUProfiler.nativeStopProfiling();
            }
        }
        Thread thread = this.mProfilerThread;
        if (thread != null) {
            try {
                thread.join();
                this.mProfilerThread = null;
            } catch (InterruptedException e) {
                throw C18330xA.A09(e);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00da  */
    public void enable() {
        /*
            r18 = this;
            r0 = r18
            X.7yu r1 = r0.A01
            int r5 = r1.A02
            int r4 = PROVIDER_STACK_FRAME
            int r2 = PROVIDER_WALL_TIME_STACK_TRACE
            r4 = r4 | r2
            r4 = r4 & r5
            r3 = 0
            if (r4 == 0) goto L_0x0011
            r3 = 32753(0x7ff1, float:4.5897E-41)
        L_0x0011:
            int r2 = PROVIDER_NATIVE_STACK_TRACE
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0018
            r3 = r3 | 4
        L_0x0018:
            if (r3 == 0) goto L_0x0025
            java.lang.Thread r2 = r0.mProfilerThread
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = "Duplicate attempt to enable sampling profiler."
            android.util.Log.e(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            X.7yn r2 = r1.A08
            java.lang.String r3 = "provider.stack_trace.time_source"
            java.util.TreeMap r2 = r2.A04
            if (r2 == 0) goto L_0x0045
            java.lang.String r3 = X.C18320x8.A0e(r3, r2)
            if (r3 == 0) goto L_0x0045
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0045
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0048 }
            java.lang.String r2 = r3.toUpperCase(r2)     // Catch:{ IllegalArgumentException -> 0x0048 }
            X.6v9 r9 = X.C141176v9.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0048 }
            goto L_0x0054
        L_0x0045:
            X.6v9 r9 = X.C141176v9.NONE
            goto L_0x0054
        L_0x0048:
            r4 = move-exception
            java.lang.String r3 = "StackFrameThread"
            java.lang.String r2 = r4.getMessage()
            android.util.Log.e(r3, r2, r4)
            X.6v9 r9 = X.C141176v9.NONE
        L_0x0054:
            X.7yn r8 = r1.A08
            java.lang.String r2 = "provider.stack_trace.cpu_sampling_rate_ms"
            r11 = 0
            int r2 = r8.A00(r2, r11)
            java.lang.String r3 = "provider.stack_trace.thread_detect_interval_ms"
            int r7 = r8.A00(r3, r11)
            int r5 = r1.A02
            java.lang.String r3 = "provider.native_stack_trace.unwind_dex_frames"
            r14 = 0
            java.util.TreeMap r6 = r8.A00
            if (r6 == 0) goto L_0x0078
            java.lang.Object r3 = r6.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0078
            boolean r14 = r3.booleanValue()
        L_0x0078:
            java.lang.String r4 = "provider.native_stack_trace.unwinder_thread_pri"
            r3 = 5
            int r15 = r8.A00(r4, r3)
            java.lang.String r4 = "provider.native_stack_trace.unwinder_queue_size"
            r3 = 256(0x100, float:3.59E-43)
            int r16 = r8.A00(r4, r3)
            java.lang.String r3 = "provider.native_stack_trace.log_partial_stacks"
            r17 = 0
            if (r6 == 0) goto L_0x0099
            java.lang.Object r3 = r6.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0099
            boolean r17 = r3.booleanValue()
        L_0x0099:
            monitor-enter(r0)
            android.content.Context r12 = r0.mContext     // Catch:{ Exception -> 0x0128 }
            com.facebook.profilo.logger.MultiBufferLogger r13 = r0.A00()     // Catch:{ Exception -> 0x0128 }
            boolean r3 = com.facebook.profilo.provider.stacktrace.CPUProfiler.init(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0128 }
            if (r3 == 0) goto L_0x0132
            r10 = 23
            if (r2 > 0) goto L_0x00ac
            r2 = 23
        L_0x00ac:
            if (r7 <= 0) goto L_0x00af
            r10 = r7
        L_0x00af:
            int r7 = PROVIDER_WALL_TIME_STACK_TRACE     // Catch:{ all -> 0x0139 }
            r6 = r5 & r7
            r4 = 1
            r3 = 3
            if (r6 != 0) goto L_0x00ca
            int r6 = r9.ordinal()     // Catch:{ all -> 0x0139 }
            if (r6 == r3) goto L_0x00c8
            if (r6 == r4) goto L_0x00ca
            if (r6 == r11) goto L_0x00c5
            r3 = 2
            r9 = 0
            if (r6 != r3) goto L_0x00c6
        L_0x00c5:
            r9 = 1
        L_0x00c6:
            r8 = 0
            goto L_0x00cc
        L_0x00c8:
            r9 = 1
            goto L_0x00cb
        L_0x00ca:
            r9 = 0
        L_0x00cb:
            r8 = 1
        L_0x00cc:
            int r3 = PROVIDER_STACK_FRAME     // Catch:{ all -> 0x0139 }
            r3 = r3 | r7
            r3 = r3 & r5
            r7 = 0
            if (r3 == 0) goto L_0x00d5
            r7 = 32753(0x7ff1, float:4.5897E-41)
        L_0x00d5:
            int r3 = PROVIDER_NATIVE_STACK_TRACE     // Catch:{ all -> 0x0139 }
            r5 = r5 & r3
            if (r5 == 0) goto L_0x00dc
            r7 = r7 | 4
        L_0x00dc:
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r6 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r6)     // Catch:{ all -> 0x0139 }
            r5 = 0
            if (r9 != 0) goto L_0x00e5
            if (r8 != 0) goto L_0x00e5
            goto L_0x00f7
        L_0x00e5:
            int r3 = android.os.Process.myPid()     // Catch:{ all -> 0x0136 }
            com.facebook.profilo.provider.stacktrace.StackTraceWhitelist.nativeAddToWhitelist(r3)     // Catch:{ all -> 0x0136 }
            boolean r3 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x00f7
            boolean r3 = com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r7, r2, r10, r9, r8)     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x00f7
            r5 = 1
        L_0x00f7:
            monitor-exit(r6)     // Catch:{ all -> 0x0139 }
            if (r5 == 0) goto L_0x0132
            com.facebook.profilo.logger.MultiBufferLogger r6 = r0.A00()     // Catch:{ all -> 0x0139 }
            r7 = 6
            r8 = 52
            r9 = 0
            r12 = 8126495(0x7c001f, float:1.1387645E-38)
            long r14 = (long) r2     // Catch:{ all -> 0x0139 }
            r13 = r11
            r6.writeStandardEntry(r7, r8, r9, r11, r12, r13, r14)     // Catch:{ all -> 0x0139 }
            r0.mEnabled = r4     // Catch:{ all -> 0x0139 }
            boolean r2 = r0.mEnabled     // Catch:{ all -> 0x0139 }
            monitor-exit(r0)
            if (r2 == 0) goto L_0x0025
            r0.mSavedTraceContext = r1
            r1 = 9
            X.8Mf r3 = new X.8Mf
            r3.<init>(r0, r1)
            java.lang.String r2 = "Prflo:Profiler"
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r3, r2)
            r0.mProfilerThread = r1
            r1.start()
            return
        L_0x0128:
            r3 = move-exception
            java.lang.String r2 = "StackFrameThread"
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x0134 }
            android.util.Log.e(r2, r1, r3)     // Catch:{ all -> 0x0134 }
        L_0x0132:
            monitor-exit(r0)
            return
        L_0x0134:
            r1 = move-exception
            goto L_0x0138
        L_0x0136:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0139 }
        L_0x0138:
            throw r1     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((r2 & r1) != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTracingProviders() {
        /*
            r4 = this;
            X.7yu r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            int r2 = r1.A02
            int r1 = PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L_0x0017
            int r1 = PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r3 | r1
        L_0x0018:
            int r0 = PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    public void onTraceEnded(C166567yu r5, AnonymousClass843 r6) {
        int i;
        int i2 = r5.A02;
        int i3 = PROVIDER_STACK_FRAME;
        int i4 = PROVIDER_WALL_TIME_STACK_TRACE;
        if (((i3 | i4) & i2) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int i5 = (PROVIDER_STACK_FRAME | i4) & i2;
            int i6 = 0;
            if (i5 != 0) {
                i6 = 32753;
            }
            if ((PROVIDER_NATIVE_STACK_TRACE & i2) != 0) {
                i6 |= 4;
            }
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(i6 & i));
        }
        if ((i2 & getSupportedProviders()) != 0) {
            logAnnotation("provider.stack_trace.cpu_timer_res_us", Integer.toString(nativeCpuClockResolutionMicros()));
        }
    }

    public void onTraceStarted(C166567yu r2, AnonymousClass843 r3) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }

    public final void logAnnotation(String str, String str2) {
        MultiBufferLogger A00 = A00();
        A00.writeBytesEntry(0, 57, A00.writeBytesEntry(0, 56, A00.writeStandardEntry(6, 52, 0, 0, 0, 0, 0), str), str2);
    }
}
