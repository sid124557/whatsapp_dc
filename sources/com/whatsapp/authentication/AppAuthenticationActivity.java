package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0MY;
import X.AnonymousClass0O8;
import X.AnonymousClass0QU;
import X.AnonymousClass0Y8;
import X.AnonymousClass4SG;
import X.AnonymousClass5ZC;
import X.AnonymousClass64D;
import X.AnonymousClass67X;
import X.AnonymousClass68W;
import X.C04270Nm;
import X.C105275Ug;
import X.C107695bk;
import X.C1229066h;
import X.C1233067x;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C50422i9;
import X.C58152un;
import X.C625635p;
import X.C626936e;
import X.C64333Db;
import X.C70043Zq;
import X.C86614Ku;
import X.C89654ea;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.security.Signature;

public final class AppAuthenticationActivity extends C89654ea implements C1229066h, AnonymousClass64D {
    public int A00;
    public int A01;
    public AnonymousClass0MY A02;
    public AnonymousClass0O8 A03;
    public AnonymousClass0QU A04;
    public C50422i9 A05;
    public C105275Ug A06;
    public FingerprintView A07;
    public Runnable A08;
    public boolean A09;
    public boolean A0A;

    public static /* synthetic */ void A0L(AppAuthenticationActivity appAuthenticationActivity) {
        appAuthenticationActivity.A01 = 2;
        appAuthenticationActivity.A03.A01(appAuthenticationActivity.A02);
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            this.A0B = C107695bk.A1l(A2Y.A00);
            this.A05 = (C50422i9) A2Y.AbY.get();
            this.A06 = (C105275Ug) A2Y.A0q.get();
        }
    }

    public final void A6j() {
        if (this.A00 != 0) {
            this.A05.A01();
            Intent A072 = C18320x8.A07();
            A072.putExtra("appWidgetId", this.A00);
            setResult(-1, A072);
            return;
        }
        setResult(-1);
    }

    public final void A6k() {
        Log.i("AuthenticationActivity/start-listening");
        this.A07.removeCallbacks(this.A08);
        AnonymousClass0QU r2 = new AnonymousClass0QU();
        this.A04 = r2;
        C105275Ug r1 = this.A06;
        C626936e.A0C(r1.A06());
        r1.A00.AxV(r2, this);
        FingerprintView fingerprintView = this.A07;
        fingerprintView.A01(fingerprintView.A06);
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void BMx(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-error");
        this.A06.A03(true);
        if (i == 7) {
            Log.i("AppAuthenticationActivity/fingerprint-error-too-many-attempts");
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 30);
            charSequence = getString(R.string.f11nameremoved, objArr);
            this.A07.removeCallbacks(this.A08);
            this.A07.postDelayed(this.A08, C625635p.A0L);
        }
        this.A07.A02(charSequence);
    }

    public void BMy() {
        Log.i("AppAuthenticationActivity/fingerprint-failed");
        FingerprintView fingerprintView = this.A07;
        fingerprintView.A03(fingerprintView.getContext().getString(R.string.f11nameremoved));
    }

    public void BN0(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-help");
        this.A07.A03(charSequence.toString());
    }

    public void BN1(byte[] bArr) {
        Log.i("AppAuthenticationActivity/fingerprint-success");
        this.A06.A03(false);
        this.A07.A00();
    }

    public void onBackPressed() {
        ActivityManager A062 = this.A08.A06();
        if (A062 == null || A062.getLockTaskModeState() != 2) {
            setResult(0);
            finishAffinity();
        }
    }

    public AppAuthenticationActivity(int i) {
        this.A09 = false;
        AnonymousClass68W.A00(this, 9);
    }

    public /* synthetic */ void BN2(Signature signature) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A0D = C86614Ku.A0D(this);
        if (A0D != null) {
            this.A00 = A0D.getInt("appWidgetId", 0);
        }
        if (!this.A06.A05()) {
            Log.i("AppAuthenticationActivity/onCreate: setting not enabled");
            A6j();
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        this.A0A = this.A06.A05.A0X(266);
        setContentView((int) R.layout.f8nameremoved);
        C18310x6.A0L(this, R.id.auth_title).setText(R.string.f11nameremoved);
        View findViewById = findViewById(R.id.app_unlock);
        this.A07 = (FingerprintView) findViewById(R.id.fingerprint_view);
        if (this.A0A) {
            findViewById.setVisibility(0);
            this.A07.setVisibility(8);
            this.A03 = new AnonymousClass0O8(new AnonymousClass67X(this, 1), this, AnonymousClass0Y8.A09(this));
            C04270Nm r1 = new C04270Nm();
            r1.A03 = getString(R.string.f11nameremoved);
            r1.A05 = true;
            r1.A04 = false;
            this.A02 = r1.A00();
            C18280x3.A0p(findViewById, this, 40);
            return;
        }
        findViewById.setVisibility(8);
        this.A07.setVisibility(0);
        this.A07.A00 = new C1233067x(this, 0);
        this.A08 = new C70043Zq(this, 42);
    }

    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A07;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    public void onPause() {
        super.onPause();
        if (!this.A0A) {
            Log.i("AuthenticationActivity/stop-listening");
            this.A07.removeCallbacks(this.A08);
            AnonymousClass0QU r0 = this.A04;
            if (r0 != null) {
                try {
                    r0.A01();
                } catch (NullPointerException e) {
                    Log.d(AnonymousClass000.A0a("AuthenticationActivity/stop-listening exception=", AnonymousClass001.A0o(), e));
                } catch (Throwable th) {
                    this.A04 = null;
                    throw th;
                }
                this.A04 = null;
            }
        } else if (this.A01 == 3) {
            this.A01 = 1;
            this.A03.A00();
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.A0A) {
            A6k();
        }
    }

    public void onStart() {
        super.onStart();
        if (!this.A06.A04()) {
            Log.i("AppAuthenticationActivity/not-enrolled");
            C18290x4.A18(this);
        } else if (this.A0A && this.A01 == 1) {
            this.A01 = 2;
            this.A03.A01(this.A02);
        }
    }

    public AppAuthenticationActivity() {
        this(0);
        this.A01 = 1;
    }
}
