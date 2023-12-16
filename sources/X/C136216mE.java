package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.6mE  reason: invalid class name and case insensitive filesystem */
public abstract class C136216mE extends AnonymousClass6mM {
    public WaImageButton A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;

    public void A07() {
        this.A01.setImageDrawable((Drawable) null);
        this.A03.setText("");
        WaTextView waTextView = this.A02;
        waTextView.setText("");
        waTextView.setVisibility(8);
        WaImageButton waImageButton = this.A00;
        waImageButton.setImageDrawable((Drawable) null);
        waImageButton.setVisibility(8);
        waImageButton.setOnClickListener((View.OnClickListener) null);
    }

    public void A0A(C135956lc r4) {
        this.A0H.setOnClickListener(new AnonymousClass543(r4, 15, this));
        this.A00.setOnClickListener(new AnonymousClass543(r4, 16, this));
    }

    public C136216mE(View view) {
        super(view);
        this.A01 = (WaImageView) C06560Yg.A02(view, R.id.icon);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.title);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.subtitle);
        this.A00 = (WaImageButton) C06560Yg.A02(view, R.id.action_button);
    }
}
