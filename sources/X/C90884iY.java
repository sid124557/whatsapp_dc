package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4iY  reason: invalid class name and case insensitive filesystem */
public final class C90884iY extends C134576jG {
    public final FrameLayout A00;

    public /* bridge */ /* synthetic */ void A0D(Object obj, List list) {
        C97814zI r5 = (C97814zI) obj;
        C162457s7.A0J(r5, 0);
        Context A0T = C86664Kz.A0T(this);
        FrameLayout frameLayout = this.A00;
        frameLayout.removeAllViews();
        C162457s7.A0H(A0T);
        Chip A002 = AnonymousClass5AB.A00(A0T, r5.A00);
        C86624Kv.A0v(A002, -2);
        A002.setOnClickListener(new C109705f3((Object) A002, 38, (Object) r5));
        frameLayout.addView(A002);
    }

    public C90884iY(View view) {
        super(view);
        this.A00 = (FrameLayout) C18280x3.A0E(view, R.id.chips_container);
    }
}
