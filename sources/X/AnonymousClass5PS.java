package X;

import java.util.Iterator;

/* renamed from: X.5PS  reason: invalid class name */
public class AnonymousClass5PS {
    public final C183538qC A00;

    public void A00(int i, int i2) {
        Iterator A0j = AnonymousClass0x2.A0j(this.A00);
        while (A0j.hasNext()) {
            C111525iE r2 = (C111525iE) A0j.next();
            r2.A00 = i;
            r2.A04.A00 = Integer.valueOf(i);
            if (i2 == 3 || i2 == 5 || i2 == 7) {
                r2.A00();
            }
        }
    }

    public void A01(Double d, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        Iterator A0j = AnonymousClass0x2.A0j(this.A00);
        while (A0j.hasNext()) {
            ((C111525iE) A0j.next()).A05(d, num, str, str2, str3, str4, str5, str6, i, i2);
        }
    }

    public AnonymousClass5PS(C183538qC r1) {
        this.A00 = r1;
    }
}
