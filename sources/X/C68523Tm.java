package X;

import android.os.HandlerThread;
import java.io.Writer;

/* renamed from: X.3Tm  reason: invalid class name and case insensitive filesystem */
public final class C68523Tm implements C84864Ea {
    public HandlerThread A00;
    public final C84864Ea A01;
    public final C84864Ea A02;
    public final Writer A03;

    public void Bsb(AnonymousClass36K r3, int i) {
        this.A01.Bsb(r3, 3);
        try {
            this.A03.write("SEND ");
            this.A02.Bsa(r3);
        } catch (Exception unused) {
        }
        HandlerThread handlerThread = this.A00;
        if (handlerThread != null) {
            C626936e.A03(handlerThread);
        }
    }

    public void A00(HandlerThread handlerThread) {
        this.A00 = handlerThread;
    }

    public void BqF() {
        this.A01.BqF();
        this.A03.write("SEND ");
        this.A02.BqF();
    }

    public void Bsa(AnonymousClass36K r3) {
        this.A01.Bsa(r3);
        try {
            this.A03.write("SEND ");
            this.A02.Bsa(r3);
        } catch (Exception unused) {
        }
        HandlerThread handlerThread = this.A00;
        if (handlerThread != null) {
            C626936e.A03(handlerThread);
        }
    }

    public C68523Tm(C84864Ea r2, Writer writer) {
        this.A01 = r2;
        this.A03 = writer;
        this.A02 = new C68533Tn(writer);
    }
}
