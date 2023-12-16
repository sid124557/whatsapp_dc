package X;

/* renamed from: X.7au  reason: invalid class name and case insensitive filesystem */
public final class C153237au {
    public final C152567Zj A00;
    public final C152107Xo A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C153237au) {
                C153237au r5 = (C153237au) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C142086wc A00() {
        if (this.A01.A00) {
            return C142086wc.PUSH_TO_VIDEO_CAMERA_ENTRY_POINT_NUX;
        }
        C152567Zj r1 = this.A00;
        if (!r1.A05) {
            return null;
        }
        int i = r1.A01;
        if (i == 0) {
            return C142086wc.PUSH_TO_RECORD_INSTRUCTION;
        }
        if (i == 1) {
            return C142086wc.PUSH_TO_VIDEO_NUX;
        }
        if (i == 2) {
            return C142086wc.RECORDER_MODE_CHANGED_INSTRUCTION;
        }
        if (i == 3) {
            return C142086wc.LOCK_INSTRUCTION;
        }
        return null;
    }

    public final boolean A01() {
        if (this.A00.A05 || this.A01.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C153237au(C152567Zj r1, C152107Xo r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PushToRecordMediaTipControllerState(pushToRecordToolTipUiState=");
        A0o.append(this.A00);
        A0o.append(", pushToVideoCameraEntryPointToolTipUiState=");
        return C18260x0.A04(this.A01, A0o);
    }
}
