package X;

import java.util.List;

/* renamed from: X.6jz  reason: invalid class name and case insensitive filesystem */
public final class C135016jz extends C1451174f {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C135016jz) && C162457s7.A0P(this.A00, ((C135016jz) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C135016jz(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScreenshotsInfo(screenshotUploadResultList=");
        return C18260x0.A04(this.A00, A0o);
    }
}
