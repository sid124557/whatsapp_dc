package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4Yh  reason: invalid class name and case insensitive filesystem */
public class C88324Yh extends C05570Ua {
    public final View A00;
    public final View A01;
    public final CheckBox A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;

    public C88324Yh(View view) {
        super(view);
        this.A07 = AnonymousClass002.A09(view, R.id.title_tv);
        this.A06 = AnonymousClass002.A09(view, R.id.subtitle_tv);
        this.A01 = view.findViewById(R.id.primary_action_btn);
        this.A03 = AnonymousClass0x9.A0F(view, R.id.primary_action_icon);
        this.A04 = AnonymousClass0x9.A0F(view, R.id.secondary_action_btn);
        this.A05 = AnonymousClass0x9.A0F(view, R.id.third_action_btn);
        this.A02 = (CheckBox) view.findViewById(R.id.cbx);
        this.A00 = view;
    }
}
