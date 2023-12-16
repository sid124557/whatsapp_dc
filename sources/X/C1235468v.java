package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.dmsetting.DisappearingMessagesSettingActivity;
import com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet;
import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.68v  reason: invalid class name and case insensitive filesystem */
public class C1235468v implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C1235468v(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        C624034w r0;
        switch (this.A01) {
            case 0:
                DisappearingMessagesSettingActivity disappearingMessagesSettingActivity = (DisappearingMessagesSettingActivity) this.A00;
                int i = disappearingMessagesSettingActivity.A00;
                Intent A07 = C18320x8.A07();
                C627736r.A1G(disappearingMessagesSettingActivity, A07, i);
                disappearingMessagesSettingActivity.startActivityForResult(A07, 100);
                return;
            case 1:
                DisappearingMessagesSettingActivity disappearingMessagesSettingActivity2 = (DisappearingMessagesSettingActivity) this.A00;
                C56112rR r02 = disappearingMessagesSettingActivity2.A04;
                C162457s7.A0H(r02);
                Integer A05 = r02.A05();
                C162457s7.A0D(A05);
                int intValue = A05.intValue();
                AnonymousClass5QF r5 = disappearingMessagesSettingActivity2.A05;
                if (r5 != null) {
                    r5.A01((List) null, 1, intValue, 0, 0, disappearingMessagesSettingActivity2.A00);
                    AnonymousClass5PH r2 = new AnonymousClass5PH(disappearingMessagesSettingActivity2);
                    r2.A0H = true;
                    r2.A0L = true;
                    r2.A0Z = AnonymousClass001.A0s();
                    r2.A0E = true;
                    r2.A0P = A05;
                    disappearingMessagesSettingActivity2.startActivityForResult(AnonymousClass5PH.A01(r2), 1);
                    return;
                }
                throw C18270x1.A0S("ephemeralSettingLogger");
            case 2:
                ((C89654ea) this.A00).onBackPressed();
                return;
            case 3:
                PaymentMerchantUpsellEducationBottomSheet paymentMerchantUpsellEducationBottomSheet = (PaymentMerchantUpsellEducationBottomSheet) this.A00;
                paymentMerchantUpsellEducationBottomSheet.A1K();
                AnonymousClass5NS r03 = paymentMerchantUpsellEducationBottomSheet.A00;
                if (r03 != null) {
                    AnonymousClass33p r1 = r03.A01;
                    C18270x1.A0i(C18270x1.A03(r1), "smb_merchant_payment_account_nag_last_seen", r03.A00.A0H());
                    return;
                }
                throw C18270x1.A0S("merchantEducationManager");
            case 4:
                AnonymousClass94y r22 = (AnonymousClass94y) this.A00;
                AnonymousClass9QJ r12 = new AnonymousClass9QJ(28);
                C193629Pj r04 = r22.A06;
                if (r04 != null) {
                    r0 = r04.A01;
                } else {
                    r0 = null;
                }
                r12.A05 = r0;
                r22.A08.A0H(r12);
                return;
            default:
                ShareToFacebookActivity shareToFacebookActivity = (ShareToFacebookActivity) this.A00;
                C19340zH A002 = AnonymousClass5V0.A00(shareToFacebookActivity);
                A002.A0T(R.string.f11nameremoved);
                A002.A0U(R.string.f11nameremoved);
                A002.A0V(new C1235568w(shareToFacebookActivity, 16));
                C1235268t.A03(A002, shareToFacebookActivity, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, R.string.f11nameremoved);
                C1235268t.A04(A002, shareToFacebookActivity, 145, R.string.f11nameremoved);
                C162457s7.A0D(A002.A0S());
                shareToFacebookActivity.A74().A05("SEE_UNLINK_DIALOG");
                return;
        }
    }
}
