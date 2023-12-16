package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6CG  reason: invalid class name */
public class AnonymousClass6CG extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7LC A01;
    public final /* synthetic */ C149917Ok A02;

    public AnonymousClass6CG(AnonymousClass7LC r1, C149917Ok r2, long j) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = j;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass7LC r0 = this.A01;
        long j = this.A00;
        Map map = r0.A02.A0D;
        Objects.requireNonNull(map);
        map.remove(Long.valueOf(j));
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass7LC r0 = this.A01;
        Handler handler = r0.A00;
        if (handler == null) {
            handler = AnonymousClass000.A0A();
            r0.A00 = handler;
        }
        handler.post(r0.A01);
    }
}
