package X;

import android.net.Uri;

/* renamed from: X.5hw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111345hw implements C181548mw {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ C624134x A01;
    public final /* synthetic */ AnonymousClass54F A02;

    public final void BP1() {
        String str;
        AnonymousClass54F r0 = this.A02;
        C624134x r3 = this.A01;
        C89654ea r4 = this.A00;
        C103625Ns r5 = ((C93314oJ) r0.A00).A1i;
        C162457s7.A0J(r3, 0);
        String A08 = C56952sp.A08(r5.A01, 4255);
        C614030o r1 = r5.A02;
        C58932w3 A002 = C614030o.A00(r3);
        if (A002 == null || !r1.A09(A002) || A08.length() == 0) {
            A08 = "https://faq.whatsapp.com/general/verification/about-autofilling-security-codes-on-whatsapp";
        }
        Uri.Builder buildUpon = Uri.parse(A08).buildUpon();
        C620733j r32 = r5.A00;
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("lg", r32.A07()).appendQueryParameter("lc", r32.A06());
        if (r5.A03.A04()) {
            str = "1";
        } else {
            str = "0";
        }
        r4.startActivity(C18310x6.A0D(C18290x4.A0H(appendQueryParameter, "eea", str)));
    }

    public /* synthetic */ C111345hw(C89654ea r1, C624134x r2, AnonymousClass54F r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
