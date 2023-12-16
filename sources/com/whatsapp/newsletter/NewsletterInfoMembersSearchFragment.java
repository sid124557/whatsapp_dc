package com.whatsapp.newsletter;

import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0YY;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass340;
import X.AnonymousClass4L0;
import X.AnonymousClass4M2;
import X.AnonymousClass58H;
import X.AnonymousClass5CM;
import X.AnonymousClass5Yj;
import X.AnonymousClass66R;
import X.AnonymousClass6C6;
import X.C003203q;
import X.C08310eF;
import X.C105895Wv;
import X.C107125ak;
import X.C107335b8;
import X.C1217961x;
import X.C1232367q;
import X.C1232467r;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C371521d;
import X.C620633i;
import X.C620733j;
import X.C80583yT;
import X.C86614Ku;
import X.C86654Ky;
import X.C86664Kz;
import X.C87204Ok;
import X.C89164br;
import X.C91534kK;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class NewsletterInfoMembersSearchFragment extends Hilt_NewsletterInfoMembersSearchFragment {
    public WaTextView A00;
    public C620633i A01;
    public C620733j A02;
    public AnonymousClass1VX A03;
    public NewsletterInfoMembersListViewModel A04;
    public C91534kK A05;
    public C87204Ok A06;
    public C105895Wv A07;
    public boolean A08;
    public final int A09 = R.layout.f8nameremoved;
    public final AnonymousClass66R A0A = AnonymousClass340.A00(this, "enter_animated");
    public final AnonymousClass66R A0B = AnonymousClass340.A00(this, "exit_animated");
    public final AnonymousClass66R A0C = AnonymousClass340.A00(this, "is_over_max");
    public final AnonymousClass66R A0D = C154517dI.A00(AnonymousClass58H.NONE, new C80583yT(this, "footer_text"));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0c() {
        this.A00 = null;
        super.A0c();
    }

    public void A0o(Bundle bundle) {
        View A1J;
        this.A0X = true;
        this.A08 = A0H().getBoolean("enter_ime");
        C003203q A0R = A0R();
        C162457s7.A0K(A0R, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A0R;
        View A0J = A0J();
        ListView listView = (ListView) C18280x3.A0E(A0J, 16908298);
        View A0E = C18280x3.A0E(A0J, R.id.search_holder);
        A0E.setBackgroundResource(R.drawable.search_background);
        this.A06 = newsletterInfoActivity.A7I();
        this.A05 = (C91534kK) AnonymousClass0x9.A0H(newsletterInfoActivity).A01(C91534kK.class);
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = (NewsletterInfoMembersListViewModel) AnonymousClass0x9.A0H(newsletterInfoActivity).A01(NewsletterInfoMembersListViewModel.class);
        this.A04 = newsletterInfoMembersListViewModel;
        if (newsletterInfoMembersListViewModel == null) {
            throw C18270x1.A0S("newsletterInfoMembersListViewModel");
        }
        AnonymousClass6C6.A02(A0V(), newsletterInfoMembersListViewModel.A02, new C1217961x(this), 265);
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel2 = this.A04;
        if (newsletterInfoMembersListViewModel2 == null) {
            throw C18270x1.A0S("newsletterInfoMembersListViewModel");
        }
        newsletterInfoMembersListViewModel2.A0E(C371521d.FULL, false);
        newsletterInfoActivity.registerForContextMenu(listView);
        listView.setOnScrollListener(new C107125ak(this));
        SearchView searchView = (SearchView) A0E.findViewById(R.id.search_view);
        TextView A092 = AnonymousClass002.A09(searchView, R.id.search_src_text);
        AnonymousClass5Yj.A08(A1D(), A0G(), A092, R.attr.f3nameremoved, R.color.f5nameremoved);
        searchView.setIconifiedByDefault(false);
        AnonymousClass66R r5 = this.A0A;
        if (C18270x1.A1V(r5) && (A1J = A1J()) != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (A1J.getTop() - listView.getPaddingTop()), 0.0f);
            translateAnimation.setDuration(240);
            C1232367q.A00(translateAnimation, this, searchView, 7);
            listView.startAnimation(translateAnimation);
        } else if (this.A08) {
            searchView.A09();
            this.A08 = false;
        } else {
            C105895Wv r0 = this.A07;
            if (r0 != null) {
                r0.A02(searchView);
            } else {
                throw C18270x1.A0S("imeUtils");
            }
        }
        searchView.setQueryHint(C08310eF.A09(this).getString(R.string.f11nameremoved));
        searchView.A0B = new AnonymousClass5CM(this, 9);
        View findViewById = searchView.findViewById(R.id.search_mag_icon);
        C162457s7.A0K(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById).setImageDrawable(new AnonymousClass4M2(AnonymousClass0RP.A00(A0G(), R.drawable.ic_back)));
        if (C18270x1.A1V(r5)) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            translateAnimation2.setDuration(240);
            A0E.startAnimation(translateAnimation2);
        }
        ImageView A0F = AnonymousClass0x9.A0F(A0E, R.id.search_back);
        C620733j r4 = this.A02;
        if (r4 != null) {
            C86614Ku.A1B(C107335b8.A04(A0G(), R.drawable.ic_back, R.color.f5nameremoved), A0F, r4);
            C18300x5.A19(A0F, this, 19);
            C87204Ok r02 = this.A06;
            if (r02 != null) {
                listView.setAdapter(r02);
                View inflate = A0I().inflate(this.A09, listView, false);
                C18280x3.A0E(inflate, R.id.unfollow_and_report_card).setVisibility(8);
                C18280x3.A0E(inflate, R.id.list_bottom_shadow).setVisibility(8);
                FrameLayout A0K = C86654Ky.A0K(inflate.getContext(), inflate);
                AnonymousClass0YY.A06(A0K, 2);
                listView.addFooterView(A0K, (Object) null, false);
                this.A00 = AnonymousClass0x7.A0L(inflate, R.id.newsletter_followers_footer_text);
                A1L((String) null);
                return;
            }
            throw C18270x1.A0S("adapter");
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void A1K() {
        View view;
        View view2 = this.A0B;
        if (view2 != null) {
            if (C18270x1.A1V(this.A0B)) {
                view = A1J();
            } else {
                view = null;
            }
            View findViewById = view2.findViewById(R.id.search_holder);
            findViewById.setVisibility(8);
            View A0E = C18280x3.A0E(findViewById, R.id.search_view);
            C105895Wv r0 = this.A07;
            if (r0 != null) {
                r0.A02(A0E);
                if (view != null) {
                    AlphaAnimation A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
                    A0C2.setDuration(240);
                    findViewById.startAnimation(A0C2);
                    View A0i = C86664Kz.A0i(view2);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (view.getTop() - A0i.getPaddingTop()));
                    translateAnimation.setDuration(240);
                    C1232467r.A00(translateAnimation, this, 8);
                    A0i.startAnimation(translateAnimation);
                    return;
                }
                A0U().A0N();
                return;
            }
            throw C18270x1.A0S("imeUtils");
        }
    }

    public final void A1L(String str) {
        WaTextView waTextView;
        int i;
        if (C18270x1.A1V(this.A0C)) {
            if (str == null || str.length() == 0) {
                waTextView = this.A00;
                if (waTextView != null) {
                    i = R.string.f11nameremoved;
                } else {
                    return;
                }
            } else {
                waTextView = this.A00;
                if (waTextView != null) {
                    i = R.string.f11nameremoved;
                } else {
                    return;
                }
            }
        } else if (str == null || str.length() == 0) {
            AnonymousClass66R r1 = this.A0D;
            Object value = r1.getValue();
            waTextView = this.A00;
            if (value != null) {
                if (waTextView != null) {
                    waTextView.setText(AnonymousClass0x9.A13(r1));
                    return;
                }
                return;
            } else if (waTextView != null) {
                i = R.string.f11nameremoved;
            } else {
                return;
            }
        } else {
            waTextView = this.A00;
            if (waTextView != null) {
                i = R.string.f11nameremoved;
            } else {
                return;
            }
        }
        waTextView.setText(i);
    }

    public final View A1J() {
        C003203q A0R = A0R();
        C162457s7.A0K(A0R, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        C89164br r5 = (C89164br) A0R;
        int childCount = r5.getListView().getChildCount();
        View view = null;
        for (int i = 0; i < childCount && view == null; i++) {
            View childAt = r5.getListView().getChildAt(i);
            if (childAt.getTag() != null) {
                view = childAt;
            }
        }
        return view;
    }
}
