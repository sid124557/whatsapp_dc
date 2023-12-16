package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Uc  reason: invalid class name and case insensitive filesystem */
public class C105235Uc {
    public float A00;
    public float A01;
    public long A02;
    public AnimatorSet A03;
    public C186158uq A04;
    public AnonymousClass4NZ A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final Activity A0C;
    public final Handler A0D = AnonymousClass000.A0A();
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final ViewGroup A0K;
    public final ImageView A0L;
    public final TextView A0M;
    public final C153317b2 A0N;
    public final C56612sH A0O;
    public final AnonymousClass33p A0P;
    public final C620733j A0Q;
    public final C182948pF A0R;
    public final Runnable A0S = new C71273bq(this, 39);
    public final boolean A0T;

    public void A01() {
        this.A08 = true;
        this.A0E.animate().setDuration(200).alpha(0.0f).setListener(new C188668zI(this, 23)).start();
        AnonymousClass4NZ r10 = this.A05;
        if (r10 != null) {
            C71273bq r9 = new C71273bq(this, 35);
            r10.setPivotX((float) (r10.getWidth() / 2));
            r10.setPivotY((float) (r10.A0I / 2));
            AnimatorSet A0O2 = C86664Kz.A0O();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.3f});
            ofFloat.setDuration(250);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(2);
            C86644Kx.A0i(ofFloat);
            C86604Kt.A0w(ofFloat, r10, 34);
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object[] objArr = new Object[2];
            boolean A1Y = C18300x5.A1Y(objArr, r10.A0P);
            objArr[1] = Integer.valueOf(r10.A0O);
            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
            ofObject.setDuration(250);
            C86644Kx.A0i(ofObject);
            C100295Aj.A03(ofObject, r10, 27);
            A0O2.addListener(new C188658zH(r9, 4, r10));
            A0O2.playTogether(C86664Kz.A1b(ofFloat, ofObject, 2, A1Y ? 1 : 0));
            A0O2.start();
        }
        this.A0L.setVisibility(8);
        A03();
    }

    public void A02() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(0);
        translateAnimation.setFillBefore(true);
        translateAnimation.setFillAfter(true);
        this.A0M.startAnimation(translateAnimation);
    }

    public final float A00() {
        float A002;
        float f;
        int i = -1;
        if (this.A0B == 1) {
            if (C102805Ki.A00(this.A0Q)) {
                i = 1;
            }
            A002 = (float) i;
            f = 108.0f;
        } else {
            A002 = AnonymousClass4L0.A00(this.A0L) / 5.5f;
            if (!C102805Ki.A00(this.A0Q)) {
                i = 1;
            }
            f = (float) i;
        }
        return A002 * f;
    }

    public void A03() {
        View view = this.A0J;
        view.post(new C71273bq(this, 37));
        view.setVisibility(8);
    }

    public void A04(long j) {
        ImageView imageView = this.A0L;
        imageView.setVisibility(0);
        imageView.setTranslationX(A00());
        imageView.setTranslationY(C86664Kz.A02(imageView) / 4.0f);
        imageView.setScaleX(0.5f);
        imageView.setScaleY(0.5f);
        imageView.requestFocus();
        C153317b2 r2 = this.A0N;
        r2.A04.clear();
        r2.A03(new C88544a9(this, 0));
        r2.A02(1.0d);
        View view = this.A0G;
        view.clearAnimation();
        view.setVisibility(8);
        View view2 = this.A0F;
        view2.clearAnimation();
        view2.setVisibility(8);
        View view3 = this.A0H;
        view3.clearAnimation();
        view3.setVisibility(8);
        this.A0E.setVisibility(0);
        View view4 = this.A0J;
        view4.setVisibility(0);
        view4.post(new C71273bq(this, 36));
        View view5 = this.A0I;
        view5.setVisibility(0);
        view5.setClickable(true);
        AnonymousClass0YY.A06(view5, 2);
        C620733j r4 = this.A0Q;
        float f = -1.0f;
        if (C620733j.A04(r4)) {
            f = 1.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(160);
        view5.startAnimation(translateAnimation);
        this.A06 = false;
        this.A02 = j;
        if (this.A0T) {
            ViewGroup viewGroup = this.A0K;
            viewGroup.setVisibility(0);
            viewGroup.bringToFront();
            if (this.A05 == null) {
                AnonymousClass4NZ r1 = new AnonymousClass4NZ(this.A0C, r4, this.A0B);
                this.A05 = r1;
                r1.setVisibility(4);
                FrameLayout.LayoutParams A0p = C86664Kz.A0p();
                int i = 83;
                if (C620733j.A04(r4)) {
                    i = 85;
                }
                A0p.gravity = i;
                viewGroup.addView(this.A05, A0p);
            }
            this.A07 = false;
            this.A08 = false;
            this.A0D.post(this.A0S);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r11 >= 0.0f) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (java.lang.Math.abs(r13) <= r3.A0A) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.MotionEvent r21, int r22, boolean r23) {
        /*
            r20 = this;
            r3 = r20
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x016c
            float r11 = r21.getY()
            float r0 = r3.A01
            float r11 = r11 - r0
            float r13 = r21.getX()
            float r0 = r3.A00
            float r13 = r13 - r0
            boolean r0 = r3.A07
            r8 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0025
            float r1 = java.lang.Math.abs(r13)
            float r0 = r3.A0A
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.A06 = r0
            boolean r7 = r3.A0T
            r6 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r9 = r23
            if (r7 == 0) goto L_0x00ad
            if (r0 != 0) goto L_0x0042
            float r1 = java.lang.Math.abs(r11)
            float r0 = r3.A0A
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r3.A07 = r0
            if (r0 == 0) goto L_0x01ba
            X.4NZ r0 = r3.A05
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r0.A0f
            if (r0 != 0) goto L_0x005e
            android.os.Handler r1 = r3.A0D
            java.lang.Runnable r0 = r3.A0S
            r1.removeCallbacks(r0)
            X.4NZ r10 = r3.A05
            r0 = 0
            r2 = 0
            r10.A04(r2, r0)
        L_0x005e:
            float r0 = r3.A0A
            float r11 = r11 + r0
            X.4NZ r2 = r3.A05
            int r1 = r2.A0N
            int r0 = r2.A0I
            int r1 = r1 - r0
            float r12 = (float) r1
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01af
            r1 = 0
        L_0x006e:
            r2.setPercentageLocked(r1)
            android.widget.ImageView r2 = r3.A0L
            float r10 = X.C86664Kz.A02(r2)
            r0 = 1082130432(0x40800000, float:4.0)
            float r10 = r10 / r0
            float r11 = r11 + r10
            float r10 = r10 - r12
            float r0 = java.lang.Math.max(r11, r10)
            r2.setTranslationY(r0)
            X.7b2 r0 = r3.A0N
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r0.clear()
            float r0 = r6 - r1
            float r0 = java.lang.Math.max(r4, r0)
            r2.setScaleX(r0)
            r2.setScaleY(r0)
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
            X.8uq r0 = r3.A04
            if (r0 == 0) goto L_0x00a4
            r0.BUL(r5)
        L_0x00a4:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
            X.8uq r0 = r3.A04
            r0.BVt(r9)
        L_0x00ad:
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x019e
            r0 = r22
            float r1 = (float) r0
            float r0 = r3.A09
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r10
            float r0 = java.lang.Math.min(r1, r0)
            float r0 = r13 / r0
            float r2 = java.lang.Math.abs(r0)
            r0 = 1059481190(0x3f266666, float:0.65)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0177
            X.8uq r0 = r3.A04
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "RecordingLockController/onVoiceNoteActionMove/requestStop"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.8uq r0 = r3.A04
            r0.Bcq(r8, r9, r5, r5)
        L_0x00d8:
            X.8pF r0 = r3.A0R
            boolean r0 = r0.BFX()
            if (r0 == 0) goto L_0x016c
            long r0 = r3.A02
            r8 = 160(0xa0, double:7.9E-322)
            long r0 = r0 + r8
            long r8 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x016c
            X.33j r0 = r3.A0Q
            boolean r1 = X.C620733j.A04(r0)
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x016d
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0175
            float r0 = r3.A0A
            float r13 = r13 + r0
        L_0x0100:
            X.8uq r0 = r3.A04
            if (r0 == 0) goto L_0x0107
            r0.Bfc(r13, r1)
        L_0x0107:
            if (r7 == 0) goto L_0x013f
            X.4NZ r8 = r3.A05
            if (r8 == 0) goto L_0x013f
            boolean r0 = r8.A0f
            if (r0 == 0) goto L_0x013f
            float r7 = X.C86664Kz.A02(r8)
            float r2 = java.lang.Math.abs(r13)
            X.4NZ r0 = r3.A05
            float r1 = X.AnonymousClass001.A04(r0, r2)
            X.4NZ r0 = r3.A05
            float r0 = X.C86664Kz.A02(r0)
            float r1 = r1 * r0
            r0 = 1066611507(0x3f933333, float:1.15)
            float r1 = r1 * r0
            float r0 = java.lang.Math.min(r7, r1)
            r8.setTranslationY(r0)
            X.4NZ r1 = r3.A05
            float r0 = X.AnonymousClass001.A04(r1, r2)
            float r6 = r6 - r0
            float r0 = java.lang.Math.max(r4, r6)
            r1.setAlpha(r0)
        L_0x013f:
            android.widget.ImageView r1 = r3.A0L
            float r0 = r3.A00()
            float r0 = r0 + r13
            r1.setTranslationX(r0)
            r12 = 0
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r16 = r12
            r18 = r12
            r17 = r4
            r14 = r12
            r15 = r13
            r19 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 0
            r11.setDuration(r0)
            r11.setFillBefore(r5)
            r11.setFillAfter(r5)
            android.widget.TextView r0 = r3.A0M
            r0.clearAnimation()
            r0.startAnimation(r11)
        L_0x016c:
            return
        L_0x016d:
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0175
            float r0 = r3.A0A
            float r13 = r13 - r0
            goto L_0x0100
        L_0x0175:
            r13 = 0
            goto L_0x0100
        L_0x0177:
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            X.8uq r1 = r3.A04
            if (r0 <= 0) goto L_0x0197
            if (r1 == 0) goto L_0x018e
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r2 = r2 * r10
            float r0 = r0 - r2
            float r0 = java.lang.Math.max(r4, r0)
            r1.Bbm(r0)
        L_0x018e:
            X.8uq r0 = r3.A04
            if (r0 == 0) goto L_0x00d8
            r0.BUL(r5)
            goto L_0x00d8
        L_0x0197:
            if (r1 == 0) goto L_0x00d8
            r1.Bbm(r6)
            goto L_0x00d8
        L_0x019e:
            android.widget.ImageView r1 = r3.A0L
            float r0 = r3.A00()
            r1.setTranslationX(r0)
            X.8uq r0 = r3.A04
            if (r0 == 0) goto L_0x016c
            r0.BaD()
            return
        L_0x01af:
            float r1 = java.lang.Math.abs(r11)
            r0 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r12
            float r1 = r1 / r0
            goto L_0x006e
        L_0x01ba:
            X.4NZ r0 = r3.A05
            if (r0 == 0) goto L_0x01c1
            r0.setPercentageLocked(r4)
        L_0x01c1:
            android.widget.ImageView r2 = r3.A0L
            float r1 = X.C86664Kz.A02(r2)
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            r2.setTranslationY(r1)
            r2.setScaleX(r6)
            r2.setScaleY(r6)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105235Uc.A05(android.view.MotionEvent, int, boolean):void");
    }

    public void A06(boolean z) {
        if (this.A0T) {
            AnonymousClass4NZ r0 = this.A05;
            if (r0 != null) {
                r0.A00();
            }
            this.A0K.setVisibility(8);
        }
        C153317b2 r7 = this.A0N;
        r7.A04.clear();
        if (r7.A07.A00 == 0.0d || !z) {
            r7.A02(0.0d);
            ImageView imageView = this.A0L;
            imageView.setVisibility(4);
            imageView.setScaleX(0.0f);
            imageView.setScaleY(0.0f);
            C186158uq r02 = this.A04;
            if (r02 != null) {
                r02.Bba();
            }
        } else {
            r7.A03(new C137546or(this, (int) this.A0L.getTranslationX()));
            r7.A02(0.0d);
        }
        View view = this.A0I;
        view.setVisibility(8);
        AlphaAnimation A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
        A0C2.setDuration(160);
        view.startAnimation(A0C2);
    }

    public boolean A07(boolean z, boolean z2, boolean z3) {
        if (!this.A08) {
            if (this.A07) {
                ImageView imageView = this.A0L;
                imageView.animate().setListener((Animator.AnimatorListener) null).cancel();
                C86634Kw.A0P(imageView.animate().setDuration(200), 0.5f).translationY(C86664Kz.A02(imageView) / 4.0f).setListener(new C188638zF(this, z, z2));
            } else if (this.A04 == null) {
                return true;
            } else {
                C18260x0.A1D("RecordingLockController/onVoiceNoteSliderCancel/requestStop send=", AnonymousClass001.A0o(), z);
                this.A04.Bcq(z, z2, z3, false);
                return true;
            }
        }
        return false;
    }

    public C105235Uc(Activity activity, View view, View view2, View view3, View view4, View view5, View view6, View view7, ViewGroup viewGroup, ImageView imageView, TextView textView, C56612sH r19, C54292oU r20, AnonymousClass33p r21, C620733j r22, C182948pF r23, float f, int i, boolean z) {
        int paddingLeft;
        int i2 = i;
        this.A0B = i2;
        this.A0C = activity;
        this.A0O = r19;
        C620733j r4 = r22;
        this.A0Q = r4;
        this.A0P = r21;
        this.A0K = viewGroup;
        ImageView imageView2 = imageView;
        this.A0L = imageView2;
        TextView textView2 = textView;
        this.A0M = textView2;
        int applyDimension = (int) TypedValue.applyDimension(1, i2 == 1 ? 88.0f : 32.0f, AnonymousClass000.A0B(r20.A00));
        if (C102805Ki.A00(r4)) {
            paddingLeft = applyDimension;
        } else {
            paddingLeft = textView2.getPaddingLeft();
        }
        C86654Ky.A15(textView2, paddingLeft, textView2.getPaddingTop(), !C620733j.A04(r4) ? textView2.getPaddingRight() : applyDimension);
        if (C1001059l.A04) {
            AnonymousClass0Y9.A01(C86664Kz.A0V(textView2.getContext(), R.color.f5nameremoved), textView2);
        }
        this.A0E = view2;
        this.A0J = view3;
        this.A0G = view4;
        this.A0F = view5;
        this.A0H = view6;
        this.A0I = view7;
        this.A0T = z;
        this.A09 = f;
        this.A0R = r23;
        imageView2.setPadding(0, 0, 0, 0);
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6AF(view, textView2, this, 3));
        if (C620733j.A04(r4)) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.voice_note_slide_to_cancel, 0, 0, 0);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AnonymousClass0x7.A0J(activity, r4, R.drawable.voice_note_slide_to_cancel), (Drawable) null);
        }
        this.A0A = ((float) ViewConfiguration.get(activity).getScaledTouchSlop()) * 1.5f;
        C153317b2 A012 = C158147jV.A00().A01();
        this.A0N = A012;
        A012.A03 = new C156197gC(440.0d, 21.0d);
        imageView2.setBackgroundResource(R.drawable.input_circle_large);
    }
}
