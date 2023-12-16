package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.3vC  reason: invalid class name and case insensitive filesystem */
public final class C78553vC extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass2RG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78553vC(AnonymousClass2RG r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = this.this$0.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass3Z6 r0 = (AnonymousClass3Z6) it.next();
            int A00 = AnonymousClass3Z6.A00(r0);
            Object obj = r0.second;
            Object obj2 = A0r.get(obj);
            if (obj2 == null) {
                obj2 = AnonymousClass0x9.A17();
                A0r.put(obj, obj2);
            }
            ((Set) obj2).add(Integer.valueOf(A00));
        }
        return A0r;
    }
}
