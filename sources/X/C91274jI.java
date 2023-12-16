package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.4jI  reason: invalid class name and case insensitive filesystem */
public class C91274jI extends AnonymousClass6J6 {
    public final WaTextView A00;

    public void A08(C152087Xm r4) {
        int i = r4.A00;
        if (i != 2) {
            C18260x0.A0z("CallInfoButtonViewHolder/bind/Unsupported item type: ", AnonymousClass001.A0o(), i);
            return;
        }
        View view = this.A0H;
        view.setClickable(true);
        view.setOnClickListener(new AnonymousClass39Z(0));
        this.A00.setText(R.string.f11nameremoved);
    }

    public C91274jI(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view, participantsListViewModel);
        this.A00 = AnonymousClass0x7.A0L(view, R.id.button_text);
    }
}
