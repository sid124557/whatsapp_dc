package X;

import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.7zG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166787zG implements View.OnClickListener {
    public final /* synthetic */ VoipCallControlBottomSheetV2 A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public final void onClick(View view) {
        int A022;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A00;
        boolean z = this.A01;
        boolean z2 = this.A02;
        if (z) {
            A022 = 3;
        } else {
            A022 = C18310x6.A02(z2 ? 1 : 0);
        }
        voipCallControlBottomSheetV2.A1Z(A022);
    }

    public /* synthetic */ C166787zG(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, boolean z, boolean z2) {
        this.A00 = voipCallControlBottomSheetV2;
        this.A01 = z;
        this.A02 = z2;
    }
}
