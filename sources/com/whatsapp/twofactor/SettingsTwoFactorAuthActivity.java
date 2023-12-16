package com.whatsapp.twofactor;

import X.AnonymousClass000;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107335b8;
import X.C107405bG;
import X.C107695bk;
import X.C117095rN;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C58422vE;
import X.C613130e;
import X.C626936e;
import X.C627136h;
import X.C64333Db;
import X.C84674Dg;
import X.C85874Hy;
import X.C89644eZ;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public class SettingsTwoFactorAuthActivity extends C89644eZ implements C84674Dg {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C613130e A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final Runnable A0E;

    public class ConfirmDisableDialog extends Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog {
        public Dialog A1J(Bundle bundle) {
            C19340zH A0H = C18320x8.A0H(this);
            A0H.A0T(R.string.f11nameremoved);
            C19340zH.A08(A0H, this, C627136h.A03, R.string.f11nameremoved);
            C19340zH.A05(A0H);
            return A0H.create();
        }
    }

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A0A = (C613130e) r0.ABh.get();
        }
    }

    public void Bel(int i) {
        Log.d("SettingsTwoFactorAuthActivity/on-two-factor-auth-settings-refresh-error");
        this.A0D.removeCallbacks(this.A0E);
        BjL();
        if (i == 405) {
            Box(new Object[0], R.string.f11nameremoved, R.string.f11nameremoved);
        } else {
            Bot(R.string.f11nameremoved);
        }
        this.A04.BkP(new C117095rN(this, 12));
    }

    public void Bem() {
        Log.d("SettingsTwoFactorAuthActivity/on-two-factor-auth-settings-refreshed");
        this.A0D.removeCallbacks(this.A0E);
        BjL();
        this.A04.BkP(new C117095rN(this, 12));
        this.A05.A0H(R.string.f11nameremoved, 1);
    }

    public SettingsTwoFactorAuthActivity(int i) {
        this.A0B = false;
        AnonymousClass4HY.A00(this, 126);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass1Ha.A1y(this.A05.getViewTreeObserver(), this, 4);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A05 = (ScrollView) findViewById(R.id.scroll_view);
        this.A04 = (ImageView) findViewById(R.id.logo);
        this.A03 = findViewById(R.id.enable_panel);
        this.A02 = findViewById(R.id.disable_panel_divider);
        this.A01 = findViewById(R.id.disable_panel);
        this.A08 = C18310x6.A0L(this, R.id.description);
        this.A06 = C18310x6.A0L(this, R.id.change_code_button);
        this.A07 = C18310x6.A0L(this, R.id.change_email_button);
        AnonymousClass1VX r1 = this.A0D;
        C58422vE r3 = C58422vE.A02;
        boolean A0Y = r1.A0Y(r3, 5711);
        this.A0C = A0Y;
        if (A0Y) {
            this.A09 = C18310x6.A0L(this, R.id.disable_button_v2);
            i = R.id.disable_button;
        } else {
            this.A09 = C18310x6.A0L(this, R.id.disable_button);
            i = R.id.disable_button_v2;
        }
        C18280x3.A0r(this, i, 8);
        C18280x3.A0o(findViewById(R.id.enable_button), this, 42);
        C18280x3.A0o(this.A09, this, 43);
        C18280x3.A0o(this.A06, this, 44);
        boolean A0Y2 = this.A0D.A0Y(r3, 5156);
        TextView textView = this.A07;
        if (A0Y2) {
            textView.setVisibility(8);
        } else {
            C18280x3.A0o(textView, this, 45);
        }
        if (Build.VERSION.SDK_INT < 23) {
            int A002 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
            C107335b8.A0F(this.A09, A002);
            C107335b8.A0F(this.A06, A002);
            C107335b8.A0F(this.A07, A002);
        }
        this.A00 = AnonymousClass1Ha.A1i(this);
        this.A05.getViewTreeObserver().addOnScrollChangedListener(new C85874Hy(this, 5));
        AnonymousClass1Ha.A1y(this.A05.getViewTreeObserver(), this, 4);
    }

    public void onPause() {
        super.onPause();
        List list = this.A0A.A0D;
        C626936e.A0C(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        List list = this.A0A.A0D;
        C626936e.A0C(!list.contains(this));
        list.add(this);
        this.A04.BkP(new C117095rN(this, 12));
    }

    public SettingsTwoFactorAuthActivity() {
        this(0);
        this.A0D = AnonymousClass000.A0A();
        this.A0E = new C117095rN(this, 13);
    }
}
