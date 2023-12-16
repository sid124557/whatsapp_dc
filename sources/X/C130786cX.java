package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.6cX  reason: invalid class name and case insensitive filesystem */
public abstract class C130786cX extends C170198Cg {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map defaultInstanceMap = AnonymousClass0x9.A1D();
    public int memoizedSerializedSize = -1;
    public C160677o7 unknownFields = C160677o7.A04;

    public static C130786cX A05(C130786cX r7, byte[] bArr) {
        AnonymousClass6u5 e;
        byte[] bArr2 = bArr;
        int length = bArr.length;
        C161277pL A00 = C161277pL.A00();
        C130786cX A0I = r7.A0I();
        try {
            C186358vA A0R = AnonymousClass6C7.A0R(A0I);
            A0R.BLB(new C156627gw(A00), A0I, bArr2, 0, length);
            A0R.BKT(A0I);
            A0A(A0I);
            return A0I;
        } catch (AnonymousClass6u5 e2) {
            e = e2;
            if (e.wasThrownFromInputStream) {
                e = new AnonymousClass6u5((IOException) e);
            }
            e.unfinishedMessage = A0I;
            throw e;
        } catch (AnonymousClass8RT e3) {
            e = AnonymousClass6u5.A02(e3.getMessage());
            e.unfinishedMessage = A0I;
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof AnonymousClass6u5) {
                throw e4.getCause();
            }
            e = new AnonymousClass6u5(e4);
            e.unfinishedMessage = A0I;
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = AnonymousClass6u5.A00();
            e.unfinishedMessage = A0I;
            throw e;
        }
    }

    public static Object A08(C187928y2 r1, String str, Object[] objArr) {
        return new AnonymousClass7MO(r1, str, objArr);
    }

    public static void A0A(C130786cX r1) {
        if (r1 != null && !A0C(r1)) {
            AnonymousClass6u5 A02 = AnonymousClass6u5.A02(new AnonymousClass8RT().getMessage());
            A02.unfinishedMessage = r1;
            throw A02;
        }
    }

    public static void A0B(C130786cX r2, Class cls) {
        r2.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(cls, r2);
    }

    public static final boolean A0C(C130786cX r4) {
        byte byteValue = ((Number) r4.A0J(C141056ux.GET_MEMOIZED_IS_INITIALIZED, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean BHl = AnonymousClass6C7.A0R(r4).BHl(r4);
        C141056ux r2 = C141056ux.SET_MEMOIZED_IS_INITIALIZED;
        C130786cX r1 = null;
        if (BHl) {
            r1 = r4;
        }
        r4.A0J(r2, r1, (Object) null);
        return BHl;
    }

    public final C130546c9 A0G() {
        return (C130546c9) A0J(C141056ux.NEW_BUILDER, (Object) null, (Object) null);
    }

    public final C130546c9 A0H() {
        C130546c9 r0 = (C130546c9) A0J(C141056ux.NEW_BUILDER, (Object) null, (Object) null);
        r0.A08(this);
        return r0;
    }

    public C130786cX A0I() {
        return (C130786cX) A0J(C141056ux.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
    }

    public Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r3;
        C178978iP r32;
        C178978iP r33;
        C178978iP r34;
        C178978iP r35;
        C178978iP r36;
        C178978iP r37;
        C178978iP r38;
        C178978iP r39;
        C178978iP r310;
        C178978iP r311;
        C178978iP r312;
        C178978iP r313;
        C178978iP r314;
        C178978iP r315;
        C178978iP r316;
        C178978iP r317;
        C178978iP r318;
        C178978iP r319;
        C178978iP r320;
        C178978iP r321;
        C178978iP r322;
        C178978iP r323;
        if (this instanceof C130696cO) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr = new Object[8];
                    AnonymousClass0x2.A1R(objArr);
                    objArr[1] = "sequence_";
                    objArr[2] = "localBaseKey_";
                    objArr[3] = "localBaseKeyPrivate_";
                    objArr[4] = "localRatchetKey_";
                    objArr[5] = "localRatchetKeyPrivate_";
                    objArr[6] = "localIdentityKey_";
                    objArr[7] = "localIdentityKeyPrivate_";
                    return new AnonymousClass7MO(C130696cO.DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0007ည\u0005\bည\u0006", objArr);
                case 3:
                    return new C130696cO();
                case 4:
                    return new C130506c5();
                case 5:
                    return C130696cO.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r324 = C130696cO.PARSER;
                    if (r324 != null) {
                        return r324;
                    }
                    synchronized (C130696cO.class) {
                        r323 = C130696cO.PARSER;
                        if (r323 == null) {
                            r323 = C18320x8.A0B(C130696cO.DEFAULT_INSTANCE);
                            C130696cO.PARSER = r323;
                        }
                    }
                    return r323;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130706cP) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr2 = new Object[12];
                    AnonymousClass0x2.A1R(objArr2);
                    objArr2[1] = "usesParticipantInKey_";
                    objArr2[2] = "supportsStarredMessages_";
                    objArr2[3] = "supportsDocumentMessages_";
                    objArr2[4] = "supportsUrlMessages_";
                    objArr2[5] = "supportsMediaRetry_";
                    objArr2[6] = "supportsE2EImage_";
                    objArr2[7] = "supportsE2EVideo_";
                    objArr2[8] = "supportsE2EAudio_";
                    objArr2[9] = "supportsE2EDocument_";
                    objArr2[10] = "documentTypes_";
                    objArr2[11] = "features_";
                    return new AnonymousClass7MO(C130706cP.DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဈ\t\u000bည\n", objArr2);
                case 3:
                    return new C130706cP();
                case 4:
                    return new C130496c4();
                case 5:
                    return C130706cP.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r325 = C130706cP.PARSER;
                    if (r325 != null) {
                        return r325;
                    }
                    synchronized (C130706cP.class) {
                        r322 = C130706cP.PARSER;
                        if (r322 == null) {
                            r322 = C18320x8.A0B(C130706cP.DEFAULT_INSTANCE);
                            C130706cP.PARSER = r322;
                        }
                    }
                    return r322;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130776cW) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1X = AnonymousClass0x9.A1X();
                    AnonymousClass0x2.A1R(A1X);
                    A1X[1] = "aesK_";
                    A1X[2] = "kNonce_";
                    return new AnonymousClass7MO(C130776cW.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A1X);
                case 3:
                    return new C130776cW();
                case 4:
                    return new C130516c6();
                case 5:
                    return C130776cW.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r326 = C130776cW.PARSER;
                    if (r326 != null) {
                        return r326;
                    }
                    synchronized (C130776cW.class) {
                        r321 = C130776cW.PARSER;
                        if (r321 == null) {
                            r321 = C18320x8.A0B(C130776cW.DEFAULT_INSTANCE);
                            C130776cW.PARSER = r321;
                        }
                    }
                    return r321;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130736cS) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr3 = new Object[5];
                    AnonymousClass0x2.A1R(objArr3);
                    objArr3[1] = "backupKeyData_";
                    objArr3[2] = "r3_";
                    objArr3[3] = "opaqueChallenge_";
                    objArr3[4] = "transcript_";
                    return new AnonymousClass7MO(C130736cS.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", objArr3);
                case 3:
                    return new C130736cS();
                case 4:
                    return new C130526c7();
                case 5:
                    return C130736cS.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r327 = C130736cS.PARSER;
                    if (r327 != null) {
                        return r327;
                    }
                    synchronized (C130736cS.class) {
                        r320 = C130736cS.PARSER;
                        if (r320 == null) {
                            r320 = C18320x8.A0B(C130736cS.DEFAULT_INSTANCE);
                            C130736cS.PARSER = r320;
                        }
                    }
                    return r320;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130746cT) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1X2 = AnonymousClass0x9.A1X();
                    AnonymousClass0x2.A1R(A1X2);
                    A1X2[1] = "backupKeyDataEncrypted_";
                    A1X2[2] = "rkNonce_";
                    return new AnonymousClass7MO(C130746cT.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A1X2);
                case 3:
                    return new C130746cT();
                case 4:
                    return new C130486c3();
                case 5:
                    return C130746cT.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r328 = C130746cT.PARSER;
                    if (r328 != null) {
                        return r328;
                    }
                    synchronized (C130746cT.class) {
                        r319 = C130746cT.PARSER;
                        if (r319 == null) {
                            r319 = C18320x8.A0B(C130746cT.DEFAULT_INSTANCE);
                            C130746cT.PARSER = r319;
                        }
                    }
                    return r319;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130666cL) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass7MO(C130666cL.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\f\u0002\f\u00032\u0004\n", new Object[]{"encoding_", "transformer_", "transformerArgsMap_", C1459177u.A00, "transformedData_"});
                case 3:
                    return new C130666cL();
                case 4:
                    return new C130466c1();
                case 5:
                    return C130666cL.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r329 = C130666cL.PARSER;
                    if (r329 != null) {
                        return r329;
                    }
                    synchronized (C130666cL.class) {
                        r318 = C130666cL.PARSER;
                        if (r318 == null) {
                            r318 = C18320x8.A0B(C130666cL.DEFAULT_INSTANCE);
                            C130666cL.PARSER = r318;
                        }
                    }
                    return r318;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130626cH) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0M = AnonymousClass002.A0M();
                    A0M[0] = "value_";
                    A0M[1] = "valueCase_";
                    return new AnonymousClass7MO(C130626cH.DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001=\u0000\u0002>\u0000", A0M);
                case 3:
                    return new C130626cH();
                case 4:
                    return new C130476c2();
                case 5:
                    return C130626cH.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r330 = C130626cH.PARSER;
                    if (r330 != null) {
                        return r330;
                    }
                    synchronized (C130626cH.class) {
                        r317 = C130626cH.PARSER;
                        if (r317 == null) {
                            r317 = C18320x8.A0B(C130626cH.DEFAULT_INSTANCE);
                            C130626cH.PARSER = r317;
                        }
                    }
                    return r317;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130656cK) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr4 = new Object[4];
                    AnonymousClass0x2.A1R(objArr4);
                    objArr4[1] = "isDeactivated_";
                    objArr4[2] = "isAutoRenewing_";
                    objArr4[3] = "expirationDate_";
                    return new AnonymousClass7MO(C130656cK.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", objArr4);
                case 3:
                    return new C130656cK();
                case 4:
                    return new C130456c0();
                case 5:
                    return C130656cK.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r331 = C130656cK.PARSER;
                    if (r331 != null) {
                        return r331;
                    }
                    synchronized (C130656cK.class) {
                        r316 = C130656cK.PARSER;
                        if (r316 == null) {
                            r316 = C18320x8.A0B(C130656cK.DEFAULT_INSTANCE);
                            C130656cK.PARSER = r316;
                        }
                    }
                    return r316;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130616cG) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a = C18260x0.A1a();
                    A1a[1] = "showNotification_";
                    return new AnonymousClass7MO(C130616cG.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A1a);
                case 3:
                    return new C130616cG();
                case 4:
                    return new C130446bz();
                case 5:
                    return C130616cG.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r332 = C130616cG.PARSER;
                    if (r332 != null) {
                        return r332;
                    }
                    synchronized (C130616cG.class) {
                        r315 = C130616cG.PARSER;
                        if (r315 == null) {
                            r315 = C18320x8.A0B(C130616cG.DEFAULT_INSTANCE);
                            C130616cG.PARSER = r315;
                        }
                    }
                    return r315;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130556cA) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0M2 = AnonymousClass002.A0M();
                    A0M2[0] = "weights_";
                    A0M2[1] = C130646cJ.class;
                    return new AnonymousClass7MO(C130556cA.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M2);
                case 3:
                    return new C130556cA();
                case 4:
                    return new C130436by();
                case 5:
                    return C130556cA.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r333 = C130556cA.PARSER;
                    if (r333 != null) {
                        return r333;
                    }
                    synchronized (C130556cA.class) {
                        r314 = C130556cA.PARSER;
                        if (r314 == null) {
                            r314 = C18320x8.A0B(C130556cA.DEFAULT_INSTANCE);
                            C130556cA.PARSER = r314;
                        }
                    }
                    return r314;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130606cF) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a2 = C18260x0.A1a();
                    A1a2[1] = "cpi_";
                    return new AnonymousClass7MO(C130606cF.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A1a2);
                case 3:
                    return new C130606cF();
                case 4:
                    return new C130426bx();
                case 5:
                    return C130606cF.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r334 = C130606cF.PARSER;
                    if (r334 != null) {
                        return r334;
                    }
                    synchronized (C130606cF.class) {
                        r313 = C130606cF.PARSER;
                        if (r313 == null) {
                            r313 = C18320x8.A0B(C130606cF.DEFAULT_INSTANCE);
                            C130606cF.PARSER = r313;
                        }
                    }
                    return r313;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130596cE) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a3 = C18260x0.A1a();
                    A1a3[1] = "labeled_";
                    return new AnonymousClass7MO(C130596cE.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A1a3);
                case 3:
                    return new C130596cE();
                case 4:
                    return new C130416bw();
                case 5:
                    return C130596cE.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r335 = C130596cE.PARSER;
                    if (r335 != null) {
                        return r335;
                    }
                    synchronized (C130596cE.class) {
                        r312 = C130596cE.PARSER;
                        if (r312 == null) {
                            r312 = C18320x8.A0B(C130596cE.DEFAULT_INSTANCE);
                            C130596cE.PARSER = r312;
                        }
                    }
                    return r312;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130586cD) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a4 = C18260x0.A1a();
                    A1a4[1] = "chatOpened_";
                    return new AnonymousClass7MO(C130586cD.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A1a4);
                case 3:
                    return new C130586cD();
                case 4:
                    return new C130406bv();
                case 5:
                    return C130586cD.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r336 = C130586cD.PARSER;
                    if (r336 != null) {
                        return r336;
                    }
                    synchronized (C130586cD.class) {
                        r311 = C130586cD.PARSER;
                        if (r311 == null) {
                            r311 = C18320x8.A0B(C130586cD.DEFAULT_INSTANCE);
                            C130586cD.PARSER = r311;
                        }
                    }
                    return r311;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130576cC) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a5 = C18260x0.A1a();
                    A1a5[1] = "deviceAgentID_";
                    return new AnonymousClass7MO(C130576cC.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A1a5);
                case 3:
                    return new C130576cC();
                case 4:
                    return new C130396bu();
                case 5:
                    return C130576cC.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r337 = C130576cC.PARSER;
                    if (r337 != null) {
                        return r337;
                    }
                    synchronized (C130576cC.class) {
                        r310 = C130576cC.PARSER;
                        if (r310 == null) {
                            r310 = C18320x8.A0B(C130576cC.DEFAULT_INSTANCE);
                            C130576cC.PARSER = r310;
                        }
                    }
                    return r310;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130646cJ) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1X3 = AnonymousClass0x9.A1X();
                    AnonymousClass0x2.A1R(A1X3);
                    A1X3[1] = "emoji_";
                    A1X3[2] = "weight_";
                    return new AnonymousClass7MO(C130646cJ.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", A1X3);
                case 3:
                    return new C130646cJ();
                case 4:
                    return new C130386bt();
                case 5:
                    return C130646cJ.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r338 = C130646cJ.PARSER;
                    if (r338 != null) {
                        return r338;
                    }
                    synchronized (C130646cJ.class) {
                        r39 = C130646cJ.PARSER;
                        if (r39 == null) {
                            r39 = C18320x8.A0B(C130646cJ.DEFAULT_INSTANCE);
                            C130646cJ.PARSER = r39;
                        }
                    }
                    return r39;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130676cM) {
            C130676cM r2 = (C130676cM) this;
            int i = 1;
            switch (r5.ordinal()) {
                case 0:
                    return Byte.valueOf(r2.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    r2.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return new AnonymousClass7MO(C130676cM.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0002\u0001ᔈ\u0000\u00022\u0003ဌ\u0001\u0004ᔌ\u0002", new Object[]{"bitField0_", "filterName_", "parameters_", C1459077t.A00, "filterResult_", C170158Cc.A00, "clientNotSupportedConfig_", C170148Cb.A00});
                case 3:
                    return new C130676cM();
                case 4:
                    return new C130376bs();
                case 5:
                    return C130676cM.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r339 = C130676cM.PARSER;
                    if (r339 != null) {
                        return r339;
                    }
                    synchronized (C130676cM.class) {
                        r38 = C130676cM.PARSER;
                        if (r38 == null) {
                            r38 = C18320x8.A0B(C130676cM.DEFAULT_INSTANCE);
                            C130676cM.PARSER = r38;
                        }
                    }
                    return r38;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130636cI) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new AnonymousClass7MO(C130636cI.DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"datetimeOneof_", "datetimeOneofCase_", "bitField0_", C130686cN.class, C130566cB.class});
                case 3:
                    return new C130636cI();
                case 4:
                    return new C130346bp();
                case 5:
                    return C130636cI.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r340 = C130636cI.PARSER;
                    if (r340 != null) {
                        return r340;
                    }
                    synchronized (C130636cI.class) {
                        r37 = C130636cI.PARSER;
                        if (r37 == null) {
                            r37 = C18320x8.A0B(C130636cI.DEFAULT_INSTANCE);
                            C130636cI.PARSER = r37;
                        }
                    }
                    return r37;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130566cB) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a6 = C18260x0.A1a();
                    A1a6[1] = "timestamp_";
                    return new AnonymousClass7MO(C130566cB.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", A1a6);
                case 3:
                    return new C130566cB();
                case 4:
                    return new C130366br();
                case 5:
                    return C130566cB.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r341 = C130566cB.PARSER;
                    if (r341 != null) {
                        return r341;
                    }
                    synchronized (C130566cB.class) {
                        r36 = C130566cB.PARSER;
                        if (r36 == null) {
                            r36 = C18320x8.A0B(C130566cB.DEFAULT_INSTANCE);
                            C130566cB.PARSER = r36;
                        }
                    }
                    return r36;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130686cN) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr5 = new Object[10];
                    AnonymousClass0x2.A1R(objArr5);
                    objArr5[1] = "dayOfWeek_";
                    objArr5[2] = C170138Ca.A00;
                    objArr5[3] = "year_";
                    objArr5[4] = "month_";
                    objArr5[5] = "dayOfMonth_";
                    objArr5[6] = "hour_";
                    objArr5[7] = "minute_";
                    objArr5[8] = "calendar_";
                    objArr5[9] = AnonymousClass8CZ.A00;
                    return new AnonymousClass7MO(C130686cN.DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဌ\u0006", objArr5);
                case 3:
                    return new C130686cN();
                case 4:
                    return new C130356bq();
                case 5:
                    return C130686cN.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r342 = C130686cN.PARSER;
                    if (r342 != null) {
                        return r342;
                    }
                    synchronized (C130686cN.class) {
                        r35 = C130686cN.PARSER;
                        if (r35 == null) {
                            r35 = C18320x8.A0B(C130686cN.DEFAULT_INSTANCE);
                            C130686cN.PARSER = r35;
                        }
                    }
                    return r35;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130726cR) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr6 = new Object[6];
                    AnonymousClass0x2.A1R(objArr6);
                    objArr6[1] = "backupCipherHeader_";
                    objArr6[2] = "keyVersion_";
                    objArr6[3] = "serverSalt_";
                    objArr6[4] = "googleIdSalt_";
                    objArr6[5] = "encryptionIv_";
                    return new AnonymousClass7MO(C130726cR.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004", objArr6);
                case 3:
                    return new C130726cR();
                case 4:
                    return new C130336bo();
                case 5:
                    return C130726cR.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r343 = C130726cR.PARSER;
                    if (r343 != null) {
                        return r343;
                    }
                    synchronized (C130726cR.class) {
                        r34 = C130726cR.PARSER;
                        if (r34 == null) {
                            r34 = C18320x8.A0B(C130726cR.DEFAULT_INSTANCE);
                            C130726cR.PARSER = r34;
                        }
                    }
                    return r34;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C130716cQ) {
            switch (r5.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a7 = C18260x0.A1a();
                    A1a7[1] = "encryptionIv_";
                    return new AnonymousClass7MO(C130716cQ.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A1a7);
                case 3:
                    return new C130716cQ();
                case 4:
                    return new C130326bn();
                case 5:
                    return C130716cQ.DEFAULT_INSTANCE;
                case 6:
                    C178978iP r344 = C130716cQ.PARSER;
                    if (r344 != null) {
                        return r344;
                    }
                    synchronized (C130716cQ.class) {
                        r33 = C130716cQ.PARSER;
                        if (r33 == null) {
                            r33 = C18320x8.A0B(C130716cQ.DEFAULT_INSTANCE);
                            C130716cQ.PARSER = r33;
                        }
                    }
                    return r33;
                default:
                    throw C18320x8.A0m();
            }
        } else {
            boolean z = this instanceof C130756cU;
            int ordinal = r5.ordinal();
            if (z) {
                switch (ordinal) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        Object[] objArr7 = new Object[6];
                        AnonymousClass0x2.A1R(objArr7);
                        objArr7[1] = "keyType_";
                        objArr7[2] = AnonymousClass8CY.A00;
                        objArr7[3] = "waProvidedKeyData_";
                        objArr7[4] = "hsmControlledKeyData_";
                        objArr7[5] = "backupMetadata_";
                        return new AnonymousClass7MO(C130756cU.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", objArr7);
                    case 3:
                        return new C130756cU();
                    case 4:
                        return new C130316bm();
                    case 5:
                        return C130756cU.DEFAULT_INSTANCE;
                    case 6:
                        C178978iP r345 = C130756cU.PARSER;
                        if (r345 != null) {
                            return r345;
                        }
                        synchronized (C130756cU.class) {
                            r32 = C130756cU.PARSER;
                            if (r32 == null) {
                                r32 = C18320x8.A0B(C130756cU.DEFAULT_INSTANCE);
                                C130756cU.PARSER = r32;
                            }
                        }
                        return r32;
                    default:
                        throw C18320x8.A0m();
                }
            } else {
                switch (ordinal) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        Object[] objArr8 = new Object[41];
                        AnonymousClass0x2.A1R(objArr8);
                        objArr8[1] = "bitField1_";
                        objArr8[2] = "appVersion_";
                        objArr8[3] = "deviceModel_";
                        objArr8[4] = "jidSuffix_";
                        objArr8[5] = "backupVersion_";
                        objArr8[6] = "callLogMigrationFinished_";
                        objArr8[7] = "labeledJidMigrationFinished_";
                        objArr8[8] = "messageFtsMigrationFinished_";
                        objArr8[9] = "blankMeJidMigrationFinished_";
                        objArr8[10] = "messageLinkMigrationFinished_";
                        objArr8[11] = "messageMainMigrationFinished_";
                        objArr8[12] = "messageTextMigrationFinished_";
                        objArr8[13] = "missedCallsMigrationFinished_";
                        objArr8[14] = "receiptUserMigrationFinished_";
                        objArr8[15] = "messageMediaMigrationFinished_";
                        objArr8[16] = "messageVcardMigrationFinished_";
                        objArr8[17] = "messageFutureMigrationFinished_";
                        objArr8[18] = "messageQuotedMigrationFinished_";
                        objArr8[19] = "messageSystemMigrationFinished_";
                        objArr8[20] = "receiptDeviceMigrationFinished_";
                        objArr8[21] = "messageMentionMigrationFinished_";
                        objArr8[22] = "messageRevokedMigrationFinished_";
                        objArr8[23] = "broadcastMeJidMigrationFinished_";
                        objArr8[24] = "messageFrequentMigrationFinished_";
                        objArr8[25] = "messageLocationMigrationFinished_";
                        objArr8[26] = "participantUserMigrationFinished_";
                        objArr8[27] = "messageThumbnailMigrationFinished_";
                        objArr8[28] = "messageSendCountMigrationFinished_";
                        objArr8[29] = "migrationJidStoreMigrationFinished_";
                        objArr8[30] = "paymentTransactionMigrationFinished_";
                        objArr8[31] = "migrationChatStoreMigrationFinished_";
                        objArr8[32] = "quotedOrderMessageMigrationFinished_";
                        objArr8[33] = "mediaMigrationFixerMigrationFinished_";
                        objArr8[34] = "quotedOrderMessageV2MigrationFinished_";
                        objArr8[35] = "messageMainVerificationMigrationFinished_";
                        objArr8[36] = "quotedUiElementsReplyMessageMigrationFinished_";
                        objArr8[37] = "alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_";
                        objArr8[38] = "alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_";
                        objArr8[39] = "backupExportFileSize_";
                        objArr8[40] = "cleanedDb_";
                        return new AnonymousClass7MO(C130766cV.DEFAULT_INSTANCE, "\u0001'\u0000\u0002\u0001''\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u0017ဇ\u0016\u0018ဇ\u0017\u0019ဇ\u0018\u001aဇ\u0019\u001bဇ\u001a\u001cဇ\u001b\u001dဇ\u001c\u001eဇ\u001d\u001fဇ\u001e ဇ\u001f!ဇ \"ဇ!#ဇ\"$ဇ#%ဇ$&ဂ%'ဇ&", objArr8);
                    case 3:
                        return new C130766cV();
                    case 4:
                        return new C130536c8();
                    case 5:
                        return C130766cV.DEFAULT_INSTANCE;
                    case 6:
                        C178978iP r346 = C130766cV.PARSER;
                        if (r346 != null) {
                            return r346;
                        }
                        synchronized (C130766cV.class) {
                            r3 = C130766cV.PARSER;
                            if (r3 == null) {
                                r3 = C18320x8.A0B(C130766cV.DEFAULT_INSTANCE);
                                C130766cV.PARSER = r3;
                            }
                        }
                        return r3;
                    default:
                        throw C18320x8.A0m();
                }
            }
        }
    }

    public boolean A0L() {
        return AnonymousClass000.A1S(this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public /* bridge */ /* synthetic */ C187928y2 B6s() {
        return (C170198Cg) A0J(C141056ux.GET_DEFAULT_INSTANCE, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C157387iD.A02.A00(cls).B2c(this, obj);
    }

    public static C130786cX A02(C172548Lq r5, C130786cX r6) {
        C161277pL A00 = C161277pL.A00();
        C130256bf r52 = (C130256bf) r5;
        byte[] bArr = r52.bytes;
        int A08 = r52.A08();
        int A03 = r52.A03();
        C130276bh r2 = new C130276bh(bArr, A08, A03);
        try {
            r2.A0B(A03);
            C130786cX A032 = A03(r2, A00, r6);
            try {
                r2.A0K(0);
                A0A(A032);
                A0A(A032);
                return A032;
            } catch (AnonymousClass6u5 e) {
                e.unfinishedMessage = A032;
                throw e;
            }
        } catch (AnonymousClass6u5 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static C130786cX A03(C153797c2 r4, C161277pL r5, C130786cX r6) {
        Throwable e;
        C130786cX A0I = r6.A0I();
        try {
            C186358vA A0R = AnonymousClass6C7.A0R(A0I);
            C160837oO r0 = r4.A01;
            if (r0 == null) {
                r0 = new C160837oO(r4);
            }
            A0R.BLA(r0, r5, A0I);
            A0R.BKT(A0I);
            return A0I;
        } catch (AnonymousClass6u5 e2) {
            e = e2;
            if (e.wasThrownFromInputStream) {
                e = new AnonymousClass6u5((IOException) e);
            }
            e.unfinishedMessage = A0I;
            throw e;
        } catch (AnonymousClass8RT e3) {
            AnonymousClass6u5 A02 = AnonymousClass6u5.A02(e3.getMessage());
            A02.unfinishedMessage = A0I;
            throw A02;
        } catch (IOException e4) {
            if (e4.getCause() instanceof AnonymousClass6u5) {
                e = e4.getCause();
                throw e;
            }
            e = new AnonymousClass6u5(e4);
            e.unfinishedMessage = A0I;
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            if (e.getCause() instanceof AnonymousClass6u5) {
                throw e.getCause();
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r0 = X.AnonymousClass6u5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C130786cX A04(X.C130786cX r6, java.io.InputStream r7) {
        /*
            X.7pL r5 = X.C161277pL.A00()
            int r4 = r7.read()     // Catch:{ 6u5 -> 0x0064, IOException -> 0x005d }
            r3 = -1
            if (r4 != r3) goto L_0x000c
            goto L_0x0058
        L_0x000c:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0013:
            int r1 = r7.read()     // Catch:{ 6u5 -> 0x0064, IOException -> 0x005d }
            if (r1 == r3) goto L_0x0040
            r0 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            int r2 = r2 + 7
            r0 = 32
            if (r2 >= r0) goto L_0x0028
            goto L_0x0013
        L_0x0028:
            r0 = 64
            if (r2 >= r0) goto L_0x0039
            int r0 = r7.read()     // Catch:{ 6u5 -> 0x0064, IOException -> 0x005d }
            if (r0 == r3) goto L_0x0040
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            int r2 = r2 + 7
            goto L_0x0028
        L_0x0039:
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)     // Catch:{ 6u5 -> 0x0064, IOException -> 0x005d }
            goto L_0x0044
        L_0x0040:
            X.6u5 r0 = X.AnonymousClass6u5.A00()     // Catch:{ 6u5 -> 0x0064, IOException -> 0x005d }
        L_0x0044:
            throw r0     // Catch:{ 6u5 -> 0x0064, IOException -> 0x005d }
        L_0x0045:
            X.6tV r0 = new X.6tV
            r0.<init>(r7, r4)
            X.6bi r1 = new X.6bi
            r1.<init>(r0)
            X.6cX r2 = A03(r1, r5, r6)
            r0 = 0
            r1.A0K(r0)     // Catch:{ 6u5 -> 0x006f }
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            A0A(r2)
            return r2
        L_0x005d:
            r0 = move-exception
            X.6u5 r1 = new X.6u5
            r1.<init>((java.io.IOException) r0)
            throw r1
        L_0x0064:
            r1 = move-exception
            boolean r0 = r1.wasThrownFromInputStream
            if (r0 == 0) goto L_0x0072
            X.6u5 r0 = new X.6u5
            r0.<init>((java.io.IOException) r1)
            throw r0
        L_0x006f:
            r1 = move-exception
            r1.unfinishedMessage = r2
        L_0x0072:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130786cX.A04(X.6cX, java.io.InputStream):X.6cX");
    }

    public static C85224Fk A06(C85224Fk r3) {
        int size = r3.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        C130176bX r32 = (C130176bX) r3;
        if (i >= r32.A00) {
            return new C130176bX(Arrays.copyOf(r32.A01, i), r32.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public static C188248ya A07(C188248ya r2) {
        int size = r2.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        return r2.BLN(i);
    }

    public static Object A09(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw AnonymousClass6CA.A0Q("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw AnonymousClass6CA.A0Q("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public void A0K() {
        AnonymousClass6C7.A0R(this).BKT(this);
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void Bsj(CodedOutputStream codedOutputStream) {
        C186358vA A0R = AnonymousClass6C7.A0R(this);
        AnonymousClass7VF r0 = codedOutputStream.A00;
        if (r0 == null) {
            r0 = new AnonymousClass7VF(codedOutputStream);
        }
        A0R.Bsk(r0, this);
    }

    public int hashCode() {
        if (A0L()) {
            return AnonymousClass6C7.A0R(this).BFY(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int BFY = AnonymousClass6C7.A0R(this).BFY(this);
        this.memoizedHashCode = BFY;
        return BFY;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("# ");
        A0o.append(obj);
        C161117p1.A00(this, A0o, 0);
        return A0o.toString();
    }
}
