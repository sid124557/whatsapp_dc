package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.7kG  reason: invalid class name and case insensitive filesystem */
public final class C158607kG {
    public int A00 = 3;
    public int A01;
    public C124376Ca A02;
    public boolean A03;
    public final Context A04;
    public final AudioManager A05;
    public final Handler A06;
    public final C178028gq A07;

    public int A01() {
        if (C162387ry.A01 >= 28) {
            return this.A05.getStreamMinVolume(this.A00);
        }
        return 0;
    }

    public final void A02() {
        boolean A1T;
        AudioManager audioManager = this.A05;
        int A002 = A00(audioManager, this.A00);
        int i = this.A00;
        if (C162387ry.A01 >= 23) {
            A1T = audioManager.isStreamMute(i);
        } else {
            A1T = AnonymousClass000.A1T(A00(audioManager, i));
        }
        if (this.A01 != A002 || this.A03 != A1T) {
            this.A01 = A002;
            this.A03 = A1T;
            Iterator it = ((C1685785y) this.A07).A00.A0T.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("onDeviceVolumeChanged");
            }
        }
    }

    public void A03(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A02();
            AnonymousClass6OD r3 = ((C1685785y) this.A07).A00;
            C158607kG r0 = r3.A0O;
            C151497Va r1 = new C151497Va(r0.A01(), r0.A05.getStreamMaxVolume(r0.A00));
            if (!r1.equals(r3.A0C)) {
                r3.A0C = r1;
                Iterator it = r3.A0T.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("onDeviceInfoChanged");
                }
            }
        }
    }

    public C158607kG(Context context, Handler handler, C178028gq r8) {
        boolean A1T;
        Context applicationContext = context.getApplicationContext();
        this.A04 = applicationContext;
        this.A06 = handler;
        this.A07 = r8;
        Object systemService = applicationContext.getSystemService("audio");
        C161487pm.A01(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        this.A05 = audioManager;
        this.A01 = A00(audioManager, 3);
        if (C162387ry.A01 >= 23) {
            A1T = audioManager.isStreamMute(3);
        } else {
            A1T = AnonymousClass000.A1T(A00(audioManager, 3));
        }
        this.A03 = A1T;
        C124376Ca r2 = new C124376Ca(this);
        try {
            applicationContext.registerReceiver(r2, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.A02 = r2;
        } catch (RuntimeException e) {
            C159307lc.A01("Error registering stream volume receiver", "StreamVolumeManager", e);
        }
    }

    public static int A00(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            C159307lc.A01(AnonymousClass000.A0Y("Could not retrieve stream volume for stream type ", AnonymousClass001.A0o(), i), "StreamVolumeManager", e);
            return audioManager.getStreamMaxVolume(i);
        }
    }
}
