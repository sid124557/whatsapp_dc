package X;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.4Rl  reason: invalid class name */
public class AnonymousClass4Rl extends PopupWindow {
    public final View A00;
    public final C89654ea A01;
    public final C94024pj A02;
    public final C620733j A03;

    public AnonymousClass4Rl(View view, C89654ea r12, C620633i r13, C620733j r14, C624134x r15, ReactionsTrayViewModel reactionsTrayViewModel, boolean z) {
        int i;
        this.A03 = r14;
        this.A01 = r12;
        this.A00 = view;
        ReactionsTrayViewModel reactionsTrayViewModel2 = reactionsTrayViewModel;
        C94024pj r7 = new C94024pj(r12, reactionsTrayViewModel2);
        this.A02 = r7;
        FrameLayout frameLayout = new FrameLayout(r12);
        int dimensionPixelOffset = this.A01.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        int i2 = !z ? r15.A1J.A02 ? 8388613 : 8388611 : 8388611;
        reactionsTrayViewModel2.A01 = C86604Kt.A02(r12);
        Rect A0N = AnonymousClass001.A0N();
        AnonymousClass001.A0Q(r12).getWindowVisibleDisplayFrame(A0N);
        int width = AnonymousClass001.A0Q(r12).getWidth();
        boolean z2 = false;
        if (reactionsTrayViewModel2.A01 == 2) {
            i = width - (A0N.right - A0N.left);
        } else {
            i = 0;
        }
        frameLayout.setPadding(dimensionPixelOffset, 0, i + dimensionPixelOffset, 0);
        frameLayout.setClipToPadding(false);
        C86654Ky.A17(r7, frameLayout, -2, i2);
        setContentView(frameLayout);
        setBackgroundDrawable(new ColorDrawable(r12.getResources().getColor(R.color.f5nameremoved)));
        setTouchable(true);
        AccessibilityManager A0P = r13.A0P();
        if (A0P != null && A0P.isTouchExplorationEnabled()) {
            z2 = true;
        }
        setFocusable(z2);
        setOutsideTouchable(true);
        setWidth(-1);
        setHeight(-2);
        setInputMethodMode(2);
        setTouchInterceptor(new C100655Bt(frameLayout, 2, this));
    }
}
