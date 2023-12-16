package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5R3  reason: invalid class name */
public final class AnonymousClass5R3 {
    public UserJid A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C56612sH A04;
    public final UserJid A05;
    public final Integer A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D = C18320x8.A0r();

    public AnonymousClass5R3(C56612sH r2, UserJid userJid, Integer num, String str, List list, List list2, List list3, Map map, Map map2, int i, long j, long j2) {
        C162457s7.A0J(map2, 11);
        this.A05 = userJid;
        this.A04 = r2;
        this.A02 = j;
        this.A03 = j2;
        this.A06 = num;
        this.A01 = i;
        this.A0A = list;
        this.A09 = list2;
        this.A08 = list3;
        this.A0C = map;
        this.A0B = map2;
        this.A07 = str;
    }

    public final int A00(UserJid userJid) {
        if (userJid == AnonymousClass1fY.A00) {
            return 4;
        }
        Iterator it = this.A09.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!userJid.equals(C86664Kz.A19(it).A0A)) {
                i2++;
            } else if (i2 >= 0) {
                return 2;
            }
        }
        Iterator it2 = this.A08.iterator();
        while (it2.hasNext()) {
            if (!userJid.equals(C86664Kz.A19(it2).A0A)) {
                i++;
            } else if (i < 0) {
                return 1;
            } else {
                return 3;
            }
        }
        return 1;
    }

    public final boolean A01(C624134x r10) {
        long A0H = this.A04.A0H();
        Map map = this.A0B;
        AnonymousClass2z0 r5 = r10.A1J;
        Number A0q = AnonymousClass0x9.A0q(r5, map);
        if (A0q != null && A0H - A0q.longValue() <= 60000) {
            return false;
        }
        C162457s7.A0C(r5);
        map.put(r5, Long.valueOf(A0H));
        return true;
    }
}
