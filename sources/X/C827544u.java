package X;

/* renamed from: X.44u  reason: invalid class name and case insensitive filesystem */
public final class C827544u extends C829045j implements AnonymousClass4GQ {
    public static final C827544u A00 = new C827544u();

    public C827544u() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3Z6 r4 = (AnonymousClass3Z6) obj;
        C162457s7.A0J(r4, 0);
        C24491Xp r2 = new C24491Xp();
        Object obj2 = r4.first;
        C162457s7.A0D(obj2);
        r2.A00 = C18290x4.A0h((String) obj2);
        r2.A01 = C18280x3.A0U((Number) r4.second);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DroppedEventSharedPrefs/logAllDroppedEventsAndClear event: ");
        A0o.append(r2);
        A0o.append(" count:");
        C18260x0.A0m(r2.A01, A0o);
        return r2;
    }
}
