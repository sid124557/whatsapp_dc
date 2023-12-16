package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4qd  reason: invalid class name and case insensitive filesystem */
public class C94254qd extends C125656Iw {
    public final View A00;
    public final TextView A01;

    public /* bridge */ /* synthetic */ void A07(AnonymousClass7VI r4) {
        C133656hj r42 = (C133656hj) r4;
        this.A01.setText(r42.A00.A00);
        C179298iv r2 = r42.A01;
        if (r2 != null) {
            C109475eg.A00(this.A00, r2, r42, 49);
        }
    }

    public C94254qd(View view) {
        super(view);
        this.A00 = C06560Yg.A02(view, R.id.icebreaker_question_root);
        this.A01 = C18300x5.A0G(view, R.id.icebreaker_question);
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.icebreaker_questions_send_icon);
        A0E.setClickable(false);
        C107335b8.A0E(A0E, AnonymousClass5Yj.A03(view.getContext(), view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
    }
}
