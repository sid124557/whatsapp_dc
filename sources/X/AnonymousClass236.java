package X;

/* renamed from: X.236  reason: invalid class name */
public enum AnonymousClass236 implements C181358md {
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_GENERIC(1),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_HELPFUL(2),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_INTERESTING(4),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_ACCURATE(8),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_SAFE(16),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_OTHER(32),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_REFUSED(64),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_NOT_VISUALLY_APPEALING(128),
    BOT_FEEDBACK_MULTIPLE_NEGATIVE_NOT_RELEVANT_TO_TEXT(256);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass236(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
