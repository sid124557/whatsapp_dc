package X;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.7TV  reason: invalid class name */
public class AnonymousClass7TV {
    public final C187038wL A00;
    public final C157247hz A01;
    public final Collection A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass7TV r5 = (AnonymousClass7TV) obj;
            if (!(this.A00.getClass() == r5.A00.getClass() && this.A01.getClass() == r5.A01.getClass() && Objects.equals(this.A03, r5.A03))) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass7TV(C187038wL r2, C157247hz r3, Collection collection, EnumSet enumSet) {
        C160947oi.A03(r3, "mappingProvider can not be null");
        C160947oi.A03(enumSet, "setOptions can not be null");
        C160947oi.A03(collection, "evaluationListeners can not be null");
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = Collections.unmodifiableSet(enumSet);
        this.A02 = Collections.unmodifiableCollection(collection);
    }
}
