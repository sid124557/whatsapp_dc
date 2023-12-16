package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;

/* renamed from: X.1pq  reason: invalid class name and case insensitive filesystem */
public abstract class C32241pq extends AnonymousClass1Fm {
    public View A00;
    public View A01;
    public TextView A02;
    public AnonymousClass5TW A03;
    public AnonymousClass5ZR A04;
    public WaQrScannerView A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 0) {
            finish();
        } else {
            this.A05.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        A5j(5);
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false));
        AnonymousClass1Ha.A1z(this);
        if (this instanceof P2pTransferQrScannerActivity) {
            z = false;
        } else {
            z = AnonymousClass1Hf.A27(this).getBoolean("qr_education", true);
        }
        this.A07 = z;
        this.A00 = findViewById(R.id.overlay);
        this.A05 = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
        this.A01 = findViewById(R.id.shade);
        this.A02 = C18310x6.A0L(this, R.id.hint);
        this.A05.setQrScannerCallback(new C86584Kr(this, 1));
        View findViewById = findViewById(R.id.ok);
        View findViewById2 = findViewById(R.id.education);
        C634339f.A00(findViewById, this, findViewById2, 12);
        if (this.A07) {
            findViewById2.setVisibility(0);
            this.A05.setVisibility(8);
            this.A00.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        findViewById2.setVisibility(8);
        A74();
    }

    public void A74() {
        int A022 = this.A04.A02("android.permission.CAMERA");
        WaQrScannerView waQrScannerView = this.A05;
        if (A022 == 0) {
            waQrScannerView.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
            return;
        }
        waQrScannerView.setVisibility(8);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
        AnonymousClass5UF r4 = new AnonymousClass5UF(this);
        r4.A01 = R.drawable.permission_cam;
        int[] iArr = {R.string.f11nameremoved};
        r4.A02 = R.string.f11nameremoved;
        r4.A0B = iArr;
        int[] iArr2 = {R.string.f11nameremoved};
        r4.A03 = R.string.f11nameremoved;
        r4.A09 = iArr2;
        r4.A0D = new String[]{"android.permission.CAMERA"};
        r4.A07 = true;
        A76(r4);
        startActivityForResult(r4.A02(), 1);
    }

    public void A75() {
        if (this instanceof DevicePairQrScannerActivity) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this;
            devicePairQrScannerActivity.A05.A0R(devicePairQrScannerActivity.A0J);
            devicePairQrScannerActivity.A05.BkS(new C71273bq((Object) devicePairQrScannerActivity, 42));
            return;
        }
        Intent A072 = C18320x8.A07();
        A072.putExtra("qr_code_key", this.A06);
        AnonymousClass0x2.A0m(this, A072);
    }

    public void A76(AnonymousClass5UF r6) {
        if (this instanceof P2pTransferQrScannerActivity) {
            int[] iArr = {R.string.f11nameremoved};
            r6.A02 = R.string.f11nameremoved;
            r6.A0B = iArr;
            int[] iArr2 = {R.string.f11nameremoved};
            r6.A03 = R.string.f11nameremoved;
            r6.A09 = iArr2;
        }
    }

    public void A77(String str) {
        Log.i("QrScannerActivity/result");
        if (str == null || str.equals(this.A06)) {
            this.A05.Bjp();
        } else {
            this.A06 = str;
            A75();
        }
        C18270x1.A0l(C18270x1.A03(this.A09), "qr_education", false);
    }

    public void onPause() {
        super.onPause();
        if (this.A05.getVisibility() == 0) {
            this.A05.setVisibility(4);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A05.getVisibility() == 4) {
            this.A05.setVisibility(0);
        }
    }
}
