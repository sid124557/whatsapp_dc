package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;

/* renamed from: X.2Tl  reason: invalid class name and case insensitive filesystem */
public final class C43782Tl {
    public final LayoutInflater A00;
    public final View A01;
    public final ViewGroup A02;
    public final Button A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final SwitchCompat A06;
    public final C620733j A07;
    public final AnonymousClass4GP A08;
    public final AnonymousClass4GP A09;

    public C43782Tl(LayoutInflater layoutInflater, ViewGroup viewGroup, C620733j r7, AnonymousClass4GP r8, AnonymousClass4GP r9) {
        C162457s7.A0J(layoutInflater, 1);
        C162457s7.A0J(r7, 6);
        this.A00 = layoutInflater;
        this.A02 = viewGroup;
        this.A09 = r8;
        this.A08 = r9;
        this.A07 = r7;
        View A0I = C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
        this.A01 = A0I;
        LinearLayout linearLayout = (LinearLayout) C18290x4.A0M(A0I, R.id.layout_archived_settings);
        this.A04 = linearLayout;
        this.A05 = C18280x3.A0F(A0I, R.id.body);
        this.A06 = (SwitchCompat) C18290x4.A0M(A0I, R.id.switch_button);
        Button button = (Button) C18290x4.A0M(A0I, R.id.button_done);
        this.A03 = button;
        C18280x3.A0o(linearLayout, this, 0);
        C18280x3.A0o(button, this, 1);
    }
}
