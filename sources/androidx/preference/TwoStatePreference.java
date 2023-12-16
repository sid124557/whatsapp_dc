package androidx.preference;

import X.AnonymousClass001;
import X.AnonymousClass08r;
import X.C15970sG;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;

public abstract class TwoStatePreference extends Preference {
    public CharSequence A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public Parcelable A03() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        AnonymousClass08r r1 = new AnonymousClass08r((Parcelable) absSavedState);
        r1.A00 = this.A02;
        return r1;
    }

    public Object A05(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public void A09() {
        boolean z = !this.A02;
        Boolean valueOf = Boolean.valueOf(z);
        C15970sG r0 = this.A0A;
        if (r0 != null) {
            r0.BYd(this, valueOf);
        }
        A0V(z);
    }

    public void A0G(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(AnonymousClass08r.class)) {
            super.A0G(parcelable);
            return;
        }
        AnonymousClass08r r3 = (AnonymousClass08r) parcelable;
        super.A0G(r3.getSuperState());
        A0V(r3.A00);
    }

    public void A0M(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean A1Z = AnonymousClass001.A1Z(obj);
        if (A0S()) {
            A1Z = this.A0F.A01().getBoolean(this.A0L, A1Z);
        }
        A0V(A1Z);
    }

    public boolean A0R() {
        boolean z = this.A04;
        boolean z2 = this.A02;
        if (z) {
            if (z2) {
                return true;
            }
        } else if (!z2) {
            return true;
        }
        if (!(!A0Q())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0021
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.CharSequence r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.CharSequence r0 = r3.A01
        L_0x0015:
            r4.setText(r0)
        L_0x0018:
            int r0 = r4.getVisibility()
            if (r2 == r0) goto L_0x0021
            r4.setVisibility(r2)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r0 = r3.A00
            goto L_0x0015
        L_0x0031:
            java.lang.CharSequence r1 = r3.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003f
            r4.setText(r1)
            goto L_0x0018
        L_0x003f:
            r2 = 8
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.A0U(android.view.View):void");
    }

    public void A0V(boolean z) {
        boolean z2 = true;
        if (this.A02 == z) {
            z2 = false;
            if (this.A03) {
                return;
            }
        }
        this.A02 = z;
        this.A03 = true;
        if (A0S()) {
            boolean z3 = !z;
            if (A0S()) {
                z3 = this.A0F.A01().getBoolean(this.A0L, z3);
            }
            if (z != z3) {
                SharedPreferences.Editor A002 = this.A0F.A00();
                A002.putBoolean(this.A0L, z);
                if (!this.A0F.A09) {
                    A002.apply();
                }
            }
        }
        if (z2) {
            AnonymousClass001.A1C(this);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TwoStatePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
