package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5n2  reason: invalid class name and case insensitive filesystem */
public final class C114435n2 implements C184408rk {
    public final /* synthetic */ AnonymousClass5ZO A00;
    public final /* synthetic */ AnonymousClass5J2 A01;
    public final /* synthetic */ AnonymousClass5ZI A02;
    public final /* synthetic */ AnonymousClass4GQ A03;

    public C114435n2(AnonymousClass5ZO r1, AnonymousClass5J2 r2, AnonymousClass5ZI r3, AnonymousClass4GQ r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void BSO(AnonymousClass7T4 r3, int i) {
        this.A03.invoke(new C132586fc(i));
        AnonymousClass5ZI r1 = this.A02;
        if (r1 != null) {
            r1.A09("text_search_local_business_request_end");
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass7QA r11 = (AnonymousClass7QA) obj;
        C162457s7.A0J(r11, 0);
        AnonymousClass5ZI r3 = this.A02;
        if (r3 != null) {
            r3.A09("text_search_local_business_request_end");
            r3.A09("qpl_business_ranking_start");
        }
        List list = r11.A0C;
        AnonymousClass5ZO r4 = this.A00;
        AnonymousClass5ZZ.A03(r4, list);
        ArrayList A0J = AnonymousClass002.A0J(list);
        C105705Wb r1 = this.A01.A01;
        ArrayList A0s = C18300x5.A0s(A0J);
        String str = r11.A03;
        r1.A00(new AnonymousClass5T3(r4, new AnonymousClass8F7(r11, r3, A0J, this.A03), r11.A02, str, A0s, 1));
    }
}
