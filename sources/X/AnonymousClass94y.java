package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.94y  reason: invalid class name */
public class AnonymousClass94y extends C05550Ty implements C202509m8 {
    public int A00;
    public int A01 = R.string.f11nameremoved;
    public AnonymousClass08M A02 = new AnonymousClass08M(AnonymousClass001.A0s());
    public C108985dt A03;
    public C624034w A04;
    public AnonymousClass9H3 A05;
    public C193629Pj A06;
    public AnonymousClass2z0 A07;
    public AnonymousClass4UC A08 = new AnonymousClass4UC();
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public final Bundle A0G;
    public final C69263Wi A0H;
    public final C56972sr A0I;
    public final C620433g A0J;
    public final C56962sq A0K;
    public final C64773Ex A0L;
    public final C620633i A0M;
    public final C56612sH A0N;
    public final C54292oU A0O;
    public final C620733j A0P;
    public final C66543Lv A0Q;
    public final C194909Va A0R;
    public final AnonymousClass36F A0S;
    public final C617332a A0T;
    public final AnonymousClass8EA A0U;
    public final C194539Ti A0V;
    public final C1906899l A0W;
    public final C620933l A0X;
    public final AnonymousClass4DI A0Y;
    public final C29271iY A0Z;
    public final C1907099n A0a;
    public final AnonymousClass9U4 A0b;
    public final AnonymousClass9b0 A0c;
    public final AnonymousClass9TZ A0d;
    public final C203499no A0e;
    public final C160757oG A0f = C160757oG.A00("PaymentTransactionDetailsViewModel", "payment-settings", "COMMON");
    public final C194969Vi A0g;
    public final AnonymousClass9Tp A0h;
    public final C158777kX A0i;
    public final AnonymousClass9V7 A0j;
    public final C195219Wq A0k;
    public final AnonymousClass4FS A0l;

    public void A0L() {
        C624034w r0;
        AnonymousClass9QJ A002 = AnonymousClass9QJ.A00(0);
        C193629Pj r02 = this.A06;
        if (!(r02 == null || (r0 = r02.A01) == null || !r0.A0K())) {
            this.A01 = R.string.f11nameremoved;
        }
        Bundle bundle = A002.A02;
        bundle.putInt("action_bar_title_res_id", this.A01);
        bundle.putBoolean("action_bar_on_configuration_change", this.A0E);
        A00(this, A002);
        this.A0E = true;
    }

    public final void A0N(C195319Xg r9, Integer num, Integer num2) {
        AnonymousClass303 r3 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        r3.A02("num_installments", r9.A01);
        r3.A04("has_installments_fees", false);
        this.A0e.BKE(r3, num, num2, "payment_transaction_details", this.A0B);
    }

    public void A0c(boolean z) {
        AnonymousClass9QJ A002 = AnonymousClass9QJ.A00(1);
        A002.A0H = z;
        A00(this, A002);
    }

    public void BXw() {
        A0d(false);
    }

    public static void A00(AnonymousClass94y r0, Object obj) {
        r0.A08.A0H(obj);
    }

    public static void A01(List list) {
        list.add(new AnonymousClass9FG());
    }

    public C203719oC A0D() {
        return this.A0b.A0G();
    }

    public AnonymousClass9NZ A0E() {
        C624034w r0;
        AnonymousClass1S4 r02;
        C166557yt A0F2;
        C193629Pj r03 = this.A06;
        if (r03 == null || (r0 = r03.A01) == null || (r02 = r0.A0A) == null || (A0F2 = r02.A0F()) == null || C161527pr.A02(A0F2)) {
            return null;
        }
        C191479Fb r2 = new C191479Fb();
        r2.A03 = C166557yt.A00(A0F2);
        C191669Fv.A02(this.A0O.A00, r2, R.string.f11nameremoved);
        return r2;
    }

