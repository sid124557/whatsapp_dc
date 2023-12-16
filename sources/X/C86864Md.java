package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.calling.audio.VoipSystemAudioManager;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.HashSet;

/* renamed from: X.4Md  reason: invalid class name and case insensitive filesystem */
public class C86864Md extends Handler {
    public C107285b3 A00;
    public boolean A01;
    public boolean A02;
    public final HashSet A03 = AnonymousClass002.A0K();
    public final /* synthetic */ C112515jr A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86864Md(Looper looper, C112515jr r3) {
        super(looper);
        this.A04 = r3;
    }

    public final void A00() {
        C107695bk r1 = ((C64333Db) AnonymousClass29x.A00(C64333Db.class, this.A04.A01.A00)).AcK.A00;
        C64333Db r2 = r1.ACP;
        C56612sH A0V = C86604Kt.A0V(r2);
        AnonymousClass1VX A0Y = C86604Kt.A0Y(r2);
        C69263Wi A0K = C86614Ku.A0K(r2);
        C64333Db r0 = r1.ACP;
        JNIUtils jNIUtils = new JNIUtils((AnonymousClass1VX) r0.A07.get(), (C56972sr) r0.AJW.get(), (C54292oU) r0.AaB.get(), (AnonymousClass4FS) r0.AbX.get(), (C64393Dh) r0.AS1.get(), r0.Ai2(), (C66663Mh) r0.AUd.get(), r0.AkL(), (C620633i) r0.AYG.get(), (C187958y5) r0.ASM.get(), (C113745lv) r1.A1w.get(), (C66653Mg) r0.AN6.get(), (VoipCameraManager) r0.Aa0.get(), (VoipSystemAudioManager) r1.AC0.get(), (AnonymousClass5ZR) r0.Aag.get(), (AnonymousClass33p) r0.Aaj.get(), (C106155Xv) r0.Aa5.get(), (C60152y5) r0.AVn.get(), (C57162tC) r0.AaV.get(), r1.A9h, r1.A9i);
        C50862it r71 = (C50862it) r2.A0l.get();
        C55682qk A0U = C86634Kw.A0U(r2);
        C56972sr A0L = C86614Ku.A0L(r2);
        C54292oU A0U2 = C86614Ku.A0U(r2);
        AnonymousClass4FS A0g = C86604Kt.A0g(r2);
        C64393Dh r70 = (C64393Dh) r2.AS1.get();
        C56492s4 r69 = (C56492s4) r2.AWW.get();
        AnonymousClass49P Ai2 = r2.Ai2();
        C52412lR A3g = r2.AkL();
        AnonymousClass33S r68 = (AnonymousClass33S) r2.AUY.get();
        C56572sD r67 = (C56572sD) r2.AWF.get();
        C1230066r A0X = C86634Kw.A0X(r2);
        C88744aj r72 = C88744aj.A00;
        C28861ht r66 = (C28861ht) r2.AJH.get();
        C52212l7 r65 = (C52212l7) r2.A4A.get();
        C97094xc r64 = (C97094xc) r1.A29.get();
        C28911hy r63 = (C28911hy) r2.A7x.get();
        AnonymousClass5TW r62 = (AnonymousClass5TW) r2.ASQ.get();
        AnonymousClass5U0 r61 = (AnonymousClass5U0) r2.Aa4.get();
        AnonymousClass5PA r60 = (AnonymousClass5PA) r2.A25.get();
        C97174xk r59 = (C97174xk) r1.A22.get();
        C64773Ex A0P = C86604Kt.A0P(r2);
        C48972fm r58 = (C48972fm) r2.AW6.get();
        C187958y5 A0n = C86614Ku.A0n(r2);
        C620633i r57 = (C620633i) r2.AYG.get();
        AnonymousClass5ZU A0R = C86604Kt.A0R(r2);
        C620733j A0W = C86604Kt.A0W(r2);
        C49402gT r56 = (C49402gT) r2.A4J.get();
        C42642Oy r55 = (C42642Oy) r2.AG1.get();
        AnonymousClass3S3 r54 = (AnonymousClass3S3) r2.ARB.get();
        AnonymousClass5ZG r53 = (AnonymousClass5ZG) r1.A21.get();
        C66493Lq r52 = (C66493Lq) r2.AGL.get();
        C56662sM r51 = (C56662sM) r2.AaX.get();
        C29411im r50 = (C29411im) r2.AcJ.get();
        C113745lv r49 = (C113745lv) r1.A1w.get();
        C97064xZ r48 = (C97064xZ) r1.A26.get();
        C56762sW r47 = (C56762sW) r2.A4R.get();
        C46322bR r46 = (C46322bR) r2.A4I.get();
        C113905mB r45 = (C113905mB) r2.A4w.get();
        AnonymousClass1R1 r44 = (AnonymousClass1R1) r2.A56.get();
        C64213Cp r43 = (C64213Cp) r2.A8E.get();
        C66553Lw r42 = (C66553Lw) r2.AOX.get();
        C621133n r41 = (C621133n) r2.AW5.get();
        AnonymousClass54I r40 = (AnonymousClass54I) r1.AB1.get();
        AnonymousClass318 r39 = (AnonymousClass318) r2.AZQ.get();
        VoipCameraManager voipCameraManager = (VoipCameraManager) r2.Aa0.get();
        AnonymousClass7SF r37 = (AnonymousClass7SF) r1.A6G.get();
        AnonymousClass3XF r36 = (AnonymousClass3XF) r1.A3F.get();
        C149827Ob r35 = (C149827Ob) r1.A6q.get();
        C55892r5 r34 = (C55892r5) r2.AJE.get();
        C56642sK r33 = (C56642sK) r2.ARV.get();
        C55422qK r32 = (C55422qK) r2.AUG.get();
        C112515jr A1X = r2.Ai5();
        AnonymousClass5ZR A0V2 = C86614Ku.A0V(r2);
        AnonymousClass33p A0W2 = C86614Ku.A0W(r2);
        C29401il r31 = (C29401il) r2.A26.get();
        AnonymousClass5NO AJi = r1.AJi();
        AnonymousClass5F3 r30 = (AnonymousClass5F3) r1.A4S.get();
        AnonymousClass2ZQ r29 = (AnonymousClass2ZQ) r1.A3q.get();
        C56322rn r28 = (C56322rn) r2.AIT.get();
        AnonymousClass364 r27 = (AnonymousClass364) r1.AC1.get();
        AnonymousClass5Z0 AJu = r1.AJu();
        C46992cX A5N = r2.Ana();
        C29281iZ r26 = (C29281iZ) r2.AUD.get();
        C106155Xv r25 = (C106155Xv) r2.Aa5.get();
        AnonymousClass33T r24 = (AnonymousClass33T) r2.Aaf.get();
        C40402Fr r23 = (C40402Fr) r1.A2A.get();
        AnonymousClass4LZ r22 = (AnonymousClass4LZ) r1.A12.get();
        C56442rz r21 = (C56442rz) r1.A27.get();
        C66543Lv A0Z = C86614Ku.A0Z(r2);
        AnonymousClass5F4 r20 = (AnonymousClass5F4) r1.A4T.get();
        C47852dw r19 = (C47852dw) r2.AOe.get();
        C54812pK r18 = (C54812pK) r2.ARX.get();
        C29321id r17 = (C29321id) r2.AUK.get();
        C45822ad A1Y = r2.Ai6();
        C183538qC A002 = C72343dZ.A00(r2.AUB);
        Object obj = r2.AI0.get();
        obj.getClass();
        C88734ai r02 = new C88734ai(obj);
        C183538qC A003 = C72343dZ.A00(r2.A82);
        C183538qC A004 = C72343dZ.A00(r2.A4O);
        C107285b3 r712 = new C107285b3(r72, r02, (C29171iO) r2.A0s.get(), A0U, r30, r20, r70, A0K, A0L, r69, r50, r63, r40, r60, r31, Ai2, r25, AJi, r53, r59, r65, r48, A0X, (AnonymousClass5AL) r1.A2B.get(), r29, r46, r35, r21, r61, (AnonymousClass5TU) r1.AAL.get(), (ScreenShareResourceManager) r1.AAM.get(), r56, r37, A1X, (C111665iU) r2.AUP.get(), AJu, r19, (C118405tU) r1.A8Y.get(), (C46622bw) r2.AZv.get(), r27, r49, A1Y, (AnonymousClass5IP) r1.A6l.get(), r62, (C46362bV) r2.A5o.get(), (C29441ip) r2.A68.get(), A0P, r33, A0R, r43, r45, (C44382Vv) r2.A6u.get(), r71, (C55262q4) r2.A5q.get(), r57, A0V, A0U2, (C57162tC) r2.AaV.get(), r24, A0V2, A0W2, A0W, r41, r58, r36, r23, r47, A0Z, r28, r32, r51, r39, A3g, A0Y, (C64723Er) r2.AFX.get(), r52, A5N, r68, r34, r42, r54, r18, r55, r66, r26, r17, r44, r67, r22, (C50272hu) r1.ABf.get(), A0n, A0g, r64, jNIUtils, voipCameraManager, A002, A003, A004);
        this.A00 = r712;
        r712.A0D();
    }

