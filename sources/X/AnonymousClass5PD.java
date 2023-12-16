package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;

/* renamed from: X.5PD  reason: invalid class name */
public class AnonymousClass5PD {
    public AnonymousClass487 A00;
    public boolean A01;
    public final Context A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final TextEmojiLabel A05;
    public final TextEmojiLabel A06;
    public final WaEditText A07;
    public final WaImageView A08;
    public final C620633i A09;
    public final C620733j A0A;
    public final C50632iV A0B;
    public final AnonymousClass5Y0 A0C;
    public final C106195Xz A0D;
    public final C60152y5 A0E;
    public final C55832qz A0F;
    public final AnonymousClass108 A0G = new AnonymousClass108();
    public final AnonymousClass108 A0H;
    public final C33141sV A0I;
    public final AnonymousClass107 A0J;
    public final AnonymousClass4FS A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public AnonymousClass5PD(ViewGroup viewGroup, C15910sA r29, C620633i r30, C620733j r31, C50632iV r32, AnonymousClass5Y0 r33, C106195Xz r34, C60152y5 r35, C55832qz r36, C33141sV r37, AnonymousClass4FS r38, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass108 r1 = new AnonymousClass108();
        this.A0H = r1;
        AnonymousClass107 A0O = AnonymousClass4L0.A0O(Boolean.FALSE);
        this.A0J = A0O;
        this.A0D = r34;
        this.A0K = r38;
        this.A0F = r36;
        this.A0I = r37;
        this.A0B = r32;
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        this.A02 = context;
        this.A04 = viewGroup2;
        AnonymousClass5Y0 r15 = r33;
        this.A0C = r15;
        C620633i r17 = r30;
        this.A09 = r17;
        C60152y5 r14 = r35;
        this.A0E = r14;
        C620733j r12 = r31;
        this.A0A = r12;
        this.A00 = new C114055mQ();
        FrameLayout A0L2 = C86654Ky.A0L(viewGroup2, R.id.thumbnail_container);
        FrameLayout A0L3 = C86654Ky.A0L(viewGroup2, R.id.caption_container);
        this.A06 = AnonymousClass0x7.A0K(viewGroup2, R.id.title);
        this.A05 = AnonymousClass0x7.A0K(viewGroup2, R.id.subtitle);
        this.A08 = AnonymousClass0x9.A0L(A0L2, R.id.thumbnail);
        boolean z5 = z;
        this.A0L = z5;
        this.A0M = z2;
        this.A0N = z3;
        ViewGroup A0I2 = C86644Kx.A0I(viewGroup2, R.id.appended_message_container);
        this.A03 = A0I2;
        WaEditText waEditText = (WaEditText) C06560Yg.A02(A0I2, R.id.appended_message);
        this.A07 = waEditText;
        A0L3.setForeground(AnonymousClass0RP.A00(context, R.drawable.forward_preview_rounded_corners));
        A0L2.setForeground(AnonymousClass0RP.A00(context, R.drawable.forward_preview_rounded_corners));
        viewGroup2.setClickable(true);
        viewGroup2.setImportantForAccessibility(2);
        A0L3.setClickable(true);
        A0L3.setImportantForAccessibility(2);
        C15910sA r13 = r29;
        AnonymousClass6C6.A02(r13, r1, this, 166);
        View A022 = C06560Yg.A02(viewGroup2, R.id.cancel);
        int i = !z3 ? 0 : 8;
        C18310x6.A17(A022, this, 35);
        A022.setEnabled(!z3);
        A022.setVisibility(i);
        LayoutTransition layoutTransition = viewGroup2.getLayoutTransition();
        Animator animator = layoutTransition.getAnimator(1);
        if (animator instanceof ObjectAnimator) {
            AnimatorSet A0O2 = C86664Kz.A0O();
            A0O2.setStartDelay(animator.getStartDelay());
            animator.setStartDelay(0);
            A0O2.play(animator);
            layoutTransition.setAnimator(1, A0O2);
        }
        layoutTransition.setDuration(3, 100);
        layoutTransition.setInterpolator(3, new AccelerateDecelerateInterpolator());
        layoutTransition.setDuration(1, 200);
        layoutTransition.setStartDelay(1, 100);
        layoutTransition.setInterpolator(1, new AccelerateDecelerateInterpolator());
        boolean z6 = z4;
        if (z4) {
            waEditText.addTextChangedListener(new AnonymousClass52T(waEditText, (TextView) null, r17, r12, this.A00, r15, r14, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, false, z6));
            waEditText.addTextChangedListener(new AnonymousClass52O(waEditText, r12));
        }
        A0O.A0B(r13, new C100635Br(A0L3, this, 1, z5));
        A0L3.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BJ(A0L3, viewGroup2, this, 0));
    }
}
