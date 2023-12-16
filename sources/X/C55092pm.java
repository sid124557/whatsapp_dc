package X;

/* renamed from: X.2pm  reason: invalid class name and case insensitive filesystem */
public class C55092pm {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public final C620633i A09;
    public final C183538qC A0A;

    public final synchronized void A01() {
        if (!this.A02) {
            C183538qC r3 = this.A0A;
            this.A01 = C18270x1.A05(r3).getBoolean("pref_fail_too_many", false);
            this.A03 = C18270x1.A05(r3).getBoolean("pref_no_route_sms", false);
            this.A04 = C18270x1.A05(r3).getBoolean("pref_no_route_voice", false);
            this.A07 = C18270x1.A05(r3).getBoolean("pref_fail_too_many_attempts", false);
            this.A08 = C18270x1.A05(r3).getBoolean("pref_fail_too_many_guesses", false);
            this.A02 = true;
        }
    }

    public void A02(String str) {
        String str2 = str;
        this.A00 = str2;
        A01();
        if (str2.equals("verify-tmg")) {
            this.A08 = true;
            this.A07 = false;
            C18320x8.A0J(this.A0A).A22(this.A01, this.A03, this.A04, false, true);
        } else if (str2.equals("verify-tma")) {
            this.A08 = false;
            this.A07 = true;
            C18320x8.A0J(this.A0A).A22(this.A01, this.A03, this.A04, true, false);
        }
        if (!str2.equals("verify-sms") && !str2.equals("verify-second-sms")) {
            return;
        }
        if (this.A08) {
            this.A00 = "verify-tmg";
        } else if (this.A07) {
            this.A00 = "verify-tma";
        }
    }

    public C55092pm(C620633i r3, C183538qC r4) {
        this.A09 = r3;
        this.A0A = r4;
        this.A02 = false;
    }

    public String A00(String str) {
        A01();
        boolean A0E = C627236i.A0E(this.A09);
        A01();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerificationFlowState/getContactUsContextInternal context ");
        A0o.append(this.A00);
        A0o.append(" phoneNumberIsEmpty ");
        A0o.append(this.A05);
        A0o.append(" phoneNumberIsValid ");
        A0o.append(this.A06);
        A0o.append(" noRouteSms ");
        A0o.append(this.A03);
        A0o.append(" noRouteVoice ");
        A0o.append(this.A04);
        A0o.append(" failTooMany ");
        C18260x0.A1U(A0o, this.A01);
        String str2 = this.A00;
        if ("register-phone".equals(str2)) {
            if (A0E) {
                return "register-phone-rtd";
            }
            if (this.A05) {
                return "register-phone-no_number";
            }
            if (!this.A06) {
                return "register-phone-invalid";
            }
            return str;
        } else if (!"verify-sms".equals(str2) && !"verify-second-sms".equals(str2)) {
            String str3 = "verify-tma";
            if (!str3.equals(str2)) {
                str3 = "verify-tmg";
                if (str3.equals(str2)) {
                    return str3;
                }
                return str;
            }
            return str3;
        } else if (A0E) {
            return "verify-sms-rtd";
        } else {
            boolean z = this.A03;
            boolean z2 = this.A04;
            if (!z) {
                if (z2) {
                    return "verify-sms-no_routes_voice";
                }
                if (this.A01) {
                    return str;
                }
                if ("verify-second-sms".equals(str2)) {
                    return str2;
                }
                return "verify-sms-normal";
            } else if (z2) {
                return "verify-sms-no_routes_both";
            } else {
                return "verify-sms-no_routes_sms";
            }
        }
    }

    public void A03(String str) {
        A01();
        switch (str.hashCode()) {
            case -1976127222:
                if (str.equals("noRouteVoice")) {
                    this.A04 = true;
                    break;
                }
                break;
            case -1893373339:
                if (str.equals("validNumber")) {
                    this.A06 = true;
                    break;
                }
                break;
            case -1777505757:
                if (str.equals("notEmptyNumber")) {
                    this.A05 = false;
                    break;
                }
                break;
            case -1522953003:
                if (str.equals("failTooMany")) {
                    this.A01 = true;
                    break;
                }
                break;
            case -416647790:
                if (str.equals("notValidNumber")) {
                    this.A06 = false;
                    break;
                }
                break;
            case 1040735990:
                if (str.equals("emptyNumber")) {
                    this.A05 = true;
                    break;
                }
                break;
            case 1164419889:
                if (str.equals("noRouteSms")) {
                    this.A03 = true;
                    break;
                }
                break;
        }
        C18320x8.A0J(this.A0A).A22(this.A01, this.A03, this.A04, this.A07, this.A08);
    }
}
