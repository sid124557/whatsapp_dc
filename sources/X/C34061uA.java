package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1uA  reason: invalid class name and case insensitive filesystem */
public class C34061uA extends AnonymousClass5ZM {
    public Set A00;
    public Set A01;
    public final UserJid A02;
    public final WeakReference A03;
    public final /* synthetic */ C43622Sv A04;

    public C34061uA(AnonymousClass4D4 r2, C43622Sv r3, UserJid userJid) {
        this.A04 = r3;
        this.A02 = userJid;
        this.A03 = AnonymousClass0x9.A14(r2);
    }

    public static String A00(String str, List list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            byte[] A022 = A02(list);
            byte[][] bArr = new byte[3][];
            byte[] bArr2 = new byte[2];
            byte b = (byte) 0;
            bArr2[1] = b;
            bArr2[0] = b;
            bArr[0] = bArr2;
            bArr[1] = A022;
            byte[] A042 = AnonymousClass36A.A04(str.getBytes(), bArr, 2);
            for (int i = 0; i < 5200; i++) {
                instance.update(A042);
                A042 = instance.digest(A022);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A01(A042, 0));
            A0o.append(A01(A042, 5));
            A0o.append(A01(A042, 10));
            A0o.append(A01(A042, 15));
            A0o.append(A01(A042, 20));
            return AnonymousClass000.A0X(A01(A042, 25), A0o);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static String A01(byte[] bArr, int i) {
        long j = ((long) bArr[i + 4]) & 255;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L, 0, (j | (((((((long) bArr[i]) & 255) << 32) | ((((long) bArr[i + 1]) & 255) << 24)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 8))) % 100000);
        return String.format("%05d", A0L);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C27981fH r1;
        PhoneUserJid A022;
        String rawString;
        String rawString2;
        String rawString3;
        String str;
        Boolean A012;
        C48482ey r4;
        UserJid userJid = this.A02;
        if (userJid == null) {
            return null;
        }
        C43622Sv r9 = this.A04;
        AnonymousClass318 r10 = r9.A05;
        Set A0D = r10.A0D(userJid);
        this.A01 = A0D;
        C49022fr r8 = r9.A04;
        Map A002 = r8.A00(A0D);
        C48482ey r2 = null;
        if (A002.isEmpty() || this.A01.size() != A002.size()) {
            return null;
        }
        this.A00 = r10.A04();
        C56972sr r11 = r9.A00;
        PhoneUserJid A05 = C56972sr.A05(r11);
        C54562ov A032 = AnonymousClass36G.A03(userJid);
        Collection<C47932e4> values = A002.values();
        ArrayList A0s = AnonymousClass001.A0s();
        for (C47932e4 r0 : values) {
            A0s.add(r0.A00);
        }
        ArrayList A0J = AnonymousClass002.A0J(A0s);
        if ((userJid instanceof C27981fH) || (userJid instanceof PhoneUserJid)) {
            C27981fH A0H = r11.A0H();
            boolean z = userJid instanceof PhoneUserJid;
            if (z) {
                A022 = (PhoneUserJid) userJid;
                r1 = r9.A02.A01(A022);
            } else {
                C27981fH r5 = (C27981fH) userJid;
                r1 = r5;
                A022 = r9.A02.A02(r5);
            }
            C621133n r7 = r9.A01;
            ArrayList A0s2 = AnonymousClass001.A0s();
            byte[] bArr = r7.A07.A02().A01;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
            C626936e.A06(copyOfRange);
            A0s2.add(new C47932e4(new C51502jv(copyOfRange, (byte) 5)).A00);
            Iterator A0v = AnonymousClass001.A0v(r8.A00(r10.A04()));
            while (A0v.hasNext()) {
                A0s2.add(((C47932e4) A0v.next()).A00);
            }
            if (!z && (r1 == null || (A012 = r9.A03.A01(r1)) == null || !A012.booleanValue())) {
                A05 = null;
            }
            C45872ai r02 = r7.A01;
            List A003 = r02.A00(A0s2);
            if (A003 == null) {
                str = "wamsys/generateFingerprint/local-identity-key-conversion-failed";
            } else {
                List A004 = r02.A00(A0J);
                if (A004 == null) {
                    str = "wamsys/generateFingerprint/remote-identity-key-conversion-failed";
                } else {
                    Object A0r = AnonymousClass0x9.A0r(r02.A03);
                    String str2 = null;
                    if (A05 == null) {
                        rawString = null;
                    } else {
                        rawString = A05.getRawString();
                    }
                    if (A022 == null) {
                        rawString2 = null;
                    } else {
                        rawString2 = A022.getRawString();
                    }
                    if (A0H == null) {
                        rawString3 = null;
                    } else {
                        rawString3 = A0H.getRawString();
                    }
                    if (r1 != null) {
                        str2 = r1.getRawString();
                    }
                    NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOOOOO(0, A0r, A003, A004, rawString, rawString2, rawString3, str2);
                    if (nativeHolder == null) {
                        str = "wamsys/generateFingerprint/create-fingerprint-failed";
                    } else {
                        NativeHolder nativeHolder2 = (NativeHolder) JniBridge.jvidispatchOO(4, nativeHolder);
                        if (nativeHolder2 != null) {
                            C40982Im r03 = new C40982Im(nativeHolder2);
                            try {
                                JniBridge.getInstance();
                                NativeHolder nativeHolder3 = r03.A00;
                                String str3 = (String) JniBridge.jvidispatchOIO(2, (long) 59, nativeHolder3);
                                JniBridge.getInstance();
                                String str4 = (String) JniBridge.jvidispatchOIO(2, (long) 60, nativeHolder3);
                                if (!(str3 == null || str4 == null)) {
                                    r2 = new C48482ey(str3, str4);
                                }
                                JniBridge.getInstance();
                                AnonymousClass2NZ r04 = new AnonymousClass2NZ(r2, (AnonymousClass1CW) C130786cX.A05(AnonymousClass1CW.DEFAULT_INSTANCE, (byte[]) JniBridge.jvidispatchOIO(0, (long) 58, nativeHolder3)));
                                r04.A00 = nativeHolder;
                                return r04;
                            } catch (AnonymousClass6u5 unused) {
                                Log.e("wamsys/generateFingerprint/protobuf-parsing-failed");
                                return null;
                            }
                        } else {
                            str = "wamsys/generateFingerprint/processing-fingerprints-failed";
                        }
                    }
                }
            }
            Log.e(str);
            return null;
        }
        C621133n r3 = r9.A01;
        String A005 = C386028i.A00(A05.user);
        ArrayList<C51502jv> A0s3 = AnonymousClass001.A0s();
        Iterator A0v2 = AnonymousClass001.A0v(r8.A00(r10.A04()));
        while (A0v2.hasNext()) {
            A0s3.add(((C47932e4) A0v2.next()).A00);
        }
        String A006 = C386028i.A00(A032.A02);
        C625535n r32 = r3.A00;
        ArrayList A0s4 = AnonymousClass001.A0s();
        for (C51502jv r12 : A0s3) {
            A0s4.add(new C47932e4(r12));
        }
        A0s4.add(r32.A04().A01);
        ArrayList A0s5 = AnonymousClass001.A0s();
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            A0s5.add(new C47932e4((C51502jv) it.next()));
        }
        String A007 = A00(A005, A0s4);
        String A008 = A00(A006, A0s5);
        if (A007 == null || A008 == null) {
            r4 = null;
        } else {
            r4 = new C48482ey(A007, A008);
        }
        byte[] A023 = A02(A0s4);
        byte[] A024 = A02(A0s5);
        C130546c9 A0K = C18300x5.A0K(AnonymousClass1CW.DEFAULT_INSTANCE);
        AnonymousClass1CW r22 = (AnonymousClass1CW) A0K.A00;
        r22.bitField0_ |= 1;
        r22.version_ = 0;
        C130546c9 A0G = C21341Bl.DEFAULT_INSTANCE.A0G();
        byte[] bytes = A005.getBytes();
        C172548Lq A0J2 = C18300x5.A0J(A0G, bytes, bytes.length);
        C21341Bl r13 = (C21341Bl) A0G.A00;
        r13.bitField0_ |= 2;
        r13.identifier_ = A0J2;
        C172548Lq A0H2 = C18280x3.A0H(A0G, A023);
        C21341Bl r14 = (C21341Bl) A0G.A00;
        r14.bitField0_ |= 1;
        r14.content_ = A0H2;
        AnonymousClass1CW r15 = (AnonymousClass1CW) C18320x8.A0C(A0K);
        C21341Bl r05 = (C21341Bl) A0G.A06();
        r05.getClass();
        r15.localFingerprint_ = r05;
        r15.bitField0_ |= 2;
        C130546c9 A0G2 = C21341Bl.DEFAULT_INSTANCE.A0G();
        C172548Lq A0H3 = C18280x3.A0H(A0G2, A006.getBytes());
        C21341Bl r16 = (C21341Bl) A0G2.A00;
        r16.bitField0_ |= 2;
        r16.identifier_ = A0H3;
        C172548Lq A0H4 = C18280x3.A0H(A0G2, A024);
        C21341Bl r17 = (C21341Bl) A0G2.A00;
        r17.bitField0_ |= 1;
        r17.content_ = A0H4;
        AnonymousClass1CW r18 = (AnonymousClass1CW) C18320x8.A0C(A0K);
        C21341Bl r06 = (C21341Bl) A0G2.A06();
        r06.getClass();
        r18.remoteFingerprint_ = r06;
        r18.bitField0_ |= 4;
        return new AnonymousClass2NZ(r4, (AnonymousClass1CW) A0K.A06());
    }

    public void A0A() {
        AnonymousClass4D4 r0 = (AnonymousClass4D4) this.A03.get();
        if (r0 != null) {
            r0.BYc();
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass2NZ r4 = (AnonymousClass2NZ) obj;
        AnonymousClass4D4 r2 = (AnonymousClass4D4) this.A03.get();
        if (r2 != null) {
            r2.BTV(r4, this.A00, this.A01);
        }
    }

    public static byte[] A02(List list) {
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0p.add(((C47932e4) it.next()).A00.A00());
        }
        Collections.sort(A0p, new C71853cm());
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        Iterator it2 = A0p.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            A0e.write(bArr, 0, bArr.length);
        }
        return A0e.toByteArray();
    }
}
