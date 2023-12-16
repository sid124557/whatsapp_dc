package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0KB;
import X.C010508o;
import X.C05790Uy;
import X.C08450eV;
import X.C15990sI;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.whatsapp.R;

public class ListPreference extends DialogPreference {
    public String A00;
    public String A01;
    public boolean A02;
    public CharSequence[] A03;
    public CharSequence[] A04;

    public Parcelable A03() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        C010508o r1 = new C010508o((Parcelable) absSavedState);
        r1.A00 = this.A01;
        return r1;
    }

    public CharSequence A04() {
        C15990sI r0 = this.A0D;
        if (r0 != null) {
            return r0.Bhg(this);
        }
        Object A0V = A0V();
        CharSequence A042 = super.A04();
        String str = this.A00;
        if (str != null) {
            Object[] A0L = AnonymousClass002.A0L();
            if (A0V == null) {
                A0V = "";
            }
            A0L[0] = A0V;
            String format = String.format(str, A0L);
            if (!TextUtils.equals(format, A042)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return A042;
    }

    public void A0G(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C010508o.class)) {
            super.A0G(parcelable);
            return;
        }
        C010508o r3 = (C010508o) parcelable;
        super.A0G(r3.getSuperState());
        A0W(r3.A00);
    }

    public void A0M(Object obj) {
        String str = (String) obj;
        if (A0S()) {
            str = this.A0F.A01().getString(this.A0L, str);
        }
        A0W(str);
    }

    public int A0U(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.A04) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!this.A04[length].equals(str));
        return length;
    }

    public CharSequence A0V() {
        CharSequence[] charSequenceArr;
        int A0U = A0U(this.A01);
        if (A0U < 0 || (charSequenceArr = this.A03) == null) {
            return null;
        }
        return charSequenceArr[A0U];
    }

    public void A0W(String str) {
        boolean z = !TextUtils.equals(this.A01, str);
        if (z || !this.A02) {
            this.A01 = str;
            this.A02 = true;
            A0N(str);
            if (z) {
                A06();
            }
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KB.A04, i, i2);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A03 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A04 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            C08450eV r0 = C08450eV.A00;
            if (r0 == null) {
                r0 = new C08450eV();
                C08450eV.A00 = r0;
            }
            this.A0D = r0;
            A06();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AnonymousClass0KB.A06, i, i2);
        this.A00 = AnonymousClass000.A0M(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public Object A05(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public void A0L(CharSequence charSequence) {
        String charSequence2;
        super.A0L(charSequence);
        String str = this.A00;
        if (charSequence == null) {
            if (str != null) {
                charSequence2 = null;
            } else {
                return;
            }
        } else if (!charSequence.equals(str)) {
            charSequence2 = charSequence.toString();
        } else {
            return;
        }
        this.A00 = charSequence2;
    }

    public void A0X(CharSequence[] charSequenceArr) {
        this.A03 = charSequenceArr;
    }

    public ListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C05790Uy.A00(context, R.attr.f3nameremoved, 16842897));
    }
}
