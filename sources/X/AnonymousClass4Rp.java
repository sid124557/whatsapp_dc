package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.R;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.4Rp  reason: invalid class name */
public class AnonymousClass4Rp extends PopupWindow {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final View A05;
    public final ViewTreeObserver.OnGlobalLayoutListener A06 = new AnonymousClass6BG((Object) this, 13);
    public final FrameLayout.LayoutParams A07;
    public final FrameLayout A08;
    public final BoundedLinearLayout A09;
    public final C69263Wi A0A;
    public final CircularRevealView A0B;
    public final ConversationAttachmentContentView A0C;
    public final C105895Wv A0D;
    public final WeakReference A0E;
    public final boolean A0F;

    public final void A05() {
        int[] iArr = new int[2];
        this.A05.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        CircularRevealView circularRevealView = this.A0B;
        circularRevealView.getLocationOnScreen(iArr2);
        int i = 0;
        int i2 = (iArr[0] + this.A00) - iArr2[0];
        if (this.A02) {
            i = this.A08.getMeasuredHeight();
        }
        circularRevealView.A00 = i2;
        circularRevealView.A01 = i;
    }

    public static /* synthetic */ void A00(AnonymousClass4Rp r2) {
        r2.A0B.setVisibility(8);
        super.dismiss();
    }

    public final int A02(Activity activity) {
        this.A08.measure(0, 0);
        View view = this.A05;
        view.measure(0, 0);
        if (!C105895Wv.A00(view) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            return -(view.getMeasuredHeight() + this.A0C.A01(view));
        }
        return 0;
    }

    public final void A04() {
        if (this.A03) {
            this.A03 = false;
            this.A08.getViewTreeObserver().removeOnGlobalLayoutListener(this.A06);
        }
    }

