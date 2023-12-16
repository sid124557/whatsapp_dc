package X;

import android.content.Context;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.6Yr  reason: invalid class name */
public final class AnonymousClass6Yr extends AnonymousClass4SH {
    public final CallRatingViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Yr(Context context, CallRatingViewModel callRatingViewModel, int i) {
        super(context, i);
        C162457s7.A0J(callRatingViewModel, 3);
        this.A00 = callRatingViewModel;
    }

    public void cancel() {
        this.A00.A08.A0H(C132756fu.A00);
    }
}
