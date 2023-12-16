package X;

/* renamed from: X.742  reason: invalid class name */
public class AnonymousClass742 {
    public static String A00(int i) {
        if (i == 0) {
            return "kCallLinkStateNone";
        }
        if (i == 1) {
            return "kCallLinkStateQuerySent";
        }
        if (i == 2) {
            return "kCallLinkStateJoinAcked";
        }
        if (i == 3) {
            return "kCallLinkStateJoinSent";
        }
        if (i == 4) {
            return "kCallLinkStateQueryAcked";
        }
        C626936e.A0D(false, "UNKNOWN CallLinkState");
        return "UNKNOWN CallLinkState";
    }
}
