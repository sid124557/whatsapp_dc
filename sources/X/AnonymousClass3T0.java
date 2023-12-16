package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3T0  reason: invalid class name */
public class AnonymousClass3T0 implements AnonymousClass4EZ {
    public final long A00;
    public final long A01;
    public final AnonymousClass3H2 A02;
    public final AnonymousClass31C A03;
    public final boolean A04;

    public void BQs(String str) {
        Log.d("DeviceKeyIndexListUpdateProtocolHelper/onDeliveryFailure");
        C18270x1.A0v(this.A02.A06, "adv_key_index_list_require_update", true);
    }

    public void BSN(AnonymousClass36K r4, String str) {
        AnonymousClass36K A0l = r4.A0l("error");
        int i = -1;
        if (A0l != null) {
            i = A0l.A0b("code", -1);
        }
        C18260x0.A0w("DeviceKeyIndexListUpdateProtocolHelper/onError code=", AnonymousClass001.A0o(), i);
        this.A02.A01(i);
    }

    public AnonymousClass3T0(AnonymousClass3H2 r1, AnonymousClass31C r2, long j, long j2, boolean z) {
        this.A03 = r2;
        this.A04 = z;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = r1;
    }

    public void BdM(AnonymousClass36K r10, String str) {
        long j;
        AnonymousClass36K A0l = r10.A0l("retry-ts");
        if (A0l != null) {
            String A0L = AnonymousClass36K.A0L(A0l, "ts");
            if (!TextUtils.isEmpty(A0L)) {
                j = C615531h.A04(A0L, -1);
            } else {
                j = -1;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DeviceKeyIndexListUpdateProtocolHelper/retry-ts ts=");
            A0o.append(j);
            A0o.append("; isRetry=");
            boolean z = this.A04;
            C18260x0.A1U(A0o, z);
            if (z || j == -1) {
                this.A02.A01(-1);
                return;
            }
            AnonymousClass3H2 r3 = this.A02;
            long j2 = this.A01;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("DeviceKeyIndexListUpdateHandler/onRetry advTs=");
            A0o2.append(j);
            C18260x0.A11(" serverTs=", A0o2, j2);
            r3.A02(j, j2, true);
            return;
        }
        Log.d("DeviceKeyIndexListUpdateProtocolHelper/onSuccess");
        AnonymousClass3H2 r5 = this.A02;
        long j3 = this.A00;
        long j4 = this.A01;
        Log.d("DeviceKeyIndexListUpdateHandler/onSuccess");
        r5.A02.A04(j3);
        C29041iB r8 = r5.A07;
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass33G r52 : r8.A0C()) {
            if (r52.A02() && r52.A01 < j4) {
                A0s.add(r52.A07);
            }
        }
        r8.A0K.A03(C129526aS.copyOf((Collection) A0s));
    }
}
