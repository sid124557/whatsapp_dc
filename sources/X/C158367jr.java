package X;

import java.util.List;

/* renamed from: X.7jr  reason: invalid class name and case insensitive filesystem */
public final class C158367jr {
    public final C108965dr A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158367jr) {
                C158367jr r5 = (C158367jr) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A07(this.A00) * 31);
    }

    public C158367jr(C108965dr r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SERPMapViewResult(mapviewConfig=");
        A0o.append(this.A00);
        A0o.append(", mapBusinesses=");
        return C18260x0.A04(this.A01, A0o);
    }

    public C158367jr() {
        this((C108965dr) null, C72023d3.A00);
    }
}
