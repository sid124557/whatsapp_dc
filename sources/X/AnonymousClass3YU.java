package X;

/* renamed from: X.3YU  reason: invalid class name */
public final class AnonymousClass3YU implements C183538qC, AnonymousClass4GO {
    public static final AnonymousClass3YU A01 = new AnonymousClass3YU((Object) null);
    public final Object A00;

    public static AnonymousClass4GO A00(Object obj) {
        if (obj != null) {
            return new AnonymousClass3YU(obj);
        }
        throw AnonymousClass001.A0g("instance cannot be null");
    }

    public AnonymousClass3YU(Object obj) {
        this.A00 = obj;
    }

    public Object get() {
        return this.A00;
    }
}
