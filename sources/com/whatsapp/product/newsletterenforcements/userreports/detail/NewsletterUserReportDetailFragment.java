package com.whatsapp.product.newsletterenforcements.userreports.detail;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass4K2;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C626936e;
import X.C824943u;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportDetailFragment extends Hilt_NewsletterUserReportDetailFragment {
    public NewsletterUserReportsViewModel A00;
    public final String A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.A00;
        if (newsletterUserReportsViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        String str = this.A01;
        C162457s7.A0J(str, 0);
        Object obj = newsletterUserReportsViewModel.A03.A00.get(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onReportViewInitialized reportId: ");
        A0o.append(str);
        A0o.append(", report in cache?: ");
        C18260x0.A1V(A0o, AnonymousClass000.A1W(obj));
        AnonymousClass08M r0 = newsletterUserReportsViewModel.A01;
        C626936e.A06(obj);
        r0.A0G(obj);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel2 = this.A00;
        if (newsletterUserReportsViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        AnonymousClass4K2.A00(A0V(), newsletterUserReportsViewModel2.A01, new C824943u(view, this), 173);
    }

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        A0R().setTitle(R.string.f11nameremoved);
        this.A00 = (NewsletterUserReportsViewModel) C18290x4.A0O(this).A01(NewsletterUserReportsViewModel.class);
    }

    public NewsletterUserReportDetailFragment(String str) {
        this.A01 = str;
    }
}
