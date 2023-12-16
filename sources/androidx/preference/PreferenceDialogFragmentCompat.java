package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass043;
import X.AnonymousClass0Uj;
import X.C003203q;
import X.C08310eF;
import X.C15960sF;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;

public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public int A00;
    public int A01;
    public BitmapDrawable A02;
    public DialogPreference A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public abstract void A1U(boolean z);

    public DialogPreference A1R() {
        DialogPreference dialogPreference = this.A03;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((C15960sF) A0P(true)).B3I(this.A06.getString("key"));
        this.A03 = dialogPreference2;
        return dialogPreference2;
    }

    public boolean A1V() {
        return false;
    }

    public void A0p(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.A0p(bundle);
        C08310eF A0P = A0P(true);
        if (A0P instanceof C15960sF) {
            C15960sF r2 = (C15960sF) A0P;
            String string = this.A06.getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) r2.B3I(string);
                this.A03 = dialogPreference;
                this.A05 = dialogPreference.A03;
                this.A07 = dialogPreference.A05;
                this.A06 = dialogPreference.A04;
                this.A04 = dialogPreference.A02;
                this.A00 = dialogPreference.A00;
                Drawable drawable = dialogPreference.A01;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(C08310eF.A09(this), createBitmap);
                }
                this.A02 = bitmapDrawable;
                return;
            }
            this.A05 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.A07 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.A06 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.A04 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.A00 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.A02 = new BitmapDrawable(C08310eF.A09(this), bitmap);
                return;
            }
            return;
        }
        throw AnonymousClass001.A0e("Target fragment must implement TargetFragment interface");
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.A05);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.A07);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A06);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.A04);
        bundle.putInt("PreferenceDialogFragment.layout", this.A00);
        BitmapDrawable bitmapDrawable = this.A02;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public Dialog A1J(Bundle bundle) {
        View inflate;
        C003203q A0Q = A0Q();
        this.A01 = -2;
        AnonymousClass0Uj r3 = new AnonymousClass0Uj(A0Q);
        r3.setTitle(this.A05);
        r3.A0O(this.A02);
        r3.A0I(this, this.A07);
        r3.A0G(this, this.A06);
        int i = this.A00;
        if (i == 0 || (inflate = A0I().inflate(i, (ViewGroup) null)) == null) {
            r3.A0Q(this.A04);
        } else {
            A1S(inflate);
            r3.setView(inflate);
        }
        A1T(r3);
        AnonymousClass043 create = r3.create();
        if (A1V()) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    public void A1S(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.A04;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            AnonymousClass001.A18(findViewById, i);
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.A01 = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        A1U(AnonymousClass000.A1U(this.A01, -1));
    }

    public void A1T(AnonymousClass0Uj r1) {
    }
}
