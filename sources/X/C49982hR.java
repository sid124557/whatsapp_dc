package X;

import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: X.2hR  reason: invalid class name and case insensitive filesystem */
public final class C49982hR {
    public final /* synthetic */ ProgressDialog A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C53802nh A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C49982hR(ProgressDialog progressDialog, Context context, C53802nh r3, Integer num, String str, String str2) {
        this.A02 = r3;
        this.A01 = context;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = num;
        this.A00 = progressDialog;
    }

    public void A00() {
        C53802nh r3 = this.A02;
        C69263Wi.A02(r3.A01, this.A00, 23);
        r3.A02(this.A01, this.A03, this.A04, "https://whatsapp.com/dl/", this.A05);
    }

    public void A01(String str) {
        C53802nh r3 = this.A02;
        C69263Wi.A02(r3.A01, this.A00, 24);
        r3.A02(this.A01, this.A03, this.A04, AnonymousClass000.A0V("https://whatsapp.com/dl/code=", str, AnonymousClass001.A0o()), this.A05);
    }
}
