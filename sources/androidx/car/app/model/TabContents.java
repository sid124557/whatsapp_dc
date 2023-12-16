package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C14790qH;
import java.util.Objects;

public class TabContents {
    public C14790qH mTemplate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabContents)) {
            return false;
        }
        return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mTemplate, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[template: ");
        return AnonymousClass000.A0S(this.mTemplate, A0o);
    }
}
