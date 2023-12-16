package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.3ft  reason: invalid class name and case insensitive filesystem */
public final class C73673ft<T> extends C73683fu<T> implements RandomAccess {
    public int A00;
    public int A01;
    public final int A02;
    public final Object[] A03;

    public C73673ft(Object[] objArr, int i) {
        C162457s7.A0J(objArr, 1);
        this.A03 = objArr;
        if (i >= 0) {
            int length = objArr.length;
            if (i <= length) {
                this.A02 = length;
                this.A00 = i;
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ring buffer filled size: ");
            A0o.append(i);
            throw AnonymousClass000.A0G(" cannot be larger than the buffer size: ", A0o, length);
        }
        throw AnonymousClass000.A0G("ring buffer filled size should not be negative but it is ", AnonymousClass001.A0o(), i);
    }

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            C162457s7.A0D(objArr);
        }
        int size = size();
        int i = this.A01;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.A02) {
            objArr[i3] = this.A03[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = this.A03[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public final void A02(int i) {
        if (i < 0) {
            throw AnonymousClass000.A0G("n shouldn't be negative but it is ", AnonymousClass001.A0o(), i);
        } else if (i > size()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("n shouldn't be greater than the buffer size: n = ");
            A0o.append(i);
            A0o.append(", size = ");
            throw AnonymousClass001.A0c(AnonymousClass000.A0h(A0o, size()));
        } else if (i > 0) {
            int i2 = this.A01;
            int i3 = this.A02;
            int i4 = (i2 + i) % i3;
            if (i2 > i4) {
                Object[] objArr = this.A03;
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(this.A03, i2, i4, (Object) null);
            }
            this.A01 = i4;
            this.A00 = size() - i;
        }
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
