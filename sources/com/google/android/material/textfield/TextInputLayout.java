package com.google.android.material.textfield;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass03n;
import X.AnonymousClass0AN;
import X.AnonymousClass0VX;
import X.AnonymousClass0XA;
import X.AnonymousClass0XC;
import X.AnonymousClass0XH;
import X.AnonymousClass0XJ;
import X.AnonymousClass0Y8;
import X.AnonymousClass0Y9;
import X.AnonymousClass0YG;
import X.AnonymousClass0YH;
import X.AnonymousClass0YI;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass5YH;
import X.AnonymousClass5ZV;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import X.AnonymousClass6Cs;
import X.AnonymousClass6D7;
import X.AnonymousClass6Fe;
import X.AnonymousClass6Ff;
import X.AnonymousClass6GS;
import X.AnonymousClass6Gb;
import X.AnonymousClass6ZD;
import X.AnonymousClass6ZN;
import X.C06060Wb;
import X.C06130Wj;
import X.C06360Xi;
import X.C06560Yg;
import X.C124836Eb;
import X.C125156Fx;
import X.C150377Qk;
import X.C153557bX;
import X.C15770ru;
import X.C158227jd;
import X.C159177lI;
import X.C159917mg;
import X.C160907oe;
import X.C160927og;
import X.C161877ql;
import X.C170088Bv;
import X.C172668Mf;
import X.C181228mP;
import X.C181258mS;
import X.C181268mT;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C1896892g;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86664Kz;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    public static final int[][] A1B = {new int[]{16842919}, new int[0]};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public ValueAnimator A0P;
    public ColorStateList A0Q;
    public ColorStateList A0R;
    public ColorStateList A0S;
    public ColorStateList A0T;
    public ColorStateList A0U;
    public ColorStateList A0V;
    public Typeface A0W;
    public Drawable A0X;
    public Drawable A0Y;
    public Drawable A0Z;
    public StateListDrawable A0a;
    public EditText A0b;
    public TextView A0c;
    public TextView A0d;
    public AnonymousClass0AN A0e;
    public AnonymousClass0AN A0f;
    public AnonymousClass6D7 A0g;
    public AnonymousClass6D7 A0h;
    public AnonymousClass6D7 A0i;
    public AnonymousClass6D7 A0j;
    public C161877ql A0k;
    public C181258mS A0l;
    public CharSequence A0m;
    public CharSequence A0n;
    public CharSequence A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public final int A11;
    public final Rect A12;
    public final Rect A13;
    public final RectF A14;
    public final FrameLayout A15;
    public final C159177lI A16;
    public final AnonymousClass6Ff A17;
    public final C153557bX A18;
    public final AnonymousClass6Fe A19;
    public final LinkedHashSet A1A;

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A10 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A10 = false;
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.A0b;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.A0g;
        }
        int A022 = AnonymousClass5ZV.A02(this.A0b, R.attr.f3nameremoved);
        int i2 = this.A01;
        if (i2 == 2) {
            Context context = getContext();
            AnonymousClass6D7 r6 = this.A0g;
            int[][] iArr = A1B;
            TypedValue A023 = C160907oe.A02(context, "TextInputLayout", R.attr.f3nameremoved);
            int i3 = A023.resourceId;
            if (i3 != 0) {
                i = AnonymousClass0Y8.A04(context, i3);
            } else {
                i = A023.data;
            }
            AnonymousClass6D7 r7 = new AnonymousClass6D7(r6.A03.A0K);
            int A002 = AnonymousClass5ZV.A00(0.1f, A022, i);
            r7.A06(new ColorStateList(iArr, new int[]{A002, 0}));
            r7.setTint(i);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{A002, i});
            AnonymousClass6D7 r1 = new AnonymousClass6D7(r6.A03.A0K);
            r1.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, r7, r1), r6});
        } else if (i2 != 1) {
            return null;
        } else {
            AnonymousClass6D7 r5 = this.A0g;
            int i4 = this.A00;
            int[][] iArr2 = A1B;
            int A003 = AnonymousClass5ZV.A00(0.1f, A022, i4);
            int[] A1Z = C86664Kz.A1Z();
            A1Z[0] = A003;
            A1Z[1] = i4;
            return new RippleDrawable(new ColorStateList(iArr2, A1Z), r5, r5);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.A0a == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.A0a = stateListDrawable;
            int[] A0E2 = C18330xA.A0E();
            A0E2[0] = 16842922;
            stateListDrawable.addState(A0E2, getOrCreateOutlinedDropDownMenuBackground());
            this.A0a.addState(new int[0], A03(false));
        }
        return this.A0a;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        AnonymousClass6D7 r0 = this.A0j;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6D7 A032 = A03(true);
        this.A0j = A032;
        return A032;
    }

    private void setEditText(EditText editText) {
        if (this.A0b == null) {
            AnonymousClass6Ff r3 = this.A17;
            if (r3.A01 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.A0b = editText;
            int i = this.A0L;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.A0M);
            }
            int i2 = this.A0J;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.A0K);
            }
            this.A0q = false;
            A08();
            setTextInputAccessibilityDelegate(new AnonymousClass6GS(this));
            C159177lI r2 = this.A16;
            Typeface typeface = this.A0b.getTypeface();
            boolean A0C2 = r2.A0C(typeface);
            boolean A0D2 = r2.A0D(typeface);
            if (A0C2 || A0D2) {
                r2.A0B(false);
            }
            float textSize = this.A0b.getTextSize();
            if (r2.A0O != textSize) {
                r2.A0O = textSize;
                r2.A0B(false);
            }
            float letterSpacing = this.A0b.getLetterSpacing();
            if (r2.A0J != letterSpacing) {
                r2.A0J = letterSpacing;
                r2.A0B(false);
            }
            int gravity = this.A0b.getGravity();
            r2.A07((gravity & -113) | 48);
            if (r2.A0Y != gravity) {
                r2.A0Y = gravity;
                r2.A0B(false);
            }
            this.A0b.addTextChangedListener(new C1896892g(this, 0));
            if (this.A0S == null) {
                this.A0S = this.A0b.getHintTextColors();
            }
            if (this.A0v) {
                if (TextUtils.isEmpty(this.A0m)) {
                    CharSequence hint = this.A0b.getHint();
                    this.A0n = hint;
                    setHint(hint);
                    this.A0b.setHint((CharSequence) null);
                }
                this.A0y = true;
            }
            if (this.A0c != null) {
                A0D(this.A0b.getText());
            }
            A04();
            this.A18.A00();
            this.A19.bringToFront();
            r3.bringToFront();
            Iterator it = this.A1A.iterator();
            while (it.hasNext()) {
                ((C181268mT) it.next()).BRn(this);
            }
            r3.A01();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            A0H(false, true);
            return;
        }
        throw AnonymousClass001.A0c("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0m)) {
            this.A0m = charSequence;
            C159177lI r1 = this.A16;
            if (charSequence == null || !TextUtils.equals(r1.A0t, charSequence)) {
                r1.A0t = charSequence;
                r1.A0u = null;
                r1.A0B(false);
            }
            if (!this.A0w) {
                A09();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.A0z != z) {
            TextView textView = this.A0d;
            if (!z) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.A0d = null;
            } else if (textView != null) {
                this.A15.addView(textView);
                this.A0d.setVisibility(0);
            }
            this.A0z = z;
        }
    }

    public final int A01() {
        float A012;
        if (this.A0v) {
            int i = this.A01;
            if (i == 0) {
                A012 = this.A16.A01();
            } else if (i == 2) {
                A012 = this.A16.A01() / 2.0f;
            }
            return (int) A012;
        }
        return 0;
    }

    public final AnonymousClass0AN A02() {
        AnonymousClass0AN r3 = new AnonymousClass0AN();
        r3.A07((long) C160907oe.A00(getContext(), R.attr.f3nameremoved, 87));
        r3.A08(AnonymousClass5YH.A01(C159917mg.A03, getContext(), R.attr.f3nameremoved));
        return r3;
    }

    public void A04() {
        Drawable background;
        int currentTextColor;
        EditText editText = this.A0b;
        if (editText != null && this.A01 == 0 && (background = editText.getBackground()) != null) {
            if (AnonymousClass0XA.A03(background)) {
                background = background.mutate();
            }
            C153557bX r1 = this.A18;
            if (r1.A06()) {
                TextView textView = r1.A0C;
                if (textView == null) {
                    currentTextColor = -1;
                }
                currentTextColor = textView.getCurrentTextColor();
            } else {
                if (!this.A0s || (textView = this.A0c) == null) {
                    C06130Wj.A02(background);
                    this.A0b.refreshDrawableState();
                    return;
                }
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(AnonymousClass0XJ.A00(PorterDuff.Mode.SRC_IN, currentTextColor));
        }
    }

    public void A05() {
        EditText editText = this.A0b;
        if (editText != null && this.A0g != null) {
            if ((this.A0q || editText.getBackground() == null) && this.A01 != 0) {
                AnonymousClass0YY.A04(getEditTextBoxBackground(), this.A0b);
                this.A0q = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0113, code lost:
        if (r1 != null) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r9 = this;
            X.6D7 r0 = r9.A0g
            if (r0 == 0) goto L_0x00dd
            int r0 = r9.A01
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r9.isFocused()
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x001a
            android.widget.EditText r0 = r9.A0b
            if (r0 == 0) goto L_0x0155
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0155
        L_0x001a:
            r8 = 1
        L_0x001b:
            boolean r0 = r9.isHovered()
            if (r0 != 0) goto L_0x002b
            android.widget.EditText r0 = r9.A0b
            if (r0 == 0) goto L_0x0152
            boolean r0 = r0.isHovered()
            if (r0 == 0) goto L_0x0152
        L_0x002b:
            r7 = 1
        L_0x002c:
            X.7bX r2 = r9.A18
            boolean r0 = r2.A06()
            if (r0 != 0) goto L_0x003c
            android.widget.TextView r0 = r9.A0c
            if (r0 == 0) goto L_0x003d
            boolean r0 = r9.A0s
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r6 = 1
        L_0x003d:
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00f8
            int r0 = r9.A0C
        L_0x0045:
            r9.A03 = r0
        L_0x0047:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0050
            r9.A0G(r6)
        L_0x0050:
            X.6Ff r4 = r9.A17
            r4.A03()
            com.google.android.material.textfield.TextInputLayout r3 = r4.A0L
            com.google.android.material.internal.CheckableImageButton r1 = r4.A0I
            android.content.res.ColorStateList r0 = r4.A03
            X.C106745a6.A02(r0, r1, r3)
            com.google.android.material.internal.CheckableImageButton r2 = r4.A0H
            android.content.res.ColorStateList r0 = r4.A02
            X.C106745a6.A02(r0, r2, r3)
            X.7c0 r0 = r4.getEndIconDelegate()
            boolean r0 = r0 instanceof X.AnonymousClass6ZR
            if (r0 == 0) goto L_0x0091
            X.7bX r0 = r3.A18
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            android.graphics.drawable.Drawable r0 = X.C06130Wj.A01(r0)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            int r0 = r3.getErrorCurrentTextColors()
            X.AnonymousClass0YG.A06(r1, r0)
            r2.setImageDrawable(r1)
        L_0x0091:
            X.6Fe r0 = r9.A19
            com.google.android.material.textfield.TextInputLayout r2 = r0.A09
            com.google.android.material.internal.CheckableImageButton r1 = r0.A08
            android.content.res.ColorStateList r0 = r0.A01
            X.C106745a6.A02(r0, r1, r2)
            int r1 = r9.A01
            r0 = 2
            if (r1 != r0) goto L_0x00cc
            int r1 = r9.A06
            if (r8 == 0) goto L_0x00ed
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00ed
            int r0 = r9.A05
        L_0x00ad:
            r9.A06 = r0
            if (r0 == r1) goto L_0x00cc
            boolean r0 = r9.A0J()
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r9.A0w
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r9.A0J()
            if (r0 == 0) goto L_0x00c9
            X.6D7 r1 = r9.A0g
            X.6ZD r1 = (X.AnonymousClass6ZD) r1
            r0 = 0
            r1.A0E(r0, r0, r0, r0)
        L_0x00c9:
            r9.A09()
        L_0x00cc:
            int r0 = r9.A01
            if (r0 != r5) goto L_0x00da
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00de
            int r0 = r9.A0D
        L_0x00d8:
            r9.A00 = r0
        L_0x00da:
            r9.A07()
        L_0x00dd:
            return
        L_0x00de:
            if (r7 == 0) goto L_0x00e5
            if (r8 != 0) goto L_0x00ea
            int r0 = r9.A0H
            goto L_0x00d8
        L_0x00e5:
            if (r8 != 0) goto L_0x00ea
            int r0 = r9.A0A
            goto L_0x00d8
        L_0x00ea:
            int r0 = r9.A0F
            goto L_0x00d8
        L_0x00ed:
            int r0 = r9.A04
            goto L_0x00ad
        L_0x00f0:
            android.content.res.ColorStateList r1 = r4.A02
            android.graphics.PorterDuff$Mode r0 = r4.A04
            X.C106745a6.A01(r1, r0, r2, r3)
            goto L_0x0091
        L_0x00f8:
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0109
            android.content.res.ColorStateList r1 = r9.A0V
            if (r1 != 0) goto L_0x0115
            android.widget.TextView r0 = r2.A0C
            if (r0 != 0) goto L_0x013c
            r0 = -1
            goto L_0x0045
        L_0x0109:
            boolean r0 = r9.A0s
            if (r0 == 0) goto L_0x0142
            android.widget.TextView r0 = r9.A0c
            if (r0 == 0) goto L_0x0142
            android.content.res.ColorStateList r1 = r9.A0V
            if (r1 == 0) goto L_0x013c
        L_0x0115:
            int r4 = r1.getDefaultColor()
            android.content.res.ColorStateList r1 = r9.A0V
            r3 = 2
            int[] r0 = new int[r3]
            r0 = {16843623, 16842910} // fill-array
            int r2 = r1.getColorForState(r0, r4)
            android.content.res.ColorStateList r1 = r9.A0V
            int[] r0 = new int[r3]
            r0 = {16843518, 16842910} // fill-array
            int r0 = r1.getColorForState(r0, r4)
            if (r8 != 0) goto L_0x0045
            if (r7 == 0) goto L_0x0138
            r9.A03 = r2
            goto L_0x0047
        L_0x0138:
            r9.A03 = r4
            goto L_0x0047
        L_0x013c:
            int r0 = r0.getCurrentTextColor()
            goto L_0x0045
        L_0x0142:
            if (r8 == 0) goto L_0x0148
            int r0 = r9.A0G
            goto L_0x0045
        L_0x0148:
            if (r7 == 0) goto L_0x014e
            int r0 = r9.A0I
            goto L_0x0045
        L_0x014e:
            int r0 = r9.A0B
            goto L_0x0045
        L_0x0152:
            r7 = 0
            goto L_0x002c
        L_0x0155:
            r8 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A06():void");
    }

    public final void A07() {
        int i;
        int i2;
        int i3;
        AnonymousClass6D7 r2 = this.A0g;
        if (r2 != null) {
            C161877ql r1 = r2.A03.A0K;
            C161877ql r0 = this.A0k;
            if (r1 != r0) {
                r2.setShapeAppearanceModel(r0);
            }
            if (this.A01 == 2 && (i2 = this.A06) > -1 && (i3 = this.A03) != 0) {
                AnonymousClass6D7 r22 = this.A0g;
                r22.A03.A04 = (float) i2;
                r22.invalidateSelf();
                r22.A07(ColorStateList.valueOf(i3));
            }
            int i4 = this.A00;
            if (this.A01 == 1) {
                i4 = AnonymousClass0YI.A05(this.A00, AnonymousClass5ZV.A01(getContext(), R.attr.f3nameremoved, 0));
            }
            this.A00 = i4;
            this.A0g.A06(ColorStateList.valueOf(i4));
            AnonymousClass6D7 r23 = this.A0h;
            if (!(r23 == null || this.A0i == null)) {
                if (this.A06 > -1 && this.A03 != 0) {
                    if (this.A0b.isFocused()) {
                        i = this.A0B;
                    } else {
                        i = this.A03;
                    }
                    r23.A06(ColorStateList.valueOf(i));
                    this.A0i.A06(ColorStateList.valueOf(this.A03));
                }
                invalidate();
            }
            A05();
        }
    }

    public final void A08() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText;
        int A032;
        int dimensionPixelSize;
        int A022;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        AnonymousClass6D7 r1;
        int i3 = this.A01;
        if (i3 == 0) {
            this.A0g = null;
            this.A0h = null;
            this.A0i = null;
        } else if (i3 == 1) {
            this.A0g = new AnonymousClass6D7(this.A0k);
            this.A0h = new AnonymousClass6D7();
            this.A0i = new AnonymousClass6D7();
        } else if (i3 == 2) {
            if (!this.A0v || (this.A0g instanceof AnonymousClass6ZD)) {
                r1 = new AnonymousClass6D7(this.A0k);
            } else {
                r1 = new AnonymousClass6ZN(this.A0k);
            }
            this.A0g = r1;
            this.A0h = null;
            this.A0i = null;
        } else {
            throw AnonymousClass000.A0F(" is illegal; only @BoxBackgroundMode constants are supported.", C18320x8.A0j(i3));
        }
        A05();
        A06();
        if (this.A01 == 1) {
            if (C18290x4.A0G(this).getConfiguration().fontScale >= 2.0f) {
                resources2 = getResources();
                i2 = R.dimen.f6nameremoved;
            } else if (AnonymousClass001.A1U((AnonymousClass001.A0M(getContext()).fontScale > 1.3f ? 1 : (AnonymousClass001.A0M(getContext()).fontScale == 1.3f ? 0 : -1)))) {
                resources2 = getResources();
                i2 = R.dimen.f6nameremoved;
            }
            this.A02 = resources2.getDimensionPixelSize(i2);
        }
        if (this.A0b != null && this.A01 == 1) {
            if (C18290x4.A0G(this).getConfiguration().fontScale >= 2.0f) {
                editText = this.A0b;
                A032 = AnonymousClass0YH.A03(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                A022 = AnonymousClass0YH.A02(this.A0b);
                resources = getResources();
                i = R.dimen.f6nameremoved;
            } else if (AnonymousClass001.A1U((AnonymousClass001.A0M(getContext()).fontScale > 1.3f ? 1 : (AnonymousClass001.A0M(getContext()).fontScale == 1.3f ? 0 : -1)))) {
                editText = this.A0b;
                A032 = AnonymousClass0YH.A03(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                A022 = AnonymousClass0YH.A02(this.A0b);
                resources = getResources();
                i = R.dimen.f6nameremoved;
            }
            AnonymousClass0YH.A07(editText, A032, dimensionPixelSize, A022, resources.getDimensionPixelSize(i));
        }
        if (this.A01 != 0) {
            A0B();
        }
        EditText editText2 = this.A0b;
        if (editText2 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.A01;
                if (i4 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i4 == 1) {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                } else {
                    return;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    public final void A0A() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.A0c;
        if (textView != null) {
            if (this.A0s) {
                i = this.A08;
            } else {
                i = this.A09;
            }
            A0F(textView, i);
            if (!this.A0s && (colorStateList2 = this.A0R) != null) {
                this.A0c.setTextColor(colorStateList2);
            }
            if (this.A0s && (colorStateList = this.A0Q) != null) {
                this.A0c.setTextColor(colorStateList);
            }
        }
    }

    public final void A0B() {
        if (this.A01 != 1) {
            FrameLayout frameLayout = this.A15;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int A012 = A01();
            if (A012 != layoutParams.topMargin) {
                layoutParams.topMargin = A012;
                frameLayout.requestLayout();
            }
        }
    }

    public void A0C(float f) {
        C159177lI r4 = this.A16;
        if (r4.A0I != f) {
            if (this.A0P == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A0P = valueAnimator;
                valueAnimator.setInterpolator(AnonymousClass5YH.A01(C159917mg.A02, getContext(), R.attr.f3nameremoved));
                this.A0P.setDuration((long) C160907oe.A00(getContext(), R.attr.f3nameremoved, 167));
                C86604Kt.A0w(this.A0P, this, 11);
            }
            ValueAnimator valueAnimator2 = this.A0P;
            float[] fArr = new float[2];
            AnonymousClass6C9.A1J(fArr, r4.A0I, f);
            valueAnimator2.setFloatValues(fArr);
            this.A0P.start();
        }
    }

    public void A0D(Editable editable) {
        String charSequence;
        int Azo = this.A0l.Azo(editable);
        boolean z = this.A0s;
        int i = this.A07;
        if (i == -1) {
            this.A0c.setText(String.valueOf(Azo));
            this.A0c.setContentDescription((CharSequence) null);
            this.A0s = false;
        } else {
            this.A0s = C86624Kv.A1W(Azo, i);
            Context context = getContext();
            TextView textView = this.A0c;
            int i2 = this.A07;
            boolean z2 = this.A0s;
            int i3 = R.string.f11nameremoved;
            if (z2) {
                i3 = R.string.f11nameremoved;
            }
            Object[] A0M2 = AnonymousClass002.A0M();
            Integer valueOf = Integer.valueOf(Azo);
            A0M2[0] = valueOf;
            AnonymousClass000.A1P(A0M2, i2, 1);
            textView.setContentDescription(context.getString(i3, A0M2));
            if (z != this.A0s) {
                A0A();
            }
            AnonymousClass0XH A022 = AnonymousClass0XH.A02();
            TextView textView2 = this.A0c;
            Context context2 = getContext();
            Object[] A1b = C18310x6.A1b(valueOf, 0);
            AnonymousClass000.A1P(A1b, this.A07, 1);
            String string = context2.getString(R.string.f11nameremoved, A1b);
            C15770ru r0 = A022.A00;
            if (string == null) {
                charSequence = null;
            } else {
                charSequence = A022.A03(r0, string).toString();
            }
            textView2.setText(charSequence);
        }
        if (this.A0b != null && z != this.A0s) {
            A0H(false, false);
            A06();
            A04();
        }
    }

    public final void A0E(Editable editable) {
        if (this.A0l.Azo(editable) != 0 || this.A0w) {
            TextView textView = this.A0d;
            if (textView != null && this.A0z) {
                textView.setText((CharSequence) null);
                AnonymousClass0XC.A02(this.A15, this.A0f);
                this.A0d.setVisibility(4);
            }
        } else if (this.A0d != null && this.A0z && !TextUtils.isEmpty(this.A0o)) {
            this.A0d.setText(this.A0o);
            AnonymousClass0XC.A02(this.A15, this.A0e);
            this.A0d.setVisibility(0);
            this.A0d.bringToFront();
            announceForAccessibility(this.A0o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2.getMeasuredWidth() <= 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2.A07.getVisibility() == 0) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I() {
        /*
            r11 = this;
            android.widget.EditText r0 = r11.A0b
            r8 = 0
            if (r0 != 0) goto L_0x0006
            return r8
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r11.getStartIconDrawable()
            if (r0 != 0) goto L_0x001a
            X.6Fe r2 = r11.A19
            java.lang.CharSequence r0 = r2.A05
            if (r0 == 0) goto L_0x0023
            android.widget.TextView r0 = r2.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0023
        L_0x001a:
            X.6Fe r2 = r11.A19
            int r1 = r2.getMeasuredWidth()
            r0 = 1
            if (r1 > 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r6 = 0
            r10 = 2
            r9 = 3
            r5 = 1
            if (r0 == 0) goto L_0x00dc
            int r1 = r2.getMeasuredWidth()
            android.widget.EditText r0 = r11.A0b
            int r0 = r0.getPaddingLeft()
            int r1 = r1 - r0
            android.graphics.drawable.Drawable r0 = r11.A0Z
            if (r0 == 0) goto L_0x003d
            int r0 = r11.A0O
            if (r0 == r1) goto L_0x0049
        L_0x003d:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r11.A0Z = r0
            r11.A0O = r1
            r0.setBounds(r8, r8, r1, r5)
        L_0x0049:
            android.widget.EditText r0 = r11.A0b
            android.graphics.drawable.Drawable[] r7 = X.AnonymousClass0X3.A04(r0)
            r0 = r7[r8]
            android.graphics.drawable.Drawable r4 = r11.A0Z
            if (r0 == r4) goto L_0x00f5
            android.widget.EditText r3 = r11.A0b
            r2 = r7[r5]
            r1 = r7[r10]
            r0 = r7[r9]
            X.AnonymousClass0X3.A02(r4, r2, r1, r0, r3)
        L_0x0060:
            r3 = 1
        L_0x0061:
            X.6Ff r1 = r11.A17
            com.google.android.material.internal.CheckableImageButton r0 = r1.A0I
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0079
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0075
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x0079
        L_0x0075:
            java.lang.CharSequence r0 = r1.A0B
            if (r0 == 0) goto L_0x00f9
        L_0x0079:
            int r0 = r1.getMeasuredWidth()
            if (r0 <= 0) goto L_0x00f9
            android.widget.TextView r0 = r1.A0G
            int r2 = r0.getMeasuredWidth()
            android.widget.EditText r0 = r11.A0b
            int r0 = r0.getPaddingRight()
            int r2 = r2 - r0
            com.google.android.material.internal.CheckableImageButton r1 = r1.getCurrentEndIconView()
            if (r1 == 0) goto L_0x00a0
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            int r0 = X.C06060Wb.A02(r0)
            int r2 = r2 + r0
        L_0x00a0:
            android.widget.EditText r0 = r11.A0b
            android.graphics.drawable.Drawable[] r6 = X.AnonymousClass0X3.A04(r0)
            android.graphics.drawable.Drawable r1 = r11.A0X
            if (r1 == 0) goto L_0x00c1
            int r0 = r11.A0E
            if (r0 == r2) goto L_0x00cd
            r11.A0E = r2
            r1.setBounds(r8, r8, r2, r5)
            android.widget.EditText r4 = r11.A0b
            r3 = r6[r8]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r1 = r11.A0X
        L_0x00bb:
            r0 = r6[r9]
            X.AnonymousClass0X3.A02(r3, r2, r1, r0, r4)
            return r5
        L_0x00c1:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r11.A0X = r0
            r11.A0E = r2
            r0.setBounds(r8, r8, r2, r5)
        L_0x00cd:
            r0 = r6[r10]
            android.graphics.drawable.Drawable r1 = r11.A0X
            if (r0 == r1) goto L_0x00f8
            r11.A0Y = r0
            android.widget.EditText r4 = r11.A0b
            r3 = r6[r8]
            r2 = r6[r5]
            goto L_0x00bb
        L_0x00dc:
            android.graphics.drawable.Drawable r0 = r11.A0Z
            if (r0 == 0) goto L_0x00f5
            android.widget.EditText r0 = r11.A0b
            android.graphics.drawable.Drawable[] r0 = X.AnonymousClass0X3.A04(r0)
            android.widget.EditText r3 = r11.A0b
            r2 = r0[r5]
            r1 = r0[r10]
            r0 = r0[r9]
            X.AnonymousClass0X3.A02(r6, r2, r1, r0, r3)
            r11.A0Z = r6
            goto L_0x0060
        L_0x00f5:
            r3 = 0
            goto L_0x0061
        L_0x00f8:
            return r3
        L_0x00f9:
            android.graphics.drawable.Drawable r0 = r11.A0X
            if (r0 == 0) goto L_0x011b
            android.widget.EditText r0 = r11.A0b
            android.graphics.drawable.Drawable[] r7 = X.AnonymousClass0X3.A04(r0)
            r1 = r7[r10]
            android.graphics.drawable.Drawable r0 = r11.A0X
            if (r1 != r0) goto L_0x0119
            android.widget.EditText r4 = r11.A0b
            r3 = r7[r8]
            r2 = r7[r5]
            android.graphics.drawable.Drawable r1 = r11.A0Y
            r0 = r7[r9]
            X.AnonymousClass0X3.A02(r3, r2, r1, r0, r4)
        L_0x0116:
            r11.A0X = r6
            return r5
        L_0x0119:
            r5 = r3
            goto L_0x0116
        L_0x011b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0I():boolean");
    }

    public final boolean A0J() {
        if (!this.A0v || TextUtils.isEmpty(this.A0m) || !(this.A0g instanceof AnonymousClass6ZD)) {
            return false;
        }
        return true;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.A15;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            A0B();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A0b;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.A0n != null) {
            boolean z = this.A0y;
            this.A0y = false;
            CharSequence hint = editText.getHint();
            this.A0b.setHint(this.A0n);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.A0b.setHint(hint);
                this.A0y = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.A15;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.A0b) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.A0x
            if (r0 != 0) goto L_0x004d
            r3 = 1
            r4.A0x = r3
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            X.7lI r1 = r4.A16
            r2 = 0
            if (r1 == 0) goto L_0x0050
            r1.A10 = r0
            android.content.res.ColorStateList r0 = r1.A0e
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0029
        L_0x001f:
            android.content.res.ColorStateList r0 = r1.A0g
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0050
        L_0x0029:
            r1.A0B(r2)
            r1 = 1
        L_0x002d:
            android.widget.EditText r0 = r4.A0b
            if (r0 == 0) goto L_0x0040
            boolean r0 = X.C06360Xi.A05(r4)
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x004e
        L_0x003d:
            r4.A0H(r3, r2)
        L_0x0040:
            r4.A04()
            r4.A06()
            if (r1 == 0) goto L_0x004b
            r4.invalidate()
        L_0x004b:
            r4.A0x = r2
        L_0x004d:
            return
        L_0x004e:
            r3 = 0
            goto L_0x003d
        L_0x0050:
            r1 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public int getBaseline() {
        EditText editText = this.A0b;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + A01();
        }
        return super.getBaseline();
    }

    public AnonymousClass6D7 getBoxBackground() {
        int i = this.A01;
        if (i == 1 || i == 2) {
            return this.A0g;
        }
        throw AnonymousClass6CA.A0O();
    }

    public int getBoxBackgroundColor() {
        return this.A00;
    }

    public int getBoxBackgroundMode() {
        return this.A01;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.A02;
    }

    public int getBoxStrokeColor() {
        return this.A0G;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0V;
    }

    public int getBoxStrokeWidth() {
        return this.A04;
    }

    public int getBoxStrokeWidthFocused() {
        return this.A05;
    }

    public int getCounterMaxLength() {
        return this.A07;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.A0r || !this.A0s || (textView = this.A0c) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A0Q;
    }

    public ColorStateList getCounterTextColor() {
        return this.A0R;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0S;
    }

    public EditText getEditText() {
        return this.A0b;
    }

    public CharSequence getEndIconContentDescription() {
        return this.A17.A0H.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.A17.A0H.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.A17.A00;
    }

    public int getEndIconMode() {
        return this.A17.A01;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.A17.A09;
    }

    public CheckableImageButton getEndIconView() {
        return this.A17.A0H;
    }

    public CharSequence getError() {
        C153557bX r1 = this.A18;
        if (r1.A0H) {
            return r1.A0E;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.A18.A03;
    }

    public CharSequence getErrorContentDescription() {
        return this.A18.A0F;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A18.A0C;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.A17.A0I.getDrawable();
    }

    public CharSequence getHelperText() {
        C153557bX r1 = this.A18;
        if (r1.A0I) {
            return r1.A0G;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A18.A0D;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0v) {
            return this.A0m;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A16.A01();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C159177lI r1 = this.A16;
        return r1.A02(r1.A0e);
    }

    public ColorStateList getHintTextColor() {
        return this.A0T;
    }

    public C181258mS getLengthCounter() {
        return this.A0l;
    }

    public int getMaxEms() {
        return this.A0J;
    }

    public int getMaxWidth() {
        return this.A0K;
    }

    public int getMinEms() {
        return this.A0L;
    }

    public int getMinWidth() {
        return this.A0M;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A17.A0H.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A17.A0H.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.A0z) {
            return this.A0o;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.A0N;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A0U;
    }

    public CharSequence getPrefixText() {
        return this.A19.A05;
    }

    public ColorStateList getPrefixTextColor() {
        return this.A19.A07.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.A19.A07;
    }

    public C161877ql getShapeAppearanceModel() {
        return this.A0k;
    }

    public CharSequence getStartIconContentDescription() {
        return this.A19.A08.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.A19.A08.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.A19.A00;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.A19.A04;
    }

    public CharSequence getSuffixText() {
        return this.A17.A0B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A17.A0G.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A17.A0G;
    }

    public Typeface getTypeface() {
        return this.A0W;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass6Gb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass6Gb r3 = (AnonymousClass6Gb) parcelable;
        super.onRestoreInstanceState(r3.A00);
        setError(r3.A00);
        if (r3.A01) {
            post(new C172668Mf(this, 41));
        }
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A0A = i;
            this.A0F = i;
            this.A0H = i;
            A07();
        }
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.A01) {
            this.A01 = i;
            if (this.A0b != null) {
                A08();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.A02 = i;
    }

    public void setBoxCornerFamily(int i) {
        C161877ql r3 = this.A0k;
        C158227jd r2 = new C158227jd(r3);
        C181228mP r1 = r3.A02;
        r2.A06 = C160927og.A00(i);
        r2.A02 = r1;
        C181228mP r12 = r3.A03;
        r2.A07 = C160927og.A00(i);
        r2.A03 = r12;
        C181228mP r13 = r3.A00;
        r2.A04 = C160927og.A00(i);
        r2.A00 = r13;
        C181228mP r14 = r3.A01;
        r2.A05 = C160927og.A00(i);
        r2.A01 = r14;
        this.A0k = new C161877ql(r2);
        A07();
    }

    public void setBoxStrokeColor(int i) {
        if (this.A0G != i) {
            this.A0G = i;
            A06();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0V != colorStateList) {
            this.A0V = colorStateList;
            A06();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.A04 = i;
        A06();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.A05 = i;
        A06();
    }

    public void setCounterEnabled(boolean z) {
        Editable text;
        if (this.A0r != z) {
            if (z) {
                AnonymousClass03n r1 = new AnonymousClass03n(getContext(), (AttributeSet) null);
                this.A0c = r1;
                r1.setId(R.id.textinput_counter);
                Typeface typeface = this.A0W;
                if (typeface != null) {
                    this.A0c.setTypeface(typeface);
                }
                this.A0c.setMaxLines(1);
                this.A18.A03(this.A0c, 2);
                C06060Wb.A04(AnonymousClass001.A0T(this.A0c), getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
                A0A();
                if (this.A0c != null) {
                    EditText editText = this.A0b;
                    if (editText == null) {
                        text = null;
                    } else {
                        text = editText.getText();
                    }
                    A0D(text);
                }
            } else {
                this.A18.A04(this.A0c, 2);
                this.A0c = null;
            }
            this.A0r = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.A07 != i) {
            if (i <= 0) {
                i = -1;
            }
            this.A07 = i;
            if (this.A0r && this.A0c != null) {
                EditText editText = this.A0b;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                A0D(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A08 != i) {
            this.A08 = i;
            A0A();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A0Q != colorStateList) {
            this.A0Q = colorStateList;
            A0A();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            A0A();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.A0R != colorStateList) {
            this.A0R = colorStateList;
            A0A();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0S = colorStateList;
        this.A0T = colorStateList;
        if (this.A0b != null) {
            A0H(false, false);
        }
    }

    public void setEndIconActivated(boolean z) {
        this.A17.setEndIconActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.A17.setEndIconCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        this.A17.setEndIconContentDescription(i);
    }

    public void setEndIconDrawable(int i) {
        this.A17.setEndIconDrawable(i);
    }

    public void setEndIconMinSize(int i) {
        this.A17.setEndIconMinSize(i);
    }

    public void setEndIconMode(int i) {
        this.A17.setEndIconMode(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.A17.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A17.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.A17.setEndIconScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.A17.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.A17.setEndIconTintMode(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.A17.setEndIconVisible(z);
    }

    public void setError(CharSequence charSequence) {
        C153557bX r3 = this.A18;
        if (!r3.A0H) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0E = charSequence;
            r3.A0C.setText(charSequence);
            int i = r3.A00;
            if (i != 1) {
                r3.A01 = 1;
            }
            r3.A02(i, r3.A01, r3.A07(r3.A0C, charSequence));
            return;
        }
        r3.A01();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C153557bX r0 = this.A18;
        r0.A03 = i;
        TextView textView = r0.A0C;
        if (textView != null) {
            C06360Xi.A01(textView, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C153557bX r0 = this.A18;
        r0.A0F = charSequence;
        TextView textView = r0.A0C;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C153557bX r2 = this.A18;
        if (r2.A0H != z) {
            Animator animator = r2.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass03n r1 = new AnonymousClass03n(r2.A0Q, (AttributeSet) null);
                r2.A0C = r1;
                r1.setId(R.id.textinput_error);
                r2.A0C.setTextAlignment(5);
                Typeface typeface = r2.A09;
                if (typeface != null) {
                    r2.A0C.setTypeface(typeface);
                }
                int i = r2.A02;
                r2.A02 = i;
                TextView textView = r2.A0C;
                if (textView != null) {
                    r2.A0R.A0F(textView, i);
                }
                ColorStateList colorStateList = r2.A07;
                r2.A07 = colorStateList;
                TextView textView2 = r2.A0C;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = r2.A0F;
                r2.A0F = charSequence;
                TextView textView3 = r2.A0C;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                int i2 = r2.A03;
                r2.A03 = i2;
                TextView textView4 = r2.A0C;
                if (textView4 != null) {
                    C06360Xi.A01(textView4, i2);
                }
                r2.A0C.setVisibility(4);
                r2.A03(r2.A0C, 0);
            } else {
                r2.A01();
                r2.A04(r2.A0C, 0);
                r2.A0C = null;
                TextInputLayout textInputLayout = r2.A0R;
                textInputLayout.A04();
                textInputLayout.A06();
            }
            r2.A0H = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        this.A17.setErrorIconDrawable(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.A17.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A17.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.A17.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.A17.setErrorIconTintMode(mode);
    }

    public void setErrorTextAppearance(int i) {
        C153557bX r0 = this.A18;
        r0.A02 = i;
        TextView textView = r0.A0C;
        if (textView != null) {
            r0.A0R.A0F(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C153557bX r0 = this.A18;
        r0.A07 = colorStateList;
        TextView textView = r0.A0C;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.A0t != z) {
            this.A0t = z;
            A0H(false, false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C153557bX r0 = this.A18;
        r0.A08 = colorStateList;
        TextView textView = r0.A0D;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C153557bX r4 = this.A18;
        if (r4.A0I != z) {
            Animator animator = r4.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass03n r1 = new AnonymousClass03n(r4.A0Q, (AttributeSet) null);
                r4.A0D = r1;
                r1.setId(R.id.textinput_helper_text);
                r4.A0D.setTextAlignment(5);
                Typeface typeface = r4.A09;
                if (typeface != null) {
                    r4.A0D.setTypeface(typeface);
                }
                r4.A0D.setVisibility(4);
                C06360Xi.A01(r4.A0D, 1);
                int i = r4.A04;
                r4.A04 = i;
                TextView textView = r4.A0D;
                if (textView != null) {
                    AnonymousClass0Y9.A06(textView, i);
                }
                ColorStateList colorStateList = r4.A08;
                r4.A08 = colorStateList;
                TextView textView2 = r4.A0D;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                r4.A03(r4.A0D, 1);
                r4.A0D.setAccessibilityDelegate(new C124836Eb(r4));
            } else {
                Animator animator2 = r4.A06;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = r4.A00;
                if (i2 == 2) {
                    r4.A01 = 0;
                }
                r4.A02(i2, r4.A01, r4.A07(r4.A0D, ""));
                r4.A04(r4.A0D, 1);
                r4.A0D = null;
                TextInputLayout textInputLayout = r4.A0R;
                textInputLayout.A04();
                textInputLayout.A06();
            }
            r4.A0I = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C153557bX r0 = this.A18;
        r0.A04 = i;
        TextView textView = r0.A0D;
        if (textView != null) {
            AnonymousClass0Y9.A06(textView, i);
        }
    }

    public void setHint(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0u = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0v) {
            this.A0v = z;
            if (!z) {
                this.A0y = false;
                if (!TextUtils.isEmpty(this.A0m) && TextUtils.isEmpty(this.A0b.getHint())) {
                    this.A0b.setHint(this.A0m);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.A0b.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0m)) {
                        setHint(hint);
                    }
                    this.A0b.setHint((CharSequence) null);
                }
                this.A0y = true;
            }
            if (this.A0b != null) {
                A0B();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C159177lI r0 = this.A16;
        r0.A06(i);
        this.A0T = r0.A0e;
        if (this.A0b != null) {
            A0H(false, false);
            A0B();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.A0T != colorStateList) {
            if (this.A0S == null) {
                C159177lI r1 = this.A16;
                if (r1.A0e != colorStateList) {
                    r1.A0e = colorStateList;
                    r1.A0B(false);
                }
            }
            this.A0T = colorStateList;
            if (this.A0b != null) {
                A0H(false, false);
            }
        }
    }

    public void setLengthCounter(C181258mS r1) {
        this.A0l = r1;
    }

    public void setMaxEms(int i) {
        this.A0J = i;
        EditText editText = this.A0b;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.A0K = i;
        EditText editText = this.A0b;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMinEms(int i) {
        this.A0L = i;
        EditText editText = this.A0b;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.A0M = i;
        EditText editText = this.A0b;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.A17.setPasswordVisibilityToggleContentDescription(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.A17.setPasswordVisibilityToggleDrawable(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.A17.setPasswordVisibilityToggleEnabled(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A17.setPasswordVisibilityToggleTintList(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A17.setPasswordVisibilityToggleTintMode(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable text;
        if (this.A0d == null) {
            AnonymousClass03n r1 = new AnonymousClass03n(getContext(), (AttributeSet) null);
            this.A0d = r1;
            r1.setId(R.id.textinput_placeholder);
            AnonymousClass0YY.A06(this.A0d, 2);
            AnonymousClass0AN A022 = A02();
            this.A0e = A022;
            A022.A02 = 67;
            this.A0f = A02();
            setPlaceholderTextAppearance(this.A0N);
            setPlaceholderTextColor(this.A0U);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.A0z) {
                setPlaceholderTextEnabled(true);
            }
            this.A0o = charSequence;
        }
        EditText editText = this.A0b;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        A0E(text);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.A0N = i;
        TextView textView = this.A0d;
        if (textView != null) {
            AnonymousClass0Y9.A06(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A0U != colorStateList) {
            this.A0U = colorStateList;
            TextView textView = this.A0d;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.A19.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.A19.setPrefixTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.A19.setPrefixTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C161877ql r2) {
        AnonymousClass6D7 r0 = this.A0g;
        if (r0 != null && r0.A03.A0K != r2) {
            this.A0k = r2;
            A07();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.A19.setStartIconCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0VX.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i) {
        this.A19.setStartIconMinSize(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.A19.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A19.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.A19.setStartIconScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.A19.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.A19.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.A19.setStartIconVisible(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A17.setSuffixText(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.A17.setSuffixTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A17.setSuffixTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(AnonymousClass6GS r2) {
        EditText editText = this.A0b;
        if (editText != null) {
            C06560Yg.A0O(editText, r2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0W) {
            this.A0W = typeface;
            C159177lI r2 = this.A16;
            boolean A0C2 = r2.A0C(typeface);
            boolean A0D2 = r2.A0D(typeface);
            if (A0C2 || A0D2) {
                r2.A0B(false);
            }
            C153557bX r1 = this.A18;
            if (typeface != r1.A09) {
                r1.A09 = typeface;
                TextView textView = r1.A0C;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = r1.A0D;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0c;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r26, android.util.AttributeSet r27, int r28) {
        /*
            r25 = this;
            r11 = 2132084327(0x7f150667, float:1.9808821E38)
            r0 = r26
            r13 = r27
            r12 = r28
            android.content.Context r0 = X.C105515Vh.A00(r0, r13, r12, r11)
            r10 = r25
            r10.<init>(r0, r13, r12)
            r9 = -1
            r10.A0L = r9
            r10.A0J = r9
            r10.A0M = r9
            r10.A0K = r9
            X.7bX r0 = new X.7bX
            r0.<init>(r10)
            r10.A18 = r0
            X.8C3 r0 = new X.8C3
            r0.<init>()
            r10.A0l = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r10.A13 = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r10.A12 = r0
            android.graphics.RectF r0 = X.AnonymousClass002.A07()
            r10.A14 = r0
            java.util.LinkedHashSet r0 = X.AnonymousClass0x9.A17()
            r10.A1A = r0
            X.7lI r2 = new X.7lI
            r2.<init>(r10)
            r10.A16 = r2
            android.content.Context r8 = r10.getContext()
            r7 = 1
            r10.setOrientation(r7)
            r1 = 0
            r10.setWillNotDraw(r1)
            r10.setAddStatesFromChildren(r7)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r8)
            r10.A15 = r6
            r6.setAddStatesFromChildren(r7)
            android.animation.TimeInterpolator r0 = X.C159917mg.A03
            r2.A0c = r0
            r5 = 0
            r2.A0B(r1)
            r2.A0b = r0
            r2.A0B(r1)
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r2.A07(r0)
            int[] r21 = X.C1463179t.A0f
            r0 = 5
            int[] r2 = new int[r0]
            r18 = 22
            r2[r1] = r18
            r0 = 20
            r2[r7] = r0
            r1 = 38
            r0 = 2
            r2[r0] = r1
            r1 = 43
            r0 = 3
            r2[r0] = r1
            r4 = 47
            r14 = 4
            r2[r14] = r4
            r20 = r13
            r22 = r2
            r23 = r12
            r24 = r11
            r19 = r8
            X.0UD r3 = X.C161837qd.A01(r19, r20, r21, r22, r23, r24)
            X.6Fe r2 = new X.6Fe
            r2.<init>(r3, r10)
            r10.A19 = r2
            r0 = 46
            android.content.res.TypedArray r1 = r3.A02
            boolean r0 = r1.getBoolean(r0, r7)
            r10.A0v = r0
            java.lang.CharSequence r0 = r1.getText(r14)
            r10.setHint((java.lang.CharSequence) r0)
            r0 = 45
            boolean r0 = r1.getBoolean(r0, r7)
            r10.A0u = r0
            r0 = 40
            boolean r0 = r1.getBoolean(r0, r7)
            r10.A0t = r0
            r0 = 6
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x035e
            r0 = 6
            int r0 = r1.getInt(r0, r9)
            r10.setMinEms(r0)
        L_0x00d5:
            r0 = 5
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x034d
            r0 = 5
            int r0 = r1.getInt(r0, r9)
            r10.setMaxEms(r0)
        L_0x00e4:
            X.7jd r11 = X.C161877ql.A01(r8, r13, r12, r11)
            X.7ql r0 = new X.7ql
            r0.<init>(r11)
            r10.A0k = r0
            android.content.res.Resources r11 = r8.getResources()
            r0 = 2131167529(0x7f070929, float:1.7949334E38)
            int r0 = r11.getDimensionPixelOffset(r0)
            r10.A11 = r0
            r0 = 9
            int r0 = r1.getDimensionPixelOffset(r0, r5)
            r10.A02 = r0
            android.content.res.Resources r5 = r8.getResources()
            r0 = 2131167530(0x7f07092a, float:1.7949336E38)
            int r5 = r5.getDimensionPixelSize(r0)
            r0 = 16
            int r0 = r1.getDimensionPixelSize(r0, r5)
            r10.A04 = r0
            android.content.res.Resources r5 = r8.getResources()
            r0 = 2131167531(0x7f07092b, float:1.7949338E38)
            int r5 = r5.getDimensionPixelSize(r0)
            r0 = 17
            int r0 = r1.getDimensionPixelSize(r0, r5)
            r10.A05 = r0
            int r0 = r10.A04
            r10.A06 = r0
            r0 = 13
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r14 = r1.getDimension(r0, r5)
            r0 = 12
            float r13 = r1.getDimension(r0, r5)
            r0 = 10
            float r12 = r1.getDimension(r0, r5)
            r0 = 11
            float r11 = r1.getDimension(r0, r5)
            X.7ql r0 = r10.A0k
            X.7jd r5 = new X.7jd
            r5.<init>(r0)
            r15 = 0
            int r0 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x015b
            X.8Bv r0 = new X.8Bv
            r0.<init>(r14)
            r5.A02 = r0
        L_0x015b:
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0166
            X.8Bv r0 = new X.8Bv
            r0.<init>(r13)
            r5.A03 = r0
        L_0x0166:
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0171
            X.8Bv r0 = new X.8Bv
            r0.<init>(r12)
            r5.A01 = r0
        L_0x0171:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x017c
            X.8Bv r0 = new X.8Bv
            r0.<init>(r11)
            r5.A00 = r0
        L_0x017c:
            X.7ql r0 = new X.7ql
            r0.<init>(r5)
            r10.A0k = r0
            r0 = 7
            android.content.res.ColorStateList r12 = X.C160917of.A01(r8, r3, r0)
            if (r12 == 0) goto L_0x0342
            int r0 = r12.getDefaultColor()
            r10.A0A = r0
            r10.A00 = r0
            boolean r0 = r12.isStateful()
            r11 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r0 == 0) goto L_0x0323
            int[] r5 = new int[r7]
            r0 = 0
            r5[r0] = r11
            int r0 = r12.getColorForState(r5, r9)
            r10.A0D = r0
            r5 = 2
            int[] r0 = new int[r5]
            r0 = {16842908, 16842910} // fill-array
            int r0 = r12.getColorForState(r0, r9)
            r10.A0F = r0
            int[] r11 = new int[r5]
            r11 = {16843623, 16842910} // fill-array
        L_0x01b7:
            int r0 = r12.getColorForState(r11, r9)
        L_0x01bb:
            r10.A0H = r0
            boolean r0 = r1.hasValue(r7)
            if (r0 == 0) goto L_0x01cb
            android.content.res.ColorStateList r0 = r3.A01(r7)
            r10.A0T = r0
            r10.A0S = r0
        L_0x01cb:
            r0 = 14
            android.content.res.ColorStateList r12 = X.C160917of.A01(r8, r3, r0)
            r5 = 0
            r11 = 0
            int r0 = r1.getColor(r0, r5)
            r10.A0G = r0
            r0 = 2131101947(0x7f0608fb, float:1.7816318E38)
            int r0 = X.AnonymousClass0Y8.A04(r8, r0)
            r10.A0B = r0
            r0 = 2131101948(0x7f0608fc, float:1.781632E38)
            int r0 = X.AnonymousClass0Y8.A04(r8, r0)
            r10.A0C = r0
            r0 = 2131101951(0x7f0608ff, float:1.7816326E38)
            int r0 = X.AnonymousClass0Y8.A04(r8, r0)
            r10.A0I = r0
            if (r12 == 0) goto L_0x01f9
            r10.setBoxStrokeColorStateList(r12)
        L_0x01f9:
            r12 = 15
            boolean r0 = r1.hasValue(r12)
            if (r0 == 0) goto L_0x0208
            android.content.res.ColorStateList r0 = X.C160917of.A01(r8, r3, r12)
            r10.setBoxStrokeErrorColor(r0)
        L_0x0208:
            int r0 = r1.getResourceId(r4, r9)
            if (r0 == r9) goto L_0x0215
            int r0 = r1.getResourceId(r4, r5)
            r10.setHintTextAppearance(r0)
        L_0x0215:
            r0 = 38
            int r17 = r1.getResourceId(r0, r5)
            r0 = 33
            java.lang.CharSequence r16 = r1.getText(r0)
            r0 = 32
            int r14 = r1.getInt(r0, r7)
            r0 = 34
            boolean r8 = r1.getBoolean(r0, r5)
            r0 = 43
            int r13 = r1.getResourceId(r0, r5)
            r0 = 42
            boolean r7 = r1.getBoolean(r0, r5)
            r0 = 41
            java.lang.CharSequence r5 = r1.getText(r0)
            r0 = 55
            int r12 = r1.getResourceId(r0, r11)
            r0 = 54
            java.lang.CharSequence r9 = r1.getText(r0)
            r0 = 18
            boolean r4 = r1.getBoolean(r0, r11)
            r15 = 19
            r0 = -1
            int r0 = r1.getInt(r15, r0)
            r10.setCounterMaxLength(r0)
            r0 = r18
            int r0 = r1.getResourceId(r0, r11)
            r10.A09 = r0
            r0 = 20
            int r0 = r1.getResourceId(r0, r11)
            r10.A08 = r0
            r0 = 8
            int r0 = r1.getInt(r0, r11)
            r10.setBoxBackgroundMode(r0)
            r0 = r16
            r10.setErrorContentDescription(r0)
            r10.setErrorAccessibilityLiveRegion(r14)
            int r0 = r10.A08
            r10.setCounterOverflowTextAppearance(r0)
            r10.setHelperTextTextAppearance(r13)
            r0 = r17
            r10.setErrorTextAppearance(r0)
            int r0 = r10.A09
            r10.setCounterTextAppearance(r0)
            r10.setPlaceholderText(r9)
            r10.setPlaceholderTextAppearance(r12)
            r9 = 39
            boolean r0 = r1.hasValue(r9)
            if (r0 == 0) goto L_0x02a3
            android.content.res.ColorStateList r0 = r3.A01(r9)
            r10.setErrorTextColor(r0)
        L_0x02a3:
            r9 = 44
            boolean r0 = r1.hasValue(r9)
            if (r0 == 0) goto L_0x02b2
            android.content.res.ColorStateList r0 = r3.A01(r9)
            r10.setHelperTextColor(r0)
        L_0x02b2:
            r9 = 48
            boolean r0 = r1.hasValue(r9)
            if (r0 == 0) goto L_0x02c1
            android.content.res.ColorStateList r0 = r3.A01(r9)
            r10.setHintTextColor(r0)
        L_0x02c1:
            r9 = 23
            boolean r0 = r1.hasValue(r9)
            if (r0 == 0) goto L_0x02d0
            android.content.res.ColorStateList r0 = r3.A01(r9)
            r10.setCounterTextColor(r0)
        L_0x02d0:
            r9 = 21
            boolean r0 = r1.hasValue(r9)
            if (r0 == 0) goto L_0x02df
            android.content.res.ColorStateList r0 = r3.A01(r9)
            r10.setCounterOverflowTextColor(r0)
        L_0x02df:
            r9 = 56
            boolean r0 = r1.hasValue(r9)
            if (r0 == 0) goto L_0x02ee
            android.content.res.ColorStateList r0 = r3.A01(r9)
            r10.setPlaceholderTextColor(r0)
        L_0x02ee:
            X.6Ff r12 = new X.6Ff
            r12.<init>(r3, r10)
            r10.A17 = r12
            r9 = 1
            boolean r3 = r1.getBoolean(r11, r9)
            r1.recycle()
            r0 = 2
            X.AnonymousClass0YY.A06(r10, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x030a
            X.C06560Yg.A0M(r10, r9)
        L_0x030a:
            r6.addView(r2)
            r6.addView(r12)
            r10.addView(r6)
            r10.setEnabled(r3)
            r10.setHelperTextEnabled(r7)
            r10.setErrorEnabled(r8)
            r10.setCounterEnabled(r4)
            r10.setHelperText(r5)
            return
        L_0x0323:
            int r0 = r10.A0A
            r10.A0F = r0
            r0 = 2131101920(0x7f0608e0, float:1.7816263E38)
            android.content.res.ColorStateList r12 = X.AnonymousClass0VX.A00(r8, r0)
            int[] r0 = new int[r7]
            r5 = 0
            r0[r5] = r11
            int r0 = r12.getColorForState(r0, r9)
            r10.A0D = r0
            int[] r11 = new int[r7]
            r0 = 16843623(0x1010367, float:2.3696E-38)
            r11[r5] = r0
            goto L_0x01b7
        L_0x0342:
            r0 = 0
            r10.A00 = r0
            r10.A0A = r0
            r10.A0D = r0
            r10.A0F = r0
            goto L_0x01bb
        L_0x034d:
            r0 = 2
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x00e4
            r0 = 2
            int r0 = r1.getDimensionPixelSize(r0, r9)
            r10.setMaxWidth(r0)
            goto L_0x00e4
        L_0x035e:
            r0 = 3
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x00d5
            r0 = 3
            int r0 = r1.getDimensionPixelSize(r0, r9)
            r10.setMinWidth(r0)
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A00(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, z);
            }
        }
    }

    public final AnonymousClass6D7 A03(boolean z) {
        float dimensionPixelOffset;
        int i;
        float dimensionPixelOffset2 = (float) getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        float f = 0.0f;
        if (z) {
            f = dimensionPixelOffset2;
        }
        EditText editText = this.A0b;
        if (editText instanceof C125156Fx) {
            dimensionPixelOffset = ((C125156Fx) editText).A02;
        } else {
            dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        C158227jd r1 = new C158227jd();
        r1.A02 = new C170088Bv(f);
        r1.A03 = new C170088Bv(f);
        r1.A00 = new C170088Bv(dimensionPixelOffset2);
        r1.A01 = new C170088Bv(dimensionPixelOffset2);
        C161877ql r5 = new C161877ql(r1);
        Context context = getContext();
        TypedValue A022 = C160907oe.A02(context, AnonymousClass6D7.class.getSimpleName(), R.attr.f3nameremoved);
        int i2 = A022.resourceId;
        if (i2 != 0) {
            i = AnonymousClass0Y8.A04(context, i2);
        } else {
            i = A022.data;
        }
        AnonymousClass6D7 r3 = new AnonymousClass6D7();
        r3.A05(context);
        r3.A06(ColorStateList.valueOf(i));
        r3.A04(dimensionPixelOffset);
        r3.setShapeAppearanceModel(r5);
        AnonymousClass6Cs r12 = r3.A03;
        if (r12.A0I == null) {
            r12.A0I = AnonymousClass001.A0N();
        }
        r3.A03.A0I.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        r3.invalidateSelf();
        return r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r10 = this;
            boolean r0 = r10.A0J()
            if (r0 == 0) goto L_0x00d2
            android.graphics.RectF r5 = r10.A14
            X.7lI r2 = r10.A16
            android.widget.EditText r0 = r10.A0b
            int r8 = r0.getWidth()
            android.widget.EditText r0 = r10.A0b
            int r4 = r0.getGravity()
            java.lang.CharSequence r6 = r2.A0t
            android.view.View r0 = r2.A16
            boolean r3 = X.AnonymousClass0YH.A08(r0)
            boolean r0 = r2.A0z
            if (r0 == 0) goto L_0x002f
            if (r3 == 0) goto L_0x00f3
            X.0ru r3 = X.AnonymousClass0K7.A02
        L_0x0026:
            int r1 = r6.length()
            r0 = 0
            boolean r3 = r3.BIl(r6, r0, r1)
        L_0x002f:
            r2.A0y = r3
            r0 = 17
            if (r4 == r0) goto L_0x00ea
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00ea
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00e1
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00e1
            if (r3 == 0) goto L_0x00e3
        L_0x0048:
            android.graphics.Rect r0 = r2.A11
            int r0 = r0.right
            float r6 = (float) r0
            float r0 = r2.A08
        L_0x004f:
            float r6 = r6 - r0
        L_0x0050:
            android.graphics.Rect r9 = r2.A11
            int r0 = r9.left
            float r0 = (float) r0
            float r7 = java.lang.Math.max(r6, r0)
            r5.left = r7
            int r0 = r9.top
            float r6 = (float) r0
            r5.top = r6
            r0 = 17
            if (r4 == r0) goto L_0x00d3
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00d3
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00db
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00db
            if (r3 == 0) goto L_0x00dd
        L_0x0077:
            int r0 = r9.right
            float r7 = (float) r0
        L_0x007a:
            int r0 = r9.right
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r7, r0)
            r5.right = r0
            float r0 = r2.A01()
            float r6 = r6 + r0
            r5.bottom = r6
            float r0 = r5.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            float r0 = r5.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            float r2 = r5.left
            int r0 = r10.A11
            float r1 = (float) r0
            float r2 = r2 - r1
            r5.left = r2
            float r0 = r5.right
            float r0 = r0 + r1
            r5.right = r0
            int r0 = r10.getPaddingLeft()
            int r0 = -r0
            float r3 = (float) r0
            int r0 = r10.getPaddingTop()
            int r0 = -r0
            float r2 = (float) r0
            float r1 = r5.height()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            int r0 = r10.A06
            float r0 = (float) r0
            float r2 = r2 + r0
            r5.offset(r3, r2)
            X.6D7 r4 = r10.A0g
            X.6ZD r4 = (X.AnonymousClass6ZD) r4
            float r3 = r5.left
            float r2 = r5.top
            float r1 = r5.right
            float r0 = r5.bottom
            r4.A0E(r3, r2, r1, r0)
        L_0x00d2:
            return
        L_0x00d3:
            float r7 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r1
            float r0 = r2.A08
            float r0 = r0 / r1
            goto L_0x00df
        L_0x00db:
            if (r3 == 0) goto L_0x0077
        L_0x00dd:
            float r0 = r2.A08
        L_0x00df:
            float r7 = r7 + r0
            goto L_0x007a
        L_0x00e1:
            if (r3 == 0) goto L_0x0048
        L_0x00e3:
            android.graphics.Rect r0 = r2.A11
            int r0 = r0.left
            float r6 = (float) r0
            goto L_0x0050
        L_0x00ea:
            float r6 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            float r0 = r2.A08
            float r0 = r0 / r1
            goto L_0x004f
        L_0x00f3:
            X.0ru r3 = X.AnonymousClass0K7.A01
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A09():void");
    }

    public void A0F(TextView textView, int i) {
        try {
            AnonymousClass0Y9.A06(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AnonymousClass0Y9.A06(textView, R.style.f12nameremoved);
        AnonymousClass0x2.A0q(getContext(), textView, R.color.f5nameremoved);
    }

    public final void A0G(boolean z) {
        Context context = getContext();
        TypedValue A012 = C160907oe.A01(context, R.attr.f3nameremoved);
        ColorStateList colorStateList = null;
        if (A012 != null) {
            int i = A012.resourceId;
            if (i != 0) {
                colorStateList = AnonymousClass0Y8.A07(context, i);
            } else {
                int i2 = A012.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
        }
        EditText editText = this.A0b;
        if (editText != null && editText.getTextCursorDrawable() != null && colorStateList != null) {
            Drawable textCursorDrawable = this.A0b.getTextCursorDrawable();
            if (z && (colorStateList = this.A0V) == null) {
                colorStateList = ColorStateList.valueOf(this.A03);
            }
            AnonymousClass0YG.A01(colorStateList, textCursorDrawable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.hasFocus() == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(boolean r9, boolean r10) {
        /*
            r8 = this;
            boolean r7 = r8.isEnabled()
            android.widget.EditText r0 = r8.A0b
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r6 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r6 = 0
        L_0x0016:
            android.widget.EditText r0 = r8.A0b
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.hasFocus()
            r5 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            android.content.res.ColorStateList r2 = r8.A0S
            if (r2 == 0) goto L_0x0037
            X.7lI r1 = r8.A16
            android.content.res.ColorStateList r0 = r1.A0e
            if (r0 != r2) goto L_0x0030
            android.content.res.ColorStateList r0 = r1.A0g
            if (r0 == r2) goto L_0x0037
        L_0x0030:
            r1.A0e = r2
            r1.A0g = r2
            r1.A0B(r4)
        L_0x0037:
            if (r7 != 0) goto L_0x012b
            android.content.res.ColorStateList r2 = r8.A0S
            if (r2 == 0) goto L_0x0127
            int[] r1 = new int[r3]
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r1[r4] = r0
            int r0 = r8.A0C
            int r0 = r2.getColorForState(r1, r0)
        L_0x004a:
            X.7lI r2 = r8.A16
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
        L_0x0050:
            android.content.res.ColorStateList r0 = r2.A0e
            if (r0 != r1) goto L_0x0058
            android.content.res.ColorStateList r0 = r2.A0g
            if (r0 == r1) goto L_0x005f
        L_0x0058:
            r2.A0e = r1
            r2.A0g = r1
            r2.A0B(r4)
        L_0x005f:
            if (r6 != 0) goto L_0x006d
            boolean r0 = r8.A0t
            if (r0 == 0) goto L_0x006d
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x00ba
            if (r5 == 0) goto L_0x00ba
        L_0x006d:
            if (r10 != 0) goto L_0x0073
            boolean r0 = r8.A0w
            if (r0 == 0) goto L_0x00ae
        L_0x0073:
            android.animation.ValueAnimator r0 = r8.A0P
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0082
            android.animation.ValueAnimator r0 = r8.A0P
            r0.cancel()
        L_0x0082:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x00b4
            boolean r0 = r8.A0u
            if (r0 == 0) goto L_0x00b4
            r8.A0C(r1)
        L_0x008d:
            r8.A0w = r4
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x0098
            r8.A09()
        L_0x0098:
            android.widget.EditText r0 = r8.A0b
            if (r0 != 0) goto L_0x00af
            r0 = 0
        L_0x009d:
            r8.A0E(r0)
            X.6Fe r0 = r8.A19
            r0.A06 = r4
            r0.A01()
            X.6Ff r0 = r8.A17
            r0.A0C = r4
        L_0x00ab:
            r0.A04()
        L_0x00ae:
            return
        L_0x00af:
            android.text.Editable r0 = r0.getText()
            goto L_0x009d
        L_0x00b4:
            X.7lI r0 = r8.A16
            r0.A04(r1)
            goto L_0x008d
        L_0x00ba:
            if (r10 != 0) goto L_0x00c0
            boolean r0 = r8.A0w
            if (r0 != 0) goto L_0x00ae
        L_0x00c0:
            android.animation.ValueAnimator r0 = r8.A0P
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00cf
            android.animation.ValueAnimator r0 = r8.A0P
            r0.cancel()
        L_0x00cf:
            r1 = 0
            if (r9 == 0) goto L_0x0121
            boolean r0 = r8.A0u
            if (r0 == 0) goto L_0x0121
            r8.A0C(r1)
        L_0x00d9:
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x00fa
            X.6D7 r0 = r8.A0g
            X.6ZD r0 = (X.AnonymousClass6ZD) r0
            android.graphics.RectF r0 = r0.A00
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x00fa
            X.6D7 r0 = r8.A0g
            X.6ZD r0 = (X.AnonymousClass6ZD) r0
            r0.A0E(r1, r1, r1, r1)
        L_0x00fa:
            r8.A0w = r3
            android.widget.TextView r1 = r8.A0d
            if (r1 == 0) goto L_0x0115
            boolean r0 = r8.A0z
            if (r0 == 0) goto L_0x0115
            r0 = 0
            r1.setText(r0)
            android.widget.FrameLayout r1 = r8.A15
            X.0AN r0 = r8.A0f
            X.AnonymousClass0XC.A02(r1, r0)
            android.widget.TextView r1 = r8.A0d
            r0 = 4
            r1.setVisibility(r0)
        L_0x0115:
            X.6Fe r0 = r8.A19
            r0.A06 = r3
            r0.A01()
            X.6Ff r0 = r8.A17
            r0.A0C = r3
            goto L_0x00ab
        L_0x0121:
            X.7lI r0 = r8.A16
            r0.A04(r1)
            goto L_0x00d9
        L_0x0127:
            int r0 = r8.A0C
            goto L_0x004a
        L_0x012b:
            X.7bX r1 = r8.A18
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x013c
            X.7lI r2 = r8.A16
            android.widget.TextView r0 = r1.A0C
            if (r0 != 0) goto L_0x0146
            r1 = 0
            goto L_0x0050
        L_0x013c:
            boolean r0 = r8.A0s
            if (r0 == 0) goto L_0x014c
            android.widget.TextView r0 = r8.A0c
            if (r0 == 0) goto L_0x014c
            X.7lI r2 = r8.A16
        L_0x0146:
            android.content.res.ColorStateList r1 = r0.getTextColors()
            goto L_0x0050
        L_0x014c:
            if (r5 == 0) goto L_0x005f
            android.content.res.ColorStateList r2 = r8.A0T
            if (r2 == 0) goto L_0x005f
            X.7lI r1 = r8.A16
            android.content.res.ColorStateList r0 = r1.A0e
            if (r0 == r2) goto L_0x005f
            r1.A0e = r2
            r1.A0B(r4)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0H(boolean, boolean):void");
    }

    public void draw(Canvas canvas) {
        AnonymousClass6D7 r0;
        super.draw(canvas);
        if (this.A0v) {
            this.A16.A0A(canvas);
        }
        if (this.A0i != null && (r0 = this.A0h) != null) {
            r0.draw(canvas);
            if (this.A0b.isFocused()) {
                Rect bounds = this.A0i.getBounds();
                Rect bounds2 = this.A0h.getBounds();
                float f = this.A16.A0I;
                int centerX = bounds2.centerX();
                bounds.left = AnonymousClass001.A07(f, (float) (bounds2.left - centerX)) + centerX;
                bounds.right = centerX + AnonymousClass001.A07(f, (float) (bounds2.right - centerX));
                this.A0i.draw(canvas);
            }
        }
    }

    public float getBoxCornerRadiusBottomEnd() {
        C181228mP r1;
        boolean A082 = AnonymousClass0YH.A08(this);
        C161877ql r0 = this.A0k;
        if (A082) {
            r1 = r0.A00;
        } else {
            r1 = r0.A01;
        }
        return r1.B60(this.A14);
    }

    public float getBoxCornerRadiusBottomStart() {
        C181228mP r1;
        boolean A082 = AnonymousClass0YH.A08(this);
        C161877ql r0 = this.A0k;
        if (A082) {
            r1 = r0.A01;
        } else {
            r1 = r0.A00;
        }
        return r1.B60(this.A14);
    }

    public float getBoxCornerRadiusTopEnd() {
        C181228mP r1;
        boolean A082 = AnonymousClass0YH.A08(this);
        C161877ql r0 = this.A0k;
        if (A082) {
            r1 = r0.A02;
        } else {
            r1 = r0.A03;
        }
        return r1.B60(this.A14);
    }

    public float getBoxCornerRadiusTopStart() {
        C181228mP r1;
        boolean A082 = AnonymousClass0YH.A08(this);
        C161877ql r0 = this.A0k;
        if (A082) {
            r1 = r0.A03;
        } else {
            r1 = r0.A02;
        }
        return r1.B60(this.A14);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A16.A09(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            super.onLayout(r10, r11, r12, r13, r14)
            android.widget.EditText r0 = r9.A0b
            if (r0 == 0) goto L_0x0154
            android.graphics.Rect r5 = r9.A13
            X.C106295Yk.A01(r5, r0, r9)
            X.6D7 r4 = r9.A0h
            if (r4 == 0) goto L_0x001d
            int r3 = r5.bottom
            int r0 = r9.A04
            int r2 = r3 - r0
            int r1 = r5.left
            int r0 = r5.right
            r4.setBounds(r1, r2, r0, r3)
        L_0x001d:
            X.6D7 r4 = r9.A0i
            if (r4 == 0) goto L_0x002e
            int r3 = r5.bottom
            int r0 = r9.A05
            int r2 = r3 - r0
            int r1 = r5.left
            int r0 = r5.right
            r4.setBounds(r1, r2, r0, r3)
        L_0x002e:
            boolean r0 = r9.A0v
            if (r0 == 0) goto L_0x0154
            X.7lI r4 = r9.A16
            android.widget.EditText r0 = r9.A0b
            float r1 = r0.getTextSize()
            float r0 = r4.A0O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0046
            r4.A0O = r1
            r0 = 0
            r4.A0B(r0)
        L_0x0046:
            android.widget.EditText r0 = r9.A0b
            int r1 = r0.getGravity()
            r0 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r0 = r0 | 48
            r4.A07(r0)
            int r0 = r4.A0Y
            if (r0 == r1) goto L_0x005d
            r4.A0Y = r1
            r0 = 0
            r4.A0B(r0)
        L_0x005d:
            android.widget.EditText r0 = r9.A0b
            if (r0 == 0) goto L_0x01c2
            android.graphics.Rect r3 = r9.A12
            boolean r7 = X.AnonymousClass0YH.A08(r9)
            int r0 = r5.bottom
            r3.bottom = r0
            int r1 = r9.A01
            r0 = 1
            if (r1 == r0) goto L_0x0197
            r0 = 2
            if (r1 == r0) goto L_0x0178
            int r2 = r5.left
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            X.6Fe r6 = r9.A19
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x0090
            if (r7 != 0) goto L_0x0090
            android.widget.TextView r1 = r6.A07
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x0090:
            r3.left = r2
            int r1 = r9.getPaddingTop()
        L_0x0096:
            r3.top = r1
            int r8 = r5.right
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getCompoundPaddingRight()
            int r8 = r8 - r0
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x00b3
            if (r7 == 0) goto L_0x00b3
            android.widget.TextView r0 = r6.A07
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getPaddingRight()
            int r1 = r1 - r0
            int r8 = r8 + r1
        L_0x00b3:
            r3.right = r8
            int r7 = r3.left
            int r6 = r3.top
            int r2 = r3.bottom
            android.graphics.Rect r1 = r4.A11
            int r0 = r1.left
            if (r0 != r7) goto L_0x0170
            int r0 = r1.top
            if (r0 != r6) goto L_0x0170
            int r0 = r1.right
            if (r0 != r8) goto L_0x0170
            int r0 = r1.bottom
            if (r0 != r2) goto L_0x0170
        L_0x00cd:
            android.widget.EditText r0 = r9.A0b
            if (r0 == 0) goto L_0x01bd
            android.text.TextPaint r1 = r4.A15
            float r0 = r4.A0O
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = r4.A0l
            r1.setTypeface(r0)
            float r0 = r4.A0J
            r1.setLetterSpacing(r0)
            float r0 = r1.ascent()
            float r2 = -r0
            int r1 = r5.left
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getCompoundPaddingLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r0 = r9.A01
            r1 = 1
            if (r0 != r1) goto L_0x0166
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x0166
            int r0 = r5.centerY()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r1 = (int) r1
        L_0x010a:
            r3.top = r1
            int r1 = r5.right
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getCompoundPaddingRight()
            int r1 = r1 - r0
            r3.right = r1
            int r0 = r9.A01
            r1 = 1
            if (r0 != r1) goto L_0x015c
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x015c
            int r0 = r3.top
            float r0 = (float) r0
            float r0 = r0 + r2
            int r1 = (int) r0
        L_0x0129:
            r3.bottom = r1
            int r6 = r3.left
            int r5 = r3.top
            int r3 = r3.right
            android.graphics.Rect r2 = r4.A12
            int r0 = r2.left
            if (r0 != r6) goto L_0x0155
            int r0 = r2.top
            if (r0 != r5) goto L_0x0155
            int r0 = r2.right
            if (r0 != r3) goto L_0x0155
            int r0 = r2.bottom
            if (r0 != r1) goto L_0x0155
        L_0x0143:
            r0 = 0
            r4.A0B(r0)
            boolean r0 = r9.A0J()
            if (r0 == 0) goto L_0x0154
            boolean r0 = r9.A0w
            if (r0 != 0) goto L_0x0154
            r9.A09()
        L_0x0154:
            return
        L_0x0155:
            r2.set(r6, r5, r3, r1)
            r0 = 1
            r4.A0w = r0
            goto L_0x0143
        L_0x015c:
            int r1 = r5.bottom
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getCompoundPaddingBottom()
            int r1 = r1 - r0
            goto L_0x0129
        L_0x0166:
            int r1 = r5.top
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getCompoundPaddingTop()
            int r1 = r1 + r0
            goto L_0x010a
        L_0x0170:
            r1.set(r7, r6, r8, r2)
            r0 = 1
            r4.A0w = r0
            goto L_0x00cd
        L_0x0178:
            int r1 = r5.left
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getPaddingLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r1 = r5.top
            int r0 = r9.A01()
            int r1 = r1 - r0
            r3.top = r1
            int r8 = r5.right
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getPaddingRight()
            int r8 = r8 - r0
            goto L_0x00b3
        L_0x0197:
            int r2 = r5.left
            android.widget.EditText r0 = r9.A0b
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            X.6Fe r6 = r9.A19
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x01b4
            if (r7 != 0) goto L_0x01b4
            android.widget.TextView r1 = r6.A07
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x01b4:
            r3.left = r2
            int r1 = r5.top
            int r0 = r9.A02
            int r1 = r1 + r0
            goto L_0x0096
        L_0x01bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x01c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        if (this.A0b == null || this.A0b.getMeasuredHeight() >= (max = Math.max(this.A17.getMeasuredHeight(), this.A19.getMeasuredHeight()))) {
            z = false;
        } else {
            this.A0b.setMinimumHeight(max);
            z = true;
        }
        boolean A0I2 = A0I();
        if (z || A0I2) {
            this.A0b.post(new C172668Mf(this, 42));
        }
        if (!(this.A0d == null || (editText = this.A0b) == null)) {
            this.A0d.setGravity(editText.getGravity());
            this.A0d.setPadding(this.A0b.getCompoundPaddingLeft(), this.A0b.getCompoundPaddingTop(), this.A0b.getCompoundPaddingRight(), this.A0b.getCompoundPaddingBottom());
        }
        this.A17.A01();
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean A1T = AnonymousClass001.A1T(i);
        if (A1T != this.A0p) {
            C181228mP r0 = this.A0k.A02;
            RectF rectF = this.A14;
            float B60 = r0.B60(rectF);
            float B602 = this.A0k.A03.B60(rectF);
            float B603 = this.A0k.A00.B60(rectF);
            float B604 = this.A0k.A01.B60(rectF);
            C161877ql r02 = this.A0k;
            C150377Qk r4 = r02.A06;
            C150377Qk r3 = r02.A07;
            C150377Qk r2 = r02.A04;
            C150377Qk r03 = r02.A05;
            C158227jd r1 = new C158227jd();
            r1.A06 = r3;
            r1.A07 = r4;
            r1.A04 = r03;
            r1.A05 = r2;
            r1.A02 = new C170088Bv(B602);
            r1.A03 = new C170088Bv(B60);
            r1.A00 = new C170088Bv(B604);
            r1.A01 = new C170088Bv(B603);
            C161877ql r04 = new C161877ql(r1);
            this.A0p = A1T;
            setShapeAppearanceModel(r04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.A0H.isChecked() == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.6Gb r2 = new X.6Gb
            r2.<init>(r0)
            X.7bX r0 = r3.A18
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0017
            java.lang.CharSequence r0 = r3.getError()
            r2.A00 = r0
        L_0x0017:
            X.6Ff r1 = r3.A17
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0026
            com.google.android.material.internal.CheckableImageButton r0 = r1.A0H
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AnonymousClass0Y8.A04(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0A = defaultColor;
        this.A00 = defaultColor;
        int[] A0E2 = C18330xA.A0E();
        A0E2[0] = -16842910;
        this.A0D = colorStateList.getColorForState(A0E2, -1);
        this.A0F = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A0H = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        A07();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.A0B = colorStateList.getDefaultColor();
            int[] A0E2 = C18330xA.A0E();
            A0E2[0] = -16842910;
            this.A0C = colorStateList.getColorForState(A0E2, -1);
            this.A0I = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.A0G != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A06();
        }
        this.A0G = defaultColor;
        A06();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(C86614Ku.A05(this, i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(C86614Ku.A05(this, i));
    }

    public void setEnabled(boolean z) {
        A00(this, z);
        super.setEnabled(z);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            C153557bX r3 = this.A18;
            if (!r3.A0I) {
                setHelperTextEnabled(true);
            }
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0G = charSequence;
            r3.A0D.setText(charSequence);
            int i = r3.A00;
            if (i != 2) {
                r3.A01 = 2;
            }
            r3.A02(i, r3.A01, r3.A07(r3.A0D, charSequence));
        } else if (this.A18.A0I) {
            setHelperTextEnabled(false);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(C18290x4.A0G(this).getDimensionPixelSize(i));
    }

    public void setMinWidthResource(int i) {
        setMinWidth(C18290x4.A0G(this).getDimensionPixelSize(i));
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.A17.setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.A17.setEndIconDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.A17.setErrorIconDrawable(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0v) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A17.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A17.setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.A19.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.A19.setStartIconDrawable(drawable);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
