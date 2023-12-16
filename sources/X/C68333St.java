package X;

import android.view.View;
import com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment;

/* renamed from: X.3St  reason: invalid class name and case insensitive filesystem */
public final class C68333St implements AnonymousClass4EZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ SMSPreviewInviteBottomSheetFragment A02;
    public final /* synthetic */ C27991fJ A03;

    public C68333St(View view, SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment, C27991fJ r3, int i) {
        this.A02 = sMSPreviewInviteBottomSheetFragment;
        this.A01 = view;
        this.A03 = r3;
        this.A00 = i;
    }

    public void BQs(String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        C003203q A0Q = sMSPreviewInviteBottomSheetFragment.A0Q();
        if (A0Q != null) {
            A0Q.runOnUiThread(new C70103Zx(sMSPreviewInviteBottomSheetFragment, 49, this.A01));
        }
    }

    public void BSN(AnonymousClass36K r6, String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        C003203q A0Q = sMSPreviewInviteBottomSheetFragment.A0Q();
        if (A0Q != null) {
            A0Q.runOnUiThread(new C71353by(sMSPreviewInviteBottomSheetFragment, 0, this.A01));
        }
    }

    public void BdM(AnonymousClass36K r8, String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        sMSPreviewInviteBottomSheetFragment.A0D = true;
        C003203q A0Q = sMSPreviewInviteBottomSheetFragment.A0Q();
        if (A0Q != null) {
            A0Q.runOnUiThread(new C71433c6(sMSPreviewInviteBottomSheetFragment, this.A01, this.A03, this.A00, 23));
        }
    }
}
