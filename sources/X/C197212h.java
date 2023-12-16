package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;

/* renamed from: X.12h  reason: invalid class name and case insensitive filesystem */
public final class C197212h extends C05570Ua {
    public AnonymousClass52T A00;
    public C166677z5 A01;
    public final AppCompatRadioButton A02;
    public final WaEditText A03;
    public final WaTextView A04;
    public final C620633i A05;
    public final C620733j A06;
    public final AnonymousClass487 A07;
    public final AnonymousClass5Y0 A08;
    public final C60152y5 A09;

    public C197212h(View view, C620633i r3, C620733j r4, AnonymousClass487 r5, AnonymousClass5Y0 r6, C60152y5 r7) {
        super(view);
        this.A08 = r6;
        this.A05 = r3;
        this.A06 = r4;
        this.A09 = r7;
        this.A07 = r5;
        this.A04 = (WaTextView) C18290x4.A0M(view, R.id.counter);
        this.A03 = (WaEditText) C18290x4.A0M(view, R.id.text);
        this.A02 = (AppCompatRadioButton) C18290x4.A0M(view, R.id.reason);
    }
}
