package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5Pp  reason: invalid class name and case insensitive filesystem */
public class C104085Pp {
    public View A00;
    public C181628n4 A01;
    public Runnable A02;

    public void A00(View.OnClickListener onClickListener, String str, int i) {
        C18300x5.A0G(this.A00, R.id.share_link_action_item_text).setText(str);
        ImageView A0E = AnonymousClass0x9.A0E(this.A00, R.id.share_link_action_item_icon);
        if (A01()) {
            C18290x4.A1A(this.A00.getContext(), A0E, i);
        } else {
            A0E.setImageResource(0);
        }
        C18320x8.A16(this.A00, onClickListener, this, 4);
    }

    public boolean A01() {
        return true;
    }
}
