package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass0IV;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass20D;
import X.AnonymousClass3DZ;
import X.AnonymousClass3SC;
import X.AnonymousClass435;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.C08270df;
import X.C107695bk;
import X.C18270x1;
import X.C18290x4;
import X.C616131n;
import X.C64333Db;
import X.C84814Du;
import X.C85494Gl;
import X.C89644eZ;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class NewsletterUserReportsActivity extends C89644eZ {
    public NewsletterUserReportsViewModel A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public NewsletterUserReportsActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 94);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A6N();
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = (NewsletterUserReportsViewModel) AnonymousClass0x9.A0H(this).A01(NewsletterUserReportsViewModel.class);
        this.A00 = newsletterUserReportsViewModel;
        if (newsletterUserReportsViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        AnonymousClass4K2.A00(this, newsletterUserReportsViewModel.A04, new AnonymousClass435(this), 172);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel2 = this.A00;
        if (newsletterUserReportsViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        Log.i("NewsletterUserReportsViewModel init");
        newsletterUserReportsViewModel2.A04.A0G(AnonymousClass3SC.A00);
        Log.i("Fetching user reports");
        C616131n.A02((C85494Gl) null, new NewsletterUserReportsViewModel$fetchReports$1(newsletterUserReportsViewModel2, (C84814Du) null), AnonymousClass0IV.A00(newsletterUserReportsViewModel2), (AnonymousClass20D) null, 3);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            C08270df supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.A07() != 0) {
                supportFragmentManager.A0M();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public NewsletterUserReportsActivity() {
        this(0);
    }
}
