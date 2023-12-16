package X;

/* renamed from: X.23N  reason: invalid class name */
public enum AnonymousClass23N implements C181358md {
    Connected(0),
    Rejected(1),
    Cancelled(2),
    AcceptedElsewhere(3),
    Missed(4),
    Invalid(5),
    Unavailable(6),
    Upcoming(7),
    Failed(8),
    Abandoned(9),
    Ongoing(10);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass23N(int i) {
        this.value = i;
    }

    public static AnonymousClass23N A00(int i) {
        switch (i) {
            case 0:
                return Connected;
            case 1:
                return Rejected;
            case 2:
                return Cancelled;
            case 3:
                return AcceptedElsewhere;
            case 4:
                return Missed;
            case 5:
                return Invalid;
            case 6:
                return Unavailable;
            case 7:
                return Upcoming;
            case 8:
                return Failed;
            case 9:
                return Abandoned;
            case 10:
                return Ongoing;
            default:
                return null;
        }
    }

    public final int BA3() {
        return this.value;
    }
}
