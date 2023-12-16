package com.whatsapp.qrcode;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2EJ;
import X.AnonymousClass2JT;
import X.AnonymousClass2NO;
import X.AnonymousClass2R8;
import X.AnonymousClass2VU;
import X.AnonymousClass3DZ;
import X.AnonymousClass3Eo;
import X.AnonymousClass4E3;
import X.AnonymousClass4FJ;
import X.AnonymousClass4FK;
import X.AnonymousClass4FS;
import X.AnonymousClass4HY;
import X.AnonymousClass5TW;
import X.AnonymousClass5UY;
import X.C107695bk;
import X.C116985rC;
import X.C29041iB;
import X.C32241pq;
import X.C382626p;
import X.C45482a5;
import X.C46122b7;
import X.C46372bW;
import X.C48442eu;
import X.C50382i5;
import X.C56612sH;
import X.C620633i;
import X.C633939b;
import X.C64333Db;
import X.C64693En;
import X.C66653Mg;
import X.C71273bq;
import X.C85924Id;
import X.C88744aj;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

public class DevicePairQrScannerActivity extends C32241pq {
    public static final long A0K;
    public static final long A0L;
    public int A00;
    public C116985rC A01;
    public AnonymousClass2VU A02;
    public C50382i5 A03;
    public AnonymousClass2JT A04;
    public C48442eu A05;
    public AnonymousClass2NO A06;
    public AnonymousClass4E3 A07;
    public C46372bW A08;
    public C29041iB A09;
    public AnonymousClass2R8 A0A;
    public AgentDeviceLoginViewModel A0B;
    public C45482a5 A0C;
    public C46122b7 A0D;
    public Runnable A0E;
    public String A0F;
    public boolean A0G;
    public final AnonymousClass4FJ A0H;
    public final AnonymousClass4FK A0I;
    public final Runnable A0J;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            C46122b7 r2 = this.A0D;
            if (i2 == 0) {
                r2.A00(4);
            } else {
                r2.A00 = r2.A02.A0H();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0K = timeUnit.toMillis(6) + 32000;
        A0L = timeUnit.toMillis(4);
    }

    public static /* synthetic */ void A0C(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        Runnable runnable = devicePairQrScannerActivity.A0E;
        if (runnable != null) {
            devicePairQrScannerActivity.A00.removeCallbacks(runnable);
        }
        devicePairQrScannerActivity.BjL();
    }

    public void A5r() {
        if (!this.A0G) {
            this.A0G = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r2 = A002.A00;
            AnonymousClass1Ha.A23(A002, r2, r2, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = (AnonymousClass5TW) A002.ASQ.get();
            this.A04 = C64333Db.A2r(A002);
            this.A03 = (C50382i5) A002.AZG.get();
            this.A0A = (AnonymousClass2R8) A002.AWC.get();
            this.A09 = C64333Db.A3S(A002);
            this.A0D = (C46122b7) r2.A3S.get();
            this.A01 = C88744aj.A00;
            this.A04 = (AnonymousClass2JT) r2.AAz.get();
            this.A06 = (AnonymousClass2NO) r2.A7k.get();
            this.A08 = (C46372bW) r2.A3T.get();
            this.A02 = (AnonymousClass2VU) r2.A4f.get();
            this.A05 = (C48442eu) A002.A5r.get();
        }
    }

    public final void A78() {
        Runnable runnable = this.A0E;
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
        }
        BjL();
        C620633i.A05(this.A08);
        finish();
    }

    public void onDestroy() {
        this.A09.A07(this.A0H);
        synchronized (this.A06.A02) {
        }
        this.A0D.A00(2);
        super.onDestroy();
    }

    public DevicePairQrScannerActivity(int i) {
        this.A0G = false;
        AnonymousClass4HY.A00(this, 99);
    }

    public void A6O(int i) {
        if (i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved) {
            this.A05.Bjp();
        } else if (i == 1000) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass4E3 r0;
        super.onCreate(bundle);
        this.A05.setShouldUseGoogleVisionScanner(true);
        C46372bW r1 = this.A08;
        if (C66653Mg.A00(r1.A02.A0M)) {
            C56612sH r5 = r1.A01;
            AnonymousClass4FS r3 = r1.A04;
            r0 = new AnonymousClass3Eo(r1.A00, r5, r1.A03, r3);
        } else {
            r0 = new C64693En();
        }
        this.A07 = r0;
        AnonymousClass2VU r02 = this.A02;
        this.A0C = new C45482a5((AnonymousClass2EJ) r02.A00.A01.A00.A4e.get(), this.A0I);
        this.A02.setText(AnonymousClass0x9.A0B(AnonymousClass002.A0F(this, "web.whatsapp.com", new Object[1], 0, R.string.f11nameremoved)));
        this.A02.setVisibility(0);
        if (this.A05.A01()) {
            String string = getString(R.string.f11nameremoved);
            C633939b r2 = new C633939b(this, 48);
            AnonymousClass5UY A1p = AnonymousClass1Ha.A1p(this, R.id.bottom_banner_stub);
            A1p.A06(0);
            ((TextView) A1p.A04()).setText(string);
            A1p.A07(r2);
        }
        this.A09.A06(this.A0H);
        synchronized (this.A06.A02) {
        }
        this.A00 = getIntent().getIntExtra("entry_point", 1);
        this.A0F = getIntent().getStringExtra("agent_id");
        AgentDeviceLoginViewModel agentDeviceLoginViewModel = (AgentDeviceLoginViewModel) AnonymousClass0x9.A0H(this).A01(AgentDeviceLoginViewModel.class);
        this.A0B = agentDeviceLoginViewModel;
        AnonymousClass1Ha.A21(this, agentDeviceLoginViewModel.A05, 177);
        AnonymousClass1Ha.A21(this, this.A0B.A06, 178);
        if (this.A04.A02("android.permission.CAMERA") == 0) {
            C46122b7 r22 = this.A0D;
            r22.A00 = r22.A02.A0H();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public DevicePairQrScannerActivity() {
        this(0);
        this.A0J = new C71273bq((Object) this, 43);
        this.A0I = new C382626p(this, 1);
        this.A0H = new C85924Id(this, 3);
    }
}
