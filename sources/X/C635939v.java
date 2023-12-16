package X;

import android.view.View;
import java.util.List;

/* renamed from: X.39v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C635939v implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass121 A01;

    public final boolean onLongClick(View view) {
        AnonymousClass121 r3 = this.A01;
        int i = this.A00;
        List A002 = AnonymousClass121.A00(r3);
        if (i < 0 || i >= A002.size() || !((C53082mW) A002.get(i)).A01 || r3.A04.A05.isEmpty()) {
            return false;
        }
        return r3.A0P(i);
    }

    public /* synthetic */ C635939v(AnonymousClass121 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
