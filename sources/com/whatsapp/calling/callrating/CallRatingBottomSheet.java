package com.whatsapp.calling.callrating;

import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass60O;
import X.AnonymousClass64B;
import X.AnonymousClass66R;
import X.AnonymousClass6Yr;
import X.AnonymousClass8Y0;
import X.C003203q;
import X.C06560Yg;
import X.C1001359q;
import X.C107405bG;
import X.C119035wK;
import X.C154517dI;
import X.C162457s7;
import X.C18300x5;
import X.C86604Kt;
import X.C86654Ky;
import X.C86664Kz;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

public final class CallRatingBottomSheet extends BottomSheetDialogFragment implements AnonymousClass64B {
    public View A00;
    public WaTextView A01;
    public NonDraggableBottomSheetBehaviour A02;
    public WDSButton A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C119035wK(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        if (inflate == null) {
            return null;
        }
        View[] viewArr = new View[2];
        viewArr[0] = C06560Yg.A02(inflate, R.id.close_button);
        Iterator it = AnonymousClass0x9.A19(C06560Yg.A02(inflate, R.id.not_now_button), viewArr, 1).iterator();
        while (it.hasNext()) {
            C18300x5.A18(C86654Ky.A0H(it), this, 41);
        }
        this.A01 = AnonymousClass0x7.A0L(inflate, R.id.title_text);
        this.A00 = C06560Yg.A02(inflate, R.id.bottom_sheet);
        WDSButton A0f = C86654Ky.A0f(inflate, R.id.submit_button);
        C18300x5.A18(A0f, this, 42);
        this.A03 = A0f;
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(C06560Yg.A02(inflate, R.id.bottom_sheet));
        C162457s7.A0K(A012, "null cannot be cast to non-null type com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour<@[FlexibleNullability] android.view.View?>");
        NonDraggableBottomSheetBehaviour nonDraggableBottomSheetBehaviour = (NonDraggableBottomSheetBehaviour) A012;
        nonDraggableBottomSheetBehaviour.A0S(3);
        nonDraggableBottomSheetBehaviour.A0d(true);
        nonDraggableBottomSheetBehaviour.A0c(true);
        nonDraggableBottomSheetBehaviour.A0p = false;
        nonDraggableBottomSheetBehaviour.A00 = false;
        this.A02 = nonDraggableBottomSheetBehaviour;
        Dialog dialog = this.A03;
        if (dialog != null) {
            C107405bG.A02(R.color.f5nameremoved, dialog);
        }
        AnonymousClass66R r5 = this.A04;
        C86604Kt.A1N(A0V(), C86664Kz.A14(r5).A0A, new AnonymousClass8Y0(this), 149);
        C86604Kt.A1N(A0V(), C86664Kz.A14(r5).A08, new AnonymousClass60O(this), 150);
        C86604Kt.A1N(A0V(), C86664Kz.A14(r5).A09, C1001359q.A00(this, 14), 151);
        return inflate;
    }

    public void A0c() {
        super.A0c();
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
    }

    public void A0g() {
        super.A0g();
        ViewParent parent = A0J().getParent();
        C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior A012 = BottomSheetBehavior.A01((View) parent);
        C162457s7.A0D(A012);
        A012.A0S(3);
    }

    public void A0p(Bundle bundle) {
        Window window;
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
        C003203q A0Q = A0Q();
        if (A0Q != null && (window = A0Q.getWindow()) != null) {
            window.setStatusBarColor(0);
        }
    }

    public Dialog A1J(Bundle bundle) {
        return new AnonymousClass6Yr(A0G(), C86664Kz.A14(this.A04), A1H());
    }
}
