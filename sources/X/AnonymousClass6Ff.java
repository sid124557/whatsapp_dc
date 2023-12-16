package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.6Ff  reason: invalid class name */
public class AnonymousClass6Ff extends LinearLayout {
    public int A00;
    public int A01 = 0;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public PorterDuff.Mode A05;
    public View.OnLongClickListener A06;
    public View.OnLongClickListener A07;
    public EditText A08;
    public ImageView.ScaleType A09;
    public C15850s3 A0A;
    public CharSequence A0B;
    public boolean A0C;
    public final TextWatcher A0D = new AnonymousClass6Z2(this);
    public final AccessibilityManager A0E;
    public final FrameLayout A0F;
    public final TextView A0G;
    public final CheckableImageButton A0H;
    public final CheckableImageButton A0I;
    public final AnonymousClass7MK A0J;
    public final C181268mT A0K;
    public final TextInputLayout A0L;
    public final LinkedHashSet A0M = AnonymousClass0x9.A17();

    public void A01() {
        int i;
        TextInputLayout textInputLayout = this.A0L;
        if (textInputLayout.A0b != null) {
            if (A06() || this.A0I.getVisibility() == 0) {
                i = 0;
            } else {
                i = AnonymousClass0YH.A02(textInputLayout.A0b);
            }
            AnonymousClass0YH.A07(this.A0G, C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved), textInputLayout.A0b.getPaddingTop(), i, textInputLayout.A0b.getPaddingBottom());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A0I.getVisibility() == 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r4.A0C != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            android.widget.FrameLayout r3 = r4.A0F
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0H
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 != 0) goto L_0x0015
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0I
            int r1 = r0.getVisibility()
            r0 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r3.setVisibility(r0)
            java.lang.CharSequence r0 = r4.A0B
            if (r0 == 0) goto L_0x0023
            boolean r0 = r4.A0C
            r1 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r1 = 8
        L_0x0025:
            boolean r0 = r4.A06()
            if (r0 != 0) goto L_0x0035
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0I
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0035
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            r4.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ff.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1.A06() != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r3 = r4.A0I
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.material.textfield.TextInputLayout r0 = r4.A0L
            X.7bX r1 = r0.A18
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x002a
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x002a
        L_0x0017:
            r3.setVisibility(r2)
            r4.A02()
            r4.A01()
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0029
            com.google.android.material.textfield.TextInputLayout r0 = r4.A0L
            r0.A0I()
        L_0x0029:
            return
        L_0x002a:
            r2 = 8
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ff.A03():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5.A0C != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            android.widget.TextView r4 = r5.A0G
            int r1 = r4.getVisibility()
            java.lang.CharSequence r0 = r5.A0B
            r3 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.A0C
            r2 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r2 = 8
        L_0x0012:
            if (r1 == r2) goto L_0x002a
            X.7c0 r1 = r5.getEndIconDelegate()
            if (r2 != 0) goto L_0x001b
            r3 = 1
        L_0x001b:
            boolean r0 = r1 instanceof X.AnonymousClass6ZQ
            if (r0 == 0) goto L_0x002a
            X.6ZQ r1 = (X.AnonymousClass6ZQ) r1
            X.6Ff r0 = r1.A02
            java.lang.CharSequence r0 = r0.A0B
            if (r0 == 0) goto L_0x002a
            r1.A09(r3)
        L_0x002a:
            r5.A02()
            r4.setVisibility(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r5.A0L
            r0.A0I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ff.A04():void");
    }

