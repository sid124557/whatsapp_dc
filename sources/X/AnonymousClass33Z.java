package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.33Z  reason: invalid class name */
public class AnonymousClass33Z {
    public WeakHashMap A00 = new WeakHashMap();
    public final C55682qk A01;
    public final C56972sr A02;
    public final C42112Mv A03;
    public final AnonymousClass3H2 A04;
    public final AnonymousClass2FM A05;
    public final C42712Pf A06;
    public final C47872dy A07;
    public final C64213Cp A08;
    public final C56612sH A09;
    public final C621133n A0A;
    public final C614730x A0B;
    public final C55332qB A0C;
    public final C29041iB A0D;
    public final C55172pv A0E;
    public final C66463Ln A0F;
    public final AnonymousClass318 A0G;
    public final AnonymousClass1VX A0H;

    public static C51502jv A01(byte[] bArr, byte b) {
        try {
            return AnonymousClass36G.A01(AnonymousClass36A.A03(new byte[]{b}, bArr, new byte[2][], 0, 1));
        } catch (AnonymousClass23X e) {
            Log.e("DeviceVerificationUtil/generatePublicIdentityKey invalidKeyException", e);
            return null;
        }
    }

    public AnonymousClass0PJ A03(UserJid userJid, byte[] bArr) {
        C47932e4 r4;
        boolean z;
        String str;
        int i = 1;
        try {
            C21451Bw r7 = (C21451Bw) C130786cX.A05(C21451Bw.DEFAULT_INSTANCE, bArr);
            C47932e4 A082 = this.A0A.A08(AnonymousClass36G.A03(userJid));
            if ((r7.bitField0_ & 4) != 0) {
                r4 = new C47932e4(new C51502jv(r7.accountSignatureKey_.A07(), (byte) 5));
            } else {
                r4 = null;
            }
            if (A082 != null) {
                z = false;
            } else if (r4 != null) {
                z = true;
            } else {
                C18260x0.A1S(AnonymousClass001.A0o(), "DeviceADVInfoHandler/getPublicKeyFromUserJidOrIndexList/no primary identity. userJid=", userJid);
                this.A0F.A01(Collections.singletonList(userJid.getPrimaryDevice()));
                C55172pv r2 = this.A0E;
                C24041Vw r1 = new C24041Vw();
                r1.A00 = 2;
                r2.A00.BhD(r1);
                return null;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DeviceADVInfoHandler/getPublicKeyFromUserJidOrIndexList/use public key from: ");
            if (z) {
                str = "adv";
            } else {
                str = "local";
            }
            C18260x0.A1L(A0o, str);
            C47932e4 r5 = A082;
            if (z) {
                r5 = r4;
            }
            if (!(A082 == null || r4 == null || A082.A00.equals(r4.A00))) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/identity public key mismatch");
            }
            byte[] A072 = r7.details_.A07();
            if (!AnonymousClass36G.A07(r5.A00, AnonymousClass36A.A03(C58152un.A0J, A072, new byte[2][], 0, 1), r7.accountSignature_.A07())) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/fail to verify account signature");
                this.A0F.A01(Collections.singletonList(userJid.getPrimaryDevice()));
                C55172pv r22 = this.A0E;
                if (z) {
                    i = 2;
                }
                C24021Vu r12 = new C24021Vu();
                r12.A00 = Integer.valueOf(i);
                r22.A00.BhD(r12);
                return null;
            }
            try {
                C130786cX A052 = C130786cX.A05(AnonymousClass1DS.DEFAULT_INSTANCE, A072);
                if (!z) {
                    r5 = null;
                }
                return AnonymousClass0x9.A0G(A052, r5);
            } catch (AnonymousClass6u5 e) {
                C18260x0.A16("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVKeyIndexList invalidProto:", AnonymousClass001.A0o(), e);
                this.A0E.A00(4);
                return null;
            }
        } catch (AnonymousClass6u5 e2) {
            C18260x0.A16("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVSignedKeyIndexList invalidProto:", AnonymousClass001.A0o(), e2);
            this.A0E.A00(3);
            return null;
        }
    }

    public boolean A0B(DeviceJid deviceJid, C45442a1 r11, byte[] bArr, int i) {
        byte[] bArr2;
        DeviceJid deviceJid2 = deviceJid;
        if (deviceJid == null || AnonymousClass000.A1T(deviceJid.getDevice()) || r11 == null || r11.A00 != 1) {
            return true;
        }
        byte[] bArr3 = r11.A02;
        try {
            bArr2 = AnonymousClass36G.A01(C616431q.A00(((AnonymousClass1DY) C130786cX.A02(C172548Lq.A02(bArr3, 1, bArr3.length - 1), AnonymousClass1DY.DEFAULT_INSTANCE)).identityKey_).A00()).A01;
        } catch (AnonymousClass23X | AnonymousClass24R | AnonymousClass6u5 e) {
            Log.e("DeviceVerificationUtil/extractIdentityFromCipherText/fail to get key", e);
            bArr2 = null;
        }
        return A0C(deviceJid2, bArr, bArr2, (byte) 5, i);
    }

    public final boolean A0D(UserJid userJid, AnonymousClass1DS r13, AnonymousClass33D r14, long j) {
        Object valueOf;
        long j2;
        if (r13 == null) {
            C18260x0.A1S(AnonymousClass001.A0o(), "DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData fail keyIndexListNull, userJid=", userJid);
            return false;
        }
        long j3 = r13.timestamp_;
        long j4 = j;
        if (j != j3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData advTimestampMismatch; ts=");
            A0o.append(j4);
            C18270x1.A1B("; advts=", A0o, j3);
            C55172pv r7 = this.A0E;
            long j5 = r13.timestamp_;
            C24301Ww r6 = new C24301Ww();
            r6.A01 = AnonymousClass0x9.A0o(j4, 3600);
            r6.A00 = AnonymousClass0x9.A0o(j5, 3600);
            r7.A00.BhD(r6);
            return false;
        }
        AnonymousClass318 r5 = this.A0G;
        C60212yB A072 = r5.A07(userJid);
        long A0H2 = this.A09.A0H();
        int A0O = this.A0H.A0O(C58422vE.A02, 730);
        if (A0O < 1) {
            A0O = 1;
        }
        if (j >= C18280x3.A08(A0H2, AnonymousClass0x7.A0D(Math.min(35, A0O))) || r13.validIndexes_.size() <= 1) {
            if (A072 == null || A072.A01 != r13.rawId_) {
                Log.w("DeviceADVInfoManager/verifyKeyIndexListData/incoming key-index not matching local state, resetting");
                C56972sr r1 = this.A02;
                if (r1.A0a(userJid) && r1.A0Y()) {
                    C55682qk r2 = this.A01;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("indexRawId=");
                    A0o2.append(r13.rawId_);
                    A0o2.append("; rawId=");
                    if (A072 == null) {
                        valueOf = "null";
                    } else {
                        valueOf = Integer.valueOf(A072.A01);
                    }
                    r2.A0A("device_self_invalid_index_list", false, AnonymousClass000.A0R(valueOf, A0o2));
                } else if (r14.A00 == null) {
                    r5.A0G(userJid, "adv_key_index_list_validation_failed");
                }
            }
            if (r14.A00 == null) {
                return true;
            }
            C60212yB r3 = ((C42332Nr) ((AnonymousClass0PJ) r14.A00()).A00).A01;
            AnonymousClass8OQ r22 = ((C42332Nr) ((AnonymousClass0PJ) r14.A00()).A00).A00;
            C56972sr r12 = this.A02;
            if (!r12.A0Y() || !r12.A0a(userJid)) {
                return r5.A0I(r22, r3, userJid, AnonymousClass001.A1Z(((AnonymousClass0PJ) r14.A00()).A01));
            }
            r5.A0F(r3, userJid);
            return this.A0D.A0L(r22, true, false);
        }
        if (A072 != null) {
            j2 = A072.A05;
        } else {
            j2 = 0;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData advListTimestampInvalid; localTs=");
        A0o3.append(j2);
        C18270x1.A1B("; ts=", A0o3, j4);
        this.A0E.A03(j2, j4, true);
        return false;
    }

    public static long A00(AnonymousClass33Z r3, long j) {
        return r3.A09.A0H() - (1000 * j);
    }

    public final C172548Lq A05(UserJid userJid, Set set) {
        Map A092;
        Set keySet;
        C47932e4 A082;
        C56972sr r4 = this.A02;
        boolean A0a = r4.A0a(userJid);
        if (A0a) {
            A092 = AnonymousClass001.A0t();
            keySet = this.A0G.A0D(userJid);
        } else {
            A092 = this.A0G.A09(userJid);
            keySet = A092.keySet();
        }
        HashSet A0K = AnonymousClass002.A0K();
        if (keySet.size() > 1) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                DeviceJid A0R = AnonymousClass0x7.A0R(it);
                if (r4.A0c(A0R)) {
                    A082 = this.A0A.A00.A04().A01;
                } else {
                    A082 = this.A0A.A08(AnonymousClass36G.A02(A0R));
                }
                if (A082 == null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                    A0o.append(A0R);
                    Log.w(AnonymousClass000.A0b("; isMe=", A0o, A0a));
                    if (A0a) {
                        this.A0E.A04(true);
                    } else {
                        A0K.add(A0R);
                    }
                } else {
                    A0s.add(A082);
                }
            }
            if (A0s.isEmpty()) {
                this.A0E.A04(false);
                return null;
            }
            if (!A0K.isEmpty()) {
                Iterator A0q = AnonymousClass000.A0q(A092);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (!A0K.contains(A0w.getKey())) {
                        set.add(Integer.valueOf(AnonymousClass0x2.A08(A0w)));
                    }
                }
            }
            try {
                byte[] A022 = A02(AnonymousClass0x7.A0t(), A0s);
                int A0O = this.A0H.A0O(C58422vE.A02, 310);
                byte[] bArr = new byte[A0O];
                System.arraycopy(A022, 0, bArr, 0, A0O);
                return C172548Lq.A02(bArr, 0, A0O);
            } catch (NoSuchAlgorithmException e) {
                Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
                this.A0E.A04(false);
                return null;
            }
        }
        return null;
    }

    public C43592Ss A06(UserJid userJid) {
        C172548Lq A052;
        long A022;
        AnonymousClass239 r20;
        C56972sr r9 = this.A02;
        C172548Lq A053 = A05(C56972sr.A04(r9), AnonymousClass002.A0K());
        PhoneUserJid A042 = C56972sr.A04(r9);
        AnonymousClass318 r8 = this.A0G;
        long A023 = r8.A02(A042);
        if (A053 == null && A00(this, A023) >= 2592000000L) {
            A023 = 0;
        }
        UserJid userJid2 = userJid;
        boolean A0a = r9.A0a(userJid2);
        HashSet A0K = AnonymousClass002.A0K();
        if (A0a) {
            A052 = null;
        } else {
            A052 = A05(userJid2, A0K);
        }
        if (A0a) {
            A022 = 0;
        } else {
            A022 = r8.A02(userJid2);
            if (A052 == null && A00(this, A022) >= 2592000000L) {
                A022 = 0;
            }
        }
        if (A053 == null && A023 == 0 && A052 == null && A022 == 0) {
            return null;
        }
        AnonymousClass239 r19 = AnonymousClass239.E2EE;
        if (A0K.isEmpty()) {
            A0K = null;
        }
        C60212yB A072 = r8.A07(userJid2);
        if (r9.A0a(userJid2) || A072 == null || A072.A00 == 0) {
            r20 = null;
        } else {
            r20 = AnonymousClass239.HOSTED;
        }
        C43592Ss r15 = r16;
        C43592Ss r16 = new C43592Ss(A053, A052, r19, r20, A0K, A023, A022);
        return r15;
    }

    public void A0A(UserJid userJid, long j) {
        if (j - C56612sH.A00(this.A09) > 5184000) {
            C18260x0.A11("DeviceADVInfoHandler/removeDeviceInfoIfTimestampIsInvalid invalid local timestamp ts=", AnonymousClass001.A0o(), j);
            this.A0G.A0G(userJid, "adv_key_index_list_validation_failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0373, code lost:
        if ((!r10) != false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d0, code lost:
        if (new X.C47932e4(r8).equals(r1) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e1, code lost:
        if (r22.A0b(r7) == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0230, code lost:
        if (X.C18320x8.A05(r11.get(r7)) != ((long) r2.keyIndex_)) goto L_0x0232;
     */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0562 A[Catch:{ all -> 0x0410, all -> 0x060e }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(com.whatsapp.jid.DeviceJid r39, byte[] r40, byte[] r41, byte r42, int r43) {
        /*
            r38 = this;
            r13 = r43
            r6 = r38
            X.30x r1 = r6.A0B
            r7 = r39
            com.whatsapp.jid.UserJid r0 = r7.userJid
            X.2ov r0 = X.AnonymousClass36G.A03(r0)
            X.3fe r26 = X.C614730x.A00(r0, r1)
            r5 = 1
            int r0 = r7.getDevice()     // Catch:{ all -> 0x060e }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x0608
            r4 = 0
            r1 = r40
            if (r40 != 0) goto L_0x002e
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/null deviceADVInfo"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            X.2pv r0 = r6.A0E     // Catch:{ all -> 0x060e }
            r0.A01(r13, r4)     // Catch:{ all -> 0x060e }
            goto L_0x0602
        L_0x002e:
            r15 = r41
            if (r41 != 0) goto L_0x003e
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/null identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            X.2pv r0 = r6.A0E     // Catch:{ all -> 0x060e }
            r0.A01(r13, r5)     // Catch:{ all -> 0x060e }
            goto L_0x0602
        L_0x003e:
            X.1iB r0 = r6.A0D     // Catch:{ all -> 0x060e }
            r23 = r0
            boolean r0 = r0.A0M(r7)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/message from device in progress of login"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            goto L_0x0602
        L_0x004f:
            X.318 r3 = r6.A0G     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid r0 = r7.userJid     // Catch:{ all -> 0x060e }
            java.util.Set r0 = r3.A0D(r0)     // Catch:{ all -> 0x060e }
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x060e }
            r8 = r42
            if (r0 == 0) goto L_0x0081
            X.33n r2 = r6.A0A     // Catch:{ all -> 0x060e }
            X.2ov r0 = X.AnonymousClass36G.A02(r7)     // Catch:{ all -> 0x060e }
            X.2e4 r9 = r2.A08(r0)     // Catch:{ all -> 0x060e }
            X.2jv r2 = A01(r15, r8)     // Catch:{ all -> 0x060e }
            if (r2 == 0) goto L_0x0081
            X.2e4 r0 = new X.2e4     // Catch:{ all -> 0x060e }
            r0.<init>(r2)     // Catch:{ all -> 0x060e }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/already have device"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            goto L_0x0608
        L_0x0081:
            X.2sr r0 = r6.A02     // Catch:{ all -> 0x060e }
            r22 = r0
            boolean r0 = r0.A0b(r7)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r22.A0Y()     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x00a4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/unexpected self device, jid="
            X.C18260x0.A1Q(r1, r0, r7)     // Catch:{ all -> 0x060e }
            java.lang.String r1 = "unknown_companion"
            r0 = r23
            r0.A0I(r7, r1, r4, r4)     // Catch:{ all -> 0x060e }
            goto L_0x0602
        L_0x00a4:
            X.1Cf r0 = X.C21541Cf.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x05f3 }
            X.6cX r1 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x05f3 }
            X.1Cf r1 = (X.C21541Cf) r1     // Catch:{ 6u5 -> 0x05f3 }
            X.8Lq r2 = r1.details_     // Catch:{ 6u5 -> 0x05e2 }
            X.1D3 r0 = X.AnonymousClass1D3.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x05e2 }
            X.6cX r2 = X.C130786cX.A02(r2, r0)     // Catch:{ 6u5 -> 0x05e2 }
            X.1D3 r2 = (X.AnonymousClass1D3) r2     // Catch:{ 6u5 -> 0x05e2 }
            X.8Lq r0 = r1.accountSignatureKey_     // Catch:{ all -> 0x060e }
            byte[] r9 = r0.A07()     // Catch:{ all -> 0x060e }
            int r0 = r9.length     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x00c4
            X.2jv r14 = A01(r9, r8)     // Catch:{ all -> 0x060e }
            goto L_0x00d4
        L_0x00c4:
            X.33n r9 = r6.A0A     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid r0 = r7.userJid     // Catch:{ all -> 0x060e }
            X.2ov r0 = X.AnonymousClass36G.A03(r0)     // Catch:{ all -> 0x060e }
            X.2e4 r0 = r9.A08(r0)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x05b7
            X.2jv r14 = r0.A00     // Catch:{ all -> 0x060e }
        L_0x00d4:
            if (r14 == 0) goto L_0x05b7
            int r0 = r2.deviceType_     // Catch:{ all -> 0x060e }
            X.239 r9 = X.AnonymousClass239.A00(r0)     // Catch:{ all -> 0x060e }
            X.239 r0 = X.AnonymousClass239.HOSTED     // Catch:{ all -> 0x060e }
            if (r9 != r0) goto L_0x0106
            int r0 = r2.accountType_     // Catch:{ all -> 0x060e }
            X.239 r9 = X.AnonymousClass239.A00(r0)     // Catch:{ all -> 0x060e }
            X.239 r0 = X.AnonymousClass239.E2EE     // Catch:{ all -> 0x060e }
            if (r9 != r0) goto L_0x0106
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/account and device encryption type mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            X.2pv r0 = r6.A0E     // Catch:{ all -> 0x060e }
            X.1VY r2 = new X.1VY     // Catch:{ all -> 0x060e }
            r2.<init>()     // Catch:{ all -> 0x060e }
            X.4FV r0 = r0.A00     // Catch:{ all -> 0x060e }
        L_0x00f8:
            r0.BhD(r2)     // Catch:{ all -> 0x060e }
        L_0x00fb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/signature verification fail, deviceJid="
            X.C18260x0.A1Q(r1, r0, r7)     // Catch:{ all -> 0x060e }
            goto L_0x0602
        L_0x0106:
            byte[] r21 = r2.A0F()     // Catch:{ all -> 0x060e }
            X.8Lq r0 = r1.accountSignature_     // Catch:{ all -> 0x060e }
            byte[] r20 = r0.A07()     // Catch:{ all -> 0x060e }
            X.8Lq r0 = r1.deviceSignature_     // Catch:{ all -> 0x060e }
            byte[] r18 = r0.A07()     // Catch:{ all -> 0x060e }
            X.2jv r11 = A01(r15, r8)     // Catch:{ all -> 0x060e }
            if (r11 != 0) goto L_0x0127
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/invalid companion public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            X.2pv r0 = r6.A0E     // Catch:{ all -> 0x060e }
            r0.A01(r13, r5)     // Catch:{ all -> 0x060e }
            goto L_0x00fb
        L_0x0127:
            byte[] r10 = X.C58152un.A0F     // Catch:{ all -> 0x060e }
            X.2FM r0 = r6.A05     // Catch:{ all -> 0x060e }
            X.1VX r12 = r0.A00     // Catch:{ all -> 0x060e }
            r9 = 6939(0x1b1b, float:9.724E-42)
            X.2vE r19 = X.C58422vE.A02     // Catch:{ all -> 0x060e }
            r0 = r19
            boolean r0 = r12.A0Y(r0, r9)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x0141
            int r0 = r2.deviceType_     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x0141
            if (r0 != r5) goto L_0x0141
            byte[] r10 = X.C58152un.A0G     // Catch:{ all -> 0x060e }
        L_0x0141:
            r1 = 3
            byte[][] r0 = new byte[r1][]     // Catch:{ all -> 0x060e }
            r0[r4] = r10     // Catch:{ all -> 0x060e }
            r0[r5] = r21     // Catch:{ all -> 0x060e }
            r10 = 2
            byte[] r17 = X.AnonymousClass36A.A04(r15, r0, r10)     // Catch:{ all -> 0x060e }
            byte[] r16 = X.C58152un.A0H     // Catch:{ all -> 0x060e }
            r0 = r19
            boolean r0 = r12.A0Y(r0, r9)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x015f
            int r0 = r2.deviceType_     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x015f
            if (r0 != r5) goto L_0x015f
            byte[] r16 = X.C58152un.A0I     // Catch:{ all -> 0x060e }
        L_0x015f:
            r0 = 4
            byte[][] r0 = new byte[r0][]     // Catch:{ all -> 0x060e }
            r0[r4] = r16     // Catch:{ all -> 0x060e }
            r0[r5] = r21     // Catch:{ all -> 0x060e }
            r0[r10] = r41     // Catch:{ all -> 0x060e }
            byte[] r9 = r14.A01     // Catch:{ all -> 0x060e }
            byte[] r12 = X.AnonymousClass36A.A04(r9, r0, r1)     // Catch:{ all -> 0x060e }
            r1 = r17
            r0 = r20
            boolean r0 = X.AnonymousClass36G.A07(r14, r1, r0)     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify account signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            X.2pv r1 = r6.A0E     // Catch:{ all -> 0x060e }
            X.1Vt r2 = new X.1Vt     // Catch:{ all -> 0x060e }
            r2.<init>()     // Catch:{ all -> 0x060e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x060e }
        L_0x0188:
            r2.A00 = r0     // Catch:{ all -> 0x060e }
            X.4FV r0 = r1.A00     // Catch:{ all -> 0x060e }
            goto L_0x00f8
        L_0x018e:
            r0 = r18
            boolean r0 = X.AnonymousClass36G.A07(r11, r12, r0)     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify device signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            X.2pv r1 = r6.A0E     // Catch:{ all -> 0x060e }
            X.1Vt r2 = new X.1Vt     // Catch:{ all -> 0x060e }
            r2.<init>()     // Catch:{ all -> 0x060e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x060e }
            goto L_0x0188
        L_0x01a7:
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/validation passed"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid r12 = r7.userJid     // Catch:{ all -> 0x060e }
            X.2yB r10 = r3.A07(r12)     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.DeviceJid r0 = r12.getPrimaryDevice()     // Catch:{ all -> 0x060e }
            X.33n r11 = r6.A0A     // Catch:{ all -> 0x060e }
            X.2ov r0 = X.AnonymousClass36G.A02(r0)     // Catch:{ all -> 0x060e }
            X.2e4 r1 = r11.A08(r0)     // Catch:{ all -> 0x060e }
            X.2jv r8 = A01(r9, r8)     // Catch:{ all -> 0x060e }
            if (r8 == 0) goto L_0x01d2
            X.2e4 r0 = new X.2e4     // Catch:{ all -> 0x060e }
            r0.<init>(r8)     // Catch:{ all -> 0x060e }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x060e }
            r15 = 1
            if (r0 != 0) goto L_0x01d3
        L_0x01d2:
            r15 = 0
        L_0x01d3:
            boolean r0 = r22.A0Y()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x01e3
            r0 = r22
            boolean r0 = r0.A0b(r7)     // Catch:{ all -> 0x060e }
            r18 = 1
            if (r0 != 0) goto L_0x01e5
        L_0x01e3:
            r18 = 0
        L_0x01e5:
            if (r10 != 0) goto L_0x01e9
            r1 = 0
            goto L_0x01eb
        L_0x01e9:
            int r1 = r10.A00     // Catch:{ all -> 0x060e }
        L_0x01eb:
            int r0 = r2.accountType_     // Catch:{ all -> 0x060e }
            X.239 r0 = X.AnonymousClass239.A00(r0)     // Catch:{ all -> 0x060e }
            int r0 = X.C60212yB.A00(r0)     // Catch:{ all -> 0x060e }
            boolean r8 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.String r17 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity"
            java.lang.String r16 = "; keyIndex"
            if (r15 == 0) goto L_0x0424
            if (r10 == 0) goto L_0x0424
            int r0 = r10.A01     // Catch:{ all -> 0x060e }
            r20 = r0
            int r1 = r2.rawId_     // Catch:{ all -> 0x060e }
            if (r0 != r1) goto L_0x0424
            if (r8 == 0) goto L_0x0424
            if (r18 == 0) goto L_0x020e
            goto L_0x0213
        L_0x020e:
            java.util.Map r11 = r3.A09(r12)     // Catch:{ all -> 0x060e }
            goto L_0x021c
        L_0x0213:
            X.8OQ r0 = r3.A03()     // Catch:{ all -> 0x060e }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x060e }
            r11.<init>(r0)     // Catch:{ all -> 0x060e }
        L_0x021c:
            boolean r0 = r11.containsKey(r7)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x0232
            java.lang.Object r0 = r11.get(r7)     // Catch:{ all -> 0x060e }
            long r14 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x060e }
            int r0 = r2.keyIndex_     // Catch:{ all -> 0x060e }
            long r0 = (long) r0     // Catch:{ all -> 0x060e }
            int r8 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r15 = 1
            if (r8 == 0) goto L_0x0233
        L_0x0232:
            r15 = 0
        L_0x0233:
            long r0 = r10.A05     // Catch:{ all -> 0x060e }
            long r8 = r2.timestamp_     // Catch:{ all -> 0x060e }
            int r14 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x023f
            if (r15 != 0) goto L_0x023f
            goto L_0x04a7
        L_0x023f:
            int r13 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x025b
            java.lang.String r0 = "DeviceADVInfoManager/processADVIdentity/need to update local device list; kicking off usync"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            long r0 = r2.timestamp_     // Catch:{ all -> 0x060e }
            X.2yB r0 = r3.A06(r10, r0)     // Catch:{ all -> 0x060e }
            r3.A0F(r0, r12)     // Catch:{ all -> 0x060e }
            X.3Cp r6 = r6.A08     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r5]     // Catch:{ all -> 0x060e }
            r1[r4] = r12     // Catch:{ all -> 0x060e }
            r0 = 3
            r6.A01(r1, r0)     // Catch:{ all -> 0x060e }
        L_0x025b:
            if (r15 != 0) goto L_0x05b0
            if (r18 == 0) goto L_0x0280
            java.lang.String r0 = "DeviceADVInfoManager/processADVIdentity/updating self peer"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            X.7o6 r1 = new X.7o6     // Catch:{ all -> 0x060e }
            r1.<init>()     // Catch:{ all -> 0x060e }
            r1.putAll((java.util.Map) r11)     // Catch:{ all -> 0x060e }
            int r0 = r2.keyIndex_     // Catch:{ all -> 0x060e }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x060e }
            r1.put(r7, r0)     // Catch:{ all -> 0x060e }
            X.8OQ r1 = r1.build()     // Catch:{ all -> 0x060e }
            r0 = r23
            r0.A0L(r1, r4, r4)     // Catch:{ all -> 0x060e }
            goto L_0x05b0
        L_0x0280:
            java.lang.String r0 = "DeviceADVInfoManager/processADVIdentity/writing device locally"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid r5 = r7.userJid     // Catch:{ all -> 0x060e }
            int r0 = r2.keyIndex_     // Catch:{ all -> 0x060e }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x060e }
            X.8OQ r0 = X.AnonymousClass8OQ.of(r7, r0)     // Catch:{ all -> 0x060e }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x060e }
            r7.<init>(r0)     // Catch:{ all -> 0x060e }
            X.2s7 r6 = r3.A05     // Catch:{ all -> 0x060e }
            X.8OQ r0 = r6.A01(r5)     // Catch:{ all -> 0x060e }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x060e }
            r2.<init>(r0)     // Catch:{ all -> 0x060e }
            java.util.Iterator r1 = X.C18290x4.A11(r2)     // Catch:{ all -> 0x060e }
        L_0x02a5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x060e }
            r7.remove(r0)     // Catch:{ all -> 0x060e }
            goto L_0x02a5
        L_0x02b3:
            r3.A0H(r5, r7)     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.DeviceJid r0 = r5.getPrimaryDevice()     // Catch:{ all -> 0x060e }
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x02d2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "UserDeviceManager/addDevicesForUser/no primary device for this user, jid="
            X.C18260x0.A1S(r1, r0, r5)     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.DeviceJid r2 = r5.getPrimaryDevice()     // Catch:{ all -> 0x060e }
            r0 = 0
            X.AnonymousClass0x2.A1J(r2, r7, r0)     // Catch:{ all -> 0x060e }
        L_0x02d2:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x05b0
            r7.keySet()     // Catch:{ all -> 0x060e }
            X.8OQ r9 = X.AnonymousClass8OQ.copyOf((java.util.Map) r7)     // Catch:{ all -> 0x060e }
            X.2sr r0 = r6.A00     // Catch:{ all -> 0x060e }
            boolean r0 = r0.A0a(r5)     // Catch:{ all -> 0x060e }
            r1 = r0 ^ 1
            java.lang.String r0 = "only add new device for others"
            X.C626936e.A0F(r1, r0)     // Catch:{ all -> 0x060e }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x0415
            X.2sM r0 = r6.A03     // Catch:{ all -> 0x060e }
            java.util.Set r25 = r0.A07(r5)     // Catch:{ all -> 0x060e }
            java.util.HashMap r8 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x060e }
            X.3dV r0 = r6.A01     // Catch:{ all -> 0x060e }
            X.4Fq r24 = r0.A04()     // Catch:{ all -> 0x060e }
            X.3Yo r23 = r24.Axl()     // Catch:{ all -> 0x040b }
            java.util.Iterator r22 = r25.iterator()     // Catch:{ all -> 0x0401 }
        L_0x030b:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0401 }
            if (r0 == 0) goto L_0x03d4
            com.whatsapp.jid.UserJid r12 = X.C18310x6.A0T(r22)     // Catch:{ all -> 0x0401 }
            X.8OQ r0 = r6.A01(r12)     // Catch:{ all -> 0x0401 }
            X.6aS r21 = r0.keySet()     // Catch:{ all -> 0x0401 }
            r0 = r21
            r8.put(r12, r0)     // Catch:{ all -> 0x0401 }
            X.8OQ r20 = X.C621933y.A00(r9, r12)     // Catch:{ all -> 0x0401 }
            X.2qL r15 = r6.A05     // Catch:{ all -> 0x0401 }
            java.lang.String r14 = "; keyIndex="
            X.3dV r0 = r15.A02     // Catch:{ all -> 0x0401 }
            X.4Fq r11 = r0.A04()     // Catch:{ all -> 0x0401 }
            X.3Yo r19 = r11.Axl()     // Catch:{ all -> 0x03ca }
            X.8Nf r18 = X.C18310x6.A0M(r20)     // Catch:{ all -> 0x03c0 }
        L_0x0338:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x039e
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r18)     // Catch:{ all -> 0x03c0 }
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x9.A0Q(r2)     // Catch:{ all -> 0x03c0 }
            int r0 = r0.getDevice()     // Catch:{ all -> 0x03c0 }
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceIdNullable(r12, r0)     // Catch:{ all -> 0x03c0 }
            boolean r1 = X.AnonymousClass000.A1W(r13)
            java.lang.String r0 = "DeviceJid must not be null"
            X.C626936e.A0D(r1, r0)     // Catch:{ all -> 0x03c0 }
            if (r13 == 0) goto L_0x0338
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x03c0 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x03c0 }
            int r2 = r13.getDevice()     // Catch:{ all -> 0x03c0 }
            boolean r10 = X.AnonymousClass000.A1T(r2)     // Catch:{ all -> 0x03c0 }
            r16 = 0
            if (r10 == 0) goto L_0x0375
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x039a
            r2 = r10 ^ 1
            if (r2 == 0) goto L_0x037a
        L_0x0375:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x037a
            goto L_0x039a
        L_0x037a:
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03c0 }
            java.lang.String r2 = "invalid devices jid="
            X.AnonymousClass000.A17(r13, r2, r14, r10)     // Catch:{ all -> 0x03c0 }
            java.lang.String r2 = X.AnonymousClass001.A0k(r10, r0)     // Catch:{ all -> 0x03c0 }
            X.C626936e.A0D(r4, r2)     // Catch:{ all -> 0x03c0 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03c0 }
            java.lang.String r2 = "DeviceStore/addDevicesForUser/invalid devices jid="
            r10.append(r2)     // Catch:{ all -> 0x03c0 }
            r10.append(r13)     // Catch:{ all -> 0x03c0 }
            X.C18260x0.A11(r14, r10, r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x0338
        L_0x039a:
            r15.A03(r13, r12, r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x0338
        L_0x039e:
            r19.A00()     // Catch:{ all -> 0x03c0 }
            r15.A02(r11, r12)     // Catch:{ all -> 0x03c0 }
            r19.close()     // Catch:{ all -> 0x03ca }
            r11.close()     // Catch:{ all -> 0x0401 }
            X.6aS r15 = r20.keySet()     // Catch:{ all -> 0x0401 }
            X.6aS r16 = X.C129526aS.of()     // Catch:{ all -> 0x0401 }
            r19 = r4
            r13 = r6
            r14 = r21
            r17 = r12
            r18 = r4
            r13.A05(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0401 }
            goto L_0x030b
        L_0x03c0:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x03c5 }
            goto L_0x03c9
        L_0x03c5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03ca }
        L_0x03c9:
            throw r1     // Catch:{ all -> 0x03ca }
        L_0x03ca:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x03cf }
            goto L_0x03d3
        L_0x03cf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0401 }
        L_0x03d3:
            throw r1     // Catch:{ all -> 0x0401 }
        L_0x03d4:
            r23.A00()     // Catch:{ all -> 0x0401 }
            r23.close()     // Catch:{ all -> 0x040b }
            r24.close()     // Catch:{ all -> 0x060e }
            java.util.Iterator r10 = r25.iterator()     // Catch:{ all -> 0x060e }
        L_0x03e1:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x0415
            com.whatsapp.jid.UserJid r4 = X.C18310x6.A0T(r10)     // Catch:{ all -> 0x060e }
            java.lang.Object r2 = X.C18290x4.A0i(r4, r8)     // Catch:{ all -> 0x060e }
            X.6aS r2 = (X.C129526aS) r2     // Catch:{ all -> 0x060e }
            X.8OQ r0 = X.C621933y.A00(r9, r4)     // Catch:{ all -> 0x060e }
            X.6aS r1 = r0.keySet()     // Catch:{ all -> 0x060e }
            X.6aS r0 = X.C129526aS.of()     // Catch:{ all -> 0x060e }
            r6.A04(r2, r1, r0, r4)     // Catch:{ all -> 0x060e }
            goto L_0x03e1
        L_0x0401:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0406 }
            goto L_0x040a
        L_0x0406:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x040b }
        L_0x040a:
            throw r1     // Catch:{ all -> 0x040b }
        L_0x040b:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0410 }
            goto L_0x0414
        L_0x0410:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x060e }
        L_0x0414:
            throw r1     // Catch:{ all -> 0x060e }
        L_0x0415:
            X.1hk r2 = r3.A04     // Catch:{ all -> 0x060e }
            java.util.Set r1 = r7.keySet()     // Catch:{ all -> 0x060e }
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x060e }
            r2.A08(r5, r1, r0)     // Catch:{ all -> 0x060e }
            goto L_0x05b0
        L_0x0424:
            if (r18 == 0) goto L_0x0438
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/raw_id or primary public key for own companion device doesn't match in companion mode, device="
            X.C18260x0.A1S(r1, r0, r7)     // Catch:{ all -> 0x060e }
            X.2dy r1 = r6.A07     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "invalid_adv_status"
            r1.A01(r0, r5, r5)     // Catch:{ all -> 0x060e }
            goto L_0x0518
        L_0x0438:
            if (r10 == 0) goto L_0x051b
            if (r15 != 0) goto L_0x044c
            com.whatsapp.jid.UserJid r0 = r7.userJid     // Catch:{ all -> 0x060e }
            X.2ov r0 = X.AnonymousClass36G.A03(r0)     // Catch:{ all -> 0x060e }
            X.2e4 r0 = r11.A08(r0)     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x051b
            X.2jv r0 = r0.A00     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x051b
        L_0x044c:
            r13 = 1
            X.C626936e.A06(r10)     // Catch:{ all -> 0x060e }
            long r8 = r10.A05     // Catch:{ all -> 0x060e }
            long r0 = r2.timestamp_     // Catch:{ all -> 0x060e }
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x051c
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r1 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity has a lower ts, jid="
            r0 = r16
            X.AnonymousClass000.A17(r7, r1, r0, r3)     // Catch:{ all -> 0x060e }
            int r0 = r2.keyIndex_     // Catch:{ all -> 0x060e }
            r3.append(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "; local.rawId="
            r3.append(r0)     // Catch:{ all -> 0x060e }
            int r4 = r10.A01     // Catch:{ all -> 0x060e }
            r3.append(r4)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "; downloaded.rawId="
            r3.append(r0)     // Catch:{ all -> 0x060e }
            int r0 = r2.rawId_     // Catch:{ all -> 0x060e }
            r3.append(r0)     // Catch:{ all -> 0x060e }
            X.AnonymousClass0x2.A19(r3)     // Catch:{ all -> 0x060e }
            X.2pv r3 = r6.A0E     // Catch:{ all -> 0x060e }
            X.C626936e.A06(r10)     // Catch:{ all -> 0x060e }
            long r0 = r2.timestamp_     // Catch:{ all -> 0x060e }
            r12 = r0
            r14 = r15
            r10 = r8
            r9 = r3
            r9.A02(r10, r12, r14)     // Catch:{ all -> 0x060e }
            X.2qk r3 = r6.A01     // Catch:{ all -> 0x060e }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "local timestamp is ahead; ; primaryKeyMatch="
            r6.append(r0)     // Catch:{ all -> 0x060e }
            r6.append(r15)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "; rawIdMatch="
            r6.append(r0)     // Catch:{ all -> 0x060e }
            int r0 = r2.rawId_     // Catch:{ all -> 0x060e }
            int r13 = java.lang.Integer.compare(r4, r0)     // Catch:{ all -> 0x060e }
            goto L_0x050f
        L_0x04a7:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r4 = "DeviceADVInfoManager/processADVIdentity/device has been deleted already, device="
            r3 = r16
            X.AnonymousClass000.A17(r7, r4, r3, r8)     // Catch:{ all -> 0x060e }
            int r3 = r2.keyIndex_     // Catch:{ all -> 0x060e }
            r8.append(r3)     // Catch:{ all -> 0x060e }
            java.lang.String r3 = "; localTs="
            r8.append(r3)     // Catch:{ all -> 0x060e }
            r8.append(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r3 = "; remoteTs="
            r8.append(r3)     // Catch:{ all -> 0x060e }
            long r3 = r2.timestamp_     // Catch:{ all -> 0x060e }
            r8.append(r3)     // Catch:{ all -> 0x060e }
            java.lang.String r3 = "; atype="
            r8.append(r3)     // Catch:{ all -> 0x060e }
            int r3 = r2.accountType_     // Catch:{ all -> 0x060e }
            X.239 r3 = X.AnonymousClass239.A00(r3)     // Catch:{ all -> 0x060e }
            r8.append(r3)     // Catch:{ all -> 0x060e }
            java.lang.String r3 = "; dtype="
            r8.append(r3)     // Catch:{ all -> 0x060e }
            int r3 = r2.deviceType_     // Catch:{ all -> 0x060e }
            X.239 r3 = X.AnonymousClass239.A00(r3)     // Catch:{ all -> 0x060e }
            X.C18270x1.A17(r3, r8)     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid r3 = r7.userJid     // Catch:{ all -> 0x060e }
            r6.A0A(r3, r0)     // Catch:{ all -> 0x060e }
            X.2pv r7 = r6.A0E     // Catch:{ all -> 0x060e }
            long r3 = r2.timestamp_     // Catch:{ all -> 0x060e }
            r8 = r0
            r10 = r3
            r12 = r5
            r7.A02(r8, r10, r12)     // Catch:{ all -> 0x060e }
            X.2qk r3 = r6.A01     // Catch:{ all -> 0x060e }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "Not existing device; isLocalTimestampIsAhead="
            r6.append(r0)     // Catch:{ all -> 0x060e }
            int r1 = r2.rawId_     // Catch:{ all -> 0x060e }
            r0 = r20
            int r0 = java.lang.Integer.compare(r0, r1)     // Catch:{ all -> 0x060e }
            r6.append(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "; proto="
            r6.append(r0)     // Catch:{ all -> 0x060e }
        L_0x050f:
            java.lang.String r1 = X.AnonymousClass000.A0h(r6, r13)     // Catch:{ all -> 0x060e }
            r0 = r17
            r3.A0A(r0, r5, r1)     // Catch:{ all -> 0x060e }
        L_0x0518:
            r0 = 0
            goto L_0x05b1
        L_0x051b:
            r13 = 0
        L_0x051c:
            com.whatsapp.jid.UserJid r8 = r7.userJid     // Catch:{ all -> 0x060e }
            X.2ov r1 = X.AnonymousClass36G.A03(r8)     // Catch:{ all -> 0x060e }
            X.2e4 r0 = new X.2e4     // Catch:{ all -> 0x060e }
            r0.<init>(r14)     // Catch:{ all -> 0x060e }
            r11.A0M(r0, r1)     // Catch:{ all -> 0x060e }
            r32 = 0
            if (r13 == 0) goto L_0x0538
            long r30 = r3.A02(r8)     // Catch:{ all -> 0x060e }
            int r0 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r0 <= 0) goto L_0x0538
            r12 = 0
            goto L_0x055b
        L_0x0538:
            X.2sH r0 = r6.A09     // Catch:{ all -> 0x060e }
            long r9 = r0.A0H()     // Catch:{ all -> 0x060e }
            X.1VX r11 = r6.A0H     // Catch:{ all -> 0x060e }
            r1 = 730(0x2da, float:1.023E-42)
            r0 = r19
            int r1 = r11.A0O(r0, r1)     // Catch:{ all -> 0x060e }
            if (r1 >= r5) goto L_0x054b
            r1 = 1
        L_0x054b:
            r0 = 35
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x060e }
            int r0 = r0 - r5
            long r0 = X.AnonymousClass0x7.A0D(r0)     // Catch:{ all -> 0x060e }
            long r30 = X.C18280x3.A08(r9, r0)     // Catch:{ all -> 0x060e }
            r12 = 1
        L_0x055b:
            long r0 = r2.timestamp_     // Catch:{ all -> 0x060e }
            int r9 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1))
            r11 = 1
            if (r9 > 0) goto L_0x0565
            r11 = 0
            r0 = 0
        L_0x0565:
            int r9 = r2.accountType_     // Catch:{ all -> 0x060e }
            X.239 r9 = X.AnonymousClass239.A00(r9)     // Catch:{ all -> 0x060e }
            int r29 = X.C60212yB.A00(r9)     // Catch:{ all -> 0x060e }
            int r10 = r2.rawId_     // Catch:{ all -> 0x060e }
            X.2yB r9 = new X.2yB     // Catch:{ all -> 0x060e }
            r36 = r32
            r34 = r32
            r27 = r9
            r28 = r10
            r27.<init>(r28, r29, r30, r32, r34, r36)     // Catch:{ all -> 0x060e }
            X.2yB r10 = r3.A06(r9, r0)     // Catch:{ all -> 0x060e }
            X.7o6 r9 = new X.7o6     // Catch:{ all -> 0x060e }
            r9.<init>()     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.DeviceJid r1 = r8.getPrimaryDevice()     // Catch:{ all -> 0x060e }
            java.lang.Long r0 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x060e }
            r9.put(r1, r0)     // Catch:{ all -> 0x060e }
            int r0 = r2.keyIndex_     // Catch:{ all -> 0x060e }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x060e }
            r9.put(r7, r0)     // Catch:{ all -> 0x060e }
            X.8OQ r0 = r9.build()     // Catch:{ all -> 0x060e }
            r3.A0I(r0, r10, r8, r4)     // Catch:{ all -> 0x060e }
            if (r11 != 0) goto L_0x05a6
            if (r12 == 0) goto L_0x05b0
        L_0x05a6:
            X.3Cp r2 = r6.A08     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r5]     // Catch:{ all -> 0x060e }
            r1[r4] = r8     // Catch:{ all -> 0x060e }
            r0 = 3
            r2.A01(r1, r0)     // Catch:{ all -> 0x060e }
        L_0x05b0:
            r0 = 1
        L_0x05b1:
            if (r26 == 0) goto L_0x05b6
            r26.close()
        L_0x05b6:
            return r0
        L_0x05b7:
            X.3Ln r1 = r6.A0F     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.UserJid r0 = r7.userJid     // Catch:{ all -> 0x060e }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x060e }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x060e }
            r1.A01(r0)     // Catch:{ all -> 0x060e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/no primary key, jid="
            X.C18260x0.A1Q(r1, r0, r7)     // Catch:{ all -> 0x060e }
            X.2pv r2 = r6.A0E     // Catch:{ all -> 0x060e }
            X.1Vw r1 = new X.1Vw     // Catch:{ all -> 0x060e }
            r1.<init>()     // Catch:{ all -> 0x060e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x060e }
            r1.A00 = r0     // Catch:{ all -> 0x060e }
            X.4FV r0 = r2.A00     // Catch:{ all -> 0x060e }
            r0.BhD(r1)     // Catch:{ all -> 0x060e }
            goto L_0x0602
        L_0x05e2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity invalidProto:"
            X.C18260x0.A16(r0, r1, r2)     // Catch:{ all -> 0x060e }
            X.2pv r1 = r6.A0E     // Catch:{ all -> 0x060e }
            r0 = 2
            r1.A00(r0)     // Catch:{ all -> 0x060e }
            goto L_0x0602
        L_0x05f3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advSignedDeviceIdentity invalidProto:"
            X.C18260x0.A16(r0, r1, r2)     // Catch:{ all -> 0x060e }
            X.2pv r0 = r6.A0E     // Catch:{ all -> 0x060e }
            r0.A00(r5)     // Catch:{ all -> 0x060e }
        L_0x0602:
            if (r26 == 0) goto L_0x0607
            r26.close()
        L_0x0607:
            return r4
        L_0x0608:
            if (r26 == 0) goto L_0x060d
            r26.close()
        L_0x060d:
            return r5
        L_0x060e:
            r1 = move-exception
            if (r26 == 0) goto L_0x0619
            r26.close()     // Catch:{ all -> 0x0615 }
            throw r1
        L_0x0615:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0619:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33Z.A0C(com.whatsapp.jid.DeviceJid, byte[], byte[], byte, int):boolean");
    }

    public AnonymousClass33Z(C55682qk r2, C56972sr r3, C42112Mv r4, AnonymousClass3H2 r5, AnonymousClass2FM r6, C42712Pf r7, C47872dy r8, C64213Cp r9, C56612sH r10, C621133n r11, C614730x r12, C55332qB r13, C29041iB r14, C55172pv r15, C66463Ln r16, AnonymousClass318 r17, AnonymousClass1VX r18) {
        this.A09 = r10;
        this.A0H = r18;
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = r12;
        this.A08 = r9;
        this.A0A = r11;
        this.A0G = r17;
        this.A05 = r6;
        this.A0F = r16;
        this.A03 = r4;
        this.A0E = r15;
        this.A0C = r13;
        this.A0D = r14;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
    }

    public static byte[] A02(MessageDigest messageDigest, List list) {
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0p.add(((C47932e4) it.next()).A00.A01);
        }
        Collections.sort(A0p, new C71853cm());
        Iterator it2 = A0p.iterator();
        while (it2.hasNext()) {
            messageDigest.update((byte[]) it2.next());
        }
        return messageDigest.digest();
    }

    public final C172548Lq A04(AnonymousClass8OQ r10, UserJid userJid, Map map, Set set) {
        HashSet A0K = AnonymousClass002.A0K();
        boolean z = true;
        if (r10.size() > 1) {
            boolean A0a = this.A02.A0a(userJid);
            ArrayList A0s = AnonymousClass001.A0s();
            C172878Nf A0M = C18310x6.A0M(r10);
            while (true) {
                if (A0M.hasNext()) {
                    DeviceJid A0Q = AnonymousClass0x9.A0Q(AnonymousClass001.A0w(A0M));
                    Object obj = map.get(AnonymousClass36G.A02(A0Q));
                    if (obj == null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                        A0o.append(A0Q);
                        Log.w(AnonymousClass000.A0b("; isMe=", A0o, A0a));
                        if (A0a) {
                            break;
                        }
                        A0K.add(A0Q);
                    } else {
                        A0s.add(obj);
                    }
                } else {
                    z = false;
                    if (!A0s.isEmpty()) {
                        if (!A0K.isEmpty() && !A0a) {
                            C172878Nf A0M2 = C18310x6.A0M(r10);
                            while (A0M2.hasNext()) {
                                Map.Entry A0w = AnonymousClass001.A0w(A0M2);
                                if (!A0K.contains(A0w.getKey())) {
                                    set.add(Integer.valueOf(AnonymousClass0x2.A08(A0w)));
                                }
                            }
                        }
                        try {
                            byte[] A022 = A02(AnonymousClass0x7.A0t(), A0s);
                            int A0O = this.A0H.A0O(C58422vE.A02, 310);
                            byte[] bArr = new byte[A0O];
                            System.arraycopy(A022, 0, bArr, 0, A0O);
                            return C172548Lq.A02(bArr, 0, A0O);
                        } catch (NoSuchAlgorithmException e) {
                            Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
                            this.A0E.A04(false);
                            return null;
                        }
                    }
                }
            }
            this.A0E.A04(z);
        }
        return null;
    }

    public Map A07(List list, Map map, Map map2, int i) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map2);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            DeviceJid A0Q = AnonymousClass0x9.A0Q(A0w);
            Number number = (Number) A0w.getValue();
            if (AnonymousClass000.A1T(A0Q.getDevice()) || AnonymousClass0x7.A1U(list, number.intValue())) {
                A0t.put(A0Q, number);
            } else {
                C55172pv r0 = this.A0E;
                r0.A00.BhD(new C23821Va());
            }
        }
        Iterator A0q2 = AnonymousClass000.A0q(map);
        while (A0q2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
            Object key = A0w2.getKey();
            Number number2 = (Number) A0w2.getValue();
            long longValue = number2.longValue();
            if (longValue <= ((long) i)) {
                if (map2.containsKey(key) && C18290x4.A0C(key, map2) < longValue && AnonymousClass0x7.A1U(list, number2.intValue())) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map, jid=");
                    A0o.append(key);
                    C18260x0.A1R(A0o, "; index=", number2);
                }
            }
            A0t.put(key, number2);
        }
        return A0t;
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [X.2Ss] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A08(java.util.Set r38, boolean r39) {
        /*
            r37 = this;
            java.util.HashMap r24 = X.AnonymousClass001.A0t()
            boolean r0 = r38.isEmpty()
            if (r0 != 0) goto L_0x0350
            r8 = r37
            X.2sr r0 = r8.A02
            r36 = r0
            if (r39 == 0) goto L_0x0052
            X.1fH r7 = r36.A0I()
        L_0x0016:
            java.util.HashSet r6 = X.AnonymousClass0x9.A15(r38)
            r6.add(r7)
            X.318 r13 = r8.A0G
            int r0 = r6.size()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>(r0)
            java.util.HashSet r23 = X.AnonymousClass002.A0K()
            java.util.Iterator r2 = r6.iterator()
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.2sr r0 = r13.A01
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x004a
            X.2yB r0 = r13.A05()
            r11.put(r1, r0)
            goto L_0x0030
        L_0x004a:
            if (r1 == 0) goto L_0x0030
            r0 = r23
            r0.add(r1)
            goto L_0x0030
        L_0x0052:
            com.whatsapp.jid.PhoneUserJid r7 = X.C56972sr.A05(r36)
            goto L_0x0016
        L_0x0057:
            X.2s7 r10 = r13.A05
            java.util.Iterator r2 = r23.iterator()
        L_0x005d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.2sr r0 = r10.A00
            boolean r0 = r0.A0a(r1)
            r1 = r0 ^ 1
            java.lang.String r0 = "only query info for others"
            X.C626936e.A0F(r1, r0)
            goto L_0x005d
        L_0x0076:
            X.2p4 r5 = r10.A02
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r23)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.lang.Object r3 = r5.A02
            monitor-enter(r3)
            java.util.Iterator r12 = r23.iterator()     // Catch:{ all -> 0x034d }
        L_0x0087:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x00a6
            com.whatsapp.jid.UserJid r9 = X.C18310x6.A0T(r12)     // Catch:{ all -> 0x034d }
            java.util.Map r2 = r5.A03     // Catch:{ all -> 0x034d }
            boolean r0 = r2.containsKey(r9)     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x034d }
            X.2yB r0 = (X.C60212yB) r0     // Catch:{ all -> 0x034d }
            r4.put(r9, r0)     // Catch:{ all -> 0x034d }
            r1.remove(r9)     // Catch:{ all -> 0x034d }
            goto L_0x0087
        L_0x00a6:
            monitor-exit(r3)     // Catch:{ all -> 0x034d }
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01a0
            int r0 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            java.util.Iterator r15 = r1.iterator()
            r14 = 0
        L_0x00bc:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d3
            com.whatsapp.jid.Jid r1 = X.AnonymousClass0x7.A0S(r15)
            int r12 = r14 + 1
            X.34p r0 = r5.A00
            long r0 = r0.A05(r1)
            X.AnonymousClass0x2.A1S(r2, r14, r0)
            r14 = r12
            goto L_0x00bc
        L_0x00d3:
            X.3dV r0 = r5.A01
            X.4GK r22 = r0.get()
            r1 = 975(0x3cf, float:1.366E-42)
            X.3ct r21 = new X.3ct     // Catch:{ all -> 0x0196 }
            r0 = r21
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0196 }
        L_0x00e2:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x0188
            java.lang.String[] r12 = X.C71923ct.A01(r21)     // Catch:{ all -> 0x0196 }
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0196 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0196 }
            int r14 = r12.length     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type, user_jid_row_id FROM user_device_info WHERE user_jid_row_id IN "
            X.C57212tH.A02(r0, r1, r14)     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = "GET_USERS_DEVICE_INFO_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r12)     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = "raw_id"
            int r20 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "timestamp"
            int r19 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "expected_timestamp"
            int r18 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "expected_ts_last_device_job_ts"
            int r17 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "expected_timestamp_update_ts"
            int r16 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "account_encryption_type"
            int r12 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017c }
        L_0x012c:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0177
            X.34p r15 = r5.A00     // Catch:{ all -> 0x017c }
            java.lang.Class<com.whatsapp.jid.UserJid> r14 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "user_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x017c }
            com.whatsapp.jid.UserJid r1 = X.C623334p.A02(r15, r14, r0)     // Catch:{ all -> 0x017c }
            boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x014a
            r27 = 0
            goto L_0x014e
        L_0x014a:
            int r27 = r2.getInt(r12)     // Catch:{ all -> 0x017c }
        L_0x014e:
            r0 = r20
            int r26 = r2.getInt(r0)     // Catch:{ all -> 0x017c }
            r0 = r19
            long r28 = r2.getLong(r0)     // Catch:{ all -> 0x017c }
            r0 = r18
            long r30 = r2.getLong(r0)     // Catch:{ all -> 0x017c }
            r0 = r17
            long r32 = r2.getLong(r0)     // Catch:{ all -> 0x017c }
            r0 = r16
            long r34 = r2.getLong(r0)     // Catch:{ all -> 0x017c }
            X.2yB r0 = new X.2yB     // Catch:{ all -> 0x017c }
            r25 = r0
            r25.<init>(r26, r27, r28, r30, r32, r34)     // Catch:{ all -> 0x017c }
            r9.put(r1, r0)     // Catch:{ all -> 0x017c }
            goto L_0x012c
        L_0x0177:
            r2.close()     // Catch:{ all -> 0x0196 }
            goto L_0x00e2
        L_0x017c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0187
            r2.close()     // Catch:{ all -> 0x0183 }
            goto L_0x0187
        L_0x0183:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0196 }
        L_0x0187:
            throw r1     // Catch:{ all -> 0x0196 }
        L_0x0188:
            r22.close()
            monitor-enter(r3)
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0193 }
            r0.putAll(r9)     // Catch:{ all -> 0x0193 }
            monitor-exit(r3)     // Catch:{ all -> 0x0193 }
            goto L_0x01a0
        L_0x0193:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0193 }
            throw r0
        L_0x0196:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x019b }
            throw r1
        L_0x019b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01a0:
            r4.putAll(r9)
            java.util.Iterator r2 = r23.iterator()
        L_0x01a7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L_0x01a7
            r0 = 0
            r4.put(r1, r0)
            goto L_0x01a7
        L_0x01bc:
            r11.putAll(r4)
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            X.2sr r0 = r13.A01
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)
            boolean r0 = r6.contains(r1)
            if (r0 == 0) goto L_0x01dd
            java.util.HashSet r6 = X.AnonymousClass0x9.A15(r6)
            r6.remove(r1)
            X.8OQ r0 = r13.A03()
            r2.put(r1, r0)
        L_0x01dd:
            X.2qL r0 = r10.A05
            java.util.Map r0 = r0.A00(r6)
            r2.putAll(r0)
            java.util.Iterator r5 = X.AnonymousClass001.A0u(r2)
        L_0x01ea:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0223
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r5)
            com.whatsapp.jid.UserJid r4 = X.C18320x8.A0P(r0)
            java.lang.Object r1 = r0.getValue()
            X.8OQ r1 = (X.AnonymousClass8OQ) r1
            com.whatsapp.jid.DeviceJid r0 = r4.getPrimaryDevice()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x01ea
            X.7o6 r3 = new X.7o6
            r3.<init>()
            r3.putAll((java.util.Map) r1)
            com.whatsapp.jid.DeviceJid r1 = r4.getPrimaryDevice()
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()
            r3.put(r1, r0)
            X.8OQ r0 = r3.build()
            r2.put(r4, r0)
            goto L_0x01ea
        L_0x0223:
            int r0 = r2.size()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r0)
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            java.util.Iterator r9 = X.AnonymousClass001.A0u(r2)
        L_0x0234:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0285
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r0 = r4.getValue()
            X.8OQ r0 = (X.AnonymousClass8OQ) r0
            int r5 = r0.size()
            java.lang.Object r0 = r4.getValue()
            X.8OQ r0 = (X.AnonymousClass8OQ) r0
            X.6aS r0 = r0.keySet()
            X.8Nf r6 = r0.iterator()
        L_0x0256:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0234
            com.whatsapp.jid.DeviceJid r4 = X.AnonymousClass0x7.A0R(r6)
            r0 = r36
            boolean r0 = r0.A0c(r4)
            if (r0 == 0) goto L_0x027a
            X.2ov r4 = X.AnonymousClass36G.A02(r4)
            X.33n r0 = r8.A0A
            X.35n r0 = r0.A00
            X.2KK r0 = r0.A04()
            X.2e4 r0 = r0.A01
            r3.put(r4, r0)
            goto L_0x0256
        L_0x027a:
            r0 = 1
            if (r5 <= r0) goto L_0x0256
            X.2ov r0 = X.AnonymousClass36G.A02(r4)
            r1.add(r0)
            goto L_0x0256
        L_0x0285:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0294
            X.33n r0 = r8.A0A
            java.util.Map r0 = r0.A0G(r1)
            r3.putAll(r0)
        L_0x0294:
            java.lang.Object r1 = X.C18290x4.A0i(r7, r2)
            X.8OQ r1 = (X.AnonymousClass8OQ) r1
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            X.8Lq r26 = r8.A04(r1, r7, r3, r0)
            java.lang.Object r0 = r11.get(r7)
            X.2yB r0 = (X.C60212yB) r0
            r31 = 0
            if (r0 != 0) goto L_0x0349
            r0 = 0
        L_0x02ae:
            if (r26 != 0) goto L_0x02bd
            long r9 = A00(r8, r0)
            r5 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x02bf
        L_0x02bd:
            r31 = r0
        L_0x02bf:
            java.util.Iterator r12 = r38.iterator()
        L_0x02c3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0350
            com.whatsapp.jid.UserJid r4 = X.C18310x6.A0T(r12)
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            r0 = r36
            boolean r1 = r0.A0a(r4)
            r5 = 0
            if (r1 == 0) goto L_0x033e
            r27 = r5
        L_0x02dc:
            r16 = 0
            if (r1 == 0) goto L_0x031d
            r33 = 0
        L_0x02e2:
            if (r26 != 0) goto L_0x02ee
            int r0 = (r31 > r16 ? 1 : (r31 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x02ee
            if (r27 != 0) goto L_0x02ee
            int r0 = (r33 > r16 ? 1 : (r33 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0314
        L_0x02ee:
            X.239 r28 = X.AnonymousClass239.E2EE
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x02f7
            r5 = r6
        L_0x02f7:
            X.2yB r1 = r13.A07(r4)
            r0 = r36
            boolean r0 = r0.A0a(r4)
            if (r0 != 0) goto L_0x031a
            if (r1 == 0) goto L_0x031a
            int r0 = r1.A00
            if (r0 == 0) goto L_0x031a
            X.239 r29 = X.AnonymousClass239.HOSTED
        L_0x030b:
            X.2Ss r25 = new X.2Ss
            r30 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r33)
            r5 = r25
        L_0x0314:
            r0 = r24
            r0.put(r4, r5)
            goto L_0x02c3
        L_0x031a:
            r29 = 0
            goto L_0x030b
        L_0x031d:
            java.lang.Object r0 = r11.get(r4)
            X.2yB r0 = (X.C60212yB) r0
            r33 = 0
            if (r0 != 0) goto L_0x033b
            r0 = 0
        L_0x0329:
            if (r27 != 0) goto L_0x0338
            long r14 = A00(r8, r0)
            r9 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r7 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x02e2
        L_0x0338:
            r33 = r0
            goto L_0x02e2
        L_0x033b:
            long r0 = r0.A05
            goto L_0x0329
        L_0x033e:
            java.lang.Object r0 = X.C18290x4.A0i(r4, r2)
            X.8OQ r0 = (X.AnonymousClass8OQ) r0
            X.8Lq r27 = r8.A04(r0, r4, r3, r6)
            goto L_0x02dc
        L_0x0349:
            long r0 = r0.A05
            goto L_0x02ae
        L_0x034d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x034d }
            throw r0
        L_0x0350:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33Z.A08(java.util.Set, boolean):java.util.Map");
    }

    public void A09(DeviceJid deviceJid, boolean z) {
        C626936e.A0C(AnonymousClass0x9.A1P(deviceJid));
        C73523fe A002 = C614730x.A00(AnonymousClass36G.A03(deviceJid.userJid), this.A0B);
        if (z) {
            try {
                if (this.A02.A0b(deviceJid)) {
                    Log.e("DeviceADVInfoHandler/onCompanionDeviceVerificationFail logout");
                    this.A0D.A0I(deviceJid, "unknown_companion", false, false);
                } else {
                    this.A0G.A0E(C129526aS.of(deviceJid), deviceJid.userJid, (String) null);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        if (A002 != null) {
            A002.close();
        }
        this.A0C.A05(Collections.singleton(deviceJid));
        Iterator A11 = C18290x4.A11(this.A00);
        if (A11.hasNext()) {
            A11.next();
            throw AnonymousClass001.A0g("onCompanionDeviceVerificationFail");
        }
    }
}
