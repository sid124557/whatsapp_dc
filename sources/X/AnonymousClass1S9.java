package X;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.1S9  reason: invalid class name */
public class AnonymousClass1S9 extends C46712c5 {
    public final ContentValues A00;
    public final String A01;
    public final String[] A02;

    public AnonymousClass1S9(ContentValues contentValues, String str, String str2, String str3, String[] strArr, int i, long j, long j2) {
        super(str, str2, i, j, j2);
        this.A00 = contentValues;
        this.A01 = str3;
        this.A02 = strArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1S9 r5 = (AnonymousClass1S9) obj;
            if (!AnonymousClass75J.A00(this.A03, r5.A03) || !AnonymousClass75J.A00(this.A04, r5.A04) || !AnonymousClass75J.A00(Integer.valueOf(this.A00), Integer.valueOf(r5.A00)) || !AnonymousClass75J.A00(this.A00, r5.A00) || !AnonymousClass75J.A00(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A03;
        objArr[1] = this.A04;
        AnonymousClass000.A1N(objArr, this.A00);
        objArr[3] = this.A00;
        return (C18310x6.A08(this.A01, objArr, 4) * 31) + Arrays.hashCode(this.A02);
    }

    public static String A00(ContentValues contentValues, String str, String str2) {
        int i;
        String str3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("INSERT");
        A0o.append(str2);
        A0o.append(" INTO ");
        A0o.append(str);
        A0o.append('(');
        int i2 = 0;
        if (contentValues != null) {
            i = contentValues.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            Object[] objArr = new Object[i];
            Iterator it = new TreeSet(contentValues.keySet()).iterator();
            int i3 = 0;
            while (true) {
                str3 = ", ";
                if (!it.hasNext()) {
                    break;
                }
                String A0m = AnonymousClass001.A0m(it);
                if (i3 <= 0) {
                    str3 = "";
                }
                A0o.append(str3);
                A0o.append(A0m);
                objArr[i3] = "?";
                i3++;
            }
            A0o.append(')');
            A0o.append(" VALUES (");
            loop1:
            while (true) {
                Object obj = objArr[i2];
                while (true) {
                    A0o.append(obj);
                    i2++;
                    if (i2 >= i) {
                        break loop1;
                    } else if (i2 > 0) {
                        obj = AnonymousClass000.A0R(objArr[i2], AnonymousClass000.A0l(str3));
                    }
                }
            }
        }
        return AnonymousClass001.A0j(A0o, ')');
    }
}
