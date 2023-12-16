package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0KB;
import X.C05790Uy;
import X.C08310eF;
import X.C15160qs;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;

public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public void A09() {
        String str;
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        C15160qs r6 = this.A0F.A04;
        if (r6 != null) {
            C08310eF r62 = (C08310eF) r6;
            if (r62.A0U().A0D("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    str = this.A0L;
                    multiSelectListPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
                } else if (this instanceof ListPreference) {
                    str = this.A0L;
                    multiSelectListPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
                } else if (this instanceof MultiSelectListPreference) {
                    str = this.A0L;
                    multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Cannot display dialog for an unknown Preference type: ");
                    AnonymousClass000.A1A(this, A0o);
                    throw AnonymousClass000.A0F(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.", A0o);
                }
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                multiSelectListPreferenceDialogFragmentCompat.A0u(bundle);
                multiSelectListPreferenceDialogFragmentCompat.A10(r62, 0);
                multiSelectListPreferenceDialogFragmentCompat.A1O(r62.A0U(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KB.A02, i, i2);
        String A0M = AnonymousClass000.A0M(obtainStyledAttributes, 9, 0);
        this.A03 = A0M;
        if (A0M == null) {
            this.A03 = this.A0H;
        }
        this.A02 = AnonymousClass000.A0M(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.A05 = AnonymousClass000.A0M(obtainStyledAttributes, 11, 3);
        this.A04 = AnonymousClass000.A0M(obtainStyledAttributes, 10, 4);
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C05790Uy.A00(context, R.attr.f3nameremoved, 16842897));
    }
}
