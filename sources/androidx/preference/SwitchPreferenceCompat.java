package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0KB;
import X.C011409i;
import X.C07370al;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C07370al A02 = new C07370al(this);

    public final void A0W(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.A01);
            switchCompat.setTextOff(this.A00);
            switchCompat.setOnCheckedChangeListener(this.A02);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f3nameremoved, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KB.A0C, R.attr.f3nameremoved, 0);
        this.A01 = AnonymousClass000.A0M(obtainStyledAttributes, 7, 0);
        if (this.A02) {
            A06();
        }
        this.A00 = AnonymousClass000.A0M(obtainStyledAttributes, 6, 1);
        if (!this.A02) {
            A06();
        }
        this.A01 = AnonymousClass000.A0M(obtainStyledAttributes, 9, 3);
        A06();
        this.A00 = AnonymousClass000.A0M(obtainStyledAttributes, 8, 4);
        A06();
        AnonymousClass001.A0z(obtainStyledAttributes, this, 5);
    }

    public void A0H(View view) {
        super.A0H(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0W(view.findViewById(R.id.switchWidget));
            A0U(view.findViewById(16908304));
        }
    }

    public void A0T(C011409i r2) {
        super.A0T(r2);
        A0W(r2.A07(R.id.switchWidget));
        A0U(r2.A07(16908304));
    }
}
