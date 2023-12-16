package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.0z1  reason: invalid class name and case insensitive filesystem */
public final class C19230z1 extends LinearLayout {
    public TextView A00;
    public TextView A01;
    public WaImageView A02;

    public C19230z1(Context context) {
        super(context, (AttributeSet) null);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A02 = (WaImageView) C18290x4.A0M(inflate, R.id.disclosure_bullet_icon);
        this.A00 = C18280x3.A0F(inflate, R.id.disclosure_bullet_text);
        this.A01 = C18280x3.A0F(inflate, R.id.disclosure_bullet_text_secondary);
        C107295b4.A06(this.A00, true);
    }

    public final void setIconDrawableRes(Drawable drawable) {
        WaImageView waImageView = this.A02;
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        waImageView.setVisibility(i);
        if (drawable != null) {
            waImageView.setImageDrawable(drawable);
        }
    }

    public final void setSecondaryText(String str) {
        setText(str, this.A01);
    }

    public final void setSecondaryTextSize(float f) {
        this.A01.setTextSize(f);
    }

    public final void setText(String str) {
        setText(str, this.A00);
    }

    public final void setText(String str, TextView textView) {
        int i = 0;
        if (str == null) {
            i = 8;
        }
        textView.setVisibility(i);
        if (str != null) {
            textView.setText(str);
        }
    }
}
