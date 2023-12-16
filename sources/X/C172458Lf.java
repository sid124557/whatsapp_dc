package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.8Lf  reason: invalid class name and case insensitive filesystem */
public final class C172458Lf implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass6KG A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C172458Lf.class != obj.getClass()) {
                return false;
            }
            C172458Lf r5 = (C172458Lf) obj;
            if (!(this.A05 == r5.A05 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A04 == r5.A04 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A00 */
    public int compareTo(C172458Lf r5) {
        int i;
        int i2 = this.A05;
        int i3 = r5.A05;
        if (i2 == i3) {
            int i4 = this.A03;
            int i5 = r5.A03;
            if (i4 == i5 && (i4 = this.A02) == (i5 = r5.A02)) {
                if (this.A06.A0N) {
                    i4 = r5.A00;
                    i5 = this.A00;
                } else {
                    int i6 = 1;
                    if (i2 != 1) {
                        i6 = -1;
                    }
                    int i7 = this.A01;
                    int i8 = r5.A01;
                    if (i7 == i8 && (i7 = this.A04) == (i8 = r5.A04)) {
                        i7 = this.A00;
                        i8 = r5.A00;
                    }
                    if (i7 > i8) {
                        i = 1;
                    } else {
                        i = 0;
                        if (i8 > i7) {
                            i = -1;
                        }
                    }
                    return i6 * i;
                }
            }
            if (i4 > i5) {
                return 1;
            }
            if (i5 > i4) {
                return -1;
            }
            return 0;
        } else if (i2 > i3) {
            return 1;
        } else {
            if (i3 > i2) {
                return -1;
            }
            return 0;
        }
    }

    public int hashCode() {
        return (((((((((this.A05 * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + this.A04) * 31) + this.A00;
    }

    public C172458Lf(C166637z1 r8, AnonymousClass6KG r9, int i) {
        int i2;
        this.A06 = r9;
        int i3 = 0;
        this.A05 = AnonymousClass6C8.A1O(i) ? 1 : 0;
        int i4 = 0;
        while (true) {
            List list = r9.A0I;
            if (i4 >= list.size()) {
                i2 = 0;
                break;
            }
            String A0n = AnonymousClass001.A0n(list, i4);
            if (!TextUtils.isEmpty(A0n) && A0n.equals(r8.A0R)) {
                i2 = 4;
                break;
            }
            A0n = (TextUtils.isEmpty(A0n) || TextUtils.equals(A0n, "und")) ? null : A0n;
            String str = r8.A0R;
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und") && str != null && A0n != null) {
                if (str.startsWith(A0n) || A0n.startsWith(str)) {
                    i2 = 3;
                } else if (str.split("-", 2)[0].equals(A0n.split("-", 2)[0])) {
                    i2 = 2;
                    break;
                }
            }
            i4++;
        }
        i2 = 3;
        this.A03 = i2;
        this.A02 = (r8.A0G & 1) != 0 ? 1 : i3;
        this.A01 = r8.A05;
        this.A04 = r8.A0F;
        this.A00 = r8.A04;
    }
}
