package X;

/* renamed from: X.8Lc  reason: invalid class name and case insensitive filesystem */
public final class C172438Lc implements Comparable {
    public final long A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((this.A00 ^ Long.MIN_VALUE) > (((C172438Lc) obj).A00 ^ Long.MIN_VALUE) ? 1 : ((this.A00 ^ Long.MIN_VALUE) == (((C172438Lc) obj).A00 ^ Long.MIN_VALUE) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return AnonymousClass6C9.A1L(i) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C172438Lc) || j != ((C172438Lc) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6C8.A0B(this.A00);
    }

    public String toString() {
        return C154527dJ.A01(this.A00);
    }

    public /* synthetic */ C172438Lc(long j) {
        this.A00 = j;
    }
}
