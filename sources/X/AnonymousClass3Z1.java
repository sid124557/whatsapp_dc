package X;

import java.io.Serializable;

/* renamed from: X.3Z1  reason: invalid class name */
public final class AnonymousClass3Z1 implements Serializable {
    public final Object first;
    public final Object second;
    public final Object third;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Z1) {
                AnonymousClass3Z1 r5 = (AnonymousClass3Z1) obj;
                if (!C162457s7.A0P(this.first, r5.first) || !C162457s7.A0P(this.second, r5.second) || !C162457s7.A0P(this.third, r5.third)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A07(this.first) * 31) + AnonymousClass000.A07(this.second)) * 31) + C18310x6.A07(this.third);
    }

    public AnonymousClass3Z1(Object obj, Object obj2, Object obj3) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('(');
        A0o.append(this.first);
        A0o.append(", ");
        A0o.append(this.second);
        A0o.append(", ");
        return C18260x0.A04(this.third, A0o);
    }
}
