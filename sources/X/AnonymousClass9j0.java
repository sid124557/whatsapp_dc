package X;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.9j0  reason: invalid class name */
public class AnonymousClass9j0 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C195609Yt A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass9j0(C195609Yt r1, long j, boolean z) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = z;
    }

    public void run() {
        Gesture.GestureState gestureState;
        Gesture.GestureState gestureState2;
        C194379Sq r6 = this.A01.A00;
        long j = this.A00;
        boolean z = this.A02;
        r6.A01--;
        if (z) {
            r6.A00++;
            Map map = r6.A0A;
            Long valueOf = Long.valueOf(j);
            map.put(valueOf, AnonymousClass9JV.GESTURE_IS_HANDLED_BY_ENGINE);
            List list = (List) r6.A0B.remove(valueOf);
            if (list != null) {
                Gesture gesture = null;
                for (int i = 0; i < list.size(); i++) {
                    gesture = (Gesture) list.get(i);
                    r6.A05.sendGesture(gesture);
                }
                if (gesture != null && ((gestureState2 = gesture.gestureState) == Gesture.GestureState.ENDED || gestureState2 == Gesture.GestureState.CANCELLED || gestureState2 == Gesture.GestureState.FAILED)) {
                    Gesture.GestureType gestureType = gesture.getGestureType();
                    if (gestureType == Gesture.GestureType.RAW_TOUCH) {
                        r6.A01(Long.valueOf(gesture.id));
                    } else {
                        r6.A00(gestureType);
                    }
                }
            } else {
                Map map2 = r6.A09;
                Gesture.GestureType gestureType2 = Gesture.GestureType.TAP;
                if (map2.containsKey(gestureType2) && C18310x6.A0B(map2.get(gestureType2)) == j) {
                    r6.A00(gestureType2);
                }
            }
            r6.A07.clear();
            return;
        }
        Map map3 = r6.A0A;
        Long valueOf2 = Long.valueOf(j);
        map3.put(valueOf2, AnonymousClass9JV.GESTURE_IS_HANDLED_BY_CLIENT);
        List list2 = (List) r6.A0B.remove(valueOf2);
        if (list2 != null) {
            Gesture gesture2 = (Gesture) list2.get(list2.size() - 1);
            if (gesture2 != null && ((gestureState = gesture2.gestureState) == Gesture.GestureState.ENDED || gestureState == Gesture.GestureState.CANCELLED || gestureState == Gesture.GestureState.FAILED)) {
                Gesture.GestureType gestureType3 = gesture2.getGestureType();
                if (gestureType3 == Gesture.GestureType.RAW_TOUCH) {
                    r6.A01(Long.valueOf(gesture2.id));
                } else {
                    r6.A00(gestureType3);
                }
            }
        } else {
            Map map4 = r6.A09;
            Gesture.GestureType gestureType4 = Gesture.GestureType.TAP;
            if (map4.containsKey(gestureType4) && C18310x6.A0B(map4.get(gestureType4)) == j) {
                r6.A00(gestureType4);
            }
        }
        if (r6.A01 == 0) {
            List list3 = r6.A07;
            LinkedHashSet linkedHashSet = new LinkedHashSet(list3);
            list3.clear();
            r6.A0C.addAll(linkedHashSet);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
