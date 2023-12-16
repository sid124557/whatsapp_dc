package X;

import java.util.Collection;

/* renamed from: X.4HT  reason: invalid class name */
public class AnonymousClass4HT extends AnonymousClass5ZM {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass4HT(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A02 = str;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        if (this.A03 != 0) {
            String A002 = AnonymousClass5B3.A00("https://wa.tenor.co/v1/trending", "key", C58172up.A0V);
            String str = this.A02;
            if (!(str == null || str.length() == 0)) {
                A002 = AnonymousClass5B3.A00(A002, "pos", str);
            }
            C25501ac r1 = new C25501ac();
            r1.A08 = "Tenor";
            r1.A00 = 1;
            return ((C26711ce) this.A00).A03(r1, A002);
        }
        String A003 = AnonymousClass5B3.A00("https://api.giphy.com/v1/gifs/trending", "api_key", C58172up.A0H, "rating", "pg-13");
        String str2 = this.A02;
        if (!(str2 == null || str2.length() == 0)) {
            A003 = AnonymousClass5B3.A00(A003, "offset", str2);
        }
        C25501ac r12 = new C25501ac();
        r12.A08 = "Giphy";
        r12.A00 = 1;
        return ((C26701cd) this.A00).A03(r12, A003);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r5 = (AnonymousClass0PJ) obj;
        if (r5 == null) {
            ((C49872hE) this.A01).A00((String) null, (Collection) null, true);
        } else {
            ((C49872hE) this.A01).A00((String) r5.A00, (Collection) r5.A01, false);
        }
    }
}