    public void handleMessage(Message message) {
        boolean z;
        String A0R;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                Log.i("voice-service-wrapper/handler WHAT_STOP_SERVICE");
                this.A02 = false;
                z = this.A01;
            } else if (i == 4) {
                Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_BIND");
                if (this.A00 == null) {
                    A00();
                }
                this.A01 = true;
                C1224364j r1 = (C1224364j) message.obj;
                this.A03.add(r1);
                r1.BbL(this.A00);
                return;
            } else if (i == 5) {
                if (!this.A01) {
                    A0R = "voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called while isBound is false";
                } else {
                    HashSet hashSet = this.A03;
                    if (!hashSet.contains(message.obj)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called with mismatch voiceServiceBinderComponent, actual ");
                        A0o.append(hashSet);
                        A0o.append(", given ");
                        A0R = AnonymousClass000.A0R(message.obj, A0o);
                    } else {
                        hashSet.remove(message.obj);
                        boolean A1S = AnonymousClass0x7.A1S(hashSet);
                        this.A01 = A1S;
                        C18260x0.A1E("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND -- isBound ? ", AnonymousClass001.A0o(), A1S);
                        z = this.A02;
                    }
                }
                Log.w(A0R);
                return;
            } else {
                return;
            }
            if (!z) {
                Log.i("voice-service-wrapper destroyVoiceService");
                C107285b3 r0 = this.A00;
                if (r0 != null) {
                    r0.A0E();
                    this.A00 = null;
                    return;
                }
                return;
            }
            return;
        }
        if (this.A00 == null) {
            A00();
            this.A02 = true;
        }
        Object obj = message.obj;
        C626936e.A06(obj);
        C107285b3 r02 = this.A00;
        C626936e.A06(r02);
        r02.A0S((C106645Zu) obj);
    }
}
