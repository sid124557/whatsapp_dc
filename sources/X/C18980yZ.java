package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0yZ  reason: invalid class name and case insensitive filesystem */
public class C18980yZ extends HandlerThread {
    public long A00;
    public C54332oY A01;
    public C18930yU A02;
    public C18900yR A03;
    public C52562lg A04;
    public AnonymousClass4EX A05;
    public C18970yY A06;
    public AnonymousClass30Z A07;
    public AnonymousClass30X A08;
    public final C116985rC A09;
    public final C29171iO A0A;
    public final AnonymousClass31B A0B;
    public final C53962nx A0C;
    public final C55682qk A0D;
    public final AnonymousClass2V6 A0E;
    public final C56972sr A0F;
    public final AnonymousClass36E A0G;
    public final C29021i9 A0H;
    public final AnonymousClass5XU A0I;
    public final C66663Mh A0J;
    public final C56492s4 A0K;
    public final AnonymousClass2ZJ A0L;
    public final AnonymousClass5TW A0M;
    public final C46642by A0N;
    public final C51462jr A0O;
    public final AnonymousClass2FU A0P;
    public final C56612sH A0Q;
    public final C54292oU A0R;
    public final C57162tC A0S;
    public final AnonymousClass33p A0T;
    public final C54412og A0U;
    public final C56982ss A0V;
    public final C72303dV A0W;
    public final C64733Es A0X;
    public final AnonymousClass1VX A0Y;
    public final AnonymousClass4AF A0Z;
    public final AnonymousClass4FV A0a;
    public final C66493Lq A0b;
    public final AnonymousClass27P A0c;
    public final C383727h A0d;
    public final C50582iP A0e;
    public final C617732e A0f;
    public final AnonymousClass4FQ A0g;
    public final C52542le A0h;
    public final C67813Qt A0i;
    public final C48692fJ A0j = new C48692fJ("connection_thread/logged_flag/connected", false);
    public final C48692fJ A0k = new C48692fJ("connection_thread/logged_flag/disconnecting", false);
    public final C48692fJ A0l = new C48692fJ("connection_thread/logged_flag/quit", false);
    public final AnonymousClass31C A0m;
    public final C52992mN A0n;
    public final C55352qD A0o;
    public final C64173Cl A0p;
    public final C55882r4 A0q;
    public final C613430h A0r;
    public final C153707bo A0s;
    public final C45332Zp A0t;
    public final C55892r5 A0u;
    public final AnonymousClass2RV A0v;
    public final AnonymousClass9U5 A0w;
    public final AnonymousClass9U4 A0x;
    public final C53022mQ A0y;
    public final AnonymousClass28T A0z;
    public final C194639Tx A10;
    public final AnonymousClass28Y A11;
    public final AnonymousClass363 A12;
    public final C60442yZ A13;
    public final C28861ht A14;
    public final C51072jE A15;
    public final C44662Wz A16;
    public final C64163Ck A17;
    public final C55832qz A18;
    public final AnonymousClass4BY A19;
    public final AnonymousClass4FS A1A;
    public final C53322mu A1B;
    public final C67823Qu A1C;
    public final C183538qC A1D;
    public final C183538qC A1E;
    public final Map A1F = new HashMap(0);
    public final Random A1G;
    public final Set A1H;

    public static final int A00(int i, int i2) {
        if (i2 != -1) {
            return i2;
        }
        return i;
    }

    public static Message A04() {
        return Message.obtain((Handler) null, 0, 0, 0);
    }

    public final AnonymousClass2QI A0d(C58782vo r10, int i) {
        try {
            C54332oY A022 = this.A0f.A02(r10);
            this.A01 = A022;
            A022.A02(30000);
            int nextInt = this.A1G.nextInt();
            C18260x0.A0y("ConnectionThread/tryOpenSocket: socket connected; sessionId=", AnonymousClass001.A0o(), nextInt);
            ((C111125ha) this.A1E.get()).A00();
            C55842r0 r6 = new C55842r0(r10.A02, nextInt, r10.A00, i);
            C183538qC r2 = this.A1D;
            ((C61042zc) r2.get()).A03(r6);
            try {
                InputStream A002 = C617732e.A00(this.A01, r10);
                C56492s4 r7 = this.A0K;
                Integer A0f2 = AnonymousClass001.A0f();
                C23371So r3 = new C23371So(r7, (C61042zc) r2.get(), A002, A0f2);
                C23381Sp r22 = new C23381Sp(r7, (C61042zc) r2.get(), C617732e.A01(this.A01, r10), A0f2);
                C18260x0.A0y("ConnectionThread/tryOpenSocket: created IO streams; sessionId=", AnonymousClass001.A0o(), nextInt);
                this.A0s.A08(r6);
                return new AnonymousClass2QI(r10, r6, r3, r22);
            } catch (IOException e) {
                this.A0s.A0B(r6, 3);
                throw e;
            }
        } catch (SocketException e2) {
            this.A0s.A0B(new C55842r0(r10.A02, 0, r10.A00, i), 2);
            throw e2;
        } catch (IOException e3) {
            this.A0s.A0B(new C55842r0(r10.A02, 0, r10.A00, i), 3);
            throw e3;
        }
    }

    public final void A10(AnonymousClass1EN r8, AnonymousClass4DS r9, AnonymousClass30X r10, C55842r0 r11, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C153707bo r1;
        int i;
        try {
            A11(r8, r9, r10, atomicReference, atomicReference2);
            this.A0T.A0n();
            this.A0s.A07(r11);
        } catch (AnonymousClass24Y e) {
            e = e;
            r1 = this.A0s;
            i = 7;
            r1.A0A(r11, i);
            throw e;
        } catch (IOException e2) {
            e = e2;
            r1 = this.A0s;
            i = 8;
            r1.A0A(r11, i);
            throw e;
        } catch (AnonymousClass24H e3) {
            e = e3;
            r1 = this.A0s;
            i = 9;
            r1.A0A(r11, i);
            throw e;
        }
    }

    public final void A14(C55842r0 r14, int i, int i2, int i3, int i4, long j, long j2) {
        AnonymousClass3ZG A002 = this.A0s.A00(r14, i, i2, i3, i4, j, (long) 6, j2);
        if (A002 != null) {
            if (i == 1 || i == 5) {
                this.A0a.BhD(A002);
            } else {
                this.A0a.BhB(A002);
            }
        }
        C52992mN r0 = this.A0n;
        if (i == 1) {
            r0.A01();
        } else {
            r0.A00();
        }
    }

    public static int A01(Message message) {
        return message.arg1;
    }

    public static Message A02() {
        return AnonymousClass0x7.A0G(24);
    }

    public static Message A03() {
        return AnonymousClass0x7.A0G(22);
    }

    public static Message A05() {
        return AnonymousClass0x7.A0G(23);
    }

    public static Message A06(List list) {
        return C18290x4.A0J(90, list);
    }

    public static Message A07(List list) {
        return C18290x4.A0J(276, list);
    }

    public static Message A08(List list) {
        return C18290x4.A0J(247, list);
    }

    public static Message A09(List list) {
        return C18290x4.A0J(406, list);
    }

    public static C61042zc A0H(C18980yZ r0) {
        return (C61042zc) r0.A1D.get();
    }

    public static void A0M(AnonymousClass33p r3, AnonymousClass4AF r4, AnonymousClass36K r5) {
        String A0p2 = r5.A0p("location");
        if (TextUtils.isEmpty(A0p2) || A0p2.length() < 40) {
            C382726r.A00(r4, A0p2);
            r3.A1T(A0p2);
        }
    }

    public static void A0a(AnonymousClass24H r2, AnonymousClass36K r3) {
        r2.logoutMessageHeader = r3.A0r("logout_message_header", (String) null);
        r2.logoutMessageSubtext = r3.A0r("logout_message_subtext", (String) null);
        r2.logoutMessageLocale = r3.A0r("logout_message_locale", (String) null);
        r2.logoutMainButtonText = r3.A0r("logout_main_button_text", (String) null);
        r2.logoutMainButtonUrl = r3.A0r("logout_main_button_url", (String) null);
        r2.logoutSecondaryButtonText = r3.A0r("logout_secondary_button_text", (String) null);
        r2.logoutSecondaryButtonUrl = r3.A0r("logout_secondary_button_url", (String) null);
    }

    public final InetSocketAddress A0f() {
        AnonymousClass0PJ A002 = C58032ub.A00(this.A0R.A06());
        if (A002 == null) {
            return null;
        }
        try {
            return new InetSocketAddress((InetAddress) C18290x4.A0k(Arrays.asList(this.A0X.A00((String) A002.A00).A04)), AnonymousClass001.A0K(A002.A01));
        } catch (UnknownHostException e) {
            Log.w("ConnectionThread/getDebugChatAddress/Unable to resolve debug host", e);
            return null;
        }
    }

