package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0MY;
import X.AnonymousClass0O8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass33T;
import X.AnonymousClass4SG;
import X.AnonymousClass5RU;
import X.AnonymousClass67X;
import X.AnonymousClass68W;
import X.C04270Nm;
import X.C107695bk;
import X.C109435ec;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C50422i9;
import X.C619933b;
import X.C620733j;
import X.C64333Db;
import X.C86624Kv;
import X.C86654Ky;
import X.C88834as;
import X.C89644eZ;
import X.C90024fh;
import X.C90034fi;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class AppAuthSettingsActivity extends C89644eZ {
    public View A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public SwitchCompat A05;
    public SwitchCompat A06;
    public AnonymousClass0MY A07;
    public AnonymousClass0O8 A08;
    public C50422i9 A09;
    public FingerprintBottomSheet A0A;
    public AnonymousClass33T A0B;
    public C619933b A0C;
    public AnonymousClass5RU A0D;
    public boolean A0E;
    public final C90034fi A0F;

    public static /* synthetic */ void A0C(AppAuthSettingsActivity appAuthSettingsActivity) {
        boolean z = !appAuthSettingsActivity.A06.isChecked();
        C18270x1.A0l(AnonymousClass4SG.A2P(appAuthSettingsActivity), "privacy_fingerprint_show_notification_content", z);
        appAuthSettingsActivity.A06.setChecked(z);
        appAuthSettingsActivity.A0B.A05(1, "AppAuthSettingsActivity");
        appAuthSettingsActivity.A0C.A07();
        appAuthSettingsActivity.A09.A01();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.authentication.SetupDeviceAuthDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.authentication.FingerprintBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.authentication.SetupDeviceAuthDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.authentication.SetupDeviceAuthDialog} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0L(com.whatsapp.authentication.AppAuthSettingsActivity r3) {
        /*
            androidx.appcompat.widget.SwitchCompat r0 = r3.A05
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004b
            X.5Ug r0 = r3.A04
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "AppAuthSettingsActivity/show-bottom-sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Ug r0 = r3.A04
            X.1VX r1 = r0.A05
            r0 = 266(0x10a, float:3.73E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x002b
            X.0O8 r1 = r3.A08
            X.0MY r0 = r3.A07
            r1.A01(r0)
            return
        L_0x002b:
            r2 = 2131889365(0x7f120cd5, float:1.9413392E38)
            r1 = 2131889364(0x7f120cd4, float:1.941339E38)
            r0 = 0
            com.whatsapp.authentication.FingerprintBottomSheet r1 = com.whatsapp.authentication.FingerprintBottomSheet.A00(r2, r1, r0, r0)
            r3.A0A = r1
            X.4fi r0 = r3.A0F
            r1.A05 = r0
            goto L_0x0047
        L_0x003d:
            java.lang.String r0 = "AppAuthSettingsActivity/setup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.authentication.SetupDeviceAuthDialog r1 = new com.whatsapp.authentication.SetupDeviceAuthDialog
            r1.<init>()
        L_0x0047:
            r3.Boo(r1)
            return
        L_0x004b:
            r3.A74()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.authentication.AppAuthSettingsActivity.A0L(com.whatsapp.authentication.AppAuthSettingsActivity):void");
    }

    public void A5r() {
        if (!this.A0E) {
            this.A0E = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A09 = (C50422i9) r2.AbY.get();
            this.A0C = C86624Kv.A0V(r2);
            this.A0B = (AnonymousClass33T) r2.Aaf.get();
            this.A0D = A2W.AD7();
        }
    }

    public final void A74() {
        Log.i("AppAuthSettingsActivity/disable-setting");
        this.A04.A03(true);
        C18270x1.A0l(C18270x1.A03(this.A09), "privacy_fingerprint_enabled", false);
        this.A0C.A07();
        A75(false);
        this.A05.setChecked(false);
        this.A09.A01();
        this.A04.A01(this);
    }

    public final void A75(boolean z) {
        Log.i("AppAuthSettingsActivity/update-dependent-views");
        int i = 0;
        this.A01.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        View view = this.A00;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public AppAuthSettingsActivity(int i) {
        this.A0E = false;
        AnonymousClass68W.A00(this, 8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        int A2I = AnonymousClass1Hf.A2I(this);
        TextView A0L = C18310x6.A0L(this, R.id.security_settings_title);
        TextView A0L2 = C18310x6.A0L(this, R.id.security_settings_desc);
        if (this.A04.A05.A0X(266)) {
            setTitle(R.string.f11nameremoved);
            A0L.setText(R.string.f11nameremoved);
            A0L2.setText(R.string.f11nameremoved);
            this.A08 = new AnonymousClass0O8(new AnonymousClass67X(this, 0), this, AnonymousClass0Y8.A09(this));
            C04270Nm r1 = new C04270Nm();
            r1.A01 = getString(R.string.f11nameremoved);
            r1.A03 = getString(R.string.f11nameremoved);
            r1.A05 = false;
            r1.A04 = false;
            this.A07 = r1.A00();
        } else {
            setTitle(R.string.f11nameremoved);
            A0L.setText(R.string.f11nameremoved);
            A0L2.setText(R.string.f11nameremoved);
            if (bundle != null) {
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) getSupportFragmentManager().A0D(FingerprintBottomSheet.class.getName());
                this.A0A = fingerprintBottomSheet;
                if (fingerprintBottomSheet != null) {
                    fingerprintBottomSheet.A05 = this.A0F;
                }
            }
        }
        this.A01 = findViewById(R.id.timeout);
        this.A05 = (SwitchCompat) findViewById(R.id.app_auth_settings_switch);
        this.A00 = findViewById(R.id.notification_preference);
        this.A06 = (SwitchCompat) findViewById(R.id.notification_content_switch);
        C18280x3.A0p(findViewById(R.id.app_auth_settings_preference), this, 38);
        C18280x3.A0p(this.A00, this, 39);
        this.A02 = (RadioButton) findViewById(R.id.timeout_immediately);
        this.A03 = (RadioButton) findViewById(R.id.timeout_one_min);
        this.A04 = (RadioButton) findViewById(R.id.timeout_thirty_min);
        this.A02.setText(R.string.f11nameremoved);
        RadioButton radioButton = this.A03;
        C620733j r4 = this.A00;
        Object[] objArr = new Object[A2I];
        AnonymousClass000.A1P(objArr, A2I, 0);
        radioButton.setText(r4.A0L(objArr, R.plurals.f9nameremoved, 1));
        RadioButton radioButton2 = this.A04;
        C620733j r3 = this.A00;
        Object[] objArr2 = new Object[A2I];
        AnonymousClass000.A1P(objArr2, 30, 0);
        radioButton2.setText(r3.A0L(objArr2, R.plurals.f9nameremoved, 30));
        this.A02.setOnClickListener(new C109435ec(this, 0));
        this.A03.setOnClickListener(new C109435ec(this, 60000));
        this.A04.setOnClickListener(new C109435ec(this, 1800000));
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0O8 r0 = this.A08;
        if (r0 != null) {
            r0.A00();
            this.A08 = null;
        }
        FingerprintBottomSheet fingerprintBottomSheet = this.A0A;
        if (fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A05 = null;
            this.A0A = null;
        }
    }

    public void onResume() {
        super.onResume();
        Log.i("AppAuthSettingsActivity/update-ui");
        boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "privacy_fingerprint_enabled");
        long j = AnonymousClass0x2.A0F(this.A09).getLong("privacy_fingerprint_timeout", 60000);
        boolean A1T = C86654Ky.A1T(AnonymousClass1Hf.A27(this), "privacy_fingerprint_show_notification_content");
        A75(A1W);
        C18260x0.A12("AppAuthSettingsActivity/update-timeout: ", AnonymousClass001.A0o(), j);
        boolean z = true;
        this.A02.setChecked(AnonymousClass000.A1T((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        this.A03.setChecked(AnonymousClass000.A1T((j > 60000 ? 1 : (j == 60000 ? 0 : -1))));
        RadioButton radioButton = this.A04;
        if (j != 1800000) {
            z = false;
        }
        radioButton.setChecked(z);
        this.A05.setChecked(A1W);
        this.A06.setChecked(A1T);
        this.A0D.A02(this.A00, "screen_lock", getIntent().getStringExtra("search_result_key"));
    }

    public AppAuthSettingsActivity() {
        this(0);
        this.A0F = new C90024fh(this);
    }
}
