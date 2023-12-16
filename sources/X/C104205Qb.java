package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Qb  reason: invalid class name and case insensitive filesystem */
public class C104205Qb {
    public final C69263Wi A00;
    public final AnonymousClass2PU A01;
    public final C105405Uu A02;
    public final AnonymousClass7KH A03;
    public final AnonymousClass5UJ A04;
    public final AnonymousClass1VX A05;
    public final Map A06 = AnonymousClass001.A0t();

    public void A00(AnonymousClass08M r9, C60852zH r10) {
        Map map = this.A06;
        C111935iv r2 = (C111935iv) map.get(r10);
        if (r2 == null) {
            r2 = new C111935iv(this.A00, this.A02, this.A03, r10.A01, r10.A04);
            map.put(r10, r2);
        }
        r2.A02 = r9;
        C64543Dx r1 = new C64543Dx(r2.A01);
        r1.A02 = r2.A00();
        r2.A02.A0H(r1);
    }

    public void A01(C60852zH r19) {
        C64543Dx r0;
        int ceil;
        ArrayList A0s;
        Map map = this.A06;
        C60852zH r3 = r19;
        C111935iv r9 = (C111935iv) map.get(r3);
        if (r9 == null) {
            r9 = new C111935iv(this.A00, this.A02, this.A03, r3.A01, r3.A04);
            map.put(r3, r9);
        }
        int i = r9.A01;
        int i2 = 0;
        if (i != 0) {
            if (i != 5) {
                int i3 = r9.A00;
                List list = r9.A07;
                if (i3 < list.size()) {
                    AnonymousClass7KH r7 = r9.A05;
                    int size = list.size();
                    boolean A1T = AnonymousClass000.A1T(r9.A00);
                    float f = (float) AnonymousClass000.A0B(r7.A01.A00).heightPixels;
                    float f2 = r7.A00;
                    if (f < f2) {
                        ceil = 1;
                    } else {
                        ceil = (int) Math.ceil((double) (f / f2));
                    }
                    if (!A1T || size >= ceil * 3) {
                        size = ceil * 2;
                    }
                    int min = Math.min(r7.A02.A0N(464), size);
                    int i4 = r9.A00;
                    int min2 = Math.min(list.size(), r9.A00 + min);
                    if (i4 > min2) {
                        A0s = AnonymousClass001.A0s();
                    } else {
                        List subList = list.subList(i4, min2);
                        r9.A00 += min;
                        A0s = AnonymousClass001.A0s();
                        Iterator it = subList.iterator();
                        while (it.hasNext()) {
                            String A0m = AnonymousClass001.A0m(it);
                            if (r9.A04.A08((UserJid) null, A0m) == null) {
                                A0s.add(A0m);
                            }
                        }
                    }
                    if (!A0s.isEmpty()) {
                        C60852zH r32 = new C60852zH(r3.A00, r3.A01, r3.A03, r3.A02, A0s);
                        if (this.A05.A0X(1096)) {
                            this.A04.A01(r32, r9);
                            return;
                        }
                        AnonymousClass2PU r1 = this.A01;
                        C106665Zw r10 = new C106665Zw(1);
                        UserJid userJid = r32.A01;
                        String str = r32.A03;
                        String str2 = r32.A02;
                        List list2 = r32.A04;
                        C64333Db r12 = r1.A01.A00.A01;
                        C90204gt r6 = new C90204gt(C64333Db.A01(r12), C86624Kv.A0K(r12), r9, r10, userJid, (C105915Wx) r12.AG3.get(), C64333Db.A5u(r12), (C40662Hg) r12.A2R.get(), str, str2, list2);
                        C90244gx.A00(r6.A01, r6);
                        return;
                    } else if (r9.A00 < list.size()) {
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        r0 = new C64543Dx(1);
                        r0.A02 = A0s2;
                        r9.Bh3(r0);
                    }
                }
            }
            i2 = 5;
        }
        r0 = new C64543Dx(i2);
        r9.Bh3(r0);
    }

    public C104205Qb(C69263Wi r2, AnonymousClass2PU r3, C105405Uu r4, AnonymousClass5UJ r5, C54292oU r6, AnonymousClass1VX r7) {
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = new AnonymousClass7KH(r6, r7);
        this.A04 = r5;
        this.A05 = r7;
        this.A01 = r3;
    }
}
