package X;

import android.widget.TextView;
import com.whatsapp.calling.callrating.CallRatingActivity;

/* renamed from: X.8E2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8E2 implements C181638n5 {
    public final /* synthetic */ CallRatingActivity A00;

    public final void BZN(int i, boolean z) {
        TextView textView;
        int i2;
        CallRatingActivity callRatingActivity = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("callratingactivity/setOnRatingBarChangeListener rating = ");
        A0o.append(i);
        C18260x0.A1E(", fromUser = ", A0o, z);
        if (z) {
            if (i > 0) {
                int[] iArr = CallRatingActivity.A0L;
                if (i <= iArr.length) {
                    callRatingActivity.A04.setText(iArr[i - 1]);
                    textView = callRatingActivity.A04;
                    i2 = 0;
                    textView.setVisibility(i2);
                    callRatingActivity.A6D();
                }
            }
            textView = callRatingActivity.A04;
            i2 = 4;
            textView.setVisibility(i2);
            callRatingActivity.A6D();
        }
    }

    public /* synthetic */ AnonymousClass8E2(CallRatingActivity callRatingActivity) {
        this.A00 = callRatingActivity;
    }
}
