package X;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* renamed from: X.1iA  reason: invalid class name and case insensitive filesystem */
public class C29031iA extends C61102zi implements AnonymousClass485 {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public AnonymousClass2KI A04;
    public AnonymousClass2KK A05;
    public DeviceJid A06;
    public UserJid A07;
    public C21541Cf A08;
    public Runnable A09;
    public Runnable A0A;
    public Runnable A0B;
    public Runnable A0C;
    public Runnable A0D;
    public String A0E;
    public byte[] A0F;
    public byte[] A0G;
    public final Handler A0H = AnonymousClass000.A0A();
    public final AnonymousClass31B A0I;
    public final AnonymousClass2EA A0J;
    public final C56972sr A0K;
    public final C66663Mh A0L;
    public final C28911hy A0M;
    public final C614930z A0N;
    public final C28991i6 A0O;
    public final C28721hf A0P;
    public final C65203Gp A0Q;
    public final C46642by A0R;
    public final C51462jr A0S;
    public final C54552ou A0T;
    public final C44332Vq A0U;
    public final C44872Xu A0V;
    public final C55262q4 A0W;
    public final C620633i A0X;
    public final C56612sH A0Y;
    public final C54292oU A0Z;
    public final AnonymousClass33p A0a;
    public final C621133n A0b;
    public final C48972fm A0c;
    public final C55272q5 A0d;
    public final C29041iB A0e;
    public final C623934v A0f;
    public final AnonymousClass1VX A0g;
    public final C64723Er A0h;
    public final AnonymousClass4FV A0i;
    public final AnonymousClass31C A0j;
    public final AnonymousClass33S A0k;
    public final C56452s0 A0l;
    public final C28861ht A0m;
    public final C69183Wa A0n;
    public final AnonymousClass4FS A0o;
    public final C183538qC A0p;
    public final C183538qC A0q;
    public final C183538qC A0r;
    public final List A0s = AnonymousClass001.A0s();
    public final AtomicReference A0t = new AtomicReference((Object) null);

    public synchronized void A0A() {
        Log.i("companion/registration/cancelling link code registration");
        boolean A1U = C18300x5.A1U(this.A0r);
        A0C();
        this.A0S.A01(A1U ? 1 : 0);
    }

    public synchronized void A0B() {
        C51462jr r1 = this.A0S;
        if (r1.A02()) {
            Log.d("companion/registration/cancel");
            r1.A01(0);
            A09();
            Runnable runnable = this.A0D;
            if (runnable != null) {
                this.A0o.BjN(runnable);
            }
            Runnable runnable2 = this.A0C;
            if (runnable2 != null) {
                this.A0o.BjN(runnable2);
            }
            Runnable runnable3 = this.A09;
            if (runnable3 != null) {
                this.A0o.BjN(runnable3);
            }
            AnonymousClass0x9.A0S(this.A0r).A0F(false, 16);
            this.A06 = null;
            this.A0F = null;
            this.A02 = -1;
            this.A00 = -1;
            this.A03 = 0;
            this.A07 = null;
            this.A04 = null;
            this.A0E = null;
            this.A0t.set((Object) null);
            this.A0G = null;
            Iterator A032 = C61102zi.A03(this);
            while (A032.hasNext()) {
                ((C56242rf) A032.next()).A02();
            }
        }
    }

    public final synchronized void A0C() {
        Runnable runnable = this.A0A;
        if (runnable != null) {
            this.A0o.BjN(runnable);
        }
        this.A01 = 0;
        this.A04 = null;
        this.A0E = null;
        this.A0t.set((Object) null);
        this.A0G = null;
    }

    public synchronized void A0F(UserJid userJid, boolean z) {
        Log.i("companion/registration/link-code/start");
        int i = 10;
        if (z) {
            i = 14;
        }
        this.A0S.A01(i);
        this.A07 = userJid;
        A08();
    }

