package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.0ys  reason: invalid class name and case insensitive filesystem */
public class C19170ys extends FrameLayout {
    public final ViewGroup.MarginLayoutParams A00;
    public final WaTextView A01;

    public C19170ys(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A00 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        WaTextView A0L = AnonymousClass0x7.A0L(this, R.id.title);
        this.A01 = A0L;
        C106905aM.A04(A0L);
    }
}
