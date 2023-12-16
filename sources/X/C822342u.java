package X;

import java.util.regex.Matcher;

/* renamed from: X.42u  reason: invalid class name and case insensitive filesystem */
public final class C822342u extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C42532On this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C822342u(C42532On r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Object invoke;
        AnonymousClass2PP r6 = (AnonymousClass2PP) obj;
        C162457s7.A0J(r6, 0);
        Matcher matcher = r6.A02.A00.A01;
        C175698Zj A02 = C175708Zk.A02(matcher.start(1), matcher.end(1));
        if (A02.A00 >= 0) {
            String group = matcher.group(1);
            C162457s7.A0D(group);
            str = new C52112ku(group, A02).A00;
        } else {
            str = null;
        }
        C188498yz r0 = (C188498yz) this.this$0.A01.get(str);
        if (r0 != null && (invoke = ((AnonymousClass4GP) r0).invoke()) != null) {
            return invoke;
        }
        String group2 = r6.A01.group();
        C162457s7.A0D(group2);
        return group2;
    }
}
