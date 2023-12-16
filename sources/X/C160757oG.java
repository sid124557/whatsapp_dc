package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.7oG  reason: invalid class name and case insensitive filesystem */
public class C160757oG {
    public final C154397d6 A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public void A04(String str) {
        AnonymousClass0x2.A18(A03((String) null, str));
    }

    public void A05(String str) {
        String obj = A03((String) null, str).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e((Throwable) null);
        } else {
            Log.e(obj);
        }
    }

    public void A06(String str) {
        A09((String) null, str, (AnonymousClass7I3[]) null);
    }

    public void A07(String str) {
        A03((String) null, str);
    }

    public void A0A(String str, Throwable th) {
        String obj = A03((String) null, str).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(obj);
        } else {
            Log.e(obj, th);
        }
    }

    public static C160757oG A00(String str, String str2, String str3) {
        return new C160757oG(new C154397d6(), str, str2, str3);
    }

    public String A02(String str) {
        return A03(this.A03, str).toString();
    }

    public C160757oG(C154397d6 r1, String str, String str2, String str3) {
        this.A00 = r1;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public static String A01(String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0w = C18290x4.A0w("PAY: ", A0o);
        A0w.append(" - ");
        A0w.append(str);
        C18270x1.A1C(":", A0w, A0o);
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass001.A1L(A0o2);
            C18270x1.A1C(str2, A0o2, A0o);
        }
        return A0o.toString();
    }

    public final StringBuilder A03(String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: ");
        String str3 = this.A02;
        if (!TextUtils.isEmpty(str3)) {
            A0o.append(String.format("[%s]", AnonymousClass000.A1b(str3)));
        }
        if (TextUtils.isEmpty(str)) {
            str = this.A03;
        }
        A0o.append(String.format("[%s]", AnonymousClass000.A1b(str)));
        A0o.append(" - ");
        C18290x4.A1R(A0o, this.A01);
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass001.A1L(A0o);
            A0o.append(str2);
        }
        return A0o;
    }

    public void A08(String str, String str2, Throwable th) {
        String obj = A03(str, str2).toString();
        if (TextUtils.isEmpty(obj)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(obj);
        } else {
            Log.e(obj, th);
        }
    }

    public void A09(String str, String str2, AnonymousClass7I3[] r8) {
        int length;
        StringBuilder A032 = A03(str, str2);
        if (r8 != null && (length = r8.length) > 0) {
            A032.append(" [");
            int i = 0;
            do {
                AnonymousClass7I3 r1 = r8[i];
                A032.append("{");
                A032.append(r1.A00);
                A032.append(" : ");
                A032.append(r1.A01);
                A032.append("}");
                if (i != length - 1) {
                    C18320x8.A1K(A032);
                }
                i++;
            } while (i < length);
            A032.append("]");
        }
        C18280x3.A14(A032);
    }
}
