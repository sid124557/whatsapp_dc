package X;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6Ql  reason: invalid class name and case insensitive filesystem */
public final class C127056Ql extends AnonymousClass89B implements C178358hP {
    public static final AnonymousClass6QU A01;
    public static final AnonymousClass72H A02;
    public static final C148727Jm A03;
    public static final C151737Wc A04 = new C151737Wc("Auth", "GoogleAuthServiceClient");
    public final Context A00;

    static {
        AnonymousClass72H r3 = new AnonymousClass72H();
        A02 = r3;
        AnonymousClass6QL r2 = new AnonymousClass6QL();
        A01 = r2;
        A03 = new C148727Jm(r2, r3, "GoogleAuthService.API");
    }

    public C127056Ql(Context context) {
        super(context, C186678vl.A00, A03, C156227gG.A02);
        this.A00 = context;
    }

    public static /* bridge */ /* synthetic */ void A00(Status status, C152017Xf r2, Object obj) {
        boolean A012;
        if (status.A01 <= 0) {
            A012 = r2.A02(obj);
        } else {
            A012 = r2.A01(AnonymousClass72J.A00(status));
        }
        if (!A012) {
            A04.A01("The task is already complete.", AnonymousClass4L0.A0U());
        }
    }
}
