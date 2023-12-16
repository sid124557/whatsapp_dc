package X;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6a5  reason: invalid class name and case insensitive filesystem */
public abstract class C129296a5 extends C129366aC implements C187918y1 {
    public static final long serialVersionUID = 6588350623831699109L;

    public Collection unmodifiableCollectionSubclass(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public Collection wrapCollection(Object obj, Collection collection) {
        return wrapList(obj, (List) collection, (C174068Sv) null);
    }

    public C129296a5(Map map) {
        super(map);
    }
}
