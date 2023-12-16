package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Bi  reason: invalid class name and case insensitive filesystem */
public abstract class C169968Bi implements C187868xw {
    public float A00 = 0.0f;
    public int A01 = 0;

    public static AnonymousClass8P2 A02(Object obj, int i) {
        return new AnonymousClass8P2(new AnonymousClass934(obj, i));
    }

    public static AnonymousClass8P2 A03(Object obj, Object obj2, int i) {
        return new AnonymousClass8P2(new AnonymousClass938(obj, i, obj2));
    }

    public static void A04(View view, float f) {
        view.setPivotX(f / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
    }

    public static void A05(C133306h7 r6, float f, int i) {
        float f2 = f;
        int i2 = i;
        C133306h7.A01(r6.A04, r6.A0D, r6.A0E, r6.A0C, f2, i2);
        C133306h7.A01(r6.A09, r6.A0M, r6.A0N, r6.A0L, f2, i2);
        C133306h7.A01(r6.A08, r6.A0J, r6.A0K, r6.A0I, f2, i2);
    }

    public void A06(float f, int i) {
        if (this instanceof C133306h7) {
            C133306h7 r2 = (C133306h7) this;
            View view = r2.A04;
            A04(view, AnonymousClass4L0.A00(view));
            TextEmojiLabel textEmojiLabel = r2.A09;
            A04(textEmojiLabel, AnonymousClass4L0.A00(textEmojiLabel));
            TextView textView = r2.A08;
            A04(textView, AnonymousClass4L0.A00(textView));
            return;
        }
        C133316h8 r22 = (C133316h8) this;
        View view2 = r22.A04;
        A04(view2, AnonymousClass4L0.A00(view2));
        TextEmojiLabel textEmojiLabel2 = r22.A0B;
        A04(textEmojiLabel2, AnonymousClass4L0.A00(textEmojiLabel2));
        TextView textView2 = r22.A08;
        A04(textView2, AnonymousClass4L0.A00(textView2));
        r22.A09.A0H(new AnonymousClass5IS(0, f, i));
    }

    public void A07(AppBarLayout appBarLayout, int i) {
        if (!(this instanceof C133306h7)) {
            C133316h8 r4 = (C133316h8) this;
            View view = r4.A03;
            int height = view.getHeight();
            r4.A0H.A00 = null;
            r4.A0F.A00 = null;
            if (view.getLayoutParams().height != height) {
                C86624Kv.A0w(view, height);
            }
            if (i == 2) {
                r4.A0N.get();
                r4.A0M.get();
                r4.A0C(appBarLayout);
                r4.A0B(appBarLayout);
            }
        }
    }

    public void BXL(AppBarLayout appBarLayout, int i) {
        AnonymousClass08M r1;
        AnonymousClass5IS r0;
        float A02 = ((float) i) / (C86664Kz.A02(appBarLayout) - ((float) appBarLayout.getMinimumHeight()));
        if (!Float.isNaN(A02) && !Float.isInfinite(A02)) {
            float f = this.A00;
            if (A02 != f) {
                if (f == 0.0f) {
                    A06(f, 2);
                } else if (f == -1.0f) {
                    A06(-f, 1);
                }
                if (A02 == 0.0f) {
                    if (this instanceof C133306h7) {
                        C133306h7 r7 = (C133306h7) this;
                        C133306h7.A00(r7.A04, r7.A05, r7.A0F);
                        TextEmojiLabel textEmojiLabel = r7.A09;
                        C133306h7.A00(textEmojiLabel, r7.A07, r7.A0H);
                        textEmojiLabel.setTextSize(0, r7.A01);
                        AnonymousClass0Y9.A03(textEmojiLabel, 0);
                        TextView textView = r7.A08;
                        C133306h7.A00(textView, r7.A06, r7.A0G);
                        AnonymousClass0Y9.A03(textView, 0);
                        textView.setTextSize(0, r7.A00);
                    } else {
                        C133316h8 r72 = (C133316h8) this;
                        View view = r72.A04;
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        TextEmojiLabel textEmojiLabel2 = r72.A0B;
                        textEmojiLabel2.setScaleX(1.0f);
                        textEmojiLabel2.setScaleY(1.0f);
                        textEmojiLabel2.setTranslationY(0.0f);
                        textEmojiLabel2.setAlpha(1.0f);
                        textEmojiLabel2.setMaxLines(3);
                        textEmojiLabel2.setTextSize(0, r72.A01);
                        textEmojiLabel2.A0I(textEmojiLabel2.getText());
                        textEmojiLabel2.setLayoutParams(r72.A06);
                        textEmojiLabel2.setGravity(1);
                        TextView textView2 = r72.A08;
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setAlpha(1.0f);
                        textView2.setMaxLines(3);
                        AnonymousClass0Y9.A03(textView2, 0);
                        textView2.setLayoutParams(r72.A05);
                        textView2.setTextSize(0, r72.A00);
                        textView2.setGravity(1);
                        r1 = r72.A09;
                        r0 = new AnonymousClass5IS(2, A02, 1);
                    }
                } else {
                    float f2 = -A02;
                    boolean z = this instanceof C133306h7;
                    if (A02 == -1.0f) {
                        if (z) {
                            A05((C133306h7) this, f2, i);
                        } else {
                            C133316h8 r12 = (C133316h8) this;
                            r12.A09(i, f2);
                            r12.A0E(appBarLayout, f2, i);
                            r12.A0D(appBarLayout, f2, i);
                            r1 = r12.A09;
                            r0 = new AnonymousClass5IS(2, f2, 2);
                        }
                    } else if (z) {
                        A05((C133306h7) this, f2, i);
                    } else {
                        C133316h8 r13 = (C133316h8) this;
                        r13.A09(i, f2);
                        r13.A0E(appBarLayout, f2, i);
                        r13.A0D(appBarLayout, f2, i);
                        r1 = r13.A09;
                        r0 = new AnonymousClass5IS(1, f2, 1);
                    }
                }
                r1.A0H(r0);
            }
            if (A02 == 0.0f) {
                A07(appBarLayout, 1);
            } else if (A02 == -1.0f) {
                A07(appBarLayout, 2);
            }
            this.A00 = A02;
            this.A01 = i;
        }
    }
}