    public boolean A06() {
        if (this.A0F.getVisibility() == 0 && this.A0H.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public CheckableImageButton getCurrentEndIconView() {
        CheckableImageButton checkableImageButton = this.A0I;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.A01 == 0 || !A06()) {
            return null;
        }
        return this.A0H;
    }

    public CharSequence getEndIconContentDescription() {
        return this.A0H.getContentDescription();
    }

    public C153787c0 getEndIconDelegate() {
        AnonymousClass7MK r5 = this.A0J;
        int i = this.A01;
        SparseArray sparseArray = r5.A02;
        C153787c0 r2 = (C153787c0) sparseArray.get(i);
        if (r2 == null) {
            if (i == -1) {
                r2 = new AnonymousClass6ZP(r5.A03);
            } else if (i == 0) {
                r2 = new AnonymousClass6ZO(r5.A03);
            } else if (i == 1) {
                r2 = new C88724ag(r5.A03, r5.A01);
            } else if (i == 2) {
                r2 = new AnonymousClass6ZQ(r5.A03);
            } else if (i == 3) {
                r2 = new AnonymousClass6ZR(r5.A03);
            } else {
                throw AnonymousClass000.A0G("Invalid end icon mode: ", AnonymousClass001.A0o(), i);
            }
            sparseArray.append(i, r2);
        }
        return r2;
    }

    public Drawable getEndIconDrawable() {
        return this.A0H.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.A00;
    }

    public int getEndIconMode() {
        return this.A01;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.A09;
    }

    public CheckableImageButton getEndIconView() {
        return this.A0H;
    }

    public Drawable getErrorIconDrawable() {
        return this.A0I.getDrawable();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A0H.getContentDescription();
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A0H.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A0B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A0G.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A0G;
    }

    public void setEndIconActivated(boolean z) {
        this.A0H.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.A0H.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A0H;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            TextInputLayout textInputLayout = this.A0L;
            C106745a6.A01(this.A02, this.A04, checkableImageButton, textInputLayout);
            C106745a6.A02(this.A02, checkableImageButton, textInputLayout);
        }
    }

