package X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.0oa  reason: invalid class name and case insensitive filesystem */
public final class C14070oa extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C08660eq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14070oa(C08660eq r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C08660eq r0;
        Context context;
        String str;
        C03410Ka r4;
        if (Build.VERSION.SDK_INT >= 23) {
            C08660eq r1 = this.this$0;
            if (r1.A03 != null && r1.A06) {
                File A0A = AnonymousClass002.A0A(C02970Ih.A00(r1.A01), this.this$0.A03);
                context = this.this$0.A01;
                str = A0A.getAbsolutePath();
                r4 = new C03410Ka();
                r0 = this.this$0;
                C001000s r12 = new C001000s(context, r0.A02, r4, str, r0.A05);
                C02950If.A00(r12, this.this$0.A00);
                return r12;
            }
        }
        r0 = this.this$0;
        context = r0.A01;
        str = r0.A03;
        r4 = new C03410Ka();
        C001000s r122 = new C001000s(context, r0.A02, r4, str, r0.A05);
        C02950If.A00(r122, this.this$0.A00);
        return r122;
    }
}
