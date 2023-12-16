package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2ba  reason: invalid class name and case insensitive filesystem */
public final class C46412ba {
    public final AnonymousClass2F6 A00;
    public final C56982ss A01;
    public final C72303dV A02;
    public final C56662sM A03;
    public final Map A04;

    public final C620833k A00(C28011fL r2) {
        C162457s7.A0J(r2, 0);
        return (C620833k) this.A04.get(r2);
    }

    public C46412ba(C56982ss r3, C72303dV r4, C56662sM r5) {
        C18260x0.A0V(r3, r5, r4);
        ConcurrentHashMap A1D = AnonymousClass0x9.A1D();
        AnonymousClass2F6 r0 = new AnonymousClass2F6();
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = A1D;
        this.A00 = r0;
    }
}
