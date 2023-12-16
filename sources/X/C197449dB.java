package X;

import android.content.Context;
import android.content.Intent;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* renamed from: X.9dB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197449dB implements C182878p8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public final void BYt(BottomSheetDialogFragment bottomSheetDialogFragment) {
        Context context = this.A00;
        String str = this.A01;
        bottomSheetDialogFragment.A1K();
        Intent A03 = C1899693i.A03(context);
        A03.putExtra("screen_name", str);
        A03.putExtra("hide_send_payment_cta", true);
        AnonymousClass98s.A0a(A03, "onboarding_context", "p2p_context");
        AnonymousClass98s.A0a(A03, "referral_screen", "receive_flow");
        context.startActivity(A03);
    }

    public /* synthetic */ C197449dB(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }
}
