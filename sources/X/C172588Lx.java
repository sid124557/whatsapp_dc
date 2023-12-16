package X;

/* renamed from: X.8Lx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C172588Lx implements Runnable {
    public final C162757sh A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (X.AnonymousClass6C9.A1Q("MessengerIpcClient") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r4 = java.lang.String.valueOf(r7);
        X.AnonymousClass6C7.A1G("Sending ", r4, "MessengerIpcClient", X.AnonymousClass6CA.A0Y(r4.length() + 8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r6 = r6.A02;
        r1 = r2.A02;
        r5 = android.os.Message.obtain();
        r5.what = r7.A01;
        r5.arg1 = r8;
        r5.replyTo = r1;
        r4 = X.AnonymousClass002.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if ((r7 instanceof X.C130136bR) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        r4.putBoolean("oneWay", r0);
        r4.putString("pkg", r6.getPackageName());
        r4.putBundle("data", r7.A02);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = r2.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        if (r0 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r0 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        r0.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        throw X.AnonymousClass001.A0e("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        r2.A01(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.7sh r2 = r10.A00
        L_0x0002:
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x00a7 }
            r3 = 2
            if (r0 != r3) goto L_0x0013
            java.util.Queue r1 = r2.A04     // Catch:{ all -> 0x00a7 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0016
            r2.A00()     // Catch:{ all -> 0x00a7 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a6
        L_0x0016:
            java.lang.Object r7 = r1.poll()     // Catch:{ all -> 0x00a7 }
            X.7ay r7 = (X.C153277ay) r7     // Catch:{ all -> 0x00a7 }
            android.util.SparseArray r0 = r2.A03     // Catch:{ all -> 0x00a7 }
            int r8 = r7.A00     // Catch:{ all -> 0x00a7 }
            r0.put(r8, r7)     // Catch:{ all -> 0x00a7 }
            X.7iS r6 = r2.A05     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.ScheduledExecutorService r9 = r6.A03     // Catch:{ all -> 0x00a7 }
            r0 = 7
            X.3a4 r5 = new X.3a4     // Catch:{ all -> 0x00a7 }
            r5.<init>(r7, r0, r2)     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a7 }
            r0 = 30
            r9.schedule(r5, r0, r4)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = "MessengerIpcClient"
            boolean r0 = X.AnonymousClass6C9.A1Q(r5)
            if (r0 == 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r7)
            int r0 = r4.length()
            int r0 = r0 + 8
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Sending "
            X.AnonymousClass6C7.A1G(r0, r4, r5, r1)
        L_0x0050:
            android.content.Context r6 = r6.A02
            android.os.Messenger r1 = r2.A02
            android.os.Message r5 = android.os.Message.obtain()
            int r0 = r7.A01
            r5.what = r0
            r5.arg1 = r8
            r5.replyTo = r1
            android.os.Bundle r4 = X.AnonymousClass002.A08()
            java.lang.String r1 = "oneWay"
            boolean r0 = r7 instanceof X.C130136bR
            if (r0 == 0) goto L_0x0082
            r0 = 0
        L_0x006b:
            r4.putBoolean(r1, r0)
            java.lang.String r1 = "pkg"
            java.lang.String r0 = r6.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "data"
            android.os.Bundle r0 = r7.A02
            r4.putBundle(r1, r0)
            r5.setData(r4)
            goto L_0x0084
        L_0x0082:
            r0 = 1
            goto L_0x006b
        L_0x0084:
            X.7GU r1 = r2.A01     // Catch:{ RemoteException -> 0x009c }
            android.os.Messenger r0 = r1.A00     // Catch:{ RemoteException -> 0x009c }
            if (r0 != 0) goto L_0x0090
            X.7xq r0 = r1.A01     // Catch:{ RemoteException -> 0x009c }
            if (r0 == 0) goto L_0x0095
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x009c }
        L_0x0090:
            r0.send(r5)     // Catch:{ RemoteException -> 0x009c }
            goto L_0x0002
        L_0x0095:
            java.lang.String r0 = "Both messengers are null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ RemoteException -> 0x009c }
            throw r0     // Catch:{ RemoteException -> 0x009c }
        L_0x009c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A01(r3, r0)
            goto L_0x0002
        L_0x00a6:
            return
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172588Lx.run():void");
    }

    public C172588Lx(C162757sh r1) {
        this.A00 = r1;
    }
}
