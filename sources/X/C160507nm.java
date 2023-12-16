package X;

import android.util.SparseArray;

/* renamed from: X.7nm  reason: invalid class name and case insensitive filesystem */
public class C160507nm {
    public final SparseArray A00;

    public static final int A00(String str) {
        char A002;
        char charAt;
        if (str == null || str.length() != 2 || 'A' > (A002 = AnonymousClass6C9.A00(str)) || A002 > 'Z' || 'A' > (charAt = str.charAt(1)) || charAt > 'Z') {
            return -1;
        }
        return ((A002 - 'A') * 26) + (charAt - 'A');
    }

    public C160507nm(int i) {
        this.A00 = new SparseArray(i);
    }

    public Object A01(String str) {
        int A002 = A00(str);
        if (A002 != -1) {
            return this.A00.get(A002);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Invalid country code \"");
        A0o.append(str);
        throw AnonymousClass000.A0F("\".", A0o);
    }

    public void A02(String str, Object obj) {
        int A002 = A00(str);
        if (A002 != -1) {
            this.A00.append(A002, obj);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Invalid country code \"");
        A0o.append(str);
        throw AnonymousClass000.A0F("\".", A0o);
    }

    public void A03(String str, Object obj) {
        int A002 = A00(str);
        if (A002 != -1) {
            this.A00.put(A002, obj);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Invalid country code \"");
        A0o.append(str);
        throw AnonymousClass000.A0F("\".", A0o);
    }

    public C160507nm() {
        this.A00 = AnonymousClass6CA.A0I();
    }
}
