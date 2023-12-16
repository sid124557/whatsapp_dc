package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94L  reason: invalid class name */
public class AnonymousClass94L extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C105365Uq A09;
    public C114015mM A0A;
    public C116855qy A0B;
    public boolean A0C;

    public void A00(AnonymousClass3ZH r6, String str, String str2) {
        this.A03.setVisibility(0);
        this.A00.setVisibility(0);
        this.A09.A08(this.A02, r6);
        this.A08.setText(str);
        this.A07.setText(C18320x8.A0b(getResources(), str2, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void setScanQrText(int i) {
        this.A06.setText(i);
    }

    public AnonymousClass94L(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            this.A0A = C86604Kt.A0S(C88864av.A00(generatedComponent()));
        }
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        this.A02 = AnonymousClass0x9.A0F(this, R.id.profile_image);
        this.A08 = AnonymousClass002.A09(this, R.id.profile_payment_name);
        this.A07 = AnonymousClass002.A09(this, R.id.profile_payment_handler);
        this.A09 = this.A0A.A05(getContext(), "india-upi-payment-settings-header-row");
        this.A03 = C86664Kz.A0v(this, R.id.profile_container);
        this.A05 = C86664Kz.A0v(this, R.id.send_payment_container);
        LinearLayout A0v = C86664Kz.A0v(this, R.id.scan_qr_container);
        this.A04 = A0v;
        this.A06 = C18300x5.A0G(A0v, R.id.scan_qr);
        this.A00 = findViewById(R.id.divider_above_send_payment);
        this.A01 = AnonymousClass0x9.A0E(this, R.id.profile_details_icon);
    }

    public LinearLayout getProfileContainer() {
        return this.A03;
    }

    public LinearLayout getScanQrContainer() {
        return this.A04;
    }

    public LinearLayout getSendPaymentContainer() {
        return this.A05;
    }
}
