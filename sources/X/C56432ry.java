package X;

import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.fieldstats.privatestats.PrivateStatsWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.2ry  reason: invalid class name and case insensitive filesystem */
public class C56432ry {
    public NativeVOPRFExtension A00;
    public final C66663Mh A01;
    public final C29411im A02;
    public final C56612sH A03;
    public final C49532gg A04;
    public final C55712qn A05;
    public final AnonymousClass3TG A06;
    public final AnonymousClass4FS A07;
    public final C34171uL A08;
    public volatile int A09 = 0;
    public volatile long A0A;
    public volatile long A0B;
    public volatile String A0C;
    public volatile boolean A0D;
    public volatile boolean A0E = false;
    public volatile byte[] A0F;

    public synchronized void A01() {
        if (!A07() && !this.A0D) {
            C55712qn r9 = this.A05;
            int A032 = C18310x6.A03(r9.A00(), "redeem_count");
            long A002 = C56612sH.A00(this.A03) - r9.A00().getLong("base_timestamp", 0);
            if (A032 < 0 || A032 >= 512 || A002 >= r9.A00().getLong("time_to_live", 0)) {
                Log.d("PrivateStatsToken/genNextTokenIfNedded no vaild token gen a new one");
                this.A0D = true;
                A05(false);
            } else {
                C66663Mh r3 = this.A01;
                int A033 = r3.A03(C66663Mh.A09);
                long A034 = (long) r3.A03(C66663Mh.A08);
                if (A032 >= A033 || A002 > r9.A00().getLong("time_to_live", 0) - A034) {
                    Log.d("PrivateStatsToken/genNextTokenIfNedded pre-compute next token");
                    this.A0D = true;
                    A05(true);
                }
            }
        }
    }

    public final synchronized void A02() {
        Log.d("PrivateStatsToken/resetTokens");
        this.A0C = null;
        this.A0F = null;
        this.A09 = 0;
        this.A0E = false;
        this.A0D = false;
        C55712qn r3 = this.A05;
        r3.A05("original_token", (String) null);
        r3.A05("next_original_token", (String) null);
        r3.A04("base_timestamp", 0);
        r3.A04("time_to_live", 0);
        r3.A05("blinding_factor", (String) null);
        r3.A02(-1);
        r3.A05("shared_secret", (String) null);
        if (r3.A00().getInt("first_token_stage", 0) == 1) {
            r3.A01(0);
        }
    }

    public final synchronized void A04(int i) {
        if (!this.A0D) {
            this.A0D = true;
            C18260x0.A0y("PrivateStatsToken/doCreateFirstToken!!--->about to create 1st token: ", AnonymousClass001.A0o(), i);
            A05(false);
        }
    }

    public final synchronized void A06(boolean z, int i) {
        Log.d("PrivateStatsToken/abortGeneratingTokens");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A04.A01(i, elapsedRealtime - this.A0A, elapsedRealtime - this.A0B, (long) this.A09);
        this.A0D = false;
        C55712qn r2 = this.A05;
        r2.A05("blinding_factor", (String) null);
        if (this.A0E) {
            r2.A05("next_original_token", (String) null);
        } else {
            r2.A05("original_token", (String) null);
        }
        this.A0E = false;
        this.A0F = null;
        if (!z) {
            this.A0C = null;
            this.A09 = 0;
        }
        if (r2.A00().getInt("first_token_stage", 0) == 1) {
            r2.A01(0);
        }
    }

    public int A00() {
        C55712qn r4 = this.A05;
        int i = r4.A00().getInt("first_token_stage", 0);
        if (i == 1) {
            synchronized (this) {
                if (this.A0D) {
                    return 15;
                }
                return 2;
            }
        } else if (i != 0) {
            return r4.A00().getInt("token_not_ready_reason", 0);
        } else {
            return 2;
        }
    }

    public final void A03(int i) {
        if (this.A09 < 2) {
            this.A09++;
            this.A07.Bkn(new C69993Zl(this, 27), "PrivateStatstoken/retry", ((long) this.A09) * C625635p.A0L * ((long) this.A09));
            return;
        }
        C55712qn r2 = this.A05;
        int i2 = 10;
        if (i == 5) {
            i2 = 9;
        }
        r2.A03(i2);
        A06(false, i);
    }

