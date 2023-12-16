package X;

/* renamed from: X.8Ld  reason: invalid class name and case insensitive filesystem */
public final class C172448Ld implements Comparable {
    public final short A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C162457s7.A00(this.A00 & 65535, ((C172448Ld) obj).A00 & 65535);
    }

    public boolean equals(Object obj) {
        short s = this.A00;
        if (!(obj instanceof C172448Ld) || s != ((C172448Ld) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return String.valueOf(this.A00 & 65535);
    }

    public /* synthetic */ C172448Ld(short s) {
        this.A00 = s;
    }
}
