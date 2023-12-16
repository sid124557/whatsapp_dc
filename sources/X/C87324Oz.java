package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.4Oz  reason: invalid class name and case insensitive filesystem */
public class C87324Oz extends FrameLayout {
    public AnonymousClass25D A00;
    public AnonymousClass1VX A01;
    public final C97744zA A02;

    public C87324Oz(Context context, AnonymousClass25D r6) {
        super(context);
        this.A00 = r6;
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        View A022 = C06560Yg.A02(this, R.id.search_directory_container);
        ViewGroup A0I = C86644Kx.A0I(this, R.id.chips_container);
        C18300x5.A0G(this, R.id.title).setText(R.string.f11nameremoved);
        C97744zA r0 = new C97744zA(context);
        this.A02 = r0;
        A0I.addView(r0);
        C86604Kt.A0z(getContext(), A022, R.color.f5nameremoved);
    }
}
