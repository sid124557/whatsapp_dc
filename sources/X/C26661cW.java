package X;

import java.io.File;

/* renamed from: X.1cW  reason: invalid class name and case insensitive filesystem */
public final class C26661cW extends AnonymousClass8GZ {
    public final long A00;
    public final C33141sV A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26661cW(AnonymousClass1nF r2, C33141sV r3, File file, String str, long j, long j2) {
        super(r2, file, j);
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = j2;
        this.A02 = str;
    }

    public String B9l() {
        String str = this.A02;
        if (str == null) {
            return "application/*";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap Bqg(int r6) {
        /*
            r5 = this;
            X.1mV r4 = r5.A03
            boolean r0 = r4 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x003c
            X.1sV r3 = r5.A01
            monitor-enter(r3)
            X.C626936e.A00()     // Catch:{ all -> 0x0038 }
            r2 = 0
            r1 = 100
            byte[] r0 = X.C33141sV.A03(r4)     // Catch:{ all -> 0x0038 }
            android.graphics.Bitmap r0 = X.C33141sV.A01(r4, r0, r1, r2, r2)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            X.30w r1 = r4.A0y()     // Catch:{ all -> 0x0038 }
            boolean r0 = r1.A06()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x003b
            X.3My r0 = r3.A04     // Catch:{ all -> 0x0038 }
            r0.A00(r1)     // Catch:{ all -> 0x0038 }
            byte[] r2 = r1.A09()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x003b
            android.graphics.BitmapFactory$Options r1 = X.C33141sV.A08     // Catch:{ all -> 0x0038 }
            r0 = 100
            android.graphics.Bitmap r0 = X.AnonymousClass5CD.A00(r1, r2, r0)     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r3)
            return r0
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x003b:
            monitor-exit(r3)
        L_0x003c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26661cW.Bqg(int):android.graphics.Bitmap");
    }

    public long B7A() {
        return this.A00;
    }

    public int getType() {
        return 4;
    }
}
