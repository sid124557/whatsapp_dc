package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6Vg  reason: invalid class name and case insensitive filesystem */
public final class C128226Vg extends AnonymousClass8T2<Float> implements C188228yY<Float>, RandomAccess {
    public static final C128226Vg A02;
    public int A00;
    public float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C128226Vg)) {
                return super.equals(obj);
            }
            C128226Vg r8 = (C128226Vg) obj;
            int i = this.A00;
            if (i == r8.A00) {
                float[] fArr = r8.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (this.A01[i2] == fArr[i2]) {
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

    static {
        C128226Vg r1 = new C128226Vg();
        A02 = r1;
        r1.A00 = false;
    }

    public final /* synthetic */ C188228yY BuC(int i) {
        if (i >= this.A00) {
            return new C128226Vg(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Float.valueOf(this.A01[i]);
        }
        throw AnonymousClass6C7.A0X(i, this.A00);
    }

    public final int size() {
        return this.A00;
    }

    public C128226Vg(float[] fArr, int i) {
        this.A01 = fArr;
        this.A00 = i;
    }

    public final void A03(int i, float f) {
        int i2;
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        float[] fArr = this.A01;
        if (i2 < fArr.length) {
            AnonymousClass6C7.A16(fArr, i, i2);
        } else {
            float[] A1X = AnonymousClass6C8.A1X(fArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1X, i + 1, this.A00 - i);
            this.A01 = A1X;
        }
        this.A01[i] = f;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A03(i, AnonymousClass001.A05(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof C128226Vg)) {
            return super.addAll(collection);
        }
        C128226Vg r7 = (C128226Vg) collection;
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

    public final boolean remove(Object obj) {
        A02();
        for (int i = 0; i < this.A00; i++) {
            if (obj.equals(Float.valueOf(this.A01[i]))) {
                float[] fArr = this.A01;
                System.arraycopy(fArr, i + 1, fArr, i, this.A00 - i);
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
            float[] fArr = this.A01;
            System.arraycopy(fArr, i2, fArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float A05 = AnonymousClass001.A05(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        float[] fArr = this.A01;
        float f = fArr[i];
        fArr[i] = A05;
        return Float.valueOf(f);
    }

    public C128226Vg() {
        this(new float[10], 0);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2;
        A02();
        if (i < 0 || i >= (i2 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        float[] fArr = this.A01;
        float f = fArr[i];
        AnonymousClass8T2.A01(fArr, i2, i);
        this.A00--;
        this.modCount++;
        return Float.valueOf(f);
    }
}
