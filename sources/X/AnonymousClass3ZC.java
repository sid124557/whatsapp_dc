package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.3ZC  reason: invalid class name */
public class AnonymousClass3ZC implements Serializable {
    public static final long serialVersionUID = 1;
    public final int actualActors;
    public final int hostStorage;
    public final long privacyModeTs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3ZC r7 = (AnonymousClass3ZC) obj;
            if (!(this.hostStorage == r7.hostStorage && this.actualActors == r7.actualActors && this.privacyModeTs == r7.privacyModeTs)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass3ZC(String str, String str2, String str3) {
        this.hostStorage = C57462tg.A01(str);
        this.actualActors = C57462tg.A00(str2);
        this.privacyModeTs = C615531h.A03(str3);
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.hostStorage);
        AnonymousClass000.A1M(A1X, this.actualActors);
        AnonymousClass0x2.A1U(A1X, this.privacyModeTs);
        return Arrays.hashCode(A1X);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyMode{hostStorage=");
        A0o.append(this.hostStorage);
        A0o.append(", actualActors=");
        A0o.append(this.actualActors);
        A0o.append(", privacyModeTs=");
        A0o.append(this.privacyModeTs);
        return AnonymousClass000.A0d(A0o);
    }

    public AnonymousClass3ZC(AnonymousClass3ZC r3) {
        long j;
        if (r3 == null) {
            this.hostStorage = 0;
            this.actualActors = 0;
            j = 0;
        } else {
            this.hostStorage = r3.hostStorage;
            this.actualActors = r3.actualActors;
            j = r3.privacyModeTs;
        }
        this.privacyModeTs = j;
    }

    public AnonymousClass3ZC(int i, long j, int i2) {
        this.hostStorage = i;
        this.actualActors = i2;
        this.privacyModeTs = j;
    }

    public AnonymousClass3ZC() {
        this.hostStorage = 0;
        this.actualActors = 0;
        this.privacyModeTs = 0;
    }
}
