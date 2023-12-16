package X;

import java.util.regex.Matcher;

/* renamed from: X.43S  reason: invalid class name */
public final class AnonymousClass43S extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C73613fn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43S(C73613fn r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        Matcher matcher = this.this$0.A00.A01;
        C175698Zj A02 = C175708Zk.A02(matcher.start(A0K), matcher.end(A0K));
        if (A02.A00 < 0) {
            return null;
        }
        String group = matcher.group(A0K);
        C162457s7.A0D(group);
        return new C52112ku(group, A02);
    }
}
