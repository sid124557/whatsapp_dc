package X;

import java.util.NoSuchElementException;

/* renamed from: X.5yo  reason: invalid class name and case insensitive filesystem */
public final class C120575yo extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C102865Ko this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120575yo(C102865Ko r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        boolean z = false;
        C175698Zj A02 = C175708Zk.A02(0, AnonymousClass0x2.A09(this.this$0.A06));
        try {
            if (!A02.A01()) {
                int i2 = A02.A01;
                int i3 = A02.A00;
                if (i2 < Integer.MAX_VALUE) {
                    i = C158997kv.A01.A03(i3, i2 + 1);
                } else if (i3 > Integer.MIN_VALUE) {
                    i = C158997kv.A01.A03(i3 - 1, Integer.MAX_VALUE) + 1;
                } else {
                    i = C158997kv.A01.A00();
                }
                if (i == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            throw AnonymousClass001.A0c(AnonymousClass000.A0P(A02, "Cannot get random in empty range: ", AnonymousClass001.A0o()));
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