    public final AnonymousClass30U A0h(AnonymousClass1EN r13, C55842r0 r14, InputStream inputStream, OutputStream outputStream, InetSocketAddress inetSocketAddress, C72423dh r18, C72413dg r19) {
        C153707bo r1;
        int i;
        try {
            AnonymousClass30U r2 = new AnonymousClass30U(this.A0Q, this.A0S, r13, this.A16, inputStream, outputStream, inetSocketAddress, r18, r19);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ConnectionThread/performHandshake: completed noise handshake; sessionId=");
            C18260x0.A1G(A0o2, r14.A03);
            this.A0s.A06(r14);
            return r2;
        } catch (C36761zq e) {
            e = e;
            r1 = this.A0s;
            i = 4;
            r1.A09(r14, i);
            throw e;
        } catch (IOException e2) {
            e = e2;
            r1 = this.A0s;
            i = 5;
            r1.A09(r14, i);
            throw e;
        } catch (AnonymousClass24C e3) {
            e = e3;
            r1 = this.A0s;
            i = 6;
            r1.A09(r14, i);
            throw e;
        }
    }

    public void A0i() {
        AnonymousClass30Z r0 = this.A07;
        if (r0 != null) {
            r0.A03();
        }
    }

    public final void A0j() {
        Log.i("ConnectionThread/closeSocket");
        this.A01.A01();
    }

    public final void A0k() {
        this.A05.Bla(A03());
    }

    public final void A0m() {
        A0t(0, 8, true);
    }

    public final void A0n() {
        this.A05.Bla(A02());
        C53962nx r1 = this.A0C;
        if (r1.A01()) {
            r1.A00();
        }
    }

    public final void A0o() {
        this.A05.Bla(A05());
    }

    public final void A0p(int i) {
        if (this.A0M.A01()) {
            Log.i("ConnectionThread/handleLogoutTimeout/skip-voip-active");
            this.A03.A07(i);
            A0k();
            return;
        }
        A0H(this).A02(i);
        Log.i("ConnectionThread/handleLogoutTimeout/close-socket");
        A0j();
    }

    public final void A0q(int i) {
        this.A0l.A00(true);
        A17(false, i);
    }

    public final void A0s(long j) {
        AnonymousClass33p r1 = this.A0T;
        r1.A1I(j);
        r1.A20(false);
    }

