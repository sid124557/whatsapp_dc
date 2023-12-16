package X;

import android.os.Bundle;
import com.whatsapp.events.EventResponseBottomSheet;

/* renamed from: X.3u9  reason: invalid class name and case insensitive filesystem */
public final class C77903u9 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ EventResponseBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77903u9(EventResponseBottomSheet eventResponseBottomSheet) {
        super(0);
        this.this$0 = eventResponseBottomSheet;
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
