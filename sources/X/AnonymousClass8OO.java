package X;

import java.util.Map;

/* renamed from: X.8OO  reason: invalid class name */
public class AnonymousClass8OO implements Map.Entry, Comparable {
    public Object A00;
    public final Comparable A01;
    public final /* synthetic */ AnonymousClass8TC A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.A01;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.A00;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass8OO(AnonymousClass8TC r1, Comparable comparable, Object obj) {
        this.A02 = r1;
        this.A01 = comparable;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.compareTo(((AnonymousClass8OO) obj).A01);
    }

    public /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public Object getValue() {
        return this.A00;
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A01) ^ C18310x6.A07(this.A00);
    }

    public Object setValue(Object obj) {
        this.A02.A05();
        Object obj2 = this.A00;
        this.A00 = obj;
        return obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append("=");
        return AnonymousClass000.A0R(this.A00, A0o);
    }
}
