package X;

import com.whatsapp.R;

/* renamed from: X.4jR  reason: invalid class name and case insensitive filesystem */
public final class C91344jR extends C151657Vt {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91344jR) {
                C91344jR r5 = (C91344jR) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int A00() {
        return this.A00;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x9.A04(this.A02), this.A01);
    }

    public C91344jR(boolean z, boolean z2) {
        super(z2, z);
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z ? R.string.f11nameremoved : R.string.f11nameremoved;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SpeakerToggle(isSpeakerOn=");
        A0o.append(this.A02);
        A0o.append(", canToggleSpeaker=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
