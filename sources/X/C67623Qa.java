package X;

import android.os.Message;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3Qa  reason: invalid class name and case insensitive filesystem */
public final class C67623Qa implements AnonymousClass4DA {
    public final AnonymousClass2OL A00;
    public final AnonymousClass31C A01;

    public C67623Qa(AnonymousClass2OL r2, AnonymousClass31C r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean BFA(Message message, int i) {
        C162457s7.A0J(message, 1);
        if (i != 254) {
            return false;
        }
        Object obj = message.obj;
        C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.String");
        AnonymousClass2OL r2 = this.A00;
        C162457s7.A0J(obj, 0);
        r2.A01.A00("GPIA_DURATION");
        JniBridge.jvidispatchIOOOO(2, obj, r2.A00.A00, new AnonymousClass3As(r2, this), AnonymousClass0x9.A0r(r2.A02));
        return true;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 254;
        return A0E;
    }
}
