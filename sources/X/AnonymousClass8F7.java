package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8F7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8F7 implements C181948nc {
    public final /* synthetic */ AnonymousClass7QA A00;
    public final /* synthetic */ AnonymousClass5ZI A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ AnonymousClass4GQ A03;

    public final void BZM() {
        AnonymousClass5ZI r4 = this.A01;
        AnonymousClass7QA r3 = this.A00;
        ArrayList arrayList = this.A02;
        AnonymousClass4GQ r1 = this.A03;
        if (r4 != null) {
            r4.A09("qpl_business_ranking_end");
        }
        List list = r3.A0C;
        list.clear();
        list.addAll(arrayList);
        r1.invoke(new C132596fd(r3));
    }

    public /* synthetic */ AnonymousClass8F7(AnonymousClass7QA r1, AnonymousClass5ZI r2, ArrayList arrayList, AnonymousClass4GQ r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = arrayList;
        this.A03 = r4;
    }
}
