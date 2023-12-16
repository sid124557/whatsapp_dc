package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass36l;
import X.AnonymousClass3DZ;
import X.AnonymousClass47t;
import X.AnonymousClass4HY;
import X.C005205m;
import X.C107575bX;
import X.C107695bk;
import X.C18280x3;
import X.C18320x8;
import X.C53602nM;
import X.C56972sr;
import X.C57002su;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C71543cH;
import X.C89644eZ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class OldDeviceSecureAccountActivity extends C89644eZ implements AnonymousClass47t {
    public C53602nM A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = C18280x3.A0L(r0);
        }
    }

    public OldDeviceSecureAccountActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 106);
    }

    public final void navigateTo2FactorAuthSetup(View view) {
        Context context = view.getContext();
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccount2FaActivity");
        startActivity(A07);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0x2.A10(C005205m.A00(this, R.id.close_button), this, 9);
        AnonymousClass0x2.A10(C005205m.A00(this, R.id.add_security_btn), this, 10);
        C18280x3.A1E(AnonymousClass002.A0F(this, C107575bX.A04(this, R.color.f5nameremoved), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), C005205m.A01(this, R.id.description_sms_code));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C005205m.A00(this, R.id.description_move_alert);
        AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
        AnonymousClass0x2.A12(textEmojiLabel, this.A08);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = C107575bX.A04(this, R.color.f5nameremoved);
        Me A002 = C56972sr.A00(this.A01);
        C626936e.A06(A002);
        C626936e.A06(A002.jabber_id);
        C620733j r2 = this.A00;
        String str = A002.cc;
        textEmojiLabel.setText(spannableStringBuilder.append(AnonymousClass0x9.A0B(AnonymousClass002.A0F(this, r2.A0I(AnonymousClass36l.A0C(str, C18320x8.A0f(str, A002.jabber_id))), A0M, 1, R.string.f11nameremoved))).append(" ").append(C57002su.A01(new C71543cH((Object) this, 35), getString(R.string.f11nameremoved), "learn-more")));
    }

    public OldDeviceSecureAccountActivity() {
        this(0);
    }
}
