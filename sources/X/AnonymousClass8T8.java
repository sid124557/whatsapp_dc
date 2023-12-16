package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.8T8  reason: invalid class name */
public class AnonymousClass8T8 extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final int[] array;
    public final int end;
    public final int start;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass8T8)) {
                return super.equals(obj);
            }
            AnonymousClass8T8 r8 = (AnonymousClass8T8) obj;
            int size = size();
            if (r8.size() == size) {
                int i = 0;
                while (i < size) {
                    if (this.array[this.start + i] == r8.array[r8.start + i]) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.array;
            int A0K = AnonymousClass001.A0K(obj);
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (iArr[i] != A0K) {
                    i++;
                } else if (i == -1) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.array;
            int A0K = AnonymousClass001.A0K(obj);
            int i = this.start;
            int i2 = this.end;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                } else if (iArr[i3] == A0K) {
                    int i4 = i3 - i;
                    if (i3 < 0) {
                        return -1;
                    }
                    return i4;
                } else {
                    i3++;
                }
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.array;
            int A0K = AnonymousClass001.A0K(obj);
            int i = this.start;
            int i2 = this.end;
            while (true) {
                i2--;
                if (i2 < i) {
                    break;
                } else if (iArr[i2] == A0K) {
                    int i3 = i2 - i;
                    if (i2 < 0) {
                        return -1;
                    }
                    return i3;
                }
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Number number = (Number) obj;
        C162187rP.A01(i, size());
        int[] iArr = this.array;
        int i2 = this.start + i;
        int i3 = iArr[i2];
        number.getClass();
        iArr[i2] = number.intValue();
        return Integer.valueOf(i3);
    }

    public int size() {
        return this.end - this.start;
    }

    public AnonymousClass8T8(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        C162187rP.A01(i, size());
        return Integer.valueOf(this.array[this.start + i]);
    }

    public List subList(int i, int i2) {
        C162187rP.A03(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.array;
        int i3 = this.start;
        return new AnonymousClass8T8(iArr, i + i3, i3 + i2);
    }

    public String toString() {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(size() * 5);
        A0Y.append('[');
        int[] iArr = this.array;
        int i = this.start;
        while (true) {
            A0Y.append(iArr[i]);
            i++;
            if (i >= this.end) {
                return AnonymousClass0x2.A0f(A0Y);
            }
            AnonymousClass001.A1M(A0Y);
        }
    }
}
