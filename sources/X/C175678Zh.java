package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.8Zh  reason: invalid class name and case insensitive filesystem */
public abstract class C175678Zh extends C158997kv {
    public Random A07() {
        if (this instanceof C175668Zg) {
            ThreadLocalRandom current = ThreadLocalRandom.current();
            C162457s7.A0D(current);
            return current;
        }
        Object obj = ((C175658Zf) this).A00.get();
        C162457s7.A0D(obj);
        return (Random) obj;
    }
}
