package X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9Sq  reason: invalid class name and case insensitive filesystem */
public class C194379Sq {
    public int A00;
    public int A01;
    public C193669Pn A02;
    public final Handler A03 = AnonymousClass000.A0A();
    public final TouchServiceImpl.HitTestCallback A04 = new C195609Yt(this);
    public final TouchServiceImpl A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Set A0C;
    public final Set A0D;
    public final Set A0E;
    public final Set A0F;

    public final void A00(Gesture.GestureType gestureType) {
        Object remove;
        Object remove2;
        Map map = this.A09;
        if (map.containsKey(gestureType) && (remove = map.remove(gestureType)) != null && (remove2 = this.A0A.remove(remove)) != null && remove2 == AnonymousClass9JV.GESTURE_IS_HANDLED_BY_ENGINE) {
            this.A00--;
        }
        Set set = this.A0D;
        if (set.contains(gestureType)) {
            set.remove(gestureType);
        }
    }

    public final void A01(Long l) {
        Object remove = this.A0A.remove(l);
        if (remove != null && remove == AnonymousClass9JV.GESTURE_IS_HANDLED_BY_ENGINE) {
            this.A00--;
        }
        Set set = this.A0E;
        if (set.contains(l)) {
            set.remove(l);
        }
    }

    public C194379Sq(TouchServiceImpl touchServiceImpl) {
        this.A05 = touchServiceImpl;
        this.A0F = AnonymousClass002.A0K();
        this.A02 = new C193669Pn(false, false, false, false, false, false);
        this.A09 = AnonymousClass001.A0t();
        this.A0A = AnonymousClass001.A0t();
        this.A08 = AnonymousClass001.A0t();
        this.A0B = AnonymousClass001.A0t();
        this.A07 = AnonymousClass0x9.A18();
        this.A06 = AnonymousClass0x9.A18();
        this.A0D = AnonymousClass002.A0K();
        this.A0E = AnonymousClass002.A0K();
        this.A0C = new LinkedHashSet();
    }
}
