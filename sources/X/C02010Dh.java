package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0Dh  reason: invalid class name and case insensitive filesystem */
public class C02010Dh extends C10350hn implements C182928pD {
    public int A00 = 0;
    public AnonymousClass2HX A01;
    public C182928pD A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public final AnonymousClass0WN A07;
    public final C03590Ku A08;
    public final AnonymousClass33p A09;
    public final C161767qP A0A;
    public final JniBridge A0B;
    public final Object A0C = AnonymousClass002.A0D();
    public final String A0D;

    public final void A06(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        AnonymousClass2HX r5;
        Object obj = this.A0C;
        synchronized (obj) {
            bArr4 = this.A05;
            r5 = this.A01;
        }
        boolean z = true;
        C626936e.A0C(AnonymousClass000.A1W(bArr4));
        if (r5 == null) {
            z = false;
        }
        C626936e.A0C(z);
        byte[] A072 = A07(this.A08, r5, bArr4, bArr, bArr2, bArr3);
        if (A072 != null) {
            synchronized (obj) {
                this.A04 = A072;
                this.A00 = 2;
            }
            A05();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A00() {
        this.A07.A0E(this.A0D);
        Log.i("encb/RegisterUserHandler/encrypted backup enabled");
        this.A08.A00.A0U(0);
    }

    public static /* synthetic */ void A02(C02010Dh r1, int i) {
        C03590Ku r0 = r1.A08;
        synchronized (r1.A0C) {
        }
        r0.A00.A0U(i);
    }

    public C182928pD A04() {
        C182928pD r1;
        synchronized (this.A0C) {
            r1 = this.A02;
            if (r1 == null) {
                r1 = new C18120wm(this, 1);
                this.A02 = r1;
            }
        }
        return r1;
    }

    public void A05() {
        int i;
        byte[] bArr;
        byte[] bArr2;
        Object obj = this.A0C;
        synchronized (obj) {
            i = this.A00;
        }
        if (i != 0) {
            boolean z = false;
            boolean z2 = true;
            if (i != 1) {
                byte[] bArr3 = this.A04;
                if (bArr3 != null) {
                    z = true;
                }
                C626936e.A0C(z);
                this.A0A.A07(this, bArr3);
                return;
            }
            synchronized (obj) {
                bArr = this.A06;
                bArr2 = this.A03;
            }
            if (bArr == null) {
                z2 = false;
            }
            C626936e.A0C(z2);
            if (bArr2 != null) {
                z = true;
            }
            C626936e.A0C(z);
            this.A0A.A08(this, bArr, bArr2);
            return;
        }
        this.A0A.A06(this);
    }

    public final byte[] A07(C03590Ku r10, AnonymousClass2HX r11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] A0R;
        String str;
        int i;
        byte[] doFinal;
        C51032jA WESOpaqueClientCreateRegistrationFinish = this.A0B.WESOpaqueClientCreateRegistrationFinish(r11, bArr3, 100000);
        if (WESOpaqueClientCreateRegistrationFinish.A00() != 0) {
            i = 4;
        } else {
            boolean z = false;
            byte[] copyOfRange = Arrays.copyOfRange(WESOpaqueClientCreateRegistrationFinish.A01(), 0, 16);
            byte[] A022 = WESOpaqueClientCreateRegistrationFinish.A02();
            try {
                C04860Qy r0 = this.A07.A01;
                byte[] A092 = r0.A09();
                if (A092 == null) {
                    A092 = AnonymousClass0YS.A08();
                    r0.A08(A092);
                }
                A0R = C06550Ye.A0R();
                try {
                    C626936e.A0B(AnonymousClass000.A1U(A092.length, 32));
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(1, new SecretKeySpec(copyOfRange, "AES"), new IvParameterSpec(A0R));
                    doFinal = instance.doFinal(A092);
                    if (doFinal.length == 48) {
                        z = true;
                    }
                    C626936e.A0B(z);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    e = e;
                    str = "encb/RegisterUserHandler/createEncRegPayload/aesEncrypt/exception.";
                    Log.e(str, e);
                    i = 5;
                    r10.A00.A0U(i);
                    return null;
                }
            } catch (IOException e2) {
                Log.e("encb/RegisterUserHandler/createEncRegPayload/getAndSaveRootKey/exception.", e2);
                r10.A00.A0U(6);
                return null;
            }
            try {
                return AnonymousClass0YS.A09(AnonymousClass0YS.A01(AnonymousClass0YS.A02(doFinal, A0R).A0F(), bArr2, bArr3, A022, bArr4).A0F(), bArr);
            } catch (IOException e3) {
                Log.e("encb/RegisterUserHandler/createEncRegPayload/createTranscript/exception.", e3);
                r10.A00.A0U(6);
                return null;
            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e4) {
                e = e4;
                str = "encb/RegisterUserHandler/createEncRegPayload/rsaEncrypt/exception.";
                Log.e(str, e);
                i = 5;
                r10.A00.A0U(i);
                return null;
            }
        }
        r10.A00.A0U(i);
        return null;
    }

    public C02010Dh(AnonymousClass0WN r2, C03590Ku r3, AnonymousClass33p r4, C161767qP r5, C60902zM r6, AnonymousClass4FS r7, JniBridge jniBridge, String str) {
        super(r6, r7);
        this.A0B = jniBridge;
        this.A07 = r2;
        this.A09 = r4;
        this.A0A = r5;
        this.A0D = str;
        this.A08 = r3;
    }
}
