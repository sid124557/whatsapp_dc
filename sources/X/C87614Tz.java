package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4Tz  reason: invalid class name and case insensitive filesystem */
public class C87614Tz extends AnonymousClass08N implements AnonymousClass4CJ {
    public C108985dt A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass08M A06 = AnonymousClass08M.A01();
    public final AnonymousClass08M A07 = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A08 = AnonymousClass08M.A01();
    public final AnonymousClass08M A09 = AnonymousClass08M.A01();
    public final AnonymousClass08M A0A = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0B = AnonymousClass08M.A01();
    public final AnonymousClass08M A0C = AnonymousClass08M.A01();
    public final C116985rC A0D;
    public final C56972sr A0E;
    public final C105035Th A0F;
    public final C620433g A0G;
    public final C48372en A0H;
    public final C154197cm A0I;
    public final C104095Pq A0J;
    public final C105405Uu A0K;
    public final AnonymousClass5QB A0L;
    public final C105145Tt A0M;
    public final AnonymousClass5Y9 A0N;
    public final C104325Qn A0O;
    public final C104975Tb A0P;
    public final C55752qr A0Q;
    public final C56612sH A0R;
    public final AnonymousClass1VX A0S;
    public final UserJid A0T;
    public final C103115Lp A0U;
    public final C105255Ue A0V;
    public final AnonymousClass4UC A0W = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0X;

