package X;

/* renamed from: X.8Lj  reason: invalid class name and case insensitive filesystem */
public final class C172498Lj implements Comparable {
    public final int A00;

    public static final /* synthetic */ C172498Lj A00(int i) {
        return new C172498Lj(i);
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C172498Lj) || i != ((C172498Lj) obj).A00) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ int A02() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C154527dJ.A00(this.A00, ((C172498Lj) obj).A00);
    }

    public boolean equals(Object obj) {
        return A01(this.A00, obj);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return String.valueOf(AnonymousClass6C8.A0M(this.A00));
    }

    public /* synthetic */ C172498Lj(int i) {
        this.A00 = i;
    }
}
