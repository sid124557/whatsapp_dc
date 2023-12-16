package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tasks.Task;
import java.util.Set;

/* renamed from: X.6Qi  reason: invalid class name and case insensitive filesystem */
public final class C127026Qi extends AnonymousClass89B implements C187738xj {
    public static final AnonymousClass6QU A01;
    public static final AnonymousClass72H A02;
    public static final C148727Jm A03;
    public final String A00 = C154847dq.A00();

    static {
        AnonymousClass72H r3 = new AnonymousClass72H();
        A02 = r3;
        AnonymousClass6QK r2 = new AnonymousClass6QK();
        A01 = r2;
        A03 = new C148727Jm(r2, r3, "Auth.Api.Identity.SignIn.API");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C127026Qi(android.app.Activity r8, X.C1693488y r9) {
        /*
            r7 = this;
            X.7Jm r5 = A03
            X.7gG r6 = X.C156227gG.A02
            r1 = r7
            r2 = r8
            r4 = r9
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r0 = X.C154847dq.A00()
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127026Qi.<init>(android.app.Activity, X.88y):void");
    }

    public final Task Axk(AnonymousClass6T3 r6) {
        C153307b1 r1 = new C153307b1();
        AnonymousClass6T2 r0 = r6.A01;
        C162177rO.A02(r0);
        r1.A01 = r0;
        r1.A03(r6.A04);
        r1.A02(r6.A03);
        r1.A01(r6.A02);
        r1.A06 = r6.A06;
        r1.A00 = r6.A00;
        String str = r6.A05;
        if (str != null) {
            r1.A05 = str;
        }
        r1.A05 = this.A00;
        AnonymousClass6T3 A002 = r1.A00();
        C157487iN r3 = new C157487iN((AnonymousClass70D) null);
        r3.A03 = new C127806Tj[]{C1462179d.A00};
        r3.A01 = new AnonymousClass89U(A002, this);
        r3.A02 = false;
        r3.A00 = 1553;
        return A02(r3.A00(), 0);
    }

    public final AnonymousClass6TI BD2(Intent intent) {
        SafeParcelable A002;
        SafeParcelable A003;
        if (intent != null) {
            Parcelable.Creator creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            if (byteArrayExtra == null) {
                A002 = null;
            } else {
                A002 = C162177rO.A00(creator, byteArrayExtra);
            }
            Status status = (Status) A002;
            if (status == null) {
                throw new ApiException(Status.A05);
            } else if (status.A01 <= 0) {
                Parcelable.Creator creator2 = AnonymousClass6TI.CREATOR;
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                if (byteArrayExtra2 == null) {
                    A003 = null;
                } else {
                    A003 = C162177rO.A00(creator2, byteArrayExtra2);
                }
                AnonymousClass6TI r0 = (AnonymousClass6TI) A003;
                if (r0 != null) {
                    return r0;
                }
                throw new ApiException(Status.A07);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.A07);
        }
    }

    public final Task BpJ() {
        C18270x1.A0m(this.A01.getSharedPreferences("com.google.android.gms.signin", 0));
        Set<C159087l6> set = C159087l6.A00;
        synchronized (set) {
        }
        for (C159087l6 r1 : set) {
            if (r1 instanceof C127086Qo) {
                C186128un r0 = ((C127086Qo) r1).A01;
                if (r0 != null) {
                    r0.BtA();
                }
            } else {
                throw C18320x8.A0m();
            }
        }
        C163007t7.A02();
        C157487iN r2 = new C157487iN((AnonymousClass70D) null);
        r2.A03 = new C127806Tj[]{C1462179d.A01};
        r2.A01 = new AnonymousClass89N(this);
        r2.A02 = false;
        r2.A00 = 1554;
        return A02(r2.A00(), 1);
    }

    public C127026Qi(Context context, C1693488y r4) {
        super(context, r4, A03, C156227gG.A02);
    }
}
