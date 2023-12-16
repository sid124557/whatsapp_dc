package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.0z0  reason: invalid class name and case insensitive filesystem */
public final class C19220z0 extends LinearLayout {
    public final WaTextView A00;

    public C19220z0(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.f8nameremoved, this);
        C18310x6.A15(this);
        WaTextView waTextView = (WaTextView) C18280x3.A0E(this, R.id.event_response_header_text);
        this.A00 = waTextView;
        C106905aM.A04(waTextView);
    }
}
