package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass0R8;
import X.AnonymousClass0YH;
import X.AnonymousClass0x7;
import X.AnonymousClass34K;
import X.AnonymousClass5PT;
import X.AnonymousClass5UF;
import X.AnonymousClass5ZR;
import X.AnonymousClass94b;
import X.AnonymousClass9U4;
import X.AnonymousClass9WN;
import X.C08310eF;
import X.C102095Hl;
import X.C107405bG;
import X.C158757kV;
import X.C166557yt;
import X.C18290x4;
import X.C182958pG;
import X.C1902995e;
import X.C1905397t;
import X.C1906899l;
import X.C191829Gp;
import X.C196629bS;
import X.C196789bk;
import X.C197109ca;
import X.C197749do;
import X.C202949ms;
import X.C86634Kw;
import X.C95814uZ;
import X.C989053r;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

public final class IndiaUpiQrTabActivity extends C1905397t {
    public static String A0H;
    public ViewPager A00;
    public PagerSlidingTabStrip A01;
    public AnonymousClass5ZR A02;
    public C196789bk A03;
    public C196629bS A04;
    public C1906899l A05;
    public AnonymousClass9U4 A06;
    public C197109ca A07;
    public C158757kV A08;
    public IndiaUpiMyQrFragment A09;
    public AnonymousClass94b A0A;
    public IndiaUpiScanQrCodeFragment A0B;
    public AnonymousClass9WN A0C;
    public AnonymousClass5PT A0D;
    public C989053r A0E;
    public boolean A0F = false;
    public final C182958pG A0G = new C197749do(this);

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != 0) {
                IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A0B;
                indiaUpiScanQrCodeFragment.A06.setVisibility(0);
                indiaUpiScanQrCodeFragment.A00.setVisibility(0);
                indiaUpiScanQrCodeFragment.A01.setVisibility(8);
            } else if (this.A0A.A00.length == 2) {
                this.A00.A0F(this.A00.A0T() ? 1 : 0, true);
            } else {
                finish();
            }
        } else if (i == 202) {
            if (i2 == -1) {
                IndiaUpiMyQrFragment indiaUpiMyQrFragment = this.A09;
                indiaUpiMyQrFragment.A0D.A0F(C18290x4.A0m(indiaUpiMyQrFragment.A0C.A0F), 0);
            }
        } else if (i == 203) {
            if (i2 == -1 && intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    Bp9(R.string.f11nameremoved);
                    AnonymousClass0x7.A1B(new C191829Gp(data, this, this.A0E, this.A0B.A06.getWidth(), this.A0B.A06.getHeight()), this.A04);
                    return;
                }
                this.A05.A0H(R.string.f11nameremoved, 0);
            }
        } else if (i == 1019 && i2 == -1 && intent != null) {
            this.A03.A00(this, (C95814uZ) null, (C202949ms) null, C166557yt.A00((C166557yt) intent.getParcelableExtra("INTERNATIONAL_QR_PAYLOAD")), intent.getStringExtra("INTERNATIONAL_QR_SOURCE"), "payments_camera_gallery");
        }
    }

    public void A74() {
        int A022 = this.A02.A02("android.permission.CAMERA");
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A0B;
        if (A022 != 0) {
            indiaUpiScanQrCodeFragment.A1J();
            AnonymousClass5UF r5 = new AnonymousClass5UF(this);
            r5.A01 = R.drawable.permission_cam;
            int[] iArr = {R.string.f11nameremoved};
            r5.A02 = R.string.f11nameremoved;
            r5.A0B = iArr;
            int[] iArr2 = {R.string.f11nameremoved};
            r5.A03 = R.string.f11nameremoved;
            r5.A09 = iArr2;
            r5.A0D = new String[]{"android.permission.CAMERA"};
            r5.A07 = true;
            BpY(r5.A02(), 1);
            return;
        }
        indiaUpiScanQrCodeFragment.A06.setVisibility(0);
        indiaUpiScanQrCodeFragment.A00.setVisibility(0);
        indiaUpiScanQrCodeFragment.A01.setVisibility(8);
    }

    public void onStop() {
        this.A0D.A00(getWindow());
        super.onStop();
    }

    public void A5d(C08310eF r2) {
        super.A5d(r2);
        if (r2 instanceof IndiaUpiMyQrFragment) {
            this.A09 = (IndiaUpiMyQrFragment) r2;
        } else if (r2 instanceof IndiaUpiScanQrCodeFragment) {
            this.A0B = (IndiaUpiScanQrCodeFragment) r2;
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass94b r1;
        C107405bG.A08(this, AnonymousClass34K.A01(this, R.attr.f3nameremoved));
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView((int) R.layout.f8nameremoved);
        this.A0D = new AnonymousClass5PT();
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        A0H = getIntent().getStringExtra("extra_account_holder_name");
        C86634Kw.A0R(this).A0N(true);
        this.A00 = (ViewPager) findViewById(R.id.payment_qr_pager);
        this.A01 = (PagerSlidingTabStrip) findViewById(R.id.payment_qr_tab_strip);
        if (this.A05.A0C()) {
            this.A01.setVisibility(0);
            if (supportActionBar != null) {
                supportActionBar.A0B(R.string.f11nameremoved);
            }
            r1 = new AnonymousClass94b(getSupportFragmentManager(), this, 2);
        } else {
            this.A01.setVisibility(8);
            r1 = new AnonymousClass94b(getSupportFragmentManager(), this, 1);
        }
        this.A0A = r1;
        this.A00.setAdapter(r1);
        this.A00.A0G(new C1902995e(this));
        AnonymousClass0YH.A06(this.A01, 0);
        this.A01.setViewPager(this.A00);
        this.A00.A0F(0, false);
        AnonymousClass94b r3 = this.A0A;
        int i = 0;
        while (true) {
            C102095Hl[] r12 = r3.A00;
            if (i < r12.length) {
                C102095Hl r0 = r12[i];
                r0.A00.setSelected(AnonymousClass000.A1U(i, 0));
                i++;
            } else {
                C196629bS r32 = this.A04;
                this.A03 = new C196789bk(this.A06, this.A0D, r32, this.A07, this.A0C);
                return;
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.A0D.A01(getWindow(), this.A08);
    }
}
