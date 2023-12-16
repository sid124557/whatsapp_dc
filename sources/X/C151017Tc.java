package X;

import java.io.File;

/* renamed from: X.7Tc  reason: invalid class name and case insensitive filesystem */
public final class C151017Tc {
    public final long A00;
    public final long A01;
    public final File A02;
    public final byte[] A03;

    public C151017Tc(File file, byte[] bArr, long j, long j2) {
        this.A02 = file;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DownloadResult{fileSize=");
        A0o.append(this.A00);
        A0o.append(", roundTripTime=");
        A0o.append(this.A01);
        return AnonymousClass000.A0d(A0o);
    }
}
