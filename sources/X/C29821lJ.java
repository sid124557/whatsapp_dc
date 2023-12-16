package X;

/* renamed from: X.1lJ  reason: invalid class name and case insensitive filesystem */
public final class C29821lJ extends C376623n {
    public final boolean hasAvatarConfigCached;
    public final boolean hasAvatarStickerPackInstalled;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29821lJ) {
                C29821lJ r5 = (C29821lJ) obj;
                if (!(this.hasAvatarConfigCached == r5.hasAvatarConfigCached && this.hasAvatarStickerPackInstalled == r5.hasAvatarStickerPackInstalled)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x9.A04(this.hasAvatarConfigCached), this.hasAvatarStickerPackInstalled);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29821lJ(boolean r3, boolean r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "No Avatar (has config cached: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", has pack installed: "
            r1.append(r0)
            java.lang.String r0 = X.C18260x0.A0A(r1, r4)
            r2.<init>(r0)
            r2.hasAvatarConfigCached = r3
            r2.hasAvatarStickerPackInstalled = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29821lJ.<init>(boolean, boolean):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NoAvatar(hasAvatarConfigCached=");
        A0o.append(this.hasAvatarConfigCached);
        A0o.append(", hasAvatarStickerPackInstalled=");
        return C18260x0.A0A(A0o, this.hasAvatarStickerPackInstalled);
    }
}
