package X;

import com.whatsapp.calling.callrating.CallRatingBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8Y0  reason: invalid class name */
public final class AnonymousClass8Y0 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CallRatingBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Y0(CallRatingBottomSheet callRatingBottomSheet) {
        super(1);
        this.this$0 = callRatingBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        WDSButton wDSButton = this.this$0.A03;
        if (wDSButton != null) {
            C162457s7.A0H(bool);
            wDSButton.setEnabled(bool.booleanValue());
        }
        return C59022wD.A00;
    }
}