    public final void A0t(long j, int i, boolean z) {
        if (j > 0) {
            long j2 = this.A00;
            if (j2 > j) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("ConnectionThread/handleDisconnect/skip disconnectRequestTime:");
                A0o2.append(j);
                C18260x0.A12(" lastConnectedTime:", A0o2, j2);
                return;
            }
        }
        A17(z, i);
    }

    public final void A0u(long j, long j2) {
        AnonymousClass1W6 r3 = new AnonymousClass1W6();
        long abs = Math.abs(j - j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(abs);
        if (timeUnit.toMinutes(abs) % 60 >= 30) {
            hours++;
        }
        if (j < j2) {
            hours *= -1;
        }
        if (hours != 0) {
            r3.A00 = Long.valueOf(hours);
            this.A0a.BhD(r3);
        }
    }

    public final void A0x(Message message) {
        this.A05.Bla(Message.obtain(message));
        if (C384127l.A00(message) == 37) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ConnectionThread/send/connectionactive ");
            C18260x0.A0m(message.obj, A0o2);
            this.A03.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0470, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0471, code lost:
        r26 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0474, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0475, code lost:
        r26 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0491, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0498, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x049c, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x049e, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04a0, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04a1, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04b0, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04b1, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04c5, code lost:
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04c7, code lost:
        if (r2 == null) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04d6, code lost:
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04e0, code lost:
        A0j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04e6, code lost:
        if (r0.A01 != null) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04eb, code lost:
        if (r0.A01 != null) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04ed, code lost:
        com.whatsapp.util.Log.i("ConnectionThread/connect/socket/closed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04f0, code lost:
        if (r4 != null) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0518, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0519, code lost:
        r6 = 8;
        r3 = 0;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x051e, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x051f, code lost:
        r26 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0538, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x053a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x053c, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x053d, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x053f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0540, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0551, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0552, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x056d, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x056e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0570, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05a1, code lost:
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05a3, code lost:
        if (r2 == null) goto L_0x05af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05ab, code lost:
        A0j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05b1, code lost:
        if (r0.A01 != null) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05b3, code lost:
        com.whatsapp.util.Log.i("ConnectionThread/connect/socket/closed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05b6, code lost:
        if (r4 != null) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05b8, code lost:
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05fd, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0600, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0601, code lost:
        r6 = 8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0368 A[Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x049c A[ExcHandler: 24Y (e X.24Y), PHI: r17 
      PHI: (r17v29 int) = (r17v5 int), (r17v5 int), (r17v5 int), (r17v5 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v5 int) binds: [B:42:0x0121, B:43:?, B:51:0x013e, B:64:0x016b, B:192:0x047c, B:91:0x01f2, B:92:?, B:95:0x0205, B:96:?, B:142:0x0391, B:160:0x03f9, B:164:0x0402, B:116:0x02eb, B:117:?, B:121:0x02fb, B:109:0x02d0, B:100:0x0289, B:87:0x01df, B:88:?, B:81:0x01cf, B:54:0x014f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:42:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x049e A[ExcHandler: IOException (e java.io.IOException), PHI: r17 
      PHI: (r17v28 int) = (r17v5 int), (r17v5 int), (r17v5 int), (r17v5 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v5 int) binds: [B:42:0x0121, B:43:?, B:51:0x013e, B:64:0x016b, B:192:0x047c, B:91:0x01f2, B:92:?, B:95:0x0205, B:96:?, B:142:0x0391, B:160:0x03f9, B:164:0x0402, B:116:0x02eb, B:117:?, B:121:0x02fb, B:109:0x02d0, B:100:0x0289, B:87:0x01df, B:88:?, B:81:0x01cf, B:54:0x014f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:42:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04c5 A[Catch:{ 24H -> 0x0608, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04d6 A[Catch:{ 24H -> 0x0608, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04f2 A[Catch:{ 24H -> 0x0608, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x051e A[ExcHandler: all (th java.lang.Throwable), PHI: r17 
      PHI: (r17v33 int) = (r17v5 int), (r17v5 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int) binds: [B:51:0x013e, B:64:0x016b, B:78:0x01b5, B:84:0x01d5, B:89:0x01e2, B:90:?, B:93:0x01fc, B:94:?, B:97:0x0211, B:103:0x029c, B:104:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:89:0x01e2] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0538 A[ExcHandler: 24C (e X.24C), PHI: r17 
      PHI: (r17v27 int) = (r17v5 int), (r17v5 int), (r17v5 int), (r17v5 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v5 int) binds: [B:42:0x0121, B:43:?, B:51:0x013e, B:64:0x016b, B:192:0x047c, B:78:0x01b5, B:84:0x01d5, B:89:0x01e2, B:90:?, B:91:0x01f2, B:92:?, B:93:0x01fc, B:94:?, B:95:0x0205, B:96:?, B:97:0x0211, B:103:0x029c, B:104:?, B:105:0x02af, B:113:0x02db, B:139:0x0377, B:140:?, B:142:0x0391, B:160:0x03f9, B:164:0x0402, B:116:0x02eb, B:117:?, B:121:0x02fb, B:109:0x02d0, B:100:0x0289, B:87:0x01df, B:88:?, B:81:0x01cf, B:54:0x014f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:89:0x01e2] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x053a A[ExcHandler: 1zs (e X.1zs), PHI: r17 
      PHI: (r17v26 int) = (r17v5 int), (r17v5 int), (r17v5 int), (r17v5 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v5 int) binds: [B:42:0x0121, B:43:?, B:51:0x013e, B:64:0x016b, B:192:0x047c, B:78:0x01b5, B:84:0x01d5, B:89:0x01e2, B:90:?, B:91:0x01f2, B:92:?, B:93:0x01fc, B:94:?, B:95:0x0205, B:96:?, B:97:0x0211, B:103:0x029c, B:104:?, B:105:0x02af, B:113:0x02db, B:139:0x0377, B:140:?, B:142:0x0391, B:160:0x03f9, B:164:0x0402, B:116:0x02eb, B:117:?, B:121:0x02fb, B:109:0x02d0, B:100:0x0289, B:87:0x01df, B:88:?, B:81:0x01cf, B:54:0x014f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:42:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x053f A[ExcHandler: 24C (e X.24C), PHI: r1 
      PHI: (r1v38 X.2r0) = (r1v22 X.2r0), (r1v22 X.2r0), (r1v61 X.2r0) binds: [B:39:0x0118, B:40:?, B:47:0x0133] A[DONT_GENERATE, DONT_INLINE], Splitter:B:39:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0551 A[ExcHandler: 1zs (e X.1zs), PHI: r1 
      PHI: (r1v35 X.2r0) = (r1v22 X.2r0), (r1v22 X.2r0), (r1v61 X.2r0) binds: [B:39:0x0118, B:40:?, B:47:0x0133] A[DONT_GENERATE, DONT_INLINE], Splitter:B:39:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x056d A[ExcHandler: 1zq (e X.1zq), PHI: r1 
      PHI: (r1v33 X.2r0) = (r1v22 X.2r0), (r1v22 X.2r0), (r1v61 X.2r0) binds: [B:39:0x0118, B:40:?, B:47:0x0133] A[DONT_GENERATE, DONT_INLINE], Splitter:B:39:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0570 A[ExcHandler: 1zq (e X.1zq), PHI: r17 
      PHI: (r17v25 int) = (r17v5 int), (r17v5 int), (r17v5 int), (r17v5 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v34 int), (r17v5 int) binds: [B:42:0x0121, B:43:?, B:51:0x013e, B:64:0x016b, B:192:0x047c, B:78:0x01b5, B:84:0x01d5, B:89:0x01e2, B:90:?, B:91:0x01f2, B:92:?, B:93:0x01fc, B:94:?, B:95:0x0205, B:96:?, B:97:0x0211, B:103:0x029c, B:104:?, B:105:0x02af, B:113:0x02db, B:139:0x0377, B:140:?, B:142:0x0391, B:160:0x03f9, B:164:0x0402, B:116:0x02eb, B:117:?, B:121:0x02fb, B:109:0x02d0, B:100:0x0289, B:87:0x01df, B:88:?, B:81:0x01cf, B:54:0x014f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:42:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05a1 A[Catch:{ 24H -> 0x05bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x05fd A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x063e A[Catch:{ all -> 0x06b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0641 A[Catch:{ all -> 0x06b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x065b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0512 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0512 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0512 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019e A[Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1 A[Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b5 A[SYNTHETIC, Splitter:B:78:0x01b5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0y(com.whatsapp.jid.UserJid r76, X.AnonymousClass2OU r77, java.lang.String r78, boolean r79, boolean r80) {
        /*
            r75 = this;
            java.lang.String r29 = "ConnectionThread/connect/socket/disconnect "
            java.lang.String r24 = "ConnectionThread/connect/socket/closed"
            r0 = r75
            X.2jr r1 = r0.A0O
            boolean r28 = r1.A02()
            r47 = r76
            if (r76 != 0) goto L_0x0018
            if (r28 != 0) goto L_0x0018
            java.lang.String r0 = "ConnectionThread/connect/ignored/jid null and not in companion reg"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0017:
            return
        L_0x0018:
            X.2fJ r1 = r0.A0j
            r74 = r1
            boolean r1 = r74.A01()
            if (r1 != 0) goto L_0x0017
            X.3Cl r1 = r0.A0p
            r73 = r1
            r73.A04()
            X.5XU r2 = r0.A0I
            boolean r1 = r2.A03()
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/clock"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.4FQ r0 = r0.A0g
            r0.BPE()
            return
        L_0x003c:
            if (r28 != 0) goto L_0x004c
            X.1ht r1 = r0.A14
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "ConnectionThread/connect/not-allowed/login-failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x004c:
            boolean r1 = r2.A02()
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.4FQ r0 = r0.A0g
            r0.Bbn()
            return
        L_0x005d:
            X.2fJ r1 = r0.A0l
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x006b
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/quit-flag-set"
            r0.A15(r1)
            return
        L_0x006b:
            java.lang.String r1 = "ConnectionThread/connect"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.7bo r1 = r0.A0s
            r72 = r1
            r72.A01()
            X.4FQ r1 = r0.A0g
            r71 = r1
            r71.BPm()
            X.2oY r1 = r0.A01
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.A03()
            if (r1 != 0) goto L_0x008b
            r0.A0j()
        L_0x008b:
            X.2le r1 = r0.A0h
            java.util.ArrayList r4 = r1.A00()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ConnectionThread/connect/loaded_fallbacks "
            X.C18260x0.A1P(r2, r1, r4)
            X.2sH r1 = r0.A0Q
            r70 = r1
            long r51 = r70.A0E()
            X.33p r1 = r0.A0T
            r62 = r1
            int r1 = r62.A03()
            r6 = 1
            int r18 = r1 + 1
            r3 = 0
            r2 = -1
            r5 = 0
            X.2r0 r1 = new X.2r0
            r1.<init>(r5, r3, r2, r3)
            java.util.concurrent.atomic.AtomicReference r69 = new java.util.concurrent.atomic.AtomicReference
            r69.<init>()
            r61 = 5
            r16 = r79
            android.net.TrafficStats.setThreadStatsTag(r6)     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            java.net.InetSocketAddress r44 = r0.A0f()     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            X.3Es r8 = r0.A0X     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            X.1VX r12 = r0.A0Y     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            X.2yZ r5 = r0.A13     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            X.2zS r42 = r5.A00()     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            java.util.Random r7 = r0.A1G     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            r5 = -1
            r6 = 0
            X.33N r27 = new X.33N     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            r43 = r78
            r39 = r27
            r40 = r8
            r41 = r12
            r45 = r4
            r46 = r7
            r39.<init>(r40, r41, r42, r43, r44, r45, r46)     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            int r7 = r62.A0B()     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            r4 = r27
            r4.A04(r7)     // Catch:{ 24H -> 0x0614, all -> 0x060e }
            r15 = 0
            r17 = -1
        L_0x00f0:
            boolean r2 = r27.A05()     // Catch:{ 24H -> 0x0600, all -> 0x05fd }
            if (r2 == 0) goto L_0x05be
            boolean r2 = r74.A01()     // Catch:{ 24H -> 0x0600, all -> 0x05fd }
            if (r2 != 0) goto L_0x05be
            int r22 = r3 + 1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            java.lang.String r2 = "ConnectionThread/connect: connecting; attempt="
            r3.append(r2)     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            r2 = r22
            r3.append(r2)     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            java.lang.String r2 = " state="
            r3.append(r2)     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            int r2 = r27.A01()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            X.C18260x0.A1G(r3, r2)     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            int r2 = r27.A01()     // Catch:{ 1zq -> 0x056d, 1zs -> 0x0551, IOException -> 0x04b0, 24Y -> 0x04a0, 24C -> 0x053f, all -> 0x053c }
            X.2r0 r26 = new X.2r0     // Catch:{ 1zq -> 0x056d, 1zs -> 0x0551, IOException -> 0x04b0, 24Y -> 0x04a0, 24C -> 0x053f, all -> 0x053c }
            r4 = 0
            r3 = r26
            r3.<init>(r4, r6, r5, r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r1 = r27
            X.2vo r5 = r0.A0e(r1, r2)     // Catch:{ 1zq -> 0x0533, 1zs -> 0x052e, IOException -> 0x0495, 24Y -> 0x048e, 24C -> 0x0529, all -> 0x0526 }
            int r4 = r5.A00     // Catch:{ 1zq -> 0x0533, 1zs -> 0x052e, IOException -> 0x0495, 24Y -> 0x048e, 24C -> 0x0529, all -> 0x0526 }
            X.2Kn r3 = r5.A02     // Catch:{ 1zq -> 0x0533, 1zs -> 0x052e, IOException -> 0x0495, 24Y -> 0x048e, 24C -> 0x0529, all -> 0x0526 }
            X.2r0 r1 = new X.2r0     // Catch:{ 1zq -> 0x0533, 1zs -> 0x052e, IOException -> 0x0495, 24Y -> 0x048e, 24C -> 0x0529, all -> 0x0526 }
            r1.<init>(r3, r6, r4, r2)     // Catch:{ 1zq -> 0x0533, 1zs -> 0x052e, IOException -> 0x0495, 24Y -> 0x048e, 24C -> 0x0529, all -> 0x0526 }
            X.2QI r5 = r0.A0d(r5, r2)     // Catch:{ 1zq -> 0x056d, 1zs -> 0x0551, IOException -> 0x04b0, 24Y -> 0x04a0, 24C -> 0x053f, all -> 0x053c }
            X.2r0 r1 = r5.A01     // Catch:{ 1zq -> 0x056d, 1zs -> 0x0551, IOException -> 0x04b0, 24Y -> 0x04a0, 24C -> 0x053f, all -> 0x053c }
            X.0yU r4 = new X.0yU     // Catch:{ 1zq -> 0x056d, 1zs -> 0x0551, IOException -> 0x048a, 24Y -> 0x0486, 24C -> 0x053f, all -> 0x0522 }
            r4.<init>(r0)     // Catch:{ 1zq -> 0x056d, 1zs -> 0x0551, IOException -> 0x048a, 24Y -> 0x0486, 24C -> 0x053f, all -> 0x0522 }
            X.2yo r3 = new X.2yo     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            r2 = r70
            r3.<init>(r2, r4)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            boolean r25 = r62.A2K()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            boolean r2 = r73.A09()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            if (r2 != 0) goto L_0x016a
            X.2qD r2 = r0.A0o     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0518 }
            boolean r2 = r2.A04()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0518 }
            if (r2 != 0) goto L_0x016a
            X.0yY r2 = r0.A06     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0518 }
            boolean r2 = r2.A03()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0518 }
            if (r2 == 0) goto L_0x0168
            r2 = 4996(0x1384, float:7.001E-42)
            boolean r2 = r12.A0X(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0518 }
            if (r2 == 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            r13 = 0
            goto L_0x016b
        L_0x016a:
            r13 = 1
        L_0x016b:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            java.lang.String r2 = "ConnectionThread/connect: connecting; hasPendingAcks="
            X.C18260x0.A1D(r2, r6, r13)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            if (r28 != 0) goto L_0x017f
            if (r80 != 0) goto L_0x017c
            if (r13 != 0) goto L_0x017c
            if (r25 == 0) goto L_0x017f
        L_0x017c:
            r23 = 1
            goto L_0x0181
        L_0x017f:
            r23 = 0
        L_0x0181:
            X.2iP r6 = r0.A0e     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            int r9 = r1.A03     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            X.2Kn r2 = r1.A04     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            r48 = r77
            r45 = r6
            r46 = r2
            r49 = r9
            r50 = r18
            r53 = r23
            X.1EN r54 = r45.A02(r46, r47, r48, r49, r50, r51, r53)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            r2 = r23
            r1.A02(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            if (r28 == 0) goto L_0x01a1
            r60 = 0
            goto L_0x01a7
        L_0x01a1:
            X.31B r2 = r0.A0B     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            X.3dg r60 = r2.A09()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
        L_0x01a7:
            X.31B r7 = r0.A0B     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            X.2Ko r6 = r7.A03()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            int r2 = r6.A00     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            r17 = r2
            X.3dh r2 = r6.A01     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x051e }
            if (r2 == 0) goto L_0x0478
            java.io.InputStream r6 = r5.A02     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            java.io.OutputStream r5 = r5.A03     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r53 = r0
            r55 = r1
            r56 = r6
            r57 = r5
            r59 = r2
            r58 = r44
            X.30U r8 = r53.A0h(r54, r55, r56, r57, r58, r59, r60)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.3dg r5 = r8.A04()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            if (r60 == 0) goto L_0x01d4
            byte[] r6 = r60.A00()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            goto L_0x01d5
        L_0x01d4:
            r6 = 0
        L_0x01d5:
            byte[] r2 = r5.A00()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            boolean r2 = java.util.Arrays.equals(r6, r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            if (r2 != 0) goto L_0x01e2
            r7.A0E(r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x01e2:
            X.2Ua r5 = new X.2Ua     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r5.<init>()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.2qk r14 = r0.A0D     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.2Mj r2 = r8.A01()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.3Tl r6 = new X.3Tl     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r6.<init>(r14, r12, r5, r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.205 r2 = new X.205     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r2.<init>()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            X.3Tk r7 = new X.3Tk     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r7.<init>(r6, r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            X.2ZC r2 = r8.A02()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.3To r6 = new X.3To     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r6.<init>(r14, r12, r5, r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.205 r5 = new X.205     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r5.<init>()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            X.3Tm r21 = new X.3Tm     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r2 = r21
            r2.<init>(r6, r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            java.util.concurrent.ConcurrentHashMap r5 = X.AnonymousClass0x9.A1D()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.2V6 r2 = r0.A0E     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.2Po r2 = r2.A00(r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            java.util.Map r42 = r0.A0g(r2, r3, r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.2sr r2 = r0.A0F     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r20 = r2
            X.2ss r2 = r0.A0V     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r19 = r2
            X.4FV r11 = r0.A0a     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.31C r10 = r0.A0m     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.3Qu r8 = r0.A1C     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.1iO r6 = r0.A0A     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.30Z r2 = new X.30Z     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r30 = r2
            r31 = r6
            r32 = r14
            r33 = r20
            r34 = r70
            r35 = r19
            r36 = r12
            r37 = r11
            r38 = r3
            r39 = r10
            r40 = r7
            r41 = r8
            r43 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r0.A07 = r2     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.2H8 r6 = new X.2H8     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r6.<init>(r0)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.2oU r11 = r0.A0R     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.4FS r10 = r0.A1A     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.3Mh r2 = r0.A0J     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r19 = r2
            X.2qD r2 = r0.A0o     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r38 = r2
            X.2r5 r8 = r0.A0u     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            X.30X r2 = new X.30X     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r30 = r2
            r31 = r14
            r32 = r19
            r33 = r11
            r34 = r62
            r35 = r12
            r36 = r6
            r37 = r3
            r39 = r8
            r40 = r21
            r41 = r10
            r42 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r0.A08 = r2     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            java.util.concurrent.atomic.AtomicReference r68 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r68.<init>()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            if (r28 != 0) goto L_0x029b
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r63 = r0
            r64 = r54
            r65 = r7
            r66 = r2
            r67 = r1
            r63.A10(r64, r65, r66, r67, r68, r69)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r5 = 17
            goto L_0x029c
        L_0x029b:
            r5 = 3
        L_0x029c:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            java.lang.String r2 = "ConnectionThread/connect: switching to "
            r3.append(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r3.append(r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            java.lang.String r2 = " minute read timeout; sessionId="
            r3.append(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0474, 24Y -> 0x0470, 24C -> 0x0538, all -> 0x051e }
            r26 = r1
            X.C18260x0.A1G(r3, r9)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            X.2oY r2 = r0.A01     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            int r3 = r5 * 60
            int r3 = r3 * 1000
            r2.A02(r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            long r2 = r70.A0G()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            r0.A00 = r2     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            boolean r3 = r2.A08()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            X.3Ck r2 = r0.A17     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            r2.A00()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            if (r3 == 0) goto L_0x02db
            r2 = 1689(0x699, float:2.367E-42)
            boolean r2 = r12.A0X(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            if (r2 == 0) goto L_0x02db
            X.2ZJ r2 = r0.A0L     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r2.A00()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
        L_0x02db:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            java.lang.String r2 = "ConnectionThread/connect: fetching client config; sessionId="
            X.C18260x0.A0y(r2, r3, r9)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            r2.A04()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            if (r28 != 0) goto L_0x0369
            int r5 = r19.A02()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.Object r6 = r68.get()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.String r10 = ") ; sending refresh; sessionId="
            if (r6 == 0) goto L_0x02fa
            goto L_0x030f
        L_0x02fa:
            r8 = 1
            X.2og r2 = r0.A0U     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            boolean r2 = r2.A04()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            if (r2 == 0) goto L_0x0333
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.String r2 = "ConnectionThread/connect: server properties for old app version; sending refresh; sessionId="
            X.C18260x0.A0w(r2, r3, r9)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            goto L_0x032f
        L_0x030f:
            int r2 = r6.intValue()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            if (r2 == r5) goto L_0x02fa
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.String r2 = "ConnectionThread/connect: server properties version mismatch (remote="
            r3.append(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r3.append(r6)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.String r2 = " local="
            r3.append(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r3.append(r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            X.C18260x0.A0w(r10, r3, r9)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r8 = 1
        L_0x032f:
            r2.A07(r8)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            goto L_0x0366
        L_0x0333:
            long r5 = r70.A0B()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            long r2 = r19.A05()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            long r19 = r19.A04()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            long r19 = r19 + r2
            int r7 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0349
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0366
        L_0x0349:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.String r11 = "ConnectionThread/connect: server properties too old  (last="
            r7.append(r11)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r7.append(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            java.lang.String r2 = " current="
            r7.append(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r7.append(r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            X.C18260x0.A0w(r10, r7, r9)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            X.30X r3 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r2 = 0
            r3.A07(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
        L_0x0366:
            if (r79 == 0) goto L_0x0370
            goto L_0x036b
        L_0x0369:
            r8 = 1
            goto L_0x0370
        L_0x036b:
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r2.A03()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
        L_0x0370:
            X.0yY r3 = r0.A06     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r2 = r21
            r2.A00(r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            X.30Z r3 = r0.A07     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            X.1uF r2 = new X.1uF     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            r2.<init>(r14, r4, r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            r2.start()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            r2 = r74
            r2.A00(r8)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            X.2oY r2 = r0.A01     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            java.net.InetAddress r2 = r2.A00()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            boolean r15 = r2 instanceof java.net.Inet6Address     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x0498, 24Y -> 0x0491, 24C -> 0x0538, all -> 0x0594 }
            r3 = 0
            r2 = r62
            r2.A12(r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r0.A02 = r4     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r28 != 0) goto L_0x044e
            if (r80 != 0) goto L_0x03f7
            if (r13 == 0) goto L_0x03f7
            java.util.List r7 = r38.A00()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            java.util.List r6 = r38.A02()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            java.util.List r5 = r38.A01()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            int r2 = r7.size()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 <= 0) goto L_0x03b7
            X.4EX r3 = r0.A05     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            android.os.Message r2 = A06(r7)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r3.Bla(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x03b7:
            int r2 = r6.size()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 <= 0) goto L_0x03c6
            X.4EX r3 = r0.A05     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            android.os.Message r2 = A08(r6)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r3.Bla(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x03c6:
            int r2 = r5.size()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 <= 0) goto L_0x03d5
            X.4EX r3 = r0.A05     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            android.os.Message r2 = A07(r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r3.Bla(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x03d5:
            java.util.List r5 = r73.A02()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            boolean r2 = r5.isEmpty()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 != 0) goto L_0x03f7
            int r2 = X.AnonymousClass002.A04(r5, r8)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            java.lang.Object r2 = r5.get(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            X.2lg r2 = (X.C52562lg) r2     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r0.A04 = r2     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r5.size()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            X.4EX r3 = r0.A05     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            android.os.Message r2 = A09(r5)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r3.Bla(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x03f7:
            if (r25 == 0) goto L_0x040d
            X.1i9 r2 = r0.A0H     // Catch:{ InterruptedException -> 0x0406, ExecutionException -> 0x03ff }
            r2.A09()     // Catch:{ InterruptedException -> 0x0406, ExecutionException -> 0x03ff }
            goto L_0x0418
        L_0x03ff:
            r3 = move-exception
            java.lang.String r2 = "ConnectionThread/connect/signal/execution-exception"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            goto L_0x0418
        L_0x0406:
            r3 = move-exception
            java.lang.String r2 = "ConnectionThread/connect/signal/interrupted-exception"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            goto L_0x0418
        L_0x040d:
            boolean r2 = r62.A2J()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 == 0) goto L_0x0418
            X.1i9 r2 = r0.A0H     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r2.A0B()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x0418:
            if (r80 != 0) goto L_0x042a
            if (r23 == 0) goto L_0x042a
            X.4EX r3 = r0.A05     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            android.os.Message r2 = X.AnonymousClass36N.A06(r8)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r3.Bla(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            X.0yR r2 = r0.A03     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r2.A02()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x042a:
            java.lang.Integer r5 = r62.A0W()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r5 == 0) goto L_0x0441
            X.3dV r2 = r0.A0W     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            boolean r2 = r2.A08()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 == 0) goto L_0x0441
            X.3Lq r3 = r0.A0b     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            int r2 = r5.intValue()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r3.A0C(r2, r8)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x0441:
            X.2nx r3 = r0.A0C     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            boolean r2 = r3.A01()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 == 0) goto L_0x044e
            if (r79 == 0) goto L_0x044e
            r3.A00()     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x044e:
            r2 = 1190(0x4a6, float:1.668E-42)
            boolean r2 = r12.A0X(r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            if (r2 == 0) goto L_0x045f
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            long r5 = r2.A02     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            long r2 = r2.A01     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r0.A0u(r5, r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
        L_0x045f:
            X.30X r2 = r0.A08     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            long r5 = r2.A02     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r2 = r2.A01     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            long r2 = r2 * r7
            r7 = r70
            r7.A0K(r5, r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538 }
            goto L_0x04f3
        L_0x0470:
            r5 = move-exception
            r26 = r1
            goto L_0x0492
        L_0x0474:
            r3 = move-exception
            r26 = r1
            goto L_0x0499
        L_0x0478:
            r26 = r1
            java.lang.String r2 = "ConnectionThread/connect/failed to load auth key, postponing login"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r3 = 0
            X.1zs r2 = new X.1zs     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            r2.<init>(r3)     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
            throw r2     // Catch:{ 1zq -> 0x0570, 1zs -> 0x053a, IOException -> 0x049e, 24Y -> 0x049c, 24C -> 0x0538, all -> 0x0594 }
        L_0x0486:
            r5 = move-exception
            r26 = r1
            goto L_0x048f
        L_0x048a:
            r3 = move-exception
            r26 = r1
            goto L_0x0496
        L_0x048e:
            r5 = move-exception
        L_0x048f:
            r4 = 0
            goto L_0x0492
        L_0x0491:
            r5 = move-exception
        L_0x0492:
            r1 = r26
            goto L_0x04a2
        L_0x0495:
            r3 = move-exception
        L_0x0496:
            r4 = 0
            goto L_0x0499
        L_0x0498:
            r3 = move-exception
        L_0x0499:
            r1 = r26
            goto L_0x04b2
        L_0x049c:
            r5 = move-exception
            goto L_0x04a2
        L_0x049e:
            r3 = move-exception
            goto L_0x04b2
        L_0x04a0:
            r5 = move-exception
            r4 = 0
        L_0x04a2:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x054f }
            java.lang.String r2 = "ConnectionThread/connect/socket/next-port/corrupt-stream-exception "
            java.lang.String r2 = X.AnonymousClass000.A0P(r5, r2, r3)     // Catch:{ all -> 0x054f }
            com.whatsapp.util.Log.i(r2, r5)     // Catch:{ all -> 0x054f }
            goto L_0x04d0
        L_0x04b0:
            r3 = move-exception
            r4 = 0
        L_0x04b2:
            r2 = r29
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0k(r3, r2)     // Catch:{ all -> 0x054f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x054f }
            com.whatsapp.util.Log.i(r2, r3)     // Catch:{ all -> 0x054f }
            boolean r2 = r74.A01()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 != 0) goto L_0x0512
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 == 0) goto L_0x04e4
            boolean r2 = r2.A03()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 != 0) goto L_0x04e4
            goto L_0x04e0
        L_0x04d0:
            boolean r2 = r74.A01()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 != 0) goto L_0x0512
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 == 0) goto L_0x04e9
            boolean r2 = r2.A03()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 != 0) goto L_0x04e9
        L_0x04e0:
            r0.A0j()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            goto L_0x04f0
        L_0x04e4:
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 == 0) goto L_0x04f0
            goto L_0x04ed
        L_0x04e9:
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 == 0) goto L_0x04f0
        L_0x04ed:
            com.whatsapp.util.Log.i((java.lang.String) r24)     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
        L_0x04f0:
            if (r4 == 0) goto L_0x0512
            goto L_0x0506
        L_0x04f3:
            boolean r2 = r74.A01()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 != 0) goto L_0x0512
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 == 0) goto L_0x050a
            boolean r2 = r2.A03()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 != 0) goto L_0x050a
            r0.A0j()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
        L_0x0506:
            r4.A00()     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            goto L_0x0512
        L_0x050a:
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            if (r2 == 0) goto L_0x0506
            com.whatsapp.util.Log.i((java.lang.String) r24)     // Catch:{ 24H -> 0x0608, all -> 0x06b7 }
            goto L_0x0506
        L_0x0512:
            r3 = r22
            r6 = 0
            r5 = -1
            goto L_0x00f0
        L_0x0518:
            r5 = move-exception
            r6 = 8
            r3 = 0
            r7 = 0
            goto L_0x059b
        L_0x051e:
            r5 = move-exception
            r26 = r1
            goto L_0x0595
        L_0x0522:
            r5 = move-exception
            r26 = r1
            goto L_0x0527
        L_0x0526:
            r5 = move-exception
        L_0x0527:
            r4 = 0
            goto L_0x0595
        L_0x0529:
            r3 = move-exception
            r4 = 0
            r1 = r26
            goto L_0x0541
        L_0x052e:
            r3 = move-exception
            r4 = 0
            r1 = r26
            goto L_0x0553
        L_0x0533:
            r5 = move-exception
            r4 = 0
            r1 = r26
            goto L_0x0571
        L_0x0538:
            r3 = move-exception
            goto L_0x0541
        L_0x053a:
            r3 = move-exception
            goto L_0x0553
        L_0x053c:
            r5 = move-exception
            r4 = 0
            goto L_0x0597
        L_0x053f:
            r3 = move-exception
            r4 = 0
        L_0x0541:
            java.lang.String r2 = "ConnectionThread/connect/socket/invalid-certificate-exception"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ all -> 0x054f }
            r5 = 10
            r3 = -1
            X.24H r2 = new X.24H     // Catch:{ all -> 0x054f }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x054f }
            throw r2     // Catch:{ all -> 0x054f }
        L_0x054f:
            r5 = move-exception
            goto L_0x0597
        L_0x0551:
            r3 = move-exception
            r4 = 0
        L_0x0553:
            r2 = r29
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0k(r3, r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0569 }
            com.whatsapp.util.Log.i(r2, r3)     // Catch:{ all -> 0x0569 }
            r3 = -1
            r6 = 8
            X.24H r2 = new X.24H     // Catch:{ all -> 0x0592 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0592 }
            throw r2     // Catch:{ all -> 0x0592 }
        L_0x0569:
            r5 = move-exception
            r6 = 8
            goto L_0x0599
        L_0x056d:
            r5 = move-exception
            r4 = 0
            goto L_0x0571
        L_0x0570:
            r5 = move-exception
        L_0x0571:
            r6 = 8
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0592 }
            java.lang.String r2 = "ConnectionThread/connect/socket/goaway"
            java.lang.String r2 = X.AnonymousClass000.A0P(r5, r2, r3)     // Catch:{ all -> 0x0592 }
            com.whatsapp.util.Log.i(r2, r5)     // Catch:{ all -> 0x0592 }
            int r3 = r27.A01()     // Catch:{ all -> 0x058c }
            r7 = 6
            r5 = -1
            X.24H r2 = new X.24H     // Catch:{ all -> 0x058f }
            r2.<init>(r7, r5)     // Catch:{ all -> 0x058f }
            throw r2     // Catch:{ all -> 0x058f }
        L_0x058c:
            r5 = move-exception
            r3 = 0
            goto L_0x0590
        L_0x058f:
            r5 = move-exception
        L_0x0590:
            r7 = 1
            goto L_0x059b
        L_0x0592:
            r5 = move-exception
            goto L_0x0599
        L_0x0594:
            r5 = move-exception
        L_0x0595:
            r1 = r26
        L_0x0597:
            r6 = 8
        L_0x0599:
            r3 = 0
            r7 = 0
        L_0x059b:
            boolean r2 = r74.A01()     // Catch:{ 24H -> 0x05bc }
            if (r2 != 0) goto L_0x05bb
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x05bc }
            if (r2 == 0) goto L_0x05af
            boolean r2 = r2.A03()     // Catch:{ 24H -> 0x05bc }
            if (r2 != 0) goto L_0x05af
            r0.A0j()     // Catch:{ 24H -> 0x05bc }
            goto L_0x05b6
        L_0x05af:
            X.2oY r2 = r0.A01     // Catch:{ 24H -> 0x05bc }
            if (r2 == 0) goto L_0x05b6
            com.whatsapp.util.Log.i((java.lang.String) r24)     // Catch:{ 24H -> 0x05bc }
        L_0x05b6:
            if (r4 == 0) goto L_0x05bb
            r4.A00()     // Catch:{ 24H -> 0x05bc }
        L_0x05bb:
            throw r5     // Catch:{ 24H -> 0x05bc }
        L_0x05bc:
            r5 = move-exception
            goto L_0x061d
        L_0x05be:
            r6 = 8
            boolean r2 = r74.A01()     // Catch:{ 24H -> 0x0604, all -> 0x05fd }
            if (r2 != 0) goto L_0x05cd
            r4 = r62
            r2 = r18
            r4.A12(r2)     // Catch:{ 24H -> 0x0604, all -> 0x05fd }
        L_0x05cd:
            r62.A0h()
            boolean r2 = r74.A01()
            if (r2 == 0) goto L_0x05d8
            r61 = 1
        L_0x05d8:
            int r62 = r18 + -1
            int r63 = r3 + -1
            long r2 = (long) r5
            r59 = r0
            r60 = r1
            r64 = r17
            r65 = r51
            r67 = r2
            r59.A14(r60, r61, r62, r63, r64, r65, r67)
            boolean r2 = r74.A01()
            if (r2 != 0) goto L_0x0687
            r0 = r72
            r0.A04(r1)
            r1 = 1
            r0 = r71
            r0.BRH(r1)
            goto L_0x0683
        L_0x05fd:
            r6 = move-exception
            goto L_0x06ba
        L_0x0600:
            r5 = move-exception
            r6 = 8
            goto L_0x0605
        L_0x0604:
            r5 = move-exception
        L_0x0605:
            r22 = r3
            goto L_0x060b
        L_0x0608:
            r5 = move-exception
            r6 = 8
        L_0x060b:
            r3 = 0
            r7 = 0
            goto L_0x061d
        L_0x060e:
            r6 = move-exception
            r17 = -1
            r15 = 0
            goto L_0x06bb
        L_0x0614:
            r5 = move-exception
            r6 = 8
            r17 = -1
            r15 = 0
            r7 = 0
            r22 = 0
        L_0x061d:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06b2 }
            java.lang.String r2 = "ConnectionThread/connect/login/failure type:"
            r4.append(r2)     // Catch:{ all -> 0x06b2 }
            int r2 = r5.type     // Catch:{ all -> 0x06b2 }
            r4.append(r2)     // Catch:{ all -> 0x06b2 }
            java.lang.String r2 = " code:"
            r4.append(r2)     // Catch:{ all -> 0x06b2 }
            int r2 = r5.code     // Catch:{ all -> 0x06b2 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r4, r2)     // Catch:{ all -> 0x06b2 }
            com.whatsapp.util.Log.w(r2, r5)     // Catch:{ all -> 0x06b2 }
            int r4 = r5.type     // Catch:{ all -> 0x06b2 }
            r2 = 6
            if (r4 != r2) goto L_0x0641
            r2 = -1
            r6 = 4
            goto L_0x0650
        L_0x0641:
            if (r4 != r6) goto L_0x0646
            r2 = -1
            r6 = 6
            goto L_0x0650
        L_0x0646:
            r2 = 10
            if (r4 != r2) goto L_0x064d
            r2 = -1
            r6 = 7
            goto L_0x0650
        L_0x064d:
            int r2 = r5.serverErrorCode     // Catch:{ all -> 0x06b2 }
            r6 = 3
        L_0x0650:
            r4 = r71
            r4.BVv(r5)     // Catch:{ all -> 0x06ae }
            boolean r4 = r74.A01()
            if (r4 != 0) goto L_0x06aa
            if (r7 == 0) goto L_0x06aa
            r4 = r62
            r4.A18(r3)
        L_0x0662:
            boolean r3 = r74.A01()
            if (r3 == 0) goto L_0x0669
            r6 = 1
        L_0x0669:
            int r7 = r18 + -1
            int r8 = r22 + -1
            long r2 = (long) r2
            r4 = r0
            r5 = r1
            r9 = r17
            r10 = r51
            r12 = r2
            r4.A14(r5, r6, r7, r8, r9, r10, r12)
            boolean r2 = r74.A01()
            if (r2 != 0) goto L_0x0687
            r0 = r72
            r0.A04(r1)
        L_0x0683:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x0687:
            int r5 = r1.A03
            java.lang.Object r4 = r69.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            r3 = r71
            r2 = r16
            r3.BPl(r4, r5, r15, r2)
            X.4EX r3 = r0.A05
            X.30X r2 = r0.A08
            r3.BlJ(r2)
            r2 = r72
            r2.A03(r1)
            X.2zc r0 = A0H(r0)
            r0.A03(r1)
            goto L_0x0683
        L_0x06aa:
            r62.A0h()
            goto L_0x0662
        L_0x06ae:
            r6 = move-exception
            r3 = r22
            goto L_0x06bb
        L_0x06b2:
            r6 = move-exception
            r3 = r22
            r2 = -1
            goto L_0x06bb
        L_0x06b7:
            r6 = move-exception
            r3 = r22
        L_0x06ba:
            r2 = -1
        L_0x06bb:
            r62.A0h()
            boolean r4 = r74.A01()
            if (r4 == 0) goto L_0x06c6
            r61 = 1
        L_0x06c6:
            int r62 = r18 + -1
            int r63 = r3 + -1
            long r2 = (long) r2
            r59 = r0
            r60 = r1
            r64 = r17
            r65 = r51
            r67 = r2
            r59.A14(r60, r61, r62, r63, r64, r65, r67)
            boolean r2 = r74.A01()
            if (r2 != 0) goto L_0x06ed
            r0 = r72
            r0.A04(r1)
            r1 = 1
            r0 = r71
            r0.BRH(r1)
        L_0x06e9:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r6
        L_0x06ed:
            int r5 = r1.A03
            java.lang.Object r4 = r69.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            r3 = r71
            r2 = r16
            r3.BPl(r4, r5, r15, r2)
            X.4EX r3 = r0.A05
            X.30X r2 = r0.A08
            r3.BlJ(r2)
            r2 = r72
            r2.A03(r1)
            X.2zc r0 = A0H(r0)
            r0.A03(r1)
            goto L_0x06e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18980yZ.A0y(com.whatsapp.jid.UserJid, X.2OU, java.lang.String, boolean, boolean):void");
    }

    public final void A0z(AnonymousClass4EX r3) {
        this.A05 = r3;
        this.A0g.BPp(new C18940yV(this));
    }

    public final void A13(AnonymousClass30X r3) {
        if (r3 == this.A08) {
            A17(true, 2);
        }
    }

    public final void A16(boolean z) {
        if (z) {
            this.A0o.A03();
            C52562lg r1 = this.A04;
            if (r1 != null) {
                this.A0p.A08(r1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A17(boolean r7, int r8) {
        /*
            r6 = this;
            X.0yR r0 = r6.A03
            boolean r5 = r0.A09()
            X.0yR r0 = r6.A03
            int r2 = r0.A00
            r0.A03()
            X.30Z r0 = r6.A07
            if (r0 == 0) goto L_0x0016
            r0.A01()
        L_0x0016:
            X.2fJ r1 = r6.A0j
            boolean r0 = r1.A01()
            java.lang.String r3 = "quit during forced disconnect"
            if (r0 == 0) goto L_0x0054
            X.2fJ r4 = r6.A0k
            boolean r0 = r4.A01()
            if (r0 != 0) goto L_0x0054
            r2 = 1
            if (r7 == 0) goto L_0x0083
            java.lang.String r0 = "ConnectionThread/disconnect/reader_thread/mark_finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yU r0 = r6.A02
            if (r0 == 0) goto L_0x0038
            r0.A00()
        L_0x0038:
            X.2zc r0 = A0H(r6)
            r0.A02(r8)
            r6.A0j()
            X.4EX r0 = r6.A05
            r0.BlN()
            X.4FQ r0 = r6.A0g
            r0.BRH(r2)
            r0 = 0
            r1.A00(r0)
        L_0x0050:
            r6.A15(r3)
        L_0x0053:
            return
        L_0x0054:
            if (r5 == 0) goto L_0x006a
            if (r7 == 0) goto L_0x0074
            X.0yR r1 = r6.A03
            int r0 = A00(r8, r2)
            r1.A06(r0)
        L_0x0061:
            X.2fJ r0 = r6.A0k
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0053
            goto L_0x0050
        L_0x006a:
            if (r7 == 0) goto L_0x0074
            X.2zc r0 = A0H(r6)
            r0.A02(r8)
            goto L_0x0061
        L_0x0074:
            X.2fJ r0 = r6.A0k
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "quit even if not connected"
            r6.A15(r0)
            return
        L_0x0083:
            X.0yR r0 = r6.A03
            r0.A07(r8)
            X.4EX r1 = r6.A05
            android.os.Message r0 = X.AnonymousClass36N.A01()
            r1.Bla(r0)
            r4.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18980yZ.A17(boolean, int):void");
    }

    public final void A18(boolean z, int i) {
        C61042zc A0H2;
        AnonymousClass30Z r0 = this.A07;
        if (r0 != null) {
            r0.A01();
        }
        this.A0j.A00(false);
        this.A0k.A00(false);
        if (!this.A0l.A01()) {
            C18900yR r02 = this.A03;
            int A012 = r02.A01();
            r02.A05();
            this.A05.BlN();
            this.A0g.BRH(z);
            if (!z) {
                A0H2 = A0H(this);
                if (A012 == -1) {
                    A012 = 4;
                }
            } else if (i == 0) {
                this.A0D.A0A("logout-report-new-exception", false, "please include correct error type");
            } else if (i == 1) {
                A0H2 = A0H(this);
                if (A012 == -1) {
                    A012 = 3;
                }
            } else if (i == 2) {
                A0H2 = A0H(this);
                if (A012 == -1) {
                    A012 = 5;
                }
            }
            A0H2.A02(A012);
        } else {
            A15("ConnectionThread/quit after disconnected");
        }
        this.A03.A03();
    }

    public final boolean A19() {
        Log.d("ConnectionThread/isLoggingOut");
        return this.A03.A09();
    }

    public void onLooperPrepared() {
        this.A03 = new C18900yR(this);
        AnonymousClass1VX r1 = this.A0Y;
        C64173Cl r4 = this.A0p;
        C55892r5 r6 = this.A0u;
        C18960yX r5 = new C18960yX(this);
        C55882r4 r0 = this.A0q;
        Objects.requireNonNull(r0);
        AnonymousClass2H6 r2 = new AnonymousClass2H6(r0);
        AnonymousClass363 r02 = this.A12;
        Objects.requireNonNull(r02);
        C18970yY r03 = new C18970yY(r1, r2, new AnonymousClass2H7(r02), r4, r5, r6);
        this.A06 = r03;
        r03.start();
        this.A0t.A00();
        this.A0r.A02(this.A0m);
    }

    public static final void A0b(C53272mp r5, Map map) {
        String[] A022 = r5.A02();
        int length = A022.length;
        int i = 0;
        while (i < length) {
            String str = A022[i];
            if (!map.containsKey(str)) {
                map.put(str, r5);
                i++;
            } else {
                throw AnonymousClass001.A0e("ConnectionReader/addStanzaHandler this stanza is already handled");
            }
        }
    }

    public final C58782vo A0e(AnonymousClass33N r7, int i) {
        try {
            C58782vo A022 = r7.A02();
            this.A0s.A05(new C55842r0(A022.A02, 0, A022.A00, i));
            return A022;
        } catch (UnknownHostException e) {
            this.A0s.A02(i);
            throw e;
        }
    }

    public final Map A0g(C42802Po r36, C60592yo r37, Map map) {
        HashMap A0t2 = AnonymousClass001.A0t();
        C60592yo r34 = r37;
        Map map2 = map;
        C53052mT r2 = new C53052mT(r36, r34, map2, this.A1F);
        for (AnonymousClass4B8 B16 : this.A1H) {
            A0b(B16.B16(r2), A0t2);
        }
        C56612sH r33 = this.A0Q;
        AnonymousClass1VX r32 = this.A0Y;
        C55682qk r31 = this.A0D;
        AnonymousClass4FV r30 = this.A0a;
        AnonymousClass31C r15 = this.A0m;
        AnonymousClass2RV r14 = this.A0v;
        AnonymousClass9U5 r13 = this.A0w;
        C67813Qt r12 = this.A0i;
        A0b(new C32061pV(r31, r33, r32, r30, r34, r12, r15, r14, r13, map2), A0t2);
        C56972sr r11 = this.A0F;
        C383727h r9 = this.A0d;
        AnonymousClass36E r7 = this.A0G;
        AnonymousClass9U4 r6 = this.A0x;
        AnonymousClass4BY r5 = this.A19;
        C53322mu r4 = this.A1B;
        C194639Tx r3 = this.A10;
        AnonymousClass33p r22 = this.A0T;
        C67813Qt r20 = r12;
        AnonymousClass31C r21 = r15;
        AnonymousClass2RV r222 = r14;
        AnonymousClass36E r122 = r7;
        AnonymousClass2FU r132 = this.A0P;
        C56612sH r142 = r33;
        AnonymousClass33p r152 = r22;
        AnonymousClass1VX r16 = r32;
        C55682qk r10 = r31;
        A0b(new C32041pT(r10, r11, r122, r132, r142, r152, r16, r30, r9, r34, r20, r21, r222, r13, r6, this.A0y, r3, r5, r4, map2), A0t2);
        A0b(new C32131pc(r10, r11, r142, r22, r32, r30, r34, r34, map2), A0t2);
        return A0t2;
    }

    public final void A0l() {
        A0j();
        A18(false, -1);
    }

    public final void A0r(int i) {
        A0j();
        A18(true, i);
    }

    public final void A0v(Message message) {
        String string = message.getData().getString("iqId");
        C18260x0.A0q("ConnectionThread/handleIqResponse/recv; id=", string, C18290x4.A0u(string));
        if (!this.A0r.A08((AnonymousClass36K) message.obj, string)) {
            this.A0g.BUl(string);
        }
    }

    public final void A0w(Message message) {
        int A012 = A01(message);
        if (A012 == 4) {
            long j = message.getData().getLong("timestamp");
            C56612sH r2 = this.A0Q;
            r2.A0K(j * 1000, r2.A0C());
            this.A05.Bla(A04());
            A0H(this).A01();
        } else if (A012 != 87) {
            C613430h r1 = this.A0r;
            if (r1.A07(A012)) {
                r1.A01(Message.obtain(message), A012);
            } else {
                this.A0g.Bfs(Message.obtain(message));
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ConnectionThread/handleXMPPRecv/connection_active_set ");
            C18260x0.A0m(message.obj, A0o2);
            this.A03.A04();
            A16(AnonymousClass001.A1Z(message.obj));
        }
    }

    public final void A11(AnonymousClass1EN r13, AnonymousClass4DS r14, AnonymousClass30X r15, AtomicReference atomicReference, AtomicReference atomicReference2) {
        AnonymousClass24H r1;
        boolean A0M2 = r13.A0M().A0M();
        AnonymousClass36K BLZ = r14.BLZ();
        boolean z = false;
        while (BLZ != null) {
            if (AnonymousClass36K.A0W(BLZ, "web")) {
                if (z) {
                    throw AnonymousClass24Y.A01("multiple web nodes encountered on login");
                } else if (A0M2) {
                    AnonymousClass36K A0l2 = BLZ.A0l("error");
                    if (A0l2 != null) {
                        C60592yo.A00(A0l2.A0b("code", 500));
                    }
                    BLZ = r14.BLZ();
                    z = true;
                } else {
                    throw AnonymousClass24Y.A01("web node given during login without any web ref provided");
                }
            } else if (AnonymousClass36K.A0W(BLZ, "success")) {
                if (!A0M2 || z) {
                    String A0p2 = BLZ.A0p("t");
                    if (A0p2 != null) {
                        try {
                            long parseLong = Long.parseLong(A0p2);
                            r15.A02 = parseLong;
                            r15.A01 = this.A0Q.A0C() / 1000;
                            A0s(parseLong);
                        } catch (NumberFormatException unused) {
                            throw AnonymousClass24Y.A02("invalid server time; timeString=", A0p2, AnonymousClass001.A0o());
                        }
                    }
                    int A0b2 = BLZ.A0b("props", -1);
                    if (A0b2 != -1) {
                        atomicReference.set(Integer.valueOf(A0b2));
                    }
                    int A0b3 = BLZ.A0b("abprops", -1);
                    if (A0b3 != -1) {
                        atomicReference2.set(Integer.valueOf(A0b3));
                    }
                    Jid A0g2 = BLZ.A0g(Jid.class, "lid");
                    if (A0g2 != null) {
                        this.A0F.A0T(A0g2);
                    }
                    String A0r2 = BLZ.A0r("display_name", (String) null);
                    if (A0r2 != null) {
                        this.A0F.A0X(A0r2);
                    }
                    A0M(this.A0T, this.A0Z, BLZ);
                    AnonymousClass30Z r0 = this.A07;
                    if (r0 != null) {
                        r0.A02();
                        return;
                    }
                    return;
                }
                throw AnonymousClass24Y.A01("web was expected but not seen before success");
            } else if (AnonymousClass36K.A0W(BLZ, "failure")) {
                int A0a2 = BLZ.A0a("reason");
                C18260x0.A0z("ConnectionThread/login/failure/reason=", AnonymousClass001.A0o(), A0a2);
                if (this.A0F.A0Y() && this.A0T.A2K()) {
                    this.A0N.A00(3, (long) A0a2);
                }
                A0M(this.A0T, this.A0Z, BLZ);
                if (A0a2 >= 500) {
                    if (A0a2 < 600) {
                        throw new AnonymousClass24H(4, A0a2);
                    }
                } else if (A0a2 == 402) {
                    AnonymousClass24H r12 = new AnonymousClass24H(2, A0a2);
                    r12.expire_time_out = BLZ.A0a("expire");
                    r12.code = BLZ.A0a("code");
                    r12.banMessage = BLZ.A0r("message", (String) null);
                    r12.faqUrl = BLZ.A0r("url", (String) null);
                    throw r12;
                }
                if (A0a2 == 403) {
                    r1 = new AnonymousClass24H(7, A0a2);
                    r1.violationType = BLZ.A0b("vt", 0);
                    r1.banAppealToken = BLZ.A0r("appeal_token", (String) null);
                } else if (A0a2 == 405) {
                    AnonymousClass24H r16 = new AnonymousClass24H(3, A0a2);
                    r16.expiration_time = AnonymousClass36K.A05(BLZ, "t") * 1000;
                    throw r16;
                } else if (A0a2 == 406) {
                    AnonymousClass24H r17 = new AnonymousClass24H(5, A0a2);
                    r17.code = BLZ.A0b("code", 0);
                    throw r17;
                } else if (A0a2 == 416) {
                    r1 = new AnonymousClass24H(11, A0a2);
                    r1.violationType = BLZ.A0b("vt", 0);
                    r1.violationReason = BLZ.A0r("violation_reason", (String) null);
                    r1.violationSourceAcct = BLZ.A0b("source_acct", -1);
                } else if (A0a2 != 401 || !this.A0Y.A0X(3281)) {
                    r1 = new AnonymousClass24H(0, A0a2);
                } else {
                    r1 = new AnonymousClass24H(9, A0a2);
                }
                A0a(r1, BLZ);
                throw r1;
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("unexpected node received during login sequence; node=");
                throw AnonymousClass24Y.A01(AnonymousClass000.A0X(BLZ.A0o(), A0o2));
            }
        }
        throw AnonymousClass24Y.A01("node stream ended unexpectedly");
    }

    public final void A12(AnonymousClass2z0 r3) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("ConnectionThread/handleMessageSent id=");
        C18260x0.A1J(A0o2, r3.A01);
        this.A03.A08(r3);
    }

    public final void A15(String str) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("ConnectionThread/quitIfNeeded should quit: ");
        C48692fJ r1 = this.A0l;
        C18260x0.A1V(A0o2, r1.A01());
        if (r1.A01()) {
            Log.i(str);
            this.A06.quit();
            quit();
        }
    }

    public boolean quit() {
        boolean quit = super.quit();
        this.A0g.BZL();
        return quit;
    }

    public C18980yZ(C116985rC r4, C29171iO r5, AnonymousClass31B r6, C53962nx r7, C55682qk r8, AnonymousClass2V6 r9, C56972sr r10, AnonymousClass36E r11, C29021i9 r12, AnonymousClass5XU r13, C66663Mh r14, C56492s4 r15, AnonymousClass2ZJ r16, AnonymousClass5TW r17, C46642by r18, C51462jr r19, AnonymousClass2FU r20, C56612sH r21, C54292oU r22, C57162tC r23, AnonymousClass33p r24, C54412og r25, C56982ss r26, C72303dV r27, C64733Es r28, AnonymousClass1VX r29, AnonymousClass4AF r30, AnonymousClass4FV r31, C66493Lq r32, AnonymousClass27P r33, C383727h r34, C50582iP r35, C617732e r36, AnonymousClass4FQ r37, C52542le r38, C67813Qt r39, AnonymousClass31C r40, C52992mN r41, C55352qD r42, C64173Cl r43, C55882r4 r44, C613430h r45, C153707bo r46, C45332Zp r47, C55892r5 r48, AnonymousClass2RV r49, AnonymousClass9U5 r50, AnonymousClass9U4 r51, C53022mQ r52, AnonymousClass28T r53, C194639Tx r54, AnonymousClass28Y r55, AnonymousClass363 r56, C60442yZ r57, C28861ht r58, C51072jE r59, C44662Wz r60, C64163Ck r61, C55832qz r62, AnonymousClass4BY r63, AnonymousClass4FS r64, C53322mu r65, C67823Qu r66, C183538qC r67, C183538qC r68, Set set) {
        super("ConnectionThread", 1);
        this.A0g = r37;
        this.A0R = r22;
        this.A0Q = r21;
        this.A0Y = r29;
        this.A0X = r28;
        this.A0D = r8;
        this.A0F = r10;
        this.A1A = r64;
        this.A0I = r13;
        this.A0K = r15;
        this.A0V = r26;
        this.A0a = r31;
        this.A0J = r14;
        this.A0B = r6;
        this.A14 = r58;
        this.A0p = r43;
        this.A0m = r40;
        this.A0M = r17;
        this.A0d = r34;
        this.A0G = r11;
        this.A0h = r38;
        this.A0s = r46;
        this.A1D = r67;
        this.A1E = r68;
        this.A1C = r66;
        this.A13 = r57;
        this.A0x = r51;
        this.A09 = r4;
        this.A18 = r62;
        this.A0b = r32;
        this.A0H = r12;
        this.A0q = r44;
        this.A1B = r65;
        this.A19 = r63;
        this.A16 = r60;
        this.A0Z = r30;
        this.A0o = r42;
        this.A0c = r33;
        this.A0C = r7;
        this.A0u = r48;
        this.A0n = r41;
        this.A0W = r27;
        this.A10 = r54;
        this.A0T = r24;
        this.A11 = r55;
        this.A0e = r35;
        this.A0t = r47;
        this.A0v = r49;
        this.A0w = r50;
        this.A0L = r16;
        this.A17 = r61;
        this.A1H = set;
        this.A0f = r36;
        this.A0P = r20;
        this.A15 = r59;
        this.A0A = r5;
        this.A0z = r53;
        this.A0r = r45;
        this.A0U = r25;
        this.A0N = r18;
        this.A0i = r39;
        this.A0S = r23;
        this.A0y = r52;
        this.A0O = r19;
        this.A12 = r56;
        this.A0E = r9;
        this.A1G = AnonymousClass0x9.A1C();
    }
}
