package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0WN;
import X.AnonymousClass1WE;
import X.AnonymousClass1XF;
import X.AnonymousClass317;
import X.AnonymousClass31C;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.C001401u;
import X.C03580Kt;
import X.C03590Ku;
import X.C05550Ty;
import X.C06270Wx;
import X.C106755a7;
import X.C11320jS;
import X.C11330jT;
import X.C11340jU;
import X.C12190l9;
import X.C18170wr;
import X.C376223j;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Locale;

public class EncBackupViewModel extends C05550Ty {
    public CountDownTimer A00;
    public final AnonymousClass08M A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass08M A04 = new AnonymousClass08M(AnonymousClass001.A0f());
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final AnonymousClass08M A06 = new AnonymousClass08M(0);
    public final AnonymousClass08M A07 = AnonymousClass08M.A01();
    public final AnonymousClass08M A08 = new AnonymousClass08M(0L);
    public final AnonymousClass08M A09 = AnonymousClass08M.A01();
    public final AnonymousClass08M A0A;
    public final AnonymousClass0WN A0B;
    public final C620633i A0C;
    public final AnonymousClass33p A0D;
    public final C620733j A0E;
    public final AnonymousClass4FV A0F;
    public final AnonymousClass31C A0G;
    public final AnonymousClass317 A0H;
    public final AnonymousClass4FS A0I;

    public void A0L() {
        AnonymousClass08M r1;
        int i;
        A0S(2);
        int i2 = 300;
        if (this.A0D.A2F()) {
            C06270Wx.A03(this.A09, 6);
            if (!A0b()) {
                r1 = this.A03;
                i = 203;
            }
            r1 = this.A03;
            r1.A0H(i2);
        }
        C06270Wx.A03(this.A09, 5);
        if (!A0b()) {
            r1 = this.A03;
            i = 202;
        }
        r1 = this.A03;
        r1.A0H(i2);
        i2 = Integer.valueOf(i);
        r1.A0H(i2);
    }

    public void A0M() {
        AnonymousClass08M r1;
        int i;
        A0S(3);
        C06270Wx.A03(this.A09, 4);
        boolean A2F = this.A0D.A2F();
        int i2 = 302;
        boolean A0b = A0b();
        if (A2F) {
            if (!A0b) {
                r1 = this.A03;
                i = 203;
            }
            r1 = this.A03;
            r1.A0H(i2);
        }
        if (!A0b) {
            r1 = this.A03;
            i = 202;
        }
        r1 = this.A03;
        r1.A0H(i2);
        i2 = Integer.valueOf(i);
        r1.A0H(i2);
    }

    public final void A0U(int i) {
        AnonymousClass08M r1;
        int i2;
        if (i == 0) {
            C06270Wx.A04(this.A04, 3);
            if (A0E() == 1) {
                Log.i("encb/EncBackupViewModel/enabled encrypted backup");
                A0R(5);
                r1 = this.A07;
                i2 = -1;
            } else {
                Log.i("encb/EncBackupViewModel/successfully re-registered with the hsm");
                r1 = this.A03;
                i2 = 502;
            }
        } else if (i == 3) {
            Log.e("encb/EncBackupViewModel/failed to enable encrypted backup due to a connection error");
            r1 = this.A04;
            i2 = 8;
        } else {
            Log.e("encb/EncBackupViewModel/failed to enable encrypted backup due to a server error");
            r1 = this.A04;
            i2 = 4;
        }
        C06270Wx.A04(r1, i2);
    }

    public final void A0W(int i, int i2, int i3) {
        String str;
        AnonymousClass08M r3;
        int i4;
        int i5;
        if (i == 0) {
            Log.i("encb/EncBackupViewModel/successfully retrieved and saved backup key");
            C06270Wx.A04(this.A04, 3);
            r3 = this.A07;
            i5 = -1;
        } else if (i == 404) {
            Log.i("encb/EncBackupViewModel/account not found");
            r3 = this.A04;
            i5 = 7;
        } else if (i == 8) {
            Log.i("encb/EncBackupViewModel/invalid password");
            C06270Wx.A04(this.A06, i2);
            if (i3 > 0) {
                long j = ((long) i3) * 1000;
                A0T(4);
                this.A08.A0G(Long.valueOf(j));
                C001401u r0 = new C001401u(this, j);
                this.A00 = r0;
                r0.start();
            }
            r3 = this.A04;
            i5 = 5;
        } else {
            if (i == 408) {
                Log.i("encb/EncBackupViewModel/request timeout");
                if (i3 > 0) {
                    long j2 = ((long) i3) * 1000;
                    A0T(4);
                    this.A08.A0G(Long.valueOf(j2));
                    C001401u r02 = new C001401u(this, j2);
                    this.A00 = r02;
                    r02.start();
                    r3 = this.A04;
                    i5 = 6;
                } else {
                    str = "encb/EncBackupViewModel/request timeout returned from server without timeout value";
                }
            } else if (i == 3) {
                Log.e("encb/EncBackupViewModel/failed to retrieve and save backup key due to a connection error");
                r3 = this.A04;
                i4 = 8;
                r3.A0G(i4);
            } else {
                str = "encb/EncBackupViewModel/failed to retrieve and save backup key due to a server error";
            }
            Log.e(str);
            r3 = this.A04;
            i4 = 4;
            r3.A0G(i4);
        }
        i4 = Integer.valueOf(i5);
        r3.A0G(i4);
    }

