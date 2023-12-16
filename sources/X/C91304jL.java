package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.4jL  reason: invalid class name and case insensitive filesystem */
public class C91304jL extends AnonymousClass6J6 {
    public final WaImageView A00;

    public void A08(C152087Xm r4) {
        WaImageView waImageView = this.A00;
        C107215at.A04(C86664Kz.A0T(this), waImageView);
        if (C1001059l.A04) {
            C86614Ku.A15(C18290x4.A0G(waImageView), waImageView, R.dimen.f6nameremoved);
        }
    }

    public C91304jL(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view, participantsListViewModel);
        this.A00 = AnonymousClass0x9.A0L(view, R.id.share_icon);
        C109315eQ.A01(view, participantsListViewModel, 0);
    }
}
