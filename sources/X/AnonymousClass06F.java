package X;

import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.06F  reason: invalid class name */
public class AnonymousClass06F extends AnonymousClass06G {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass06F)) {
            return false;
        }
        AnonymousClass06H r4 = (AnonymousClass06H) obj;
        return Objects.equals(this.A04, r4.A04) && Objects.equals(this.A00, r4.A00);
    }

    public AnonymousClass0UQ A05() {
        return AnonymousClass0UQ.A00(this.A04.getDisplayCutout());
    }

    public AnonymousClass0XY A06() {
        return AnonymousClass001.A0X(this.A04.consumeDisplayCutout());
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public AnonymousClass06F(AnonymousClass0XY r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }
}
