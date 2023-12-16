package X;

/* renamed from: X.9K7  reason: invalid class name */
public enum AnonymousClass9K7 implements C181358md {
    UNKNOWN_STATUS(0),
    PROCESSING(1),
    SENT(2),
    NEED_TO_ACCEPT(3),
    COMPLETE(4),
    COULD_NOT_COMPLETE(5),
    REFUNDED(6),
    EXPIRED(7),
    REJECTED(8),
    CANCELLED(9),
    WAITING_FOR_PAYER(10),
    WAITING(11);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass9K7(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
