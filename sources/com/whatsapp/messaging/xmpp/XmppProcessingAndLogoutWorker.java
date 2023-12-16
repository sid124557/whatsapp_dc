package com.whatsapp.messaging.xmpp;

import X.AnonymousClass001;
import X.AnonymousClass0QH;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2X6;
import X.AnonymousClass66R;
import X.C01410Ap;
import X.C130066bK;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C188268yc;
import X.C29171iO;
import X.C29411im;
import X.C389229y;
import X.C46752c9;
import X.C55682qk;
import X.C56612sH;
import X.C64333Db;
import X.C67823Qu;
import X.C70023Zo;
import X.C78883vj;
import X.C78893vk;
import X.C78903vl;
import android.content.Context;
import android.os.Handler;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class XmppProcessingAndLogoutWorker extends AnonymousClass0QH {
    public int A00;
    public long A01;
    public boolean A02;
    public final C130066bK A03;
    public final C29171iO A04;
    public final C55682qk A05;
    public final C29411im A06;
    public final C56612sH A07;
    public final AnonymousClass1VX A08;
    public final XmppConnectionMetricsWorkManager A09;
    public final C46752c9 A0A;
    public final AnonymousClass2X6 A0B;
    public final C67823Qu A0C;
    public final AnonymousClass66R A0D = C154517dI.A01(new C78883vj(this));
    public final AnonymousClass66R A0E = C154517dI.A01(new C78893vk(this));
    public final AnonymousClass66R A0F = C154517dI.A01(new C78903vl(this));
    public final boolean A0G;

    public C188268yc A08() {
        throw AnonymousClass001.A0e("XmppProcessingAndLogoutWorker is not supposed to run in foreground");
    }

    public C188268yc A09() {
        AnonymousClass0x9.A0A(this.A0E).post(new C70023Zo(this, 0));
        C130066bK r0 = this.A03;
        C162457s7.A0C(r0);
        return r0;
    }

    public void A0A() {
        AnonymousClass66R r3 = this.A0E;
        Handler A0A2 = AnonymousClass0x9.A0A(r3);
        Log.i("XmppProcessingAndLogoutWorker/cancel logout");
        A0A2.removeMessages(2);
        AnonymousClass0x9.A0A(r3).removeMessages(1);
        A0C(0);
        AnonymousClass0x9.A0A(r3).post(new C70023Zo(this, 1));
    }

    public final void A0C(long j) {
        if (!this.A04.A00) {
            Log.i("XmppProcessingAndLogoutWorker/schedule logout timer");
            AnonymousClass0x9.A0A(this.A0E).sendEmptyMessageDelayed(2, j);
            return;
        }
        C01410Ap r2 = new C01410Ap();
        this.A09.A00 = null;
        this.A0C.A02();
        this.A03.A05(r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppProcessingAndLogoutWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        boolean z;
        C18260x0.A0Q(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A0C = (C67823Qu) A012.Ac6.get();
        this.A04 = (C29171iO) A012.A0s.get();
        this.A05 = A012.Azq();
        this.A07 = A012.Bqh();
        this.A08 = A012.Avy();
        this.A0A = A012.AcK.A00.AMh();
        this.A09 = (XmppConnectionMetricsWorkManager) A012.Ac7.get();
        this.A0B = (AnonymousClass2X6) A012.Aai.get();
        this.A06 = A012.Bso();
        Object obj = workerParameters.A01.A00.get("SKIP_PROCESSING");
        if (obj instanceof Boolean) {
            z = AnonymousClass001.A1Z(obj);
        } else {
            z = false;
        }
        this.A0G = z;
        this.A03 = new C130066bK();
    }

    public final void A0B() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XmppProcessingAndLogoutWorker/work started; is processing: ");
        C18260x0.A1V(A0o, this.A02);
        C67823Qu r3 = this.A0C;
        r3.A06 = null;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("XmppProcessingAndLogoutWorker/cycle: ");
        int i = this.A00;
        this.A00 = i + 1;
        A0o2.append(i);
        A0o2.append(" started: ");
        C18260x0.A1L(A0o2, r3.A01());
        AnonymousClass0x9.A0A(this.A0E).sendEmptyMessageDelayed(1, C18290x4.A0D(this.A0D));
    }
}