    public synchronized void A0G(String str, boolean z, boolean z2) {
        String str2;
        C18260x0.A0q("companion/deregister/start removalReason=", str, AnonymousClass001.A0o());
        this.A0i.BlF(true);
        C614930z r4 = this.A0N;
        Log.i("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs");
        C56972sr r3 = r4.A06;
        if (C56972sr.A01(r3) != null) {
            AnonymousClass33p r1 = r4.A0A;
            AnonymousClass1RR A012 = C56972sr.A01(r3);
            if (A012 != null) {
                C18270x1.A0j(C18270x1.A03(r1), "account_switching_logged_out_phone_number", AnonymousClass36P.A03(AnonymousClass3ZH.A01(A012)));
            } else {
                throw C18290x4.A0Y();
            }
        } else {
            Log.e("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs/meContact is null");
        }
        if (r3.A0H() != null) {
            AnonymousClass33p r12 = r4.A0A;
            C27981fH A0H2 = r3.A0H();
            if (A0H2 != null) {
                str2 = A0H2.getRawString();
            } else {
                str2 = null;
            }
            C18270x1.A0j(C18270x1.A03(r12), "account_switching_logged_out_lid", str2);
        } else {
            Log.e("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs/myLid is null");
        }
        if (z) {
            AnonymousClass3XA r42 = new AnonymousClass3XA();
            r42.A03(new AnonymousClass3X0(this, str, z2));
            AnonymousClass4K3 r2 = new AnonymousClass4K3(r42, 3, this);
            this.A0O.A06(r2);
            r42.A03(new C86264Jl(this, 1, r2));
            C65203Gp r32 = this.A0Q;
            C626936e.A0C(C56972sr.A0C(r32));
            C22521Oj r13 = (C22521Oj) r32.A0c.A00("sentinel");
            if (r13 != null) {
                C626936e.A0C(r13.A00.A0Y());
                List A0D2 = r13.A0D(false);
                C18260x0.A1P(AnonymousClass001.A0o(), "SyncManager/onUserInitiatedCompanionLogout mutations = \n", A0D2);
                r32.A0K(A0D2);
                r32.A0F();
            }
            this.A0o.Bkn(C69963Zi.A00(r42, 28), "CompanionRegistrationManager/deregister", TimeUnit.SECONDS.toMillis((long) this.A0L.A03(C66663Mh.A1U)));
        } else {
            this.A0H.post(new C71703cX(20, (Object) this, z2));
        }
    }

    public final void A08() {
        C42612Ov r0;
        AnonymousClass2KK r1;
        int A0K2;
        try {
            C621133n r3 = this.A0b;
            if (r3.A0X()) {
                r0 = r3.A0D();
            } else {
                C48972fm r12 = this.A0c;
                Objects.requireNonNull(r3);
                r0 = (C42612Ov) C48972fm.A00(r12, r3, 3);
            }
            if (r3.A0X()) {
                r1 = r3.A00.A04();
            } else {
                C48972fm r2 = this.A0c;
                Objects.requireNonNull(r3);
                r1 = (AnonymousClass2KK) C48972fm.A00(r2, r3, 1);
            }
            this.A05 = r1;
            if (r3.A0X()) {
                A0K2 = r3.A07.A01();
            } else {
                C48972fm r22 = this.A0c;
                Objects.requireNonNull(r3);
                A0K2 = AnonymousClass001.A0K(C48972fm.A00(r22, r3, 4));
            }
            AnonymousClass0x9.A0S(this.A0r).A0B(new AnonymousClass2OU(r0, this.A05.A01.A00.A01, AnonymousClass36A.A01(A0K2)));
            ((C47302d2) this.A0q.get()).A00();
            ((C47182cq) this.A0p.get()).A00();
        } catch (InterruptedException | ExecutionException unused) {
            Log.e("companion/registration/failed to load keys for sending");
            A0B();
        }
    }

    public final void A09() {
        Runnable runnable = this.A0B;
        if (runnable != null) {
            this.A0o.BjN(runnable);
        }
        Runnable runnable2 = this.A0A;
        if (runnable2 != null) {
            this.A0o.BjN(runnable2);
        }
        List<Runnable> list = this.A0s;
        for (Runnable BjN : list) {
            this.A0o.BjN(BjN);
        }
        list.clear();
    }

