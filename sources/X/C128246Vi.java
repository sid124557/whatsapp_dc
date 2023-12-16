package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6Vi  reason: invalid class name and case insensitive filesystem */
public final class C128246Vi extends AnonymousClass8T2<Long> implements C188228yY<Long>, RandomAccess {
    public static final C128246Vi A02;
    public int A00;
    public long[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C128246Vi)) {
                return super.equals(obj);
            }
            C128246Vi r11 = (C128246Vi) obj;
            int i = this.A00;
            if (i == r11.A00) {
                long[] jArr = r11.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (this.A01[i2] == jArr[i2]) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = AnonymousClass0x2.A00(i * 31, this.A01[i2]);
        }
        return i;
    }

    static {
        C128246Vi r1 = new C128246Vi();
        A02 = r1;
        r1.A00 = false;
    }

    public final void A03(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
    }

    public final /* synthetic */ C188228yY BuC(int i) {
        if (i >= this.A00) {
            return new C128246Vi(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final int size() {
        return this.A00;
    }

    public C128246Vi(long[] jArr, int i) {
        this.A01 = jArr;
        this.A00 = i;
    }

    public final void A04(int i, long j) {
        int i2;
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        long[] jArr = this.A01;
        if (i2 < jArr.length) {
            AnonymousClass6C7.A16(jArr, i, i2);
        } else {
            long[] A1Z = AnonymousClass6C8.A1Z(jArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1Z, i + 1, this.A00 - i);
            this.A01 = A1Z;
        }
        this.A01[i] = j;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A04(i, C18310x6.A0B(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof C128246Vi)) {
            return super.addAll(collection);
        }
        C128246Vi r7 = (C128246Vi) collection;
        int i = r7.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.A01;
            if (i3 > jArr.length) {
                jArr = Arrays.copyOf(jArr, i3);
                this.A01 = jArr;
            }
            System.arraycopy(r7.A01, 0, jArr, this.A00, r7.A00);
            this.A00 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ Object get(int i) {
        A03(i);
        return Long.valueOf(this.A01[i]);
    }

    public final boolean remove(Object obj) {
        A02();
        for (int i = 0; i < this.A00; i++) {
            if (obj.equals(Long.valueOf(this.A01[i]))) {
                long[] jArr = this.A01;
                System.arraycopy(jArr, i + 1, jArr, i, this.A00 - i);
                this.A00--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        A02();
        if (i2 >= i) {
            long[] jArr = this.A01;
            System.arraycopy(jArr, i2, jArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long A0B = C18310x6.A0B(obj);
        A02();
        A03(i);
        long[] jArr = this.A01;
        long j = jArr[i];
        jArr[i] = A0B;
        return Long.valueOf(j);
    }

    public C128246Vi() {
        this(new long[10], 0);
    }

    public final /* synthetic */ Object remove(int i) {
        A02();
        A03(i);
        long[] jArr = this.A01;
        long j = jArr[i];
        AnonymousClass8T2.A01(jArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Long.valueOf(j);
    }
}
