package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass247;
import X.AnonymousClass29R;
import X.AnonymousClass2EN;
import X.AnonymousClass2EO;
import X.AnonymousClass2T5;
import X.AnonymousClass2UG;
import X.AnonymousClass2UI;
import X.AnonymousClass33p;
import X.AnonymousClass3R4;
import X.AnonymousClass4DD;
import X.AnonymousClass4FS;
import X.AnonymousClass75J;
import X.C05550Ty;
import X.C06270Wx;
import X.C151137To;
import X.C155927fk;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C28801hn;
import X.C28851hs;
import X.C28901hx;
import X.C50592iR;
import X.C54292oU;
import X.C55112po;
import X.C56022rI;
import X.C56972sr;
import X.C57162tC;
import X.C58152un;
import X.C58722vi;
import X.C626936e;
import X.C70023Zo;
import X.C83944Ak;
import X.C83954Al;
import X.C85644Hb;
import X.C85654Hc;
import X.C85664Hd;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.migration.transfer.service.DonorP2pTransferService;
import com.whatsapp.migration.transfer.service.ReceiverP2pTransferService;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class ChatTransferViewModel extends C05550Ty {
    public int A00;
    public int A01;
    public int A02;
    public C151137To A03;
    public AnonymousClass4DD A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass08M A09 = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0A = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0B = AnonymousClass08M.A01();
    public final AnonymousClass08M A0C = AnonymousClass08M.A01();
    public final AnonymousClass08M A0D = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0E = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0F = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0G;
    public final AnonymousClass08M A0H = AnonymousClass08M.A01();
    public final AnonymousClass2EN A0I;
    public final AnonymousClass2EO A0J;
    public final C56972sr A0K;
    public final C54292oU A0L;
    public final C57162tC A0M;
    public final AnonymousClass33p A0N;
    public final AnonymousClass1VW A0O;
    public final AnonymousClass1VX A0P;
    public final C28801hn A0Q;
    public final C56022rI A0R;
    public final C28851hs A0S;
    public final C50592iR A0T;
    public final AnonymousClass2UI A0U;
    public final C28901hx A0V;
    public final C155927fk A0W;
    public final C55112po A0X;
    public final AnonymousClass3R4 A0Y;
    public final AnonymousClass4FS A0Z;
    public final AnonymousClass4FS A0a;

    public void A0C() {
        C28901hx r0 = this.A0V;
        AnonymousClass3R4 r1 = this.A0Y;
        r0.A07(r1);
        this.A0Q.A07(r1);
        this.A0S.A07(r1);
    }

    public void A0F() {
        AnonymousClass0x9.A1I(this.A0E);
        AnonymousClass0x7.A18(this.A0A);
        this.A0X.A01(5);
    }

    public void A0G() {
        C18270x1.A0g(AnonymousClass0x2.A0E(this.A0R.A02), "/export/logging/attemptId");
        this.A05 = null;
        A0H();
        A0J(1);
        AnonymousClass08M r1 = this.A0C;
        C06270Wx.A04(r1, 0);
        C06270Wx.A04(r1, 1);
    }

    public void A0H() {
        Class cls;
        AnonymousClass4DD r0 = this.A04;
        if (r0 != null) {
            r0.cancel();
        }
        boolean z = this.A06;
        Context context = this.A0L.A00;
        if (z) {
            cls = DonorP2pTransferService.class;
        } else {
            cls = ReceiverP2pTransferService.class;
        }
        context.startService(AnonymousClass0x9.A08(context, cls).setAction("com.whatsapp.migration.STOP"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 != 10) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (java.lang.Boolean.TRUE.equals(r9.A0A.A07()) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I() {
        /*
            r9 = this;
            int r4 = r9.A01
            r5 = 6
            r3 = 4
            r2 = 2
            r1 = 1
            if (r4 != r1) goto L_0x0050
            X.08M r0 = r9.A0C
            java.lang.Object r0 = r0.A07()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0026
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x004e
            r0 = 9
            if (r1 == r3) goto L_0x004b
            if (r1 == r5) goto L_0x0048
            if (r1 == r0) goto L_0x0038
            r0 = 10
            r5 = 11
            if (r1 == r0) goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            X.2po r4 = r9.A0X
            int r0 = r9.A00
            long r7 = (long) r0
            X.4FS r0 = r4.A08
            r6 = 5
            X.3aD r3 = new X.3aD
            r3.<init>(r4, r5, r6, r7)
            r0.BkM(r3)
            return
        L_0x0038:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.08M r0 = r9.A0A
            java.lang.Object r0 = r0.A07()
            boolean r0 = r1.equals(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0027
            goto L_0x0026
        L_0x0048:
            r5 = 8
            goto L_0x0027
        L_0x004b:
            r5 = 9
            goto L_0x0027
        L_0x004e:
            r5 = 7
            goto L_0x0027
        L_0x0050:
            if (r4 != r2) goto L_0x0054
            r5 = 2
            goto L_0x0027
        L_0x0054:
            r0 = 3
            if (r4 != r0) goto L_0x0059
            r5 = 3
            goto L_0x0027
        L_0x0059:
            if (r4 != r3) goto L_0x0026
            int r0 = r9.A02
            if (r0 == 0) goto L_0x0063
            if (r0 != r1) goto L_0x0027
            r5 = 5
            goto L_0x0027
        L_0x0063:
            r5 = 4
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A0I():void");
    }

    public void A0J(int i) {
        C83954Al r1;
        String str;
        C85644Hb r0;
        int i2;
        int i3;
        int i4;
        int i5 = this.A01;
        if (i != i5) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("fpm/P2pTransferViewModel/change state from ");
            A0o.append(i5);
            C18260x0.A0y(" to ", A0o, i);
            this.A01 = i;
            AnonymousClass2UG r3 = new AnonymousClass2UG();
            AnonymousClass2T5 r6 = new AnonymousClass2T5(new C85664Hd(this, 0), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, true, true);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        boolean z = this.A06;
                        if (i != 4) {
                            if (z) {
                                r3.A0B = R.string.f11nameremoved;
                                r3.A0A = R.string.f11nameremoved;
                                i4 = R.string.f11nameremoved;
                            } else {
                                r3.A0B = R.string.f11nameremoved;
                                r3.A0A = R.string.f11nameremoved;
                                i4 = R.string.f11nameremoved;
                            }
                            r3.A03 = i4;
                            r3.A02 = 411;
                            r3.A01 = 495;
                            r3.A09 = 8;
                            r3.A0E = new C85654Hc(this, 2);
                            r3.A0D = new C85654Hc(this, 3);
                        } else {
                            if (z) {
                                r3.A0A = R.string.f11nameremoved;
                                i3 = R.string.f11nameremoved;
                            } else {
                                r3.A0A = R.string.f11nameremoved;
                                i3 = R.string.f11nameremoved;
                            }
                            r3.A05 = i3;
                            r3.A0B = R.string.f11nameremoved;
                            r3.A02 = 0;
                            r3.A01 = 351;
                            r3.A0I = true;
                            r3.A07 = 0;
                            r3.A06 = 0;
                            r3.A04 = 8;
                            r3.A0F = new C85644Hb(r6, this, 4);
                            i2 = 5;
                        }
                    } else if (this.A06) {
                        r3.A02 = 0;
                        r3.A01 = 351;
                        r3.A0I = true;
                        r3.A0B = R.string.f11nameremoved;
                        r3.A0A = R.string.f11nameremoved;
                        r3.A05 = R.string.f11nameremoved;
                        r3.A07 = 0;
                        r3.A06 = 0;
                        r3.A04 = 8;
                        r3.A0F = new C85644Hb(r6, this, 2);
                        i2 = 3;
                    } else {
                        str = "fpm/ChatTransferViewModel/Receiver should not be in pairing state";
                        Log.e(str);
                        return;
                    }
                    r0 = new C85644Hb(r6, this, i2);
                } else {
                    this.A0X.A01(5);
                    if (this.A06) {
                        str = "fpm/ChatTransferViewModel/Receiver should not be in authentication state";
                        Log.e(str);
                        return;
                    }
                    r3.A0B = R.string.f11nameremoved;
                    boolean z2 = this.A08;
                    int i6 = R.string.f11nameremoved;
                    if (z2) {
                        i6 = R.string.f11nameremoved;
                    }
                    r3.A0A = i6;
                    r3.A0G = true;
                    r3.A00 = 8;
                    r3.A0C = this.A03;
                    r3.A04 = 8;
                    r3.A0F = new C85644Hb(r6, this, 0);
                    r0 = new C85644Hb(r6, this, 1);
                }
                r3.A0D = r0;
                r3.A0H = true;
            } else {
                if (this.A06) {
                    r1 = new C85654Hc(this, 1);
                    r3.A0F = r1;
                } else {
                    r3.A0B = R.string.f11nameremoved;
                    r3.A0A = R.string.f11nameremoved;
                    r3.A03 = R.string.f11nameremoved;
                    r3.A0F = new C85644Hb(r6, this, 6);
                    r1 = new C85644Hb(r6, this, 7);
                }
                r3.A0D = r1;
                r3.A08 = R.string.f11nameremoved;
                r3.A0E = new C85654Hc(this, 0);
            }
            this.A0H.A0G(r3);
        }
    }

    public void A0K(int i, int i2) {
        if (this.A01 != 5) {
            AnonymousClass08M r2 = this.A0B;
            if (r2.A07() == null || !AnonymousClass75J.A00(Integer.valueOf(i), ((Pair) r2.A07()).first) || !AnonymousClass75J.A00(Integer.valueOf(i2), ((Pair) r2.A07()).second)) {
                if (i2 > 100) {
                    i2 = 100;
                } else if (i2 < 0) {
                    i2 = 0;
                }
                r2.A0G(C18290x4.A0K(Integer.valueOf(i), i2));
            }
        }
    }

    public void A0L(Bundle bundle) {
        C626936e.A0E(bundle.containsKey("is_donor"), "getIntent().getExtras()[IS_DONOR_ARG] is required but is not present");
        this.A06 = bundle.getBoolean("is_donor");
        C626936e.A0E(bundle.containsKey("started_on_receiver"), "getIntent().getExtras()[STARTED_ON_RECEIVER_ARG] is required but is not present");
        boolean z = bundle.getBoolean("started_on_receiver");
        this.A08 = z;
        if (z) {
            this.A05 = bundle.getString("qr_code_data");
        }
    }

    public ChatTransferViewModel(AnonymousClass2EN r3, AnonymousClass2EO r4, C56972sr r5, C54292oU r6, C57162tC r7, AnonymousClass33p r8, AnonymousClass1VW r9, AnonymousClass1VX r10, C28801hn r11, C56022rI r12, C28851hs r13, C50592iR r14, AnonymousClass2UI r15, C28901hx r16, C155927fk r17, C55112po r18, AnonymousClass4FS r19) {
        this.A0L = r6;
        AnonymousClass4FS r1 = r19;
        this.A0Z = r1;
        this.A0V = r16;
        this.A0W = r17;
        this.A0G = AnonymousClass0x9.A0b();
        this.A0P = r10;
        this.A0a = r1;
        this.A0K = r5;
        this.A0T = r14;
        this.A0U = r15;
        this.A0X = r18;
        this.A0O = r9;
        this.A0N = r8;
        this.A0Q = r11;
        this.A0S = r13;
        this.A0R = r12;
        this.A0I = r3;
        this.A0M = r7;
        this.A0J = r4;
        this.A0Y = new AnonymousClass3R4(this);
    }

    public static AnonymousClass2T5 A00() {
        return new AnonymousClass2T5((C83944Ak) null, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, 0, false, false);
    }

    public AnonymousClass2T5 A0D() {
        return new AnonymousClass2T5(new C85664Hd(this, 6), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, 0, false, true);
    }

    public AnonymousClass2T5 A0E() {
        return new AnonymousClass2T5(new C85664Hd(this, 5), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, 0, false, true);
    }

    public void A0M(String str) {
        AnonymousClass2T5 r2;
        AnonymousClass08M r1;
        String A0Z2;
        C18260x0.A0q("fpm/ChatTransferViewModel/qr code: ", str, AnonymousClass001.A0o());
        try {
            C58722vi A002 = C58722vi.A00(str);
            try {
                PhoneUserJid A042 = C56972sr.A04(this.A0K);
                if (A042 != null) {
                    A0Z2 = A042.user;
                } else {
                    A0Z2 = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A0N), "saved_user_before_logout");
                    if (A0Z2 == null) {
                        throw new Exception("fpm/ChatTransferViewModel/getUserJid currentUser and savedUser both null");
                    }
                }
                if (!C18270x1.A0V(AnonymousClass0x7.A0t(), A0Z2.getBytes(C58152un.A0B)).equals(A002.A00)) {
                    Log.e("fpm/ChatTransferViewModel/phone number mismatch");
                    this.A0X.A02(0, 0, 4);
                    r1 = this.A0D;
                    r2 = A0D();
                    r1.A0G(r2);
                    return;
                }
                Context context = this.A0L.A00;
                Intent A092 = AnonymousClass0x9.A09("com.whatsapp.migration.START");
                A092.putExtra("details_key", str);
                A092.setClass(context, DonorP2pTransferService.class);
                AnonymousClass29R.A00(context, A092);
                C70023Zo.A00(this.A0Z, this, 25);
                A0J(3);
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
                r1 = this.A0D;
                r2 = A0E();
            } catch (Exception e) {
                C18260x0.A16("fpm/ChatTransferViewModel/", AnonymousClass001.A0o(), e);
                r1 = this.A0D;
                r2 = A0D();
            }
        } catch (AnonymousClass247 e2) {
            C18260x0.A16("fpm/ChatTransferViewModel/Unable to parse QR code, reason: ", AnonymousClass001.A0o(), e2);
            C55112po r3 = this.A0X;
            r3.A00 = e2.getMessage();
            r3.A02(0, 0, 3);
            int i = e2.invalidQrType;
            int i2 = R.string.f11nameremoved;
            if (i == 1) {
                i2 = R.string.f11nameremoved;
            }
            r1 = this.A0D;
            r2 = new AnonymousClass2T5(new C85664Hd(this, 4), R.string.f11nameremoved, i2, R.string.f11nameremoved, 0, false, true);
        }
    }
}
