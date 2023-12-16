package X;

/* renamed from: X.0gi  reason: invalid class name and case insensitive filesystem */
public class C09760gi implements C16340sr {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public boolean BKq(C02420Gc r7, C01780Ce r8) {
        String str;
        int i;
        int i2;
        if (!this.A04 || this.A02 != null) {
            str = this.A02;
        } else {
            str = r8.A00();
        }
        C16810u0 r0 = r8.A00;
        if (r0 != null) {
            i2 = 0;
            i = 0;
            for (AnonymousClass0NJ r02 : r0.B5U()) {
                if (r02 == r8) {
                    i2 = i;
                }
                if (str == null || r02.A00().equals(str)) {
                    i++;
                }
            }
        } else {
            i2 = 0;
            i = 1;
        }
        int i3 = i - i2;
        if (this.A03) {
            i3 = i2 + 1;
        }
        int i4 = this.A00;
        int i5 = this.A01;
        if (i4 != 0) {
            int i6 = i3 - i5;
            if (i6 % i4 != 0) {
                return false;
            }
            i3 = Integer.signum(i6);
            if (i3 != 0) {
                i5 = Integer.signum(i4);
            }
            return true;
        }
        if (i3 == i5) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        Object[] objArr;
        String str2;
        if (this.A03) {
            str = "";
        } else {
            str = "last-";
        }
        if (this.A04) {
            objArr = new Object[4];
            objArr[0] = str;
            AnonymousClass000.A1P(objArr, this.A00, 1);
            AnonymousClass000.A1P(objArr, this.A01, 2);
            objArr[3] = this.A02;
            str2 = "nth-%schild(%dn%+d of type <%s>)";
        } else {
            objArr = new Object[3];
            objArr[0] = str;
            AnonymousClass000.A1P(objArr, this.A00, 1);
            AnonymousClass000.A1P(objArr, this.A01, 2);
            str2 = "nth-%schild(%dn%+d)";
        }
        return String.format(str2, objArr);
    }

    public C09760gi(String str, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
    }
}
