package X;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5UA  reason: invalid class name */
public abstract class AnonymousClass5UA {
    public boolean A00 = false;
    public final Resources A01;
    public final Paint A02;
    public final RectF A03;
    public final Handler A04;
    public final Vibrator A05;
    public final View A06;
    public final ViewGroup A07;
    public final Runnable A08;
    public final Runnable A09;

    public Path A01() {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (!(this instanceof C95914v4)) {
            return ((AnonymousClass4v3) this).A01;
        }
        C95914v4 r4 = (C95914v4) this;
        PointF pointF = r4.A02;
        if (pointF == null || (i = r4.A01) == -1) {
            return null;
        }
        if (i != 0) {
            if (i == 1) {
                float f6 = pointF.y - pointF.x;
                RectF rectF = r4.A03;
                float f7 = rectF.left;
                float f8 = f6 + f7;
                float f9 = rectF.top;
                if (f8 >= f9) {
                    f9 = f8;
                } else {
                    f7 = f9 - f6;
                }
                f3 = rectF.right;
                f5 = f6 + f3;
                f4 = rectF.bottom;
                if (f5 > f4) {
                    f3 = f4 - f6;
                }
            } else if (i == 2) {
                f = pointF.x;
                RectF rectF2 = r4.A03;
                f2 = rectF2.top;
                f4 = rectF2.bottom;
                f3 = f;
            } else if (i != 3) {
                return null;
            } else {
                float f10 = pointF.y + pointF.x;
                RectF rectF3 = r4.A03;
                f = rectF3.left;
                float f11 = f10 - f;
                f2 = rectF3.bottom;
                if (f11 <= f2) {
                    f2 = f11;
                } else {
                    f = f10 - f2;
                }
                f3 = rectF3.right;
                f5 = f10 - f3;
                f4 = rectF3.top;
                if (f5 < f4) {
                    f3 = f10 - f4;
                }
            }
            f4 = f5;
        } else {
            RectF rectF4 = r4.A03;
            f = rectF4.left;
            f2 = pointF.y;
            f3 = rectF4.right;
            f4 = f2;
        }
        Path A062 = AnonymousClass002.A06();
        A062.rewind();
        A062.moveTo(f, f2);
        A062.lineTo(f3, f4);
        return A062;
    }

    public void A02() {
        Handler handler = this.A04;
        handler.removeCallbacks(this.A09);
        handler.post(this.A08);
        this.A00 = false;
    }

    public void A03() {
        Vibrator vibrator;
        Handler handler = this.A04;
        handler.removeCallbacks(this.A08);
        handler.post(this.A09);
        if (!this.A00 && (vibrator = this.A05) != null) {
            try {
                vibrator.vibrate(3);
            } catch (NullPointerException e) {
                Log.e("Vibrator is broken on this device.", e);
            }
        }
        this.A00 = true;
    }

    public AnonymousClass5UA(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup) {
        int i;
        this.A04 = handler;
        this.A07 = viewGroup;
        this.A03 = rectF;
        this.A05 = vibrator;
        this.A01 = viewGroup.getResources();
        Paint A0Z = C86664Kz.A0Z();
        Resources resources = this.A01;
        if (this instanceof C95914v4) {
            i = R.color.f5nameremoved;
        } else {
            i = R.color.f5nameremoved;
        }
        C86624Kv.A0k(resources, A0Z, i);
        A0Z.setStrokeWidth(C86664Kz.A01(resources, R.dimen.f6nameremoved));
        C86634Kw.A17(A0Z);
        this.A02 = A0Z;
        C188728zO r4 = new C188728zO(viewGroup.getContext(), this, 0);
        C86624Kv.A0v(r4, -1);
        r4.setVisibility(4);
        this.A06 = r4;
        viewGroup.addView(r4, 0);
        this.A09 = new AnonymousClass8MK(r4, 0.0f, 1.0f, 0);
        this.A08 = new AnonymousClass8MK(r4, 1.0f, 0.0f, 4);
    }
}
