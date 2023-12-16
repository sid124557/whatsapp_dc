package X;

import android.content.Context;
import android.widget.Button;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.9Du  reason: invalid class name and case insensitive filesystem */
public class C191189Du extends C196399am {
    public void A00(Context context, List list) {
        Button button;
        int i;
        super.A00(context, list);
        String str = this.A0F;
        if ("chat".equals(str) || "payment_composer_icon".equals(str)) {
            this.A05.setText(R.string.f11nameremoved);
            button = this.A05;
            i = 0;
        } else {
            button = this.A05;
            i = 8;
        }
        button.setVisibility(i);
    }

    public C191189Du(C64773Ex r1, C56422rx r2, AnonymousClass5ZU r3, C114015mM r4, String str, boolean z) {
        super(r1, r2, r3, r4, str, z);
    }
}
