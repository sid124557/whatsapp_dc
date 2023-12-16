package X;

/* renamed from: X.7jl  reason: invalid class name and case insensitive filesystem */
public final class C158307jl {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C158307jl) && this.A00 == ((C158307jl) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C158307jl(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerAnimationData(firstFrameLength=");
        return C18260x0.A09(A0o, this.A00);
    }

    public C158307jl() {
        this(-1);
    }
}
