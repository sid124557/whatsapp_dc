package X;

import java.io.Writer;

/* renamed from: X.3Tk  reason: invalid class name and case insensitive filesystem */
public final class C68503Tk implements AnonymousClass4DS {
    public final AnonymousClass4DS A00;
    public final C84864Ea A01;
    public final Writer A02;

    public String BJX() {
        return this.A00.BJX();
    }

    public AnonymousClass36K BLZ() {
        AnonymousClass36K BLZ = this.A00.BLZ();
        try {
            this.A02.write("RECV ");
            this.A01.Bsa(BLZ);
        } catch (Exception unused) {
        }
        return BLZ;
    }

    public C68503Tk(AnonymousClass4DS r2, Writer writer) {
        this.A00 = r2;
        this.A02 = writer;
        this.A01 = new C68533Tn(writer);
    }
}
