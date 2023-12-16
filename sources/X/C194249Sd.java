package X;

/* renamed from: X.9Sd  reason: invalid class name and case insensitive filesystem */
public class C194249Sd {
    public int A00;
    public int A01;
    public boolean A02;
    public final C195349Xk A03;

    public C194249Sd(C195349Xk r1) {
        this.A03 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InternalLoadRequest{mRequestAsset=");
        A0o.append(this.A03);
        A0o.append(", mPrefetchReferences=");
        A0o.append(this.A01);
        A0o.append(", mNonPrefetchReferences=");
        A0o.append(this.A00);
        A0o.append(", mDownloadedOrDownloading=");
        A0o.append(this.A02);
        return AnonymousClass000.A0d(A0o);
    }
}
