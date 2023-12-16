package X;

/* renamed from: X.22N  reason: invalid class name */
public enum AnonymousClass22N {
    INPUT_PREVIEW(true, false, true),
    INPUT_PREVIEW_SIZE(true, true, false),
    INPUT_FACING(true, true, false),
    INPUT_ROTATION(true, true, false),
    INPUT_CAPTURE_CONTEXT(true, true, false),
    PREVIEW_VIEW_SIZE(true, true, false),
    TOUCH_INPUT_CONFIG(false, true, false),
    EXTERNAL_WORLD_TRACKING_EVENT(true, false, true),
    PLATFORM_ALGORITHM_DATA_EVENT(true, false, true);
    
    public static final AnonymousClass22N[] A00 = null;
    public final boolean isCacheableEvent;
    public final boolean isSystemEvent;
    public final boolean shouldNotifyEventListenerRegistration;

    public static AnonymousClass22N A00(String str, int i, boolean z) {
        return new AnonymousClass22N(str, i, z, false, false);
    }

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    /* access modifiers changed from: public */
    AnonymousClass22N(boolean z, boolean z2, boolean z3) {
        this.isSystemEvent = z;
        this.isCacheableEvent = z2;
        this.shouldNotifyEventListenerRegistration = z3;
    }
}
