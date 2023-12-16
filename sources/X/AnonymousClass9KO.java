package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.9KO  reason: invalid class name */
public abstract class AnonymousClass9KO extends Exception {
    public final int mErrorCode = 31000;
    public Map mExtras;

    public AnonymousClass9KO(Throwable th) {
        super(th.getMessage(), th);
    }

    public final String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.mErrorCode);
        return String.format((Locale) null, "[ErrorCode=%d]", A0L);
    }
}
