package X;

import com.whatsapp.R;
import com.whatsapp.calling.callrating.CallRatingBottomSheet;
import com.whatsapp.calling.callrating.CallRatingFragment;
import com.whatsapp.calling.callrating.UserProblemsFragment;

/* renamed from: X.60O  reason: invalid class name */
public final class AnonymousClass60O extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CallRatingBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60O(CallRatingBottomSheet callRatingBottomSheet) {
        super(1);
        this.this$0 = callRatingBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CallRatingBottomSheet callRatingBottomSheet;
        C08310eF userProblemsFragment;
        if (C162457s7.A0P(obj, C132766fv.A00)) {
            callRatingBottomSheet = this.this$0;
            userProblemsFragment = new CallRatingFragment();
        } else {
            if (C162457s7.A0P(obj, C132776fw.A00)) {
                callRatingBottomSheet = this.this$0;
                userProblemsFragment = new UserProblemsFragment();
            }
            return C59022wD.A00;
        }
        C08240dc r1 = new C08240dc(callRatingBottomSheet.A0T());
        r1.A0A(userProblemsFragment, R.id.container);
        r1.A01();
        return C59022wD.A00;
    }
}
