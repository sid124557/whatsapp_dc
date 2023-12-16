package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.6AF  reason: invalid class name */
public class AnonymousClass6AF implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass6AF(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public boolean onPreDraw() {
        switch (this.A03) {
            case 0:
                C93324oK r1 = (C93324oK) this.A02;
                AnonymousClass0x7.A16(r1, this);
                r1.A12((AnonymousClass2z0) this.A01);
                return true;
            case 3:
                View view = (View) this.A01;
                int width = view.getWidth();
                if (width <= 0) {
                    return true;
                }
                AnonymousClass0x7.A16(view, this);
                TextView textView = (TextView) this.A02;
                int compoundPaddingLeft = width - (textView.getCompoundPaddingLeft() + textView.getCompoundPaddingRight());
                String A0u = C86614Ku.A0u(textView);
                float textSize = textView.getTextSize();
                while (textSize > 1.0f && textView.getPaint().measureText(A0u) >= ((float) compoundPaddingLeft)) {
                    textSize -= 1.0f;
                    textView.setTextSize(textSize);
                }
                return true;
            default:
                View view2 = (View) this.A01;
                int height = view2.getHeight();
                View view3 = (View) this.A02;
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), view3.getPaddingBottom() + height);
                AnonymousClass0x7.A16(view2, this);
                return false;
        }
    }
}
