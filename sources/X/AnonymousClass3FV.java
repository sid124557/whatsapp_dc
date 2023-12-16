package X;

import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.3FV  reason: invalid class name */
public final class AnonymousClass3FV implements AnonymousClass4E8 {
    public final AnonymousClass33p A00;
    public final C51072jE A01;
    public final AnonymousClass2P0 A02;

    public void BQW() {
        StringBuilder A0o;
        String str;
        C183538qC r2 = this.A00.A01;
        if (C18310x6.A03(C18300x5.A0B(r2), "autoconf_cf_type") != 1) {
            A0o = AnonymousClass001.A0o();
            A0o.append("AutoConfConfidencePingMidnightDailyCron");
            str = "/onDailyCronNoMessageStore/confidence framework not enabled, skip ping";
        } else if (!this.A01.A02()) {
            A0o = AnonymousClass001.A0o();
            A0o.append("AutoConfConfidencePingMidnightDailyCron");
            str = "/onDailyCronNoMessageStore/registration not verified, skip ping";
        } else {
            boolean z = C18300x5.A0B(r2).getBoolean("resend_confidence_ping", true);
            A0o = AnonymousClass001.A0o();
            if (!z) {
                A0o.append("AutoConfConfidencePingMidnightDailyCron");
                str = "/onDailyCronNoMessageStore/ping not allowed due to previous failure, skip ping";
            } else {
                A0o.append("AutoConfConfidencePingMidnightDailyCron");
                C18260x0.A1L(A0o, "/onDailyCronNoMessageStore/start auth challenge request");
                AnonymousClass2P0 r22 = this.A02;
                Log.i("AutoConfConfidencePingManager/requestChallenge");
                C67603Py r4 = new C67603Py(r22.A01);
                byte[] A03 = r22.A02.A03((String) null);
                if (A03 == null) {
                    Log.e("AutoConfConfidencePingManager/requestChallenge/failed to query clientStartMessage from FEO2 client");
                    return;
                }
                Log.i("AutoConfConfidencePingManager/requestChallenge/successfully queried clientStartMessage, request confidence challenge");
                String A0t = C18290x4.A0t(A03);
                C18280x3.A12(A0t);
                r4.A00 = r22;
                C50712ie r3 = new GetAutoConfConfidenceChallengeMutationImpl$Builder().A00;
                r3.A02("clientStartMessage", A0t);
                r4.A01.A00(new AnonymousClass7J9(r3, GetAutoConfConfidenceChallengeResponseImpl.class, "GetAutoConfConfidenceChallenge"), r4).A00();
                return;
            }
        }
        C18260x0.A1L(A0o, str);
    }

    public AnonymousClass3FV(AnonymousClass33p r1, C51072jE r2, AnonymousClass2P0 r3) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String BDW() {
        return "AutoConfConfidencePingMidnightDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
