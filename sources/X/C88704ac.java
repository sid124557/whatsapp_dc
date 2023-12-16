package X;

import android.content.Context;

/* renamed from: X.4ac  reason: invalid class name and case insensitive filesystem */
public final class C88704ac extends C88674aZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass5YA A02;
    public final /* synthetic */ Integer A03;

    public C88704ac(Context context, AnonymousClass5YA r2, Integer num, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A00 = i;
        this.A03 = num;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj, int i) {
        AnonymousClass5YA r2 = this.A02;
        Context context = this.A01;
        int i2 = this.A00;
        Integer num = this.A03;
        r2.A03(context, num, "status_fragment", i2);
        C111135hb A0c = C86644Kx.A0c(r2.A0J);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error code: ");
        A0o.append(i2);
        A0c.A07("SEE_CROSSPOST_ERROR", AnonymousClass000.A0P(num, ", error subcode: ", A0o));
    }
}
