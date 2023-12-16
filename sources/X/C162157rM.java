package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7rM  reason: invalid class name and case insensitive filesystem */
public class C162157rM {
    public C115975pX A00;
    public AnonymousClass10k A01;
    public C34041u8 A02;
    public C185748uB A03;
    public List A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final AnonymousClass33p A07;
    public final C56872sh A08 = new AnonymousClass909(this, 2);
    public final C56872sh A09 = new AnonymousClass909(this, 1);
    public final C56872sh A0A = new AnonymousClass909(this, 3);
    public final C29361ih A0B;
    public final C56932sn A0C;
    public final C49252gE A0D;
    public final AnonymousClass4FS A0E;
    public final C183538qC A0F;
    public final HashMap A0G;
    public final HashMap A0H;
    public final HashSet A0I;

    public void A02() {
        C34041u8 r1 = this.A02;
        if (r1 != null) {
            r1.A0D(true);
        }
        C137806pI r2 = new C137806pI(this.A07, this.A0C, this.A0D, this, false);
        this.A02 = r2;
        this.A0E.BkL(r2, new Void[0]);
    }

    public final void A03() {
        if (this.A01 != null) {
            C34041u8 r1 = this.A02;
            if (r1 != null) {
                r1.A0D(true);
            }
            C137806pI r12 = new C137806pI(this.A07, this.A0C, this.A0D, this, true);
            this.A02 = r12;
            C18270x1.A0w(r12, this.A0E);
        }
    }

    public final void A04(String str, List list) {
        List list2 = list;
        this.A04 = list;
        C185748uB r0 = this.A03;
        if (r0 != null) {
            String str2 = str;
            r0.BnR(str2, this.A0H, this.A0G, this.A0I, list2);
        }
    }

    public static /* synthetic */ void A00(C162157rM r4, String str, List list) {
        HashSet hashSet = r4.A0I;
        hashSet.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C50612iT r1 = (C50612iT) it.next();
            if (r1.A0T) {
                hashSet.add(r1.A0G);
            }
        }
        if (str == null) {
            r4.A04((String) null, list);
        } else {
            r4.A04(str, list);
        }
    }

    public C162157rM(AnonymousClass33p r3, C29361ih r4, C56932sn r5, C49252gE r6, AnonymousClass4FS r7, C183538qC r8) {
        this.A0C = r5;
        this.A0E = r7;
        this.A0B = r4;
        this.A07 = r3;
        this.A0F = r8;
        this.A0I = AnonymousClass002.A0K();
        this.A0D = r6;
        this.A0H = AnonymousClass001.A0t();
        this.A0G = AnonymousClass001.A0t();
    }

    public List A01(List list, List list2) {
        HashSet A0K = AnonymousClass002.A0K();
        HashSet A0K2 = AnonymousClass002.A0K();
        ArrayList A0s = AnonymousClass001.A0s();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
                String str = A0b.A0A;
                if (!A0K2.contains(str)) {
                    if (!C107575bX.A0F(str)) {
                        A0K2.add(str);
                    }
                    A0s.add(A0b);
                    A0K.add(A0b.A0D);
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AnonymousClass39M A0b2 = AnonymousClass0x7.A0b(it2);
                String str2 = A0b2.A0A;
                if (!A0K2.contains(str2)) {
                    if (!C107575bX.A0F(str2)) {
                        A0K2.add(str2);
                    }
                    if (A0K.add(A0b2.A0D)) {
                        A0s.add(A0b2);
                    }
                }
            }
        }
        List<C50612iT> list3 = this.A04;
        if (list3 != null) {
            for (C50612iT r0 : list3) {
                Iterator it3 = r0.A05.iterator();
                while (it3.hasNext()) {
                    AnonymousClass39M A0b3 = AnonymousClass0x7.A0b(it3);
                    String str3 = A0b3.A0A;
                    if (!A0K2.contains(str3)) {
                        if (!C107575bX.A0F(str3)) {
                            A0K2.add(str3);
                        }
                        if (A0K.add(A0b3.A0D)) {
                            A0s.add(A0b3);
                        }
                    }
                }
            }
        }
        return A0s;
    }
}
