package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4Yo  reason: invalid class name and case insensitive filesystem */
public class C88394Yo extends C05570Ua {
    public final View A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final C620633i A06;
    public final C620733j A07;
    public final AnonymousClass5Y0 A08;
    public final C60152y5 A09;

    public C88394Yo(View view, C620633i r4, C620733j r5, AnonymousClass5Y0 r6, C60152y5 r7) {
        super(view);
        this.A08 = r6;
        this.A07 = r5;
        this.A06 = r4;
        this.A09 = r7;
        LinearLayout A0N = C86654Ky.A0N(view, R.id.poll_results_option_main_layout);
        this.A02 = A0N;
        this.A05 = AnonymousClass0x7.A0L(view, R.id.poll_results_option);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.poll_results_option_count);
        this.A03 = AnonymousClass0x9.A0L(view, R.id.poll_results_option_count_star);
        this.A01 = C86654Ky.A0N(view, R.id.poll_results_option_count_layout);
        this.A00 = C06560Yg.A02(view, R.id.poll_results_divider);
        C107295b4.A06(A0N, true);
    }
}
