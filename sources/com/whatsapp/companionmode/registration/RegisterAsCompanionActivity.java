package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass0XZ;
import X.AnonymousClass0x9;
import X.AnonymousClass25P;
import X.AnonymousClass317;
import X.AnonymousClass36l;
import X.AnonymousClass4SG;
import X.AnonymousClass5V0;
import X.AnonymousClass5Yj;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C005205m;
import X.C102805Ki;
import X.C107335b8;
import X.C107695bk;
import X.C110125fj;
import X.C116985rC;
import X.C1235268t;
import X.C18260x0;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C19340zH;
import X.C46362bV;
import X.C50102hd;
import X.C52282lE;
import X.C54292oU;
import X.C54552ou;
import X.C56502s5;
import X.C614930z;
import X.C620733j;
import X.C627736r;
import X.C64333Db;
import X.C72343dZ;
import X.C86614Ku;
import X.C86664Kz;
import X.C87044Mw;
import X.C88744aj;
import X.C89644eZ;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.QrImageView;
import com.whatsapp.R;

public class RegisterAsCompanionActivity extends C89644eZ {
    public LinearLayout A00;
    public ProgressBar A01;
    public C116985rC A02;
    public QrImageView A03;
    public C46362bV A04;
    public C52282lE A05;
    public C54552ou A06;
    public CompanionRegistrationViewModel A07;
    public C54292oU A08;
    public C620733j A09;
    public C50102hd A0A;
    public AnonymousClass317 A0B;
    public C56502s5 A0C;
    public C183538qC A0D;
    public boolean A0E;

