package X;

import java.util.Map;

/* renamed from: X.0nL  reason: invalid class name and case insensitive filesystem */
public class C13540nL implements Map.Entry {
    public C13540nL A00;
    public C13540nL A01;
    public final Object A02;
    public final Object A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13540nL)) {
            return false;
        }
        C13540nL r4 = (C13540nL) obj;
        return this.A02.equals(r4.A02) && this.A03.equals(r4.A03);
    }

    public Object getKey() {
        return this.A02;
    }

    public Object getValue() {
        return this.A03;
    }

    public int hashCode() {
        return this.A02.hashCode() ^ this.A03.hashCode();
    }

    public Object setValue(Object obj) {
        throw AnonymousClass002.A0G("An entry modification is not supported");
    }

    public C13540nL(Object obj, Object obj2) {
        this.A02 = obj;
        this.A03 = obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        A0o.append("=");
        return AnonymousClass000.A0R(this.A03, A0o);
    }
}
