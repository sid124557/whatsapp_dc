package X;

import android.media.AudioAttributes;

/* renamed from: X.7jx  reason: invalid class name and case insensitive filesystem */
public final class C158427jx {
    public static final C158427jx A02 = new C158427jx(1);
    public AudioAttributes A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C158427jx.class == obj.getClass() && this.A01 == ((C158427jx) obj).A01;
        }
        return true;
    }

    static {
        new AnonymousClass7BE();
    }

    public AudioAttributes A00() {
        AudioAttributes audioAttributes = this.A00;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(this.A01);
        if (C162387ry.A01 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        AudioAttributes build = usage.build();
        this.A00 = build;
        return build;
    }

    public C158427jx(int i) {
        this.A01 = i;
    }

    public int hashCode() {
        return ((506447 + this.A01) * 31) + 1;
    }
}
