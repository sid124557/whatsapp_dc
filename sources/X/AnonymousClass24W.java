package X;

/* renamed from: X.24W  reason: invalid class name */
public class AnonymousClass24W extends Exception {
    public String description;
    public final Integer e2eFailureReason;

    public static AnonymousClass24W A01(Integer num, String str) {
        return new AnonymousClass24W(num, str);
    }

    public AnonymousClass24W(Integer num) {
        this.description = null;
        this.e2eFailureReason = num;
    }

    public static AnonymousClass24W A00(int i) {
        return new AnonymousClass24W(Integer.valueOf(i));
    }

    public AnonymousClass24W(Exception exc, Integer num) {
        super(exc);
        this.description = null;
        this.e2eFailureReason = num;
    }

    public AnonymousClass24W(Integer num, String str) {
        this.e2eFailureReason = num;
        this.description = str;
    }
}
