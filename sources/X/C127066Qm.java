package X;

import android.content.Context;
import com.google.android.gms.tasks.Task;

/* renamed from: X.6Qm  reason: invalid class name and case insensitive filesystem */
public final class C127066Qm extends AnonymousClass89B implements C187728xi {
    public static final AnonymousClass6QU A00;
    public static final AnonymousClass72H A01;
    public static final C148727Jm A02;

    public final Task BJv(C127316Rm r5) {
        C157487iN r3 = new C157487iN((AnonymousClass70D) null);
        r3.A03 = new C127806Tj[]{AnonymousClass78T.A00};
        r3.A02 = false;
        r3.A01 = new AnonymousClass89L(r5);
        return A02(r3.A00(), 2);
    }

    static {
        AnonymousClass72H r3 = new AnonymousClass72H();
        A01 = r3;
        AnonymousClass6QI r2 = new AnonymousClass6QI();
        A00 = r2;
        A02 = new C148727Jm(r2, r3, "ClientTelemetry.API");
    }

    public C127066Qm(Context context, AnonymousClass890 r4) {
        super(context, r4, A02, C156227gG.A02);
    }
}
