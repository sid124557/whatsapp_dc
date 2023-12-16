package X;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* renamed from: X.1Qg  reason: invalid class name and case insensitive filesystem */
public abstract class C22831Qg extends C18480xU {
    public abstract void A00(Context context, Intent intent);

    public final void onReceive(Context context, Intent intent) {
        Boolean valueOf;
        super.onReceive(context, intent);
        C18270x1.A14(context, intent);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AlarmReceivedObservers Wake up due to alarm: ");
        C18260x0.A1J(A0o, intent.getAction());
        Iterator A03 = C61102zi.A03((C61102zi) C389229y.A01(context).AcK.A00.A0O.get());
        while (A03.hasNext()) {
            AnonymousClass2PT r5 = (AnonymousClass2PT) A03.next();
            Boolean bool = Boolean.FALSE;
            int i = r5.A01.A00.A02;
            if (i == Integer.MIN_VALUE) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(AnonymousClass000.A1S(i));
            }
            if (bool.equals(valueOf)) {
                String action = intent.getAction();
                if (action == null) {
                    r5.A00.A0A("wake-up-action-null", false, AnonymousClass000.A0P(intent, "intent: ", AnonymousClass001.A0o()));
                } else {
                    r5.A03.BkM(new C71323bv(8, action, r5));
                }
            }
        }
        A00(context, intent);
    }
}
