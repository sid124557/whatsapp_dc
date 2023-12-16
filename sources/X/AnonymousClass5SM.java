package X;

import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5SM  reason: invalid class name */
public final class AnonymousClass5SM {
    public final C30721mu A00;
    public final File A01;
    public final WeakReference A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SM) {
                AnonymousClass5SM r5 = (AnonymousClass5SM) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A01, C18300x5.A04(this.A00)));
    }

    public AnonymousClass5SM(C30721mu r1, File file, WeakReference weakReference) {
        this.A00 = r1;
        this.A01 = file;
        this.A02 = weakReference;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PttTranscriptionRequest(message=");
        A0o.append(this.A00);
        A0o.append(", file=");
        A0o.append(this.A01);
        A0o.append(", callbackWeakReference=");
        return C18260x0.A04(this.A02, A0o);
    }
}
