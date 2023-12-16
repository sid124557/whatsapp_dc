package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5jU  reason: invalid class name and case insensitive filesystem */
public final class C112285jU implements C184168rM, C184188rO {
    public AnonymousClass08M A00 = AnonymousClass08M.A01();
    public List A01 = AnonymousClass001.A0s();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C103545Nk A03;
    public final C105355Up A04;

    public C112285jU(C103545Nk r2, C105355Up r3) {
        C162457s7.A0J(r3, 1);
        this.A04 = r3;
        this.A03 = r2;
        ((C112275jT) r2.A00).A09 = this;
    }

    public void A00(AnonymousClass7ZC r6) {
        String str;
        C162457s7.A0J(r6, 0);
        AnonymousClass7ZD r3 = new AnonymousClass7ZD(r6.A01, C72023d3.A00, AnonymousClass001.A0s(), 2);
        List list = r6.A02;
        if (C18310x6.A1X(list)) {
            AnonymousClass4C5 A042 = C829345m.A04(AnonymousClass8Z6.A00, new C626335w(list, 1));
            this.A01.addAll(C829345m.A01(A042));
            List A022 = C829345m.A02(new C72623e1(AnonymousClass8Z7.A00, A042));
            C162457s7.A0J(A022, 0);
            r3.A00 = A022;
            if (this.A04.A03() && (str = r6.A00) != null && str.length() != 0 && C18310x6.A1X(list)) {
                this.A03.A00(str, (String) null);
            }
        }
        List list2 = r6.A03;
        if (C18310x6.A1X(list2)) {
            r3.A01 = list2;
        }
        this.A02.A0G(r3);
    }

    public void BME(Map map) {
        String str;
        AnonymousClass7ZB r1;
        C162457s7.A0J(map, 0);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C109065e1 A0K = AnonymousClass4L0.A0K(it);
            if (!(A0K.A01 == 1 || (r1 = (AnonymousClass7ZB) map.get(A0K.A0F)) == null)) {
                A0K.A06 = r1.A02;
                A0K.A05 = r1.A03;
                A0K.A04 = r1.A01;
                A0K.A01 = 1;
            }
        }
        AnonymousClass08M r2 = this.A02;
        AnonymousClass7ZD r0 = (AnonymousClass7ZD) r2.A07();
        if (r0 != null) {
            str = r0.A03;
        } else {
            str = "unknown";
        }
        C86634Kw.A1M(r2, str, 4);
    }

    public void BMD(int i, String str) {
        String str2;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C109065e1 A0K = AnonymousClass4L0.A0K(it);
            if (C162457s7.A0P(str, A0K.A03)) {
                A0K.A01 = 2;
            }
        }
        AnonymousClass08M r2 = this.A02;
        AnonymousClass7ZD r0 = (AnonymousClass7ZD) r2.A07();
        if (r0 != null) {
            str2 = r0.A03;
        } else {
            str2 = "unknown";
        }
        C86634Kw.A1M(r2, str2, 4);
    }

    public void BTL(AnonymousClass7T4 r3, int i) {
        this.A00.A0G(Collections.emptyList());
    }

    public void BTM(List list) {
        if (list != null) {
            Object A0k = C18290x4.A0k(list);
            C162457s7.A0K(A0k, "null cannot be cast to non-null type com.whatsapp.businessdirectory.model.home.PopularCategoriesWidget");
            this.A00.A0G(((C132546fX) A0k).A00);
        }
    }
}
