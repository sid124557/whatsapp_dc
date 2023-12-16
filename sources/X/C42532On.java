package X;

import java.util.Map;

/* renamed from: X.2On  reason: invalid class name and case insensitive filesystem */
public final class C42532On {
    public final C56972sr A00;
    public final Map A01;
    public final C116975rB A02 = new C116975rB("\\$\\[(.*?)\\]");

    public C42532On(C56972sr r5) {
        C162457s7.A0J(r5, 1);
        this.A00 = r5;
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A04("USER.PHONE_NUMBER", new AnonymousClass27G(this, 8), r2);
        AnonymousClass3Z6.A09("USER.PUSH_NAME", new AnonymousClass27G(this, 9), r2, 1);
        this.A01 = C73813g7.A0F(r2);
    }
}
