package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import com.whatsapp.R;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.6BI  reason: invalid class name */
public class AnonymousClass6BI implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass6BI(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onGlobalLayout() {
        View view;
        if (this.A04 != 0) {
            ConversationListView conversationListView = (ConversationListView) this.A00;
            if (C105895Wv.A00((View) this.A01)) {
                C86604Kt.A1G(conversationListView, this);
                conversationListView.A05();
                AnonymousClass66v r0 = (AnonymousClass66v) this.A03;
                if (r0 != null && r0.B8N() && (view = (View) this.A02) != null) {
                    view.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        C91504kC r6 = (C91504kC) this.A00;
        Adapter adapter = (Adapter) this.A01;
        View view2 = (View) this.A02;
        View view3 = (View) this.A03;
        if (r6.A0I.isLayoutRequested()) {
            return;
        }
        if (r6.getHeight() >= r6.getWidth() && !r6.A0Y) {
            int A022 = C86654Ky.A02(r6.getResources(), R.dimen.f6nameremoved, Math.max(r6.getMeasuredHeight() - (AnonymousClass4L0.A04(view2, (r6.A0D.getMeasuredHeight() - r6.getMeasuredWidth()) + (adapter.getCount() * r6.getResources().getDimensionPixelSize(R.dimen.f6nameremoved))) + r6.A04(r6.A0C.getMeasuredWidth())), 0));
            if (view3.getPaddingBottom() != A022) {
                view3.setPadding(0, 0, 0, A022);
            }
        } else if (view3.getPaddingBottom() != 0) {
            view3.setPadding(0, 0, 0, 0);
        }
    }
}