    public void A05(boolean z) {
        NativeVOPRFExtension nativeVOPRFExtension = this.A00;
        if (nativeVOPRFExtension == null) {
            nativeVOPRFExtension = new NativeVOPRFExtension();
            this.A00 = nativeVOPRFExtension;
        }
        byte[] bArr = new byte[32];
        C44022Uj r4 = nativeVOPRFExtension.A00;
        r4.A00(bArr);
        byte[] bArr2 = null;
        int i = 0;
        while (i < 256) {
            bArr2 = new byte[32];
            r4.A00(bArr2);
            bArr2[31] = (byte) (bArr2[31] & 31);
            if (nativeVOPRFExtension.A00(bArr2)) {
                break;
            }
            i++;
        }
        if (i >= 256) {
            Log.w("PrivateStatsToken/generateCredentialToken cannot generate valid blindingFactor");
            this.A05.A03(5);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            byte[] A022 = nativeVOPRFExtension.A02(bArr, bArr2, 32);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (A022 == null) {
                Log.e("PrivateStatsToken/generateCredentialToken failed to blind the token");
                this.A05.A03(7);
            } else {
                C49532gg r42 = this.A04;
                AnonymousClass1XZ r1 = new AnonymousClass1XZ();
                r1.A00 = 1;
                r1.A01 = Long.valueOf(elapsedRealtime2 - elapsedRealtime);
                r42.A03.BhD(r1);
                synchronized (this) {
                    this.A0E = z;
                    this.A0F = A022;
                    if (z) {
                        C55712qn r2 = this.A05;
                        r2.A05("next_original_token", Base64.encodeToString(bArr, 10));
                        r2.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                    } else {
                        C55712qn r43 = this.A05;
                        r43.A05("original_token", Base64.encodeToString(bArr, 10));
                        r43.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                        r43.A05("shared_secret", (String) null);
                        r43.A02(-1);
                        r43.A04("base_timestamp", 0);
                        r43.A04("time_to_live", 0);
                    }
                    this.A09 = 0;
                    this.A0A = SystemClock.elapsedRealtime();
                    this.A0B = this.A0A;
                    if (AnonymousClass000.A1U(this.A02.A04, 2)) {
                        this.A0C = this.A06.A00(this.A0F);
                    } else {
                        A03(5);
                    }
                }
                return;
            }
        }
        A06(true, 4);
    }

    public final boolean A07() {
        C55712qn r7 = this.A05;
        int A022 = C18280x3.A02(r7.A00(), "first_token_stage");
        if (A022 != 2) {
            int A032 = this.A01.A03(C66663Mh.A06);
            if (A032 <= 30) {
                Log.d("PrivateStatsToken/delayForFirstTokenIfNeeded randomizing 1st token request is disabled");
                r7.A01(2);
            } else {
                long j = r7.A00().getLong("first_token_delay_time", 0);
                if (A022 == 1) {
                    if (!this.A0D) {
                        C56612sH r5 = this.A03;
                        if (r5.A0H() / 1000 > j + r7.A00().getLong("first_token_request_timestamp", 0) + 300) {
                            C72333dY.A01(this.A08).A0B("name.com.whatsapp.privatestats.firsttoken");
                            Log.i("PrivateStatsToken/delayForFirstTokenIfNeeded cancelled the work");
                            A04(2);
                        } else {
                            r5.A0H();
                            return true;
                        }
                    }
                    return true;
                } else if (A022 == 0) {
                    long nextInt = ((long) AnonymousClass0x9.A1C().nextInt(A032 - 30)) + 30;
                    C18260x0.A12("PrivateStatsToken/delayForFirstToken-->delay timesec= ", AnonymousClass001.A0o(), nextInt);
                    r7.A04("first_token_delay_time", nextInt);
                    r7.A04("first_token_request_timestamp", this.A03.A0H() / 1000);
                    r7.A01(1);
                    AnonymousClass0Aw r1 = new AnonymousClass0Aw(PrivateStatsWorker.class);
                    r1.A02(nextInt, TimeUnit.SECONDS);
                    C72333dY.A01(this.A08).A07(C02320Fs.REPLACE, AnonymousClass0x9.A0I(r1), "name.com.whatsapp.privatestats.firsttoken");
                    return true;
                }
            }
        }
        return false;
    }

    public C56432ry(C66663Mh r2, C29411im r3, C56612sH r4, C49532gg r5, C55712qn r6, AnonymousClass3TG r7, AnonymousClass4FS r8, C34171uL r9) {
        this.A03 = r4;
        this.A07 = r8;
        this.A0D = false;
        this.A01 = r2;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        r7.A00 = this;
    }
}