    public void A0D(UserJid userJid) {
        UserJid userJid2 = userJid;
        if (this.A0P.A02(this.A00, userJid)) {
            AnonymousClass5Y9 r6 = this.A0N;
            int i = this.A05;
            int A002 = C18280x3.A00(r6.A08.A0a(userJid) ? 1 : 0) * 4;
            C105405Uu r5 = r6.A0C;
            C162457s7.A0J(userJid, 0);
            synchronized (r5) {
                AnonymousClass7OX A003 = C105405Uu.A00(r5, userJid);
                if (A003 != null) {
                    A003.A00 = new C148047Gs(true, (String) null);
                    List list = A003.A04;
                    int size = list.size();
                    if (size > A002) {
                        for (int i2 = A002; i2 < size; i2++) {
                            list.remove(AnonymousClass002.A03(list));
                        }
                    }
                }
            }
            List A0A2 = r5.A0A(userJid);
            if (!A0A2.isEmpty()) {
                r6.A04.A0G(new C132306f4(new AnonymousClass7KK(A0A2, true, true), userJid));
                A002 *= 2;
            }
            r6.A0I.A01(userJid, AnonymousClass74S.A00(), new C124346Bx(r6, userJid2, i, A002, 1, true));
            return;
        }
        this.A0K.A0H(userJid, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        r5 = X.AnonymousClass4L0.A0N(new java.lang.Object[0], com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        r5 = X.AnonymousClass4L0.A0N(new java.lang.Object[0], r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRB(X.C108985dt r12) {
        /*
            r11 = this;
            r11.A00 = r12
            X.08M r1 = r11.A08
            X.5Tb r4 = r11.A0P
            com.whatsapp.jid.UserJid r6 = r11.A0T
            boolean r0 = r4.A02(r12, r6)
            X.C18320x8.A18(r1, r0)
            X.5dt r2 = r11.A00
            X.1VX r1 = r4.A02
            r0 = 1514(0x5ea, float:2.122E-42)
            boolean r1 = r1.A0X(r0)
            java.lang.String r0 = "categories"
            boolean r0 = r4.A03(r2, r0, r1)
            X.2qr r3 = r11.A0Q
            if (r0 != 0) goto L_0x00c8
            r3.A04(r6)
            X.08M r2 = r11.A0B
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
        L_0x002c:
            r2.A0H(r0)
        L_0x002f:
            r11.A0D(r6)
            X.5Y9 r1 = r11.A0N
            int r0 = r11.A05
            r1.A05(r6, r0)
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = r4.A03(r12, r0, r1)
            if (r0 == 0) goto L_0x0082
            X.4UC r0 = r11.A0W
            r0.A0H(r12)
            X.2en r0 = r11.A0H
            boolean r0 = r0.A01()
            r3 = 0
            if (r0 == 0) goto L_0x00c0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131887607(0x7f1205f7, float:1.9409826E38)
            X.6pW r5 = X.AnonymousClass4L0.A0N(r1, r0)
            X.7y4 r0 = r12.A02
            r4 = 1
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0072
            int r0 = r1.hashCode()
            switch(r0) {
                case -2053263135: goto L_0x0096;
                case -129639349: goto L_0x00a2;
                case 98382: goto L_0x00ae;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131887607(0x7f1205f7, float:1.9409826E38)
            X.6pW r5 = X.AnonymousClass4L0.A0N(r1, r0)
        L_0x0072:
            X.08M r2 = r11.A0A
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            r0 = 2131894649(0x7f122179, float:1.9424109E38)
        L_0x007b:
            X.6pW r0 = X.AnonymousClass4L0.A0N(r1, r0)
            r2.A0H(r0)
        L_0x0082:
            X.5Th r0 = r11.A0F
            java.lang.String r1 = r0.A00(r12)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0095
            X.08M r0 = r11.A06
            r0.A0H(r1)
        L_0x0095:
            return
        L_0x0096:
            java.lang.String r0 = "postal_code"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r1 = 2131887608(0x7f1205f8, float:1.9409828E38)
            goto L_0x00b9
        L_0x00a2:
            java.lang.String r0 = "zip_code"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r1 = 2131887609(0x7f1205f9, float:1.940983E38)
            goto L_0x00b9
        L_0x00ae:
            java.lang.String r0 = "cep"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r1 = 2131887606(0x7f1205f6, float:1.9409824E38)
        L_0x00b9:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.6pW r5 = X.AnonymousClass4L0.A0N(r0, r1)
            goto L_0x0072
        L_0x00c0:
            X.08M r2 = r11.A0A
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131894650(0x7f12217a, float:1.942411E38)
            goto L_0x007b
        L_0x00c8:
            java.lang.String r1 = "catalog_category_dummy_root_id"
            boolean r0 = r3.A05(r6, r1)
            if (r0 == 0) goto L_0x00d8
            X.08M r2 = r11.A0B
            java.util.List r0 = r3.A01(r6, r1)
            goto L_0x002c
        L_0x00d8:
            java.util.HashSet r8 = X.AnonymousClass002.A0K()
            X.5Tt r0 = r11.A0M
            java.lang.String r7 = r0.A02
            X.5Y9 r3 = r11.A0N
            int r9 = r11.A04
            X.7Tq r5 = new X.7Tq
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            X.5ig r2 = new X.5ig
            r2.<init>(r11, r6)
            r0 = 1
            X.92N r1 = new X.92N
            r1.<init>(r3, r0, r2)
            X.5UJ r0 = r3.A0F
            r0.A00(r5, r1)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87614Tz.BRB(X.5dt):void");
    }

    public void BXC(C108985dt r4) {
        this.A00 = r4;
        AnonymousClass08M r1 = this.A08;
        C104975Tb r0 = this.A0P;
        UserJid userJid = this.A0T;
        C18320x8.A18(r1, r0.A02(r4, userJid));
        A0D(userJid);
        this.A0N.A05(userJid, this.A05);
    }

    public C87614Tz(Application application, C116985rC r4, C56972sr r5, C105035Th r6, C620433g r7, C48372en r8, C154197cm r9, C104095Pq r10, C105405Uu r11, AnonymousClass5QB r12, C105145Tt r13, AnonymousClass5Y9 r14, C104325Qn r15, C104975Tb r16, C55752qr r17, C56612sH r18, AnonymousClass1VX r19, UserJid userJid, C103115Lp r21, C105255Ue r22, AnonymousClass4FS r23) {
        super(application);
        this.A0R = r18;
        this.A0S = r19;
        this.A0T = userJid;
        this.A0E = r5;
        this.A0O = r15;
        this.A0V = r22;
        this.A0N = r14;
        this.A0K = r11;
        this.A0Q = r17;
        this.A0M = r13;
        this.A0L = r12;
        this.A0D = r4;
        this.A0P = r16;
        this.A0G = r7;
        this.A0U = r21;
        this.A0H = r8;
        this.A0F = r6;
        this.A0I = r9;
        this.A0J = r10;
        this.A0X = r23;
        this.A05 = application.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04 = application.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }
}
