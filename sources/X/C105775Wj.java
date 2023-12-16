package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.5Wj  reason: invalid class name and case insensitive filesystem */
public class C105775Wj {
    public int A00;
    public int A01;
    public String A02 = "";
    public String A03;
    public String[] A04;
    public String[] A05;
    public final Locale A06;
    public final Locale A07;

    public final void A00() {
        ArrayList arrayList;
        Locale locale = this.A06;
        String A012 = C162307rf.A01(locale);
        Locale locale2 = this.A07;
        String A013 = C162307rf.A01(locale2);
        boolean equals = A012.equals(A013);
        try {
            String[] strArr = (String[]) AnonymousClass79V.A03.A01(this.A03);
            if (strArr == null) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A0I = AnonymousClass002.A0I(r2);
                for (String A002 : strArr) {
                    A0I.add(C154327cz.A00(A002));
                }
                arrayList = A0I;
            }
        } catch (IllegalArgumentException unused) {
            arrayList = Collections.emptyList();
        }
        if (!arrayList.isEmpty() || !equals) {
            int size = arrayList.size() + 2;
            ArrayList A0I2 = AnonymousClass002.A0I(size);
            ArrayList A0I3 = AnonymousClass002.A0I(size);
            A0I2.add(C154327cz.A01(locale2));
            A0I3.add(locale2.toLanguageTag());
            int i = -1;
            if (equals) {
                i = 0;
            }
            this.A00 = i;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                Locale forLanguageTag = Locale.forLanguageTag(A0m);
                String A014 = C162307rf.A01(forLanguageTag);
                if (!A014.equals(A013)) {
                    if (!C158117jS.A04.A00(C162307rf.A01(forLanguageTag))) {
                        C18260x0.A0s("whatsapplocaledata/getlanguagepreferencesdata/non-renderable language: ", A0m, AnonymousClass001.A0o());
                        stringBuffer.append(A0m);
                        stringBuffer.append(",");
                    } else {
                        A0I2.add(C154327cz.A01(forLanguageTag));
                        A0I3.add(forLanguageTag.toLanguageTag());
                        if (this.A00 == -1 && A014.equals(A012)) {
                            this.A00 = C86664Kz.A0M(A0I2);
                        }
                    }
                }
            }
            if (this.A00 == -1) {
                A0I2.add(C154327cz.A01(locale));
                A0I3.add(locale.toLanguageTag());
                this.A00 = C86664Kz.A0M(A0I2);
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(stringBuffer.length() - 1);
                this.A02 = stringBuffer.toString();
            }
            int size2 = A0I2.size();
            this.A01 = size2;
            if (size2 >= 2) {
                this.A04 = C18300x5.A1b(A0I2);
                this.A05 = C18300x5.A1b(A0I3);
                return;
            }
        }
        this.A01 = 0;
    }

    public C105775Wj(String str, Locale locale, Locale locale2) {
        this.A03 = str;
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }

    public C105775Wj(String str, String str2, Locale locale, Locale locale2) {
        String A012;
        if (!"1".equals(str) || str2.length() != 10 || !"55501".equals(str2.substring(3, 8))) {
            A012 = C106675Zy.A01(str, str2);
        } else {
            A012 = "QQ";
        }
        this.A03 = A012;
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }
}
