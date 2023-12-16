package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.34U  reason: invalid class name */
public class AnonymousClass34U {
    public final C56922sm A00;

    public static String A00(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("message_type");
        A0o.append(" NOT IN (");
        A0o.append(iArr[0]);
        for (int i = 1; i < length; i++) {
            C18320x8.A1K(A0o);
            A0o.append(iArr[i]);
        }
        return AnonymousClass000.A0e(A0o);
    }

    public static void A02(StringBuilder sb, boolean z) {
        String str;
        if (z) {
            sb.append(" AND sort_id < ?");
            str = " ORDER BY sort_id DESC";
        } else {
            sb.append(" AND sort_id > ?");
            str = " ORDER BY sort_id ASC";
        }
        sb.append(str);
    }

    public AnonymousClass34U(C56922sm r1) {
        this.A00 = r1;
    }

    public static void A01(StringBuilder sb, List list) {
        String str;
        if (list.isEmpty()) {
            str = " ";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(" AND message_type NOT IN ('");
            A0o.append(C18290x4.A0k(list));
            C18270x1.A1C("'", A0o, sb);
            for (int i = 1; i < list.size(); i++) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(", '");
                A0o2.append(list.get(i));
                C18270x1.A1C("'", A0o2, sb);
            }
            str = ") ";
        }
        sb.append(str);
    }

    public AnonymousClass0PJ A03(C624134x r11) {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        List A19 = r11.A19();
        if (A19 == null || A19.size() < r11.A0B) {
            C18280x3.A1K(A0s, r11.A0K);
            A0s.add(r11.A1J.A01);
            C18280x3.A1K(A0s, r11.A1L);
            str = " WHERE timestamp = ? AND from_me = 1 AND key_id = ? AND _id!=?";
        } else {
            A0s.add(r11.A1J.A01);
            C56922sm r9 = this.A00;
            HashMap A0t = AnonymousClass001.A0t();
            Iterator it = A19.iterator();
            while (it.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it);
                long A07 = r9.A07(A0P);
                if (A07 != -1) {
                    AnonymousClass0x2.A1J(A0P, A0t, A07);
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            str = AnonymousClass000.A0X(C57212tH.A00(AnonymousClass0x7.A0A(" WHERE from_me=1 AND key_id=? AND chat_row_id IN ", A0o, A0t)), A0o);
            Iterator A10 = C18290x4.A10(A0t);
            while (A10.hasNext()) {
                AnonymousClass0x7.A1D(A10.next(), A0s);
            }
        }
        return AnonymousClass0x9.A0G(str, A0s);
    }
}
