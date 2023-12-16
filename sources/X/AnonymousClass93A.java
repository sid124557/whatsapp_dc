package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.93A  reason: invalid class name */
public class AnonymousClass93A implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass93A(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public void BQs(String str) {
        if (this.A04 != 0) {
            C18260x0.A0r("encb/EncryptedBackupProtocolHelper/sendBeginLoginIq/onDeliveryFailure id=", str, AnonymousClass001.A0o());
            ((C10350hn) this.A01).BSG("delivery failure", 3, -1);
            return;
        }
        ((AnonymousClass7T6) this.A01).A00(str, "Delivery failure", -1);
    }

    public void BSN(AnonymousClass36K r4, String str) {
        String str2;
        if (this.A04 != 0) {
            C161767qP.A02(r4, (C10350hn) this.A01, str);
            return;
        }
        int i = -1;
        try {
            i = ((C138786qz) ((C138956rH) AnonymousClass92Z.A00(C41032Ir.A02(r4, (C41032Ir) this.A02), r4, 33)).A00).A00().intValue();
            str2 = "Valid error code returned from server for serialized lookup";
        } catch (AnonymousClass24Y unused) {
            str2 = "Couldn't parse the IQ error for serialized lookup.";
        } catch (NumberFormatException unused2) {
            str2 = "Couldn't parse the error code for serialized lookup.";
        }
        ((AnonymousClass7T6) this.A01).A00(str, str2, i);
    }

    public void BdM(AnonymousClass36K r29, String str) {
        C368620a r1;
        int i;
        boolean z;
        int i2;
        int i3;
        Long l;
        AnonymousClass7SL r12;
        Integer num;
        long j;
        byte[] bArr;
        AnonymousClass2HW r4;
        int i4;
        AnonymousClass36K r11 = r29;
        String str2 = str;
        if (this.A04 != 0) {
            byte[] bArr2 = (byte[]) this.A02;
            C41032Ir r42 = (C41032Ir) this.A03;
            C02000Dg r0 = (C02000Dg) this.A01;
            C18260x0.A0s("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess id=", str2, AnonymousClass001.A0o());
            try {
                AnonymousClass36K A022 = C41032Ir.A02(r11, r42);
                Class<byte[]> cls = byte[].class;
                byte[] bArr3 = (byte[]) C626836d.A06(r11, cls, AnonymousClass0x2.A0U(), 1024L, (Object) null, new String[]{"l2", "#elementValue"}, false);
                byte[] bArr4 = (byte[]) C626836d.A06(r11, cls, 64L, 64, (Object) null, new String[]{"l2_sig", "#elementValue"}, false);
                AnonymousClass92Z.A01(A022, r11, 93);
                C626836d.A04(r11, C1896292a.A00(441), new String[0]);
                C626836d.A03(r11, C1896292a.A00(442), new String[]{"count"});
                C34821vs r7 = (C34821vs) C86614Ku.A0r(r11, new String[]{"backoff"}, 443);
                C626836d.A03(r11, C1896292a.A00(444), new String[]{"max_attempts"});
                if (r7 == null) {
                    j = 0;
                } else {
                    j = C18310x6.A0B(r7.A00);
                }
                byte[] bArr5 = C161767qP.A01;
                int length = bArr5.length;
                int length2 = bArr3.length;
                byte[] bArr6 = new byte[(length + length2)];
                System.arraycopy(bArr5, 0, bArr6, 0, length);
                System.arraycopy(bArr3, 0, bArr6, length, length2);
                if (!AnonymousClass0YS.A06(bArr6, bArr4, bArr2)) {
                    C18260x0.A0r("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess/l2 cannot be verified with l2_sig and ed_pub id=", str2, AnonymousClass001.A0o());
                    r0.BSG("l2 cannot be verified with l2_sig and ed_pub", 2, -1);
                    return;
                }
                int i5 = (int) j;
                r0.A00.A02();
                Object obj = r0.A0C;
                synchronized (obj) {
                    try {
                        bArr = r0.A06;
                        r4 = r0.A03;
                        i4 = r0.A01;
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                        throw th;
                    }
                }
                C54352oa WESOpaqueClientCreateLoginFinish = r0.A0B.WESOpaqueClientCreateLoginFinish(r4, bArr, bArr3, 100000);
                int A002 = WESOpaqueClientCreateLoginFinish.A00();
                if (A002 == -1) {
                    r0.A08.BSH("Login Failure Invalid Password", 8, 2, i4 - 1, i5);
                    return;
                } else if (A002 != 0) {
                    r0.A08.BSH(AnonymousClass000.A0Y("WESOpaqueClientCreateLoginFinish failed with WESOpaqueStatusType=", AnonymousClass001.A0o(), A002), 4, 2, -1, -1);
                    return;
                } else {
                    byte[] A023 = WESOpaqueClientCreateLoginFinish.A02();
                    synchronized (obj) {
                        try {
                            r0.A02 = WESOpaqueClientCreateLoginFinish;
                            r0.A07 = A023;
                            r0.A00 = 2;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    r0.A05();
                    return;
                }
            } catch (AnonymousClass24Y e) {
                Log.e("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess/invalid server response", e);
                r0.BSG("invalid server response", 1, -1);
                return;
            }
        } else {
            try {
                AnonymousClass92Z.A02(C41032Ir.A02(r11, (C41032Ir) this.A02), r11, 34);
                List A0B = C626836d.A0B(r11, C1896292a.A00(257), new String[]{"single_serialized_proof"}, 1, Long.MAX_VALUE);
                String[] strArr = (String[]) this.A03;
                int length3 = strArr.length;
                if (length3 != A0B.size()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("keytransparencyprotocolhelper/sendmultiserializedlookupiq Requested number of multi serialized lookups do not match the received proofs: ");
                    A0o.append(length3);
                    AnonymousClass000.A1H(" vs. ", A0o, A0B);
                    C18260x0.A1K(A0o, ". Parsing canceled.");
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    AnonymousClass000.A1H("Server returned response has ", A0o2, A0B);
                    A0o2.append(" proof response(s) whereas the request included ");
                    A0o2.append(length3);
                    ((AnonymousClass7T6) this.A01).A00(str2, AnonymousClass000.A0X(" label(s).", A0o2), -1);
                    return;
                }
                byte[][] bArr7 = new byte[length3][];
                byte[][] bArr8 = new byte[length3][];
                byte[][] bArr9 = new byte[length3][];
                int[] iArr = new int[length3];
                for (int i6 = 0; i6 < A0B.size(); i6++) {
                    ((C183468q5) ((C138666qn) A0B.get(i6)).A00).Aw3(new C149877Og(this, iArr, bArr7, bArr8, bArr9, i6));
                }
                AnonymousClass7T6 r6 = (AnonymousClass7T6) this.A01;
                Log.d("keytransparencymanager/multiserializedlookup Multi serialized lookup callback success.");
                C18260x0.A0q("keytransparencymanager/multiserializedlookup IQ id: ", str2, AnonymousClass001.A0o());
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("keytransparencymanager/multiserializedlookup User labels: ");
                C18260x0.A1J(A0o3, Arrays.toString(strArr));
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < length3; i9++) {
                    int i10 = iArr[i9];
                    if (i10 != 0) {
                        if (i10 == 16792) {
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                }
                if (i8 != 0) {
                    r1 = C368620a.FAIL;
                } else if (i7 != 0) {
                    r1 = C368620a.PENDING;
                } else {
                    r1 = C368620a.SUCCESS;
                }
                C368620a r15 = C368620a.FAIL;
                if (r1 == r15) {
                    Log.e("One of the proof requests returned error. Failing verification and returning a not found.");
                    r12 = r6.A00;
                    num = C1460878n.A00;
                } else if (r1 == C368620a.PENDING) {
                    Log.e("One of the proof requests returned pending. Pending verification.");
                    r12 = r6.A00;
                    num = C1460878n.A01;
                } else {
                    HashMap A0t = AnonymousClass001.A0t();
                    for (int i11 = 0; i11 < length3; i11++) {
                        byte[] bArr10 = bArr9[i11];
                        byte[] bArr11 = bArr7[i11];
                        byte[] bArr12 = bArr8[i11];
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("keytransparencymanager/multiserializedlookup Serialized lookup proof size in bytes: ");
                        C18260x0.A1F(A0o4, bArr10.length);
                        StringBuilder A0o5 = AnonymousClass001.A0o();
                        A0o5.append("keytransparencymanager/multiserializedlookup Root hash signature size in bytes: ");
                        int length4 = bArr12.length;
                        C18260x0.A1F(A0o5, length4);
                        C18260x0.A0q("keytransparencymanager/multiserializedlookup Root hash hex:", C627236i.A06(bArr11), AnonymousClass001.A0o());
                        C59682xJ r43 = r6.A01;
                        C56612sH r17 = r43.A00;
                        long A0H = r17.A0H();
                        byte[] bytes = strArr[i11].getBytes();
                        byte[] bArr13 = r6.A02[i11];
                        if (bArr11 == null || bytes == null || bArr13 == null) {
                            Log.d("nativekeytransparency/verifyserializedlookup Null parameter(s). Skipping verification");
                            i2 = -8;
                            z = false;
                        } else {
                            AnonymousClass7E0 r02 = new AnonymousClass7E0((NativeHolder) JniBridge.jvidispatchOOOOO(4, bArr11, bytes, bArr10, bArr13));
                            JniBridge.getInstance();
                            i2 = (int) JniBridge.jvidispatchIIO(1, (long) 73, r02.A00);
                            if (i2 == 0) {
                                byte[] bArr14 = (byte[]) A0t.get(bArr11);
                                if (bArr14 == null || !Arrays.equals(bArr14, bArr12)) {
                                    byte[] bArr15 = C59682xJ.A06;
                                    try {
                                        AnonymousClass7R4 r22 = new AnonymousClass7R4();
                                        int length5 = bArr11.length;
                                        int i12 = length4 + length5;
                                        byte[] bArr16 = new byte[i12];
                                        System.arraycopy(bArr12, 0, bArr16, 0, length4);
                                        System.arraycopy(bArr11, 0, bArr16, length4, length5);
                                        int A003 = AnonymousClass76G.A00(r22, new byte[i12], bArr16, bArr15, (long) i12);
                                        i2 = -9;
                                        if (A003 == 0) {
                                            i = 0;
                                            A0t.put(ByteBuffer.wrap(bArr11), bArr12);
                                        }
                                    } catch (AnonymousClass8RS | IllegalArgumentException e2) {
                                        Log.e("keytransparencymanager/verifyEd25519Signature/exception.", e2);
                                        i2 = -9;
                                    }
                                } else {
                                    i = 0;
                                }
                                z = true;
                            }
                            z = false;
                        }
                        long A0H2 = r17.A0H();
                        C18260x0.A1D("keytransparencymanager/multiserializedlookup NativeKeyTransparency.verifySerializedLookup result: ", AnonymousClass001.A0o(), z);
                        C102015Hd r10 = r43.A02;
                        Integer valueOf = Integer.valueOf(i);
                        Boolean valueOf2 = Boolean.valueOf(z);
                        Long valueOf3 = Long.valueOf(A0H);
                        Long valueOf4 = Long.valueOf(A0H2);
                        if (r10.A00.A0X(2966)) {
                            if (valueOf == null || valueOf.intValue() == 0) {
                                boolean A1Q = AnonymousClass0x9.A1Q(valueOf2);
                                i3 = 2;
                                if (A1Q) {
                                    i3 = 0;
                                }
                            } else {
                                i3 = 1;
                            }
                            Long l2 = null;
                            if (valueOf4 == null || valueOf3 == null || A0H > A0H2 || (l = C18310x6.A0f(A0H2, A0H)) == null || i3 != 0) {
                                l = null;
                            }
                            C24731Yn r2 = new C24731Yn();
                            r2.A00 = 0;
                            r2.A02 = l;
                            r2.A01 = Integer.valueOf(i3);
                            if (valueOf != null) {
                                l2 = C18280x3.A0U(valueOf);
                            }
                            r2.A03 = l2;
                            C18260x0.A1P(AnonymousClass001.A0o(), "keytransparencyperftracker/sendevent sending WAM event: ", r2);
                            r10.A01.BhD(r2);
                        }
                        if (!z) {
                            Log.e("Proof verification failed. Returning failure.");
                            r6.A00.A00.BPQ(r15);
                            return;
                        }
                    }
                    StringBuilder A0o6 = AnonymousClass001.A0o();
                    A0o6.append("keytransparencymanager/multiserializedlookup Verified root hash/signature cache size: ");
                    C18260x0.A1F(A0o6, A0t.size());
                    r6.A00.A00.BPQ(C368620a.SUCCESS);
                    return;
                }
                r12.A00(num.intValue());
                return;
            } catch (AnonymousClass24Y e3) {
                ((AnonymousClass7T6) this.A01).A00(str2, "IQ error encountered on client sending multi serialized lookup request (e.g., wrong SMAX in server response).", -1);
                e3.printStackTrace();
                return;
            }
        }
        throw th;
    }
}
