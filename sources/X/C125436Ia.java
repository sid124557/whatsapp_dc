package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.PollResultsViewModel;

/* renamed from: X.6Ia  reason: invalid class name and case insensitive filesystem */
public class C125436Ia extends C05570Ua {
    public long A00;
    public final WaTextView A01;

    public C125436Ia(View view, PollResultsViewModel pollResultsViewModel) {
        super(view);
        WaTextView A0L = AnonymousClass0x7.A0L(view, R.id.poll_results_see_all_text_view);
        this.A01 = A0L;
        A0L.setOnClickListener(new C634339f(this, 1, pollResultsViewModel));
        C107295b4.A02(A0L);
    }
}
