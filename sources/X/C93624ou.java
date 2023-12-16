package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.4ou  reason: invalid class name and case insensitive filesystem */
public abstract class C93624ou extends C93794pJ {
    public final C106065Xm A00;

    public boolean A02(C89654ea r3, C624134x r4) {
        C162457s7.A0J(r4, 0);
        return A01(r3, r4, 3, false);
    }

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_undo_keep);
    }

    public int getId() {
        return 20;
    }

    public C93624ou(C621033m r1, C106065Xm r2) {
        super(r1, r2);
        this.A00 = r2;
    }

    public String BDk(AnonymousClass66W r3) {
        return C18290x4.A0l(C86604Kt.A07(r3), R.string.f11nameremoved);
    }
}
