package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.81i  reason: invalid class name and case insensitive filesystem */
public final class C1675081i implements C184748sS {
    public long A00;
    public long A01;
    public C161387pX A02;
    public C140206tK A03;
    public File A04;
    public OutputStream A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final C186458vL A09;
    public final C172488Li A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final void A00() {
        if (this.A05 != null) {
            try {
                C153827c5.A01("cacheDataSinkSync");
                this.A05.flush();
                C153827c5.A00();
                OutputStream outputStream = this.A05;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.A05 = null;
                File file = this.A04;
                this.A04 = null;
                this.A09.AzA(file);
            } catch (Throwable th) {
                C153827c5.A00();
                OutputStream outputStream2 = this.A05;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A05 = null;
                File file2 = this.A04;
                this.A04 = null;
                file2.delete();
                throw th;
            }
        }
    }

    public final void A01() {
        int i;
        C161387pX r6 = this.A02;
        long j = r6.A02;
        long j2 = this.A00;
        long j3 = this.A07;
        long min = Math.min(j - j2, j3);
        boolean z = this.A0C;
        if (z && this.A06 > 0 && j == -1) {
            min = j3;
        }
        File Bpd = this.A09.Bpd(r6.A06, j2 + r6.A01, min);
        this.A04 = Bpd;
        OutputStream A0h = AnonymousClass0x9.A0h(Bpd);
        this.A01 = 0;
        if (z && (i = this.A06) > 0) {
            C140206tK r0 = this.A03;
            if (r0 == null) {
                this.A03 = new C140206tK(A0h, i);
            } else {
                r0.A00(A0h);
            }
        }
        OutputStream outputStream = this.A03;
        if (outputStream != null) {
            A0h = outputStream;
        }
        this.A05 = A0h;
    }

    public void Bfy(C161387pX r6) {
        C140446tk r1;
        C159197lM.A02(AnonymousClass000.A1S((r6.A02 > -1 ? 1 : (r6.A02 == -1 ? 0 : -1))));
        try {
            C153827c5.A01("exo-opencachedatasink");
            this.A02 = r6;
            this.A00 = 0;
            A01();
            C153827c5.A00();
            return;
        } catch (FileNotFoundException e) {
            r1 = new C140446tk(e);
        } catch (C140386te e2) {
            r1 = new C140446tk(e2);
        } catch (Throwable th) {
            C153827c5.A00();
            throw th;
        }
        throw r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r5.A00 <= 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r3 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r5 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(byte[] r14, int r15, int r16) {
        /*
            r13 = this;
            long r8 = r13.A07     // Catch:{ IOException -> 0x0062 }
            r11 = r8
            X.8Li r5 = r13.A0A     // Catch:{ IOException -> 0x0062 }
            boolean r10 = r13.A0B     // Catch:{ IOException -> 0x0062 }
            if (r10 == 0) goto L_0x000c
            r0 = 1
            if (r5 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r4 = 0
            if (r0 == 0) goto L_0x001c
            X.8vL r1 = r13.A09     // Catch:{ IOException -> 0x0062 }
            java.lang.String r0 = r5.A07     // Catch:{ IOException -> 0x0062 }
            boolean r0 = r1.BHz(r0)     // Catch:{ IOException -> 0x0062 }
            if (r0 == 0) goto L_0x001c
            long r8 = r13.A08     // Catch:{ IOException -> 0x0062 }
        L_0x001c:
            r6 = r16
            if (r4 >= r6) goto L_0x0061
            if (r10 == 0) goto L_0x0029
            if (r5 == 0) goto L_0x0029
            int r0 = r5.A00     // Catch:{ IOException -> 0x0062 }
            r3 = 1
            if (r0 > 0) goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            long r0 = r13.A01     // Catch:{ IOException -> 0x0062 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0033
            if (r3 == 0) goto L_0x0042
            goto L_0x0035
        L_0x0033:
            if (r3 == 0) goto L_0x003c
        L_0x0035:
            X.8vL r1 = r13.A09     // Catch:{ IOException -> 0x0062 }
            java.lang.String r0 = r5.A07     // Catch:{ IOException -> 0x0062 }
            r1.AwX(r0)     // Catch:{ IOException -> 0x0062 }
        L_0x003c:
            r13.A00()     // Catch:{ IOException -> 0x0062 }
            r13.A01()     // Catch:{ IOException -> 0x0062 }
        L_0x0042:
            int r0 = r16 - r4
            long r6 = (long) r0     // Catch:{ IOException -> 0x0062 }
            long r2 = r13.A01     // Catch:{ IOException -> 0x0062 }
            long r0 = r11 - r2
            int r2 = X.AnonymousClass6CA.A02(r6, r0)     // Catch:{ IOException -> 0x0062 }
            java.io.OutputStream r1 = r13.A05     // Catch:{ IOException -> 0x0062 }
            int r0 = r15 + r4
            r1.write(r14, r0, r2)     // Catch:{ IOException -> 0x0062 }
            int r4 = r4 + r2
            long r0 = r13.A01     // Catch:{ IOException -> 0x0062 }
            long r2 = (long) r2     // Catch:{ IOException -> 0x0062 }
            long r0 = r0 + r2
            r13.A01 = r0     // Catch:{ IOException -> 0x0062 }
            long r0 = r13.A00     // Catch:{ IOException -> 0x0062 }
            long r0 = r0 + r2
            r13.A00 = r0     // Catch:{ IOException -> 0x0062 }
            goto L_0x001c
        L_0x0061:
            return
        L_0x0062:
            r1 = move-exception
            X.6tk r0 = new X.6tk
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675081i.write(byte[], int, int):void");
    }

    public C1675081i(C186458vL r1, C172488Li r2, int i, long j, long j2, boolean z, boolean z2) {
        r1.getClass();
        this.A09 = r1;
        this.A07 = j;
        this.A0C = z;
        this.A06 = i;
        this.A0A = r2;
        this.A0B = z2;
        this.A08 = j2;
    }

    public void close() {
        try {
            A00();
        } catch (IOException e) {
            throw new C140446tk(e);
        }
    }
}
