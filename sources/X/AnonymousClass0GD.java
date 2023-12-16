package X;

/* renamed from: X.0GD  reason: invalid class name */
public enum AnonymousClass0GD {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean A00() {
        if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
            return true;
        }
        return false;
    }
}
