package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9XQ  reason: invalid class name */
public class AnonymousClass9XQ implements Handler.Callback {
    public AnonymousClass9ZG A00;
    public final Handler A01;
    public final SparseArray A02 = new SparseArray();
    public final AnonymousClass9T0 A03;
    public final C157207hv A04;
    public final AnonymousClass9ZJ A05;

    public final void A00(AnonymousClass9ZG r12) {
        AnonymousClass9ZG r1 = this.A00;
        if (r1 != r12) {
            if (r1 != null) {
                this.A05.B1d(r1);
            }
            this.A00 = r12;
            if (r12 != null) {
                this.A05.AxO(r12);
            }
            AnonymousClass9ZG r4 = this.A00;
            if (r4 != null) {
                SparseArray sparseArray = this.A02;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    Object valueAt = sparseArray.valueAt(i);
                    valueAt.getClass();
                    AnonymousClass9PX r0 = (AnonymousClass9PX) valueAt;
                    r4.A01(keyAt, r0.A01, r0.A00, r0.A03, r0.A02, r0.A04);
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        int i;
        Message message2 = message;
        int i2 = message2.what;
        if (i2 == 1) {
            AnonymousClass9ZJ r6 = this.A05;
            synchronized (r6.A0A) {
                r6.A0D.getClass();
                if (r6.A0E == null) {
                    Map map = AnonymousClass9ZJ.A0G;
                    Handler handler = r6.A00;
                    AnonymousClass9ZJ r0 = (AnonymousClass9ZJ) map.get(handler.getLooper());
                    if (r0 != null) {
                        r0.A00();
                    }
                    r6.A0D.getClass();
                    if (r6.A0E == null) {
                        try {
                            Context context = r6.A02;
                            C194729Ug r02 = r6.A06;
                            C159067l3 r14 = r6.A04;
                            C159067l3 r15 = r6.A05;
                            C162457s7.A0J(context, 1);
                            AnonymousClass9ZC r12 = new AnonymousClass9ZC(context, r14, r15, r02, r6);
                            r6.A0E = r12;
                            List list = r6.A09.A00;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((C185288tO) list.get(i3)).AxN(r12);
                            }
                            int i4 = r14.A01;
                            if (r6.A0B && i4 != (i = r6.A01)) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("Unsupported OpenGL version. Expected is ");
                                A0o.append(i);
                                throw AnonymousClass001.A0e(AnonymousClass000.A0Y(" but got ", A0o, i4));
                            }
                        } catch (Throwable th) {
                            try {
                                r6.BLj(new C201649kV("GlHostImpl.attachGlContext() failed.", th));
                            } catch (Throwable th2) {
                                r6.A0F = false;
                                map.put(handler.getLooper(), r6);
                                throw th2;
                            }
                        }
                        r6.A0F = false;
                        map.put(handler.getLooper(), r6);
                    }
                }
            }
            C203689o9 r2 = this.A03.A01.A06;
            if (r2 == null) {
                return false;
            }
            r2.BKJ("media_pipeline_resume", "MediaGraphControllerImpl", (Map) null, (long) hashCode());
            return false;
        } else if (i2 == 2) {
            C1903895p r22 = this.A03.A01;
            r22.A01 = 0;
            r22.A00 = 0;
            C203689o9 r3 = r22.A06;
            if (r3 != null) {
                r3.BKJ("media_pipeline_pause", "MediaGraphControllerImpl", (Map) null, (long) hashCode());
            }
            C183768qc r03 = r22.A08.A05.A07;
            r03.Ayf(r22);
            Handler handler2 = ((AnonymousClass9ZK) r03).A01;
            if (handler2 != null) {
                handler2.sendEmptyMessage(3);
            }
            AnonymousClass9ZJ r23 = this.A05;
            synchronized (r23.A0A) {
                if (r23.A0C) {
                    r23.A00();
                }
            }
            return false;
        } else if (i2 == 3) {
            C1903895p r62 = this.A03.A01;
            C203689o9 r5 = r62.A06;
            if (r5 != null) {
                HashMap A0t = AnonymousClass001.A0t();
                LinkedHashMap linkedHashMap = C1903895p.A0D;
                synchronized (linkedHashMap) {
                    linkedHashMap.remove(r62.toString());
                    A0t.put("active_media_pipelines", linkedHashMap.values().toString());
                }
                A0t.put("frame_render_noop_counter", String.valueOf(r62.A00));
                C1899693i.A0m(r5, this, "media_pipeline_stop", "MediaGraphControllerImpl", A0t);
            }
            r62.A08.A05.A07.Ayf(r62);
            AnonymousClass9ZJ r04 = this.A05;
            synchronized (r04.A0A) {
                r04.A00();
                C194439Sw r05 = r04.A09;
                List list2 = r05.A00;
                r05.A00();
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((C185288tO) list2.get(i5)).release();
                }
            }
            this.A00 = null;
            CountDownLatch countDownLatch = r62.A0C;
            r62.A0C = null;
            if (countDownLatch == null) {
                return false;
            }
            countDownLatch.countDown();
            return false;
        } else if (i2 != 4) {
            return false;
        } else {
            A00((AnonymousClass9ZG) message2.obj);
            return false;
        }
    }

    public AnonymousClass9XQ(AnonymousClass9T0 r8, C157207hv r9, AnonymousClass9ZJ r10) {
        Handler handler = new Handler(r10.A00.getLooper(), this);
        this.A01 = handler;
        this.A05 = r10;
        this.A03 = r8;
        C1903895p r0 = r8.A01;
        C203689o9 r5 = r0.A06;
        if (r5 != null) {
            HashMap A0t = AnonymousClass001.A0t();
            LinkedHashMap linkedHashMap = C1903895p.A0D;
            synchronized (linkedHashMap) {
                String obj = r0.toString();
                String BBj = r5.BBj();
                linkedHashMap.put(obj, BBj.isEmpty() ? "unknown" : BBj);
                A0t.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            C1899693i.A0m(r5, this, "media_pipeline_start", "MediaGraphControllerImpl", A0t);
        }
        this.A04 = r9;
        handler.getLooper().getThread().setUncaughtExceptionHandler(new C201449k9(AnonymousClass0x9.A14(this)));
    }
}
