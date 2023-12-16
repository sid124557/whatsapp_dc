package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.0QY  reason: invalid class name */
public class AnonymousClass0QY {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public C012109p A04;
    public C08510eb A05;
    public Object[] A06;
    public Object[] A07;
    public final Class A08;

    public final int A00(Object[] objArr) {
        int length = objArr.length;
        int i = 0;
        if (length != 0) {
            Arrays.sort(objArr, this.A05);
            i = 1;
            int i2 = 0;
            for (int i3 = 1; i3 < length; i3++) {
                Object obj = objArr[i3];
                if (this.A05.compare(objArr[i2], obj) == 0) {
                    int i4 = i2;
                    while (true) {
                        if (i4 >= i) {
                            break;
                        } else if (!this.A05.A02(objArr[i4], obj)) {
                            i4++;
                        } else if (i4 != -1) {
                            objArr[i4] = obj;
                        }
                    }
                    if (i != i3) {
                        objArr[i] = obj;
                    }
                    i++;
                } else {
                    if (i != i3) {
                        objArr[i] = obj;
                    }
                    i2 = i;
                    i++;
                }
            }
        }
        return i;
    }

    public AnonymousClass0QY(C08510eb r2, Class cls) {
        this.A08 = cls;
        this.A06 = (Object[]) Array.newInstance(cls, 10);
        this.A05 = r2;
    }

    public Object A01(int i) {
        int i2;
        int i3 = this.A03;
        if (i >= i3 || i < 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Asked to get item at ");
            A0o.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(" but size is ", A0o, i3));
        }
        Object[] objArr = this.A07;
        if (objArr == null || i < (i2 = this.A00)) {
            objArr = this.A06;
        } else {
            i = (i - i2) + this.A02;
        }
        return objArr[i];
    }

    public final void A03() {
        if (this.A07 != null) {
            throw AnonymousClass001.A0e("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void A04(Collection collection) {
        Class cls = this.A08;
        Object[] array = collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        A03();
        C08510eb r1 = this.A05;
        boolean z = r1 instanceof C012109p;
        boolean z2 = !z;
        if (z2) {
            A03();
            if (!z) {
                C012109p r0 = this.A04;
                if (r0 == null) {
                    r0 = new C012109p(r1);
                    this.A04 = r0;
                }
                this.A05 = r0;
            }
        }
        this.A02 = 0;
        this.A01 = this.A03;
        this.A07 = this.A06;
        this.A00 = 0;
        int A002 = A00(array);
        this.A06 = (Object[]) Array.newInstance(cls, A002);
        while (true) {
            int i = this.A00;
            if (i >= A002 && this.A02 >= this.A01) {
                break;
            }
            int i2 = this.A02;
            int i3 = this.A01;
            if (i2 >= i3) {
                int i4 = A002 - i;
                System.arraycopy(array, i, this.A06, i, i4);
                this.A00 += i4;
                this.A03 += i4;
                this.A05.BUd(i, i4);
                break;
            } else if (i >= A002) {
                int i5 = i3 - i2;
                this.A03 -= i5;
                this.A05.BZo(i, i5);
                break;
            } else {
                Object obj = this.A07[i2];
                Object obj2 = array[i];
                int compare = this.A05.compare(obj, obj2);
                if (compare < 0) {
                    this.A03--;
                    this.A02++;
                    this.A05.BZo(this.A00, 1);
                } else {
                    if (compare <= 0) {
                        if (!this.A05.A02(obj, obj2)) {
                            this.A03--;
                            this.A02++;
                            this.A05.BZo(this.A00, 1);
                        } else {
                            Object[] objArr = this.A06;
                            int i6 = this.A00;
                            objArr[i6] = obj2;
                            this.A02++;
                            this.A00 = i6 + 1;
                            if (!this.A05.A01(obj, obj2)) {
                                C08510eb r2 = this.A05;
                                r2.BOg(r2.A00(obj, obj2), this.A00 - 1, 1);
                            }
                        }
                    }
                    Object[] objArr2 = this.A06;
                    int i7 = this.A00;
                    objArr2[i7] = obj2;
                    int i8 = i7 + 1;
                    this.A00 = i8;
                    this.A03++;
                    this.A05.BUd(i8 - 1, 1);
                }
            }
        }
        this.A07 = null;
        if (z2) {
            A02();
        }
    }

    public void A02() {
        A03();
        C08510eb r1 = this.A05;
        if (r1 instanceof C012109p) {
            ((C012109p) r1).A00.A00();
        }
        C08510eb r12 = this.A05;
        C012109p r0 = this.A04;
        if (r12 == r0) {
            this.A05 = r0.A01;
        }
    }
}
