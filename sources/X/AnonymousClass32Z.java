package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.32Z  reason: invalid class name */
public final class AnonymousClass32Z {
    public static final AnonymousClass39M A00(C633438w r21) {
        C633438w r1 = r21;
        C162457s7.A0J(r1, 0);
        AnonymousClass39M r2 = new AnonymousClass39M((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, false, false, false, false, false);
        r2.A03 = r1.A02;
        r2.A02 = r1.A01;
        r2.A0G = r1.A07;
        r2.A00 = r1.A00;
        r2.A0C = r1.A05;
        r2.A07 = r1.A03;
        r2.A0D = r1.A04;
        r2.A05 = r1.A06;
        r2.A0I = r1.A08;
        return r2;
    }

    public final C50612iT A02(C633438w r26, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        AnonymousClass39M r8;
        String[] split;
        String str8 = str;
        if (r26 != null) {
            r8 = A00(r26);
            r8.A0F = str8;
            r8.A0J = true;
        } else {
            r8 = null;
        }
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0c.add(A00((C633438w) it.next()));
        }
        Iterator it2 = A0c.iterator();
        while (true) {
            String str9 = str2;
            String str10 = str4;
            if (it2.hasNext()) {
                AnonymousClass39M A0b = AnonymousClass0x7.A0b(it2);
                A0b.A0F = str8;
                A0b.A0J = true;
                String str11 = A0b.A07;
                C106655Zv[] r2 = null;
                if (!(str11 == null || (split = TextUtils.split(str11, " ")) == null)) {
                    ArrayList A0I = AnonymousClass002.A0I(r9);
                    for (String r1 : split) {
                        A0I.add(new C106655Zv(r1));
                    }
                    r2 = (C106655Zv[]) A0I.toArray(new C106655Zv[0]);
                }
                A0b.A04 = new AnonymousClass330(str8, str9, str10, (String) null, (String) null, A0b.A05, r2, true, false, true, false, A0b.A0I);
            } else {
                return A01(r8, str8, str9, str10, str3, str5, str6, str7, A0c);
            }
        }
    }

    public static final C50612iT A01(AnonymousClass39M r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C47652db r2 = new C47652db();
        r2.A0E = str;
        r2.A0G = str2;
        r2.A0I = str3;
        r2.A03 = str4;
        r2.A0F = "-1";
        r2.A0K = "-1";
        r2.A0L = "-1";
        int i = 0;
        r2.A0O = false;
        r2.A0P = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i += AnonymousClass0x7.A0b(it).A00;
        }
        r2.A01 = (long) i;
        r2.A0N = list;
        r2.A0R = true;
        r2.A0J = str5;
        r2.A0C = str6;
        r2.A0B = str7;
        r2.A02 = r4;
        return r2.A00();
    }
}
