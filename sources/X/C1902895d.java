package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;

/* renamed from: X.95d  reason: invalid class name and case insensitive filesystem */
public class C1902895d extends C05570Ua implements View.OnClickListener {
    public final ImageView A00;
    public final RadioButton A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass9NQ A05;

    public void onClick(View view) {
        AnonymousClass9NQ r0 = this.A05;
        int A0J = AnonymousClass001.A0J(this);
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = r0.A00;
        if (!indiaUpiBankAccountPickerActivity.A0X && (!((AnonymousClass9Q1) indiaUpiBankAccountPickerActivity.A0U.get(A0J)).A06)) {
            if (indiaUpiBankAccountPickerActivity.A0U.size() == 1) {
                indiaUpiBankAccountPickerActivity.A7W();
                return;
            }
            ((AnonymousClass9Q1) indiaUpiBankAccountPickerActivity.A0U.get(indiaUpiBankAccountPickerActivity.A01)).A00 = false;
            ((AnonymousClass9Q1) indiaUpiBankAccountPickerActivity.A0U.get(A0J)).A00 = true;
            AnonymousClass0R6 r1 = indiaUpiBankAccountPickerActivity.A0B.A0N;
            if (r1 != null) {
                r1.A06(indiaUpiBankAccountPickerActivity.A01);
                indiaUpiBankAccountPickerActivity.A01 = A0J;
                indiaUpiBankAccountPickerActivity.A0B.A0N.A06(A0J);
            }
        }
    }

    public C1902895d(View view, AnonymousClass9NQ r3) {
        super(view);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.provider_icon);
        this.A03 = C18300x5.A0G(view, R.id.account_number);
        this.A02 = C18300x5.A0G(view, R.id.account_name);
        this.A04 = C18300x5.A0G(view, R.id.account_type);
        this.A01 = (RadioButton) C06560Yg.A02(view, R.id.radio_button);
        this.A05 = r3;
        view.setOnClickListener(this);
    }
}
