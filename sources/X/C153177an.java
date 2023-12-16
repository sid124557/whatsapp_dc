package X;

/* renamed from: X.7an  reason: invalid class name and case insensitive filesystem */
public abstract class C153177an {
    public abstract int getCount();

    public abstract Object getElement();

    public boolean equals(Object obj) {
        if (!(obj instanceof C153177an)) {
            return false;
        }
        C153177an r4 = (C153177an) obj;
        if (getCount() != r4.getCount() || !C1447372t.A00(getElement(), r4.getElement())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A07(getElement()) ^ getCount();
    }

    public String toString() {
        String valueOf = String.valueOf(getElement());
        int count = getCount();
        if (count != 1) {
            return AnonymousClass000.A0Y(" x ", AnonymousClass6C8.A0g(valueOf.length() + 14, valueOf), count);
        }
        return valueOf;
    }
}
