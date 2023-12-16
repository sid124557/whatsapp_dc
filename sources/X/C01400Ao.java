package X;

/* renamed from: X.0Ao  reason: invalid class name and case insensitive filesystem */
public final class C01400Ao extends C03070Is {
    public final AnonymousClass0Xq A00 = AnonymousClass0Xq.A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C01400Ao.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C01400Ao) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C01400Ao.class.getName().hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failure {mOutputData=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
