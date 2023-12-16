package com.whatsapp.mediacomposer.bottombar.caption;

import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass487;
import X.AnonymousClass4GJ;
import X.AnonymousClass54E;
import X.C02680He;
import X.C06560Yg;
import X.C100905Cs;
import X.C109095e4;
import X.C111685iW;
import X.C116855qy;
import X.C18290x4;
import X.C185458ti;
import X.C58422vE;
import X.C620733j;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import X.C95804uY;
import X.C95814uZ;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

public class CaptionView extends LinearLayout implements AnonymousClass4GJ {
    public C620733j A00;
    public AnonymousClass487 A01;
    public AnonymousClass1VX A02;
    public C116855qy A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final ImageButton A0A;
    public final LinearLayout A0B;
    public final WaImageButton A0C;
    public final WaImageView A0D;
    public final MentionableEntry A0E;
    public final boolean A0F;

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public Paint getCaptionPaint() {
        return this.A0E.getPaint();
    }

    public String getCaptionStringText() {
        return this.A0E.getStringText();
    }

    public CharSequence getCaptionText() {
        MentionableEntry mentionableEntry = this.A0E;
        if (C86634Kw.A1X(mentionableEntry)) {
            return "";
        }
        return mentionableEntry.getText();
    }

    @Deprecated
    public WaEditText getCaptionTextView() {
        return this.A0E;
    }

    public int getCurrentTextColor() {
        return this.A0E.getCurrentTextColor();
    }

    @Deprecated
    public ImageButton getEmojiPickerButton() {
        return this.A0A;
    }

    public List getMentions() {
        return this.A0E.getMentions();
    }

    public void setAddButtonActivated(boolean z) {
        this.A0C.setActivated(z);
    }

    public void setAddButtonClickable(boolean z) {
        this.A0C.setClickable(z);
    }

    public void setAddButtonEnabled(boolean z) {
        this.A0C.setEnabled(z);
    }

    public void setCaptionButtonsListener(C185458ti r3) {
        AnonymousClass54E.A00(this.A0C, r3, this, 15);
        C18290x4.A1F(this.A0D, r3, 27);
    }

    public void setCaptionEditTextView(CharSequence charSequence) {
        MentionableEntry mentionableEntry = this.A0E;
        mentionableEntry.setText(charSequence);
        mentionableEntry.setSelection(charSequence.length(), charSequence.length());
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C109095e4(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
    }

    public void setCaptionText(CharSequence charSequence) {
        this.A0E.setText(charSequence);
    }

    public void setNewLineEnabledForNewsletter(C95814uZ r3) {
        if (r3 instanceof C95804uY) {
            this.A0E.setInputEnterAction(0);
        }
    }

    public void setViewOnceButtonClickable(boolean z) {
        this.A0D.setClickable(z);
    }

    public void setupMentions(C95814uZ r8, ViewGroup viewGroup, View view) {
        MentionableEntry mentionableEntry = this.A0E;
        C95814uZ r3 = r8;
        if (mentionableEntry.A0K(r8)) {
            mentionableEntry.A04 = view;
            mentionableEntry.A0H(viewGroup, r3, true, false, false);
        }
    }

    public CaptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4m(this);
        }
    }

    public int getCaptionTop() {
        int[] A1Z = C86664Kz.A1Z();
        this.A0E.getLocationInWindow(A1Z);
        return A1Z[1];
    }

    public void setHandleEnterKeyPress(boolean z) {
        this.A04 = z;
    }

    public CaptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4m(this);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A03);
        boolean z = false;
        View.inflate(getContext(), obtainStyledAttributes.getBoolean(0, false) ? R.layout.f8nameremoved : R.layout.f8nameremoved, this);
        this.A06 = context;
        this.A0E = (MentionableEntry) C06560Yg.A02(this, R.id.caption);
        this.A0B = C86654Ky.A0N(this, R.id.left_button_holder);
        this.A0A = C86664Kz.A0t(this, R.id.emoji_picker_btn);
        this.A08 = C06560Yg.A02(this, R.id.left_button_spacer);
        this.A0C = C86664Kz.A10(this, R.id.add_button);
        this.A07 = C06560Yg.A02(this, R.id.left_button_spacer);
        WaImageView A0L = AnonymousClass0x9.A0L(this, R.id.view_once_toggle);
        this.A0D = A0L;
        this.A09 = C06560Yg.A02(this, R.id.view_once_toggle_spacer);
        AnonymousClass1VX r1 = this.A02;
        C58422vE r2 = C58422vE.A01;
        if (r1.A0Y(r2, 4093) && this.A02.A0Y(r2, 6004)) {
            z = true;
        }
        this.A0F = z;
        if (this.A02.A0X(2832)) {
            A0L.setImageDrawable(C02680He.A00((Resources.Theme) null, getResources(), R.drawable.view_once_selector_v2));
        }
        obtainStyledAttributes.recycle();
    }
}
