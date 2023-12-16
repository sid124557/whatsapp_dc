package com.google.android.material.timepicker;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0YH;
import X.AnonymousClass6Z1;
import X.C172668Mf;
import X.C18290x4;
import X.C86634Kw;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.Locale;

public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextWatcher A00;
    public TextView A01;
    public final EditText A02;
    public final Chip A03;
    public final TextInputLayout A04;

    public boolean isChecked() {
        return this.A03.isChecked();
    }

    public void setChecked(boolean z) {
        Chip chip = this.A03;
        chip.setChecked(z);
        EditText editText = this.A02;
        int i = 0;
        editText.setVisibility(C86634Kw.A01(z ? 1 : 0));
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new C172668Mf(editText, 34));
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.A03.setTag(i, obj);
    }

    public void toggle() {
        this.A03.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.f8nameremoved, this, false);
        this.A03 = chip;
        chip.A08 = "android.view.View";
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.f8nameremoved, this, false);
        this.A04 = textInputLayout;
        EditText editText = textInputLayout.A0b;
        this.A02 = editText;
        editText.setVisibility(4);
        AnonymousClass6Z1 r0 = new AnonymousClass6Z1(this);
        this.A00 = r0;
        editText.addTextChangedListener(r0);
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImeHintLocales(C18290x4.A0G(this).getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        this.A01 = AnonymousClass002.A09(this, R.id.material_label);
        editText.setId(AnonymousClass0YH.A00());
        AnonymousClass0YH.A05(this.A01, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static /* synthetic */ String A00(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            Locale locale = chipTextInputComboView.getResources().getConfiguration().locale;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L, Integer.parseInt(String.valueOf(charSequence)));
            return String.format(locale, "%02d", A0L);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImeHintLocales(C18290x4.A0G(this).getConfiguration().getLocales());
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context) {
        this(context, (AttributeSet) null);
    }
}