    public final void A07(Activity activity, int i, int i2, boolean z) {
        int i3;
        int i4;
        ConversationAttachmentContentView conversationAttachmentContentView;
        CircularRevealView circularRevealView;
        FrameLayout.LayoutParams layoutParams;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        C08310eF A0D2;
        View view;
        boolean z2 = z;
        this.A02 = z2;
        Activity activity2 = activity;
        Display A0f = C86664Kz.A0f(activity2);
        Point A052 = AnonymousClass5YI.A05(activity2.getWindowManager());
        if (!(activity2 instanceof C009707r) || (A0D2 = ((C003203q) activity2).getSupportFragmentManager().A0D("com.whatsapp.HomeActivity.ConversationFragment")) == null || !A0D2.A19() || (view = A0D2.A0B) == null) {
            i3 = -1;
        } else {
            i3 = view.getWidth();
        }
        int[] A1Z = C86664Kz.A1Z();
        View view2 = this.A05;
        view2.getLocationOnScreen(A1Z);
        int A092 = C86634Kw.A09(view2, A1Z);
        this.A01 = A1Z[0];
        if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = view2.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            i4 = 0;
        } else {
            i4 = displayCutout.getSafeInsetTop();
        }
        BoundedLinearLayout boundedLinearLayout = this.A09;
        int i5 = i2;
        if (!z) {
            boundedLinearLayout.A00 = Integer.MAX_VALUE;
            boundedLinearLayout.A01 = Integer.MAX_VALUE;
            circularRevealView = this.A0B;
            C86614Ku.A1D(circularRevealView, 0);
            conversationAttachmentContentView = this.A0C;
            conversationAttachmentContentView.A07 = 0;
            layoutParams = this.A07;
            layoutParams.height = -1;
            int i6 = A092 + i2;
            boundedLinearLayout.getLayoutParams().height = (A052.y + i4) - i6;
            showAtLocation(view2, 8388661, 0, i6);
        } else {
            conversationAttachmentContentView = this.A0C;
            boundedLinearLayout.A00 = conversationAttachmentContentView.A01(view2);
            boundedLinearLayout.A01 = conversationAttachmentContentView.A00(view2);
            circularRevealView = this.A0B;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), this.A04);
            boundedLinearLayout.getLayoutParams().height = -2;
            layoutParams = this.A07;
            layoutParams.height = -2;
            conversationAttachmentContentView.A07 = conversationAttachmentContentView.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
            showAsDropDown(view2, 0, i5, 8388661);
        }
        circularRevealView.forceLayout();
        int i7 = i;
        circularRevealView.A02 = i7;
        if (z) {
            boundedLinearLayout.measure(0, 0);
            int measuredWidth = boundedLinearLayout.getMeasuredWidth();
            int A022 = (int) (((float) A052.x) - ((((float) C86654Ky.A02(activity2.getResources(), R.dimen.f6nameremoved, C86654Ky.A02(activity2.getResources(), R.dimen.f6nameremoved, activity2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved)))) + activity2.getResources().getDimension(R.dimen.f6nameremoved)) * 2.0f));
            if ((A0f.getRotation() == 1 || A0f.getRotation() == 3) && A022 > measuredWidth) {
                layoutParams.width = A022;
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = -1;
                int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
            }
            C86614Ku.A11(activity2, boundedLinearLayout, R.drawable.ib_attach_panel);
        } else {
            layoutParams.width = -1;
            boolean z3 = this.A0F;
            int i8 = R.attr.f3nameremoved;
            int i9 = R.color.f5nameremoved;
            if (z3) {
                i8 = R.attr.f3nameremoved;
                i9 = R.color.f5nameremoved;
            }
            C86604Kt.A0z(activity2, circularRevealView, AnonymousClass5Yj.A02(activity2, i8, i9));
            AnonymousClass0Y8.A04(activity2, AnonymousClass5Yj.A02(activity2, R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        if (i3 != -1) {
            layoutParams.width = i3;
            layoutParams.gravity = 8388613;
        }
        circularRevealView.setVisibility(0);
        AnonymousClass6BG.A00(circularRevealView.getViewTreeObserver(), this, 14);
        if (i > 0) {
            conversationAttachmentContentView.A08(i7, z2);
        }
    }

    public AnonymousClass4Rp(Activity activity, View view, C69263Wi r11, ConversationCommunityViewModel conversationCommunityViewModel, C89894fS r13, C620633i r14, AnonymousClass1VX r15, C95814uZ r16, C105895Wv r17, boolean z) {
        super(activity);
        this.A0A = r11;
        this.A0D = r17;
        this.A05 = view;
        this.A0E = AnonymousClass0x9.A14(activity);
        this.A0F = C86614Ku.A1Y(r15);
        AnonymousClass4P0 r7 = new AnonymousClass4P0(activity, activity, this);
        this.A08 = r7;
        C86624Kv.A10(r7, -1, -2);
        activity.getLayoutInflater().inflate(R.layout.f8nameremoved, r7, true);
        CircularRevealView circularRevealView = (CircularRevealView) C06560Yg.A02(r7, R.id.paper_clip_layout);
        this.A0B = circularRevealView;
        this.A09 = (BoundedLinearLayout) C06560Yg.A02(r7, R.id.content);
        this.A07 = C86664Kz.A0r(circularRevealView);
        this.A04 = circularRevealView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        circularRevealView.setVisibility(0);
        setContentView(r7);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(0);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new C100695Bx(activity, this, r14, 0));
        ConversationAttachmentContentView conversationAttachmentContentView = (ConversationAttachmentContentView) C06560Yg.A02(circularRevealView, R.id.conversation_content_view);
        this.A0C = conversationAttachmentContentView;
        conversationAttachmentContentView.A09(conversationCommunityViewModel, r13, r16, z);
    }

    public void A03() {
        A04();
        this.A0B.setVisibility(8);
        super.dismiss();
    }

    public void A06(Activity activity) {
        boolean z;
        Resources resources = activity.getResources();
        int[] iArr = new int[2];
        View view = this.A05;
        view.getLocationOnScreen(iArr);
        if (AnonymousClass5YI.A05(C620633i.A01(this.A08.getContext())).y - C86634Kw.A09(view, iArr) < activity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            z = true;
        } else {
            z = false;
        }
        this.A00 = C86664Kz.A0E(view, 2);
        if (z) {
            A07(activity, 300, A02(activity), true);
        } else {
            A07(activity, 300, resources.getDimensionPixelSize(R.dimen.f6nameremoved), false);
        }
    }

    public void dismiss() {
        if (isShowing()) {
            this.A0C.A05();
            A05();
            int[] A1Z = C86664Kz.A1Z();
            this.A05.getLocationOnScreen(A1Z);
            C86614Ku.A0G(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (float) (this.A00 + A1Z[0]), 1, C86634Kw.A00(this.A02 ? 1 : 0)), 1.0f, 1.0f - 1.0f).setDuration(300);
            CircularRevealView circularRevealView = this.A0B;
            circularRevealView.A02 = 300;
            if (!circularRevealView.A09) {
                int max = Math.max(circularRevealView.getWidth(), circularRevealView.getHeight());
                if (circularRevealView.isAttachedToWindow()) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(circularRevealView, circularRevealView.A00, circularRevealView.A01, (float) max, 0.0f);
                    createCircularReveal.setDuration((long) circularRevealView.A02);
                    AnonymousClass67L.A01(createCircularReveal, circularRevealView, 8);
                    createCircularReveal.addListener(circularRevealView.A03);
                    createCircularReveal.start();
                } else {
                    circularRevealView.setVisibility(8);
                }
            }
        }
        A04();
        this.A0A.A0T(new C69973Zj(this, 37), 300);
    }
}
