package X;

/* renamed from: X.1A1  reason: invalid class name */
public final class AnonymousClass1A1 extends C130546c9 implements C181378mf {
    public AnonymousClass1A1() {
        super(AnonymousClass1ET.DEFAULT_INSTANCE);
    }

    public static void A00(AnonymousClass1A1 r1, AnonymousClass2z0 r2) {
        r1.A0C(C627336j.A07(r2.A00));
        r1.A0D(r2.A02);
    }

    public void A09() {
        AnonymousClass1ET r1 = (AnonymousClass1ET) C18320x8.A0C(this);
        r1.bitField0_ &= -2;
        r1.remoteJid_ = AnonymousClass1ET.DEFAULT_INSTANCE.remoteJid_;
    }

    public void A0A(String str) {
        AnonymousClass1ET r1 = (AnonymousClass1ET) C18320x8.A0C(this);
        str.getClass();
        r1.bitField0_ |= 4;
        r1.id_ = str;
    }

    public void A0B(String str) {
        AnonymousClass1ET r1 = (AnonymousClass1ET) C18320x8.A0C(this);
        str.getClass();
        r1.bitField0_ |= 8;
        r1.participant_ = str;
    }

    public void A0C(String str) {
        AnonymousClass1ET r1 = (AnonymousClass1ET) C18320x8.A0C(this);
        str.getClass();
        r1.bitField0_ |= 1;
        r1.remoteJid_ = str;
    }

    public void A0D(boolean z) {
        AnonymousClass1ET r1 = (AnonymousClass1ET) C18320x8.A0C(this);
        r1.bitField0_ |= 2;
        r1.fromMe_ = z;
    }
}
