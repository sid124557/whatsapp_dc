package com.whatsapp.companionmode.registration;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0XZ;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass36l;
import X.AnonymousClass3DZ;
import X.AnonymousClass4H8;
import X.AnonymousClass4HY;
import X.C107335b8;
import X.C107695bk;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18330xA;
import X.C183538qC;
import X.C47872dy;
import X.C54292oU;
import X.C56242rf;
import X.C64333Db;
import X.C72343dZ;
import X.C85614Gy;
import X.C87044Mw;
import X.C89644eZ;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public final class RegisterAsCompanionLinkCodeActivity extends C89644eZ {
    public LinearLayout A00;
    public ProgressBar A01;
    public C47872dy A02;
    public C54292oU A03;
    public C183538qC A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final C56242rf A09;
    public final ArrayList A0A;

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("link_code", this.A06);
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = C64333Db.A2q(A002);
            this.A04 = C72343dZ.A00(A002.A0Q);
            this.A02 = (C47872dy) A002.A5w.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r3 < 4) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A74(java.lang.String r7) {
        /*
            r6 = this;
            r6.A06 = r7
            android.widget.ProgressBar r0 = r6.A01
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "loadingSpinner"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x000d:
            r5 = 4
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r6.A00
            java.lang.String r4 = "codeInputBoxesLinearLayout"
            if (r0 != 0) goto L_0x001c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x001c:
            r3 = 0
            r0.setVisibility(r3)
            int r1 = r7.length()
            r0 = 8
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.C626936e.A0B(r0)
        L_0x002d:
            java.util.ArrayList r2 = r6.A0A
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            char r0 = r7.charAt(r3)
        L_0x0039:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x003d:
            r1.setText(r0)
            int r3 = r3 + 1
            r0 = 9
            if (r3 >= r0) goto L_0x0060
            if (r3 != r5) goto L_0x0051
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = "-"
            goto L_0x003d
        L_0x0051:
            if (r3 < r5) goto L_0x002d
            java.lang.Object r1 = r2.get(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r3 + -1
            char r0 = r7.charAt(r0)
            goto L_0x0039
        L_0x0060:
            android.widget.LinearLayout r0 = r6.A00
            if (r0 != 0) goto L_0x0069
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x0069:
            r0.setContentDescription(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity.A74(java.lang.String):void");
    }

    public void onBackPressed() {
        C47872dy r0 = this.A02;
        if (r0 != null) {
            r0.A00().A0A();
            super.onBackPressed();
            return;
        }
        throw C18270x1.A0S("companionRegistrationManager");
    }

    public RegisterAsCompanionLinkCodeActivity(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 47);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A01 = (ProgressBar) C18290x4.A0N(this, R.id.loading_spinner);
        this.A00 = (LinearLayout) C18280x3.A0E(this.A00, R.id.link_code_boxes);
        int i = 0;
        do {
            WaTextView waTextView = new WaTextView(new ContextThemeWrapper(this, R.style.f12nameremoved));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 17;
            waTextView.setLayoutParams(layoutParams);
            this.A0A.add(waTextView);
            LinearLayout linearLayout = this.A00;
            if (linearLayout == null) {
                throw C18270x1.A0S("codeInputBoxesLinearLayout");
            }
            linearLayout.addView(waTextView);
            i++;
        } while (i < 9);
        TextView A0L = C18310x6.A0L(this, R.id.companion_registration_linking_instructions_step_two);
        Spanned A0B = AnonymousClass0x9.A0B(getString(R.string.f11nameremoved));
        C162457s7.A0D(A0B);
        CharSequence A032 = C87044Mw.A03(A0L.getPaint(), C107335b8.A0B(C18310x6.A0G(this, R.drawable.ic_ios_settings), C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved)), A0B, "[settings_icon]");
        A0L.setText(C87044Mw.A03(A0L.getPaint(), C107335b8.A0B(C18310x6.A0G(this, R.drawable.android_overflow_icon), C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved)), A032, "[overflow_menu_icon]"));
        C18280x3.A1E(getString(R.string.f11nameremoved), C18310x6.A0L(this, R.id.companion_registration_linking_instructions_step_three));
        C18280x3.A1E(getString(R.string.f11nameremoved), C18310x6.A0L(this, R.id.companion_registration_linking_instructions_step_four));
        TextView A0L2 = C18310x6.A0L(this, R.id.companion_registration_linking_instructions_step_five);
        A0L2.setText(R.string.f11nameremoved);
        A0L2.setVisibility(0);
        C18280x3.A0r(this, R.id.linking_instructions_step_five_number, 0);
        if (this.A00.A05().A06) {
            View findViewById = findViewById(R.id.linking_instructions_constraint_layout);
            C162457s7.A0K(findViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
            AnonymousClass0XZ r1 = new AnonymousClass0XZ();
            r1.A0B(constraintLayout);
            r1.A07(R.id.companion_registration_linking_instructions_step_one);
            r1.A07(R.id.companion_registration_linking_instructions_step_two);
            r1.A07(R.id.companion_registration_linking_instructions_step_three);
            r1.A07(R.id.companion_registration_linking_instructions_step_four);
            r1.A09(constraintLayout);
        }
        String stringExtra = getIntent().getStringExtra("country_code");
        String stringExtra2 = getIntent().getStringExtra("phone_number");
        if (stringExtra == null || stringExtra2 == null) {
            throw AnonymousClass001.A0g("RegisterAsCompanionLinkCodeActivity/setupNumberPreview/cc or pn is null");
        }
        this.A05 = stringExtra;
        this.A07 = stringExtra2;
        TextView A0L3 = C18310x6.A0L(this, R.id.companion_registration_show_link_code_hint);
        String A0l = C18290x4.A0l(this, R.string.f11nameremoved);
        Object[] A0M = AnonymousClass002.A0M();
        String str = this.A05;
        if (str == null) {
            throw C18270x1.A0S("cc");
        }
        String str2 = this.A07;
        if (str2 == null) {
            throw C18270x1.A0S("pn");
        }
        A0M[0] = AnonymousClass36l.A0C(str, str2);
        Spanned A0B2 = AnonymousClass0x9.A0B(AnonymousClass002.A0F(this, A0l, A0M, 1, R.string.f11nameremoved));
        C162457s7.A0D(A0B2);
        SpannableStringBuilder A002 = C18330xA.A00(A0B2);
        A002.setSpan(new C85614Gy(this, 0), (A0B2.length() - A0l.length()) - 1, A0B2.length() - 1, 33);
        A0L3.setText(A002);
        A0L3.setLinksClickable(true);
        A0L3.setMovementMethod(LinkMovementMethod.getInstance());
        if (!(bundle == null || (string = bundle.getString("link_code")) == null)) {
            A74(string);
        }
        C47872dy r0 = this.A02;
        if (r0 != null) {
            r0.A00().A0D(this.A09);
            return;
        }
        throw C18270x1.A0S("companionRegistrationManager");
    }

    public void onDestroy() {
        super.onDestroy();
        C47872dy r0 = this.A02;
        if (r0 != null) {
            r0.A00().A0E(this.A09);
            return;
        }
        throw C18270x1.A0S("companionRegistrationManager");
    }

    public RegisterAsCompanionLinkCodeActivity() {
        this(0);
        this.A0A = AnonymousClass001.A0s();
        this.A09 = new AnonymousClass4H8(this, 1);
    }
}
