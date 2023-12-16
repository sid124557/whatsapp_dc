package X;

import android.os.Bundle;

/* renamed from: X.6Zi  reason: invalid class name and case insensitive filesystem */
public final class C129136Zi extends C129146Zj {
    public final C152017Xf A00;
    public final C157897j6 A01 = new C157897j6("OnWarmUpIntegrityTokenCallback");
    public final /* synthetic */ AnonymousClass7K2 A02;

    public C129136Zi(C152017Xf r3, AnonymousClass7K2 r4) {
        this.A02 = r4;
        this.A00 = r3;
    }

    public final void Axc(Bundle bundle) {
        C158887ki r0 = this.A02.A00;
        C152017Xf r3 = this.A00;
        r0.A02(r3);
        r3.A01(new AnonymousClass6QX(AnonymousClass001.A0e("Incorrect callback is called."), -100));
    }

    public final void AyE(Bundle bundle) {
        C158887ki r0 = this.A02.A00;
        C152017Xf r3 = this.A00;
        r0.A02(r3);
        this.A01.A02("onWarmUpExpressIntegrityToken", AnonymousClass4L0.A0U());
        int i = bundle.getInt("error");
        if (i != 0) {
            r3.A01(new AnonymousClass6QX((Throwable) null, i));
        } else {
            r3.A02(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
