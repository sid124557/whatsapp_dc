package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0nJ  reason: invalid class name and case insensitive filesystem */
public final class C13520nJ implements Iterator, Map.Entry {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final /* synthetic */ AnonymousClass0UU A03;

    public C13520nJ(AnonymousClass0UU r2) {
        this.A03 = r2;
        this.A00 = r2.A01() - 1;
        this.A01 = -1;
    }

    public boolean equals(Object obj) {
        if (!this.A02) {
            throw AnonymousClass001.A0e("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AnonymousClass0UU r3 = this.A03;
            Object A032 = r3.A03(this.A01, 0);
            if (key != A032 && (key == null || !key.equals(A032))) {
                return false;
            }
            Object value = entry.getValue();
            Object A033 = r3.A03(this.A01, 1);
            if (value == A033 || (value != null && value.equals(A033))) {
                return true;
            }
            return false;
        }
    }

    public Object getKey() {
        if (this.A02) {
            return this.A03.A03(this.A01, 0);
        }
        throw AnonymousClass001.A0e("This container does not support retaining Map.Entry objects");
    }

    public Object getValue() {
        if (this.A02) {
            return this.A03.A03(this.A01, 1);
        }
        throw AnonymousClass001.A0e("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A01, this.A00);
    }

    public int hashCode() {
        if (this.A02) {
            AnonymousClass0UU r4 = this.A03;
            int i = this.A01;
            int i2 = 0;
            Object A032 = r4.A03(i, 0);
            Object A033 = r4.A03(i, 1);
            int A07 = AnonymousClass000.A07(A032);
            if (A033 != null) {
                i2 = A033.hashCode();
            }
            return A07 ^ i2;
        }
        throw AnonymousClass001.A0e("This container does not support retaining Map.Entry objects");
    }

    public void remove() {
        if (this.A02) {
            this.A03.A05(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    public Object setValue(Object obj) {
        if (this.A02) {
            AnonymousClass0UU r1 = this.A03;
            int i = this.A01;
            C17540vk r12 = (C17540vk) r1;
            if (r12.A01 != 0) {
                throw AnonymousClass002.A0G("not a map");
            }
            int i2 = (i << 1) + 1;
            Object[] objArr = ((C06290Wz) r12.A00).A02;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        throw AnonymousClass001.A0e("This container does not support retaining Map.Entry objects");
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(getKey());
        A0o.append("=");
        return AnonymousClass000.A0R(getValue(), A0o);
    }
}
