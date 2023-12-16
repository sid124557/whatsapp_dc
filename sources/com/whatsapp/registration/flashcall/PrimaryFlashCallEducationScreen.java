package com.whatsapp.registration.flashcall;

import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1VW;
import X.AnonymousClass317;
import X.AnonymousClass36l;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass5M6;
import X.AnonymousClass5NF;
import X.AnonymousClass5UY;
import X.AnonymousClass5ZR;
import X.C005205m;
import X.C107405bG;
import X.C107445bK;
import X.C107695bk;
import X.C109745f7;
import X.C115475oj;
import X.C18270x1;
import X.C18300x5;
import X.C18320x8;
import X.C50152hi;
import X.C54292oU;
import X.C55092pm;
import X.C56502s5;
import X.C614930z;
import X.C627736r;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class PrimaryFlashCallEducationScreen extends C89644eZ {
    public int A00;
    public long A01;
    public long A02;
    public AnonymousClass5M6 A03;
    public C614930z A04;
    public C54292oU A05;
    public AnonymousClass5ZR A06;
    public AnonymousClass1VW A07;
    public C50152hi A08;
    public AnonymousClass317 A09;
    public C55092pm A0A;
    public C115475oj A0B;
    public AnonymousClass5NF A0C;
    public C56502s5 A0D;
    public boolean A0E;
    public boolean A0F;

    public final SpannableString A74(Typeface typeface, String str) {
        TypefaceSpan typefaceSpan;
        Spanned A0B2 = AnonymousClass0x9.A0B(str);
        String obj = A0B2.toString();
        SpannableString A0A2 = AnonymousClass4L0.A0A(obj);
        for (Object obj2 : A0B2.getSpans(0, obj.length(), Object.class)) {
            int spanStart = A0B2.getSpanStart(obj2);
            int spanEnd = A0B2.getSpanEnd(obj2);
            int spanFlags = A0B2.getSpanFlags(obj2);
            if (Build.VERSION.SDK_INT >= 28) {
                typefaceSpan = new TypefaceSpan(typeface);
            } else {
                typefaceSpan = new TypefaceSpan("sans-serif-medium");
            }
            A0A2.setSpan(typefaceSpan, spanStart, spanEnd, spanFlags);
            A0A2.setSpan(new ForegroundColorSpan(C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved)), spanStart, spanEnd, spanFlags);
        }
        return A0A2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 2) {
            this.A0B.A05(i, i2);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void A5r() {
        if (!this.A0F) {
            this.A0F = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A05 = C64333Db.A2q(r2);
            this.A0D = AnonymousClass4SG.A2q(r1);
            this.A07 = C86624Kv.A0S(r2);
            this.A04 = C86614Ku.A0O(r2);
            this.A08 = A2W.AD3();
            this.A09 = C86614Ku.A0i(r2);
            this.A06 = C64333Db.A2r(r2);
            this.A0C = A2W.AD4();
            this.A0A = AnonymousClass4SG.A2o(r2);
            this.A03 = (AnonymousClass5M6) A2W.A2B.get();
        }
    }

    public void onBackPressed() {
        Intent intent;
        this.A0D.A04("flash_call_education", "back");
        if (this.A04.A0B(this.A0E)) {
            Log.i("PrimaryFlashCallEducationScreen/onBackPressed/is adding new account");
            AnonymousClass36l.A0D(this, this.A04, this.A09, this.A0A);
            return;
        }
        if (this.A0E) {
            Log.i("PrimaryFlashCallEducationScreen/back-pressed/go-to-change-number-screen");
            this.A09.A0B(3, true);
            if (!this.A09.A0F()) {
                finish();
                return;
            } else {
                intent = C18320x8.A07();
                intent.setClassName(getPackageName(), "com.whatsapp.registration.ChangeNumber");
            }
        } else {
            Log.i("PrimaryFlashCallEducationScreen/back-pressed/go-to-register-phone-screen");
            this.A09.A0B(1, true);
            intent = C627736r.A04(this);
            intent.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        }
        A6T(intent, true);
    }

    public void onCreate(Bundle bundle) {
        Log.i("PrimaryFlashCallEducationScreen/oncreate");
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C107405bG.A05(this);
        C18270x1.A0l(C18270x1.A03(this.A09), "pref_flash_call_education_screen_displayed", true);
        if (C86614Ku.A0D(this) != null) {
            this.A00 = getIntent().getIntExtra("flash_type", -1);
            this.A01 = getIntent().getLongExtra("sms_retry_time", 0);
            this.A02 = getIntent().getLongExtra("voice_retry_time", 0);
            this.A0E = getIntent().getBooleanExtra("change_number", false);
        }
        AnonymousClass36l.A0K(this.A00, this, this.A00, R.id.verify_flash_call_title_toolbar, false, true, this.A04.A0B(this.A0E));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0Q(false);
        }
        Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        C005205m.A01(this, R.id.flash_call_education_screen_headline).setTypeface(createFromAsset, 0);
        C005205m.A01(this, R.id.make_and_manage_calls).setText(A74(createFromAsset, getString(R.string.f11nameremoved)));
        C005205m.A01(this, R.id.access_phone_call_logs).setText(A74(createFromAsset, getString(R.string.f11nameremoved)));
        this.A0C.A00((TextEmojiLabel) C005205m.A00(this, R.id.flash_call_learn_more), this, R.string.f11nameremoved);
        AnonymousClass36l.A0M(this, this.A07, R.id.verify_flash_call_title_toolbar_text);
        this.A0B = this.A03.A00(this, 2, this.A00, this.A01, this.A02, this.A07.A0X(3902));
        View A002 = C005205m.A00(this, R.id.verify_with_sms_button);
        AnonymousClass0x2.A10(A002, this, 19);
        if (this.A07.A0X(3591)) {
            AnonymousClass5UY A1p = AnonymousClass1Ha.A1p(this, R.id.verify_another_way_button_view_stub);
            A002.setVisibility(8);
            A1p.A06(0);
            A1p.A07(new C109745f7((Object) this, 18));
            getSupportFragmentManager().A0j(new C107445bK(this, 13), this, "VERIFY_ANOTHER_WAY_FRAGMENT_RESULT");
        }
        AnonymousClass0x2.A10(C005205m.A00(this, R.id.continue_button), this, 20);
        if (this.A09.A04() == -1) {
            C18270x1.A0h(C18270x1.A03(this.A09), "pref_flash_call_education_link_clicked", 0);
        }
        this.A0D.A01("flash_call_education");
    }

    public PrimaryFlashCallEducationScreen(int i) {
        this.A0F = false;
        C86604Kt.A1K(this, 91);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Log.i("PrimaryFlashCallEducationScreen/select-menu-option/help");
            this.A08.A01(this, this.A0A, "verify-flash-call");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Log.i("PrimaryFlashCallEducationScreen/select-menu-option/reset");
            this.A09.A09();
            AnonymousClass4SG.A35(this);
            return true;
        }
    }

    public PrimaryFlashCallEducationScreen() {
        this(0);
        this.A00 = -1;
        this.A01 = 0;
        this.A02 = 0;
    }
}
