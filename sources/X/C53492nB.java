package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.provider.MediaStore;
import java.util.ArrayList;

/* renamed from: X.2nB  reason: invalid class name and case insensitive filesystem */
public class C53492nB {
    public boolean A00;
    public final Handler A01;
    public final C33131sU A02;
    public final C620633i A03;
    public final Thread A04;
    public final ArrayList A05 = AnonymousClass001.A0s();

    public void A00() {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            this.A00 = true;
            arrayList.notifyAll();
        }
        C59912xh A002 = C59912xh.A00();
        Thread thread = this.A04;
        AnonymousClass5UR A0R = this.A03.A0R();
        synchronized (A002) {
            C45232Zf A022 = A002.A02(thread);
            A022.A00 = 0;
            BitmapFactory.Options options = A022.A01;
            if (options != null) {
                options.requestCancelDecode();
            }
            A002.notifyAll();
            synchronized (A022) {
                if (A022.A02) {
                    MediaStore.Images.Thumbnails.cancelThumbnailRequest(A0R.A00, -1, thread.getId());
                    MediaStore.Video.Thumbnails.cancelThumbnailRequest(A0R.A00, -1, thread.getId());
                }
            }
        }
        thread.interrupt();
    }

    public void A01(C84584Cx r4) {
        if (r4 != null) {
            ArrayList arrayList = this.A05;
            synchronized (arrayList) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((C41612Kx) arrayList.get(i)).A00 != r4) {
                        i++;
                    } else if (i >= 0) {
                        arrayList.remove(i);
                    }
                }
            }
        }
    }

    public void A02(C84584Cx r4, AnonymousClass4EM r5) {
        C626936e.A0D(!this.A04.isInterrupted(), "Thumb loader reused after destroy");
        Bitmap bitmap = (Bitmap) this.A02.A06(r4.BDW());
        if (bitmap != null) {
            r5.Bd0(bitmap, true);
            return;
        }
        r5.Axi();
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            arrayList.add(new C41612Kx(r4, r5));
            arrayList.notifyAll();
        }
    }

    public C53492nB(Handler handler, AnonymousClass30B r6, C620633i r7, String str) {
        this.A03 = r7;
        this.A01 = handler;
        C33131sU A022 = r6.A02();
        this.A02 = A022;
        this.A00 = false;
        C173778Rq r0 = new C173778Rq(new C69993Zl(this, 34), AnonymousClass000.A0V("image-loader-", str, AnonymousClass001.A0o()));
        this.A04 = r0;
        r0.start();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("imageloader/cachesize:");
        C18260x0.A1G(A0o, A022.A02.A00());
    }
}
