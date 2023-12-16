package X;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.rendercore.RootHostView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6EP  reason: invalid class name */
public class AnonymousClass6EP extends GestureDetector.SimpleOnGestureListener {
    public Bundle A00;
    public C009707r A01;
    public C08310eF A02;
    public RootHostView A03;
    public C159037kz A04;
    public AnonymousClass8nX A05;
    public C47382dA A06;
    public C181908nY A07;
    public C184138rJ A08;
    public HashMap A09;
    public Map A0A;

    public void A00() {
        C184138rJ r1;
        C159037kz r2 = this.A04;
        if (r2 != null && (r1 = this.A08) != null) {
            r1.BHP(Boolean.TRUE);
            RootHostView rootHostView = this.A03;
            if (rootHostView != null) {
                r2.A07(rootHostView);
            }
            this.A08.BHP(Boolean.FALSE);
        }
    }

    public void A01(Bundle bundle, C009707r r4, C08310eF r5, C47382dA r6, C181908nY r7, C184138rJ r8, String str, HashMap hashMap) {
        this.A01 = r4;
        this.A02 = r5;
        this.A08 = r8;
        this.A07 = r7;
        C170888Ex r1 = new C170888Ex(this);
        this.A00 = bundle;
        this.A09 = hashMap;
        this.A06 = r6;
        bundle.getBoolean("hot_reload");
        this.A05.B4j(r1, str, hashMap);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }
}
