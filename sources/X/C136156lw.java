package X;

/* renamed from: X.6lw  reason: invalid class name and case insensitive filesystem */
public class C136156lw extends C136186lz {
    public final C184268rW A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C136156lw r5 = (C136156lw) obj;
            if (!this.A02.equals(r5.A02) || this.A04 != r5.A04) {
                return false;
            }
        }
        return true;
    }

    public C136156lw(C184268rW r2, String str, boolean z) {
        super(33);
        this.A04 = z;
        this.A02 = str;
        this.A01 = null;
        this.A03 = false;
        this.A00 = r2;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    public C136156lw(C184268rW r2, String str, String str2, boolean z) {
        super(33);
        this.A04 = z;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = true;
        this.A00 = r2;
    }
}
