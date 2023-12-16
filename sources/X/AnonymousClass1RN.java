package X;

import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1RN  reason: invalid class name */
public class AnonymousClass1RN extends C56702sQ {
    public List A00;
    public final C60972zT A01;
    public final C45932ao A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public void A04() {
        long j;
        if (this.A06) {
            j = SystemClock.uptimeMillis();
        } else {
            j = 0;
        }
        super.A04();
        A0B(-1, j);
    }

    public final void A0A(int i, Object obj) {
        String obj2;
        if (this.A06) {
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj.toString();
            }
            List list = this.A00;
            if (list == null) {
                list = AnonymousClass001.A0s();
                this.A00 = list;
            }
            int i2 = i - 1;
            if (i2 >= list.size()) {
                List list2 = this.A00;
                list2.addAll(Collections.nCopies((i2 - list2.size()) + 1, (Object) null));
            }
            this.A00.set(i2, obj2);
        }
    }

    public final void A0B(long j, long j2) {
        String[] strArr;
        C60972zT r2 = this.A01;
        String str = this.A03;
        String str2 = this.A05;
        r2.A03(str, 7, str2);
        if (this.A06) {
            C45932ao r22 = this.A02;
            String str3 = this.A04;
            List list = this.A00;
            if (list == null) {
                strArr = null;
            } else {
                strArr = (String[]) list.toArray(new String[0]);
            }
            r22.A00(new AnonymousClass1S8(str2, str3, strArr, j, C18310x6.A0A(j2)));
        }
    }

    public AnonymousClass1RN(SQLiteStatement sQLiteStatement, C60972zT r2, C45932ao r3, String str, String str2, String str3, boolean z) {
        super(sQLiteStatement);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = z;
    }

    public void A02() {
        super.A02();
        this.A00 = null;
    }

    public void A03() {
        super.A03();
        this.A00 = null;
    }

    public void A05(int i) {
        super.A05(i);
        A0A(i, (Object) null);
    }

    public void A06(int i, long j) {
        super.A06(i, j);
        A0A(i, Long.valueOf(j));
    }

    public void A07(int i, String str) {
        super.A07(i, str);
        A0A(i, str);
    }

    public void A08(int i, byte[] bArr) {
        super.A08(i, bArr);
        A0A(i, bArr);
    }

    public void A09(String[] strArr) {
        super.A09(strArr);
        int length = strArr.length;
        while (length != 0) {
            int i = length - 1;
            A0A(length, strArr[i]);
            length = i;
        }
    }
}
