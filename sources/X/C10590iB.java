package X;

/* renamed from: X.0iB  reason: invalid class name and case insensitive filesystem */
public final class C10590iB implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    /* renamed from: A00 */
    public int compareTo(C10590iB r3) {
        C162457s7.A0J(r3, 0);
        int i = this.A00 - r3.A00;
        if (i == 0) {
            return this.A01 - r3.A01;
        }
        return i;
    }

    public C10590iB(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }
}
