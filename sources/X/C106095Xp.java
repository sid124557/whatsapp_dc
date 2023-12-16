package X;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.5Xp  reason: invalid class name and case insensitive filesystem */
public final class C106095Xp {
    public static final C184388ri A0I = new C171298Gn();
    public C33151sW A00;
    public C54722pB A01;
    public ThreadPoolExecutor A02;
    public final C55682qk A03;
    public final AnonymousClass2VD A04;
    public final C64393Dh A05;
    public final C69263Wi A06;
    public final Mp4Ops A07;
    public final C56492s4 A08;
    public final C153407bG A09;
    public final C56512s6 A0A;
    public final C56612sH A0B;
    public final C54292oU A0C;
    public final AnonymousClass33K A0D;
    public final AnonymousClass4FS A0E;
    public final C183538qC A0F;
    public final boolean A0G;
    public volatile C33151sW A0H;

    public final C33151sW A01() {
        if (this.A0H == null) {
            synchronized (this) {
                if (this.A0H == null) {
                    this.A0H = this.A04.A00("gif_content_obj_store", 32);
                }
            }
        }
        return this.A0H;
    }

    public C106095Xp(C55682qk r2, AnonymousClass2VD r3, C64393Dh r4, C69263Wi r5, Mp4Ops mp4Ops, C56492s4 r7, C153407bG r8, C56512s6 r9, C56612sH r10, C54292oU r11, AnonymousClass1VX r12, AnonymousClass33K r13, AnonymousClass4FS r14, C183538qC r15) {
        this.A0C = r11;
        this.A04 = r3;
        this.A0B = r10;
        this.A07 = mp4Ops;
        this.A06 = r5;
        this.A03 = r2;
        this.A0E = r14;
        this.A05 = r4;
        this.A08 = r7;
        this.A09 = r8;
        this.A0A = r9;
        this.A0D = r13;
        this.A0F = r15;
        this.A0G = r12.A0X(1662);
    }

    public static C184398rj A00(C106095Xp r3) {
        C626936e.A01();
        C626936e.A01();
        if (r3.A0G) {
            return (C184398rj) r3.A0F.get();
        }
        C33151sW r0 = r3.A00;
        if (r0 != null) {
            return r0;
        }
        C33151sW A002 = r3.A04.A00("gif_preview_obj_store", 256);
        r3.A00 = A002;
        return A002;
    }

    public final ThreadPoolExecutor A02() {
        C626936e.A01();
        ThreadPoolExecutor threadPoolExecutor = this.A02;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        ThreadPoolExecutor B18 = this.A0E.B18("GifCacheWorker", new LinkedBlockingQueue(), 4, 4, 10, 1);
        this.A02 = B18;
        return B18;
    }

    public void A03(ImageView imageView, String str) {
        Context context = imageView.getContext();
        C626936e.A01();
        C54722pB r0 = this.A01;
        if (r0 == null) {
            File A0A2 = AnonymousClass002.A0A(this.A0C.A00.getCacheDir(), "GifsCache");
            if (!A0A2.mkdirs() && !A0A2.isDirectory()) {
                Log.w("gif/cache/unable to create gifs directory");
            }
            C47432dF r3 = new C47432dF(this.A06, this.A08, this.A0D, A0A2, "gif-cache");
            r3.A00 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            r0 = r3.A01();
            this.A01 = r0;
        }
        r0.A03(imageView, str);
    }
}