    public void setEndIconMinSize(int i) {
        if (i < 0) {
            throw AnonymousClass001.A0c("endIconSize cannot be less than 0");
        } else if (i != this.A00) {
            this.A00 = i;
            CheckableImageButton checkableImageButton = this.A0H;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = this.A0I;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        AccessibilityManager accessibilityManager;
        if (this.A01 != i) {
            C153787c0 endIconDelegate = getEndIconDelegate();
            C15850s3 r1 = this.A0A;
            if (!(r1 == null || (accessibilityManager = this.A0E) == null)) {
                C05010Rn.A01(accessibilityManager, r1);
            }
            this.A0A = null;
            endIconDelegate.A04();
            this.A01 = i;
            Iterator it = this.A0M.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("onEndIconChanged");
            }
            setEndIconVisible(AnonymousClass000.A1S(i));
            C153787c0 endIconDelegate2 = getEndIconDelegate();
            int i2 = this.A0J.A00;
            if (i2 == 0) {
                i2 = endIconDelegate2.A01();
            }
            setEndIconDrawable(i2);
            setEndIconContentDescription(endIconDelegate2.A00());
            setEndIconCheckable(endIconDelegate2.A07());
            TextInputLayout textInputLayout = this.A0L;
            int i3 = textInputLayout.A01;
            if (!(endIconDelegate2 instanceof AnonymousClass6ZR) || AnonymousClass000.A1S(i3)) {
                setUpDelegate(endIconDelegate2);
                setEndIconOnClickListener(endIconDelegate2.A02());
                EditText editText = this.A08;
                if (editText != null) {
                    endIconDelegate2.A05(editText);
                    setOnFocusChangeListenersIfNeeded(endIconDelegate2);
                }
                C106745a6.A01(this.A02, this.A04, this.A0H, textInputLayout);
                A05(true);
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("The current box background mode ");
            A0o.append(i3);
            throw C86604Kt.A0h(" is not supported by the end icon mode ", A0o, i);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.A0H;
        View.OnLongClickListener onLongClickListener = this.A06;
        checkableImageButton.setOnClickListener(onClickListener);
        C106745a6.A03(onLongClickListener, checkableImageButton);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A06 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.A0H;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C106745a6.A03(onLongClickListener, checkableImageButton);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.A09 = scaleType;
        this.A0H.setScaleType(scaleType);
        this.A0I.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.A02 != colorStateList) {
            this.A02 = colorStateList;
            TextInputLayout textInputLayout = this.A0L;
            C106745a6.A01(colorStateList, this.A04, this.A0H, textInputLayout);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.A04 != mode) {
            this.A04 = mode;
            TextInputLayout textInputLayout = this.A0L;
            C106745a6.A01(this.A02, mode, this.A0H, textInputLayout);
        }
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0VX.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setErrorIconDrawable(drawable);
        TextInputLayout textInputLayout = this.A0L;
        C106745a6.A02(this.A03, this.A0I, textInputLayout);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.A0I;
        View.OnLongClickListener onLongClickListener = this.A07;
        checkableImageButton.setOnClickListener(onClickListener);
        C106745a6.A03(onLongClickListener, checkableImageButton);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A07 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.A0I;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C106745a6.A03(onLongClickListener, checkableImageButton);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.A03 != colorStateList) {
            this.A03 = colorStateList;
            TextInputLayout textInputLayout = this.A0L;
            C106745a6.A01(colorStateList, this.A05, this.A0I, textInputLayout);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.A05 != mode) {
            this.A05 = mode;
            TextInputLayout textInputLayout = this.A0L;
            C106745a6.A01(this.A03, mode, this.A0I, textInputLayout);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOnFocusChangeListenersIfNeeded(X.C153787c0 r3) {
        /*
            r2 = this;
            android.widget.EditText r1 = r2.A08
            if (r1 == 0) goto L_0x0021
            boolean r0 = r3 instanceof X.AnonymousClass6ZR
            if (r0 == 0) goto L_0x0022
            r0 = r3
            X.6ZR r0 = (X.AnonymousClass6ZR) r0
            android.view.View$OnFocusChangeListener r0 = r0.A0C
        L_0x000d:
            if (r0 == 0) goto L_0x0012
            r1.setOnFocusChangeListener(r0)
        L_0x0012:
            boolean r0 = r3 instanceof X.AnonymousClass6ZQ
            if (r0 == 0) goto L_0x0021
            X.6ZQ r3 = (X.AnonymousClass6ZQ) r3
            android.view.View$OnFocusChangeListener r1 = r3.A08
            if (r1 == 0) goto L_0x0021
            com.google.android.material.internal.CheckableImageButton r0 = r2.A0H
            r0.setOnFocusChangeListener(r1)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r3 instanceof X.AnonymousClass6ZQ
            if (r0 == 0) goto L_0x0012
            r0 = r3
            X.6ZQ r0 = (X.AnonymousClass6ZQ) r0
            android.view.View$OnFocusChangeListener r0 = r0.A08
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ff.setOnFocusChangeListenersIfNeeded(X.7c0):void");
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0VX.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        int i;
        if (z) {
            i = 1;
            if (this.A01 == 1) {
                return;
            }
        } else {
            i = 0;
        }
        setEndIconMode(i);
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        TextInputLayout textInputLayout = this.A0L;
        C106745a6.A01(colorStateList, this.A04, this.A0H, textInputLayout);
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A04 = mode;
        TextInputLayout textInputLayout = this.A0L;
        C106745a6.A01(this.A02, mode, this.A0H, textInputLayout);
    }

    public void setSuffixTextAppearance(int i) {
        AnonymousClass0Y9.A06(this.A0G, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A0G.setTextColor(colorStateList);
    }

    public AnonymousClass6Ff(AnonymousClass0UD r11, TextInputLayout textInputLayout) {
        super(textInputLayout.getContext());
        AnonymousClass8C4 r8 = new AnonymousClass8C4(this);
        this.A0K = r8;
        this.A0E = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.A0L = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.A0F = frameLayout;
        frameLayout.setVisibility(8);
        C86654Ky.A14(frameLayout, -2, -1);
        LayoutInflater A0D2 = C18280x3.A0D(this);
        CheckableImageButton A002 = A00(A0D2, this, R.id.text_input_error_icon);
        this.A0I = A002;
        CheckableImageButton A003 = A00(A0D2, frameLayout, R.id.text_input_end_icon);
        this.A0H = A003;
        this.A0J = new AnonymousClass7MK(r11, this);
        AnonymousClass03n r3 = new AnonymousClass03n(getContext(), (AttributeSet) null);
        this.A0G = r3;
        TypedArray typedArray = r11.A02;
        if (typedArray.hasValue(36)) {
            this.A03 = C160917of.A01(getContext(), r11, 36);
        }
        if (typedArray.hasValue(37)) {
            this.A05 = C159337lf.A01((PorterDuff.Mode) null, typedArray.getInt(37, -1));
        }
        if (typedArray.hasValue(35)) {
            setErrorIconDrawable(r11.A02(35));
        }
        CheckableImageButton checkableImageButton = this.A0I;
        checkableImageButton.setContentDescription(getResources().getText(R.string.f11nameremoved));
        AnonymousClass0YY.A06(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.A02 = false;
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(51)) {
            if (typedArray.hasValue(30)) {
                this.A02 = C160917of.A01(getContext(), r11, 30);
            }
            if (typedArray.hasValue(31)) {
                this.A04 = C159337lf.A01((PorterDuff.Mode) null, typedArray.getInt(31, -1));
            }
        }
        if (typedArray.hasValue(28)) {
            setEndIconMode(typedArray.getInt(28, 0));
            if (typedArray.hasValue(25)) {
                setEndIconContentDescription(typedArray.getText(25));
            }
            setEndIconCheckable(typedArray.getBoolean(24, true));
        } else if (typedArray.hasValue(51)) {
            if (typedArray.hasValue(52)) {
                this.A02 = C160917of.A01(getContext(), r11, 52);
            }
            if (typedArray.hasValue(53)) {
                this.A04 = C159337lf.A01((PorterDuff.Mode) null, typedArray.getInt(53, -1));
            }
            setEndIconMode(typedArray.getBoolean(51, false) ? 1 : 0);
            setEndIconContentDescription(typedArray.getText(49));
        }
        setEndIconMinSize(typedArray.getDimensionPixelSize(27, getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
        if (typedArray.hasValue(29)) {
            setEndIconScaleType(C106745a6.A00(typedArray.getInt(29, -1)));
        }
        TextView textView = this.A0G;
        textView.setVisibility(8);
        textView.setId(R.id.textinput_suffix_text);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C06360Xi.A01(textView, 1);
        setSuffixTextAppearance(typedArray.getResourceId(70, 0));
        if (typedArray.hasValue(71)) {
            setSuffixTextColor(r11.A01(71));
        }
        setSuffixText(typedArray.getText(69));
        frameLayout.addView(A003);
        addView(r3);
        addView(frameLayout);
        addView(A002);
        textInputLayout.A1A.add(r8);
        if (textInputLayout.A0b != null) {
            r8.BRn(textInputLayout);
        }
        addOnAttachStateChangeListener(new C1893190v(this, 0));
    }

    public final CheckableImageButton A00(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        checkableImageButton.setId(i);
        C106745a6.A04(checkableImageButton);
        if (AnonymousClass001.A1U((AnonymousClass001.A0M(getContext()).fontScale > 1.3f ? 1 : (AnonymousClass001.A0M(getContext()).fontScale == 1.3f ? 0 : -1)))) {
            C06060Wb.A04(AnonymousClass001.A0T(checkableImageButton), 0);
        }
        return checkableImageButton;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r5.A0H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(boolean r6) {
        /*
            r5 = this;
            X.7c0 r4 = r5.getEndIconDelegate()
            boolean r0 = r4.A07()
            r3 = 1
            if (r0 == 0) goto L_0x0042
            com.google.android.material.internal.CheckableImageButton r2 = r5.A0H
            boolean r1 = r2.isChecked()
            boolean r0 = r4.A08()
            if (r1 == r0) goto L_0x0042
            r0 = r1 ^ 1
            r2.setChecked(r0)
            r2 = 1
        L_0x001d:
            boolean r0 = r4 instanceof X.AnonymousClass6ZR
            if (r0 == 0) goto L_0x0040
            com.google.android.material.internal.CheckableImageButton r0 = r5.A0H
            boolean r1 = r0.isActivated()
            X.6ZR r4 = (X.AnonymousClass6ZR) r4
            boolean r0 = r4.A06
            if (r1 == r0) goto L_0x0040
            r0 = r1 ^ 1
            r5.setEndIconActivated(r0)
        L_0x0032:
            if (r6 != 0) goto L_0x0036
            if (r3 == 0) goto L_0x003f
        L_0x0036:
            com.google.android.material.textfield.TextInputLayout r2 = r5.A0L
            com.google.android.material.internal.CheckableImageButton r1 = r5.A0H
            android.content.res.ColorStateList r0 = r5.A02
            X.C106745a6.A02(r0, r1, r2)
        L_0x003f:
            return
        L_0x0040:
            r3 = r2
            goto L_0x0032
        L_0x0042:
            r2 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ff.A05(boolean):void");
    }

    public void setEndIconVisible(boolean z) {
        if (A06() != z) {
            this.A0H.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
            A02();
            A01();
            this.A0L.A0I();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        this.A0B = charSequence2;
        this.A0G.setText(charSequence);
        A04();
    }

    public final void setUpDelegate(C153787c0 r3) {
        C15850s3 r0;
        AccessibilityManager accessibilityManager;
        r3.A03();
        if (r3 instanceof AnonymousClass6ZR) {
            r0 = ((AnonymousClass6ZR) r3).A0D;
        } else {
            r0 = null;
        }
        this.A0A = r0;
        if (r0 != null && (accessibilityManager = this.A0E) != null && C06360Xi.A04(this)) {
            C05010Rn.A00(accessibilityManager, this.A0A);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A0H;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0VX.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setEndIconDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A0I;
        checkableImageButton.setImageDrawable(drawable);
        A03();
        C106745a6.A01(this.A03, this.A05, checkableImageButton, this.A0L);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A0H.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A0H.setImageDrawable(drawable);
    }
}
