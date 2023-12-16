package X;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6ba  reason: invalid class name and case insensitive filesystem */
public final class C130206ba extends AnonymousClass8T6<Float> implements Internal.FloatList, RandomAccess, C178988iQ {
    public static final C130206ba A02;
    public int A00;
    public float[] A01;

    static {
        C130206ba r0 = new C130206ba(new float[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C130206ba)) {
                return super.equals(obj);
            }
            C130206ba r8 = (C130206ba) obj;
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

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.A01[i2]);
        }
        return i;
    }

    public final void A02(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
        }
    }

    public /* bridge */ /* synthetic */ C188248ya BLN(int i) {
        if (i >= this.A00) {
            return new C130206ba(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float A05 = AnonymousClass001.A05(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A05) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int size() {
        return this.A00;
    }

    public C130206ba(float[] fArr, int i) {
        this.A01 = fArr;
        this.A00 = i;
    }

    public void A01(float f) {
        A00();
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

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float A05 = AnonymousClass001.A05(obj);
        A00();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
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

    public boolean addAll(Collection collection) {
        A00();
        collection.getClass();
        if (!(collection instanceof C130206ba)) {
            return super.addAll(collection);
        }
        C130206ba r7 = (C130206ba) collection;
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

    public boolean contains(Object obj) {
        return AnonymousClass6C7.A1Z(obj, this);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        A02(i);
        return Float.valueOf(this.A01[i]);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A00();
        A02(i);
        float[] fArr = this.A01;
        float f = fArr[i];
        AnonymousClass6C7.A15(fArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public void removeRange(int i, int i2) {
        A00();
        if (i2 >= i) {
            float[] fArr = this.A01;
            System.arraycopy(fArr, i2, fArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float A05 = AnonymousClass001.A05(obj);
        A00();
        A02(i);
        float[] fArr = this.A01;
        float f = fArr[i];
        fArr[i] = A05;
        return Float.valueOf(f);
    }

    public C130206ba() {
        this(new float[10], 0);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        A01(AnonymousClass001.A05(obj));
        return true;
    }
}
