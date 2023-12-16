package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7bX  reason: invalid class name and case insensitive filesystem */
public final class C153557bX {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Animator A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public Typeface A09;
    public FrameLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public TextView A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public boolean A0H;
    public boolean A0I;
    public final float A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final TimeInterpolator A0N;
    public final TimeInterpolator A0O;
    public final TimeInterpolator A0P;
    public final Context A0Q;
    public final TextInputLayout A0R;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0G) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            r0 = 0
            r4.A0E = r0
            android.animation.Animator r0 = r4.A06
            if (r0 == 0) goto L_0x000a
            r0.cancel()
        L_0x000a:
            int r1 = r4.A00
            r0 = 1
            if (r1 != r0) goto L_0x001f
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.A0G
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r4.A01 = r0
        L_0x001f:
            int r3 = r4.A00
            int r2 = r4.A01
            android.widget.TextView r1 = r4.A0C
            java.lang.String r0 = ""
            boolean r0 = r4.A07(r1, r0)
            r4.A02(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153557bX.A01():void");
    }

    public void A00() {
        EditText editText;
        if (this.A0B != null && (editText = this.A0R.A0b) != null) {
            Context context = this.A0Q;
            boolean A1U = AnonymousClass001.A1U((AnonymousClass001.A0M(context).fontScale > 1.3f ? 1 : (AnonymousClass001.A0M(context).fontScale == 1.3f ? 0 : -1)));
            LinearLayout linearLayout = this.A0B;
            int A032 = AnonymousClass0YH.A03(editText);
            if (A1U) {
                A032 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            if (A1U) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            }
            int A022 = AnonymousClass0YH.A02(editText);
            if (A1U) {
                A022 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            }
            AnonymousClass0YH.A07(linearLayout, A032, dimensionPixelSize, A022, 0);
        }
    }

    public final void A02(int i, int i2, boolean z) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        int i3 = i;
        int i4 = i2;
        if (i3 != i4) {
            boolean z2 = z;
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.A06 = animatorSet;
                ArrayList A0s = AnonymousClass001.A0s();
                A05(this.A0D, A0s, 2, i3, i4, this.A0I);
                A05(this.A0C, A0s, 1, i3, i4, this.A0H);
                C1446272h.A00(animatorSet, A0s);
                if (i3 == 1) {
                    textView3 = this.A0C;
                } else if (i3 != 2) {
                    textView3 = null;
                } else {
                    textView3 = this.A0D;
                }
                if (i4 == 1) {
                    textView4 = this.A0C;
                } else if (i4 != 2) {
                    textView4 = null;
                } else {
                    textView4 = this.A0D;
                }
                animatorSet.addListener(new AnonymousClass6CJ(textView3, textView4, this, i4, i3));
                animatorSet.start();
            } else if (i3 != i4) {
                if (i2 != 0) {
                    if (i4 != 1) {
                        textView2 = this.A0D;
                    } else {
                        textView2 = this.A0C;
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        textView2.setAlpha(1.0f);
                    }
                }
                if (i != 0) {
                    if (i3 != 1) {
                        textView = this.A0D;
                    } else {
                        textView = this.A0C;
                    }
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i3 == 1) {
                            textView.setText((CharSequence) null);
                        }
                    }
                }
                this.A00 = i4;
            }
            TextInputLayout textInputLayout = this.A0R;
            textInputLayout.A04();
            textInputLayout.A0H(z2, false);
            textInputLayout.A06();
        }
    }

    public void A03(TextView textView, int i) {
        if (this.A0B == null && this.A0A == null) {
            Context context = this.A0Q;
            LinearLayout linearLayout = new LinearLayout(context);
            this.A0B = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.A0R;
            textInputLayout.addView(this.A0B, -1, -2);
            this.A0A = new FrameLayout(context);
            this.A0B.addView(this.A0A, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.A0b != null) {
                A00();
            }
        }
        if (i == 0 || i == 1) {
            this.A0A.setVisibility(0);
            this.A0A.addView(textView);
        } else {
            this.A0B.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.A0B.setVisibility(0);
        this.A05++;
    }

    public void A04(TextView textView, int i) {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.A0B;
        if (linearLayout != null) {
            if (!(i == 0 || i == 1) || (viewGroup = this.A0A) == null) {
                viewGroup = linearLayout;
            }
            viewGroup.removeView(textView);
            int i2 = this.A05 - 1;
            this.A05 = i2;
            LinearLayout linearLayout2 = this.A0B;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final void A05(TextView textView, List list, int i, int i2, int i3, boolean z) {
        int i4;
        TimeInterpolator timeInterpolator;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                boolean z2 = false;
                float f = 0.0f;
                if (i3 == i) {
                    z2 = true;
                    f = 1.0f;
                }
                ObjectAnimator A0H2 = AnonymousClass6CA.A0H(View.ALPHA, textView, new float[1], f, 0);
                if (z2) {
                    i4 = this.A0K;
                } else {
                    i4 = this.A0L;
                }
                A0H2.setDuration((long) i4);
                if (z2) {
                    timeInterpolator = this.A0N;
                } else {
                    timeInterpolator = this.A0O;
                }
                A0H2.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    A0H2.setStartDelay((long) this.A0L);
                }
                list.add(A0H2);
                if (i3 == i && i2 != 0) {
                    Property property = View.TRANSLATION_Y;
                    float[] fArr = new float[2];
                    fArr[0] = -this.A0J;
                    ObjectAnimator A0H3 = AnonymousClass6CA.A0H(property, textView, fArr, 0.0f, 1);
                    A0H3.setDuration((long) this.A0M);
                    A0H3.setInterpolator(this.A0P);
                    A0H3.setStartDelay((long) this.A0L);
                    list.add(A0H3);
                }
            }
        }
    }

    public boolean A06() {
        if (this.A01 != 1 || this.A0C == null || TextUtils.isEmpty(this.A0E)) {
            return false;
        }
        return true;
    }

    public final boolean A07(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.A0R;
        if (!C06360Xi.A05(textInputLayout) || !textInputLayout.isEnabled()) {
            return false;
        }
        if (this.A01 != this.A00 || textView == null || !TextUtils.equals(textView.getText(), charSequence)) {
            return true;
        }
        return false;
    }

    public C153557bX(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.A0Q = context;
        this.A0R = textInputLayout;
        this.A0J = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
        this.A0M = C160907oe.A00(context, R.attr.f3nameremoved, 217);
        this.A0K = C160907oe.A00(context, R.attr.f3nameremoved, 167);
        this.A0L = C160907oe.A00(context, R.attr.f3nameremoved, 167);
        this.A0P = AnonymousClass5YH.A01(C159917mg.A04, context, R.attr.f3nameremoved);
        TimeInterpolator timeInterpolator = C159917mg.A03;
        this.A0N = AnonymousClass5YH.A01(timeInterpolator, context, R.attr.f3nameremoved);
        this.A0O = AnonymousClass5YH.A01(timeInterpolator, context, R.attr.f3nameremoved);
    }
}
