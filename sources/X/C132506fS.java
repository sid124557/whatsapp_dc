package X;

/* renamed from: X.6fS  reason: invalid class name and case insensitive filesystem */
public class C132506fS extends C151647Vp {
    public final C152287Yh A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C132506fS r5 = (C132506fS) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C132506fS(C184148rK r1, C152287Yh r2, boolean z) {
        super(r1, z);
        this.A00 = r2;
    }
}
