package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6Iq  reason: invalid class name and case insensitive filesystem */
public class C125596Iq extends C05570Ua {
    public final WaTextView A00;
    public final WaTextView A01;
    public final C620633i A02;
    public final AnonymousClass5Y0 A03;
    public final C60152y5 A04;

    public C125596Iq(View view, C620633i r3, AnonymousClass5Y0 r4, C60152y5 r5) {
        super(view);
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = AnonymousClass0x7.A0L(view, R.id.poll_results_question_text_view);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.poll_voters_count_text_view);
    }
}
