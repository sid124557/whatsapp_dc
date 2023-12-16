package X;

import java.util.Map;

/* renamed from: X.8ON  reason: invalid class name */
public abstract class AnonymousClass8ON implements Map.Entry {
    public abstract Object getKey();

    public abstract Object getValue();

    public abstract Object setValue(Object obj);

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C1447372t.A00(getKey(), entry.getKey()) || !C1447372t.A00(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A07(getKey()) ^ C18310x6.A07(getValue());
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder A0o = AnonymousClass6C7.A0o(valueOf.length() + 1, valueOf2);
        A0o.append(valueOf);
        return AnonymousClass000.A0V("=", valueOf2, A0o);
    }
}
