package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0GJ  reason: invalid class name */
public enum AnonymousClass0GJ {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static AnonymousClass0GJ A00(int i) {
        if (i == 0) {
            return VISIBLE;
        }
        if (i == 4) {
            return INVISIBLE;
        }
        if (i == 8) {
            return GONE;
        }
        throw AnonymousClass000.A0G("Unknown visibility ", AnonymousClass001.A0o(), i);
    }

    public static AnonymousClass0GJ A01(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return INVISIBLE;
        }
        return A00(view.getVisibility());
    }

    public void A02(View view) {
        int i;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (C08270df.A05(2)) {
                    AnonymousClass000.A1E(" to VISIBLE", "FragmentManager", AnonymousClass000.A0k(view, "SpecialEffectsController: Setting view "));
                }
                i = 0;
            } else if (ordinal != 2) {
                if (C08270df.A05(2)) {
                    AnonymousClass000.A1E(" to INVISIBLE", "FragmentManager", AnonymousClass000.A0k(view, "SpecialEffectsController: Setting view "));
                }
                view.setVisibility(4);
                return;
            } else {
                if (C08270df.A05(2)) {
                    AnonymousClass000.A1E(" to GONE", "FragmentManager", AnonymousClass000.A0k(view, "SpecialEffectsController: Setting view "));
                }
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (C08270df.A05(2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("SpecialEffectsController: Removing view ");
                A0o.append(view);
                AnonymousClass000.A18(viewGroup, " from container ", "FragmentManager", A0o);
            }
            viewGroup.removeView(view);
        }
    }
}
