package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Ss  reason: invalid class name and case insensitive filesystem */
public class C87454Ss extends ConstraintLayout {
    public int A00;
    public AnonymousClass6D7 A01;
    public final Runnable A02;

    public void A05() {
        AnonymousClass0XZ r5 = new AnonymousClass0XZ();
        r5.A0B(this);
        HashMap A0t = AnonymousClass001.A0t();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                Object tag = childAt.getTag(R.id.material_clock_level);
                if (tag == null) {
                    tag = AnonymousClass001.A0f();
                }
                if (!A0t.containsKey(tag)) {
                    C86624Kv.A1R(tag, A0t);
                }
                ((List) A0t.get(tag)).add(childAt);
            }
        }
        Iterator A0u = AnonymousClass001.A0u(A0t);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            List list = (List) A0w.getValue();
            int A06 = C18280x3.A06(A0w);
            int i2 = this.A00;
            if (A06 == 2) {
                i2 = AnonymousClass001.A07((float) i2, 0.66f);
            }
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                AnonymousClass0TP r0 = r5.A04(C86654Ky.A0H(it).getId()).A02;
                r0.A0C = R.id.circle_center;
                r0.A0D = i2;
                r0.A00 = f;
                f += 360.0f / ((float) list.size());
            }
        }
        r5.A09(this);
    }

    public int getRadius() {
        return this.A00;
    }

    public void setBackgroundColor(int i) {
        this.A01.A06(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.A00 = i;
        A05();
    }

    public C87454Ss(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        AnonymousClass6D7 r3 = new AnonymousClass6D7();
        this.A01 = r3;
        C170098Bw r2 = new C170098Bw(0.5f);
        C158227jd r1 = new C158227jd(r3.A03.A0K);
        r1.A02 = r2;
        r1.A03 = r2;
        r1.A01 = r2;
        r1.A00 = r2;
        r3.setShapeAppearanceModel(new C161877ql(r1));
        this.A01.A06(ColorStateList.valueOf(-1));
        AnonymousClass0YY.A04(this.A01, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A0W, i, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A02 = new C172668Mf(this, 43);
        obtainStyledAttributes.recycle();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(AnonymousClass0YH.A00());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A02;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        A05();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A02;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public C87454Ss(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
