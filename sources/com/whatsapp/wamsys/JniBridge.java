package com.whatsapp.wamsys;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1DQ;
import X.AnonymousClass2HW;
import X.AnonymousClass2HX;
import X.AnonymousClass2IX;
import X.AnonymousClass2IZ;
import X.AnonymousClass2JM;
import X.AnonymousClass2JO;
import X.AnonymousClass2JP;
import X.AnonymousClass2O7;
import X.AnonymousClass2PH;
import X.AnonymousClass2PI;
import X.AnonymousClass2UC;
import X.AnonymousClass2XD;
import X.AnonymousClass31C;
import X.AnonymousClass31S;
import X.AnonymousClass32Y;
import X.AnonymousClass3H0;
import X.AnonymousClass4FV;
import X.AnonymousClass5CK;
import X.AnonymousClass5CL;
import X.AnonymousClass5ZC;
import X.C130786cX;
import X.C135146kC;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C183538qC;
import X.C27981fH;
import X.C40872Ib;
import X.C40892Id;
import X.C40902Ie;
import X.C40922Ig;
import X.C40932Ih;
import X.C40942Ii;
import X.C42962Qf;
import X.C45672aO;
import X.C48162eS;
import X.C48972fm;
import X.C51032jA;
import X.C54352oa;
import X.C54422oh;
import X.C54542ot;
import X.C54562ov;
import X.C55252q3;
import X.C56612sH;
import X.C56812sb;
import X.C56862sg;
import X.C58312v3;
import X.C58332v5;
import X.C58352v7;
import X.C59142wQ;
import X.C621133n;
import X.C626936e;
import X.C66353La;
import X.C834848p;
import X.C836749i;
import X.C85284Fq;
import com.facebook.msys.mcf.MsysError;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.ProtocolJniHelper;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class JniBridge {
    public static C42962Qf DEPENDENCIES;
    public static volatile JniBridge INSTANCE;
    public final AnonymousClass2XD jniBridgeExceptionHandler;
    public AnonymousClass2UC jniCallbacksIJniCallbacks;
    public AnonymousClass5CK jniCallbacksIJniCallbacksAndroidGpia;
    public AnonymousClass5CL jniCallbacksIJniCallbacksAndroidRegistration;
    public final AtomicReference wajContext = new AtomicReference();

    public static long jnidispatchIIOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj6;
            String str = (String) obj;
            String str2 = (String) obj2;
            Map map = (Map) obj4;
            Map map2 = (Map) obj5;
            C56812sb r3 = (C56812sb) obj3;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r3.A0B(str, str2, map, map2, i2, i);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static Object jnidispatchOI(long j) {
        try {
            byte[] bArr = new byte[((int) j)];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return bArr;
        } catch (Exception e) {
            throw C18330xA.A09(e);
        } catch (Exception e2) {
            AnonymousClass2XD.A00(e2);
            return null;
        }
    }

    public static Object jnidispatchOIO(int i, long j, Object obj) {
        HashMap hashMap;
        if (i != 0) {
            if (i == 1) {
                int i2 = (int) j;
                C55252q3 r3 = ((C40872Ib) C18280x3.A0R(obj).A09.get()).A00.A09;
                byte[] A04 = r3.A04(i2);
                hashMap = null;
                if (A04 != null) {
                    try {
                        C18260x0.A0y("axolotl found a pre key with id ", AnonymousClass001.A0o(), i2);
                        C621133n.A00(A04, i2);
                        return A04;
                    } catch (IOException e) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("error reading prekey ");
                        A0o.append(i2);
                        C18260x0.A15("; deleting", A0o, e);
                        r3.A02(i2);
                        return null;
                    }
                }
            } else if (i != 2) {
                return null;
            } else {
                try {
                    int i3 = (int) j;
                    C40872Ib r0 = (C40872Ib) C18280x3.A0R(obj).A09.get();
                    if (i3 <= 0) {
                        return null;
                    }
                    List<AnonymousClass2JO> A01 = r0.A00.A09.A01();
                    hashMap = AnonymousClass001.A0t();
                    for (AnonymousClass2JO r2 : A01) {
                        hashMap.put(Integer.valueOf(r2.A00), r2.A01);
                        if (hashMap.size() == i3) {
                            return hashMap;
                        }
                    }
                } catch (Exception e2) {
                    AnonymousClass2XD.A00(e2);
                    return null;
                }
            }
            return hashMap;
        }
        int i4 = (int) j;
        byte[] A02 = ((C40902Ie) C18280x3.A0R(obj).A0E.get()).A00.A0C.A02(i4);
        if (A02 == null) {
            C18260x0.A0x("no signed prekey available with id ", AnonymousClass001.A0o(), i4);
            return null;
        }
        try {
            C18260x0.A0y("axolotl loaded a signed pre key with id ", AnonymousClass001.A0o(), i4);
            C130786cX.A05(AnonymousClass1DQ.DEFAULT_INSTANCE, A02);
            return A02;
        } catch (IOException e3) {
            Log.e(AnonymousClass000.A0Y("failed to parse signed pre key record during load for id ", AnonymousClass001.A0o(), i4), e3);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchOIOO(int r6, long r7, java.lang.Object r9, java.lang.Object r10) {
        /*
            r1 = 0
            if (r6 == 0) goto L_0x0070
            r0 = 1
            if (r6 == r0) goto L_0x004e
            r0 = 2
            if (r6 == r0) goto L_0x000a
            return r1
        L_0x000a:
            X.2UC r0 = X.C18280x3.A0R(r10)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d3 }
            int r2 = (int) r7     // Catch:{ Exception -> 0x00d3 }
            X.8qC r0 = r0.A0C     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x00d3 }
            X.2aO r5 = (X.C45672aO) r5     // Catch:{ Exception -> 0x00d3 }
            X.2ov r4 = A00(r9, r2)     // Catch:{ Exception -> 0x00d3 }
            X.2pw r3 = r5.A00     // Catch:{ Exception -> 0x00d3 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x00d3 }
            X.2wr r0 = r3.A01(r4)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002c
            byte[] r2 = r0.A00()     // Catch:{ all -> 0x004b }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            goto L_0x0048
        L_0x002c:
            X.33n r0 = r5.A01     // Catch:{ all -> 0x004b }
            X.2ot r0 = r0.A0B     // Catch:{ all -> 0x004b }
            byte[] r0 = r0.A03(r4)     // Catch:{ all -> 0x004b }
            r2 = 0
            if (r0 != 0) goto L_0x0040
            X.2wr r0 = new X.2wr     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            r3.A04(r0, r4)     // Catch:{ all -> 0x004b }
            goto L_0x002a
        L_0x0040:
            X.C55182pw.A00(r3, r4, r0)     // Catch:{ IOException -> 0x0044 }
            goto L_0x0049
        L_0x0044:
            r5.A00(r4)     // Catch:{ all -> 0x004b }
            goto L_0x002a
        L_0x0048:
            return r2
        L_0x0049:
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            return r0
        L_0x004b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ Exception -> 0x00d3 }
        L_0x004e:
            X.2UC r0 = X.C18280x3.A0R(r10)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d3 }
            int r2 = (int) r7     // Catch:{ Exception -> 0x00d3 }
            X.8qC r0 = r0.A08     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00d3 }
            X.2Ia r0 = (X.C40862Ia) r0     // Catch:{ Exception -> 0x00d3 }
            X.2ov r2 = A00(r9, r2)     // Catch:{ Exception -> 0x00d3 }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x00d3 }
            X.2e4 r0 = r0.A08(r2)     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00d1
            X.2jv r0 = r0.A00     // Catch:{ Exception -> 0x00d3 }
            byte[] r0 = r0.A00()     // Catch:{ Exception -> 0x00d3 }
            return r0
        L_0x0070:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d3 }
            int r0 = (int) r7     // Catch:{ Exception -> 0x00d3 }
            X.2Ip r10 = (X.C41012Ip) r10     // Catch:{ Exception -> 0x00d3 }
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0080;
                case 2: goto L_0x0083;
                case 3: goto L_0x0086;
                case 4: goto L_0x0089;
                case 5: goto L_0x008c;
                case 6: goto L_0x008f;
                case 7: goto L_0x0078;
                case 8: goto L_0x0092;
                case 9: goto L_0x007a;
                default: goto L_0x0078;
            }     // Catch:{ Exception -> 0x00d3 }
        L_0x0078:
            r0 = 0
            goto L_0x0094
        L_0x007a:
            X.38t r0 = X.C633138t.A0L     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x007d:
            X.38t r0 = X.C633138t.A0C     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x0080:
            X.38t r0 = X.C633138t.A0J     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x0083:
            X.38t r0 = X.C633138t.A05     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x0086:
            X.38t r0 = X.C633138t.A09     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x0089:
            X.38t r0 = X.C633138t.A0g     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x008c:
            X.38t r0 = X.C633138t.A04     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x008f:
            X.38t r0 = X.C633138t.A0b     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0094
        L_0x0092:
            X.38t r0 = X.C633138t.A0K     // Catch:{ Exception -> 0x00d3 }
        L_0x0094:
            X.319 r3 = r10.A00     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00c9
            byte r0 = r0.A00     // Catch:{ Exception -> 0x00d3 }
        L_0x009a:
            r2 = 0
            X.2S8 r4 = r3.A0A(r9, r0, r2)     // Catch:{ Exception -> 0x00d3 }
            if (r4 == 0) goto L_0x00cb
            byte[] r5 = android.util.Base64.decode(r9, r2)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r4.A03     // Catch:{ Exception -> 0x00d3 }
            byte[] r6 = android.util.Base64.decode(r0, r2)     // Catch:{ Exception -> 0x00d3 }
            byte r0 = r4.A00     // Catch:{ Exception -> 0x00d3 }
            X.38t r0 = X.AnonymousClass36O.A01(r1, r0, r2)     // Catch:{ Exception -> 0x00d3 }
            int r8 = X.C387729e.A00(r0)     // Catch:{ Exception -> 0x00d3 }
            X.33C r0 = r4.A02     // Catch:{ Exception -> 0x00d3 }
            byte[] r7 = r0.A0W     // Catch:{ Exception -> 0x00d3 }
            long r2 = r0.A0B     // Catch:{ Exception -> 0x00d3 }
            long r9 = X.C18290x4.A0B(r2)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r3 = r0.A0G     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r4 = r4.A04     // Catch:{ Exception -> 0x00d3 }
            X.2v0 r2 = new X.2v0     // Catch:{ Exception -> 0x00d3 }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00cc
        L_0x00c9:
            r0 = -1
            goto L_0x009a
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            if (r2 == 0) goto L_0x00d1
            com.facebook.simplejni.NativeHolder r0 = r2.A00     // Catch:{ Exception -> 0x00d3 }
            return r0
        L_0x00d1:
            r0 = 0
            return r0
        L_0x00d3:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchOIOO(int, long, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static Object jnidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        if (i == 0) {
            AnonymousClass2JP A01 = ((C40892Id) C18280x3.A0R(obj3).A0B.get()).A00.A0A.A01(new C54422oh(A00((String) obj2, (int) j), (String) obj));
            C58332v5 r4 = null;
            if (A01 != null) {
                try {
                    byte[] bArr = A01.A01;
                    long j2 = A01.A00;
                    new C58352v7(bArr);
                    r4 = new C58332v5(bArr, j2);
                } catch (IOException e) {
                    Log.e("SenderKeyStoreImpl/loadSenderKeyImpl", e);
                }
            }
            if (r4 != null) {
                return r4.A00;
            }
            return null;
        } else if (i == 1) {
            AnonymousClass2JM A00 = ((AnonymousClass2IZ) C18280x3.A0R(obj3).A07.get()).A00.A06.A00(new C54422oh(A00((String) obj2, (int) j), (String) obj));
            C58312v3 r3 = null;
            if (A00 != null) {
                try {
                    byte[] bArr2 = A00.A01;
                    new C59142wQ(bArr2);
                    r3 = new C58312v3(bArr2, A00.A00);
                } catch (IOException e2) {
                    Log.e("FastRatchetSenderKeyStoreImpl/loadFastRatchetSenderKeyImpl", e2);
                }
            }
            if (r3 != null) {
                return r3.A00;
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            try {
                byte b = (byte) ((int) j);
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).createKeyValue((String) obj, (String) obj2, obj3, b);
            } catch (Exception e3) {
                AnonymousClass2XD.A00(e3);
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0005, B:43:0x00cc] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchOO(int r7, java.lang.Object r8) {
        /*
            r6 = 0
            switch(r7) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0117;
                case 2: goto L_0x0045;
                case 3: goto L_0x0065;
                case 4: goto L_0x0133;
                case 5: goto L_0x0088;
                case 6: goto L_0x00d5;
                case 7: goto L_0x00de;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00fc;
                case 10: goto L_0x0105;
                case 11: goto L_0x010e;
                case 12: goto L_0x0005;
                default: goto L_0x0004;
            }
        L_0x0004:
            return r6
        L_0x0005:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0159 }
            X.2UC r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0159 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0159 }
            X.8qC r0 = r0.A0A     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0159 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r0 = r0.createNewJid(r8)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x0018:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0159 }
            X.2UC r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0159 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0159 }
            X.2IY r1 = r0.A03     // Catch:{ Exception -> 0x0159 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0159 }
            r5 = 0
            if (r0 != 0) goto L_0x0044
            X.3Es r0 = r1.A00     // Catch:{ UnknownHostException -> 0x0044 }
            X.2vo r0 = r0.A00(r8)     // Catch:{ UnknownHostException -> 0x0044 }
            java.net.InetAddress[] r4 = r0.A04     // Catch:{ UnknownHostException -> 0x0044 }
            int r3 = r4.length     // Catch:{ UnknownHostException -> 0x0044 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ UnknownHostException -> 0x0044 }
            r1 = 0
        L_0x0035:
            if (r1 >= r3) goto L_0x0043
            r0 = r4[r1]     // Catch:{ UnknownHostException -> 0x0044 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0044 }
            r2.add(r0)     // Catch:{ UnknownHostException -> 0x0044 }
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0043:
            return r2
        L_0x0044:
            return r5
        L_0x0045:
            X.2UC r0 = X.C18280x3.A0R(r8)     // Catch:{ Exception -> 0x0159 }
            X.2IW r0 = r0.A02     // Catch:{ Exception -> 0x0159 }
            X.31B r0 = r0.A00     // Catch:{ Exception -> 0x0159 }
            X.3dh r0 = r0.A05()     // Catch:{ Exception -> 0x0159 }
            X.3df r0 = r0.A01     // Catch:{ Exception -> 0x0159 }
            byte[] r1 = r0.A01     // Catch:{ Exception -> 0x0159 }
            int r2 = r1.length     // Catch:{ Exception -> 0x0159 }
            r0 = 32
            if (r2 == r0) goto L_0x0064
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = "AuthKeyStoreImpl/the key length is not expected/privateLength="
            X.C18260x0.A0z(r0, r1, r2)     // Catch:{ Exception -> 0x0159 }
            r1 = 0
        L_0x0064:
            return r1
        L_0x0065:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0159 }
            X.2UC r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0159 }
            byte[] r8 = (byte[]) r8     // Catch:{ Exception -> 0x0159 }
            X.8qC r0 = r0.A05     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x0159 }
            X.2JD r2 = (X.AnonymousClass2JD) r2     // Catch:{ Exception -> 0x0159 }
            boolean r0 = X.C107385bE.A02()     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x0131
            if (r8 == 0) goto L_0x0131
            X.2rQ r1 = r2.A01     // Catch:{ Exception -> 0x0159 }
            X.31B r0 = r2.A00     // Catch:{ Exception -> 0x0159 }
            byte[] r0 = r0.A0K()     // Catch:{ Exception -> 0x0159 }
            byte[] r0 = r1.A07(r8, r0)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x0088:
            X.2UC r0 = X.C18280x3.A0R(r8)     // Catch:{ Exception -> 0x0159 }
            X.8qC r0 = r0.A0E     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0159 }
            X.2Ie r0 = (X.C40902Ie) r0     // Catch:{ Exception -> 0x0159 }
            X.33n r1 = r0.A00     // Catch:{ Exception -> 0x0159 }
            X.30x r0 = r1.A0K     // Catch:{ Exception -> 0x0159 }
            X.3fe r2 = r0.A03()     // Catch:{ Exception -> 0x0159 }
            X.2jN r0 = r1.A0C     // Catch:{ all -> 0x00c9 }
            byte[] r1 = r0.A01()     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00c1
            X.1DQ r0 = X.AnonymousClass1DQ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x00b6 }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ IOException -> 0x00b6 }
            X.1DQ r0 = (X.AnonymousClass1DQ) r0     // Catch:{ IOException -> 0x00b6 }
            if (r2 == 0) goto L_0x00b1
            r2.close()     // Catch:{ Exception -> 0x0159 }
        L_0x00b1:
            byte[] r0 = r0.A0F()     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x00b6:
            r1 = move-exception
            java.lang.String r0 = "failed to parse the latest signed prekey record"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c9 }
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r1)     // Catch:{ all -> 0x00c9 }
            goto L_0x00c8
        L_0x00c1:
            java.lang.String r0 = "no signed prekey record found"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x00c9 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
            if (r2 == 0) goto L_0x00d4
            r2.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0159 }
        L_0x00d4:
            throw r1     // Catch:{ Exception -> 0x0159 }
        L_0x00d5:
            com.whatsapp.protocol.ProtocolJniHelper r0 = X.AnonymousClass2UC.A00()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r0.getTagFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x00de:
            com.whatsapp.protocol.ProtocolJniHelper r0 = X.AnonymousClass2UC.A00()     // Catch:{ Exception -> 0x0159 }
            java.lang.Object[] r0 = r0.getAttributesFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x0131
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x00ed:
            com.whatsapp.protocol.ProtocolJniHelper r0 = X.AnonymousClass2UC.A00()     // Catch:{ Exception -> 0x0159 }
            java.lang.Object[] r0 = r0.getChildrenFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x0131
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x00fc:
            com.whatsapp.protocol.ProtocolJniHelper r0 = X.AnonymousClass2UC.A00()     // Catch:{ Exception -> 0x0159 }
            byte[] r0 = r0.getDataFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x0105:
            com.whatsapp.protocol.ProtocolJniHelper r0 = X.AnonymousClass2UC.A00()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r0.getKeyFromKeyValue(r8)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x010e:
            com.whatsapp.protocol.ProtocolJniHelper r0 = X.AnonymousClass2UC.A00()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r0.getValueStringFromKeyValue(r8)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x0117:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0159 }
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r8)     // Catch:{ Exception -> 0x0159 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ Exception -> 0x0159 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = r1.user     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = X.C386028i.A00(r0)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x012a:
            boolean r0 = r1 instanceof X.C27981fH     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = r1.user     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x0131:
            r0 = 0
            return r0
        L_0x0133:
            java.lang.String r0 = "wamsys/JniBridge wamsys -> java crossing for WESIdentityKeyStoreAPICopyIdentityKeyPair"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x0159 }
            X.2UC r0 = X.C18280x3.A0R(r8)     // Catch:{ Exception -> 0x0159 }
            X.8qC r0 = r0.A08     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0159 }
            X.2Ia r0 = (X.C40862Ia) r0     // Catch:{ Exception -> 0x0159 }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x0159 }
            X.2qF r0 = r0.A07     // Catch:{ Exception -> 0x0159 }
            X.2JN r0 = r0.A02()     // Catch:{ Exception -> 0x0159 }
            byte[] r2 = r0.A01     // Catch:{ Exception -> 0x0159 }
            byte[] r1 = r0.A00     // Catch:{ Exception -> 0x0159 }
            X.2v4 r0 = new X.2v4     // Catch:{ Exception -> 0x0159 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0159 }
            com.facebook.simplejni.NativeHolder r0 = r0.A00     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x0159:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchOO(int, java.lang.Object):java.lang.Object");
    }

    public static native double jvidispatchDIO(int i, long j, Object obj);

    public static native long jvidispatchI();

    public static native long jvidispatchIIDO(int i, long j, double d, Object obj);

    public static native long jvidispatchIIDOOOO(long j, double d, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIDO(long j, long j2, double d, Object obj);

    public static native long jvidispatchIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIIIIIOO(long j, long j2, long j3, long j4, Object obj, Object obj2);

    public static native long jvidispatchIIIIIOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIIO(int i, long j, long j2, long j3, Object obj);

    public static native long jvidispatchIIIIOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIIIIOOOOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public static native long jvidispatchIIIO(int i, long j, long j2, Object obj);

    public static native long jvidispatchIIIOO(int i, long j, long j2, Object obj, Object obj2);

    public static native long jvidispatchIIO(int i, long j, Object obj);

    public static native long jvidispatchIIOO(int i, long j, Object obj, Object obj2);

    public static native long jvidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIIOOOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIO(int i, Object obj);

    public static native long jvidispatchIOO(int i, Object obj, Object obj2);

    public static native long jvidispatchIOOO(int i, Object obj, Object obj2, Object obj3);

    public static native long jvidispatchIOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native long jvidispatchIOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIOOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIOOOOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public static native Object jvidispatchO(int i);

    public static native Object jvidispatchOII(long j, long j2);

    public static native Object jvidispatchOIII(long j, long j2, long j3);

    public static native Object jvidispatchOIIIIIIOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11);

    public static native Object jvidispatchOIIIOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIIIOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native Object jvidispatchOIIO(int i, long j, long j2, Object obj);

    public static native Object jvidispatchOIO(int i, long j, Object obj);

    public static native Object jvidispatchOIOO(int i, long j, Object obj, Object obj2);

    public static native Object jvidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOO(int i, Object obj);

    public static native Object jvidispatchOOO(int i, Object obj, Object obj2);

    public static native Object jvidispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native Object jvidispatchOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native Object jvidispatchOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public C40942Ii WcmMsmsgSecretAPICreateFromBotMessageSecret(C40932Ih r7, String str, UserJid userJid, UserJid userJid2) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOOOOO(0, str, AnonymousClass0x9.A0r(this), r7.A00, userJid.getRawString(), userJid2.getRawString());
        if (nativeHolder != null) {
            return new C40942Ii(nativeHolder);
        }
        return null;
    }

    public static JniBridge getInstance() {
        if (INSTANCE == null) {
            synchronized (JniBridge.class) {
                if (INSTANCE == null) {
                    C42962Qf r0 = DEPENDENCIES;
                    if (r0 != null) {
                        INSTANCE = new JniBridge((AnonymousClass2UC) r0.A01.get(), (AnonymousClass5CL) DEPENDENCIES.A03.get(), (AnonymousClass5CK) DEPENDENCIES.A02.get(), (AnonymousClass2XD) DEPENDENCIES.A00.get());
                    } else {
                        throw AnonymousClass001.A0e("Dependencies are not set. Call setDependencies() first.");
                    }
                }
            }
        }
        return INSTANCE;
    }

    public static long jnidispatchI(int i) {
        if (i == 0) {
            return C56612sH.A00(INSTANCE.jniCallbacksIJniCallbacks.A00);
        }
        if (i == 1 || i != 2) {
            return 0;
        }
        try {
            AnonymousClass2O7 r1 = (AnonymousClass2O7) INSTANCE.jniCallbacksIJniCallbacks.A0G.get();
            if (AnonymousClass0x9.A1Q(C626936e.A01)) {
                return 0;
            }
            C183538qC r2 = r1.A01;
            if (!AnonymousClass000.A1U(((C66353La) r2.get()).A00.A04, 2)) {
                return 0;
            }
            AnonymousClass31C r12 = ((C66353La) r2.get()).A01;
            return (!r12.A02.A06 || r12.A0D == null) ? 0 : 1;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj7;
            String str = (String) obj;
            String str2 = (String) obj2;
            int i3 = (int) j2;
            int i4 = (int) j3;
            int i5 = (int) j4;
            int i6 = (int) j5;
            int i7 = (int) j6;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            int i8 = (int) j7;
            int i9 = (int) j8;
            String str5 = (String) obj5;
            C56812sb r1 = (C56812sb) obj6;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j14 = j11;
            long j15 = j10;
            long j16 = j9;
            int i10 = i8;
            int i11 = i9;
            int i12 = i4;
            int i13 = i5;
            int i14 = i6;
            int i15 = i7;
            String str6 = str5;
            int i16 = i2;
            int i17 = i3;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            C56812sb r18 = r1;
            String str10 = str;
            r18.A05(str10, str7, str8, str9, str6, i16, i, i17, i12, i13, i14, i15, i10, i11, j16, j15, j14, j12, j13);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIO(long j, long j2, long j3, long j4, long j5, Object obj) {
        Object obj2 = obj;
        try {
            AnonymousClass2UC r4 = INSTANCE.jniCallbacksIJniCallbacks;
            AnonymousClass5ZC A0T = AnonymousClass0x9.A0T((int) j3, (int) j4, (int) j5);
            AnonymousClass4FV r8 = r4.A01;
            r8.Bh9(A0T, (byte[]) obj2, (int) j, (int) j2, false);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIOOO(int i, long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3) {
        int i2;
        int i3;
        Object obj4 = obj2;
        Object obj5 = obj;
        Object obj6 = obj3;
        long j6 = j2;
        long j7 = j4;
        if (i == 0) {
            int i4 = (int) j;
            MsysError msysError = (MsysError) obj6;
            String str = (String) obj5;
            int i5 = (int) j6;
            int i6 = (int) j3;
            boolean A1S = AnonymousClass000.A1S((0 > j5 ? 1 : (0 == j5 ? 0 : -1)));
            C56812sb r7 = (C56812sb) obj4;
            if (msysError != null) {
                i2 = msysError.getCode();
            } else {
                i2 = 0;
            }
            r7.A02(str, i4, i2, i5, i6, j7, A1S);
            return 0;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                int i7 = (int) j;
                MsysError msysError2 = (MsysError) obj6;
                String str2 = (String) obj5;
                int i8 = (int) j6;
                boolean A1S2 = AnonymousClass000.A1S((0 > j5 ? 1 : (0 == j5 ? 0 : -1)));
                C56812sb r72 = (C56812sb) obj4;
                if (msysError2 != null) {
                    i3 = msysError2.getCode();
                } else {
                    i3 = 0;
                }
                r72.A03(str2, i7, i3, i8, j7, A1S2);
                return 0;
            } catch (Exception e) {
                AnonymousClass2XD.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIIIIIIOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj6;
            int i3 = (int) j3;
            Map map = (Map) obj4;
            Map map2 = (Map) obj5;
            C56812sb r5 = (C56812sb) obj3;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A0D(map, map2, i2, i, i3, j4, j5);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIOOOOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj7;
            int i3 = (int) j2;
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            int i4 = (int) j3;
            Map map = (Map) obj5;
            Map map2 = (Map) obj6;
            C56812sb r5 = (C56812sb) obj4;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A0A(str, str2, str3, map, map2, i2, i, i3, i4, j4);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIO(int i, long j, long j2, long j3, Object obj) {
        if (i == 0) {
            ((AnonymousClass2PI) obj).A01.A0C(j2);
        } else if (i == 1) {
            try {
                ((AnonymousClass2PH) obj).A01.A0C(j2);
                return 0;
            } catch (Exception e) {
                AnonymousClass2XD.A00(e);
                return 0;
            }
        }
        return 0;
    }

    public static long jnidispatchIIIOO(long j, long j2, Object obj, Object obj2) {
        try {
            throw AnonymousClass001.A0g("completionCallback");
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIOOO(long j, long j2, Object obj, Object obj2, Object obj3) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj3;
            String str = (String) obj;
            int i3 = (int) j2;
            C56812sb r10 = (C56812sb) obj2;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r10.A01(i2, i, str, i3);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIOOOOO(long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj5;
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            C56812sb r3 = (C56812sb) obj4;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r3.A04(str, str2, str3, i2, i, j2);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015b, code lost:
        if (r1 == 7) goto L_0x015d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIO(int r15, long r16, java.lang.Object r18) {
        /*
            r4 = r18
            r8 = 0
            r2 = r16
            if (r15 == 0) goto L_0x0141
            r0 = 1
            if (r15 == r0) goto L_0x013e
            r0 = 2
            if (r15 == r0) goto L_0x00cf
            r0 = 3
            if (r15 == r0) goto L_0x008d
            r0 = 4
            if (r15 == r0) goto L_0x002d
            r0 = 5
            if (r15 != r0) goto L_0x0175
            X.2UC r0 = X.C18280x3.A0R(r4)     // Catch:{ Exception -> 0x0176 }
            int r1 = (int) r2     // Catch:{ Exception -> 0x0176 }
            X.8qC r0 = r0.A09     // Catch:{ Exception -> 0x0176 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0176 }
            X.2Ib r0 = (X.C40872Ib) r0     // Catch:{ Exception -> 0x0176 }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x0176 }
            X.2q3 r0 = r0.A09     // Catch:{ Exception -> 0x0176 }
            r0.A02(r1)     // Catch:{ Exception -> 0x0176 }
            goto L_0x013e
        L_0x002d:
            X.2UC r0 = X.C18280x3.A0R(r4)     // Catch:{ Exception -> 0x0176 }
            int r6 = (int) r2     // Catch:{ Exception -> 0x0176 }
            X.8qC r0 = r0.A09     // Catch:{ Exception -> 0x0176 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0176 }
            X.2Ib r0 = (X.C40872Ib) r0     // Catch:{ Exception -> 0x0176 }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x0176 }
            X.2q3 r0 = r0.A09     // Catch:{ Exception -> 0x0176 }
            X.1RJ r0 = r0.A02     // Catch:{ Exception -> 0x0176 }
            X.4GK r7 = r0.get()     // Catch:{ Exception -> 0x0176 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ca }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = "SELECT COUNT(*) AS count FROM prekeys WHERE prekey_id = ?"
            r4 = 1
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ca }
            r3 = 0
            r1[r3] = r0     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "SignalPreKeyStore/containsPreKey"
            android.database.Cursor r2 = r5.A0E(r2, r0, r1)     // Catch:{ all -> 0x00ca }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0069
            int r0 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x0081 }
            if (r0 > 0) goto L_0x0068
            r4 = 0
        L_0x0068:
            r3 = r4
        L_0x0069:
            r2.close()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r7)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r0 = "axolotl has a pre key with id "
            r1.append(r0)     // Catch:{ Exception -> 0x0176 }
            r1.append(r6)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r0 = ": "
            X.C18260x0.A1E(r0, r1, r3)     // Catch:{ Exception -> 0x0176 }
            if (r3 == 0) goto L_0x0175
            goto L_0x013e
        L_0x0081:
            r1 = move-exception
            if (r2 == 0) goto L_0x008c
            r2.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ca }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x008d:
            X.2UC r0 = X.C18280x3.A0R(r4)     // Catch:{ Exception -> 0x0176 }
            int r5 = (int) r2     // Catch:{ Exception -> 0x0176 }
            X.8qC r0 = r0.A0E     // Catch:{ Exception -> 0x0176 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0176 }
            X.2Ie r0 = (X.C40902Ie) r0     // Catch:{ Exception -> 0x0176 }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x0176 }
            X.2jN r0 = r0.A0C     // Catch:{ Exception -> 0x0176 }
            X.1RJ r0 = r0.A01     // Catch:{ Exception -> 0x0176 }
            X.4Fq r7 = r0.A0C()     // Catch:{ Exception -> 0x0176 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ca }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = "signed_prekeys"
            java.lang.String r2 = "prekey_id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00ca }
            X.C18270x1.A1O(r1, r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "SignalSignedPreKeyStore/removeSignedPreKey"
            int r0 = r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x00ca }
            long r0 = (long) r0     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r1 = X.C18300x5.A0o(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = " signed pre keys with id "
            X.C18260x0.A0y(r0, r1, r5)     // Catch:{ all -> 0x00ca }
            r7.close()     // Catch:{ Exception -> 0x0176 }
            goto L_0x013e
        L_0x00ca:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0137 }
            goto L_0x013b
        L_0x00cf:
            X.2UC r0 = X.C18280x3.A0R(r4)     // Catch:{ Exception -> 0x0176 }
            int r5 = (int) r2     // Catch:{ Exception -> 0x0176 }
            X.8qC r0 = r0.A0E     // Catch:{ Exception -> 0x0176 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0176 }
            X.2Ie r0 = (X.C40902Ie) r0     // Catch:{ Exception -> 0x0176 }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x0176 }
            X.2jN r0 = r0.A0C     // Catch:{ Exception -> 0x0176 }
            X.1RJ r0 = r0.A01     // Catch:{ Exception -> 0x0176 }
            X.4GK r4 = r0.get()     // Catch:{ Exception -> 0x0176 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0132 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = "signed_prekeys"
            java.lang.String r0 = "record"
            java.lang.String[] r12 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0132 }
            java.lang.String r13 = "prekey_id = ?"
            java.lang.String[] r14 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0132 }
            X.C18270x1.A1O(r14, r5)     // Catch:{ all -> 0x0132 }
            r15 = 0
            java.lang.String r18 = "SignalSignedPreKeyStore/containsSignedPreKey"
            r17 = r15
            r16 = r15
            android.database.Cursor r3 = r10.A0F(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0132 }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0126 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "axolotl has a signed pre key with id "
            r1.append(r0)     // Catch:{ all -> 0x0126 }
            r1.append(r5)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = ": "
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ all -> 0x0126 }
            r3.close()     // Catch:{ all -> 0x0132 }
            r4.close()     // Catch:{ Exception -> 0x0176 }
            goto L_0x013c
        L_0x0126:
            r1 = move-exception
            if (r3 == 0) goto L_0x0131
            r3.close()     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0132 }
        L_0x0131:
            throw r1     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0137 }
            goto L_0x013b
        L_0x0137:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0176 }
        L_0x013b:
            throw r1     // Catch:{ Exception -> 0x0176 }
        L_0x013c:
            if (r2 == 0) goto L_0x0175
        L_0x013e:
            r8 = 1
            return r8
        L_0x0141:
            int r1 = (int) r2     // Catch:{ Exception -> 0x0176 }
            X.2PH r4 = (X.AnonymousClass2PH) r4     // Catch:{ Exception -> 0x0176 }
            X.5Wz r0 = r4.A00     // Catch:{ Exception -> 0x0176 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x0176 }
            if (r1 == 0) goto L_0x0166
            r0 = 11
            if (r1 == r0) goto L_0x0163
            r0 = 4
            if (r1 == r0) goto L_0x0160
            r0 = 5
            if (r1 == r0) goto L_0x015d
            r0 = 6
            if (r1 == r0) goto L_0x015d
            r0 = 7
            r3 = 17
            if (r1 != r0) goto L_0x0167
        L_0x015d:
            r3 = 9
            goto L_0x0167
        L_0x0160:
            r3 = 11
            goto L_0x0167
        L_0x0163:
            r3 = 8
            goto L_0x0167
        L_0x0166:
            r3 = 0
        L_0x0167:
            X.5Wz r2 = r4.A00     // Catch:{ Exception -> 0x0176 }
            boolean r1 = X.AnonymousClass000.A1T(r3)
            r0 = 0
            X.35m r0 = X.C625435m.A00(r0, r3, r1)     // Catch:{ Exception -> 0x0176 }
            r2.A02(r0)     // Catch:{ Exception -> 0x0176 }
        L_0x0175:
            return r8
        L_0x0176:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIO(int, long, java.lang.Object):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:34|35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOO(int r9, long r10, java.lang.Object r12, java.lang.Object r13) {
        /*
            r5 = 1
            r7 = 0
            switch(r9) {
                case 0: goto L_0x0008;
                case 1: goto L_0x0024;
                case 2: goto L_0x0066;
                case 3: goto L_0x0096;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00df;
                case 6: goto L_0x00fe;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r7
        L_0x0008:
            X.2UC r0 = X.C18280x3.A0R(r12)     // Catch:{ Exception -> 0x0110 }
            int r2 = (int) r10     // Catch:{ Exception -> 0x0110 }
            byte[] r13 = (byte[]) r13     // Catch:{ Exception -> 0x0110 }
            X.8qC r0 = r0.A0E     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0110 }
            X.2Ie r1 = (X.C40902Ie) r1     // Catch:{ Exception -> 0x0110 }
            if (r13 == 0) goto L_0x00d9
            int r0 = r13.length     // Catch:{ Exception -> 0x0110 }
            if (r0 <= 0) goto L_0x00d9
            X.33n r0 = r1.A00     // Catch:{ Exception -> 0x0110 }
            X.2jN r0 = r0.A0C     // Catch:{ Exception -> 0x0110 }
            r0.A00(r2, r13)     // Catch:{ Exception -> 0x0110 }
            return r5
        L_0x0024:
            X.2UC r0 = X.C18280x3.A0R(r12)     // Catch:{ Exception -> 0x0110 }
            int r1 = (int) r10     // Catch:{ Exception -> 0x0110 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ Exception -> 0x0110 }
            X.8qC r0 = r0.A0D     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x0110 }
            X.33n r6 = (X.C621133n) r6     // Catch:{ Exception -> 0x0110 }
            r0 = 16777214(0xfffffe, float:2.3509884E-38)
            int r1 = r1 % r0
            int r5 = r1 + 1
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0110 }
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r13)     // Catch:{ Exception -> 0x0110 }
        L_0x0041:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0110 }
            if (r0 == 0) goto L_0x0062
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r3)     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ Exception -> 0x0110 }
            int r2 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0110 }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x0110 }
            X.2JO r0 = new X.2JO     // Catch:{ Exception -> 0x0110 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0110 }
            r4.add(r0)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0041
        L_0x0062:
            r6.A0W(r4, r5)     // Catch:{ Exception -> 0x0110 }
            goto L_0x00d9
        L_0x0066:
            X.2UC r0 = X.C18280x3.A0R(r12)     // Catch:{ Exception -> 0x0110 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ Exception -> 0x0110 }
            X.8qC r0 = r0.A09     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x0110 }
            X.2Ib r3 = (X.C40872Ib) r3     // Catch:{ Exception -> 0x0110 }
            int r0 = r13.size()     // Catch:{ Exception -> 0x0110 }
            int[] r2 = new int[r0]     // Catch:{ Exception -> 0x0110 }
            r1 = 0
        L_0x007b:
            int r0 = r13.size()     // Catch:{ Exception -> 0x0110 }
            if (r1 >= r0) goto L_0x008e
            java.lang.Object r0 = r13.get(r1)     // Catch:{ Exception -> 0x0110 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception -> 0x0110 }
            r2[r1] = r0     // Catch:{ Exception -> 0x0110 }
            int r1 = r1 + 1
            goto L_0x007b
        L_0x008e:
            X.33n r0 = r3.A00     // Catch:{ Exception -> 0x0110 }
            X.2q3 r0 = r0.A09     // Catch:{ Exception -> 0x0110 }
            r0.A03(r2)     // Catch:{ Exception -> 0x0110 }
            return r5
        L_0x0096:
            X.2UC r0 = X.C18280x3.A0R(r13)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0110 }
            int r1 = (int) r10     // Catch:{ Exception -> 0x0110 }
            X.8qC r0 = r0.A0C     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x0110 }
            X.2aO r4 = (X.C45672aO) r4     // Catch:{ Exception -> 0x0110 }
            X.2ov r3 = A00(r12, r1)     // Catch:{ Exception -> 0x0110 }
            X.2pw r2 = r4.A00     // Catch:{ Exception -> 0x0110 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0110 }
            X.2wr r0 = r2.A01(r3)     // Catch:{ all -> 0x00dc }
            r1 = 1
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.A00     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d5
            r1 = 0
            goto L_0x00d5
        L_0x00b9:
            X.33n r0 = r4.A01     // Catch:{ all -> 0x00dc }
            X.2ot r0 = r0.A0B     // Catch:{ all -> 0x00dc }
            byte[] r0 = r0.A03(r3)     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00cd
            X.2wr r0 = new X.2wr     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
            r2.A04(r0, r3)     // Catch:{ all -> 0x00dc }
        L_0x00cb:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x00d9
        L_0x00cd:
            X.C55182pw.A00(r2, r3, r0)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00d5
        L_0x00d1:
            r4.A00(r3)     // Catch:{ all -> 0x00dc }
            goto L_0x00cb
        L_0x00d5:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            if (r1 == 0) goto L_0x00d9
            return r5
        L_0x00d9:
            r5 = 0
            return r5
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x00e6
        L_0x00df:
            java.lang.String r0 = "socketReceiveHandler"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ Exception -> 0x0110 }
        L_0x00e6:
            throw r0     // Catch:{ Exception -> 0x0110 }
        L_0x00e7:
            X.2UC r0 = X.C18280x3.A0R(r13)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0110 }
            int r2 = (int) r10     // Catch:{ Exception -> 0x0110 }
            X.8qC r0 = r0.A0C     // Catch:{ Exception -> 0x0110 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0110 }
            X.2aO r1 = (X.C45672aO) r1     // Catch:{ Exception -> 0x0110 }
            X.2ov r0 = A00(r12, r2)     // Catch:{ Exception -> 0x0110 }
            r1.A00(r0)     // Catch:{ Exception -> 0x0110 }
            return r5
        L_0x00fe:
            int r1 = (int) r10     // Catch:{ Exception -> 0x0110 }
            com.facebook.msys.mcf.MsysError r13 = (com.facebook.msys.mcf.MsysError) r13     // Catch:{ Exception -> 0x0110 }
            X.2sb r12 = (X.C56812sb) r12     // Catch:{ Exception -> 0x0110 }
            if (r13 == 0) goto L_0x010d
            int r0 = r13.getCode()     // Catch:{ Exception -> 0x0110 }
        L_0x0109:
            r12.A00(r1, r0)     // Catch:{ Exception -> 0x0110 }
            goto L_0x010f
        L_0x010d:
            r0 = 0
            goto L_0x0109
        L_0x010f:
            return r7
        L_0x0110:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOO(int, long, java.lang.Object, java.lang.Object):long");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOOO(int r12, long r13, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r6 = r17
            r10 = 1
            r8 = 0
            if (r12 == 0) goto L_0x00de
            r0 = 1
            if (r12 == r0) goto L_0x00ab
            r0 = 2
            if (r12 == r0) goto L_0x0089
            r0 = 3
            if (r12 == r0) goto L_0x0012
            return r8
        L_0x0012:
            X.2UC r0 = X.C18280x3.A0R(r16)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00ea }
            int r3 = (int) r13     // Catch:{ Exception -> 0x00ea }
            byte[] r6 = (byte[]) r6     // Catch:{ Exception -> 0x00ea }
            X.8qC r0 = r0.A0C     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x00ea }
            X.2aO r2 = (X.C45672aO) r2     // Catch:{ Exception -> 0x00ea }
            X.2wr r0 = new X.2wr     // Catch:{ IOException -> 0x0081 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0081 }
            X.33n r1 = r2.A01     // Catch:{ IOException -> 0x0081 }
            X.C621133n.A01(r0)     // Catch:{ IOException -> 0x0081 }
            X.2ov r7 = A00(r15, r3)     // Catch:{ Exception -> 0x00ea }
            X.1RJ r0 = r2.A02     // Catch:{ Exception -> 0x00ea }
            X.4Fq r5 = r0.A0C()     // Catch:{ Exception -> 0x00ea }
            X.3Yo r4 = r5.Axl()     // Catch:{ all -> 0x0077 }
            X.2pw r3 = r2.A00     // Catch:{ all -> 0x006d }
            monitor-enter(r3)     // Catch:{ all -> 0x006d }
            X.2ot r0 = r1.A0B     // Catch:{ IOException -> 0x004f }
            r0.A02(r7, r6)     // Catch:{ IOException -> 0x004f }
            X.2wr r0 = new X.2wr     // Catch:{ IOException -> 0x004f }
            r0.<init>(r6)     // Catch:{ IOException -> 0x004f }
            r3.A04(r0, r7)     // Catch:{ IOException -> 0x004f }
            r4.A00()     // Catch:{ IOException -> 0x004f }
            goto L_0x0062
        L_0x004f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "sessionStoreImpl/saveSession for "
            r1.append(r0)     // Catch:{ all -> 0x006a }
            r1.append(r7)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = " failed to update"
            X.C18260x0.A15(r0, r1, r2)     // Catch:{ all -> 0x006a }
        L_0x0062:
            monitor-exit(r3)     // Catch:{ all -> 0x006a }
            r4.close()     // Catch:{ all -> 0x0077 }
            r5.close()     // Catch:{ Exception -> 0x00ea }
            return r10
        L_0x006a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0077 }
        L_0x0076:
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00ea }
        L_0x0080:
            throw r1     // Catch:{ Exception -> 0x00ea }
        L_0x0081:
            r1 = move-exception
            java.lang.String r0 = "sessionStoreImpl/invalid-session-record"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00ea }
            goto L_0x00e7
        L_0x0089:
            X.2UC r0 = X.C18280x3.A0R(r16)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00ea }
            int r1 = (int) r13     // Catch:{ Exception -> 0x00ea }
            X.8qC r0 = r0.A08     // Catch:{ Exception -> 0x00ea }
            r0.get()     // Catch:{ Exception -> 0x00ea }
            X.2ov r2 = A00(r15, r1)     // Catch:{ Exception -> 0x00ea }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r0 = "axolotl trusting "
            r1.append(r0)     // Catch:{ Exception -> 0x00ea }
            r1.append(r2)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r0 = " key pair"
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x00ea }
            return r10
        L_0x00ab:
            X.2UC r0 = X.C18280x3.A0R(r16)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00ea }
            int r1 = (int) r13     // Catch:{ Exception -> 0x00ea }
            byte[] r6 = (byte[]) r6     // Catch:{ Exception -> 0x00ea }
            X.8qC r0 = r0.A08     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x00ea }
            X.2Ia r3 = (X.C40862Ia) r3     // Catch:{ Exception -> 0x00ea }
            X.2ov r2 = A00(r15, r1)     // Catch:{ Exception -> 0x00ea }
            if (r6 != 0) goto L_0x00c8
            X.33n r0 = r3.A00     // Catch:{ Exception -> 0x00ea }
            r0.A0O(r2)     // Catch:{ Exception -> 0x00ea }
            return r10
        L_0x00c8:
            X.2jv r0 = X.AnonymousClass36G.A01(r6)     // Catch:{ 23X -> 0x00d7 }
            X.2e4 r1 = new X.2e4     // Catch:{ 23X -> 0x00d7 }
            r1.<init>(r0)     // Catch:{ 23X -> 0x00d7 }
            X.33n r0 = r3.A00     // Catch:{ 23X -> 0x00d7 }
            r0.A0M(r1, r2)     // Catch:{ 23X -> 0x00d7 }
            return r10
        L_0x00d7:
            r1 = move-exception
            java.lang.String r0 = "IdentityKeyStoreImpl/Could not save the identity key."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00ea }
            goto L_0x00e7
        L_0x00de:
            X.2UC r0 = X.C18280x3.A0R(r15)     // Catch:{ Exception -> 0x00ea }
            X.8qC r0 = r0.A08     // Catch:{ Exception -> 0x00ea }
            r0.get()     // Catch:{ Exception -> 0x00ea }
        L_0x00e7:
            r10 = 0
            return r10
        L_0x00ea:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOOO(int, long, java.lang.Object, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        if (i == 0) {
            byte[] bArr = (byte[]) obj4;
            C54422oh r2 = new C54422oh(A00((String) obj2, (int) j), (String) obj);
            C621133n r1 = ((C40892Id) C18280x3.A0R(obj3).A0B.get()).A00;
            if (bArr == null) {
                r1.A0c(r2, false);
                return 1;
            }
            r1.A0U(r2, bArr);
            return 1;
        } else if (i == 1) {
            byte[] bArr2 = (byte[]) obj4;
            C54422oh r12 = new C54422oh(A00((String) obj2, (int) j), (String) obj);
            C621133n r0 = ((AnonymousClass2IZ) C18280x3.A0R(obj3).A07.get()).A00;
            if (bArr2 == null) {
                r0.A0S(r12);
                return 1;
            }
            r0.A0T(r12, bArr2);
            return 1;
        } else if (i != 2) {
            return 0;
        } else {
            try {
                int i3 = (int) j;
                MsysError msysError = (MsysError) obj4;
                Map map = (Map) obj2;
                Map map2 = (Map) obj3;
                C56812sb r10 = (C56812sb) obj;
                if (msysError != null) {
                    i2 = msysError.getCode();
                } else {
                    i2 = 0;
                }
                r10.A0C(map, map2, i3, i2);
                return 0;
            } catch (Exception e) {
                AnonymousClass2XD.A00(e);
                return 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r3 == 7) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOOOOOOOOO(long r17, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r14 = r19
            r9 = r21
            r2 = r23
            r12 = r22
            r13 = r20
            r7 = r27
            r8 = r26
            r10 = r25
            r11 = r24
            r15 = 0
            r0 = r17
            int r3 = (int) r0     // Catch:{ Exception -> 0x009c }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x009c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x009c }
            byte[] r12 = (byte[]) r12     // Catch:{ Exception -> 0x009c }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x009c }
            byte[] r11 = (byte[]) r11     // Catch:{ Exception -> 0x009c }
            byte[] r10 = (byte[]) r10     // Catch:{ Exception -> 0x009c }
            byte[] r8 = (byte[]) r8     // Catch:{ Exception -> 0x009c }
            byte[] r7 = (byte[]) r7     // Catch:{ Exception -> 0x009c }
            X.2PI r9 = (X.AnonymousClass2PI) r9     // Catch:{ Exception -> 0x009c }
            X.5Wz r0 = r9.A00     // Catch:{ Exception -> 0x009c }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x009c }
            if (r3 == 0) goto L_0x004a
            r0 = 11
            if (r3 == r0) goto L_0x0047
            r0 = 4
            if (r3 == r0) goto L_0x0044
            r0 = 5
            if (r3 == r0) goto L_0x0042
            r0 = 6
            if (r3 == r0) goto L_0x0042
            r0 = 7
            r6 = 23
            if (r3 != r0) goto L_0x004b
        L_0x0042:
            r6 = 3
            goto L_0x004b
        L_0x0044:
            r6 = 17
            goto L_0x004b
        L_0x0047:
            r6 = 19
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            X.1g5 r5 = r9.A01     // Catch:{ Exception -> 0x009c }
            if (r6 != 0) goto L_0x0092
            r4 = 1
            r5.A06 = r4     // Catch:{ Exception -> 0x009c }
            X.2sV r3 = r5.A0X     // Catch:{ Exception -> 0x009c }
            r3.A08(r14)     // Catch:{ Exception -> 0x009c }
            r3.A0B(r13)     // Catch:{ Exception -> 0x009c }
            r1 = 2
            if (r12 == 0) goto L_0x0064
            java.lang.String r0 = android.util.Base64.encodeToString(r12, r1)     // Catch:{ Exception -> 0x009c }
            r3.A0A(r0)     // Catch:{ Exception -> 0x009c }
        L_0x0064:
            if (r2 == 0) goto L_0x006d
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r1)     // Catch:{ Exception -> 0x009c }
            r3.A09(r0)     // Catch:{ Exception -> 0x009c }
        L_0x006d:
            if (r11 == 0) goto L_0x008c
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x009c }
            X.32B r0 = new X.32B     // Catch:{ Exception -> 0x009c }
            r0.<init>(r11, r1)     // Catch:{ Exception -> 0x009c }
            if (r8 == 0) goto L_0x008c
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            monitor-enter(r3)     // Catch:{ Exception -> 0x009c }
            r3.A00 = r0     // Catch:{ all -> 0x0088 }
            r3.A0I = r8     // Catch:{ all -> 0x0088 }
            r3.A0K = r7     // Catch:{ all -> 0x0088 }
            r3.A0L = r10     // Catch:{ all -> 0x0088 }
            goto L_0x008b
        L_0x0088:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x009c }
            throw r0     // Catch:{ Exception -> 0x009c }
        L_0x008b:
            monitor-exit(r3)     // Catch:{ Exception -> 0x009c }
        L_0x008c:
            X.2zt r0 = r5.A0V     // Catch:{ Exception -> 0x009c }
            X.5LM r0 = r0.A01     // Catch:{ Exception -> 0x009c }
            r0.A00 = r4     // Catch:{ Exception -> 0x009c }
        L_0x0092:
            X.5Wz r1 = r9.A00     // Catch:{ Exception -> 0x009c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x009c }
            r1.A02(r0)     // Catch:{ Exception -> 0x009c }
            return r15
        L_0x009c:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOOOOOOOOO(long, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        return (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0178, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017a, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x017e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017f, code lost:
        X.AnonymousClass2XD.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0182, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x000a, B:35:0x00d2] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIO(int r15, java.lang.Object r16) {
        /*
            r11 = r16
            r8 = 1
            r6 = 0
            switch(r15) {
                case 0: goto L_0x0016;
                case 1: goto L_0x00f1;
                case 2: goto L_0x000a;
                case 3: goto L_0x017b;
                case 4: goto L_0x00db;
                case 5: goto L_0x008f;
                case 6: goto L_0x007a;
                case 7: goto L_0x0065;
                case 8: goto L_0x005b;
                case 9: goto L_0x001c;
                case 10: goto L_0x0116;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r6
        L_0x000a:
            X.2PI r11 = (X.AnonymousClass2PI) r11     // Catch:{ Exception -> 0x017e }
            X.1g5 r0 = r11.A01     // Catch:{ Exception -> 0x017e }
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ Exception -> 0x017e }
            boolean r0 = r0.isCancelled()     // Catch:{ Exception -> 0x017e }
            goto L_0x0178
        L_0x0016:
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x017e }
            com.whatsapp.util.Log.d((java.lang.String) r11)     // Catch:{ Exception -> 0x017e }
            return r6
        L_0x001c:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x017e }
            X.2UC r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x017e }
            byte[] r11 = (byte[]) r11     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A0G     // Catch:{ Exception -> 0x017e }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.2O7 r2 = (X.AnonymousClass2O7) r2     // Catch:{ Exception -> 0x017e }
            r0 = 0
            X.C162457s7.A0J(r11, r0)     // Catch:{ Exception -> 0x017e }
            java.util.Set r0 = r2.A02     // Catch:{ Exception -> 0x017e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x017e }
        L_0x0034:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x017e }
            X.2Xe r0 = (X.C44712Xe) r0     // Catch:{ Exception -> 0x017e }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "WamJniBridge/upload postponed"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x017e }
            goto L_0x017b
        L_0x004d:
            X.8qC r0 = r2.A01     // Catch:{ Exception -> 0x017e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.3La r0 = (X.C66353La) r0     // Catch:{ Exception -> 0x017e }
            boolean r0 = r0.A00(r11)     // Catch:{ Exception -> 0x017e }
            goto L_0x0178
        L_0x005b:
            com.whatsapp.protocol.ProtocolJniHelper r0 = X.AnonymousClass2UC.A00()     // Catch:{ Exception -> 0x017e }
            byte r0 = r0.getTypeFromKeyValue(r11)     // Catch:{ Exception -> 0x017e }
            goto L_0x00ef
        L_0x0065:
            X.2UC r0 = X.C18280x3.A0R(r11)     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A09     // Catch:{ Exception -> 0x017e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.2Ib r0 = (X.C40872Ib) r0     // Catch:{ Exception -> 0x017e }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x017e }
            X.2qF r0 = r0.A07     // Catch:{ Exception -> 0x017e }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x017e }
            goto L_0x00ef
        L_0x007a:
            X.2UC r0 = X.C18280x3.A0R(r11)     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A09     // Catch:{ Exception -> 0x017e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.2Ib r0 = (X.C40872Ib) r0     // Catch:{ Exception -> 0x017e }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x017e }
            X.2q3 r0 = r0.A09     // Catch:{ Exception -> 0x017e }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x017e }
            goto L_0x00ef
        L_0x008f:
            X.2UC r0 = X.C18280x3.A0R(r11)     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A0E     // Catch:{ Exception -> 0x017e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.2Ie r0 = (X.C40902Ie) r0     // Catch:{ Exception -> 0x017e }
            X.33n r1 = r0.A00     // Catch:{ Exception -> 0x017e }
            X.30x r0 = r1.A0K     // Catch:{ Exception -> 0x017e }
            X.3fe r2 = r0.A03()     // Catch:{ Exception -> 0x017e }
            X.2jN r0 = r1.A0C     // Catch:{ all -> 0x00cf }
            byte[] r1 = r0.A01()     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00bd
            X.1DQ r0 = X.AnonymousClass1DQ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x00bb }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ IOException -> 0x00bb }
            X.1DQ r0 = (X.AnonymousClass1DQ) r0     // Catch:{ IOException -> 0x00bb }
            if (r2 == 0) goto L_0x00b8
            r2.close()     // Catch:{ Exception -> 0x017e }
        L_0x00b8:
            int r0 = r0.id_     // Catch:{ Exception -> 0x017e }
            goto L_0x00ef
        L_0x00bb:
            r1 = move-exception
            goto L_0x00c5
        L_0x00bd:
            java.lang.String r0 = "no signed prekey record found"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00ce
        L_0x00c5:
            java.lang.String r0 = "failed to parse the latest signed prekey record"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00cf }
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r1)     // Catch:{ all -> 0x00cf }
        L_0x00ce:
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r1 = move-exception
            if (r2 == 0) goto L_0x00da
            r2.close()     // Catch:{ all -> 0x00d6 }
            goto L_0x00da
        L_0x00d6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x017e }
        L_0x00da:
            throw r1     // Catch:{ Exception -> 0x017e }
        L_0x00db:
            X.2UC r0 = X.C18280x3.A0R(r11)     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A08     // Catch:{ Exception -> 0x017e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.2Ia r0 = (X.C40862Ia) r0     // Catch:{ Exception -> 0x017e }
            X.33n r0 = r0.A00     // Catch:{ Exception -> 0x017e }
            X.2qF r0 = r0.A07     // Catch:{ Exception -> 0x017e }
            int r0 = r0.A01()     // Catch:{ Exception -> 0x017e }
        L_0x00ef:
            long r0 = (long) r0     // Catch:{ Exception -> 0x017e }
            return r0
        L_0x00f1:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x017e }
            X.2UC r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A0F     // Catch:{ Exception -> 0x017e }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.2Mc r1 = (X.C41922Mc) r1     // Catch:{ Exception -> 0x017e }
            X.36K r11 = (X.AnonymousClass36K) r11     // Catch:{ Exception -> 0x017e }
            r0 = 12
            X.4KQ r10 = new X.4KQ     // Catch:{ Exception -> 0x017e }
            r10.<init>(r1, r0)     // Catch:{ Exception -> 0x017e }
            X.31C r9 = r1.A00     // Catch:{ Exception -> 0x017e }
            r13 = 344(0x158, float:4.82E-43)
            java.lang.String r0 = "id"
            java.lang.String r12 = X.AnonymousClass36K.A0L(r11, r0)     // Catch:{ Exception -> 0x017e }
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0E(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x017e }
            return r6
        L_0x0116:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x017e }
            X.2UC r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x017e }
            byte[] r11 = (byte[]) r11     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A0G     // Catch:{ Exception -> 0x017e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.2O7 r0 = (X.AnonymousClass2O7) r0     // Catch:{ Exception -> 0x017e }
            r5 = 0
            X.C162457s7.A0J(r11, r5)     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r0.A01     // Catch:{ Exception -> 0x017e }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x017e }
            X.3La r4 = (X.C66353La) r4     // Catch:{ Exception -> 0x017e }
            X.31C r10 = r4.A01     // Catch:{ Exception -> 0x017e }
            java.lang.String r13 = r10.A03()     // Catch:{ Exception -> 0x017e }
            java.lang.String r1 = "blinded_credential"
            r0 = 0
            X.36K r3 = new X.36K     // Catch:{ Exception -> 0x017e }
            r3.<init>((java.lang.String) r1, (byte[]) r11, (X.AnonymousClass39V[]) r0)     // Catch:{ Exception -> 0x017e }
            r0 = 1
            X.39V[] r2 = new X.AnonymousClass39V[r0]     // Catch:{ Exception -> 0x017e }
            java.lang.String r1 = "version"
            java.lang.String r0 = "1"
            X.AnonymousClass39V.A0B(r1, r0, r2, r5)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = "sign_credential"
            X.36K r3 = X.AnonymousClass36K.A0F(r3, r0, r2)     // Catch:{ Exception -> 0x017e }
            X.39V[] r2 = X.AnonymousClass39V.A0H(r13, r5)     // Catch:{ Exception -> 0x017e }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "privatestats"
            X.AnonymousClass39V.A09(r1, r0, r2)     // Catch:{ Exception -> 0x017e }
            X.6kI r0 = X.C135206kI.A00     // Catch:{ Exception -> 0x017e }
            X.36K r12 = X.AnonymousClass36K.A0C(r0, r3, r2)     // Catch:{ Exception -> 0x017e }
            X.8qC r0 = r4.A03     // Catch:{ Exception -> 0x017e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017e }
            com.whatsapp.wamsys.JniBridge r0 = (com.whatsapp.wamsys.JniBridge) r0     // Catch:{ Exception -> 0x017e }
            X.3SY r11 = new X.3SY     // Catch:{ Exception -> 0x017e }
            r11.<init>(r0)     // Catch:{ Exception -> 0x017e }
            r14 = 239(0xef, float:3.35E-43)
            r15 = 32000(0x7d00, double:1.581E-319)
            boolean r0 = r10.A0K(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x017e }
        L_0x0178:
            if (r0 == 0) goto L_0x017b
            return r8
        L_0x017b:
            r8 = 0
            return r8
        L_0x017e:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIO(int, java.lang.Object):long");
    }

    public static long jnidispatchIOO(int i, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i == 2) {
                ((C834848p) obj3).B32((String) obj4);
            } else if (i == 3) {
                try {
                    ((C834848p) obj3).B32((String) obj4);
                    return 0;
                } catch (Exception e) {
                    AnonymousClass2XD.A00(e);
                    return 0;
                }
            }
            return 0;
        }
        AnonymousClass2UC A0R = C18280x3.A0R(obj3);
        C54562ov A00 = A00((String) obj4, 0);
        C45672aO r7 = (C45672aO) A0R.A0C.get();
        synchronized (r7.A00) {
            C54542ot r0 = r7.A01.A0B;
            String A01 = AnonymousClass31S.A01(A00);
            C85284Fq A0C = r0.A02.A0C();
            try {
                C54562ov A002 = A00(A01, 0);
                C56862sg r4 = ((AnonymousClass3H0) A0C).A03;
                String[] A1Z = AnonymousClass0x9.A1Z();
                A1Z[0] = A002.A02;
                C18270x1.A1P(A1Z, A002.A01);
                C18260x0.A1R(C18300x5.A0o((long) r4.A07("sessions", "recipient_id = ? AND recipient_type = ?", "SignalSessionStore/removeAllSessions", A1Z)), " sessions with ", A002);
                A0C.close();
                r7.A00(A00);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return 1;
        throw th;
    }

    public static long jnidispatchIOOO(Object obj, Object obj2, Object obj3) {
        try {
            byte[] bArr = (byte[]) obj3;
            C836749i r4 = (C836749i) obj;
            C48972fm r1 = ((AnonymousClass2IX) C18280x3.A0R(obj2).A06.get()).A00.A0J;
            if (!r1.A02) {
                C626936e.A0D(r1.A03(), "Not running on SignalExecutor thread");
            }
            if (r4 == null) {
                return 0;
            }
            r4.BF5(bArr);
            return 1;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c8, code lost:
        X.AnonymousClass2XD.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cc, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchO() {
        /*
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00c7 }
            X.2UC r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00c7 }
            X.8qC r0 = r0.A0G     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00c7 }
            X.2O7 r0 = (X.AnonymousClass2O7) r0     // Catch:{ Exception -> 0x00c7 }
            X.2rP r2 = r0.A00     // Catch:{ Exception -> 0x00c7 }
            java.util.ArrayList r1 = X.C57302tQ.A00()     // Catch:{ Exception -> 0x00c7 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00c7 }
            java.util.HashMap r0 = r2.A03     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x001d
            java.util.HashMap r0 = r2.A03()     // Catch:{ all -> 0x00c4 }
            r2.A03 = r0     // Catch:{ all -> 0x00c4 }
        L_0x001d:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0025:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0061
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x00c4 }
            X.2O3 r4 = (X.AnonymousClass2O3) r4     // Catch:{ all -> 0x00c4 }
            java.util.HashMap r0 = r2.A03     // Catch:{ all -> 0x00c4 }
            int r9 = r4.A00     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x005a
            java.util.HashMap r0 = r2.A03     // Catch:{ all -> 0x00c4 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00c4 }
            X.2RC r0 = (X.AnonymousClass2RC) r0     // Catch:{ all -> 0x00c4 }
            int r10 = r4.A01     // Catch:{ all -> 0x00c4 }
            java.lang.String r7 = r4.A02     // Catch:{ all -> 0x00c4 }
            long r12 = r0.A02     // Catch:{ all -> 0x00c4 }
            int r11 = r0.A00     // Catch:{ all -> 0x00c4 }
            java.lang.String r8 = r0.A03     // Catch:{ all -> 0x00c4 }
            X.2SF r6 = new X.2SF     // Catch:{ all -> 0x00c4 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c4 }
            r3.add(r6)     // Catch:{ all -> 0x00c4 }
            goto L_0x0025
        L_0x005a:
            java.lang.String r0 = "psidstore/getAllRecords ps-id key not exist in memory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x0025
        L_0x0061:
            monitor-exit(r2)     // Catch:{ Exception -> 0x00c7 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x00c7 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ Exception -> 0x00c7 }
        L_0x006a:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r4 = r5.next()     // Catch:{ Exception -> 0x00c7 }
            X.2SF r4 = (X.AnonymousClass2SF) r4     // Catch:{ Exception -> 0x00c7 }
            r0 = 6
            X.3Z6[] r3 = new X.AnonymousClass3Z6[r0]     // Catch:{ Exception -> 0x00c7 }
            int r0 = r4.A01     // Catch:{ Exception -> 0x00c7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = "psIdKey"
            X.AnonymousClass3Z6.A04(r0, r1, r3)     // Catch:{ Exception -> 0x00c7 }
            int r0 = r4.A02     // Catch:{ Exception -> 0x00c7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = "rotationPeriodDays"
            X.AnonymousClass3Z6.A05(r0, r1, r3)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "psIdKeyString"
            java.lang.String r0 = r4.A04     // Catch:{ Exception -> 0x00c7 }
            X.AnonymousClass3Z6.A06(r1, r0, r3)     // Catch:{ Exception -> 0x00c7 }
            long r0 = r4.A03     // Catch:{ Exception -> 0x00c7 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = "lastRotationTimeUtcDay"
            X.AnonymousClass3Z6.A07(r0, r1, r3)     // Catch:{ Exception -> 0x00c7 }
            int r0 = r4.A00     // Catch:{ Exception -> 0x00c7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = "beaconEvtNumber"
            X.AnonymousClass3Z6.A08(r0, r1, r3)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "uuid"
            java.lang.String r0 = r4.A05     // Catch:{ Exception -> 0x00c7 }
            X.3Z6 r1 = X.AnonymousClass3Z6.A02(r1, r0)     // Catch:{ Exception -> 0x00c7 }
            r0 = 5
            r3[r0] = r1     // Catch:{ Exception -> 0x00c7 }
            java.util.Map r0 = X.C73813g7.A0F(r3)     // Catch:{ Exception -> 0x00c7 }
            r2.add(r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x006a
        L_0x00c3:
            return r2
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x00c7 }
            throw r0     // Catch:{ Exception -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            X.AnonymousClass2XD.A00(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchO():java.lang.Object");
    }

    public static Object jnidispatchOOOOO(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr;
        try {
            String str = (String) obj;
            List list = (List) obj3;
            List list2 = (List) obj4;
            byte[] bArr = (byte[]) obj2;
            ProtocolJniHelper protocolJniHelper = (ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get();
            Object[] objArr2 = null;
            if (list != null) {
                objArr = list.toArray();
            } else {
                objArr = null;
            }
            if (list2 != null) {
                objArr2 = list2.toArray();
            }
            return protocolJniHelper.createProtocolTreeNode(str, objArr, objArr2, bArr);
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return null;
        }
    }

    public static void setDependencies(C42962Qf r2) {
        synchronized (JniBridge.class) {
            if (DEPENDENCIES == null) {
                DEPENDENCIES = r2;
            } else {
                throw AnonymousClass001.A0e("JniBridgeDependencies are already set. Can't override them.");
            }
        }
    }

    public byte[] WCIAPIGcmAesCreateEncryptedCiphertext(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        return (byte[]) jvidispatchOIOOOOO(2, (long) 16, AnonymousClass0x9.A0r(this), bArr, bArr2, bArr3, bArr4);
    }

    public C48162eS WESOpaqueClientCreateLoginStart(AnonymousClass2HW r3) {
        return new C48162eS((NativeHolder) jvidispatchOO(31, r3.A00));
    }

    public AnonymousClass2HW WESOpaqueClientLoginCreateState(String str, byte[] bArr) {
        return new AnonymousClass2HW((NativeHolder) jvidispatchOOO(11, str, bArr));
    }

    public JniBridge(AnonymousClass2UC r2, AnonymousClass5CL r3, AnonymousClass5CK r4, AnonymousClass2XD r5) {
        this.jniCallbacksIJniCallbacks = r2;
        this.jniCallbacksIJniCallbacksAndroidRegistration = r3;
        this.jniCallbacksIJniCallbacksAndroidGpia = r4;
        this.jniBridgeExceptionHandler = r5;
    }

    public static C54562ov A00(String str, int i) {
        int A02;
        UserJid A08 = AnonymousClass32Y.A08(str);
        C626936e.A06(A08);
        String str2 = A08.user;
        if (A08 instanceof C27981fH) {
            A02 = 1;
        } else {
            A02 = C18310x6.A02(A08 instanceof C135146kC ? 1 : 0);
        }
        return new C54562ov(str2, A02, i);
    }

    public static Object jnidispatchOOO(Object obj, Object obj2) {
        try {
            Map map = (Map) obj2;
            C45672aO r4 = (C45672aO) C18280x3.A0R(obj).A0C.get();
            if (map == null) {
                return null;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                Integer num = (Integer) A0i.next();
                A0s.add(A00((String) C18320x8.A0Z(map, num), num.intValue()));
            }
            Set<C54562ov> A0H = r4.A01.A0H(A0s);
            HashMap A0t = AnonymousClass001.A0t();
            for (C54562ov r2 : A0H) {
                A0t.put(Integer.valueOf(r2.A00), r2.A02);
            }
            return A0t;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return null;
        }
    }

    public C54352oa WESOpaqueClientCreateLoginFinish(AnonymousClass2HW r8, byte[] bArr, byte[] bArr2, int i) {
        return new C54352oa((NativeHolder) jvidispatchOIOOO(3, (long) 100000, r8.A00, bArr, bArr2));
    }

    public C51032jA WESOpaqueClientCreateRegistrationFinish(AnonymousClass2HX r5, byte[] bArr, int i) {
        return new C51032jA((NativeHolder) jvidispatchOIOO(2, (long) 100000, r5.A00, bArr));
    }

    public C40932Ih WcmBotMessageSecretAPICreateWithMessageSecret(C40922Ig r4) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOO(8, AnonymousClass0x9.A0r(this), r4.A00);
        if (nativeHolder != null) {
            return new C40932Ih(nativeHolder);
        }
        return null;
    }

    public AnonymousClass2UC getJniCallbacksIJniCallbacks(NativeHolder nativeHolder) {
        NativeHolder A0I = C18300x5.A0I(this);
        if (!(A0I == null || nativeHolder == null || A0I.isNativeEqual(nativeHolder))) {
            Log.d("JniBridge/WamsysContextNotMatching");
        }
        return this.jniCallbacksIJniCallbacks;
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        int i;
        Object obj16 = obj13;
        Object obj17 = obj9;
        Object obj18 = obj10;
        Object obj19 = obj7;
        Object obj20 = obj8;
        Object obj21 = obj6;
        Object obj22 = obj5;
        Object obj23 = obj4;
        Object obj24 = obj3;
        Object obj25 = obj14;
        Object obj26 = obj;
        Object obj27 = obj2;
        Object obj28 = obj11;
        Object obj29 = obj12;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj15;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean A1S = AnonymousClass000.A1S((0 > j24 ? 1 : (0 == j24 ? 0 : -1)));
            String str = (String) obj26;
            int i5 = (int) j4;
            int i6 = (int) j5;
            int i7 = (int) j6;
            int i8 = (int) j7;
            String str2 = (String) obj27;
            String str3 = (String) obj24;
            String str4 = (String) obj23;
            boolean A1S2 = AnonymousClass000.A1S((0 > j25 ? 1 : (0 == j25 ? 0 : -1)));
            int i9 = (int) j8;
            String str5 = (String) obj22;
            String str6 = (String) obj21;
            String str7 = (String) obj19;
            int i10 = (int) j9;
            String str8 = (String) obj20;
            boolean A1S3 = AnonymousClass000.A1S((0 > j26 ? 1 : (0 == j26 ? 0 : -1)));
            String str9 = (String) obj17;
            int i11 = (int) j10;
            int i12 = (int) j11;
            int i13 = (int) j12;
            String str10 = (String) obj18;
            int i14 = (int) j13;
            Map map = (Map) obj16;
            Map map2 = (Map) obj25;
            int i15 = (int) j14;
            String str11 = (String) obj28;
            int i16 = (int) j15;
            C56812sb r6 = (C56812sb) obj29;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j27 = j21;
            long j28 = j20;
            long j29 = j19;
            long j30 = j18;
            long j31 = j17;
            long j32 = j16;
            Map map3 = map2;
            int i17 = i2;
            int i18 = i3;
            int i19 = i4;
            int i20 = i5;
            int i21 = i6;
            int i22 = i7;
            int i23 = i8;
            int i24 = i9;
            int i25 = i10;
            int i26 = i11;
            int i27 = i12;
            int i28 = i13;
            int i29 = i14;
            int i30 = i15;
            int i31 = i16;
            C56812sb r23 = r6;
            String str12 = str;
            String str13 = str2;
            String str14 = str3;
            String str15 = str4;
            String str16 = str5;
            String str17 = str6;
            String str18 = str7;
            String str19 = str8;
            String str20 = str9;
            String str21 = str10;
            String str22 = str11;
            Map map4 = map;
            r23.A07(str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, map4, map3, i17, i, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, j32, j31, j30, j29, j28, j27, j22, j23, A1S, A1S2, A1S3);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        int i;
        Object obj22 = obj18;
        Object obj23 = obj17;
        Object obj24 = obj16;
        Object obj25 = obj15;
        Object obj26 = obj20;
        Object obj27 = obj19;
        Object obj28 = obj14;
        Object obj29 = obj13;
        Object obj30 = obj8;
        Object obj31 = obj2;
        Object obj32 = obj3;
        Object obj33 = obj4;
        Object obj34 = obj5;
        Object obj35 = obj6;
        Object obj36 = obj7;
        Object obj37 = obj9;
        Object obj38 = obj10;
        Object obj39 = obj11;
        Object obj40 = obj12;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj21;
            String str = (String) obj;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean A1S = AnonymousClass000.A1S((0 > j14 ? 1 : (0 == j14 ? 0 : -1)));
            String str2 = (String) obj31;
            String str3 = (String) obj32;
            String str4 = (String) obj33;
            String str5 = (String) obj34;
            String str6 = (String) obj35;
            int i5 = (int) j4;
            String str7 = (String) obj36;
            String str8 = (String) obj30;
            String str9 = (String) obj37;
            boolean A1S2 = AnonymousClass000.A1S((0 > j15 ? 1 : (0 == j15 ? 0 : -1)));
            String str10 = (String) obj38;
            int i6 = (int) j5;
            String str11 = (String) obj39;
            String str12 = (String) obj40;
            String str13 = (String) obj29;
            String str14 = (String) obj28;
            Map map = (Map) obj27;
            Map map2 = (Map) obj26;
            int i7 = (int) j6;
            String str15 = (String) obj25;
            String str16 = (String) obj24;
            String str17 = (String) obj23;
            C56812sb r5 = (C56812sb) obj22;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A06(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, map, map2, i2, i, i3, i4, i5, i6, i7, j7, j8, j9, j10, j11, j12, j13, A1S, A1S2);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        int i;
        Object obj15 = obj11;
        Object obj16 = obj;
        Object obj17 = obj2;
        Object obj18 = obj3;
        Object obj19 = obj4;
        Object obj20 = obj5;
        Object obj21 = obj6;
        Object obj22 = obj7;
        Object obj23 = obj8;
        Object obj24 = obj9;
        Object obj25 = obj12;
        Object obj26 = obj13;
        Object obj27 = obj10;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj14;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean A1S = AnonymousClass000.A1S((0 > j11 ? 1 : (0 == j11 ? 0 : -1)));
            String str = (String) obj16;
            String str2 = (String) obj17;
            String str3 = (String) obj18;
            String str4 = (String) obj19;
            String str5 = (String) obj20;
            String str6 = (String) obj21;
            String str7 = (String) obj22;
            String str8 = (String) obj23;
            boolean A1S2 = AnonymousClass000.A1S((0 > j12 ? 1 : (0 == j12 ? 0 : -1)));
            String str9 = (String) obj24;
            int i5 = (int) j4;
            boolean A1S3 = AnonymousClass000.A1S((0 > j13 ? 1 : (0 == j13 ? 0 : -1)));
            int i6 = (int) j5;
            int i7 = (int) j6;
            Map map = (Map) obj25;
            Map map2 = (Map) obj26;
            String str10 = (String) obj27;
            C56812sb r5 = (C56812sb) obj15;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j14 = j8;
            long j15 = j7;
            int i8 = i2;
            int i9 = i3;
            int i10 = i4;
            int i11 = i5;
            int i12 = i6;
            int i13 = i7;
            String str11 = str7;
            String str12 = str8;
            String str13 = str9;
            String str14 = str10;
            Map map3 = map;
            Map map4 = map2;
            String str15 = str;
            String str16 = str2;
            String str17 = str3;
            String str18 = str4;
            String str19 = str5;
            String str20 = str6;
            C56812sb r15 = r5;
            r15.A08(str15, str16, str17, str18, str19, str20, str11, str12, str13, str14, map3, map4, i8, i, i9, i10, i11, i12, i13, j15, j14, j9, j10, A1S, A1S2, A1S3);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        int i;
        Object obj14 = obj;
        Object obj15 = obj2;
        Object obj16 = obj3;
        Object obj17 = obj4;
        Object obj18 = obj5;
        Object obj19 = obj6;
        Object obj20 = obj7;
        Object obj21 = obj8;
        Object obj22 = obj9;
        Object obj23 = obj11;
        Object obj24 = obj12;
        Object obj25 = obj10;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj13;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean A1S = AnonymousClass000.A1S((0 > j10 ? 1 : (0 == j10 ? 0 : -1)));
            String str = (String) obj14;
            int i5 = (int) j4;
            String str2 = (String) obj15;
            String str3 = (String) obj16;
            String str4 = (String) obj17;
            boolean A1S2 = AnonymousClass000.A1S((0 > j11 ? 1 : (0 == j11 ? 0 : -1)));
            int i6 = (int) j5;
            String str5 = (String) obj18;
            String str6 = (String) obj19;
            String str7 = (String) obj20;
            String str8 = (String) obj21;
            boolean A1S3 = AnonymousClass000.A1S((0 > j12 ? 1 : (0 == j12 ? 0 : -1)));
            String str9 = (String) obj22;
            Map map = (Map) obj23;
            Map map2 = (Map) obj24;
            C56812sb r5 = (C56812sb) obj25;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j13 = j7;
            long j14 = j6;
            int i7 = i3;
            int i8 = i4;
            int i9 = i5;
            int i10 = i6;
            String str10 = str7;
            String str11 = str8;
            String str12 = str9;
            Map map3 = map;
            Map map4 = map2;
            int i11 = i2;
            String str13 = str;
            String str14 = str2;
            String str15 = str3;
            String str16 = str4;
            String str17 = str5;
            String str18 = str6;
            C56812sb r18 = r5;
            r18.A09(str13, str14, str15, str16, str17, str18, str10, str11, str12, map3, map4, i11, i, i7, i8, i9, i10, j14, j13, j8, j9, A1S, A1S2, A1S3);
            return 0;
        } catch (Exception e) {
            AnonymousClass2XD.A00(e);
            return 0;
        }
    }
}
