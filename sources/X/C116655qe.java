package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5qe  reason: invalid class name and case insensitive filesystem */
public class C116655qe implements C185758uC {
    public int A00 = 0;
    public Handler A01;
    public CallGridViewModel A02;
    public final C56972sr A03;
    public final AnonymousClass49P A04;
    public final C91444jd A05;
    public final AnonymousClass5IO A06;
    public final AnonymousClass5ZR A07;
    public final C187958y5 A08;
    public final VoipCameraManager A09;
    public final Map A0A = AnonymousClass001.A0t();

    public AnonymousClass8KC A00(UserJid userJid) {
        Map map = this.A0A;
        UserJid userJid2 = userJid;
        if (map.containsKey(userJid)) {
            return (AnonymousClass8KC) C18320x8.A0Z(map, userJid);
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/VideoPortManager/getVideoPort creating port for ", userJid);
        AnonymousClass5IO r1 = this.A06;
        AnonymousClass1VX r6 = r1.A01;
        AnonymousClass8KC r3 = new AnonymousClass8KC(new AnonymousClass747(), this, r6, userJid2, this.A08, new GlVideoRenderer(), !r1.A00.A0a(userJid));
        map.put(userJid, r3);
        return r3;
    }

    public void A02() {
        UserJid A0G = this.A05.A0G();
        Map map = this.A0A;
        if (!map.containsKey(A0G)) {
            Log.w("voip/VideoPortManager/startCameraPreview no self video port");
            return;
        }
        AnonymousClass8KC r3 = (AnonymousClass8KC) map.get(A0G);
        if (AnonymousClass001.A1Z(AnonymousClass25H.A00(r3.A0A, Boolean.FALSE, new AnonymousClass91H(r3, 6))) || r3.A05 != null) {
            A03(r3);
        } else {
            r3.A09 = false;
        }
    }

    public final void A03(AnonymousClass8KC r5) {
        C107285b3 r2;
        int i;
        UserJid userJid = r5.A0F;
        if (this.A03.A0a(userJid)) {
            if (C107305b5.A08(this.A07, true)) {
                Log.w("voip/VideoPortManager/ camera permissions not granted, unable to set video preview port");
                return;
            }
            if (this.A01 == null) {
                this.A01 = new Handler(Looper.getMainLooper(), new C1238169w(this, 3));
            }
            int videoPreviewPort = Voip.setVideoPreviewPort(r5);
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (videoPreviewPort == 0) {
                this.A09.addCameraErrorListener(this);
                this.A00 = 0;
                return;
            } else if (i2 >= 10) {
                Log.e("voip/VideoPortManager/setVideoPort failed to setup self port");
                CallGridViewModel callGridViewModel = this.A02;
                if (callGridViewModel != null && (r2 = callGridViewModel.A0R.A03) != null) {
                    i = 15;
                } else {
                    return;
                }
            } else {
                Log.i("voip/VideoPortManager/setVideoPort failed for self, retrying");
                this.A01.postDelayed(new C70183a5(this, 44, r5), 500);
                return;
            }
        } else if (Voip.setVideoDisplayPort(userJid, r5) == 0) {
            Voip.startVideoRenderStream(userJid);
            return;
        } else {
            C18260x0.A1Q(AnonymousClass001.A0o(), "voip/VideoPortManager/setVideoPort failed to setup port for ", userJid);
            CallGridViewModel callGridViewModel2 = this.A02;
            if (callGridViewModel2 != null && (r2 = callGridViewModel2.A0R.A03) != null) {
                i = 22;
            } else {
                return;
            }
        }
        r2.A0e((CallInfo) null, (String) null, i);
    }

    public void A04(UserJid userJid) {
        Map map = this.A0A;
        if (map.containsKey(userJid)) {
            C18260x0.A1R(AnonymousClass001.A0o(), "voip/VideoPortManager/releaseVideoPort releasing port for ", userJid);
            ((AnonymousClass8KC) C18320x8.A0Z(map, userJid)).release();
            map.remove(userJid);
        }
    }

    public final void A05(UserJid userJid) {
        if (this.A0A.get(userJid) == null) {
            return;
        }
        if (this.A03.A0a(userJid)) {
            Voip.setVideoPreviewPort((VideoPort) null);
            Voip.setVideoPreviewSize(0, 0);
            this.A09.removeCameraErrorListener(this);
            Handler handler = this.A01;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                this.A01 = null;
                return;
            }
            return;
        }
        Voip.stopVideoRenderStream(userJid);
        Voip.setVideoDisplayPort(userJid, (VideoPort) null);
    }

    public void BOJ(VoipPhysicalCamera voipPhysicalCamera, int i) {
    }

    public void BSW(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public void BbK(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }

    public void Bet(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }

    public C116655qe(C56972sr r2, AnonymousClass49P r3, C91444jd r4, AnonymousClass5IO r5, AnonymousClass5ZR r6, C187958y5 r7, VoipCameraManager voipCameraManager) {
        this.A03 = r2;
        this.A04 = r3;
        this.A08 = r7;
        this.A05 = r4;
        this.A06 = r5;
        this.A09 = voipCameraManager;
        this.A07 = r6;
    }

    public void A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/VideoPortManager/releaseAllVideoPorts releasing ");
        Map map = this.A0A;
        A0o.append(map.size());
        C18260x0.A1L(A0o, " remaining ports");
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            ((AnonymousClass8KC) AnonymousClass0x2.A0W(A0q)).release();
        }
        map.clear();
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.A01 = null;
        }
    }

    public void BPF(VoipPhysicalCamera voipPhysicalCamera) {
    }
}
