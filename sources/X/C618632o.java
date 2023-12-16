package X;

import android.database.Cursor;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.32o  reason: invalid class name and case insensitive filesystem */
public class C618632o {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56982ss A02;
    public final C66543Lv A03;
    public final C56892sj A04;
    public final C623334p A05;
    public final C72303dV A06;
    public final C54572ow A07;
    public final C56662sM A08;
    public final AnonymousClass2W7 A09;
    public final C66443Ll A0A;
    public final AnonymousClass1VX A0B;
    public final C59882xe A0C;
    public final JniBridge A0D;
    public final Object A0E = AnonymousClass002.A0D();

    public static void A00(C30451mT r9, C30591mh r10) {
        ArrayList A0J;
        List list = r9.A05;
        List list2 = r10.A06;
        if (list2.size() == 0) {
            A0J = AnonymousClass001.A0s();
        } else {
            HashSet A0K = AnonymousClass002.A0K();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C60142y4 A0Z = AnonymousClass0x9.A0Z(it);
                if (list2.contains(Long.valueOf(A0Z.A01)) && A0Z.A01 != -1) {
                    A0K.add(A0Z.A02);
                }
            }
            A0J = AnonymousClass002.A0J(A0K);
        }
        r10.A01 = A0J;
        r10.A05 = r9.A1a;
    }

    public final C30591mh A02(C95814uZ r14, C624134x r15, boolean z) {
        long j;
        Cursor A032;
        long j2 = r15.A1L;
        if (r14 != null) {
            j = this.A05.A05(r14);
        } else {
            j = -1;
        }
        AnonymousClass4GK A033 = this.A06.get();
        try {
            C66443Ll r5 = this.A0A;
            A032 = r5.A03(A033, (byte) 67, j2, j, z);
            if (A032.moveToNext()) {
                HashMap A002 = AnonymousClass26E.A00(A032, (byte) 67);
                C30331mH A052 = r5.A05(A032, A002);
                if (!(A052 instanceof C30591mh)) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "MessageAddOnPollVoteManager/getMessageAddOnPollVoteForMessageAndSender unexpected fmessage ", A052);
                } else {
                    C30591mh r2 = (C30591mh) A052;
                    r2.A1y(A032, this.A05, A002);
                    C30331mH.A02(this, r2);
                    C30331mH.A04(r15, r2);
                    A032.close();
                    A033.close();
                    return r2;
                }
            }
            A032.close();
            A033.close();
            return null;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C618632o(C55682qk r2, C56972sr r3, C56982ss r4, C66543Lv r5, C56892sj r6, C623334p r7, C72303dV r8, C54572ow r9, C56662sM r10, AnonymousClass2W7 r11, C66443Ll r12, AnonymousClass1VX r13, C59882xe r14, JniBridge jniBridge) {
        this.A0B = r13;
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A0D = jniBridge;
        this.A08 = r10;
        this.A07 = r9;
        this.A0A = r12;
        this.A06 = r8;
        this.A0C = r14;
        this.A03 = r5;
        this.A04 = r6;
        this.A09 = r11;
    }

    public static void A01(C30451mT r7, List list, List list2, List list3) {
        if (AnonymousClass2z0.A0C(r7)) {
            HashSet A0K = AnonymousClass002.A0K();
            HashSet A0K2 = AnonymousClass002.A0K();
            for (Object next : list2) {
                if (list3 == null || !list3.contains(next)) {
                    A0K.add(next);
                }
            }
            if (list3 != null) {
                for (Object next2 : list3) {
                    if (!list2.contains(next2)) {
                        A0K2.add(next2);
                    }
                }
            }
            Iterator it = r7.A05.iterator();
            while (it.hasNext()) {
                C60142y4 A0Z = AnonymousClass0x9.A0Z(it);
                if (A0K.contains(Long.valueOf(A0Z.A01))) {
                    A0Z.A00++;
                }
                if (A0K2.contains(Long.valueOf(A0Z.A01))) {
                    A0Z.A00--;
                }
            }
            r7.A04 = null;
            r7.A1v(list);
            return;
        }
        r7.A04 = list;
        Iterator it2 = r7.A05.iterator();
        while (it2.hasNext()) {
            C60142y4 A0Z2 = AnonymousClass0x9.A0Z(it2);
            Iterator it3 = list.iterator();
            int i = 0;
            while (it3.hasNext()) {
                if (((C30591mh) ((C30331mH) it3.next())).A06.contains(Long.valueOf(A0Z2.A01))) {
                    i++;
                }
            }
            A0Z2.A00 = i;
        }
    }
}
