package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.2oG  reason: invalid class name and case insensitive filesystem */
public class C54152oG {
    public final C15790rw A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final AnonymousClass36E A03;
    public final AnonymousClass2FU A04;
    public final C56612sH A05;
    public final AnonymousClass33p A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass4FV A08;
    public final C383727h A09;
    public final C60592yo A0A;
    public final AnonymousClass2RV A0B;
    public final AnonymousClass9U5 A0C;
    public final AnonymousClass9U4 A0D;
    public final C53022mQ A0E;
    public final C194639Tx A0F;
    public final AnonymousClass4BY A0G;
    public final C53322mu A0H;

    public final void A00(Jid jid, Jid jid2, String str, String str2, int i, boolean z) {
        if (i != 490 || !this.A07.A0Y(C58422vE.A02, 3280)) {
            i = 487;
        }
        C50412i8 r3 = new C50412i8();
        Jid jid3 = jid;
        if (z) {
            jid3 = jid2;
        }
        r3.A02 = jid3;
        r3.A05 = "message";
        r3.A07 = str;
        r3.A08 = str2;
        if (!z) {
            jid = jid2;
        }
        r3.A01 = jid;
        r3.A02("error", String.valueOf(i));
        this.A00.AwB(r3.A01());
        C24451Xl r1 = new C24451Xl();
        r1.A00 = "message";
        r1.A01 = str2;
        this.A08.BhD(r1);
    }

    public final void A01(AnonymousClass3ST r7, AnonymousClass36K r8) {
        int i;
        C45442a1 r0;
        if (!(C627336j.A02(r7.A18) instanceof C95804uY)) {
            String A0L = AnonymousClass36K.A0L(r8, "mediatype");
            C45442a1 A002 = AnonymousClass28S.A00(r8);
            if (A002.A02 != null || "livelocation".equals(A0L) || !this.A07.A0Y(C58422vE.A02, 2187)) {
                if (A002.A00 == 2) {
                    r7.A0O = A002;
                } else {
                    r7.A0N = A002;
                }
                int A0b = r8.A0b("count", 0);
                if (r7.A0Y == null || r7.BCI() == A0b) {
                    r7.A0Y = Integer.valueOf(A0b);
                    String A0L2 = AnonymousClass36K.A0L(r8, "mediareason");
                    if (A0L2 != null) {
                        if (A0L2.equals("retry")) {
                            Boolean bool = r7.A0U;
                            if (bool == null || bool.booleanValue()) {
                                r7.A0U = true;
                            } else {
                                throw AnonymousClass24Y.A01("mediareason retry may not mismatch between two enc nodes in the same message");
                            }
                        } else {
                            throw AnonymousClass24Y.A02("unknown mediareason ", A0L2, AnonymousClass001.A0o());
                        }
                    }
                    int A0b2 = r8.A0b("duration", -1);
                    if (A0b2 >= 0) {
                        r7.A0V = Integer.valueOf(A0b2);
                    }
                    C45442a1 r1 = r7.A0O;
                    if (r1 != null && (r0 = r7.A0N) != null && r1.A01 != r0.A01) {
                        throw AnonymousClass24Y.A01("ciphertext version may not mismatch between two enc nodes in the same message");
                    } else if ("hide".equals(AnonymousClass36K.A0L(r8, "decrypt-fail")) || "peer".equals(r7.A0i) || (i = r7.A01) == 8 || i == 7) {
                        r7.A00 = 1;
                    } else {
                        r7.A00 = 0;
                    }
                } else {
                    throw AnonymousClass24Y.A01("retry count may not mismatch between two enc nodes in the same message");
                }
            } else {
                C55682qk r3 = this.A01;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(A002.A00);
                A0o.append(":");
                int i2 = A002.A01;
                throw AnonymousClass24Y.A01(AnonymousClass000.A0Y("missing ciphertext ", C55682qk.A03(r3, "missing-ciphertext", AnonymousClass000.A0h(A0o, i2), true), i2));
            }
        } else {
            throw AnonymousClass24Y.A01("Received enc message for newsletters");
        }
    }

    public C54152oG(C15790rw r2, C55682qk r3, C56972sr r4, AnonymousClass36E r5, AnonymousClass2FU r6, C56612sH r7, AnonymousClass33p r8, AnonymousClass1VX r9, AnonymousClass4FV r10, C383727h r11, C60592yo r12, AnonymousClass2RV r13, AnonymousClass9U5 r14, AnonymousClass9U4 r15, C53022mQ r16, C194639Tx r17, AnonymousClass4BY r18, C53322mu r19) {
        this.A05 = r7;
        this.A07 = r9;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r10;
        this.A09 = r11;
        this.A03 = r5;
        this.A0D = r15;
        this.A0G = r18;
        this.A0H = r19;
        this.A0F = r17;
        this.A06 = r8;
        this.A0B = r13;
        this.A0C = r14;
        this.A04 = r6;
        this.A00 = r2;
        this.A0A = r12;
        this.A0E = r16;
    }
}
