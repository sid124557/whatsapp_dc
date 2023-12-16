package X;

/* renamed from: X.7cu  reason: invalid class name and case insensitive filesystem */
public class C154277cu {
    public static int A00(Boolean bool, int i, boolean z) {
        switch (i) {
            case 1:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                if (z || bool == null) {
                    return 2;
                }
                if (Boolean.TRUE.equals(bool)) {
                    return 11;
                }
                return 10;
            case 2:
                if (z || bool == null) {
                    return 12;
                }
                if (Boolean.TRUE.equals(bool)) {
                    return 14;
                }
                return 13;
            case 3:
                if (z) {
                    return 7;
                }
                return 21;
            case 4:
                if (z) {
                    return 15;
                }
                return 16;
            case 5:
                if (z) {
                    return 18;
                }
                return 19;
            case 6:
                throw C86604Kt.A0h("Invalid camera origin:", AnonymousClass001.A0o(), i);
            case 7:
                throw C86604Kt.A0h("Invalid camera origin:", AnonymousClass001.A0o(), i);
            case 14:
                throw C86604Kt.A0h("Invalid camera origin:", AnonymousClass001.A0o(), i);
            case 16:
                throw C86604Kt.A0h("Invalid camera origin:", AnonymousClass001.A0o(), i);
            default:
                return 8;
        }
    }

    public static String A01(int i) {
        if (i == 16) {
            return "smb_premium_message";
        }
        switch (i) {
            case 1:
                return "camera_tab";
            case 2:
                return "chat_button";
            case 3:
                return "chat_menu";
            case 4:
                return "status_tab";
            case 5:
                return "status_reply";
            case 6:
                return "smb_quick_reply_edit";
            case 7:
                return "smb_quick_reply_send";
            default:
                return "unknown";
        }
    }
}
