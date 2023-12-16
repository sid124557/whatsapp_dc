package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9ZK  reason: invalid class name */
public final class AnonymousClass9ZK implements C183768qc, Handler.Callback {
    public AnonymousClass9MO A00;
    public final Handler A01;
    public final Looper A02;
    public final HashMap A03;
    public final HashMap A04;

    public boolean handleMessage(Message message) {
        Number number;
        C162457s7.A0J(message, 0);
        int i = message.what;
        if (i == 1) {
            HashMap hashMap = this.A04;
            Object obj = message.obj;
            C162457s7.A0K(obj, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap.put(obj, Long.valueOf(System.currentTimeMillis()));
            HashMap hashMap2 = this.A03;
            Object obj2 = message.obj;
            C162457s7.A0K(obj2, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap2.put(obj2, Boolean.TRUE);
            AnonymousClass9MO r1 = this.A00;
            if (r1 != null) {
                Object obj3 = message.obj;
                C162457s7.A0K(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                C180428l3 r0 = (C180428l3) obj3;
                C1903895p r12 = r1.A00;
                C203689o9 r3 = r12.A06;
                if (r3 != null) {
                    r3.BKJ("media_pipeline_render_stuck", r0.B7H(), (Map) null, (long) r0.hashCode());
                }
                r12.A05.A00(C142216wp.A0P);
            }
        } else if (i == 2) {
            HashMap hashMap3 = this.A04;
            Object obj4 = message.obj;
            C162457s7.A0K(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            Number number2 = (Number) hashMap3.get(obj4);
            if (number2 != null) {
                long currentTimeMillis = (System.currentTimeMillis() - number2.longValue()) + 5000;
                AnonymousClass9MO r02 = this.A00;
                if (r02 != null) {
                    Object obj5 = message.obj;
                    C162457s7.A0K(obj5, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                    C180428l3 r5 = (C180428l3) obj5;
                    C203689o9 r4 = r02.A00.A06;
                    if (r4 != null) {
                        HashMap A0t = AnonymousClass001.A0t();
                        A0t.put("render_stuck_time", String.valueOf(currentTimeMillis));
                        C1899693i.A0m(r4, r5, "media_pipeline_render_stuck_time", r5.B7H(), A0t);
                        return true;
                    }
                }
            }
        } else if (i == 3) {
            HashMap hashMap4 = this.A04;
            for (C180428l3 r7 : hashMap4.keySet()) {
                if (C162457s7.A0P(this.A03.get(r7), Boolean.TRUE) && (number = (Number) hashMap4.get(r7)) != null) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - number.longValue()) + 5000;
                    AnonymousClass9MO r03 = this.A00;
                    if (r03 != null) {
                        C162457s7.A0H(r7);
                        C203689o9 r42 = r03.A00.A06;
                        if (r42 != null) {
                            HashMap A0t2 = AnonymousClass001.A0t();
                            A0t2.put("render_stuck_time", String.valueOf(currentTimeMillis2));
                            C1899693i.A0m(r42, r7, "media_pipeline_render_stuck_forever", r7.B7H(), A0t2);
                        }
                    }
                }
            }
            hashMap4.clear();
            this.A03.clear();
            return true;
        }
        return true;
    }

    public void Ayf(C180428l3 r3) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeMessages(1, r3);
        }
    }

    public void BlX(C180428l3 r6) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeMessages(1, r6);
            HashMap hashMap = this.A03;
            if (C162457s7.A0P(hashMap.get(r6), Boolean.TRUE)) {
                hashMap.put(r6, Boolean.FALSE);
                AnonymousClass6C7.A10(handler, r6, 2);
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, r6), 5000);
        }
    }

    public AnonymousClass9ZK(Looper looper) {
        Handler handler;
        this.A02 = looper;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
        this.A04 = AnonymousClass001.A0t();
        this.A03 = AnonymousClass001.A0t();
    }
}
