package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9SZ  reason: invalid class name */
public class AnonymousClass9SZ {
    public final AnonymousClass5UX A00;
    public final AnonymousClass5ZU A01;
    public final C620733j A02;

    public AnonymousClass9SZ(AnonymousClass5UX r1, AnonymousClass5ZU r2, C620733j r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(Activity activity, View.OnClickListener onClickListener, ViewGroup viewGroup, C105365Uq r12, AnonymousClass3ZH r13, C166557yt r14, C166557yt r15, boolean z) {
        View inflate = activity.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true);
        ImageView A0E = AnonymousClass0x9.A0E(inflate, R.id.payment_recipient_profile_pic);
        TextView A0G = C18300x5.A0G(inflate, R.id.payment_recipient_name);
        TextView A0G2 = C18300x5.A0G(inflate, R.id.payment_recipient_vpa);
        View A022 = C06560Yg.A02(inflate, R.id.expand_receiver_details_button);
        if (z) {
            A022.setVisibility(0);
        } else {
            A022.setVisibility(8);
        }
        inflate.setOnClickListener(onClickListener);
        if (r13 != null) {
            r12.A08(A0E, r13);
            String A0H = this.A01.A0H(r13);
            if (A0H == null) {
                A0H = "";
            }
            A0G.setText(A0H);
            if (C161527pr.A02(r15)) {
                A0G2.setVisibility(8);
                return;
            }
        } else {
            this.A00.A06(A0E, R.drawable.avatar_contact);
            if (!C161527pr.A02(r14)) {
                A0G.setText((CharSequence) C1899593h.A0X(r14));
            } else {
                A0G.setVisibility(8);
            }
        }
        Object obj = r15.A00;
        C626936e.A06(obj);
        AnonymousClass001.A0y(activity, A0G2, new Object[]{obj}, R.string.f11nameremoved);
    }
}
