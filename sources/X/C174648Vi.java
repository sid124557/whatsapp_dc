package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CallRatingActivityV2;
import com.whatsapp.calling.callrating.CallRatingBottomSheet;

/* renamed from: X.8Vi  reason: invalid class name and case insensitive filesystem */
public final class C174648Vi extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CallRatingActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174648Vi(CallRatingActivityV2 callRatingActivityV2) {
        super(0);
        this.this$0 = callRatingActivityV2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle A0D = C86614Ku.A0D(this.this$0);
        CallRatingBottomSheet callRatingBottomSheet = new CallRatingBottomSheet();
        if (A0D != null) {
            callRatingBottomSheet.A0u(A0D);
        }
        return callRatingBottomSheet;
    }
}
