package com.whatsapp.product.newsletterenforcements.userreports.list;

import X.AnonymousClass09S;
import X.AnonymousClass0RP;
import X.AnonymousClass2D3;
import X.AnonymousClass436;
import X.AnonymousClass437;
import X.AnonymousClass4K2;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C195811t;
import X.C64333Db;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportsListFragment extends Hilt_NewsletterUserReportsListFragment {
    public AnonymousClass2D3 A00;
    public NewsletterUserReportsViewModel A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.newsletter_user_reports_list_view);
        AnonymousClass2D3 r0 = this.A00;
        if (r0 != null) {
            C195811t r4 = new C195811t(C64333Db.A2t(r0.A00.A04), new AnonymousClass437(this));
            recyclerView.setAdapter(r4);
            A0G();
            C18270x1.A0u(recyclerView);
            Drawable A002 = AnonymousClass0RP.A00(recyclerView.getContext(), R.drawable.list_divider);
            if (A002 != null) {
                AnonymousClass09S r02 = new AnonymousClass09S(recyclerView.getContext());
                r02.A00 = A002;
                recyclerView.A0o(r02);
            }
            NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.A01;
            if (newsletterUserReportsViewModel == null) {
                throw C18270x1.A0S("viewModel");
            }
            AnonymousClass4K2.A00(A0V(), newsletterUserReportsViewModel.A00, new AnonymousClass436(r4), 174);
            return;
        }
        throw C18270x1.A0S("reportsListAdapterFactory");
    }

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        A0R().setTitle(R.string.f11nameremoved);
        this.A01 = (NewsletterUserReportsViewModel) C18290x4.A0O(this).A01(NewsletterUserReportsViewModel.class);
    }
}
