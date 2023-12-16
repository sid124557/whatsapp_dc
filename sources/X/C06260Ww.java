package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0Ww  reason: invalid class name and case insensitive filesystem */
public class C06260Ww {
    public AnonymousClass0Y7 A00;
    public C26041bU A01;
    public C25911bH A02;
    public String A03;
    public final C55682qk A04;
    public final C56492s4 A05;
    public final AnonymousClass0U8 A06;
    public final AnonymousClass0WN A07;
    public final C10240hc A08;
    public final AnonymousClass0F1 A09;
    public final AnonymousClass0QJ A0A;
    public final C10230hb A0B;
    public final AnonymousClass0QR A0C;
    public final C04710Qi A0D = new AnonymousClass0w3(this, 1);
    public final C04710Qi A0E = new AnonymousClass0w3(this, 2);
    public final AnonymousClass5PA A0F;
    public final C29441ip A0G;
    public final AnonymousClass310 A0H;
    public final C54292oU A0I;
    public final AnonymousClass5ZR A0J;
    public final AnonymousClass33p A0K;
    public final AnonymousClass1VX A0L;
    public final AnonymousClass306 A0M;
    public final AnonymousClass3FI A0N;
    public final AnonymousClass4FS A0O;
    public final Object A0P = AnonymousClass002.A0D();

    public static /* synthetic */ void A01(C06260Ww r1) {
        C10240hc r0 = r1.A08;
        r0.A0R();
        r0.A0Q();
        r0.A0W();
        r1.A09.A08();
    }

    public static /* synthetic */ void A02(C06260Ww r1) {
        C10240hc r0 = r1.A08;
        r0.A0R();
        r0.A0Q();
        r0.A0W();
        r1.A09.A0D();
        r1.A0K.A17(0);
    }

    public AnonymousClass0Y7 A03() {
        AnonymousClass0Y7 r0;
        synchronized (this.A0P) {
            r0 = this.A00;
        }
        return r0;
    }

    public AnonymousClass0Y7 A04(String str, String str2) {
        AnonymousClass0Y7 r2;
        synchronized (this.A0P) {
            Context A062 = this.A0I.A06();
            AnonymousClass1VX r12 = this.A0L;
            C55682qk r4 = this.A04;
            AnonymousClass3FI r14 = this.A0N;
            C56492s4 r5 = this.A05;
            AnonymousClass310 r10 = this.A0H;
            r2 = new AnonymousClass0Y7(A062, r4, r5, this.A06, this.A07, this.A0C, this.A0G, r10, this.A0J, r12, this.A0M, r14, this.A0O, str, str2);
            this.A00 = r2;
        }
        return r2;
    }

    public C26041bU A05() {
        C26041bU r0;
        synchronized (this.A0P) {
            r0 = this.A01;
        }
        return r0;
    }

    public C26041bU A06(boolean z) {
        C26041bU r0;
        synchronized (this.A0P) {
            C26041bU r1 = new C26041bU();
            this.A01 = r1;
            r1.A0W = AnonymousClass001.A0f();
            AnonymousClass33p r2 = this.A0K;
            r1.A0X = Integer.valueOf(C06540Yd.A00(r2, z));
            this.A01.A0T = Integer.valueOf(r2.A06());
            r0 = this.A01;
        }
        return r0;
    }

    public C25911bH A07() {
        C25911bH r0;
        synchronized (this.A0P) {
            r0 = this.A02;
            if (r0 == null) {
                r0 = new C25911bH();
                this.A02 = r0;
            }
        }
        return r0;
    }

