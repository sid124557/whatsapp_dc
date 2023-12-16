package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5P6  reason: invalid class name */
public class AnonymousClass5P6 {
    public UserJid A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;

    public static AnonymousClass5P6 A00(C105145Tt r2) {
        AnonymousClass5P6 r1 = new AnonymousClass5P6();
        r1.A0A = r2.A02;
        r1.A05 = Integer.valueOf(r2.A0C.get());
        return r1;
    }

    public static void A04(AnonymousClass5P6 r2, C105145Tt r3) {
        r2.A0D = r3.A00;
        r2.A0E = r3.A01;
        r2.A09 = Long.valueOf((long) r3.A0D.getAndIncrement());
    }

    public void A06(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        if (bool != bool2) {
            bool2 = null;
        }
        this.A02 = bool2;
    }

    public static void A01(C06270Wx r2, AnonymousClass5P6 r3) {
        List list = (List) r2.A07();
        boolean z = false;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C152217Ya) it.next()).A02.A0B != null) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        r3.A06(Boolean.valueOf(z));
    }

    public static void A02(AnonymousClass5P6 r1, int i) {
        r1.A06 = Integer.valueOf(i);
    }

    public static void A03(AnonymousClass5P6 r1, int i) {
        r1.A04 = Integer.valueOf(i);
    }

    public static void A05(AnonymousClass5P6 r1, C105145Tt r2, int i) {
        r1.A05 = Integer.valueOf(i);
        r1.A0D = r2.A00;
        r1.A0E = r2.A01;
    }
}
