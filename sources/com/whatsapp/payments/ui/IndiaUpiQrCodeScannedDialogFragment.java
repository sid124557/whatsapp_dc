package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YG;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass5Yj;
import X.AnonymousClass9WN;
import X.AnonymousClass9WY;
import X.C003203q;
import X.C08310eF;
import X.C153087ae;
import X.C160757oG;
import X.C18300x5;
import X.C1901994m;
import X.C1906899l;
import X.C1907099n;
import X.C195179Wl;
import X.C196629bS;
import X.C196789bk;
import X.C197109ca;
import X.C202139lR;
import X.C202949ms;
import X.C203809oL;
import X.C204249p3;
import X.C54292oU;
import X.C56612sH;
import X.C620733j;
import X.C626936e;
import X.C66663Mh;
import X.C86664Kz;
import X.C95814uZ;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiQrCodeScannedDialogFragment extends Hilt_IndiaUpiQrCodeScannedDialogFragment {
    public View A00;
    public View A01;
    public Button A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public C66663Mh A0B;
    public C56612sH A0C;
    public C54292oU A0D;
    public C620733j A0E;
    public AnonymousClass1VX A0F;
    public C95814uZ A0G;
    public C196789bk A0H;
    public C196629bS A0I;
    public C1906899l A0J;
    public C153087ae A0K;
    public C1907099n A0L;
    public C197109ca A0M;
    public AnonymousClass9WN A0N;
    public C1901994m A0O;
    public String A0P;
    public final C160757oG A0Q = C160757oG.A00("IndiaUpiQrCodeScannedDialogFragment", "payment-settings", "IN");

    public void A0o(Bundle bundle) {
        this.A0X = true;
        Bundle A0H2 = A0H();
        this.A0G = C95814uZ.A00.A05(A0H2.getString("ARG_JID"));
        this.A0O = (C1901994m) AnonymousClass4L0.A0F(new C203809oL(this, A0H2.getString("ARG_URL"), A0H2.getString("external_payment_source"), 0), this).A01(C1901994m.class);
        C196629bS r3 = this.A0I;
        this.A0H = new C196789bk(this.A0B, this.A0F, r3, this.A0M, this.A0N);
        C204249p3.A02(this.A02, this, 93);
    }

    public static IndiaUpiQrCodeScannedDialogFragment A00(C95814uZ r4, String str, String str2, String str3) {
        String str4;
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = new IndiaUpiQrCodeScannedDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("ARG_URL", str);
        if (r4 != null) {
            str4 = r4.getRawString();
        } else {
            str4 = "";
        }
        A082.putString("ARG_JID", str4);
        A082.putString("external_payment_source", str2);
        A082.putString("referral_screen", str3);
        indiaUpiQrCodeScannedDialogFragment.A0u(A082);
        return indiaUpiQrCodeScannedDialogFragment;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0Q.A06("scanned payment QR code deep link");
        View inflate = A0R().getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null);
        this.A01 = inflate;
        this.A07 = (ProgressBar) inflate.findViewById(R.id.progress);
        this.A03 = C86664Kz.A0v(this.A01, R.id.details_row);
        this.A09 = AnonymousClass002.A09(this.A01, R.id.contact_info_title);
        this.A08 = AnonymousClass002.A09(this.A01, R.id.contact_info_subtitle);
        this.A0A = AnonymousClass002.A09(this.A01, R.id.error_desc);
        this.A02 = (Button) this.A01.findViewById(R.id.positive_button);
        this.A04 = C86664Kz.A0v(this.A01, R.id.prefill_amount);
        this.A05 = C86664Kz.A0v(this.A01, R.id.qr_code_secure_info_container);
        this.A00 = this.A01.findViewById(R.id.qr_code_secure_info_container_divider);
        for (Drawable drawable : C18300x5.A0G(this.A01, R.id.warning_text).getCompoundDrawables()) {
            if (drawable != null) {
                AnonymousClass0YG.A06(drawable, C08310eF.A09(this).getColor(R.color.f5nameremoved));
            }
        }
        ProgressBar progressBar = (ProgressBar) this.A01.findViewById(R.id.button_progress_bar);
        this.A06 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(AnonymousClass0Y8.A04(A1D(), AnonymousClass5Yj.A01(A1D())), PorterDuff.Mode.SRC_IN);
        String string = A0H().getString("referral_screen");
        this.A0P = string;
        this.A0M.BKB(0, (Integer) null, "qr_code_scan_prompt", string);
        return this.A01;
    }

    public final void A1Y() {
        Object A072 = this.A0O.A06.A07();
        C626936e.A06(A072);
        C195179Wl r0 = (C195179Wl) A072;
        C196789bk r1 = this.A0H;
        C003203q A0R = A0R();
        String str = r0.A08;
        C626936e.A06(str);
        r1.A00(A0R, this.A0G, (C202949ms) null, str, r0.A02, this.A0P);
        A1K();
    }

    public void A0d() {
        super.A0d();
        C003203q A0Q2 = A0Q();
        if (A0Q2 instanceof C202139lR) {
            ((Activity) ((C202139lR) A0Q2)).finish();
        }
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 1001) {
            if (this.A0J.A0D() || this.A0J.A0E()) {
                if (!this.A0F.A0X(1933) || !AnonymousClass9WY.A05(this.A0P)) {
                    Bundle A0H2 = A0H();
                    this.A0O.A0D(A0H2.getString("ARG_URL"), A0H2.getString("external_payment_source"));
                    return;
                }
                A1Y();
                return;
            }
        } else if (i == 1002) {
            C003203q A0Q2 = A0Q();
            if (A0Q2 instanceof C202139lR) {
                ((Activity) ((C202139lR) A0Q2)).setResult(i2, intent);
            }
        } else {
            return;
        }
        A1K();
    }
}
