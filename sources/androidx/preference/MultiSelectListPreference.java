package androidx.preference;

import X.AnonymousClass002;
import X.C010608p;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
    public Set A00 = AnonymousClass002.A0K();
    public CharSequence[] A01;
    public CharSequence[] A02;

    public Parcelable A03() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        C010608p r1 = new C010608p((Parcelable) absSavedState);
        r1.A00 = this.A00;
        return r1;
    }

    public void A0G(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C010608p.class)) {
            super.A0G(parcelable);
            return;
        }
        C010608p r3 = (C010608p) parcelable;
        super.A0G(r3.getSuperState());
        A0U(r3.A00);
    }

    public void A0M(Object obj) {
        Set<String> set = (Set) obj;
        if (A0S()) {
            set = this.A0F.A01().getStringSet(this.A0L, set);
        }
        A0U(set);
    }

    public void A0U(Set set) {
        Set set2 = this.A00;
        set2.clear();
        set2.addAll(set);
        if (A0S()) {
            Set<String> set3 = null;
            if (A0S()) {
                set3 = this.A0F.A01().getStringSet(this.A0L, (Set) null);
            }
            if (!set.equals(set3)) {
                SharedPreferences.Editor A002 = this.A0F.A00();
                A002.putStringSet(this.A0L, set);
                if (!this.A0F.A09) {
                    A002.apply();
                }
            }
        }
        A06();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130969196(0x7f04026c, float:1.7547067E38)
            r0 = 16842897(0x1010091, float:2.3693964E-38)
            int r2 = X.C05790Uy.A00(r4, r1, r0)
            r1 = 0
            r3.<init>(r4, r5, r2, r1)
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            r3.A00 = r0
            int[] r0 = X.AnonymousClass0KB.A05
            android.content.res.TypedArray r2 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            r0 = 2
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0025
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0025:
            r3.A01 = r0
            r0 = 3
            r1 = 1
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0033
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0033:
            r3.A02 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public Object A05(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet A0K = AnonymousClass002.A0K();
        for (CharSequence charSequence : textArray) {
            A0K.add(charSequence.toString());
        }
        return A0K;
    }
}
