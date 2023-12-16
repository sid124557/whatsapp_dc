package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4pn  reason: invalid class name and case insensitive filesystem */
public abstract class C94064pn extends AnonymousClass4PS {
    public View A00 = findViewById(R.id.negative_btn);
    public View A01 = findViewById(R.id.positive_btn);
    public ViewGroup A02 = C86644Kx.A0J(this, R.id.content);
    public TextView A03 = AnonymousClass002.A09(this, R.id.header);
    public C187958y5 A04;

    public abstract int getNegativeButtonTextResId();

    public abstract int getPositiveButtonIconResId();

    public abstract int getPositiveButtonTextResId();

    public C94064pn(Context context) {
        super(context);
        View.inflate(context, R.layout.f8nameremoved, this);
        AnonymousClass0x9.A0F(this, R.id.positive_btn_icon).setImageResource(getPositiveButtonIconResId());
        TextView A09 = AnonymousClass002.A09(this, R.id.positive_btn_text);
        TextView A092 = AnonymousClass002.A09(this, R.id.negative_btn_text);
        C106905aM.A04(A09);
        A09.setText(getPositiveButtonTextResId());
        C106905aM.A04(A092);
        A092.setText(getNegativeButtonTextResId());
    }
}
