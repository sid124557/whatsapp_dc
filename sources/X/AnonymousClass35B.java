package X;

import com.whatsapp.R;

/* renamed from: X.35B  reason: invalid class name */
public class AnonymousClass35B {
    public static final int[] A00 = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};

    public static String A03(String str, int i) {
        if (i == 1) {
            return "contacts";
        }
        if (i == 2) {
            return "none";
        }
        if (i == 3) {
            return "contact_blacklist";
        }
        if (i != 4) {
            if (i == 5) {
                return "known";
            }
            return "all";
        } else if ("online".equals(str)) {
            return "match_last_seen";
        } else {
            return "all";
        }
    }

    public static int A00(String str) {
        if ("all".equals(str)) {
            return 0;
        }
        if ("contacts".equals(str)) {
            return 1;
        }
        if ("none".equals(str)) {
            return 2;
        }
        if ("contact_blacklist".equals(str)) {
            return 3;
        }
        if ("match_last_seen".equals(str)) {
            return 4;
        }
        if ("known".equals(str)) {
            return 5;
        }
        return -1;
    }

    public static String A01(String str) {
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return "privacy_online";
                }
                break;
            case -892481550:
                if (str.equals("status")) {
                    return "privacy_status";
                }
                break;
            case -309425751:
                if (str.equals("profile")) {
                    return "privacy_profile_photo";
                }
                break;
            case 3314326:
                if (str.equals("last")) {
                    return "privacy_last_seen";
                }
                break;
            case 506363330:
                if (str.equals("groupadd")) {
                    return "privacy_groupadd";
                }
                break;
            case 548632963:
                if (str.equals("calladd")) {
                    return "privacy_calladd";
                }
                break;
            case 1974548689:
                if (str.equals("readreceipts")) {
                    return "read_receipts_enabled";
                }
                break;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Unrecognized category: ");
        throw AnonymousClass000.A0F(str, A0o);
    }

    public static String A02(String str) {
        switch (str.hashCode()) {
            case -1977700443:
                if (str.equals("privacy_profile_photo")) {
                    return "profile";
                }
                break;
            case -1926138227:
                if (str.equals("privacy_last_seen")) {
                    return "last";
                }
                break;
            case -1038662714:
                if (str.equals("read_receipts_enabled")) {
                    return "readreceipts";
                }
                break;
            case -385074228:
                if (str.equals("privacy_calladd")) {
                    return "calladd";
                }
                break;
            case 897320682:
                if (str.equals("privacy_online")) {
                    return "online";
                }
                break;
            case 1017061513:
                if (str.equals("privacy_status")) {
                    return "status";
                }
                break;
            case 1626211481:
                if (str.equals("privacy_groupadd")) {
                    return "groupadd";
                }
                break;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Unrecognized preference: ");
        throw AnonymousClass000.A0F(str, A0o);
    }
}
