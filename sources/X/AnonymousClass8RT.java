package X;

import java.util.List;

/* renamed from: X.8RT  reason: invalid class name */
public class AnonymousClass8RT extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List missingFields = null;

    public AnonymousClass8RT() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
