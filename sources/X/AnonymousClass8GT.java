package X;

/* renamed from: X.8GT  reason: invalid class name */
public class AnonymousClass8GT implements C184368rg {
    public int A00 = 0;
    public int A01 = 0;

    public boolean Bdn(int i, boolean z) {
        if (z) {
            this.A01++;
        }
        if (this.A01 < 128) {
            return true;
        }
        this.A00 = i;
        return false;
    }

    public int B97() {
        return this.A00;
    }
}
