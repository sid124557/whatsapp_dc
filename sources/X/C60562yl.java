package X;

import com.whatsapp.location.PlaceInfo;

/* renamed from: X.2yl  reason: invalid class name and case insensitive filesystem */
public final class C60562yl {
    public final AnonymousClass20W A00;
    public final PlaceInfo A01;

    public C60562yl(AnonymousClass20W r2, PlaceInfo placeInfo) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = placeInfo;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60562yl) {
                C60562yl r5 = (C60562yl) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + AnonymousClass000.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UIState(currentStep=");
        A0o.append(this.A00);
        A0o.append(", selectedPlace=");
        return C18260x0.A04(this.A01, A0o);
    }

    public C60562yl() {
        this(AnonymousClass20W.MAIN, (PlaceInfo) null);
    }
}
