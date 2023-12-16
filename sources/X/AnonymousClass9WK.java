package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.9WK  reason: invalid class name */
public final class AnonymousClass9WK {
    public static final AnonymousClass9WK A05 = new AnonymousClass9WK((String) null, new Object[0], 0, 8);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final Object[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass9WK)) {
                return false;
            }
            AnonymousClass9WK r4 = (AnonymousClass9WK) obj;
            if (this.A01 != r4.A01 || this.A00 != r4.A00) {
                return false;
            }
            String str = this.A03;
            String str2 = r4.A03;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            String str3 = this.A02;
            String str4 = r4.A02;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (str4 == null || !str3.equals(str4)) {
                return false;
            }
            return Arrays.equals(this.A04, r4.A04);
        }
    }

    public String A00(Resources resources) {
        int i = this.A00;
        if (i != 0) {
            Object[] objArr = this.A04;
            if (objArr == null || objArr.length <= 0) {
                return resources.getString(i);
            }
            return resources.getString(i, objArr);
        }
        String str = this.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int i;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode() + 31;
        } else {
            i = 1;
        }
        String str2 = this.A02;
        if (str2 != null) {
            i = (i * 31) + str2.hashCode();
        }
        return ((((i * 31) + this.A00) * 31) + this.A01) | Arrays.hashCode(this.A04);
    }

    public AnonymousClass9WK(String str) {
        int A012 = C86614Ku.A01(TextUtils.isEmpty(str) ? 1 : 0);
        this.A03 = str;
        this.A00 = 0;
        this.A02 = null;
        this.A01 = A012;
        this.A04 = null;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TextConfiguration{text='");
        A0o.append(this.A03);
        A0o.append('\'');
        A0o.append(", textResId=");
        A0o.append(this.A00);
        A0o.append(", formatArgs=");
        A0o.append(Arrays.toString(this.A04));
        return AnonymousClass000.A0d(A0o);
    }

    public AnonymousClass9WK(String str, Object[] objArr, int i, int i2) {
        this.A03 = null;
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = objArr;
    }
}
