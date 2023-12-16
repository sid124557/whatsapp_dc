package X;

/* renamed from: X.9Ra  reason: invalid class name and case insensitive filesystem */
public class C193959Ra {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02 = false;
    public final AnonymousClass39R A03;

    public C193959Ra(AnonymousClass39R r2) {
        this.A03 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExpressiveBackgroundData{backgroundMetaData=");
        A0o.append(this.A03);
        A0o.append(", isAssetDownloaded=");
        A0o.append(this.A00);
        A0o.append(", isDownloadFailed=");
        A0o.append(this.A01);
        A0o.append(", isSelected=");
        A0o.append(this.A02);
        return AnonymousClass000.A0d(A0o);
    }
}
