package X;

/* renamed from: X.7kB  reason: invalid class name and case insensitive filesystem */
public class C158567kB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158567kB)) {
            return false;
        }
        C158567kB r7 = (C158567kB) obj;
        return this.A04.equals(r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A02 == r7.A02;
    }

    public int hashCode() {
        return ((((((AnonymousClass6C8.A04(this.A04.hashCode()) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03)) * 31) + this.A02;
    }

    public C158567kB(C158567kB r3) {
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A02 = r3.A02;
    }

    public C158567kB(Object obj, int i, int i2, int i3, long j) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }
}
