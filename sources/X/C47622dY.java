package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2dY  reason: invalid class name and case insensitive filesystem */
public class C47622dY {
    public PowerManager.WakeLock A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final Mp4Ops A03;
    public final C56352rq A04;
    public final C153407bG A05;
    public final C56512s6 A06;
    public final C620633i A07;
    public final C54292oU A08;
    public final AnonymousClass33p A09;
    public final C61072zf A0A;
    public final AnonymousClass3DM A0B;
    public final AnonymousClass319 A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass4FV A0E;
    public final C66843Mz A0F;
    public final C66833My A0G;
    public final C46042az A0H;
    public final C162287rd A0I;
    public final C149887Oh A0J;
    public final WebpUtils A0K;
    public final C45122Yt A0L;
    public final AnonymousClass306 A0M;
    public final C989053r A0N;
    public final C162397rz A0O;
    public final AnonymousClass4FS A0P;

    public C172738Mn A00(AnonymousClass7UI r39) {
        PowerManager.WakeLock wakeLock;
        AnonymousClass7UI r13 = r39;
        synchronized (this) {
            if (this.A00 == null) {
                PowerManager A0J2 = this.A07.A0J();
                if (A0J2 == null) {
                    Log.w("media-transcode-queue/get-transcode-wakelock pm=null");
                } else {
                    this.A00 = AnonymousClass75K.A00(A0J2, "mediatranscode", 1);
                }
            }
            wakeLock = this.A00;
        }
        if (r13 instanceof C135456kh) {
            C54292oU r12 = this.A08;
            AnonymousClass4FS r11 = this.A0P;
            Mp4Ops mp4Ops = this.A03;
            AnonymousClass1VX r9 = this.A0D;
            C55682qk r8 = this.A01;
            C64393Dh r7 = this.A02;
            C162287rd r6 = this.A0I;
            C153407bG r5 = this.A05;
            AnonymousClass3DM r4 = this.A0B;
            C56512s6 r3 = this.A06;
            C162397rz r2 = this.A0O;
            return new C135566ks(wakeLock, r8, r7, mp4Ops, r5, r3, r12, this.A09, r4, r9, (C135456kh) r13, r6, this.A0J, r2, r11);
        } else if (r13 instanceof C135476kj) {
            C54292oU r19 = this.A08;
            AnonymousClass4FS r18 = this.A0P;
            Mp4Ops mp4Ops2 = this.A03;
            AnonymousClass1VX r15 = this.A0D;
            C55682qk r14 = this.A01;
            C64393Dh r122 = this.A02;
            AnonymousClass4FV r112 = this.A0E;
            C989053r r10 = this.A0N;
            C162287rd r92 = this.A0I;
            C153407bG r82 = this.A05;
            AnonymousClass3DM r72 = this.A0B;
            AnonymousClass319 r62 = this.A0C;
            C56512s6 r52 = this.A06;
            C162397rz r42 = this.A0O;
            AnonymousClass33p r32 = this.A09;
            AnonymousClass306 r22 = this.A0M;
            C149887Oh r1 = this.A0J;
            AnonymousClass4FS r36 = r18;
            Mp4Ops mp4Ops3 = mp4Ops2;
            C54292oU r23 = r19;
            return new C135586ku(wakeLock, r14, r122, mp4Ops3, r82, r52, r23, r32, r72, r62, r15, r112, this.A0G, (C135476kj) r13, r92, r1, r22, r10, r42, r36);
        } else if (r13 instanceof C135436kf) {
            C54292oU r43 = this.A08;
            return new C135556kr(wakeLock, this.A01, this.A02, this.A05, r43, (C135436kf) r13, this.A0O);
        } else if (r13 instanceof C135446kg) {
            AnonymousClass1VX r73 = this.A0D;
            C55682qk r63 = this.A01;
            C61072zf r53 = this.A0A;
            C989053r r44 = this.A0N;
            return new C135576kt(wakeLock, r63, this.A07, r53, this.A0C, r73, this.A0F, this.A0G, (C135446kg) r13, r44);
        } else if (r13 instanceof C135466ki) {
            C55682qk r74 = this.A01;
            WebpUtils webpUtils = this.A0K;
            C64393Dh r54 = this.A02;
            C620633i r45 = this.A07;
            C56352rq r33 = this.A04;
            return new C28211fs(r74, r54, r33, r45, this.A0H, (C135466ki) r13, webpUtils, this.A0L);
        } else if (r13 instanceof C135426ke) {
            return new C28201fr(this.A07, (C135426ke) r13);
        } else {
            throw AnonymousClass0x9.A0i("Unreachable code");
        }
    }

    public C47622dY(C55682qk r2, C64393Dh r3, Mp4Ops mp4Ops, C56352rq r5, C153407bG r6, C56512s6 r7, C620633i r8, C54292oU r9, AnonymousClass33p r10, C61072zf r11, AnonymousClass3DM r12, AnonymousClass319 r13, AnonymousClass1VX r14, AnonymousClass4FV r15, C66843Mz r16, C66833My r17, C46042az r18, C162287rd r19, C149887Oh r20, WebpUtils webpUtils, C45122Yt r22, AnonymousClass306 r23, C989053r r24, C162397rz r25, AnonymousClass4FS r26) {
        this.A08 = r9;
        this.A0P = r26;
        this.A03 = mp4Ops;
        this.A0D = r14;
        this.A01 = r2;
        this.A0K = webpUtils;
        this.A02 = r3;
        this.A0E = r15;
        this.A0A = r11;
        this.A0N = r24;
        this.A07 = r8;
        this.A0I = r19;
        this.A05 = r6;
        this.A0B = r12;
        this.A0C = r13;
        this.A0L = r22;
        this.A06 = r7;
        this.A0O = r25;
        this.A09 = r10;
        this.A0M = r23;
        this.A0J = r20;
        this.A0G = r17;
        this.A04 = r5;
        this.A0F = r16;
        this.A0H = r18;
    }
}
