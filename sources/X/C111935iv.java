package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5iv  reason: invalid class name and case insensitive filesystem */
public class C111935iv implements C181788nK {
    public int A00;
    public int A01 = 4;
    public AnonymousClass08M A02;
    public final C69263Wi A03;
    public final C105405Uu A04;
    public final AnonymousClass7KH A05;
    public final UserJid A06;
    public final List A07;

    public void Bh3(C64543Dx r5) {
        this.A01 = r5.A00;
        List list = r5.A02;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A04.A0E(C86664Kz.A12(it), this.A06);
            }
        }
        r5.A02 = A00();
        this.A03.A0S(new C117165rU(this, 43, r5));
    }

    public C111935iv(C69263Wi r2, C105405Uu r3, AnonymousClass7KH r4, UserJid userJid, List list) {
        this.A03 = r2;
        this.A06 = userJid;
        this.A07 = list;
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = 0;
    }

    public final List A00() {
        C633238u r0;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            C109015dw A08 = this.A04.A08((UserJid) null, AnonymousClass001.A0m(it));
            if (A08 != null && (r0 = A08.A01) != null && r0.A00 == 0 && !A08.A08) {
                A0s.add(A08);
            }
        }
        return A0s;
    }
}
