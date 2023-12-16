package X;

import java.util.HashMap;

/* renamed from: X.0XL  reason: invalid class name */
public class AnonymousClass0XL {
    public final C17190ui A00;
    public final AnonymousClass0N2 A01;
    public final AnonymousClass0N3 A02;

    public AnonymousClass0XL(C17190ui r2, AnonymousClass0N2 r3, AnonymousClass0N3 r4) {
        C162457s7.A0J(r3, 1);
        C162457s7.A0J(r2, 2);
        C162457s7.A0J(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public C05550Ty A01(Class cls) {
        C162457s7.A0J(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A02(cls, AnonymousClass000.A0V("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName, AnonymousClass001.A0o()));
        }
        throw AnonymousClass001.A0c("Local and anonymous classes can not be ViewModels");
    }

    public C05550Ty A02(Class cls, String str) {
        C05550Ty r1;
        C04100Mu r12;
        C162457s7.A0J(str, 0);
        C162457s7.A0J(cls, 1);
        HashMap hashMap = this.A01.A00;
        C05550Ty r2 = (C05550Ty) hashMap.get(str);
        if (cls.isInstance(r2)) {
            C17190ui r13 = this.A00;
            if ((r13 instanceof C04100Mu) && (r12 = (C04100Mu) r13) != null) {
                C162457s7.A0D(r2);
                r12.A01(r2);
            } else if (r2 == null) {
                throw AnonymousClass001.A0g("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            }
            return r2;
        }
        C010208a r22 = new C010208a(this.A02);
        r22.A00.put(C08380eM.A01, str);
        try {
            r1 = this.A00.B09(r22, cls);
        } catch (AbstractMethodError unused) {
            r1 = this.A00.Azr(cls);
        }
        C05550Ty r0 = (C05550Ty) hashMap.put(str, r1);
        if (r0 != null) {
            r0.A0C();
        }
        return r1;
    }

    public static final C17190ui A00(C15940sD r1) {
        if (!(r1 instanceof C16640tj)) {
            return AnonymousClass0IX.A00();
        }
        C17190ui B6u = ((C16640tj) r1).B6u();
        C162457s7.A0D(B6u);
        return B6u;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0XL(X.C15940sD r4) {
        /*
            r3 = this;
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            X.0N2 r2 = r4.BEL()
            X.C162457s7.A0D(r2)
            X.0ui r1 = A00(r4)
            boolean r0 = r4 instanceof X.C16640tj
            if (r0 == 0) goto L_0x001d
            X.0tj r4 = (X.C16640tj) r4
            X.0N3 r0 = r4.B6t()
        L_0x0019:
            r3.<init>(r1, r2, r0)
            return
        L_0x001d:
            X.08b r0 = X.AnonymousClass08b.A00
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XL.<init>(X.0sD):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0XL(X.C17190ui r3, X.C15940sD r4) {
        /*
            r2 = this;
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            r0 = 2
            X.C162457s7.A0J(r3, r0)
            X.0N2 r1 = r4.BEL()
            X.C162457s7.A0D(r1)
            boolean r0 = r4 instanceof X.C16640tj
            if (r0 == 0) goto L_0x001d
            X.0tj r4 = (X.C16640tj) r4
            X.0N3 r0 = r4.B6t()
        L_0x0019:
            r2.<init>(r3, r1, r0)
            return
        L_0x001d:
            X.08b r0 = X.AnonymousClass08b.A00
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XL.<init>(X.0ui, X.0sD):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass0XL(C17190ui r2, AnonymousClass0N2 r3) {
        this(r2, r3, AnonymousClass08b.A00);
        C162457s7.A0J(r3, 1);
    }
}
