package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.text.SeeMoreTextView;

/* renamed from: X.6E9  reason: invalid class name */
public class AnonymousClass6E9 extends ClickableSpan {
    public final /* synthetic */ SeeMoreTextView A00;

    public AnonymousClass6E9(SeeMoreTextView seeMoreTextView) {
        this.A00 = seeMoreTextView;
    }

    public void onClick(View view) {
        SeeMoreTextView seeMoreTextView = this.A00;
        if (!seeMoreTextView.A03) {
            seeMoreTextView.A03 = true;
            seeMoreTextView.setText(seeMoreTextView.A01);
        }
    }
}
