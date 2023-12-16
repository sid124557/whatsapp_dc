package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Objects;

/* renamed from: X.2bf  reason: invalid class name and case insensitive filesystem */
public class C46462bf {
    public final C621133n A00;
    public final AnonymousClass1VX A01;
    public final C43662Sz A02;
    public final AnonymousClass4FY A03;
    public final AnonymousClass4FS A04;

    public C48472ex A00(C54562ov r26, C25811b7 r27, AnonymousClass1gS r28, C45442a1 r29, boolean z) {
        Integer num;
        C836749i r11;
        C48472ex r1;
        byte[] bArr;
        C45442a1 r2 = r29;
        if (r29 != null) {
            num = Integer.valueOf(r2.A00);
        } else {
            num = null;
        }
        C43662Sz r112 = this.A02;
        AnonymousClass4FY r9 = this.A03;
        r112.A05.A0X(5760);
        int B5X = r9.B5X();
        C54562ov r10 = r26;
        C25811b7 r3 = r27;
        boolean z2 = z;
        if (B5X == 1) {
            if (z) {
                C626936e.A0E(r9 instanceof AnonymousClass3ST, "Only message stanza is supported for enc v1");
                r3.A0D = AnonymousClass0x2.A0U();
                r11 = new AnonymousClass3G0(C64333Db.A3D(r112.A01.A00.A01), (AnonymousClass3ST) r9);
            } else {
                throw AnonymousClass001.A0e("receipt sending has been disabled for a v1 encrypted message");
            }
        } else if (B5X == 2) {
            r3.A0D = 2L;
            if (num == null || num.intValue() != 4) {
                r11 = r112.A02.A00(r10, r3, r9, num, z2, true);
            } else {
                AnonymousClass2DA r5 = r112.A03;
                AnonymousClass3G6 A002 = r112.A02.A00(r10, r3, r9, num, false, false);
                C64333Db r4 = r5.A00.A01;
                AnonymousClass1VX A4B = C64333Db.A4B(r4);
                C55832qz A8F = C64333Db.A8F(r4);
                r11 = new AnonymousClass3G5((AnonymousClass36E) r4.ALM.get(), A002, (C60532yi) r4.AFw.get(), (C54762pF) r4.AKr.get(), (C49822h9) r4.ALY.get(), A4B, (C383727h) r4.A3N.get(), (C47532dP) r4.A7m.get(), (C54892pS) r4.ALz.get(), (AnonymousClass33Y) r4.ATJ.get(), r9, A8F, num);
            }
        } else {
            C64333Db r7 = r112.A00.A00.A01;
            r11 = new AnonymousClass3G4(r3, (C47532dP) r7.A7m.get(), (AnonymousClass33Y) r7.ATJ.get(), (AnonymousClass1gS) r112.A06.A01(0, r9.B9D()), r9, B5X, z2);
        }
        if (r29 == null) {
            return null;
        }
        int i = r2.A00;
        if (i == 0) {
            r3.A05 = 0;
            return this.A00.A03(r11, r10, r2.A02);
        } else if (i == 1) {
            r3.A05 = 1;
            return this.A00.A04(r11, r10, r2.A02);
        } else if (i == 2) {
            r3.A05 = 2;
            C95814uZ A022 = C627336j.A02(r9.BAb());
            String A07 = C627336j.A07(C627336j.A02(r9.BC2()));
            String A072 = C627336j.A07(A022);
            if (!(A022 instanceof AnonymousClass1fS)) {
                C626936e.A06(A07);
                A072 = A07;
            }
            C54422oh r32 = new C54422oh(r10, A072);
            C621133n r52 = this.A00;
            byte[] bArr2 = r2.A02;
            C73523fe A012 = C614730x.A01(r52, r32);
            try {
                if (r52.A0N.A0Y(C58422vE.A02, 188)) {
                    JniBridge jniBridge = r52.A01.A03;
                    String str = r32.A01;
                    C54562ov r0 = r32.A00;
                    C40962Ik r02 = new C40962Ik((NativeHolder) JniBridge.jvidispatchOIOOOOO(0, (long) r0.A00, str, AnonymousClass31S.A01(r0), r11, C18300x5.A0I(jniBridge), bArr2));
                    JniBridge.getInstance();
                    NativeHolder nativeHolder = r02.A00;
                    r1 = C48472ex.A00(nativeHolder, (byte[]) JniBridge.jvidispatchOIO(0, (long) 53, nativeHolder));
                } else {
                    C625535n r22 = r52.A00;
                    C48882fd r53 = r22.A02.A02;
                    C48822fX A023 = AnonymousClass31S.A02(r32);
                    try {
                        Objects.requireNonNull(r11);
                        C73043eq r33 = new C73043eq(r11);
                        if (r22.A04.A03()) {
                            synchronized (AnonymousClass324.A00) {
                                bArr = AnonymousClass324.A00(r53, r33, A023, bArr2);
                            }
                        } else {
                            bArr = AnonymousClass324.A00(r53, r33, A023, bArr2);
                        }
                        r1 = C625535n.A00((Exception) null, bArr, 0);
                    } catch (C377323u e) {
                        r1 = C625535n.A00(e, (byte[]) null, -1007);
                    } catch (AnonymousClass24X e2) {
                        r1 = C625535n.A00(e2, (byte[]) null, -1005);
                    } catch (C377123s e3) {
                        r1 = C625535n.A00(e3, (byte[]) null, -1001);
                    } catch (AnonymousClass24T e4) {
                        r1 = C625535n.A00(e4, (byte[]) null, -1008);
                    } catch (Exception e5) {
                        Log.w("axolotl", e5);
                        r1 = C625535n.A00(e5, (byte[]) null, -1000);
                    }
                }
                A012.close();
                return r1;
            } catch (Throwable th) {
                try {
                    A012.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (i == 4) {
            r3.A05 = C18290x4.A0a();
            if (!this.A01.A0Y(C58422vE.A02, 4274)) {
                return new C48472ex(r2.A02, -1006);
            }
            C70113Zy.A01(this.A04, r11, r2, 3);
            return new C48472ex(r2.A02, 0);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass0x2.A17(r9, "decryptmessagerunnable/axolotl unrecognized ciphertext type; message.key=", A0o);
            C18260x0.A0z(" type=", A0o, i);
            AnonymousClass1gS r03 = r28;
            if (r28 != null) {
                r03.A02 = false;
            }
            r3.A00 = Boolean.FALSE;
            r3.A07 = C18310x6.A0e();
            return null;
        }
    }

    public C46462bf(C621133n r1, AnonymousClass1VX r2, C43662Sz r3, AnonymousClass4FY r4, AnonymousClass4FS r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
