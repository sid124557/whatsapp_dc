package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.67i  reason: invalid class name and case insensitive filesystem */
public class C1231567i extends C04580Ov {
    public Object A00;
    public final int A01;

    public C1231567i(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01(Canvas canvas, AnonymousClass0Q1 r11, RecyclerView recyclerView) {
        if (1 - this.A01 != 0) {
            super.A01(canvas, r11, recyclerView);
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        C111445i6 r6 = (C111445i6) this.A00;
        int i = paddingLeft + ((int) r6.A01);
        int A03 = AnonymousClass4L0.A03(recyclerView, recyclerView.getWidth() - ((int) r6.A02));
        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
            View childAt = recyclerView.getChildAt(i2);
            C002102g r1 = (C002102g) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + r1.bottomMargin;
            int intrinsicHeight = r6.A0I.getIntrinsicHeight() + bottom;
            if (r1.A01() == 0 && r6.A0n == null) {
                r6.A0I.setBounds(0, bottom, recyclerView.getWidth(), intrinsicHeight);
            } else {
                r6.A0I.setBounds(i, bottom, A03, intrinsicHeight);
            }
            r6.A0I.draw(canvas);
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r7, RecyclerView recyclerView) {
        if (this.A01 != 0) {
            super.A03(rect, view, r7, recyclerView);
            return;
        }
        super.A03(rect, view, r7, recyclerView);
        if (RecyclerView.A00(view) != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
            boolean A04 = C620733j.A04(conversationsFragment.A1l);
            int applyDimension = (int) TypedValue.applyDimension(1, 6.0f, C08310eF.A09(conversationsFragment).getDisplayMetrics());
            if (A04) {
                rect.left = applyDimension;
            } else {
                rect.right = applyDimension;
            }
        }
    }
}
