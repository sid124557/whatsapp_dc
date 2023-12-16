package X;

/* renamed from: X.59g  reason: invalid class name and case insensitive filesystem */
public final class C1000559g extends Exception {
    public final int downloadStatus;

    public C1000559g(int i) {
        this.downloadStatus = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DownloadResultException{downloadStatus=");
        A0o.append(C625435m.A01(this.downloadStatus));
        return AnonymousClass000.A0d(A0o);
    }
}
