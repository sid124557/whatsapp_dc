package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6Xp  reason: invalid class name and case insensitive filesystem */
public final class C128826Xp extends AnonymousClass8T4<Long> implements C188238yZ<Long>, C178638hr, RandomAccess {
    public static final C128826Xp A02;
    public int A00;
    public long[] A01;

    static {
        C128826Xp r0 = new C128826Xp(new long[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C128826Xp)) {
                return super.equals(obj);
            }
            C128826Xp r11 = (C128826Xp) obj;
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

    public final void A02(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
    }

    public final /* synthetic */ C188238yZ BtF(int i) {
        if (i >= this.A00) {
            return new C128826Xp(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final int indexOf(Object obj) {
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

    public final int size() {
        return this.A00;
    }

    public C128826Xp(long[] jArr, int i) {
        this.A01 = jArr;
        this.A00 = i;
    }

    public final void A03(long j) {
        A01();
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
        A01();
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
        this.A01[i] = A0B;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A01();
        collection.getClass();
        if (!(collection instanceof C128826Xp)) {
            return super.addAll(collection);
        }
        C128826Xp r7 = (C128826Xp) collection;
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

    public final /* synthetic */ Object get(int i) {
        A02(i);
        return Long.valueOf(this.A01[i]);
    }

    public final /* synthetic */ Object remove(int i) {
        A01();
        A02(i);
        long[] jArr = this.A01;
        long j = jArr[i];
        AnonymousClass6C7.A15(jArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        A01();
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
        A01();
        A02(i);
        long[] jArr = this.A01;
        long j = jArr[i];
        jArr[i] = A0B;
        return Long.valueOf(j);
    }

    public C128826Xp() {
        this(new long[10], 0);
    }

    public final /* synthetic */ boolean add(Object obj) {
        A03(C18310x6.A0B(obj));
        return true;
    }
}
