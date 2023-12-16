package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0KB;
import X.C011409i;
import X.C05790Uy;
import X.C07350aj;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.whatsapp.R;

public class CheckBoxPreference extends TwoStatePreference {
    public final C07350aj A00;

    public final void A0W(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.A00);
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = new C07350aj(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KB.A01, i, i2);
        this.A01 = AnonymousClass000.A0M(obtainStyledAttributes, 5, 0);
        if (this.A02) {
            A06();
        }
        this.A00 = AnonymousClass000.A0M(obtainStyledAttributes, 4, 1);
        if (!this.A02) {
            A06();
        }
        AnonymousClass001.A0z(obtainStyledAttributes, this, 3);
    }

    public void A0H(View view) {
        super.A0H(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0W(view.findViewById(16908289));
            A0U(view.findViewById(16908304));
        }
    }

    public void A0T(C011409i r2) {
        super.A0T(r2);
        A0W(r2.A07(16908289));
        A0U(r2.A07(16908304));
    }

    public CheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C05790Uy.A00(context, R.attr.f3nameremoved, 16842895));
    }
}
