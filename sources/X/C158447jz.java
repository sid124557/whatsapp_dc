package X;

/* renamed from: X.7jz  reason: invalid class name and case insensitive filesystem */
public final class C158447jz {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158447jz) {
                C158447jz r5 = (C158447jz) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public C158447jz(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunityUnreadInfo(unseenMessageCount=");
        A0o.append(this.A02);
        A0o.append(", unseenImportantMessageCount=");
        A0o.append(this.A01);
        A0o.append(", unreadSubgroupCount=");
        return C18260x0.A09(A0o, this.A00);
    }

    public C158447jz() {
        this(0, 0, 0);
    }
}
