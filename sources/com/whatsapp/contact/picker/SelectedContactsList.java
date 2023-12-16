package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass4Ru;
import X.AnonymousClass4WP;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.C06440Xs;
import X.C06560Yg;
import X.C107335b8;
import X.C107555bV;
import X.C107705bl;
import X.C107745bp;
import X.C117695sL;
import X.C1229166i;
import X.C1231467h;
import X.C18300x5;
import X.C198012s;
import X.C620733j;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import java.util.List;

public class SelectedContactsList extends AnonymousClass4Ru {
    public int A00;
    public int A01;
    public AnimatorSet A02;
    public ValueAnimator A03;
    public View A04;
    public RecyclerView A05;
    public AnonymousClass5ZU A06;
    public AnonymousClass4WP A07;
    public C1229166i A08;
    public List A09;

    public void A01() {
        C06440Xs layoutManager;
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int A082 = layoutManager.A08();
            View A0Q = recyclerView.getLayoutManager().A0Q(0);
            if (A082 != 0 && A0Q != null) {
                int width = recyclerView.getWidth();
                ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(A0Q);
                int width2 = A0Q.getWidth() + A0T.leftMargin + A0T.rightMargin;
                int paddingRight = recyclerView.getPaddingRight();
                if (A082 < this.A09.size()) {
                    int i = A082 * width2;
                    if (paddingRight == 0 && width >= i - A0T.leftMargin && width <= i + A0T.rightMargin) {
                        setSelectedContactsListRightPadding(width2 / 2);
                    }
                } else if (paddingRight > 0) {
                    setSelectedContactsListRightPadding(0);
                }
            }
        }
    }

    public int getSelectedContactsListLeftPadding() {
        return 0;
    }

    public void setSelectedContactsListRightPadding(int i) {
        RecyclerView recyclerView = this.A05;
        C86624Kv.A0y(recyclerView, recyclerView.getPaddingLeft(), i);
    }

    public SelectedContactsList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04 = C06560Yg.A02(this, R.id.selected_items_divider);
        RecyclerView A0P = C86654Ky.A0P(this, R.id.selected_items);
        this.A05 = A0P;
        C86634Kw.A1B(this.A05, A0P, getSelectedContactsListLeftPadding(), this.A05.getPaddingTop(), this.A05.getPaddingRight());
        boolean z = this instanceof GroupCallSelectedContactsList;
        if (z) {
            GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) this;
            RecyclerView recyclerView = groupCallSelectedContactsList.A05;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            int dimensionPixelSize = groupCallSelectedContactsList.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            if (C620733j.A04(groupCallSelectedContactsList.A02)) {
                layoutParams.rightMargin = dimensionPixelSize;
            } else {
                layoutParams.leftMargin = dimensionPixelSize;
            }
            recyclerView.setLayoutParams(layoutParams);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A05.A0o(new C1231467h(this, dimensionPixelSize2, 1));
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(0);
        smoothScrollLinearLayoutManager.A1X(0);
        this.A05.setLayoutManager(smoothScrollLinearLayoutManager);
        this.A05.setItemAnimator(new C198012s());
        int selectedContactsLayoutHeight = getSelectedContactsLayoutHeight();
        this.A01 = selectedContactsLayoutHeight;
        setLayoutParams(new RelativeLayout.LayoutParams(-1, selectedContactsLayoutHeight));
        setVisibility(4);
        AnonymousClass4WP r1 = new AnonymousClass4WP(this.A06, this);
        this.A07 = r1;
        this.A05.setAdapter(r1);
        if (z) {
            GroupCallSelectedContactsList groupCallSelectedContactsList2 = (GroupCallSelectedContactsList) this;
            groupCallSelectedContactsList2.A00 = C86664Kz.A10(groupCallSelectedContactsList2, R.id.selected_list_action_fab_1);
            groupCallSelectedContactsList2.A01 = C86664Kz.A10(groupCallSelectedContactsList2, R.id.selected_list_action_fab_2);
            groupCallSelectedContactsList2.A00.setVisibility(0);
            groupCallSelectedContactsList2.A01.setVisibility(0);
            C107335b8.A0C(context, groupCallSelectedContactsList2.A00, R.drawable.ic_groupcall_voice, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
            C107335b8.A0C(context, groupCallSelectedContactsList2.A01, R.drawable.ic_groupcall_video, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
            groupCallSelectedContactsList2.A00.setContentDescription(groupCallSelectedContactsList2.getResources().getString(R.string.f11nameremoved));
            groupCallSelectedContactsList2.A01.setContentDescription(groupCallSelectedContactsList2.getResources().getString(R.string.f11nameremoved));
            C18300x5.A18(groupCallSelectedContactsList2.A00, groupCallSelectedContactsList2, 33);
            C18300x5.A18(groupCallSelectedContactsList2.A01, groupCallSelectedContactsList2, 34);
            C620733j r4 = groupCallSelectedContactsList2.A02;
            WaImageButton waImageButton = groupCallSelectedContactsList2.A00;
            int i2 = -groupCallSelectedContactsList2.A00;
            int i3 = dimensionPixelSize2;
            C107555bV.A06(waImageButton, r4, 0, dimensionPixelSize2, i2, i3);
            C107555bV.A06(groupCallSelectedContactsList2.A01, groupCallSelectedContactsList2.A02, 0, dimensionPixelSize2, i2, i3);
            groupCallSelectedContactsList2.A05.postDelayed(C117695sL.A00(groupCallSelectedContactsList2, 10), 200);
        }
    }

    public final void A02(View view, View view2, boolean z) {
        int i;
        AnimatorSet animatorSet;
        this.A02 = C86664Kz.A0O();
        if (z) {
            this.A08.Bs7();
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A03.end();
        }
        int[] A1Z = C86664Kz.A1Z();
        if (!z || view2.getVisibility() != 8) {
            i = 0;
        } else {
            i = view2.getMeasuredHeight();
        }
        A1Z[0] = i;
        ValueAnimator A0Q = C86664Kz.A0Q(A1Z, this.A01);
        A0Q.addUpdateListener(new C107745bp(view));
        A0Q.addListener(new C107705bl(this));
        A0Q.setDuration(240);
        if (this instanceof GroupCallSelectedContactsList) {
            GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) this;
            groupCallSelectedContactsList.setUpSelectedButtonAnimatorSet(A0Q, groupCallSelectedContactsList.A02);
            animatorSet = groupCallSelectedContactsList.A02;
        } else {
            this.A02.play(A0Q);
            animatorSet = this.A02;
        }
        animatorSet.start();
    }

    public int getSelectedContactsLayoutHeight() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void setCallback(C1229166i r1) {
        this.A08 = r1;
    }

    public void setSelectedContacts(List list) {
        this.A09 = list;
    }

    public int getSelectedContactsLayout() {
        return R.layout.f8nameremoved;
    }

    public SelectedContactsList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedContactsList(Context context) {
        this(context, (AttributeSet) null);
    }
}
