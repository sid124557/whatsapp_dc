package X;

/* renamed from: X.2dC  reason: invalid class name and case insensitive filesystem */
public class C47402dC {
    public final C52852m9 A00;
    public final C50632iV A01;
    public final C56922sm A02;
    public final C56982ss A03;
    public final C56562sC A04;
    public final C28761hj A05;
    public final C55272q5 A06;
    public final C72303dV A07;
    public final C620233e A08;
    public final C55882r4 A09;
    public final C55832qz A0A;

    public C47402dC(C52852m9 r1, C50632iV r2, C56922sm r3, C56982ss r4, C56562sC r5, C28761hj r6, C55272q5 r7, C72303dV r8, C620233e r9, C55882r4 r10, C55832qz r11) {
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = r9;
        this.A0A = r11;
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r6.A06.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C95814uZ r7, long r8, long r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/setchatreadreceiptssent/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            X.C18260x0.A12(r0, r1, r10)
            X.2ss r0 = r6.A03
            X.31A r5 = X.C56982ss.A00(r0, r7)
            if (r5 != 0) goto L_0x0025
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/setchatreadreceiptssent/no chat for "
            X.C18260x0.A1S(r1, r0, r7)
        L_0x0024:
            return
        L_0x0025:
            long r1 = r5.A0S
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r5.A0R = r8
            r5.A0S = r10
            X.2sm r4 = r6.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051, Error | RuntimeException -> 0x004c }
            monitor-enter(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051, Error | RuntimeException -> 0x004c }
            android.content.ContentValues r3 = X.C18290x4.A0E()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "last_read_receipt_sent_message_row_id"
            long r0 = r5.A0R     // Catch:{ all -> 0x0049 }
            X.C18270x1.A0c(r3, r2, r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "last_read_receipt_sent_message_sort_id"
            long r0 = r5.A0S     // Catch:{ all -> 0x0049 }
            X.C18270x1.A0c(r3, r2, r0)     // Catch:{ all -> 0x0049 }
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051, Error | RuntimeException -> 0x004c }
            r4.A0N(r3, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051, Error | RuntimeException -> 0x004c }
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051, Error | RuntimeException -> 0x004c }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051, Error | RuntimeException -> 0x004c }
        L_0x004c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0051:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r6.A06
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47402dC.A00(X.4uZ, long, long):void");
    }
}
