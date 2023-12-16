package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;

/* renamed from: X.03O  reason: invalid class name */
public class AnonymousClass03O extends FrameLayout implements C17030uR {
    public final Switch A00;

    public void Bne(ColorStateList colorStateList, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            Switch switchR = this.A00;
            switchR.setTrackTintList(colorStateList);
            switchR.setTrackTintMode(PorterDuff.Mode.SRC_OVER);
            return;
        }
        Switch switchR2 = this.A00;
        Drawable trackDrawable = switchR2.getTrackDrawable();
        if (trackDrawable != null) {
            Drawable mutate = C06130Wj.A01(trackDrawable).mutate();
            AnonymousClass0YG.A01(colorStateList, mutate);
            AnonymousClass000.A0t(mutate, switchR2);
            switchR2.setTrackDrawable(mutate);
        }
    }

    public void setChecked(boolean z) {
        this.A00.setChecked(z);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setTag(int i, Object obj) {
        this.A00.setTag(i, obj);
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        Switch switchR = this.A00;
        if (i >= 23) {
            switchR.setThumbTintList(colorStateList);
            return;
        }
        Drawable thumbDrawable = switchR.getThumbDrawable();
        if (thumbDrawable != null) {
            Drawable mutate = C06130Wj.A01(thumbDrawable).mutate();
            AnonymousClass0YG.A01(colorStateList, mutate);
            AnonymousClass000.A0t(mutate, switchR);
            switchR.setThumbDrawable(mutate);
        }
    }

    public AnonymousClass03O(Context context) {
        super(context);
        Switch switchR = new Switch(context);
        this.A00 = switchR;
        addView(switchR, -2, -2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A00.setEnabled(z);
    }

    public void setTag(Object obj) {
        this.A00.setTag(obj);
    }
}
