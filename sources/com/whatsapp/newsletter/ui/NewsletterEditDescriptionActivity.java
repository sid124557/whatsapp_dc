package com.whatsapp.newsletter.ui;

import X.AnonymousClass1RL;
import X.AnonymousClass2AB;
import X.AnonymousClass30V;
import X.AnonymousClass4SG;
import X.C005205m;
import X.C107695bk;
import X.C18270x1;
import X.C64333Db;
import X.C86604Kt;
import X.C88834as;
import X.C96924xG;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public final class NewsletterEditDescriptionActivity extends C96924xG {
    public AnonymousClass30V A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A08 = C64333Db.A39(r2);
            AnonymousClass4SG.A3O(A2W, r2, this);
            this.A00 = C86604Kt.A0f(r2);
        }
    }

    public void A66() {
        AnonymousClass30V r2 = this.A00;
        if (r2 != null) {
            r2.A03(this.A0B, 32);
            super.A66();
            return;
        }
        throw C18270x1.A0S("navigationTimeSpentManager");
    }

    public boolean A6C() {
        return true;
    }

    public NewsletterEditDescriptionActivity(int i) {
        this.A01 = false;
        C86604Kt.A1K(this, 69);
    }

    public void A7E() {
        super.A7E();
        C005205m.A01(this, R.id.newsletter_save_button).setText(R.string.f11nameremoved);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String A002;
        super.onCreate(bundle);
        if (this.A0B == null) {
            finish();
            return;
        }
        AnonymousClass1RL A76 = A76();
        if (A76 != null) {
            WaEditText A75 = A75();
            String str2 = A76.A0H;
            String str3 = "";
            if (str2 == null || (str = AnonymousClass2AB.A00(str2)) == null) {
                str = str3;
            }
            A75.setText(str);
            WaEditText A74 = A74();
            String str4 = A76.A0E;
            if (!(str4 == null || (A002 = AnonymousClass2AB.A00(str4)) == null)) {
                str3 = A002;
            }
            A74.setText(str3);
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            throw C18270x1.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        }
    }

    public NewsletterEditDescriptionActivity() {
        this(0);
    }
}
