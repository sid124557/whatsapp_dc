package com.whatsapp.corruptinstallation;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5WY;
import X.C107695bk;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C19000yb;
import X.C50382i5;
import X.C631938h;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class CorruptInstallationActivity extends C89644eZ {
    public AnonymousClass5WY A00;
    public C50382i5 A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = (C50382i5) A002.AZG.get();
            this.A00 = (AnonymousClass5WY) A002.AUS.get();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        TextView A0L = C18310x6.A0L(this, R.id.corrupt_installation_contact_support_textview);
        Spanned A0B = AnonymousClass0x9.A0B(getString(R.string.f11nameremoved));
        SpannableStringBuilder A002 = C18330xA.A00(A0B);
        URLSpan[] uRLSpanArr = (URLSpan[]) A0B.getSpans(0, A0B.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("contact-support".equals(uRLSpan.getURL())) {
                    Log.i("contact-support link found");
                    int spanStart = A002.getSpanStart(uRLSpan);
                    int spanEnd = A002.getSpanEnd(uRLSpan);
                    int spanFlags = A002.getSpanFlags(uRLSpan);
                    A002.removeSpan(uRLSpan);
                    A002.setSpan(new C19000yb(this.A00.A00(this, (Bundle) null, (C631938h) null, (Integer) null, "corrupt-install", (String) null, (ArrayList) null, (ArrayList) null, false)), spanStart, spanEnd, spanFlags);
                }
            }
        }
        A0L.setText(A002);
        A0L.setMovementMethod(LinkMovementMethod.getInstance());
        if (!this.A01.A01()) {
            View findViewById = findViewById(R.id.btn_uninstall);
            TextView A0L2 = C18310x6.A0L(this, R.id.corrupt_installation_description_website_distribution_textview);
            A0L2.setMovementMethod(LinkMovementMethod.getInstance());
            C18280x3.A1E(AnonymousClass002.A0F(this, "https://www.whatsapp.com/android/", AnonymousClass002.A0L(), 0, R.string.f11nameremoved), A0L2);
            C18290x4.A1G(findViewById, this, 35);
            i = R.id.play_store_div;
        } else {
            C18290x4.A1G(findViewById(R.id.btn_play_store), this, 36);
            i = R.id.website_div;
        }
        C18280x3.A0r(this, i, 8);
    }

    public CorruptInstallationActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 55);
    }

    public CorruptInstallationActivity() {
        this(0);
    }
}
