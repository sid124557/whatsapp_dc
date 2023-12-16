package X;

/* renamed from: X.23F  reason: invalid class name */
public enum AnonymousClass23F implements C181358md {
    UPLOAD_STICKER(0),
    SEND_RECENT_STICKER_BOOTSTRAP(1),
    GENERATE_LINK_PREVIEW(2),
    HISTORY_SYNC_ON_DEMAND(3),
    PLACEHOLDER_MESSAGE_RESEND(4);
    
    public final int value;

    public static AnonymousClass23F A00(int i) {
        if (i == 0) {
            return UPLOAD_STICKER;
        }
        if (i == 1) {
            return SEND_RECENT_STICKER_BOOTSTRAP;
        }
        if (i == 2) {
            return GENERATE_LINK_PREVIEW;
        }
        if (i == 3) {
            return HISTORY_SYNC_ON_DEMAND;
        }
        if (i != 4) {
            return null;
        }
        return PLACEHOLDER_MESSAGE_RESEND;
    }

    /* access modifiers changed from: public */
    AnonymousClass23F(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
