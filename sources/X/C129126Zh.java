package X;

import android.os.Bundle;

/* renamed from: X.6Zh  reason: invalid class name and case insensitive filesystem */
public final class C129126Zh extends C129146Zj {
    public final C152017Xf A00;
    public final C157897j6 A01 = new C157897j6("OnRequestIntegrityTokenCallback");
    public final /* synthetic */ AnonymousClass7K2 A02;

    public C129126Zh(C152017Xf r3, AnonymousClass7K2 r4) {
        this.A02 = r4;
        this.A00 = r3;
    }

    public final void Axc(Bundle bundle) {
        C158887ki r0 = this.A02.A00;
        C152017Xf r3 = this.A00;
        r0.A02(r3);
        this.A01.A02("onRequestExpressIntegrityToken", AnonymousClass4L0.A0U());
        int i = bundle.getInt("error");
        if (i != 0) {
            r3.A01(new AnonymousClass6QX((Throwable) null, i));
            return;
        }
        String string = bundle.getString("token");
        if (string != null) {
            r3.A02(new C129066Zb(string));
            return;
        }
        throw AnonymousClass001.A0g("Null token");
    }

    public final void AyE(Bundle bundle) {
        C158887ki r0 = this.A02.A00;
        C152017Xf r3 = this.A00;
        r0.A02(r3);
        r3.A01(new AnonymousClass6QX(AnonymousClass001.A0e("Incorrect callback is called."), -100));
    }
}
