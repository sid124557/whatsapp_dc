package X;

import java.util.Iterator;

/* renamed from: X.3vD  reason: invalid class name and case insensitive filesystem */
public final class C78563vD extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass2RG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78563vD(AnonymousClass2RG r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass2RG r4 = this.this$0;
        int i = r4.A00 + 1;
        Object[] objArr = new C85424Ge[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        Iterator it = r4.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass3Z6 r0 = (AnonymousClass3Z6) it.next();
            objArr[AnonymousClass3Z6.A00(r0)] = r0.second;
        }
        return objArr;
    }
}