    public final synchronized void A0H(boolean z) {
        String str;
        String str2;
        synchronized (this) {
            Log.i("companion/registration/companion-hello/start");
            C51462jr r2 = this.A0S;
            int A002 = r2.A00();
            if (A002 == 10 || A002 == 14) {
                r2.A01(11);
                byte[] bArr = new byte[5];
                AnonymousClass29O.A00().nextBytes(bArr);
                byte[] bArr2 = new byte[32];
                AnonymousClass29O.A00().nextBytes(bArr2);
                byte[] bArr3 = new byte[16];
                AnonymousClass29O.A00().nextBytes(bArr3);
                int i = 0;
                long j = 0;
                int i2 = 32;
                int i3 = 0;
                do {
                    j |= ((long) (bArr[i3] & 255)) << i2;
                    i2 -= 8;
                    i3++;
                } while (i3 < 5);
                String str3 = "";
                do {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append(C57792uD.A00.get((int) (31 & j)));
                    str3 = AnonymousClass000.A0X(str3, A0o2);
                    j >>= 5;
                    i++;
                } while (i < 8);
                if (str3 != null) {
                    this.A0E = str3;
                    this.A04 = AnonymousClass36G.A00();
                    SecretKey A082 = C627236i.A08("PBKDF2WithHmacSHA256", bArr2, this.A0E.toCharArray(), AnonymousClass35S.A0F, 256);
                    try {
                        byte[] A1Y = C18310x6.A1Y(A082, C18330xA.A0D(bArr3), Cipher.getInstance("AES/CTR/NoPadding"), this.A04.A01.A01, 1);
                        byte[][] bArr4 = new byte[3][];
                        bArr4[0] = bArr2;
                        C18300x5.A1K(bArr3, A1Y, bArr4);
                        byte[] A062 = AnonymousClass36A.A06(bArr4);
                        C54552ou r5 = this.A0T;
                        r5.A00();
                        String A052 = C54292oU.A05(this.A0Z, Build.VERSION.RELEASE, new Object[1], 0, R.string.f11nameremoved);
                        C44332Vq r27 = this.A0U;
                        UserJid userJid = this.A07;
                        byte[] bArr5 = this.A0I.A05().A02.A01;
                        int ordinal = r5.A00().ordinal();
                        if (ordinal == 0) {
                            str = "e";
                        } else if (ordinal != 2) {
                            str = "d";
                        } else {
                            str = "f";
                        }
                        boolean A1T = AnonymousClass000.A1T(z ? 1 : 0);
                        C86234Ji r0 = new C86234Ji(this, 12);
                        C86234Ji r8 = new C86234Ji(this, 13);
                        Log.i("companion/registration/send-link-code-companion-reg-companion-hello");
                        AnonymousClass31C r26 = r27.A00;
                        String A032 = r26.A03();
                        if (A1T) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                        C135206kI r7 = C135206kI.A00;
                        byte[] bArr6 = new byte[0];
                        C56052rL A042 = C56052rL.A04("link_code_pairing_nonce");
                        C626836d.A0H(bArr6, -9007199254740991L, 9007199254740991L);
                        A042.A01 = bArr6;
                        AnonymousClass36K A0F2 = A042.A0F();
                        C35381wm r10 = new C35381wm(A032, 22);
                        C56052rL A012 = C56052rL.A01();
                        C56052rL.A0D(A012, "xmlns", "md");
                        C56052rL.A06(r7, A012, "to");
                        C56052rL A043 = C56052rL.A04("link_code_companion_reg");
                        C56052rL.A0D(A043, "stage", "companion_hello");
                        if (C626836d.A0L(userJid, "link_code_companion_reg->jid")) {
                            C56052rL.A06(userJid, A043, "jid");
                        }
                        A043.A0K(str2, "should_show_push_notification", C35611x9.A00);
                        A043.A0H(A0F2);
                        C56052rL A044 = C56052rL.A04("link_code_pairing_wrapped_companion_ephemeral_pub");
                        C626836d.A0H(A062, -9007199254740991L, 9007199254740991L);
                        C56052rL.A09(A044, A043, A062);
                        C56052rL A045 = C56052rL.A04("companion_server_auth_key_pub");
                        C626836d.A0H(bArr5, -9007199254740991L, 9007199254740991L);
                        C56052rL.A09(A045, A043, bArr5);
                        C56052rL A046 = C56052rL.A04("companion_platform_id");
                        if (C626836d.A0M(str, 0, 9007199254740991L, false)) {
                            A046.A0J(str);
                        }
                        C56052rL.A07(A046, A043);
                        C56052rL A047 = C56052rL.A04("companion_platform_display");
                        String str4 = A052;
                        if (C626836d.A0M(str4, 0, 9007199254740991L, false)) {
                            A047.A0J(str4);
                        }
                        C56052rL.A07(A047, A043);
                        r26.A0K(new AnonymousClass4KX(r0, r27, r8, 0), C41032Ir.A03(A043, A012, r10), A032, 364, 0);
                        String str5 = this.A0E;
                        Iterator A033 = C61102zi.A03(this);
                        while (A033.hasNext()) {
                            C56242rf r1 = (C56242rf) A033.next();
                            if (r1 instanceof AnonymousClass4H8) {
                                AnonymousClass4H8 r12 = (AnonymousClass4H8) r1;
                                if (1 - r12.A01 == 0) {
                                    C162457s7.A0J(str5, 0);
                                    Log.d("companion/registration/link code updated");
                                    Activity activity = (Activity) r12.A00;
                                    activity.runOnUiThread(new C71323bv(27, str5, activity));
                                }
                            }
                        }
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                        Log.e("companion/registration/companion-hello/failed to encrypt companion ADV public key");
                    }
                } else {
                    Log.e("companion/registration/companion-hello/convert to base32 string failed");
                    A0B();
                }
            } else {
                Log.e("companion/registration/companion-hello/invalid state");
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0D(C56242rf r1) {
        super.A06(r1);
    }

    public /* bridge */ /* synthetic */ void A0E(C56242rf r1) {
        super.A07(r1);
    }

    public C29031iA(AnonymousClass31B r4, AnonymousClass2EA r5, C56972sr r6, C66663Mh r7, C28911hy r8, C614930z r9, C28991i6 r10, C28721hf r11, C65203Gp r12, C46642by r13, C51462jr r14, C54552ou r15, C44872Xu r16, C55262q4 r17, C620633i r18, C56612sH r19, C54292oU r20, AnonymousClass33p r21, C621133n r22, C48972fm r23, C55272q5 r24, C29041iB r25, C623934v r26, AnonymousClass1VX r27, C64723Er r28, AnonymousClass4FV r29, AnonymousClass31C r30, AnonymousClass33S r31, C56452s0 r32, C28861ht r33, C69183Wa r34, AnonymousClass4FS r35, C183538qC r36, C183538qC r37, C183538qC r38, AnonymousClass4C1 r39) {
        super(new C72333dY((Object) null, r39));
        this.A0Y = r19;
        this.A0g = r27;
        this.A0K = r6;
        this.A0Z = r20;
        this.A0o = r35;
        this.A0i = r29;
        this.A0k = r31;
        this.A0L = r7;
        this.A0Q = r12;
        this.A0I = r4;
        this.A0m = r33;
        this.A0M = r8;
        AnonymousClass31C r1 = r30;
        this.A0j = r1;
        this.A0r = r36;
        this.A0c = r23;
        this.A0X = r18;
        this.A0N = r9;
        this.A0b = r22;
        this.A0p = r38;
        this.A0l = r32;
        this.A0f = r26;
        this.A0n = r34;
        this.A0a = r21;
        this.A0V = r16;
        this.A0e = r25;
        this.A0O = r10;
        this.A0P = r11;
        this.A0R = r13;
        this.A0d = r24;
        this.A0T = r15;
        this.A0q = r37;
        this.A0W = r17;
        this.A0S = r14;
        this.A0h = r28;
        this.A0J = r5;
        this.A0U = new C44332Vq(r1);
    }
}
