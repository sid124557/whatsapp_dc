package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.4Oy  reason: invalid class name and case insensitive filesystem */
public final class C87314Oy extends FrameLayout {
    public final C97734z9 A00;

    public C87314Oy(Context context) {
        super(context);
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        View A0E = C18280x3.A0E(this, R.id.parent_container);
        C97734z9 r0 = new C97734z9(context);
        this.A00 = r0;
        ((ViewGroup) C18280x3.A0E(this, R.id.chips_container)).addView(r0);
        C86604Kt.A0z(getContext(), A0E, R.color.f5nameremoved);
    }
}
