package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.5at  reason: invalid class name and case insensitive filesystem */
public class C107215at {
    public static int A01(AnonymousClass3ZF r4) {
        int i = r4.A00;
        if ((r4.A0I != null || !r4.A0E.A03) && i == 5) {
            return R.color.f5nameremoved;
        }
        return R.color.f5nameremoved;
    }

    public static C166087y7 A03(Context context, String str, boolean z) {
        if (str == null) {
            return null;
        }
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        return new C166087y7(AnonymousClass002.A0F(context, C107305b5.A05(str, z), AnonymousClass002.A0L(), 0, i), z, context.getString(R.string.f11nameremoved));
    }

    public static boolean A06(AnonymousClass1VX r3, C187958y5 r4, CallInfo callInfo) {
        int A00 = AnonymousClass5AJ.A00(callInfo.participants);
        if (!callInfo.videoEnabled || !r4.BIC() || A00 > r3.A0N(3694)) {
            return false;
        }
        if (((C172068Jm) r4).A01.A0N(3171) >= 2 || A00 <= 2) {
            return true;
        }
        return false;
    }

    public static int A00(Activity activity) {
        Point A07 = AnonymousClass4L0.A07();
        Rect A0N = AnonymousClass001.A0N();
        C86604Kt.A0x(activity, A07);
        AnonymousClass001.A0Q(activity).getWindowVisibleDisplayFrame(A0N);
        return A07.y - A0N.top;
    }

    public static AnimationSet A02(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.f0nameremoved);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.f0nameremoved);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(view.getContext(), R.anim.f0nameremoved);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(loadAnimation);
        animationSet.addAnimation(loadAnimation3);
        animationSet.addAnimation(loadAnimation2);
        animationSet.setRepeatMode(1);
        animationSet.setRepeatCount(-1);
        animationSet.setStartOffset(750);
        animationSet.setAnimationListener(new C188988zo(view, 0, animationSet));
        return animationSet;
    }

    public static void A04(Context context, View view) {
        ShapeDrawable A0H = C86634Kw.A0H();
        TypedValue A0B = AnonymousClass4L0.A0B();
        context.getTheme().resolveAttribute(R.attr.f3nameremoved, A0B, true);
        A0H.getPaint().setColor(A0B.data);
        AnonymousClass0YY.A04(A0H, view);
    }

    public static void A05(View view, boolean z) {
        view.setEnabled(z);
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
    }
}
