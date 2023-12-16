package X;

import android.os.Bundle;
import com.whatsapp.events.EventInfoBottomSheet;

/* renamed from: X.3u7  reason: invalid class name and case insensitive filesystem */
public final class C77883u7 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ EventInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77883u7(EventInfoBottomSheet eventInfoBottomSheet) {
        super(0);
        this.this$0 = eventInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass2z0 A03;
        Bundle bundle = this.this$0.A06;
        if (bundle != null && (A03 = C107395bF.A03(bundle, "")) != null) {
            return A03;
        }
        throw AnonymousClass001.A0e("Could not retrieve message key from arguments bundle.");
    }
}