    public final void A0a(boolean z) {
        AnonymousClass08M r0;
        int i = 5;
        if (z) {
            Log.i("encb/EncBackupViewModel/successfully verified password");
            this.A0A.A0G(Boolean.TRUE);
            this.A0D.A1C(5);
            int A0E2 = A0E();
            if (A0E2 == 4) {
                C06270Wx.A04(this.A04, 3);
                A0S(4);
                r0 = this.A03;
                i = 302;
            } else if (A0E2 != 5) {
                A0J();
                return;
            } else {
                C06270Wx.A04(this.A04, 3);
                A0S(4);
                r0 = this.A03;
                i = 300;
            }
        } else {
            Log.i("encb/EncBackupViewModel/invalid password");
            AnonymousClass33p r2 = this.A0D;
            int A0D2 = r2.A0D() - 1;
            if (A0D2 <= 0) {
                this.A0B.A01.A05();
            }
            r2.A1C(A0D2);
            C06270Wx.A04(this.A06, A0D2);
            r0 = this.A04;
        }
        C06270Wx.A04(r0, i);
    }

    public static /* synthetic */ void A00(EncBackupViewModel encBackupViewModel) {
        try {
            encBackupViewModel.A0G.A08(32000);
        } catch (C376223j e) {
            Log.w("encb/EncBackupViewModel/Failed to connect to chatd", e);
            encBackupViewModel.A0W(6, -1, 0);
        }
        AnonymousClass0WN r3 = encBackupViewModel.A0B;
        Object A072 = encBackupViewModel.A05.A07();
        C626936e.A06(A072);
        r3.A08(new C18170wr(encBackupViewModel, 0), (String) A072);
    }

    public static /* synthetic */ void A01(EncBackupViewModel encBackupViewModel) {
        AnonymousClass0WN r2 = encBackupViewModel.A0B;
        Object A072 = encBackupViewModel.A05.A07();
        C626936e.A06(A072);
        r2.A0B(new C03580Kt(encBackupViewModel), (String) A072);
    }

    public int A0D() {
        Object A072 = this.A06.A07();
        C626936e.A06(A072);
        return AnonymousClass001.A0K(A072);
    }

    public int A0E() {
        Object A072 = this.A09.A07();
        C626936e.A06(A072);
        return AnonymousClass001.A0K(A072);
    }

    public long A0F() {
        AnonymousClass33p r1 = this.A0D;
        String A0X = r1.A0X();
        if (A0X != null) {
            return r1.A0Q(A0X);
        }
        return 0;
    }

    public long A0G() {
        AnonymousClass33p r1 = this.A0D;
        String A0X = r1.A0X();
        if (A0X != null) {
            return r1.A0S(A0X);
        }
        return 0;
    }

    public void A0H() {
        ClipboardManager A0C2 = this.A0C.A0C();
        String str = (String) this.A02.A07();
        if (A0C2 != null && str != null) {
            A0C2.setPrimaryClip(ClipData.newPlainText(str, str));
        }
    }

    public void A0I() {
        this.A0B.A05();
        Log.i("encb/EncBackupViewModel//encrypted backup disabled");
        C06270Wx.A03(this.A03, 402);
    }

    public void A0J() {
        AnonymousClass08M r1 = this.A01;
        if (r1.A07() == null || !AnonymousClass001.A1Z(r1.A07())) {
            C06270Wx.A04(this.A04, 2);
            AnonymousClass0WN r2 = this.A0B;
            Object A072 = this.A05.A07();
            C626936e.A06(A072);
            r2.A0C(new C03590Ku(this), (String) A072);
            return;
        }
        this.A0B.A07();
        A0R(5);
        C06270Wx.A04(this.A07, -1);
    }

