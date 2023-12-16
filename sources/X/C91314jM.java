package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.4jM  reason: invalid class name and case insensitive filesystem */
public class C91314jM extends AnonymousClass6J6 {
    public final TextEmojiLabel A00;
    public final WaTextView A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final C66493Lq A04;
    public final C56572sD A05;

    public void A08(C152087Xm r12) {
        String string;
        String string2;
        boolean z = r12 instanceof C132796fy;
        C626936e.A0D(z, "unknown view state type");
        ParticipantsListViewModel participantsListViewModel = this.A00;
        C626936e.A0D(AnonymousClass000.A1W(participantsListViewModel), "view model is null");
        if (z && participantsListViewModel != null) {
            WaTextView waTextView = this.A01;
            C150477Qw r1 = ((C132796fy) r12).A00;
            View view = this.A0H;
            C86614Ku.A12(view.getContext(), waTextView, r1);
            Resources resources = view.getResources();
            boolean A1Z = C86604Kt.A1Z(participantsListViewModel.A0E);
            C97174xk r9 = participantsListViewModel.A06;
            C27991fJ r6 = r9.A08().A04;
            C64773Ex r5 = this.A02;
            AnonymousClass5ZU r2 = this.A03;
            AnonymousClass3ZH A012 = AnonymousClass36T.A01(r5, this.A04, r6, this.A05, A1Z);
            if (A012 == null || (string = C18300x5.A0h(r2, A012)) == null) {
                string = resources.getString(R.string.f11nameremoved);
                boolean z2 = r9.A08().A0K;
                int i = R.string.f11nameremoved;
                if (z2) {
                    i = R.string.f11nameremoved;
                }
                string2 = resources.getString(i);
            } else {
                boolean z3 = r9.A08().A0K;
                int i2 = R.string.f11nameremoved;
                if (z3) {
                    i2 = R.string.f11nameremoved;
                }
                string2 = C18320x8.A0b(resources, string, new Object[1], 0, i2);
            }
            TextEmojiLabel textEmojiLabel = this.A00;
            textEmojiLabel.setText(string);
            textEmojiLabel.setContentDescription(string2);
            C117695sL.A01(view, this, 16);
        }
    }

    public C91314jM(View view, ParticipantsListViewModel participantsListViewModel, C64773Ex r4, AnonymousClass5ZU r5, C66493Lq r6, C56572sD r7) {
        super(view, participantsListViewModel);
        this.A00 = AnonymousClass0x7.A0K(view, R.id.group_name);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.participant_count);
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }
}
