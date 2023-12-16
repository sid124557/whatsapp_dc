package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.9W1  reason: invalid class name */
public class AnonymousClass9W1 {
    public C69263Wi A00;
    public C56972sr A01;
    public C56612sH A02;
    public AnonymousClass33p A03;
    public C66543Lv A04;
    public C617332a A05;
    public C195089Vv A06;
    public C1906899l A07;
    public C40602Ha A08;
    public C620933l A09;
    public AnonymousClass9U5 A0A;
    public AnonymousClass9WM A0B;
    public C1907099n A0C;
    public C197769dq A0D;
    public AnonymousClass9U4 A0E;
    public C194089Rn A0F;
    public C194019Rg A0G;
    public AnonymousClass9VU A0H;
    public C203499no A0I;
    public AnonymousClass9W3 A0J;
    public AnonymousClass9TR A0K;
    public C194259Se A0L;
    public C194639Tx A0M;
    public AnonymousClass4FS A0N;

    public void A03(C89644eZ r11, String str, String str2, boolean z) {
        C203499no r1 = this.A0I;
        C626936e.A06(r1);
        String str3 = str;
        r1.BKB(0, (Integer) null, "prompt_warn_setup_without_recover", str);
        C89644eZ r5 = r11;
        AnonymousClass0Uj r3 = new AnonymousClass0Uj(r11);
        r3.setTitle(r11.getString(R.string.f11nameremoved));
        boolean equals = "receive_flow".equals(str);
        int i = R.string.f11nameremoved;
        if (equals) {
            i = R.string.f11nameremoved;
        }
        r3.A0Q(r11.getString(i));
        r3.A0I(new AnonymousClass9X5(r5, this, str3, str2, z), r11.getString(R.string.f11nameremoved));
        r3.A0G(new C204399pI(1, str, this), r11.getString(R.string.f11nameremoved));
        r3.A0S();
    }

    public static /* synthetic */ void A00(C89644eZ r14, AnonymousClass9W1 r15, String str, List list, int i, boolean z, boolean z2) {
        String str2;
        if (!z2) {
            r14.finish();
            return;
        }
        Intent A032 = C1899693i.A03(r14);
        HashMap A0t = AnonymousClass001.A0t();
        int i2 = i;
        List list2 = list;
        if (!r15.A0J.A05() || r15.A0J.A01() == 1) {
            if (!r15.A0C.A02.A0X(2984) || i <= 0) {
                str2 = "brpay_p_add_card";
            } else if (i2 > 1) {
                JSONObject A033 = r15.A06.A03(list2);
                if (A033 != null) {
                    A0t.put("cards", A033.toString());
                }
                A0t.put("single_card", "false");
                str2 = "brpay_p_card_select_options";
            } else {
                C133786hw r1 = (C133786hw) C18290x4.A0k(list2);
                A0t.put("credential_id", r1.A0H);
                A0t.put("last4", r1.A0J);
                A0t.put("single_card", "true");
                str2 = "brpay_p_add_cvv_card";
            }
            A032.putExtra("screen_name", str2);
        } else {
            A032.putExtra("screen_name", "brpay_p_add_biometric");
            A0t.put("pin", str);
            if (i == 0) {
                A0t.put("screen_open_after_bio", "show_add_card");
            } else if (i2 == 1) {
                C133786hw r12 = (C133786hw) C18290x4.A0k(list2);
                A0t.put("credential_id", r12.A0H);
                A0t.put("last4", r12.A0J);
                A0t.put("screen_open_after_bio", "show_add_cvv_card");
                A0t.put("single_card", "true");
            } else {
                A0t.put("screen_open_after_bio", "show_select_card");
                JSONObject A034 = r15.A06.A03(list2);
                if (A034 != null) {
                    A0t.put("cards", A034.toString());
                }
                A0t.put("single_card", "false");
            }
        }
        A0t.put("verification_needed", "1");
        A032.putExtra("screen_params", A0t);
        r14.A6T(A032, z);
    }

    public final void A01(C89644eZ r13) {
        C620933l.A00(this.A09).remove("payment_account_recovered").remove("payment_account_recoverable").remove("payment_account_recoverable_time_ms").apply();
        C69263Wi r3 = this.A00;
        AnonymousClass4FS r11 = this.A0N;
        C194259Se r10 = this.A0L;
        AnonymousClass9U4 r9 = this.A0E;
        C89644eZ r2 = r13;
        new C194329Sl(r2, r3, this.A04, this.A08, this.A09, this.A0A, this.A0D, r9, r10, r11).A00((AnonymousClass4EY) null);
    }

    public void A02(C89644eZ r4, String str, String str2) {
        BrazilAccountRecoveryEligibilityBottomSheet brazilAccountRecoveryEligibilityBottomSheet = new BrazilAccountRecoveryEligibilityBottomSheet();
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("referral_screen", str2);
        brazilAccountRecoveryEligibilityBottomSheet.A0u(A082);
        brazilAccountRecoveryEligibilityBottomSheet.A05 = new AnonymousClass9PR(r4, this, str2, str);
        r4.Boo(brazilAccountRecoveryEligibilityBottomSheet);
    }

    public void A04(C89644eZ r7, boolean z) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
        pinBottomSheetDialogFragment.A0A = new AnonymousClass9B1();
        pinBottomSheetDialogFragment.A0D = true;
        C86604Kt.A1A(pinBottomSheetDialogFragment.A0C);
        pinBottomSheetDialogFragment.A0B = new C197219cl(r7, pinBottomSheetDialogFragment, this, z, true);
        r7.Boo(pinBottomSheetDialogFragment);
    }
}
