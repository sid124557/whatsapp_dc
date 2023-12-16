package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4jJ  reason: invalid class name and case insensitive filesystem */
public final class C91284jJ extends AnonymousClass6J6 {
    public final WDSButton A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91284jJ(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view, participantsListViewModel);
        C162457s7.A0J(view, 1);
        this.A00 = C86614Ku.A0p(view, R.id.ring_all_btn);
    }

    public void A08(C152087Xm r5) {
        C162457s7.A0J(r5, 0);
        if (!(r5 instanceof C132806fz)) {
            C626936e.A0D(false, "Unknown list item type");
            return;
        }
        WDSButton wDSButton = this.A00;
        if (((C132806fz) r5).A00) {
            wDSButton.setOnClickListener(new C109465ef(this, 4, wDSButton));
            wDSButton.setVisibility(0);
            return;
        }
        wDSButton.setOnClickListener((View.OnClickListener) null);
        wDSButton.setVisibility(8);
    }
}
