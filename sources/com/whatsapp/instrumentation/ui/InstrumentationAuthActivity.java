package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass2OK;
import X.AnonymousClass3DZ;
import X.AnonymousClass48E;
import X.AnonymousClass48F;
import X.AnonymousClass4HY;
import X.AnonymousClass4HZ;
import X.AnonymousClass5XU;
import X.C08240dc;
import X.C107695bk;
import X.C18320x8;
import X.C34211uP;
import X.C48112eN;
import X.C50862it;
import X.C54292oU;
import X.C619332v;
import X.C619933b;
import X.C621533t;
import X.C626936e;
import X.C64333Db;
import X.C66523Lt;
import X.C89644eZ;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.util.Log;

public class InstrumentationAuthActivity extends C89644eZ implements AnonymousClass48E, AnonymousClass48F {
    public AnonymousClass5XU A00;
    public C50862it A01;
    public C54292oU A02;
    public BiometricAuthPlugin A03;
    public AnonymousClass2OK A04;
    public ConfirmFragment A05;
    public PermissionsFragment A06;
    public C619332v A07;
    public C34211uP A08;
    public C48112eN A09;
    public C66523Lt A0A;
    public C619933b A0B;
    public String A0C;
    public boolean A0D;

    public void onCreate(Bundle bundle) {
        String A0V;
        int i;
        String str;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        if (!AnonymousClass2OK.A00(this.A04)) {
            Log.d("InstrumentationAuthActivity/Service disabled");
            i = 3;
            str = "Feature is disabled!";
        } else {
            ComponentName callingActivity = getCallingActivity();
            if (callingActivity == null) {
                A0V = "Not started for result.";
            } else {
                String packageName = callingActivity.getPackageName();
                try {
                    if (this.A08.A01(packageName).A03) {
                        Intent intent = getIntent();
                        String str2 = null;
                        if (!(intent == null || getCallingPackage() == null)) {
                            str2 = intent.getStringExtra("request_token");
                        }
                        this.A0C = str2;
                        if (!this.A09.A01(packageName, str2)) {
                            Log.e("InstrumentationAuthActivity/onCreate no correct request token!");
                            i = 4;
                            str = "Request is not authorized!";
                        } else {
                            setContentView((int) R.layout.f8nameremoved);
                            AnonymousClass1VX r10 = this.A0D;
                            this.A03 = new BiometricAuthPlugin(this, this.A03, this.A05, this.A08, new AnonymousClass4HZ(this, 1), r10, R.string.f11nameremoved, 0);
                            Intent intent2 = getIntent();
                            int i2 = 0;
                            if (intent2 != null) {
                                i2 = intent2.getIntExtra("content_variant", 0);
                            }
                            PermissionsFragment permissionsFragment = new PermissionsFragment();
                            Bundle A082 = AnonymousClass002.A08();
                            A082.putInt("content_variant", i2);
                            permissionsFragment.A0u(A082);
                            this.A06 = permissionsFragment;
                            ConfirmFragment confirmFragment = new ConfirmFragment();
                            Bundle A083 = AnonymousClass002.A08();
                            A083.putInt("content_variant", i2);
                            confirmFragment.A0u(A083);
                            this.A05 = confirmFragment;
                            if (bundle == null) {
                                C08240dc A0J = AnonymousClass0x2.A0J(this);
                                A0J.A09(this.A06, R.id.fragment_container);
                                A0J.A01();
                            }
                            if (this.A00.A03()) {
                                Log.w("InstrumentationAuthActivity/onCreate/clock-wrong");
                                C621533t.A02(this, this.A0A, this.A0B);
                            } else if (this.A00.A02()) {
                                Log.w("InstrumentationAuthActivity/onCreate/sw-expired");
                                C621533t.A03(this, this.A0A, this.A0B);
                            }
                            AnonymousClass0R8 supportActionBar = getSupportActionBar();
                            C626936e.A06(supportActionBar);
                            supportActionBar.A0N(true);
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                A0V = AnonymousClass000.A0V("Untrusted caller: ", packageName, AnonymousClass001.A0o());
            }
            A74(8, A0V);
            return;
        }
        A74(i, str);
    }

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (AnonymousClass5XU) A002.AU0.get();
            this.A09 = (C48112eN) A002.AYw.get();
            this.A0A = (C66523Lt) A002.ALF.get();
            this.A0B = (C619933b) A002.ALS.get();
            this.A02 = C64333Db.A2q(A002);
            this.A01 = (C50862it) A002.A0l.get();
            this.A04 = (AnonymousClass2OK) A002.AHr.get();
            this.A08 = (C34211uP) A002.AI2.get();
            this.A07 = (C619332v) r1.A6Z.get();
        }
    }

    public InstrumentationAuthActivity(int i) {
        this.A0D = false;
        AnonymousClass4HY.A00(this, 72);
    }

    public final void A74(int i, String str) {
        Intent A072 = C18320x8.A07();
        A072.putExtra("error_code", i);
        A072.putExtra("error_message", str);
        setResult(0, A072);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 12345) {
            return;
        }
        if (i2 == -1 || i2 == 4) {
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A0A(this.A05, R.id.fragment_container);
            A0J.A0I((String) null);
            A0J.A01();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.A05.A16()) {
            return super.onOptionsItemSelected(menuItem);
        }
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A0A(this.A06, R.id.fragment_container);
        A0J.A01();
        return true;
    }

    public void onResume() {
        super.onResume();
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A0A(this.A06, R.id.fragment_container);
        A0J.A01();
    }

    public InstrumentationAuthActivity() {
        this(0);
    }
}
