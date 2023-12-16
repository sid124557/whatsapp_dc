package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Qa  reason: invalid class name and case insensitive filesystem */
public final class C104195Qa {
    public AnonymousClass3ZH A00;
    public boolean A01;
    public final Context A02;
    public final TextView A03;
    public final TextView A04;
    public final C53802nh A05;

    public final void A00() {
        this.A00 = null;
        this.A01 = false;
        this.A04.setVisibility(8);
        this.A03.setVisibility(8);
    }

    public final void A01(AnonymousClass3ZH r3, String str) {
        C162457s7.A0J(str, 0);
        this.A00 = r3;
        this.A01 = true;
        TextView textView = this.A04;
        textView.setText(str);
        textView.setVisibility(0);
    }

    public C104195Qa(Context context, View view, C53802nh r4) {
        this.A02 = context;
        this.A05 = r4;
        this.A04 = AnonymousClass0x2.A0I(view, R.id.number_on_whatsapp_message);
        this.A03 = AnonymousClass0x2.A0I(view, R.id.number_on_whatsapp_action);
    }
}
