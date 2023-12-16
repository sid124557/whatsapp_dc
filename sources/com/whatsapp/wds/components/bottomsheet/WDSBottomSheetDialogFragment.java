package com.whatsapp.wds.components.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass4L0;
import X.AnonymousClass4SH;
import X.AnonymousClass5NC;
import X.AnonymousClass5Vo;
import X.AnonymousClass7PH;
import X.AnonymousClass7SZ;
import X.C08310eF;
import X.C1001359q;
import X.C139786sc;
import X.C139826sg;
import X.C139856sj;
import X.C150497Qy;
import X.C162457s7;
import X.C18270x1;
import X.C86604Kt;
import X.C86624Kv;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.R;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;
import com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesEuropeInfoBottomSheet;
import com.whatsapp.util.Log;

public class WDSBottomSheetDialogFragment extends Hilt_WDSBottomSheetDialogFragment {
    public AnonymousClass5NC A00;
    public AnonymousClass5Vo A01;
    public final AnonymousClass7SZ A02 = C139856sj.A00;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        if (!A1U().A01 || A1S() == 0) {
            return super.A0K(bundle, layoutInflater, viewGroup);
        }
        return layoutInflater.inflate(A1S(), viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        GradientDrawable gradientDrawable;
        C162457s7.A0J(view, 0);
        if (A1U().A01) {
            if (A1T().A06) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    Log.i("WDS: Cannot access parent to inflate bottom sheet handle. Please add it manually.");
                } else {
                    C86604Kt.A1D(view, view.getPaddingLeft(), view.getPaddingTop() + C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
                    ViewParent parent = view.getParent();
                    C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!(viewGroup instanceof FragmentContainerView)) {
                        A0I().inflate(R.layout.f8nameremoved, viewGroup, true);
                    }
                }
            }
            ViewParent parent2 = view.getParent();
            C162457s7.A0K(parent2, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent2;
            if (A1T().A00 != -1) {
                float f = (float) A1T().A00;
                Drawable background = view2.getBackground();
                Drawable drawable = null;
                if (background != null) {
                    drawable = background.mutate();
                }
                if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                    float[] fArr = new float[8];
                    fArr[0] = f;
                    fArr[1] = f;
                    fArr[2] = f;
                    fArr[3] = f;
                    C86624Kv.A1U(fArr, 0.0f);
                    gradientDrawable.setCornerRadii(fArr);
                }
            }
            if (A1T().A02 != -1) {
                view2.setMinimumHeight(A1T().A02);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass4SH r1;
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (A1U().A01) {
            Dialog dialog = this.A03;
            if ((dialog instanceof AnonymousClass4SH) && (r1 = (AnonymousClass4SH) dialog) != null) {
                A1V(r1);
            }
        }
    }

    public void A15(boolean z) {
        AnonymousClass5NC r1 = this.A00;
        if (r1 != null) {
            r1.A00(this, this.A0l, z);
            super.A15(z);
            return;
        }
        throw C18270x1.A0S("fragmentPerfUtils");
    }

    public int A1H() {
        if (!(this instanceof ContactFormBottomSheetFragment) && !(this instanceof SecretCodeAuthenticationBottomSheet) && (this instanceof ScheduleCallFragment)) {
            return R.style.f12nameremoved;
        }
        return R.style.f12nameremoved;
    }

    public int A1S() {
        if (this instanceof NewsletterGuidelinesEuropeInfoBottomSheet) {
            return R.layout.f8nameremoved;
        }
        return 0;
    }

    public final AnonymousClass7PH A1T() {
        AnonymousClass5Vo r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        throw C18270x1.A0S("builder");
    }

    public AnonymousClass7SZ A1U() {
        return this.A02;
    }

    public void A1W(AnonymousClass5Vo r3) {
        if ((this instanceof NewsletterReactionsSheet) || (this instanceof MediaQualitySettingsBottomSheetFragment)) {
            C162457s7.A0J(r3, 0);
            C139786sc r0 = C139786sc.A00;
            AnonymousClass7PH r1 = r3.A00;
            r1.A04 = r0;
            r1.A06 = true;
        }
    }

    public WDSBottomSheetDialogFragment(int i) {
        super(i);
    }

    public void A0p(Bundle bundle) {
        int i;
        super.A0p(bundle);
        if (A1U().A01) {
            Context A0G = A0G();
            Resources A09 = C08310eF.A09(this);
            C162457s7.A0D(A09);
            int A1H = A1H();
            Resources.Theme newTheme = A09.newTheme();
            newTheme.applyStyle(A1H, true);
            TypedValue A0B = AnonymousClass4L0.A0B();
            if (newTheme.resolveAttribute(R.attr.f3nameremoved, A0B, true)) {
                i = A0B.resourceId;
            } else {
                i = R.style.f12nameremoved;
            }
            this.A01 = new AnonymousClass5Vo(A0G, i);
            AnonymousClass7SZ A1U = A1U();
            Resources A092 = C08310eF.A09(this);
            C162457s7.A0D(A092);
            AnonymousClass5Vo r0 = this.A01;
            if (r0 == null) {
                throw C18270x1.A0S("builder");
            }
            A1U.A01(A092, r0);
            AnonymousClass5Vo r02 = this.A01;
            if (r02 == null) {
                throw C18270x1.A0S("builder");
            }
            A1W(r02);
        }
    }

    public Dialog A1J(Bundle bundle) {
        C1001359q r3;
        Window window;
        if (!A1U().A01) {
            Dialog A1J = super.A1J(bundle);
            C162457s7.A0D(A1J);
            return A1J;
        }
        if (A1U().A00) {
            r3 = C1001359q.A00(this, 34);
        } else {
            r3 = null;
        }
        C139826sg r2 = new C139826sg(A0G(), this, r3, A1H());
        if (!A1U().A00) {
            if (r2.A04 == null) {
                r2.A04();
            }
            r2.A04.A0G = A1T().A01;
        }
        if (!(A1T().A03 == -1 || (window = r2.getWindow()) == null)) {
            window.setBackgroundDrawableResource(A1T().A03);
        }
        return r2;
    }

    public final void A1V(AnonymousClass4SH r3) {
        C150497Qy r1;
        boolean A1U = AnonymousClass000.A1U(C86604Kt.A02(A0R()), 2);
        AnonymousClass7PH A1T = A1T();
        if (A1U) {
            r1 = A1T.A05;
        } else {
            r1 = A1T.A04;
        }
        View findViewById = r3.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            r1.A00(findViewById);
        }
    }

    public WDSBottomSheetDialogFragment() {
    }
}
