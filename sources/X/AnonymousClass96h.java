package X;

import android.os.Handler;
import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.96h  reason: invalid class name */
public class AnonymousClass96h extends AnonymousClass9ZP implements C203679o8 {
    public static volatile AnonymousClass9SL A01;
    public final Handler A00;

    public static AnonymousClass9SL A00() {
        AnonymousClass9SL r0;
        if (A01 != null) {
            return A01;
        }
        synchronized (AnonymousClass9SL.class) {
            if (A01 == null) {
                A01 = new AnonymousClass9SL();
            }
            r0 = A01;
        }
        return r0;
    }

    public AnonymousClass96h(C203449ni r2) {
        super(r2);
        this.A00 = AnonymousClass000.A0A();
    }

    public Handler B82(String str) {
        Pair pair;
        HashMap hashMap = A00().A00;
        synchronized (hashMap) {
            pair = (Pair) hashMap.get(str);
        }
        if (pair != null) {
            return (Handler) pair.second;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Handler not found: ");
        throw AnonymousClass000.A0F(str, A0o);
    }

    public AnonymousClass9LH B8v() {
        return C203679o8.A00;
    }

    public AnonymousClass96h() {
        this(new AnonymousClass9Yy());
    }
}
