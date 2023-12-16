package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.59E  reason: invalid class name */
public enum AnonymousClass59E {
    CALL_ENDED(1),
    STOP_FROM_BOTTOM_SHEET(2),
    STOP_FROM_GRID_TILE(4),
    PEER_TAKEOVER(16),
    ERROR(128),
    DISPLAY_PENDING_CALL(512),
    SCREEN_LOCKED(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH),
    OTHER(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
    
    public final int value;

    public static void A00(AnonymousClass59E r2, AnonymousClass5TU r3) {
        C162457s7.A0J(r2, 0);
        r3.A08 = r2.value | r3.A08;
    }

    /* access modifiers changed from: public */
    static {
        AnonymousClass59E[] r1;
        A00 = C73653fr.A00(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass59E(int i) {
        this.value = i;
    }
}
