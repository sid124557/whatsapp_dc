package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Sx  reason: invalid class name and case insensitive filesystem */
public final class C23401Sx extends C56782sY {
    public int A00;
    public final C56612sH A01;
    public final C54402of A02;
    public final AnonymousClass33p A03;
    public final C46722c6 A04;
    public final C48622fC A05;
    public final C23641Ub A06;
    public final AnonymousClass1VX A07;
    public final LinkedList A08 = AnonymousClass0x9.A18();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23401Sx(X.C56492s4 r11, X.C56612sH r12, X.C54292oU r13, X.C54402of r14, X.AnonymousClass33p r15, X.C46722c6 r16, X.C48622fC r17, X.C23641Ub r18, X.AnonymousClass1VX r19, X.AnonymousClass33K r20, X.C55132pq r21, X.AnonymousClass4FS r22) {
        /*
            r10 = this;
            r4 = r11
            r5 = r13
            r6 = r20
            r7 = r21
            r8 = r22
            X.C18260x0.A0f(r13, r8, r7, r11, r6)
            X.C18260x0.A0U(r15, r14)
            r0 = 10
            r1 = r16
            X.C162457s7.A0J(r1, r0)
            r2 = r19
            X.C18270x1.A13(r12, r2)
            java.lang.Integer r9 = X.C18320x8.A0W()
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.A03 = r15
            r10.A02 = r14
            r0 = r17
            r10.A05 = r0
            r0 = r18
            r10.A06 = r0
            r10.A04 = r1
            r10.A01 = r12
            r10.A07 = r2
            java.util.LinkedList r0 = X.AnonymousClass0x9.A18()
            r10.A08 = r0
            r1 = 3427(0xd63, float:4.802E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            r10.A00 = r0
            r10.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23401Sx.<init>(X.2s4, X.2sH, X.2oU, X.2of, X.33p, X.2c6, X.2fC, X.1Ub, X.1VX, X.33K, X.2pq, X.4FS):void");
    }

    public static final boolean A00(String str, String str2, String str3, byte[] bArr) {
        try {
            byte[] decode = Base64.decode(str2, 2);
            byte[] A1a = AnonymousClass0x2.A1a(str3);
            int length = A1a.length;
            int length2 = bArr.length;
            byte[] copyOf = Arrays.copyOf(A1a, length + length2);
            System.arraycopy(bArr, 0, copyOf, length, length2);
            C162457s7.A0H(copyOf);
            C140256tP r2 = new C140256tP();
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            AnonymousClass35E.A00.B1H(A0e, str);
            C72963ea r1 = new C72963ea(A0e.toByteArray());
            r2.reset();
            r2.write(copyOf, 0, copyOf.length);
            return r2.A00(r1, decode);
        } catch (Exception e) {
            throw new C377924a(AnonymousClass000.A0a("exception decoding Hex string: ", AnonymousClass001.A0o(), e), e);
        } catch (Exception e2) {
            Log.d(AnonymousClass000.A0a("ExtensionsLogger/ExtensionsPslDownloadManager/isSignatureValid() failed. Exception :", AnonymousClass001.A0o(), e2));
            return false;
        }
    }

    public final void A0E() {
        C53462n8 r0;
        LinkedList linkedList = this.A08;
        if (AnonymousClass0x7.A1S(linkedList) && !this.A09 && (r0 = (C53462n8) linkedList.poll()) != null) {
            A0F(r0.A00, r0.A01, r0.A02, r0.A03, r0.A05, r0.A04);
        }
    }

    public final void A0F(C85034Er r20, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str;
        int hashCode = str4.hashCode();
        this.A00 = hashCode;
        C23641Ub r3 = this.A06;
        r3.A09(Integer.valueOf(hashCode), "psl_network_start");
        r3.A05(this.A00, "psl_cache_hit", false);
        String str5 = str2;
        C85034Er r6 = r20;
        boolean z3 = z2;
        if (str5.length() > 0) {
            String str6 = str3;
            boolean z4 = z;
            if (this.A09) {
                this.A08.add(new C53462n8(r6, str4, str5, str6, z4, z3));
            }
            LinkedHashMap A0r = C18320x8.A0r();
            A0r.put("PSL_SIGNATURE", str6);
            A0r.put("EXTENSION_ID", str4);
            AnonymousClass000.A1C("IS_DRAFT", A0r, z4);
            A02(new AnonymousClass3M0(r6, this, str4, z3), (AnonymousClass486) null, str4, str5, (String) null, A0r);
            return;
        }
        int i = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Downloading PSL for extensionId[");
        A0o.append(str4);
        r3.A0C(i, "1", AnonymousClass000.A0X("] skipped since the pslCdnUrl is empty", A0o));
        r3.A09(Integer.valueOf(this.A00), "psl_network_end");
        if (z2) {
            r3.A06(hashCode, 3);
        }
        if (r20 != null) {
            r6.BSD(1);
        }
    }

    public final boolean A0G(Map map, byte[] bArr, boolean z) {
        if (!z) {
            return false;
        }
        C18270x1.A0g(C72333dY.A00(this.A02.A00), "extensions_asset_verification");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C46722c6 r4 = this.A04;
        AnonymousClass2GM r2 = new AnonymousClass2GM(countDownLatch);
        if (!r4.A05.compareAndSet(false, true)) {
            r2.A00.countDown();
        }
        C71343bx.A00(r4.A04, r4, r2, 41);
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.d(AnonymousClass000.A0a("ExtensionsLogger/ExtensionsPslDownloadManager/verifySignature() - Latch timeout. Exception - ", AnonymousClass001.A0o(), e));
        }
        return A0H(map, bArr, false);
    }

    public final boolean A0H(Map map, byte[] bArr, boolean z) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        String str2;
        Long l;
        String str3;
        Object obj4 = null;
        Map map2 = map;
        if (map != null) {
            obj = map2.get("PSL_SIGNATURE");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        if (map != null) {
            obj2 = map2.get("EXTENSION_ID");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
            str4 = str3;
        }
        C23641Ub r8 = this.A06;
        Integer valueOf = Integer.valueOf(this.A00);
        boolean z2 = z;
        if (z) {
            r8.A09(valueOf, "psl_signature_verify_start");
        } else {
            r8.A09(valueOf, "psl_signature_verify_start_1");
        }
        if (this.A07.A0Y(C58422vE.A02, 3521)) {
            if (map != null) {
                obj3 = map2.get("IS_DRAFT");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Boolean) {
                obj4 = obj3;
            }
            if (!AnonymousClass0x9.A1Q(obj4)) {
                byte[] bArr2 = bArr;
                if (bArr == null) {
                    r8.A0C(this.A00, "2", "Payload is null");
                    r8.A04(this.A00, "psl_signature_verify_result", "psl_signature_verify_failed");
                    C56672sN.A01(r8, "psl_signature_verify_end", this.A00);
                    return false;
                }
                C60732z4 A002 = C60732z4.A03.A00(C18280x3.A0Z((SharedPreferences) this.A02.A00.get(), "extensions_asset_verification"));
                if (A002 == null) {
                    return A0G(map2, bArr2, z2);
                }
                if (A00(A002.A02, str, str4, bArr2) || ((str2 = A002.A01) != null && (l = A002.A00) != null && l.longValue() > System.currentTimeMillis() && A00(str2, str, str4, bArr2))) {
                    r8.A04(this.A00, "psl_signature_verify_result", "psl_signature_verify_success");
                    C56672sN.A01(r8, "psl_signature_verify_end", this.A00);
                    return true;
                }
                boolean A0G = A0G(map2, bArr2, z2);
                int i = this.A00;
                if (A0G) {
                    r8.A04(i, "psl_signature_verify_result", "psl_signature_verify_success");
                    C56672sN.A01(r8, "psl_signature_verify_end", this.A00);
                } else {
                    r8.A0C(i, "2", "Signature Verification Failed");
                    r8.A04(this.A00, "psl_signature_verify_result", "psl_signature_verify_failed");
                }
                C56672sN.A01(r8, "psl_signature_verify_end", this.A00);
                return A0G;
            }
        }
        r8.A04(this.A00, "psl_signature_verify_result", "psl_signature_verify_skipped");
        C56672sN.A01(r8, "psl_signature_verify_end", this.A00);
        return true;
    }
}
