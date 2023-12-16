package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

/* renamed from: X.4Qc  reason: invalid class name */
public final class AnonymousClass4Qc extends LinearLayout {
    public int A00 = 2;
    public Drawable A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public AnonymousClass4M1 A08;
    public AnonymousClass5T2 A09;
    public final /* synthetic */ TabLayout A0A;

    public int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.A07, this.A05, this.A03};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getTop());
                    i2 = Math.max(i2, view.getBottom());
                } else {
                    i3 = view.getTop();
                    i2 = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.A07, this.A05, this.A03};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Qc(Context context, TabLayout tabLayout) {
        super(context);
        this.A0A = tabLayout;
        A04(context);
        AnonymousClass0YH.A07(this, tabLayout.A0E, tabLayout.A0F, tabLayout.A0D, tabLayout.A0C);
        setGravity(17);
        setOrientation(tabLayout.A0W ^ true ? 1 : 0);
        setClickable(true);
        C06560Yg.A0P(this, AnonymousClass0TU.A00(getContext()));
    }

    private AnonymousClass4M1 getBadge() {
        return this.A08;
    }

    private AnonymousClass4M1 getOrCreateBadge() {
        if (this.A08 == null) {
            this.A08 = new AnonymousClass4M1(getContext(), (C108925dn) null);
        }
        A01();
        AnonymousClass4M1 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("Unable to create badge");
    }

    public final void A00() {
        if (this.A08 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup A0l = C86664Kz.A0l(this);
            if (A0l != null) {
                A0l.setClipChildren(true);
                A0l.setClipToPadding(true);
            }
            View view = this.A02;
            if (view != null) {
                C154047cU.A01(view, this.A08);
                this.A02 = null;
            }
        }
    }

    public final void A01() {
        TextView textView;
        AnonymousClass4M1 r3 = this.A08;
        if (r3 == null) {
            return;
        }
        if (this.A03 != null || (textView = this.A07) == null || this.A09 == null) {
            A00();
            return;
        }
        View view = this.A02;
        if (view != textView) {
            A00();
            TextView textView2 = this.A07;
            if (this.A08 != null && textView2 != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup A0l = C86664Kz.A0l(this);
                if (A0l != null) {
                    A0l.setClipChildren(false);
                    A0l.setClipToPadding(false);
                }
                C154047cU.A00(textView2, this.A08);
                this.A02 = textView2;
            }
        } else if (textView == view) {
            Rect A0N = AnonymousClass001.A0N();
            textView.getDrawingRect(A0N);
            r3.setBounds(A0N);
            r3.A08(textView, (FrameLayout) null);
        }
    }

    public final void A03() {
        TextView textView;
        int i;
        View view;
        ViewParent parent;
        AnonymousClass5T2 r3 = this.A09;
        ImageView imageView = null;
        if (r3 == null || (view = r3.A01) == null) {
            View view2 = this.A03;
            if (view2 != null) {
                removeView(view2);
                this.A03 = null;
            }
            this.A06 = null;
        } else {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view3 = this.A03;
                if (!(view3 == null || (parent = view3.getParent()) == null)) {
                    ((ViewGroup) parent).removeView(this.A03);
                }
                addView(view);
            }
            this.A03 = view;
            int A0A2 = C86664Kz.A0A(this.A07);
            ImageView imageView2 = this.A05;
            if (imageView2 != null) {
                imageView2.setVisibility(A0A2);
                this.A05.setImageDrawable((Drawable) null);
            }
            TextView A092 = AnonymousClass002.A09(view, 16908308);
            this.A06 = A092;
            if (A092 != null) {
                this.A00 = C05060Rt.A00(A092);
            }
            imageView = AnonymousClass0x9.A0F(view, 16908294);
        }
        this.A04 = imageView;
        if (this.A03 == null) {
            if (this.A05 == null) {
                ImageView imageView3 = (ImageView) C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, false);
                this.A05 = imageView3;
                addView(imageView3, 0);
            }
            if (this.A07 == null) {
                TextView textView2 = (TextView) AnonymousClass001.A0R(C18280x3.A0D(this), this, R.layout.f8nameremoved);
                this.A07 = textView2;
                addView(textView2);
                this.A00 = C05060Rt.A00(this.A07);
            }
            TextView textView3 = this.A07;
            TabLayout tabLayout = this.A0A;
            AnonymousClass0Y9.A06(textView3, tabLayout.A0a);
            if (!isSelected() || (i = tabLayout.A05) == -1) {
                textView = this.A07;
                i = tabLayout.A0f;
            } else {
                textView = this.A07;
            }
            AnonymousClass0Y9.A06(textView, i);
            ColorStateList colorStateList = tabLayout.A0L;
            if (colorStateList != null) {
                this.A07.setTextColor(colorStateList);
            }
            A05(this.A05, this.A07, true);
            A01();
            ImageView imageView4 = this.A05;
            if (imageView4 != null) {
                imageView4.addOnLayoutChangeListener(new AnonymousClass91C(this, 0, imageView4));
            }
            TextView textView4 = this.A07;
            if (textView4 != null) {
                textView4.addOnLayoutChangeListener(new AnonymousClass91C(this, 0, textView4));
            }
        } else {
            TextView textView5 = this.A06;
            if (!(textView5 == null && imageView == null)) {
                A05(imageView, textView5, false);
            }
        }
        if (r3 != null && !TextUtils.isEmpty(r3.A04)) {
            setContentDescription(r3.A04);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.content.Context r7) {
        /*
            r6 = this;
            com.google.android.material.tabs.TabLayout r5 = r6.A0A
            int r0 = r5.A0e
            r4 = 0
            if (r0 == 0) goto L_0x0054
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0VX.A01(r7, r0)
            r6.A01 = r0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r1 = r6.A01
            int[] r0 = r6.getDrawableState()
            r1.setState(r0)
        L_0x001e:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r0 = 0
            r3.setColor(r0)
            android.content.res.ColorStateList r0 = r5.A0K
            if (r0 == 0) goto L_0x004b
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            r2.setCornerRadius(r0)
            r0 = -1
            r2.setColor(r0)
            android.content.res.ColorStateList r0 = r5.A0K
            android.content.res.ColorStateList r1 = X.C106925aO.A01(r0)
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x0052
            r3 = r4
        L_0x0045:
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r1, r3, r4)
            r3 = r0
        L_0x004b:
            X.AnonymousClass0YY.A04(r3, r6)
            r5.invalidate()
            return
        L_0x0052:
            r4 = r2
            goto L_0x0045
        L_0x0054:
            r6.A01 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Qc.A04(android.content.Context):void");
    }

    public final void A05(ImageView imageView, TextView textView, boolean z) {
        CharSequence charSequence;
        int i;
        AnonymousClass5T2 r0 = this.A09;
        CharSequence charSequence2 = null;
        if (r0 != null) {
            charSequence = r0.A05;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable((Drawable) null);
        }
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            CharSequence charSequence3 = charSequence;
            if (!z3) {
                z2 = false;
                charSequence3 = null;
            }
            textView.setText(charSequence3);
            textView.setVisibility(C86614Ku.A09(z2));
            if (z3) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(imageView);
            if (!z2 || imageView.getVisibility() != 0) {
                i = 0;
            } else {
                i = (int) C159337lf.A00(getContext(), 8);
            }
            if (this.A0A.A0W) {
                if (i != C06060Wb.A01(A0T)) {
                    C06060Wb.A03(A0T, i);
                    A0T.bottomMargin = 0;
                    imageView.setLayoutParams(A0T);
                    imageView.requestLayout();
                }
            } else if (i != A0T.bottomMargin) {
                A0T.bottomMargin = i;
                C06060Wb.A03(A0T, 0);
                imageView.setLayoutParams(A0T);
                imageView.requestLayout();
            }
        }
        AnonymousClass5T2 r02 = this.A09;
        if (r02 != null) {
            charSequence2 = r02.A04;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (!z3) {
                charSequence = charSequence2;
            }
            C02550Gr.A00(this, charSequence);
        }
    }

    public AnonymousClass5T2 getTab() {
        return this.A09;
    }

    public void setTab(AnonymousClass5T2 r2) {
        if (r2 != this.A09) {
            this.A09 = r2;
            A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 != r1.A00) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r3 = this;
            r3.A03()
            X.5T2 r1 = r3.A09
            if (r1 == 0) goto L_0x0017
            com.google.android.material.tabs.TabLayout r0 = r1.A03
            if (r0 == 0) goto L_0x001c
            int r2 = r0.getSelectedTabPosition()
            r0 = -1
            if (r2 == r0) goto L_0x0017
            int r1 = r1.A00
            r0 = 1
            if (r2 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.setSelected(r0)
            return
        L_0x001c:
            java.lang.String r0 = "Tab not attached to a TabLayout"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Qc.A02():void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful() && (false || this.A01.setState(drawableState))) {
            invalidate();
            this.A0A.invalidate();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AnonymousClass4M1 r0 = this.A08;
        if (r0 != null && r0.isVisible()) {
            StringBuilder A0v = C18290x4.A0v(getContentDescription());
            AnonymousClass001.A1M(A0v);
            accessibilityNodeInfo.setContentDescription(AnonymousClass000.A0R(this.A08.A01(), A0v));
        }
        C05650Ui r2 = new C05650Ui(accessibilityNodeInfo);
        C86664Kz.A1Q(this, r2, this.A09.A00);
        r2.A0C(getResources().getString(R.string.f11nameremoved));
    }

    public void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.A0A;
        int i3 = tabLayout.A0B;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.A07 != null) {
            float f = tabLayout.A01;
            int i4 = this.A00;
            ImageView imageView = this.A05;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.A07;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A00;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.A07.getTextSize();
            int lineCount = this.A07.getLineCount();
            int A002 = C05060Rt.A00(this.A07);
            int i5 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
            if (i5 == 0 && (A002 < 0 || i4 == A002)) {
                return;
            }
            if (tabLayout.A04 != 1 || i5 <= 0 || lineCount != 1 || ((layout = this.A07.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) AnonymousClass000.A06(this, getMeasuredWidth())))) {
                this.A07.setTextSize(0, f);
                this.A07.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A09 == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.A09.A00();
        return true;
    }

    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.A07;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.A05;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.A03;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
