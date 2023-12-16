package com.whatsapp.group;

import X.AnonymousClass1VX;
import X.AnonymousClass24P;
import X.AnonymousClass34R;
import X.AnonymousClass4K8;
import X.AnonymousClass4L0;
import X.AnonymousClass4V4;
import X.AnonymousClass4X7;
import X.AnonymousClass5ZU;
import X.AnonymousClass61R;
import X.AnonymousClass61S;
import X.AnonymousClass6C6;
import X.AnonymousClass7CL;
import X.AnonymousClass80I;
import X.C106715a2;
import X.C123916Ag;
import X.C141546vk;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C27991fJ;
import X.C69263Wi;
import X.C86604Kt;
import X.C86634Kw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class GroupMembershipApprovalRequestsFragment extends Hilt_GroupMembershipApprovalRequestsFragment {
    public AnonymousClass7CL A00;
    public C69263Wi A01;
    public AnonymousClass5ZU A02;
    public AnonymousClass1VX A03;
    public AnonymousClass4X7 A04;
    public AnonymousClass4V4 A05;
    public C27991fJ A06;
    public C106715a2 A07;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        C162457s7.A0J(view, 0);
        View A0M = C86634Kw.A0M((ViewStub) C18290x4.A0M(view, R.id.no_pending_requests_view_stub), R.layout.f8nameremoved);
        C162457s7.A0D(A0M);
        View A0M2 = C18290x4.A0M(A0M, R.id.no_pending_requests_view_description);
        RecyclerView recyclerView = (RecyclerView) C18290x4.A0M(view, R.id.pending_requests_recycler_view);
        recyclerView.getContext();
        C18320x8.A19(recyclerView, 1);
        recyclerView.setAdapter(A1I());
        try {
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                str = bundle2.getString("gid");
            } else {
                str = null;
            }
            this.A06 = AnonymousClass34R.A05(str);
            AnonymousClass4X7 A1I = A1I();
            C27991fJ r0 = this.A06;
            if (r0 != null) {
                A1I.A00 = r0;
                this.A05 = (AnonymousClass4V4) AnonymousClass4L0.A0F(new C123916Ag(this, 1), A0R()).A01(AnonymousClass4V4.class);
                A1I().A02 = new AnonymousClass61R(this);
                A1I().A03 = new AnonymousClass61S(this);
                AnonymousClass4V4 r02 = this.A05;
                if (r02 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                r02.A02.A0B(A0V(), new AnonymousClass80I(A0M, recyclerView, this));
                AnonymousClass4V4 r03 = this.A05;
                if (r03 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                r03.A03.A0B(A0V(), new AnonymousClass4K8(A0M, recyclerView, A0M2, this, 0));
                AnonymousClass4V4 r04 = this.A05;
                if (r04 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                AnonymousClass6C6.A02(A0V(), r04.A04, this, 248);
                AnonymousClass4V4 r05 = this.A05;
                if (r05 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(A0V(), r05.A0H, this, 230);
                AnonymousClass4V4 r06 = this.A05;
                if (r06 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(A0V(), r06.A0G, this, 231);
                AnonymousClass4V4 r07 = this.A05;
                if (r07 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(A0V(), r07.A0I, this, 232);
                AnonymousClass4V4 r08 = this.A05;
                if (r08 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(A0V(), r08.A0F, this, 233);
                return;
            }
            throw C18270x1.A0S("groupJid");
        } catch (AnonymousClass24P e) {
            Log.e("GroupPendingParticipants started with invalid jid ", e);
            C18300x5.A1A(this);
        }
    }

    public final AnonymousClass4X7 A1I() {
        AnonymousClass4X7 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("membershipApprovalRequestsAdapter");
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C18270x1.A14(menu, menuInflater);
        AnonymousClass4V4 r0 = this.A05;
        if (r0 == null) {
            throw C86604Kt.A0j();
        }
        C141546vk r3 = r0.A01;
        C141546vk r2 = C141546vk.BY_SOURCE;
        int i = R.id.menu_sort_by_source;
        int i2 = R.string.f11nameremoved;
        if (r3 == r2) {
            i = R.id.menu_sort_by_time;
            i2 = R.string.f11nameremoved;
        }
        C18290x4.A1E(menu, i, i2);
    }

    public boolean A1B(MenuItem menuItem) {
        AnonymousClass4V4 r1;
        C141546vk r0;
        int A042 = C18290x4.A04(menuItem);
        if (A042 == R.id.menu_sort_by_source) {
            r1 = this.A05;
            if (r1 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r0 = C141546vk.BY_SOURCE;
        } else if (A042 != R.id.menu_sort_by_time) {
            return false;
        } else {
            r1 = this.A05;
            if (r1 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r0 = C141546vk.BY_TIME;
        }
        r1.A0E(r0);
        return false;
    }
}
