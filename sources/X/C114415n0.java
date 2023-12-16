package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5n0  reason: invalid class name and case insensitive filesystem */
public class C114415n0 implements C184408rk {
    public final AnonymousClass5ZO A00;
    public final /* synthetic */ C112275jT A01;

    public C114415n0(AnonymousClass5ZO r1, C112275jT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSO(AnonymousClass7T4 r4, int i) {
        C149347Mc r2 = this.A01.A0G;
        if (r2 != null) {
            C149707No r1 = r2.A01;
            r1.A03 = null;
            r1.A04.clear();
            r1.A01 = 5;
            r1.A00 = i;
            r2.A00.A0H(r1);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass5TI r13 = (AnonymousClass5TI) obj;
        C112275jT r1 = this.A01;
        if (r1.A0G != null) {
            List list = r13.A09;
            AnonymousClass5ZZ.A03(this.A00, list);
            C149347Mc r7 = r1.A0G;
            C149707No r6 = r7.A01;
            r6.A03 = null;
            List list2 = r6.A04;
            list2.clear();
            r6.A02 = r13;
            List<C91824lC> list3 = r13.A07;
            if (list3.isEmpty()) {
                r6.A01 = 2;
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                for (C91824lC r9 : list3) {
                    A0s.add(new C96354wE(new AnonymousClass543(r9, 14, r7), r9.A03, r9.A01, false));
                }
                AnonymousClass4UC r92 = r7.A02.A00.A0V;
                if (r92.A07() != null && !list.isEmpty()) {
                    String A0F = AnonymousClass002.A0F(r7.A03.A00, ((C166447yh) r92.A07()).A01, new Object[1], 0, R.string.f11nameremoved);
                    A0s.add(new C135916lS());
                    A0s.add(new C96354wE(new C989453v(r7, 40), "", A0F, true));
                }
                r6.A01 = 1;
                list2.clear();
                list2.addAll(A0s);
            }
            r7.A00.A0H(r6);
        }
    }
}
