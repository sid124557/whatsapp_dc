package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.AbstractMap;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: X.8Q0  reason: invalid class name */
public abstract class AnonymousClass8Q0 implements C183618qL {
    public static int A00(C183618qL[] r0, int i, int i2) {
        return i2 + r0[i].Bqk().A0P().A0N();
    }

    public static IllegalArgumentException A01(C176958dq r2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(r2.A0U());
        return new IllegalArgumentException(sb.toString());
    }

    public static String A02(C176608dH r0) {
        return C162077rB.A02(C176898dk.A0A(r0.A01).A00);
    }

    public static C177088e3 A03(C176908dl r0) {
        return r0.A01.Bqk();
    }

    public static C177088e3 A04(C183618qL[] r0, int i) {
        return r0[i].Bqk().A0O();
    }

    public static void A05(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA512WITHCVC-ECDSA");
        abstractMap.put(C186728vq.A00, "XMSS");
        abstractMap.put(C186728vq.A01, "XMSSMT");
        abstractMap.put(new C176768dX("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        abstractMap.put(new C176768dX("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        abstractMap.put(new C176768dX("1.2.840.10040.4.3"), "SHA1WITHDSA");
        abstractMap.put(C186928wA.A0X, "SHA1WITHECDSA");
        abstractMap.put(C186928wA.A0Z, "SHA224WITHECDSA");
        abstractMap.put(C186928wA.A0a, "SHA256WITHECDSA");
        abstractMap.put(C186928wA.A0b, "SHA384WITHECDSA");
        abstractMap.put(C186928wA.A0c, "SHA512WITHECDSA");
        abstractMap.put(C186788vw.A0B, "SHA1WITHRSA");
        abstractMap.put(C186788vw.A05, "SHA1WITHDSA");
        abstractMap.put(C186918w9.A01, "SHA224WITHDSA");
        abstractMap.put(C186918w9.A02, "SHA256WITHDSA");
    }

    public static void A06(String str, String str2, String str3, StringBuffer stringBuffer) {
        stringBuffer.append("    ");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str2);
    }

    public static void A07(C183618qL r1, C161377pW r2, int i, boolean z) {
        r2.A03(new C177028dx(r1, i, z));
    }

    public static void A08(C183618qL r1, C161377pW r2, boolean z) {
        r2.A03(new C177028dx(r1, z ? 1 : 0, z));
    }

    public void A0K(OutputStream outputStream, String str) {
        C159057l2 r2;
        C159057l2 r1;
        if (this instanceof C177088e3) {
            C177088e3 r22 = (C177088e3) this;
            if (str.equals("DER")) {
                r1 = new C176678dO(outputStream);
            } else if (str.equals("DL")) {
                r1 = new C176668dN(outputStream);
            } else {
                r1 = new C159057l2(outputStream);
            }
            r1.A02(r22, true);
            return;
        }
        if (str.equals("DER")) {
            r2 = new C176678dO(outputStream);
        } else if (str.equals("DL")) {
            r2 = new C176668dN(outputStream);
        } else {
            r2 = new C159057l2(outputStream);
        }
        r2.A02(Bqk(), true);
    }

    public byte[] A0L() {
        if (this instanceof C177148e9) {
            try {
                return A0M("DER");
            } catch (IOException e) {
                throw AnonymousClass6C7.A0e(e);
            }
        } else {
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            if (this instanceof C177088e3) {
                new C159057l2(A0e).A02((C177088e3) this, true);
            } else {
                new C159057l2(A0e).A02(Bqk(), true);
            }
            return A0e.toByteArray();
        }
    }

    public C177088e3 Bqk() {
        C161377pW A0A;
        int i;
        C161377pW r2;
        C183618qL r0;
        if (this instanceof C176558dC) {
            C176558dC r5 = (C176558dC) this;
            C176958dq r3 = r5.A04;
            if (r3 != null) {
                return r3;
            }
            C161377pW r4 = new C161377pW();
            C161377pW r1 = new C161377pW();
            Vector vector = r5.A02;
            if (0 != vector.size()) {
                C176538dA.A0A().A03((AnonymousClass8Q0) vector.elementAt(0));
                r5.A03.elementAt(0);
                throw AnonymousClass001.A0g("getConvertedValue");
            }
            C176948dp A00 = C161377pW.A00(new C176988dt(r1), r4);
            r5.A04 = A00;
            return A00;
        } else if (this instanceof C176598dG) {
            return ((C176598dG) this).A00;
        } else {
            if (this instanceof C176378cu) {
                C176378cu r6 = (C176378cu) this;
                if (C159797mT.A00("org.spongycastle.x509.allow_non-der_tbscert") == null || C159797mT.A01("org.spongycastle.x509.allow_non-der_tbscert")) {
                    return r6.A02;
                }
                C161377pW r42 = new C161377pW();
                C176748dV r12 = r6.A01;
                if (!r12.A0V(AnonymousClass79P.A04)) {
                    A07(r12, r42, 0, true);
                }
                r42.A03(r6.A00);
                r42.A03(r6.A07);
                r42.A03(r6.A05);
                C161377pW r13 = new C161377pW(2);
                r13.A03(r6.A0B);
                r42.A03(C161377pW.A00(r6.A0A, r13));
                C183618qL r02 = r6.A06;
                if (r02 == null) {
                    r02 = new C176948dp();
                }
                r42.A03(r02);
                r42.A03(r6.A09);
                C176068cP r03 = r6.A03;
                if (r03 != null) {
                    A07(r03, r42, 1, false);
                }
                C176068cP r04 = r6.A04;
                if (r04 != null) {
                    A07(r04, r42, 2, false);
                }
                C176288cl r14 = r6.A08;
                if (r14 != null) {
                    A07(r14, r42, 3, true);
                }
                return new C176948dp(r42);
            }
            if (this instanceof C176198cc) {
                C176198cc r15 = (C176198cc) this;
                r2 = new C161377pW(7);
                C176748dV r05 = r15.A00;
                if (r05 != null) {
                    r2.A03(r05);
                }
                r2.A03(r15.A03);
                r2.A03(r15.A02);
                r2.A03(r15.A06);
                C176598dG r06 = r15.A05;
                if (r06 != null) {
                    r2.A03(r06);
                }
                C176958dq r07 = r15.A01;
                if (r07 != null) {
                    r2.A03(r07);
                }
                C176288cl r16 = r15.A04;
                if (r16 != null) {
                    r2.A03(new C177028dx(r16));
                }
            } else if (this instanceof C176248ch) {
                return ((C176248ch) this).A00;
            } else {
                if (this instanceof C176318co) {
                    C176318co r22 = (C176318co) this;
                    C161377pW A0A2 = C176538dA.A0A();
                    A0A2.A03(r22.A01);
                    return C161377pW.A00(r22.A00, A0A2);
                } else if (this instanceof C176168cZ) {
                    C176168cZ r23 = (C176168cZ) this;
                    C161377pW A0A3 = C176538dA.A0A();
                    A0A3.A03(r23.A01);
                    return C161377pW.A00(r23.A00, A0A3);
                } else {
                    if (this instanceof C176238cg) {
                        C176238cg r17 = (C176238cg) this;
                        r2 = C176538dA.A0A();
                        r2.A03(r17.A00);
                        r0 = r17.A01;
                    } else {
                        if (this instanceof C176308cn) {
                            C176308cn r18 = (C176308cn) this;
                            A0A = C176538dA.A0A();
                            A0A.A03(r18.A01);
                            A07(r18.A00, A0A, 0, true);
                        } else if (this instanceof C176298cm) {
                            C176298cm r43 = (C176298cm) this;
                            A0A = C176538dA.A0A();
                            C176338cq[] r19 = r43.A01;
                            if (r19 != null) {
                                A08(new C176948dp((C183618qL[]) r19), A0A, false);
                            }
                            C176338cq[] r08 = r43.A00;
                            if (r08 != null) {
                                A07(new C176948dp((C183618qL[]) r08), A0A, 1, false);
                            }
                        } else if (this instanceof C176228cf) {
                            return ((C176228cf) this).A00;
                        } else {
                            if (this instanceof C176388cv) {
                                return ((C176388cv) this).A00;
                            }
                            if (this instanceof C176508d7) {
                                return ((C176508d7) this).A00;
                            }
                            if (this instanceof C176338cq) {
                                C176338cq r44 = (C176338cq) this;
                                A0A = new C161377pW(3);
                                A0A.A03(r44.A02);
                                C176748dV r110 = r44.A01;
                                if (r110 != null && !r110.A0V(C176338cq.A03)) {
                                    A08(r110, A0A, false);
                                }
                                C176748dV r111 = r44.A00;
                                if (r111 != null) {
                                    A07(r111, A0A, 1, false);
                                }
                            } else if (this instanceof C176518d8) {
                                return new C176948dp((C183618qL[]) ((C176518d8) this).A00);
                            } else {
                                if (this instanceof C176608dH) {
                                    C176608dH r32 = (C176608dH) this;
                                    int i2 = r32.A00;
                                    return new C177028dx(r32.A01, i2, AnonymousClass000.A1U(i2, 4));
                                } else if (this instanceof C176288cl) {
                                    C176288cl r45 = (C176288cl) this;
                                    Vector vector2 = r45.A01;
                                    A0A = new C161377pW(vector2.size());
                                    Enumeration elements = vector2.elements();
                                    while (elements.hasMoreElements()) {
                                        A0A.A03((AnonymousClass8Q0) r45.A00.get(elements.nextElement()));
                                    }
                                } else if (this instanceof C176548dB) {
                                    C176548dB r24 = (C176548dB) this;
                                    C161377pW r112 = new C161377pW(3);
                                    r112.A03(r24.A00);
                                    if (r24.A02) {
                                        r112.A03(C176738dU.A02);
                                    }
                                    return C161377pW.A00(r24.A01, r112);
                                } else if (this instanceof C176588dF) {
                                    C176588dF r09 = (C176588dF) this;
                                    return new C177028dx(r09.A01, r09.A00, false);
                                } else if (this instanceof C176498d6) {
                                    C176498d6 r46 = (C176498d6) this;
                                    A0A = new C161377pW(3);
                                    C176588dF r113 = r46.A00;
                                    if (r113 != null) {
                                        A0A.A03(new C177028dx(r113));
                                    }
                                    C177048dz r114 = r46.A02;
                                    if (r114 != null) {
                                        A07(r114, A0A, 1, false);
                                    }
                                    C176518d8 r115 = r46.A01;
                                    if (r115 != null) {
                                        A07(r115, A0A, 2, false);
                                    }
                                } else if (this instanceof C176268cj) {
                                    C176268cj r25 = (C176268cj) this;
                                    C161377pW r116 = new C161377pW(3);
                                    r116.A03(r25.A03);
                                    r116.A03(r25.A02);
                                    return C161377pW.A00(r25.A01, r116);
                                } else if (this instanceof C176368ct) {
                                    return ((C176368ct) this).A00;
                                } else {
                                    if (this instanceof C176488d5) {
                                        return ((C176488d5) this).A00;
                                    }
                                    if (this instanceof C176218ce) {
                                        return new C176748dV(((C176218ce) this).A00);
                                    }
                                    if (this instanceof C176418cy) {
                                        return ((C176418cy) this).A00;
                                    }
                                    if (this instanceof C176398cw) {
                                        C176398cw r117 = (C176398cw) this;
                                        r2 = C176538dA.A0A();
                                        C176738dU r010 = r117.A00;
                                        if (r010 != null) {
                                            r2.A03(r010);
                                        }
                                        r0 = r117.A01;
                                    } else if (this instanceof C176258ci) {
                                        C176258ci r47 = (C176258ci) this;
                                        A0A = new C161377pW(3);
                                        C176778dY r011 = r47.A01;
                                        if (r011 != null) {
                                            A08(r011, A0A, false);
                                        }
                                        C176518d8 r118 = r47.A02;
                                        if (r118 != null) {
                                            A07(r118, A0A, 1, false);
                                        }
                                        C176748dV r119 = r47.A00;
                                        if (r119 != null) {
                                            A07(r119, A0A, 2, false);
                                        }
                                    } else if (this instanceof C176208cd) {
                                        return new C176948dp((C183618qL[]) ((C176208cd) this).A00);
                                    } else {
                                        if (this instanceof C176528d9) {
                                            C176528d9 r120 = (C176528d9) this;
                                            r2 = C176538dA.A0A();
                                            r2.A03(r120.A01);
                                            r0 = r120.A00;
                                        } else if (this instanceof C176408cx) {
                                            C176408cx r26 = (C176408cx) this;
                                            C161377pW A0A4 = C176538dA.A0A();
                                            A0A4.A03(r26.A00);
                                            return C161377pW.A00(r26.A01, A0A4);
                                        } else if (this instanceof C176618dI) {
                                            return ((C176618dI) this).A01;
                                        } else {
                                            if (this instanceof C176538dA) {
                                                return ((C176538dA) this).A00;
                                            }
                                            if (this instanceof C176448d1) {
                                                C176448d1 r27 = (C176448d1) this;
                                                C161377pW A0A5 = C176538dA.A0A();
                                                A0A5.A03(r27.A01);
                                                return C161377pW.A00(r27.A00, A0A5);
                                            } else if (this instanceof C176638dK) {
                                                C176638dK r48 = (C176638dK) this;
                                                C161377pW r33 = new C161377pW(6);
                                                r33.A03(r48.A00);
                                                r33.A03(r48.A03);
                                                r33.A03(r48.A05);
                                                C176998du r012 = r48.A01;
                                                if (r012 != null) {
                                                    A08(r012, r33, false);
                                                }
                                                C176998du r121 = r48.A02;
                                                if (r121 != null) {
                                                    A07(r121, r33, 1, false);
                                                }
                                                r33.A03(r48.A04);
                                                return new C176928dn(r33);
                                            } else if (this instanceof C176468d3) {
                                                C176468d3 r49 = (C176468d3) this;
                                                A0A = new C161377pW(4);
                                                C176528d9 r122 = r49.A02;
                                                if (!r122.equals(C176468d3.A06)) {
                                                    A07(r122, A0A, 0, true);
                                                }
                                                C176528d9 r123 = r49.A03;
                                                if (!r123.equals(C176468d3.A07)) {
                                                    A08(r123, A0A, true);
                                                }
                                                C176748dV r124 = r49.A00;
                                                if (!r124.A0T(C176468d3.A04)) {
                                                    A07(r124, A0A, 2, true);
                                                }
                                                C176748dV r125 = r49.A01;
                                                if (!r125.A0T(C176468d3.A05)) {
                                                    A07(r125, A0A, 3, true);
                                                }
                                            } else if (this instanceof C176188cb) {
                                                C176188cb r126 = (C176188cb) this;
                                                A0A = new C161377pW(5);
                                                A0A.A03(r126.A01);
                                                A0A.A03(r126.A04);
                                                A0A.A03(r126.A02);
                                                C176998du r013 = r126.A03;
                                                if (r013 != null) {
                                                    A08(r013, A0A, false);
                                                }
                                                C176888dj r127 = r126.A00;
                                                if (r127 != null) {
                                                    A07(r127, A0A, 1, false);
                                                }
                                            } else if (this instanceof C176458d2) {
                                                C176458d2 r128 = (C176458d2) this;
                                                r2 = new C161377pW(4);
                                                r2.A03(r128.A02);
                                                r2.A03(r128.A00);
                                                C176748dV r014 = r128.A01;
                                                if (r014 != null) {
                                                    r2.A03(r014);
                                                }
                                                C176528d9 r129 = r128.A03;
                                                if (r129 != null && !r129.equals(C176458d2.A04)) {
                                                    r2.A03(r129);
                                                }
                                            } else if (this instanceof C176628dJ) {
                                                C176628dJ r52 = (C176628dJ) this;
                                                C161377pW A0A6 = C176538dA.A0A();
                                                A0A6.A03(r52.A01);
                                                C183618qL r34 = r52.A00;
                                                if (r34 != null) {
                                                    A0A6.A03(new C177008dv(r34, 0, true));
                                                }
                                                if (r52.A02) {
                                                    return new C176928dn(A0A6);
                                                }
                                                return new C176938do(A0A6);
                                            } else if (this instanceof C176328cp) {
                                                C176328cp r410 = (C176328cp) this;
                                                A0A = new C161377pW(4);
                                                C176748dV r130 = r410.A00;
                                                if (!r130.A0T(C176328cp.A03)) {
                                                    A07(r130, A0A, 0, true);
                                                }
                                                A0A.A03(r410.A01);
                                                C176288cl r131 = r410.A02;
                                                if (r131 != null) {
                                                    A07(r131, A0A, 2, true);
                                                }
                                            } else if (this instanceof C176178ca) {
                                                C176178ca r411 = (C176178ca) this;
                                                A0A = new C161377pW(5);
                                                A0A.A03(r411.A02);
                                                A0A.A03(r411.A03);
                                                A0A.A03(r411.A01);
                                                C176758dW r28 = r411.A00;
                                                if (r28 != null) {
                                                    A07(r28, A0A, 0, true);
                                                }
                                                C176288cl r015 = r411.A04;
                                                if (r015 != null) {
                                                    A08(r015, A0A, true);
                                                }
                                            } else if (this instanceof C176158cY) {
                                                C176158cY r132 = (C176158cY) this;
                                                A0A = C176538dA.A0A();
                                                A0A.A03(r132.A00);
                                                C176488d5 r29 = r132.A01;
                                                if (r29 != null) {
                                                    A07(r29, A0A, 0, true);
                                                }
                                            } else if (this instanceof C176478d4) {
                                                C176478d4 r412 = (C176478d4) this;
                                                A0A = new C161377pW(5);
                                                if (r412.A05 || !r412.A01.A0T(C176478d4.A06)) {
                                                    A07(r412.A01, A0A, 0, true);
                                                }
                                                A0A.A03(r412.A03);
                                                A0A.A03(r412.A00);
                                                A0A.A03(r412.A02);
                                                C176288cl r016 = r412.A04;
                                                if (r016 != null) {
                                                    A08(r016, A0A, true);
                                                }
                                            } else if (this instanceof C176278ck) {
                                                C176278ck r210 = (C176278ck) this;
                                                C161377pW A0A7 = C176538dA.A0A();
                                                A0A7.A03(r210.A00);
                                                return C161377pW.A00(r210.A01, A0A7);
                                            } else if (this instanceof C176568dD) {
                                                C183618qL r211 = ((C176568dD) this).A00;
                                                if (r211 instanceof C176778dY) {
                                                    return new C177028dx(r211, 2, true);
                                                }
                                                return new C177028dx(r211, 1, true);
                                            } else if (this instanceof C176138cW) {
                                                return C161377pW.A00(((C176138cW) this).A00, C176538dA.A0A());
                                            } else if (this instanceof C176128cV) {
                                                return ((C176128cV) this).A00;
                                            } else {
                                                if (this instanceof C176148cX) {
                                                    C176148cX r133 = (C176148cX) this;
                                                    A0A = C176538dA.A0A();
                                                    A0A.A03(r133.A00);
                                                    C176278ck r212 = r133.A01;
                                                    if (r212 != null) {
                                                        A07(r212, A0A, 0, true);
                                                    }
                                                } else if (this instanceof C176118cU) {
                                                    return C161377pW.A00(((C176118cU) this).A00, C176538dA.A0A());
                                                } else if (this instanceof C176578dE) {
                                                    C176578dE r017 = (C176578dE) this;
                                                    return new C177028dx(r017.A01, r017.A00, false);
                                                } else if (this instanceof C176358cs) {
                                                    C176358cs r213 = (C176358cs) this;
                                                    C161377pW r134 = new C161377pW(4);
                                                    r134.A03(r213.A03);
                                                    r134.A03(r213.A02);
                                                    r134.A03(r213.A01);
                                                    return C161377pW.A00(r213.A00, r134);
                                                } else if (this instanceof C176348cr) {
                                                    C176348cr r135 = (C176348cr) this;
                                                    A0A = new C161377pW(4);
                                                    A0A.A03(r135.A02);
                                                    A0A.A03(r135.A03);
                                                    A0A.A03(r135.A01);
                                                    C176958dq r214 = r135.A00;
                                                    if (r214 != null) {
                                                        A07(r214, A0A, 0, true);
                                                    }
                                                } else {
                                                    if (this instanceof C176438d0) {
                                                        C176438d0 r215 = (C176438d0) this;
                                                        A0A = C176538dA.A0A();
                                                        A0A.A03(new C176648dL(r215.A01));
                                                        i = r215.A00;
                                                    } else if (!(this instanceof C176428cz)) {
                                                        return (C177088e3) this;
                                                    } else {
                                                        C176428cz r216 = (C176428cz) this;
                                                        A0A = C176538dA.A0A();
                                                        A0A.A03(new C176648dL(r216.A01));
                                                        i = r216.A00;
                                                    }
                                                    if (i != 12) {
                                                        A0A.A03(new C176748dV((long) i));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return new C176948dp(A0A);
                    }
                    if (r0 != null) {
                        r2.A03(r0);
                    }
                }
            }
            return new C176948dp(r2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C183618qL)) {
            return false;
        }
        return Bqk().A0T(((C183618qL) obj).Bqk());
    }

    public static byte[] A09(C183618qL r1) {
        return r1.Bqk().A0M("DER");
    }

    public byte[] A0M(String str) {
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        A0K(A0e, str);
        return A0e.toByteArray();
    }

    public int hashCode() {
        return Bqk().hashCode();
    }
}
