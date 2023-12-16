package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6V7  reason: invalid class name */
public final class AnonymousClass6V7 extends AnonymousClass8T0 implements C188218yX, C178498hd, RandomAccess {
    public static final AnonymousClass6V7 A02;
    public int A00;
    public float[] A01;

    static {
        AnonymousClass6V7 r0 = new AnonymousClass6V7(new float[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass6V7)) {
                return super.equals(obj);
            }
            AnonymousClass6V7 r8 = (AnonymousClass6V7) obj;
            int i = this.A00;
            if (i == r8.A00) {
                float[] fArr = r8.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (Float.floatToIntBits(this.A01[i2]) == Float.floatToIntBits(fArr[i2])) {
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
            i = (i * 31) + Float.floatToIntBits(this.A01[i2]);
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ C188218yX Btt(int i) {
        if (i >= this.A00) {
            return new AnonymousClass6V7(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Float.valueOf(this.A01[i]);
        }
        throw AnonymousClass8T0.A01(i, this.A00);
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float A05 = AnonymousClass001.A05(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == A05) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public AnonymousClass6V7(float[] fArr, int i) {
        this.A01 = fArr;
        this.A00 = i;
    }

    public final void A03(float f) {
        A02();
        int i = this.A00;
        float[] fArr = this.A01;
        if (i == fArr.length) {
            fArr = AnonymousClass6C8.A1X(fArr, i * 3, i);
            this.A01 = fArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        fArr[i2] = f;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float A05 = AnonymousClass001.A05(obj);
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        float[] fArr = this.A01;
        if (i2 < fArr.length) {
            AnonymousClass6C7.A16(fArr, i, i2);
        } else {
            float[] A1X = AnonymousClass6C8.A1X(fArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1X, i + 1, this.A00 - i);
            this.A01 = A1X;
        }
        this.A01[i] = A05;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof AnonymousClass6V7)) {
            return super.addAll(collection);
        }
        AnonymousClass6V7 r7 = (AnonymousClass6V7) collection;
        int i = r7.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.A01;
            if (i3 > fArr.length) {
                fArr = Arrays.copyOf(fArr, i3);
                this.A01 = fArr;
            }
            System.arraycopy(r7.A01, 0, fArr, this.A00, r7.A00);
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
        float[] fArr = this.A01;
        float f = fArr[i];
        AnonymousClass6C7.A15(fArr, i2, i);
        this.A00--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        A02();
        if (i2 >= i) {
            float[] fArr = this.A01;
            System.arraycopy(fArr, i2, fArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float A05 = AnonymousClass001.A05(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        float[] fArr = this.A01;
        float f = fArr[i];
        fArr[i] = A05;
        return Float.valueOf(f);
    }

    public AnonymousClass6V7() {
        this(new float[10], 0);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A03(AnonymousClass001.A05(obj));
        return true;
    }
}
