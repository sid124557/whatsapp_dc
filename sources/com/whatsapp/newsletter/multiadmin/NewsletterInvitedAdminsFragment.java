package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass4X3;
import X.AnonymousClass58H;
import X.AnonymousClass5CG;
import X.AnonymousClass5M3;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass66R;
import X.C003203q;
import X.C109375eW;
import X.C114015mM;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C56662sM;
import X.C620733j;
import X.C64773Ex;
import X.C73783g4;
import X.C80853yu;
import X.C86644Kx;
import X.C86664Kz;
import X.C95814uZ;
import X.C96874x8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.Iterator;

public final class NewsletterInvitedAdminsFragment extends Hilt_NewsletterInvitedAdminsFragment {
    public AnonymousClass5M3 A00;
    public AnonymousClass64J A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C114015mM A04;
    public C620733j A05;
    public C56662sM A06;
    public AnonymousClass4X3 A07;
    public final AnonymousClass66R A08 = C154517dI.A00(AnonymousClass58H.NONE, new C80853yu(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        Toolbar A0K = C86644Kx.A0K(view);
        AnonymousClass5CG.A00(A0K);
        A0K.setNavigationContentDescription((int) R.string.f11nameremoved);
        A0K.setTitle((int) R.string.f11nameremoved);
        A0K.setNavigationOnClickListener(new C109375eW(this, 23));
        RecyclerView A0w = C86664Kz.A0w(view, R.id.pending_invites_recycler_view);
        AnonymousClass5M3 r6 = this.A00;
        if (r6 != null) {
            C003203q A0Q = A0Q();
            C162457s7.A0K(A0Q, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
            NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A0Q;
            LayoutInflater A0I = A0I();
            C162457s7.A0D(A0I);
            C114015mM r2 = this.A04;
            if (r2 != null) {
                this.A07 = r6.A00(A0I, r2.A06(A0G(), "newsletter-invited-admins"), newsletterInfoActivity, true);
                Iterable iterable = (Iterable) this.A08.getValue();
                ArrayList A0c = C73783g4.A0c(iterable);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    C95814uZ A0P = C18300x5.A0P(it);
                    C64773Ex r0 = this.A02;
                    if (r0 != null) {
                        A0c.add(new C96874x8(r0.A0A(A0P)));
                    } else {
                        throw C18270x1.A0S("contactManager");
                    }
                }
                AnonymousClass4X3 r02 = this.A07;
                if (r02 == null) {
                    throw C18270x1.A0S("newsletterInvitedAdminsListAdapter");
                }
                r02.A0K(A0c);
                A0w.getContext();
                C18270x1.A0u(A0w);
                AnonymousClass4X3 r03 = this.A07;
                if (r03 == null) {
                    throw C18270x1.A0S("newsletterInvitedAdminsListAdapter");
                }
                A0w.setAdapter(r03);
                return;
            }
            throw C18270x1.A0S("contactPhotos");
        }
        throw C18270x1.A0S("newsletterInvitedAdminsListAdapterFactory");
    }
}
