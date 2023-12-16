package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14790qH;
import java.util.List;

public final class TemplateWrapper {
    public String mId = "";
    public C14790qH mTemplate = null;
    public List mTemplateInfoForScreenStack = AnonymousClass001.A0s();

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[template: ");
        A0o.append(this.mTemplate);
        A0o.append(", ID: ");
        return AnonymousClass000.A0W(this.mId, A0o);
    }
}
