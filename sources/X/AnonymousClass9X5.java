package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.9X5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ AnonymousClass9W1 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass9W1 r7 = this.A01;
        C89644eZ r6 = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        boolean z = this.A04;
        r7.A01(r6);
        C1899593h.A1E(r7.A0I, 160, "prompt_warn_setup_without_recover", str);
        Intent A032 = C1899693i.A03(r6);
        A032.putExtra("screen_name", "brpay_p_tos");
        AnonymousClass98s.A0a(A032, "referral_screen", str);
        AnonymousClass98s.A0a(A032, "onboarding_context", str2);
        r6.A6T(A032, z);
    }

    public /* synthetic */ AnonymousClass9X5(C89644eZ r1, AnonymousClass9W1 r2, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }
}
