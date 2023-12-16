package X;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;

/* renamed from: X.7XM  reason: invalid class name */
public class AnonymousClass7XM {
    public ValueAnimator A00;
    public ValueAnimator A01;
    public final Activity A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final ClearableEditText A0A;
    public final C620733j A0B;
    public final C125226Gy A0C;
    public final C27801eg A0D;
    public final C105895Wv A0E;
    public final AnonymousClass107 A0F;

    public final void A00(long j, boolean z) {
        C188668zI r7;
        int A052;
        int A053;
        long j2 = j;
        if (z) {
            int width = this.A0A.getWidth();
            View view = this.A03;
            int A054 = C86614Ku.A05(view, R.dimen.f6nameremoved);
            r7 = new C188668zI(this, 20);
            A01(r7, width, A054, j2);
            if (!C86604Kt.A1Z(this.A0F)) {
                A053 = C86614Ku.A05(view, R.dimen.f6nameremoved);
                A052 = C86614Ku.A05(view, R.dimen.f6nameremoved);
            } else {
                return;
            }
        } else {
            View view2 = this.A03;
            int A055 = C86614Ku.A05(view2, R.dimen.f6nameremoved);
            int A056 = C86614Ku.A05(view2, R.dimen.f6nameremoved);
            r7 = new C188668zI(this, 21);
            A01(r7, A055, A056, j2);
            if (!C86604Kt.A1Z(this.A0F)) {
                A052 = C86614Ku.A05(view2, R.dimen.f6nameremoved);
                A053 = C86614Ku.A05(view2, R.dimen.f6nameremoved);
            } else {
                return;
            }
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.A00 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A00.removeAllListeners();
        }
        this.A00.setDuration(j);
        this.A00.addUpdateListener(new AnonymousClass75O(this.A05.getLayoutParams(), A052, A053, 1));
        this.A00.addListener(r7);
        this.A00.start();
    }

    public final void A01(AnimatorListenerAdapter animatorListenerAdapter, int i, int i2, long j) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.A01 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A01.removeAllListeners();
        }
        this.A01.setDuration(j);
        View view = this.A04;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setVisibility(0);
        this.A01.addUpdateListener(new C162607sS(layoutParams, this, i, view.getWidth(), i2, view.getHeight()));
        this.A01.addListener(animatorListenerAdapter);
        this.A01.start();
    }

    public AnonymousClass7XM(Activity activity, View view, C15910sA r8, C15940sD r9, C620733j r10, C27801eg r11, C105895Wv r12, AnonymousClass107 r13) {
        this.A0E = r12;
        this.A0B = r10;
        this.A0D = r11;
        this.A03 = view;
        this.A02 = activity;
        this.A0F = r13;
        this.A0C = (C125226Gy) new AnonymousClass0XL((C17190ui) new AnonymousClass80L(), r9).A01(C125226Gy.class);
        this.A09 = C18300x5.A0G(view, R.id.sticker_tab_button);
        this.A08 = C18300x5.A0G(view, R.id.emoji_tab_button);
        this.A06 = C06560Yg.A02(view, R.id.tab_buttons_container);
        this.A05 = C06560Yg.A02(view, R.id.search_container);
        this.A0A = (ClearableEditText) C06560Yg.A02(view, R.id.search_entry);
        this.A07 = AnonymousClass0x9.A0E(view, R.id.search_icon);
        this.A04 = C06560Yg.A02(view, R.id.search_button);
        View view2 = this.A06;
        view2.setVisibility(0);
        TextView textView = this.A09;
        C18290x4.A1F(textView, this, 32);
        TextView textView2 = this.A08;
        C18290x4.A1F(textView2, this, 33);
        if (r10.A0U()) {
            textView.setBackgroundResource(R.drawable.shape_picker_right_tab_background);
            textView2.setBackgroundResource(R.drawable.shape_picker_left_tab_background);
        }
        view2.addOnLayoutChangeListener(new C1891690g(this, 4));
        ClearableEditText clearableEditText = this.A0A;
        clearableEditText.setHint(R.string.f11nameremoved);
        clearableEditText.getBackground().setAlpha(clearableEditText.hasFocus() ? 230 : 204);
        clearableEditText.setOnFocusChangeListener(new C1892090k(this, 5));
        clearableEditText.addTextChangedListener(new C32961ry(clearableEditText, this.A05, this.A0C));
        clearableEditText.A01 = new C109365eV(this, 34);
        clearableEditText.setVisibility(4);
        clearableEditText.setAlwaysShowClearIcon(true);
        View view3 = this.A04;
        C18290x4.A1F(view3, this, 35);
        view3.setVisibility(0);
        ImageView imageView = this.A07;
        imageView.setVisibility(0);
        imageView.requestLayout();
        A00(0, false);
        C27801eg r2 = this.A0D;
        r2.A00 = new C1898993b(this, 1);
        this.A0C.A01.A0H(Boolean.valueOf(r2.A02));
        r2.A01((Integer) null);
        C86604Kt.A1N(r8, this.A0F, this, 277);
        C125226Gy r22 = this.A0C;
        C86604Kt.A1N(r8, r22.A03, this, 278);
        C86604Kt.A1N(r8, r22.A01, this, 279);
        C86604Kt.A1N(r8, r22.A00, this, 280);
    }
}
