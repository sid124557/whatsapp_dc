package X;

/* renamed from: X.7bZ  reason: invalid class name and case insensitive filesystem */
public abstract class C153567bZ {
    public int flags;

    public static boolean A00(C153567bZ r1) {
        return r1.getFlag(4);
    }

    public void clear() {
        this.flags = 0;
    }

    public final boolean isKeyFrame() {
        return AnonymousClass000.A1U(this.flags & 1, 1);
    }

    public final void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public final void clearFlag(int i) {
        this.flags = (~i) & this.flags;
    }

    public final boolean getFlag(int i) {
        return AnonymousClass000.A1U(this.flags & i, i);
    }

    public final boolean hasSupplementalData() {
        return AnonymousClass000.A1U(this.flags & 268435456, 268435456);
    }

    public final boolean isDecodeOnly() {
        return AnonymousClass000.A1U(this.flags & Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final boolean isEndOfStream() {
        return A00(this);
    }
}
