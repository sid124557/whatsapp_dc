package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass33p;
import X.AnonymousClass344;
import X.AnonymousClass5TW;
import X.C08310eF;
import X.C107295b4;
import X.C69263Wi;
import X.C70033Zp;
import X.C86584Kr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;

public class QrScanCodeFragment extends Hilt_QrScanCodeFragment {
    public View A00;
    public ImageView A01;
    public C69263Wi A02;
    public AnonymousClass5TW A03;
    public AnonymousClass33p A04;
    public QrScannerOverlay A05;
    public WaQrScannerView A06;
    public String A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Runnable A0C = new C70033Zp(this, 5);
    public final Runnable A0D = new C70033Zp(this, 6);

    public void A0a() {
        this.A02.A0R(this.A0C);
        super.A0a();
    }

    public void A1J() {
        this.A02.A0R(this.A0D);
        this.A0B = true;
        A1L();
        C69263Wi r0 = this.A02;
        Runnable runnable = this.A0C;
        r0.A0R(runnable);
        if (this.A09) {
            if (A19()) {
                AnonymousClass344.A01(new QrEducationDialogFragment(), A0T());
                this.A08 = true;
            }
        } else if (!this.A0A) {
            this.A02.A0T(runnable, 15000);
        }
    }

    public final void A1K() {
        boolean BqT = this.A06.BqT();
        ImageView imageView = this.A01;
        if (BqT) {
            imageView.setVisibility(0);
            boolean BJ7 = this.A06.BJ7();
            ImageView imageView2 = this.A01;
            int i = R.drawable.flash_off;
            if (BJ7) {
                i = R.drawable.flash_on;
            }
            imageView2.setImageResource(i);
            ImageView imageView3 = this.A01;
            int i2 = R.string.f11nameremoved;
            if (!BJ7) {
                i2 = R.string.f11nameremoved;
            }
            imageView3.setContentDescription(C08310eF.A09(this).getString(i2));
            return;
        }
        imageView.setVisibility(8);
    }

    public final void A1L() {
        WaQrScannerView waQrScannerView = this.A06;
        if (waQrScannerView != null) {
            int i = 0;
            waQrScannerView.setVisibility(AnonymousClass001.A08(this.A0B ? 1 : 0));
            QrScannerOverlay qrScannerOverlay = this.A05;
            if (!this.A0B) {
                i = 8;
            }
            qrScannerOverlay.setVisibility(i);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A06 = (WaQrScannerView) A0R.findViewById(R.id.qr_scanner_view);
        this.A05 = (QrScannerOverlay) A0R.findViewById(R.id.overlay);
        this.A00 = A0R.findViewById(R.id.qr_scan_from_gallery);
        this.A01 = AnonymousClass0x9.A0F(A0R, R.id.qr_scan_flash);
        this.A09 = AnonymousClass0x2.A0F(this.A04).getBoolean("contact_qr_education", true);
        AnonymousClass0x2.A0y(this.A01, this, 2);
        AnonymousClass0x2.A0y(this.A00, this, 3);
        WaQrScannerView waQrScannerView = this.A06;
        waQrScannerView.setQrScannerCallback(new C86584Kr(this, 2));
        waQrScannerView.setContentDescription(C08310eF.A09(this).getString(R.string.f11nameremoved));
        C107295b4.A03(this.A06, R.string.f11nameremoved);
        AnonymousClass0x2.A0y(this.A06, this, 4);
        A1L();
        return A0R;
    }

    public void A0e() {
        super.A0e();
        this.A02.A0R(this.A0C);
    }

    public void A0f() {
        super.A0f();
        if (this.A0B && !this.A0A && !this.A09) {
            this.A02.A0T(this.A0C, 15000);
        }
    }
}
