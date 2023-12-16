package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.C102415It;
import X.C107635bd;
import X.C107695bk;
import X.C108735dT;
import X.C111095hX;
import X.C111135hb;
import X.C116985rC;
import X.C117105rO;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C189008zq;
import X.C54292oU;
import X.C56042rK;
import X.C56492s4;
import X.C617031x;
import X.C620633i;
import X.C64333Db;
import X.C69263Wi;
import X.C79823xF;
import X.C79833xG;
import X.C88834as;
import X.C89644eZ;
import X.C97134xg;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class AccountLinkingNativeAuthActivity extends C89644eZ {
    public C116985rC A00;
    public C56492s4 A01;
    public C54292oU A02;
    public C97134xg A03;
    public C102415It A04;
    public C108735dT A05;
    public C56042rK A06;
    public C111135hb A07;
    public boolean A08;

    public static final SpannableStringBuilder A0C(Runnable runnable, String str, String str2, int i) {
        Spanned A0B = AnonymousClass0x9.A0B(str);
        C162457s7.A0D(A0B);
        SpannableStringBuilder A002 = C18330xA.A00(A0B);
        URLSpan[] uRLSpanArr = (URLSpan[]) A0B.getSpans(0, A0B.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (C162457s7.A0P(str2, uRLSpan.getURL())) {
                    int spanStart = A002.getSpanStart(uRLSpan);
                    int spanEnd = A002.getSpanEnd(uRLSpan);
                    int spanFlags = A002.getSpanFlags(uRLSpan);
                    A002.removeSpan(uRLSpan);
                    A002.setSpan(new C189008zq(runnable, i), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A002;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("fb_app_user_entity_as_parcel");
        if (parcelableExtra != null) {
            this.A05 = (C108735dT) parcelableExtra;
            C18320x8.A14(C18290x4.A0N(this, R.id.consent_login_button), this, 25);
            C617031x.A01(new C79823xF(this), 2);
            C617031x.A01(new C79833xG(this), 2);
            C18320x8.A14(findViewById(R.id.close_button), this, 24);
            TextView A0L = C18310x6.A0L(this, R.id.different_login);
            String string = getResources().getString(R.string.f11nameremoved);
            C162457s7.A0D(string);
            A0L.setText(A0C(new C117105rO(this, 48), string, "log-in", A0L.getCurrentTextColor()));
            C18270x1.A0q(A0L, this.A0D);
            C18280x3.A1E(getResources().getString(R.string.f11nameremoved), C18310x6.A0L(this, R.id.disclosure_ds_wa));
            AnonymousClass1VX r11 = this.A0D;
            C69263Wi r8 = this.A05;
            C111095hX r7 = this.A00;
            C620633i r10 = this.A08;
            String string2 = getResources().getString(R.string.f11nameremoved);
            C107635bd.A0E(this, this.A03.A00("https://faq.whatsapp.com/help/whatsapp/517414157043660"), r7, r8, (TextEmojiLabel) findViewById(R.id.disclosure_footer_text), r10, r11, string2, "learn-more");
            C18270x1.A0q(C18310x6.A0L(this, R.id.disclosure_footer_text), this.A0D);
            TextView A0L2 = C18310x6.A0L(this, R.id.disclosure_ds_fb);
            String string3 = getResources().getString(R.string.f11nameremoved);
            C162457s7.A0D(string3);
            A0L2.setText(A0C(new C117105rO(this, 49), string3, "privacy-policy", getResources().getColor(AnonymousClass0x2.A05(A0L2))));
            C18270x1.A0q(A0L2, this.A0D);
            A74().A05("SEE_NATIVE_AUTH");
            return;
        }
        throw C18290x4.A0Y();
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass1Ha.A23(r2, r1, r1, this);
            AnonymousClass1Ha.A24(r2, this);
            this.A02 = C64333Db.A2q(r2);
            this.A01 = C64333Db.A07(r2);
            this.A04 = (C102415It) A0I.A00.get();
            this.A03 = (C97134xg) r1.A0E.get();
            this.A06 = (C56042rK) r2.AEv.get();
            this.A07 = (C111135hb) r2.Ac5.get();
            this.A00 = C116985rC.A02(r1.AQM());
        }
    }

    public final C111135hb A74() {
        C111135hb r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("xFamilyUserFlowLogger");
    }

    public AccountLinkingNativeAuthActivity(int i) {
        this.A08 = false;
        AnonymousClass1Hf.A2D(this, 115);
    }

    public AccountLinkingNativeAuthActivity() {
        this(0);
    }
}
