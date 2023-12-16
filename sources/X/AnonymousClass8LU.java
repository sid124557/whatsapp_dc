package X;

/* renamed from: X.8LU  reason: invalid class name */
public final class AnonymousClass8LU implements Comparable {
    public final boolean A00;
    public final boolean A01;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass8LU r4 = (AnonymousClass8LU) obj;
        return C162027r4.start().compareFalseFirst(this.A01, r4.A01).compareFalseFirst(this.A00, r4.A00).result();
    }

    public AnonymousClass8LU(C166527yp r3, int i) {
        this.A00 = (r3.A0G & 1) == 0 ? false : true;
        this.A01 = AnonymousClass6C8.A1O(i);
    }
}
