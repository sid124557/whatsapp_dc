package X;

import android.content.ClipData;
import android.view.ContentInfo;

/* renamed from: X.0dH  reason: invalid class name and case insensitive filesystem */
public final class C08070dH implements C16950uI {
    public final ContentInfo A00;

    public ClipData B5Y() {
        return this.A00.getClip();
    }

    public int B7j() {
        return this.A00.getFlags();
    }

    public int BDA() {
        return this.A00.getSource();
    }

    public ContentInfo BEZ() {
        return this.A00;
    }

    public C08070dH(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.A00 = contentInfo;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContentInfoCompat{");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }
}
