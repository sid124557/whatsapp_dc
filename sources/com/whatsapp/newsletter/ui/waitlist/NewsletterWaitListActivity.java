package com.whatsapp.newsletter.ui.waitlist;

import X.AnonymousClass001;
import X.AnonymousClass1Hf;
import X.AnonymousClass1Y9;
import X.AnonymousClass33T;
import X.AnonymousClass3DZ;
import X.AnonymousClass5YD;
import X.C110065fd;
import X.C179608jQ;
import X.C18270x1;
import X.C18280x3;
import X.C64333Db;
import X.C89654ea;
import android.os.Bundle;
import com.whatsapp.R;

public final class NewsletterWaitListActivity extends C89654ea implements C179608jQ {
    public AnonymousClass33T A00;
    public AnonymousClass5YD A01;
    public C110065fd A02;
    public boolean A03;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            AnonymousClass1Hf.A2F(A002, this);
            this.A00 = (AnonymousClass33T) A002.Aaf.get();
            this.A01 = (AnonymousClass5YD) A002.ANq.get();
        }
    }

    public NewsletterWaitListActivity(int i) {
        this.A03 = false;
        AnonymousClass1Hf.A2D(this, 66);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        if (bundle == null) {
            Bon(new NewsletterWaitListSubscribeFragment(), "NewsletterWaitListSubscribeFragment");
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                AnonymousClass5YD r5 = this.A01;
                if (r5 != null) {
                    boolean A1W = C18280x3.A1W(AnonymousClass1Hf.A27(this), "newsletter_wait_list_subscription");
                    boolean z = extras.getBoolean("is_external_link");
                    AnonymousClass1Y9 r2 = new AnonymousClass1Y9();
                    Integer A0f = AnonymousClass001.A0f();
                    r2.A01 = A0f;
                    r2.A00 = Boolean.valueOf(A1W);
                    if (z) {
                        A0f = C18280x3.A0S();
                    }
                    r2.A02 = A0f;
                    r5.A03.BhD(r2);
                    return;
                }
                throw C18270x1.A0S("newsletterLogging");
            }
        }
    }

    public NewsletterWaitListActivity() {
        this(0);
    }
}
