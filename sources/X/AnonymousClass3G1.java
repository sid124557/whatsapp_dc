package X;

import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3G1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G1 implements C836749i {
    public final /* synthetic */ C54562ov A00;
    public final /* synthetic */ AnonymousClass1gL A01;
    public final /* synthetic */ AnonymousClass39T A02;

    public final void BF5(byte[] bArr) {
        StringBuilder A0o;
        String str;
        char c;
        AnonymousClass24X th;
        AnonymousClass1gL r4 = this.A01;
        AnonymousClass39T r3 = this.A02;
        C54562ov r5 = this.A00;
        byte[] A022 = C615231c.A02((C25811b7) null, (AnonymousClass1gS) null, bArr);
        if (A022 == null) {
            A0o = AnonymousClass001.A0o();
            str = "axolotl derived invalid plaintext; stanzaKey=";
        } else {
            try {
                AnonymousClass1EU A002 = AnonymousClass1EU.A00(A022);
                List A012 = C624835f.A01(A002);
                if (A012.size() != 0) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append("axolotl received an invalid protobuf; stanzaKey=");
                    A0o.append(r3);
                    A0o.append("; messageTypes=");
                    A0o.append(A012);
                    AnonymousClass0x2.A19(A0o);
                } else if ((A002.bitField0_ & 16384) != 0) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "axolotl received sender key distribution message; stanzaKey=", r3);
                    AnonymousClass1BQ r2 = A002.fastRatchetKeySenderKeyDistributionMessage_;
                    if (r2 == null) {
                        r2 = AnonymousClass1BQ.DEFAULT_INSTANCE;
                    }
                    int i = r2.bitField0_;
                    if ((i & 1) == 0 || (i & 2) == 0) {
                        A0o = AnonymousClass001.A0o();
                        str = "axolotl received incomplete sender key distribution message; stanzaKey=";
                    } else {
                        C54422oh A003 = C54422oh.A00(r5, C135156kD.A00);
                        C621133n r1 = r4.A03;
                        byte[] A07 = r2.axolotlSenderKeyDistributionMessage_.A07();
                        C73523fe A013 = C614730x.A01(r1, A003);
                        try {
                            C625535n r12 = r1.A00;
                            if (A07.length != 0) {
                                C73053er r22 = new C73053er(A07);
                                AnonymousClass2XJ r0 = new AnonymousClass2XJ(r12.A02.A01);
                                C48822fX A023 = AnonymousClass31S.A02(A003);
                                synchronized (C39312Bm.A00) {
                                    try {
                                        C48872fc r6 = r0.A00;
                                        C59142wQ A004 = r6.A00(A023);
                                        int i2 = r22.A00;
                                        int i3 = r22.A01;
                                        byte[][] bArr2 = r22.A04;
                                        AnonymousClass3ZK r11 = r22.A02;
                                        LinkedList linkedList = A004.A00;
                                        linkedList.addFirst(new C59152wR(r11, AnonymousClass47s.A00, bArr2, i2, i3));
                                        if (linkedList.size() > 5) {
                                            linkedList.removeLast();
                                        }
                                        r6.A01(A023, A004);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                c = 0;
                                A013.close();
                                if (c == 64531) {
                                    A0o = AnonymousClass001.A0o();
                                    str = "axolotl received invalid sender key distribution message; stanzaKey=";
                                } else if (c == 64529) {
                                    A0o = AnonymousClass001.A0o();
                                    str = "axolotl received legacy sender key distribution message; stanzaKey=";
                                } else {
                                    return;
                                }
                            } else {
                                th = new AnonymousClass24X("Data is empty");
                                throw th;
                            }
                        } catch (C377323u e) {
                            Log.w("axolotl", e);
                            c = 64529;
                        } catch (AnonymousClass24X e2) {
                            Log.w("axolotl", e2);
                            c = 64531;
                        } catch (Exception e3) {
                            Log.w("axolotl", e3);
                            c = 64536;
                        } catch (Throwable th3) {
                            try {
                                A013.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                } else {
                    return;
                }
            } catch (AnonymousClass6u5 e4) {
                Log.w(AnonymousClass000.A0P(r3, "axolotl derived plaintext does not represent valid protocol buffer; stanzaKey=", AnonymousClass001.A0o()), e4);
                return;
            }
        }
        A0o.append(str);
        A0o.append(r3);
        AnonymousClass0x2.A19(A0o);
    }

    public /* synthetic */ AnonymousClass3G1(C54562ov r1, AnonymousClass1gL r2, AnonymousClass39T r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