    public void A08() {
        synchronized (this.A0P) {
            AnonymousClass0Y7 r0 = this.A00;
            if (r0 != null) {
                r0.A0E();
            }
        }
        this.A0F.A00(2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r6 = this;
            java.lang.String r0 = "gdrive-service/cancel-pending-backup-and-restore-if-any"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r3 = r6.A0K
            boolean r0 = X.C06540Yd.A0J(r3)
            java.lang.String r5 = "gdrive-service/drive-api/null"
            r2 = 0
            if (r0 != 0) goto L_0x008e
            X.0hc r1 = r6.A08
            boolean r0 = r1.A0b()
            if (r0 != 0) goto L_0x008e
            boolean r0 = X.C06540Yd.A0K(r3)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "gdrive-service/cancel setting is_media_restore_running to false."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A0y(r2)
            r1.A0K()
            X.0Y7 r0 = r6.A03()
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "gdrive-service/cancel-media-restore/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A08()
            r1.A0J()
            r1.A0G()
            X.0F1 r0 = r6.A09
            r0.A0D()
        L_0x0042:
            r3.A17(r2)
        L_0x0045:
            r0 = 10
            r6.A0C(r0)
            boolean r0 = r3.A2C()
            if (r0 == 0) goto L_0x0053
            r3.A1p(r2)
        L_0x0053:
            return
        L_0x0054:
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r1.A0J()
            r1.A0G()
            X.4FS r1 = r6.A0O
            X.0ji r0 = new X.0ji
            r0.<init>(r6)
            r1.BkM(r0)
            goto L_0x0045
        L_0x0068:
            boolean r0 = X.C06540Yd.A0L(r3)
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "gdrive-service/cancel/message-restore"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A0z(r2)
            r1.A0K()
            r6.A08()
            r1.A0I()
            r1.A0F()
            X.0hb r0 = r6.A0B
            r0.A0F()
            goto L_0x0042
        L_0x0088:
            java.lang.String r0 = "gdrive-service/cancel/nothing-to-cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0045
        L_0x008e:
            java.lang.String r0 = "gdrive-service/cancel setting is_backup_running to false."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0hc r4 = r6.A08
            r4.A0w(r2)
            X.AnonymousClass0X8.A03()
            r4.A0K()
            X.0Y7 r0 = r6.A03()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "gdrive-service/cancel-backup/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A08()
            r4.A0H()
            r4.A0E()
        L_0x00b2:
            X.0hb r0 = r6.A0B
            r0.A0F()
            r4.A0T()
            goto L_0x0042
        L_0x00bb:
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r4.A0H()
            r4.A0E()
            X.4FS r1 = r6.A0O
            X.0jh r0 = new X.0jh
            r0.<init>(r6)
            r1.BkM(r0)
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06260Ww.A09():void");
    }

    public void A0B() {
        synchronized (this.A0P) {
            this.A01 = null;
        }
    }

    public void A0A() {
        C06540Yd.A07(A03(), this.A0F, false);
    }

    public void A0C(int i) {
        String str;
        C55682qk r2;
        StringBuilder A0l;
        String str2;
        String A022 = AnonymousClass0YV.A02(i);
        if (i != 10) {
            TextUtils.join("\n", Thread.currentThread().getStackTrace());
            Log.e(AnonymousClass000.A0V("gdrive-service/set-error/", A022, AnonymousClass001.A0o()));
        }
        AnonymousClass33p r9 = this.A0K;
        r9.A15(i);
        synchronized (this.A0P) {
            str = this.A03;
        }
        if (str != null) {
            if (C06540Yd.A0K(r9) && !"action_restore_media".equals(str)) {
                C626936e.A0D(false, AnonymousClass000.A0X(") during media restore", AnonymousClass000.A0m("gdrive-service/set-error/unexpected action(", str)));
                r2 = this.A04;
                A0l = AnonymousClass000.A0l(str);
                str2 = " during media restore";
            } else if (C06540Yd.A0L(r9) && !"action_restore".equals(str)) {
                C626936e.A0D(false, AnonymousClass000.A0X(") during messages restore", AnonymousClass000.A0m("gdrive-service/set-error/unexpected action(", str)));
                r2 = this.A04;
                A0l = AnonymousClass000.A0l(str);
                str2 = " during messages restore";
            } else if (C06540Yd.A0J(r9) && !"action_backup".equals(str)) {
                C626936e.A0D(false, AnonymousClass000.A0X(") during backup", AnonymousClass000.A0m("gdrive-service/set-error/unexpected action(", str)));
                r2 = this.A04;
                A0l = AnonymousClass000.A0l(str);
                str2 = " during backup";
            }
            r2.A0A("gdrive-service/set-error/unexpected-action", true, AnonymousClass000.A0X(str2, A0l));
        }
        if (C06540Yd.A0K(r9) || "action_restore_media".equals(str)) {
            this.A09.A0J(i, this.A0A.A00());
            A07().A0A = Integer.valueOf(AnonymousClass0YV.A00(i));
        } else if (C06540Yd.A0L(r9) || "action_restore".equals(str)) {
            this.A09.A0K(i, this.A0A.A00());
        } else {
            if (C06540Yd.A0J(r9) || "action_backup".equals(str)) {
                C26041bU A052 = A05();
                if (A052 != null && A052.A0U == null) {
                    A052.A0U = Integer.valueOf(AnonymousClass0YV.A00(i));
                }
            } else if (str != null) {
                if (i != 10) {
                    Log.e(AnonymousClass000.A0V("gdrive-service/set-error/unexpected-service-start-action/", str, AnonymousClass001.A0o()));
                    return;
                }
                return;
            } else if (i != 10) {
                Log.e("gdrive-service/set-error/unexpected-service-start-action/null", new Throwable());
                return;
            } else {
                Log.i("gdrive-service/set-error/action-is-null and nothing is pending (probably backup attempt failed)");
            }
            this.A09.A0I(i, this.A0A.A00());
        }
    }

    public C06260Ww(C55682qk r3, C56492s4 r4, AnonymousClass0U8 r5, AnonymousClass0WN r6, C10240hc r7, AnonymousClass0F1 r8, AnonymousClass0QJ r9, C10230hb r10, AnonymousClass0QR r11, AnonymousClass5PA r12, C29441ip r13, AnonymousClass310 r14, C54292oU r15, AnonymousClass5ZR r16, AnonymousClass33p r17, AnonymousClass1VX r18, AnonymousClass306 r19, AnonymousClass3FI r20, AnonymousClass4FS r21) {
        this.A0I = r15;
        this.A0L = r18;
        this.A04 = r3;
        this.A0N = r20;
        this.A0O = r21;
        this.A05 = r4;
        this.A0H = r14;
        this.A0F = r12;
        this.A07 = r6;
        this.A0C = r11;
        this.A0J = r16;
        this.A0K = r17;
        this.A0M = r19;
        this.A06 = r5;
        this.A0G = r13;
        this.A08 = r7;
        this.A09 = r8;
        this.A0B = r10;
        this.A0A = r9;
    }
}
