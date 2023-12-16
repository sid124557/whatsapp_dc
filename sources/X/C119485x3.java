package X;

import java.util.LinkedHashMap;

/* renamed from: X.5x3  reason: invalid class name and case insensitive filesystem */
public final class C119485x3 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass5RO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119485x3(AnonymousClass5RO r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r = C18320x8.A0r();
        int i = 0;
        for (Object next : this.this$0.A02()) {
            int i2 = i + 1;
            if (i < 0) {
                throw C18280x3.A0X();
            }
            AnonymousClass0x2.A1I(Integer.valueOf(AnonymousClass001.A0K(next)), A0r, i);
            i = i2;
        }
        return A0r;
    }
}
