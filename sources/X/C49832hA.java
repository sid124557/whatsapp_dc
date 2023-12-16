package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2hA  reason: invalid class name and case insensitive filesystem */
public class C49832hA {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass2WM A02;
    public final AnonymousClass4FS A03;
    public final AtomicInteger A04;

    public C49832hA(AnonymousClass1VX r3, AnonymousClass4FV r4, AnonymousClass2WM r5, AnonymousClass4FS r6) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.A04 = atomicInteger;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
        this.A02 = r5;
        atomicInteger.set(1);
    }

    public void A00(UserJid userJid, Integer num, Integer num2) {
        Integer A0b = C18290x4.A0b();
        if (this.A00.A0Y(C58422vE.A02, 1669)) {
            this.A03.BkM(new C71453c8(this, userJid, num, A0b, num2, 10));
        }
    }

    public void A01(UserJid userJid, Integer num, Integer num2) {
        Integer A0c = C18290x4.A0c();
        if (this.A00.A0Y(C58422vE.A02, 1669)) {
            this.A03.BkM(new C71453c8(this, userJid, num, A0c, num2, 10));
        }
    }
}
