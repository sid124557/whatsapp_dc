package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5rw  reason: invalid class name and case insensitive filesystem */
public final class C117445rw implements Runnable {
    public AnonymousClass7KG A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C109015dw A02;
    public final /* synthetic */ C104325Qn A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C117445rw(C109015dw r1, C104325Qn r2, UserJid userJid, String str, String str2, String str3, long j) {
        this.A01 = j;
        this.A03 = r2;
        this.A04 = userJid;
        this.A02 = r1;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
    }

    public void run() {
        C105145Tt r11;
        AnonymousClass5P6 r10;
        String str;
        Integer num;
        Long l;
        C108755dV r12;
        long j;
        C108665dM r0;
        List list;
        List list2;
        String str2;
        Integer num2;
        Long l2;
        String str3;
        Integer num3;
        Long l3;
        long j2 = this.A01;
        Boolean bool = null;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        C104325Qn r6 = this.A03;
        if (i == 0) {
            AnonymousClass5UW r02 = r6.A05;
            UserJid userJid = this.A04;
            C109015dw r112 = this.A02;
            String str4 = r112.A0F;
            C162457s7.A0C(str4);
            r02.A07(userJid, str4);
            C105145Tt r5 = r6.A06;
            AnonymousClass5P6 r4 = new AnonymousClass5P6();
            AnonymousClass7KG r1 = this.A00;
            if (r1 != null) {
                str3 = r1.A02;
            } else {
                str3 = null;
            }
            r4.A0A = str3;
            if (r1 != null) {
                num3 = Integer.valueOf(r1.A00);
            } else {
                num3 = null;
            }
            r4.A05 = num3;
            r4.A0D = r5.A00;
            r4.A0E = r5.A01;
            if (r1 != null) {
                l3 = Long.valueOf(r1.A01);
            } else {
                l3 = null;
            }
            r4.A09 = l3;
            AnonymousClass5P6.A02(r4, 30);
            AnonymousClass5P6.A03(r4, 54);
            if (r112.A0B != null) {
                bool = Boolean.TRUE;
            }
            r4.A06(bool);
            r4.A0G = str4;
            r4.A00 = userJid;
            r4.A08 = Long.valueOf(j2);
            r4.A0C = this.A06;
            r4.A0H = this.A07;
            r4.A0B = this.A05;
            r5.A03(r4);
        } else {
            AnonymousClass5UW r52 = r6.A05;
            UserJid userJid2 = this.A04;
            C109015dw r14 = this.A02;
            String str5 = r14.A0F;
            C162457s7.A0C(str5);
            C152217Ya A032 = r52.A03(userJid2, str5);
            if (A032 == null) {
                A032 = new C152217Ya(r14, 1, 1);
                r11 = r6.A06;
                r10 = new AnonymousClass5P6();
                AnonymousClass7KG r13 = this.A00;
                if (r13 != null) {
                    str2 = r13.A02;
                } else {
                    str2 = null;
                }
                r10.A0A = str2;
                if (r13 != null) {
                    num2 = Integer.valueOf(r13.A00);
                } else {
                    num2 = null;
                }
                r10.A05 = num2;
                r10.A0D = r11.A00;
                r10.A0E = r11.A01;
                if (r13 != null) {
                    l2 = Long.valueOf(r13.A01);
                } else {
                    l2 = null;
                }
                r10.A09 = l2;
                AnonymousClass5P6.A02(r10, 28);
                AnonymousClass5P6.A03(r10, 49);
                r10.A0G = str5;
                r12 = r14.A0B;
                if (r12 != null) {
                    bool = Boolean.TRUE;
                }
                r10.A06(bool);
                r10.A00 = userJid2;
                j2 = A032.A00;
            } else {
                A032.A00 = j2;
                r11 = r6.A06;
                r10 = new AnonymousClass5P6();
                AnonymousClass7KG r15 = this.A00;
                if (r15 != null) {
                    str = r15.A02;
                } else {
                    str = null;
                }
                r10.A0A = str;
                if (r15 != null) {
                    num = Integer.valueOf(r15.A00);
                } else {
                    num = null;
                }
                r10.A05 = num;
                r10.A0D = r11.A00;
                r10.A0E = r11.A01;
                if (r15 != null) {
                    l = Long.valueOf(r15.A01);
                } else {
                    l = null;
                }
                r10.A09 = l;
                AnonymousClass5P6.A02(r10, 29);
                AnonymousClass5P6.A03(r10, 53);
                r12 = r14.A0B;
                if (r12 != null) {
                    bool = Boolean.TRUE;
                }
                r10.A06(bool);
                r10.A0G = str5;
                r10.A00 = userJid2;
            }
            r10.A08 = Long.valueOf(j2);
            r10.A0C = this.A06;
            r10.A0H = this.A07;
            r10.A0B = this.A05;
            r11.A03(r10);
            if (r12 != null) {
                C108665dM r03 = r12.A00;
                if (r03 == null || (list2 = r03.A00) == null || list2.isEmpty()) {
                    j = A032.A01;
                } else {
                    ArrayList A0J = AnonymousClass002.A0J((Collection) r52.A04(r6.A07).get());
                    C73743g0.A0Z(A0J, new C175238Xp(r14), true);
                    A0J.add(A032);
                    j = AnonymousClass5A1.A00(r14, A0J);
                }
            } else {
                j = A032.A00;
            }
            A032.A01 = j;
            r52.A05(A032, userJid2);
            if (!(r12 == null || (r0 = r12.A00) == null || (list = r0.A00) == null || list.isEmpty())) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    C86624Kv.A1Q(next, A0s, C162457s7.A0P(((C166027y1) next).A00, str5) ? 1 : 0);
                }
                ArrayList A0d = C73783g4.A0d(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    A0d.add(((C166027y1) it.next()).A00);
                }
                UserJid userJid3 = r6.A07;
                ArrayList A0J2 = AnonymousClass002.A0J((Collection) r52.A04(userJid3).get());
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it2 = A0J2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (A0d.contains(((C152217Ya) next2).A02.A0F)) {
                        A0s2.add(next2);
                    }
                }
                ArrayList A0d2 = C73783g4.A0d(A0s2);
                Iterator it3 = A0s2.iterator();
                while (it3.hasNext()) {
                    C152217Ya A0J3 = AnonymousClass4L0.A0J(it3);
                    A0J3.A01 = A032.A01;
                    A0d2.add(A0J3);
                }
                Iterator it4 = A0d2.iterator();
                while (it4.hasNext()) {
                    C152217Ya A0J4 = AnonymousClass4L0.A0J(it4);
                    C162457s7.A0H(A0J4);
                    r52.A05(A0J4, userJid3);
                }
            }
        }
        r6.A00();
    }
}
