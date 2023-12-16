package com.whatsapp.avatar.init;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass2C4;
import X.AnonymousClass46Q;
import X.C01390An;
import X.C01400Ao;
import X.C03070Is;
import X.C162457s7;
import X.C18260x0;
import X.C389229y;
import X.C47572dT;
import X.C49652gs;
import X.C54502op;
import X.C55862r2;
import X.C615931l;
import X.C616131n;
import X.C64333Db;
import X.C73853gB;
import X.C84814Du;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class AvatarStickerPackWorker extends CoroutineWorker {
    public final C64333Db A00;
    public final C47572dT A01;
    public final C49652gs A02;
    public final C55862r2 A03;
    public final C54502op A04;
    public final C73853gB A05;

    public Object A0D(C84814Du r4) {
        return C616131n.A00(r4, this.A05, new AvatarStickerPackWorker$doWork$2(this, (C84814Du) null));
    }

    public final C03070Is A0F(Throwable th) {
        String message;
        String message2;
        int i = this.A01.A00;
        String str = "no error message";
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i > 3) {
            A0o.append("AvatarStickerPackWorker/too many attempts (");
            A0o.append(i);
            C18260x0.A1M(A0o, "), marking as failed");
            C55862r2 r2 = this.A03;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("too_many_retries (");
            if (!(th == null || (message2 = th.getMessage()) == null)) {
                str = message2;
            }
            A0o2.append(str);
            r2.A02(1, "AvatarStickerPackWorker/failure", AnonymousClass001.A0j(A0o2, ')'));
            return new C01400Ao();
        }
        A0o.append("AvatarStickerPackWorker/sticker download failed, scheduling retry (");
        A0o.append(i);
        A0o.append(')');
        AnonymousClass0x2.A19(A0o);
        C55862r2 r22 = this.A03;
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("download_failed_retry (");
        if (!(th == null || (message = th.getMessage()) == null)) {
            str = message;
        }
        A0o3.append(str);
        r22.A02(1, "AvatarStickerPackWorker/failure", AnonymousClass001.A0j(A0o3, ')'));
        return new C01390An();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        C64333Db A012 = C389229y.A01(applicationContext);
        this.A00 = A012;
        this.A03 = (C55862r2) A012.A1T.get();
        this.A04 = (C54502op) A012.AX8.get();
        this.A01 = (C47572dT) A012.A1b.get();
        this.A02 = (C49652gs) A012.A1G.get();
        AnonymousClass46Q r0 = AnonymousClass2C4.A02;
        C615931l.A00(r0);
        this.A05 = r0;
    }
}
