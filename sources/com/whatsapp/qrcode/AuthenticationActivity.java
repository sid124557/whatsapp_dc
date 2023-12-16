package com.whatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0QU;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C105275Ug;
import X.C107695bk;
import X.C1229066h;
import X.C1233067x;
import X.C18290x4;
import X.C18310x6;
import X.C625635p;
import X.C626936e;
import X.C64333Db;
import X.C71273bq;
import X.C89654ea;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.util.Log;
import java.security.Signature;

public class AuthenticationActivity extends C89654ea implements C1229066h {
    public AnonymousClass0QU A00;
    public C105275Ug A01;
    public FingerprintView A02;
    public Runnable A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            this.A0B = C107695bk.A1l(A2Y.A00);
            this.A01 = (C105275Ug) A2Y.A0q.get();
        }
    }

    public final void A6j() {
        Log.i("AuthenticationActivity/start-listening");
        this.A02.removeCallbacks(this.A03);
        AnonymousClass0QU r2 = new AnonymousClass0QU();
        this.A00 = r2;
        C105275Ug r1 = this.A01;
        C626936e.A0C(r1.A06());
        r1.A00.AxV(r2, this);
        FingerprintView fingerprintView = this.A02;
        fingerprintView.A01(fingerprintView.A06);
    }

    public void BMx(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-error");
        if (i == 7) {
            Log.i("AuthenticationActivity/fingerprint-error-too-many-attempts");
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L, 30);
            charSequence = getString(R.string.f11nameremoved, A0L);
            this.A02.removeCallbacks(this.A03);
            this.A02.postDelayed(this.A03, C625635p.A0L);
        }
        this.A02.A02(charSequence);
    }

    public void BMy() {
        Log.i("AuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A02;
        fingerprintView.A03(fingerprintView.getContext().getString(R.string.f11nameremoved));
    }

    public void BN0(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-help");
        this.A02.A03(charSequence.toString());
    }

    public void BN1(byte[] bArr) {
        Log.i("AuthenticationActivity/fingerprint-success");
        this.A02.A00();
    }

    public AuthenticationActivity(int i) {
        this.A04 = false;
        AnonymousClass68W.A00(this, 77);
    }

    public /* synthetic */ void BN2(Signature signature) {
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A01.A04()) {
            Log.i("AuthenticationActivity/onCreate: setting not enabled");
            C18290x4.A18(this);
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView((int) R.layout.f8nameremoved);
        C18310x6.A0L(this, R.id.auth_title).setText(getIntent().getStringExtra("extra_auth_title"));
        FingerprintView fingerprintView = (FingerprintView) findViewById(R.id.fingerprint_view);
        this.A02 = fingerprintView;
        fingerprintView.A00 = new C1233067x(this, 1);
        this.A03 = new C71273bq((Object) this, 40);
    }

    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A02;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        this.A02.removeCallbacks(this.A03);
        AnonymousClass0QU r0 = this.A00;
        if (r0 != null) {
            try {
                r0.A01();
            } catch (NullPointerException e) {
                Log.d(AnonymousClass000.A0a("AuthenticationActivity/stop-listening exception=", AnonymousClass001.A0o(), e));
            } catch (Throwable th) {
                this.A00 = null;
                throw th;
            }
            this.A00 = null;
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.A01.A04()) {
            Log.i("AuthenticationActivity/not-enrolled");
            C18290x4.A18(this);
            return;
        }
        A6j();
    }

    public AuthenticationActivity() {
        this(0);
    }
}
