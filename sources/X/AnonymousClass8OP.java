package X;

import java.util.Map;

/* renamed from: X.8OP  reason: invalid class name */
public final class AnonymousClass8OP implements Map.Entry, C834348j {
    public final int A00;
    public final AnonymousClass8OR A01;

    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!C162457s7.A0P(entry.getKey(), getKey()) || !C162457s7.A0P(entry.getValue(), getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Object getKey() {
        return this.A01.keysArray[this.A00];
    }

    public Object getValue() {
        Object[] objArr = this.A01.valuesArray;
        C162457s7.A0H(objArr);
        return objArr[this.A00];
    }

    public Object setValue(Object obj) {
        AnonymousClass8OR r1 = this.A01;
        r1.A02();
        Object[] objArr = r1.valuesArray;
        if (objArr == null) {
            objArr = new Object[r1.keysArray.length];
            r1.valuesArray = objArr;
        }
        int i = this.A00;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public AnonymousClass8OP(AnonymousClass8OR r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public int hashCode() {
        int i = 0;
        int A04 = C18280x3.A04(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A04 ^ i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(getKey());
        A0o.append('=');
        return AnonymousClass000.A0R(getValue(), A0o);
    }
}