    public AnonymousClass9NZ A0F() {
        boolean z;
        Context context;
        int i;
        int i2;
        C193629Pj r0 = this.A06;
        C191479Fb r2 = null;
        if (r0 != null) {
            C624034w r5 = r0.A01;
            C166587yw r3 = r0.A00;
            boolean z2 = false;
            if (r3 != null) {
                synchronized (r5) {
                    if (!r5.A0L() || !((i2 = r5.A02) == 13 || i2 == 14 || i2 == 15 || i2 == 16)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    if ("non_native".equals(this.A0A)) {
                        context = this.A0O.A00;
                        i = R.string.f11nameremoved;
                    } else {
                        int i3 = r5.A03;
                        if (i3 != 1) {
                            context = this.A0O.A00;
                            i = R.string.f11nameremoved;
                            if (i3 != 100) {
                                i = R.string.f11nameremoved;
                            }
                        } else {
                            context = this.A0O.A00;
                            i = R.string.f11nameremoved;
                        }
                    }
                    String string = context.getString(i);
                    r2 = new C191479Fb();
                    r2.A04 = string;
                    r2.A03 = this.A0i.A02(r3, true);
                    if (r5.A03 != 200 && !(r3 instanceof C133726hq)) {
                        z2 = true;
                    }
                    if (this.A06.A04 && z2) {
                        r2.A01 = new C204409pJ((Object) r3, 30, (Object) this);
                        return r2;
                    }
                }
            }
        }
        return r2;
    }

    public AnonymousClass9NZ A0G() {
        int i;
        C193629Pj r0 = this.A06;
        if (r0 != null) {
            C624034w r02 = r0.A01;
            C191479Fb r3 = new C191479Fb();
            String A0I2 = A0I(r02);
            if (AnonymousClass36S.A07(A0I2)) {
                Context context = this.A0O.A00;
                if (this instanceof C191669Fv) {
                    i = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                }
                C191669Fv.A02(context, r3, i);
                r3.A03 = A0I2;
                r3.A02 = new C204449pN(2, A0I2, this);
                return r3;
            }
        }
        return null;
    }

    public String A0H() {
        C193629Pj r0 = this.A06;
        if (r0 != null) {
            Boolean A062 = r0.A01.A06();
            AnonymousClass1S4 r1 = this.A06.A01.A0A;
            C626936e.A06(r1);
            if (A062 != null) {
                if (A062.booleanValue()) {
                    return r1.A0L();
                }
                return r1.A0M();
            }
        }
        return null;
    }

    public void A0J() {
        C624134x r0;
        AnonymousClass9QJ r2;
        String str;
        AnonymousClass9QJ A002;
        C160757oG r4 = this.A0f;
        r4.A06("Parent- HANDLE_SEND_AGAIN child did not handle");
        C193629Pj r02 = this.A06;
        if (r02 != null) {
            r0 = r02.A02;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            C624034w r22 = r0.A0P;
            if (r22 != null) {
                UserJid userJid = r22.A0D;
                if (userJid != null) {
                    if (!this.A0K.A0d.contains(userJid)) {
                        AnonymousClass1S4 r03 = r22.A0A;
                        if (r03 == null || r03.A02 == null) {
                            r2 = AnonymousClass9QJ.A00(12);
                            A00(this, r2);
                        }
                        A002 = AnonymousClass9QJ.A00(21);
                        A002.A0D = r22.A0A.A02.A01;
                        C193629Pj r04 = this.A06;
                        C626936e.A06(r04);
                        A002.A08 = r04.A03;
                        A002.A01 = this.A00;
                    } else {
                        A002 = AnonymousClass9QJ.A00(13);
                        A002.A06 = r22.A0D;
                    }
                    A00(this, A002);
                    return;
                }
                str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo.receiverJid is null";
            } else {
                str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo is null";
            }
        } else {
            str = "Parent- HANDLE_SEND_AGAIN FMessage is null";
        }
        r4.A06(str);
        r2 = AnonymousClass9QJ.A00(8);
        r2.A0C = this.A0O.A00.getString(R.string.f11nameremoved);
        A00(this, r2);
    }

    public void A0K() {
        C624034w r6;
        C193629Pj r1 = this.A06;
        if (r1 != null && !this.A0F && (r6 = r1.A01) != null) {
            this.A0F = true;
            if (this.A0W.A0E() && A0e()) {
                C160757oG r2 = this.A0f;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("syncing pending transaction: ");
                A0o.append(r6.A0K);
                A0o.append(" status: ");
                C1899593h.A1K(r2, A0o, r6.A02);
                C203499no B7b = A0D().B7b();
                if (B7b != null) {
                    B7b.Bq0();
                }
                this.A0c.A00(new C204519pU(B7b, 7, this), A0D(), r6.A0K, r6.A0O());
            }
        }
    }

    public final void A0M() {
        if ("native".equals(this.A0A)) {
            A0K();
        }
        AnonymousClass08M r2 = this.A02;
        List list = (List) r2.A07();
        list.clear();
        A0c(false);
        C193629Pj r0 = this.A06;
        if (r0 != null && r0.A01 != null) {
            A0S(list);
            r2.A0H(list);
        }
    }

    public void A0O(C624034w r5) {
        if (TextUtils.isEmpty(r5.A0K) || !r5.A0K.equals(this.A0C)) {
            AnonymousClass2z0 r2 = this.A07;
            if (r2 == null) {
                return;
            }
            if ((TextUtils.isEmpty(r5.A0L) || !r5.A0L.equals(r2.A01)) && (TextUtils.isEmpty(r5.A0M) || !r5.A0M.equals(r2.A01))) {
                return;
            }
        }
        A0d(false);
    }

    public void A0P(C191519Ff r3) {
        C624034w r1 = this.A06.A01;
        r3.A04 = C195219Wq.A05(this.A0O.A00, r1);
        r3.A02 = C195219Wq.A01(r1);
    }

    public void A0Q(C193089Nc r3) {
        if (r3.A00 == 2) {
            A0d(true);
        }
    }

    public void A0R(List list) {
        SpannableStringBuilder spannableStringBuilder;
        C193629Pj r0 = this.A06;
        if (r0 != null) {
            C624034w r2 = r0.A01;
            AnonymousClass39Q r5 = r2.A08;
            if (r5 != null) {
                Context context = this.A0O.A00;
                spannableStringBuilder = new SpannableStringBuilder(AnonymousClass9UO.A01(this.A0P, r2.A03(), r5, 0, false));
                if (AnonymousClass9KX.A00 == null) {
                    try {
                        AnonymousClass9KX.A00 = C06400Xn.A02(context, R.font.payment_icons_regular);
                    } catch (Resources.NotFoundException unused) {
                        Log.e("PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular");
                    }
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            AnonymousClass39R A052 = r2.A05();
            boolean A002 = A0D().BAi().A00(r2);
            C195219Wq r02 = this.A0k;
            int A0B2 = r02.A0B(r2);
            Context context2 = r02.A05.A00;
            if (A0B2 == 0) {
                A0B2 = R.string.f11nameremoved;
            }
            String string = context2.getString(A0B2);
            Object[] A0M2 = AnonymousClass002.A0M();
            AnonymousClass000.A16(spannableStringBuilder, string, A0M2);
            list.add(new C191469Fa(A052, spannableStringBuilder, context2.getString(R.string.f11nameremoved, A0M2), (CharSequence) null, A002));
        }
    }

    public void A0T(List list) {
        AnonymousClass9FV r1 = new AnonymousClass9FV();
        r1.A02 = this.A06;
        r1.A01 = this;
        r1.A00 = A0D().B6f();
        list.add(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(java.util.List r12) {
        /*
            r11 = this;
            X.9Fe r5 = new X.9Fe
            r5.<init>()
            X.9Pj r0 = r11.A06
            X.34w r4 = r0.A01
            X.2oU r0 = r11.A0O
            android.content.Context r3 = r0.A00
            int r6 = r4.A03
            r2 = 1
            r1 = 2131894377(0x7f122069, float:1.9423557E38)
            if (r6 == r2) goto L_0x0053
            r0 = 2
            if (r6 == r0) goto L_0x0050
            r0 = 9
            if (r6 == r0) goto L_0x0050
            r0 = 10
            r1 = 2131894379(0x7f12206b, float:1.9423561E38)
            if (r6 == r0) goto L_0x0053
            r0 = 20
            if (r6 == r0) goto L_0x004c
            r0 = 40
            if (r6 == r0) goto L_0x004c
            r0 = 100
            r1 = 2131894374(0x7f122066, float:1.942355E38)
            if (r6 == r0) goto L_0x0053
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x0050
            java.lang.String r0 = ""
        L_0x0038:
            r5.A09 = r0
            X.9Wq r0 = r11.A0k
            java.lang.String r0 = r0.A0T(r4)
            r5.A08 = r0
            long r0 = r4.A05
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0092
            monitor-enter(r4)
            goto L_0x0058
        L_0x004c:
            r1 = 2131894378(0x7f12206a, float:1.942356E38)
            goto L_0x0053
        L_0x0050:
            r1 = 2131894380(0x7f12206c, float:1.9423563E38)
        L_0x0053:
            java.lang.String r0 = r3.getString(r1)
            goto L_0x0038
        L_0x0058:
            X.1S4 r0 = r4.A0A     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0067
            boolean r1 = r0.A0c()     // Catch:{ all -> 0x0064 }
            r0 = 1
            if (r1 != 0) goto L_0x0068
            goto L_0x0067
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0067:
            r0 = 0
        L_0x0068:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x0092
            r8 = 2131894343(0x7f122047, float:1.9423488E38)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            X.33j r6 = r11.A0P
            X.2sH r9 = r11.A0N
            long r0 = r4.A05
            long r0 = r9.A0I(r0)
            java.lang.String r10 = X.C107505bQ.A03(r6, r0)
            long r0 = r4.A05
            long r0 = r9.A0I(r0)
            java.lang.String r0 = X.C107145am.A00(r6, r0)
            java.lang.String r0 = X.C107175ap.A04(r6, r10, r0)
            java.lang.String r0 = X.C86614Ku.A0s(r3, r0, r7, r8)
            r5.A0A = r0
        L_0x0092:
            X.9oC r0 = r11.A0D()
            X.9Tz r7 = r0.BAx()
            if (r7 == 0) goto L_0x00e1
            X.1VX r0 = r7.A07
            boolean r0 = X.C1899693i.A0w(r0)
            if (r0 == 0) goto L_0x00e1
            int r1 = r4.A03
            r0 = 9
            if (r1 != r0) goto L_0x0135
            int r6 = r4.A01
            r1 = 2131232339(0x7f080653, float:1.8080784E38)
            if (r6 == r2) goto L_0x00ba
            r0 = 2
            r1 = 2131232338(0x7f080652, float:1.8080782E38)
            if (r6 == r0) goto L_0x00ba
            r1 = 2131231006(0x7f08011e, float:1.807808E38)
        L_0x00ba:
            r5.A00 = r1
            X.34w r8 = r11.A04
            if (r8 == 0) goto L_0x00e1
            boolean r0 = r7 instanceof X.C1907499r
            if (r0 == 0) goto L_0x0131
            r6 = 2131890141(0x7f120fdd, float:1.9414965E38)
        L_0x00c7:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.9Wq r0 = r7.A08
            java.lang.String r0 = r0.A0T(r8)
            java.lang.String r0 = android.text.Html.escapeHtml(r0)
            java.lang.String r0 = X.C86614Ku.A0s(r3, r0, r1, r6)
            r5.A07 = r0
            r0 = 143(0x8f, float:2.0E-43)
            X.9p3 r0 = X.C204249p3.A00(r11, r0)
            r5.A03 = r0
        L_0x00e1:
            java.lang.Boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012e
            com.whatsapp.jid.UserJid r1 = r4.A0D
        L_0x00ef:
            if (r1 == 0) goto L_0x00f9
            X.3Ex r0 = r11.A0L
            X.3ZH r0 = r0.A0A(r1)
            r5.A05 = r0
        L_0x00f9:
            X.3ZH r0 = r5.A05
            if (r0 == 0) goto L_0x010e
            X.9ij r1 = new X.9ij
            r1.<init>(r5, r11)
        L_0x0102:
            r0 = 142(0x8e, float:1.99E-43)
            X.9p3 r0 = X.C204249p3.A00(r1, r0)
        L_0x0108:
            r5.A04 = r0
            r12.add(r5)
            return
        L_0x010e:
            X.9oC r0 = r11.A0D()
            X.9mt r0 = r0.BAl()
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = r11.A0H()
            if (r0 == 0) goto L_0x012c
            X.99l r0 = r11.A0W
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x012c
            X.9ik r1 = new X.9ik
            r1.<init>(r5, r11)
            goto L_0x0102
        L_0x012c:
            r0 = 0
            goto L_0x0108
        L_0x012e:
            com.whatsapp.jid.UserJid r1 = r4.A0E
            goto L_0x00ef
        L_0x0131:
            r6 = 2131890140(0x7f120fdc, float:1.9414963E38)
            goto L_0x00c7
        L_0x0135:
            X.9Vi r6 = r11.A0g
            X.1S4 r0 = r4.A0A
            if (r0 == 0) goto L_0x016e
            X.39O r8 = r0.A00
            if (r8 == 0) goto L_0x016e
            java.lang.String r0 = r8.A02
            java.lang.Long r1 = X.C18290x4.A0h(r0)
            X.9TT r0 = r6.A0E
            java.util.concurrent.ConcurrentHashMap r0 = r0.A02
            java.lang.Object r6 = r0.get(r1)
            X.9Uu r6 = (X.C194869Uu) r6
            if (r6 == 0) goto L_0x016e
            java.lang.String r0 = r8.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016e
            int r1 = r4.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x017e
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x017e
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x017e
            r0 = 420(0x1a4, float:5.89E-43)
            if (r1 == r0) goto L_0x017e
            switch(r1) {
                case 401: goto L_0x017e;
                case 402: goto L_0x017e;
                case 403: goto L_0x017e;
                default: goto L_0x016e;
            }
        L_0x016e:
            r0 = 0
        L_0x016f:
            r5.A07 = r0
            boolean r0 = r7 instanceof X.C1907499r
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/cant-see-cashback-in-bank-account/"
        L_0x0177:
            r5.A06 = r0
            goto L_0x00e1
        L_0x017b:
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/cant-see-cashback-in-bank-account-br-p2p/"
            goto L_0x0177
        L_0x017e:
            X.39L r0 = r6.A07
            X.33j r6 = r7.A06
            X.39Q r1 = r0.A02
            X.4Fi r0 = r0.A01
            android.text.SpannableStringBuilder r0 = X.AnonymousClass9UO.A00(r3, r6, r0, r1)
            java.lang.String r6 = r0.toString()
            boolean r0 = r7 instanceof X.C1907499r
            if (r0 == 0) goto L_0x019c
            r1 = 2131890139(0x7f120fdb, float:1.9414961E38)
        L_0x0195:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r0 = X.C86614Ku.A0s(r3, r6, r0, r1)
            goto L_0x016f
        L_0x019c:
            r1 = 2131890138(0x7f120fda, float:1.941496E38)
            goto L_0x0195
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94y.A0U(java.util.List):void");
    }

    public void A0V(List list) {
        if (C1899693i.A0x(this.A0a) && A0f(this.A06.A01)) {
            list.add(new AnonymousClass9FM(C204249p3.A00(this, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT)));
        }
    }

    public void A0W(List list) {
        String str;
        Context context;
        int i;
        Object[] objArr;
        AnonymousClass9FO r6 = new AnonymousClass9FO();
        C624034w r5 = this.A06.A01;
        if (r5.A0L()) {
            int i2 = r5.A02;
            if (i2 == 12 || i2 == 11) {
                str = (String) this.A0k.A0F(r5).second;
            }
            str = null;
        } else {
            C195219Wq r0 = this.A0k;
            String A0U2 = r0.A0U(r5);
            String A0X2 = r0.A0X(r5);
            int i3 = r5.A02;
            if (i3 == 406 || i3 == 407) {
                context = this.A0O.A00;
                i = R.string.f11nameremoved;
                objArr = new Object[]{A0U2};
            } else {
                if (i3 == 102 && this.A0I.A0a(r5.A0D)) {
                    context = this.A0O.A00;
                    i = R.string.f11nameremoved;
                    objArr = new Object[]{A0X2};
                }
                str = null;
            }
            str = context.getString(i, objArr);
        }
        if (!C624034w.A02(r5) && !TextUtils.isEmpty(str)) {
            r6.A01 = str;
            r6.A00 = 0;
            list.add(r6);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023a, code lost:
        r4 = r4.A01.A00;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        if (r1.A08 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0377, code lost:
        r4 = r4.A01.A00;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0393, code lost:
        r4 = r4.A01.A00;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03fe, code lost:
        if (android.text.TextUtils.isEmpty(r9) == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x043e, code lost:
        r4 = r4.A01.A00;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x052d, code lost:
        r9 = X.AnonymousClass0x2.A0X(r4, r11, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0188, code lost:
        if (android.text.TextUtils.isEmpty(r9) == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        r4 = r4.A01.A00;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d7, code lost:
        r4 = r4.A01.A00;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        r4 = r4.A01.A00;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(java.util.List r15) {
        /*
            r14 = this;
            X.9Pj r0 = r14.A06
            X.34w r3 = r0.A01
            X.7yw r1 = r0.A00
            X.9Ff r2 = new X.9Ff
            r2.<init>()
            r14.A0P(r2)
            X.2oU r0 = r14.A0O
            android.content.Context r7 = r0.A00
            boolean r4 = r3.A0L()
            r0 = 2131891688(0x7f1215e8, float:1.9418103E38)
            if (r4 == 0) goto L_0x001e
            r0 = 2131891795(0x7f121653, float:1.941832E38)
        L_0x001e:
            java.lang.String r0 = r7.getString(r0)
            r2.A05 = r0
            X.9Wq r0 = r14.A0k
            int r0 = r0.A0B(r3)
            r2.A01 = r0
            if (r0 == 0) goto L_0x066d
            long r4 = r3.A06
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
            r8 = 2131894343(0x7f122047, float:1.9423488E38)
            java.lang.Object[] r6 = X.AnonymousClass002.A0L()
            X.33j r0 = r14.A0P
            X.2sH r10 = r14.A0N
            long r4 = r10.A0I(r4)
            java.lang.String r9 = X.C107505bQ.A03(r0, r4)
            long r4 = r3.A06
            long r4 = r10.A0I(r4)
            java.lang.String r4 = X.C107145am.A00(r0, r4)
            java.lang.String r0 = X.C107175ap.A04(r0, r9, r4)
            java.lang.String r0 = X.C86614Ku.A0s(r7, r0, r6, r8)
            r2.A07 = r0
        L_0x005d:
            X.9oC r0 = r14.A0D()
            X.9nv r5 = r0.B66()
            X.9V7 r4 = r14.A0j
            if (r5 == 0) goto L_0x064e
            java.lang.String r6 = r3.A0J
            if (r6 == 0) goto L_0x064e
            if (r1 == 0) goto L_0x0074
            X.6hx r0 = r1.A08
            r8 = 1
            if (r0 != 0) goto L_0x0075
        L_0x0074:
            r8 = 0
        L_0x0075:
            r0 = -1
            int r6 = X.C615531h.A01(r6, r0)
            int r7 = r3.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r7 == r0) goto L_0x063f
            r0 = 108(0x6c, float:1.51E-43)
            if (r7 == r0) goto L_0x063f
            r0 = 406(0x196, float:5.69E-43)
            if (r7 != r0) goto L_0x064e
            boolean r0 = r5.BHo(r6)
            if (r0 == 0) goto L_0x05fc
            X.2oU r0 = r4.A01
            android.content.Context r6 = r0.A00
            r0 = 2131894388(0x7f122074, float:1.942358E38)
            if (r8 != 0) goto L_0x009a
            r0 = 2131894390(0x7f122076, float:1.9423583E38)
        L_0x009a:
            java.lang.String r0 = r6.getString(r0)
        L_0x009e:
            r2.A0B = r0
            if (r0 == 0) goto L_0x014a
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            r2.A0C = r6
            X.9jY r7 = new X.9jY
            r7.<init>(r1, r3, r14)
            X.9il r4 = new X.9il
            r4.<init>(r1, r14)
            java.lang.String r0 = "forgot-pin"
            r6.put(r0, r4)
            java.util.Map r6 = r2.A0C
            X.9ii r4 = new X.9ii
            r4.<init>(r1, r14)
            java.lang.String r0 = "view-balance"
            r6.put(r0, r4)
            java.util.Map r4 = r2.A0C
            java.lang.String r0 = "learn-more"
            r4.put(r0, r7)
            java.util.Map r4 = r2.A0C
            java.lang.String r0 = "refund_failed_learn_more"
            r4.put(r0, r7)
            java.util.Map r7 = r2.A0C
            r6 = r14
            boolean r0 = r14 instanceof X.C191669Fv
            if (r0 == 0) goto L_0x00e4
            X.9Fv r6 = (X.C191669Fv) r6
            X.9id r4 = new X.9id
            r4.<init>(r1, r6)
            java.lang.String r0 = "verify-now"
            r7.put(r0, r4)
        L_0x00e4:
            java.util.Map r6 = r2.A0C
            r4 = r14
            boolean r0 = r14 instanceof X.C191649Ft
            if (r0 == 0) goto L_0x013e
            X.9Ft r4 = (X.C191649Ft) r4
            X.9gr r1 = new X.9gr
            r1.<init>(r4)
        L_0x00f2:
            java.lang.String r0 = "incoming_payment_limit_learn_more"
            r6.put(r0, r1)
        L_0x00f7:
            if (r5 == 0) goto L_0x013c
            java.lang.String r1 = r3.A0J
            if (r1 == 0) goto L_0x013c
            r0 = -1
            int r4 = X.C615531h.A01(r1, r0)
            int r1 = r3.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x010c
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x013c
        L_0x010c:
            java.lang.String r0 = r5.B6A(r4)
        L_0x0110:
            r2.A09 = r0
            if (r5 == 0) goto L_0x013a
            java.lang.String r1 = r3.A0J
            if (r1 == 0) goto L_0x013a
            r0 = -1
            int r4 = X.C615531h.A01(r1, r0)
            int r1 = r3.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x0127
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x013a
        L_0x0127:
            java.lang.String r0 = r5.B68(r4)
        L_0x012b:
            r2.A08 = r0
            r1 = 10
            X.9oz r0 = new X.9oz
            r0.<init>(r3, r14, r5, r1)
            r2.A03 = r0
            r15.add(r2)
            return
        L_0x013a:
            r0 = 0
            goto L_0x012b
        L_0x013c:
            r0 = 0
            goto L_0x0110
        L_0x013e:
            boolean r0 = r14 instanceof X.C191659Fu
            if (r0 == 0) goto L_0x00f7
            X.9Fu r4 = (X.C191659Fu) r4
            X.9gq r1 = new X.9gq
            r1.<init>(r4)
            goto L_0x00f2
        L_0x014a:
            X.9Wq r7 = r4.A04
            java.lang.String r11 = r7.A0T(r3)
            boolean r0 = r3.A0L()
            r8 = 0
            if (r0 == 0) goto L_0x05f7
            java.lang.String r10 = r7.A0V(r3)
            java.lang.String r12 = r7.A0W(r3)
            X.2oU r0 = r4.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r0 = r1.getString(r0)
            boolean r13 = r12.equals(r0)
        L_0x016e:
            X.9U4 r0 = r4.A03
            X.9oC r0 = r0.A0G()
            X.9nV r1 = r0.B6C()
            if (r1 == 0) goto L_0x018e
            X.2oU r0 = r4.A01
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r9 = r1.BDv(r0, r3, r11)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x018e
        L_0x018a:
            r2.A0A = r9
            goto L_0x00f7
        L_0x018e:
            int r0 = r3.A02
            if (r0 == 0) goto L_0x05d0
            r1 = 418(0x1a2, float:5.86E-43)
            if (r0 == r1) goto L_0x0447
            r1 = -1
            java.lang.String r9 = ""
            r6 = 1
            switch(r0) {
                case 11: goto L_0x01b3;
                case 12: goto L_0x0533;
                case 13: goto L_0x03ee;
                case 14: goto L_0x018a;
                case 15: goto L_0x040b;
                case 16: goto L_0x041f;
                case 17: goto L_0x043e;
                case 18: goto L_0x0433;
                default: goto L_0x019d;
            }
        L_0x019d:
            r12 = 3
            r10 = 2
            switch(r0) {
                case 101: goto L_0x01b3;
                case 102: goto L_0x04ef;
                case 103: goto L_0x04dd;
                case 104: goto L_0x04dd;
                case 105: goto L_0x03c1;
                case 106: goto L_0x04cb;
                case 107: goto L_0x03ca;
                case 108: goto L_0x018a;
                case 109: goto L_0x03d3;
                case 110: goto L_0x03dc;
                case 111: goto L_0x03e5;
                case 112: goto L_0x051e;
                default: goto L_0x01a2;
            }
        L_0x01a2:
            r13 = 402(0x192, float:5.63E-43)
            switch(r0) {
                case 401: goto L_0x01b3;
                case 402: goto L_0x0450;
                case 403: goto L_0x04b2;
                case 404: goto L_0x0227;
                case 405: goto L_0x04ba;
                case 406: goto L_0x0243;
                case 407: goto L_0x0243;
                case 408: goto L_0x0380;
                case 409: goto L_0x018a;
                case 410: goto L_0x039c;
                case 411: goto L_0x0227;
                case 412: goto L_0x049c;
                case 413: goto L_0x03af;
                case 414: goto L_0x03b8;
                case 415: goto L_0x0377;
                case 416: goto L_0x0526;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            switch(r0) {
                case 420: goto L_0x0217;
                case 421: goto L_0x021f;
                case 422: goto L_0x0393;
                case 423: goto L_0x0377;
                case 424: goto L_0x023a;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            switch(r0) {
                case 601: goto L_0x01e7;
                case 602: goto L_0x01e7;
                case 603: goto L_0x01ef;
                case 604: goto L_0x043e;
                case 605: goto L_0x01f7;
                case 606: goto L_0x01ff;
                case 607: goto L_0x0207;
                case 608: goto L_0x020f;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            switch(r0) {
                case 801: goto L_0x01d7;
                case 802: goto L_0x01df;
                case 803: goto L_0x01d7;
                case 804: goto L_0x01df;
                default: goto L_0x01b0;
            }
        L_0x01b0:
            switch(r0) {
                case 901: goto L_0x01bf;
                case 902: goto L_0x01bf;
                case 903: goto L_0x01c7;
                case 904: goto L_0x01cf;
                case 905: goto L_0x01bf;
                case 906: goto L_0x01bf;
                case 907: goto L_0x01d7;
                case 908: goto L_0x01df;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892188(0x7f1217dc, float:1.9419117E38)
        L_0x01ba:
            java.lang.String r9 = r4.getString(r0)
            goto L_0x018a
        L_0x01bf:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892184(0x7f1217d8, float:1.941911E38)
            goto L_0x01ba
        L_0x01c7:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892180(0x7f1217d4, float:1.94191E38)
            goto L_0x01ba
        L_0x01cf:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892183(0x7f1217d7, float:1.9419107E38)
            goto L_0x01ba
        L_0x01d7:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892185(0x7f1217d9, float:1.9419111E38)
            goto L_0x01ba
        L_0x01df:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892182(0x7f1217d6, float:1.9419105E38)
            goto L_0x01ba
        L_0x01e7:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892295(0x7f121847, float:1.9419334E38)
            goto L_0x01ba
        L_0x01ef:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892294(0x7f121846, float:1.9419332E38)
            goto L_0x01ba
        L_0x01f7:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892176(0x7f1217d0, float:1.9419093E38)
            goto L_0x01ba
        L_0x01ff:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892296(0x7f121848, float:1.9419336E38)
            goto L_0x01ba
        L_0x0207:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892293(0x7f121845, float:1.941933E38)
            goto L_0x01ba
        L_0x020f:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892292(0x7f121844, float:1.9419328E38)
            goto L_0x01ba
        L_0x0217:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894458(0x7f1220ba, float:1.9423721E38)
            goto L_0x01ba
        L_0x021f:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894469(0x7f1220c5, float:1.9423744E38)
            goto L_0x01ba
        L_0x0227:
            X.1S4 r0 = r3.A0A
            if (r0 == 0) goto L_0x023a
            int r0 = r0.A08()
            if (r0 != r13) goto L_0x023a
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894468(0x7f1220c4, float:1.9423742E38)
            goto L_0x052d
        L_0x023a:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894467(0x7f1220c3, float:1.942374E38)
            goto L_0x01ba
        L_0x0243:
            java.lang.String r0 = r3.A0J
            if (r0 == 0) goto L_0x0377
            if (r5 == 0) goto L_0x0377
            int r1 = X.C615531h.A01(r0, r1)
            boolean r0 = r5.BJ9(r1)
            if (r0 == 0) goto L_0x027c
            X.2oU r0 = r4.A01
            android.content.Context r11 = r0.A00
            r9 = 2131894452(0x7f1220b4, float:1.942371E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r0 = r5.BKx()
            X.AnonymousClass000.A1P(r10, r0, r8)
            X.4Fi r7 = r3.A03()
            X.33j r4 = r4.A02
            int r1 = r5.BKw()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.lang.String r0 = r7.B3W(r4, r0)
            java.lang.String r9 = X.AnonymousClass002.A0F(r11, r0, r10, r6, r9)
            goto L_0x018a
        L_0x027c:
            boolean r0 = r5.BHn(r1)
            if (r0 == 0) goto L_0x0293
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894392(0x7f122078, float:1.9423587E38)
        L_0x0289:
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r9 = r5.B7P(r0, r1)
            goto L_0x018a
        L_0x0293:
            boolean r0 = r5.BHp(r1)
            if (r0 == 0) goto L_0x02a1
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894396(0x7f12207c, float:1.9423596E38)
            goto L_0x0289
        L_0x02a1:
            boolean r0 = r5.BHt(r1)
            if (r0 == 0) goto L_0x02af
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894394(0x7f12207a, float:1.9423592E38)
            goto L_0x0289
        L_0x02af:
            boolean r0 = r5.BHM(r1)
            if (r0 == 0) goto L_0x02bd
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894467(0x7f1220c3, float:1.942374E38)
            goto L_0x0289
        L_0x02bd:
            boolean r0 = r5.BHs(r1)
            if (r0 == 0) goto L_0x02cc
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894399(0x7f12207f, float:1.9423602E38)
            goto L_0x01ba
        L_0x02cc:
            boolean r0 = r5.BHr(r1)
            if (r0 == 0) goto L_0x02db
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894398(0x7f12207e, float:1.94236E38)
            goto L_0x01ba
        L_0x02db:
            boolean r0 = r5.BHq(r1)
            if (r0 == 0) goto L_0x02ea
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894397(0x7f12207d, float:1.9423598E38)
            goto L_0x01ba
        L_0x02ea:
            boolean r0 = r5.BHu(r1)
            if (r0 == 0) goto L_0x02f9
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894395(0x7f12207b, float:1.9423594E38)
            goto L_0x01ba
        L_0x02f9:
            boolean r0 = r5.BIN(r1)
            if (r0 == 0) goto L_0x0308
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894408(0x7f122088, float:1.942362E38)
            goto L_0x01ba
        L_0x0308:
            boolean r0 = r5.BJE(r1)
            if (r0 == 0) goto L_0x0317
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894411(0x7f12208b, float:1.9423626E38)
            goto L_0x01ba
        L_0x0317:
            boolean r0 = r5.BI4(r1)
            if (r0 != 0) goto L_0x036e
            boolean r0 = r5.BI2(r1)
            if (r0 != 0) goto L_0x036e
            boolean r0 = r5.BI3(r1)
            if (r0 == 0) goto L_0x0332
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894402(0x7f122082, float:1.9423608E38)
            goto L_0x01ba
        L_0x0332:
            boolean r0 = r5.BI8(r1)
            if (r0 == 0) goto L_0x0341
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894400(0x7f122080, float:1.9423604E38)
            goto L_0x01ba
        L_0x0341:
            boolean r0 = r5.BI9(r1)
            if (r0 == 0) goto L_0x0350
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894401(0x7f122081, float:1.9423606E38)
            goto L_0x01ba
        L_0x0350:
            boolean r0 = r5.BIM(r1)
            if (r0 == 0) goto L_0x035f
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894407(0x7f122087, float:1.9423618E38)
            goto L_0x01ba
        L_0x035f:
            java.lang.String r9 = r5.BCE(r1)
            if (r9 != 0) goto L_0x018a
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894446(0x7f1220ae, float:1.9423697E38)
            goto L_0x0289
        L_0x036e:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894403(0x7f122083, float:1.942361E38)
            goto L_0x01ba
        L_0x0377:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894446(0x7f1220ae, float:1.9423697E38)
            goto L_0x01ba
        L_0x0380:
            X.1S4 r0 = r3.A0A
            if (r0 == 0) goto L_0x0393
            int r0 = r0.A08()
            if (r0 != r13) goto L_0x0393
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894466(0x7f1220c2, float:1.9423738E38)
            goto L_0x052d
        L_0x0393:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894465(0x7f1220c1, float:1.9423736E38)
            goto L_0x01ba
        L_0x039c:
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = "BR"
            boolean r1 = r1.equals(r0)
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            if (r1 == 0) goto L_0x04ae
            r0 = 2131894448(0x7f1220b0, float:1.9423701E38)
            goto L_0x01ba
        L_0x03af:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894438(0x7f1220a6, float:1.942368E38)
            goto L_0x01ba
        L_0x03b8:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894437(0x7f1220a5, float:1.9423679E38)
            goto L_0x01ba
        L_0x03c1:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892179(0x7f1217d3, float:1.9419099E38)
            goto L_0x01ba
        L_0x03ca:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894462(0x7f1220be, float:1.942373E38)
            goto L_0x01ba
        L_0x03d3:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131896396(0x7f12284c, float:1.9427652E38)
            goto L_0x01ba
        L_0x03dc:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131896394(0x7f12284a, float:1.9427648E38)
            goto L_0x01ba
        L_0x03e5:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131896395(0x7f12284b, float:1.942765E38)
            goto L_0x01ba
        L_0x03ee:
            if (r5 == 0) goto L_0x0402
            java.lang.String r0 = r3.A0J
            int r0 = X.C615531h.A01(r0, r1)
            java.lang.String r9 = r5.B6B(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0402
            goto L_0x018a
        L_0x0402:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892066(0x7f121762, float:1.941887E38)
            goto L_0x01ba
        L_0x040b:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            if (r13 == 0) goto L_0x041a
            r0 = 2131892076(0x7f12176c, float:1.941889E38)
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r4, r10, r6, r0)
            goto L_0x018a
        L_0x041a:
            r0 = 2131892075(0x7f12176b, float:1.9418888E38)
            goto L_0x01ba
        L_0x041f:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            if (r13 == 0) goto L_0x042e
            r0 = 2131892074(0x7f12176a, float:1.9418886E38)
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r4, r10, r6, r0)
            goto L_0x018a
        L_0x042e:
            r0 = 2131892073(0x7f121769, float:1.9418884E38)
            goto L_0x01ba
        L_0x0433:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            if (r13 == 0) goto L_0x05c7
            r0 = 2131892072(0x7f121768, float:1.9418882E38)
            goto L_0x01ba
        L_0x043e:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131892175(0x7f1217cf, float:1.941909E38)
            goto L_0x01ba
        L_0x0447:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131894439(0x7f1220a7, float:1.9423683E38)
            goto L_0x01ba
        L_0x0450:
            java.lang.Long r0 = r7.A0K(r3)
            if (r0 == 0) goto L_0x018a
            long r0 = r0.longValue()
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r8 = 2
            if (r9 > 0) goto L_0x0463
            r8 = 1
        L_0x0463:
            java.lang.String r8 = r7.A0M(r0, r8)
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L_0x0480
            X.2oU r0 = r4.A01
            android.content.res.Resources r4 = X.C54292oU.A00(r0)
            r1 = 2131755376(0x7f100170, float:1.914163E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r11, r8, r10)
            java.lang.String r9 = r4.getQuantityString(r1, r6, r0)
            goto L_0x018a
        L_0x0480:
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            X.2oU r0 = r4.A01
            android.content.Context r1 = r0.A00
            if (r7 <= 0) goto L_0x0493
            r0 = 2131894459(0x7f1220bb, float:1.9423723E38)
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r1, r11, r6, r0)
            goto L_0x018a
        L_0x0493:
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            java.lang.String r9 = r1.getString(r0)
            goto L_0x018a
        L_0x049c:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894460(0x7f1220bc, float:1.9423725E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            X.C86604Kt.A1X(r0, r10, r8, r12, r6)
            java.lang.String r9 = r4.getString(r1, r0)
            goto L_0x018a
        L_0x04ae:
            r1 = 2131894447(0x7f1220af, float:1.94237E38)
            goto L_0x052d
        L_0x04b2:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894456(0x7f1220b8, float:1.9423717E38)
            goto L_0x052d
        L_0x04ba:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            boolean r0 = X.AnonymousClass9V7.A00(r3)
            r1 = 2131891616(0x7f1215a0, float:1.9417957E38)
            if (r0 == 0) goto L_0x052d
            r1 = 2131891606(0x7f121596, float:1.9417937E38)
            goto L_0x052d
        L_0x04cb:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            boolean r0 = X.AnonymousClass9V7.A00(r3)
            r1 = 2131891615(0x7f12159f, float:1.9417955E38)
            if (r0 == 0) goto L_0x05f1
            r1 = 2131891605(0x7f121595, float:1.9417935E38)
            goto L_0x05f1
        L_0x04dd:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894443(0x7f1220ab, float:1.942369E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            X.C86604Kt.A1X(r0, r10, r8, r12, r6)
            java.lang.String r9 = r4.getString(r1, r0)
            goto L_0x018a
        L_0x04ef:
            java.lang.Long r0 = r7.A0K(r3)
            if (r0 == 0) goto L_0x018a
            long r0 = r0.longValue()
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x0501
            r10 = 1
        L_0x0501:
            java.lang.String r9 = r7.A0M(r0, r10)
            boolean r7 = android.text.TextUtils.isEmpty(r9)
            if (r7 != 0) goto L_0x05e1
            X.2oU r0 = r4.A01
            android.content.res.Resources r4 = X.C54292oU.A00(r0)
            r1 = 2131755377(0x7f100171, float:1.9141632E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r9
            java.lang.String r9 = r4.getQuantityString(r1, r6, r0)
            goto L_0x018a
        L_0x051e:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894463(0x7f1220bf, float:1.9423731E38)
            goto L_0x052d
        L_0x0526:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894471(0x7f1220c7, float:1.9423748E38)
        L_0x052d:
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r4, r11, r6, r1)
            goto L_0x018a
        L_0x0533:
            int r1 = r3.A03
            r0 = 20
            if (r1 != r0) goto L_0x057d
            X.2sr r1 = r4.A00
            com.whatsapp.jid.UserJid r0 = r3.A0E
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x057d
            java.lang.Long r0 = r7.A0K(r3)
            if (r0 == 0) goto L_0x018a
            long r0 = r0.longValue()
            android.util.Pair r10 = r7.A0E(r0)
            if (r10 == 0) goto L_0x056c
            X.2oU r0 = r4.A01
            android.content.res.Resources r9 = X.C54292oU.A00(r0)
            r7 = 2131755374(0x7f10016e, float:1.9141625E38)
            int r4 = X.C18280x3.A03(r10)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Object r0 = r10.second
            r1[r8] = r0
            java.lang.String r9 = r9.getQuantityString(r7, r4, r1)
            goto L_0x018a
        L_0x056c:
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894440(0x7f1220a8, float:1.9423685E38)
            if (r6 <= 0) goto L_0x05f1
            r1 = 2131894441(0x7f1220a9, float:1.9423687E38)
            goto L_0x05f1
        L_0x057d:
            X.C626936e.A06(r10)
            java.lang.Long r0 = r7.A0K(r3)
            if (r0 == 0) goto L_0x018a
            long r0 = r0.longValue()
            android.util.Pair r11 = r7.A0E(r0)
            if (r11 == 0) goto L_0x05ab
            X.2oU r0 = r4.A01
            android.content.res.Resources r9 = X.C54292oU.A00(r0)
            r7 = 2131755375(0x7f10016f, float:1.9141628E38)
            int r4 = X.C18280x3.A03(r11)
            java.lang.Object[] r1 = X.C18310x6.A1b(r10, r8)
            java.lang.Object r0 = r11.second
            r1[r6] = r0
            java.lang.String r9 = r9.getQuantityString(r7, r4, r1)
            goto L_0x018a
        L_0x05ab:
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            X.2oU r0 = r4.A01
            android.content.Context r1 = r0.A00
            if (r7 <= 0) goto L_0x05be
            r0 = 2131894442(0x7f1220aa, float:1.9423689E38)
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r1, r10, r6, r0)
            goto L_0x018a
        L_0x05be:
            r0 = 2131894440(0x7f1220a8, float:1.9423685E38)
            java.lang.String r9 = r1.getString(r0)
            goto L_0x018a
        L_0x05c7:
            r0 = 2131892071(0x7f121767, float:1.941888E38)
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r4, r12, r6, r0)
            goto L_0x018a
        L_0x05d0:
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            boolean r0 = r3.A0L()
            r1 = 2131894444(0x7f1220ac, float:1.9423693E38)
            if (r0 == 0) goto L_0x05f1
            r1 = 2131892065(0x7f121761, float:1.9418868E38)
            goto L_0x05f1
        L_0x05e1:
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            X.2oU r0 = r4.A01
            android.content.Context r4 = r0.A00
            r1 = 2131894457(0x7f1220b9, float:1.942372E38)
            if (r6 <= 0) goto L_0x05f1
            r1 = 2131894461(0x7f1220bd, float:1.9423727E38)
        L_0x05f1:
            java.lang.String r9 = r4.getString(r1)
            goto L_0x018a
        L_0x05f7:
            r10 = 0
            r12 = r10
            r13 = 0
            goto L_0x016e
        L_0x05fc:
            boolean r0 = r5.BI7(r6)
            if (r0 == 0) goto L_0x0610
            X.2oU r0 = r4.A01
            android.content.Context r6 = r0.A00
            r0 = 2131894404(0x7f122084, float:1.9423612E38)
            if (r8 != 0) goto L_0x009a
            r0 = 2131894405(0x7f122085, float:1.9423614E38)
            goto L_0x009a
        L_0x0610:
            boolean r0 = r5.BHn(r6)
            if (r0 == 0) goto L_0x0630
            X.9U4 r0 = r4.A03
            X.9oC r0 = r0.A0G()
            boolean r0 = r0.AyT()
            if (r0 == 0) goto L_0x0630
            X.2oU r0 = r4.A01
            android.content.Context r6 = r0.A00
            r0 = 2131894392(0x7f122078, float:1.9423587E38)
            if (r8 == 0) goto L_0x009a
            r0 = 2131894393(0x7f122079, float:1.942359E38)
            goto L_0x009a
        L_0x0630:
            boolean r0 = r5.BHQ(r6)
            if (r0 == 0) goto L_0x064e
            X.2oU r0 = r4.A01
            android.content.Context r6 = r0.A00
            r0 = 2131894384(0x7f122070, float:1.9423571E38)
            goto L_0x009a
        L_0x063f:
            boolean r0 = r5.BIZ(r6)
            if (r0 == 0) goto L_0x064e
            X.2oU r0 = r4.A01
            android.content.Context r6 = r0.A00
            r0 = 2131894451(0x7f1220b3, float:1.9423707E38)
            goto L_0x009a
        L_0x064e:
            int r6 = r3.A02
            r0 = 14
            if (r6 == r0) goto L_0x0664
            r0 = 409(0x199, float:5.73E-43)
            if (r6 == r0) goto L_0x065b
            r0 = 0
            goto L_0x009e
        L_0x065b:
            X.2oU r0 = r4.A01
            android.content.Context r6 = r0.A00
            r0 = 2131894464(0x7f1220c0, float:1.9423734E38)
            goto L_0x009a
        L_0x0664:
            X.2oU r0 = r4.A01
            android.content.Context r6 = r0.A00
            r0 = 2131892177(0x7f1217d1, float:1.9419095E38)
            goto L_0x009a
        L_0x066d:
            r0 = 2131894381(0x7f12206d, float:1.9423565E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A06 = r0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94y.A0X(java.util.List):void");
    }

    public void A0Y(List list) {
        C193629Pj r0;
        C193629Pj r02;
        if (this instanceof C191649Ft) {
            A0R(list);
            A0W(list);
            A0T(list);
            A0V(list);
            if (this.A0a.A02.A0X(1905) && (r02 = this.A06) != null && this.A0k.A0p(r02.A01)) {
                AnonymousClass9FH r1 = new AnonymousClass9FH();
                r1.A00 = C204249p3.A00(this, 137);
                list.add(r1);
            }
        } else {
            boolean z = this instanceof C191659Fu;
            A0R(list);
            A0W(list);
            A0T(list);
            if (z) {
                A0V(list);
                if (this.A0a.A02.A0X(1905) && (r0 = this.A06) != null && this.A0k.A0p(r0.A01)) {
                    AnonymousClass9FH r12 = new AnonymousClass9FH();
                    r12.A00 = C204249p3.A00(this, 132);
                    list.add(r12);
                }
            } else {
                A0V(list);
            }
        }
        A0X(list);
        A0U(list);
    }

    public void A0Z(List list) {
        C624034w r3 = this.A06.A01;
        if (this.A0a.A02.A0X(1359) && r3.A03 == 100 && r3.A0M() && !r3.A0I()) {
            list.add(new AnonymousClass9FF());
            AnonymousClass9FS r2 = new AnonymousClass9FS();
            r2.A00 = new C204409pJ((Object) r3, 31, (Object) this);
            list.add(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (X.AnonymousClass9V7.A00(r5) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b(java.util.List r10) {
        /*
            r9 = this;
            java.lang.String r1 = "non_native"
            r6 = r9
            java.lang.String r0 = r9.A0A
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003b
            X.9Pj r0 = r9.A06
            X.34w r5 = r0.A01
            X.7yw r4 = r0.A00
            X.9FR r2 = new X.9FR
            r2.<init>()
            X.99n r0 = r9.A0a
            X.1VX r1 = r0.A02
            r0 = 1359(0x54f, float:1.904E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x002b
            boolean r1 = X.AnonymousClass9V7.A00(r5)
            r0 = 1
            r7 = 22
            if (r1 != 0) goto L_0x002e
        L_0x002b:
            r0 = 0
            r7 = 10
        L_0x002e:
            r8 = 2
            X.9ov r3 = new X.9ov
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            r2.A01 = r0
            r10.add(r2)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94y.A0b(java.util.List):void");
    }

    public void A0d(boolean z) {
        AnonymousClass9H3 r2;
        boolean z2 = z;
        if (this instanceof C191589Fm) {
            C191589Fm r22 = (C191589Fm) this;
            if (r22.A05 == null) {
                C191639Fs r1 = new C191639Fs(r22, r22.A04, r22.A0A, r22.A0H, z2);
                r22.A05 = r1;
                C18270x1.A0w(r1, r22.A0l);
            }
        } else if (this.A05 == null) {
            String str = this.A0A;
            if ("native".equals(str)) {
                r2 = new AnonymousClass9H3(this, this.A07, this.A0C, z);
            } else if ("non_native".equals(str)) {
                r2 = new C191629Fr(this, this.A07, this.A0C, z);
            } else {
                C1899593h.A1Q("PaymentTransactionDetailsViewModel", "unsupported payment receipt type");
                return;
            }
            this.A05 = r2;
            C18270x1.A0w(r2, this.A0l);
        }
    }

    public boolean A0e() {
        C193629Pj r0 = this.A06;
        if (r0 == null || TextUtils.isEmpty(r0.A01.A0K) || this.A06.A01.A0L()) {
            return false;
        }
        return true;
    }

    public String A0I(C624034w r2) {
        if (r2.A0L() || AnonymousClass36S.A07(r2.A0F)) {
            return r2.A0F;
        }
        return r2.A0K;
    }

    public void A0S(List list) {
        AnonymousClass39U r0;
        A0Y(list);
        A0a(list);
        A01(list);
        C193629Pj r02 = this.A06;
        C626936e.A06(r02);
        C624034w r4 = r02.A01;
        AnonymousClass1S4 r3 = r4.A0A;
        if (!(r3 == null || (r0 = r3.A02) == null || TextUtils.isEmpty(r0.A02))) {
            list.add(new AnonymousClass9FN(new C204209oz(r3, this, r4, 11), this.A06.A01));
            list.add(new AnonymousClass9FF());
        }
        A0b(list);
        A0Z(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(java.util.List r11) {
        /*
            r10 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.9NZ r0 = r10.A0E()
            if (r0 == 0) goto L_0x01c2
            A01(r11)
            r11.add(r0)
        L_0x0010:
            X.99n r2 = r10.A0a
            X.7pU r1 = X.C161357pU.A0E
            X.7ae r0 = r2.A04
            X.7pU r0 = r0.A02()
            if (r1 != r0) goto L_0x0030
            boolean r0 = r2.A0F()
            if (r0 != 0) goto L_0x0028
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x0030
        L_0x0028:
            X.9Pj r0 = r10.A06
            if (r0 != 0) goto L_0x0161
            r5 = 0
        L_0x002d:
            r3.add(r5)
        L_0x0030:
            X.9NZ r0 = r10.A0F()
            r3.add(r0)
            X.9NZ r0 = r10.A0G()
            r3.add(r0)
            r4 = r10
            boolean r2 = r10 instanceof X.C191669Fv
            if (r2 == 0) goto L_0x015e
            X.9Pj r0 = r10.A06
            r6 = 0
            if (r0 == 0) goto L_0x0077
            X.34w r0 = r0.A01
            if (r0 == 0) goto L_0x0077
            X.1S4 r5 = r0.A0A
            if (r5 == 0) goto L_0x0077
            boolean r0 = r5 instanceof X.AnonymousClass99L
            if (r0 == 0) goto L_0x0077
            X.99L r5 = (X.AnonymousClass99L) r5
            X.9V2 r0 = r5.A0F
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0077
            X.9Fb r6 = new X.9Fb
            r6.<init>()
            X.2oU r0 = r10.A0O
            android.content.Context r1 = r0.A00
            r0 = 2131891742(0x7f12161e, float:1.9418213E38)
            X.C191669Fv.A02(r1, r6, r0)
            X.9V2 r0 = r5.A0F
            java.lang.String r0 = r0.A01
            r6.A03 = r0
        L_0x0077:
            r3.add(r6)
            X.9Pj r0 = r10.A06
            r9 = 0
            if (r0 == 0) goto L_0x00d2
            X.34w r0 = r0.A01
            X.1S4 r0 = r0.A0A
            if (r0 == 0) goto L_0x00d2
            X.9Xg r1 = r0.A0D()
            if (r1 == 0) goto L_0x00d2
            int r8 = r1.A01
            r0 = 1
            if (r8 <= r0) goto L_0x00d2
            X.39L r6 = r1.A02
            if (r6 == 0) goto L_0x00d2
            java.lang.Integer r0 = X.C18290x4.A0Z()
            r10.A0N(r1, r0, r9)
            X.33j r5 = r10.A0P
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            X.4Fi r1 = r6.A01
            X.C162457s7.A0D(r1)
            X.39Q r0 = r6.A02
            java.lang.String r7 = r1.B3V(r5, r0)
            X.C162457s7.A0D(r7)
            X.9Fb r9 = new X.9Fb
            r9.<init>()
            X.2oU r0 = r10.A0O
            android.content.Context r6 = r0.A00
            r0 = 2131890208(0x7f121020, float:1.9415101E38)
            X.C191669Fv.A02(r6, r9, r0)
            r5 = 2131891845(0x7f121685, float:1.9418422E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            java.lang.String r0 = java.lang.String.valueOf(r8)
            X.C18280x3.A19(r0, r7, r1)
            java.lang.String r0 = r6.getString(r5, r1)
            r9.A03 = r0
        L_0x00d2:
            r3.add(r9)
            X.9Pj r0 = r10.A06
            r6 = 0
            if (r0 == 0) goto L_0x015c
            X.34w r5 = r0.A01
            X.9Fb r7 = new X.9Fb
            r7.<init>()
            X.2oU r0 = r10.A0O
            android.content.Context r1 = r0.A00
            r0 = 2131894417(0x7f122091, float:1.9423638E38)
            X.C191669Fv.A02(r1, r7, r0)
            X.1S4 r0 = r5.A0A
            if (r0 == 0) goto L_0x015c
            java.lang.String r5 = r0.A0J()
            if (r5 == 0) goto L_0x015c
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x015c
            r7.A03 = r5
            r1 = 1
            X.9pN r0 = new X.9pN
            r0.<init>(r1, r5, r10)
            r7.A02 = r0
        L_0x0105:
            r3.add(r7)
            if (r2 == 0) goto L_0x0157
            X.9Fv r4 = (X.C191669Fv) r4
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.9Pj r0 = r4.A06
            X.34w r0 = r0.A01
            X.1S4 r1 = r0.A0A
            X.99L r1 = (X.AnonymousClass99L) r1
            r4.A0o(r2)
            X.9Pj r0 = r4.A06
            X.34w r0 = r0.A01
            int r0 = r0.A02
            r4.A0n(r1, r2, r0)
        L_0x0124:
            r3.addAll(r2)
        L_0x0127:
            boolean r0 = r3.remove(r6)
            if (r0 != 0) goto L_0x0127
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01ec
            A01(r11)
            r1 = 0
        L_0x0137:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x01ec
            java.lang.Object r0 = r3.get(r1)
            r11.add(r0)
            int r0 = r3.size()
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x0154
            X.9FF r0 = new X.9FF
            r0.<init>()
            r11.add(r0)
        L_0x0154:
            int r1 = r1 + 1
            goto L_0x0137
        L_0x0157:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            goto L_0x0124
        L_0x015c:
            r7 = r6
            goto L_0x0105
        L_0x015e:
            r6 = 0
            goto L_0x0077
        L_0x0161:
            X.34w r1 = r0.A01
            X.9Fb r5 = new X.9Fb
            r5.<init>()
            X.2oU r0 = r10.A0O
            android.content.Context r7 = r0.A00
            r0 = 2131891850(0x7f12168a, float:1.9418432E38)
            X.C191669Fv.A02(r7, r5, r0)
            int r1 = r1.A03
            r0 = 100
            if (r1 == r0) goto L_0x01b4
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x01b4
            r2 = 2131232645(0x7f080785, float:1.8081405E38)
            r6 = 2131894481(0x7f1220d1, float:1.9423768E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167798(0x7f070a36, float:1.794988E38)
        L_0x0189:
            float r0 = r1.getDimension(r0)
            int r4 = (int) r0
            android.graphics.drawable.Drawable r2 = X.AnonymousClass0RP.A00(r7, r2)
            java.lang.String r0 = r7.getString(r6)
            r5.A03 = r0
            if (r2 == 0) goto L_0x002d
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            int r0 = X.AnonymousClass5Yj.A02(r7, r1, r0)
            int r0 = X.AnonymousClass0Y8.A04(r7, r0)
            android.graphics.drawable.Drawable r1 = X.C107335b8.A0B(r2, r0)
            r5.A00 = r1
            r0 = 0
            r1.setBounds(r0, r0, r4, r4)
            goto L_0x002d
        L_0x01b4:
            r2 = 2131231251(0x7f080213, float:1.8078578E38)
            r6 = 2131894482(0x7f1220d2, float:1.942377E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167796(0x7f070a34, float:1.7949876E38)
            goto L_0x0189
        L_0x01c2:
            X.9Pj r0 = r10.A06
            r1 = 0
            if (r0 == 0) goto L_0x01d9
            X.34x r2 = r0.A02
            if (r2 == 0) goto L_0x01d9
            boolean r0 = r2 instanceof X.C30481mW
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = r2.A13()
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 == 0) goto L_0x01de
        L_0x01d9:
            r3.add(r1)
            goto L_0x0010
        L_0x01de:
            boolean r1 = r2 instanceof X.AnonymousClass1nE
            r0 = 205(0xcd, float:2.87E-43)
            if (r1 == 0) goto L_0x01e6
            r0 = 209(0xd1, float:2.93E-43)
        L_0x01e6:
            X.9FL r1 = new X.9FL
            r1.<init>(r2, r0)
            goto L_0x01d9
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94y.A0a(java.util.List):void");
    }

    public boolean A0f(C624034w r5) {
        C203549nv B66 = A0D().B66();
        return this.A0k.A0q(r5, A0D().B9W(), B66, 1);
    }

    public AnonymousClass94y(Bundle bundle, C69263Wi r6, C56972sr r7, C620433g r8, C56962sq r9, C64773Ex r10, C620633i r11, C56612sH r12, C54292oU r13, C620733j r14, C66543Lv r15, C194909Va r16, AnonymousClass36F r17, C617332a r18, AnonymousClass8EA r19, C194539Ti r20, C1906899l r21, C620933l r22, C29271iY r23, C1907099n r24, AnonymousClass9U4 r25, AnonymousClass9b0 r26, AnonymousClass9TZ r27, C203499no r28, C194969Vi r29, AnonymousClass9Tp r30, C158777kX r31, AnonymousClass9V7 r32, C195219Wq r33, AnonymousClass4FS r34) {
        int i;
        this.A0N = r12;
        this.A0H = r6;
        this.A0I = r7;
        this.A0O = r13;
        this.A0l = r34;
        this.A0U = r19;
        this.A0k = r33;
        this.A0L = r10;
        this.A0M = r11;
        this.A0P = r14;
        this.A0b = r25;
        this.A0K = r9;
        this.A0Q = r15;
        this.A0h = r30;
        this.A0X = r22;
        this.A0j = r32;
        this.A0W = r21;
        this.A0R = r16;
        this.A0a = r24;
        this.A0T = r18;
        this.A0i = r31;
        this.A0J = r8;
        this.A0d = r27;
        this.A0e = r28;
        this.A0g = r29;
        this.A0S = r17;
        this.A0c = r26;
        C29271iY r3 = r23;
        this.A0Z = r3;
        this.A0V = r20;
        this.A0G = bundle;
        this.A0B = bundle.getString("referral_screen");
        this.A07 = C107395bF.A03(bundle, "");
        this.A0C = bundle.getString("extra_transaction_id");
        String string = bundle.getString("extra_payment_receipt_type");
        this.A0A = string == null ? "native" : string;
        this.A0D = bundle.getString("extra_transaction_ref");
        this.A09 = Boolean.valueOf(bundle.getBoolean("extra_is_pending_request_saved_instance", false));
        if (this instanceof C191669Fv) {
            i = 6;
        } else if (this instanceof C191659Fu) {
            i = 5;
        } else {
            i = 7;
        }
        AnonymousClass9UF r0 = new AnonymousClass9UF(this, i);
        this.A0Y = r0;
        r3.A06(r0);
        this.A00 = bundle.getInt("extra_payment_flow_entry_point", 0);
    }
}
