package X;

import android.os.Bundle;

/* renamed from: X.809  reason: invalid class name */
public final /* synthetic */ class AnonymousClass809 implements C15900s9 {
    public final /* synthetic */ C165977xw A00;
    public final /* synthetic */ AnonymousClass7X9 A01;
    public final /* synthetic */ C166107y9 A02;

    public final void BTp(String str, Bundle bundle) {
        AnonymousClass7X9 r4 = this.A01;
        C166107y9 r3 = this.A02;
        C165977xw r2 = this.A00;
        C18270x1.A11(str, 3, bundle);
        if (str.hashCode() == -661782138 && str.equals("text.option.selection.request.key")) {
            int i = bundle.getInt("text.option.selection.result");
            r4.A00();
            r4.A07.BGq(r2, r3, i);
        }
    }

    public /* synthetic */ AnonymousClass809(C165977xw r1, AnonymousClass7X9 r2, C166107y9 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
