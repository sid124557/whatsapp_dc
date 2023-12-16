package com.google.android.material.theme;

import X.AnonymousClass031;
import X.AnonymousClass035;
import X.AnonymousClass03n;
import X.AnonymousClass0Y6;
import X.AnonymousClass4SN;
import X.AnonymousClass4Sc;
import X.AnonymousClass4Sf;
import X.C125156Fx;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.button.MaterialButton;

public class MaterialComponentsViewInflater extends AnonymousClass0Y6 {
    public AnonymousClass031 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C125156Fx(context, attributeSet);
    }

    public AnonymousClass035 createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AnonymousClass4SN(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AnonymousClass4Sc(context, attributeSet);
    }

    public AnonymousClass03n createTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass4Sf(context, attributeSet);
    }
}