    public void A5r() {
        if (!this.A0E) {
            this.A0E = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r2 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r2, this, AnonymousClass4SG.A2t(A2Y, r2, this));
            this.A08 = C64333Db.A2q(A2Y);
            this.A02 = C88744aj.A00;
            this.A0C = AnonymousClass4SG.A2q(r2);
            this.A09 = C64333Db.A2t(A2Y);
            this.A0D = C72343dZ.A00(A2Y.A0Q);
            this.A0A = (C50102hd) r2.A50.get();
            this.A0B = C86614Ku.A0i(A2Y);
            this.A05 = (C52282lE) A2Y.A5z.get();
            this.A04 = (C46362bV) A2Y.A5o.get();
            this.A06 = (C54552ou) A2Y.A5k.get();
        }
    }

    public final void A74() {
        String str = ((C614930z) this.A0D.get()).A03;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass25P.A00(this, (C614930z) this.A0D.get(), str);
            return;
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0U(R.string.f11nameremoved);
        A002.A0i(false);
        String string = getString(R.string.f11nameremoved);
        A002.A00.A0I(C1235268t.A00(this, 26), string);
        A002.A0S();
    }

    public final void A75() {
        String str;
        this.A0B.A0B(1, true);
        C56502s5 r2 = this.A0C;
        if (this.A06.A01()) {
            str = "register_as_companion_phone";
        } else {
            str = "register_as_companion";
        }
        r2.A04(str, "tapped");
        startActivity(C627736r.A04(this));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        ViewGroup A0m = C86664Kz.A0m(this, 16908290);
        boolean A012 = this.A06.A01();
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = R.layout.f8nameremoved;
        if (A012) {
            i = R.layout.f8nameremoved;
        }
        layoutInflater.inflate(i, A0m);
        CompanionRegistrationViewModel companionRegistrationViewModel = (CompanionRegistrationViewModel) AnonymousClass0x9.A0H(this).A01(CompanionRegistrationViewModel.class);
        this.A07 = companionRegistrationViewModel;
        AnonymousClass6C6.A01(this, companionRegistrationViewModel.A00, 158);
        AnonymousClass6C6.A01(this, this.A07.A01, 159);
        AnonymousClass6C6.A01(this, this.A07.A02, 160);
        TextView A0L = C18310x6.A0L(this, R.id.companion_registration_title);
        this.A06.A01();
        A0L.setText(R.string.f11nameremoved);
        TextView A0L2 = C18310x6.A0L(this, R.id.companion_registration_subtitle);
        boolean A013 = this.A06.A01();
        int i2 = R.string.f11nameremoved;
        if (A013) {
            i2 = R.string.f11nameremoved;
        }
        A0L2.setText(i2);
        QrImageView qrImageView = (QrImageView) findViewById(R.id.registration_qr);
        this.A03 = qrImageView;
        qrImageView.setVisibility(4);
        this.A03.setContentDescription(C54292oU.A00(this.A08).getString(R.string.f11nameremoved));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.reload_qr_layout);
        this.A00 = linearLayout;
        linearLayout.setVisibility(4);
        this.A01 = (ProgressBar) findViewById(R.id.loading_spinner);
        C18310x6.A0L(this, R.id.companion_registration_linking_instructions_step_one).setText(R.string.f11nameremoved);
        TextView A0L3 = C18310x6.A0L(this, R.id.companion_registration_linking_instructions_step_two);
        Spanned A0B2 = AnonymousClass0x9.A0B(getString(R.string.f11nameremoved));
        CharSequence A032 = C87044Mw.A03(A0L3.getPaint(), C107335b8.A0B(C18310x6.A0G(this, R.drawable.ic_ios_settings), C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved)), A0B2, "[settings_icon]");
        A0L3.setText(C87044Mw.A03(A0L3.getPaint(), C107335b8.A0B(C18310x6.A0G(this, R.drawable.vec_ic_more), C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved)), A032, "[overflow_menu_icon]"));
        C18280x3.A1E(getString(R.string.f11nameremoved), C18310x6.A0L(this, R.id.companion_registration_linking_instructions_step_three));
        if (C102805Ki.A00(this.A09)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.linking_instructions_constraint_layout);
            AnonymousClass0XZ r1 = new AnonymousClass0XZ();
            r1.A0B(constraintLayout);
            r1.A07(R.id.companion_registration_linking_instructions_step_one);
            r1.A07(R.id.companion_registration_linking_instructions_step_two);
            r1.A07(R.id.companion_registration_linking_instructions_step_three);
            r1.A07(R.id.companion_registration_linking_instructions_step_four);
            r1.A09(constraintLayout);
        }
        C18310x6.A17(findViewById(R.id.reload_qr_button), this, 13);
        View findViewById = findViewById(R.id.scroll_view);
        if (findViewById != null) {
            Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.title_toolbar);
            ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(AnonymousClass5Yj.A01(this)));
            colorDrawable.setAlpha(0);
            toolbar.setBackground(colorDrawable);
            findViewById.getViewTreeObserver().addOnScrollChangedListener(new C110125fj(colorDrawable, findViewById, toolbar, (int) getTheme().obtainStyledAttributes(new int[]{16843499}).getDimension(0, 0.0f)));
        }
        String stringExtra = getIntent().getStringExtra("entry_point");
        C18260x0.A0q("RegisterAsCompanionActivity/onCreate entry=", stringExtra, AnonymousClass001.A0o());
        if (!"entry_eula".equals(stringExtra)) {
            this.A05.A01(2);
        }
        AnonymousClass36l.A0K(A0m, this, this.A09, R.id.title_toolbar, false, this.A06.A01(), false);
        C56502s5 r12 = this.A0C;
        if (A012) {
            str = "register_as_companion_phone";
        } else {
            str = "register_as_companion";
        }
        r12.A02(str);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A06.A01()) {
            menu.add(0, 0, 0, R.string.f11nameremoved);
        } else {
            menu.add(0, 2, 0, R.string.f11nameremoved);
        }
        this.A06.A00();
        menu.add(0, 1, 0, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public RegisterAsCompanionActivity(int i) {
        this.A0E = false;
        AnonymousClass68W.A00(this, 32);
    }

    public void onBackPressed() {
        if ("entry_phone_reg".equals(getIntent().getStringExtra("entry_point")) && this.A06.A01()) {
            A75();
        }
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0A.A01(this, "RegisterAsCompanionActivity");
        } else if (itemId == 1) {
            if (!this.A06.A01()) {
                this.A05.A01(1);
            }
            A75();
            finish();
        } else if (itemId == 2) {
            startActivity(C18300x5.A08("https://faq.whatsapp.com/1317564962315842"));
        } else if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public RegisterAsCompanionActivity() {
        this(0);
    }
}