    public void A0K() {
        ClipData primaryClip;
        C620633i r6 = this.A0C;
        ClipboardManager A0C2 = r6.A0C();
        if (A0C2 != null && (primaryClip = A0C2.getPrimaryClip()) != null) {
            AnonymousClass08M r5 = this.A02;
            String str = (String) r5.A07();
            String replace = primaryClip.getItemAt(0).getText().toString().replaceAll("\\s", "").toLowerCase(Locale.US).replace(1089, 'c');
            if (!TextUtils.isEmpty(str) && replace.length() != 64) {
                if (str != null) {
                    replace = AnonymousClass000.A0V(str.replaceAll("\\s", ""), replace, AnonymousClass001.A0o());
                    if (replace.length() > 64) {
                        C106755a7.A03(r6);
                        return;
                    }
                } else {
                    return;
                }
            }
            r5.A0H(replace);
        }
    }

    public void A0N() {
        String str = (String) this.A02.A07();
        if (str == null) {
            return;
        }
        if (A0E() == 2) {
            this.A0B.A09(new C18170wr(this, 1), str);
        } else {
            A0Y(str);
        }
    }

    public void A0O() {
        boolean A0G2 = this.A0H.A0G();
        AnonymousClass08M r1 = this.A04;
        if (!A0G2) {
            C06270Wx.A03(r1, 4);
            return;
        }
        C06270Wx.A03(r1, 2);
        this.A0I.BkM(new C11340jU(this));
    }

    public void A0P() {
        this.A0I.BkM(new C11320jS(this));
    }

    public void A0Q() {
        AnonymousClass08M r1 = this.A04;
        C06270Wx.A03(r1, 2);
        if (this.A0B.A01.A00() != null) {
            this.A0I.BkM(new C11330jT(this));
            return;
        }
        Log.i("encb/EncBackupViewModel/no attempts remaining");
        C06270Wx.A04(r1, 7);
    }

    public void A0R(int i) {
        AnonymousClass1XF r1 = new AnonymousClass1XF();
        r1.A00 = Integer.valueOf(i);
        this.A0F.BhD(r1);
    }

    public void A0S(int i) {
        AnonymousClass1XF r1 = new AnonymousClass1XF();
        r1.A01 = Integer.valueOf(i);
        this.A0F.BhD(r1);
    }

    public void A0T(int i) {
        AnonymousClass1WE r1 = new AnonymousClass1WE();
        r1.A00 = Integer.valueOf(i);
        this.A0F.BhD(r1);
    }

    public final void A0V(int i) {
        if (i == 0) {
            Log.i("encb/EncBackupViewModel/successfully saved encryption key");
            C06270Wx.A04(this.A07, -1);
            return;
        }
        Log.e("encb/EncBackupViewModel/failed to save encryption key");
    }

    public void A0X(Bundle bundle) {
        C626936e.A0E(bundle.containsKey("user_action"), "getIntent().getExtras()[USER_ACTION_ARG] is required but is not present");
        int i = bundle.getInt("user_action");
        AnonymousClass08M r1 = this.A09;
        if (r1.A07() == null) {
            C06270Wx.A03(r1, i);
        }
        AnonymousClass08M r2 = this.A03;
        if (r2.A07() == null) {
            int i2 = 100;
            if (i != 1) {
                i2 = 103;
                if (i != 2) {
                    i2 = 102;
                    if (i != 3) {
                        if (i == 7 || i == 9) {
                            i2 = 104;
                        } else {
                            return;
                        }
                    }
                }
            }
            C06270Wx.A03(r2, i2);
        }
    }

    public final void A0Y(String str) {
        C06270Wx.A03(this.A04, 2);
        this.A0I.BkM(new C12190l9(this, str));
    }

    public void A0Z(boolean z) {
        AnonymousClass08M r1;
        int i;
        if (z) {
            Log.i("encb/EncBackupViewModel/successfully verified encryption key");
            this.A0A.A0G(Boolean.TRUE);
            C06270Wx.A04(this.A04, 3);
            A0S(4);
            if (A0E() == 4) {
                r1 = this.A03;
                i = 302;
            } else if (A0E() == 6) {
                r1 = this.A03;
                i = 300;
            } else {
                return;
            }
        } else {
            Log.i("encb/EncBackupViewModel/invalid encryption key");
            r1 = this.A04;
            i = 5;
        }
        C06270Wx.A04(r1, i);
    }

    public boolean A0b() {
        Object A072 = this.A0A.A07();
        C626936e.A06(A072);
        return AnonymousClass001.A1Z(A072);
    }

    public EncBackupViewModel(AnonymousClass0WN r3, C620633i r4, AnonymousClass33p r5, C620733j r6, AnonymousClass4FV r7, AnonymousClass31C r8, AnonymousClass317 r9, AnonymousClass4FS r10) {
        Boolean bool = Boolean.FALSE;
        this.A0A = new AnonymousClass08M(bool);
        this.A01 = new AnonymousClass08M(bool);
        this.A0I = r10;
        this.A0F = r7;
        this.A0G = r8;
        this.A0C = r4;
        this.A0E = r6;
        this.A0B = r3;
        this.A0H = r9;
        this.A0D = r5;
    }
}
