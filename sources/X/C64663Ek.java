package X;

import android.util.Base64;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Ek  reason: invalid class name and case insensitive filesystem */
public class C64663Ek implements AnonymousClass49X {
    public final C56972sr A00;
    public final C613730l A01;
    public final C56612sH A02;
    public final C621133n A03;
    public final C623934v A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;

    public static Integer A00(int i) {
        if (!(i == 0 || i == 1)) {
            if (!(i == 2 || i == 3)) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static Integer A01(int i) {
        int i2 = 1;
        if (i != 0) {
            int i3 = 5;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            i3 = 6;
                            if (i != 5) {
                                return null;
                            }
                        }
                    }
                }
            }
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(i2);
    }

    public static Integer A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -849492943:
                    if (str.equals("regular_low")) {
                        return 2;
                    }
                    break;
                case -564602779:
                    if (str.equals("regular_high")) {
                        return 3;
                    }
                    break;
                case -498584183:
                    if (str.equals("critical_unblock_low")) {
                        return C18290x4.A0c();
                    }
                    break;
                case 207170541:
                    if (str.equals("critical_block")) {
                        return 4;
                    }
                    break;
                case 1086463900:
                    if (str.equals("regular")) {
                        return 1;
                    }
                    break;
            }
        }
        return null;
    }

    public static final String A04(C47932e4 r7, C47932e4 r8) {
        String str;
        if (r7 == null) {
            str = "SyncStatsManager/createBootstrapSessionId companionKey is null";
        } else if (r8 == null) {
            str = "SyncStatsManager/createBootstrapSessionId primaryKey is null";
        } else {
            try {
                MessageDigest A0t = AnonymousClass0x7.A0t();
                byte[] bArr = r8.A00.A01;
                byte[] bArr2 = r7.A00.A01;
                byte[][] bArr3 = new byte[3][];
                bArr3[0] = bArr;
                bArr3[1] = new byte[]{95};
                return Base64.encodeToString(A0t.digest(AnonymousClass36A.A04(bArr2, bArr3, 2)), 2);
            } catch (NoSuchAlgorithmException e) {
                Log.e("sync-stats-manager/createBootstrapSessionId unable to create id because sha256 instance could not created.", e);
                return null;
            }
        }
        Log.w(str);
        return null;
    }

    public static final Integer A02(long j) {
        int i;
        if (j == 0) {
            i = 1;
        } else if (j == 1) {
            i = 2;
        } else if (j < 10) {
            i = 3;
        } else if (j < 100) {
            i = 4;
        } else if (j < 500) {
            i = 5;
        } else if (j < 1000) {
            i = 6;
        } else {
            i = 8;
            if (j < 5000) {
                i = 7;
            }
        }
        return Integer.valueOf(i);
    }

    public static void A05(C64663Ek r0, AnonymousClass3ZG r1) {
        r0.A06.BhD(r1);
    }

    public C51442jp A06(C47932e4 r6, String str) {
        String A042 = A04(r6, this.A03.A00.A04().A01);
        String str2 = null;
        if (str != null) {
            PhoneUserJid A043 = C56972sr.A04(this.A00);
            if (A043 == null) {
                Log.e("sync-stats-manager/createMDRegAttemptId myUserJid is null");
            } else {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(A043.user);
                    str2 = C18290x4.A0t(instance.digest(AnonymousClass000.A0V("_", str, A0o).getBytes()));
                } catch (NoSuchAlgorithmException e) {
                    Log.e("sync-stats-manager/createMDRegAttemptId unable to create id because sha256 instance could not created.", e);
                }
            }
        }
        if (A042 == null || str2 == null) {
            return null;
        }
        return new C51442jp(A042, str2);
    }

    public void A07(int i) {
        if (this.A05.A0Y(C58422vE.A02, 624)) {
            AnonymousClass1WX r1 = new AnonymousClass1WX();
            r1.A00 = Integer.valueOf(i);
            A05(this, r1);
        }
    }

    public void A08(int i, String str) {
        AnonymousClass1XS r1 = new AnonymousClass1XS();
        r1.A01 = Integer.valueOf(i);
        r1.A00 = A03(str);
        A05(this, r1);
    }

    public final void A09(C51442jp r3, int i) {
        AnonymousClass1Z3 r1 = new AnonymousClass1Z3();
        r1.A00 = Integer.valueOf(i);
        r1.A03 = r3.A01;
        r1.A02 = r3.A00;
        r1.A01 = C56612sH.A09(this.A02);
        A05(this, r1);
    }

    public void A0A(C51442jp r5, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
        if (r5 != null) {
            C25761b2 r1 = new C25761b2();
            r1.A06 = Long.valueOf(j2);
            r1.A07 = Long.valueOf(j3);
            r1.A08 = Long.valueOf(j4);
            r1.A01 = Integer.valueOf(i3);
            r1.A0C = r5.A01;
            r1.A0B = r5.A00;
            r1.A0A = C56612sH.A09(this.A02);
            int i4 = 1;
            if (i3 != 1) {
                i4 = 2;
            }
            r1.A03 = Integer.valueOf(i4);
            r1.A00 = A01(i);
            r1.A02 = A00(i);
            r1.A05 = Long.valueOf(j);
            r1.A09 = C18320x8.A0Y(TimeUnit.MILLISECONDS, j5);
            r1.A04 = AnonymousClass0x9.A0m(i2);
            A05(this, r1);
        }
    }

    public void A0B(C51442jp r4, int i, int i2, long j, boolean z, boolean z2) {
        if (r4 != null) {
            C25621ao r2 = new C25621ao();
            r2.A09 = r4.A01;
            r2.A08 = r4.A00;
            r2.A07 = C56612sH.A09(this.A02);
            int i3 = 2;
            r2.A03 = 2;
            if (z) {
                i3 = 1;
            }
            r2.A04 = Integer.valueOf(i3);
            r2.A01 = A01(i);
            r2.A02 = A00(i);
            r2.A06 = Long.valueOf(j);
            r2.A00 = Boolean.valueOf(z2);
            r2.A05 = AnonymousClass0x9.A0m(i2);
            A05(this, r2);
        }
    }

    public void A0C(C51442jp r3, int i, long j, long j2, boolean z) {
        C25211a9 r1 = new C25211a9();
        r1.A06 = r3.A01;
        r1.A05 = r3.A00;
        r1.A04 = C56612sH.A09(this.A02);
        r1.A02 = Long.valueOf(j);
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(C18280x3.A01(z ? 1 : 0));
        r1.A03 = Long.valueOf(j2);
        A05(this, r1);
    }

    public void A0D(C51442jp r4, int i, boolean z) {
        C25621ao r2 = new C25621ao();
        r2.A09 = r4.A01;
        r2.A08 = r4.A00;
        r2.A07 = C56612sH.A09(this.A02);
        int i2 = 1;
        r2.A03 = 1;
        if (!z) {
            i2 = 2;
        }
        r2.A04 = Integer.valueOf(i2);
        r2.A02 = Integer.valueOf(i);
        A05(this, r2);
    }

    public void A0E(C30301mE r8, int i) {
        if (r8 instanceof AnonymousClass1nO) {
            AnonymousClass1nO r82 = (AnonymousClass1nO) r8;
            String str = r82.A0H;
            String str2 = r82.A0G;
            int i2 = r82.A03;
            int i3 = 1;
            boolean A1U = AnonymousClass000.A1U(i, -1);
            if (str != null && str2 != null) {
                C25531af r3 = new C25531af();
                r3.A08 = str;
                r3.A07 = str2;
                r3.A01 = A00(i2);
                r3.A06 = C56612sH.A09(this.A02);
                if (!A1U) {
                    i3 = 2;
                }
                r3.A02 = Integer.valueOf(i3);
                if (!A1U) {
                    r3.A05 = AnonymousClass0x9.A0m(i);
                }
                Integer A012 = A01(i2);
                r3.A00 = A012;
                int intValue = A012.intValue();
                if (intValue == 2 || intValue == 3) {
                    r3.A04 = AnonymousClass0x9.A0m(r82.A01);
                }
                r3.A03 = AnonymousClass0x9.A0m(r82.A00);
                A05(this, r3);
            }
        }
    }

    public void BSh(C30301mE r18) {
        C30301mE r2 = r18;
        if (r2 instanceof AnonymousClass1nO) {
            AnonymousClass1nO r22 = (AnonymousClass1nO) r2;
            String str = r22.A0H;
            String str2 = r22.A0G;
            if (str != null && str2 != null) {
                long j = r22.A04;
                long j2 = r22.A07;
                long j3 = r22.A05;
                long j4 = r22.A0A;
                int i = r22.A00;
                A0A(new C51442jp(str, str2), r22.A03, i, 1, (long) r22.A01, j, j2, j3, j4);
            }
        }
    }

    public C64663Ek(C56972sr r1, C28931i0 r2, C613730l r3, C56612sH r4, C621133n r5, C623934v r6, AnonymousClass1VX r7, AnonymousClass4FV r8) {
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r1;
        this.A06 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        r2.A06(this);
    }
}
