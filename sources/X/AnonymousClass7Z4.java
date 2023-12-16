package X;

import java.util.Arrays;

/* renamed from: X.7Z4  reason: invalid class name */
public class AnonymousClass7Z4 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final Throwable A03;

    public boolean equals(Object obj) {
        String str;
        String str2;
        Throwable th;
        Throwable th2;
        String str3;
        String str4;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass7Z4 r5 = (AnonymousClass7Z4) obj;
                if (this.A00 != r5.A00 || (((str = this.A01) != (str2 = r5.A01) && (str == null || !str.equals(str2))) || (((th = this.A03) != (th2 = r5.A03) && (th == null || !th.equals(th2))) || ((str3 = this.A02) != (str4 = r5.A02) && (str3 == null || !str3.equals(str4)))))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        AnonymousClass001.A1S(objArr, false);
        AnonymousClass000.A1O(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public AnonymousClass7Z4(C149207Ll r2) {
        this.A01 = r2.A01;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SoftError{mCategory='");
        char A012 = C18300x5.A01(this.A01, A0o);
        A0o.append(", mMessage='");
        A0o.append(this.A02);
        A0o.append(A012);
        A0o.append(", mCause=");
        A0o.append(this.A03);
        AnonymousClass6C8.A1F(A0o, ", mFailHarder=");
        A0o.append(", mSamplingFrequency=");
        A0o.append(this.A00);
        AnonymousClass6C8.A1F(A0o, ", mOnlyIfEmployeeOrBetaBuild=");
        return AnonymousClass000.A0d(A0o);
    }
}
