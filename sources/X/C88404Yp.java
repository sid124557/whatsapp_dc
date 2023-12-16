package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4Yp  reason: invalid class name and case insensitive filesystem */
public class C88404Yp extends C05570Ua {
    public final View A00;
    public final C56972sr A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final C64773Ex A06;
    public final C105365Uq A07;
    public final C56612sH A08;
    public final C620733j A09;

    public C88404Yp(View view, C56972sr r3, C64773Ex r4, C105365Uq r5, C56612sH r6, C620733j r7) {
        super(view);
        this.A08 = r6;
        this.A01 = r3;
        this.A06 = r4;
        this.A09 = r7;
        this.A07 = r5;
        this.A00 = C06560Yg.A02(view, R.id.poll_results_user_main_layout);
        this.A02 = AnonymousClass0x9.A0L(view, R.id.poll_results_user_picture);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.poll_results_primary_name);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.poll_results_secondary_name);
        this.A05 = AnonymousClass0x7.A0L(view, R.id.poll_results_timestamp);
    }
}
