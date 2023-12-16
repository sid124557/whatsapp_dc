package X;

import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;

/* renamed from: X.38T  reason: invalid class name */
public abstract class AnonymousClass38T implements Parcelable {
    public GraphQLXWA2AppealState A00() {
        if (this instanceof C28511hE) {
            return ((C28511hE) this).A01;
        }
        if (this instanceof C28531hG) {
            return ((C28531hG) this).A01;
        }
        return ((C28521hF) this).A01;
    }

    public String A01() {
        if (this instanceof C28511hE) {
            return ((C28511hE) this).A03;
        }
        if (this instanceof C28531hG) {
            return ((C28531hG) this).A03;
        }
        return ((C28521hF) this).A04;
    }
}
