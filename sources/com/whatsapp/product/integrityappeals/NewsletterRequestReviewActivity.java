package com.whatsapp.product.integrityappeals;

import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass66R;
import X.C106715a2;
import X.C107695bk;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C53602nM;
import X.C633939b;
import X.C64333Db;
import X.C71263bp;
import X.C79073w2;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class NewsletterRequestReviewActivity extends C89644eZ {
    public C53602nM A00;
    public C106715a2 A01;
    public boolean A02;
    public final AnonymousClass66R A03;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = C18280x3.A0Q(r1);
            this.A00 = C18280x3.A0L(r1);
        }
    }

    public NewsletterRequestReviewActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 88);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A6N();
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        setContentView((int) R.layout.f8nameremoved);
        TextView A09 = AnonymousClass002.A09(this.A00, R.id.request_review_description);
        View findViewById = this.A00.findViewById(R.id.request_review_next_screen);
        C106715a2 r4 = this.A01;
        if (r4 != null) {
            A09.setText(r4.A05(this, C71263bp.A00(this, 39), AnonymousClass002.A0F(this, "clickable-span", new Object[1], 0, R.string.f11nameremoved), "clickable-span"));
            C18270x1.A0q(A09, this.A0D);
            C633939b.A00(findViewById, this, 20);
            return;
        }
        throw C18270x1.A0S("linkifier");
    }

    public NewsletterRequestReviewActivity() {
        this(0);
        this.A03 = C154517dI.A01(new C79073w2(this));
    }
}
