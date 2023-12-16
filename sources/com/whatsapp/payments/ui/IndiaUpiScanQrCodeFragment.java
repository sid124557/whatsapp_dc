package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass5Q3;
import X.AnonymousClass5TW;
import X.AnonymousClass9Wv;
import X.C06560Yg;
import X.C08310eF;
import X.C204249p3;
import X.C69263Wi;
import X.C86604Kt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.qrcode.WaQrScannerView;

public class IndiaUpiScanQrCodeFragment extends Hilt_IndiaUpiScanQrCodeFragment {
    public View A00;
    public View A01;
    public ImageView A02;
    public C69263Wi A03;
    public AnonymousClass5TW A04;
    public AnonymousClass5Q3 A05;
    public WaQrScannerView A06;
    public String A07;

    public void A1J() {
        this.A06.setVisibility(8);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
    }

    public final void A1K() {
        boolean BqT = this.A06.BqT();
        ImageView imageView = this.A02;
        if (BqT) {
            imageView.setVisibility(0);
            boolean BJ7 = this.A06.BJ7();
            ImageView imageView2 = this.A02;
            int i = R.drawable.flash_off;
            if (BJ7) {
                i = R.drawable.flash_on;
            }
            imageView2.setImageResource(i);
            ImageView imageView3 = this.A02;
            int i2 = R.string.f11nameremoved;
            if (!BJ7) {
                i2 = R.string.f11nameremoved;
            }
            imageView3.setContentDescription(C08310eF.A09(this).getString(i2));
            return;
        }
        imageView.setVisibility(8);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0e() {
        super.A0e();
        if (this.A06.getVisibility() == 0) {
            this.A06.setVisibility(4);
        }
        this.A05.A01(4);
    }

    public void A0f() {
        super.A0f();
        if (this.A06.getVisibility() == 4) {
            this.A06.setVisibility(0);
        }
    }

    public void A0w(Bundle bundle, View view) {
        C86604Kt.A1B(view, R.id.education);
        this.A00 = C06560Yg.A02(view, R.id.overlay);
        this.A06 = (WaQrScannerView) C06560Yg.A02(view, R.id.qr_scanner_view);
        this.A01 = C06560Yg.A02(view, R.id.shade);
        this.A06.setQrScannerCallback(new AnonymousClass9Wv(this, 1));
        View A022 = C06560Yg.A02(view, R.id.qr_scan_from_gallery);
        A022.setVisibility(0);
        C204249p3.A02(A022, this, 94);
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.qr_scan_flash);
        this.A02 = A0E;
        C204249p3.A02(A0E, this, 95);
        A1J();
    }
}
