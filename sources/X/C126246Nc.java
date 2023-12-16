package X;

import com.facebook.stash.core.FileStash;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Nc  reason: invalid class name and case insensitive filesystem */
public class C126246Nc extends C1683084x {
    public static final long A03;
    public static final long A04;
    public final C183718qV A00;
    public final Set A01 = Collections.synchronizedSet(AnonymousClass002.A0K());
    public volatile long A02 = A03;

    static {
        long millis = TimeUnit.HOURS.toMillis(4);
        A04 = millis;
        A03 = millis * -2;
    }

    public C126246Nc(C183718qV r3, FileStash fileStash) {
        super(fileStash);
        this.A00 = r3;
    }
}
