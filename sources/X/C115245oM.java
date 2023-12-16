package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.5oM  reason: invalid class name and case insensitive filesystem */
public class C115245oM implements AnonymousClass4EZ {
    public final /* synthetic */ C105685Vz A00;

    public C115245oM(C105685Vz r1) {
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r5, String str) {
        Object obj;
        Log.e("JoinSubgroupProtocolHelper/onError");
        Pair A02 = C57492tj.A02(r5);
        if (!(A02 == null || (obj = A02.first) == null)) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "JoinSubgroupProtocolHelper/onError: ", obj);
            int A03 = C18280x3.A03(A02);
            if (!(A03 == 304 || A03 == 409 || A03 == 412 || A03 == 419 || A03 == 426 || A03 == 500 || A03 == 400 || A03 == 401)) {
                switch (A03) {
                    case 403:
                    case 404:
                    case 405:
                        break;
                }
            }
            AnonymousClass5J6 r1 = this.A00.A00;
            AnonymousClass7DU r0 = r1.A01;
            C27991fJ r3 = r1.A03;
            r0.A00.A0E(A03);
            if (A03 == 409) {
                r1.A02.A05.A0t.A0E(r3, "subgroup_conflict_recovery", 3);
                return;
            }
            return;
        }
        this.A00.A00.A01.A00.A0E(-1);
    }

    public void BdM(AnonymousClass36K r3, String str) {
        AnonymousClass36K A0l = r3.A0l("membership_approval_request");
        this.A00.A00.A00.A00.A0F(AnonymousClass000.A1W(A0l) ? 1 : 0);
    }

    public void BQs(String str) {
        C18260x0.A0t("JoinSubgroupProtocolHelper/onDeliveryFailure iqid=", str, AnonymousClass001.A0o());
        this.A00.A00.A01.A00.A0E(0);
    }
}
