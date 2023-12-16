package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import org.json.JSONObject;

/* renamed from: X.4v5  reason: invalid class name and case insensitive filesystem */
public class C95924v5 extends C135676l4 {
    public Drawable A00;
    public C106655Zv A01;
    public final Context A02;
    public final AnonymousClass5Y0 A03;
    public final boolean A04;

    public C95924v5(Context context, AnonymousClass5Y0 r4, JSONObject jSONObject) {
        this.A02 = context;
        this.A03 = r4;
        this.A04 = false;
        if (jSONObject.has("emoji")) {
            this.A01 = new C106655Zv(jSONObject.getString("emoji"));
            A0Y(true);
            super.A0O(jSONObject);
        }
    }

    public Drawable A09() {
        return this.A00;
    }

    public String A0B() {
        return "emoji";
    }

    public String A0C(Context context) {
        C106655Zv r0 = this.A01;
        if (r0 == null) {
            return context.getString(R.string.f11nameremoved);
        }
        return r0.toString();
    }

    public void A0K(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            RectF rectF = this.A02;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            canvas.save();
            C86604Kt.A16(canvas, rectF, this.A00);
            this.A00.draw(canvas);
            canvas.restore();
        }
    }

    public boolean A0Q() {
        return false;
    }

    public boolean A0R() {
        return false;
    }

    public float A0X() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) this.A00.getIntrinsicHeight());
    }

    public final void A0Y(boolean z) {
        Drawable A05;
        C106655Zv r0 = this.A01;
        if (r0 != null) {
            C94274qr r5 = new C94274qr(r0.A00);
            long A0N = C86664Kz.A0N(r5);
            if (this.A04) {
                A05 = this.A03.A05(this.A02.getResources(), r5, A0N);
            } else if (z) {
                AnonymousClass5Y0 r4 = this.A03;
                Resources resources = this.A02.getResources();
                C157917j8 A06 = r4.A06(r5, A0N);
                if (A06 == null) {
                    A05 = null;
                } else {
                    A05 = r4.A03(resources, A06, r4.A05, (C182418oN) null);
                    if (A05 == null) {
                        A05 = r4.A03(resources, A06, r4.A06, new C114075mS(r4));
                    }
                }
            } else {
                A05 = this.A03.A02(this.A02.getResources(), new AnonymousClass8GP(this), r5, A0N);
            }
            this.A00 = A05;
        }
    }

    public void A0L(Canvas canvas) {
        A0K(canvas);
    }

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        super.A0M(rectF, f, f2, f3, f4);
        if (!this.A04) {
            RectF rectF2 = this.A02;
            if (rectF2.width() > 128.0f || rectF2.height() > 128.0f) {
                A0F(C86664Kz.A00(128.0f, rectF2.height(), 128.0f / rectF2.width()));
            }
        }
    }

    public void A0P(JSONObject jSONObject) {
        super.A0P(jSONObject);
        C106655Zv r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("emoji", r0.toString());
        }
    }

    public C95924v5(Context context, C106655Zv r3, AnonymousClass5Y0 r4, boolean z) {
        this.A01 = r3;
        this.A02 = context;
        this.A03 = r4;
        this.A04 = z;
        A0Y(false);
    }
}
