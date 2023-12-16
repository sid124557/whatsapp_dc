package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.4iX  reason: invalid class name and case insensitive filesystem */
public final class C90874iX extends C134576jG {
    public final WaTextView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90874iX(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A00 = C86604Kt.A0O(view, R.id.title);
    }

    public /* bridge */ /* synthetic */ void A0D(Object obj, List list) {
        C156137g5 r3 = (C156137g5) obj;
        C162457s7.A0J(r3, 0);
        WaTextView waTextView = this.A00;
        Object obj2 = r3.A01;
        C162457s7.A0D(obj2);
        waTextView.setText(AnonymousClass001.A0K(obj2));
    }
}
