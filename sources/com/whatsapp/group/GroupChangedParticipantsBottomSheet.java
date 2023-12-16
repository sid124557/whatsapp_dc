package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass340;
import X.AnonymousClass4FS;
import X.AnonymousClass4WS;
import X.AnonymousClass557;
import X.AnonymousClass58H;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass66R;
import X.AnonymousClass6D8;
import X.C06560Yg;
import X.C08310eF;
import X.C105365Uq;
import X.C107155an;
import X.C107335b8;
import X.C114015mM;
import X.C154517dI;
import X.C159487lv;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C620733j;
import X.C635339p;
import X.C64773Ex;
import X.C80693ye;
import X.C86604Kt;
import X.C86614Ku;
import X.C86654Ky;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class GroupChangedParticipantsBottomSheet extends Hilt_GroupChangedParticipantsBottomSheet {
    public View A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public SearchView A03;
    public AnonymousClass64J A04;
    public WaTextView A05;
    public C64773Ex A06;
    public AnonymousClass5ZU A07;
    public C105365Uq A08;
    public C114015mM A09;
    public C620733j A0A;
    public AnonymousClass557 A0B;
    public AnonymousClass4WS A0C;
    public AnonymousClass4FS A0D;
    public String A0E;
    public List A0F = AnonymousClass001.A0s();
    public final int A0G = R.layout.f8nameremoved;
    public final AnonymousClass66R A0H = C154517dI.A00(AnonymousClass58H.NONE, new C80693ye(this));
    public final AnonymousClass66R A0I = AnonymousClass340.A02(this, "changed_participants_title");

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.A0q(bundle);
        View view = this.A00;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("search", z);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        if (bundle != null && bundle.getBoolean("search")) {
            A1Y();
        }
        this.A02 = C86654Ky.A0N(view, R.id.title_holder);
        View A022 = C06560Yg.A02(view, R.id.search_holder);
        this.A00 = A022;
        if (A022 != null) {
            A022.setBackgroundResource(R.drawable.search_background);
            this.A03 = (SearchView) C06560Yg.A02(A022, R.id.search_view);
        }
        SearchView searchView = this.A03;
        C162457s7.A0H(searchView);
        TextView A0I2 = AnonymousClass0x2.A0I(searchView, R.id.search_src_text);
        AnonymousClass5Yj.A08(view.getContext(), view.getContext(), A0I2, R.attr.f3nameremoved, R.color.f5nameremoved);
        SearchView searchView2 = this.A03;
        if (searchView2 != null) {
            searchView2.setIconifiedByDefault(false);
        }
        SearchView searchView3 = this.A03;
        if (searchView3 != null) {
            searchView3.setQueryHint(C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        SearchView searchView4 = this.A03;
        C162457s7.A0H(searchView4);
        View A023 = C06560Yg.A02(searchView4, R.id.search_mag_icon);
        C162457s7.A0K(A023, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) A023).setImageDrawable(new AnonymousClass6D8(AnonymousClass0RP.A00(view.getContext(), R.drawable.ic_back)));
        SearchView searchView5 = this.A03;
        if (searchView5 != null) {
            searchView5.A0B = new C159487lv(this, 3);
        }
        View view2 = this.A00;
        C162457s7.A0H(view2);
        ImageView A0J = C86604Kt.A0J(view2, R.id.search_back);
        C620733j r2 = this.A0A;
        if (r2 != null) {
            C86614Ku.A1B(C107335b8.A04(view.getContext(), R.drawable.ic_back, R.color.f5nameremoved), A0J, r2);
            C18310x6.A18(A0J, this, 27);
            C635339p.A00(C18280x3.A0E(view, R.id.search_btn), this, 44);
            RecyclerView recyclerView = (RecyclerView) C18280x3.A0E(view, R.id.changed_participants_list_bottom_sheet_recyclerview);
            C114015mM r22 = this.A09;
            if (r22 != null) {
                this.A08 = r22.A06(view.getContext(), "group-participants-changed-activity");
                WaTextView A0L = AnonymousClass0x7.A0L(view, R.id.changed_participants_title_id);
                this.A05 = A0L;
                if (A0L != null) {
                    A0L.setText(AnonymousClass0x9.A13(this.A0I));
                }
                WaTextView waTextView = this.A05;
                if (waTextView != null) {
                    waTextView.setVisibility(0);
                }
                AnonymousClass66R r5 = this.A0H;
                if (((List) r5.getValue()).isEmpty()) {
                    Log.e("GroupChangedParticipantsActivity/empty changed participants jids");
                } else {
                    List list = this.A0F;
                    C64773Ex r1 = this.A06;
                    if (r1 != null) {
                        list.addAll(r1.A0I((Collection) r5.getValue()).values());
                    } else {
                        throw C18270x1.A0S("contactManager");
                    }
                }
                Dialog dialog = this.A03;
                C162457s7.A0K(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                this.A01 = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet);
                AnonymousClass4WS r23 = new AnonymousClass4WS(this);
                this.A0C = r23;
                List list2 = this.A0F;
                C162457s7.A0J(list2, 0);
                r23.A01 = list2;
                C620733j r0 = r23.A02.A0A;
                if (r0 != null) {
                    ArrayList A032 = C107155an.A03(r0, (String) null);
                    C162457s7.A0D(A032);
                    r23.A00 = A032;
                    r23.A05();
                    AnonymousClass4WS r02 = this.A0C;
                    if (r02 == null) {
                        throw C18270x1.A0S("adapter");
                    }
                    recyclerView.setAdapter(r02);
                    return;
                }
                throw C18270x1.A0S("whatsAppLocale");
            }
            throw C18270x1.A0S("contactPhotos");
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void A1Z(String str) {
        String str2 = str;
        this.A0E = str;
        C18290x4.A1L(this.A0B);
        AnonymousClass5ZU r2 = this.A07;
        if (r2 != null) {
            C620733j r3 = this.A0A;
            if (r3 != null) {
                AnonymousClass557 r1 = new AnonymousClass557(r2, r3, this, this, str2, this.A0F);
                this.A0B = r1;
                AnonymousClass4FS r0 = this.A0D;
                if (r0 != null) {
                    C18270x1.A0w(r1, r0);
                    return;
                }
                throw C18270x1.A0S("waWorkers");
            }
            throw C18270x1.A0S("whatsAppLocale");
        }
        throw C18270x1.A0S("waContactNames");
    }

    public int A1S() {
        return this.A0G;
    }

    public final void A1Y() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view = this.A0B;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            int i = layoutParams.height;
            FrameLayout frameLayout = this.A01;
            if (!(frameLayout == null || (layoutParams2 = frameLayout.getLayoutParams()) == null)) {
                layoutParams2.height = i;
            }
        }
        SearchView searchView = this.A03;
        if (searchView != null) {
            searchView.A09();
        }
        C18270x1.A0p(this.A02);
        View view2 = this.A00;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public void A0c() {
        super.A0c();
        this.A03 = null;
        this.A05 = null;
        this.A00 = null;
        this.A02 = null;
        C105365Uq r0 = this.A08;
        if (r0 != null) {
            r0.A00();
        }
        this.A08 = null;
        C18290x4.A1L(this.A0B);
    }
}
