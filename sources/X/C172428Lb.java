package X;

/* renamed from: X.8Lb  reason: invalid class name and case insensitive filesystem */
public final class C172428Lb implements Comparable {
    public final byte A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C162457s7.A00(this.A00 & 255, ((C172428Lb) obj).A00 & 255);
    }

    public boolean equals(Object obj) {
        byte b = this.A00;
        if (!(obj instanceof C172428Lb) || b != ((C172428Lb) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return String.valueOf(this.A00 & 255);
    }

    public /* synthetic */ C172428Lb(byte b) {
        this.A00 = b;
    }
}
