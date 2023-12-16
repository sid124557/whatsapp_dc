package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5V0  reason: invalid class name */
public final class AnonymousClass5V0 {
    public static final C19340zH A00(Context context) {
        AnonymousClass0Uj r1;
        C162457s7.A0J(context, 0);
        if (C106545Zk.A04(((C64333Db) AnonymousClass29x.A00(C64333Db.class, context.getApplicationContext())).Avy(), (C58422vE) null, 4240)) {
            r1 = new C88634aS(context, R.style.f12nameremoved);
        } else {
            r1 = new AnonymousClass0Uj(context);
        }
        return new C19340zH(r1);
    }

    public static final C19340zH A01(Context context, int i) {
        AnonymousClass0Uj r1;
        if (C106545Zk.A04(((C64333Db) AnonymousClass29x.A00(C64333Db.class, context.getApplicationContext())).Avy(), (C58422vE) null, 4240)) {
            r1 = new C88634aS(context, i);
        } else {
            r1 = new AnonymousClass0Uj(context, i);
        }
        return new C19340zH(r1);
    }

    public static C19340zH A02(Context context, View view) {
        C19340zH A00 = A00(context);
        A00.A0a(view);
        return A00;
    }
}
