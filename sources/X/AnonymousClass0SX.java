package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.List;

/* renamed from: X.0SX  reason: invalid class name */
public class AnonymousClass0SX {
    public static final int[][] A00 = {new int[0], new int[]{16842908}, new int[]{16842913}, new int[]{16842919}, new int[]{-16842910}};

    public static Drawable A00(C153427bI r13, AnonymousClass84O r14, AnonymousClass84O r15) {
        Drawable A06;
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable[] drawableArr = new Drawable[6];
        List A0R = r14.A0R(35);
        for (int i = 0; i < A0R.size(); i++) {
            AnonymousClass84O r7 = (AnonymousClass84O) A0R.get(i);
            AnonymousClass84O A0J = r7.A0K(35);
            if (A0J == null) {
                C159737mN.A01("StateDrawableUtils", "Null Drawable model when creating children of a StateDrawable");
                A06 = new ColorDrawable();
            } else {
                A06 = C158977kt.A00().A04().A06(r13, A0J, r15);
            }
            String A0P = r7.A0P(36, "");
            switch (A0P.hashCode()) {
                case -691041417:
                    if (!A0P.equals("focused")) {
                        break;
                    } else {
                        drawableArr[1] = A06;
                        break;
                    }
                case -318264286:
                    if (!A0P.equals("pressed")) {
                        break;
                    } else {
                        drawableArr[3] = A06;
                        break;
                    }
                case 270940796:
                    if (!A0P.equals("disabled")) {
                        break;
                    } else {
                        drawableArr[4] = A06;
                        break;
                    }
                case 1191572123:
                    if (!A0P.equals("selected")) {
                        break;
                    } else {
                        drawableArr[2] = A06;
                        break;
                    }
                case 1544803905:
                    if (!A0P.equals(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID)) {
                        break;
                    } else {
                        drawableArr[0] = A06;
                        break;
                    }
            }
        }
        int i2 = 5;
        do {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                stateListDrawable.addState(A00[i2], drawable);
            }
            i2--;
        } while (i2 >= 0);
        return stateListDrawable;
    }
}
