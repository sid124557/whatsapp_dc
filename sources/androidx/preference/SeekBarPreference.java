package androidx.preference;

import X.AnonymousClass001;
import X.AnonymousClass0KB;
import X.C010808s;
import X.C011409i;
import X.C07410ap;
import X.C18150wp;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.R;

public class SeekBarPreference extends Preference {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnKeyListener A04 = new C18150wp(this, 1);
    public SeekBar.OnSeekBarChangeListener A05 = new C07410ap(this);
    public SeekBar A06;
    public TextView A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public Parcelable A03() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        C010808s r1 = new C010808s((Parcelable) absSavedState);
        r1.A02 = this.A03;
        r1.A01 = this.A01;
        r1.A00 = this.A00;
        return r1;
    }

    public Object A05(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public void A0M(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int A0K = AnonymousClass001.A0K(obj);
        if (A0S()) {
            A0K = this.A0F.A01().getInt(this.A0L, A0K);
        }
        A0U(A0K, true);
    }

    public final void A0U(int i, boolean z) {
        int i2 = this.A01;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.A00;
        if (i > i3) {
            i = i3;
        }
        if (i != this.A03) {
            this.A03 = i;
            TextView textView = this.A07;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (A0S()) {
                int i4 = ~i;
                if (A0S()) {
                    i4 = this.A0F.A01().getInt(this.A0L, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor A002 = this.A0F.A00();
                    A002.putInt(this.A0L, i);
                    if (!this.A0F.A09) {
                        A002.apply();
                    }
                }
            }
            if (z) {
                A06();
            }
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f3nameremoved, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KB.A0A, R.attr.f3nameremoved, 0);
        this.A01 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.A01;
        i = i < i2 ? i2 : i;
        if (i != this.A00) {
            this.A00 = i;
            A06();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.A02) {
            this.A02 = Math.min(this.A00 - this.A01, Math.abs(i3));
            A06();
        }
        this.A08 = obtainStyledAttributes.getBoolean(2, true);
        this.A09 = obtainStyledAttributes.getBoolean(5, false);
        this.A0B = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public void A0G(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C010808s.class)) {
            super.A0G(parcelable);
            return;
        }
        C010808s r3 = (C010808s) parcelable;
        super.A0G(r3.getSuperState());
        this.A03 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        A06();
    }

    public void A0T(C011409i r4) {
        super.A0T(r4);
        r4.A0H.setOnKeyListener(this.A04);
        this.A06 = (SeekBar) r4.A07(R.id.seekbar);
        TextView textView = (TextView) r4.A07(R.id.seekbar_value);
        this.A07 = textView;
        if (this.A09) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.A07 = null;
        }
        SeekBar seekBar = this.A06;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.A05);
        this.A06.setMax(this.A00 - this.A01);
        int i = this.A02;
        SeekBar seekBar2 = this.A06;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.A02 = seekBar2.getKeyProgressIncrement();
        }
        this.A06.setProgress(this.A03 - this.A01);
        int i2 = this.A03;
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.A06.setEnabled(A0Q());
    }
}
