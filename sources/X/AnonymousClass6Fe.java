package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;

/* renamed from: X.6Fe  reason: invalid class name */
public class AnonymousClass6Fe extends LinearLayout {
    public int A00;
    public ColorStateList A01;
    public PorterDuff.Mode A02;
    public View.OnLongClickListener A03;
    public ImageView.ScaleType A04;
    public CharSequence A05;
    public boolean A06;
    public final TextView A07;
    public final CheckableImageButton A08;
    public final TextInputLayout A09;

    public void A00() {
        int A032;
        EditText editText = this.A09.A0b;
        if (editText != null) {
            if (this.A08.getVisibility() == 0) {
                A032 = 0;
            } else {
                A032 = AnonymousClass0YH.A03(editText);
            }
            AnonymousClass0YH.A07(this.A07, A032, editText.getCompoundPaddingTop(), C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved), editText.getCompoundPaddingBottom());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3.A06 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            java.lang.CharSequence r0 = r3.A05
            r2 = 8
            if (r0 == 0) goto L_0x000b
            boolean r0 = r3.A06
            r1 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            r1 = 8
        L_0x000d:
            com.google.android.material.internal.CheckableImageButton r0 = r3.A08
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0017
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r3.setVisibility(r2)
            android.widget.TextView r0 = r3.A07
            r0.setVisibility(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.A09
            r0.A0I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Fe.A01():void");
    }

    public CharSequence getPrefixText() {
        return this.A05;
    }

    public ColorStateList getPrefixTextColor() {
        return this.A07.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.A07;
    }

    public CharSequence getStartIconContentDescription() {
        return this.A08.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.A08.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.A00;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.A04;
    }

    public void setPrefixTextAppearance(int i) {
        AnonymousClass0Y9.A06(this.A07, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.A07.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.A08.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A08;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A08;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            TextInputLayout textInputLayout = this.A09;
            C106745a6.A01(this.A01, this.A02, checkableImageButton, textInputLayout);
            setStartIconVisible(true);
            C106745a6.A02(this.A01, checkableImageButton, textInputLayout);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconMinSize(int i) {
        if (i < 0) {
            throw AnonymousClass001.A0c("startIconSize cannot be less than 0");
        } else if (i != this.A00) {
            this.A00 = i;
            CheckableImageButton checkableImageButton = this.A08;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.A08;
        View.OnLongClickListener onLongClickListener = this.A03;
        checkableImageButton.setOnClickListener(onClickListener);
        C106745a6.A03(onLongClickListener, checkableImageButton);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A03 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.A08;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C106745a6.A03(onLongClickListener, checkableImageButton);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.A04 = scaleType;
        this.A08.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.A01 != colorStateList) {
            this.A01 = colorStateList;
            TextInputLayout textInputLayout = this.A09;
            C106745a6.A01(colorStateList, this.A02, this.A08, textInputLayout);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.A02 != mode) {
            this.A02 = mode;
            TextInputLayout textInputLayout = this.A09;
            C106745a6.A01(this.A01, mode, this.A08, textInputLayout);
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.A08;
        if (AnonymousClass000.A1T(checkableImageButton.getVisibility()) != z) {
            checkableImageButton.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
            A00();
            A01();
        }
    }

    public void setupAccessibilityNodeInfo(C05650Ui r3) {
        TextView textView = this.A07;
        if (textView.getVisibility() == 0) {
            r3.A01.setLabelFor(textView);
            r3.A05(textView);
            return;
        }
        r3.A05(this.A08);
    }

    public AnonymousClass6Fe(AnonymousClass0UD r9, TextInputLayout textInputLayout) {
        super(textInputLayout.getContext());
        this.A09 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, false);
        this.A08 = checkableImageButton;
        C106745a6.A04(checkableImageButton);
        AnonymousClass03n r2 = new AnonymousClass03n(getContext(), (AttributeSet) null);
        this.A07 = r2;
        if (AnonymousClass001.A1U((AnonymousClass001.A0M(getContext()).fontScale > 1.3f ? 1 : (AnonymousClass001.A0M(getContext()).fontScale == 1.3f ? 0 : -1)))) {
            C06060Wb.A03(AnonymousClass001.A0T(this.A08), 0);
        }
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        TypedArray typedArray = r9.A02;
        if (typedArray.hasValue(67)) {
            this.A01 = C160917of.A01(getContext(), r9, 67);
        }
        if (typedArray.hasValue(68)) {
            this.A02 = C159337lf.A01((PorterDuff.Mode) null, typedArray.getInt(68, -1));
        }
        if (typedArray.hasValue(64)) {
            setStartIconDrawable(r9.A02(64));
            if (typedArray.hasValue(63)) {
                setStartIconContentDescription(typedArray.getText(63));
            }
            setStartIconCheckable(typedArray.getBoolean(62, true));
        }
        setStartIconMinSize(typedArray.getDimensionPixelSize(65, getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
        if (typedArray.hasValue(66)) {
            setStartIconScaleType(C106745a6.A00(typedArray.getInt(66, -1)));
        }
        TextView textView = this.A07;
        textView.setVisibility(8);
        textView.setId(R.id.textinput_prefix_text);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C06360Xi.A01(textView, 1);
        setPrefixTextAppearance(typedArray.getResourceId(58, 0));
        if (typedArray.hasValue(59)) {
            setPrefixTextColor(r9.A01(59));
        }
        setPrefixText(typedArray.getText(57));
        addView(checkableImageButton);
        addView(r2);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        A00();
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        this.A05 = charSequence2;
        this.A07.setText(charSequence);
        A01();
    }
}
