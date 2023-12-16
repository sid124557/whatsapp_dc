package X;

import java.io.Serializable;

/* renamed from: X.8L8  reason: invalid class name */
public final class AnonymousClass8L8 implements Serializable {
    public static final long serialVersionUID = 6776230050133633619L;
    public final int minBufferMs;
    public final int minRebufferMs;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass8L8) {
            AnonymousClass8L8 r4 = (AnonymousClass8L8) obj;
            if (this.minBufferMs == r4.minBufferMs && this.minRebufferMs == r4.minRebufferMs) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.minBufferMs * 31) + this.minRebufferMs;
    }

    public AnonymousClass8L8(int i, int i2) {
        this.minBufferMs = i;
        this.minRebufferMs = i2;
    }
}
