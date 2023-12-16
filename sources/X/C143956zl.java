package X;

/* renamed from: X.6zl  reason: invalid class name and case insensitive filesystem */
public abstract class C143956zl extends Exception implements C188038yD {
    public final String category;
    public final Throwable cause;
    public final int code;
    public final String message;

    public String B5K() {
        return this.category;
    }

    public int B5a() {
        if (this instanceof C135076k5) {
            return ((C135076k5) this).code;
        }
        return this.code;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public C143956zl(String str, String str2, Throwable th, int i) {
        super(str, th);
        this.message = str;
        this.cause = th;
        this.code = i;
        this.category = str2;
    }

    public String B6z() {
        String message2 = getMessage();
        if (message2 == null) {
            return "Unknown Failure";
        }
        return message2;
    }
}
