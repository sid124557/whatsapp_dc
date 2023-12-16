package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5b2  reason: invalid class name and case insensitive filesystem */
public abstract class C107275b2 {
    public static final boolean A00 = C18280x3.A1U(Build.VERSION.SDK_INT, 22);

    public void A0B() {
        MediaViewBaseFragment mediaViewBaseFragment = ((C96014vU) this).A06;
        if (mediaViewBaseFragment.A1K() != null) {
            mediaViewBaseFragment.A0R().overridePendingTransition(0, 0);
        }
    }

    public void A0C(Bundle bundle) {
        C96014vU r6 = (C96014vU) this;
        MediaViewBaseFragment mediaViewBaseFragment = r6.A06;
        if (mediaViewBaseFragment.A1K() == null) {
            mediaViewBaseFragment.A1O();
            return;
        }
        C134346ir r3 = mediaViewBaseFragment.A09;
        Object A1M = mediaViewBaseFragment.A1M(r3.getCurrentItem());
        if (C86604Kt.A0A(mediaViewBaseFragment).orientation != r6.A03 || A1M == null || !A1M.equals(mediaViewBaseFragment.A1L())) {
            r3.setPivotX((float) C86664Kz.A0E(r3, 2));
            r3.setPivotY((float) (r3.getHeight() / 2));
            r6.A02 = 0;
            r6.A04 = 0;
        }
        r3.animate().setDuration(240).scaleX(r6.A01).scaleY(r6.A00).translationX((float) r6.A02).translationY((float) r6.A04).alpha(0.0f).setListener(new AnonymousClass67L(r6, 15));
        ObjectAnimator ofInt = ObjectAnimator.ofInt(r6.A05, "alpha", new int[]{255, 0});
        ofInt.setDuration(240);
        C86614Ku.A0y(ofInt);
        ofInt.start();
    }

    public void A0D(Bundle bundle, C182718os r12) {
        C96014vU r5 = (C96014vU) this;
        MediaViewBaseFragment mediaViewBaseFragment = r5.A06;
        C134346ir r3 = mediaViewBaseFragment.A09;
        int i = bundle.getInt("x", 0);
        int i2 = bundle.getInt("y", 0);
        int i3 = bundle.getInt("width", 0);
        int i4 = bundle.getInt("height", 0);
        mediaViewBaseFragment.A03.setVisibility(8);
        mediaViewBaseFragment.A0J = false;
        View findViewById = mediaViewBaseFragment.A0J().findViewById(R.id.background);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        r5.A05 = colorDrawable;
        findViewById.setBackground(colorDrawable);
        r3.getViewTreeObserver().addOnPreDrawListener(new C110115fi(r3, r12, r5, i, i2, i3, i4));
    }

    public static Bundle A04(Activity activity, View view) {
        if (view == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0A(AnonymousClass001.A0Q(activity), A0s);
        int[] A1Z = C86664Kz.A1Z();
        view.getLocationOnScreen(A1Z);
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("x", A1Z[0]);
        A08.putInt("y", A1Z[1]);
        A08.putInt("width", view.getWidth());
        A08.putInt("height", view.getHeight());
        A08.putStringArrayList("visible_shared_elements", A0s);
        return A08;
    }

    public static Bundle A05(Activity activity, View view, String str) {
        if (!A00 || view == null) {
            return null;
        }
        return new C004705b(AnonymousClass0RF.A00(activity, view, str)).A00.toBundle();
    }

    public static void A07(Activity activity, AnonymousClass1VX r4) {
        StringBuilder sb;
        String str;
        String str2;
        if (!A00) {
            str2 = "MediaViewTransitionHelper/removeActivityFromTransitionManager/SHARED_ELEMENT_TRANSITIONS_SUPPORTED is disabled";
        } else if (!r4.A0X(4018)) {
            str2 = "MediaViewTransitionHelper/removeActivityFromTransitionManager/abProps is disabled";
        } else {
            Class<AnonymousClass0XC> cls = AnonymousClass0XC.class;
            try {
                Field declaredField = cls.getDeclaredField("sRunningTransitions");
                declaredField.setAccessible(true);
                ThreadLocal threadLocal = (ThreadLocal) declaredField.get(cls);
                if (threadLocal.get() == null || ((Reference) threadLocal.get()).get() == null) {
                    Log.d("MediaViewTransitionHelper/removeActivityFromTransitionManager/no running transitions");
                    return;
                }
                Log.d("MediaViewTransitionHelper/removeActivityFromTransitionManager/removing running transitions");
                C06290Wz r2 = (C06290Wz) ((Reference) threadLocal.get()).get();
                View A0Q = AnonymousClass001.A0Q(activity);
                if (r2.containsKey(A0Q)) {
                    Log.d("MediaViewTransitionHelper/removeActivityFromTransitionManager/removed decor view");
                    r2.remove(A0Q);
                    return;
                }
                return;
            } catch (NoSuchFieldException e) {
                e = e;
                sb = AnonymousClass001.A0o();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/NoSuchFieldException ";
                C18260x0.A16(str, sb, e);
                return;
            } catch (IllegalAccessException e2) {
                e = e2;
                sb = AnonymousClass001.A0o();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/IllegalAccessException ";
                C18260x0.A16(str, sb, e);
                return;
            } catch (NullPointerException e3) {
                e = e3;
                sb = AnonymousClass001.A0o();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/NullPointerException ";
                C18260x0.A16(str, sb, e);
                return;
            }
        }
        Log.d(str2);
    }

    public static void A08(Context context, Intent intent, View view) {
        Activity A01 = C621633u.A01(context, C009707r.class);
        if (A01 != null) {
            intent.putExtra("animation_bundle", A04(A01, view));
        }
    }

    public static void A09(Context context, Intent intent, View view, AnonymousClass5MG r5, String str) {
        C009707r r1 = (C009707r) C621633u.A01(context, C009707r.class);
        if (!A00 || r1 == null) {
            context.startActivity(intent);
            if (r1 != null) {
                r1.overridePendingTransition(0, 0);
                return;
            }
            return;
        }
        C96024vV.A02(intent, view, r1, r5, str);
    }

    public static View A06(View view, String str) {
        if (str.equals(AnonymousClass0YZ.A06(view))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A06 = A06(viewGroup.getChildAt(i), str);
                if (A06 != null) {
                    return A06;
                }
            }
        }
        return null;
    }

    public static void A0A(View view, Collection collection) {
        if (!TextUtils.isEmpty(AnonymousClass0YZ.A06(view))) {
            collection.add(AnonymousClass0YZ.A06(view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A0A(viewGroup.getChildAt(i), collection);
            }
        }
    }
}
