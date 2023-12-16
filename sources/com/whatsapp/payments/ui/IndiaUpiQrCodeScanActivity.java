package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass3DZ;
import X.AnonymousClass5Q3;
import X.AnonymousClass5TW;
import X.AnonymousClass5UF;
import X.AnonymousClass9Wv;
import X.C107695bk;
import X.C160757oG;
import X.C18280x3;
import X.C1899593h;
import X.C204019og;
import X.C32241pq;
import X.C57532tn;
import X.C64333Db;
import X.C86614Ku;
import X.C86634Kw;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.qrcode.WaQrScannerView;

public final class IndiaUpiQrCodeScanActivity extends C32241pq {
    public AnonymousClass5Q3 A00;
    public boolean A01;
    public final C160757oG A02;

    public void A76(AnonymousClass5UF r6) {
        int[] iArr = {R.string.f11nameremoved};
        r6.A02 = R.string.f11nameremoved;
        r6.A0B = iArr;
        int[] iArr2 = {R.string.f11nameremoved};
        r6.A03 = R.string.f11nameremoved;
        r6.A09 = iArr2;
    }

    public void onCreate(Bundle bundle) {
        A5j(5);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        C86634Kw.A0R(this).A0N(true);
        WaQrScannerView waQrScannerView = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
        this.A05 = waQrScannerView;
        waQrScannerView.setQrScannerCallback(new AnonymousClass9Wv(this, 0));
        C18280x3.A0r(this, R.id.overlay, 0);
        A74();
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A03 = (AnonymousClass5TW) A002.ASQ.get();
            C57532tn.A00(C86614Ku.A0V(A002), this);
            this.A00 = (AnonymousClass5Q3) r1.A9z.get();
        }
    }

    public void A75() {
        Vibrator A0K = this.A08.A0K();
        if (A0K != null) {
            A0K.vibrate(75);
        }
        Intent A08 = AnonymousClass0x9.A08(this, IndiaUpiPaymentLauncherActivity.class);
        A08.putExtra("intent_source", true);
        A08.setData(Uri.parse(this.A06));
        startActivity(A08);
        finish();
    }

    public IndiaUpiQrCodeScanActivity(int i) {
        this.A01 = false;
        C204019og.A00(this, 88);
    }

    public void onPause() {
        super.onPause();
        this.A00.A01(4);
    }

    public IndiaUpiQrCodeScanActivity() {
        this(0);
        this.A02 = C160757oG.A00("IndiaUpiQrCodeScanActivity", "payment", "IN");
    }
}
