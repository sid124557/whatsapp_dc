package X;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6bb  reason: invalid class name and case insensitive filesystem */
public final class C130216bb extends AnonymousClass8T6<Long> implements Internal.LongList, RandomAccess, C178988iQ {
    public static final C130216bb A02;
    public int A00;
    public long[] A01;

    static {
        C130216bb r0 = new C130216bb(new long[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C130216bb)) {
                return super.equals(obj);
            }
            C130216bb r11 = (C130216bb) obj;
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

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = AnonymousClass0x2.A00(i * 31, this.A01[i2]);
        }
        return i;
    }

    public final void A01(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
        }
    }

    public /* bridge */ /* synthetic */ C188248ya BLN(int i) {
        if (i >= this.A00) {
            return new C130216bb(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long A0B = C18310x6.A0B(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0B) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int size() {
        return this.A00;
    }

    public C130216bb(long[] jArr, int i) {
        this.A01 = jArr;
        this.A00 = i;
    }

    public void A02(long j) {
        A00();
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

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long A0B = C18310x6.A0B(obj);
        A00();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
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

    public boolean addAll(Collection collection) {
        A00();
        collection.getClass();
        if (!(collection instanceof C130216bb)) {
            return super.addAll(collection);
        }
        C130216bb r7 = (C130216bb) collection;
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

    public boolean contains(Object obj) {
        return AnonymousClass6C7.A1Z(obj, this);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        A01(i);
        return Long.valueOf(this.A01[i]);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A00();
        A01(i);
        long[] jArr = this.A01;
        long j = jArr[i];
        AnonymousClass6C7.A15(jArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public void removeRange(int i, int i2) {
        A00();
        if (i2 >= i) {
            long[] jArr = this.A01;
            System.arraycopy(jArr, i2, jArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long A0B = C18310x6.A0B(obj);
        A00();
        A01(i);
        long[] jArr = this.A01;
        long j = jArr[i];
        jArr[i] = A0B;
        return Long.valueOf(j);
    }

    public C130216bb() {
        this(new long[10], 0);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        A02(C18310x6.A0B(obj));
        return true;
    }
}
