package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;

/* renamed from: X.4YK  reason: invalid class name */
public final class AnonymousClass4YK extends C05570Ua {
    public final AppCompatRadioButton A00;
    public final /* synthetic */ AnonymousClass4WG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YK(View view, AnonymousClass4WG r4) {
        super(view);
        this.A01 = r4;
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) C18280x3.A0E(view, R.id.country_radio_button_item);
        this.A00 = appCompatRadioButton;
        C18310x6.A19(appCompatRadioButton, r4, this, 46);
    }
}
