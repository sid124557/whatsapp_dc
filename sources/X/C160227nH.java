package X;

/* renamed from: X.7nH  reason: invalid class name and case insensitive filesystem */
public class C160227nH {
    public double A00 = -1.0d;
    public long A01;
    public final long A02 = Math.max(0, 300);
    public final /* synthetic */ C156117g3 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if ((r5 - r7.A01) >= r7.A02) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r2.A06.BZ1(r3) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(double r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            double r1 = r7.A00     // Catch:{ all -> 0x0068 }
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0068 }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r8 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            r1 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002b
            goto L_0x0035
        L_0x002b:
            long r0 = r7.A01     // Catch:{ all -> 0x0068 }
            long r3 = r5 - r0
            long r1 = r7.A02     // Catch:{ all -> 0x0068 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
        L_0x0035:
            r7.A00 = r8     // Catch:{ all -> 0x0068 }
            r7.A01 = r5     // Catch:{ all -> 0x0068 }
            X.7g3 r2 = r7.A03     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x006b
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 * r0
            int r3 = (int) r8     // Catch:{ all -> 0x0068 }
            X.8HT r2 = r2.A00     // Catch:{ all -> 0x0068 }
            X.8oc r0 = r2.A06     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x006b
            boolean r0 = r2.A0R     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0054
            X.8oc r0 = r2.A06     // Catch:{ all -> 0x0068 }
            boolean r1 = r0.BZ1(r3)     // Catch:{ all -> 0x0068 }
            r0 = 0
            if (r1 == 0) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            r2.A0R = r0     // Catch:{ all -> 0x0068 }
            r0 = 5
            if (r3 < r0) goto L_0x005e
            int r0 = r3 % 5
            if (r0 != 0) goto L_0x006b
        L_0x005e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "videotranscoder/transcode/progress "
            X.C18260x0.A0y(r0, r1, r3)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0068:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x006b:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160227nH.A00(double):void");
    }

    public C160227nH(C156117g3 r5) {
        this.A03 = r5;
    }

    public C160227nH() {
    }
}
