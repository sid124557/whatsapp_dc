package com.whatsapp.languageselector;

import X.AnonymousClass002;
import X.AnonymousClass0ID;
import X.AnonymousClass15T;
import X.AnonymousClass4L0;
import X.AnonymousClass4OR;
import X.AnonymousClass64B;
import X.AnonymousClass65I;
import X.AnonymousClass65J;
import X.AnonymousClass65K;
import X.AnonymousClass65L;
import X.AnonymousClass666;
import X.AnonymousClass6B8;
import X.C06560Yg;
import X.C08310eF;
import X.C110185fp;
import X.C1237569q;
import X.C18300x5;
import X.C18310x6;
import X.C56972sr;
import X.C620633i;
import X.C620733j;
import X.C86604Kt;
import X.C86614Ku;
import X.C86654Ky;
import X.C989553w;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class LanguageSelectorBottomSheet extends Hilt_LanguageSelectorBottomSheet implements AnonymousClass64B {
    public BottomSheetListView A00;
    public C56972sr A01;
    public C620633i A02;
    public C620733j A03;
    public AnonymousClass65J A04;
    public AnonymousClass65K A05;
    public AnonymousClass65L A06;
    public AnonymousClass666 A07;

    public static LanguageSelectorBottomSheet A00() {
        LanguageSelectorBottomSheet languageSelectorBottomSheet = new LanguageSelectorBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("HEADER_TEXT_KEY", R.string.f11nameremoved);
        A08.putBoolean("SHOW_CONTINUE_CTA", true);
        A08.putInt("CONTINUE_CTA_GLYPH", R.drawable.ic_link_action);
        languageSelectorBottomSheet.A0u(A08);
        return languageSelectorBottomSheet;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C989553w r0;
        Object A0R;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        int i = 8;
        C06560Yg.A02(inflate, R.id.topHandle).setVisibility(C86614Ku.A01(A1Y() ? 1 : 0));
        C18310x6.A18(C06560Yg.A02(inflate, R.id.closeButton), this, 47);
        Bundle bundle2 = this.A06;
        if (bundle2 == null) {
            bundle2 = AnonymousClass002.A08();
        }
        C18300x5.A0G(inflate, R.id.appLanguageText).setText(bundle2.getInt("HEADER_TEXT_KEY", R.string.f11nameremoved));
        this.A00 = (BottomSheetListView) C06560Yg.A02(inflate, R.id.languageSelectorListView);
        WDSButton A0f = C86654Ky.A0f(inflate, R.id.continue_cta);
        Bundle bundle3 = this.A06;
        if (bundle3 == null) {
            bundle3 = AnonymousClass002.A08();
        }
        if (bundle3.getBoolean("SHOW_CONTINUE_CTA", false)) {
            i = 0;
        }
        Bundle bundle4 = this.A06;
        if (bundle4 == null) {
            bundle4 = AnonymousClass002.A08();
        }
        A0f.setIcon(bundle4.getInt("CONTINUE_CTA_GLYPH", 0));
        A0f.setVisibility(i);
        if (i == 0) {
            r0 = new C989553w(this, 48);
        } else {
            r0 = null;
        }
        A0f.setOnClickListener(r0);
        C08310eF r02 = this.A0E;
        if (r02 == null || !(r02 instanceof AnonymousClass65I)) {
            if (A0R() instanceof AnonymousClass65I) {
                A0R = A0R();
            }
            return inflate;
        }
        A0R = A0N();
        AnonymousClass4OR B4A = ((AnonymousClass65I) A0R).B4A();
        this.A00.setAdapter(B4A);
        this.A00.setOnItemClickListener(new C1237569q(B4A, 1, this));
        BottomSheetListView bottomSheetListView = this.A00;
        bottomSheetListView.setOnScrollListener(new C110185fp(C06560Yg.A02(inflate, R.id.divider), bottomSheetListView, this, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved)));
        return inflate;
    }

    public void A0d() {
        super.A0d();
        AnonymousClass666 r0 = this.A07;
        if (r0 != null) {
            r0.BV0();
        }
        this.A06 = null;
        this.A07 = null;
        this.A05 = null;
        this.A04 = null;
    }

    public void A0g() {
        Dialog dialog;
        Window window;
        super.A0g();
        AnonymousClass666 r0 = this.A07;
        if (r0 != null) {
            r0.BV2();
        }
        if (!A1Y() && (dialog = this.A03) != null && (window = dialog.getWindow()) != null) {
            AnonymousClass0ID.A00(window, false);
            dialog.findViewById(R.id.container).setFitsSystemWindows(false);
            dialog.findViewById(R.id.coordinator).setFitsSystemWindows(false);
            AnonymousClass6B8.A00(dialog.findViewById(R.id.container), this, 5);
        }
    }

    public void A0h() {
        super.A0h();
        AnonymousClass666 r0 = this.A07;
        if (r0 != null) {
            r0.BV0();
        }
    }

    public void A1X(View view) {
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(view);
        if (!A1Y()) {
            A012.A0a(new AnonymousClass15T(A012, this));
        } else {
            A012.A0p = true;
        }
        Point A072 = AnonymousClass4L0.A07();
        C86604Kt.A0x(A0R(), A072);
        A012.A0U((int) (((double) A072.y) * 0.5d), false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass65L r0 = this.A06;
        if (r0 != null) {
            r0.BV1();
        }
        AnonymousClass666 r02 = this.A07;
        if (r02 != null) {
            r02.BV0();
        }
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
