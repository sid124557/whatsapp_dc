package com.whatsapp.twofactor;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5Yj;
import X.C06560Yg;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C107695bk;
import X.C117095rN;
import X.C18260x0;
import X.C58422vE;
import X.C613130e;
import X.C626936e;
import X.C64333Db;
import X.C71563cJ;
import X.C84674Dg;
import X.C89644eZ;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public class TwoFactorAuthActivity extends C89644eZ implements C84674Dg {
    public static final int[] A0B = {R.id.page_indicator_1, R.id.page_indicator_2, R.id.page_indicator_3};
    public AnonymousClass0R8 A00;
    public C613130e A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public int[] A08;
    public final Handler A09;
    public final Runnable A0A;

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = (C613130e) r0.ABh.get();
        }
    }

    public boolean A77(C08310eF r4) {
        if (this.A08.length == 1 || r4.getClass() == SetEmailFragment.class) {
            return true;
        }
        return false;
    }

    public void Bel(int i) {
        Log.d("TwoFactorAuthActivity/onTwoFactorAuthSettingsRefreshError");
        Handler handler = this.A09;
        handler.removeCallbacks(this.A0A);
        handler.postDelayed(new C71563cJ((Object) this, i, 20), 700);
    }

    public void Bem() {
        Log.d("TwoFactorAuthActivity/onTwoFactorAuthSettingsRefreshed");
        Handler handler = this.A09;
        handler.removeCallbacks(this.A0A);
        handler.postDelayed(new C117095rN(this, 14), 700);
    }

    public TwoFactorAuthActivity(int i) {
        this.A07 = false;
        AnonymousClass4HY.A00(this, 127);
    }

    public void A74(View view, int i) {
        View A022 = C06560Yg.A02(view, R.id.page_indicator);
        if (this.A0D.A0Y(C58422vE.A02, 5711)) {
            A022.setVisibility(8);
            return;
        }
        int i2 = 0;
        A022.setVisibility(0);
        while (i2 < i) {
            i2++;
            AnonymousClass0x2.A0p(this, AnonymousClass0x9.A0F(view, A0B[i2]), AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        int length = this.A08.length;
        while (true) {
            length++;
            int[] iArr = A0B;
            if (length < iArr.length) {
                view.findViewById(iArr[length]).setVisibility(8);
            } else {
                return;
            }
        }
    }

    public void A75(C08310eF r6, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1T(A0o, "TwoFactorAuthActivity/navigate-to fragment=", r6);
        C18260x0.A1D(" add=", A0o, z);
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A02 = R.anim.f0nameremoved;
        A0J.A03 = R.anim.f0nameremoved;
        A0J.A05 = R.anim.f0nameremoved;
        A0J.A06 = R.anim.f0nameremoved;
        A0J.A0A(r6, R.id.container);
        if (z) {
            A0J.A0I((String) null);
        }
        A0J.A01();
    }

    public void A76(boolean z) {
        Bp9(R.string.f11nameremoved);
        this.A09.postDelayed(this.A0A, C613130e.A0F);
        this.A01.A01 = z;
        this.A04.BkP(new C117095rN(this, 15));
    }

    public void onCreate(Bundle bundle) {
        C08310eF setCodeFragment;
        super.onCreate(bundle);
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        AnonymousClass0R8 A1l = AnonymousClass1Ha.A1l(this, R.string.f11nameremoved);
        this.A00 = A1l;
        boolean z = true;
        if (A1l != null) {
            A1l.A0N(true);
        }
        setContentView((int) R.layout.f8nameremoved);
        int[] intArrayExtra = getIntent().getIntArrayExtra("workflows");
        C626936e.A06(intArrayExtra);
        this.A08 = intArrayExtra;
        if (intArrayExtra.length <= 0) {
            z = false;
        }
        C626936e.A0C(z);
        String stringExtra = getIntent().getStringExtra("primaryCTA");
        C626936e.A06(stringExtra);
        this.A06 = stringExtra;
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        int i = this.A08[0];
        if (i == 1) {
            Bundle A082 = AnonymousClass002.A08();
            A082.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
            setCodeFragment = new SetCodeFragment();
            setCodeFragment.A0u(A082);
        } else if (i == 2) {
            setCodeFragment = SetEmailFragment.A00(1);
        } else {
            throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Invalid work flow:", AnonymousClass001.A0o(), i));
        }
        A0J.A0A(setCodeFragment, R.id.container);
        A0J.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C08270df supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.A07() > 0) {
                supportFragmentManager.A0M();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        List list = this.A01.A0D;
        C626936e.A0C(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        List list = this.A01.A0D;
        C626936e.A0C(!list.contains(this));
        list.add(this);
    }

    public TwoFactorAuthActivity() {
        this(0);
        this.A09 = AnonymousClass000.A0A();
        this.A0A = new C117095rN(this, 16);
    }
}
