package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2zV  reason: invalid class name and case insensitive filesystem */
public class C60992zV {
    public final C56972sr A00;
    public final C66663Mh A01;
    public final C64773Ex A02;
    public final C56422rx A03;
    public final C57162tC A04;
    public final C56982ss A05;
    public final C56112rR A06;
    public final AnonymousClass1VX A07;

    public boolean A02(int i) {
        String A062;
        ArrayList arrayList;
        if (i >= 0) {
            if (i == 0) {
                return true;
            }
            C66663Mh r2 = this.A01;
            synchronized (C66663Mh.class) {
                A062 = r2.A06(C66663Mh.A24);
            }
            String str = C58152un.A06;
            if (A062 == null) {
                A062 = str;
            }
            try {
                arrayList = AnonymousClass001.A0s();
                for (String valueOf : C18320x8.A1b(A062)) {
                    arrayList.add(Integer.valueOf(valueOf));
                }
            } catch (Exception unused) {
                arrayList = AnonymousClass001.A0s();
                for (String valueOf2 : C18320x8.A1b(str)) {
                    arrayList.add(Integer.valueOf(valueOf2));
                }
            }
            if (arrayList.contains(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A00(C56422rx r2, C56982ss r3, C56112rR r4, C624134x r5) {
        AnonymousClass2z0 r0 = r5.A1J;
        C95814uZ r1 = r0.A00;
        if (r0.A02 || !(r1 instanceof PhoneUserJid) || r2.A03((UserJid) r1) || (r5 instanceof C30311mF) || (r5 instanceof C30521ma) || C56982ss.A00(r3, r1) != null || r5.A05 != 0 || !r4.A07()) {
            return false;
        }
        return true;
    }

    public int A01(C624134x r8) {
        AnonymousClass39W r4;
        AnonymousClass39P r0;
        if (AnonymousClass001.A1W(AnonymousClass352.A00(this.A02, this.A05, AnonymousClass2z0.A00(r8)))) {
            Long l = r8.A0q;
            if (r8.A05 <= 0 && ((l == null || l.longValue() <= 0) && (r8 instanceof C30791n7) && (r4 = ((C30791n7) r8).A00) != null && this.A07.A0Y(C58422vE.A02, 3240) && (r0 = r4.A03) != null && r0.A03.size() == 1)) {
                String str = ((AnonymousClass395) r4.A03.A03.get(0)).A01.A00;
                if ("review_and_pay".equals(str) || "review_order".equals(str) || "payment_method".equals(str) || "payment_status".equals(str)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final boolean A03(C95814uZ r7, AnonymousClass3Z2 r8, Long l, int i, long j) {
        if (!(r7 instanceof UserJid)) {
            return false;
        }
        if (r8 == null) {
            return true;
        }
        if (i == r8.expiration || l == null) {
            return false;
        }
        long longValue = l.longValue();
        if (longValue > j) {
            return false;
        }
        long j2 = r8.ephemeralSettingTimestamp;
        if (longValue == j2) {
            UserJid A042 = AnonymousClass32Y.A04(r7);
            PhoneUserJid A043 = C56972sr.A04(this.A00);
            if (A043 == null || A042.compareTo((Jid) A043) >= 0) {
                return false;
            }
            return true;
        } else if (longValue > j2) {
            return true;
        } else {
            return false;
        }
    }

    public C60992zV(C56972sr r1, C66663Mh r2, C64773Ex r3, C56422rx r4, C57162tC r5, C56982ss r6, C56112rR r7, AnonymousClass1VX r8) {
        this.A07 = r8;
        this.A00 = r1;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
    }
}
