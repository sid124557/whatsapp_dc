package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.6e5  reason: invalid class name and case insensitive filesystem */
public class C131726e5 extends C104085Pp {
    public TextView A00;

    public void A02(View.OnClickListener onClickListener, String str, String str2) {
        super.A00(onClickListener, str, 0);
        TextView A0G = C18300x5.A0G(this.A00, R.id.share_link_action_item_description);
        this.A00 = A0G;
        A0G.setVisibility(0);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(str2);
        }
    }

    public boolean A01() {
        return false;
    }
}
