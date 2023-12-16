package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vR  reason: invalid class name and case insensitive filesystem */
public final class C78703vR extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass3YS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78703vR(AnonymousClass3YS r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List<C60792zA> list = this.this$0.A01;
        ArrayList A0c = C73783g4.A0c(list);
        for (C60792zA r0 : list) {
            A0c.add(new C35251wZ(r0.A01));
        }
        return new C35721xK(new C35481ww(new C35381wm(this.this$0.A00, 7)), (List) A0c);
    }
}
