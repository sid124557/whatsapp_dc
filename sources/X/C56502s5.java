package X;

import android.content.Context;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import java.util.Map;

/* renamed from: X.2s5  reason: invalid class name and case insensitive filesystem */
public class C56502s5 {
    public Boolean A00 = null;
    public String A01;
    public final C54292oU A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;

    public final synchronized String A00() {
        String str;
        str = this.A01;
        if (str == null) {
            str = C18280x3.A0Y();
            this.A01 = str;
        }
        return str;
    }

    public final void A07(String str, Map map) {
        C183538qC r3 = this.A04;
        String string = C18270x1.A05(r3).getString("previous_registration_screen", (String) null);
        if (string == null) {
            string = "unknown";
        }
        String string2 = C18270x1.A05(r3).getString("previous_registration_action", (String) null);
        if (string2 == null) {
            string2 = "unknown";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FunnelLogger/");
        A0o.append(string);
        A0o.append("/");
        A0o.append(string2);
        C18260x0.A0s("/", str, A0o);
        ((AnonymousClass4FS) this.A05.get()).BkM(new C70673as(this, map, str, string, string2, 0));
    }

    public final boolean A08() {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = true;
            this.A00 = bool;
        }
        return bool.booleanValue();
    }

    public C56502s5(C54292oU r2, C183538qC r3, C183538qC r4, C183538qC r5) {
        this.A05 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r2;
    }

    public void A01(String str) {
        if (A08()) {
            C48232eZ r2 = new C48232eZ();
            r2.A01("funnel_id", A00());
            A07(str, r2.A00);
        }
    }

    public void A02(String str) {
        String str2;
        TelephonyManager telephonyManager;
        if (A08()) {
            C48232eZ r3 = new C48232eZ();
            r3.A01("funnel_id", A00());
            Context context = this.A02.A00;
            C162457s7.A0J(context, 0);
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
            if (hasSystemFeature) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            r3.A01("sim_card_supported", str2);
            if (hasSystemFeature) {
                int i = -1;
                if (context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                    Object systemService = context.getSystemService("phone");
                    if ((systemService instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) systemService) != null) {
                        i = telephonyManager.getSimState();
                    }
                }
                r3.A00("sim_state", i);
            }
            C152337Ym A022 = AnonymousClass5YQ.A02(context);
            if (A022 != null) {
                r3.A00("screen_diagonal_inches", A022.A00);
            }
            Configuration A0M = AnonymousClass001.A0M(AnonymousClass74U.A00(context));
            r3.A00("screen_width_dp", A0M.screenWidthDp);
            r3.A00("screen_height_dp", A0M.screenHeightDp);
            A07(str, r3.A00);
        }
    }

    public void A03(String str, String str2) {
        if (A08()) {
            A01(str);
            A04(str, str2);
        }
    }

    public void A04(String str, String str2) {
        if (A08()) {
            AnonymousClass33p A0J = C18320x8.A0J(this.A04);
            C18270x1.A0j(C18270x1.A03(A0J), "previous_registration_screen", str);
            C18270x1.A0j(C18270x1.A03(A0J), "previous_registration_action", str2);
        }
    }

    public final void A05(String str, String str2, String str3, String str4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FunnelLogger/passkeyLoginEvent/");
        A0o.append(str);
        A0o.append("/");
        A0o.append(str2);
        A0o.append("/errorType=");
        A0o.append(str4);
        C18260x0.A0s("/errorReason=", str3, A0o);
        if (A08()) {
            C18270x1.A0j(C18300x5.A0A(this.A04), "previous_registration_screen", str);
            C48232eZ r1 = new C48232eZ();
            r1.A01("event_name", str2);
            if (str3 != null) {
                r1.A01("client_error_context", str3);
            }
            if (str4 != null) {
                r1.A01("client_error_type", str4);
            }
            A07(str, r1.A00);
        }
    }

    public void A06(String str, String str2, String str3, String str4, long j) {
        if (A08()) {
            C48232eZ r3 = new C48232eZ();
            r3.A01("funnel_id", A00());
            r3.A01("ios_attempt_id", str3);
            r3.A01("ios_export_duration", str4);
            r3.A01("google_migrate_import_error", str2);
            if (j > 0) {
                r3.A00.put("google_migrate_import_duration", Long.toString(j).getBytes());
            }
            A07(str, r3.A00);
        }
    }
}
