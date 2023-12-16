package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Us  reason: invalid class name and case insensitive filesystem */
public class C105385Us {
    public final int A00;
    public final AnonymousClass08M A01;
    public final AnonymousClass08M A02;
    public final AnonymousClass08M A03;
    public final AnonymousClass08M A04;
    public final AnonymousClass08M A05 = C18330xA.A01(C18290x4.A0Z());
    public final AnonymousClass08M A06;
    public final C56422rx A07;
    public final C48952fk A08;
    public final C106105Xq A09;
    public final C988953q A0A;
    public final List A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final int A01() {
        AnonymousClass08M r6 = this.A01;
        Iterator it = C86644Kx.A0h(r6).iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if ((A0P instanceof UserJid) && this.A07.A03((UserJid) A0P)) {
                return 0;
            }
        }
        int i = this.A00;
        if (i == 35 || i == 38 || i == 37 || AnonymousClass000.A1W(C627336j.A03(C86664Kz.A1P(r6))) || C627336j.A0N(C86664Kz.A1P(r6))) {
            return 0;
        }
        AnonymousClass08M r3 = this.A03;
        if (C86614Ku.A06(r3) != 1) {
            return 0;
        }
        if (0 < C86614Ku.A06(r3)) {
            byte A022 = this.A0A.A02(this.A09.A00((Uri) C86634Kw.A0w(r3, 0)));
            if (A022 == 13 || A022 == 29) {
                return 0;
            }
        }
        if (i == 40) {
            return 0;
        }
        Iterator it2 = C86644Kx.A0h(r6).iterator();
        while (it2.hasNext()) {
            C95814uZ A0P2 = C18300x5.A0P(it2);
            if (A0P2 instanceof UserJid) {
                C48952fk r0 = this.A08;
                UserJid userJid = (UserJid) A0P2;
                if (userJid != null && r0.A00(userJid)) {
                    return 0;
                }
            }
        }
        if (!(!this.A09.A00((Uri) C86634Kw.A0w(r3, 0)).A0J())) {
            return 1;
        }
        Number A0i = C86654Ky.A0i(this.A06);
        if (A0i == null || A0i.intValue() != 3) {
            return 2;
        }
        return 3;
    }

    public int A00() {
        int i;
        if ((this.A0D && C86634Kw.A1Y(this.A01)) || !this.A0G || (i = this.A00) == 35 || i == 38 || i == 37 || i == 40) {
            return 1;
        }
        return 0;
    }

    public Uri A02() {
        int A052 = C86604Kt.A05(this.A02);
        if (A052 < 0) {
            return null;
        }
        List list = this.A0C;
        if (A052 < list.size()) {
            return (Uri) list.get(A052);
        }
        return null;
    }

    public final void A03() {
        int A032;
        AnonymousClass08M r1 = this.A03;
        List list = this.A0C;
        r1.A0G(Collections.unmodifiableList(list));
        if (list.isEmpty()) {
            A032 = -1;
        } else {
            if (C86604Kt.A05(this.A02) >= list.size()) {
                A032 = AnonymousClass002.A03(list);
            }
            A05(A01());
        }
        AnonymousClass08M r12 = this.A02;
        if (C86604Kt.A05(r12) != A032) {
            C06270Wx.A03(r12, A032);
            A04(0);
        }
        A05(A01());
    }

    public void A04(int i) {
        AnonymousClass08M r1 = this.A05;
        if (i != C86604Kt.A05(r1)) {
            C06270Wx.A03(r1, i);
        }
    }

    public final void A05(int i) {
        AnonymousClass08M r1 = this.A06;
        if (i != C86604Kt.A05(r1)) {
            C06270Wx.A03(r1, i);
        }
    }

    public boolean A06() {
        AnonymousClass08M r2 = this.A03;
        if (C86614Ku.A06(r2) > 1 || (this.A0I && C86614Ku.A06(r2) == 1)) {
            return true;
        }
        return false;
    }

    public C105385Us(C56422rx r3, C48952fk r4, C108845de r5, C106105Xq r6, C988953q r7, List list, List list2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass08M A0E2;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0C = A0s;
        this.A0A = r7;
        this.A09 = r6;
        this.A08 = r4;
        this.A07 = r3;
        this.A00 = i3;
        A0s.addAll(list);
        this.A03 = C18330xA.A01(Collections.unmodifiableList(A0s));
        this.A02 = C18330xA.A01(Integer.valueOf(i));
        this.A01 = C18330xA.A01(Collections.unmodifiableList(list2));
        this.A0B = Collections.unmodifiableList(list2);
        if (i2 != -1) {
            A0E2 = C18330xA.A01(Integer.valueOf(i2));
        } else {
            A0E2 = AnonymousClass4L0.A0E();
        }
        this.A06 = A0E2;
        this.A0G = z2;
        this.A0F = z3;
        C06270Wx.A03(A0E2, A01());
        this.A0D = z;
        this.A04 = C18330xA.A01(r5);
        this.A0I = z4;
        this.A0H = z5;
        this.A0E = z6;
    }

    public boolean A07() {
        Uri A022 = A02();
        if (A022 == null || this.A0A.A02(this.A09.A00(A022)) != 1) {
            return false;
        }
        return true;
    }
}
