package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.4jK  reason: invalid class name and case insensitive filesystem */
public final class C91294jK extends AnonymousClass6J6 {
    public final WaTextView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91294jK(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view, participantsListViewModel);
        C162457s7.A0J(view, 1);
        this.A00 = C86604Kt.A0O(view, R.id.body);
    }

    public void A08(C152087Xm r4) {
        C162457s7.A0J(r4, 0);
        if (!(r4 instanceof C91334jO)) {
            C626936e.A0D(false, "Unknown list item type");
            return;
        }
        C86614Ku.A12(C86664Kz.A0T(this), this.A00, ((C91334jO) r4).A00);
    }
}
