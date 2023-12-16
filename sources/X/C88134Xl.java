package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.4Xl  reason: invalid class name and case insensitive filesystem */
public class C88134Xl extends C05570Ua {
    public C88134Xl(View view, C64653Ej r9, C59862xc r10) {
        super(view);
        View view2 = this.A0H;
        C107295b4.A06(view2, true);
        C106905aM.A03(view, R.id.community_subject);
        AnonymousClass0x9.A0E(view, R.id.community_icon).setImageDrawable(C59862xc.A00(C86614Ku.A0C(view), C18290x4.A0G(view), new AnonymousClass922(1), r10.A00, R.drawable.vec_ic_avatar_community));
        ImageView A0E = AnonymousClass0x9.A0E(view2, R.id.community_mark);
        A0E.setImageResource(C1001059l.A03 ? R.drawable.my_status_add_button_new : R.drawable.my_status_add_button);
        A0E.setVisibility(0);
        view.setOnClickListener(new C109465ef(r9, 22, view));
    }
}
