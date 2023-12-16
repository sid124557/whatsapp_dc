package androidx.preference;

import X.C011409i;
import X.C07360ak;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C07360ak A02 = new C07360ak(this);

    public final void A0W(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.A01);
            switchR.setTextOff(this.A00);
            switchR.setOnCheckedChangeListener(this.A02);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130970762(0x7f04088a, float:1.7550243E38)
            r0 = 16843629(0x101036d, float:2.3696016E-38)
            int r2 = X.C05790Uy.A00(r4, r1, r0)
            r1 = 0
            r3.<init>(r4, r5, r2, r1)
            X.0ak r0 = new X.0ak
            r0.<init>(r3)
            r3.A02 = r0
            int[] r0 = X.AnonymousClass0KB.A0B
            android.content.res.TypedArray r2 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            r0 = 7
            java.lang.String r0 = X.AnonymousClass000.A0M(r2, r0, r1)
            r3.A01 = r0
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0029
            r3.A06()
        L_0x0029:
            r1 = 6
            r0 = 1
            java.lang.String r0 = X.AnonymousClass000.A0M(r2, r1, r0)
            r3.A00 = r0
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0038
            r3.A06()
        L_0x0038:
            r1 = 9
            r0 = 3
            java.lang.String r0 = X.AnonymousClass000.A0M(r2, r1, r0)
            r3.A01 = r0
            r3.A06()
            r1 = 8
            r0 = 4
            java.lang.String r0 = X.AnonymousClass000.A0M(r2, r1, r0)
            r3.A00 = r0
            r3.A06()
            r0 = 5
            X.AnonymousClass001.A0z(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void A0H(View view) {
        super.A0H(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0W(view.findViewById(16908352));
            A0U(view.findViewById(16908304));
        }
    }

    public void A0T(C011409i r2) {
        super.A0T(r2);
        A0W(r2.A07(16908352));
        A0U(r2.A07(16908304));
    }
}
