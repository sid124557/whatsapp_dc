package com.whatsapp.greenalert;

import X.AnonymousClass0YZ;
import X.AnonymousClass1VX;
import X.AnonymousClass31f;
import X.AnonymousClass33X;
import X.AnonymousClass4SG;
import X.AnonymousClass4ZT;
import X.AnonymousClass5X8;
import X.AnonymousClass808;
import X.AnonymousClass92L;
import X.C005205m;
import X.C106675Zy;
import X.C107695bk;
import X.C111095hX;
import X.C1232067n;
import X.C15870s6;
import X.C18300x5;
import X.C51922kb;
import X.C57162tC;
import X.C620633i;
import X.C620733j;
import X.C634239e;
import X.C635339p;
import X.C64333Db;
import X.C66433Lk;
import X.C69183Wa;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86664Kz;
import X.C89644eZ;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;
import com.whatsapp.wds.components.button.WDSButton;

public class GreenAlertActivity extends C89644eZ {
    public static final int[] A0I = {R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A0J = {R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A0K = {R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A0L = {R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A0M = {R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A0N = {R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A0O = {R.string.f11nameremoved, R.string.f11nameremoved};
    public View A00;
    public View A01;
    public WaImageButton A02;
    public WaImageButton A03;
    public WaImageButton A04;
    public WaTabLayout A05;
    public WaViewPager A06;
    public C57162tC A07;
    public C620733j A08;
    public AnonymousClass4ZT A09;
    public C51922kb A0A;
    public AnonymousClass33X A0B;
    public C66433Lk A0C;
    public C69183Wa A0D;
    public C106675Zy A0E;
    public WDSButton A0F;
    public boolean A0G;
    public final C15870s6 A0H;

    public void A5r() {
        if (!this.A0G) {
            this.A0G = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A0E = C86624Kv.A0W(A2Y);
            this.A0C = C86604Kt.A0e(A2Y);
            this.A08 = C64333Db.A2t(A2Y);
            this.A0A = (C51922kb) A2Y.AZZ.get();
            this.A0B = (AnonymousClass33X) A2Y.AZa.get();
            this.A0D = (C69183Wa) A2Y.AYu.get();
            this.A07 = C86624Kv.A0R(A2Y);
        }
    }

    public final void A74() {
        int currentLogicalItem = this.A06.getCurrentLogicalItem();
        if (AnonymousClass31f.A02(this.A0B)) {
            C51922kb r2 = this.A0A;
            int i = 12;
            if (currentLogicalItem == 1) {
                i = 4;
            }
            r2.A01(Integer.valueOf(i));
            finish();
            return;
        }
        C111095hX.A06(this);
    }

    public final void A75() {
        WaViewPager waViewPager = this.A06;
        View findViewWithTag = waViewPager.findViewWithTag(Integer.valueOf(waViewPager.getCurrentLogicalItem()));
        if (findViewWithTag != null) {
            findViewWithTag.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass92L(findViewWithTag, 2, this));
        }
    }

    public final void A76(int i) {
        this.A02.setVisibility(C86664Kz.A03(i));
        WDSButton wDSButton = this.A0F;
        int i2 = R.string.f11nameremoved;
        if (i == 1) {
            i2 = R.string.f11nameremoved;
        }
        wDSButton.setText(i2);
    }

    public final void A77(int i) {
        WaImageButton waImageButton;
        View findViewWithTag = this.A06.findViewWithTag(Integer.valueOf(i));
        if (findViewWithTag != null) {
            int i2 = 0;
            if (i != 1 || !this.A06.findViewWithTag(1).canScrollVertically(1)) {
                this.A0F.setVisibility(0);
                waImageButton = this.A04;
                i2 = 8;
            } else {
                this.A0F.setVisibility(4);
                waImageButton = this.A04;
            }
            waImageButton.setVisibility(i2);
            float dimension = getResources().getDimension(R.dimen.f6nameremoved);
            View view = this.A01;
            float f = 0.0f;
            if (findViewWithTag.getScrollY() <= 0) {
                dimension = 0.0f;
            }
            AnonymousClass0YZ.A0B(view, dimension);
            float dimension2 = getResources().getDimension(R.dimen.f6nameremoved);
            boolean canScrollVertically = findViewWithTag.canScrollVertically(1);
            View view2 = this.A00;
            if (canScrollVertically) {
                f = dimension2;
            }
            AnonymousClass0YZ.A0B(view2, f);
        }
    }

    public void onBackPressed() {
        int max = Math.max(-1, this.A06.getCurrentLogicalItem() - 1);
        if (max < 0) {
            A74();
            return;
        }
        this.A06.setCurrentLogicalItem(max);
        A76(max);
        A77(max);
    }

    public GreenAlertActivity(int i) {
        this.A0G = false;
        C86604Kt.A1K(this, 42);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A75();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A02 = (WaImageButton) C005205m.A00(this, R.id.green_alert_back_button);
        this.A03 = (WaImageButton) C005205m.A00(this, R.id.green_alert_dismiss_button);
        this.A0F = (WDSButton) C005205m.A00(this, R.id.green_alert_continue_button);
        this.A04 = (WaImageButton) C005205m.A00(this, R.id.green_alert_scroll_tos_button);
        this.A05 = (WaTabLayout) C005205m.A00(this, R.id.green_alert_tab_layout);
        this.A01 = C005205m.A00(this, R.id.green_alert_sticky_top_panel);
        this.A00 = C005205m.A00(this, R.id.green_alert_sticky_bottom_panel);
        this.A06 = (WaViewPager) C005205m.A00(this, R.id.green_alert_viewpager);
        boolean A022 = AnonymousClass31f.A02(this.A0B);
        AnonymousClass1VX r11 = this.A0D;
        C69263Wi r6 = this.A05;
        C106675Zy r13 = this.A0E;
        C111095hX r5 = this.A00;
        AnonymousClass5X8 r7 = this.A03;
        C66433Lk r12 = this.A0C;
        C620633i r8 = this.A08;
        C620733j r10 = this.A08;
        AnonymousClass4ZT r3 = new AnonymousClass4ZT(this.A0H, r5, r6, r7, r8, this.A07, r10, r11, r12, r13);
        this.A09 = r3;
        this.A06.setAdapter(r3);
        this.A06.A0G(new C1232067n(this, 0));
        C86614Ku.A1J(this.A06.getViewTreeObserver(), this, 6);
        this.A05.setupWithViewPager(this.A06);
        this.A05.setupTabsForAccessibility(this.A0F);
        this.A05.setTabsClickable(false);
        this.A02.setOnClickListener(new C634239e(5, this, A022));
        C635339p.A00(this.A03, this, 40);
        this.A0F.setOnClickListener(new C634239e(6, this, A022));
        C635339p.A00(this.A04, this, 41);
        int intExtra = getIntent().getIntExtra("page", 0);
        this.A06.setCurrentLogicalItem(intExtra);
        A76(intExtra);
        A77(intExtra);
        this.A0A.A01(C18300x5.A0Z());
    }

    public void onResume() {
        super.onResume();
        this.A03.setVisibility(C86664Kz.A03(AnonymousClass31f.A02(this.A0B) ? 1 : 0));
    }

    public GreenAlertActivity() {
        this(0);
        this.A0H = new AnonymousClass808(this);
    }
}
