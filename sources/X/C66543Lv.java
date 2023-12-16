package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Lv  reason: invalid class name and case insensitive filesystem */
public class C66543Lv implements AnonymousClass485 {
    public AnonymousClass300 A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final C116985rC A05;
    public final C55682qk A06;
    public final C64393Dh A07;
    public final C69263Wi A08;
    public final C56972sr A09;
    public final AnonymousClass36E A0A;
    public final C56352rq A0B;
    public final C49712gy A0C;
    public final C49392gS A0D;
    public final C51352jg A0E;
    public final C64773Ex A0F;
    public final C56422rx A0G;
    public final C44382Vv A0H;
    public final C622334f A0I;
    public final C620633i A0J;
    public final C56612sH A0K;
    public final AnonymousClass33p A0L;
    public final C22931Qq A0M;
    public final AnonymousClass1k8 A0N;
    public final C52852m9 A0O;
    public final C47952e6 A0P;
    public final C49462gZ A0Q;
    public final C50632iV A0R;
    public final C54432oi A0S;
    public final C44922Xz A0T;
    public final C28871hu A0U;
    public final AnonymousClass2Y0 A0V;
    public final C56922sm A0W;
    public final C56982ss A0X;
    public final C48522f2 A0Y;
    public final AnonymousClass2ZW A0Z;
    public final C28891hw A0a;
    public final C46962cU A0b;
    public final C47962e7 A0c;
    public final C49472ga A0d;
    public final C55792qv A0e;
    public final AnonymousClass2Y2 A0f;
    public final AnonymousClass313 A0g;
    public final C56412rw A0h;
    public final C47972e8 A0i;
    public final C47982e9 A0j;
    public final C48532f3 A0k;
    public final AnonymousClass30T A0l;
    public final C66533Lu A0m;
    public final C60532yi A0n;
    public final C55762qs A0o;
    public final C56892sj A0p;
    public final C50012hU A0q;
    public final AnonymousClass35R A0r;
    public final C623334p A0s;
    public final C60202yA A0t;
    public final C52862mA A0u;
    public final C56562sC A0v;
    public final C613830m A0w;
    public final C53132mb A0x;
    public final C54762pF A0y;
    public final C53612nN A0z;
    public final C61142zm A10;
    public final C52352lL A11;
    public final C66483Lp A12;
    public final C51532jy A13;
    public final C29431io A14;
    public final C47992eA A15;
    public final C28761hj A16;
    public final C55272q5 A17;
    public final C72303dV A18;
    public final C48542f4 A19;
    public final C48992fo A1A;
    public final C194909Va A1B;
    public final C51552k0 A1C;
    public final C42292Nn A1D;
    public final C48002eB A1E;
    public final C53622nO A1F;
    public final C42302No A1G;
    public final C54572ow A1H;
    public final AnonymousClass2W2 A1I;
    public final C55282q6 A1J;
    public final C54582ox A1K;
    public final C56082rO A1L;
    public final C66393Lg A1M;
    public final C55332qB A1N;
    public final C48562f6 A1O;
    public final C56382rt A1P;
    public final AnonymousClass34U A1Q;
    public final C48012eC A1R;
    public final C59282wf A1S;
    public final C49802h7 A1T;
    public final C56362rr A1U;
    public final C42882Pw A1V;
    public final C55622qe A1W;
    public final C49002fp A1X;
    public final C48022eD A1Y;
    public final C54062o7 A1Z;
    public final AnonymousClass2W5 A1a;
    public final C620233e A1b;
    public final C53992o0 A1c;
    public final AnonymousClass302 A1d;
    public final C55342qC A1e;
    public final C612830a A1f;
    public final C614530v A1g;
    public final C55292q7 A1h;
    public final C56662sM A1i;
    public final AnonymousClass311 A1j;
    public final C29041iB A1k;
    public final AnonymousClass8EA A1l;
    public final C56112rR A1m;
    public final C60992zV A1n;
    public final AnonymousClass2WE A1o;
    public final C158767kW A1p;
    public final C59932xj A1q;
    public final AnonymousClass1VX A1r;
    public final AnonymousClass3LP A1s;
    public final AnonymousClass4FV A1t;
    public final AnonymousClass2YF A1u;
    public final C48102eL A1v;
    public final C55582qa A1w;
    public final C53202mi A1x;
    public final AnonymousClass2WW A1y;
    public final C52552lf A1z;
    public final C66653Mg A20;
    public final C55352qD A21;
    public final C55882r4 A22;
    public final AnonymousClass33Y A23;
    public final C55892r5 A24;
    public final C49132g2 A25;
    public final C59802xV A26;
    public final C196439aq A27;
    public final AnonymousClass9U4 A28;
    public final C44632Ww A29;
    public final C44642Wx A2A;
    public final C56832sd A2B;
    public final C49682gv A2C;
    public final C55832qz A2D;
    public final C56572sD A2E;
    public final C72173dI A2F;
    public final AnonymousClass4FS A2G;
    public final AnonymousClass2P9 A2H;
    public final C53322mu A2I;
    public final C183538qC A2J;
    public final C183538qC A2K;
    public final C183538qC A2L;
    public final C183538qC A2M;
    public final C183538qC A2N;
    public final Map A2O;

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x019d, code lost:
        if ((!r0) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x023c, code lost:
        if (X.C627636p.A0Z(r14) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f9, code lost:
        r5 = ((X.C31891p1) r14).A01.contains(X.C56972sr.A05(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0126, code lost:
        if (r2 != 36) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C55682qk r9, X.C56972sr r10, X.C622334f r11, X.AnonymousClass33p r12, X.AnonymousClass31A r13, X.C624134x r14) {
        /*
            r1 = 0
            if (r13 == 0) goto L_0x00f0
            boolean r0 = r13.A0i
            if (r0 == 0) goto L_0x00f0
            boolean r0 = X.C627636p.A0a(r14)
            if (r0 != 0) goto L_0x004f
            boolean r0 = r14 instanceof X.C31241ny
            if (r0 != 0) goto L_0x004f
            byte r2 = r14.A1I
            r0 = 8
            if (r2 == r0) goto L_0x004f
            boolean r0 = X.C627636p.A0c(r14)
            if (r0 != 0) goto L_0x004f
            boolean r0 = X.C627636p.A0j(r14)
            if (r0 != 0) goto L_0x004f
            boolean r0 = X.C627636p.A0e(r14)
            if (r0 != 0) goto L_0x004f
            boolean r0 = X.C627636p.A0f(r14)
            if (r0 != 0) goto L_0x004f
            X.2z0 r0 = r14.A1J
            boolean r5 = r0.A02
            if (r5 == 0) goto L_0x012d
            boolean r0 = X.C627636p.A0o(r14)
            if (r0 == 0) goto L_0x012d
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r2 = r0.A00
            r0 = 21
            if (r2 == r0) goto L_0x004f
            r0 = 27
            if (r2 == r0) goto L_0x004f
            r0 = 131(0x83, float:1.84E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 6
            if (r2 != r0) goto L_0x012d
        L_0x004f:
            r3 = 0
        L_0x0050:
            boolean r4 = r14 instanceof X.C30341mI
            r5 = 1
            if (r4 == 0) goto L_0x0114
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r6 = r0.A00
            r0 = 4
            if (r6 == r0) goto L_0x010e
            r0 = 5
            if (r6 == r0) goto L_0x010e
            r0 = 6
            if (r6 == r0) goto L_0x0107
            r0 = 7
            if (r6 == r0) goto L_0x010e
            switch(r6) {
                case 1: goto L_0x0091;
                case 18: goto L_0x0107;
                case 20: goto L_0x00f9;
                case 21: goto L_0x0107;
                case 22: goto L_0x012a;
                case 23: goto L_0x012a;
                case 24: goto L_0x012a;
                case 25: goto L_0x012a;
                case 26: goto L_0x012a;
                case 27: goto L_0x0107;
                case 59: goto L_0x0107;
                case 67: goto L_0x0107;
                case 69: goto L_0x012a;
                case 71: goto L_0x0107;
                case 87: goto L_0x012a;
                case 90: goto L_0x00f9;
                case 93: goto L_0x00f9;
                case 95: goto L_0x012a;
                case 98: goto L_0x012a;
                case 102: goto L_0x012a;
                case 103: goto L_0x012a;
                case 104: goto L_0x012a;
                case 105: goto L_0x012a;
                case 106: goto L_0x00f9;
                case 108: goto L_0x0091;
                case 109: goto L_0x012a;
                case 112: goto L_0x012a;
                case 113: goto L_0x012a;
                case 114: goto L_0x012a;
                case 115: goto L_0x012a;
                case 116: goto L_0x012a;
                case 123: goto L_0x00f9;
                case 124: goto L_0x00f9;
                case 126: goto L_0x00f9;
                case 127: goto L_0x00f9;
                case 128: goto L_0x012a;
                case 131: goto L_0x0107;
                case 137: goto L_0x012a;
                case 138: goto L_0x012a;
                case 144: goto L_0x00f9;
                case 149: goto L_0x00f9;
                case 150: goto L_0x012a;
                case 151: goto L_0x012a;
                case 152: goto L_0x012a;
                default: goto L_0x0069;
            }
        L_0x0069:
            switch(r6) {
                case 12: goto L_0x00f9;
                case 13: goto L_0x00f9;
                case 14: goto L_0x00f9;
                default: goto L_0x006c;
            }
        L_0x006c:
            switch(r6) {
                case 29: goto L_0x0107;
                case 30: goto L_0x0107;
                case 31: goto L_0x0107;
                case 32: goto L_0x0107;
                default: goto L_0x006f;
            }
        L_0x006f:
            switch(r6) {
                case 34: goto L_0x012a;
                case 35: goto L_0x012a;
                case 36: goto L_0x012a;
                default: goto L_0x0072;
            }
        L_0x0072:
            switch(r6) {
                case 46: goto L_0x012a;
                case 47: goto L_0x012a;
                case 48: goto L_0x012a;
                case 49: goto L_0x012a;
                case 50: goto L_0x012a;
                default: goto L_0x0075;
            }
        L_0x0075:
            switch(r6) {
                case 53: goto L_0x0107;
                case 54: goto L_0x0107;
                case 55: goto L_0x012a;
                case 56: goto L_0x0107;
                case 57: goto L_0x0107;
                default: goto L_0x0078;
            }
        L_0x0078:
            switch(r6) {
                case 61: goto L_0x012a;
                case 62: goto L_0x012a;
                case 63: goto L_0x012a;
                default: goto L_0x007b;
            }
        L_0x007b:
            switch(r6) {
                case 73: goto L_0x0107;
                case 74: goto L_0x0107;
                case 75: goto L_0x012a;
                default: goto L_0x007e;
            }
        L_0x007e:
            switch(r6) {
                case 77: goto L_0x0091;
                case 78: goto L_0x012a;
                case 79: goto L_0x00f9;
                default: goto L_0x0081;
            }
        L_0x0081:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "action: "
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r2, r6)
            java.lang.String r0 = "unarchive_refactor_default_change"
            r9.A0A(r0, r1, r2)
        L_0x0091:
            if (r3 == r5) goto L_0x00c2
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            X.2z0 r0 = r14.A1J
            boolean r0 = r0.A02
            r5.append(r0)
            X.AnonymousClass001.A1M(r5)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r4 == 0) goto L_0x00f1
            java.lang.String r0 = "system action: "
            r2.append(r0)
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r0 = r0.A00
        L_0x00b2:
            r2.append(r0)
            X.AnonymousClass000.A1B(r2, r5)
            java.lang.String r2 = r5.toString()
            java.lang.String r0 = "unarchive_refactor_gap_found"
            r9.A0A(r0, r1, r2)
        L_0x00c2:
            if (r3 == 0) goto L_0x00f0
            X.33p r0 = r11.A03
            boolean r0 = r0.A28()
            if (r0 != 0) goto L_0x00e2
            X.2z0 r0 = r14.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00ef
            X.2sr r0 = r11.A00
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "archiveutil/enableArchiveV2IfNeededForMessage/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A02()
        L_0x00e2:
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r12)
            java.lang.String r0 = "notify_new_message_for_archived_chats"
            boolean r0 = X.C18280x3.A1W(r2, r0)
            if (r0 == 0) goto L_0x00f0
        L_0x00ef:
            r1 = 1
        L_0x00f0:
            return r1
        L_0x00f1:
            java.lang.String r0 = "message type: "
            r2.append(r0)
            byte r0 = r14.A1I
            goto L_0x00b2
        L_0x00f9:
            r0 = r14
            X.1p1 r0 = (X.C31891p1) r0
            java.util.List r2 = r0.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r10)
            boolean r5 = r2.contains(r0)
            goto L_0x0091
        L_0x0107:
            X.2z0 r0 = r14.A1J
            boolean r0 = r0.A02
            r5 = r0 ^ 1
            goto L_0x0091
        L_0x010e:
            boolean r5 = X.C56972sr.A0A(r10, r14)
            goto L_0x0091
        L_0x0114:
            boolean r0 = X.C627636p.A0a(r14)
            if (r0 != 0) goto L_0x012a
            boolean r0 = r14 instanceof X.C31241ny
            if (r0 != 0) goto L_0x012a
            byte r2 = r14.A1I
            r0 = 8
            if (r2 == r0) goto L_0x012a
            r0 = 36
            if (r2 == r0) goto L_0x012a
            goto L_0x0091
        L_0x012a:
            r5 = 0
            goto L_0x0091
        L_0x012d:
            boolean r0 = X.C627636p.A0q(r14)
            if (r0 != 0) goto L_0x004f
            boolean r0 = X.C627636p.A0b(r14)
            if (r0 != 0) goto L_0x004f
            if (r5 == 0) goto L_0x0164
            boolean r0 = X.C627636p.A0o(r14)
            if (r0 == 0) goto L_0x0164
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r2 = r0.A00
            r0 = 29
            if (r2 == r0) goto L_0x004f
            r0 = 30
            if (r2 == r0) goto L_0x004f
            r0 = 31
            if (r2 == r0) goto L_0x004f
            r0 = 32
            if (r2 == r0) goto L_0x004f
            r0 = 53
            if (r2 == r0) goto L_0x004f
            r0 = 54
            if (r2 == r0) goto L_0x004f
            r0 = 56
            if (r2 != r0) goto L_0x0164
            goto L_0x004f
        L_0x0164:
            boolean r0 = X.C627636p.A0h(r14)
            if (r0 != 0) goto L_0x004f
            boolean r4 = r14 instanceof X.C30341mI
            if (r4 == 0) goto L_0x019f
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r6 = r0.A00
            long r2 = (long) r6
            r7 = 62
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x004f
            r7 = 63
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x004f
            boolean r0 = X.C627636p.A0K(r6)
            if (r0 != 0) goto L_0x01b6
            r0 = 13
            if (r6 == r0) goto L_0x01b6
            r0 = 14
            if (r6 == r0) goto L_0x01b6
            r0 = 4
            if (r6 == r0) goto L_0x0197
            r0 = 7
            if (r6 == r0) goto L_0x0197
            r0 = 5
            if (r6 != r0) goto L_0x019f
        L_0x0197:
            boolean r0 = X.C56972sr.A0A(r10, r14)
        L_0x019b:
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x004f
        L_0x019f:
            if (r5 == 0) goto L_0x01c4
            boolean r0 = X.C627636p.A0o(r14)
            if (r0 == 0) goto L_0x01c4
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r2 = r0.A00
            r0 = 73
            if (r2 == r0) goto L_0x004f
            r0 = 74
            if (r2 != r0) goto L_0x01c4
            goto L_0x004f
        L_0x01b6:
            r0 = r14
            X.1p1 r0 = (X.C31891p1) r0
            java.util.List r2 = r0.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r10)
            boolean r0 = r2.contains(r0)
            goto L_0x019b
        L_0x01c4:
            boolean r3 = X.C627636p.A0o(r14)
            if (r3 == 0) goto L_0x0211
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r2 = r0.A00
            r0 = 78
            if (r2 == r0) goto L_0x004f
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 87
            if (r2 == r0) goto L_0x004f
            r0 = 116(0x74, float:1.63E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 98
            if (r2 == r0) goto L_0x004f
            r0 = 105(0x69, float:1.47E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 95
            if (r2 == r0) goto L_0x004f
            r0 = 102(0x66, float:1.43E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 75
            if (r2 == r0) goto L_0x004f
            r0 = 103(0x67, float:1.44E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 104(0x68, float:1.46E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 112(0x70, float:1.57E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 113(0x71, float:1.58E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 114(0x72, float:1.6E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 115(0x73, float:1.61E-43)
            if (r2 != r0) goto L_0x0211
            goto L_0x004f
        L_0x0211:
            if (r4 == 0) goto L_0x021e
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r2 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r2 != r0) goto L_0x021e
            goto L_0x004f
        L_0x021e:
            if (r3 == 0) goto L_0x0237
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r2 = r0.A00
            r0 = 137(0x89, float:1.92E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 138(0x8a, float:1.93E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 150(0x96, float:2.1E-43)
            if (r2 == r0) goto L_0x004f
            r0 = 151(0x97, float:2.12E-43)
            if (r2 != r0) goto L_0x0237
            goto L_0x004f
        L_0x0237:
            boolean r0 = X.C627636p.A0Z(r14)
            r3 = 1
            if (r0 == 0) goto L_0x0050
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A00(X.2qk, X.2sr, X.34f, X.33p, X.31A, X.34x):boolean");
    }

    public long A05(C95814uZ r6, long j) {
        Cursor A0E2;
        String[] strArr = new String[5];
        C56922sm.A01(this.A0W, r6, strArr);
        String valueOf = String.valueOf(j);
        strArr[1] = valueOf;
        strArr[2] = valueOf;
        strArr[3] = valueOf;
        strArr[4] = String.valueOf(C56612sH.A06(this));
        AnonymousClass4GK A032 = this.A18.get();
        try {
            A0E2 = ((AnonymousClass3H0) A032).A03.A0E(" SELECT sort_id FROM available_message_view WHERE chat_row_id = ?  AND  (  ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 0  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp <= ?  WHEN receipt_device_timestamp > 0  THEN receipt_device_timestamp <= ?  WHEN timestamp > 0  THEN timestamp <= ?  ELSE 0  END  ) ) OR  ( timestamp <= ?  AND from_me = 0 )  )  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT 1", "SELECT_LATEST_SORT_ID_IN_TIMERANGE_IN_CHAT_SQL", strArr);
            if (!A0E2.moveToFirst()) {
                A0E2.close();
                A032.close();
                return -1;
            }
            long A0C2 = AnonymousClass0x2.A0C(A0E2, "sort_id");
            A0E2.close();
            A032.close();
            return A0C2;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Cursor A07(C95814uZ r6, long j, long j2, long j3) {
        String[] strArr = new String[5];
        C56922sm.A01(this.A0W, r6, strArr);
        AnonymousClass0x2.A1S(strArr, 1, j);
        AnonymousClass0x2.A1S(strArr, 2, j2);
        AnonymousClass0x2.A1S(strArr, 3, j3);
        strArr[4] = String.valueOf(C56612sH.A06(this));
        AnonymousClass4GK A032 = this.A18.get();
        try {
            return C56862sg.A00(A032, ((AnonymousClass3H0) A032).A03, "   SELECT _id, sort_id, key_id, from_me, timestamp, receipt_server_timestamp, starred, media_size, status FROM available_message_view WHERE chat_row_id = ? AND sort_id > ? AND sort_id <= ? AND timestamp <= ?  AND message_type = 7 AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC ", "SELECT_SYSTEM_MESSAGE_IN_RANGE_IN_CHAT_SQL", strArr);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public synchronized void A0H() {
        List A0U2;
        AnonymousClass36F A0A2 = this.A28.A0A();
        synchronized (A0A2) {
            A0A2.A09.A06("failReceiverPendingTransactions/failPendingTransactions");
            A0U2 = A0A2.A0U(false);
        }
        A0n(A0U2);
    }

    public synchronized void A0I() {
        List A0U2;
        AnonymousClass36F A0A2 = this.A28.A0A();
        synchronized (A0A2) {
            A0A2.A09.A06("PaymentTransactionStore/failReceiverPendingTransactions");
            A0U2 = A0A2.A0U(true);
        }
        A0n(A0U2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0O(X.C95814uZ r14, com.whatsapp.jid.UserJid r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            X.9U4 r0 = r13.A28     // Catch:{ all -> 0x00f0 }
            X.36F r4 = r0.A0A()     // Catch:{ all -> 0x00f0 }
            boolean r0 = X.C627336j.A0K(r14)     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x0013
            com.whatsapp.jid.GroupJid r7 = X.AnonymousClass32V.A00(r14)     // Catch:{ all -> 0x00f0 }
        L_0x0011:
            monitor-enter(r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x0015
        L_0x0013:
            r7 = 0
            goto L_0x0011
        L_0x0015:
            java.util.List r1 = r4.A0L()     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00ed }
            X.3dV r0 = r4.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
            X.4Fq r5 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
            X.3Yo r12 = r5.Axl()     // Catch:{ all -> 0x00ad }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x002b:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0099
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x00a3 }
            X.34w r8 = (X.C624034w) r8     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x0053
            X.4uZ r0 = r8.A0C     // Catch:{ all -> 0x00a3 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x002b
            if (r15 == 0) goto L_0x002b
            com.whatsapp.jid.UserJid r0 = r8.A0E     // Catch:{ all -> 0x00a3 }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0053
            com.whatsapp.jid.UserJid r0 = r8.A0D     // Catch:{ all -> 0x00a3 }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x002b
        L_0x0053:
            X.7oG r2 = r4.A09     // Catch:{ all -> 0x00a3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "mark pending request as failed: "
            r1.append(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00a3 }
            r2.A06(r0)     // Catch:{ all -> 0x00a3 }
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = r8.A0L     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x00a3 }
            android.util.Pair r9 = X.AnonymousClass36F.A03(r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "status"
            r0 = 13
            X.C18270x1.A0b(r10, r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "timestamp"
            X.2sH r0 = r4.A02     // Catch:{ all -> 0x00a3 }
            long r1 = X.C56612sH.A00(r0)     // Catch:{ all -> 0x00a3 }
            int r0 = (int) r1     // Catch:{ all -> 0x00a3 }
            X.C18270x1.A0b(r10, r6, r0)     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass36F.A06(r10, r9, r5)     // Catch:{ all -> 0x00a3 }
            X.4uZ r2 = r8.A0C     // Catch:{ all -> 0x00a3 }
            boolean r1 = r8.A0Q     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x00a3 }
            X.2z0 r0 = X.AnonymousClass2z0.A05(r2, r0, r1)     // Catch:{ all -> 0x00a3 }
            r3.add(r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x002b
        L_0x0099:
            r12.A00()     // Catch:{ all -> 0x00a3 }
            r12.close()     // Catch:{ all -> 0x00ad }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
            goto L_0x00be
        L_0x00a3:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
        L_0x00b6:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
        L_0x00b7:
            X.7oG r1 = r4.A09     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "failPendingRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x00ed }
        L_0x00be:
            monitor-exit(r4)     // Catch:{ all -> 0x00f0 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x00f0 }
        L_0x00c3:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x00f0 }
            X.2z0 r0 = (X.AnonymousClass2z0) r0     // Catch:{ all -> 0x00f0 }
            X.34x r3 = X.C55832qz.A00(r13, r0)     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x00c3
            X.34w r2 = r3.A0P     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x00c3
            r0 = 13
            r2.A02 = r0     // Catch:{ all -> 0x00f0 }
            long r0 = X.C56612sH.A06(r13)     // Catch:{ all -> 0x00f0 }
            r2.A06 = r0     // Catch:{ all -> 0x00f0 }
            X.2hU r1 = r13.A0q     // Catch:{ all -> 0x00f0 }
            r0 = 16
            r1.A00(r3, r0)     // Catch:{ all -> 0x00f0 }
            goto L_0x00c3
        L_0x00eb:
            monitor-exit(r13)
            return
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0O(X.4uZ, com.whatsapp.jid.UserJid):void");
    }

    public void A0R(C95814uZ r12, boolean z) {
        C18260x0.A1R(AnonymousClass001.A0o(), "CoreMessageStore/deletemsgs/service/jid ", r12);
        Handler handler = this.A0q.A01;
        Message.obtain(handler, 1, r12.getRawString()).sendToTarget();
        C43912Ty A032 = this.A0e.A03(r12, (Long) null, (List) null, true, z, false);
        if (A032 != null) {
            Message.obtain(handler, 2, r12.getRawString()).sendToTarget();
            this.A0Z.A00(A032, "action_delete");
        }
    }

    public void A0d(C624134x r2, int i, boolean z) {
        A0e(r2, i, z, false);
    }

    public static boolean A01(C56982ss r4, C624134x r5) {
        if (r5 instanceof C31161nq) {
            return false;
        }
        AnonymousClass2z0 r1 = r5.A1J;
        if (!r1.A02) {
            return false;
        }
        C95814uZ r3 = r1.A00;
        if (!(r3 instanceof PhoneUserJid) || r5.A0q == null) {
            return false;
        }
        int i = r5.A00;
        if ((i == 2 || i == 1) && C56982ss.A00(r4, r3) == null) {
            return true;
        }
        return false;
    }

    public static boolean A02(C56982ss r2, C624134x r3) {
        AnonymousClass2z0 r1 = r3.A1J;
        if (r1.A02 || (r3 instanceof C30311mF) || (r3 instanceof C30521ma)) {
            return false;
        }
        C95814uZ r12 = r1.A00;
        if (!(r12 instanceof PhoneUserJid) || C56982ss.A00(r2, r12) != null || r3.A05 <= 0) {
            return false;
        }
        int i = r3.A00;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public long A04(long j) {
        Cursor A0E2;
        long j2 = -1;
        if (j < 0) {
            return -1;
        }
        AnonymousClass4GK A032 = this.A18.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y2 = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y2, j);
            A0E2 = r3.A0E("SELECT timestamp FROM message_view WHERE chat_row_id = ? ORDER BY sort_id LIMIT 1", "GET_OLDEST_MESSAGE_TIMESTAMP_FOR_CHAT_ID", A1Y2);
            if (A0E2.moveToNext()) {
                j2 = AnonymousClass0x2.A0C(A0E2, "timestamp");
            }
            A0E2.close();
            A032.close();
            return j2;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Cursor A06(long j, long j2, long j3) {
        String[] strArr = new String[4];
        C18270x1.A1S(strArr, j);
        AnonymousClass0x2.A1S(strArr, 1, j2);
        AnonymousClass0x2.A1S(strArr, 2, j3);
        C18280x3.A1Q(strArr, 5000, 3);
        AnonymousClass4GK A032 = this.A18.get();
        try {
            return C56862sg.A00(A032, ((AnonymousClass3H0) A032).A03, C58162uo.A0L, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL", strArr);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass2KS A08(C624134x r3) {
        int i = -1;
        if (r3.A1W) {
            i = 22;
        }
        return A09(r3, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C627336j.A0K(r13) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42242Ni A0B(X.C95814uZ r18, int r19, long r20, long r22, boolean r24) {
        /*
            r17 = this;
            r1 = r20
            r12 = 0
            long r15 = android.os.SystemClock.uptimeMillis()
            r13 = r18
            boolean r0 = r13 instanceof X.AnonymousClass1fS
            r11 = 1
            if (r0 != 0) goto L_0x0015
            boolean r0 = X.C627336j.A0K(r13)
            r9 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r9 = 0
        L_0x0016:
            r3 = 0
            r10 = 2
            r7 = 3
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            r8 = r17
            r5 = r22
            if (r0 <= 0) goto L_0x00a6
            r3 = 1
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C58162uo.A0K
            r3.append(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r9 == 0) goto L_0x003c
            r0 = 8
            X.AnonymousClass001.A1O(r4, r0)
        L_0x003c:
            r0 = 87
            X.AnonymousClass001.A1O(r4, r0)
            r0 = 88
            X.AnonymousClass001.A1O(r4, r0)
            X.AnonymousClass34U.A01(r3, r4)
            X.AnonymousClass001.A1L(r3)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r3.append(r0)
            java.lang.String r0 = " AND (view_mode IS NULL OR view_mode = 0) "
            r3.append(r0)
            java.lang.String r0 = " AND sort_id >= ?"
            r3.append(r0)
            if (r24 == 0) goto L_0x008c
            java.lang.String r0 = " ORDER BY sort_id DESC"
        L_0x005f:
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/messages "
            java.lang.String r0 = X.AnonymousClass000.A0P(r13, r0, r3)
            X.33M r14 = X.AnonymousClass33M.A01(r0)
            X.2rr r0 = r8.A1U
            long r3 = r0.A04(r1)
            java.lang.String[] r7 = new java.lang.String[r7]
            X.2sm r0 = r8.A0W
            X.C56922sm.A02(r0, r13, r7, r12)
            X.AnonymousClass0x2.A1S(r7, r11, r5)
            X.AnonymousClass0x2.A1S(r7, r10, r3)
            X.3dV r0 = r8.A18
            X.4GK r6 = r0.get()
            goto L_0x008f
        L_0x008c:
            java.lang.String r0 = " ORDER BY sort_id ASC"
            goto L_0x005f
        L_0x008f:
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x009c }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "GET_MESSAGES_FOR_JID_WITH_START_REF"
            android.database.Cursor r9 = X.C56862sg.A00(r6, r5, r9, r0, r7)     // Catch:{ all -> 0x009c }
            goto L_0x012f
        L_0x009c:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00a1 }
            throw r1
        L_0x00a1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00a6:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C58162uo.A0K
            r3.append(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r9 == 0) goto L_0x00ba
            r0 = 8
            X.AnonymousClass001.A1O(r4, r0)
        L_0x00ba:
            r0 = 87
            X.AnonymousClass001.A1O(r4, r0)
            r0 = 88
            X.AnonymousClass001.A1O(r4, r0)
            X.AnonymousClass34U.A01(r3, r4)
            X.AnonymousClass001.A1L(r3)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r3.append(r0)
            java.lang.String r0 = " AND (view_mode IS NULL OR view_mode = 0) "
            r3.append(r0)
            if (r24 == 0) goto L_0x0100
            java.lang.String r0 = " ORDER BY sort_id DESC"
        L_0x00d8:
            r3.append(r0)
            java.lang.String r0 = " LIMIT ?"
            java.lang.String r4 = X.AnonymousClass000.A0X(r0, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/messages/indexed "
            java.lang.String r0 = X.AnonymousClass000.A0P(r13, r0, r3)
            X.33M r14 = X.AnonymousClass33M.A01(r0)
            java.lang.String[] r7 = new java.lang.String[r7]
            X.2sm r0 = r8.A0W
            X.C56922sm.A02(r0, r13, r7, r12)
            X.AnonymousClass0x2.A1S(r7, r11, r5)
            r0 = r19
            X.C18280x3.A1Q(r7, r0, r10)
            goto L_0x0103
        L_0x0100:
            java.lang.String r0 = " ORDER BY sort_id ASC"
            goto L_0x00d8
        L_0x0103:
            X.3dV r0 = r8.A18     // Catch:{ all -> 0x014f }
            X.4GK r5 = r0.get()     // Catch:{ all -> 0x014f }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0145 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "GET_MESSAGES_FOR_JID_NO_START_REF"
            android.database.Cursor r9 = r3.A0E(r4, r0, r7)     // Catch:{ all -> 0x0145 }
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x0129
            long r1 = X.C18270x1.A01(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "sort_id"
            long r3 = X.AnonymousClass0x2.A0C(r9, r0)     // Catch:{ all -> 0x0145 }
        L_0x0125:
            r9.moveToFirst()     // Catch:{ all -> 0x0145 }
            goto L_0x012c
        L_0x0129:
            r3 = -9223372036854775808
            goto L_0x0125
        L_0x012c:
            r5.close()     // Catch:{ all -> 0x014f }
        L_0x012f:
            r14.A07()
            X.2ga r7 = r8.A0d
            long r5 = X.C18310x6.A0A(r15)
            java.lang.String r0 = "CoreMessageStore/getMessagesForJid"
            r7.A02(r0, r5)
            X.2Ni r8 = new X.2Ni
            r12 = r3
            r10 = r1
            r8.<init>(r9, r10, r12)
            return r8
        L_0x0145:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x014a }
            goto L_0x014e
        L_0x014a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x014f }
        L_0x014e:
            throw r1     // Catch:{ all -> 0x014f }
        L_0x014f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0B(X.4uZ, int, long, long, boolean):X.2Ni");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04f5, code lost:
        if (r9 == 14) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        if (r7.A0B < X.C56612sH.A06(r2)) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05bd, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05c3, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        com.whatsapp.util.Log.e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0629, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x062a, code lost:
        if (r53 != 0) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        com.whatsapp.util.Log.w("CoreMessageStore/addmsg/will retry ", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:?, code lost:
        r26.close();
        r7 = X.AnonymousClass001.A0o();
        X.AnonymousClass000.A17(r5, "CoreMessageStore/addmsg/done ", " ", r7);
        X.AnonymousClass2z0.A09(r4, " took:", r7);
        X.C18260x0.A1H(r7, X.AnonymousClass0x7.A0E(r16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x064c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        com.whatsapp.util.Log.e(X.C18260x0.A05("CoreMessageStore/end transaction ", r8), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x066c, code lost:
        r5 = r2.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0672, code lost:
        if (r5.A0N() != false) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0674, code lost:
        r4 = r2.A1L;
        r0 = "fts_ready";
        r4.A03(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        r29 = A0D(r3, 0);
        r5.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0684, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r2.A17.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        com.whatsapp.util.Log.e(r7);
        r2.A16.A08(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06ab, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06c8, code lost:
        r3.A0H = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (X.C627636p.A0u(r3, X.C56612sH.A06(r2)) != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0808, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:?, code lost:
        r26.close();
        r7 = X.AnonymousClass001.A0o();
        X.AnonymousClass000.A17(r5, "CoreMessageStore/addmsg/done ", " ", r7);
        X.AnonymousClass2z0.A09(r4, " took:", r7);
        X.C18260x0.A1H(r7, X.AnonymousClass0x7.A0E(r16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0824, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:?, code lost:
        com.whatsapp.util.Log.e(X.C18260x0.A05("CoreMessageStore/end transaction ", r8), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0846, code lost:
        r5 = r2.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x084c, code lost:
        if (r5.A0N() != false) goto L_0x084e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x084e, code lost:
        r4 = r2.A1L;
        r0 = "fts_ready";
        r4.A03(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:?, code lost:
        r29 = A0D(r3, 0);
        r5.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0866, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0867, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r2.A17.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x086f, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        if (r2.A1r.A0Y(X.C58422vE.A02, 3280) != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0191, code lost:
        if (r9 != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0050, code lost:
        return new X.C59632xE(false, false, false, false, true);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0309 A[Catch:{ all -> 0x02f2, IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x036b A[Catch:{ all -> 0x02f2, IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0394 A[Catch:{ all -> 0x02f2, IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x039f A[Catch:{ all -> 0x02f2, IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05c3 A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:105:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0629 A[ExcHandler: SQLiteDiskIOException (e android.database.sqlite.SQLiteDiskIOException), Splitter:B:105:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06c8 A[Catch:{ all -> 0x0808 }] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0798  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:298:0x05cb=Splitter:B:298:0x05cb, B:373:0x072b=Splitter:B:373:0x072b, B:347:0x06ae=Splitter:B:347:0x06ae} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C59632xE A0D(X.C624134x r52, int r53) {
        /*
            r51 = this;
            java.lang.String r19 = "SQL logic error or missing database"
            java.lang.String r20 = " took:"
            java.lang.String r18 = "CoreMessageStore/end transaction "
            java.lang.String r22 = "CoreMessageStore/addmsg/done "
            java.lang.String r21 = " "
            java.lang.String r23 = "fts_ready"
            r30 = 0
            r44 = 0
            r6 = 0
            r46 = 0
            r3 = r52
            X.2z0 r4 = r3.A1J
            X.4uZ r5 = r4.A00
            boolean r9 = r5 instanceof X.C135166kE
            r2 = r51
            if (r9 == 0) goto L_0x006e
            X.33e r0 = r2.A1b
            boolean r0 = r0.A0G(r3)
            java.lang.String r1 = " timestamp:"
            if (r0 == 0) goto L_0x0081
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/statusexpired/"
            X.AnonymousClass000.A17(r4, r0, r1, r5)
            long r0 = r3.A0K
            X.C18260x0.A1I(r5, r0)
            X.1VX r2 = r2.A1r
            r1 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00dd
        L_0x0043:
            r34 = 1
            X.2xE r29 = new X.2xE
            r31 = r6
            r32 = r6
            r33 = r6
            r29.<init>(r30, r31, r32, r33, r34)
            return r29
        L_0x0051:
            long r10 = r7.A0B
            long r0 = r3.A0K
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 + r12
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x006e
            long r0 = X.C56612sH.A06(r2)
            r10 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 + r10
            r7.A0B = r0
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r8.A0e(r0)
        L_0x006e:
            boolean r7 = r4.A02
            if (r7 == 0) goto L_0x00e0
            X.2qk r10 = r2.A06
            X.2sr r8 = r2.A09
            X.2ss r1 = r2.A0X
            X.2sj r0 = r2.A0p
            boolean r0 = X.C627636p.A0L(r10, r8, r1, r0, r3)
            if (r0 != 0) goto L_0x00e0
            goto L_0x00dd
        L_0x0081:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x006e
            X.4uZ r0 = r3.A0n()
            boolean r0 = r0 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x006e
            X.3Ex r8 = r2.A0F
            com.whatsapp.jid.UserJid r0 = r3.A0o()
            X.3ZH r7 = r8.A07(r0)
            if (r7 == 0) goto L_0x00a8
            X.2k5 r0 = r7.A0F
            if (r0 != 0) goto L_0x0051
            long r5 = r7.A0B
            long r8 = X.C56612sH.A06(r2)
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r5 = 1
            if (r0 >= 0) goto L_0x00a9
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/status-from-unknown/ id:"
            r2.append(r0)
            X.AnonymousClass2z0.A0A(r4, r2)
            java.lang.String r0 = " from:"
            r2.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0o()
            r2.append(r0)
            r2.append(r1)
            long r0 = r3.A0K
            r2.append(r0)
            java.lang.String r0 = " cached:"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " contact-is-null:"
            r2.append(r0)
            boolean r0 = X.AnonymousClass000.A1X(r7)
            X.C18260x0.A1V(r2, r0)
        L_0x00dd:
            X.2xE r29 = X.C59632xE.A05
            return r29
        L_0x00e0:
            int r0 = r3.A05
            if (r0 <= 0) goto L_0x011b
            X.34x r0 = X.C55832qz.A00(r2, r4)
            if (r0 == 0) goto L_0x010f
            r43 = 1
            long r4 = X.C56612sH.A06(r2)
            int r1 = r3.A05
            if (r1 <= 0) goto L_0x0101
            long r2 = r0.A0K
            long r0 = X.C18290x4.A0A(r1)
            long r2 = r2 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0101
            r44 = 1
        L_0x0101:
            X.2xE r29 = new X.2xE
            r41 = r6
            r42 = r6
            r39 = r29
            r40 = r6
            r39.<init>(r40, r41, r42, r43, r44)
            return r29
        L_0x010f:
            long r0 = X.C56612sH.A06(r2)
            boolean r0 = X.C627636p.A0u(r3, r0)
            if (r0 == 0) goto L_0x011b
            goto L_0x0043
        L_0x011b:
            if (r7 != 0) goto L_0x0148
            X.34x r0 = r3.A0w()
            if (r0 == 0) goto L_0x0148
            X.2qz r1 = r2.A2D
            X.2z0 r0 = r0.A1J
            X.34x r1 = r1.A05(r0)
            if (r1 == 0) goto L_0x0148
            boolean r0 = X.C627636p.A0l(r1)
            if (r0 != 0) goto L_0x0148
            byte r8 = r1.A1I
            r0 = 12
            if (r8 == r0) goto L_0x0148
            r0 = 90
            if (r8 == r0) goto L_0x0148
            boolean r0 = X.C626635z.A09(r3)
            if (r0 != 0) goto L_0x0148
            X.2Wx r0 = r2.A2A
            r0.A00(r3, r1)
        L_0x0148:
            X.34x r0 = r3.A0w()
            if (r0 == 0) goto L_0x015b
            X.9U4 r0 = r2.A28
            X.36F r1 = r0.A0A()
            X.34x r0 = r3.A0w()
            r1.A0Z(r0)
        L_0x015b:
            X.34x r8 = r3.A0w()
            boolean r0 = r8 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0188
            r0 = r8
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x0188
            java.io.File r0 = r0.A0F
            if (r0 != 0) goto L_0x0188
            X.2qz r1 = r2.A2D
            X.2z0 r0 = r8.A1J
            X.34x r1 = r1.A05(r0)
            boolean r0 = r1 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0204
            X.1mV r1 = (X.C30471mV) r1
            X.33C r1 = r1.A01
            if (r1 == 0) goto L_0x0188
            X.34x r0 = r3.A0w()
            X.1mV r0 = (X.C30471mV) r0
            r0.A01 = r1
        L_0x0188:
            boolean r12 = X.C627336j.A0K(r5)
            boolean r11 = r5 instanceof X.AnonymousClass1fS
            if (r11 == 0) goto L_0x0193
            r8 = 1
            if (r9 == 0) goto L_0x0194
        L_0x0193:
            r8 = 0
        L_0x0194:
            if (r12 == 0) goto L_0x01b2
            boolean r0 = r3 instanceof X.C30341mI
            if (r0 != 0) goto L_0x01b2
            X.4uZ r0 = r3.A0n()
            if (r0 != 0) goto L_0x01b2
            if (r7 != 0) goto L_0x01b2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/addmsg/error/group/remote_resource is null! "
            r1.append(r0)
            java.lang.String r0 = X.C627636p.A0E(r3)
            X.C18260x0.A1K(r1, r0)
        L_0x01b2:
            X.8qC r0 = r2.A2J
            X.2sS r0 = X.C18320x8.A0I(r0)
            boolean r10 = r0.A04(r3)
            if (r12 != 0) goto L_0x01d2
            if (r8 != 0) goto L_0x01d2
            if (r10 == 0) goto L_0x01c9
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x01c9
            r0 = 2
            r3.A0B = r0
        L_0x01c9:
            X.3dV r0 = r2.A18
            r45 = r0
            X.4Fq r24 = r45.A04()
            goto L_0x020b
        L_0x01d2:
            X.2sj r1 = r2.A0p
            r0 = r5
            X.1fL r0 = (X.C28011fL) r0
            X.33k r8 = X.C56892sj.A01(r1, r0)
            X.3Mg r0 = r2.A20
            boolean r0 = X.C66653Mg.A00(r0)
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = r8.A0B()
            r3.A14 = r0
        L_0x01e9:
            if (r7 == 0) goto L_0x01ef
            boolean r0 = r3.A1W
            if (r0 != 0) goto L_0x01c9
        L_0x01ef:
            java.util.Map r0 = r8.A09
            int r1 = r0.size()
            int r1 = r1 + r10
            if (r12 == 0) goto L_0x01fd
            r0 = 1
        L_0x01f9:
            int r1 = r1 - r0
            r3.A0B = r1
            goto L_0x01c9
        L_0x01fd:
            X.2sr r0 = r2.A09
            boolean r0 = r8.A0O(r0)
            goto L_0x01f9
        L_0x0204:
            java.lang.String r0 = "CoreMessageStore/addmsg/background/error fetching quoted sticker message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0188
        L_0x020b:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0870 }
            X.3Yo r26 = r24.Axl()     // Catch:{ all -> 0x0870 }
            r8 = r53
            long r14 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            r12 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0233
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            java.lang.String r0 = "CoreMessageStore/addmsg/background/transaction-delayed "
            r10.append(r0)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            long r0 = X.C18290x4.A0B(r14)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            r10.append(r0)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            X.AnonymousClass0x2.A19(r10)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
        L_0x0233:
            if (r11 == 0) goto L_0x02b7
            if (r7 == 0) goto L_0x02b7
            int r1 = r3.A0D     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            if (r1 == 0) goto L_0x023e
            r0 = 2
            if (r1 != r0) goto L_0x02b7
        L_0x023e:
            if (r9 != 0) goto L_0x02b7
            r0 = 1
            r3.A1B = r0     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            java.util.List r13 = r3.A19()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            java.util.HashMap r11 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            X.C626936e.A06(r13)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            java.util.Iterator r12 = r13.iterator()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
        L_0x0252:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x0299
            com.whatsapp.jid.UserJid r10 = X.C18310x6.A0T(r12)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            long r0 = r3.A0K     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            r31 = r2
            r32 = r10
            r33 = r3
            r34 = r11
            r35 = r0
            X.34x r1 = r31.A0F(r32, r33, r34, r35)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            X.2rt r0 = r2.A1P     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            boolean r0 = r0.A07(r10)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            r2.A0t(r1)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            r2.A0U(r10, r1, r0)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            X.5rC r0 = r2.A04     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            boolean r10 = r0.A07()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            if (r10 == 0) goto L_0x0290
            boolean r10 = X.C624134x.A0e(r1)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            if (r10 == 0) goto L_0x0290
            r0.A04()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            java.lang.String r0 = "hasPlaceholder"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            throw r0     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
        L_0x0290:
            X.2qz r0 = r2.A2D     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            r0.A06(r1)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            r2.A0W(r1)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            goto L_0x0252
        L_0x0299:
            int r1 = r13.size()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            int r0 = r11.size()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            if (r1 != r0) goto L_0x02aa
            r3.A1A = r11     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
        L_0x02a5:
            int r15 = r13.size()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            goto L_0x02f7
        L_0x02aa:
            int r0 = r11.size()     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x02a5
            java.lang.String r0 = "msgstore/validateBroadcastParticipantSizes failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0729, SQLiteConstraintException -> 0x06ac, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05c9, Error | RuntimeException -> 0x05c3 }
            goto L_0x02a5
        L_0x02b7:
            r15 = 0
            if (r9 == 0) goto L_0x02f7
            r10 = 1
            if (r7 == 0) goto L_0x02f7
            boolean r0 = r3.A1W     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x02cd
            X.1VX r11 = r2.A1r     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r1 = 4905(0x1329, float:6.873E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            boolean r0 = r11.A0Y(r0, r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 != 0) goto L_0x02fc
        L_0x02cd:
            X.2o7 r1 = r2.A1Z     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.3dV r0 = r1.A08     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.4Fq r11 = r0.A04()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.3Yo r0 = r11.Axl()     // Catch:{ all -> 0x02ed }
            r1.A02(r3, r10)     // Catch:{ all -> 0x02e3 }
            r0.A00()     // Catch:{ all -> 0x02e3 }
            r0.close()     // Catch:{ all -> 0x02ed }
            goto L_0x02f9
        L_0x02e3:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x02e8 }
            goto L_0x02ec
        L_0x02e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02ed }
        L_0x02ec:
            throw r1     // Catch:{ all -> 0x02ed }
        L_0x02ed:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x02f2 }
            goto L_0x02f6
        L_0x02f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x02f6:
            throw r1     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x02f7:
            r10 = 0
            goto L_0x02fc
        L_0x02f9:
            r11.close()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x02fc:
            X.2qz r0 = r2.A2D     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0.A06(r3)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            long r0 = r3.A1L     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r32 = -1
            int r11 = (r0 > r32 ? 1 : (r0 == r32 ? 0 : -1))
            if (r11 == 0) goto L_0x036b
            X.3Lp r0 = r2.A12     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.Set r1 = r0.A04(r3)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r1 == 0) goto L_0x031f
            boolean r11 = r1.isEmpty()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r11 != 0) goto L_0x031f
            r0.A07(r3, r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.2qB r0 = r2.A1N     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0.A03(r3, r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x031f:
            if (r10 == 0) goto L_0x038a
            boolean r0 = r3.A1W     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x038a
            X.1VX r10 = r2.A1r     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r1 = 4905(0x1329, float:6.873E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            boolean r0 = r10.A0Y(r0, r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x038a
            X.2qB r0 = r2.A1N     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r14 = r0
            X.2o7 r0 = r2.A1Z     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            int r10 = r3.A0E     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r11 = 3
            if (r10 == r11) goto L_0x0387
            X.33e r11 = r0.A0A     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.List r13 = r11.A07()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.List r12 = r11.A08()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.Set r11 = r0.A01(r11, r13, r12, r10)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.318 r0 = r0.A0B     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.Map r0 = r0.A0A(r11)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.Iterator r11 = X.AnonymousClass001.A0v(r0)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x035b:
            boolean r0 = r11.hasNext()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x0375
            java.lang.Object r0 = r11.next()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r1.addAll(r0)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            goto L_0x035b
        L_0x036b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.lang.String r0 = "CoreMessageStore/addmsg cannot add blank receipts for: "
            X.C18260x0.A1S(r1, r0, r4)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            goto L_0x038a
        L_0x0375:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.lang.String r11 = "status-participant-user-manager/generateTargetDevicesFromPeerStatusSetting device size="
            r0.append(r11)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0.append(r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.lang.String r11 = "; mode="
            X.C18260x0.A0w(r11, r0, r10)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x0387:
            r14.A03(r3, r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x038a:
            long r0 = r3.A1L     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            int r10 = (r0 > r32 ? 1 : (r0 == r32 ? 0 : -1))
            if (r10 != 0) goto L_0x039f
            boolean r0 = r3 instanceof X.AnonymousClass48R     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 != 0) goto L_0x039f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.lang.String r0 = "CoreMessageStore/addmsg failed to insert: "
            X.C18260x0.A1Q(r1, r0, r4)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            goto L_0x055a
        L_0x039f:
            if (r9 == 0) goto L_0x04a7
            boolean r0 = X.C626635z.A09(r3)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 != 0) goto L_0x0513
            X.33e r12 = r2.A1b     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.lang.Object r0 = r12.A07     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r25 = r0
            monitor-enter(r25)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r12.A0A()     // Catch:{ all -> 0x04a4 }
            if (r7 == 0) goto L_0x03b4
            goto L_0x03c0
        L_0x03b4:
            com.whatsapp.jid.UserJid r0 = r3.A0o()     // Catch:{ all -> 0x04a4 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x04a4 }
            X.34r r0 = r12.A05(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x03c4
        L_0x03c0:
            X.34r r0 = r12.A04()     // Catch:{ all -> 0x04a4 }
        L_0x03c4:
            android.content.ContentValues r9 = X.C18300x5.A06()     // Catch:{ all -> 0x04a4 }
            if (r0 != 0) goto L_0x045a
            if (r7 == 0) goto L_0x03e9
            X.2sH r1 = r12.A01     // Catch:{ all -> 0x04a4 }
            X.1fY r29 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x04a4 }
            r42 = 0
            X.34r r0 = new X.34r     // Catch:{ all -> 0x04a4 }
            r36 = r32
            r38 = r32
            r40 = r32
            r27 = r0
            r28 = r1
            r31 = r6
            r34 = r32
            r27.<init>(r28, r29, r30, r31, r32, r34, r36, r38, r40, r42)     // Catch:{ all -> 0x04a4 }
            r0.A07(r3)     // Catch:{ all -> 0x04a4 }
            goto L_0x043c
        L_0x03e9:
            X.2sH r0 = r12.A01     // Catch:{ all -> 0x04a4 }
            r28 = r0
            com.whatsapp.jid.UserJid r29 = r3.A0o()     // Catch:{ all -> 0x04a4 }
            X.C626936e.A06(r29)     // Catch:{ all -> 0x04a4 }
            long r0 = r3.A1M     // Catch:{ all -> 0x04a4 }
            r34 = r0
            long r13 = r3.A1M     // Catch:{ all -> 0x04a4 }
            r0 = 1
            long r13 = r13 - r0
            long r10 = r3.A1M     // Catch:{ all -> 0x04a4 }
            long r10 = r10 - r0
            long r0 = r3.A1M     // Catch:{ all -> 0x04a4 }
            r40 = r0
            long r0 = r3.A1M     // Catch:{ all -> 0x04a4 }
            r42 = r0
            long r0 = r3.A0K     // Catch:{ all -> 0x04a4 }
            r47 = r0
            X.34r r0 = new X.34r     // Catch:{ all -> 0x04a4 }
            r27 = r0
            r31 = r6
            r32 = r34
            r34 = r13
            r36 = r10
            r38 = r40
            r40 = r42
            r42 = r47
            r27.<init>(r28, r29, r30, r31, r32, r34, r36, r38, r40, r42)     // Catch:{ all -> 0x04a4 }
            r0.A08 = r3     // Catch:{ all -> 0x04a4 }
            int r1 = r0.A00     // Catch:{ all -> 0x04a4 }
            int r1 = r1 + 1
            r0.A00 = r1     // Catch:{ all -> 0x04a4 }
            int r1 = r0.A01     // Catch:{ all -> 0x04a4 }
            int r1 = r1 + 1
            r0.A01 = r1     // Catch:{ all -> 0x04a4 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04a4 }
            java.lang.String r1 = "msgstore/status-create/ "
            X.C623534r.A01(r0, r3, r1, r10)     // Catch:{ all -> 0x04a4 }
            X.AnonymousClass0x2.A18(r10)     // Catch:{ all -> 0x04a4 }
        L_0x043c:
            java.lang.String r1 = "last_read_message_table_id"
            long r10 = r3.A1M     // Catch:{ all -> 0x04a4 }
            r13 = 1
            long r10 = r10 - r13
            X.C18270x1.A0c(r9, r1, r10)     // Catch:{ all -> 0x04a4 }
            java.lang.String r1 = "last_read_receipt_sent_message_table_id"
            long r10 = r3.A1M     // Catch:{ all -> 0x04a4 }
            long r10 = r10 - r13
            X.C18270x1.A0c(r9, r1, r10)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.ConcurrentHashMap r10 = r12.A09     // Catch:{ all -> 0x04a4 }
            X.C626936e.A06(r10)     // Catch:{ all -> 0x04a4 }
            com.whatsapp.jid.UserJid r1 = r0.A0A     // Catch:{ all -> 0x04a4 }
            r10.put(r1, r0)     // Catch:{ all -> 0x04a4 }
            r13 = 1
            goto L_0x045f
        L_0x045a:
            X.34r r0 = r0.A07(r3)     // Catch:{ all -> 0x04a4 }
            r13 = 0
        L_0x045f:
            java.lang.String r1 = "message_table_id"
            long r10 = r3.A1M     // Catch:{ all -> 0x04a4 }
            X.C18270x1.A0c(r9, r1, r10)     // Catch:{ all -> 0x04a4 }
            java.lang.String r1 = "timestamp"
            long r10 = r0.A05()     // Catch:{ all -> 0x04a4 }
            X.C18270x1.A0c(r9, r1, r10)     // Catch:{ all -> 0x04a4 }
            java.lang.String r10 = "unseen_count"
            int r1 = r0.A03()     // Catch:{ all -> 0x04a4 }
            X.C18270x1.A0b(r9, r10, r1)     // Catch:{ all -> 0x04a4 }
            java.lang.String r10 = "total_count"
            int r1 = r0.A02()     // Catch:{ all -> 0x04a4 }
            X.C18270x1.A0b(r9, r10, r1)     // Catch:{ all -> 0x04a4 }
            java.lang.String r1 = "first_unread_message_table_id"
            monitor-enter(r0)     // Catch:{ all -> 0x04a4 }
            long r10 = r0.A03     // Catch:{ all -> 0x04a1 }
            monitor-exit(r0)     // Catch:{ all -> 0x04a4 }
            X.C18270x1.A0c(r9, r1, r10)     // Catch:{ all -> 0x04a4 }
            java.lang.String r1 = "autodownload_limit_message_table_id"
            monitor-enter(r0)     // Catch:{ all -> 0x04a4 }
            long r10 = r0.A02     // Catch:{ all -> 0x04a1 }
            monitor-exit(r0)     // Catch:{ all -> 0x04a4 }
            X.C18270x1.A0c(r9, r1, r10)     // Catch:{ all -> 0x04a4 }
            com.whatsapp.jid.UserJid r1 = r0.A0A     // Catch:{ all -> 0x04a4 }
            r0 = 1
            r12.A0B(r9, r1, r3, r0)     // Catch:{ all -> 0x04a4 }
            monitor-exit(r25)     // Catch:{ all -> 0x04a4 }
            r30 = r13
            goto L_0x0513
        L_0x04a1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x04a4 }
            throw r1     // Catch:{ all -> 0x04a4 }
        L_0x04a4:
            r0 = move-exception
            monitor-exit(r25)     // Catch:{ all -> 0x04a4 }
            throw r0     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x04a7:
            boolean r0 = r5 instanceof X.C95804uY     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 != 0) goto L_0x0513
            X.2ss r10 = r2.A0X     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            boolean r9 = r3 instanceof X.C30341mI     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.31A r35 = r10.A0A(r5, r9)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.2qk r12 = r2.A06     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.2sr r11 = r2.A09     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.34f r1 = r2.A0I     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.33p r0 = r2.A0L     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r31 = r12
            r32 = r11
            r33 = r1
            r34 = r0
            r36 = r3
            boolean r44 = A00(r31, r32, r33, r34, r35, r36)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r2.A0W(r3)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r35 != 0) goto L_0x04d6
            X.31A r0 = r10.A0A(r5, r9)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x04d6
            r30 = 1
        L_0x04d6:
            if (r9 == 0) goto L_0x0513
            if (r7 == 0) goto L_0x0513
            boolean r0 = r5 instanceof X.C28011fL     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x0513
            r10 = r3
            X.1mI r10 = (X.C30341mI) r10     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.2sj r1 = r2.A0p     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r1.A0A(r10)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            int r9 = r10.A00     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0 = 5
            if (r9 == r0) goto L_0x04f7
            r0 = 7
            if (r9 == r0) goto L_0x04f7
            r0 = 13
            if (r9 == r0) goto L_0x04f7
            r0 = 14
            r11 = 0
            if (r9 != r0) goto L_0x04f8
        L_0x04f7:
            r11 = 1
        L_0x04f8:
            X.2z0 r0 = r10.A1J     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.4uZ r0 = r0.A00     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.1fL r10 = X.C57382tY.A00(r0)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r11 == 0) goto L_0x0513
            boolean r0 = r10 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x0513
            X.2ow r9 = r2.A1H     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            com.whatsapp.jid.GroupJid r10 = (com.whatsapp.jid.GroupJid) r10     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            boolean r1 = r1.A0C(r10)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0 = r24
            r9.A00(r0, r10, r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x0513:
            r26.A00()     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.2pF r1 = r2.A0y     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.2lK r0 = r1.A01     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0.A01(r3, r4)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A03     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0.remove(r4)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            X.1VX r9 = r2.A1r     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r1 = 4893(0x131d, float:6.857E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            boolean r0 = r9.A0Y(r0, r1)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x053a
            boolean r0 = r3 instanceof X.C30791n7     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x053a
            if (r7 != 0) goto L_0x053a
            r0 = r3
            X.1n7 r0 = (X.C30791n7) r0     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r2.A0h(r0)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x053a:
            boolean r0 = r3 instanceof X.C30341mI     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 != 0) goto L_0x0558
            long r0 = r3.A0I     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0558
            X.300 r0 = r2.A00     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            if (r0 == 0) goto L_0x0558
            X.2m9 r9 = r2.A0O     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0 = 19
            X.3Zw r1 = new X.3Zw     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r1.<init>(r2, r0, r3)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
            r0 = 25
            r9.A02(r1, r0)     // Catch:{ IOException -> 0x05c0, SQLiteConstraintException -> 0x05bd, SQLiteDiskIOException -> 0x0629, SQLiteDatabaseCorruptException -> 0x05bb, Error | RuntimeException -> 0x05c3, Error | RuntimeException -> 0x05c3 }
        L_0x0558:
            r46 = 1
        L_0x055a:
            r26.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x05b0, SQLiteException -> 0x0576 }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x05b0, SQLiteException -> 0x0576 }
            r1 = r22
            r0 = r21
            X.AnonymousClass000.A17(r5, r1, r0, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x05b0, SQLiteException -> 0x0576 }
            r0 = r20
            X.AnonymousClass2z0.A09(r4, r0, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x05b0, SQLiteException -> 0x0576 }
            long r0 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ SQLiteDatabaseCorruptException -> 0x05b0, SQLiteException -> 0x0576 }
            X.C18260x0.A1H(r9, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x05b0, SQLiteException -> 0x0576 }
            goto L_0x0793
        L_0x0576:
            r1 = move-exception
            r0 = r18
            java.lang.String r0 = X.C18260x0.A05(r0, r8)     // Catch:{ all -> 0x0870 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0870 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0870 }
            if (r0 != 0) goto L_0x0596
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            r0 = r19
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
        L_0x0596:
            if (r53 == 0) goto L_0x0865
            X.3Lu r5 = r2.A0m     // Catch:{ all -> 0x0870 }
            boolean r0 = r5.A0N()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            X.2rO r4 = r2.A1L     // Catch:{ all -> 0x0870 }
            r0 = r23
            r4.A03(r0, r6)     // Catch:{ all -> 0x0870 }
            X.2xE r29 = r2.A0D(r3, r6)     // Catch:{ Exception -> 0x0860 }
            r5.A0J()     // Catch:{ Exception -> 0x0860 }
            goto L_0x085c
        L_0x05b0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0870 }
            X.2q5 r0 = r2.A17     // Catch:{ all -> 0x0870 }
            r0.A04()     // Catch:{ all -> 0x0870 }
            goto L_0x0793
        L_0x05bb:
            r0 = move-exception
            goto L_0x05cb
        L_0x05bd:
            r10 = move-exception
            goto L_0x06ae
        L_0x05c0:
            r0 = move-exception
            goto L_0x072b
        L_0x05c3:
            r7 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r7)     // Catch:{ all -> 0x0808 }
            goto L_0x06ab
        L_0x05c9:
            r0 = move-exception
            r15 = 0
        L_0x05cb:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0808 }
            X.2q5 r10 = r2.A17     // Catch:{ all -> 0x0808 }
            r10.A04()     // Catch:{ all -> 0x0808 }
            r26.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x078a, SQLiteException -> 0x05ef }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x078a, SQLiteException -> 0x05ef }
            r1 = r22
            r0 = r21
            X.AnonymousClass000.A17(r5, r1, r0, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x078a, SQLiteException -> 0x05ef }
            r0 = r20
            X.AnonymousClass2z0.A09(r4, r0, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x078a, SQLiteException -> 0x05ef }
            long r0 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ SQLiteDatabaseCorruptException -> 0x078a, SQLiteException -> 0x05ef }
            X.C18260x0.A1H(r9, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x078a, SQLiteException -> 0x05ef }
            goto L_0x0793
        L_0x05ef:
            r1 = move-exception
            r0 = r18
            java.lang.String r0 = X.C18260x0.A05(r0, r8)     // Catch:{ all -> 0x0870 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0870 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0870 }
            if (r0 != 0) goto L_0x060f
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            r0 = r19
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
        L_0x060f:
            if (r53 == 0) goto L_0x0865
            X.3Lu r5 = r2.A0m     // Catch:{ all -> 0x0870 }
            boolean r0 = r5.A0N()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            X.2rO r4 = r2.A1L     // Catch:{ all -> 0x0870 }
            r0 = r23
            r4.A03(r0, r6)     // Catch:{ all -> 0x0870 }
            X.2xE r29 = r2.A0D(r3, r6)     // Catch:{ Exception -> 0x0860 }
            r5.A0J()     // Catch:{ Exception -> 0x0860 }
            goto L_0x085c
        L_0x0629:
            r7 = move-exception
            if (r53 == 0) goto L_0x06a2
            java.lang.String r0 = "CoreMessageStore/addmsg/will retry "
            com.whatsapp.util.Log.w(r0, r7)     // Catch:{ all -> 0x0808 }
            r26.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0684, SQLiteException -> 0x064c }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0684, SQLiteException -> 0x064c }
            r1 = r22
            r0 = r21
            X.AnonymousClass000.A17(r5, r1, r0, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0684, SQLiteException -> 0x064c }
            r0 = r20
            X.AnonymousClass2z0.A09(r4, r0, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0684, SQLiteException -> 0x064c }
            long r0 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0684, SQLiteException -> 0x064c }
            X.C18260x0.A1H(r7, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0684, SQLiteException -> 0x064c }
            goto L_0x068d
        L_0x064c:
            r1 = move-exception
            r0 = r18
            java.lang.String r0 = X.C18260x0.A05(r0, r8)     // Catch:{ all -> 0x0870 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0870 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0870 }
            if (r0 != 0) goto L_0x066c
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x068d
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            r0 = r19
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x068d
        L_0x066c:
            X.3Lu r5 = r2.A0m     // Catch:{ all -> 0x0870 }
            boolean r0 = r5.A0N()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            X.2rO r4 = r2.A1L     // Catch:{ all -> 0x0870 }
            r0 = r23
            r4.A03(r0, r6)     // Catch:{ all -> 0x0870 }
            X.2xE r29 = r2.A0D(r3, r6)     // Catch:{ Exception -> 0x0860 }
            r5.A0J()     // Catch:{ Exception -> 0x0860 }
            goto L_0x085c
        L_0x0684:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0870 }
            X.2q5 r0 = r2.A17     // Catch:{ all -> 0x0870 }
            r0.A04()     // Catch:{ all -> 0x0870 }
        L_0x068d:
            r45.A05()     // Catch:{ all -> 0x0870 }
            r0 = r45
            X.0xz r0 = r0.A04     // Catch:{ all -> 0x0870 }
            r0.close()     // Catch:{ all -> 0x0870 }
            X.2fp r0 = r2.A1X     // Catch:{ all -> 0x0870 }
            r0.A01()     // Catch:{ all -> 0x0870 }
            X.2xE r29 = r2.A0D(r3, r6)     // Catch:{ all -> 0x0870 }
            goto L_0x085c
        L_0x06a2:
            com.whatsapp.util.Log.e((java.lang.Throwable) r7)     // Catch:{ all -> 0x0808 }
            X.1hj r1 = r2.A16     // Catch:{ all -> 0x0808 }
            r0 = 1
            r1.A08(r0)     // Catch:{ all -> 0x0808 }
        L_0x06ab:
            throw r7     // Catch:{ all -> 0x0808 }
        L_0x06ac:
            r10 = move-exception
            r15 = 0
        L_0x06ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0808 }
            java.lang.String r0 = "CoreMessageStore/addmsg duplicate "
            r1.append(r0)     // Catch:{ all -> 0x0808 }
            java.lang.String r9 = r4.A01     // Catch:{ all -> 0x0808 }
            r0 = r21
            java.lang.String r0 = X.AnonymousClass000.A0V(r9, r0, r1)     // Catch:{ all -> 0x0808 }
            com.whatsapp.util.Log.i(r0, r10)     // Catch:{ all -> 0x0808 }
            X.34x r0 = r3.A0w()     // Catch:{ all -> 0x0808 }
            if (r0 == 0) goto L_0x06cc
            r0 = 0
            r3.A0H = r0     // Catch:{ all -> 0x0808 }
        L_0x06cc:
            r26.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x071f, SQLiteException -> 0x06e5 }
            r0 = r22
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0k(r5, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x071f, SQLiteException -> 0x06e5 }
            r1 = r20
            r0 = r21
            X.AnonymousClass001.A1K(r0, r9, r1, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x071f, SQLiteException -> 0x06e5 }
            long r0 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ SQLiteDatabaseCorruptException -> 0x071f, SQLiteException -> 0x06e5 }
            X.C18260x0.A1H(r4, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x071f, SQLiteException -> 0x06e5 }
            goto L_0x0792
        L_0x06e5:
            r1 = move-exception
            r0 = r18
            java.lang.String r0 = X.C18260x0.A05(r0, r8)     // Catch:{ all -> 0x0870 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0870 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0870 }
            if (r0 != 0) goto L_0x0705
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            r0 = r19
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
        L_0x0705:
            if (r53 == 0) goto L_0x0865
            X.3Lu r5 = r2.A0m     // Catch:{ all -> 0x0870 }
            boolean r0 = r5.A0N()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            X.2rO r4 = r2.A1L     // Catch:{ all -> 0x0870 }
            r0 = r23
            r4.A03(r0, r6)     // Catch:{ all -> 0x0870 }
            X.2xE r29 = r2.A0D(r3, r6)     // Catch:{ Exception -> 0x0860 }
            r5.A0J()     // Catch:{ Exception -> 0x0860 }
            goto L_0x085c
        L_0x071f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0870 }
            X.2q5 r0 = r2.A17     // Catch:{ all -> 0x0870 }
            r0.A04()     // Catch:{ all -> 0x0870 }
            goto L_0x0792
        L_0x0729:
            r0 = move-exception
            r15 = 0
        L_0x072b:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0808 }
            r26.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0783, SQLiteException -> 0x0749 }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0783, SQLiteException -> 0x0749 }
            r1 = r22
            r0 = r21
            X.AnonymousClass000.A17(r5, r1, r0, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0783, SQLiteException -> 0x0749 }
            r0 = r20
            X.AnonymousClass2z0.A09(r4, r0, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0783, SQLiteException -> 0x0749 }
            long r0 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0783, SQLiteException -> 0x0749 }
            X.C18260x0.A1H(r9, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0783, SQLiteException -> 0x0749 }
            goto L_0x0793
        L_0x0749:
            r1 = move-exception
            r0 = r18
            java.lang.String r0 = X.C18260x0.A05(r0, r8)     // Catch:{ all -> 0x0870 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0870 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0870 }
            if (r0 != 0) goto L_0x0769
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            r0 = r19
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
        L_0x0769:
            if (r53 == 0) goto L_0x0865
            X.3Lu r5 = r2.A0m     // Catch:{ all -> 0x0870 }
            boolean r0 = r5.A0N()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            X.2rO r4 = r2.A1L     // Catch:{ all -> 0x0870 }
            r0 = r23
            r4.A03(r0, r6)     // Catch:{ all -> 0x0870 }
            X.2xE r29 = r2.A0D(r3, r6)     // Catch:{ Exception -> 0x0860 }
            r5.A0J()     // Catch:{ Exception -> 0x0860 }
            goto L_0x085c
        L_0x0783:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0870 }
            X.2q5 r10 = r2.A17     // Catch:{ all -> 0x0870 }
            goto L_0x078e
        L_0x078a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0870 }
        L_0x078e:
            r10.A04()     // Catch:{ all -> 0x0870 }
            goto L_0x0793
        L_0x0792:
            r6 = 1
        L_0x0793:
            r24.close()
            if (r46 == 0) goto L_0x07f8
            boolean r0 = r3 instanceof X.C30471mV
            if (r0 == 0) goto L_0x07ba
            r0 = r3
            X.1mV r0 = (X.C30471mV) r0
            X.33C r8 = X.C30471mV.A00(r0)
            if (r7 == 0) goto L_0x07ba
            java.io.File r5 = r8.A0F
            if (r5 == 0) goto L_0x07ba
            X.2rq r4 = r2.A0B
            boolean r0 = X.AnonymousClass31H.A01(r3)
            r1 = 1
            r4.A04(r5, r1, r0)
            if (r15 <= 0) goto L_0x07ba
            java.io.File r0 = r8.A0F
            r4.A04(r0, r15, r1)
        L_0x07ba:
            X.34x r1 = r3.A0w()
            boolean r0 = r1 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x07db
            X.1mV r1 = (X.C30471mV) r1
            X.33C r5 = r1.A01
            if (r5 == 0) goto L_0x07db
            java.io.File r0 = r5.A0F
            if (r0 == 0) goto L_0x07db
            X.2rq r4 = r2.A0B
            r1 = 1
            r4.A04(r0, r1, r1)
            if (r7 == 0) goto L_0x07db
            if (r15 <= 0) goto L_0x07db
            java.io.File r0 = r5.A0F
            r4.A04(r0, r15, r1)
        L_0x07db:
            java.lang.Integer r0 = r3.A0p
            if (r0 == 0) goto L_0x07f8
            X.2qD r4 = r2.A21
            X.1VX r2 = r4.A00
            X.2vE r1 = X.C58422vE.A01
            r0 = 4429(0x114d, float:6.206E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 != 0) goto L_0x07f8
            monitor-enter(r4)
            java.util.List r0 = r4.A01     // Catch:{ all -> 0x07f5 }
            r0.add(r3)     // Catch:{ all -> 0x07f5 }
            monitor-exit(r4)     // Catch:{ all -> 0x07f5 }
            goto L_0x07f8
        L_0x07f5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x07f5 }
            throw r0
        L_0x07f8:
            r50 = 0
            X.2xE r29 = new X.2xE
            r45 = r29
            r47 = r30
            r48 = r44
            r49 = r6
            r45.<init>(r46, r47, r48, r49, r50)
            return r29
        L_0x0808:
            r9 = move-exception
            r26.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0866, SQLiteException -> 0x0824 }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0866, SQLiteException -> 0x0824 }
            r1 = r22
            r0 = r21
            X.AnonymousClass000.A17(r5, r1, r0, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0866, SQLiteException -> 0x0824 }
            r0 = r20
            X.AnonymousClass2z0.A09(r4, r0, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0866, SQLiteException -> 0x0824 }
            long r0 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0866, SQLiteException -> 0x0824 }
            X.C18260x0.A1H(r7, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0866, SQLiteException -> 0x0824 }
            goto L_0x086f
        L_0x0824:
            r1 = move-exception
            r0 = r18
            java.lang.String r0 = X.C18260x0.A05(r0, r8)     // Catch:{ all -> 0x0870 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0870 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0870 }
            if (r0 != 0) goto L_0x0844
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0870 }
            r0 = r19
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
        L_0x0844:
            if (r53 == 0) goto L_0x0865
            X.3Lu r5 = r2.A0m     // Catch:{ all -> 0x0870 }
            boolean r0 = r5.A0N()     // Catch:{ all -> 0x0870 }
            if (r0 == 0) goto L_0x0865
            X.2rO r4 = r2.A1L     // Catch:{ all -> 0x0870 }
            r0 = r23
            r4.A03(r0, r6)     // Catch:{ all -> 0x0870 }
            X.2xE r29 = r2.A0D(r3, r6)     // Catch:{ Exception -> 0x0860 }
            r5.A0J()     // Catch:{ Exception -> 0x0860 }
        L_0x085c:
            r24.close()
            return r29
        L_0x0860:
            r1 = move-exception
            r2 = 1
            r4.A03(r0, r2)     // Catch:{ all -> 0x0870 }
        L_0x0865:
            throw r1     // Catch:{ all -> 0x0870 }
        L_0x0866:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0870 }
            X.2q5 r0 = r2.A17     // Catch:{ all -> 0x0870 }
            r0.A04()     // Catch:{ all -> 0x0870 }
        L_0x086f:
            throw r9     // Catch:{ all -> 0x0870 }
        L_0x0870:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0875 }
            throw r1
        L_0x0875:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0D(X.34x, int):X.2xE");
    }

    public C624134x A0E(C624034w r4) {
        if (r4 == null || r4.A0C == null || TextUtils.isEmpty(r4.A0L)) {
            return null;
        }
        return C55832qz.A00(this, AnonymousClass2z0.A05(r4.A0C, r4.A0L, r4.A0Q));
    }

    public C624134x A0F(UserJid userJid, C624134x r6, Map map, long j) {
        AnonymousClass2z0 r3 = r6.A1J;
        AnonymousClass2z0 A042 = AnonymousClass2z0.A04(userJid, r3.A01);
        C626936e.A0C(r6 instanceof AnonymousClass4B9);
        C626936e.A0C(r6.A1B);
        C624134x Az3 = ((AnonymousClass4B9) r6).Az3(A042);
        Az3.A14 = null;
        Az3.A1J(r3.A00);
        map.put(C618932r.A00(userJid), this.A0g.A04(Az3, j));
        return Az3;
    }

    public final void A0G() {
        File A0G2 = this.A07.A0G();
        A03(A0G2);
        Uri contentUri = MediaStore.Files.getContentUri("external");
        AnonymousClass5UR A0R2 = this.A0J.A0R();
        if (A0R2 == null) {
            Log.w("CoreMessageStore/delete-all-media cr=null");
            return;
        }
        try {
            String[] A1Y2 = AnonymousClass0x9.A1Y();
            A1Y2[0] = A0G2.getAbsolutePath();
            A0R2.A01(contentUri, "_data LIKE ?||'%'", A1Y2);
        } catch (IllegalArgumentException | SecurityException | UnsupportedOperationException e) {
            Log.e("CoreMessageStore/delete-all-media", e);
        }
    }

    public final void A0J(long j) {
        int i;
        C55892r5 r3 = this.A24;
        if (r3.A01(0, j) != null) {
            i = 5;
        } else {
            i = -1;
            if (r3.A01(2, j) != null) {
                i = 4;
            }
        }
        C56202rb A022 = r3.A02(j);
        if (i != -1 && A022 != null) {
            A022.A03(i);
        }
    }

    public final void A0K(C43912Ty r6) {
        List<Number> list = r6.A09;
        if (list != null) {
            for (Number longValue : list) {
                C624134x A002 = C55122pp.A00(this.A2D, longValue.longValue());
                if (A002 != null) {
                    this.A0y.A03(A002.A1J);
                }
            }
        }
        if (r6.A04 != Long.MIN_VALUE) {
            this.A0y.A01(r6.A07);
        }
    }

    public void A0M(C95814uZ r3) {
        if (!this.A1P.A07(r3)) {
            Log.d("CoreMessageStore/no need to add 1p bot system msg for empty chat");
            return;
        }
        C624134x A012 = this.A2I.A01(r3, false);
        A0c(A012, -1);
        A0A(A012, -1);
    }

    public void A0N(C95814uZ r12) {
        C56982ss r8 = this.A0X;
        AnonymousClass31A A0A2 = r8.A0A(r12, false);
        if (A0A2 != null) {
            long A022 = this.A1P.A02(r12);
            long A062 = this.A1U.A06(r12);
            AnonymousClass31A A0A3 = r8.A0A(r12, false);
            C626936e.A06(A0A3);
            synchronized (A0A3) {
                A0A2.A09();
                if (A022 != 1) {
                    C624134x A002 = C55122pp.A00(this.A2D, A022);
                    A0A2.A0d = A002;
                    if (A002 != null) {
                        if (C627636p.A0c(A002) || C627636p.A0Z(A002)) {
                            A0A2.A0d = null;
                        } else {
                            A0A2.A0U = A022;
                            A0A2.A0V = A062;
                            A0A2.A0X = A002.A0K;
                        }
                        A0A2.A0P = A022;
                        A0A2.A0Q = A062;
                        A0A2.A0R = A022;
                        A0A2.A0S = A062;
                        A0A2.A0N = A022;
                        A0A2.A0O = A062;
                        A0A2.A0c = null;
                    }
                }
            }
            C18260x0.A0y("CoreMessageStore/updateChatListTable/updated:", AnonymousClass001.A0o(), this.A0W.A05(A0A2));
        }
    }

    public void A0S(C95814uZ r8, boolean z) {
        C69833Yo Axl;
        AnonymousClass1VX r2 = this.A1r;
        C162457s7.A0J(r2, 0);
        if (r2.A0Y(C58422vE.A02, 4873)) {
            C85284Fq A042 = this.A18.A04();
            try {
                Axl = A042.Axl();
                C53322mu r0 = this.A2I;
                C162457s7.A0J(r8, 0);
                long A002 = r0.A02.A00(r8);
                if (A002 > 0) {
                    this.A0v.A08(Collections.singleton(Long.valueOf(A002)), z);
                }
                Axl.A00();
                Axl.close();
                A042.close();
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A0U(UserJid userJid, C624134x r7, boolean z) {
        if (!z) {
            C31161nq A042 = this.A1m.A04(userJid);
            C56982ss r3 = this.A0X;
            C56422rx r2 = this.A0G;
            if (!(r7 instanceof C31161nq)) {
                AnonymousClass2z0 r1 = r7.A1J;
                if (r1.A02) {
                    C95814uZ r12 = r1.A00;
                    if ((r12 instanceof PhoneUserJid) && !r2.A03((UserJid) r12) && r7.A0q != null && C56982ss.A00(r3, r12) == null && A042 != null) {
                        this.A2D.A06(A042);
                        A0W(A042);
                    }
                }
            }
        }
    }

    public void A0V(C624134x r3) {
        int i = -1;
        if (r3.A1W) {
            i = 22;
        }
        A0a(r3, i);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:455:? A[RETURN, SYNTHETIC] */
    public void A0W(X.C624134x r33) {
        /*
            r32 = this;
            r5 = r33
            X.2z0 r7 = r5.A1J
            X.4uZ r2 = r7.A00
            if (r2 == 0) goto L_0x001c
            r4 = r32
            X.2ss r13 = r4.A0X
            boolean r0 = r5 instanceof X.C30341mI
            r19 = r0
            X.31A r3 = r13.A0A(r2, r0)
            if (r3 != 0) goto L_0x001d
            boolean r0 = X.C627636p.A0j(r5)
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            byte r8 = r5.A1I
            r0 = 8
            if (r8 == r0) goto L_0x001c
            r10 = 90
            if (r3 != 0) goto L_0x002a
            if (r8 != r10) goto L_0x002a
            return
        L_0x002a:
            boolean r0 = r5 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x001c
            r0 = 87
            if (r8 == r0) goto L_0x001c
            r0 = 88
            if (r8 == r0) goto L_0x001c
            r11 = 0
            if (r3 == 0) goto L_0x00c9
            X.3Z2 r0 = r3.A0b
            long r0 = r0.ephemeralSettingTimestamp
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c9
            X.2kh r0 = r3.A0a
            if (r0 != 0) goto L_0x00c9
            X.1VX r6 = r4.A1r
            r1 = 5309(0x14bd, float:7.44E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r6.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00c9
            X.2Y2 r0 = r4.A0f
            r15 = 0
            X.3dV r1 = r0.A01     // Catch:{ all -> 0x00ad }
            X.4GK r14 = r1.get()     // Catch:{ all -> 0x00ad }
            r1 = r14
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x00a6 }
            X.2sg r12 = r1.A03     // Catch:{ all -> 0x00a6 }
            java.lang.String r11 = "SELECT ephemeral_trigger, ephemeral_initiated_by_me FROM chat_ephemeral WHERE chat_row_id = ?"
            r9 = 1
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ all -> 0x00a6 }
            X.2sm r1 = r0.A00     // Catch:{ all -> 0x00a6 }
            X.4uZ r0 = r3.A0q     // Catch:{ all -> 0x00a6 }
            X.C56922sm.A02(r1, r0, r6, r15)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "GET_EPHEMERAL_CHATS_SQL"
            android.database.Cursor r6 = r12.A0E(r11, r0, r6)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "ephemeral_trigger"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "ephemeral_initiated_by_me"
            int r11 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009f }
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0096
            int r1 = r6.getInt(r1)     // Catch:{ all -> 0x009f }
            int r0 = r6.getInt(r11)     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x008f
            r9 = 0
        L_0x008f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x009f }
            r3.A0H(r0, r1)     // Catch:{ all -> 0x009f }
        L_0x0096:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x009f }
            r6.close()     // Catch:{ all -> 0x00a6 }
            r14.close()     // Catch:{ all -> 0x00ad }
            goto L_0x00b2
        L_0x009f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r14, r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x00b2:
            java.lang.Throwable r6 = X.AnonymousClass3Z9.A00(r0)
            if (r6 == 0) goto L_0x00c9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EphemeralChatStore/ Failed to load ephemeral chats from db for chat: "
            r1.append(r0)
            X.4uZ r0 = r3.A0q
            r1.append(r0)
            X.C18280x3.A1C(r1, r6)
        L_0x00c9:
            r9 = 0
            r6 = 1
            boolean r0 = X.AnonymousClass000.A1W(r3)
            boolean r25 = X.C627636p.A0w(r5, r0)
            r0 = 10
            if (r8 != r0) goto L_0x033a
            r11 = 0
            r24 = 1
        L_0x00da:
            r23 = 0
            r22 = 1
        L_0x00de:
            r21 = 0
        L_0x00e0:
            r14 = 5
            r1 = 11
            if (r19 == 0) goto L_0x0334
            r0 = r5
            X.1mI r0 = (X.C30341mI) r0
            int r10 = r0.A00
            r0 = 9
            if (r10 == r0) goto L_0x0328
            if (r10 == r1) goto L_0x0328
            r0 = 143(0x8f, float:2.0E-43)
            if (r10 == r0) goto L_0x0318
            r0 = 148(0x94, float:2.07E-43)
            if (r10 == r0) goto L_0x0318
            if (r10 != r6) goto L_0x0310
            java.lang.String r1 = r5.A13()
            r12 = 0
        L_0x00ff:
            r18 = 0
        L_0x0101:
            X.2sr r0 = r4.A09
            boolean r0 = X.C627636p.A0S(r0, r5)
            r20 = 1
            if (r0 != 0) goto L_0x010d
        L_0x010b:
            r20 = 0
        L_0x010d:
            X.2qk r15 = r4.A06
            X.2sr r10 = r4.A09
            X.34f r14 = r4.A0I
            X.33p r0 = r4.A0L
            r29 = r0
            r26 = r15
            r27 = r10
            r28 = r14
            r30 = r3
            r31 = r5
            boolean r0 = A00(r26, r27, r28, r29, r30, r31)
            if (r0 == 0) goto L_0x030b
            r3.A0i = r9
        L_0x0129:
            boolean r0 = X.C627636p.A0O(r10, r5)
            if (r0 == 0) goto L_0x0131
            r3.A0p = r6
        L_0x0131:
            r14 = 1
        L_0x0132:
            X.1VX r0 = r4.A1r
            r26 = r0
            boolean r0 = X.C627636p.A0a(r5)
            if (r0 != 0) goto L_0x015f
            boolean r0 = r5 instanceof X.C30311mF
            if (r0 != 0) goto L_0x015f
            boolean r0 = r5 instanceof X.C30521ma
            if (r0 != 0) goto L_0x015f
            boolean r0 = r5 instanceof X.C31091nj
            if (r0 != 0) goto L_0x015f
            boolean r0 = r5 instanceof X.C31511oP
            if (r0 != 0) goto L_0x015f
            boolean r0 = r5 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0154
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x015f
        L_0x0154:
            if (r19 == 0) goto L_0x0268
            r0 = r5
            X.1mI r0 = (X.C30341mI) r0
            int r15 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r15 != r0) goto L_0x0268
        L_0x015f:
            r17 = 0
        L_0x0161:
            boolean r16 = X.C627636p.A0Q(r10, r5)
            r14 = -1
            if (r16 == 0) goto L_0x0169
            r14 = 1
        L_0x0169:
            if (r3 != 0) goto L_0x0237
            X.2sD r3 = r4.A2E
            java.util.List r0 = r3.A01()
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x01aa
            java.util.List r14 = r3.A01()
            if (r14 == 0) goto L_0x0228
            boolean r0 = r14.contains(r2)
            if (r0 == 0) goto L_0x0228
            java.util.ArrayList r14 = X.AnonymousClass002.A0J(r14)
            r14.remove(r2)
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r14)
            X.2rO r14 = r3.A05
            java.lang.String r3 = "call_not_spam_jids"
            r14.A05(r3, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r14 = "spamManager/removeCallNotSpamProp/true: "
            r3.append(r14)
            r3.append(r0)
        L_0x01a6:
            X.C18280x3.A14(r3)
            r14 = 1
        L_0x01aa:
            if (r25 == 0) goto L_0x067b
            boolean r0 = r2 instanceof X.C95804uY
            if (r0 != 0) goto L_0x067b
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/chat/add "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = " plaintextdisabled:"
            X.C18260x0.A0w(r0, r3, r6)
            X.31A r3 = new X.31A
            r3.<init>((X.C95814uZ) r2)
            r13.A0H(r3, r2)
            r3.A04 = r14
            r3.A00 = r6
        L_0x01cd:
            X.21b r0 = r3.A0Z
            if (r0 != 0) goto L_0x01e7
            X.21b r13 = r5.A0N
            if (r13 != 0) goto L_0x01e1
            boolean r0 = X.C627336j.A0L(r2)
            if (r0 == 0) goto L_0x01e7
            X.2Y0 r0 = r4.A0V
            X.21b r13 = r0.A00(r2)
        L_0x01e1:
            X.21b r0 = r3.A0Z
            if (r0 != 0) goto L_0x01e7
            r3.A0Z = r13
        L_0x01e7:
            if (r1 == 0) goto L_0x01eb
            r3.A0h = r1
        L_0x01eb:
            if (r17 == 0) goto L_0x01f1
            long r0 = r5.A0K
            r3.A0X = r0
        L_0x01f1:
            if (r25 == 0) goto L_0x01fd
            r3.A0d = r5
            long r0 = r5.A1L
            r3.A0U = r0
            long r0 = r5.A1M
            r3.A0V = r0
        L_0x01fd:
            if (r11 == 0) goto L_0x0207
            long r0 = r5.A1L
            r3.A0P = r0
            long r0 = r5.A1M
            r3.A0Q = r0
        L_0x0207:
            long r0 = r3.A0R
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x021b
            long r0 = r5.A1L
            r13 = 1
            long r0 = r0 - r13
            r3.A0R = r0
            long r0 = r5.A1M
            long r0 = r0 - r13
            r3.A0S = r0
        L_0x021b:
            X.2sH r0 = r4.A0K
            r25 = r0
            long r0 = r25.A0H()
            monitor-enter(r3)
            if (r21 == 0) goto L_0x03bb
            goto L_0x03ae
        L_0x0228:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "spamManager/removeCallNotSpamProp/false/not spam jids: "
            r3.append(r0)
            r3.append(r14)
            goto L_0x01a6
        L_0x0237:
            int r15 = r3.A04
            r0 = -1
            if (r15 == r0) goto L_0x0241
            r0 = -2
            if (r15 == r0) goto L_0x0241
            if (r15 != 0) goto L_0x01cd
        L_0x0241:
            if (r16 == 0) goto L_0x01cd
            if (r18 != 0) goto L_0x01cd
            X.4uZ r14 = r3.A0q
            boolean r0 = r14 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0257
            X.2qa r13 = r4.A1w
            com.whatsapp.jid.GroupJid r14 = (com.whatsapp.jid.GroupJid) r14
            X.2OD r0 = new X.2OD
            r0.<init>(r9, r15)
            r13.A02(r0, r14)
        L_0x0257:
            r3.A04 = r6
            X.2hU r0 = r4.A0q
            android.os.Handler r13 = r0.A02
            r0 = 12
            android.os.Message r0 = android.os.Message.obtain(r13, r0, r5)
            r0.sendToTarget()
            goto L_0x01cd
        L_0x0268:
            boolean r0 = X.C627636p.A0w(r5, r14)
            if (r0 == 0) goto L_0x015f
            boolean r0 = r5 instanceof X.C30401mO
            if (r0 == 0) goto L_0x0281
            r0 = r5
            X.1mO r0 = (X.C30401mO) r0
            boolean r0 = r0.A1v()
            if (r0 == 0) goto L_0x0281
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0281
            goto L_0x015f
        L_0x0281:
            if (r19 == 0) goto L_0x02c3
            r0 = r5
            X.1mI r0 = (X.C30341mI) r0
            int r14 = r0.A00
            r0 = 4
            if (r14 == r0) goto L_0x02f5
            r0 = 5
            if (r14 == r0) goto L_0x015f
            r0 = 6
            if (r14 == r0) goto L_0x015f
            r0 = 7
            if (r14 == r0) goto L_0x02f5
            r0 = 20
            if (r14 == r0) goto L_0x02fa
            r0 = 21
            if (r14 == r0) goto L_0x015f
            r0 = 79
            if (r14 == r0) goto L_0x02fa
            r0 = 80
            if (r14 == r0) goto L_0x015f
            r0 = 93
            if (r14 == r0) goto L_0x015f
            r0 = 94
            if (r14 == r0) goto L_0x015f
            r0 = 97
            if (r14 == r0) goto L_0x02dc
            r0 = 98
            if (r14 == r0) goto L_0x015f
            switch(r14) {
                case 10: goto L_0x015f;
                case 12: goto L_0x02fa;
                case 13: goto L_0x02fa;
                case 14: goto L_0x02fa;
                case 15: goto L_0x015f;
                case 16: goto L_0x015f;
                case 17: goto L_0x015f;
                case 37: goto L_0x015f;
                case 39: goto L_0x015f;
                case 44: goto L_0x015f;
                case 56: goto L_0x015f;
                case 59: goto L_0x015f;
                case 68: goto L_0x015f;
                case 90: goto L_0x02fa;
                case 105: goto L_0x015f;
                case 106: goto L_0x02fa;
                case 116: goto L_0x015f;
                case 123: goto L_0x02fa;
                case 124: goto L_0x02fa;
                case 126: goto L_0x02fa;
                case 127: goto L_0x02fa;
                case 130: goto L_0x015f;
                case 131: goto L_0x015f;
                case 137: goto L_0x015f;
                case 138: goto L_0x015f;
                case 140: goto L_0x015f;
                case 141: goto L_0x015f;
                case 144: goto L_0x02fa;
                case 149: goto L_0x02fa;
                case 150: goto L_0x015f;
                case 151: goto L_0x015f;
                case 152: goto L_0x015f;
                default: goto L_0x02b7;
            }
        L_0x02b7:
            switch(r14) {
                case 27: goto L_0x015f;
                case 28: goto L_0x015f;
                case 29: goto L_0x015f;
                case 30: goto L_0x015f;
                case 31: goto L_0x015f;
                case 32: goto L_0x015f;
                default: goto L_0x02ba;
            }
        L_0x02ba:
            switch(r14) {
                case 51: goto L_0x015f;
                case 52: goto L_0x02fa;
                case 53: goto L_0x015f;
                case 54: goto L_0x015f;
                default: goto L_0x02bd;
            }
        L_0x02bd:
            switch(r14) {
                case 73: goto L_0x015f;
                case 74: goto L_0x015f;
                case 75: goto L_0x02c7;
                case 76: goto L_0x015f;
                default: goto L_0x02c0;
            }
        L_0x02c0:
            switch(r14) {
                case 84: goto L_0x015f;
                case 85: goto L_0x015f;
                case 86: goto L_0x015f;
                case 87: goto L_0x015f;
                default: goto L_0x02c3;
            }
        L_0x02c3:
            r17 = 1
            goto L_0x0161
        L_0x02c7:
            boolean r0 = r5 instanceof X.C31571oV
            if (r0 == 0) goto L_0x02c3
            r15 = r5
            X.1oV r15 = (X.C31571oV) r15
            java.lang.Integer r0 = r15.A02
            if (r0 == 0) goto L_0x02c3
            int r14 = r0.intValue()
            r0 = 2
            if (r14 != r0) goto L_0x02c3
            int r0 = r15.A00
            goto L_0x0307
        L_0x02dc:
            boolean r0 = r5 instanceof X.C31281o2
            if (r0 == 0) goto L_0x02c3
            r0 = r5
            X.1o2 r0 = (X.C31281o2) r0
            boolean r0 = r0.A01
            r15 = 2787(0xae3, float:3.905E-42)
            if (r0 == 0) goto L_0x02eb
            r15 = 2788(0xae4, float:3.907E-42)
        L_0x02eb:
            X.2vE r14 = X.C58422vE.A02
            r0 = r26
            boolean r17 = r0.A0Y(r14, r15)
            goto L_0x0161
        L_0x02f5:
            boolean r0 = X.C56972sr.A0A(r10, r5)
            goto L_0x0307
        L_0x02fa:
            r0 = r5
            X.1p1 r0 = (X.C31891p1) r0
            java.util.List r14 = r0.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r10)
            boolean r0 = r14.contains(r0)
        L_0x0307:
            if (r0 != 0) goto L_0x02c3
            goto L_0x015f
        L_0x030b:
            if (r3 != 0) goto L_0x0129
            r14 = 0
            goto L_0x0132
        L_0x0310:
            r12 = 0
            r1 = 0
            r18 = 1
            if (r10 == r14) goto L_0x0101
            goto L_0x00ff
        L_0x0318:
            long r0 = r5.A0K
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r1 = r5
            X.1p0 r1 = (X.C31881p0) r1
            r0 = 2
            java.lang.String r1 = r1.A1y(r0)
            goto L_0x00ff
        L_0x0328:
            long r0 = r5.A0K
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r5.A13()
            goto L_0x00ff
        L_0x0334:
            r1 = 0
            r12 = 0
            r18 = 0
            goto L_0x010b
        L_0x033a:
            if (r8 != r10) goto L_0x0341
            r11 = 0
            r24 = 0
            goto L_0x00da
        L_0x0341:
            int r0 = r13.A03(r2)
            if (r0 > 0) goto L_0x0360
            X.2Vv r0 = r4.A0H
            X.2fl r0 = r0.A00()
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0360
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x035e
            r0 = 13
            r5.A1G(r0)
            r5.A1Y = r6
        L_0x035e:
            r5.A1C = r6
        L_0x0360:
            boolean r11 = r5.A1C
            if (r11 != 0) goto L_0x03a3
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x037f
            X.2Ww r0 = r4.A29
            boolean r0 = r0.A00(r5)
            if (r0 != 0) goto L_0x037f
            if (r19 == 0) goto L_0x03a3
            r0 = r5
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            java.util.Set r0 = X.AnonymousClass34J.A01
            boolean r0 = X.C18300x5.A1X(r0, r1)
            if (r0 == 0) goto L_0x03a3
        L_0x037f:
            boolean r0 = X.C627636p.A0h(r5)
            if (r0 != 0) goto L_0x03a3
            X.2sr r0 = r4.A09
            boolean r0 = X.C627636p.A0M(r0, r5)
            boolean r23 = X.AnonymousClass000.A1S(r0)
            r21 = 1
        L_0x0391:
            boolean r0 = X.C624134x.A0g(r5)
            if (r0 == 0) goto L_0x03a8
            int r0 = r3.A05
            int r0 = r0 + 1
            r3.A05 = r0
            r24 = 0
            r22 = 0
            goto L_0x00de
        L_0x03a3:
            r23 = 0
            r21 = 0
            goto L_0x0391
        L_0x03a8:
            r24 = 0
            r22 = 1
            goto L_0x00e0
        L_0x03ae:
            int r11 = r3.A08     // Catch:{ all -> 0x06ac }
            if (r11 > 0) goto L_0x03b7
            r3.A08 = r6     // Catch:{ all -> 0x06ac }
            r3.A0Y = r0     // Catch:{ all -> 0x06ac }
            goto L_0x03bb
        L_0x03b7:
            int r0 = r11 + 1
            r3.A08 = r0     // Catch:{ all -> 0x06ac }
        L_0x03bb:
            if (r23 == 0) goto L_0x03c8
            int r0 = r3.A06     // Catch:{ all -> 0x06ac }
            if (r0 > 0) goto L_0x03c4
            r3.A06 = r6     // Catch:{ all -> 0x06ac }
            goto L_0x03c8
        L_0x03c4:
            int r0 = r0 + 1
            r3.A06 = r0     // Catch:{ all -> 0x06ac }
        L_0x03c8:
            if (r24 == 0) goto L_0x03d0
            int r0 = r3.A09     // Catch:{ all -> 0x06ac }
            int r0 = r0 + 1
            r3.A09 = r0     // Catch:{ all -> 0x06ac }
        L_0x03d0:
            if (r22 == 0) goto L_0x03e0
            int r0 = r3.A08     // Catch:{ all -> 0x06ac }
            if (r0 > 0) goto L_0x03da
            int r0 = r3.A09     // Catch:{ all -> 0x06ac }
            if (r0 <= 0) goto L_0x03e0
        L_0x03da:
            int r0 = r3.A0A     // Catch:{ all -> 0x06ac }
            int r0 = r0 + 1
            r3.A0A = r0     // Catch:{ all -> 0x06ac }
        L_0x03e0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06ac }
            java.lang.String r0 = "chatInfo/addUnseen/"
            r1.append(r0)     // Catch:{ all -> 0x06ac }
            java.lang.String r0 = r3.A08()     // Catch:{ all -> 0x06ac }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x06ac }
            monitor-exit(r3)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0405
            boolean r0 = r5.A1W
            if (r0 == 0) goto L_0x0405
            int r0 = r3.A08
            if (r0 >= 0) goto L_0x0405
            monitor-enter(r3)
            r3.A08 = r9     // Catch:{ all -> 0x06ac }
            r0 = 0
            r3.A0Y = r0     // Catch:{ all -> 0x06ac }
            monitor-exit(r3)
        L_0x0405:
            long r0 = r5.A1L
            r3.A0N = r0
            long r0 = r5.A1M
            r3.A0O = r0
            r0 = 0
            r3.A0c = r0
            if (r21 == 0) goto L_0x041c
            boolean r0 = X.C627636p.A0M(r10, r5)
            if (r0 == 0) goto L_0x041c
            long r0 = r5.A1L
            r3.A0L = r0
        L_0x041c:
            r0 = 36
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r8 != r0) goto L_0x0633
            r10 = r5
            X.1mF r10 = (X.C30311mF) r10
            int r11 = r10.A00
            X.2z0 r0 = r10.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x062f
            X.3Z2 r0 = r3.A0b
            long r0 = r0.ephemeralSettingTimestamp
            long r0 = r0 + r16
        L_0x0433:
            r3.A0B(r11, r0, r9)
            int r1 = r10.A04
            java.lang.Boolean r0 = r10.A0o
            boolean r18 = r3.A0H(r0, r1)
        L_0x043e:
            boolean r0 = r5 instanceof X.C31171nr
            if (r0 == 0) goto L_0x0462
            r0 = r5
            X.1nr r0 = (X.C31171nr) r0
            int r11 = r0.A00
            java.lang.Long r0 = r5.A0q
            long r0 = X.C18320x8.A04(r0)
            int r10 = r5.A00
            r3.A0B(r11, r0, r10)
            if (r18 != 0) goto L_0x0460
            int r1 = r5.A04
            java.lang.Boolean r0 = r5.A0o
            boolean r0 = r3.A0H(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x0462
        L_0x0460:
            r18 = 1
        L_0x0462:
            boolean r0 = r5 instanceof X.C31161nq
            if (r0 == 0) goto L_0x0486
            r0 = r5
            X.1nq r0 = (X.C31161nq) r0
            int r11 = r0.A00
            java.lang.Long r0 = r5.A0q
            long r0 = X.C18320x8.A04(r0)
            int r10 = r5.A00
            r3.A0B(r11, r0, r10)
            if (r18 != 0) goto L_0x0484
            int r1 = r5.A04
            java.lang.Boolean r0 = r5.A0o
            boolean r0 = r3.A0H(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x0486
        L_0x0484:
            r18 = 1
        L_0x0486:
            int r1 = r5.A05
            if (r1 <= 0) goto L_0x04c7
            X.3Z2 r0 = r3.A0b
            int r0 = r0.expiration
            if (r1 != r0) goto L_0x04c7
            java.lang.Long r0 = r5.A0q
            if (r0 == 0) goto L_0x04c7
            long r13 = X.C18320x8.A04(r0)
            X.3Z2 r10 = r3.A0b
            long r0 = r10.ephemeralSettingTimestamp
            int r11 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x04c7
            java.lang.Long r13 = r5.A0q
            long r14 = r13.longValue()
            long r0 = r5.A0K
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x04c7
            int r11 = r10.expiration
            long r0 = X.C18320x8.A04(r13)
            int r10 = r5.A00
            r3.A0B(r11, r0, r10)
            if (r18 != 0) goto L_0x04c5
            int r1 = r5.A04
            java.lang.Boolean r0 = r5.A0o
            boolean r0 = r3.A0H(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x04c7
        L_0x04c5:
            r18 = 1
        L_0x04c7:
            boolean r0 = r5 instanceof X.C31591oX
            if (r0 == 0) goto L_0x04e5
            r0 = r5
            X.1oX r0 = (X.C31591oX) r0
            int r10 = r0.A00
            r0 = 0
            r3.A0B(r10, r0, r9)
            if (r18 != 0) goto L_0x04e3
            int r1 = r5.A04
            java.lang.Boolean r0 = r5.A0o
            boolean r0 = r3.A0H(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x04e5
        L_0x04e3:
            r18 = 1
        L_0x04e5:
            boolean r0 = r5 instanceof X.C31571oV
            if (r0 == 0) goto L_0x0509
            java.lang.String r0 = "CoreMessageStore/set group type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r5
            X.1oV r0 = (X.C31571oV) r0
            int r1 = r0.A00
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass001.A1X(r0, r6)
            r3.A02 = r1
            if (r1 != r6) goto L_0x0509
            if (r0 == 0) goto L_0x0509
            long r0 = r25.A0H()
            long r0 = r0 / r16
            r3.A0I = r0
            r20 = 1
        L_0x0509:
            boolean r0 = r5 instanceof X.C31891p1
            if (r0 == 0) goto L_0x0552
            r0 = r5
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x0526
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x0526
            r0 = 124(0x7c, float:1.74E-43)
            if (r1 == r0) goto L_0x0526
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x0526
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x0531
        L_0x0526:
            r0 = r5
            X.1oz r0 = (X.C31871oz) r0
            int r0 = r0.A20()
            r3.A02 = r0
            r20 = 1
        L_0x0531:
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x0549
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L_0x0549
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x0549
            r0 = 143(0x8f, float:2.0E-43)
            if (r1 == r0) goto L_0x0549
            r0 = 148(0x94, float:2.07E-43)
            if (r1 == r0) goto L_0x0549
            r0 = 149(0x95, float:2.09E-43)
            if (r1 != r0) goto L_0x0552
        L_0x0549:
            r0 = r5
            X.1oz r0 = (X.C31871oz) r0
            int r0 = r0.A20()
            r3.A02 = r0
        L_0x0552:
            boolean r0 = r5 instanceof X.C31861oy
            if (r0 == 0) goto L_0x0570
            r1 = r5
            X.1oy r1 = (X.C31861oy) r1
            boolean r0 = r1 instanceof X.C31651od
            if (r0 == 0) goto L_0x0613
            r0 = 0
        L_0x055e:
            r3.A02 = r0
            if (r0 != r6) goto L_0x0570
            int r0 = r1.A00
            if (r0 == r6) goto L_0x0570
            long r0 = r25.A0H()
            long r0 = r0 / r16
            r3.A0I = r0
            r20 = 1
        L_0x0570:
            if (r19 == 0) goto L_0x0600
            r0 = r5
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            r0 = 11
            if (r1 != r0) goto L_0x0600
            boolean r0 = r2 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0600
            r10 = r2
            com.whatsapp.jid.GroupJid r10 = (com.whatsapp.jid.GroupJid) r10
            X.2jg r0 = r4.A0E
            r19 = r0
            android.content.SharedPreferences r1 = r19.A00()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r13 = "create_"
            java.lang.String r0 = X.C18260x0.A03(r10, r13, r0)
            int r15 = r1.getInt(r0, r9)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommunitySharedPrefs/getTempGroupType()/groupType = "
            X.C18260x0.A0y(r0, r1, r15)
            android.content.SharedPreferences r1 = r19.A00()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r11 = "closed_"
            java.lang.String r0 = X.C18260x0.A03(r10, r11, r0)
            boolean r14 = r1.getBoolean(r0, r9)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommunitySharedPrefs/getTempGroupType()/isClosed = "
            X.C18260x0.A1E(r0, r1, r14)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/updateChatsListForNewMessage/set group type = "
            X.C18260x0.A0y(r0, r1, r15)
            r3.A02 = r15
            if (r14 == 0) goto L_0x05d0
            r3.A0n = r6
            X.2f2 r0 = r4.A0Y
            r0.A00(r3)
        L_0x05d0:
            java.lang.String r0 = "CommunitySharedPrefs/clearTempGroupType"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = r19.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C18260x0.A03(r10, r13, r0)
            X.C18270x1.A0g(r1, r0)
            java.lang.String r0 = "CommunitySharedPrefs/clearTempIsClosed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = r19.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C18260x0.A03(r10, r11, r0)
            X.C18270x1.A0g(r1, r0)
        L_0x0600:
            if (r20 == 0) goto L_0x0648
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/community activity key="
            X.C18260x0.A1R(r1, r0, r7)
            long r0 = r25.A0H()
            long r0 = r0 / r16
            monitor-enter(r3)
            goto L_0x0637
        L_0x0613:
            boolean r0 = r1 instanceof X.C31641oc
            if (r0 == 0) goto L_0x061a
            r0 = 1
            goto L_0x055e
        L_0x061a:
            boolean r0 = r1 instanceof X.C31661oe
            if (r0 == 0) goto L_0x0625
            r0 = r1
            X.1oe r0 = (X.C31661oe) r0
            int r0 = r0.A00
            goto L_0x055e
        L_0x0625:
            boolean r0 = r1 instanceof X.C31631ob
            if (r0 == 0) goto L_0x062c
            r0 = 3
            goto L_0x055e
        L_0x062c:
            r0 = 2
            goto L_0x055e
        L_0x062f:
            long r0 = r10.A0K
            goto L_0x0433
        L_0x0633:
            r18 = 0
            goto L_0x043e
        L_0x0637:
            r3.A0K = r0     // Catch:{ all -> 0x06ac }
            monitor-exit(r3)
            android.content.SharedPreferences$Editor r10 = X.C18270x1.A03(r29)
            java.lang.String r6 = "last_community_activity"
            X.C18270x1.A0i(r10, r6, r0)
            X.2f2 r0 = r4.A0Y
            r0.A00(r3)
        L_0x0648:
            boolean r0 = X.C624134x.A0e(r5)
            if (r0 == 0) goto L_0x0659
            X.4uZ r0 = r3.A05()
            boolean r0 = r0 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0659
            r0 = 5
            r3.A02 = r0
        L_0x0659:
            if (r18 == 0) goto L_0x0666
            boolean r0 = X.C56952sp.A0G(r26)
            if (r0 == 0) goto L_0x0666
            X.2Y2 r0 = r4.A0f
            r0.A00(r3)
        L_0x0666:
            X.2sm r1 = r4.A0W
            android.content.ContentValues r0 = r3.A04(r12)
            boolean r0 = r1.A0N(r0, r3)
            if (r0 != 0) goto L_0x067b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/addmsg/chatlist/insert/failed gid="
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x067b:
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x001c
            int r1 = r5.A0D
            r0 = 6
            if (r1 == r0) goto L_0x001c
            X.30T r1 = r4.A0l
            java.util.Map r5 = r1.A02()
            X.2jx r3 = new X.2jx
            r3.<init>(r2, r8)
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r3, r5)
            r6 = 1
            if (r0 != 0) goto L_0x06a5
            r0 = 1
        L_0x0697:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5.put(r3, r4)
            X.3dV r0 = r1.A05
            X.4Fq r3 = r0.A04()
            goto L_0x06af
        L_0x06a5:
            int r0 = r0.intValue()
            int r0 = r0 + 1
            goto L_0x0697
        L_0x06ac:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x06af:
            X.3Yo r5 = r3.Axl()     // Catch:{ all -> 0x06fd }
            android.content.ContentValues r11 = X.AnonymousClass0x9.A07(r6)     // Catch:{ all -> 0x06f3 }
            java.lang.String r0 = "message_count"
            r11.put(r0, r4)     // Catch:{ all -> 0x06f3 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x06f3 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x06f3 }
            java.lang.String r12 = "frequents"
            java.lang.String r13 = "jid = ? AND type = ?"
            java.lang.String[] r15 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x06f3 }
            X.C18280x3.A0w(r2, r15, r9)     // Catch:{ all -> 0x06f3 }
            java.lang.String r0 = java.lang.Byte.toString(r8)     // Catch:{ all -> 0x06f3 }
            r15[r6] = r0     // Catch:{ all -> 0x06f3 }
            java.lang.String r14 = "updateFrequents/UPDATE_FREQUENTS_LEGACY"
            int r0 = r10.A05(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x06f3 }
            if (r0 != 0) goto L_0x06e2
            int r0 = r4.intValue()     // Catch:{ all -> 0x06f3 }
            X.AnonymousClass30T.A00(r3, r2, r8, r0)     // Catch:{ all -> 0x06f3 }
        L_0x06e2:
            int r0 = r4.intValue()     // Catch:{ all -> 0x06f3 }
            r1.A05(r2, r8, r0, r9)     // Catch:{ all -> 0x06f3 }
            r5.A00()     // Catch:{ all -> 0x06f3 }
            r5.close()     // Catch:{ all -> 0x06fd }
            r3.close()
            return
        L_0x06f3:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x06f8 }
            goto L_0x06fc
        L_0x06f8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06fd }
        L_0x06fc:
            throw r1     // Catch:{ all -> 0x06fd }
        L_0x06fd:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0702 }
            throw r1
        L_0x0702:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0W(X.34x):void");
    }

    public void A0Y(C624134x r6) {
        if (r6.A1L < 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C624134x.A0S(r6, "CoreMessageStore/updateMessageAsync/message must have row_id set; key=", A0o2);
            C18270x1.A0z(A0o2);
        }
        A0b(r6, -1);
    }

    public void A0a(C624134x r6, int i) {
        AnonymousClass36E r1 = this.A0A;
        if (r1.A0d) {
            r1.A0O.A05(r6.A1J.A01.hashCode(), 4, -1, r6.A1I);
        }
        this.A0O.A01(new C71733ca((Object) r6, (Object) this, i, 39), 26);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A0e(X.C624134x r28, int r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r4 = r27
            X.5rC r1 = r4.A03
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0014
            r1.A04()
            java.lang.String r0 = "beforeRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0014:
            X.3dV r0 = r4.A18
            X.4Fq r18 = r0.A04()
            X.3Yo r19 = r18.Axl()     // Catch:{ all -> 0x0577 }
            X.2qz r15 = r4.A2D     // Catch:{ all -> 0x056d }
            r0 = 0
            r5 = r28
            X.C162457s7.A0J(r5, r0)     // Catch:{ all -> 0x056d }
            X.2Rl r12 = r15.A00     // Catch:{ all -> 0x056d }
            X.1VX r1 = r12.A02     // Catch:{ all -> 0x056d }
            r0 = 6834(0x1ab2, float:9.576E-42)
            X.2vE r7 = X.C58422vE.A02     // Catch:{ all -> 0x056d }
            boolean r0 = r1.A0Y(r7, r0)     // Catch:{ all -> 0x056d }
            r24 = r29
            r20 = r30
            r26 = r31
            if (r0 == 0) goto L_0x0175
            r11 = 0
            X.3dV r0 = r12.A01     // Catch:{ all -> 0x013b }
            X.4Fq r10 = r0.A04()     // Catch:{ all -> 0x013b }
            X.3Yo r14 = r10.Axl()     // Catch:{ all -> 0x0134 }
            X.2oB r9 = r12.A03     // Catch:{ all -> 0x012d }
            X.43L r8 = new X.43L     // Catch:{ all -> 0x012d }
            r8.<init>(r10)     // Catch:{ all -> 0x012d }
            int r3 = r5.A0l()     // Catch:{ all -> 0x012d }
            boolean r2 = X.AnonymousClass001.A1T(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "Should only delete message marked as MAIN; storageType="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x012d }
            X.C626936e.A0D(r2, r0)     // Catch:{ all -> 0x012d }
            X.2pF r0 = r9.A04     // Catch:{ all -> 0x012d }
            X.2z0 r6 = r5.A1J     // Catch:{ all -> 0x012d }
            r0.A03(r6)     // Catch:{ all -> 0x012d }
            r0 = 1
            r5.A1N = r0     // Catch:{ all -> 0x012d }
            X.66R r0 = r9.A0D     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x012d }
            X.2nS r1 = (X.C53662nS) r1     // Catch:{ all -> 0x012d }
            byte r0 = r5.A1I     // Catch:{ all -> 0x012d }
            X.48B r0 = r1.A02(r0)     // Catch:{ all -> 0x012d }
            boolean r1 = r0 instanceof X.AnonymousClass3VK     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x00a8
            X.3VK r0 = (X.AnonymousClass3VK) r0     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x00a9
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x012d }
        L_0x0085:
            X.8PJ r1 = new X.8PJ     // Catch:{ all -> 0x012d }
            r1.<init>(r2)     // Catch:{ all -> 0x012d }
            r23 = 0
            X.8qC r1 = r9.A07     // Catch:{ all -> 0x012d }
            java.util.Iterator r2 = X.C18270x1.A0Y(r1)     // Catch:{ all -> 0x012d }
        L_0x0092:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x012d }
            X.4BR r1 = (X.AnonymousClass4BR) r1     // Catch:{ all -> 0x012d }
            r21 = r1
            r22 = r5
            r25 = r20
            r21.BhX(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x012d }
            goto L_0x0092
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            java.lang.Class<X.3VK> r2 = X.AnonymousClass3VK.class
            goto L_0x0085
        L_0x00ac:
            if (r0 == 0) goto L_0x00d0
            r3 = 1
            r1 = r29 & 1
            if (r1 == r3) goto L_0x00b4
            r3 = 0
        L_0x00b4:
            X.8qC r1 = r0.A01     // Catch:{ all -> 0x012d }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x012d }
            X.30m r2 = (X.C613830m) r2     // Catch:{ all -> 0x012d }
            r13 = r5
            X.1mV r13 = (X.C30471mV) r13     // Catch:{ all -> 0x012d }
            X.8qC r0 = r0.A00     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x012d }
            X.2sp r1 = (X.C56952sp) r1     // Catch:{ all -> 0x012d }
            r0 = 2364(0x93c, float:3.313E-42)
            boolean r0 = r1.A0Y(r7, r0)     // Catch:{ all -> 0x012d }
            r2.A09(r13, r3, r0)     // Catch:{ all -> 0x012d }
        L_0x00d0:
            java.lang.Object r0 = r8.invoke(r5)     // Catch:{ all -> 0x012d }
            int r2 = X.AnonymousClass001.A0K(r0)     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "FMessageDatabaseSubsystem/deletemsg/ "
            r1.append(r0)     // Catch:{ all -> 0x012d }
            r1.append(r6)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = " deleted="
            r1.append(r0)     // Catch:{ all -> 0x012d }
            r1.append(r2)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = " fMsg="
            r1.append(r0)     // Catch:{ all -> 0x012d }
            int r0 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x012d }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x012d }
            if (r2 <= 0) goto L_0x0116
            X.8qC r0 = r9.A06     // Catch:{ all -> 0x012d }
            java.util.Iterator r1 = X.C18270x1.A0Y(r0)     // Catch:{ all -> 0x012d }
        L_0x0100:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x012d }
            X.4BR r0 = (X.AnonymousClass4BR) r0     // Catch:{ all -> 0x012d }
            r21 = r0
            r22 = r5
            r25 = r20
            r21.BhX(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x012d }
            goto L_0x0100
        L_0x0116:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "FMessageDatabaseSubsystem/deletemsg/nothing-deleted "
            X.C18260x0.A1S(r1, r0, r6)     // Catch:{ all -> 0x012d }
        L_0x011f:
            r14.A00()     // Catch:{ all -> 0x012d }
            r14.close()     // Catch:{ all -> 0x0134 }
            r10.close()     // Catch:{ all -> 0x013b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x013b }
            goto L_0x0140
        L_0x012d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r14, r1)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x056d }
        L_0x0140:
            boolean r0 = r1 instanceof X.AnonymousClass3Z0     // Catch:{ all -> 0x056d }
            if (r0 == 0) goto L_0x016f
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r1)     // Catch:{ all -> 0x056d }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteDoneException     // Catch:{ all -> 0x056d }
            if (r0 == 0) goto L_0x0159
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x056d }
        L_0x014f:
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x056d }
            if (r11 == 0) goto L_0x0563
            int r9 = r11.intValue()     // Catch:{ all -> 0x056d }
            goto L_0x02a8
        L_0x0159:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteDatabaseCorruptException     // Catch:{ all -> 0x056d }
            if (r0 == 0) goto L_0x0166
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x056d }
            X.2q5 r0 = r12.A00     // Catch:{ all -> 0x056d }
            r0.A04()     // Catch:{ all -> 0x056d }
            goto L_0x014f
        L_0x0166:
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x0171
            boolean r0 = r1 instanceof java.lang.Error     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x0171
            goto L_0x014f
        L_0x016f:
            r11 = r1
            goto L_0x014f
        L_0x0171:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x056d }
            throw r1     // Catch:{ all -> 0x056d }
        L_0x0175:
            X.8qC r0 = r12.A04     // Catch:{ all -> 0x056d }
            X.3Lv r11 = X.AnonymousClass0x9.A0M(r0)     // Catch:{ all -> 0x056d }
            int r3 = r5.A0l()     // Catch:{ all -> 0x056d }
            r9 = 0
            r10 = 1
            boolean r2 = X.AnonymousClass000.A1U(r3, r10)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "Should only delete message marked as MAIN; storageType="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x056d }
            X.C626936e.A0D(r2, r0)     // Catch:{ all -> 0x056d }
            r0 = r29 & 1
            boolean r3 = X.AnonymousClass000.A1U(r0, r10)
            X.3dV r0 = r11.A18     // Catch:{ SQLiteDoneException -> 0x02a4, SQLiteDatabaseCorruptException -> 0x029a, Error | RuntimeException -> 0x0294 }
            X.4Fq r8 = r0.A04()     // Catch:{ SQLiteDoneException -> 0x02a4, SQLiteDatabaseCorruptException -> 0x029a, Error | RuntimeException -> 0x0294 }
            X.3Yo r13 = r8.Axl()     // Catch:{ all -> 0x028a }
            X.2pF r0 = r11.A0y     // Catch:{ all -> 0x0280 }
            X.2z0 r6 = r5.A1J     // Catch:{ all -> 0x0280 }
            r0.A03(r6)     // Catch:{ all -> 0x0280 }
            r5.A1N = r10     // Catch:{ all -> 0x0280 }
            byte r1 = r5.A1I     // Catch:{ all -> 0x0280 }
            boolean r0 = X.C627636p.A0H(r1)     // Catch:{ all -> 0x0280 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = X.C627636p.A0I(r1)     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x01c9
        L_0x01b9:
            X.30m r2 = r11.A0w     // Catch:{ all -> 0x0280 }
            r1 = r5
            X.1mV r1 = (X.C30471mV) r1     // Catch:{ all -> 0x0280 }
            X.1VX r12 = r11.A1r     // Catch:{ all -> 0x0280 }
            r0 = 2364(0x93c, float:3.313E-42)
            boolean r0 = r12.A0Y(r7, r0)     // Catch:{ all -> 0x0280 }
            r2.A09(r1, r3, r0)     // Catch:{ all -> 0x0280 }
        L_0x01c9:
            X.34x r2 = r5.A0w()     // Catch:{ all -> 0x0280 }
            if (r2 == 0) goto L_0x01e4
            byte r1 = r2.A1I     // Catch:{ all -> 0x0280 }
            r0 = 20
            if (r1 != r0) goto L_0x01e4
            X.30m r1 = r11.A0w     // Catch:{ all -> 0x0280 }
            X.1mV r2 = (X.C30471mV) r2     // Catch:{ all -> 0x0280 }
            X.1VX r12 = r11.A1r     // Catch:{ all -> 0x0280 }
            r0 = 2364(0x93c, float:3.313E-42)
            boolean r0 = r12.A0Y(r7, r0)     // Catch:{ all -> 0x0280 }
            r1.A09(r2, r3, r0)     // Catch:{ all -> 0x0280 }
        L_0x01e4:
            X.5rC r1 = r11.A03     // Catch:{ all -> 0x0280 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x01f7
            r1.A04()     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = "removeAllLabelsFromMessage"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x0280 }
            throw r0     // Catch:{ all -> 0x0280 }
        L_0x01f7:
            r1 = r29 & 32
            r0 = 32
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            r0 = 16
            boolean r0 = r5.A1r(r0)     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x021c
            if (r1 == 0) goto L_0x020a
            goto L_0x0214
        L_0x020a:
            r2 = r29 | 32
            X.2zm r1 = r11.A10     // Catch:{ all -> 0x0280 }
            r0 = r20
            r1.A02(r8, r5, r2, r0)     // Catch:{ all -> 0x0280 }
            goto L_0x021c
        L_0x0214:
            X.2qk r2 = r11.A06     // Catch:{ all -> 0x0280 }
            java.lang.String r1 = "IgnoredMessageWithComments"
            r0 = 0
            r2.A0A(r1, r9, r0)     // Catch:{ all -> 0x0280 }
        L_0x021c:
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0280 }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x0280 }
            java.lang.String r3 = "message"
            java.lang.String r2 = "_id=?"
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x0280 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = "deleteMessageInBackground/DELETE_MESSAGE"
            int r9 = r12.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0280 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = "CoreMessageStore/deletemsg/ "
            r1.append(r0)     // Catch:{ all -> 0x0280 }
            r1.append(r6)     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = " deleted="
            r1.append(r0)     // Catch:{ all -> 0x0280 }
            r1.append(r9)     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = " fMsg="
            r1.append(r0)     // Catch:{ all -> 0x0280 }
            int r0 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x0280 }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x0280 }
            if (r9 <= 0) goto L_0x0253
            goto L_0x025d
        L_0x0253:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0280 }
            java.lang.String r0 = "CoreMessageStore/deletemsg/nothing-deleted "
            X.C18260x0.A1S(r1, r0, r6)     // Catch:{ all -> 0x0280 }
            goto L_0x0276
        L_0x025d:
            X.34w r0 = r5.A0P     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x026c
            X.9U4 r0 = r11.A28     // Catch:{ all -> 0x0280 }
            X.36F r1 = r0.A0A()     // Catch:{ all -> 0x0280 }
            X.34w r0 = r5.A0P     // Catch:{ all -> 0x0280 }
            r1.A0X(r0)     // Catch:{ all -> 0x0280 }
        L_0x026c:
            X.30a r0 = r11.A1f     // Catch:{ all -> 0x0280 }
            r0.A02(r5)     // Catch:{ all -> 0x0280 }
            X.2nN r0 = r11.A0z     // Catch:{ all -> 0x0280 }
            r0.A02(r5, r10)     // Catch:{ all -> 0x0280 }
        L_0x0276:
            r13.A00()     // Catch:{ all -> 0x0280 }
            r13.close()     // Catch:{ all -> 0x028a }
            r8.close()     // Catch:{ SQLiteDoneException -> 0x02a4, SQLiteDatabaseCorruptException -> 0x029a, Error | RuntimeException -> 0x0294 }
            goto L_0x02a8
        L_0x0280:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0285 }
            goto L_0x0289
        L_0x0285:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x028a }
        L_0x0289:
            throw r1     // Catch:{ all -> 0x028a }
        L_0x028a:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x028f }
            goto L_0x0293
        L_0x028f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDoneException -> 0x02a4, SQLiteDatabaseCorruptException -> 0x029a, Error | RuntimeException -> 0x0294 }
        L_0x0293:
            throw r1     // Catch:{ SQLiteDoneException -> 0x02a4, SQLiteDatabaseCorruptException -> 0x029a, Error | RuntimeException -> 0x0294 }
        L_0x0294:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x056d }
            goto L_0x04f5
        L_0x029a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x056d }
            X.2q5 r0 = r11.A17     // Catch:{ all -> 0x056d }
            r0.A04()     // Catch:{ all -> 0x056d }
            goto L_0x02a8
        L_0x02a4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x056d }
        L_0x02a8:
            if (r9 <= 0) goto L_0x0563
            X.2z0 r2 = r5.A1J     // Catch:{ all -> 0x056d }
            X.4uZ r11 = r2.A00     // Catch:{ all -> 0x056d }
            boolean r0 = r11 instanceof X.C135166kE     // Catch:{ all -> 0x056d }
            r13 = 0
            r8 = 1
            if (r0 == 0) goto L_0x04a5
            boolean r0 = X.C627636p.A0l(r5)     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x0563
            boolean r0 = X.C626635z.A09(r5)     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x0563
            if (r31 != 0) goto L_0x0563
            com.whatsapp.jid.UserJid r7 = r5.A0o()     // Catch:{ all -> 0x056d }
            if (r7 != 0) goto L_0x02d1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "CoreMessageStore/deletemsg/ remote resource is null or not a UserJid"
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x056d }
        L_0x02d1:
            X.33e r12 = r4.A1b     // Catch:{ all -> 0x056d }
            X.34r r6 = r12.A05(r7)     // Catch:{ all -> 0x056d }
            if (r6 == 0) goto L_0x0480
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "deleting message, StatusInfo before deletion: "
            r1.append(r0)     // Catch:{ all -> 0x056d }
            r1.append(r6)     // Catch:{ all -> 0x056d }
            java.lang.String r0 = " senderJid: "
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ all -> 0x056d }
            if (r30 != 0) goto L_0x0344
            X.1fY r0 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x056d }
            if (r7 == r0) goto L_0x0315
            X.3Ex r3 = r4.A0F     // Catch:{ all -> 0x056d }
            X.3ZH r2 = r3.A0A(r7)     // Catch:{ all -> 0x056d }
            monitor-enter(r6)     // Catch:{ all -> 0x056d }
            int r0 = r6.A00     // Catch:{ all -> 0x04f3 }
            r1 = 1
            if (r0 != r8) goto L_0x0301
            int r0 = r6.A01     // Catch:{ all -> 0x04f3 }
            if (r0 != r8) goto L_0x0301
            goto L_0x0302
        L_0x0301:
            r1 = 0
        L_0x0302:
            monitor-exit(r6)     // Catch:{ all -> 0x056d }
            if (r1 == 0) goto L_0x030c
            boolean r0 = r2.A15     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x0315
            r2.A15 = r8     // Catch:{ all -> 0x056d }
            goto L_0x0312
        L_0x030c:
            boolean r0 = r2.A15     // Catch:{ all -> 0x056d }
            if (r0 == 0) goto L_0x0315
            r2.A15 = r13     // Catch:{ all -> 0x056d }
        L_0x0312:
            r3.A0M(r2)     // Catch:{ all -> 0x056d }
        L_0x0315:
            monitor-enter(r6)     // Catch:{ all -> 0x056d }
            int r0 = r6.A00     // Catch:{ all -> 0x04f3 }
            int r0 = r0 + -1
            r6.A00 = r0     // Catch:{ all -> 0x04f3 }
            long r2 = r5.A1M     // Catch:{ all -> 0x04f3 }
            long r0 = r6.A06     // Catch:{ all -> 0x04f3 }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x032a
            int r0 = r6.A01     // Catch:{ all -> 0x04f3 }
            int r0 = r0 + -1
            r6.A01 = r0     // Catch:{ all -> 0x04f3 }
        L_0x032a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04f3 }
            java.lang.String r0 = "msgstore/status-deleted/ "
            X.C623534r.A01(r6, r5, r0, r1)     // Catch:{ all -> 0x04f3 }
            X.C18280x3.A14(r1)     // Catch:{ all -> 0x04f3 }
            int r0 = r6.A00     // Catch:{ all -> 0x04f3 }
            if (r0 > 0) goto L_0x033d
            goto L_0x0410
        L_0x033d:
            X.34r r3 = r6.A06()     // Catch:{ all -> 0x04f3 }
            monitor-exit(r6)     // Catch:{ all -> 0x056d }
            goto L_0x03ff
        L_0x0344:
            monitor-enter(r6)     // Catch:{ all -> 0x056d }
            monitor-enter(r6)     // Catch:{ all -> 0x047d }
            int r0 = r6.A00     // Catch:{ all -> 0x047a }
            if (r0 > r8) goto L_0x0364
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x047a }
            java.lang.String r0 = "msgstore/status-revoked/ "
            r1.append(r0)     // Catch:{ all -> 0x047a }
            java.lang.String r0 = X.C623534r.A00(r5)     // Catch:{ all -> 0x047a }
            r1.append(r0)     // Catch:{ all -> 0x047a }
            java.lang.String r0 = " last"
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x047a }
            monitor-exit(r6)     // Catch:{ all -> 0x047d }
            r3 = 0
            goto L_0x03fe
        L_0x0364:
            com.whatsapp.jid.UserJid r1 = r6.A0A     // Catch:{ all -> 0x047a }
            X.1fY r0 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x047a }
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            r9 = -1
            if (r0 == 0) goto L_0x0388
            long r2 = r5.A1M     // Catch:{ all -> 0x047a }
            long r0 = r6.A04     // Catch:{ all -> 0x047a }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x03c2
            r6.A04 = r9     // Catch:{ all -> 0x047a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x047a }
            java.lang.String r0 = "msgstore/status-revoked/ regenerate "
            X.C623534r.A01(r6, r5, r0, r1)     // Catch:{ all -> 0x047a }
            X.AnonymousClass0x2.A18(r1)     // Catch:{ all -> 0x047a }
            goto L_0x03bf
        L_0x0388:
            long r2 = r5.A1M     // Catch:{ all -> 0x047a }
            long r0 = r6.A06     // Catch:{ all -> 0x047a }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 == 0) goto L_0x03b0
            long r2 = r5.A1M     // Catch:{ all -> 0x047a }
            long r0 = r6.A03     // Catch:{ all -> 0x047a }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x03a0
            long r2 = r5.A1M     // Catch:{ all -> 0x047a }
            long r0 = r6.A02     // Catch:{ all -> 0x047a }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x03b0
        L_0x03a0:
            long r2 = r5.A1M     // Catch:{ all -> 0x047a }
            long r0 = r6.A07     // Catch:{ all -> 0x047a }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 == 0) goto L_0x03b0
            long r2 = r5.A1M     // Catch:{ all -> 0x047a }
            long r0 = r6.A04     // Catch:{ all -> 0x047a }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x03c2
        L_0x03b0:
            r6.A04 = r9     // Catch:{ all -> 0x047a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x047a }
            java.lang.String r0 = "msgstore/status-revoked/ regenerate "
            X.C623534r.A01(r6, r5, r0, r1)     // Catch:{ all -> 0x047a }
            X.AnonymousClass0x2.A18(r1)     // Catch:{ all -> 0x047a }
        L_0x03bf:
            monitor-exit(r6)     // Catch:{ all -> 0x047d }
            r3 = r6
            goto L_0x03e8
        L_0x03c2:
            int r0 = r6.A00     // Catch:{ all -> 0x047a }
            int r0 = r0 - r8
            r6.A00 = r0     // Catch:{ all -> 0x047a }
            long r2 = r5.A1M     // Catch:{ all -> 0x047a }
            long r0 = r6.A06     // Catch:{ all -> 0x047a }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x03d6
            int r0 = r6.A01     // Catch:{ all -> 0x047a }
            if (r0 <= 0) goto L_0x03d6
            int r0 = r0 - r8
            r6.A01 = r0     // Catch:{ all -> 0x047a }
        L_0x03d6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x047a }
            java.lang.String r0 = "msgstore/status-revoked/ "
            X.C623534r.A01(r6, r5, r0, r1)     // Catch:{ all -> 0x047a }
            X.AnonymousClass0x2.A18(r1)     // Catch:{ all -> 0x047a }
            X.34r r3 = r6.A06()     // Catch:{ all -> 0x047a }
            monitor-exit(r6)     // Catch:{ all -> 0x047d }
        L_0x03e8:
            long r8 = r3.A04()     // Catch:{ all -> 0x047d }
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03f8
            X.34r r3 = r4.A0C(r3)     // Catch:{ all -> 0x047d }
            if (r3 == 0) goto L_0x03fe
        L_0x03f8:
            X.C626936e.A06(r7)     // Catch:{ all -> 0x047d }
            r12.A0C(r3, r7)     // Catch:{ all -> 0x047d }
        L_0x03fe:
            monitor-exit(r6)     // Catch:{ all -> 0x047d }
        L_0x03ff:
            if (r3 == 0) goto L_0x0411
            if (r30 != 0) goto L_0x0563
            int r1 = r3.A03()     // Catch:{ all -> 0x056d }
            int r0 = r3.A02()     // Catch:{ all -> 0x056d }
            r12.A0D(r7, r1, r0)     // Catch:{ all -> 0x056d }
            goto L_0x0563
        L_0x0410:
            monitor-exit(r6)     // Catch:{ all -> 0x056d }
        L_0x0411:
            r12.A03(r7)     // Catch:{ all -> 0x056d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "CoreMessageStore/deletemsg/statuslist/delete jid="
            r1.append(r0)     // Catch:{ all -> 0x056d }
            r1.append(r7)     // Catch:{ all -> 0x056d }
            java.lang.String r0 = " oldStatusInfo "
            X.C18260x0.A1R(r1, r0, r6)     // Catch:{ all -> 0x056d }
            boolean r0 = r11 instanceof X.C135216kJ     // Catch:{ all -> 0x056d }
            if (r0 == 0) goto L_0x0563
            X.2W5 r6 = r4.A1a     // Catch:{ all -> 0x056d }
            long r3 = r5.A1L     // Catch:{ all -> 0x056d }
            monitor-enter(r6)     // Catch:{ all -> 0x056d }
            X.C626936e.A00()     // Catch:{ all -> 0x04f3 }
            X.3dV r0 = r6.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0471 }
            X.4Fq r9 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0471 }
            X.3Yo r8 = r9.Axl()     // Catch:{ all -> 0x0467 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x045d }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x045d }
            java.lang.String r5 = "message_status_psa_campaign"
            java.lang.String r2 = "message_row_id = ? "
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x045d }
            X.C18280x3.A1R(r1, r13, r3)     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "StatusPsaCampaignStore/delete"
            r7.A07(r5, r2, r0, r1)     // Catch:{ all -> 0x045d }
            r8.A00()     // Catch:{ all -> 0x045d }
            r8.close()     // Catch:{ all -> 0x0467 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0471 }
            goto L_0x0562
        L_0x045d:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0462 }
            goto L_0x0466
        L_0x0462:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0467 }
        L_0x0466:
            throw r1     // Catch:{ all -> 0x0467 }
        L_0x0467:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x046c }
            goto L_0x0470
        L_0x046c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0471 }
        L_0x0470:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0471 }
        L_0x0471:
            r1 = move-exception
            java.lang.String r0 = "messagestatuspsacampaign/delete"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04f3 }
            goto L_0x0562
        L_0x047a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x047d }
            throw r0     // Catch:{ all -> 0x047d }
        L_0x047d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x047d }
            goto L_0x04f5
        L_0x0480:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "CoreMessageStore/deletemsg/statuslist/no statusInfo for "
            X.C18260x0.A1Q(r1, r0, r7)     // Catch:{ all -> 0x056d }
            X.2qk r3 = r4.A06     // Catch:{ all -> 0x056d }
            java.lang.String r2 = "deletingStatusMessage/StatusInfo for senderJid is null"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "senderJid: "
            r1.append(r0)     // Catch:{ all -> 0x056d }
            r1.append(r7)     // Catch:{ all -> 0x056d }
            java.lang.String r0 = ", message: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ all -> 0x056d }
            r3.A0A(r2, r8, r0)     // Catch:{ all -> 0x056d }
            goto L_0x0563
        L_0x04a5:
            X.2ss r8 = r4.A0X     // Catch:{ all -> 0x056d }
            X.31A r6 = r8.A0A(r11, r13)     // Catch:{ all -> 0x056d }
            if (r6 == 0) goto L_0x0563
            long r2 = r6.A0U     // Catch:{ all -> 0x056d }
            long r0 = r5.A1L     // Catch:{ all -> 0x056d }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r17 = X.AnonymousClass000.A1T(r9)
            long r2 = r6.A0N     // Catch:{ all -> 0x056d }
            long r0 = r5.A1L     // Catch:{ all -> 0x056d }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r16 = X.AnonymousClass000.A1T(r9)
            X.1VX r1 = r4.A1r     // Catch:{ all -> 0x056d }
            r0 = 6440(0x1928, float:9.024E-42)
            boolean r0 = r1.A0Y(r7, r0)     // Catch:{ all -> 0x056d }
            if (r0 == 0) goto L_0x04ce
            r9 = 1
            if (r30 != 0) goto L_0x04cf
        L_0x04ce:
            r9 = 0
        L_0x04cf:
            long r2 = r5.A1M     // Catch:{ all -> 0x056d }
            long r0 = r6.A0Q     // Catch:{ all -> 0x056d }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0501
            r1 = r29 & 16
            r0 = 16
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            int r0 = r6.A08     // Catch:{ all -> 0x056d }
            if (r0 <= 0) goto L_0x04f7
            int r0 = r0 + -1
            monitor-enter(r6)     // Catch:{ all -> 0x056d }
            r6.A08 = r0     // Catch:{ all -> 0x04f3 }
            monitor-exit(r6)     // Catch:{ all -> 0x056d }
            if (r1 == 0) goto L_0x04f7
            int r0 = r6.A0A     // Catch:{ all -> 0x056d }
            int r0 = r0 + -1
            monitor-enter(r6)     // Catch:{ all -> 0x056d }
            r6.A0A = r0     // Catch:{ all -> 0x04f3 }
            goto L_0x04f6
        L_0x04f3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x056d }
        L_0x04f5:
            throw r0     // Catch:{ all -> 0x056d }
        L_0x04f6:
            monitor-exit(r6)     // Catch:{ all -> 0x056d }
        L_0x04f7:
            X.2sr r0 = r4.A09     // Catch:{ all -> 0x056d }
            X.C627636p.A0F(r0, r8, r5)     // Catch:{ all -> 0x056d }
            X.2sm r0 = r4.A0W     // Catch:{ all -> 0x056d }
            r0.A0J(r6)     // Catch:{ all -> 0x056d }
        L_0x0501:
            if (r9 != 0) goto L_0x0555
            if (r17 != 0) goto L_0x0507
            if (r16 == 0) goto L_0x0555
        L_0x0507:
            r1 = 4
            r0 = r29 & 4
            boolean r14 = X.AnonymousClass000.A1U(r0, r1)
            X.2rt r0 = r4.A1P     // Catch:{ all -> 0x056d }
            long r0 = r0.A02(r11)     // Catch:{ all -> 0x056d }
            X.2rr r2 = r4.A1U     // Catch:{ all -> 0x056d }
            long r2 = r2.A06(r11)     // Catch:{ all -> 0x056d }
            X.34x r10 = X.C55122pp.A00(r15, r0)     // Catch:{ all -> 0x056d }
            X.2sm r12 = r4.A0W     // Catch:{ all -> 0x056d }
            X.2ss r4 = r12.A02     // Catch:{ all -> 0x056d }
            X.31A r9 = r4.A0A(r11, r13)     // Catch:{ all -> 0x056d }
            if (r9 == 0) goto L_0x0546
            r7 = 1
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0536
            if (r14 != 0) goto L_0x0536
            if (r10 == 0) goto L_0x0536
            long r7 = r10.A0K     // Catch:{ all -> 0x056d }
            r9.A0X = r7     // Catch:{ all -> 0x056d }
        L_0x0536:
            if (r17 == 0) goto L_0x053e
            r9.A0U = r0     // Catch:{ all -> 0x056d }
            r9.A0V = r2     // Catch:{ all -> 0x056d }
            r9.A0d = r10     // Catch:{ all -> 0x056d }
        L_0x053e:
            if (r16 == 0) goto L_0x0546
            r9.A0N = r0     // Catch:{ all -> 0x056d }
            r9.A0O = r2     // Catch:{ all -> 0x056d }
            r9.A0c = r10     // Catch:{ all -> 0x056d }
        L_0x0546:
            boolean r0 = r12.A0O(r6)     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x0555
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x056d }
            java.lang.String r0 = "CoreMessageStore/deletemsg/chatlist/insert/failed gid="
            X.C18260x0.A1Q(r1, r0, r11)     // Catch:{ all -> 0x056d }
        L_0x0555:
            long r3 = r6.A0H     // Catch:{ all -> 0x056d }
            long r1 = r5.A1M     // Catch:{ all -> 0x056d }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0563
            r0 = -9223372036854775808
            r6.A0H = r0     // Catch:{ all -> 0x056d }
            goto L_0x0563
        L_0x0562:
            monitor-exit(r6)     // Catch:{ all -> 0x056d }
        L_0x0563:
            r19.A00()     // Catch:{ all -> 0x056d }
            r19.close()     // Catch:{ all -> 0x0577 }
            r18.close()
            return
        L_0x056d:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0572 }
            goto L_0x0576
        L_0x0572:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0577 }
        L_0x0576:
            throw r1     // Catch:{ all -> 0x0577 }
        L_0x0577:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x057c }
            throw r1
        L_0x057c:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0e(X.34x, int, boolean, boolean):void");
    }

    public void A0f(C624134x r13, boolean z) {
        File A012;
        File A013;
        if (z) {
            C624134x r8 = r13;
            List A192 = r13.A19();
            HashMap A0t2 = AnonymousClass001.A0t();
            long A062 = C56612sH.A06(this);
            C626936e.A06(A192);
            Iterator it = A192.iterator();
            int i = 0;
            while (it.hasNext()) {
                UserJid A0T2 = C18310x6.A0T(it);
                try {
                    C624134x A0F2 = A0F(A0T2, r8, A0t2, A062);
                    boolean A072 = this.A1P.A07(A0T2);
                    A0t(A0F2);
                    A0U(A0T2, A0F2, A072);
                    C116985rC r1 = this.A04;
                    if (!r1.A07() || !C624134x.A0e(A0F2)) {
                        this.A2D.A06(A0F2);
                        A0W(A0F2);
                        i++;
                    } else {
                        r1.A04();
                        throw AnonymousClass001.A0g("hasPlaceholder");
                    }
                } catch (SQLiteConstraintException e) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C624134x.A0S(r13, "CoreMessageStore/updatemessageinbackground duplicate key=", A0o2);
                    Log.i(A0o2.toString(), e);
                }
            }
            if ((r13 instanceof C30471mV) && i > 0 && (A013 = C30471mV.A01((C30471mV) r8)) != null) {
                this.A0B.A04(A013, i, true);
            }
            C624134x A0w2 = r13.A0w();
            if ((A0w2 instanceof AnonymousClass1nE) && i > 0 && (A012 = C30471mV.A01((C30471mV) A0w2)) != null) {
                this.A0B.A04(A012, i, true);
            }
            if (A192.size() == A0t2.size()) {
                r13.A1A = A0t2;
            } else if (A0t2.size() != 0) {
                Log.e("msgstore/validateBroadcastParticipantSizes failed");
            }
        }
    }

    public void A0h(C30791n7 r6) {
        AnonymousClass39W r0;
        AnonymousClass39S r4;
        C624134x A002;
        if (this.A1r.A0Y(C58422vE.A02, 4893) && (r0 = r6.A00) != null && (r4 = r0.A01) != null && r4.A0B != null) {
            AnonymousClass39H r2 = r4.A07;
            if (AnonymousClass39S.A00(r2.A01) == 1 || AnonymousClass39S.A00(r2.A01) == 7) {
                C42292Nn r3 = this.A1D;
                String str = r4.A0B;
                C162457s7.A0J(str, 0);
                String str2 = (String) C380725l.A00(C72553du.A00, new OrderRequestMessageManager$getOrderRequestMessageRowId$1(r3, str, (C84814Du) null));
                if (str2 != null && (A002 = C55122pp.A00(this.A2D, Long.parseLong(str2))) != null && (A002 instanceof C30821nD)) {
                    C30821nD r1 = (C30821nD) A002;
                    r1.A02 = 2;
                    A0Y(r1);
                }
            }
        }
    }

    public final void A0i(AnonymousClass33M r10) {
        C85284Fq A042;
        C85284Fq A043 = this.A18.A04();
        try {
            C69833Yo Axl = A043.Axl();
            try {
                C56862sg r2 = ((AnonymousClass3H0) A043).A03;
                r2.A07("receipts", (String) null, "clearAllMessagesInDB/DELETE_RECEIPTS", (String[]) null);
                r2.A07("receipt_device", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_DEVICE", (String[]) null);
                r2.A07("receipt_user", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_USER", (String[]) null);
                r2.A07("receipt_orphaned", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_ORPHANED", (String[]) null);
                r10.A08("receipts tables");
                r2.A0H("UPDATE chat SET display_message_row_id=1, unseen_message_count = 0, unseen_missed_calls_count = 0, unseen_row_count = 0, unseen_earliest_message_received_time = 0", "UPDATE_ALL_LAST_MESSAGES_CHAT");
                r2.A07("media_refs", (String) null, "clearAllMessagesInDB/DELETE_MEDIA_REFS", (String[]) null);
                r2.A07("message_streaming_sidecar", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_STREAMING_SIDECAR", (String[]) null);
                r2.A07("message_thumbnail", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_THUMBNAIL", (String[]) null);
                r2.A07("message_media", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_MEDIA", (String[]) null);
                r10.A08("media tables");
                r2.A07("mms_thumbnail_metadata", (String) null, "clearAllMessagesInDB/DELETE_MMS_THUMBNAIL_METADATA", (String[]) null);
                r10.A08("mms thumbnail metadata tables");
                r2.A07("audio_data", (String) null, "clearAllMessagesInDB/DELETE_AUDIO_DATA", (String[]) null);
                r10.A08("audio data tables");
                AnonymousClass30T r6 = this.A0l;
                A042 = r6.A05.A04();
                C56862sg r4 = ((AnonymousClass3H0) A042).A03;
                r4.A07("frequent", (String) null, "deleteAllFrequents/DELETE_FREQUENT", (String[]) null);
                r4.A07("frequents", (String) null, "deleteAllFrequents/DELETE_FREQUENTS_LEGACY", (String[]) null);
                A042.close();
                r2.A07("status", (String) null, "clearAllMessagesInDB/DELETE_STATUS_LIST_V2", (String[]) null);
                r6.A00 = AnonymousClass0x9.A1D();
                r10.A08("frequent tables");
                r2.A07("message_ftsv2", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_FTS", (String[]) null);
                r10.A08("fts tables");
                r2.A07("message_send_count", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_SEND_COUNT", (String[]) null);
                r2.A07("message_location", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_LOCATION", (String[]) null);
                r2.A07("message_template", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEMPLATE", (String[]) null);
                r2.A07("message_template_button", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEMPLATE_BUTTON", (String[]) null);
                r2.A07("message_quoted", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_QUOTED", (String[]) null);
                r2.A07("message_mentions", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_MENTIONS", (String[]) null);
                r2.A07("message_product", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_PRODUCT", (String[]) null);
                r2.A07("message_link", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_LINK", (String[]) null);
                r2.A07("message_future", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_FUTURE", (String[]) null);
                r2.A07("message_system", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_SYSTEM", (String[]) null);
                r2.A07("message_text", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEXT", (String[]) null);
                r10.A08("extra data tables");
                r2.A0H("DELETE FROM message WHERE _id!=1", "CLEAR_ALL_MESSAGES_SQL");
                r10.A08("message table");
                Axl.A00();
                r10.A08("set transaction");
                Axl.close();
                A043.close();
                return;
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A043.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0j(Collection collection) {
        C620233e r3 = this.A1b;
        C623534r A042 = r3.A04();
        if (A042 != null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "regenerateStatsInfo for MeJid ", A042);
            C623534r A0C2 = A0C(A042);
            if (A0C2 != null) {
                r3.A0C(A0C2, AnonymousClass1fY.A00);
            } else {
                Log.i("deleting MeJid status from StatusStore/updateMyStatus");
                r3.A03(AnonymousClass1fY.A00);
            }
        }
        C70093Zw.A00(this.A0q.A01, this, collection, 26);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0259, code lost:
        X.C18270x1.A1B("CoreMessageStore/deletemsgs/batches stopped at ref:", X.AnonymousClass001.A0o(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03b3, code lost:
        if (r23 == null) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c1, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03c4, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03c9, code lost:
        if (r25.Boa() != false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03cb, code lost:
        if (r39 != false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03cd, code lost:
        r4.A0l.A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03d2, code lost:
        A0K(r5);
        r4.A0b.A00();
        r25.BTW();
        r4 = X.AnonymousClass001.A0o();
        r4.append("CoreMessageStore/deletemsgs/batches ");
        r4.append(r2);
        r4.append(" haveMessagesToDelete:");
        r4.append(r6);
        X.AnonymousClass33M.A03(r24, " timeSpent:", r4);
        r4.append(" currentMessages:");
        r4.append(r7);
        X.C18260x0.A0y(" totalMessages:", r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0407, code lost:
        return true ^ r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03c4 A[EDGE_INSN: B:203:0x03c4->B:195:0x03c4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011f A[Catch:{ SQLiteDiskIOException -> 0x039d, all -> 0x03b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0o(X.C43912Ty r37, X.C85274Fp r38, boolean r39) {
        /*
            r36 = this;
            r5 = r37
            r1 = 1
            if (r39 == 0) goto L_0x000a
            java.util.List r0 = r5.A09
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r2 = r5.A00
            if (r2 >= r1) goto L_0x0059
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/deletemsgs/batches block size is not positive:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " for jid:"
            r1.append(r0)
            X.4uZ r4 = r5.A07
            X.C18260x0.A0n(r4, r1)
            long r12 = r5.A06
            long r10 = r5.A01
            r20 = 100
            long r8 = r5.A04
            long r6 = r5.A05
            boolean r0 = r5.A0C
            r33 = r0
            boolean r0 = r5.A0B
            r34 = r0
            long r2 = r5.A02
            long r0 = r5.A03
            java.lang.String r15 = r5.A08
            java.util.List r14 = r5.A09
            X.2Ty r5 = new X.2Ty
            r16 = r5
            r17 = r4
            r18 = r15
            r19 = r14
            r21 = r12
            r23 = r10
            r25 = r8
            r27 = r6
            r29 = r2
            r31 = r0
            r35 = r33
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r27, r29, r31, r33, r34, r35)
        L_0x0059:
            X.C626936e.A00()
            java.lang.String r0 = "msgstore/deletemsgs/batches"
            X.33M r24 = X.AnonymousClass33M.A01(r0)
            r25 = r38
            r25.Bc5()
            r6 = 0
            r4 = r36
            if (r39 == 0) goto L_0x0362
            java.util.List r0 = r5.A09
            if (r0 != 0) goto L_0x035c
            r3 = 0
        L_0x0072:
            X.2o0 r0 = r4.A1c
            X.4uZ r2 = r5.A07
            long r0 = r0.A00(r2)
            X.2rr r7 = r4.A1U
            r7.A04(r0)
            r4.A0K(r5)
            r23 = 0
            r7 = 0
        L_0x0085:
            boolean r0 = r25.Boa()
            if (r0 != 0) goto L_0x03c4
            X.2qv r10 = r4.A0e     // Catch:{ all -> 0x03b2 }
            X.3dV r9 = r10.A02     // Catch:{ all -> 0x03b2 }
            X.4GK r12 = r9.get()     // Catch:{ all -> 0x03b2 }
            if (r39 == 0) goto L_0x00dd
            java.util.List r8 = r5.A09     // Catch:{ all -> 0x03a8 }
            if (r8 == 0) goto L_0x00dd
            int r1 = r8.size()     // Catch:{ all -> 0x03a8 }
            r0 = 999(0x3e7, float:1.4E-42)
            if (r1 <= r0) goto L_0x00a8
            java.lang.String r0 = "msgstore/deletemsgs/getSingularDeletedChats too many messages to delete"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03a8 }
            goto L_0x010c
        L_0x00a8:
            int r11 = r8.size()     // Catch:{ all -> 0x03a8 }
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ all -> 0x03a8 }
            r1 = 0
        L_0x00af:
            if (r1 >= r11) goto L_0x00bd
            java.lang.Object r0 = r8.get(r1)     // Catch:{ all -> 0x03a8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x03a8 }
            X.AnonymousClass0x7.A1E(r0, r10, r1)     // Catch:{ all -> 0x03a8 }
            int r1 = r1 + 1
            goto L_0x00af
        L_0x00bd:
            X.4GK r9 = r9.get()     // Catch:{ all -> 0x03a8 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x036c }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "SELECT * FROM deleted_messages_view WHERE _id IN "
            X.C57212tH.A02(r0, r1, r11)     // Catch:{ all -> 0x036c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "GET_SINGULAR_MESSAGE_CURSOR"
            android.database.Cursor r13 = r8.A0E(r1, r0, r10)     // Catch:{ all -> 0x036c }
            r9.close()     // Catch:{ all -> 0x03a8 }
            goto L_0x00f8
        L_0x00dd:
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x03a8 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x03a8 }
            java.lang.String r8 = X.C39102Ar.A00     // Catch:{ all -> 0x03a8 }
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x03a8 }
            X.2sm r0 = r10.A00     // Catch:{ all -> 0x03a8 }
            X.C56922sm.A02(r0, r2, r1, r6)     // Catch:{ all -> 0x03a8 }
            int r0 = r5.A00     // Catch:{ all -> 0x03a8 }
            X.C18270x1.A1P(r1, r0)     // Catch:{ all -> 0x03a8 }
            java.lang.String r0 = "GET_DELETED_MESSAGES_BY_ID_SQL"
            android.database.Cursor r13 = r9.A0E(r8, r0, r1)     // Catch:{ all -> 0x03a8 }
        L_0x00f8:
            if (r13 == 0) goto L_0x010d
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x03a8 }
            if (r0 == 0) goto L_0x010d
            long r14 = X.C18270x1.A01(r13)     // Catch:{ all -> 0x03a8 }
            java.lang.String r0 = "sort_id"
            long r16 = X.AnonymousClass0x2.A0C(r13, r0)     // Catch:{ all -> 0x03a8 }
            goto L_0x0111
        L_0x010c:
            r13 = 0
        L_0x010d:
            r14 = 1
            r16 = -9223372036854775808
        L_0x0111:
            r12.close()     // Catch:{ all -> 0x03b2 }
            X.2Ni r12 = new X.2Ni     // Catch:{ all -> 0x03b2 }
            r12.<init>(r13, r14, r16)     // Catch:{ all -> 0x03b2 }
            r23 = r12
            android.database.Cursor r11 = r12.A00     // Catch:{ all -> 0x03b6 }
            if (r11 == 0) goto L_0x03c4
            long r0 = r12.A01     // Catch:{ all -> 0x03b6 }
            r9 = 1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x03a4
            int r22 = r11.getCount()     // Catch:{ all -> 0x03b6 }
            java.lang.String r21 = "CoreMessageStore/deleteMediaMessageFilesBatch: "
            java.lang.String r8 = "msgstore/deletemedia/batch/files"
            X.33M r19 = X.AnonymousClass33M.A01(r8)     // Catch:{ all -> 0x03b6 }
            java.util.HashSet r20 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x03b6 }
            r10 = 1
            boolean r8 = r11.moveToFirst()     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r8 == 0) goto L_0x01f2
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()     // Catch:{ SQLiteDiskIOException -> 0x039d }
            java.lang.String r8 = "remove_files"
            int r17 = r11.getColumnIndexOrThrow(r8)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            java.lang.String r8 = "message_type"
            int r15 = r11.getColumnIndex(r8)     // Catch:{ SQLiteDiskIOException -> 0x039d }
        L_0x0151:
            int r8 = r11.getInt(r15)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            byte r9 = (byte) r8     // Catch:{ SQLiteDiskIOException -> 0x039d }
            boolean r8 = X.C627636p.A0H(r9)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r8 != 0) goto L_0x0162
            boolean r8 = X.C627636p.A0I(r9)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r8 == 0) goto L_0x01cb
        L_0x0162:
            X.2qz r8 = r4.A2D     // Catch:{ SQLiteDiskIOException -> 0x039d }
            X.C162457s7.A0J(r2, r10)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            X.2pp r8 = r8.A02     // Catch:{ SQLiteDiskIOException -> 0x039d }
            X.34x r14 = r8.A02(r11, r2, r10)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            X.C626936e.A06(r14)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            boolean r8 = r14 instanceof X.C30471mV     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r8 == 0) goto L_0x01cb
            X.1mV r14 = (X.C30471mV) r14     // Catch:{ SQLiteDiskIOException -> 0x039d }
            java.lang.String r9 = r14.A04     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r9 == 0) goto L_0x017f
            r8 = r20
            r8.add(r9)     // Catch:{ SQLiteDiskIOException -> 0x039d }
        L_0x017f:
            r8 = r17
            boolean r13 = X.C626135u.A03(r11, r8)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            X.1VX r12 = r4.A1r     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r9 = 421(0x1a5, float:5.9E-43)
            X.2vE r8 = X.C58422vE.A02     // Catch:{ SQLiteDiskIOException -> 0x039d }
            boolean r8 = r12.A0Y(r8, r9)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r8 == 0) goto L_0x01b1
            X.33C r12 = r14.A01     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r12 == 0) goto L_0x01cb
            java.io.File r9 = r12.A0F     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r9 == 0) goto L_0x01cb
            X.2rq r8 = r4.A0B     // Catch:{ SQLiteDiskIOException -> 0x039d }
            boolean r16 = r8.A07(r9)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r16 == 0) goto L_0x01af
            int r9 = r8.A00(r9, r10)     // Catch:{ SQLiteDiskIOException -> 0x039d }
        L_0x01a5:
            boolean r8 = X.C627636p.A0y(r14)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r13 = r13 | r8
            if (r13 == 0) goto L_0x01cb
            if (r9 >= 0) goto L_0x01cb
            goto L_0x01b7
        L_0x01af:
            r9 = 0
            goto L_0x01a5
        L_0x01b1:
            X.30m r8 = r4.A0w     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r8.A09(r14, r13, r6)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            goto L_0x01cb
        L_0x01b7:
            X.4II r8 = new X.4II     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r8.<init>(r12, r4, r14, r10)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            java.util.concurrent.FutureTask r9 = new java.util.concurrent.FutureTask     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r9.<init>(r8)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            X.4FS r8 = r4.A2G     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r8.BkM(r9)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r8 = r18
            r8.add(r9)     // Catch:{ SQLiteDiskIOException -> 0x039d }
        L_0x01cb:
            boolean r8 = r11.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r8 != 0) goto L_0x0151
            java.util.Iterator r13 = r18.iterator()     // Catch:{ SQLiteDiskIOException -> 0x039d }
        L_0x01d5:
            boolean r8 = r13.hasNext()     // Catch:{ SQLiteDiskIOException -> 0x039d }
            if (r8 == 0) goto L_0x01f2
            java.lang.Object r8 = r13.next()     // Catch:{ SQLiteDiskIOException -> 0x039d }
            java.util.concurrent.FutureTask r8 = (java.util.concurrent.FutureTask) r8     // Catch:{ SQLiteDiskIOException -> 0x039d }
            r8.get()     // Catch:{ InterruptedException | ExecutionException -> 0x01e5 }
            goto L_0x01d5
        L_0x01e5:
            r12 = move-exception
            r8 = r21
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0k(r2, r8)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            java.lang.String r8 = " failed to delete a media file"
            X.C18260x0.A15(r8, r9, r12)     // Catch:{ SQLiteDiskIOException -> 0x039d }
            goto L_0x01d5
        L_0x01f2:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03b6 }
            java.lang.String r8 = "CoreMessageStore/deletemedia/batch/files "
            r12.append(r8)     // Catch:{ all -> 0x03b6 }
            r12.append(r2)     // Catch:{ all -> 0x03b6 }
            java.lang.String r9 = " timeSpent:"
            r8 = r19
            X.AnonymousClass33M.A05(r8, r9, r12)     // Catch:{ all -> 0x03b6 }
            java.util.ArrayList r19 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x03b6 }
            r11.moveToFirst()     // Catch:{ all -> 0x03b6 }
        L_0x020c:
            java.lang.String r15 = "key_id"
            java.lang.String r9 = X.AnonymousClass0x2.A0Z(r11, r15)     // Catch:{ all -> 0x03b6 }
            r8 = r19
            r8.add(r9)     // Catch:{ all -> 0x03b6 }
            boolean r8 = r11.moveToNext()     // Catch:{ all -> 0x03b6 }
            if (r8 != 0) goto L_0x020c
            X.3dV r8 = r4.A18     // Catch:{ all -> 0x03b6 }
            X.4Fq r18 = r8.A04()     // Catch:{ all -> 0x03b6 }
            X.3Yo r17 = r18.Axl()     // Catch:{ all -> 0x0393 }
            r8 = 3
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ all -> 0x0389 }
            long r8 = r5.A01     // Catch:{ all -> 0x0389 }
            X.AnonymousClass0x2.A1S(r12, r6, r8)     // Catch:{ all -> 0x0389 }
            r6 = r23
            long r8 = r6.A02     // Catch:{ all -> 0x0389 }
            X.AnonymousClass0x2.A1S(r12, r10, r8)     // Catch:{ all -> 0x0389 }
            int r6 = r5.A00     // Catch:{ all -> 0x0389 }
            java.lang.String r8 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0389 }
            r6 = 2
            r12[r6] = r8     // Catch:{ all -> 0x0389 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0389 }
            java.lang.String r6 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?    AND sort_id>=?    ORDER BY sort_id ASC   LIMIT ?)"
            java.lang.String r9 = X.AnonymousClass000.A0X(r6, r8)     // Catch:{ all -> 0x0389 }
            java.lang.String r8 = "deleteAllMessagesForJidInBatchesBackground/DELETE_MESSAGE"
            r6 = r18
            X.3H0 r6 = (X.AnonymousClass3H0) r6     // Catch:{ all -> 0x0389 }
            X.2sg r13 = r6.A03     // Catch:{ all -> 0x0389 }
            java.lang.String r6 = "message"
            int r14 = r13.A07(r6, r9, r8, r12)     // Catch:{ all -> 0x0389 }
            if (r14 != 0) goto L_0x0264
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0389 }
            java.lang.String r6 = "CoreMessageStore/deletemsgs/batches stopped at ref:"
            X.C18270x1.A1B(r6, r8, r0)     // Catch:{ all -> 0x0389 }
            goto L_0x0376
        L_0x0264:
            java.util.List r6 = r5.A09     // Catch:{ all -> 0x0389 }
            if (r6 == 0) goto L_0x02a2
            java.util.Iterator r16 = r6.iterator()     // Catch:{ all -> 0x0389 }
        L_0x026c:
            boolean r6 = r16.hasNext()     // Catch:{ all -> 0x0389 }
            if (r6 == 0) goto L_0x02a2
            java.lang.Object r6 = r16.next()     // Catch:{ all -> 0x0389 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0389 }
            if (r6 == 0) goto L_0x026c
            long r8 = r6.longValue()     // Catch:{ all -> 0x0389 }
            r12 = 0
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ all -> 0x0389 }
            X.AnonymousClass0x2.A1S(r6, r12, r8)     // Catch:{ all -> 0x0389 }
            java.lang.String r9 = X.C58092uh.A00     // Catch:{ all -> 0x0389 }
            java.lang.String r8 = "SELECT_ALL_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r6 = r13.A0E(r9, r8, r6)     // Catch:{ all -> 0x0389 }
        L_0x028c:
            boolean r8 = r6.moveToNext()     // Catch:{ all -> 0x037d }
            if (r8 == 0) goto L_0x029e
            X.2qz r8 = r4.A2D     // Catch:{ all -> 0x037d }
            X.34x r8 = r8.A03(r6)     // Catch:{ all -> 0x037d }
            if (r8 == 0) goto L_0x028c
            r4.A0d(r8, r10, r12)     // Catch:{ all -> 0x037d }
            goto L_0x028c
        L_0x029e:
            r6.close()     // Catch:{ all -> 0x0389 }
            goto L_0x026c
        L_0x02a2:
            X.30a r9 = r4.A1f     // Catch:{ all -> 0x0389 }
            X.3dV r6 = r9.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0301 }
            X.4Fq r16 = r6.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0301 }
            r6 = r16
            X.3H0 r6 = (X.AnonymousClass3H0) r6     // Catch:{ all -> 0x02f7 }
            X.2sg r10 = r6.A03     // Catch:{ all -> 0x02f7 }
            java.lang.String r8 = "message_thumbnail"
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f7 }
            java.lang.String r6 = "message_row_id IN "
            r12.append(r6)     // Catch:{ all -> 0x02f7 }
            java.lang.String r6 = "(SELECT _id FROM message_view WHERE chat_row_id = ? AND "
            r12.append(r6)     // Catch:{ all -> 0x02f7 }
            r12.append(r15)     // Catch:{ all -> 0x02f7 }
            java.lang.String r6 = " IN (\""
            r12.append(r6)     // Catch:{ all -> 0x02f7 }
            java.lang.String r13 = "\",\""
            r6 = r19
            X.C18310x6.A1G(r13, r6, r12)     // Catch:{ all -> 0x02f7 }
            java.lang.String r6 = "\")"
            r12.append(r6)     // Catch:{ all -> 0x02f7 }
            java.lang.String r13 = X.AnonymousClass000.A0e(r12)     // Catch:{ all -> 0x02f7 }
            java.lang.String[] r12 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x02f7 }
            X.2sm r6 = r9.A00     // Catch:{ all -> 0x02f7 }
            X.C56922sm.A01(r6, r2, r12)     // Catch:{ all -> 0x02f7 }
            java.lang.String r6 = "deleteMessageThumbnailsFor/DELETE_MESSAGE_THUMBNAILS_BY_ID"
            int r10 = r10.A07(r8, r13, r6, r12)     // Catch:{ all -> 0x02f7 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f7 }
            java.lang.String r6 = "msgstore/deleteMessageThumbnailsFor-jid/"
            X.C18260x0.A0y(r6, r8, r10)     // Catch:{ all -> 0x02f7 }
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0301 }
            goto L_0x0308
        L_0x02f7:
            r8 = move-exception
            r16.close()     // Catch:{ all -> 0x02fc }
            goto L_0x0300
        L_0x02fc:
            r6 = move-exception
            r8.addSuppressed(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0301 }
        L_0x0300:
            throw r8     // Catch:{ SQLiteDatabaseCorruptException -> 0x0301 }
        L_0x0301:
            r8 = move-exception
            java.lang.String r6 = "msgstore/deleteMessageThumbnailsFor-jid"
            com.whatsapp.util.Log.e(r6, r8)     // Catch:{ all -> 0x0389 }
        L_0x0308:
            r6 = r20
            r9.A04(r6)     // Catch:{ all -> 0x0389 }
            r17.A00()     // Catch:{ all -> 0x0389 }
            int r7 = r7 + r14
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0389 }
            java.lang.String r8 = "CoreMessageStore/deletemsgs/batches"
            r6.append(r8)     // Catch:{ all -> 0x0389 }
            java.lang.String r8 = " batchref: "
            r6.append(r8)     // Catch:{ all -> 0x0389 }
            r6.append(r0)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = ", messagesDeleted: "
            r6.append(r0)     // Catch:{ all -> 0x0389 }
            r6.append(r14)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = ", cursorRefSize: "
            r6.append(r0)     // Catch:{ all -> 0x0389 }
            r0 = r22
            r6.append(r0)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = ", current: "
            r6.append(r0)     // Catch:{ all -> 0x0389 }
            r6.append(r7)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = ", total: "
            r6.append(r0)     // Catch:{ all -> 0x0389 }
            r6.append(r3)     // Catch:{ all -> 0x0389 }
            java.lang.String r1 = ", time:"
            r0 = r24
            X.AnonymousClass33M.A04(r0, r1, r6)     // Catch:{ all -> 0x0389 }
            r17.close()     // Catch:{ all -> 0x0393 }
            r18.close()     // Catch:{ all -> 0x03b6 }
            r11.close()
            r0 = r25
            r0.BZ0(r7, r3)
            r6 = 0
            goto L_0x0085
        L_0x035c:
            int r3 = r0.size()
            goto L_0x0072
        L_0x0362:
            X.2qv r1 = r4.A0e
            X.4uZ r0 = r5.A07
            int r3 = r1.A00(r0)
            goto L_0x0072
        L_0x036c:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0371 }
            goto L_0x0375
        L_0x0371:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03a8 }
        L_0x0375:
            throw r1     // Catch:{ all -> 0x03a8 }
        L_0x0376:
            r17.close()     // Catch:{ all -> 0x0393 }
            r18.close()     // Catch:{ all -> 0x03b6 }
            goto L_0x03c1
        L_0x037d:
            r1 = move-exception
            if (r6 == 0) goto L_0x0388
            r6.close()     // Catch:{ all -> 0x0384 }
            goto L_0x0388
        L_0x0384:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0389 }
        L_0x0388:
            throw r1     // Catch:{ all -> 0x0389 }
        L_0x0389:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x038e }
            goto L_0x0392
        L_0x038e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0393 }
        L_0x0392:
            throw r1     // Catch:{ all -> 0x0393 }
        L_0x0393:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0398 }
            goto L_0x03a3
        L_0x0398:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03b6 }
            goto L_0x03a3
        L_0x039d:
            r1 = move-exception
            X.1hj r0 = r4.A16     // Catch:{ all -> 0x03b6 }
            r0.A08(r10)     // Catch:{ all -> 0x03b6 }
        L_0x03a3:
            throw r1     // Catch:{ all -> 0x03b6 }
        L_0x03a4:
            r11.close()
            goto L_0x03c5
        L_0x03a8:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x03ad }
            goto L_0x03b1
        L_0x03ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03b2 }
        L_0x03b1:
            throw r1     // Catch:{ all -> 0x03b2 }
        L_0x03b2:
            r1 = move-exception
            if (r23 == 0) goto L_0x03c0
            goto L_0x03b7
        L_0x03b6:
            r1 = move-exception
        L_0x03b7:
            r0 = r23
            android.database.Cursor r0 = r0.A00
            if (r0 == 0) goto L_0x03c0
            r0.close()
        L_0x03c0:
            throw r1
        L_0x03c1:
            r11.close()
        L_0x03c4:
            r6 = 1
        L_0x03c5:
            boolean r0 = r25.Boa()
            if (r0 != 0) goto L_0x03d2
            if (r39 != 0) goto L_0x03d2
            X.30T r0 = r4.A0l
            r0.A04(r2)
        L_0x03d2:
            r4.A0K(r5)
            X.2cU r0 = r4.A0b
            r0.A00()
            r25.BTW()
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/deletemsgs/batches "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " haveMessagesToDelete:"
            r4.append(r0)
            r4.append(r6)
            java.lang.String r1 = " timeSpent:"
            r0 = r24
            X.AnonymousClass33M.A03(r0, r1, r4)
            java.lang.String r0 = " currentMessages:"
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = " totalMessages:"
            X.C18260x0.A0y(r0, r4, r3)
            r0 = 1
            r0 = r0 ^ r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0o(X.2Ty, X.4Fp, boolean):boolean");
    }

    public boolean A0p(C95814uZ r5) {
        if (!this.A1x.A02(r5)) {
            return false;
        }
        C116985rC r1 = this.A02;
        if (!r1.A07() || !((C40492Ga) r1.A04()).A00.A0Y(C58422vE.A02, 5626)) {
            return false;
        }
        C56832sd r0 = this.A2B;
        C31001na r12 = new C31001na(C56832sd.A00(r5, r0), C56612sH.A06(this));
        A0c(r12, -1);
        return A0A(r12, -1).A00;
    }

    public boolean A0r(C95814uZ r9, Long l) {
        boolean z;
        C624134x r5;
        C56422rx r1 = this.A0G;
        UserJid A032 = AnonymousClass32Y.A03(r9);
        C623134n r3 = new C623134n(r1, (C48952fk) this.A2M.get(), A032);
        AnonymousClass3ZH A072 = this.A0F.A07(r9);
        if (!AnonymousClass75P.A00(this.A1r) || A072 == null || !A072.A0T()) {
            z = false;
            C56832sd r0 = this.A2B;
            long A062 = C56612sH.A06(this);
            int A012 = r3.A01();
            C31211nv r52 = new C31211nv(C56832sd.A00(r9, r0), 67, A062);
            r5 = r52;
            if (A032 != null) {
                r52.A00 = A012;
                r5 = r52;
            }
        } else {
            z = true;
            r5 = this.A2I.A01(r9, true);
        }
        r5.A0w = l;
        A0c(r5, -1);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("CoreMessageStore/added plaintext disabled message; jid=");
        A0o2.append(r9);
        C18260x0.A1E("; is3P=", A0o2, z);
        return A0A(r5, -1).A00;
    }

    public boolean A0s(C95814uZ r8, boolean z) {
        C69833Yo Axl;
        boolean z2;
        C85284Fq A042 = this.A18.A04();
        try {
            Axl = A042.Axl();
            long A002 = this.A1c.A00(r8);
            if (A002 > 1) {
                z2 = this.A0v.A08(Collections.singleton(Long.valueOf(A002)), z);
            } else {
                z2 = false;
            }
            Axl.A00();
            Axl.close();
            A042.close();
            return z2;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0t(X.C624134x r12) {
        /*
            r11 = this;
            X.2z0 r6 = r12.A1J
            X.4uZ r8 = X.AnonymousClass2z0.A01(r6)
            boolean r0 = r8 instanceof X.C95804uY
            r7 = 0
            if (r0 != 0) goto L_0x01c2
            boolean r0 = X.C627636p.A0c(r12)
            if (r0 != 0) goto L_0x01c2
            boolean r0 = X.C627636p.A0Z(r12)
            if (r0 != 0) goto L_0x01c2
            X.2rt r5 = r11.A1P
            boolean r0 = r5.A07(r8)
            if (r0 != 0) goto L_0x01c2
            X.2ss r1 = r11.A0X
            boolean r0 = r1.A0Q(r8)
            r9 = 0
            if (r0 != 0) goto L_0x0037
            X.31A r0 = X.C56982ss.A01(r1, r8)
            if (r0 == 0) goto L_0x0037
            long r1 = r0.A0N
            r3 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0037
            r9 = 1
        L_0x0037:
            r3 = 1
            if (r9 != 0) goto L_0x012a
            boolean r0 = r12.A1o()
            if (r0 != 0) goto L_0x012a
            boolean r0 = X.C627336j.A0K(r8)
            if (r0 == 0) goto L_0x0052
            X.2sj r1 = r11.A0p
            r0 = r8
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x01c2
        L_0x0052:
            long r1 = r5.A02(r8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x008b
            java.lang.Long r0 = r12.A0w
            boolean r10 = r11.A0r(r8, r0)
        L_0x0060:
            boolean r0 = r11.A0p(r8)
            r10 = r10 | r0
            X.3LP r9 = r11.A1s
            X.1VX r5 = r11.A1r
            X.3Ex r3 = r11.A0F
            X.2sM r4 = r11.A1i
            X.2sr r2 = r11.A09
            X.5rC r1 = r11.A05
            if (r8 == 0) goto L_0x008d
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x008d
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x008f
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x008f
            r1.A04()
            java.lang.String r0 = "isCtwaUser"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x008b:
            r10 = 0
            goto L_0x0060
        L_0x008d:
            r2 = 0
            goto L_0x0108
        L_0x008f:
            boolean r0 = X.C627636p.A0T(r2, r12)
            if (r0 != 0) goto L_0x008d
            boolean r0 = X.C57642ty.A00(r3, r4, r5, r9, r8)
            r6 = 0
            if (r0 == 0) goto L_0x008d
            X.2sd r2 = r11.A2B
            long r0 = X.C56612sH.A06(r11)
            X.2z0 r2 = X.C56832sd.A00(r8, r2)
            X.1nc r5 = new X.1nc
            r5.<init>(r2, r0)
            r4 = -1
            r11.A0c(r5, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/added contact info message; jid="
            X.C18260x0.A1R(r1, r0, r8)
            X.1a7 r1 = new X.1a7
            r1.<init>()
            java.lang.Integer r0 = X.C18290x4.A0d()
            r1.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A03 = r0
            X.3ZH r0 = r3.A07(r8)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x00d6
            r6 = 1
        L_0x00d6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A01 = r0
            X.4FV r0 = r11.A1t
            r0.BhD(r1)
            X.33p r3 = r11.A0L
            java.lang.String r2 = "fmx_card_view_pending_chats"
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r3)
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            java.util.Set r1 = r1.getStringSet(r2, r0)
            X.C626936e.A06(r1)
            java.lang.String r0 = r8.toString()
            r1.add(r0)
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r3)
            X.C18300x5.A15(r0, r2, r1)
            X.2KS r0 = r11.A0A(r5, r4)
            boolean r2 = r0.A00
        L_0x0108:
            r2 = r2 | r10
            boolean r0 = r11.A0q(r8)
            if (r0 == 0) goto L_0x0128
            X.2mu r1 = r11.A2I
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0128
            X.34x r1 = r1.A01(r8, r7)
            r0 = -1
            r11.A0c(r1, r0)
            X.2KS r0 = r11.A0A(r1, r0)
            boolean r0 = r0.A00
        L_0x0125:
            r7 = r2 | r0
            return r7
        L_0x0128:
            r0 = 0
            goto L_0x0125
        L_0x012a:
            long r1 = r5.A02(r8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01c2
            boolean r0 = r8 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x01c2
            X.C626936e.A06(r8)
            X.2No r2 = r11.A1G
            r0 = 18
            X.3Zw r6 = new X.3Zw
            r6.<init>(r11, r0, r12)
            X.2ss r0 = r2.A01
            X.31A r9 = r0.A0A(r8, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r9 == 0) goto L_0x01bc
            java.lang.String r0 = "disabling plaintext chat; jid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; current="
            r1.append(r0)
            int r0 = r9.A00
            X.C18260x0.A1G(r1, r0)
            int r1 = r9.A00
            r0 = 1
            if (r1 == r0) goto L_0x01c2
            r9.A00 = r0
            X.3dV r0 = r2.A02
            X.4Fq r5 = r0.A04()
            X.3Yo r4 = r5.Axl()     // Catch:{ all -> 0x01b2 }
            X.2sm r3 = r2.A00     // Catch:{ all -> 0x01a8 }
            monitor-enter(r9)     // Catch:{ all -> 0x01a8 }
            android.content.ContentValues r2 = X.C18280x3.A09()     // Catch:{ all -> 0x01a5 }
            java.lang.String r1 = "plaintext_disabled"
            int r0 = r9.A00     // Catch:{ all -> 0x01a5 }
            X.C18270x1.A0b(r2, r1, r0)     // Catch:{ all -> 0x01a5 }
            monitor-exit(r9)     // Catch:{ all -> 0x01a8 }
            int r2 = r3.A04(r2, r9)     // Catch:{ all -> 0x01a8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "disabled plaintext chat; jid="
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            r1.append(r8)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "; numRows="
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ all -> 0x01a8 }
            if (r2 <= 0) goto L_0x019b
            r6.run()     // Catch:{ all -> 0x01a8 }
        L_0x019b:
            r4.A00()     // Catch:{ all -> 0x01a8 }
            r4.close()     // Catch:{ all -> 0x01b2 }
            r5.close()
            return r7
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01a8 }
            throw r0     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01ad }
            goto L_0x01b1
        L_0x01ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01b2 }
        L_0x01b1:
            throw r1     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01b7 }
            throw r1
        L_0x01b7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01bc:
            java.lang.String r0 = "missing chat info; jid="
            X.C18260x0.A1S(r1, r0, r8)
        L_0x01c2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0t(X.34x):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r1 == 2) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r1 = r8.A0X;
        r2 = r3.A1J.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0u(X.C624134x r9, long r10) {
        /*
            r8 = this;
            X.2rw r7 = r8.A0h
            X.2z0 r6 = r9.A1J
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x00b9
            X.1fY r5 = X.AnonymousClass1fY.A00
        L_0x000a:
            byte r3 = r9.A1I
            r0 = 36
            if (r3 != r0) goto L_0x00a8
            long r1 = r9.A0J
            r0 = r9
            X.1mF r0 = (X.C30311mF) r0
            int r4 = r0.A00
        L_0x0017:
            X.2sd r3 = r7.A0A
            X.4uZ r0 = r6.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A04(r0)
            X.2z0 r0 = X.C56832sd.A00(r0, r3)
            X.1nr r3 = new X.1nr
            r3.<init>(r0, r1)
            r3.A00 = r4
            r3.A1J(r5)
            X.C624134x.A0L(r3, r10)
            X.1VX r2 = r8.A1r
            r1 = 4131(0x1023, float:5.789E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00a6
            X.2ss r1 = r8.A0X
            X.2z0 r0 = r3.A1J
            X.4uZ r2 = r0.A00
            X.31A r1 = X.C56982ss.A00(r1, r2)
            if (r1 == 0) goto L_0x00a6
            X.3Z2 r0 = r1.A0b
            int r0 = r0.expiration
            r6 = 1
            if (r0 > 0) goto L_0x0059
            if (r0 != 0) goto L_0x00a6
            int r0 = r9.A00
            if (r0 != r6) goto L_0x00a6
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x00a6
        L_0x0059:
            boolean r0 = r2 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x00a6
            X.2rR r0 = r8.A1m
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x00a6
            java.lang.Long r0 = r9.A0q
            if (r0 == 0) goto L_0x00a6
            long r4 = X.C18320x8.A04(r0)
            X.3Z2 r0 = r1.A0b
            long r1 = r0.ephemeralSettingTimestamp
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a6
            java.lang.Long r0 = r9.A0q
            long r4 = r0.longValue()
            long r1 = r9.A0K
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            int r1 = r9.A00
            r0 = 2
            if (r1 != r6) goto L_0x00a3
            r6 = 2
        L_0x0087:
            r3.A00 = r6
            r2 = -1
            r8.A0c(r3, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/added ephemeral setting message; jid="
            X.2z0 r0 = X.C624134x.A08(r3, r0, r1)
            X.4uZ r0 = r0.A00
            X.C18260x0.A0o(r0, r1)
            X.2KS r0 = r8.A0A(r3, r2)
            boolean r0 = r0.A00
            return r0
        L_0x00a3:
            if (r1 != r0) goto L_0x00a6
            goto L_0x0087
        L_0x00a6:
            r6 = 0
            goto L_0x0087
        L_0x00a8:
            r0 = 77
            long r1 = r9.A0K
            if (r3 != r0) goto L_0x00b5
            r0 = r9
            X.1ma r0 = (X.C30521ma) r0
            int r4 = r0.A00
            goto L_0x0017
        L_0x00b5:
            int r4 = r9.A05
            goto L_0x0017
        L_0x00b9:
            r5 = 0
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0u(X.34x, long):boolean");
    }

    public final boolean A0v(C624134x r7, C624134x r8) {
        this.A0y.A03(r8.A1J);
        A0l(Collections.singleton(r8), 0);
        AnonymousClass2z0 r5 = r7.A0f;
        if (r5 != null) {
            AnonymousClass33Y r4 = this.A23;
            AnonymousClass2YF r3 = this.A1u;
            C626936e.A06(r5);
            r4.A04(r3.A00(r5, r7.A1I, r7.A0K));
        }
        this.A23.A04(r7);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2, types: [int] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.io.File r7) {
        /*
            java.io.File[] r6 = r7.listFiles()
            r5 = 0
            if (r6 == 0) goto L_0x0030
            int r4 = r6.length
            r3 = 0
        L_0x0009:
            if (r5 >= r4) goto L_0x002f
            r2 = r6[r5]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".nomedia"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r3 = 1
        L_0x001a:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x001d:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0028
            boolean r3 = A03(r2)
            goto L_0x001a
        L_0x0028:
            r2.getPath()
            X.C627536m.A0O(r2)
            goto L_0x001a
        L_0x002f:
            r5 = r3
        L_0x0030:
            r7.getPath()
            if (r5 != 0) goto L_0x0038
            X.C627536m.A0O(r7)
        L_0x0038:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A03(java.io.File):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0254, code lost:
        if ((!r1) != false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0323, code lost:
        if (r0 != -1) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0401, code lost:
        if (r8 != false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x044e, code lost:
        if (r23 != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04f6, code lost:
        if (r20 != false) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x053a, code lost:
        if (r0 != false) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x056d, code lost:
        if (r6.A03(r12, r11, r13, r14, r0) != false) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x060c, code lost:
        if (r0 != false) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0638, code lost:
        if (r0 != false) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06fb, code lost:
        if (r0 != false) goto L_0x06fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (r7 != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01db, code lost:
        if (r0 != false) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2KS A09(X.C624134x r36, int r37) {
        /*
            r35 = this;
            boolean r0 = X.C107535bT.A07()
            r4 = r36
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4 instanceof X.C30801n8
            java.lang.String r5 = ""
            java.lang.String r3 = "­"
            if (r0 == 0) goto L_0x0795
            r2 = r4
            X.1n8 r2 = (X.C30801n8) r2
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r5)
            r2.A03 = r0
        L_0x0024:
            boolean r0 = r4.A1l()
            if (r0 == 0) goto L_0x0048
            int r0 = r4.A0i()
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = r4.A13()
            X.C626936e.A06(r0)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r4.A13()
            java.lang.String r0 = r0.replace(r3, r5)
            r4.A1Z(r0)
        L_0x0048:
            X.2z0 r0 = r4.A1J
            r27 = r0
            X.4uZ r3 = r0.A00
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            r2 = r35
            if (r0 == 0) goto L_0x078f
            X.2ss r5 = r2.A0X
            r1 = r3
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.31A r0 = X.C56982ss.A01(r5, r1)
            if (r0 != 0) goto L_0x0789
            r17 = 0
        L_0x0061:
            X.31A r0 = X.C56982ss.A01(r5, r1)
            if (r0 != 0) goto L_0x0783
            r18 = 0
        L_0x0069:
            boolean r0 = r3 instanceof X.C135166kE
            r19 = 1
            r8 = 0
            r28 = r37
            if (r0 != 0) goto L_0x077c
            X.C626936e.A06(r3)
            boolean r7 = r2.A0t(r4)
            X.8qC r0 = r2.A2J
            X.2sS r0 = X.C18320x8.A0I(r0)
            X.2m4 r0 = r0.A01
            X.1VX r1 = r0.A03
            r0 = 4165(0x1045, float:5.836E-42)
            X.2vE r9 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r9, r0)
            if (r0 == 0) goto L_0x0779
            boolean r0 = r4.A1k()
            if (r0 == 0) goto L_0x0779
            X.C626936e.A06(r3)
            X.2ss r0 = r2.A0X
            X.31A r10 = r0.A0A(r3, r8)
            if (r10 == 0) goto L_0x0779
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r10.A0s
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0779
            X.2o0 r1 = r2.A1c
            r0 = 146(0x92, float:2.05E-43)
            boolean r1 = r1.A02(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r10.A0s = r0
            if (r1 != 0) goto L_0x0779
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/insertNonE2eeBotInE2eeChatMessage; jid="
            X.C18260x0.A1P(r1, r0, r3)
            X.2sd r6 = r2.A2B
            long r0 = X.C56612sH.A06(r2)
            r5 = r19
            X.2z0 r6 = X.C56832sd.A01(r3, r6, r5)
            X.1nm r5 = new X.1nm
            r5.<init>(r6, r0)
            r0 = -1
            X.2KS r0 = r2.A0A(r5, r0)
            boolean r1 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r10.A0s = r0
        L_0x00df:
            r7 = r7 | r1
            X.2zV r6 = r2.A1n
            int r11 = r6.A01(r4)
            X.313 r10 = r2.A0g
            if (r11 == 0) goto L_0x0772
            X.2ss r0 = r10.A02
            X.31A r0 = r0.A0A(r3, r8)
            if (r0 == 0) goto L_0x074d
            int r1 = r0.A01
            r0 = r19
            if (r1 != r0) goto L_0x074d
        L_0x00f8:
            boolean r5 = r4 instanceof X.C30311mF
            if (r5 == 0) goto L_0x0103
            int r0 = r4.A05
            if (r0 != 0) goto L_0x0103
            r10.A07(r3, r8)
        L_0x0103:
            X.2ss r10 = r2.A0X
            X.2rx r13 = r6.A03
            X.2rR r11 = r6.A06
            r0 = r27
            boolean r8 = r0.A02
            if (r8 != 0) goto L_0x0121
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0121
            java.lang.Long r0 = r4.A0q
            if (r0 == 0) goto L_0x0121
            long r14 = X.C18320x8.A04(r0)
            long r0 = r4.A0K
            int r12 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0544
        L_0x0121:
            boolean r0 = X.C60992zV.A00(r13, r10, r11, r4)
            if (r0 != 0) goto L_0x0544
            boolean r0 = A01(r10, r4)
            if (r0 != 0) goto L_0x0544
        L_0x012d:
            r20 = 0
        L_0x012f:
            r23 = 0
        L_0x0131:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/add/"
            r1.append(r0)
            if (r8 == 0) goto L_0x053f
            java.lang.String r0 = "send"
        L_0x013f:
            r1.append(r0)
            java.lang.String r0 = "; key="
            r1.append(r0)
            r0 = r27
            r1.append(r0)
            java.lang.String r0 = "; media_wa_type="
            X.C624134x.A0T(r4, r0, r1)
            java.lang.String r0 = "; status="
            r1.append(r0)
            int r0 = r4.A0D
            X.C18260x0.A1F(r1, r0)
            X.2sr r0 = r2.A09
            boolean r0 = X.C627636p.A0T(r0, r4)
            if (r0 == 0) goto L_0x017b
            X.1iB r0 = r2.A1k
            java.util.List r0 = r0.A0C()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "CoreMessageStore/add/self-send"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 13
            r4.A1G(r0)
        L_0x017b:
            r0 = r28
            r2.A0c(r4, r0)
        L_0x0180:
            r0 = r28
            X.2KS r1 = r2.A0A(r4, r0)
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x018d
            r8 = 0
            if (r7 == 0) goto L_0x018e
        L_0x018d:
            r8 = 1
        L_0x018e:
            boolean r0 = r1.A01
            r34 = r0
            X.1VX r0 = r2.A1r
            r33 = r0
            r7 = 2714(0xa9a, float:3.803E-42)
            X.2vE r22 = X.C58422vE.A02
            r1 = r0
            r0 = r22
            boolean r0 = r1.A0Y(r0, r7)
            if (r0 == 0) goto L_0x04f6
            if (r20 == 0) goto L_0x01b1
            X.2ss r1 = r2.A0X
            X.3Ex r0 = r2.A0F
            boolean r0 = X.AnonymousClass352.A04(r0, r1, r4)
            if (r0 == 0) goto L_0x04f8
            r20 = 0
        L_0x01b1:
            r0 = r27
            boolean r0 = r0.A02
            r21 = r0
            if (r0 != 0) goto L_0x01de
            boolean r0 = r4 instanceof X.C30521ma
            if (r0 == 0) goto L_0x01de
            r1 = r33
            r0 = r22
            boolean r0 = r1.A0Y(r0, r7)
            if (r0 == 0) goto L_0x04eb
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/process ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13 = r8
            r10 = r4
            X.1ma r10 = (X.C30521ma) r10
            if (r3 != 0) goto L_0x0452
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/no chat"
        L_0x01d4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01d7:
            if (r13 != 0) goto L_0x01dd
            r0 = r8
            r8 = 0
            if (r0 == 0) goto L_0x01de
        L_0x01dd:
            r8 = 1
        L_0x01de:
            X.2zV r1 = r2.A1n
            X.2ss r5 = r2.A0X
            X.3Ex r6 = r2.A0F
            if (r21 != 0) goto L_0x044d
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x044d
            X.2rx r1 = r1.A03
            r0 = r3
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x044d
            boolean r0 = r4 instanceof X.C30311mF
            if (r0 != 0) goto L_0x044d
            boolean r0 = r4 instanceof X.C30521ma
            if (r0 != 0) goto L_0x044d
            X.31A r0 = X.C56982ss.A00(r5, r3)
            if (r0 == 0) goto L_0x044d
            boolean r0 = X.AnonymousClass352.A04(r6, r5, r4)
            if (r0 == 0) goto L_0x044d
        L_0x0209:
            r0 = 1
        L_0x020a:
            if (r20 != 0) goto L_0x0224
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/process ESR if needed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r20 = r8
            if (r3 != 0) goto L_0x02b7
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no chat info"
        L_0x0219:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x021c:
            if (r20 != 0) goto L_0x0222
            if (r8 != 0) goto L_0x0222
            r19 = 0
        L_0x0222:
            r8 = r19
        L_0x0224:
            r5 = 1302(0x516, float:1.824E-42)
            r1 = r33
            r0 = r22
            boolean r0 = r1.A0Y(r0, r5)
            if (r0 == 0) goto L_0x028b
            java.lang.String r1 = "directory"
            java.lang.String r0 = r4.A12
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028b
            if (r3 == 0) goto L_0x028b
            X.2rt r0 = r2.A1P
            boolean r0 = r0.A07(r3)
            if (r0 == 0) goto L_0x0256
            java.util.Map r4 = X.AnonymousClass2AZ.A00
            java.lang.Object r0 = r4.get(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x02a7
            boolean r1 = r0.booleanValue()
        L_0x0252:
            r0 = r1 ^ 1
            if (r0 == 0) goto L_0x028b
        L_0x0256:
            X.2sr r1 = r2.A09
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)
            if (r0 == 0) goto L_0x028b
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass32Y.A03(r3)
            if (r9 == 0) goto L_0x028b
            X.2sd r0 = r2.A2B
            if (r21 == 0) goto L_0x0293
            com.whatsapp.jid.PhoneUserJid r7 = X.C56972sr.A04(r1)
            long r4 = X.C56612sH.A06(r2)
            X.35J r0 = r0.A02
            r6 = 1
            X.2z0 r0 = r0.A04(r9, r6)
            X.1nb r1 = new X.1nb
            r1.<init>(r0, r4)
            r1.A1J(r7)
        L_0x027f:
            r2.A08(r1)
            java.util.Map r1 = X.AnonymousClass2AZ.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.put(r3, r0)
        L_0x028b:
            X.2KS r1 = new X.2KS
            r0 = r34
            r1.<init>(r8, r0)
            return r1
        L_0x0293:
            long r4 = X.C56612sH.A06(r2)
            X.35J r0 = r0.A02
            r6 = 1
            X.2z0 r0 = r0.A04(r9, r6)
            X.1nb r1 = new X.1nb
            r1.<init>(r0, r4)
            r1.A1J(r9)
            goto L_0x027f
        L_0x02a7:
            X.2o0 r1 = r2.A1c
            r0 = 76
            boolean r1 = r1.A02(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.put(r3, r0)
            goto L_0x0252
        L_0x02b7:
            r6 = 2714(0xa9a, float:3.803E-42)
            r1 = r33
            r0 = r22
            boolean r0 = r1.A0Y(r0, r6)
            if (r0 != 0) goto L_0x02d0
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r1.A03(r3, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/esr abprop off"
            goto L_0x0219
        L_0x02d0:
            X.313 r7 = r2.A0g
            byte[] r10 = X.AnonymousClass313.A0D
            byte r9 = r4.A1I
            int r6 = r10.length
            r1 = 0
        L_0x02d8:
            if (r1 >= r6) goto L_0x0440
            byte r0 = r10[r1]
            if (r0 != r9) goto L_0x02f1
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass32Y.A03(r3)
            if (r10 != 0) goto L_0x02f4
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = X.AnonymousClass0x7.A0g()
            r1.A03(r3, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no user info"
            goto L_0x0219
        L_0x02f1:
            int r1 = r1 + 1
            goto L_0x02d8
        L_0x02f4:
            X.31A r0 = X.C56982ss.A01(r5, r10)
            if (r0 == 0) goto L_0x0433
            X.3Z2 r11 = r0.A0b
            if (r11 == 0) goto L_0x0433
            X.2sH r12 = r2.A0K
            java.lang.String r13 = r3.getRawString()
            int r9 = r7.A01(r13)
            long[] r6 = X.AnonymousClass2B3.A00
            int r0 = r6.length
            if (r9 >= r0) goto L_0x0426
            X.2GG r1 = r7.A09
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00
            java.lang.Object r0 = r0.get(r13)
            X.2yh r0 = (X.C60522yh) r0
            if (r0 == 0) goto L_0x034d
            long r0 = r0.A01
            r15 = -1
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x034d
        L_0x0325:
            long r15 = java.lang.System.currentTimeMillis()
            r13 = r6[r9]
            long r0 = r0 + r13
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0426
            java.lang.Long r0 = r4.A0q
            if (r0 == 0) goto L_0x0357
            long r13 = r0.longValue()
            long r0 = r11.ephemeralSettingTimestamp
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0357
            if (r23 != 0) goto L_0x0357
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = X.C18290x4.A0b()
            r1.A03(r3, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/older EST"
            goto L_0x0219
        L_0x034d:
            X.2yh r0 = r7.A03(r13)
            r7.A06(r0, r13)
            long r0 = r0.A01
            goto L_0x0325
        L_0x0357:
            X.31A r0 = X.C56982ss.A01(r5, r10)
            if (r0 != 0) goto L_0x0422
            r14 = 0
        L_0x035e:
            X.2WE r9 = r2.A1o
            com.whatsapp.jid.DeviceJid r0 = r4.A1R
            r16 = r0
            int r0 = r11.expiration
            r15 = r0
            long r5 = r11.ephemeralSettingTimestamp
            long r0 = r12.A0H()
            int r13 = r11.disappearingMessagesInitiator
            if (r14 == 0) goto L_0x041c
            int r12 = r14.A00
            java.lang.Boolean r11 = r14.A01
        L_0x0375:
            X.35J r14 = r9.A00
            r9 = r19
            X.2z0 r14 = r14.A04(r10, r9)
            X.1ma r9 = new X.1ma
            r9.<init>(r14, r0)
            r9.A1J(r10)
            r0 = r16
            r9.A02 = r0
            X.C624134x.A0L(r9, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r9.A1v(r0)
            r9.A00 = r13
            r9.A04 = r12
            if (r11 == 0) goto L_0x03a3
            boolean r0 = r11.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0o = r0
        L_0x03a3:
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/added ephemeral sync response message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r10 = r9.A00
            long r0 = r9.A01
            int r6 = r9.A00
            X.3Z2 r5 = new X.3Z2
            r5.<init>(r10, r0, r6)
            int r1 = r9.A04
            java.lang.Boolean r0 = r9.A0o
            X.2kh r10 = new X.2kh
            r10.<init>(r0, r1)
            java.lang.Long r0 = r4.A0q
            long r0 = X.AnonymousClass0x2.A0D(r0)
            int r12 = r4.A05
            int r11 = r4.A00
            X.3Z2 r6 = new X.3Z2
            r6.<init>(r12, r0, r11)
            int r11 = r4.A04
            java.lang.Boolean r0 = r4.A0o
            X.2kh r1 = new X.2kh
            r1.<init>(r0, r11)
            X.7kW r0 = r2.A1p
            r31 = 0
            r23 = r0
            r24 = r3
            r25 = r18
            r26 = r1
            r27 = r10
            r28 = r17
            r29 = r6
            r30 = r5
            r32 = r19
            r23.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/send ESR "
            X.C18260x0.A1R(r1, r0, r5)
            r0 = -1
            X.2KS r0 = r2.A0A(r9, r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0403
            r20 = 0
            if (r8 == 0) goto L_0x0405
        L_0x0403:
            r20 = 1
        L_0x0405:
            java.lang.String r0 = r3.getRawString()
            int r5 = r7.A01(r0)
            java.lang.String r6 = r3.getRawString()
            long r0 = java.lang.System.currentTimeMillis()
            int r5 = r5 + 1
            r7.A05(r5, r6, r0)
            goto L_0x021c
        L_0x041c:
            int r12 = r4.A04
            java.lang.Boolean r11 = r4.A0o
            goto L_0x0375
        L_0x0422:
            X.2kh r14 = r0.A0a
            goto L_0x035e
        L_0x0426:
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = X.C18290x4.A0d()
            r1.A03(r3, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/backoff retry implemented"
            goto L_0x0219
        L_0x0433:
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = X.C18290x4.A0c()
            r1.A03(r3, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no ephemeral info"
            goto L_0x0219
        L_0x0440:
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A03(r3, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/invalid message type"
            goto L_0x0219
        L_0x044d:
            r0 = 0
            if (r23 == 0) goto L_0x020a
            goto L_0x0209
        L_0x0452:
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A03(r3)
            if (r5 != 0) goto L_0x0469
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/not a user"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.7kW r1 = r2.A1p
            r0 = 7
        L_0x0460:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r3, r0)
            goto L_0x01d7
        L_0x0469:
            X.2ss r1 = r2.A0X
            X.31A r0 = X.C56982ss.A01(r1, r5)
            if (r0 != 0) goto L_0x048b
            r9 = 0
        L_0x0472:
            X.31A r0 = X.C56982ss.A01(r1, r5)
            if (r0 != 0) goto L_0x0488
            r7 = 0
        L_0x0479:
            if (r9 != 0) goto L_0x048e
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = X.C18290x4.A0c()
            r1.A02(r3, r0)
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/no ephemeral info"
            goto L_0x01d4
        L_0x0488:
            X.2kh r7 = r0.A0a
            goto L_0x0479
        L_0x048b:
            X.3Z2 r9 = r0.A0b
            goto L_0x0472
        L_0x048e:
            long r5 = r9.ephemeralSettingTimestamp
            long r0 = r10.A01
            r12 = 1
            int r11 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r5 = X.AnonymousClass0x7.A1P(r11)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/newer EST "
            X.C18260x0.A1E(r0, r1, r5)
            if (r5 == 0) goto L_0x04e6
            int r1 = r9.expiration
            int r0 = r10.A00
            if (r0 == r1) goto L_0x04c3
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/add ephemeral setting change system msg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r10.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C18320x8.A04(r0)
            boolean r0 = r2.A0u(r4, r0)
            if (r0 != 0) goto L_0x04c2
            if (r8 != 0) goto L_0x04c2
            r12 = 0
        L_0x04c2:
            r13 = r12
        L_0x04c3:
            X.2rw r0 = r2.A0h
            X.31A r0 = r0.A02(r10)
            if (r0 == 0) goto L_0x01d7
            X.3Z2 r5 = r0.A0b
            X.2kh r1 = r0.A0a
            X.7kW r0 = r2.A1p
            r30 = 0
            r24 = r0
            r25 = r3
            r26 = r7
            r27 = r1
            r28 = r9
            r29 = r5
            r31 = r19
            r24.A01(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x01d7
        L_0x04e6:
            X.7kW r1 = r2.A1p
            r0 = 4
            goto L_0x0460
        L_0x04eb:
            X.7kW r1 = r2.A1p
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r1.A02(r3, r0)
            goto L_0x01de
        L_0x04f6:
            if (r20 == 0) goto L_0x01b1
        L_0x04f8:
            X.2WE r1 = r2.A1o
            X.2rR r0 = r2.A1m
            int r10 = X.C56112rR.A00(r0)
            long r5 = X.C56612sH.A06(r2)
            r9 = 2
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.35J r1 = r1.A00
            r0 = r19
            X.2z0 r0 = r1.A04(r3, r0)
            X.1mF r1 = new X.1mF
            r1.<init>(r0, r5)
            r1.A1J(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.A1v(r0)
            if (r10 <= 0) goto L_0x052a
            r1.A04 = r9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r1.A0o = r0
        L_0x052a:
            java.lang.String r0 = "CoreMessageStore/addOrUpdateMessage/added backwards compat dmm ephemeral setting message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            X.2KS r0 = r2.A0A(r1, r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x053c
            r0 = r8
            r8 = 0
            if (r0 == 0) goto L_0x01b1
        L_0x053c:
            r8 = 1
            goto L_0x01b1
        L_0x053f:
            java.lang.String r0 = "recv"
            goto L_0x013f
        L_0x0544:
            X.C626936e.A06(r3)
            r12 = r3
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            boolean r0 = X.C60992zV.A00(r13, r10, r11, r4)
            if (r0 != 0) goto L_0x056f
            long r0 = r4.A0K
            int r14 = r4.A05
            java.lang.Long r13 = r4.A0q
            X.31A r11 = X.C56982ss.A01(r10, r12)
            if (r11 != 0) goto L_0x05be
            r11 = 0
        L_0x055d:
            r20 = r6
            r21 = r12
            r22 = r11
            r23 = r13
            r24 = r14
            r25 = r0
            boolean r0 = r20.A03(r21, r22, r23, r24, r25)
            if (r0 == 0) goto L_0x012d
        L_0x056f:
            X.2rx r13 = r2.A0G
            X.2rR r11 = r2.A1m
            boolean r0 = X.C60992zV.A00(r13, r10, r11, r4)
            if (r0 != 0) goto L_0x05c1
            boolean r0 = A01(r10, r4)
            if (r0 != 0) goto L_0x05c1
            boolean r0 = A02(r10, r4)
            if (r0 != 0) goto L_0x05c1
            boolean r0 = r4 instanceof X.C31081ni
            if (r0 == 0) goto L_0x062a
            X.2rw r0 = r2.A0h
            X.2sd r6 = r0.A0A
            X.C626936e.A06(r3)
            X.C626936e.A06(r3)
            long r0 = r4.A0K
            r5 = r19
            X.2z0 r5 = X.C56832sd.A01(r3, r6, r5)
            X.1ni r6 = new X.1ni
            r6.<init>(r5, r0)
            r6.A1J(r3)
            r5 = -1
            r2.A0c(r6, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/added ephemeral keep in chat system message; jid="
            X.2z0 r0 = X.C624134x.A08(r6, r0, r1)
            X.4uZ r0 = r0.A00
            X.C18260x0.A0o(r0, r1)
            X.2KS r0 = r2.A0A(r6, r5)
            boolean r7 = r0.A00
            goto L_0x012d
        L_0x05be:
            X.3Z2 r11 = r11.A0b
            goto L_0x055d
        L_0x05c1:
            boolean r20 = X.C60992zV.A00(r13, r10, r11, r4)
            if (r8 != 0) goto L_0x0616
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0616
            boolean r0 = r13.A03(r12)
            if (r0 != 0) goto L_0x0616
            if (r5 != 0) goto L_0x0616
            boolean r0 = r4 instanceof X.C30521ma
            if (r0 != 0) goto L_0x0616
            X.31A r0 = X.C56982ss.A00(r10, r3)
            if (r0 != 0) goto L_0x0616
            int r0 = r4.A05
            if (r0 <= 0) goto L_0x0616
            boolean r0 = r11.A07()
            if (r0 != 0) goto L_0x0616
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x0616
        L_0x05ec:
            X.1VX r1 = r2.A1r
            r0 = 2714(0xa9a, float:3.803E-42)
            boolean r0 = r1.A0Y(r9, r0)
            if (r0 == 0) goto L_0x069c
            r0 = 4131(0x1023, float:5.789E-42)
            boolean r0 = r1.A0Y(r9, r0)
            if (r0 == 0) goto L_0x069c
            java.lang.Long r0 = r4.A0q
            long r0 = X.C18320x8.A04(r0)
            boolean r0 = r2.A0u(r4, r0)
            if (r0 != 0) goto L_0x060e
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x060f
        L_0x060e:
            r7 = 1
        L_0x060f:
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/ephemeral setting added and send ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0698
        L_0x0616:
            boolean r0 = A02(r10, r4)
            if (r0 == 0) goto L_0x069c
            int r1 = X.C56112rR.A00(r11)
            int r0 = r4.A05
            if (r1 <= r0) goto L_0x069c
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x069c
            goto L_0x05ec
        L_0x062a:
            java.lang.Long r0 = r4.A0q
            long r0 = X.C18320x8.A04(r0)
            boolean r0 = r2.A0u(r4, r0)
            if (r0 != 0) goto L_0x063a
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x063b
        L_0x063a:
            r7 = 1
        L_0x063b:
            X.31A r0 = X.C56982ss.A01(r10, r12)
            if (r0 == 0) goto L_0x012d
            X.3Z2 r6 = r0.A0b
            r1 = 0
            if (r6 == 0) goto L_0x012d
            java.lang.Long r0 = r4.A0q
            if (r0 == 0) goto L_0x012d
            if (r8 != 0) goto L_0x012d
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x012d
            boolean r0 = r13.A03(r12)
            if (r0 != 0) goto L_0x012d
            if (r5 != 0) goto L_0x012d
            boolean r0 = r4 instanceof X.C30521ma
            if (r0 != 0) goto L_0x012d
            X.31A r0 = r10.A0A(r3, r1)
            if (r0 == 0) goto L_0x012d
            int r0 = r4.A05
            if (r0 <= 0) goto L_0x012d
            boolean r0 = r11.A07()
            if (r0 != 0) goto L_0x012d
            int r1 = r6.expiration
            int r0 = r4.A05
            if (r1 != r0) goto L_0x012d
            long r0 = r6.ephemeralSettingTimestamp
            java.lang.Long r5 = r4.A0q
            long r10 = r5.longValue()
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x012d
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x012d
            int r0 = r6.disappearingMessagesInitiator
            if (r0 != 0) goto L_0x012d
            X.1VX r1 = r2.A1r
            r0 = 4131(0x1023, float:5.789E-42)
            boolean r0 = r1.A0Y(r9, r0)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/initiator different so send ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r20 = 0
        L_0x0698:
            r23 = 1
            goto L_0x0131
        L_0x069c:
            X.2rw r15 = r2.A0h
            X.2ss r14 = r15.A03
            boolean r0 = A01(r14, r4)
            if (r0 != 0) goto L_0x0700
            boolean r0 = A02(r14, r4)
            if (r0 != 0) goto L_0x0700
            long r5 = r4.A0K
            X.2rR r1 = r15.A06
            int r13 = X.C56112rR.A00(r1)
            X.2sr r0 = r15.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r0)
            long r0 = r1.A02(r0)
            X.2sd r14 = r15.A0A
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass32Y.A04(r3)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r12 = 1
        L_0x06c7:
            r9 = r19
            X.2z0 r10 = X.C56832sd.A01(r10, r14, r9)
            X.1nq r9 = new X.1nq
            r9.<init>(r10, r5)
            r9.A00 = r13
            X.C624134x.A0L(r9, r0)
            r9.A00 = r12
            r0 = 2
            r9.A04 = r0
            if (r11 == 0) goto L_0x06e8
            boolean r0 = r11.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0o = r0
        L_0x06e8:
            r1 = -1
            r2.A0c(r9, r1)
            java.lang.String r0 = "CoreMessageStore/added Disappearing Mode System Message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2KS r0 = r2.A0A(r9, r1)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x06fd
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x012f
        L_0x06fd:
            r7 = 1
            goto L_0x012f
        L_0x0700:
            long r5 = r4.A0K
            int r13 = r4.A05
            int r0 = r4.A00
            r16 = r0
            java.lang.Long r0 = r4.A0q
            long r0 = X.C18320x8.A04(r0)
            if (r8 != 0) goto L_0x074a
            r12 = 1
            r11 = r16
            if (r11 != r12) goto L_0x0716
            r12 = 2
        L_0x0716:
            X.1VX r10 = r15.A09
            r11 = r10
            r10 = 2714(0xa9a, float:3.803E-42)
            boolean r9 = r11.A0Y(r9, r10)
            if (r9 == 0) goto L_0x0740
            boolean r9 = A02(r14, r4)
            if (r9 == 0) goto L_0x0740
            X.2rR r10 = r15.A06
            int r9 = X.C56112rR.A00(r10)
            if (r9 == 0) goto L_0x0740
            if (r9 >= r13) goto L_0x0740
            if (r16 == 0) goto L_0x0740
            int r13 = X.C56112rR.A00(r10)
            long r0 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r9
            long r0 = r0 * r9
            r12 = 1
        L_0x0740:
            X.2sd r14 = r15.A0A
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass32Y.A04(r3)
            java.lang.Boolean r11 = r4.A0o
            goto L_0x06c7
        L_0x074a:
            r12 = r16
            goto L_0x0716
        L_0x074d:
            X.2rw r0 = r2.A0h
            X.C626936e.A06(r3)
            X.2sd r7 = r0.A0A
            long r0 = r4.A0K
            r5 = r19
            X.2z0 r12 = X.C56832sd.A01(r3, r7, r5)
            r7 = 130(0x82, float:1.82E-43)
            X.1mI r5 = new X.1mI
            r5.<init>(r12, r7, r0)
            r5.A1J(r3)
            r0 = -1
            X.2KS r0 = r2.A0A(r5, r0)
            boolean r7 = r0.A00
            r10.A07(r3, r11)
            goto L_0x00f8
        L_0x0772:
            long r0 = r4.A0K
            r10.A04(r4, r0)
            goto L_0x00f8
        L_0x0779:
            r1 = 0
            goto L_0x00df
        L_0x077c:
            r7 = 0
            r20 = 0
            r23 = 0
            goto L_0x0180
        L_0x0783:
            X.2kh r0 = r0.A0a
            r18 = r0
            goto L_0x0069
        L_0x0789:
            X.3Z2 r0 = r0.A0b
            r17 = r0
            goto L_0x0061
        L_0x078f:
            r17 = 0
            r18 = r17
            goto L_0x0069
        L_0x0795:
            boolean r0 = r4 instanceof X.C30471mV
            if (r0 == 0) goto L_0x07b0
            r2 = r4
            X.1mV r2 = (X.C30471mV) r2
            java.lang.String r1 = r2.A1w()
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r5)
            r2.A02 = r0
            goto L_0x0024
        L_0x07b0:
            boolean r0 = r4 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0024
            r2 = r4
            X.1mW r2 = (X.C30481mW) r2
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r5)
            r2.A06 = r0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A09(X.34x, int):X.2KS");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if ((r3.A0K + X.C18290x4.A0A(r8)) >= r10) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r14.A1W != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2KS A0A(X.C624134x r36, int r37) {
        /*
            r35 = this;
            long r12 = android.os.SystemClock.uptimeMillis()
            r5 = 1
            r4 = r35
            r14 = r36
            X.2xE r3 = r4.A0D(r14, r5)
            X.2z0 r2 = r14.A1J
            boolean r10 = r2.A02
            if (r10 == 0) goto L_0x0018
            boolean r0 = r14.A1W
            r11 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r11 = 1
        L_0x0019:
            boolean r6 = r3.A04
            r7 = r37
            if (r6 == 0) goto L_0x009d
            X.2ga r9 = r4.A0d
            long r0 = X.C18310x6.A0A(r12)
            java.lang.String r8 = "CoreMessageStore/writeMessageToDatabase"
            r9.A02(r8, r0)
            if (r11 != 0) goto L_0x0060
            long r28 = android.os.SystemClock.uptimeMillis()
            long r0 = r14.A1b
            long r28 = r28 - r0
            long r26 = android.os.SystemClock.uptimeMillis()
            X.36E r13 = r4.A0A
            r17 = 0
            int r11 = r14.A0B
            r15 = 0
            long r8 = r14.A1Q
            long r24 = r26 - r8
            long r26 = r26 - r0
            r16 = 2
            r19 = r17
            r20 = r17
            r21 = r17
            r22 = r17
            r30 = r17
            r31 = r17
            r32 = r17
            r33 = r17
            r34 = r17
            r18 = r17
            r23 = r11
            r13.A0O(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31, r32, r33, r34)
        L_0x0060:
            r8 = 4
            if (r10 == 0) goto L_0x0070
            int r0 = r14.A0D
            int r0 = X.AnonymousClass358.A00(r0, r8)
            if (r0 >= 0) goto L_0x0070
            java.util.Map r0 = r4.A2O
            r0.put(r2, r14)
        L_0x0070:
            long r0 = r14.A1O
            r4.A0J(r0)
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0086
            X.2hU r0 = r4.A0q
            android.os.Handler r0 = r0.A00
            X.C18300x5.A16(r0, r14, r8, r7)
            X.2KS r0 = new X.2KS
            r0.<init>(r5, r6)
            return r0
        L_0x0086:
            r2 = 0
            X.2hU r0 = r4.A0q
            android.os.Handler r1 = r0.A00
            r0 = 5
            X.C18300x5.A16(r1, r14, r0, r7)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0097
            r0 = 6
            X.C18300x5.A16(r1, r14, r0, r7)
        L_0x0097:
            X.2KS r0 = new X.2KS
            r0.<init>(r2, r6)
            return r0
        L_0x009d:
            r6 = 0
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0194
            if (r11 == 0) goto L_0x0184
            X.34x r3 = X.C55832qz.A00(r4, r2)
            if (r3 == 0) goto L_0x0184
            long r10 = X.C56612sH.A06(r4)
            int r8 = r14.A05
            if (r8 <= 0) goto L_0x00be
            long r0 = r3.A0K
            long r8 = X.C18290x4.A0A(r8)
            long r0 = r0 + r8
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r0 = 1
            if (r8 < 0) goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            r8 = 11
            r9 = 0
            if (r0 == 0) goto L_0x00df
            boolean r10 = r4.A0v(r14, r3)
        L_0x00c8:
            if (r10 == 0) goto L_0x0184
            X.2hU r0 = r4.A0q
            android.os.Handler r1 = r0.A02
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r9, r3)
            android.os.Message r0 = android.os.Message.obtain(r1, r8, r0)
        L_0x00d6:
            r0.sendToTarget()
        L_0x00d9:
            X.2KS r0 = new X.2KS
            r0.<init>(r6, r6)
            return r0
        L_0x00df:
            byte r1 = r3.A1I
            r0 = 31
            if (r1 != r0) goto L_0x00eb
            boolean r10 = r4.A0w(r14, r3)
            r9 = r14
            goto L_0x00c8
        L_0x00eb:
            r10 = 0
            if (r1 != r8) goto L_0x0184
            boolean r0 = X.AnonymousClass2z0.A0B(r3)
            if (r0 == 0) goto L_0x0126
            long r0 = r3.A0K
            r14.A0K = r0
            r4.A0d(r3, r5, r6)
            long r1 = android.os.SystemClock.uptimeMillis()
            X.2xE r0 = r4.A0D(r14, r5)
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0121
            X.2ga r5 = r4.A0d
            long r0 = X.C18310x6.A0A(r1)
            java.lang.String r2 = "CoreMessageStore/writeMessageToDatabase"
            r5.A02(r2, r0)
            X.2hU r0 = r4.A0q
            android.os.Handler r2 = r0.A00
            r1 = 38
            X.3ca r0 = new X.3ca
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r4, (int) r7, (int) r1)
            r2.post(r0)
            r10 = 1
        L_0x0121:
            r9 = r14
        L_0x0122:
            X.C57502tk.A00(r14)
            goto L_0x00c8
        L_0x0126:
            r1 = 32
            int r0 = r3.A0A
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 == 0) goto L_0x0159
            r1 = 8
            int r0 = r14.A0A
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 != 0) goto L_0x017f
            boolean r0 = r14 instanceof X.AnonymousClass4FG
            if (r0 != 0) goto L_0x017f
            java.lang.String r0 = "CoreMessageStore/addmessage/crypto-retry-reject/mismatch declared hsm"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2YF r9 = r4.A1u
            long r0 = r14.A0K
            r7 = 19
            X.34x r0 = r9.A00(r2, r7, r0)
            r0.A1H(r5)
            boolean r10 = r4.A0w(r0, r3)
            goto L_0x0121
        L_0x0159:
            byte r1 = r14.A1I
            r0 = 36
            if (r0 != r1) goto L_0x017f
            X.4uZ r0 = r2.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x017a
            r2 = r14
            X.1mF r2 = (X.C30311mF) r2
            X.2z0 r5 = r2.A1J
            long r0 = r2.A0K
            int r2 = r2.A00
            X.1nz r9 = new X.1nz
            r9.<init>(r5, r0)
            r9.A00 = r2
            boolean r10 = r4.A0w(r9, r3)
            goto L_0x0122
        L_0x017a:
            boolean r10 = r4.A0v(r14, r3)
            goto L_0x0122
        L_0x017f:
            boolean r10 = r4.A0w(r14, r3)
            goto L_0x0121
        L_0x0184:
            long r0 = r14.A1O
            r4.A0J(r0)
            X.2hU r0 = r4.A0q
            android.os.Handler r1 = r0.A00
            r0 = 3
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r14)
            goto L_0x00d6
        L_0x0194:
            if (r11 == 0) goto L_0x00d9
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x01d2
            X.2xE r0 = X.C59632xE.A05
            if (r3 == r0) goto L_0x0202
            X.36E r1 = r4.A0A
            r0 = 9
            r1.A0K(r14, r0)
            X.1VX r3 = r4.A1r
            r1 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00d9
            X.33Y r5 = r4.A23
            r3 = 552(0x228, float:7.74E-43)
        L_0x01b5:
            int r1 = r14.A0D
            r0 = 6
            if (r1 != r0) goto L_0x01ea
            java.lang.StringBuilder r1 = X.C18280x3.A0e()
            java.lang.String r0 = "/sendNack ignoring key="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " status="
            r1.append(r0)
            int r0 = r14.A0D
            X.C18260x0.A1G(r1, r0)
            goto L_0x00d9
        L_0x01d2:
            X.1VX r3 = r4.A1r
            r1 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0202
            X.36E r1 = r4.A0A
            r0 = 11
            r1.A0K(r14, r0)
            X.33Y r5 = r4.A23
            r3 = 419(0x1a3, float:5.87E-43)
            goto L_0x01b5
        L_0x01ea:
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.39T r4 = X.AnonymousClass33Y.A01(r14, r1, r0)
            long r2 = r14.A1O
            X.1VX r1 = r5.A06
            X.2qk r0 = r5.A01
            android.os.Message r0 = X.AnonymousClass36N.A02(r0, r1, r4)
            r5.A03(r0, r2)
            goto L_0x00d9
        L_0x0202:
            X.33Y r0 = r4.A23
            r0.A04(r14)
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0A(X.34x, int):X.2KS");
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x006e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[Catch:{ all -> 0x0107, all -> 0x0133 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C623534r A0C(X.C623534r r20) {
        /*
            r19 = this;
            X.C626936e.A00()
            r6 = r19
            X.2sH r13 = r6.A0K
            X.34r r5 = new X.34r
            r7 = r20
            r5.<init>((X.C56612sH) r13, (X.C623534r) r7)
            r0 = -9223372036854775808
            monitor-enter(r5)
            r5.A03 = r0     // Catch:{ all -> 0x0149 }
            monitor-exit(r5)
            r5.A09(r0)
            r1 = 0
            r5.A08(r1)
            monitor-enter(r5)
            r5.A01 = r1     // Catch:{ all -> 0x0149 }
            monitor-exit(r5)
            X.3dV r0 = r6.A18
            X.4GK r18 = r0.get()
            com.whatsapp.jid.UserJid r9 = r7.A0A     // Catch:{ all -> 0x013f }
            X.1fY r12 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x013f }
            boolean r0 = X.AnonymousClass000.A1Y(r9, r12)     // Catch:{ all -> 0x013f }
            r11 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0049
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x013f }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x013f }
            java.lang.String r3 = X.AnonymousClass2C9.A04     // Catch:{ all -> 0x013f }
            java.lang.String[] r2 = new java.lang.String[r10]     // Catch:{ all -> 0x013f }
            X.2sm r0 = r6.A0W     // Catch:{ all -> 0x013f }
            X.6kE r8 = X.C135166kE.A00     // Catch:{ all -> 0x013f }
            X.C56922sm.A02(r0, r8, r2, r1)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "SELECT_STATUSES_FOR_ME_SQL"
            android.database.Cursor r9 = r4.A0E(r3, r0, r2)     // Catch:{ all -> 0x013f }
            goto L_0x006e
        L_0x0049:
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x013f }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x013f }
            java.lang.String r3 = X.AnonymousClass2C9.A03     // Catch:{ all -> 0x013f }
            java.lang.String[] r2 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x013f }
            X.2sm r0 = r6.A0W     // Catch:{ all -> 0x013f }
            X.6kE r8 = X.C135166kE.A00     // Catch:{ all -> 0x013f }
            X.C56922sm.A02(r0, r8, r2, r1)     // Catch:{ all -> 0x013f }
            X.34p r0 = r6.A0s     // Catch:{ all -> 0x013f }
            long r0 = r0.A05(r9)     // Catch:{ all -> 0x013f }
            X.AnonymousClass0x2.A1S(r2, r10, r0)     // Catch:{ all -> 0x013f }
            X.C18280x3.A0w(r9, r2, r11)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "SELECT_STATUSES_FOR_JID_SQL"
            android.database.Cursor r9 = r4.A0E(r3, r0, r2)     // Catch:{ all -> 0x013f }
        L_0x006e:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x010d
            X.2qz r0 = r6.A2D     // Catch:{ all -> 0x0133 }
            X.34x r4 = r0.A04(r9, r8)     // Catch:{ all -> 0x0133 }
            if (r4 == 0) goto L_0x006e
            X.8qC r0 = r6.A2N     // Catch:{ all -> 0x0133 }
            r0.get()     // Catch:{ all -> 0x0133 }
            boolean r0 = X.C626635z.A09(r4)     // Catch:{ all -> 0x0133 }
            if (r0 != 0) goto L_0x006e
            boolean r0 = X.C627636p.A0m(r4)     // Catch:{ all -> 0x0133 }
            if (r0 != 0) goto L_0x006e
            long r16 = X.C56612sH.A01(r13)     // Catch:{ all -> 0x0133 }
            X.2z0 r0 = r4.A1J     // Catch:{ all -> 0x0133 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x00a0
            long r0 = r4.A0J     // Catch:{ all -> 0x0133 }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            long r0 = r4.A0K     // Catch:{ all -> 0x0133 }
        L_0x00a2:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x006e
            long r0 = r4.A1M     // Catch:{ all -> 0x0133 }
            monitor-enter(r5)     // Catch:{ all -> 0x0133 }
            r5.A04 = r0     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
            monitor-enter(r5)     // Catch:{ all -> 0x0133 }
            r5.A08 = r4     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
            long r0 = r4.A0K     // Catch:{ all -> 0x0133 }
            r5.A0A(r0)     // Catch:{ all -> 0x0133 }
            monitor-enter(r5)     // Catch:{ all -> 0x0133 }
            int r0 = r5.A00     // Catch:{ all -> 0x010a }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
            com.whatsapp.jid.UserJid r0 = r5.A0A     // Catch:{ all -> 0x0133 }
            boolean r0 = X.AnonymousClass000.A1Y(r0, r12)     // Catch:{ all -> 0x0133 }
            if (r0 != 0) goto L_0x006e
            long r2 = r4.A1M     // Catch:{ all -> 0x0133 }
            monitor-enter(r7)     // Catch:{ all -> 0x0133 }
            long r0 = r7.A06     // Catch:{ all -> 0x0107 }
            monitor-exit(r7)     // Catch:{ all -> 0x0133 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x00d6
            long r0 = r4.A1M     // Catch:{ all -> 0x0133 }
            monitor-enter(r5)     // Catch:{ all -> 0x0133 }
            r5.A06 = r0     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
            goto L_0x00f5
        L_0x00d6:
            monitor-enter(r5)     // Catch:{ all -> 0x0133 }
            int r0 = r5.A01     // Catch:{ all -> 0x010a }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
            int r0 = r5.A03()     // Catch:{ all -> 0x0133 }
            if (r0 != r10) goto L_0x00ea
            long r0 = r4.A1M     // Catch:{ all -> 0x0133 }
            monitor-enter(r5)     // Catch:{ all -> 0x0133 }
            r5.A03 = r0     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
        L_0x00ea:
            int r0 = r5.A03()     // Catch:{ all -> 0x0133 }
            if (r0 > r11) goto L_0x00f5
            long r0 = r4.A1M     // Catch:{ all -> 0x0133 }
            r5.A09(r0)     // Catch:{ all -> 0x0133 }
        L_0x00f5:
            long r2 = r4.A1M     // Catch:{ all -> 0x0133 }
            monitor-enter(r7)     // Catch:{ all -> 0x0133 }
            long r0 = r7.A07     // Catch:{ all -> 0x0107 }
            monitor-exit(r7)     // Catch:{ all -> 0x0133 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x006e
            long r0 = r4.A1M     // Catch:{ all -> 0x0133 }
            monitor-enter(r5)     // Catch:{ all -> 0x0133 }
            r5.A07 = r0     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
            goto L_0x006e
        L_0x0107:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0133 }
            goto L_0x010c
        L_0x010a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
        L_0x010c:
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x010d:
            r9.close()     // Catch:{ all -> 0x013f }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r18)
            java.lang.String r0 = "CoreMessageStore/status-regenerated/ old: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " new:"
            X.C18260x0.A1R(r1, r0, r5)
            int r0 = r5.A02()
            if (r0 != 0) goto L_0x0132
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/regenerateStatusInfo newStatusInfo has totalCount 0: "
            X.C18260x0.A1R(r1, r0, r5)
            r0 = 0
            return r0
        L_0x0132:
            return r5
        L_0x0133:
            r1 = move-exception
            if (r9 == 0) goto L_0x013e
            r9.close()     // Catch:{ all -> 0x013a }
            goto L_0x013e
        L_0x013a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x013f }
        L_0x013e:
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0144 }
            throw r1
        L_0x0144:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0149:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0C(X.34r):X.34r");
    }

    public void A0L(C624034w r4, AnonymousClass2z0 r5) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("CoreMessageStore/updateMessagePaymentTransaction/PAY transactionStatus:");
        A0o2.append(r4.A02);
        C18260x0.A1R(A0o2, " for key:", r5);
        this.A0O.A01(new C70343aL(this, r5, r4, 3), 28);
    }

    public void A0P(C95814uZ r11, C50362i3 r12) {
        int i;
        int[][] iArr;
        String str;
        C18260x0.A1P(AnonymousClass001.A0o(), "CoreMessageStoreaddBusinessPrivacyTransitionMessageOnCurrentThread, jid: ", r11);
        AnonymousClass3ZC r8 = r12.A05;
        if ((r8 == null || (r8.actualActors == 0 && r8.privacyModeTs == 0 && r8.hostStorage == 0)) && (i = r12.A03) == 0 && r12.A07 == null && !this.A1P.A07(r11) && !((C48952fk) this.A2M.get()).A01(AnonymousClass32Y.A03(r11))) {
            A0r(r11, (Long) null);
        } else {
            AnonymousClass2P9 r2 = this.A2H;
            i = r12.A03;
            int i2 = r12.A01;
            String str2 = r12.A06;
            if (!(r11 instanceof PhoneUserJid)) {
                str = AnonymousClass000.A0P(r11, "msgstore/createBusinessStateChange/malformed-jid jid=", AnonymousClass001.A0o());
            } else {
                AnonymousClass1VX r5 = r2.A01;
                if (C616831v.A00(r5, r11)) {
                    str = "msgstore/createBusinessStateChange/in-app-survey-jid";
                } else {
                    C623134n r4 = new C623134n(r8, r12.A02, i);
                    C623134n r1 = new C623134n(r12.A04, r12.A00, i2);
                    Arrays.toString(Thread.currentThread().getStackTrace());
                    int A012 = r4.A01();
                    int A013 = r1.A01();
                    if (r5.A0Y(C58422vE.A02, 2320)) {
                        A012 = C57972uV.A00(A012);
                        A013 = C57972uV.A00(A013);
                        iArr = C57972uV.A00;
                    } else if (A012 <= 10 && A013 <= 10) {
                        iArr = AnonymousClass2BR.A00;
                    }
                    int i3 = iArr[A012][A013];
                    if (i3 > 0) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = AnonymousClass36P.A03(r11);
                        }
                        C56832sd r3 = r2.A02;
                        C31271o1 r0 = new C31271o1(C56832sd.A00(r11, r3), 69, r2.A00.A0H());
                        r0.A00 = i3;
                        r0.A01 = str2;
                        A08(r0);
                    }
                }
            }
            Log.d(str);
        }
        C623134n r42 = new C623134n(r8, r12.A02, i);
        C623134n r22 = new C623134n(r12.A04, r12.A00, r12.A01);
        AnonymousClass3ZC r13 = r42.A03;
        if (r13.actualActors != 0 && r13.hostStorage != 0 && r42.A04() && !r22.A04() && C18280x3.A1W(AnonymousClass0x2.A0F(this.A0L), "security_notifications")) {
            C56832sd r02 = this.A2B;
            A08(new C30341mI(C56832sd.A00(r11, r02), 63, C56612sH.A06(this)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r10 != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0109, code lost:
        if (r7.A2I.A02.A00(r13) <= 0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        if (r0.A00 != 1) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.C95814uZ r20, java.lang.Long r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/clearmsgs/service/jid "
            r1.append(r0)
            r13 = r20
            r1.append(r13)
            java.lang.String r0 = " excludeStarred:"
            r2 = r22
            X.C18260x0.A1E(r0, r1, r2)
            r7 = r19
            X.2hU r0 = r7.A0q
            android.os.Handler r6 = r0.A01
            java.lang.String r0 = r13.getRawString()
            r5 = 1
            android.os.Message r0 = android.os.Message.obtain(r6, r5, r0)
            r0.sendToTarget()
            X.2qv r12 = r7.A0e
            X.2sm r0 = r12.A00
            long r0 = r0.A07(r13)
            X.2Ty r0 = r12.A01(r0)
            if (r0 == 0) goto L_0x006d
            java.util.List r15 = r0.A09
            boolean r0 = r0.A0B
        L_0x0039:
            r16 = r22 ^ 1
            r8 = 0
            r14 = r21
            r17 = r23
            r18 = r0
            X.2Ty r9 = r12.A03(r13, r14, r15, r16, r17, r18)
            if (r9 == 0) goto L_0x00f9
            X.2ss r0 = r7.A0X
            r11 = 0
            X.31A r0 = r0.A0A(r13, r11)
            if (r0 == 0) goto L_0x0056
            int r0 = r0.A00
            r12 = 1
            if (r0 == r5) goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            if (r22 == 0) goto L_0x00b1
            boolean r0 = X.C627336j.A0K(r13)
            if (r0 != 0) goto L_0x010f
            boolean r0 = r13 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x010f
            X.2o0 r1 = r7.A1c
            X.3dV r0 = r1.A04
            X.4GK r4 = r0.get()
            r10 = 1
            goto L_0x0070
        L_0x006d:
            r15 = 0
            r0 = 0
            goto L_0x0039
        L_0x0070:
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x00a2 }
            X.2sm r0 = r1.A01     // Catch:{ all -> 0x00a2 }
            X.C56922sm.A02(r0, r13, r3, r11)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "SELECT EXISTS( SELECT * FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND  (action_type = 61 OR action_type = 69 )) as has_biz_state_change"
            java.lang.String r0 = "GET_BIZ_STATE_CHANGE_SQL"
            android.database.Cursor r3 = X.C56862sg.A03(r4, r1, r0, r3)     // Catch:{ all -> 0x00a2 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "has_biz_state_change"
            int r0 = X.AnonymousClass0x2.A04(r3, r0)     // Catch:{ all -> 0x0096 }
            if (r0 == r5) goto L_0x008e
            r10 = 0
        L_0x008e:
            r3.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00ac
        L_0x0092:
            r3.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x010c
        L_0x0096:
            r1 = move-exception
            if (r3 == 0) goto L_0x00a1
            r3.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00a7 }
            throw r1
        L_0x00a7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00ac:
            r4.close()
            if (r10 == 0) goto L_0x010f
        L_0x00b1:
            boolean r0 = r7.A0q(r13)
            if (r0 == 0) goto L_0x00bc
            if (r22 == 0) goto L_0x00fc
            r7.A0S(r13, r5)
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            r7.A0N(r13)
            if (r12 == 0) goto L_0x00cd
            java.lang.String r0 = "CoreMessageStore/clearmsgs/service/ adding plaintext disabled message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A0r(r13, r8)
            r7.A0p(r13)
        L_0x00cd:
            if (r1 == 0) goto L_0x00e6
            X.3Ex r0 = r7.A0F
            X.3ZH r0 = r0.A07(r13)
            X.2mu r1 = r7.A2I
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x00fa
        L_0x00df:
            X.34x r0 = r1.A01(r13, r5)
            r7.A0V(r0)
        L_0x00e6:
            r1 = 2
            java.lang.String r0 = r13.getRawString()
            android.os.Message r0 = android.os.Message.obtain(r6, r1, r0)
            r0.sendToTarget()
            X.2ZW r1 = r7.A0Z
            java.lang.String r0 = "action_clear"
            r1.A00(r9, r0)
        L_0x00f9:
            return
        L_0x00fa:
            r5 = 0
            goto L_0x00df
        L_0x00fc:
            X.2mu r0 = r7.A2I
            X.2ZY r0 = r0.A02
            long r3 = r0.A00(r13)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x00bd
            goto L_0x00bc
        L_0x010c:
            r4.close()
        L_0x010f:
            boolean r0 = r7.A0s(r13, r5)
            r0 = r0 ^ 1
            r12 = r12 & r0
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0Q(X.4uZ, java.lang.Long, boolean, boolean):void");
    }

    public void A0T(C95814uZ r8, boolean z) {
        Cursor A0E2;
        long A052 = A05(r8, C56612sH.A06(this) - TimeUnit.HOURS.toMillis(24));
        C53992o0 r3 = this.A1c;
        HashSet A0K2 = AnonymousClass002.A0K();
        AnonymousClass4GK A032 = r3.A04.get();
        try {
            ArrayList A0s2 = AnonymousClass001.A0s();
            C18280x3.A1K(A0s2, A052);
            C18280x3.A1K(A0s2, r3.A01.A07(r8));
            Iterator A0j2 = AnonymousClass0x2.A0j(AnonymousClass34J.A00);
            while (A0j2.hasNext()) {
                C18320x8.A1I((Integer) A0j2.next(), A0s2);
            }
            A0E2 = ((AnonymousClass3H0) A032).A03.A0E(C58122uk.A05, "GET_SYSTEM_MESSAGES_ROW_IDS_BY_ACTION_TYPES_SQL", (String[]) A0s2.toArray(C58152un.A0N));
            int A022 = AnonymousClass0x7.A02(A0E2);
            while (A0E2.moveToNext()) {
                C18260x0.A0H(A0E2, A0K2, A022);
            }
            A0E2.close();
            A032.close();
            this.A0v.A08(A0K2, z);
            return;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0X(C624134x r18) {
        C85284Fq A042;
        long uptimeMillis = SystemClock.uptimeMillis();
        C624134x r7 = r18;
        r7.A1H(1);
        C85284Fq A043 = this.A18.A04();
        try {
            C69833Yo Axl = A043.Axl();
            try {
                C56562sC r2 = this.A0v;
                long j = r7.A1L;
                int i = r7.A08;
                A042 = r2.A05.A04();
                ContentValues A062 = AnonymousClass0x9.A06();
                if (AnonymousClass3H0.A01(A062, A042, "message_add_on_flags", i).A05(A062, "message", "_id = ?", "UPDATE_MESSAGE_ADD_ON_FLAGS_MAIN_SQL", C18260x0.A1b(j)) == 0) {
                    C18260x0.A11("MainMessageStore/updateMessageAddOnFlagsByRowIdV2/update failed; message.rowId=", AnonymousClass001.A0o(), j);
                }
                A042.close();
                Axl.A00();
                C70093Zw.A01(A043, this, r7, 28);
                Axl.close();
                A043.close();
                this.A0d.A02("CoreMessageStore/updateMessageForMessageAddOnOnCurrentThread", C18310x6.A0A(uptimeMillis));
                return;
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A043.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0Z(C624134x r5) {
        C624134x A0w2 = r5.A0w();
        boolean z = true;
        C626936e.A0C(AnonymousClass000.A1W(A0w2));
        int A0l2 = A0w2.A0l();
        if (A0l2 != 2) {
            z = false;
        }
        C626936e.A0F(z, AnonymousClass000.A0Y("coremessagestore/updatemessagequote/quoted message type: ", AnonymousClass001.A0o(), A0l2));
        this.A0O.A01(new C70093Zw(this, 22, r5), 21);
    }

    public void A0b(C624134x r4, int i) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r4, "CoreMessageStore/update/jid ", A0o2);
        A0o2.append(A082.A00);
        AnonymousClass001.A1L(A0o2);
        AnonymousClass2z0.A0A(A082, A0o2);
        C18260x0.A0w(" updateType:", A0o2, i);
        this.A0O.A01(new C71733ca((Object) r4, (Object) this, i, 42), 22);
    }

    public final void A0c(C624134x r8, int i) {
        CountDownLatch A142 = C18290x4.A14();
        this.A08.A0S(new C71433c6(this, r8, A142, i, 15));
        try {
            A142.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e((Throwable) e);
        }
    }

    public void A0g(AnonymousClass2z0 r13, int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C56562sC r1 = this.A0v;
        C85284Fq A042 = r1.A05.A04();
        try {
            ContentValues A062 = AnonymousClass0x9.A06();
            if (AnonymousClass3H0.A01(A062, A042, "status", i).A05(A062, "message", "chat_row_id = ? AND from_me = ? AND key_id = ?", "UPDATE_MESSAGE_STATUS_MAIN_SQL", r1.A09(r13)) != 1) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("MainMessageStore/updateMessageStatus/update/failed ");
                AnonymousClass2z0.A09(r13, " ", A0o2);
                C18260x0.A0n(r13.A00, A0o2);
            } else {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("MainMessageStore/updateMessageStatus/update/success ");
                A0o3.append(r13);
                C18260x0.A0y(" ", A0o3, i);
            }
            A042.close();
            this.A0d.A02("CoreMessageStore/updateMessageStatusTimestamp", C18310x6.A0A(uptimeMillis));
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0k(Collection collection, int i) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("CoreMessageStore/deletemessages ");
        C18260x0.A1G(A0o2, collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0y.A03(C18300x5.A0T(it).A1J);
        }
        this.A0O.A01(new C71733ca((Object) collection, (Object) this, i, 41), 20);
    }

    public void A0l(Collection collection, int i) {
        HashSet A0K2 = AnonymousClass002.A0K();
        HashMap A0t2 = AnonymousClass001.A0t();
        boolean A1U2 = AnonymousClass000.A1U(i & 8, 8);
        Collection collection2 = collection;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C624134x A0T2 = C18300x5.A0T(it);
                A0d(A0T2, i, false);
                C95814uZ r4 = A0T2.A1J.A00;
                A0K2.add(r4);
                if (A1U2) {
                    long A042 = C18320x8.A04(A0T2.A0r);
                    Number A0p2 = AnonymousClass0x9.A0p(r4, A0t2);
                    if (A0p2 != null) {
                        A042 = Math.max(A0p2.longValue(), A042);
                    }
                    AnonymousClass0x2.A1J(r4, A0t2, A042);
                }
            } else {
                this.A0q.A01.post(new C70643ap(this, collection2, A0t2, A0K2, 1, A1U2));
                return;
            }
        }
    }

    public void A0m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T2 = C18300x5.A0T(it);
            if (A0T2 instanceof C30471mV) {
                C30471mV r4 = (C30471mV) A0T2;
                C626936e.A00();
                if (r4.A01 != null) {
                    C613830m r3 = this.A0w;
                    r3.A09(r4, true, false);
                    AnonymousClass33C r2 = r4.A01;
                    if (!(r2 == null || r2.A0F == null)) {
                        r2.A0A = 0;
                        r2.A0F = null;
                        r2.A0G = null;
                        r2.A0W = null;
                        r3.A06(r4);
                    }
                }
            } else if (A0T2 instanceof C30481mW) {
                A0T2.A1Z("");
            }
        }
    }

    public final void A0n(List list) {
        C624034w r2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A002 = C55832qz.A00(this, (AnonymousClass2z0) it.next());
            if (!(A002 == null || (r2 = A002.A0P) == null)) {
                r2.A02 = 0;
                r2.A06 = C56612sH.A06(this);
                this.A0q.A00(A002, 16);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r5 instanceof X.AnonymousClass1fS) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0q(X.C95814uZ r5) {
        /*
            r4 = this;
            boolean r0 = X.C627336j.A0K(r5)
            if (r0 != 0) goto L_0x000b
            boolean r1 = r5 instanceof X.AnonymousClass1fS
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r3 = 0
            if (r0 == 0) goto L_0x003b
            X.1VX r2 = r4.A1r
            X.C162457s7.A0J(r2, r3)
            r1 = 4873(0x1309, float:6.829E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x003b
            X.2mi r0 = r4.A1x
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x003b
            X.3Ex r0 = r4.A0F
            X.3ZH r1 = r0.A07(r5)
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1.A0R()
            if (r0 == 0) goto L_0x003b
            boolean r0 = r1.A0S()
            if (r0 == 0) goto L_0x003b
            r3 = 1
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0q(X.4uZ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r8.A23.A0C(r9) == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0w(X.C624134x r9, X.C624134x r10) {
        /*
            r8 = this;
            r9.A1Q(r10)
            X.34w r0 = r9.A0P
            r3 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0013
            X.34w r0 = r9.A0P
            r0.A0F(r3)
        L_0x0013:
            X.2qz r0 = r8.A2D
            r1 = 5
            boolean r0 = r0.A07(r9, r1)
            r4 = 0
            if (r0 == 0) goto L_0x00b5
            X.2hU r0 = r8.A0q
            r0.A00(r9, r1)
            X.2z0 r2 = r9.A1J
            X.4uZ r7 = r2.A00
            android.os.Handler r1 = r0.A02
            r0 = 23
            X.C70093Zw.A00(r1, r8, r7, r0)
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x006d
            X.2ss r0 = r8.A0X
            X.31A r0 = r0.A0A(r7, r4)
            if (r0 == 0) goto L_0x0041
            long r4 = r0.A0Q
            long r0 = r9.A1M
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
        L_0x0041:
            int r1 = r9.A0D
            r0 = 13
            if (r1 != r0) goto L_0x006d
        L_0x0047:
            X.2r4 r0 = r8.A22
            boolean r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x006d
            X.2z0 r6 = r9.A0f
            if (r6 == 0) goto L_0x0065
            X.33Y r5 = r8.A23
            X.2YF r4 = r8.A1u
            X.C626936e.A06(r6)
            long r0 = r9.A0K
            byte r2 = r9.A1I
            X.34x r0 = r4.A00(r6, r2, r0)
            r5.A0C(r0)
        L_0x0065:
            X.33Y r0 = r8.A23
            boolean r0 = r0.A0C(r9)
            if (r0 != 0) goto L_0x0088
        L_0x006d:
            X.2z0 r6 = r9.A0f
            if (r6 == 0) goto L_0x0083
            X.33Y r5 = r8.A23
            X.2YF r4 = r8.A1u
            X.C626936e.A06(r6)
            long r1 = r9.A0K
            byte r0 = r9.A1I
            X.34x r0 = r4.A00(r6, r0, r1)
            r5.A04(r0)
        L_0x0083:
            X.33Y r0 = r8.A23
            r0.A04(r9)
        L_0x0088:
            X.2sr r0 = r8.A09
            X.2ss r1 = r8.A0X
            boolean r0 = X.C627636p.A0M(r0, r9)
            if (r0 == 0) goto L_0x00b4
            X.31A r2 = X.C56982ss.A00(r1, r7)
            if (r2 == 0) goto L_0x00b4
            monitor-enter(r2)
            int r0 = r2.A06     // Catch:{ all -> 0x00b0 }
            int r0 = r0 + 1
            r2.A06 = r0     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "chatInfo/incrementUnseenImportantMessageCount/"
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r2.A08()     // Catch:{ all -> 0x00b0 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00b3
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00b3:
            monitor-exit(r2)
        L_0x00b4:
            return r3
        L_0x00b5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0w(X.34x, X.34x):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r2 > r0) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0x(X.AnonymousClass2z0 r11) {
        /*
            r10 = this;
            X.34x r6 = X.C55832qz.A00(r10, r11)
            if (r6 == 0) goto L_0x0082
            X.2iV r5 = r10.A0R
            X.4uZ r4 = X.AnonymousClass2z0.A00(r6)
            byte r7 = r6.A1I
            r0 = 8
            if (r7 == r0) goto L_0x003a
            boolean r0 = r6.A1F
            if (r0 != 0) goto L_0x0026
            long r2 = r6.A1M
            X.2ss r0 = r5.A09
            X.31A r0 = X.C56982ss.A00(r0, r4)
            if (r0 != 0) goto L_0x008d
            r0 = -9223372036854775808
        L_0x0022:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0082
        L_0x0026:
            boolean r0 = r6.A1F
            if (r0 == 0) goto L_0x003a
            long r2 = r6.A1M
            X.2ss r0 = r5.A09
            X.31A r0 = X.C56982ss.A00(r0, r4)
            if (r0 != 0) goto L_0x008a
            r0 = -9223372036854775808
        L_0x0036:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0082
        L_0x003a:
            boolean r0 = r6.A1F
            if (r0 != 0) goto L_0x004e
            long r2 = r6.A1M
            X.2ss r8 = r5.A09
            X.31A r0 = X.C56982ss.A00(r8, r4)
            if (r0 != 0) goto L_0x0087
            r0 = -9223372036854775808
        L_0x004a:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0062
        L_0x004e:
            boolean r0 = r6.A1F
            if (r0 == 0) goto L_0x0090
            long r1 = r6.A1M
            X.2ss r8 = r5.A09
            X.31A r0 = X.C56982ss.A00(r8, r4)
            if (r0 != 0) goto L_0x0084
            r5 = -9223372036854775808
        L_0x005e:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
        L_0x0062:
            X.31A r0 = X.C56982ss.A00(r8, r4)
            if (r0 == 0) goto L_0x0082
            java.lang.String r2 = r0.A0g
            if (r2 == 0) goto L_0x0082
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "\""
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0090
        L_0x0082:
            r0 = 1
            return r0
        L_0x0084:
            long r5 = r0.A0E
            goto L_0x005e
        L_0x0087:
            long r0 = r0.A0D
            goto L_0x004a
        L_0x008a:
            long r0 = r0.A0G
            goto L_0x0036
        L_0x008d:
            long r0 = r0.A0F
            goto L_0x0022
        L_0x0090:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66543Lv.A0x(X.2z0):boolean");
    }

    public C66543Lv(C116985rC r4, C116985rC r5, C116985rC r6, C116985rC r7, C116985rC r8, C55682qk r9, C64393Dh r10, C69263Wi r11, C56972sr r12, AnonymousClass36E r13, C56352rq r14, C49712gy r15, C49392gS r16, C51352jg r17, C64773Ex r18, C56422rx r19, C44382Vv r20, C622334f r21, C620633i r22, C56612sH r23, AnonymousClass33p r24, C22931Qq r25, AnonymousClass1k8 r26, C52852m9 r27, C47952e6 r28, C49462gZ r29, C50632iV r30, C54432oi r31, C44922Xz r32, C28871hu r33, AnonymousClass2Y0 r34, C56922sm r35, C56982ss r36, C48522f2 r37, AnonymousClass2ZW r38, C28891hw r39, C46962cU r40, C47962e7 r41, C49472ga r42, C55792qv r43, AnonymousClass2Y2 r44, AnonymousClass313 r45, C56412rw r46, C47972e8 r47, C47982e9 r48, C48532f3 r49, AnonymousClass30T r50, C66533Lu r51, C60532yi r52, C55762qs r53, C56892sj r54, C50012hU r55, AnonymousClass35R r56, C623334p r57, C60202yA r58, C52862mA r59, C56562sC r60, C613830m r61, C53132mb r62, C54762pF r63, C53612nN r64, C61142zm r65, C52352lL r66, C66483Lp r67, C51532jy r68, C29431io r69, C47992eA r70, C28761hj r71, C55272q5 r72, C72303dV r73, C48542f4 r74, C48992fo r75, C194909Va r76, C51552k0 r77, C42292Nn r78, C48002eB r79, C53622nO r80, C42302No r81, C54572ow r82, AnonymousClass2W2 r83, C55282q6 r84, C54582ox r85, C56082rO r86, C66393Lg r87, C55332qB r88, C48562f6 r89, C56382rt r90, AnonymousClass34U r91, C48012eC r92, C59282wf r93, C49802h7 r94, C56362rr r95, C42882Pw r96, C55622qe r97, C49002fp r98, C48022eD r99, C54062o7 r100, AnonymousClass2W5 r101, C620233e r102, C53992o0 r103, AnonymousClass302 r104, C55342qC r105, C612830a r106, C614530v r107, C55292q7 r108, C56662sM r109, AnonymousClass311 r110, C29041iB r111, AnonymousClass8EA r112, C56112rR r113, C60992zV r114, AnonymousClass2WE r115, C158767kW r116, C59932xj r117, AnonymousClass1VX r118, AnonymousClass3LP r119, AnonymousClass4FV r120, AnonymousClass2YF r121, C48102eL r122, C55582qa r123, C53202mi r124, AnonymousClass2WW r125, C52552lf r126, C66653Mg r127, C55352qD r128, C55882r4 r129, AnonymousClass33Y r130, C55892r5 r131, C49132g2 r132, C59802xV r133, C196439aq r134, AnonymousClass9U4 r135, C44632Ww r136, C44642Wx r137, C56832sd r138, C49682gv r139, C55832qz r140, C56572sD r141, AnonymousClass4FS r142, AnonymousClass2P9 r143, C53322mu r144, C183538qC r145, C183538qC r146, C183538qC r147, C183538qC r148, C183538qC r149) {
        this.A0K = r23;
        this.A1r = r118;
        this.A08 = r11;
        this.A0s = r57;
        this.A0W = r35;
        this.A06 = r9;
        this.A09 = r12;
        this.A1V = r96;
        AnonymousClass4FS r1 = r142;
        this.A2G = r1;
        this.A0X = r36;
        this.A07 = r10;
        this.A1P = r90;
        this.A1t = r120;
        this.A1U = r95;
        this.A0I = r21;
        this.A2E = r141;
        this.A1b = r102;
        this.A1s = r119;
        this.A1l = r112;
        this.A23 = r130;
        this.A0C = r15;
        this.A0U = r33;
        this.A2J = r145;
        this.A0F = r18;
        this.A0b = r40;
        this.A0q = r55;
        this.A0A = r13;
        this.A26 = r133;
        this.A0J = r22;
        this.A0V = r34;
        this.A0m = r51;
        this.A28 = r135;
        this.A0T = r32;
        this.A2D = r140;
        this.A1z = r126;
        this.A0t = r58;
        this.A1i = r109;
        this.A0v = r60;
        this.A14 = r69;
        this.A1H = r82;
        this.A22 = r129;
        this.A1e = r105;
        this.A2M = r146;
        this.A1q = r117;
        this.A20 = r127;
        this.A1C = r77;
        this.A1L = r86;
        this.A1X = r98;
        this.A1g = r107;
        this.A2I = r144;
        this.A0O = r27;
        this.A0R = r30;
        this.A0Y = r37;
        this.A0n = r52;
        this.A15 = r70;
        this.A16 = r71;
        this.A19 = r74;
        this.A1M = r87;
        this.A21 = r128;
        this.A1c = r103;
        this.A29 = r136;
        this.A01 = r4;
        this.A0S = r31;
        this.A0d = r42;
        this.A0e = r43;
        this.A24 = r131;
        C54762pF r2 = r63;
        this.A0y = r2;
        this.A10 = r65;
        this.A11 = r66;
        this.A1K = r85;
        this.A1O = r89;
        this.A2C = r139;
        this.A1T = r94;
        this.A1W = r97;
        this.A0L = r24;
        this.A0x = r62;
        this.A0E = r17;
        this.A18 = r73;
        this.A1B = r76;
        this.A0G = r19;
        this.A0l = r50;
        this.A0u = r59;
        this.A13 = r68;
        this.A1N = r88;
        this.A1Q = r91;
        this.A2B = r138;
        this.A1d = r104;
        this.A1h = r108;
        this.A1v = r122;
        this.A0a = r39;
        this.A0g = r45;
        this.A0j = r48;
        this.A2A = r137;
        this.A0w = r61;
        this.A27 = r134;
        this.A1G = r81;
        this.A1S = r93;
        this.A1f = r106;
        this.A1y = r125;
        this.A0D = r16;
        this.A1Y = r99;
        this.A1a = r101;
        this.A1w = r123;
        this.A0P = r28;
        this.A1k = r111;
        this.A1j = r110;
        this.A2L = r147;
        this.A0r = r56;
        this.A0o = r53;
        this.A1o = r115;
        this.A0p = r54;
        this.A1u = r121;
        this.A1J = r84;
        this.A0z = r64;
        this.A1E = r79;
        this.A1R = r92;
        this.A1D = r78;
        this.A0i = r47;
        this.A12 = r67;
        this.A2K = r148;
        this.A0Z = r38;
        this.A0B = r14;
        this.A1p = r116;
        this.A0h = r46;
        this.A1n = r114;
        this.A17 = r72;
        this.A1F = r80;
        this.A1Z = r100;
        this.A2N = r149;
        this.A03 = r5;
        this.A04 = r6;
        this.A1m = r113;
        this.A0H = r20;
        this.A1A = r75;
        this.A25 = r132;
        this.A0c = r41;
        this.A0k = r49;
        this.A2H = r143;
        this.A0f = r44;
        this.A2O = r2.A02;
        this.A0M = r25;
        this.A0N = r26;
        this.A0Q = r29;
        this.A1I = r83;
        this.A2F = C72173dI.A00(r1);
        this.A1x = r124;
        this.A02 = r7;
        this.A05 = r8;
    }
}
