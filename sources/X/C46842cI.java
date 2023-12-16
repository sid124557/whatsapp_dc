package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.2cI  reason: invalid class name and case insensitive filesystem */
public final class C46842cI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass223 A02;
    public final /* synthetic */ AnonymousClass30E A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public C46842cI(Context context, AnonymousClass223 r2, AnonymousClass30E r3, String str, List list, int i) {
        this.A03 = r3;
        this.A01 = context;
        this.A05 = list;
        this.A02 = r2;
        this.A04 = str;
        this.A00 = i;
    }

    public void A00() {
        String A012 = C626736a.A01();
        AnonymousClass30E r2 = this.A03;
        Context context = this.A01;
        List list = this.A05;
        AnonymousClass223 r5 = this.A02;
        Context context2 = context;
        AnonymousClass223 r10 = r5;
        AnonymousClass30E r11 = r2;
        C34501vG r8 = new C34501vG(context2, r10, r11, (C103515Ng) r2.A0A.get(), this.A04, list);
        int i = this.A00;
        r2.A04(C18290x4.A12(r5), list, i);
        r2.A02.BkM(new C71493cC(r2, context, list, r5, r8, A012, i, 2));
    }
}
