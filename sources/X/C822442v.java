package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.42v  reason: invalid class name and case insensitive filesystem */
public final class C822442v extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ List $excludeLidWithoutDisplayName;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C162457s7.A0J(obj, 0);
        List list = this.$excludeLidWithoutDisplayName;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C162457s7.A0P(it.next(), obj)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C822442v(List list) {
        super(1);
        this.$excludeLidWithoutDisplayName = list;
    }
}
