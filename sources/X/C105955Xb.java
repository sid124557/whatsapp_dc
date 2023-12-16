package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5Xb  reason: invalid class name and case insensitive filesystem */
public class C105955Xb {
    public AnonymousClass08M A00;
    public AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C111525iE A03;
    public final C111545iG A04;
    public final AnonymousClass7WI A05;
    public final C105085Tn A06;
    public final C64773Ex A07;
    public final C56612sH A08;
    public final C105355Up A09;
    public final AnonymousClass4FS A0A;

    public static /* synthetic */ void A00(C1223664c r7, C105955Xb r8, int i, int i2, boolean z) {
        List A0h;
        Integer A0l;
        Integer num = null;
        if (z) {
            A0h = null;
        } else {
            A0h = C86644Kx.A0h(r8.A00);
        }
        C111545iG r4 = r8.A04;
        Integer A032 = r8.A06.A03();
        Integer valueOf = Integer.valueOf(i2);
        if (A0h == null) {
            A0l = null;
        } else {
            A0l = AnonymousClass0x9.A0l(A0h);
            num = Integer.valueOf(A0h.indexOf(r7) + 1);
        }
        LinkedHashMap A0r = C18320x8.A0r();
        if (A0l != null) {
            A0r.put("recent_search_count", Integer.valueOf(A0l.intValue()));
        }
        if (num != null) {
            A0r.put("position", Integer.valueOf(num.intValue()));
        }
        r4.A09(A032, valueOf, A0r, 1, i, 1);
    }

    public void A02(C1223664c r8) {
        AnonymousClass7WI r5 = this.A05;
        List A002 = r5.A00();
        boolean z = false;
        for (int i = 0; i < A002.size(); i++) {
            if (A002.get(i).equals(r8)) {
                A002.set(i, r8);
                z = true;
            }
        }
        if (!z) {
            A002.add(r8);
        }
        Collections.sort(A002, r5.A01);
        AnonymousClass5QW r3 = r5.A00;
        C18290x4.A1M(r3.A04, r3, A002.subList(0, C86654Ky.A06(A002, 50)), 39);
        this.A00.A0H(r5.A00());
    }

    public void A03(C1223664c r6) {
        AnonymousClass7WI r4 = this.A05;
        List A002 = r4.A00();
        A002.remove(r6);
        AnonymousClass5QW r2 = r4.A00;
        C18290x4.A1M(r2.A04, r2, A002, 39);
        this.A00.A0H(r4.A00());
    }

    public C105955Xb(C111525iE r4, C111545iG r5, AnonymousClass5QW r6, C105085Tn r7, C64773Ex r8, C56612sH r9, C105355Up r10, AnonymousClass4FS r11) {
        this.A08 = r9;
        this.A0A = r11;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = new AnonymousClass7WI(r6);
        this.A00 = AnonymousClass08M.A01();
        this.A0A.BkM(new C117125rQ(this, 32));
    }

    public List A01(List list, boolean z) {
        C136156lw r1;
        ArrayList A0s = AnonymousClass001.A0s();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1223664c r6 = (C1223664c) it.next();
                boolean z2 = z;
                if (r6 instanceof C109025dx) {
                    C109025dx r62 = (C109025dx) r6;
                    r1 = new C136156lw(new AnonymousClass69J(r62, this, 1, !z), r62.A01, z2);
                } else if (r6 instanceof C109035dy) {
                    C109035dy r63 = (C109035dy) r6;
                    try {
                        C64773Ex r12 = this.A07;
                        String str = r63.A03;
                        C95814uZ A042 = C106405Yw.A04(str);
                        C626936e.A06(A042);
                        AnonymousClass3ZH A072 = r12.A07(A042);
                        if (A072 != null) {
                            A0s.add(new C96364wF(new AnonymousClass7HA(r63, this), A072, r63.A01, str, AnonymousClass0x2.A0i(C18320x8.A1b(r63.A02))));
                        }
                    } catch (AnonymousClass24P e) {
                        Log.i("DirectoryRecentSearchDelegate/createRecentSearchListDirectoryRecentSearchDelegates: one of the business profiles could not be loaded", e);
                    }
                } else if (r6 instanceof C109045dz) {
                    C109045dz r64 = (C109045dz) r6;
                    r1 = new C136156lw(new AnonymousClass69J(r64, this, 0, !z), r64.A02, r64.A03, z2);
                } else {
                    Log.i("DirectoryRecentSearchDelegate/createRecentSearchListItems: one of the recent searches is of unknown type");
                }
                A0s.add(r1);
            }
        }
        return A0s;
    }
}
