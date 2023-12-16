package X;

import java.util.Calendar;

/* renamed from: X.40q  reason: invalid class name and case insensitive filesystem */
public final class C816740q extends C829045j implements AnonymousClass4GP {
    public static final C816740q A00 = new C816740q();

    public C816740q() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Calendar instance = Calendar.getInstance();
        instance.add(6, 1);
        if (instance.get(12) >= 30) {
            instance.add(11, 1);
        }
        instance.set(12, 0);
        instance.set(13, 0);
        return instance;
    }
}
