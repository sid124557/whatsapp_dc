package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2qg  reason: invalid class name and case insensitive filesystem */
public class C55642qg {
    public C48932fi A00;
    public AnonymousClass3TC A01;
    public final C55682qk A02;
    public final C69263Wi A03;
    public final C55872r3 A04;
    public final C44292Vm A05 = new C44292Vm(this);
    public final C42712Pf A06;
    public final AnonymousClass2NK A07;
    public final C68413Tb A08;
    public final C28941i1 A09;
    public final C65203Gp A0A;
    public final C64663Ek A0B;
    public final C56612sH A0C;
    public final AnonymousClass33p A0D;
    public final C29041iB A0E;
    public final AnonymousClass31C A0F;
    public final AnonymousClass4FK A0G;
    public final AnonymousClass2IN A0H;
    public final AnonymousClass4FS A0I;

    public static void A00(C55642qg r1) {
        AnonymousClass3TC r12 = r1.A01;
        if (r12 != null) {
            r12.A03 = false;
        }
    }

    public void A02() {
        C382626p r1 = (C382626p) this.A0G;
        if (r1.A01 != 0) {
            Log.i("QrScannerActivity/onDevicePairingRequested");
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) r1.A00;
            devicePairQrScannerActivity.Bp9(R.string.f11nameremoved);
            Runnable runnable = devicePairQrScannerActivity.A0E;
            if (runnable != null) {
                devicePairQrScannerActivity.A00.removeCallbacks(runnable);
            }
            View view = devicePairQrScannerActivity.A00;
            Runnable runnable2 = devicePairQrScannerActivity.A0E;
            if (runnable2 == null) {
                runnable2 = new C71273bq((Object) devicePairQrScannerActivity, 41);
                devicePairQrScannerActivity.A0E = runnable2;
            }
            view.postDelayed(runnable2, DevicePairQrScannerActivity.A0K);
            devicePairQrScannerActivity.A0D.A00(0);
        } else {
            Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onDevicePairingRequested");
        }
        C56612sH r4 = this.A0C;
        C69263Wi r2 = this.A03;
        this.A01 = new AnonymousClass3TC(this.A02, r2, this.A05, r4, this.A0F);
    }

    public void A03(AnonymousClass2S3 r6) {
        if (this.A04.A00() == -1) {
            Log.e("CompanionDeviceQrHandler/startPairDevice invalid local ts");
            this.A0G.BUi();
            return;
        }
        A02();
        C70193a6.A01(this.A0I, this, r6, 19);
    }

    public final void A04(AnonymousClass2S3 r22, AnonymousClass239 r23, long j, boolean z) {
        AnonymousClass2KK r2;
        Throwable th;
        byte[] bArr;
        AnonymousClass33p r24 = this.A0D;
        int A032 = C18310x6.A03(AnonymousClass0x2.A0F(r24), "adv_raw_id");
        int A033 = C18310x6.A03(AnonymousClass0x2.A0F(r24), "adv_current_key_index");
        C55872r3 r4 = this.A04;
        AnonymousClass2S3 r15 = r22;
        AnonymousClass239 r8 = r15.A01;
        C130546c9 A0K = C18300x5.A0K(AnonymousClass1D3.DEFAULT_INSTANCE);
        AnonymousClass1D3 r1 = (AnonymousClass1D3) A0K.A00;
        r1.bitField0_ |= 1;
        r1.rawId_ = A032;
        AnonymousClass1D3 r12 = (AnonymousClass1D3) C18320x8.A0C(A0K);
        r12.bitField0_ |= 4;
        r12.keyIndex_ = A033;
        AnonymousClass1D3 r25 = (AnonymousClass1D3) C18320x8.A0C(A0K);
        r25.bitField0_ |= 2;
        long j2 = j;
        r25.timestamp_ = j2;
        AnonymousClass239 r10 = AnonymousClass239.HOSTED;
        AnonymousClass1D3 r3 = (AnonymousClass1D3) C18320x8.A0C(A0K);
        r3.deviceType_ = r8.value;
        r3.bitField0_ |= 16;
        AnonymousClass1D3 r32 = (AnonymousClass1D3) C18320x8.A0C(A0K);
        AnonymousClass239 r14 = r23;
        r32.accountType_ = r14.value;
        r32.bitField0_ |= 8;
        AnonymousClass1D3 r33 = (AnonymousClass1D3) A0K.A06();
        try {
            C47932e4 r26 = r15.A00;
            C626936e.A06(r26);
            byte[] bArr2 = r26.A00.A01;
            C621133n r82 = r4.A03;
            if (r82.A0X()) {
                r2 = r82.A00.A04();
            } else {
                C48972fm r7 = r4.A04;
                Objects.requireNonNull(r82);
                r2 = (AnonymousClass2KK) C48972fm.A00(r7, r82, 1);
            }
            C626936e.A06(r2);
            C48462ew r11 = r2.A00;
            C51502jv r122 = r2.A01.A00;
            byte[] bArr3 = C58152un.A0F;
            int i = r33.deviceType_;
            if (i == 0 || i != 1) {
                byte[][] bArr4 = new byte[3][];
                C18260x0.A0i(bArr3, r33.A0F(), bArr2, bArr4);
                byte[] A062 = AnonymousClass36A.A06(bArr4);
                AnonymousClass15i r83 = (AnonymousClass15i) C21541Cf.DEFAULT_INSTANCE.A0G();
                C172548Lq Bql = r33.Bql();
                C21541Cf r34 = (C21541Cf) C18320x8.A0C(r83);
                r34.bitField0_ |= 1;
                r34.details_ = Bql;
                byte[] bArr5 = r122.A01;
                C172548Lq A0J = C18300x5.A0J(r83, bArr5, bArr5.length);
                C21541Cf r35 = (C21541Cf) r83.A00;
                r35.bitField0_ |= 2;
                r35.accountSignatureKey_ = A0J;
                C172548Lq A0H2 = C18280x3.A0H(r83, AnonymousClass36G.A09(r11, A062));
                C21541Cf r36 = (C21541Cf) r83.A00;
                r36.bitField0_ |= 4;
                r36.accountSignature_ = A0H2;
                C21541Cf r84 = (C21541Cf) r83.A06();
                byte[] bArr6 = r15.A04;
                C626936e.A06(bArr6);
                if (r14 == r10) {
                    byte[][] bArr7 = new byte[2][];
                    bArr7[0] = C58152un.A0G;
                    bArr = AnonymousClass36A.A04(r84.A0F(), bArr7, 1);
                } else {
                    bArr = r84.A0F();
                }
                try {
                    byte[] A002 = C380825n.A00(bArr, bArr6);
                    AnonymousClass15j r72 = (AnonymousClass15j) C21441Bv.DEFAULT_INSTANCE.A0G();
                    C172548Lq Bql2 = r84.Bql();
                    C21441Bv r37 = (C21441Bv) C18320x8.A0C(r72);
                    r37.bitField0_ |= 1;
                    r37.details_ = Bql2;
                    C172548Lq A0H3 = C18280x3.A0H(r72, A002);
                    C21441Bv r38 = (C21441Bv) r72.A00;
                    r38.bitField0_ |= 2;
                    r38.hmac_ = A0H3;
                    C21441Bv r39 = (C21441Bv) C18320x8.A0C(r72);
                    r39.accountType_ = r14.value;
                    r39.bitField0_ |= 4;
                    AnonymousClass1DS A012 = r4.A01(r14, A032, A033, j2);
                    this.A03.A0S(new C70923bH(this, r14, r15, A012, (C21441Bv) r72.A06(), r4.A02(A012), 0, z));
                } catch (Exception e) {
                    th = new RuntimeException("Failed to calculate hmac-sha256", e);
                }
            } else {
                th = AnonymousClass001.A0c("doesn't support pairing hosted device with e2ee account");
                throw th;
            }
        } catch (Exception e2) {
            Log.e("CompanionDeviceQrHandler/handleQrCode", e2);
            if ((e2 instanceof ExecutionException) || (e2 instanceof InterruptedException) || (e2 instanceof IllegalArgumentException)) {
                C69263Wi.A03(this.A03, this, 33);
                return;
            }
            throw new RuntimeException("Failed to generate adv protobufs", e2);
        }
    }

    public final void A05(AnonymousClass2S3 r15, AnonymousClass239 r16, AnonymousClass1DS r17, C21441Bv r18, C21451Bw r19, boolean z) {
        long j;
        AnonymousClass3TC r8 = this.A01;
        if (r8 == null) {
            Log.e("CompanionDeviceQrHandler/No devicePairRequestProtocolHelper created");
            return;
        }
        AnonymousClass31C r7 = r8.A09;
        String A032 = r7.A03();
        r8.A01 = r16;
        r8.A00 = r15;
        AnonymousClass1DS r1 = r17;
        r8.A02 = r1;
        r8.A04 = z;
        String str = r15.A03;
        byte[] bArr = r15.A05;
        if (r17 != null) {
            j = r1.timestamp_;
        } else {
            j = -1;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K.A0P("ref", str, A0s);
        AnonymousClass36K.A0Q("pub-key", A0s, bArr, (AnonymousClass39V[]) null);
        if (!(r18 == null || r19 == null)) {
            AnonymousClass36K.A0Q("device-identity", A0s, r18.A0F(), (AnonymousClass39V[]) null);
            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
            A1V[0] = new AnonymousClass39V("ts", j);
            AnonymousClass36K.A0Q("key-index-list", A0s, r19.A0F(), A1V);
        }
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        A1W[0] = AnonymousClass39V.A00();
        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        AnonymousClass39V.A06("xmlns", "md", A1W);
        AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W);
        r7.A0D(r8, AnonymousClass36K.A0G(AnonymousClass36K.A0J("pair-device", new AnonymousClass39V[0], C18280x3.A1a(A0s, 0)), A1W), A032, 219, 32000);
    }

    public C55642qg(C55682qk r2, C69263Wi r3, C55872r3 r4, C42712Pf r5, AnonymousClass2NK r6, C68413Tb r7, C28941i1 r8, C65203Gp r9, C64663Ek r10, C56612sH r11, AnonymousClass33p r12, C29041iB r13, AnonymousClass31C r14, AnonymousClass4FK r15, AnonymousClass2IN r16, AnonymousClass4FS r17) {
        this.A0C = r11;
        this.A03 = r3;
        this.A02 = r2;
        this.A0I = r17;
        this.A0A = r9;
        this.A0F = r14;
        this.A0G = r15;
        this.A0B = r10;
        this.A0D = r12;
        this.A0E = r13;
        this.A04 = r4;
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = r5;
        this.A07 = r6;
        this.A0H = r16;
    }

    public void A01() {
        A00(this);
        C29041iB r2 = this.A0E;
        synchronized (r2.A0P) {
            r2.A01 = null;
        }
    }
}
