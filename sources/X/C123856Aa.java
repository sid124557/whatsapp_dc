package X;

import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.registration.passkeys.PasskeyFacade;
import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;

/* renamed from: X.6Aa  reason: invalid class name and case insensitive filesystem */
public class C123856Aa implements AnonymousClass4BG {
    public Object A00;
    public final int A01;

    public C123856Aa(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public PasskeyFacade B05(AnonymousClass5OE r10) {
        AnonymousClass5OE r7 = r10;
        switch (this.A01) {
            case 0:
                C123856Aa r2 = this;
                PasskeyAndroidApiImpl A3S = C107695bk.A3S(new PasskeyAndroidApiImpl(((C118075sx) r2.A00).A03.A00.ANk()));
                PasskeyAndroidApiImpl passkeyAndroidApiImpl = A3S;
                C105265Uf ANk = ((C118075sx) r2.A00).A03.A00.ANk();
                return new PasskeyFacade((AnonymousClass33p) ((C118075sx) r2.A00).A03.Aaj.get(), A3S, ANk, r7, (PasskeyServerApiImpl) ((C118075sx) r2.A00).A03.A00.A0u.get());
            case 1:
                C123856Aa r22 = this;
                PasskeyAndroidApiImpl A3S2 = C107695bk.A3S(new PasskeyAndroidApiImpl(((C118065sw) r22.A00).A02.A00.ANk()));
                PasskeyAndroidApiImpl passkeyAndroidApiImpl2 = A3S2;
                C105265Uf ANk2 = ((C118065sw) r22.A00).A02.A00.ANk();
                return new PasskeyFacade((AnonymousClass33p) ((C118065sw) r22.A00).A02.Aaj.get(), A3S2, ANk2, r7, (PasskeyServerApiImpl) ((C118065sw) r22.A00).A02.A00.A0u.get());
            default:
                return null;
        }
    }
}
