package X;

/* renamed from: X.2vi  reason: invalid class name and case insensitive filesystem */
public class C58722vi {
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public static C58722vi A00(String str) {
        if (str == null) {
            throw new AnonymousClass247(0, "Passed empty string");
        } else if (str.contains("fpm")) {
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i = 0;
            for (String split : str.split("[?&](?!\\?)")) {
                String[] split2 = split.split("=", 2);
                String str8 = split2[0];
                switch (str8.hashCode()) {
                    case -992105987:
                        if (!str8.equals("peerID")) {
                            break;
                        } else {
                            str7 = split2[1];
                            break;
                        }
                    case 3050020:
                        if (!str8.equals("cert")) {
                            break;
                        } else {
                            str5 = split2[1];
                            break;
                        }
                    case 351608024:
                        if (!str8.equals("version")) {
                            break;
                        } else {
                            i = Integer.parseInt(split2[1]);
                            break;
                        }
                    case 607796785:
                        if (!str8.equals("sessionID")) {
                            break;
                        } else {
                            str4 = split2[1];
                            break;
                        }
                    case 1450587441:
                        if (!str8.equals("authToken")) {
                            break;
                        } else {
                            str6 = split2[1];
                            break;
                        }
                    case 1809169577:
                        if (!str8.equals("authMethod")) {
                            break;
                        } else {
                            str3 = split2[1];
                            break;
                        }
                    case 1874684019:
                        if (!str8.equals("platform")) {
                            break;
                        } else {
                            str2 = split2[1];
                            break;
                        }
                }
            }
            if (i == 0) {
                throw new AnonymousClass247(2, "Required field not found in QR code: version");
            } else if (str2 == null) {
                throw new AnonymousClass247(2, "Required field not found in QR code: platform");
            } else if (!str2.equals("android")) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Platform field=");
                A0o.append(str2);
                throw new AnonymousClass247(2, AnonymousClass000.A0X(", which is not currently supported", A0o));
            } else if (str4 == null) {
                throw new AnonymousClass247(2, "Required field not found in QR code: sessionID");
            } else if (str3 == null) {
                throw new AnonymousClass247(2, "Required field not found in QR code: authMethod");
            } else if (str5 == null) {
                throw new AnonymousClass247(2, "Required field not found in QR code: cert");
            } else if (str6 != null) {
                return new C58722vi(str4, str5, str6, str7);
            } else {
                throw new AnonymousClass247(2, "Required field not found in QR code: authToken");
            }
        } else if (AnonymousClass32P.A00(str) != null) {
            throw new AnonymousClass247(1, "Scanned qr code that was generated for companion linking");
        } else {
            throw new AnonymousClass247(0, "Scanned qr code that was not generated for chat transfer");
        }
    }

    public C58722vi(String str, String str2, String str3, String str4) {
        this.A00 = str4;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
