package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.4jH  reason: invalid class name and case insensitive filesystem */
public class C91264jH extends AnonymousClass6J6 {
    public final WaImageView A00;

    public void A08(C152087Xm r6) {
        View view = this.A0H;
        view.setClickable(true);
        C18300x5.A18(view, this, 47);
        Context context = view.getContext();
        WaImageView waImageView = this.A00;
        C107215at.A04(context, waImageView);
        C86654Ky.A1A(view, context.getString(R.string.f11nameremoved), context.getString(R.string.f11nameremoved), false);
        if (C1001059l.A04) {
            waImageView.setImageResource(R.drawable.ic_voip_add_person_filled_wds);
        }
    }

    public C91264jH(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view, participantsListViewModel);
        this.A00 = AnonymousClass0x9.A0L(view, R.id.add_participant_icon);
    }
}
