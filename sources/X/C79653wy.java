package X;

import java.util.Map;

/* renamed from: X.3wy  reason: invalid class name and case insensitive filesystem */
public final class C79653wy extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass2RF $systemMessagePlatform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79653wy(AnonymousClass2RF r2) {
        super(0);
        this.$systemMessagePlatform = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C43612Su r2;
        AnonymousClass2RF r5 = this.$systemMessagePlatform;
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(AnonymousClass4G7.class);
        synchronized (r5) {
            Map map = r5.A02;
            Object obj = map.get(A1E);
            if (obj == null) {
                C49862hD r1 = (C49862hD) r5.A03.getValue();
                C162457s7.A0D(r1);
                AnonymousClass2O9 r0 = (AnonymousClass2O9) r5.A04.getValue();
                C162457s7.A0D(r0);
                obj = new C43612Su(r1, r0, A1E);
                map.put(A1E, obj);
            }
            r2 = (C43612Su) obj;
        }
        return r2;
    }
}
