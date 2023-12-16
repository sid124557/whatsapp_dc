package androidx.preference;

import X.C010408n;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;

public class EditTextPreference extends DialogPreference {
    public String A00;

    public Parcelable A03() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        C010408n r1 = new C010408n((Parcelable) absSavedState);
        r1.A00 = this.A00;
        return r1;
    }

    public void A0G(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C010408n.class)) {
            super.A0G(parcelable);
            return;
        }
        C010408n r3 = (C010408n) parcelable;
        super.A0G(r3.getSuperState());
        A0U(r3.A00);
    }

    public void A0M(Object obj) {
        String str = (String) obj;
        if (A0S()) {
            str = this.A0F.A01().getString(this.A0L, str);
        }
        A0U(str);
    }

    public boolean A0R() {
        if (TextUtils.isEmpty(this.A00) || (!A0Q())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130969242(0x7f04029a, float:1.754716E38)
            r0 = 16842898(0x1010092, float:2.3693967E-38)
            int r1 = X.C05790Uy.A00(r4, r1, r0)
            r2 = 0
            r3.<init>(r4, r5, r1, r2)
            int[] r0 = X.AnonymousClass0KB.A03
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            boolean r0 = r1.getBoolean(r2, r2)
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x002e
            X.0eU r0 = X.C08440eU.A00
            if (r0 != 0) goto L_0x0029
            X.0eU r0 = new X.0eU
            r0.<init>()
            X.C08440eU.A00 = r0
        L_0x0029:
            r3.A0D = r0
            r3.A06()
        L_0x002e:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public Object A05(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public void A0U(String str) {
        boolean A0R = A0R();
        this.A00 = str;
        A0N(str);
        boolean A0R2 = A0R();
        if (A0R2 != A0R) {
            A0O(A0R2);
        }
        A06();
    }
}
