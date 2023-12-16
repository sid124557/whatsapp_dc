package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import org.json.JSONObject;

/* renamed from: X.5UI  reason: invalid class name */
public class AnonymousClass5UI {
    public final UserFlowLogger A00;
    public final C32251pv A01;

    public final void A03(long j, String str, String str2) {
        C162457s7.A0J(str2, 2);
        C32251pv r0 = this.A01;
        if (r0 != null) {
            r0.flowAnnotate(j, str, str2);
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowAnnotate(j, str, str2);
            return;
        }
        throw C18290x4.A0Y();
    }

    public final void A00(long j) {
        C32251pv r0 = this.A01;
        if (r0 != null) {
            r0.flowEndCancel(j, "user_cancelled");
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowEndCancel(j, "user_cancelled");
            return;
        }
        throw C18290x4.A0Y();
    }

    public final void A01(long j) {
        C32251pv r3 = this.A01;
        if (r3 != null) {
            r3.B3O(new C103995Pf("arfx", false), j);
            return;
        }
        UserFlowConfig build = new UserFlowConfig.UserFlowConfigBuilder("arfx", false).build();
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowStart(j, build);
            return;
        }
        throw C18290x4.A0Y();
    }

    public final void A04(long j, String str, String str2) {
        C32251pv r0 = this.A01;
        if (r0 != null) {
            int A06 = C86664Kz.A06(j);
            r0.A00.markerPoint((int) j, A06, str, str2);
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowMarkPoint(j, str, str2);
            return;
        }
        throw C18290x4.A0Y();
    }

    public final void A05(AnonymousClass32L r3, String str, String str2, long j) {
        A03(j, "effect_session_id", r3.A00);
        A03(j, "delivery_session_id", r3.A01);
        String str3 = r3.A04;
        C162457s7.A0D(str3);
        A03(j, "product_session_id", str3);
        String str4 = r3.A03;
        C162457s7.A0D(str4);
        A03(j, "product_name", str4);
        A03(j, "effect_id", str);
        if (str2 != null) {
            A03(j, "effect_instance_id", str2);
        }
    }

    public AnonymousClass5UI(UserFlowLogger userFlowLogger, C32251pv r4) {
        this.A01 = r4;
        this.A00 = userFlowLogger;
        if (AnonymousClass000.A1X(r4) == (userFlowLogger != null ? false : true)) {
            throw AnonymousClass001.A0e("Provide either userFlowLogger or fbUserFlowLogger!");
        }
    }

    public final void A02(long j, String str, int i, String str2) {
        C18260x0.A0R(str, str2);
        A03(j, "error_domain", str);
        C32251pv r3 = this.A01;
        if (r3 != null) {
            int A06 = C86664Kz.A06(j);
            r3.A00.markerAnnotate((int) j, A06, "error_code", i);
        } else {
            UserFlowLogger userFlowLogger = this.A00;
            if (userFlowLogger != null) {
                userFlowLogger.flowAnnotate(j, "error_code", i);
            } else {
                throw C18290x4.A0Y();
            }
        }
        A03(j, "error_description", str2);
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("domain", str);
        A1G.put("code", i);
        A1G.put("message", str2);
        A03(j, "error_json", C18290x4.A0o(A1G));
        if (r3 != null) {
            r3.flowEndFail(j, "", "");
            return;
        }
        UserFlowLogger userFlowLogger2 = this.A00;
        if (userFlowLogger2 != null) {
            userFlowLogger2.flowEndFail(j, "", "");
            return;
        }
        throw C18290x4.A0Y();
    }
}
