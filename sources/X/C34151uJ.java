package X;

/* renamed from: X.1uJ  reason: invalid class name and case insensitive filesystem */
public class C34151uJ extends C173778Rq {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final C620633i A03;
    public final Object A04 = AnonymousClass002.A0D();
    public volatile AnonymousClass2JL A05;
    public final /* synthetic */ C45772aY A06;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|35|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00c9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            r6 = 0
            r4 = 0
        L_0x0002:
            X.2aY r3 = r10.A06     // Catch:{ RuntimeException -> 0x00cd }
            X.33i r0 = r10.A03     // Catch:{ RuntimeException -> 0x00cd }
            android.app.ActivityManager r0 = r0.A06()     // Catch:{ RuntimeException -> 0x00cd }
            X.C626936e.A06(r0)     // Catch:{ RuntimeException -> 0x00cd }
            java.util.List r0 = r0.getProcessesInErrorState()     // Catch:{ RuntimeException -> 0x00cd }
            java.util.LinkedList r2 = X.AnonymousClass0x9.A18()     // Catch:{ RuntimeException -> 0x00cd }
            int r8 = android.os.Process.myUid()     // Catch:{ RuntimeException -> 0x00cd }
            int r7 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00cd }
            if (r0 == 0) goto L_0x0053
            java.util.Iterator r9 = r0.iterator()     // Catch:{ RuntimeException -> 0x00cd }
        L_0x0023:
            boolean r0 = r9.hasNext()     // Catch:{ RuntimeException -> 0x00cd }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r5 = r9.next()     // Catch:{ RuntimeException -> 0x00cd }
            android.app.ActivityManager$ProcessErrorStateInfo r5 = (android.app.ActivityManager.ProcessErrorStateInfo) r5     // Catch:{ RuntimeException -> 0x00cd }
            int r1 = r5.condition     // Catch:{ RuntimeException -> 0x00cd }
            r0 = 2
            if (r1 != r0) goto L_0x0023
            int r0 = r5.uid     // Catch:{ RuntimeException -> 0x00cd }
            if (r0 != r8) goto L_0x0023
            X.2Mu r1 = new X.2Mu     // Catch:{ RuntimeException -> 0x00cd }
            r1.<init>()     // Catch:{ RuntimeException -> 0x00cd }
            java.lang.String r0 = r5.shortMsg     // Catch:{ RuntimeException -> 0x00cd }
            r1.A01 = r0     // Catch:{ RuntimeException -> 0x00cd }
            java.lang.String r0 = r5.tag     // Catch:{ RuntimeException -> 0x00cd }
            r1.A02 = r0     // Catch:{ RuntimeException -> 0x00cd }
            int r0 = r5.pid     // Catch:{ RuntimeException -> 0x00cd }
            r1.A00 = r0     // Catch:{ RuntimeException -> 0x00cd }
            if (r0 != r7) goto L_0x004f
            r2.addFirst(r1)     // Catch:{ RuntimeException -> 0x00cd }
            goto L_0x0023
        L_0x004f:
            r2.addLast(r1)     // Catch:{ RuntimeException -> 0x00cd }
            goto L_0x0023
        L_0x0053:
            boolean r0 = r10.A00     // Catch:{ RuntimeException -> 0x00cd }
            if (r0 == 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ RuntimeException -> 0x00cd }
            java.lang.String r0 = "ProcessANRErrorMonitor/Starting process monitor checks for process "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00cd }
            int r0 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00cd }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00cd }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ RuntimeException -> 0x00cd }
            r10.A00 = r4     // Catch:{ RuntimeException -> 0x00cd }
            X.2JL r1 = r10.A05     // Catch:{ RuntimeException -> 0x00cd }
            r0 = 0
            r3.A00(r1, r0, r0, r4)     // Catch:{ RuntimeException -> 0x00cd }
        L_0x0072:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a9
            java.lang.Object r5 = r2.getFirst()
            X.2Mu r5 = (X.C42102Mu) r5
            int r1 = r5.A00
            int r0 = android.os.Process.myPid()
            if (r1 != r0) goto L_0x00a9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProcessANRErrorMonitor/ANR detected Short msg: "
            r1.append(r0)
            java.lang.String r0 = r5.A01
            r1.append(r0)
            java.lang.String r0 = " Tag: "
            r1.append(r0)
            java.lang.String r0 = r5.A02
            X.C18260x0.A1M(r1, r0)
            X.2JL r4 = r10.A05
            java.lang.String r2 = r5.A01
            java.lang.String r1 = r5.A02
            r0 = 1
            r3.A00(r4, r2, r1, r0)
            return
        L_0x00a9:
            int r6 = r6 + 1
            r0 = 120(0x78, float:1.68E-43)
            if (r6 < r0) goto L_0x00bc
            X.2JL r2 = r10.A05
            r1 = 2
            r0 = 0
            r3.A00(r2, r0, r0, r1)
            java.lang.String r0 = "ProcessANRErrorMonitor/Stopping checks because of MAX_NUMBER_BEFORE_ERROR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00bc:
            java.lang.Object r2 = r10.A04
            monitor-enter(r2)
            boolean r0 = r10.A01     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x00cb
            r0 = 500(0x1f4, float:7.0E-43)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00c9 }
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x00c9 }
        L_0x00c9:
            boolean r0 = r10.A01     // Catch:{ all -> 0x00e9 }
        L_0x00cb:
            monitor-exit(r2)     // Catch:{ all -> 0x00e9 }
            goto L_0x00df
        L_0x00cd:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00ec
            X.2aY r3 = r10.A06
            X.2JL r2 = r10.A05
            r1 = 4
            goto L_0x00e4
        L_0x00df:
            if (r0 == 0) goto L_0x0002
            X.2JL r2 = r10.A05
            r1 = 3
        L_0x00e4:
            r0 = 0
            r3.A00(r2, r0, r0, r1)
            return
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e9 }
            throw r0
        L_0x00ec:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34151uJ.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34151uJ(C45772aY r2, AnonymousClass2JL r3, C620633i r4, long j) {
        super("ProcessAnrErrorMonitorThread");
        this.A06 = r2;
        this.A05 = r3;
        this.A02 = j;
        this.A00 = true;
        this.A03 = r4;
    }
}
