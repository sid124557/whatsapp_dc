package com.whatsapp.payments.ui.widget;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass39Q;
import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C116855qy;
import X.C151137To;
import X.C153087ae;
import X.C160757oG;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C1899593h;
import X.C193599Pg;
import X.C195959a4;
import X.C197549dU;
import X.C198439ev;
import X.C204029oh;
import X.C204249p3;
import X.C204319pA;
import X.C57002su;
import X.C617332a;
import X.C620733j;
import X.C64333Db;
import X.C66663Mh;
import X.C85204Fi;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import java.math.BigDecimal;

public class IndiaUpiDisplaySecureQrCodeView extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C151137To A09;
    public QrImageView A0A;
    public C66663Mh A0B;
    public C620733j A0C;
    public C617332a A0D;
    public C153087ae A0E;
    public PaymentAmountInputField A0F;
    public IndiaUpiSecureQrCodeViewModel A0G;
    public C116855qy A0H;
    public boolean A0I;
    public final C160757oG A0J;

    public void A00() {
        if (!this.A0I) {
            this.A0I = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0B = (C66663Mh) A002.AUd.get();
            this.A0C = C64333Db.A2t(A002);
            this.A0E = C1899593h.A0G(A002);
            this.A0D = C1899593h.A09(A002);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0H;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public String getUserInputAmount() {
        return C18290x4.A0m(this.A0F);
    }

    public void setup(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel) {
        this.A0G = indiaUpiSecureQrCodeViewModel;
        C204249p3.A02(this.A03, indiaUpiSecureQrCodeViewModel, 145);
        this.A08.setText(C57002su.A01(new C198439ev(), getContext().getString(R.string.f11nameremoved), "try-again"));
        C204249p3.A02(this.A08, indiaUpiSecureQrCodeViewModel, 146);
        this.A0F.A08 = findViewById(R.id.send_payment_amount_container);
        this.A0F.setOnFocusChangeListener(new C204319pA(this, 1));
        this.A0F.setErrorTextView(this.A07);
        this.A0F.setOnEditorActionListener(new C204029oh(this, 1));
        this.A0F.A00 = new C195959a4(this);
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0J = C160757oG.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A01();
    }

    public final void A01() {
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        this.A0A = (QrImageView) findViewById(R.id.qr_code);
        this.A05 = C18300x5.A0G(this, R.id.add_amount);
        this.A06 = C18300x5.A0G(this, R.id.display_payment_amount);
        this.A07 = C18300x5.A0G(this, R.id.amount_input_error_text);
        this.A02 = AnonymousClass0x9.A0E(this, R.id.dashed_underline);
        this.A0F = (PaymentAmountInputField) C06560Yg.A02(this, R.id.user_payment_amount);
        C85204Fi A012 = this.A0D.A01("INR");
        PaymentAmountInputField paymentAmountInputField = this.A0F;
        paymentAmountInputField.A0E = A012;
        paymentAmountInputField.A03 = 1;
        AnonymousClass39Q A082 = C1899593h.A08(A012, new BigDecimal(this.A0B.A03(C66663Mh.A1j)));
        this.A0F.A0G = new C197549dU(getContext(), this.A0C, A012, A082, A082, A082, (C193599Pg) null);
        this.A03 = C86654Ky.A0N(this, R.id.add_or_display_amount);
        this.A00 = C06560Yg.A02(this, R.id.user_amount_input);
        this.A04 = C86664Kz.A0v(this, R.id.qr_code_signing_secure_title_container);
        this.A08 = AnonymousClass002.A09(this, R.id.qr_code_signing_retry_text);
        this.A01 = (FrameLayout) findViewById(R.id.progress_container);
    }

    public C151137To getQrCode() {
        return this.A09;
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A0J = C160757oG.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A01();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A0J = C160757oG.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A01();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context) {
        super(context);
        A00();
        this.A0J = C160757oG.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        A01();
    }
}
