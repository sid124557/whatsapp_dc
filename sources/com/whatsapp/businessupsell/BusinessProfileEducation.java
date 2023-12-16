package com.whatsapp.businessupsell;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1Y2;
import X.AnonymousClass2X5;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.AnonymousClass7SX;
import X.C107695bk;
import X.C117125rQ;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C18330xA;
import X.C58422vE;
import X.C64333Db;
import X.C66433Lk;
import X.C85244Fm;
import X.C86964Mo;
import X.C88834as;
import X.C88944b3;
import X.C89644eZ;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class BusinessProfileEducation extends C89644eZ {
    public C85244Fm A00;
    public AnonymousClass4FV A01;
    public AnonymousClass7SX A02;
    public C66433Lk A03;
    public AnonymousClass2X5 A04;
    public boolean A05;

    public void onCreate(Bundle bundle) {
        int i;
        Object[] objArr;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C18300x5.A18(findViewById(R.id.close), this, 23);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.business_account_info_description);
        C86964Mo r2 = new C86964Mo(this.A0D);
        r2.A01 = new C117125rQ(this, 36);
        textEmojiLabel.setLinkHandler(r2);
        String stringExtra = getIntent().getStringExtra("key_extra_business_name");
        boolean A1U = AnonymousClass000.A1U(getIntent().getIntExtra("key_extra_verified_level", -1), 3);
        boolean A0Y = this.A0D.A0Y(C58422vE.A02, 5295);
        if (!A1U || stringExtra == null || A0Y) {
            i = R.string.f11nameremoved;
            objArr = new Object[]{C66433Lk.A00(this.A03, "643460927283235").toString()};
        } else {
            i = R.string.f11nameremoved;
            objArr = AnonymousClass002.A0M();
            objArr[0] = Html.escapeHtml(stringExtra);
            objArr[1] = C66433Lk.A00(this.A03, "643460927283235").toString();
        }
        SpannableStringBuilder A002 = C18330xA.A00(Html.fromHtml(getString(i, objArr)));
        URLSpan[] uRLSpanArr = (URLSpan[]) A002.getSpans(0, A002.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A002.setSpan(new C88944b3(this, this.A00, this.A05, this.A08, uRLSpan.getURL()), A002.getSpanStart(uRLSpan), A002.getSpanEnd(uRLSpan), A002.getSpanFlags(uRLSpan));
            }
        }
        AnonymousClass0x2.A12(textEmojiLabel, this.A08);
        textEmojiLabel.setText(A002, TextView.BufferType.SPANNABLE);
        C18300x5.A18(findViewById(R.id.upsell_button), this, 24);
        A74(1);
        if (AnonymousClass000.A1U(getIntent().getIntExtra("key_extra_verified_level", -1), 3)) {
            AnonymousClass7SX r3 = this.A02;
            String stringExtra2 = getIntent().getStringExtra("key_extra_business_jid");
            C162457s7.A0J(stringExtra2, 0);
            r3.A00(C18280x3.A0S(), stringExtra2, 3, 4);
        }
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A01 = C64333Db.A4H(r1);
            this.A00 = C64333Db.A05(r1);
            this.A03 = C64333Db.A8X(r1);
            this.A04 = A0I.ADJ();
            this.A02 = A0I.ADG();
        }
    }

    public final void A74(int i) {
        AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = C18300x5.A0Z();
        this.A01.BhD(r1);
    }

    public BusinessProfileEducation(int i) {
        this.A05 = false;
        AnonymousClass4HY.A00(this, 22);
    }

    public BusinessProfileEducation() {
        this(0);
    }
}
