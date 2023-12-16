package X;

/* renamed from: X.5No  reason: invalid class name and case insensitive filesystem */
public class C103585No {
    public long A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public C103585No(String str, long j, long j2, long j3) {
        this.A03 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExpressPathDownloadData: {EncHash: ");
        A0o.append(this.A03);
        A0o.append("SavedTime: ");
        A0o.append(this.A02);
        A0o.append("SavedBytes: ");
        A0o.append(this.A01);
        A0o.append("LateUpdateTime: ");
        return AnonymousClass001.A0k(A0o, this.A00);
    }
}
