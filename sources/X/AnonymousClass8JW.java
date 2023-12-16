package X;

/* renamed from: X.8JW  reason: invalid class name */
public class AnonymousClass8JW implements C185518to {
    public int A00;
    public final long A01;
    public final AnonymousClass7US A02;

    public long B4c() {
        return this.A01;
    }

    public int B6N() {
        return this.A00;
    }

    public AnonymousClass7US B6Y() {
        int i;
        boolean z = this instanceof C137616oz;
        int i2 = this.A00;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        if (i2 < i) {
            return this.A02;
        }
        return null;
    }

    public void BSM(boolean z, int i) {
        this.A00++;
    }

    public AnonymousClass8JW(String str, long j) {
        this.A02 = new AnonymousClass7US(str, str, "", (String) null, (String) null, "fallback", 0, false);
        this.A01 = j;
    }

    public AnonymousClass8JW(AnonymousClass7US r1, long j) {
        this.A01 = j;
        this.A02 = r1;
    }
}
