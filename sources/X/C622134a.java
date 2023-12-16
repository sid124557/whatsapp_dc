package X;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.34a  reason: invalid class name and case insensitive filesystem */
public final class C622134a {
    public static final String[] A08;
    public static final String[] A09 = {"raw_contact_id", "display_name", "data1", "data2", "data3", "sort_key", "account_type", "starred"};
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (C622134a.class != obj.getClass()) {
            return false;
        }
        C622134a r7 = (C622134a) obj;
        return this.A01 == r7.A01 && TextUtils.equals(this.A03, r7.A03) && TextUtils.equals(this.A05, r7.A05) && this.A00 == r7.A00 && TextUtils.equals(this.A04, r7.A04) && TextUtils.equals(this.A06, r7.A06) && this.A07 == r7.A07;
    }

    public int hashCode() {
        long j = this.A01;
        return (((((((int) (j >>> 32)) * 31) + ((int) j)) * 31) + this.A00) * 31) + AnonymousClass0x7.A07(this.A05);
    }

    static {
        String[] A1Z = AnonymousClass0x9.A1Z();
        A1Z[0] = "com.whatsapp";
        A1Z[1] = "com.whatsapp.w4b";
        A08 = A1Z;
    }

    public C622134a(String str, String str2, String str3, String str4, String str5, int i, long j, boolean z) {
        if (str2 != null) {
            this.A01 = j;
            this.A03 = str;
            this.A05 = str2;
            this.A00 = i;
            this.A04 = str3;
            this.A06 = str4;
            this.A02 = str5;
            this.A07 = z;
            return;
        }
        throw AnonymousClass001.A0g("number must not be null");
    }

    public static Cursor A00(C620633i r5, String str) {
        Log.i("phone/getcursor/query/start");
        AnonymousClass5UR A0R = r5.A0R();
        if (A0R == null) {
            Log.w("phone/getcursor/cr null");
            return null;
        }
        Cursor A032 = A0R.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, A09, A01(), (String[]) null, (String) null);
        Log.i("phone/getcursor/query/end");
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A032 == null) {
            return A032;
        }
        A0o.append(str);
        A0o.append('/');
        C18260x0.A1G(A0o, A032.getCount());
        return A032;
    }

    public static String A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("(");
        A0o.append("account_type");
        A0o.append(" IS NULL OR (");
        A0o.append("account_type");
        A0o.append(" NOT IN (");
        int i = 0;
        while (true) {
            String[] strArr = A08;
            int length = strArr.length - 1;
            if (i < length) {
                DatabaseUtils.appendEscapedSQLString(A0o, strArr[i]);
                C18320x8.A1K(A0o);
                i++;
            } else {
                DatabaseUtils.appendEscapedSQLString(A0o, strArr[length]);
                C18260x0.A1L(A0o, ")))");
                return A0o.toString();
            }
        }
    }
}
