package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3cC  reason: invalid class name and case insensitive filesystem */
public class C71493cC implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public C71493cC(Context context, AnonymousClass30E r4, C84764Dp r5, List list, List list2) {
        this.A07 = 1;
        this.A01 = r4;
        this.A00 = 1;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = context;
        this.A06 = "status_fragment";
        this.A05 = r5;
    }

    public final void run() {
        switch (this.A07) {
            case 0:
                C993355i r0 = (C993355i) this.A01;
                AnonymousClass33C r6 = (AnonymousClass33C) this.A02;
                byte b = (byte) this.A00;
                String str = this.A06;
                List list = (List) this.A03;
                List list2 = (List) this.A04;
                byte[] bArr = (byte[]) this.A05;
                C55972rD r4 = r0.A0G;
                List list3 = r0.A0W;
                if (r0.A0d) {
                    byte b2 = b;
                    b = 42;
                    if (b2 == 3) {
                        b = 43;
                    }
                }
                int A0G = r0.A0G(r0.A00);
                AnonymousClass30M A002 = r4.A00((Uri) null, r6, r0.A0C, r0.A0M, str, list3, list, list2, b, A0G, 0, r0.A0Y);
                A002.A00 = r0.A0V.size();
                r0.A08.A08(A002, bArr, r0.A0a, r0.A0b);
                return;
            case 1:
                AnonymousClass30E r7 = (AnonymousClass30E) this.A01;
                List list4 = (List) this.A02;
                List<Object> list5 = (List) this.A03;
                Context context = (Context) this.A04;
                r7.A04(list4, list5, 1);
                C55542qW r12 = r7.A05;
                String A012 = C626736a.A01();
                C34511vH r5 = new C34511vH(context, r7, (C103515Ng) r7.A0A.get(), (C84764Dp) this.A05, list4, list5);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest called for session: ");
                A0o.append(A012);
                A0o.append(" with message ");
                ArrayList A0d = C73783g4.A0d(list5);
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    C624134x.A0Z(A0d, it);
                }
                AnonymousClass356.A01(AnonymousClass000.A0R(A0d, A0o));
                if (!list5.isEmpty()) {
                    for (Object obj : list5) {
                        if (obj instanceof C30721mu) {
                            AnonymousClass356.A01("CrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest skip for audio status");
                            C34511vH r2 = r5;
                            r2.A01(AnonymousClass217.ELIGIBILITY, C34591vP.A00, A012, list5, 1);
                            return;
                        }
                    }
                }
                ((C48612fB) r12.A08.get()).A00(A012);
                ArrayList A0d2 = C73783g4.A0d(list5);
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    C624134x.A0Z(A0d2, it2);
                }
                C69263Wi r3 = r12.A00;
                C69263Wi r16 = r3;
                C626736a.A05(r16, r12.A02, r12.A09, A012, A0d2, list4);
                C69553Xm r14 = new C69553Xm(r5, A012, list5, 1);
                AnonymousClass356.A01("CrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest start text status re-burning and eligibility");
                r12.A00(context, r14, A012, list5, list4, 1);
                return;
            default:
                Context context2 = (Context) this.A02;
                int i = this.A00;
                List<Object> list6 = (List) this.A03;
                String str2 = this.A06;
                Object obj2 = this.A04;
                C54362ob r11 = (C54362ob) this.A05;
                C162457s7.A0J(str2, 4);
                C55542qW r42 = ((AnonymousClass30E) this.A01).A05;
                List A12 = C18290x4.A12(obj2);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("CrosspostRequestSessionManager/handleNewStatusEligibilityRequest called for session: ");
                A0o2.append(str2);
                A0o2.append(" with message ");
                ArrayList A0c = C73783g4.A0c(list6);
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    C624134x.A0Z(A0c, it3);
                }
                AnonymousClass356.A01(AnonymousClass000.A0R(A0c, A0o2));
                if (!list6.isEmpty()) {
                    for (Object obj3 : list6) {
                        if (obj3 instanceof C30721mu) {
                            AnonymousClass356.A01("CrosspostRequestSessionManager/handleNewStatusEligibilityRequest skip for audio status");
                            r11.A01(AnonymousClass217.ELIGIBILITY, C34591vP.A00, str2, list6, i);
                            return;
                        }
                    }
                }
                ((C48612fB) r42.A08.get()).A00(str2);
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    ((C55202py) r42.A09.get()).A03(str2, A12, 1, C18300x5.A0T(it4).A1L);
                }
                C69553Xm r62 = new C69553Xm(r11, str2, list6, i);
                AnonymousClass356.A01("CrosspostRequestSessionManager/handleNewStatusEligibilityRequest start text status burning and eligibility");
                r42.A00(context2, r62, str2, list6, A12, i);
                return;
        }
    }

    public C71493cC(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2) {
        this.A07 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A06 = str;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
    }
}
