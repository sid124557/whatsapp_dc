package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.style.ImageSpan;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.84g  reason: invalid class name and case insensitive filesystem */
public class C1681384g implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        if (obj3 != null) {
            AnonymousClass7PO r9 = (AnonymousClass7PO) obj3;
            AnonymousClass8LO r1 = r9.A03;
            ColorStateList colorStateList = r1.A0Q;
            rCTextView.A0B = r9.A04;
            rCTextView.A0A = r9.A02;
            rCTextView.A00 = r9.A00;
            rCTextView.A01 = r9.A01;
            rCTextView.A02 = r1.A09;
            rCTextView.A03 = r1.A0A;
            rCTextView.A0C = r9.A05;
            int i = r1.A0N;
            if (i != 0) {
                rCTextView.A07 = null;
                rCTextView.A04 = i;
            } else {
                rCTextView.A07 = colorStateList;
                rCTextView.A04 = colorStateList.getDefaultColor();
                Layout layout = rCTextView.A0A;
                if (layout != null) {
                    layout.getPaint().setColor(rCTextView.A07.getColorForState(rCTextView.getDrawableState(), rCTextView.A04));
                }
            }
            rCTextView.A02(0, 0);
            ImageSpan[] imageSpanArr = r9.A07;
            if (imageSpanArr != null) {
                rCTextView.A0G = imageSpanArr;
                int length = imageSpanArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Drawable drawable = rCTextView.A0G[i2].getDrawable();
                    drawable.setCallback(rCTextView);
                    drawable.setVisible(true, false);
                }
            }
            rCTextView.A0F = r9.A06;
            String str = r9.A03.A0Y;
            if (str != null) {
                rCTextView.setContentDescription(str);
            }
            rCTextView.invalidate();
            return null;
        }
        throw AnonymousClass002.A0E("Missing text layout context!");
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RCTextView rCTextView = (RCTextView) obj;
        rCTextView.A0B = null;
        rCTextView.A0A = null;
        rCTextView.A00 = 0.0f;
        rCTextView.A01 = 0.0f;
        rCTextView.A02 = 0;
        rCTextView.A03 = 0;
        rCTextView.A07 = null;
        rCTextView.A04 = 0;
        ImageSpan[] imageSpanArr = rCTextView.A0G;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = rCTextView.A0G[i].getDrawable();
                drawable.setCallback((Drawable.Callback) null);
                drawable.setVisible(false, false);
            }
            rCTextView.A0G = null;
        }
        rCTextView.A0F = null;
        rCTextView.setContentDescription("");
        AnonymousClass4TN r0 = rCTextView.A0H;
        if (r0 != null) {
            r0.A0H();
        }
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
