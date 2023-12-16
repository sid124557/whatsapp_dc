package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.CallLogActivity;

/* renamed from: X.5LF  reason: invalid class name */
public class AnonymousClass5LF {
    public final View A00;
    public final CheckBox A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final /* synthetic */ CallLogActivity A0B;

    public AnonymousClass5LF(View view, CallLogActivity callLogActivity) {
        this.A0B = callLogActivity;
        this.A00 = view;
        this.A03 = AnonymousClass0x9.A0F(view, R.id.call_type_icon);
        this.A08 = AnonymousClass002.A09(view, R.id.call_type);
        this.A06 = AnonymousClass002.A09(view, R.id.call_date);
        this.A02 = AnonymousClass0x9.A0F(view, R.id.call_av_icon);
        this.A07 = AnonymousClass002.A09(view, R.id.call_duration);
        this.A05 = AnonymousClass002.A09(view, R.id.call_data);
        this.A09 = C18300x5.A0G(view, R.id.caller_info);
        this.A01 = (CheckBox) C06560Yg.A02(view, R.id.call_selected_checkbox);
        this.A04 = AnonymousClass0x9.A0E(view, R.id.silenced_reason_icon);
        this.A0A = C18300x5.A0G(view, R.id.silenced_reason_label);
        if (this.A0B.A0D.A0X(4004)) {
            C107235av.A02(view);
        }
    }
}
