package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6V9  reason: invalid class name */
public final class AnonymousClass6V9 extends AnonymousClass8T0 implements C188218yX, C178498hd, RandomAccess {
    public static final AnonymousClass6V9 A02;
    public int A00;
    public long[] A01;

    static {
        AnonymousClass6V9 r0 = new AnonymousClass6V9(new long[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass6V9)) {
                return super.equals(obj);
            }
            AnonymousClass6V9 r11 = (AnonymousClass6V9) obj;
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

    public final /* bridge */ /* synthetic */ C188218yX Btt(int i) {
        if (i >= this.A00) {
            return new AnonymousClass6V9(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Long.valueOf(this.A01[i]);
        }
        throw AnonymousClass8T0.A01(i, this.A00);
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long A0B = C18310x6.A0B(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == A0B) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public AnonymousClass6V9(long[] jArr, int i) {
        this.A01 = jArr;
        this.A00 = i;
    }

    public final void A03(long j) {
        A02();
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            jArr = AnonymousClass6C8.A1Z(jArr, i * 3, i);
            this.A01 = jArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr[i2] = j;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long A0B = C18310x6.A0B(obj);
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        long[] jArr = this.A01;
        if (i2 < jArr.length) {
            AnonymousClass6C7.A16(jArr, i, i2);
        } else {
            long[] A1Z = AnonymousClass6C8.A1Z(jArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1Z, i + 1, this.A00 - i);
            this.A01 = A1Z;
        }
        this.A01[i] = A0B;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof AnonymousClass6V9)) {
            return super.addAll(collection);
        }
        AnonymousClass6V9 r7 = (AnonymousClass6V9) collection;
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

    public final boolean contains(Object obj) {
        return AnonymousClass6C7.A1Z(obj, this);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        A02();
        if (i < 0 || i >= (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        long[] jArr = this.A01;
        long j = jArr[i];
        AnonymousClass6C7.A15(jArr, i2, i);
        this.A00--;
        this.modCount++;
        return Long.valueOf(j);
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

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long A0B = C18310x6.A0B(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        long[] jArr = this.A01;
        long j = jArr[i];
        jArr[i] = A0B;
        return Long.valueOf(j);
    }

    public AnonymousClass6V9() {
        this(new long[10], 0);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A03(C18310x6.A0B(obj));
        return true;
    }
}
