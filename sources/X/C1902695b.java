package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;

/* renamed from: X.95b  reason: invalid class name and case insensitive filesystem */
public class C1902695b extends C05570Ua implements View.OnClickListener {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final AnonymousClass9OL A03;

    public void onClick(View view) {
        AnonymousClass9OL r0 = this.A03;
        int A0J = AnonymousClass001.A0J(this);
        IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity = r0.A00;
        C166157yE r5 = (C166157yE) r0.A01.get(A0J);
        AnonymousClass303 A7V = indiaUpiProfileDetailsActivity.A7V();
        A7V.A03("alias_type", r5.A03);
        indiaUpiProfileDetailsActivity.A0S.BKE(A7V, AnonymousClass001.A0f(), 166, "payments_profile", indiaUpiProfileDetailsActivity.getIntent().getStringExtra("extra_referral_screen"));
        C166557yt r2 = indiaUpiProfileDetailsActivity.A0D;
        Intent A08 = AnonymousClass0x9.A08(indiaUpiProfileDetailsActivity, IndiaUpiNumberSettingsActivity.class);
        A08.putExtra("extra_payment_name", r2);
        A08.putExtra("extra_payment_upi_alias", r5);
        A08.putExtra("extra_referral_screen", indiaUpiProfileDetailsActivity.A0K);
        indiaUpiProfileDetailsActivity.startActivityForResult(A08, 1021);
    }

    public C1902695b(View view, AnonymousClass9OL r3) {
        super(view);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.upi_number_image);
        this.A02 = C18300x5.A0G(view, R.id.upi_number_text);
        this.A01 = C18300x5.A0G(view, R.id.linked_upi_number_status);
        this.A03 = r3;
        view.setOnClickListener(this);
    }
}
