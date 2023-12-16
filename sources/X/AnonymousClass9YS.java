package X;

/* renamed from: X.9YS  reason: invalid class name */
public class AnonymousClass9YS implements C202249ld {
    public final C194339Sm A00;
    public final /* synthetic */ AnonymousClass9W5 A01;

    public AnonymousClass9YS(AnonymousClass9W5 r1, C194339Sm r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0147, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
        if (r3.A01 != r3.A04) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0054 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0101 A[Catch:{ all -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0116 A[SYNTHETIC, Splitter:B:91:0x0116] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel() {
        /*
            r15 = this;
            X.9W5 r5 = r15.A01
            java.lang.Object r2 = r5.A06
            monitor-enter(r2)
            X.9Sm r3 = r15.A00     // Catch:{ all -> 0x0157 }
            monitor-enter(r3)     // Catch:{ all -> 0x0157 }
            boolean r0 = r3.A03     // Catch:{ all -> 0x0149 }
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0146
            monitor-enter(r3)     // Catch:{ all -> 0x0157 }
            boolean r0 = r3.A03     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0019
            int r4 = r3.A01     // Catch:{ all -> 0x0149 }
            int r1 = r3.A04     // Catch:{ all -> 0x0149 }
            r0 = 1
            if (r4 == r1) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0146
            X.9VJ r7 = r5.A01     // Catch:{ all -> 0x0157 }
            monitor-enter(r3)     // Catch:{ all -> 0x0157 }
            boolean r0 = r3.A03     // Catch:{ all -> 0x0149 }
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0144
        L_0x0028:
            monitor-enter(r3)     // Catch:{ all -> 0x0157 }
            boolean r1 = r3.A03     // Catch:{ all -> 0x0149 }
            r0 = 1
            if (r1 == 0) goto L_0x003f
            java.lang.String r6 = "ExternalLoadRequest"
            java.lang.String r5 = "Already finished: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0149 }
            X.32L r0 = r3.A08     // Catch:{ all -> 0x0149 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0149 }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x0149 }
            X.C162477s9.A0G(r6, r5, r4)     // Catch:{ all -> 0x0149 }
            goto L_0x0041
        L_0x003f:
            r3.A03 = r0     // Catch:{ all -> 0x0149 }
        L_0x0041:
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            java.util.Map r6 = r7.A04     // Catch:{ all -> 0x0157 }
            java.lang.Object r0 = r6.get(r3)     // Catch:{ all -> 0x0157 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x014c
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x0157 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0157 }
        L_0x0054:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r5 = r14.next()     // Catch:{ all -> 0x0157 }
            X.9Sd r5 = (X.C194249Sd) r5     // Catch:{ all -> 0x0157 }
            boolean r0 = r3.A00()     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0073
            int r0 = r5.A01     // Catch:{ all -> 0x0157 }
            int r1 = r0 + -1
            r5.A01 = r1     // Catch:{ all -> 0x0157 }
            int r0 = r5.A00     // Catch:{ all -> 0x0157 }
            if (r0 > 0) goto L_0x0054
            if (r1 <= 0) goto L_0x0094
            goto L_0x0054
        L_0x0073:
            int r0 = r5.A00     // Catch:{ all -> 0x0157 }
            int r0 = r0 + -1
            r5.A00 = r0     // Catch:{ all -> 0x0157 }
            if (r0 > 0) goto L_0x0054
            int r0 = r5.A01     // Catch:{ all -> 0x0157 }
            if (r0 <= 0) goto L_0x0094
            java.util.Map r1 = r7.A02     // Catch:{ all -> 0x0157 }
            X.9Xk r0 = r5.A03     // Catch:{ all -> 0x0157 }
            X.9WL r0 = r0.A02     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0157 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0157 }
            X.9SP r1 = (X.AnonymousClass9SP) r1     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x0054
            r0 = 1
            r1.A01(r0)     // Catch:{ all -> 0x0157 }
            goto L_0x0054
        L_0x0094:
            X.9Xk r0 = r5.A03     // Catch:{ all -> 0x0157 }
            X.9WL r0 = r0.A02     // Catch:{ all -> 0x0157 }
            java.lang.String r8 = r0.A0A     // Catch:{ all -> 0x0157 }
            java.util.Map r1 = r7.A02     // Catch:{ all -> 0x0157 }
            java.lang.Object r0 = r1.get(r8)     // Catch:{ all -> 0x0157 }
            X.9SP r0 = (X.AnonymousClass9SP) r0     // Catch:{ all -> 0x0157 }
            r13 = 1
            if (r0 != 0) goto L_0x00af
            boolean r0 = r5.A02     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x010f
            java.util.Map r0 = r7.A03     // Catch:{ all -> 0x0157 }
            r0.remove(r8)     // Catch:{ all -> 0x0157 }
            goto L_0x010c
        L_0x00af:
            X.9TM r10 = r0.A01     // Catch:{ all -> 0x0157 }
            java.lang.Object r4 = r10.A06     // Catch:{ all -> 0x0157 }
            monitor-enter(r4)     // Catch:{ all -> 0x0157 }
            X.9V8 r9 = r0.A00     // Catch:{ all -> 0x013b }
            X.9Jj r12 = r9.A00     // Catch:{ all -> 0x013b }
            X.9Jj r0 = X.C192369Jj.FINISHED     // Catch:{ all -> 0x013b }
            if (r12 == r0) goto L_0x010e
            X.9Jj r11 = X.C192369Jj.CANCELLED     // Catch:{ all -> 0x013b }
            if (r12 == r11) goto L_0x010e
            X.9V8 r0 = r10.A00     // Catch:{ all -> 0x013b }
            if (r0 != r9) goto L_0x00f2
            java.util.Map r0 = r10.A08     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x013b }
            com.facebook.cameracore.ardelivery.listener.CancelableToken r0 = (com.facebook.cameracore.ardelivery.listener.CancelableToken) r0     // Catch:{ all -> 0x013b }
            boolean r12 = r0.cancel()     // Catch:{ all -> 0x013b }
            if (r12 == 0) goto L_0x00e9
            r0 = 0
            r10.A00 = r0     // Catch:{ all -> 0x013b }
        L_0x00d5:
            r9.A00(r11)     // Catch:{ all -> 0x013b }
            java.util.Map r11 = r10.A09     // Catch:{ all -> 0x013b }
            X.9Xk r0 = r9.A04     // Catch:{ all -> 0x013b }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r11.remove(r0)     // Catch:{ all -> 0x013b }
            if (r0 != r9) goto L_0x0135
            java.util.Map r0 = r10.A08     // Catch:{ all -> 0x013b }
            r0.remove(r9)     // Catch:{ all -> 0x013b }
        L_0x00e9:
            r10.A01()     // Catch:{ all -> 0x013b }
            java.util.List r0 = r10.A00()     // Catch:{ all -> 0x013b }
            monitor-exit(r4)     // Catch:{ all -> 0x013b }
            goto L_0x00fc
        L_0x00f2:
            java.util.Queue r0 = r10.A0A     // Catch:{ all -> 0x013b }
            boolean r0 = r0.remove(r9)     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x0121
            r12 = 1
            goto L_0x00d5
        L_0x00fc:
            r10.A02(r0)     // Catch:{ all -> 0x0157 }
            if (r12 == 0) goto L_0x010f
            r0 = 0
            r5.A02 = r0     // Catch:{ all -> 0x0157 }
            java.util.Map r0 = r7.A03     // Catch:{ all -> 0x0157 }
            r0.remove(r8)     // Catch:{ all -> 0x0157 }
            r1.remove(r8)     // Catch:{ all -> 0x0157 }
        L_0x010c:
            r13 = 0
            goto L_0x010f
        L_0x010e:
            monitor-exit(r4)     // Catch:{ all -> 0x013b }
        L_0x010f:
            java.util.Map r0 = r7.A05     // Catch:{ IllegalStateException -> 0x0114 }
            X.AnonymousClass9VJ.A00(r5, r0, r6)     // Catch:{ IllegalStateException -> 0x0114 }
        L_0x0114:
            if (r13 == 0) goto L_0x0054
            java.util.Map r1 = r7.A05     // Catch:{ all -> 0x0157 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0157 }
            r1.put(r5, r0)     // Catch:{ all -> 0x0157 }
            goto L_0x0054
        L_0x0121:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "Cancelling download which is not current or queued: state="
            r1.append(r0)     // Catch:{ all -> 0x013b }
            X.9Jj r0 = r9.A00     // Catch:{ all -> 0x013b }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x013b }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x013b }
            goto L_0x013a
        L_0x0135:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013b }
            r0.<init>()     // Catch:{ all -> 0x013b }
        L_0x013a:
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013b }
            goto L_0x0156
        L_0x013e:
            java.util.Map r0 = r7.A05     // Catch:{ IllegalStateException -> 0x0143 }
            X.AnonymousClass9VJ.A00(r3, r6, r0)     // Catch:{ IllegalStateException -> 0x0143 }
        L_0x0143:
            r0 = 1
        L_0x0144:
            monitor-exit(r2)     // Catch:{ all -> 0x0157 }
            return r0
        L_0x0146:
            monitor-exit(r2)     // Catch:{ all -> 0x0157 }
            r0 = 0
            return r0
        L_0x0149:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            goto L_0x0156
        L_0x014c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "ExternalLoadRequest not present in mExternalToInternalMap: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r3, r0, r1)     // Catch:{ all -> 0x0157 }
        L_0x0156:
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0157 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YS.cancel():boolean");
    }
}
