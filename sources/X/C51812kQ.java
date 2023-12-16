package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2kQ  reason: invalid class name and case insensitive filesystem */
public final class C51812kQ {
    public final PhotoView A00;
    public final C30471mV A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51812kQ) {
                C51812kQ r5 = (C51812kQ) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public C51812kQ(PhotoView photoView, C30471mV r2) {
        this.A01 = r2;
        this.A00 = photoView;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessagePhotoItem(message=");
        A0o.append(this.A01);
        A0o.append(", photoView=");
        return C18260x0.A04(this.A00, A0o);
    }
}
