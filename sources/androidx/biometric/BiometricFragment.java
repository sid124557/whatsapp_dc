package androidx.biometric;

import X.AnonymousClass000;
import X.AnonymousClass08M;
import X.AnonymousClass08S;
import X.AnonymousClass0L0;
import X.AnonymousClass0MY;
import X.AnonymousClass0NM;
import X.AnonymousClass0Q3;
import X.AnonymousClass0QU;
import X.AnonymousClass0RC;
import X.AnonymousClass0RE;
import X.AnonymousClass0UE;
import X.AnonymousClass0XL;
import X.AnonymousClass0XP;
import X.C003203q;
import X.C004404l;
import X.C006005w;
import X.C02630Gz;
import X.C03680Ld;
import X.C05860Vg;
import X.C06190Wp;
import X.C06270Wx;
import X.C07680bQ;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C10850ic;
import X.C10860id;
import X.C10870ie;
import X.C10880if;
import X.C11770kB;
import X.C12520lg;
import X.C13650nW;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricFragment extends C08310eF {
    public Handler A00 = AnonymousClass000.A0A();
    public AnonymousClass08S A01;

    public void A0g() {
        this.A0X = true;
        if (Build.VERSION.SDK_INT == 29) {
            AnonymousClass08S r4 = this.A01;
            if ((r4.A0D() & 32768) != 0) {
                r4.A0M = true;
                this.A00.postDelayed(new C10880if(r4), 250);
            }
        }
    }

    public void A0h() {
        this.A0X = true;
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J) {
            C003203q A0Q = A0Q();
            if (A0Q == null || !A0Q.isChangingConfigurations()) {
                A1M(0);
            }
        }
    }

    public void A1M(int i) {
        String string;
        if (i == 3 || !this.A01.A0M) {
            if (A1S()) {
                this.A01.A00 = i;
                if (i == 1) {
                    Context A1D = A1D();
                    if (A1D == null) {
                        string = "";
                    } else {
                        string = A1D.getString(R.string.f11nameremoved);
                    }
                    A1O(10, string);
                }
            }
            AnonymousClass08S r0 = this.A01;
            C03680Ld r4 = r0.A07;
            if (r4 == null) {
                r4 = new C03680Ld();
                r0.A07 = r4;
            }
            CancellationSignal cancellationSignal = r4.A00;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                r4.A00 = null;
            }
            AnonymousClass0QU r02 = r4.A01;
            if (r02 != null) {
                try {
                    r02.A01();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                r4.A01 = null;
            }
        }
    }

    public void A1Q(AnonymousClass0MY r7) {
        C06190Wp r5 = null;
        C003203q A0Q = A0Q();
        if (A0Q == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        AnonymousClass08S r4 = this.A01;
        r4.A06 = r7;
        int i = r7.A00;
        if (i == 0) {
            i = 255;
            if (r7.A05) {
                i = 33023;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 < 30 && i == 15) {
            r5 = AnonymousClass0RC.A01();
        }
        r4.A05 = r5;
        boolean A1R = A1R();
        AnonymousClass08S r2 = this.A01;
        String str = null;
        if (A1R) {
            str = C08310eF.A09(this).getString(R.string.f11nameremoved);
        }
        r2.A0G = str;
        if (A1R() && new AnonymousClass0UE(new C07680bQ(A0Q)).A03(255) != 0) {
            this.A01.A0I = true;
            A1K();
        } else if (this.A01.A0K) {
            this.A00.postDelayed(new C10860id(this), 600);
        } else {
            A1I();
        }
    }

    public static boolean A00(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(R.array.f2nameremoved)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public void A1H() {
        this.A01.A0N = false;
        A1J();
        if (!this.A01.A0J && A16()) {
            C08240dc r1 = new C08240dc(A0U());
            r1.A07(this);
            r1.A00(true);
        }
        Context A1D = A1D();
        if (A1D != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String equals : A1D.getResources().getStringArray(R.array.f2nameremoved)) {
                    if (str.equals(equals)) {
                        AnonymousClass08S r12 = this.A01;
                        r12.A0K = true;
                        this.A00.postDelayed(new C10870ie(r12), 600);
                        return;
                    }
                }
            }
        }
    }

    public void A1I() {
        int i;
        String str;
        int i2;
        if (this.A01.A0N) {
            return;
        }
        if (A1D() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        AnonymousClass08S r2 = this.A01;
        r2.A0N = true;
        r2.A0I = true;
        if (A1S()) {
            Context applicationContext = A0G().getApplicationContext();
            AnonymousClass0XP r6 = new AnonymousClass0XP(applicationContext);
            if (!r6.A06()) {
                i = 12;
            } else if (!r6.A05()) {
                i = 11;
            } else if (A16()) {
                this.A01.A0L = true;
                if (!A00(applicationContext, Build.MODEL)) {
                    this.A00.postDelayed(new C10850ic(this), 500);
                    new FingerprintDialogFragment().A1O(A0U(), "androidx.biometric.FingerprintDialogFragment");
                }
                AnonymousClass08S r22 = this.A01;
                r22.A00 = 0;
                C06190Wp r3 = r22.A05;
                C05860Vg r5 = null;
                if (r3 != null) {
                    Cipher cipher = r3.A02;
                    if (cipher != null) {
                        r5 = new C05860Vg(cipher);
                    } else {
                        Signature signature = r3.A01;
                        if (signature != null) {
                            r5 = new C05860Vg(signature);
                        } else {
                            Mac mac = r3.A03;
                            if (mac != null) {
                                r5 = new C05860Vg(mac);
                            } else if (Build.VERSION.SDK_INT >= 30 && r3.A00() != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            }
                        }
                    }
                }
                AnonymousClass08S r7 = this.A01;
                C03680Ld r1 = r7.A07;
                if (r1 == null) {
                    r1 = new C03680Ld();
                    r7.A07 = r1;
                }
                AnonymousClass0QU r32 = r1.A01;
                if (r32 == null) {
                    r32 = new AnonymousClass0QU();
                    r1.A01 = r32;
                }
                AnonymousClass0NM r23 = r7.A03;
                if (r23 == null) {
                    r23 = new AnonymousClass0NM(new C004404l(r7));
                    r7.A03 = r23;
                }
                AnonymousClass0Q3 r12 = r23.A01;
                if (r12 == null) {
                    r12 = new C006005w(r23);
                    r23.A01 = r12;
                }
                try {
                    r6.A04(r12, r5, r32);
                    return;
                } catch (NullPointerException e) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                    i = 1;
                    if (applicationContext != null) {
                        i2 = R.string.f11nameremoved;
                    }
                }
            } else {
                return;
            }
            if (applicationContext != null) {
                if (11 != i) {
                    i2 = R.string.f11nameremoved;
                } else {
                    i2 = R.string.f11nameremoved;
                }
                str = applicationContext.getString(i2);
                A1O(i, str);
                A1H();
                return;
            }
            str = "";
            A1O(i, str);
            A1H();
            return;
        }
        A1L();
    }

    public final void A1J() {
        this.A01.A0N = false;
        if (A16()) {
            C08270df A0U = A0U();
            DialogFragment dialogFragment = (DialogFragment) A0U.A0D("androidx.biometric.FingerprintDialogFragment");
            if (dialogFragment == null) {
                return;
            }
            if (dialogFragment.A16()) {
                dialogFragment.A1L();
                return;
            }
            C08240dc r1 = new C08240dc(A0U);
            r1.A07(dialogFragment);
            r1.A00(true);
        }
    }

    public final void A1O(int i, CharSequence charSequence) {
        AnonymousClass08S r2 = this.A01;
        if (r2.A0J) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!r2.A0I) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            r2.A0I = false;
            Executor executor = r2.A0H;
            if (executor == null) {
                executor = new C13650nW();
            }
            executor.execute(new C12520lg(this, charSequence, i));
        }
    }

    public final void A1P(AnonymousClass0L0 r3) {
        AnonymousClass08S r1 = this.A01;
        if (!r1.A0I) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            r1.A0I = false;
            Executor executor = r1.A0H;
            if (executor == null) {
                executor = new C13650nW();
            }
            executor.execute(new C11770kB(this, r3));
        }
        A1H();
    }

    public boolean A1R() {
        if (Build.VERSION.SDK_INT > 28 || (this.A01.A0D() & 32768) == 0) {
            return false;
        }
        return true;
    }

    public final boolean A1S() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return true;
        }
        C003203q A0Q = A0Q();
        if (A0Q != null && this.A01.A05 != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (i != 28) {
                return false;
            }
            if (str != null) {
                for (String equalsIgnoreCase : A0Q.getResources().getStringArray(R.array.f2nameremoved)) {
                    if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                        return true;
                    }
                }
            }
            if (str2 != null) {
                for (String startsWith : A0Q.getResources().getStringArray(R.array.f2nameremoved)) {
                    if (str2.startsWith(startsWith)) {
                        return true;
                    }
                }
            }
        } else if (i != 28) {
            return false;
        }
        if (!C02630Gz.A00(A1D())) {
            return true;
        }
        return false;
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 1) {
            this.A01.A0J = false;
            if (i2 == -1) {
                A1P(new AnonymousClass0L0((C06190Wp) null, 1));
                return;
            }
            A1O(10, C08310eF.A09(this).getString(R.string.f11nameremoved));
            A1H();
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            AnonymousClass08S r0 = (AnonymousClass08S) new AnonymousClass0XL(A0Q).A01(AnonymousClass08S.class);
            this.A01 = r0;
            AnonymousClass08M r1 = r0.A0A;
            if (r1 == null) {
                r1 = AnonymousClass08M.A01();
                r0.A0A = r1;
            }
            C06270Wx.A02(this, r1, 0);
            AnonymousClass08S r02 = this.A01;
            AnonymousClass08M r12 = r02.A08;
            if (r12 == null) {
                r12 = AnonymousClass08M.A01();
                r02.A08 = r12;
            }
            C06270Wx.A02(this, r12, 1);
            AnonymousClass08S r03 = this.A01;
            AnonymousClass08M r13 = r03.A09;
            if (r13 == null) {
                r13 = AnonymousClass08M.A01();
                r03.A09 = r13;
            }
            C06270Wx.A02(this, r13, 2);
            AnonymousClass08S r04 = this.A01;
            AnonymousClass08M r14 = r04.A0D;
            if (r14 == null) {
                r14 = AnonymousClass08M.A01();
                r04.A0D = r14;
            }
            C06270Wx.A02(this, r14, 3);
            AnonymousClass08S r05 = this.A01;
            AnonymousClass08M r15 = r05.A0F;
            if (r15 == null) {
                r15 = AnonymousClass08M.A01();
                r05.A0F = r15;
            }
            C06270Wx.A02(this, r15, 4);
            AnonymousClass08S r06 = this.A01;
            AnonymousClass08M r16 = r06.A0E;
            if (r16 == null) {
                r16 = AnonymousClass08M.A01();
                r06.A0E = r16;
            }
            C06270Wx.A02(this, r16, 5);
        }
    }

    public final void A1K() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        int i;
        C003203q A0Q = A0Q();
        if (A0Q == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager A002 = AnonymousClass0RE.A00(A0Q);
        if (A002 == null) {
            string = C08310eF.A09(this).getString(R.string.f11nameremoved);
            i = 12;
        } else {
            AnonymousClass0MY r0 = this.A01.A06;
            if (r0 != null) {
                charSequence = r0.A03;
                charSequence2 = r0.A02;
            } else {
                charSequence = null;
                charSequence2 = null;
            }
            if (charSequence2 == null) {
                charSequence2 = null;
            }
            Intent createConfirmDeviceCredentialIntent = A002.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
            if (createConfirmDeviceCredentialIntent == null) {
                string = C08310eF.A09(this).getString(R.string.f11nameremoved);
                i = 14;
            } else {
                this.A01.A0J = true;
                if (A1S()) {
                    A1J();
                }
                createConfirmDeviceCredentialIntent.setFlags(134742016);
                startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                return;
            }
        }
        A1O(i, string);
        A1H();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r1 != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1L() {
        /*
            r8 = this;
            android.content.Context r0 = r8.A0G()
            android.content.Context r0 = r0.getApplicationContext()
            android.hardware.biometrics.BiometricPrompt$Builder r4 = X.C06450Xt.A00(r0)
            X.08S r0 = r8.A01
            X.0MY r0 = r0.A06
            if (r0 == 0) goto L_0x0020
            java.lang.CharSequence r1 = r0.A03
            java.lang.CharSequence r0 = r0.A02
            if (r1 == 0) goto L_0x001b
            X.C06450Xt.A06(r4, r1)
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            X.C06450Xt.A05(r4, r0)
        L_0x0020:
            X.08S r0 = r8.A01
            java.lang.CharSequence r3 = r0.A0G
            if (r3 != 0) goto L_0x0030
            X.0MY r0 = r0.A06
            if (r0 == 0) goto L_0x00c7
            java.lang.CharSequence r3 = r0.A01
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = ""
        L_0x0030:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0051
            X.08S r0 = r8.A01
            java.util.concurrent.Executor r2 = r0.A0H
            if (r2 != 0) goto L_0x0041
            X.0nW r2 = new X.0nW
            r2.<init>()
        L_0x0041:
            X.08S r1 = r8.A01
            android.content.DialogInterface$OnClickListener r0 = r1.A02
            if (r0 != 0) goto L_0x004e
            X.0Yx r0 = new X.0Yx
            r0.<init>(r1)
            r1.A02 = r0
        L_0x004e:
            X.C06450Xt.A02(r0, r4, r3, r2)
        L_0x0051:
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r3 < r2) goto L_0x0066
            X.08S r0 = r8.A01
            X.0MY r0 = r0.A06
            if (r0 == 0) goto L_0x0062
            boolean r1 = r0.A04
            r0 = 0
            if (r1 == 0) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            X.AnonymousClass0RA.A00(r4, r0)
        L_0x0066:
            X.08S r0 = r8.A01
            int r1 = r0.A0D()
            r0 = 30
            if (r3 < r0) goto L_0x00b9
            X.C02590Gv.A00(r4, r1)
        L_0x0073:
            android.hardware.biometrics.BiometricPrompt r7 = X.C06450Xt.A01(r4)
            android.content.Context r6 = r8.A1D()
            X.08S r0 = r8.A01
            X.0Wp r0 = r0.A05
            android.hardware.biometrics.BiometricPrompt$CryptoObject r5 = X.AnonymousClass0RC.A00(r0)
            X.08S r1 = r8.A01
            X.0Ld r0 = r1.A07
            if (r0 != 0) goto L_0x0090
            X.0Ld r0 = new X.0Ld
            r0.<init>()
            r1.A07 = r0
        L_0x0090:
            android.os.CancellationSignal r4 = r0.A00
            if (r4 != 0) goto L_0x009b
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            r0.A00 = r4
        L_0x009b:
            X.0nV r3 = new X.0nV
            r3.<init>()
            X.08S r2 = r8.A01
            X.0NM r1 = r2.A03
            if (r1 != 0) goto L_0x00b2
            X.04l r0 = new X.04l
            r0.<init>(r2)
            X.0NM r1 = new X.0NM
            r1.<init>(r0)
            r2.A03 = r1
        L_0x00b2:
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r0 = r1.A00()
            if (r5 != 0) goto L_0x00ce
            goto L_0x00ca
        L_0x00b9:
            if (r3 < r2) goto L_0x0073
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1S(r1)
            X.AnonymousClass0RA.A01(r4, r0)
            goto L_0x0073
        L_0x00c7:
            r3 = 0
            goto L_0x0030
        L_0x00ca:
            X.C06450Xt.A04(r0, r7, r4, r3)     // Catch:{ NullPointerException -> 0x00d2 }
            return
        L_0x00ce:
            X.C06450Xt.A03(r0, r5, r7, r4, r3)     // Catch:{ NullPointerException -> 0x00d2 }
            goto L_0x00ee
        L_0x00d2:
            r2 = move-exception
            java.lang.String r1 = "BiometricFragment"
            java.lang.String r0 = "Got NPE while authenticating with biometric prompt."
            android.util.Log.e(r1, r0, r2)
            if (r6 == 0) goto L_0x00eb
            r0 = 2131895798(0x7f1225f6, float:1.942644E38)
            java.lang.String r1 = r6.getString(r0)
        L_0x00e3:
            r0 = 1
            r8.A1O(r0, r1)
            r8.A1H()
            return
        L_0x00eb:
            java.lang.String r1 = ""
            goto L_0x00e3
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A1L():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r1 != 3) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        if (A00(r1, android.os.Build.MODEL) == false) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N(int r5, java.lang.CharSequence r6) {
        /*
            r4 = this;
            switch(r5) {
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0003;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r5 = 8
        L_0x0005:
            android.content.Context r2 = r4.A1D()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x002e
            r0 = 7
            if (r5 == r0) goto L_0x0016
            r0 = 9
            if (r5 != r0) goto L_0x002e
        L_0x0016:
            if (r2 == 0) goto L_0x002e
            boolean r0 = X.AnonymousClass0RE.A01(r2)
            if (r0 == 0) goto L_0x002e
            X.08S r0 = r4.A01
            int r1 = r0.A0D()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002e
            r4.A1K()
            return
        L_0x002e:
            boolean r0 = r4.A1S()
            if (r0 == 0) goto L_0x0084
            if (r6 != 0) goto L_0x003e
            android.content.Context r2 = r4.A1D()
            if (r2 != 0) goto L_0x0051
            java.lang.String r6 = ""
        L_0x003e:
            r1 = 5
            X.08S r0 = r4.A01
            if (r5 != r1) goto L_0x009f
            int r1 = r0.A00
            if (r1 == 0) goto L_0x004a
            r0 = 3
            if (r1 != r0) goto L_0x004d
        L_0x004a:
            r4.A1O(r5, r6)
        L_0x004d:
            r4.A1H()
            return
        L_0x0051:
            r1 = 1
            r0 = 2131895921(0x7f122671, float:1.9426689E38)
            if (r5 == r1) goto L_0x006f
            r0 = 7
            if (r5 == r0) goto L_0x0080
            switch(r5) {
                case 9: goto L_0x0080;
                case 10: goto L_0x0074;
                case 11: goto L_0x0078;
                case 12: goto L_0x007c;
                default: goto L_0x005d;
            }
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown error code: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r5)
            java.lang.String r0 = "BiometricUtils"
            android.util.Log.e(r0, r1)
            r0 = 2131895798(0x7f1225f6, float:1.942644E38)
        L_0x006f:
            java.lang.String r6 = r2.getString(r0)
            goto L_0x003e
        L_0x0074:
            r0 = 2131895925(0x7f122675, float:1.9426697E38)
            goto L_0x006f
        L_0x0078:
            r0 = 2131895924(0x7f122674, float:1.9426695E38)
            goto L_0x006f
        L_0x007c:
            r0 = 2131895922(0x7f122672, float:1.942669E38)
            goto L_0x006f
        L_0x0080:
            r0 = 2131895923(0x7f122673, float:1.9426693E38)
            goto L_0x006f
        L_0x0084:
            if (r6 != 0) goto L_0x004a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            r1 = 2131895798(0x7f1225f6, float:1.942644E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r0 = r0.getString(r1)
            r2.append(r0)
            java.lang.String r0 = " "
            java.lang.String r6 = X.AnonymousClass000.A0Y(r0, r2, r5)
            goto L_0x004a
        L_0x009f:
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x00af
            r4.A1O(r5, r6)
            r4.A1H()
        L_0x00a9:
            X.08S r1 = r4.A01
            r0 = 1
            r1.A0L = r0
            return
        L_0x00af:
            r2 = r6
            if (r6 != 0) goto L_0x00bd
            r1 = 2131895798(0x7f1225f6, float:1.942644E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r2 = r0.getString(r1)
        L_0x00bd:
            X.08S r1 = r4.A01
            r0 = 2
            r1.A0E(r0)
            X.08S r0 = r4.A01
            r0.A0F(r2)
            android.os.Handler r3 = r4.A00
            X.0lh r2 = new X.0lh
            r2.<init>(r4, r6, r5)
            android.content.Context r1 = r4.A1D()
            if (r1 == 0) goto L_0x00de
            java.lang.String r0 = android.os.Build.MODEL
            boolean r1 = A00(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x00e0
        L_0x00de:
            r0 = 2000(0x7d0, float:2.803E-42)
        L_0x00e0:
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A1N(int, java.lang.CharSequence):void");
    }
}
