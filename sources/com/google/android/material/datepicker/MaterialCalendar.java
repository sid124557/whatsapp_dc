package com.google.android.material.datepicker;

import X.AnonymousClass0Q1;
import X.AnonymousClass4WH;
import X.AnonymousClass4X1;
import X.AnonymousClass4XU;
import X.C011909n;
import X.C06560Yg;
import X.C08310eF;
import X.C102775Kf;
import X.C108625dI;
import X.C109705f3;
import X.C117045rI;
import X.C117705sM;
import X.C141296vL;
import X.C170028Bo;
import X.C18280x3;
import X.C188778zT;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import X.C87154Of;
import X.C87164Og;
import X.C88054Xd;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

public final class MaterialCalendar extends PickerFragment {
    public static final Object A0B = "MONTHS_VIEW_GROUP_TAG";
    public static final Object A0C = "NAVIGATION_NEXT_TAG";
    public static final Object A0D = "NAVIGATION_PREV_TAG";
    public static final Object A0E = "SELECTOR_TOGGLE_TAG";
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public RecyclerView A05;
    public RecyclerView A06;
    public C108625dI A07;
    public C102775Kf A08;
    public C141296vL A09;
    public C117045rI A0A;

    public void A0q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A00);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A07);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A0A);
    }

    public void A1H(C117045rI r7) {
        RecyclerView recyclerView = this.A05;
        AnonymousClass4X1 r1 = (AnonymousClass4X1) recyclerView.A0N;
        int A0K = r1.A0K(r7);
        int A0K2 = A0K - r1.A0K(this.A0A);
        boolean z = true;
        boolean A1W = C86624Kv.A1W(Math.abs(A0K2), 3);
        if (A0K2 <= 0) {
            z = false;
        }
        this.A0A = r7;
        if (A1W) {
            int i = A0K + 3;
            if (z) {
                i = A0K - 3;
            }
            recyclerView.A0Z(i);
        }
        this.A05.post(new C117705sM((Object) this, A0K, 3));
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C87164Og r0;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(A1D(), this.A00);
        this.A08 = new C102775Kf(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C117045rI r8 = this.A07.A06;
        boolean A012 = MaterialDatePicker.A01(contextThemeWrapper, 16843277);
        int i = R.layout.f8nameremoved;
        final int i2 = 0;
        if (A012) {
            i = R.layout.f8nameremoved;
            i2 = 1;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources A092 = C08310eF.A09(this);
        int dimensionPixelSize = A092.getDimensionPixelSize(R.dimen.f6nameremoved) + A092.getDimensionPixelOffset(R.dimen.f6nameremoved) + A092.getDimensionPixelOffset(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = A092.getDimensionPixelSize(R.dimen.f6nameremoved);
        int i3 = C87154Of.A04;
        inflate.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (A092.getDimensionPixelSize(R.dimen.f6nameremoved) * i3) + ((i3 - 1) * A092.getDimensionPixelOffset(R.dimen.f6nameremoved)) + A092.getDimensionPixelOffset(R.dimen.f6nameremoved));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        C06560Yg.A0O(gridView, new C188778zT(this, 4));
        int i4 = this.A07.A01;
        if (i4 <= 0) {
            r0 = new C87164Og();
        }
        gridView.setAdapter(r0);
        gridView.setNumColumns(r8.A02);
        gridView.setEnabled(false);
        this.A05 = C86664Kz.A0w(inflate, R.id.mtrl_calendar_months);
        A1D();
        this.A05.setLayoutManager(new SmoothCalendarLayoutManager(i2) {
            public void A1g(AnonymousClass0Q1 r6, int[] iArr) {
                int height;
                int i = i2;
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                RecyclerView recyclerView = materialCalendar.A05;
                if (i == 0) {
                    iArr[0] = recyclerView.getWidth();
                    height = materialCalendar.A05.getWidth();
                } else {
                    iArr[0] = recyclerView.getHeight();
                    height = materialCalendar.A05.getHeight();
                }
                iArr[1] = height;
            }
        });
        this.A05.setTag("MONTHS_VIEW_GROUP_TAG");
        AnonymousClass4X1 r2 = new AnonymousClass4X1(contextThemeWrapper, this.A07, new C170028Bo(this));
        this.A05.setAdapter(r2);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.f7nameremoved);
        RecyclerView A0w = C86664Kz.A0w(inflate, R.id.mtrl_calendar_year_selector_frame);
        this.A06 = A0w;
        if (A0w != null) {
            A0w.A0h = true;
            A0w.setLayoutManager(new GridLayoutManager(integer, 1));
            this.A06.setAdapter(new AnonymousClass4WH(this));
            this.A06.A0o(new AnonymousClass4XU(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C06560Yg.A0O(materialButton, new C188778zT(this, 6));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.A03 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.A02 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.A04 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.A01 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            this.A09 = C141296vL.DAY;
            C86644Kx.A1I(this, 8, 0);
            A1H(this.A0A);
            C117045rI r1 = this.A0A;
            String str = r1.A00;
            if (str == null) {
                str = DateUtils.formatDateTime((Context) null, r1.A06.getTimeInMillis(), 8228);
                r1.A00 = str;
            }
            materialButton.setText(str);
            this.A05.A0q(new C88054Xd(materialButton, this, r2));
            C18280x3.A0p(materialButton, this, 2);
            C109705f3.A00(this.A02, this, r2, 2);
            C109705f3.A00(this.A03, this, r2, 1);
        }
        if (!MaterialDatePicker.A01(contextThemeWrapper, 16843277)) {
            new C011909n().A06(this.A05);
        }
        this.A05.A0Z(r2.A0K(this.A0A));
        C06560Yg.A0O(this.A05, new C188778zT(this, 5));
        return inflate;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (bundle == null) {
            bundle = this.A06;
        }
        this.A00 = bundle.getInt("THEME_RES_ID_KEY");
        bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A07 = (C108625dI) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.A0A = (C117045rI) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
